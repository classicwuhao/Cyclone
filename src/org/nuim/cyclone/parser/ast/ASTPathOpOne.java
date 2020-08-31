package org.nuim.cyclone.parser.ast;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.SpecialState;
import org.nuim.cyclone.model.SrcInfo;

public class ASTPathOpOne extends ASTPathOperator{
    public ASTPathOpOne(){
        super();
    }

    public ASTPathOpOne(Token token){
        super(token);
    }

    public SpecialState gen(ASTContext context) throws SemanticException {
        SpecialState ss = new SpecialState(ASTPathOperator.Operator.ONE.toString(),
            new SrcInfo(this.token().getText(),this.token().getLine(),this.token().getCharPositionInLine()));

        return ss;
    }

}