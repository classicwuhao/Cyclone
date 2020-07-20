package org.nuim.cyclone.model.type;

public abstract class PrimitiveType extends Type{

    public PrimitiveType(String name){super(name);}
    @Override
    public boolean isPrimitiveType(){return true;}
}