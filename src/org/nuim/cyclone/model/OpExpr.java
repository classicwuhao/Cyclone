package org.nuim.cyclone.model;

public class OpExpr extends NamedElement {
    private Expression[] exprs;

    public OpExpr(String op, Expression[] exprs){
        super(op);
        this.exprs=exprs;
    }

    public Expression[] args (){
        return this.exprs;
    }

    public int size(){
        return exprs.length;
    }
    
}