package ufc.ck017.mmjc.activationRecords.jouette;import ufc.ck017.mmjc.activationRecords.frame.Access;import ufc.ck017.mmjc.translate.tree.BINOP;import ufc.ck017.mmjc.translate.tree.CONST;import ufc.ck017.mmjc.translate.tree.Exp;import ufc.ck017.mmjc.translate.tree.MEM;// TODO ver como fazer isso!!!public class InHeap extends Access {	int offset;	Exp access;		InHeap(int o) {		offset = o;	}	public Exp exp(Exp hp) {		access = new MEM(new BINOP(BINOP.MINUS, hp, new CONST(offset)));		return access;	}		public Exp exp() {		return access;	}	public String toString() {		return new Integer(this.offset).toString();	}}