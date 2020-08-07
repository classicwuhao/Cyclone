package org.nuim.cyclone.compiler;

public class GenerationException extends Exception {

 private static final long serialVersionUID = 5L;
    private static final String head="Generation Error: ";
    
    public GenerationException(String message){
        super(message);
    }
    
    /*
     * return a readable message with detailed token information if we have.
     * */ 
    @Override
    public String getMessage(){
        StringBuffer sb = new StringBuffer();
        sb.append(head);
        return sb.append(super.getMessage()).toString();
    }

}