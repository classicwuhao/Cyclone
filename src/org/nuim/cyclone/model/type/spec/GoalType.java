package org.nuim.cyclone.model.type.spec;

public class GoalType extends SpecType {
    
    public GoalType(){
        super("goal");
    }

    @Override
    public boolean isGoalType(){
        return true;
    }
}