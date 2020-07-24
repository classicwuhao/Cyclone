package org.nuim.cyclone.model.operation;
import org.nuim.cyclone.model.type.PrimitiveType;
import org.nuim.cyclone.model.type.BoolType;
import org.nuim.cyclone.model.type.IntType;
import org.nuim.cyclone.model.type.RealType;
import org.nuim.cyclone.model.type.CharType;
import org.nuim.cyclone.model.type.StringType;

/*
 *  Generic class for standard operators
 * 
 * */
 
public abstract class StdOperator extends Operator{
    
    public static int STD_EQUAL_EQUAL="==".hashCode();
    public static int STD_NOT_EQUAL="!=".hashCode();
    public static int STD_PLUS_EQUAL="+=".hashCode();
    public static int STD_MINUS_EQUAL="-=".hashCode();
    public static int STD_MUL_EQUAL="-=".hashCode();
    public static int STD_DIV_EQUAL="-=".hashCode();
    public static int STD_EQUAL="=".hashCode();

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


    public static final class PlusEqual extends BoolOperator{

        public PlusEqual (){
            super("+=",2);
            register();
        }

        /**
         * INT += INT -> INT
         * REAL += REAL -> REAL
         * INT += REAL -> REAL
         * REAL += INT -> REAL
         */
        public void register() {
            PrimitiveType[] types0={
                new IntType(),
                new IntType()
            };

            PrimitiveType[] types1={
                new RealType(),
                new RealType()
            };

            PrimitiveType[] types2={
                new IntType(),
                new RealType()
            };

            PrimitiveType[] types3={
                new RealType(),
                new IntType()
            };

            this.registerTypeRule(types0, new IntType());
            this.registerTypeRule(types1, new RealType());
            this.registerTypeRule(types2, new RealType());
            this.registerTypeRule(types3, new RealType());
        }

        @Override
        public boolean isBinaryOperator(){return true;}
    }

    

    public static final class MinusEqual extends BoolOperator{

        public MinusEqual (){
            super("-=",2);
            register();
        }

        /**
         * INT -= INT -> INT
         * REAL -= REAL -> REAL
         * INT -= REAL -> REAL
         * REAL -= INT -> REAL
         */
        public void register() {
            PrimitiveType[] types0={
                new IntType(),
                new IntType()
            };

            PrimitiveType[] types1={
                new RealType(),
                new RealType()
            };

            PrimitiveType[] types2={
                new IntType(),
                new RealType()
            };

            PrimitiveType[] types3={
                new RealType(),
                new IntType()
            };

            this.registerTypeRule(types0, new IntType());
            this.registerTypeRule(types1, new RealType());
            this.registerTypeRule(types2, new RealType());
            this.registerTypeRule(types3, new RealType());
        }

        @Override
        public boolean isBinaryOperator(){return true;}
    }

    public static final class MulEqual extends BoolOperator{

        public MulEqual (){
            super("*=",2);
            register();
        }

        /**
         * INT *= INT -> INT
         * REAL *= REAL -> REAL
         * INT *= REAL -> REAL
         * REAL *= INT -> REAL
         */
        public void register() {
            PrimitiveType[] types0={
                new IntType(),
                new IntType()
            };

            PrimitiveType[] types1={
                new RealType(),
                new RealType()
            };

            PrimitiveType[] types2={
                new IntType(),
                new RealType()
            };

            PrimitiveType[] types3={
                new RealType(),
                new IntType()
            };

            this.registerTypeRule(types0, new IntType());
            this.registerTypeRule(types1, new RealType());
            this.registerTypeRule(types2, new RealType());
            this.registerTypeRule(types3, new RealType());
        }

        @Override
        public boolean isBinaryOperator(){return true;}
    }



    public static final class DivEqual extends BoolOperator{

        public DivEqual (){
            super("/=",2);
            register();
        }

        /**
         * INT /= INT -> INT
         * REAL /= REAL -> REAL
         * INT /= REAL -> REAL
         * REAL /= INT -> REAL
         */
        public void register() {
            PrimitiveType[] types0={
                new IntType(),
                new IntType()
            };

            PrimitiveType[] types1={
                new RealType(),
                new RealType()
            };

            PrimitiveType[] types2={
                new IntType(),
                new RealType()
            };

            PrimitiveType[] types3={
                new RealType(),
                new IntType()
            };

            this.registerTypeRule(types0, new IntType());
            this.registerTypeRule(types1, new RealType());
            this.registerTypeRule(types2, new RealType());
            this.registerTypeRule(types3, new RealType());
        }

        @Override
        public boolean isBinaryOperator(){return true;}
    }


    public static final class Equal extends BoolOperator{

        public Equal (){
            super("=",2);
            register();
        }

        /**
         * INT = INT -> INT
         * REAL = REAL -> REAL
         * INT = REAL -> REAL
         * REAL = INT -> REAL
         * BOOL = BOOL -> BOOL
         * STRING = STRING -> STRING
         * CHAR = CHAR -> CHAR
         */
        public void register() {
            PrimitiveType[] types0={
                new IntType(),
                new IntType()
            };

            PrimitiveType[] types1={
                new RealType(),
                new RealType()
            };

            PrimitiveType[] types2={
                new IntType(),
                new RealType()
            };

            PrimitiveType[] types3={
                new RealType(),
                new IntType()
            };

            PrimitiveType[] types4={
                new BoolType(),
                new BoolType()
            };

            PrimitiveType[] types5={
                new StringType(),
                new StringType()
            };

            PrimitiveType[] types6={
                new CharType(),
                new CharType()
            };

            this.registerTypeRule(types0, new IntType());
            this.registerTypeRule(types1, new RealType());
            this.registerTypeRule(types2, new RealType());
            this.registerTypeRule(types3, new RealType());
            this.registerTypeRule(types4, new BoolType());
            this.registerTypeRule(types5, new StringType());
            this.registerTypeRule(types6, new CharType());
        }

        @Override
        public boolean isBinaryOperator(){return true;}
    }


}