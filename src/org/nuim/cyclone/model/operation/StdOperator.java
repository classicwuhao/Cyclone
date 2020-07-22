package org.nuim.cyclone.model.operation;
import org.nuim.cyclone.model.type.PrimitiveType;
import org.nuim.cyclone.model.type.BoolType;
import org.nuim.cyclone.model.type.IntType;
import org.nuim.cyclone.model.type.RealType;
import org.nuim.cyclone.model.type.CharType;

/*
 *  Generic class for standard operators
 * 
 * */
 
public abstract class StdOperator extends Operator{
    
    public static int STD_EQUAL_EQUAL="==".hashCode();
    public static int STD_NOT_EQUAL="!=".hashCode();

    public StdOperator(){}

    public StdOperator(String operator, int arity){
        super(operator,arity);
    }


    public boolean isStdOperator(){return true;}


    public static final class EqualEqual extends BoolOperator{

        public EqualEqual (){
            super("==",2);
            register();
        }

        /**
         * BOOL == BOOL -> BOOL
         * INT == INT -> BOOL
         * REAL == REAL -> BOOL
         * CHAR == CHAR -> BOOL
         */
        public void register() {
            PrimitiveType[] types0={
                new BoolType(),
                new BoolType()
            };

            PrimitiveType[] types1={
                new IntType(),
                new IntType()
            };

            PrimitiveType[] types2={
                new RealType(),
                new RealType()
            };

            PrimitiveType[] types3={
                new CharType(),
                new CharType()
            };

            this.registerTypeRule(types0, new BoolType());
            this.registerTypeRule(types1, new BoolType());
            this.registerTypeRule(types2, new BoolType());
            this.registerTypeRule(types3, new BoolType());
        }

        @Override
        public boolean isBinaryOperator(){return true;}
    }

    public static final class NotEqual extends BoolOperator{

        public NotEqual (){
            super("!=",2);
            register();
        }

        /**
         * BOOL != BOOL -> BOOL
         * INT != INT -> BOOL
         * REAL != REAL -> BOOL
         * CHAR != CHAR -> BOOL
         */
        public void register() {
            PrimitiveType[] types0={
                new BoolType(),
                new BoolType()
            };

            PrimitiveType[] types1={
                new IntType(),
                new IntType()
            };

            PrimitiveType[] types2={
                new RealType(),
                new RealType()
            };

            PrimitiveType[] types3={
                new CharType(),
                new CharType()
            };

            this.registerTypeRule(types0, new BoolType());
            this.registerTypeRule(types1, new BoolType());
            this.registerTypeRule(types2, new BoolType());
            this.registerTypeRule(types3, new BoolType());
        }

        @Override
        public boolean isBinaryOperator(){return true;}
    }

}