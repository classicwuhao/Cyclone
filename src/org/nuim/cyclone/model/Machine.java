package org.nuim.cyclone.model;

import java.util.List;
import java.util.ArrayList;

public class Machine extends Expression{
    private GlobalVariables variables;
    private List<State> states = new ArrayList<State>();

    public Machine(){
        super();
        setLog(new ErrorLog());
    }

    public Machine(String name){
        super(name);
        setLog(new ErrorLog());
    }
    
    public void setVariables (GlobalVariables variables){
        this.variables = variables;
        
    }

    public int errors(){
        return errorLog().errors();
    }

    public void addState(State state){
        this.states.add(state);
    }
    
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(this.name()+": \n");
        sb.append(variables.toString());

        return sb.toString();
    }

}