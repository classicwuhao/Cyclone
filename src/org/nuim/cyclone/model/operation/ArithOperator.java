package org.nuim.cyclone.model.operation;
import org.nuim.cyclone.model.type.PrimitiveType;
import org.nuim.cyclone.model.type.IntType;
import org.nuim.cyclone.model.type.RealType;

public abstract class ArithOperator extends StdOperator{

    public static int ARITH_PLUS="+".hashCode();
    public static int ARITH_MINUS="-".hashCode();
    public static int ARITH_MUL="*".hashCode();
    public static int ARITH_DIV="/".hashCode();
    public static int ARITH_REM="%".hashCode();
    public static int ARITH_PLUS_PLUS="++".hashCode();
    public static int ARITH_MINUS_MINUS="++".hashCode();

    public ArithOperator(){
        super();
    }

    public ArithOperator(String operator, int arity){
        super(operator,arity);
    }   

    @Override
    public boolean isArithOperator(){return false;}

    public static final class Plus extends ArithOperator{
        public Plus (){
            super("+",2);
            register();
        }

        /**
         * 1. INT + INT -> INT
         * 2. INT + REAL -> REAL [warning if return type is an int (this may cause unsat)]
         * 3. REAL + INT -> REAL [warning if return type is an int (this may cause unsat)]
         */
        public void register() {
            IntType[] types0={
                new IntType(),
                new IntType()
            };
            
            PrimitiveType[] types1={
                new IntType(),
                new RealType()
            };
            
            PrimitiveType[] types2={
                new RealType(),
                new IntType()
            };

            this.registerTypeRule(types0, new IntType());
            this.registerTypeRule(types1, new RealType());
            this.registerTypeRule(types2, new RealType());
        }   

        @Override
        public boolean isBinaryOperator(){return true;}
    }

    public static final class Minus extends ArithOperator{
        public Minus (){
            super("-",2);
            register();
        }

        /**
         * 1. INT - INT -> INT
         * 2. INT - REAL -> REAL [warning if return type is an int (this may cause unsat)]
         * 3. REAL - INT -> REAL [warning if return type is an int (this may cause unsat)]
         */
        public void register() {
            IntType[] types0={
                new IntType(),
                new IntType()
            };
            
            PrimitiveType[] types1={
                new IntType(),
                new RealType()
            };
            
            PrimitiveType[] types2={
                new RealType(),
                new IntType()
            };

            this.registerTypeRule(types0, new IntType());
            this.registerTypeRule(types1, new RealType());
            this.registerTypeRule(types2, new RealType());
        }   

        @Override
        public boolean isBinaryOperator(){return true;}
    }


    public static final class Multiplication extends ArithOperator{
        public Multiplication (){
            super("*",2);
            register();
        }

        /**
         * 1. INT * INT -> INT
         * 2. INT * REAL -> REAL [warning if return type is an int (this may cause unsat)]
         * 3. REAL * INT -> REAL [warning if return type is an int (this may cause unsat)]
         */
        public void register() {
            IntType[] types0={
                new IntType(),
                new IntType()
            };
            
            PrimitiveType[] types1={
                new IntType(),
                new RealType()
            };
            
            PrimitiveType[] types2={
                new RealType(),
                new IntType()
            };

            this.registerTypeRule(types0, new IntType());
            this.registerTypeRule(types1, new RealType());
            this.registerTypeRule(types2, new RealType());
        }   

        @Override
        public boolean isBinaryOperator(){return true;}
    }

    public static final class Division extends ArithOperator{
        public Division (){
            super("*",2);
            register();
        }

        /**
         * 1. INT / INT -> INT
         * 2. INT / REAL -> REAL [warning if return type is an int (this may cause unsat)]
         * 3. REAL / INT -> REAL [warning if return type is an int (this may cause unsat)]
         */
        public void register() {
            IntType[] types0={
                new IntType(),
                new IntType()
            };
            
            PrimitiveType[] types1={
                new IntType(),
                new RealType()
            };
            
            PrimitiveType[] types2={
                new RealType(),
                new IntType()
            };

            this.registerTypeRule(types0, new IntType());
            this.registerTypeRule(types1, new RealType());
            this.registerTypeRule(types2, new RealType());
        }   

        @Override
        public boolean isBinaryOperator(){return true;}
    }

    /*
     * An expensive operator
     * */ 
    public static final class Remainder extends ArithOperator{
        public Remainder (){
            super("%",2);
            register();
        }

        /**
         * 1. INT % INT -> INT
         * 2. INT % REAL -> INT [warning if return type is an int (this may cause unsat)]
         * 3. REAL % INT -> INT [warning if return type is an int (this may cause unsat)]
         */
        public void register() {
            IntType[] types0={
                new IntType(),
                new IntType()
            };
            
            PrimitiveType[] types1={
                new IntType(),
                new RealType()
            };
            
            PrimitiveType[] types2={
                new RealType(),
                new IntType()
            };

            this.registerTypeRule(types0, new IntType());
            this.registerTypeRule(types1, new IntType());
            this.registerTypeRule(types2, new IntType());
        }   

        @Override
        public boolean isBinaryOperator(){return true;}
    }

    public static final class PlusPlus extends ArithOperator{
        public PlusPlus (){
            super("++",1);
            register();
        }

        /**
         * 1. (++)INT(++) -> INT
         * 2. (++)REAL(++) -> REAL
         */
        public void register() {
            IntType[] types0={
                new IntType(),
                new IntType()
            };
            
            PrimitiveType[] types1={
                new RealType(),
                new RealType()
            };
            
            this.registerTypeRule(types0, new IntType());
            this.registerTypeRule(types1, new RealType());
        }   

        @Override
        public boolean isUnaryOperator(){return true;}
    }

    public static final class MinusMinus extends ArithOperator{
        public MinusMinus (){
            super("--",1);
            register();
        }

        /**
         * 1. (--)INT(--) -> INT
         * 2. (--)REAL(--) -> REAL
         */
        public void register() {
            IntType[] types0={
                new IntType(),
                new IntType()
            };
            
            PrimitiveType[] types1={
                new RealType(),
                new RealType()
            };
            
            this.registerTypeRule(types0, new IntType());
            this.registerTypeRule(types1, new RealType());
        }   

        @Override
        public boolean isUnaryOperator(){return true;}
    }   

}