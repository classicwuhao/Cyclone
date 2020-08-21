package org.nuim.cyclone.model;

public class Goal extends Expression{
    private ForExpr forexpr;
    private StopExpr stopexpr;
    private ViaExpr viaexpr;
    private boolean enumerate; // enumerate or regular check

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

    public void setViaExpr(ViaExpr viaexpr){
        this.viaexpr = viaexpr;
    }

    public void setEnumerate(boolean enumerate){
        this.enumerate = enumerate;
    }

    public ForExpr ForExpr(){
        return this.forexpr;
    }

    public StopExpr StopExpr(){
        return this.stopexpr;
    }

    public ViaExpr ViaExpr(){
        return this.viaexpr;
    }

    public boolean hasStop(){
        return this.stopexpr!=null;
    }
    
    public boolean hasViaExpr(){
        return this.viaexpr!=null;
    }

    public boolean enumerate(){
        return this.enumerate;
    }

}