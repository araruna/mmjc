/* This file was generated by SableCC (http://www.sablecc.org/). */

package ufc.ck017.mmjc.node;

import ufc.ck017.mmjc.analysis.*;

@SuppressWarnings("nls")
public final class TClasstk extends Token
{
    public TClasstk()
    {
        super.setText("class");
    }

    public TClasstk(int line, int pos)
    {
        super.setText("class");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TClasstk(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTClasstk(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TClasstk text.");
    }
}
