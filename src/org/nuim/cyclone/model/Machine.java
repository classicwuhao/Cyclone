package org.nuim.cyclone.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Machine extends Expression{
    private GlobalVariables variables;
    private Map<String, State> states = new TreeMap<String, State>();

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

    public void addState(State state) throws InvalidSpecException{
        if (states.containsKey(state.name())){
            logErrors(state.info()," Spec has already contained a state: "+state.name());
            throw new InvalidSpecException(state.info()," Spec has already contained a state: "+state.name());  
        }

        states.put(state.name(),state);
        state.setOwner(this);
    }
    
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(this.name()+": \n");
        sb.append(variables.toString());
        sb.append("\n");
        for (String name : states.keySet()){
            sb.append(states.get(name));
            sb.append("\n");
        }
        sb.append("\n");

        return sb.toString();
    }

}