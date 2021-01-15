package org.nuim.cyclone.compiler;
import java.util.List;
import java.util.ArrayList;
public class PathResultCollection {
    private List<PathResult> pr_list = new ArrayList<PathResult>();

    public PathResultCollection(){

    }

    public void addPathResult (PathResult result){
        pr_list.add(result);
    }

    public int size(){
        return pr_list.size();
    }

    public PathResult get(int i){
        return pr_list.get(i);
    }

}
