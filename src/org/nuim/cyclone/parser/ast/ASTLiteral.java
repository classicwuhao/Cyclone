package org.nuim.cyclone.parser.ast;

import org.nuim.cyclone.model.type.*;
import org.nuim.cyclone.model.value.*;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.SrcInfo;
public class ASTLiteral extends ASTExpression {
    public static enum LiteralType {
        INT, BOOL, REAL, STRING, CHAR, ENUM
    };

    private LiteralType lt;
    private Token token;

    public ASTLiteral() {
        super("");
    }

    public ASTLiteral(LiteralType lt, Token token) {
        super(token.getText());
        this.lt = lt;
        this.token = token;
    }
    
    public void setMinus(){
        this.token.setText("-"+this.token.getText());
    }

    public Value gen(ASTContext context) throws SemanticException {
        Value value;
        String str_value = this.token.getText();
        switch (this.lt) {
            case INT:
                value = new IntValue(Integer.parseInt(str_value));
                break;

            case BOOL:
                value = new BoolValue(Boolean.parseBoolean(str_value));
                break;

            case STRING:
                value = new StringValue(str_value);
                break;

            case CHAR:
                value = new CharValue(str_value.charAt(0));
                break;

            case REAL:
                value = new RealValue(Float.parseFloat(str_value));
                break;

            case ENUM:
                value = new EnumValue(str_value);
                break;
                
            default:
                throw new SemanticException("invalid literal: " + str_value+ "line:"+
                    this.token.getLine()+",column:"+this.token.getCharPositionInLine());
           
        }
        value.setSrcInfo(new SrcInfo(token.getText(),token.getLine(),token.getCharPositionInLine()));
        return value;
    }

    @Override
    public boolean isASTLitreal(){return true;}

    @Override
    public String toString(){return this.token.getText();}
}