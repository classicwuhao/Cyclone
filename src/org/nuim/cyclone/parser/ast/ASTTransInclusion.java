package org.nuim.cyclone.parser.ast;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.SrcInfo;
import org.nuim.cyclone.model.State;
import org.nuim.cyclone.model.TransInclusion;
import java.util.List;
import java.util.ArrayList;

public class ASTTransInclusion extends ASTPathExpression {
    private List<String> path = new ArrayList<String>();
    
    public ASTTransInclusion(){
       super(); 
    }

    public ASTTransInclusion(Token token){
        super(token);
    }

    public void addState(String s){
        this.path.add(s);
    }

    @Override
    public boolean isTransInclusion(){
        return true;
    }

    public TransInclusion gen(ASTContext context) throws SemanticException{
        TransInclusion ti = new TransInclusion(new SrcInfo(this.token().getText(),this.token().getLine(),this.token().getCharPositionInLine()));

        for (String str : path){
            State state = context.fetch(str);
            if (state==null) {
                context.logError(this.token(), " invalid path, no state "+state+" is defined.",true);
                throw new SemanticException(this.token()," invalid path, no state "+state+" is defined.");
            }
            else{
                ti.addPath(state);
            }
        }

        return ti;
    }

}