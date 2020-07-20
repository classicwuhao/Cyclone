package org.nuim.cyclone.model.type;

public class IntType extends PrimitiveType{

    public IntType(){
        super("int");
    }

    @Override
    public boolean isIntType(){return true;}

    @Override
    public String toString(){return this.name();}
}