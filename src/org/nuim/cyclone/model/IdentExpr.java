package org.nuim.cyclone.model;
import org.nuim.cyclone.model.type.Type;
import org.nuim.cyclone.model.SrcInfo;

/*
 *  IdentExpr an alias expression for the named element.
 * */ 
public class IdentExpr extends Expression {
    public IdentExpr(String name, Type type, SrcInfo info){
        super(name, type, info);
    }

    public IdentExpr(String name){
        super(name);
    }

}