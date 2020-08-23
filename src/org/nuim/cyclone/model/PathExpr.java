package org.nuim.cyclone.model;

public abstract class PathExpr extends Expression {
    public PathExpr(){super();}
    public PathExpr(SrcInfo info){super(info);}

    public boolean isStateInclusion(){return false;}
    public boolean isTransInclusion(){return false;}
    
}