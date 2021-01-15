package org.nuim.cyclone.compiler;
import uran.solver.Result;

public class PathResult {
    private Result result;
    private String path;
    private long time;

    public PathResult(Result result, String path, long time){
        this.result = result;
        this.path = path;
        this.time = time;
    }

    public PathResult(){
        this.result = Result.UNKNOWN;
        this.path = new String();
    }

    public void setResult(Result result){
        this.result = result;
    }

    public Result result(){return this.result;}
    public void setPath(String path){
        this.path = path;
    }
    public String path(){
        return this.path;
    }
 
    public void setTime(long time){
        this.time = time;
    }

    public long time(){
        return this.time;
    }

}
