/* This file was generated by SableCC (http://www.sablecc.org/). */

package ufc.ck017.mmjc.node;

import ufc.ck017.mmjc.analysis.*;
import ufc.ck017.mmjc.translate.tree.Exp;

@SuppressWarnings("nls")
public final class ANumberExpression extends PExpression
{
    private TNumber _number_;

    public ANumberExpression()
    {
        // Constructor
    }

    public ANumberExpression(
        @SuppressWarnings("hiding") TNumber _number_)
    {
        // Constructor
        setNumber(_number_);

    }

    @Override
    public Object clone()
    {
        return new ANumberExpression(
            cloneNode(this._number_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANumberExpression(this);
    }

    public TNumber getNumber()
    {
        return this._number_;
    }

    public void setNumber(TNumber node)
    {
        if(this._number_ != null)
        {
            this._number_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._number_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._number_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._number_ == child)
        {
            this._number_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._number_ == oldChild)
        {
            setNumber((TNumber) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }

	@Override
	public int getLine() {
		return _number_.getLine();
	}

	@Override
	public int getPos() {
		return _number_.getPos();
	}
}
