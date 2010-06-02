/* This file was generated by SableCC (http://www.sablecc.org/). */

package ufc.ck017.mmjc.node;

import ufc.ck017.mmjc.analysis.*;
import ufc.ck017.mmjc.translate.tree.Exp;

@SuppressWarnings("nls")
public final class AVatbStatement extends PStatement
{
    private TId _id_;
    private PExpression _i_;
    private PExpression _v_;

    public AVatbStatement()
    {
        // Constructor
    }

    public AVatbStatement(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") PExpression _i_,
        @SuppressWarnings("hiding") PExpression _v_)
    {
        // Constructor
        setId(_id_);

        setI(_i_);

        setV(_v_);

    }

    @Override
    public Object clone()
    {
        return new AVatbStatement(
            cloneNode(this._id_),
            cloneNode(this._i_),
            cloneNode(this._v_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVatbStatement(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public PExpression getI()
    {
        return this._i_;
    }

    public void setI(PExpression node)
    {
        if(this._i_ != null)
        {
            this._i_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._i_ = node;
    }

    public PExpression getV()
    {
        return this._v_;
    }

    public void setV(PExpression node)
    {
        if(this._v_ != null)
        {
            this._v_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._v_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._i_)
            + toString(this._v_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._i_ == child)
        {
            this._i_ = null;
            return;
        }

        if(this._v_ == child)
        {
            this._v_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._i_ == oldChild)
        {
            setI((PExpression) newChild);
            return;
        }

        if(this._v_ == oldChild)
        {
            setV((PExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }

	@Override
	public int getLine() {
		return _i_.getLine();
	}

	@Override
	public int getPos() {
		return _i_.getPos();
	}
}
