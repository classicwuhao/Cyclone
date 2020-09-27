package org.nuim.cyclone.compiler;
import org.nuim.cyclone.model.ErrorLog;
import java.util.Stack;
import org.nuim.cyclone.util.Entry;
import org.nuim.cyclone.model.SrcInfo;
import java.util.Iterator;
/* context information during generation */ 
public class GenerationContext {
    private ErrorLog err;
    private Stack<Entry<SrcInfo,String>> warnStack = new Stack< Entry<SrcInfo,String>>();    
    private int warnings = 0;

    public GenerationContext(){
        err = new ErrorLog();
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