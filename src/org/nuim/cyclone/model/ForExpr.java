package org.nuim.cyclone.model;

public class ForExpr extends Expression{
    private int steps;

    public ForExpr(){
        super();
    }

    public ForExpr(int steps, SrcInfo info){
        super(info);
        this.steps=steps;
    }

    public ForExpr(SrcInfo info){
        super(info);
    }


    public int steps(){return this.steps;}
    public void setSteps(int steps){ this.steps=steps;}
    
}