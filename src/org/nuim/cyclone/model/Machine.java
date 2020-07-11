package org.nuim.cyclone.model;

public class Machine extends Element{
    private GlobalVariables variables;

    public Machine(String name){
        super(name);
    }

    public void setVariables (GlobalVariables variables){
        this.variables = variables;
    }
    
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(variables.toString());

        return sb.toString();
    }

}