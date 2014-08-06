/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TCommentEnd extends Token
{
    public TCommentEnd()
    {
        super.setText("*/");
    }

    public TCommentEnd(int line, int pos)
    {
        super.setText("*/");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCommentEnd(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCommentEnd(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCommentEnd text.");
    }
}
