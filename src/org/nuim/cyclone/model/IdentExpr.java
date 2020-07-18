package org.nuim.cyclone.model;
import org.nuim.cyclone.model.type.Type;

/*
 *  IdentExpr an alias expression for the named element.
 * */ 
public class IdentExpr extends Expression {
    public IdentExpr(String name, Type type){
        super(name, type);
    }

    public IdentExpr(String name){
        super(name);
    }

}