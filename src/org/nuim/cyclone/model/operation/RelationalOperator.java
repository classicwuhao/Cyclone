package org.nuim.cyclone.model.operation;
import org.nuim.cyclone.model.type.PrimitiveType;
import org.nuim.cyclone.model.type.IntType;
import org.nuim.cyclone.model.type.RealType;
import org.nuim.cyclone.model.type.BoolType;

public abstract class RelationalOperator extends StdOperator{

    public static int REL_GREATER=">".hashCode();
    public static int REL_GREATER_EQUAL=">=".hashCode();
    public static int REL_LESS="<".hashCode();
    public static int REL_LESS_EQUAL="<=".hashCode();

    public RelationalOperator(){}
    public RelationalOperator(String operator, int arity){
        super(operator,arity);
    }

    @Override
    public boolean isRelationalOperator(){return true;}

    public static final class Greater extends RelationalOperator{
        public Greater (){
            super(">",2);
            register();
        }

        /**
         * 1. INT > INT -> BOOL
         * 2. INT > REAL -> BOOL 
         * 3. REAL > INT -> BOOL 
         * 4. REAL > REAL -> BOOL
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

            PrimitiveType[] types3={
                new RealType(),
                new RealType()
            };

            this.registerTypeRule(types0, new BoolType());
            this.registerTypeRule(types1, new BoolType());
            this.registerTypeRule(types2, new BoolType());
            this.registerTypeRule(types3, new BoolType());
        }   

        @Override
        public boolean isBinaryOperator(){return true;}
    }

    public static final class GreaterEqual extends RelationalOperator{
        public GreaterEqual (){
            super(">=",2);
            register();
        }

        /**
         * 1. INT > INT -> BOOL
         * 2. INT > REAL -> BOOL 
         * 3. REAL > INT -> BOOL 
         * 4. REAL > REAL -> BOOL
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

            PrimitiveType[] types3={
                new RealType(),
                new RealType()
            };

            this.registerTypeRule(types0, new BoolType());
            this.registerTypeRule(types1, new BoolType());
            this.registerTypeRule(types2, new BoolType());
            this.registerTypeRule(types3, new BoolType());
        }   

        @Override
        public boolean isBinaryOperator(){return true;}
    }


    
    public static final class Less extends RelationalOperator{
        public Less (){
            super("<",2);
            register();
        }

        /**
         * 1. INT < INT -> BOOL
         * 2. INT < REAL -> BOOL 
         * 3. REAL < INT -> BOOL 
         * 4. REAL < REAL -> BOOL
         */
        public void register() {
            PrimitiveType[] types0={
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

            PrimitiveType[] types3={
                new RealType(),
                new RealType()
            };

            this.registerTypeRule(types0, new BoolType());
            this.registerTypeRule(types1, new BoolType());
            this.registerTypeRule(types2, new BoolType());
            this.registerTypeRule(types3, new BoolType());
        }   

        @Override
        public boolean isBinaryOperator(){return true;}
    }

    
    public static final class LessEqual extends RelationalOperator{
        public LessEqual (){
            super("<=",2);
            register();
        }

        /**
         * 1. INT <= INT -> BOOL
         * 2. INT <= REAL -> BOOL 
         * 3. REAL <= INT -> BOOL 
         * 4. REAL <= REAL -> BOOL
         */
        public void register() {
            PrimitiveType[] types0={
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

            PrimitiveType[] types3={
                new RealType(),
                new RealType()
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