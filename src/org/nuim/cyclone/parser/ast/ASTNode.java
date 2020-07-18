package org.nuim.cyclone.parser.ast;
import org.nuim.cyclone.model.Expression;
import org.nuim.cyclone.model.NamedElement;
/*
 * The node of our AST 
 * */
public abstract class ASTNode extends NamedElement{
    public ASTNode(){super();}
    public ASTNode(String name){super(name);}
    public abstract Expression gen() throws SemanticException;
    
}