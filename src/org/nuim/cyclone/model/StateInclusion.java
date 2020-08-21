package org.nuim.cyclone.model;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class StateInclusion extends PathExpr{
    private State state;
    public StateInclusion(){
        super();
    }

    public StateInclusion(SrcInfo info){
        super(info);
    }

    @Override
    public boolean isStateInclusion(){
        return true;
    }

    public void setState(State state){
        this.state=state;
    }

    public State state(){
        return this.state;
    }

    
}