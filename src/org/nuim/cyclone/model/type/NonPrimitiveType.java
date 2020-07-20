package org.nuim.cyclone.model.type;

public abstract class NonPrimitiveType extends Type{

    public NonPrimitiveType(String name){super(name);}
    @Override
    public boolean isNonPrimitiveType(){return true;}   
}