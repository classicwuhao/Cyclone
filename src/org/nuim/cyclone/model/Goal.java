package org.nuim.cyclone.model;

public class Goal extends Expression{
    private ForExpr forexpr;
    private StopExpr stopexpr;

    public Goal(){
        super();
    }

    public Goal(SrcInfo info){
        super(info);
    }

    public void setForExpr(ForExpr forexpr){
        this.forexpr=forexpr;
    }

    public void setStopExpr(StopExpr stopexpr){
        this.stopexpr=stopexpr;
    }

    public ForExpr ForExpr(){
        return this.forexpr;
    }

    public StopExpr StopExpr(){
        return this.stopexpr;
    }

    public boolean hasStop(){
        return this.stopexpr!=null;
    }
    
}