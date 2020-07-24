package org.nuim.cyclone.parser.ast;
import org.nuim.cyclone.model.State;
import org.nuim.cyclone.model.Variable;
import org.nuim.cyclone.model.StateModifier;
import org.nuim.cyclone.model.SrcInfo;
import org.antlr.runtime.Token ;
import org.nuim.cyclone.model.Expression;
import java.util.List;
import java.util.ArrayList;

public class ASTState extends ASTExpression{
    private Token token;
    private ASTStateModifier modifier;
    private List<ASTExpression> exprs = new ArrayList<ASTExpression>();
    private List<ASTVariable> variables = new ArrayList<ASTVariable>();

    public ASTState(){
        super();
    }

    public ASTState(String name){
        super(name);
    }

    public void setModifier(ASTStateModifier modifier){
        this.modifier=modifier;
    }

    public void addExpr(ASTExpression expr){
        this.exprs.add(expr);
    }

    public void addVar(ASTVariable var){
        variables.add(var);
    }

    public Token token(){return this.token;}
    public void setToken(Token token){this.token=token;}

    public ASTExpression[] exprs(){
        ASTExpression [] exprs = new ASTExpression[this.exprs.size()];
        return this.exprs.toArray(exprs);
    }

    public State gen(ASTContext context) throws SemanticException{
        State state = new State();
        state.setName(this.token.getText());

        switch (this.modifier){
            case  START:
            state.setModifier(StateModifier.START);
            break;

            case  FINAL:
            state.setModifier(StateModifier.FINAL);
            break;

            case  NORMAL:
            state.setModifier(StateModifier.NORMAL);
            break;

            case  ABSTRACT:
            state.setModifier(StateModifier.ABSTRACT);
            break;
        }
        
        for (ASTVariable astvar: variables){
            Variable var = astvar.gen(context);
            state.addVariable(var);
        }

        context.setLocalVariables(state.localVariables());

        for (ASTExpression expr:this.exprs){
            Expression e = expr.gen(context);
            state.addExpression(e);
        }
        
        state.setSrcInfo(new SrcInfo(token.getText(),token.getLine(),token.getCharPositionInLine()));
        return state;
    }

}