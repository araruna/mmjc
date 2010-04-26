package ufc.ck017.mmjc.semantic;

import java.util.LinkedList;
import java.util.Stack;

import ufc.ck017.mmjc.analysis.DepthFirstAdapter;
import ufc.ck017.mmjc.node.*;
import ufc.ck017.mmjc.symbolTable.SymbolTable;
import ufc.ck017.mmjc.symbolTable.TypeSymbol;
import ufc.ck017.mmjc.util.ErrorLog;
import ufc.ck017.mmjc.util.SemanticError;

// TODO informar os erros pertinentes

/**
 * Esta classe implementa o <code>Visitor</code> respons&aacute;vel pela
 * fase de checagem de tipos do c&oacute;digo-fonte sendo analisado, fazendo
 * uso de uma Tabela de S&iacute;mbolos que implementa a interface {@link SymbolTableInterface}.
 * <p>
 * Note que nem todos os n&oacute;s da AST precisam gerar um efeito
 * colateral nessa fase, apenas os n&oacute;s que fazem refer&ecirc;ncias
 * de uso de vari&aacute;veis, m&eacute;todos ou classes.
 * Esses n&oacute;s s&atilde;o exatamente aqueles que representam <i>statements</i>
 * e <i>expressions</i>, definidos na gram&aacute;tica da linguagem.
 * <p>
 * Outro conjunto de n&oacute;s cuja visita se faz necess&aacute;ria, mas
 * neste caso devido &agrave; nossa implementa&ccedil;&atilde;o da Tabela de
 * S&iacute;mbolos, s&atilde;o os de declara&ccedil;&atilde;o de classes
 * e m&eacute;todos. Nesses n&oacute;s apenas informamos a Tabela que o
 * escopo atual mudou.
 * 
 * @author Arthur Rodrigues
 * @see SymbolTable
 */
public class TypeChecker extends DepthFirstAdapter {
	private SymbolTable table = null;
	private ErrorLog errors = ErrorLog.getInstance();
	private Stack<TypeSymbol> currclass = null;
	private final TypeSymbol INTT = null; //TypeSymbol.getIntTSymbol();
	private final TypeSymbol INTV = null; //TypeSymbol.getIntVSymbol();
	private final TypeSymbol BOOL = null; //TypeSymbol.getBoolSymbol();
	
	public TypeChecker(SymbolTable symbols) {
		table = symbols;
		currclass = new Stack<TypeSymbol>();
	}
	
	private boolean checkExprType(PExpression expression, TypeSymbol type) {
		TypeSymbol exst = expression.getType();
		
		if(exst != type) {
			errors.addError(SemanticError.expectedExprType(expression, type, exst));
			return true;
		} else 
			return false;
	}
	
	@Override
	public void inAExtNextclass(AExtNextclass node) {
		table.enterScope(node.getName());
		currclass.push(TypeSymbol.symbolOfID(node.getName()));
	}
	
	@Override
	public void outAExtNextclass(AExtNextclass node) {
		table.exitScope();
		currclass.pop();
	}
	
	@Override
	public void inANonextNextclass(ANonextNextclass node) {
		table.enterScope(node.getId());
		currclass.push(TypeSymbol.symbolOfID((node.getId())));
	}
	
	@Override
	public void outANonextNextclass(ANonextNextclass node) {
		table.exitScope();
		currclass.pop();
	}
	
	@Override
	public void inAMethod(AMethod node) {
		table.enterScope(node.getId());
	}
	
	@Override
	public void outAMethod(AMethod node) {
		table.exitScope();
	}
	
	@Override
	public void outAAtbStatement(AAtbStatement node) {
		TId identifier = node.getId();
		PExpression expression = node.getExpression();
		
		TypeSymbol idst = table.getType(identifier);
		TypeSymbol exst = expression.getType();
		
		if(idst == null) {
			errors.addError(SemanticError.idNotFound(identifier));
		} else if(table.isObject(identifier)) {
			TypeSymbol classtype = expression.getType();
						
			if(!table.isClass(classtype)) 
				errors.addError(SemanticError.invalidAtbToObject(identifier, classtype));
			else if(!table.isSubclassOf(idst, classtype))
				errors.addError(SemanticError.incompatibleClassAtb(identifier, classtype));
		} else if(!table.isVar(identifier) || idst != exst || exst == null) {
			errors.addError(SemanticError.invalidAtb(node));
		}
	}
	
	@Override
	public void outAVatbStatement(AVatbStatement node) {
		TId identifier = node.getId();
		PExpression iexpression = node.getI();
		PExpression vexpression = node.getV();
		
		TypeSymbol idst = table.getType(identifier);
		TypeSymbol iexst = iexpression.getType();
		TypeSymbol vexst = vexpression.getType();
		
		if(idst == null) {
			errors.addError(SemanticError.idNotFound(identifier));
		} else if(idst != INTV || iexst != INTT || vexst != INTT) {
			errors.addError(SemanticError.invalidAtb(node));
		}
	}
	
	@Override
	public void outAWhileStatement(AWhileStatement node) {
		PExpression expression = node.getExpression();
		
		if(!checkExprType(expression, BOOL)) {
			//errors.addError(SemanticError.invalidTypePrint(expression));
		}
	}
	
