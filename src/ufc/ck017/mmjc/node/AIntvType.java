/* This file was generated by SableCC (http://www.sablecc.org/). */

package ufc.ck017.mmjc.node;

import ufc.ck017.mmjc.analysis.*;
import ufc.ck017.mmjc.translate.TranslateVisitor;
import ufc.ck017.mmjc.translate.tree.Exp;

@SuppressWarnings("nls")
public final class AIntvType extends PType
{
    private TIntv _intv_;

    public AIntvType()
    {
        // Constructor
    }

    public AIntvType(
        @SuppressWarnings("hiding") TIntv _intv_)
    {
        // Constructor
        setIntv(_intv_);

    }

    @Override
    public Object clone()
    {
        return new AIntvType(
            cloneNode(this._intv_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIntvType(this);
    }
    
    public Exp accept(TranslateVisitor v) {
		return v.visit(this);
	}

    public TIntv getIntv()
    {
        return this._intv_;
    }

    public void setIntv(TIntv node)
    {
        if(this._intv_ != null)
        {
            this._intv_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._intv_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._intv_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._intv_ == child)
        {
            this._intv_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._intv_ == oldChild)
        {
            setIntv((TIntv) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }

	@Override
	public int getLine() {
		return _intv_.getLine();
	}

	@Override
	public int getPos() {
		return _intv_.getPos();
	}
}
