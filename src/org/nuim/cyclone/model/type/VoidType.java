package org.nuim.cyclone.model.type;

public class VoidType extends PrimitiveType {
    
    public VoidType(){
        super("void");
    }
    
    @Override
    public boolean isVoidType(){return true;}

    @Override
    public String toString(){return this.name();}
}