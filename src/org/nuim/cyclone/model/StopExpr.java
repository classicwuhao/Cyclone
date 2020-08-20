package org.nuim.cyclone.model;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class StopExpr extends Expression{
    private Set<State> states = new HashSet<State>();

    public StopExpr(SrcInfo info){
        super(info);
    }

    public void addStates(State state){
        states.add(state);
    }

    public List<State> states(){
        List<State> states = new ArrayList<State>();
        for (State s : this.states) states.add(s);
        return states;
    }
    
    public int size(){
        return this.states.size();
    }
}