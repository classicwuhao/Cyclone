package org.nuim.cyclone.model.type.spec;
import org.nuim.cyclone.model.type.Type;

/**
 * We define our specification types: Machine, State, Transition, Invariant, Goal.
 */
public abstract class SpecType extends Type {

    public SpecType(String name){
        super(name);
    }

    @Override
    public boolean isSpecType(){return true;}

    @Override
    public String toString(){return this.name();}
    
}