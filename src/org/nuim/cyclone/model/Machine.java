package org.nuim.cyclone.model;
import java.util.Map;
import java.util.TreeMap;

public class Machine extends Expression{
    private GlobalVariables variables;
    private Map<String, State> states = new TreeMap<String, State>();
    private Map<String, Transition> transitions = new TreeMap<String, Transition>();

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
    
    public void addTrans(Transition trans) throws InvalidSpecException{
        String src = trans.src();
        String tar = trans.tar();

        if (transitions.containsKey(trans.name())){
            logErrors(trans.info()," Spec has already contained a transition: "+trans.name());
            throw new InvalidSpecException(trans.info()," Spec has already contained a transition: "+trans.name());
        }

        if (!states.containsKey(src)){
            logErrors(trans.info(), " cannot find source state: "+src+" in current spec.");
            throw new InvalidSpecException(trans.info(), " cannot find source state: "+src+" in current spec.");
        }

        if (!states.containsKey(tar)){
            logErrors(trans.info(), " cannot find target state: "+tar+" in current spec.");
            throw new InvalidSpecException(trans.info(), " cannot find target state: "+tar+" in current spec.");
        }

        State source = states.get(src);
        State target = states.get(tar);

        trans.setSource(source);
        trans.setTarget(target);
        trans.setOwner(this);
        transitions.put(trans.name(),trans);

    }

    public State getState(String name){
        State state;
        if (states.containsKey(name)) {
            state = states.get(name);
            return state;
        }
        return null;
    }

    @Override
    public boolean isMachine(){return true;}

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

        for (String name: transitions.keySet()){
            sb.append(transitions.get(name));
            sb.append("\n");
        }

        return sb.toString();
    }

}