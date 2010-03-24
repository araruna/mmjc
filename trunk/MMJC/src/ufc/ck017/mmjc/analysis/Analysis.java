/* This file was generated by SableCC (http://www.sablecc.org/). */

package ufc.ck017.mmjc.analysis;

import ufc.ck017.mmjc.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAProgram(AProgram node);
    void caseAMainclass(AMainclass node);
    void caseAExtNextclass(AExtNextclass node);
    void caseANonextNextclass(ANonextNextclass node);
    void caseAVar(AVar node);
    void caseAMethod(AMethod node);
    void caseAIfStatement(AIfStatement node);
    void caseAVatbStatement(AVatbStatement node);
    void caseAAtbStatement(AAtbStatement node);
    void caseAWhileStatement(AWhileStatement node);
    void caseAPrintStatement(APrintStatement node);
    void caseAManyStatement(AManyStatement node);
    void caseAMcallExpression(AMcallExpression node);
    void caseAPlusExpression(APlusExpression node);
    void caseAMinusExpression(AMinusExpression node);
    void caseAMultExpression(AMultExpression node);
    void caseAAndExpression(AAndExpression node);
    void caseAGthanExpression(AGthanExpression node);
    void caseALthanExpression(ALthanExpression node);
    void caseAVectorExpression(AVectorExpression node);
    void caseALengthExpression(ALengthExpression node);
    void caseANotExpression(ANotExpression node);
    void caseANewvecExpression(ANewvecExpression node);
    void caseAVarExpression(AVarExpression node);
    void caseANewobjExpression(ANewobjExpression node);
    void caseANumberExpression(ANumberExpression node);
    void caseABtrueExpression(ABtrueExpression node);
    void caseABfalseExpression(ABfalseExpression node);
    void caseASelfExpression(ASelfExpression node);
    void caseAInttType(AInttType node);
    void caseAIntvType(AIntvType node);
    void caseABoolType(ABoolType node);
    void caseAClassType(AClassType node);

    void caseTIntt(TIntt node);
    void caseTIntv(TIntv node);
    void caseTBool(TBool node);
    void caseTClasstk(TClasstk node);
    void caseTPublic(TPublic node);
    void caseTExtends(TExtends node);
    void caseTIf(TIf node);
    void caseTWhile(TWhile node);
    void caseTElse(TElse node);
    void caseTReturn(TReturn node);
    void caseTTrue(TTrue node);
    void caseTFalse(TFalse node);
    void caseTThis(TThis node);
    void caseTNew(TNew node);
    void caseTLength(TLength node);
    void caseTString(TString node);
    void caseTMain(TMain node);
    void caseTPrint(TPrint node);
    void caseTLbrace(TLbrace node);
    void caseTRbrace(TRbrace node);
    void caseTLparen(TLparen node);
    void caseTRparen(TRparen node);
    void caseTLcurbr(TLcurbr node);
    void caseTRcurbr(TRcurbr node);
    void caseTDot(TDot node);
    void caseTComma(TComma node);
    void caseTSemi(TSemi node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTTimes(TTimes node);
    void caseTGthan(TGthan node);
    void caseTLthan(TLthan node);
    void caseTAnd(TAnd node);
    void caseTNeg(TNeg node);
    void caseTBe(TBe node);
    void caseTId(TId node);
    void caseTNumber(TNumber node);
    void caseTBlank(TBlank node);
    void caseTComment(TComment node);
    void caseEOF(EOF node);
}
