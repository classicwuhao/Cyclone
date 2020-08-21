package org.nuim.cyclone.parser.ast;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.SrcInfo;
import org.nuim.cyclone.model.State;
import org.nuim.cyclone.model.StateInclusion;

public class ASTStateInclusion extends ASTPathExpression{
    private String state;
    
    public ASTStateInclusion(){
        super();
    }

    public ASTStateInclusion(Token token){
        super(token);
    }

    public void setState(String state){
        this.state = state;
    }

    @Override
    public boolean isStateInclusion(){
        return true;
    }

    public StateInclusion gen (ASTContext context) throws SemanticException{
        StateInclusion si = new StateInclusion(new SrcInfo(this.token().getText(),this.token().getLine(),this.token().getCharPositionInLine()));
        State s = context.fetch(this.state);
        if (s==null) {
            context.logError(this.token(), " no state "+this.state+" is defined.",true);
            throw new SemanticException(this.token()," no state "+this.state+" is defined.");
        }
        si.setState(s);
        return si;  
    }

    
}