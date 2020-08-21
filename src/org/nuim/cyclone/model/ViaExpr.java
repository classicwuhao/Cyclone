package org.nuim.cyclone.model;
import java.util.List;
import java.util.ArrayList;

public class ViaExpr extends Expression {
    private List<PathExpr> pexpr = new ArrayList<PathExpr>();

    public ViaExpr(SrcInfo info){
        super(info);
    }

    public void addExpr(PathExpr expr){
        pexpr.add(expr);
    }

    public List<PathExpr> exprs(){
        return pexpr;
    }
    
    public int size(){
        return this.pexpr.size();
    }

}