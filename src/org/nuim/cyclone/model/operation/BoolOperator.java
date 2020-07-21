package org.nuim.cyclone.model.operation;
import org.nuim.cyclone.model.type.BoolType;

public abstract class BoolOperator extends StdOperator{
    /*
     * Define unique ID for each boolean operator
     * */ 
    public static int BOOL_AND="&&".hashCode();
    public static int BOOL_OR="||".hashCode();
    public static int BOOL_XOR="xor".hashCode();
    public static int BOOL_NOT="!".hashCode();
    public static int BOOL_IMPLIES="=>".hashCode();

    public BoolOperator(){}
    public BoolOperator(String operator, int arity){
        super(operator,arity);
    }

    @Override
    public boolean isBooleanOperator(){return true;}

    public static final class And extends BoolOperator{

        public And (){
            super("&&",2);
            register();
        }

        /**
         * BOOL && BOOL -> BOOL
         */
        public void register() {
            BoolType[] types={
                new BoolType(),
                new BoolType()
            };
            this.registerTypeRule(types, new BoolType());
        }

        @Override
        public boolean isBinaryOperator(){return true;}
    }

    public static final class Or extends BoolOperator{

        public Or (){
            super("||",2);
            register();
        }

        /**
         * BOOL || BOOL -> BOOL
         */
        public void register() {
            BoolType[] types={
                new BoolType(),
                new BoolType()
            };
            this.registerTypeRule(types, new BoolType());
        }

        @Override
        public boolean isBinaryOperator(){return true;}
    }

    public static final class Xor extends BoolOperator{

        public Xor (){
            super("xor",2);
            register();
        }

        /**
         * BOOL xor BOOL -> BOOL
         */
        public void register() {
            BoolType[] types={
                new BoolType(),
                new BoolType()
            };
            this.registerTypeRule(types, new BoolType());
        }

        @Override
        public boolean isBinaryOperator(){return true;}
    }
    
    public static final class Implies extends BoolOperator{

        public Implies (){
            super("=>",2);
            register();
        }

        /**
         * BOOL => BOOL -> BOOL
         */
        public void register() {
            BoolType[] types={
                new BoolType(),
                new BoolType()
            };
            this.registerTypeRule(types, new BoolType());
        }

        @Override
        public boolean isBinaryOperator(){return true;}
    }

    public static final class Not extends BoolOperator{

        public Not (){
            super("!",2);
            register();
        }

        /**
         * ! BOOL -> BOOL
         */
        public void register() {
            BoolType[] types={
                new BoolType()
            };
            this.registerTypeRule(types, new BoolType());
        }

        @Override
        public boolean isUnaryOperator(){return true;}
    }

}