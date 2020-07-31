package org.nuim.cyclone.model.type.spec;

public class InvType extends SpecType{

    public InvType(){
        super("invariant");
    }

    @Override
    public boolean isInvType(){return true;}
    
}