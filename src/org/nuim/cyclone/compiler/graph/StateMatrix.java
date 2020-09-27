package org.nuim.cyclone.compiler.graph;
import org.nuim.cyclone.util.AdjList;
import org.nuim.cyclone.model.State;
import org.nuim.cyclone.model.Transition;
import org.nuim.cyclone.model.Machine;
import org.nuim.cyclone.compiler.GenerationException;
import org.nuim.cyclone.compiler.GenerationContext;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class StateMatrix {
    private AdjList<Integer> sm;
    private List<Integer> finals = new ArrayList<Integer>();
    private Map <Integer, State> mapping = new TreeMap<Integer, State>();
    private int start;
    private Machine machine;
    private GenerationContext context;

    public StateMatrix (Machine machine){
        this.machine = machine;
        context = new GenerationContext();
        try{
            this.build();
        }catch(GenerationException e){
            System.err.println(e.getMessage());
        }
    }

    private void build() throws GenerationException{
        List<State> states = machine.AllStates();
        sm = new AdjList<Integer>(states.size());
        
        /* We should issue a warning message here. */
        if (machine.size_of_states()==0) return;

        /* set start state to 0 always */ 
        State start_state = machine.getStartState();
        if (start_state==null && machine.size_of_states()!=0){
            //log errors.
            context.reportError(" machine does not have a start state. ");
            throw new GenerationException(" machine does not have a start state.");
        }
        mapping.put(0,machine.getStartState());
        machine.getStartState().set_uid(0);
        states.remove(machine.getStartState());
        sm.add(0,0);
        
        for (int i=0;i<states.size();i++){
            State s = states.get(i);
            s.set_uid(i+1);
            mapping.put(i+1,s);
            sm.add(i+1,i+1);
            if (s.isFinal()) finals.add(i+1);
        }
        
        for (Transition trans : machine.AllTrans()){
            State source = trans.source();
            State target = trans.target();
            sm.add(target.uid(),source.uid());
        }
    }
    
    public State get(int id){
        return mapping.get(id);
    }

    public int errors(){
        return context.errors();
    }

    public int size(){
        return sm.size();
    }

    public int start(){return this.start;}
    public List<Integer> finals(){
        return this.finals;
    }

    public List<Integer> next(int index){
        return sm.get_head_all(index);
    }

    public Machine machine(){return this.machine;}

    public String toString(){
        StringBuffer sb = new StringBuffer();

        for (Integer k : mapping.keySet()){
            sb.append(k+" -> " + mapping.get(k).name()+", ");
        }

        sb.append("\n");

        for (int i=0;i<sm.size();i++){
            List<Integer> list = sm.get_head_all(i);
            for (int j=0;j<list.size();j++){
                if (j==0)
                    sb.append(list.get(j)+":{ ");
                else
                    sb.append(list.get(j)+", ");
            }
            sb.append("} \n ");
        }

        return sb.toString();
    }

}