package org.nuim.cyclone.model.type;

public class RealType extends Type {

    public RealType(){
        super("real");
    }
    
    @Override
    public boolean isRealType(){return true;}

}