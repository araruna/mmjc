/* This file was generated by SableCC (http://www.sablecc.org/). */

package ufc.ck017.mmjc.node;

import java.util.*;
import ufc.ck017.mmjc.analysis.*;
import ufc.ck017.mmjc.translate.tree.Exp;

@SuppressWarnings("nls")
public final class AMcallExpression extends PExpression
{
    private PExpression _obj_;
    private TId _id_;
    private final LinkedList<PExpression> _par_ = new LinkedList<PExpression>();

    public AMcallExpression()
    {
        // Constructor
    }

    public AMcallExpression(
        @SuppressWarnings("hiding") PExpression _obj_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") List<PExpression> _par_)
    {
        // Constructor
        setObj(_obj_);

        setId(_id_);

        setPar(_par_);

    }

    @Override
    public Object clone()
    {
        return new AMcallExpression(
            cloneNode(this._obj_),
            cloneNode(this._id_),
            cloneList(this._par_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMcallExpression(this);
    }

    public PExpression getObj()
    {
        return this._obj_;
    }

    public void setObj(PExpression node)
    {
        if(this._obj_ != null)
        {
            this._obj_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._obj_ = node;
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

    public LinkedList<PExpression> getPar()
    {
        return this._par_;
    }

    public void setPar(List<PExpression> list)
    {
        this._par_.clear();
        this._par_.addAll(list);
        for(PExpression e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._obj_)
            + toString(this._id_)
            + toString(this._par_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._obj_ == child)
        {
            this._obj_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._par_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._obj_ == oldChild)
        {
            setObj((PExpression) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        for(ListIterator<PExpression> i = this._par_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PExpression) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }

	@Override
	public int getLine() {
		return _obj_.getLine();
	}

	@Override
	public int getPos() {
		return _obj_.getPos();
	}
}
