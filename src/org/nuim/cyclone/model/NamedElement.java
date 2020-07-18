package org.nuim.cyclone.model;

public abstract class NamedElement extends Element{
    private String name;
    public NamedElement(){}
    public NamedElement(String name){
        this.name=name;
    }
    
    public String name(){return this.name;}
    public String toString(){return this.name();}
}