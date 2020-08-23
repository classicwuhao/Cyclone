
package org.nuim.cyclone.model;
import java.util.List;
import java.util.ArrayList;

public class TransInclusion extends PathExpr{
    private List<State> path = new ArrayList<State>();

    public TransInclusion(){super();}

    public TransInclusion(SrcInfo info){
        super(info);
    }

    public void addPath(State state){
        path.add(state);
    }

    public List<State> Path(){
        return this.path;
    }

    /* return a string representation of a specific path */ 
    public String PathString(){
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<path.size()-1;i++){
            sb.append(path.get(i).name());
            sb.append("->");
        }
        sb.append(path.get(path.size()-1).name());
        return sb.toString();
    }

    public State getState(int index){
        return this.path.get(index);
    }

    public int length(){
        return this.path.size();
    }

    @Override
    public boolean isTransInclusion(){
        return true;
    }

}