package org.nuim.cyclone.model;
import org.nuim.cyclone.model.type.Type;

public class Invariant extends Expression{
    private Expression expr;

    public Invariant (Expression expr, Type type){
        super(type);
        this.expr=expr;
    }

    public Invariant (Expression expr, SrcInfo info){
        super(info);
        this.expr=expr;
    }

    public void setExpression(Expression expr){
        this.expr=expr;
    }
    public Expression expr(){return this.expr;}
    

    @Override
    public String toString(){
        return this.expr.toString();
    }
    
}