	@Override
	public void outAIfStatement(AIfStatement node) {
		PExpression expression = node.getExpression();
		
		if(!checkExprType(expression, BOOL)) {
			//errors.addError(SemanticError.invalidTypePrint(expression));
		}
	}
	
	@Override
	public void outAPrintStatement(APrintStatement node) {
		PExpression expression = node.getExpression();
		
		if(!checkExprType(expression, INTT))  {
			errors.addError(SemanticError.invalidTypePrint(expression));
		}
	}
	
	@Override
	public void outAMcallExpression(AMcallExpression node) {
		PExpression object = node.getObj();
		TId mname = node.getId();
		LinkedList<PExpression> params = node.getPar();
		LinkedList<TypeSymbol> paramtypes = new LinkedList<TypeSymbol>();
		TypeSymbol objtype = object.getType();
		
		for(PExpression exp : params) 
			paramtypes.add(exp.getType());
		
		if(!table.isClass(objtype)) {
			errors.addError(SemanticError.objectExpected(object));
			node.setType(null);
		} else if(!table.isMethod(objtype, mname, paramtypes)) {
			errors.addError(SemanticError.methodExpected(objtype, mname)); // TODO dar o erro correto
			node.setType(null);
		} else {
			node.setType(table.getType(object.getType(), mname));
		}
	}
	
	@Override
	public void outAPlusExpression(APlusExpression node) {
		if(node.getL().getType() != INTT || node.getR().getType() != INTT) {
			//errors.addError(SemanticError.objectExpected(object));
			node.setType(null);
		} else
			node.setType(INTT);
	}
	
	@Override
	public void outAMinusExpression(AMinusExpression node) {
		if(node.getL().getType() != INTT || node.getR().getType() != INTT) {
			//errors.addError(SemanticError.objectExpected(object));
			node.setType(null);
		} else
			node.setType(INTT);
	}
	
	@Override
	public void outAMultExpression(AMultExpression node) {
		if(node.getL().getType() != INTT || node.getR().getType() != INTT) {
			//errors.addError(SemanticError.objectExpected(object));
			node.setType(null);
		} else
			node.setType(INTT);
	}
	
	@Override
	public void outAGthanExpression(AGthanExpression node) {
		if(node.getL().getType() != INTT || node.getR().getType() != INTT) {
			//errors.addError(SemanticError.objectExpected(object));
			node.setType(null);
		} else
			node.setType(BOOL);
	}
	
	@Override
	public void outALthanExpression(ALthanExpression node) {
		if(node.getL().getType() != INTT || node.getR().getType() != INTT) {
			//errors.addError(SemanticError.objectExpected(object));
			node.setType(null);
		} else
			node.setType(BOOL);
	}
	
	@Override
	public void outAAndExpression(AAndExpression node) {
		if(node.getL().getType() != BOOL || node.getR().getType() != BOOL) {
			//errors.addError(SemanticError.objectExpected(object));
			node.setType(null);
		} else
			node.setType(BOOL);
	}
	
	@Override
	public void outAVectorExpression(AVectorExpression node) {
		if(node.getL().getType() != INTV || node.getI().getType() != INTT) {
			//errors.addError(SemanticError.objectExpected(object));
			node.setType(null);
		} else
			node.setType(INTT);
	}
	
	@Override
	public void outALengthExpression(ALengthExpression node) {
		if(node.getExpression().getType() != INTV) {
			//errors.addError(SemanticError.objectExpected(object));
			node.setType(null);
		} else
			node.setType(INTT);
	}
	
	@Override
	public void outANotExpression(ANotExpression node) {
		if(node.getExpression().getType() != BOOL) {
			//errors.addError(SemanticError.objectExpected(object));
			node.setType(null);
		} else
			node.setType(BOOL);
	}
	
	@Override
	public void outANewvecExpression(ANewvecExpression node) {
		if(node.getExpression().getType() != INTT) {
			//errors.addError(SemanticError.objectExpected(object));
			node.setType(null);
		} else
			node.setType(INTV);
	}
	
	@Override
	public void outAVarExpression(AVarExpression node) {
		TypeSymbol idst = table.getType(node.getId());
		
		if(idst == null) {
			errors.addError(SemanticError.idNotFound(node.getId()));
			node.setType(null);
		} else
			node.setType(idst);
	}
	
	@Override
	public void outANewobjExpression(ANewobjExpression node) {
		if(!table.isClass(node.getId())) {
			//errors.addError(SemanticError.idNotFound(node.getId()));
			node.setType(null);
		} else
			node.setType(TypeSymbol.symbolOfID((node.getId())));
	}
	
	@Override
	public void outANumberExpression(ANumberExpression node) {
		node.setType(INTT);
	}
	
	@Override
	public void outABfalseExpression(ABfalseExpression node) {
		node.setType(BOOL);
	}
	
	@Override
	public void outABtrueExpression(ABtrueExpression node) {
		node.setType(BOOL);
	}
	
	@Override
	public void outASelfExpression(ASelfExpression node) {
		node.setType(currclass.peek());
	}
}