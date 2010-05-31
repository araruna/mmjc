/* This file was generated by SableCC (http://www.sablecc.org/). */

package ufc.ck017.mmjc.node;

import java.util.*;
import ufc.ck017.mmjc.analysis.*;
import ufc.ck017.mmjc.translate.TranslateVisitor;
import ufc.ck017.mmjc.translate.tree.Exp;

@SuppressWarnings("nls")
public final class AMainclass extends PMainclass
{
    private TId _cn_;
    private TId _an_;
    private final LinkedList<PStatement> _statement_ = new LinkedList<PStatement>();

    public AMainclass()
    {
        // Constructor
    }

    public AMainclass(
        @SuppressWarnings("hiding") TId _cn_,
        @SuppressWarnings("hiding") TId _an_,
        @SuppressWarnings("hiding") List<PStatement> _statement_)
    {
        // Constructor
        setCn(_cn_);

        setAn(_an_);

        setStatement(_statement_);

    }

    @Override
    public Object clone()
    {
        return new AMainclass(
            cloneNode(this._cn_),
            cloneNode(this._an_),
            cloneList(this._statement_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMainclass(this);
    }

    public Exp accept(TranslateVisitor v) {
		return v.visit(this);
	}
    
    public TId getCn()
    {
        return this._cn_;
    }

    public void setCn(TId node)
    {
        if(this._cn_ != null)
        {
            this._cn_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cn_ = node;
    }

    public TId getAn()
    {
        return this._an_;
    }

    public void setAn(TId node)
    {
        if(this._an_ != null)
        {
            this._an_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._an_ = node;
    }

    public LinkedList<PStatement> getStatement()
    {
        return this._statement_;
    }

    public void setStatement(List<PStatement> list)
    {
        this._statement_.clear();
        this._statement_.addAll(list);
        for(PStatement e : list)
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
            + toString(this._cn_)
            + toString(this._an_)
            + toString(this._statement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._cn_ == child)
        {
            this._cn_ = null;
            return;
        }

        if(this._an_ == child)
        {
            this._an_ = null;
            return;
        }

        if(this._statement_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._cn_ == oldChild)
        {
            setCn((TId) newChild);
            return;
        }

        if(this._an_ == oldChild)
        {
            setAn((TId) newChild);
            return;
        }

        for(ListIterator<PStatement> i = this._statement_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PStatement) newChild);
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
		return _cn_.getLine();
	}

	@Override
	public int getPos() {
		return _cn_.getPos();
	}
}
