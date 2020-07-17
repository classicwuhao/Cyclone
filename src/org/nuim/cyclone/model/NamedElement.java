package org.nuim.cyclone.model;

public class NamedElement extends Element{
    
    public NamedElement(String name){
        super(name);
    }
    
    public String toString(){return this.name();}
}