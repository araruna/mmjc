/* This file was generated by SableCC (http://www.sablecc.org/). */

package ufc.ck017.mmjc.node;

import java.util.*;
import ufc.ck017.mmjc.analysis.*;
import ufc.ck017.mmjc.translate.TranslateVisitor;
import ufc.ck017.mmjc.translate.tree.Exp;

@SuppressWarnings("nls")
public final class ANonextNextclass extends PNextclass
{
    private TId _id_;
    private final LinkedList<PVar> _var_ = new LinkedList<PVar>();
    private final LinkedList<PMethod> _method_ = new LinkedList<PMethod>();

    public ANonextNextclass()
    {
        // Constructor
    }

    public ANonextNextclass(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") List<PVar> _var_,
        @SuppressWarnings("hiding") List<PMethod> _method_)
    {
        // Constructor
        setId(_id_);

        setVar(_var_);

        setMethod(_method_);

    }

    @Override
    public Object clone()
    {
        return new ANonextNextclass(
            cloneNode(this._id_),
            cloneList(this._var_),
            cloneList(this._method_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANonextNextclass(this);
    }
    
    public Exp accept(TranslateVisitor v) {
		return v.visit(this);
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

    public LinkedList<PVar> getVar()
    {
        return this._var_;
    }

    public void setVar(List<PVar> list)
    {
        this._var_.clear();
        this._var_.addAll(list);
        for(PVar e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public LinkedList<PMethod> getMethod()
    {
        return this._method_;
    }

    public void setMethod(List<PMethod> list)
    {
        this._method_.clear();
        this._method_.addAll(list);
        for(PMethod e : list)
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
            + toString(this._id_)
            + toString(this._var_)
            + toString(this._method_);
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

        if(this._var_.remove(child))
        {
            return;
        }

        if(this._method_.remove(child))
        {
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

        for(ListIterator<PVar> i = this._var_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PVar) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PMethod> i = this._method_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PMethod) newChild);
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
		return _id_.getLine();
	}

	@Override
	public int getPos() {
		return _id_.getPos();
	}
}
