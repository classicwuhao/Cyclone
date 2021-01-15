package org.nuim.cyclone.compiler;
import org.nuim.cyclone.model.ErrorLog;
import java.util.Stack;
import org.nuim.cyclone.util.Entry;
import org.nuim.cyclone.model.SrcInfo;

import java.lang.ref.Cleaner;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.nuim.cyclone.model.GlobalVariables;
import org.nuim.cyclone.model.State;
import org.nuim.cyclone.model.Transition;

/* context information during generation */ 
public class GenerationContext {
    private ErrorLog err;
    private Stack<Entry<SrcInfo,String>> warnStack = new Stack< Entry<SrcInfo,String>>();    
    private int warnings = 0;

    GlobalVariables global_variables;
    Map<Integer, State> states = new TreeMap<Integer,State>();
    Map<Integer, Transition> trans = new TreeMap<Integer, Transition>();

    public GenerationContext(){
        err = new ErrorLog();
    }

    public State getState(int id){
        return states.get(id);
    }

    public Transition getTrans(int id){
        return trans.get(id);
    }

    public void addState(int id, State state){
        states.put(id, state);
    }

    public void addTrans(int id, Transition transition){
        trans.put(id, transition);
    }

    public void reportError(String message){
        err.logErrors(message);
    }

    public int errors(){
        return err.errors();
    }

    public void logWarnings(SrcInfo info, String message){
        warnStack.push(new Entry<SrcInfo,String>(info, message));
        warnings++;
    }
    
    public int warnings(){
        return warnings;
    }

    public String Warnings2String(){
        StringBuffer warnStr = new StringBuffer();
        Iterator<Entry<SrcInfo,String>> it = warnStack.iterator();
        while (it.hasNext()){
            Entry<SrcInfo,String> entry = it.next();
            warnStr.append("Warning:" + entry.first().toString()+ " : "+entry.second().toString()+"\n");
        }
        return warnStr.toString();
    }
    
}