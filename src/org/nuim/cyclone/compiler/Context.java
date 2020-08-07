package org.nuim.cyclone.compiler;
import org.nuim.cyclone.model.ErrorLog;
/* context information during generation */ 
public class Context {
    private ErrorLog err;
    
    public Context(){
        err = new ErrorLog();
    }

    public void reportError(String message){
        err.logErrors(message);
    }

    public int errors(){
        return err.errors();
    }

}