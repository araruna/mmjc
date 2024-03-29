/* This file was generated by SableCC (http://www.sablecc.org/). */

package ufc.ck017.mmjc.analysis;

import java.util.*;
import ufc.ck017.mmjc.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseAProgram(AProgram node)
    {
        defaultCase(node);
    }

    public void caseAMainclass(AMainclass node)
    {
        defaultCase(node);
    }

    public void caseAExtNextclass(AExtNextclass node)
    {
        defaultCase(node);
    }

    public void caseANonextNextclass(ANonextNextclass node)
    {
        defaultCase(node);
    }

    public void caseAVar(AVar node)
    {
        defaultCase(node);
    }

    public void caseAMethod(AMethod node)
    {
        defaultCase(node);
    }

    public void caseAIfStatement(AIfStatement node)
    {
        defaultCase(node);
    }

    public void caseAVatbStatement(AVatbStatement node)
    {
        defaultCase(node);
    }

    public void caseAAtbStatement(AAtbStatement node)
    {
        defaultCase(node);
    }

    public void caseAWhileStatement(AWhileStatement node)
    {
        defaultCase(node);
    }

    public void caseAPrintStatement(APrintStatement node)
    {
        defaultCase(node);
    }

    public void caseAManyStatement(AManyStatement node)
    {
        defaultCase(node);
    }

    public void caseAMcallExpression(AMcallExpression node)
    {
        defaultCase(node);
    }

    public void caseAPlusExpression(APlusExpression node)
    {
        defaultCase(node);
    }

    public void caseAMinusExpression(AMinusExpression node)
    {
        defaultCase(node);
    }

    public void caseAMultExpression(AMultExpression node)
    {
        defaultCase(node);
    }

    public void caseAAndExpression(AAndExpression node)
    {
        defaultCase(node);
    }

    public void caseAGthanExpression(AGthanExpression node)
    {
        defaultCase(node);
    }

    public void caseALthanExpression(ALthanExpression node)
    {
        defaultCase(node);
    }

    public void caseAVectorExpression(AVectorExpression node)
    {
        defaultCase(node);
    }

    public void caseALengthExpression(ALengthExpression node)
    {
        defaultCase(node);
    }

    public void caseANotExpression(ANotExpression node)
    {
        defaultCase(node);
    }

    public void caseANewvecExpression(ANewvecExpression node)
    {
        defaultCase(node);
    }

    public void caseAVarExpression(AVarExpression node)
    {
        defaultCase(node);
    }

    public void caseANewobjExpression(ANewobjExpression node)
    {
        defaultCase(node);
    }

    public void caseANumberExpression(ANumberExpression node)
    {
        defaultCase(node);
    }

    public void caseABtrueExpression(ABtrueExpression node)
    {
        defaultCase(node);
    }

    public void caseABfalseExpression(ABfalseExpression node)
    {
        defaultCase(node);
    }

    public void caseASelfExpression(ASelfExpression node)
    {
        defaultCase(node);
    }

    public void caseAInttType(AInttType node)
    {
        defaultCase(node);
    }

    public void caseAIntvType(AIntvType node)
    {
        defaultCase(node);
    }

    public void caseABoolType(ABoolType node)
    {
        defaultCase(node);
    }

    public void caseAClassType(AClassType node)
    {
        defaultCase(node);
    }

    public void caseTIntt(TIntt node)
    {
        defaultCase(node);
    }

    public void caseTIntv(TIntv node)
    {
        defaultCase(node);
    }

    public void caseTBool(TBool node)
    {
        defaultCase(node);
    }

    public void caseTClasstk(TClasstk node)
    {
        defaultCase(node);
    }

    public void caseTPublic(TPublic node)
    {
        defaultCase(node);
    }

    public void caseTExtends(TExtends node)
    {
        defaultCase(node);
    }

    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    public void caseTReturn(TReturn node)
    {
        defaultCase(node);
    }

    public void caseTTrue(TTrue node)
    {
        defaultCase(node);
    }

    public void caseTFalse(TFalse node)
    {
        defaultCase(node);
    }

    public void caseTThis(TThis node)
    {
        defaultCase(node);
    }

    public void caseTNew(TNew node)
    {
        defaultCase(node);
    }

    public void caseTLength(TLength node)
    {
        defaultCase(node);
    }

    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    public void caseTMain(TMain node)
    {
        defaultCase(node);
    }

    public void caseTPrint(TPrint node)
    {
        defaultCase(node);
    }

    public void caseTLbrace(TLbrace node)
    {
        defaultCase(node);
    }

    public void caseTRbrace(TRbrace node)
    {
        defaultCase(node);
    }

    public void caseTLparen(TLparen node)
    {
        defaultCase(node);
    }

    public void caseTRparen(TRparen node)
    {
        defaultCase(node);
    }

    public void caseTLcurbr(TLcurbr node)
    {
        defaultCase(node);
    }

    public void caseTRcurbr(TRcurbr node)
    {
        defaultCase(node);
    }

    public void caseTDot(TDot node)
    {
        defaultCase(node);
    }

    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    public void caseTSemi(TSemi node)
    {
        defaultCase(node);
    }

    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    public void caseTTimes(TTimes node)
    {
        defaultCase(node);
    }

    public void caseTGthan(TGthan node)
    {
        defaultCase(node);
    }

    public void caseTLthan(TLthan node)
    {
        defaultCase(node);
    }

    public void caseTAnd(TAnd node)
    {
        defaultCase(node);
    }

    public void caseTNeg(TNeg node)
    {
        defaultCase(node);
    }

    public void caseTBe(TBe node)
    {
        defaultCase(node);
    }

    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    public void caseTNumber(TNumber node)
    {
        defaultCase(node);
    }

    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
