package org.nuim.cyclone.model.type;

public class BoolType extends Type {

    public BoolType(){
        super ("bool");
    }

    
    
    @Override
    public boolean isBoolType(){return true;}
    
}