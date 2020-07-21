package org.nuim.cyclone.model.type;

/*
 * Define our primitive types 
 * 
 * */ 
public abstract class Type extends TypeElement{
    protected Type(String name){super(name);}
    //public String name(){return this.name();}
        
    public boolean isIntType(){return false;}
    public boolean isBoolType(){return false;}
    public boolean isRealType(){return false;}
    public boolean isEnumType(){return false;}
    public boolean isStringType(){return false;}
    public boolean isCharType(){return false;}
    public boolean isVoidType(){return false;}
    public boolean isPrimitiveType(){return false;}
    public boolean isNonPrimitiveType(){return false;}
    public abstract String toString();

    public boolean equals(Type type){
        return this.getClass().equals(type.getClass());
    }
}   