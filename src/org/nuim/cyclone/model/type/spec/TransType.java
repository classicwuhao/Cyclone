package org.nuim.cyclone.model.type.spec;

public class TransType extends SpecType {

    public TransType(){
        super("transition");
    }

    @Override
    public boolean isTransType(){return true;}
    
}