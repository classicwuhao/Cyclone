package org.nuim.cyclone.model.type;

/*
 * Define our primitive types 
 * 
 * */ 
public abstract class Type {
    private final String typename;
    protected Type(String name){this.typename=name;}
    protected String name(){return typename;}
    
    public boolean isIntType(){return false;}
    public boolean isBoolType(){return false;}
    public boolean isRealType(){return false;}
    public boolean isEnumType(){return false;}
    public boolean isStringType(){return false;}
    public abstract String toString();
    
}   