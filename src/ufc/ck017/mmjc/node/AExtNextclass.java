/* This file was generated by SableCC (http://www.sablecc.org/). */

package ufc.ck017.mmjc.node;

import java.util.*;
import ufc.ck017.mmjc.analysis.*;
import ufc.ck017.mmjc.translate.tree.Exp;

@SuppressWarnings("nls")
public final class AExtNextclass extends PNextclass
{
    private TId _name_;
    private TId _ext_;
    private final LinkedList<PVar> _var_ = new LinkedList<PVar>();
    private final LinkedList<PMethod> _method_ = new LinkedList<PMethod>();

    public AExtNextclass()
    {
        // Constructor
    }

    public AExtNextclass(
        @SuppressWarnings("hiding") TId _name_,
        @SuppressWarnings("hiding") TId _ext_,
        @SuppressWarnings("hiding") List<PVar> _var_,
        @SuppressWarnings("hiding") List<PMethod> _method_)
    {
        // Constructor
        setName(_name_);

        setExt(_ext_);

        setVar(_var_);

        setMethod(_method_);

    }

    @Override
    public Object clone()
    {
        return new AExtNextclass(
            cloneNode(this._name_),
            cloneNode(this._ext_),
            cloneList(this._var_),
            cloneList(this._method_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExtNextclass(this);
    }
    
    public TId getName()
    {
        return this._name_;
    }

    public void setName(TId node)
    {
        if(this._name_ != null)
        {
            this._name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._name_ = node;
    }

    public TId getExt()
    {
        return this._ext_;
    }

    public void setExt(TId node)
    {
        if(this._ext_ != null)
        {
            this._ext_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ext_ = node;
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
            + toString(this._name_)
            + toString(this._ext_)
            + toString(this._var_)
            + toString(this._method_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._name_ == child)
        {
            this._name_ = null;
            return;
        }

        if(this._ext_ == child)
        {
            this._ext_ = null;
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
        if(this._name_ == oldChild)
        {
            setName((TId) newChild);
            return;
        }

        if(this._ext_ == oldChild)
        {
            setExt((TId) newChild);
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
		return _name_.getLine();
	}

	@Override
	public int getPos() {
		return _name_.getPos();
	}
}
