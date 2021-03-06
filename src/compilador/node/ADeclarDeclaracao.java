/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ADeclarDeclaracao extends PDeclaracao
{
    private TTipo _tipo_;
    private PVar _var_;

    public ADeclarDeclaracao()
    {
        // Constructor
    }

    public ADeclarDeclaracao(
        @SuppressWarnings("hiding") TTipo _tipo_,
        @SuppressWarnings("hiding") PVar _var_)
    {
        // Constructor
        setTipo(_tipo_);

        setVar(_var_);

    }

    @Override
    public Object clone()
    {
        return new ADeclarDeclaracao(
            cloneNode(this._tipo_),
            cloneNode(this._var_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclarDeclaracao(this);
    }

    public TTipo getTipo()
    {
        return this._tipo_;
    }

    public void setTipo(TTipo node)
    {
        if(this._tipo_ != null)
        {
            this._tipo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipo_ = node;
    }

    public PVar getVar()
    {
        return this._var_;
    }

    public void setVar(PVar node)
    {
        if(this._var_ != null)
        {
            this._var_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._var_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipo_)
            + toString(this._var_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipo_ == child)
        {
            this._tipo_ = null;
            return;
        }

        if(this._var_ == child)
        {
            this._var_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipo_ == oldChild)
        {
            setTipo((TTipo) newChild);
            return;
        }

        if(this._var_ == oldChild)
        {
            setVar((PVar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
