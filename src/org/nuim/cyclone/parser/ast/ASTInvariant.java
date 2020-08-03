package org.nuim.cyclone.parser.ast;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.SrcInfo;
import org.nuim.cyclone.model.Expression;
import org.nuim.cyclone.model.Invariant;
import org.nuim.cyclone.model.State;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class ASTInvariant extends ASTExpression {
    private List<ASTExpression> expressions = new ArrayList<ASTExpression>();
    private Token token;
    private Set<String> states = new HashSet<String>();

    public ASTInvariant(){}

    public ASTInvariant(Token token){
        this.token=token;
    }

    public void addExpr(ASTExpression expr){
        expressions.add(expr);
    }
    
    public void setToken(Token token){
        this.token=token;
        this.setName(this.token.getText());
    }
    public Token token(){return this.token;}
    public List<ASTExpression> expr(){return this.expressions;}
    public void addState(ASTIdentifier ident){
        states.add(ident.name());
    }

    public Invariant gen (ASTContext context) throws SemanticException{
        /* 
         * Note: we only allow global variables to be used in the expression 
         * */ 
        Invariant inv = new Invariant(new SrcInfo(this.token.getText(),this.token.getLine(),this.token.getCharPositionInLine()));
        inv.setName(this.token.getText());

        for (ASTExpression e : this.expressions){
            inv.addExpr(e.gen(context));
        }

        /* make sure every state is defined before. */ 
        for (String ident : states){
            State state = context.fetch(ident);
            if (state==null){
                context.logError(this.token," state "+ident+" is not defined.",true);
                throw new SemanticException(this.token, " state "+ident+" is not defined.");
            }

            /* abstract state is not applied */ 
            if (!state.isAbstract()) inv.addState(state);

        }
        return inv;
    }
    
}