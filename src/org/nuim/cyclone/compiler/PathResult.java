package org.nuim.cyclone.compiler;
import uran.solver.Result;

public class PathResult {
    private Result result;
    private StringBuffer path;
    private long time;

    public PathResult(){
        this.result = Result.UNKNOWN;
        this.path = new StringBuffer();
    }


    public void setResult(Result result){
        this.result = result;
    }

    public Result result(){return this.result;}
    public void setPath(StringBuffer path){
        this.path = path;
    }
    public String path(){
        return this.path.toString();
    }
 
    public void setTime(long time){
        this.time = time;
    }

    public long time(){
        return this.time;
    }

}
