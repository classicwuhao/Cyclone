package org.nuim.cyclone.model;
import org.nuim.cyclone.model.type.spec.MachineType;
import org.nuim.cyclone.model.type.BoolType;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;

public class Machine extends Expression{
    private GlobalVariables variables;
    private Map<String, State> states = new TreeMap<String, State>();
    private Map<String, Transition> transitions = new TreeMap<String, Transition>();
    private Map<String, Invariant> invariants = new TreeMap<String, Invariant>();
    private State start_state;
    private List<State> final_states = new ArrayList<State>();
    
    public Machine(){
        super(new MachineType());
        setLog(new ErrorLog());
    }

    public Machine(String name){
        super(name,new MachineType());
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

        /* we only allow one state to be starting state. */
        if (state.isStart()){
            if (start_state==null){
                start_state = state;
            }
            else{
                logErrors(state.info()," start state is already defined. ");
                throw new InvalidSpecException(state.info()," state " + start_state.name()+" is already a start state.");
            }
        }

        if (state.isFinal()) final_states.add(state);
        
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

        Expression expr = trans.whereExpr();
        if (expr!=null){
            if (!expr.type().equals(new BoolType())){
                logErrors(expr.info(), " expression must be bool.");
                throw new InvalidSpecException(expr.info(), " expect a bool expression, "+expr.toString());
            }
        }

        State source = states.get(src);
        State target = states.get(tar);

        trans.setSource(source);
        trans.setTarget(target);
        trans.setOwner(this);
        transitions.put(trans.name(),trans);

    }

    public void addInvariant(Invariant inv) throws InvalidSpecException{
        if (invariants.containsKey(inv.name())){
            logErrors(inv.info()," Spec has already contained an invariant: "+inv.name());
            throw new InvalidSpecException(inv.info(), "Spec has already contained an invariant: "+inv.name());
        }
        
        /* check if every expression is boolean */ 
        for (Expression expr : inv.expressions()){
            if (!expr.type().equals(new BoolType())){
                logErrors(inv.info()," expression must be bool "+expr.toString());
                throw new InvalidSpecException(inv.info()," expect a bool expression, "+expr.toString());
            }
        }
        
        inv.setOwner(this);
        invariants.put(inv.name(),inv);
    }

    public Invariant getInv(String name){
        return invariants.get(name);
    }

    public Transition getTran(String name){
        return transitions.get(name);
    }

    public State getState(String name){
        State state;
        if (states.containsKey(name)) {
            state = states.get(name);
            return state;
        }
        return null;
    }

    public State getStartState(){
        return this.start_state;
    }

    public List<State> getFinalStates(){
        return this.final_states;
    }

    public int size_of_states(){return states.size();}
    public int size_of_transitions(){return transitions.size();}
    public int size_of_invariants(){return invariants.size();}

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
        sb.append("\n");

        for (String name : invariants.keySet()){
            sb.append(invariants.get(name));
            sb.append("\n");
        }

        return sb.toString();
    }

}