// $ANTLR 3.4 StateMachine.g 2020-07-11 13:36:09

package org.nuim.cyclone.parser;
import java.util.Collections;
import java.util.Arrays;
import org.nuim.cyclone.parser.ast.*;
import org.nuim.cyclone.model.type.*;
import org.nuim.cyclone.model.value.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class StateMachineParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "BOOL", "BOOLLITERAL", "CHAR", "CHARLITERAL", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "ENUM", "EQUAL", "EscapeSequence", "FINAL", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "INTLITERAL", "INVARIANT", "IdentifierPart", "IdentifierStart", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MACHINE", "MINUS", "ML_COMMENT", "NEWLINE", "NOT_EQUAL", "ON", "PLUS", "RBRACE", "RBRACK", "REAL", "REALLITERAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "START", "STATE", "STRING", "STRINGLITERAL", "TRANS", "WHERE", "WS", "'!'", "'%'", "'&&'", "'++'", "'--'", "'global'", "'native'", "'||'"
    };

    public static final int EOF=-1;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int ARROW=4;
    public static final int AT=5;
    public static final int BAR=6;
    public static final int BOOL=7;
    public static final int BOOLLITERAL=8;
    public static final int CHAR=9;
    public static final int CHARLITERAL=10;
    public static final int COLON=11;
    public static final int COLON_COLON=12;
    public static final int COLON_EQUAL=13;
    public static final int COMMA=14;
    public static final int DOT=15;
    public static final int DOTDOT=16;
    public static final int ENUM=17;
    public static final int EQUAL=18;
    public static final int EscapeSequence=19;
    public static final int FINAL=20;
    public static final int GREATER=21;
    public static final int GREATER_EQUAL=22;
    public static final int HASH=23;
    public static final int HEX_DIGIT=24;
    public static final int IDENT=25;
    public static final int INT=26;
    public static final int INTLITERAL=27;
    public static final int INVARIANT=28;
    public static final int IdentifierPart=29;
    public static final int IdentifierStart=30;
    public static final int LBRACE=31;
    public static final int LBRACK=32;
    public static final int LESS=33;
    public static final int LESS_EQUAL=34;
    public static final int LPAREN=35;
    public static final int MACHINE=36;
    public static final int MINUS=37;
    public static final int ML_COMMENT=38;
    public static final int NEWLINE=39;
    public static final int NOT_EQUAL=40;
    public static final int ON=41;
    public static final int PLUS=42;
    public static final int RBRACE=43;
    public static final int RBRACK=44;
    public static final int REAL=45;
    public static final int REALLITERAL=46;
    public static final int RPAREN=47;
    public static final int SEMI=48;
    public static final int SLASH=49;
    public static final int SL_COMMENT=50;
    public static final int STAR=51;
    public static final int START=52;
    public static final int STATE=53;
    public static final int STRING=54;
    public static final int STRINGLITERAL=55;
    public static final int TRANS=56;
    public static final int WHERE=57;
    public static final int WS=58;

    // delegates
    public BaseParser[] getDelegates() {
        return new BaseParser[] {};
    }

    // delegators


    public StateMachineParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public StateMachineParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[69+1];
         

    }

    public String[] getTokenNames() { return StateMachineParser.tokenNames; }
    public String getGrammarFileName() { return "StateMachine.g"; }



    // $ANTLR start "machine"
    // StateMachine.g:46:1: machine returns [ASTMachine machine] : MACHINE name= identifier LBRACE (v= globalVariableDecl )* ( state )* ( trans )* ( invariantExpression )* RBRACE EOF ;
    public final ASTMachine machine() throws RecognitionException {
        ASTMachine machine = null;

        int machine_StartIndex = input.index();

        String name =null;

        ASTVariable v =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return machine; }

            // StateMachine.g:46:37: ( MACHINE name= identifier LBRACE (v= globalVariableDecl )* ( state )* ( trans )* ( invariantExpression )* RBRACE EOF )
            // StateMachine.g:48:5: MACHINE name= identifier LBRACE (v= globalVariableDecl )* ( state )* ( trans )* ( invariantExpression )* RBRACE EOF
            {
            match(input,MACHINE,FOLLOW_MACHINE_in_machine76); if (state.failed) return machine;

            pushFollow(FOLLOW_identifier_in_machine80);
            name=identifier();

            state._fsp--;
            if (state.failed) return machine;

            if ( state.backtracking==0 ) {machine = new ASTMachine(name);}

            match(input,LBRACE,FOLLOW_LBRACE_in_machine84); if (state.failed) return machine;

            // StateMachine.g:49:9: (v= globalVariableDecl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BOOL||LA1_0==ENUM||LA1_0==INT||LA1_0==REAL||LA1_0==STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // StateMachine.g:49:10: v= globalVariableDecl
            	    {
            	    pushFollow(FOLLOW_globalVariableDecl_in_machine97);
            	    v=globalVariableDecl();

            	    state._fsp--;
            	    if (state.failed) return machine;

            	    if ( state.backtracking==0 ) {machine.addVariable(v);}

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // StateMachine.g:50:9: ( state )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==FINAL||(LA2_0 >= START && LA2_0 <= STATE)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // StateMachine.g:50:10: state
            	    {
            	    pushFollow(FOLLOW_state_in_machine112);
            	    state();

            	    state._fsp--;
            	    if (state.failed) return machine;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // StateMachine.g:50:18: ( trans )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==TRANS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // StateMachine.g:50:19: trans
            	    {
            	    pushFollow(FOLLOW_trans_in_machine117);
            	    trans();

            	    state._fsp--;
            	    if (state.failed) return machine;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // StateMachine.g:51:9: ( invariantExpression )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==INVARIANT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // StateMachine.g:51:10: invariantExpression
            	    {
            	    pushFollow(FOLLOW_invariantExpression_in_machine130);
            	    invariantExpression();

            	    state._fsp--;
            	    if (state.failed) return machine;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_machine138); if (state.failed) return machine;

            match(input,EOF,FOLLOW_EOF_in_machine140); if (state.failed) return machine;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, machine_StartIndex); }

        }
        return machine;
    }
    // $ANTLR end "machine"



    // $ANTLR start "state"
    // StateMachine.g:55:1: state : ( stateModifier )? STATE identifier LBRACE ( localVariableDecl )* ( expression SEMI )* RBRACE ;
    public final void state() throws RecognitionException {
        int state_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }

            // StateMachine.g:55:6: ( ( stateModifier )? STATE identifier LBRACE ( localVariableDecl )* ( expression SEMI )* RBRACE )
            // StateMachine.g:56:5: ( stateModifier )? STATE identifier LBRACE ( localVariableDecl )* ( expression SEMI )* RBRACE
            {
            // StateMachine.g:56:5: ( stateModifier )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==FINAL||LA5_0==START) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // StateMachine.g:56:6: stateModifier
                    {
                    pushFollow(FOLLOW_stateModifier_in_state153);
                    stateModifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,STATE,FOLLOW_STATE_in_state158); if (state.failed) return ;

            pushFollow(FOLLOW_identifier_in_state160);
            identifier();

            state._fsp--;
            if (state.failed) return ;

            match(input,LBRACE,FOLLOW_LBRACE_in_state162); if (state.failed) return ;

            // StateMachine.g:57:9: ( localVariableDecl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==BOOL||LA6_0==ENUM||LA6_0==INT||LA6_0==REAL||LA6_0==STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // StateMachine.g:57:10: localVariableDecl
            	    {
            	    pushFollow(FOLLOW_localVariableDecl_in_state173);
            	    localVariableDecl();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // StateMachine.g:58:9: ( expression SEMI )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==BOOLLITERAL||LA7_0==CHARLITERAL||LA7_0==IDENT||LA7_0==INTLITERAL||LA7_0==LPAREN||LA7_0==MINUS||LA7_0==PLUS||LA7_0==REALLITERAL||LA7_0==STRINGLITERAL||LA7_0==59||(LA7_0 >= 62 && LA7_0 <= 63)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // StateMachine.g:58:10: expression SEMI
            	    {
            	    pushFollow(FOLLOW_expression_in_state186);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    match(input,SEMI,FOLLOW_SEMI_in_state188); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_state196); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, state_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "state"



    // $ANTLR start "trans"
    // StateMachine.g:62:1: trans : TRANS identifier LBRACE identifier ARROW identifier ON label RBRACE ;
    public final void trans() throws RecognitionException {
        int trans_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }

            // StateMachine.g:62:6: ( TRANS identifier LBRACE identifier ARROW identifier ON label RBRACE )
            // StateMachine.g:62:8: TRANS identifier LBRACE identifier ARROW identifier ON label RBRACE
            {
            match(input,TRANS,FOLLOW_TRANS_in_trans204); if (state.failed) return ;

            pushFollow(FOLLOW_identifier_in_trans206);
            identifier();

            state._fsp--;
            if (state.failed) return ;

            match(input,LBRACE,FOLLOW_LBRACE_in_trans208); if (state.failed) return ;

            pushFollow(FOLLOW_identifier_in_trans218);
            identifier();

            state._fsp--;
            if (state.failed) return ;

            match(input,ARROW,FOLLOW_ARROW_in_trans220); if (state.failed) return ;

            pushFollow(FOLLOW_identifier_in_trans222);
            identifier();

            state._fsp--;
            if (state.failed) return ;

            match(input,ON,FOLLOW_ON_in_trans224); if (state.failed) return ;

            pushFollow(FOLLOW_label_in_trans226);
            label();

            state._fsp--;
            if (state.failed) return ;

            match(input,RBRACE,FOLLOW_RBRACE_in_trans232); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, trans_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "trans"



    // $ANTLR start "invariantExpression"
    // StateMachine.g:67:1: invariantExpression : INVARIANT ( identifier )? LBRACE ( expression SEMI )+ RBRACE ;
    public final void invariantExpression() throws RecognitionException {
        int invariantExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }

            // StateMachine.g:67:20: ( INVARIANT ( identifier )? LBRACE ( expression SEMI )+ RBRACE )
            // StateMachine.g:68:5: INVARIANT ( identifier )? LBRACE ( expression SEMI )+ RBRACE
            {
            match(input,INVARIANT,FOLLOW_INVARIANT_in_invariantExpression244); if (state.failed) return ;

            // StateMachine.g:69:9: ( identifier )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // StateMachine.g:69:10: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_invariantExpression256);
                    identifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,LBRACE,FOLLOW_LBRACE_in_invariantExpression266); if (state.failed) return ;

            // StateMachine.g:71:9: ( expression SEMI )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==BOOLLITERAL||LA9_0==CHARLITERAL||LA9_0==IDENT||LA9_0==INTLITERAL||LA9_0==LPAREN||LA9_0==MINUS||LA9_0==PLUS||LA9_0==REALLITERAL||LA9_0==STRINGLITERAL||LA9_0==59||(LA9_0 >= 62 && LA9_0 <= 63)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // StateMachine.g:71:10: expression SEMI
            	    {
            	    pushFollow(FOLLOW_expression_in_invariantExpression278);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    match(input,SEMI,FOLLOW_SEMI_in_invariantExpression280); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_invariantExpression289); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, invariantExpression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "invariantExpression"



    // $ANTLR start "label"
    // StateMachine.g:75:1: label : STRINGLITERAL ;
    public final void label() throws RecognitionException {
        int label_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }

            // StateMachine.g:75:6: ( STRINGLITERAL )
            // StateMachine.g:76:5: STRINGLITERAL
            {
            match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_label301); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, label_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "label"



    // $ANTLR start "identifier"
    // StateMachine.g:79:1: identifier returns [String name] : str= IDENT ;
    public final String identifier() throws RecognitionException {
        String name = null;

        int identifier_StartIndex = input.index();

        Token str=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return name; }

            // StateMachine.g:79:33: (str= IDENT )
            // StateMachine.g:80:5: str= IDENT
            {
            str=(Token)match(input,IDENT,FOLLOW_IDENT_in_identifier319); if (state.failed) return name;

            if ( state.backtracking==0 ) {name =str.getText();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, identifier_StartIndex); }

        }
        return name;
    }
    // $ANTLR end "identifier"



    // $ANTLR start "stateModifier"
    // StateMachine.g:83:1: stateModifier : ( START | FINAL );
    public final void stateModifier() throws RecognitionException {
        int stateModifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }

            // StateMachine.g:83:14: ( START | FINAL )
            // StateMachine.g:
            {
            if ( input.LA(1)==FINAL||input.LA(1)==START ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, stateModifier_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "stateModifier"



    // $ANTLR start "literal"
    // StateMachine.g:88:1: literal : ( INTLITERAL | REALLITERAL | BOOLLITERAL | STRINGLITERAL | CHARLITERAL );
    public final void literal() throws RecognitionException {
        int literal_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }

            // StateMachine.g:88:8: ( INTLITERAL | REALLITERAL | BOOLLITERAL | STRINGLITERAL | CHARLITERAL )
            // StateMachine.g:
            {
            if ( input.LA(1)==BOOLLITERAL||input.LA(1)==CHARLITERAL||input.LA(1)==INTLITERAL||input.LA(1)==REALLITERAL||input.LA(1)==STRINGLITERAL ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, literal_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "literal"



    // $ANTLR start "globalVariableDecl"
    // StateMachine.g:96:1: globalVariableDecl returns [ASTVariable v] : t= type n= variableDeclarator SEMI ;
    public final ASTVariable globalVariableDecl() throws RecognitionException {
        ASTVariable v = null;

        int globalVariableDecl_StartIndex = input.index();

        Type t =null;

        ASTVariable n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return v; }

            // StateMachine.g:96:43: (t= type n= variableDeclarator SEMI )
            // StateMachine.g:97:5: t= type n= variableDeclarator SEMI
            {
            pushFollow(FOLLOW_type_in_globalVariableDecl409);
            t=type();

            state._fsp--;
            if (state.failed) return v;

            pushFollow(FOLLOW_variableDeclarator_in_globalVariableDecl413);
            n=variableDeclarator();

            state._fsp--;
            if (state.failed) return v;

            if ( state.backtracking==0 ) {n.type=t;n.createVariable();v =n;}

            match(input,SEMI,FOLLOW_SEMI_in_globalVariableDecl421); if (state.failed) return v;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, globalVariableDecl_StartIndex); }

        }
        return v;
    }
    // $ANTLR end "globalVariableDecl"



    // $ANTLR start "localVariableDecl"
    // StateMachine.g:101:1: localVariableDecl : type variableDeclarator SEMI ;
    public final void localVariableDecl() throws RecognitionException {
        int localVariableDecl_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }

            // StateMachine.g:101:19: ( type variableDeclarator SEMI )
            // StateMachine.g:102:5: type variableDeclarator SEMI
            {
            pushFollow(FOLLOW_type_in_localVariableDecl434);
            type();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_variableDeclarator_in_localVariableDecl436);
            variableDeclarator();

            state._fsp--;
            if (state.failed) return ;

            match(input,SEMI,FOLLOW_SEMI_in_localVariableDecl442); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, localVariableDecl_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "localVariableDecl"



    // $ANTLR start "modifier"
    // StateMachine.g:106:1: modifier : ( 'global' | 'native' );
    public final void modifier() throws RecognitionException {
        int modifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }

            // StateMachine.g:106:10: ( 'global' | 'native' )
            // StateMachine.g:
            {
            if ( (input.LA(1) >= 64 && input.LA(1) <= 65) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, modifier_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "modifier"



    // $ANTLR start "type"
    // StateMachine.g:111:1: type returns [Type t] : (p= primitiveType |e= enumType );
    public final Type type() throws RecognitionException {
        Type t = null;

        int type_StartIndex = input.index();

        Type p =null;

        EnumType e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return t; }

            // StateMachine.g:111:23: (p= primitiveType |e= enumType )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==BOOL||LA10_0==INT||LA10_0==REAL||LA10_0==STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==ENUM) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // StateMachine.g:112:9: p= primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type492);
                    p=primitiveType();

                    state._fsp--;
                    if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =p;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:113:9: e= enumType
                    {
                    pushFollow(FOLLOW_enumType_in_type506);
                    e=enumType();

                    state._fsp--;
                    if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =e;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, type_StartIndex); }

        }
        return t;
    }
    // $ANTLR end "type"



    // $ANTLR start "primitiveType"
    // StateMachine.g:116:1: primitiveType returns [Type t] : ( INT | BOOL | REAL | STRING );
    public final Type primitiveType() throws RecognitionException {
        Type t = null;

        int primitiveType_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return t; }

            // StateMachine.g:116:31: ( INT | BOOL | REAL | STRING )
            int alt11=4;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt11=1;
                }
                break;
            case BOOL:
                {
                alt11=2;
                }
                break;
            case REAL:
                {
                alt11=3;
                }
                break;
            case STRING:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // StateMachine.g:117:7: INT
                    {
                    match(input,INT,FOLLOW_INT_in_primitiveType525); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t = new IntType();}

                    }
                    break;
                case 2 :
                    // StateMachine.g:118:7: BOOL
                    {
                    match(input,BOOL,FOLLOW_BOOL_in_primitiveType535); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =new BoolType();}

                    }
                    break;
                case 3 :
                    // StateMachine.g:119:7: REAL
                    {
                    match(input,REAL,FOLLOW_REAL_in_primitiveType545); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =new RealType();}

                    }
                    break;
                case 4 :
                    // StateMachine.g:120:7: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_primitiveType556); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =new StringType();}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, primitiveType_StartIndex); }

        }
        return t;
    }
    // $ANTLR end "primitiveType"



    // $ANTLR start "enumType"
    // StateMachine.g:123:1: enumType returns [EnumType t] : ENUM LBRACE name= identifier ( COMMA l= identifier )* RBRACE ;
    public final EnumType enumType() throws RecognitionException {
        EnumType t = null;

        int enumType_StartIndex = input.index();

        String name =null;

        String l =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return t; }

            // StateMachine.g:123:31: ( ENUM LBRACE name= identifier ( COMMA l= identifier )* RBRACE )
            // StateMachine.g:124:5: ENUM LBRACE name= identifier ( COMMA l= identifier )* RBRACE
            {
            match(input,ENUM,FOLLOW_ENUM_in_enumType575); if (state.failed) return t;

            if ( state.backtracking==0 ) {t =new EnumType();}

            match(input,LBRACE,FOLLOW_LBRACE_in_enumType579); if (state.failed) return t;

            pushFollow(FOLLOW_identifier_in_enumType583);
            name=identifier();

            state._fsp--;
            if (state.failed) return t;

            if ( state.backtracking==0 ) {t.add(name);}

            // StateMachine.g:124:70: ( COMMA l= identifier )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // StateMachine.g:124:71: COMMA l= identifier
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_enumType588); if (state.failed) return t;

            	    pushFollow(FOLLOW_identifier_in_enumType592);
            	    l=identifier();

            	    state._fsp--;
            	    if (state.failed) return t;

            	    if ( state.backtracking==0 ) {t.add(l);}

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_enumType598); if (state.failed) return t;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, enumType_StartIndex); }

        }
        return t;
    }
    // $ANTLR end "enumType"



    // $ANTLR start "variableDeclarator"
    // StateMachine.g:127:1: variableDeclarator returns [ASTVariable var] :n= identifier ( '=' variableInitializer )? ( WHERE expression )? ;
    public final ASTVariable variableDeclarator() throws RecognitionException {
        ASTVariable var = null;

        int variableDeclarator_StartIndex = input.index();

        String n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return var; }

            // StateMachine.g:127:45: (n= identifier ( '=' variableInitializer )? ( WHERE expression )? )
            // StateMachine.g:128:5: n= identifier ( '=' variableInitializer )? ( WHERE expression )?
            {
            if ( state.backtracking==0 ) {var =new ASTVariable();}

            pushFollow(FOLLOW_identifier_in_variableDeclarator622);
            n=identifier();

            state._fsp--;
            if (state.failed) return var;

            if ( state.backtracking==0 ) {var.name=n;}

            // StateMachine.g:130:5: ( '=' variableInitializer )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EQUAL) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // StateMachine.g:130:6: '=' variableInitializer
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_variableDeclarator631); if (state.failed) return var;

                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator633);
                    variableInitializer();

                    state._fsp--;
                    if (state.failed) return var;

                    }
                    break;

            }


            // StateMachine.g:131:5: ( WHERE expression )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==WHERE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // StateMachine.g:131:6: WHERE expression
                    {
                    match(input,WHERE,FOLLOW_WHERE_in_variableDeclarator643); if (state.failed) return var;

                    pushFollow(FOLLOW_expression_in_variableDeclarator645);
                    expression();

                    state._fsp--;
                    if (state.failed) return var;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, variableDeclarator_StartIndex); }

        }
        return var;
    }
    // $ANTLR end "variableDeclarator"



    // $ANTLR start "expression"
    // StateMachine.g:134:1: expression : conditionalOrExpression ( assignmentOperator expression )? ;
    public final void expression() throws RecognitionException {
        int expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }

            // StateMachine.g:134:11: ( conditionalOrExpression ( assignmentOperator expression )? )
            // StateMachine.g:135:9: conditionalOrExpression ( assignmentOperator expression )?
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_expression664);
            conditionalOrExpression();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:136:9: ( assignmentOperator expression )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EQUAL) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // StateMachine.g:136:10: assignmentOperator expression
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_expression675);
                    assignmentOperator();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_expression677);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "expression"



    // $ANTLR start "assignmentOperator"
    // StateMachine.g:140:1: assignmentOperator : '=' ;
    public final void assignmentOperator() throws RecognitionException {
        int assignmentOperator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }

            // StateMachine.g:141:5: ( '=' )
            // StateMachine.g:141:9: '='
            {
            match(input,EQUAL,FOLLOW_EQUAL_in_assignmentOperator709); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, assignmentOperator_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "assignmentOperator"



    // $ANTLR start "conditionalOrExpression"
    // StateMachine.g:144:1: conditionalOrExpression : conditionalAndExpression ( '||' conditionalAndExpression )* ;
    public final void conditionalOrExpression() throws RecognitionException {
        int conditionalOrExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }

            // StateMachine.g:145:5: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
            // StateMachine.g:145:9: conditionalAndExpression ( '||' conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression725);
            conditionalAndExpression();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:146:9: ( '||' conditionalAndExpression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==66) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // StateMachine.g:146:10: '||' conditionalAndExpression
            	    {
            	    match(input,66,FOLLOW_66_in_conditionalOrExpression736); if (state.failed) return ;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression738);
            	    conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, conditionalOrExpression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "conditionalOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // StateMachine.g:150:1: conditionalAndExpression : relationalExpression ( '&&' relationalExpression )* ;
    public final void conditionalAndExpression() throws RecognitionException {
        int conditionalAndExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }

            // StateMachine.g:151:5: ( relationalExpression ( '&&' relationalExpression )* )
            // StateMachine.g:152:5: relationalExpression ( '&&' relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_conditionalAndExpression770);
            relationalExpression();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:153:6: ( '&&' relationalExpression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==61) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // StateMachine.g:153:7: '&&' relationalExpression
            	    {
            	    match(input,61,FOLLOW_61_in_conditionalAndExpression779); if (state.failed) return ;

            	    pushFollow(FOLLOW_relationalExpression_in_conditionalAndExpression781);
            	    relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, conditionalAndExpression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "relationalExpression"
    // StateMachine.g:157:1: relationalExpression : additiveExpression ( relationalOp additiveExpression )* ;
    public final void relationalExpression() throws RecognitionException {
        int relationalExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }

            // StateMachine.g:158:5: ( additiveExpression ( relationalOp additiveExpression )* )
            // StateMachine.g:158:7: additiveExpression ( relationalOp additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression810);
            additiveExpression();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:159:9: ( relationalOp additiveExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= GREATER && LA18_0 <= GREATER_EQUAL)||(LA18_0 >= LESS && LA18_0 <= LESS_EQUAL)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // StateMachine.g:159:10: relationalOp additiveExpression
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression821);
            	    relationalOp();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression823);
            	    additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, relationalExpression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "relationalExpression"



    // $ANTLR start "relationalOp"
    // StateMachine.g:163:1: relationalOp : ( '<=' | '>=' | '<' | '>' );
    public final void relationalOp() throws RecognitionException {
        int relationalOp_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }

            // StateMachine.g:164:5: ( '<=' | '>=' | '<' | '>' )
            // StateMachine.g:
            {
            if ( (input.LA(1) >= GREATER && input.LA(1) <= GREATER_EQUAL)||(input.LA(1) >= LESS && input.LA(1) <= LESS_EQUAL) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, relationalOp_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "relationalOp"



    // $ANTLR start "additiveExpression"
    // StateMachine.g:170:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final void additiveExpression() throws RecognitionException {
        int additiveExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }

            // StateMachine.g:171:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // StateMachine.g:171:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression903);
            multiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:172:9: ( ( '+' | '-' ) multiplicativeExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==MINUS||LA19_0==PLUS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // StateMachine.g:173:13: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression980);
            	    multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, additiveExpression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // StateMachine.g:180:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
    public final void multiplicativeExpression() throws RecognitionException {
        int multiplicativeExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }

            // StateMachine.g:181:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            // StateMachine.g:182:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1018);
            unaryExpression();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:183:9: ( ( '*' | '/' | '%' ) unaryExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==SLASH||LA20_0==STAR||LA20_0==60) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // StateMachine.g:184:13: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==60 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1113);
            	    unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, multiplicativeExpression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // StateMachine.g:192:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus );
    public final void unaryExpression() throws RecognitionException {
        int unaryExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }

            // StateMachine.g:193:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus )
            int alt21=5;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt21=1;
                }
                break;
            case MINUS:
                {
                alt21=2;
                }
                break;
            case 62:
                {
                alt21=3;
                }
                break;
            case 63:
                {
                alt21=4;
                }
                break;
            case BOOLLITERAL:
            case CHARLITERAL:
            case IDENT:
            case INTLITERAL:
            case LPAREN:
            case REALLITERAL:
            case STRINGLITERAL:
            case 59:
                {
                alt21=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // StateMachine.g:193:9: '+' unaryExpression
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_unaryExpression1144); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1147);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // StateMachine.g:194:9: '-' unaryExpression
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_unaryExpression1157); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1159);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // StateMachine.g:195:9: '++' unaryExpression
                    {
                    match(input,62,FOLLOW_62_in_unaryExpression1169); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1171);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // StateMachine.g:196:9: '--' unaryExpression
                    {
                    match(input,63,FOLLOW_63_in_unaryExpression1181); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1183);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // StateMachine.g:197:9: unaryExpressionNotPlusMinus
                    {
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1193);
                    unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, unaryExpression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "unaryExpression"



    // $ANTLR start "unaryExpressionNotPlusMinus"
    // StateMachine.g:200:1: unaryExpressionNotPlusMinus : ( '!' unaryExpression | primary );
    public final void unaryExpressionNotPlusMinus() throws RecognitionException {
        int unaryExpressionNotPlusMinus_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }

            // StateMachine.g:201:5: ( '!' unaryExpression | primary )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==59) ) {
                alt22=1;
            }
            else if ( (LA22_0==BOOLLITERAL||LA22_0==CHARLITERAL||LA22_0==IDENT||LA22_0==INTLITERAL||LA22_0==LPAREN||LA22_0==REALLITERAL||LA22_0==STRINGLITERAL) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // StateMachine.g:201:9: '!' unaryExpression
                    {
                    match(input,59,FOLLOW_59_in_unaryExpressionNotPlusMinus1213); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1215);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // StateMachine.g:202:9: primary
                    {
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus1225);
                    primary();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, unaryExpressionNotPlusMinus_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"



    // $ANTLR start "primary"
    // StateMachine.g:205:1: primary : ( parExpression | identifier | literal );
    public final void primary() throws RecognitionException {
        int primary_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }

            // StateMachine.g:206:5: ( parExpression | identifier | literal )
            int alt23=3;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt23=1;
                }
                break;
            case IDENT:
                {
                alt23=2;
                }
                break;
            case BOOLLITERAL:
            case CHARLITERAL:
            case INTLITERAL:
            case REALLITERAL:
            case STRINGLITERAL:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // StateMachine.g:206:9: parExpression
                    {
                    pushFollow(FOLLOW_parExpression_in_primary1245);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // StateMachine.g:207:9: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_primary1256);
                    identifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // StateMachine.g:208:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primary1266);
                    literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, primary_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "primary"



    // $ANTLR start "variableInitializer"
    // StateMachine.g:211:1: variableInitializer : expression ;
    public final void variableInitializer() throws RecognitionException {
        int variableInitializer_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }

            // StateMachine.g:211:20: ( expression )
            // StateMachine.g:212:9: expression
            {
            pushFollow(FOLLOW_expression_in_variableInitializer1287);
            expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, variableInitializer_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "variableInitializer"



    // $ANTLR start "parExpression"
    // StateMachine.g:215:1: parExpression : '(' expression ')' ;
    public final void parExpression() throws RecognitionException {
        int parExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }

            // StateMachine.g:216:5: ( '(' expression ')' )
            // StateMachine.g:216:9: '(' expression ')'
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_parExpression1307); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_parExpression1309);
            expression();

            state._fsp--;
            if (state.failed) return ;

            match(input,RPAREN,FOLLOW_RPAREN_in_parExpression1311); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, parExpression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "parExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_MACHINE_in_machine76 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_identifier_in_machine80 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LBRACE_in_machine84 = new BitSet(new long[]{0x0170280014120080L});
    public static final BitSet FOLLOW_globalVariableDecl_in_machine97 = new BitSet(new long[]{0x0170280014120080L});
    public static final BitSet FOLLOW_state_in_machine112 = new BitSet(new long[]{0x0130080010100000L});
    public static final BitSet FOLLOW_trans_in_machine117 = new BitSet(new long[]{0x0100080010000000L});
    public static final BitSet FOLLOW_invariantExpression_in_machine130 = new BitSet(new long[]{0x0000080010000000L});
    public static final BitSet FOLLOW_RBRACE_in_machine138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_machine140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stateModifier_in_state153 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_STATE_in_state158 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_identifier_in_state160 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LBRACE_in_state162 = new BitSet(new long[]{0xC8C06C280E020580L});
    public static final BitSet FOLLOW_localVariableDecl_in_state173 = new BitSet(new long[]{0xC8C06C280E020580L});
    public static final BitSet FOLLOW_expression_in_state186 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SEMI_in_state188 = new BitSet(new long[]{0xC8804C280A000500L});
    public static final BitSet FOLLOW_RBRACE_in_state196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANS_in_trans204 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_identifier_in_trans206 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LBRACE_in_trans208 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_identifier_in_trans218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARROW_in_trans220 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_identifier_in_trans222 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ON_in_trans224 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_label_in_trans226 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RBRACE_in_trans232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVARIANT_in_invariantExpression244 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_identifier_in_invariantExpression256 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LBRACE_in_invariantExpression266 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_expression_in_invariantExpression278 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SEMI_in_invariantExpression280 = new BitSet(new long[]{0xC8804C280A000500L});
    public static final BitSet FOLLOW_RBRACE_in_invariantExpression289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_label301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identifier319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_globalVariableDecl409 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_globalVariableDecl413 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SEMI_in_globalVariableDecl421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_localVariableDecl434 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDecl436 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SEMI_in_localVariableDecl442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumType_in_type506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primitiveType535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_primitiveType545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primitiveType556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumType575 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LBRACE_in_enumType579 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_identifier_in_enumType583 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_COMMA_in_enumType588 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_identifier_in_enumType592 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_RBRACE_in_enumType598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclarator622 = new BitSet(new long[]{0x0200000000040002L});
    public static final BitSet FOLLOW_EQUAL_in_variableDeclarator631 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator633 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_WHERE_in_variableDeclarator643 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_expression_in_variableDeclarator645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_expression664 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression675 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_expression_in_expression677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_assignmentOperator709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression725 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_conditionalOrExpression736 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression738 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExpression_in_conditionalAndExpression770 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_conditionalAndExpression779 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_relationalExpression_in_conditionalAndExpression781 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression810 = new BitSet(new long[]{0x0000000600600002L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression821 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression823 = new BitSet(new long[]{0x0000000600600002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression903 = new BitSet(new long[]{0x0000042000000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression930 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression980 = new BitSet(new long[]{0x0000042000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1018 = new BitSet(new long[]{0x100A000000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1045 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1113 = new BitSet(new long[]{0x100A000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression1144 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression1157 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_unaryExpression1169 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_unaryExpression1181 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_unaryExpressionNotPlusMinus1213 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_primary1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression1307 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_expression_in_parExpression1309 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression1311 = new BitSet(new long[]{0x0000000000000002L});

}