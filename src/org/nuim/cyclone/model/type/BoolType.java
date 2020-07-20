package org.nuim.cyclone.model.type;

public class BoolType extends PrimitiveType {

    public BoolType(){
        super ("bool");
    }

    @Override
    public boolean isBoolType(){return true;}

    @Override
    public String toString(){return this.name();}
}