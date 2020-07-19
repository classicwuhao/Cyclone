package org.nuim.cyclone.parser.ast;

import org.antlr.runtime.Token;

public class SemanticException extends Exception{
    private static final long serialVersionUID = 1L;
    private Token token;

    public SemanticException(String message){
        super(message);
        token=null;
    }

    public SemanticException(Token token, String message){
        super(message);
        this.token = token;
    }
        
    /*
     * return a readable message with detailed token information if we have.
     * */ 
    @Override
    public String getMessage(){
        StringBuffer sb = new StringBuffer();

        if (this.token!=null){
            sb.append(this.token.getInputStream().getSourceName());
            sb.append(" line: ");
            sb.append(this.token.getLine());
            sb.append(" column: ");
            sb.append(this.token.getCharPositionInLine());
        }

        return sb.append(super.getMessage()).toString();
    }
}