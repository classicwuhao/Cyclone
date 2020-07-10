// $ANTLR 3.4 StateMachine.g 2020-07-10 18:37:38

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
    // StateMachine.g:46:1: machine : MACHINE identifier LBRACE ( globalVariableDecl )* ( state )* ( trans )* ( invariantExpression )* RBRACE EOF ;
    public final void machine() throws RecognitionException {
        int machine_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }

            // StateMachine.g:46:8: ( MACHINE identifier LBRACE ( globalVariableDecl )* ( state )* ( trans )* ( invariantExpression )* RBRACE EOF )
            // StateMachine.g:47:5: MACHINE identifier LBRACE ( globalVariableDecl )* ( state )* ( trans )* ( invariantExpression )* RBRACE EOF
            {
            match(input,MACHINE,FOLLOW_MACHINE_in_machine71); if (state.failed) return ;

            pushFollow(FOLLOW_identifier_in_machine73);
            identifier();

            state._fsp--;
            if (state.failed) return ;

            match(input,LBRACE,FOLLOW_LBRACE_in_machine75); if (state.failed) return ;

            // StateMachine.g:48:9: ( globalVariableDecl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BOOL||LA1_0==ENUM||LA1_0==INT||LA1_0==REAL||LA1_0==STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // StateMachine.g:48:10: globalVariableDecl
            	    {
            	    pushFollow(FOLLOW_globalVariableDecl_in_machine86);
            	    globalVariableDecl();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // StateMachine.g:49:9: ( state )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==FINAL||(LA2_0 >= START && LA2_0 <= STATE)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // StateMachine.g:49:10: state
            	    {
            	    pushFollow(FOLLOW_state_in_machine99);
            	    state();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // StateMachine.g:49:18: ( trans )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==TRANS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // StateMachine.g:49:19: trans
            	    {
            	    pushFollow(FOLLOW_trans_in_machine104);
            	    trans();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // StateMachine.g:50:9: ( invariantExpression )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==INVARIANT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // StateMachine.g:50:10: invariantExpression
            	    {
            	    pushFollow(FOLLOW_invariantExpression_in_machine117);
            	    invariantExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_machine125); if (state.failed) return ;

            match(input,EOF,FOLLOW_EOF_in_machine127); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "machine"



    // $ANTLR start "state"
    // StateMachine.g:54:1: state : ( stateModifier )? STATE identifier LBRACE ( localVariableDecl )* ( expression SEMI )* RBRACE ;
    public final void state() throws RecognitionException {
        int state_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }

            // StateMachine.g:54:6: ( ( stateModifier )? STATE identifier LBRACE ( localVariableDecl )* ( expression SEMI )* RBRACE )
            // StateMachine.g:55:5: ( stateModifier )? STATE identifier LBRACE ( localVariableDecl )* ( expression SEMI )* RBRACE
            {
            // StateMachine.g:55:5: ( stateModifier )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==FINAL||LA5_0==START) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // StateMachine.g:55:6: stateModifier
                    {
                    pushFollow(FOLLOW_stateModifier_in_state140);
                    stateModifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,STATE,FOLLOW_STATE_in_state145); if (state.failed) return ;

            pushFollow(FOLLOW_identifier_in_state147);
            identifier();

            state._fsp--;
            if (state.failed) return ;

            match(input,LBRACE,FOLLOW_LBRACE_in_state149); if (state.failed) return ;

            // StateMachine.g:56:9: ( localVariableDecl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==BOOL||LA6_0==ENUM||LA6_0==INT||LA6_0==REAL||LA6_0==STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // StateMachine.g:56:10: localVariableDecl
            	    {
            	    pushFollow(FOLLOW_localVariableDecl_in_state160);
            	    localVariableDecl();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // StateMachine.g:57:9: ( expression SEMI )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==BOOLLITERAL||LA7_0==CHARLITERAL||LA7_0==IDENT||LA7_0==INTLITERAL||LA7_0==LPAREN||LA7_0==MINUS||LA7_0==PLUS||LA7_0==REALLITERAL||LA7_0==STRINGLITERAL||LA7_0==59||(LA7_0 >= 62 && LA7_0 <= 63)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // StateMachine.g:57:10: expression SEMI
            	    {
            	    pushFollow(FOLLOW_expression_in_state173);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    match(input,SEMI,FOLLOW_SEMI_in_state175); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_state183); if (state.failed) return ;

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
    // StateMachine.g:61:1: trans : TRANS identifier LBRACE identifier ARROW identifier ON label RBRACE ;
    public final void trans() throws RecognitionException {
        int trans_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }

            // StateMachine.g:61:6: ( TRANS identifier LBRACE identifier ARROW identifier ON label RBRACE )
            // StateMachine.g:61:8: TRANS identifier LBRACE identifier ARROW identifier ON label RBRACE
            {
            match(input,TRANS,FOLLOW_TRANS_in_trans191); if (state.failed) return ;

            pushFollow(FOLLOW_identifier_in_trans193);
            identifier();

            state._fsp--;
            if (state.failed) return ;

            match(input,LBRACE,FOLLOW_LBRACE_in_trans195); if (state.failed) return ;

            pushFollow(FOLLOW_identifier_in_trans205);
            identifier();

            state._fsp--;
            if (state.failed) return ;

            match(input,ARROW,FOLLOW_ARROW_in_trans207); if (state.failed) return ;

            pushFollow(FOLLOW_identifier_in_trans209);
            identifier();

            state._fsp--;
            if (state.failed) return ;

            match(input,ON,FOLLOW_ON_in_trans211); if (state.failed) return ;

            pushFollow(FOLLOW_label_in_trans213);
            label();

            state._fsp--;
            if (state.failed) return ;

            match(input,RBRACE,FOLLOW_RBRACE_in_trans219); if (state.failed) return ;

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
    // StateMachine.g:66:1: invariantExpression : INVARIANT ( identifier )? LBRACE ( expression SEMI )+ RBRACE ;
    public final void invariantExpression() throws RecognitionException {
        int invariantExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }

            // StateMachine.g:66:20: ( INVARIANT ( identifier )? LBRACE ( expression SEMI )+ RBRACE )
            // StateMachine.g:67:5: INVARIANT ( identifier )? LBRACE ( expression SEMI )+ RBRACE
            {
            match(input,INVARIANT,FOLLOW_INVARIANT_in_invariantExpression231); if (state.failed) return ;

            // StateMachine.g:68:9: ( identifier )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // StateMachine.g:68:10: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_invariantExpression243);
                    identifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,LBRACE,FOLLOW_LBRACE_in_invariantExpression253); if (state.failed) return ;

            // StateMachine.g:70:9: ( expression SEMI )+
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
            	    // StateMachine.g:70:10: expression SEMI
            	    {
            	    pushFollow(FOLLOW_expression_in_invariantExpression265);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    match(input,SEMI,FOLLOW_SEMI_in_invariantExpression267); if (state.failed) return ;

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


            match(input,RBRACE,FOLLOW_RBRACE_in_invariantExpression276); if (state.failed) return ;

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
    // StateMachine.g:74:1: label : STRINGLITERAL ;
    public final void label() throws RecognitionException {
        int label_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }

            // StateMachine.g:74:6: ( STRINGLITERAL )
            // StateMachine.g:75:5: STRINGLITERAL
            {
            match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_label288); if (state.failed) return ;

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
    // StateMachine.g:78:1: identifier returns [String name] : str= IDENT ;
    public final String identifier() throws RecognitionException {
        String name = null;

        int identifier_StartIndex = input.index();

        Token str=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return name; }

            // StateMachine.g:78:33: (str= IDENT )
            // StateMachine.g:79:5: str= IDENT
            {
            str=(Token)match(input,IDENT,FOLLOW_IDENT_in_identifier306); if (state.failed) return name;

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
    // StateMachine.g:82:1: stateModifier : ( START | FINAL );
    public final void stateModifier() throws RecognitionException {
        int stateModifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }

            // StateMachine.g:82:14: ( START | FINAL )
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
    // StateMachine.g:87:1: literal : ( INTLITERAL | REALLITERAL | BOOLLITERAL | STRINGLITERAL | CHARLITERAL );
    public final void literal() throws RecognitionException {
        int literal_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }

            // StateMachine.g:87:8: ( INTLITERAL | REALLITERAL | BOOLLITERAL | STRINGLITERAL | CHARLITERAL )
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
    // StateMachine.g:95:1: globalVariableDecl returns [ASTVariable v] : t= type n= variableDeclarator SEMI ;
    public final ASTVariable globalVariableDecl() throws RecognitionException {
        ASTVariable v = null;

        int globalVariableDecl_StartIndex = input.index();

        Type t =null;

        ASTVariable n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return v; }

            // StateMachine.g:95:43: (t= type n= variableDeclarator SEMI )
            // StateMachine.g:96:5: t= type n= variableDeclarator SEMI
            {
            pushFollow(FOLLOW_type_in_globalVariableDecl396);
            t=type();

            state._fsp--;
            if (state.failed) return v;

            pushFollow(FOLLOW_variableDeclarator_in_globalVariableDecl400);
            n=variableDeclarator();

            state._fsp--;
            if (state.failed) return v;

            if ( state.backtracking==0 ) {n.createVariable();v =n;}

            match(input,SEMI,FOLLOW_SEMI_in_globalVariableDecl408); if (state.failed) return v;

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
    // StateMachine.g:100:1: localVariableDecl : type variableDeclarator SEMI ;
    public final void localVariableDecl() throws RecognitionException {
        int localVariableDecl_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }

            // StateMachine.g:100:19: ( type variableDeclarator SEMI )
            // StateMachine.g:101:5: type variableDeclarator SEMI
            {
            pushFollow(FOLLOW_type_in_localVariableDecl421);
            type();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_variableDeclarator_in_localVariableDecl423);
            variableDeclarator();

            state._fsp--;
            if (state.failed) return ;

            match(input,SEMI,FOLLOW_SEMI_in_localVariableDecl429); if (state.failed) return ;

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
    // StateMachine.g:105:1: modifier : ( 'global' | 'native' );
    public final void modifier() throws RecognitionException {
        int modifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }

            // StateMachine.g:105:10: ( 'global' | 'native' )
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
    // StateMachine.g:110:1: type returns [Type t] : (p= primitiveType | enumType );
    public final Type type() throws RecognitionException {
        Type t = null;

        int type_StartIndex = input.index();

        Type p =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return t; }

            // StateMachine.g:110:23: (p= primitiveType | enumType )
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
                    // StateMachine.g:111:9: p= primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type479);
                    p=primitiveType();

                    state._fsp--;
                    if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =p;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:112:9: enumType
                    {
                    pushFollow(FOLLOW_enumType_in_type491);
                    enumType();

                    state._fsp--;
                    if (state.failed) return t;

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
    // StateMachine.g:115:1: primitiveType returns [Type t] : ( INT | BOOL | REAL | STRING );
    public final Type primitiveType() throws RecognitionException {
        Type t = null;

        int primitiveType_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return t; }

            // StateMachine.g:115:31: ( INT | BOOL | REAL | STRING )
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
                    // StateMachine.g:116:7: INT
                    {
                    match(input,INT,FOLLOW_INT_in_primitiveType509); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t = new IntType();}

                    }
                    break;
                case 2 :
                    // StateMachine.g:117:7: BOOL
                    {
                    match(input,BOOL,FOLLOW_BOOL_in_primitiveType519); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =new BoolType();}

                    }
                    break;
                case 3 :
                    // StateMachine.g:118:7: REAL
                    {
                    match(input,REAL,FOLLOW_REAL_in_primitiveType529); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =new RealType();}

                    }
                    break;
                case 4 :
                    // StateMachine.g:119:7: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_primitiveType540); if (state.failed) return t;

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
    // StateMachine.g:122:1: enumType : ENUM LBRACE identifier ( COMMA identifier )* RBRACE ;
    public final void enumType() throws RecognitionException {
        int enumType_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }

            // StateMachine.g:122:10: ( ENUM LBRACE identifier ( COMMA identifier )* RBRACE )
            // StateMachine.g:123:5: ENUM LBRACE identifier ( COMMA identifier )* RBRACE
            {
            match(input,ENUM,FOLLOW_ENUM_in_enumType554); if (state.failed) return ;

            match(input,LBRACE,FOLLOW_LBRACE_in_enumType556); if (state.failed) return ;

            pushFollow(FOLLOW_identifier_in_enumType558);
            identifier();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:123:28: ( COMMA identifier )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // StateMachine.g:123:29: COMMA identifier
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_enumType561); if (state.failed) return ;

            	    pushFollow(FOLLOW_identifier_in_enumType563);
            	    identifier();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_enumType567); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "enumType"



    // $ANTLR start "variableDeclarator"
    // StateMachine.g:126:1: variableDeclarator returns [ASTVariable var] :n= identifier ( '=' variableInitializer )? ( WHERE expression )? ;
    public final ASTVariable variableDeclarator() throws RecognitionException {
        ASTVariable var = null;

        int variableDeclarator_StartIndex = input.index();

        String n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return var; }

            // StateMachine.g:126:45: (n= identifier ( '=' variableInitializer )? ( WHERE expression )? )
            // StateMachine.g:127:5: n= identifier ( '=' variableInitializer )? ( WHERE expression )?
            {
            if ( state.backtracking==0 ) {var =new ASTVariable();}

            pushFollow(FOLLOW_identifier_in_variableDeclarator591);
            n=identifier();

            state._fsp--;
            if (state.failed) return var;

            if ( state.backtracking==0 ) {var.name=n;}

            // StateMachine.g:129:5: ( '=' variableInitializer )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EQUAL) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // StateMachine.g:129:6: '=' variableInitializer
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_variableDeclarator600); if (state.failed) return var;

                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator602);
                    variableInitializer();

                    state._fsp--;
                    if (state.failed) return var;

                    }
                    break;

            }


            // StateMachine.g:130:5: ( WHERE expression )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==WHERE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // StateMachine.g:130:6: WHERE expression
                    {
                    match(input,WHERE,FOLLOW_WHERE_in_variableDeclarator612); if (state.failed) return var;

                    pushFollow(FOLLOW_expression_in_variableDeclarator614);
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
    // StateMachine.g:133:1: expression : conditionalOrExpression ( assignmentOperator expression )? ;
    public final void expression() throws RecognitionException {
        int expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }

            // StateMachine.g:133:11: ( conditionalOrExpression ( assignmentOperator expression )? )
            // StateMachine.g:134:9: conditionalOrExpression ( assignmentOperator expression )?
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_expression633);
            conditionalOrExpression();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:135:9: ( assignmentOperator expression )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EQUAL) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // StateMachine.g:135:10: assignmentOperator expression
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_expression644);
                    assignmentOperator();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_expression646);
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
    // StateMachine.g:139:1: assignmentOperator : '=' ;
    public final void assignmentOperator() throws RecognitionException {
        int assignmentOperator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }

            // StateMachine.g:140:5: ( '=' )
            // StateMachine.g:140:9: '='
            {
            match(input,EQUAL,FOLLOW_EQUAL_in_assignmentOperator678); if (state.failed) return ;

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
    // StateMachine.g:143:1: conditionalOrExpression : conditionalAndExpression ( '||' conditionalAndExpression )* ;
    public final void conditionalOrExpression() throws RecognitionException {
        int conditionalOrExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }

            // StateMachine.g:144:5: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
            // StateMachine.g:144:9: conditionalAndExpression ( '||' conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression694);
            conditionalAndExpression();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:145:9: ( '||' conditionalAndExpression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==66) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // StateMachine.g:145:10: '||' conditionalAndExpression
            	    {
            	    match(input,66,FOLLOW_66_in_conditionalOrExpression705); if (state.failed) return ;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression707);
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
    // StateMachine.g:149:1: conditionalAndExpression : relationalExpression ( '&&' relationalExpression )* ;
    public final void conditionalAndExpression() throws RecognitionException {
        int conditionalAndExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }

            // StateMachine.g:150:5: ( relationalExpression ( '&&' relationalExpression )* )
            // StateMachine.g:151:5: relationalExpression ( '&&' relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_conditionalAndExpression739);
            relationalExpression();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:152:6: ( '&&' relationalExpression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==61) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // StateMachine.g:152:7: '&&' relationalExpression
            	    {
            	    match(input,61,FOLLOW_61_in_conditionalAndExpression748); if (state.failed) return ;

            	    pushFollow(FOLLOW_relationalExpression_in_conditionalAndExpression750);
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
    // StateMachine.g:156:1: relationalExpression : additiveExpression ( relationalOp additiveExpression )* ;
    public final void relationalExpression() throws RecognitionException {
        int relationalExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }

            // StateMachine.g:157:5: ( additiveExpression ( relationalOp additiveExpression )* )
            // StateMachine.g:157:7: additiveExpression ( relationalOp additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression779);
            additiveExpression();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:158:9: ( relationalOp additiveExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= GREATER && LA18_0 <= GREATER_EQUAL)||(LA18_0 >= LESS && LA18_0 <= LESS_EQUAL)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // StateMachine.g:158:10: relationalOp additiveExpression
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression790);
            	    relationalOp();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression792);
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
    // StateMachine.g:162:1: relationalOp : ( '<=' | '>=' | '<' | '>' );
    public final void relationalOp() throws RecognitionException {
        int relationalOp_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }

            // StateMachine.g:163:5: ( '<=' | '>=' | '<' | '>' )
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
    // StateMachine.g:169:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final void additiveExpression() throws RecognitionException {
        int additiveExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }

            // StateMachine.g:170:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // StateMachine.g:170:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression872);
            multiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:171:9: ( ( '+' | '-' ) multiplicativeExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==MINUS||LA19_0==PLUS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // StateMachine.g:172:13: ( '+' | '-' ) multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression949);
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
    // StateMachine.g:179:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
    public final void multiplicativeExpression() throws RecognitionException {
        int multiplicativeExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }

            // StateMachine.g:180:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            // StateMachine.g:181:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression987);
            unaryExpression();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:182:9: ( ( '*' | '/' | '%' ) unaryExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==SLASH||LA20_0==STAR||LA20_0==60) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // StateMachine.g:183:13: ( '*' | '/' | '%' ) unaryExpression
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


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1082);
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
    // StateMachine.g:191:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus );
    public final void unaryExpression() throws RecognitionException {
        int unaryExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }

            // StateMachine.g:192:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus )
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
                    // StateMachine.g:192:9: '+' unaryExpression
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_unaryExpression1113); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1116);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // StateMachine.g:193:9: '-' unaryExpression
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_unaryExpression1126); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1128);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // StateMachine.g:194:9: '++' unaryExpression
                    {
                    match(input,62,FOLLOW_62_in_unaryExpression1138); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1140);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // StateMachine.g:195:9: '--' unaryExpression
                    {
                    match(input,63,FOLLOW_63_in_unaryExpression1150); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1152);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // StateMachine.g:196:9: unaryExpressionNotPlusMinus
                    {
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1162);
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
    // StateMachine.g:199:1: unaryExpressionNotPlusMinus : ( '!' unaryExpression | primary );
    public final void unaryExpressionNotPlusMinus() throws RecognitionException {
        int unaryExpressionNotPlusMinus_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }

            // StateMachine.g:200:5: ( '!' unaryExpression | primary )
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
                    // StateMachine.g:200:9: '!' unaryExpression
                    {
                    match(input,59,FOLLOW_59_in_unaryExpressionNotPlusMinus1182); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1184);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // StateMachine.g:201:9: primary
                    {
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus1194);
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
    // StateMachine.g:204:1: primary : ( parExpression | identifier | literal );
    public final void primary() throws RecognitionException {
        int primary_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }

            // StateMachine.g:205:5: ( parExpression | identifier | literal )
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
                    // StateMachine.g:205:9: parExpression
                    {
                    pushFollow(FOLLOW_parExpression_in_primary1214);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // StateMachine.g:206:9: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_primary1225);
                    identifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // StateMachine.g:207:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primary1235);
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
    // StateMachine.g:210:1: variableInitializer : expression ;
    public final void variableInitializer() throws RecognitionException {
        int variableInitializer_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }

            // StateMachine.g:210:20: ( expression )
            // StateMachine.g:211:9: expression
            {
            pushFollow(FOLLOW_expression_in_variableInitializer1256);
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
    // StateMachine.g:214:1: parExpression : '(' expression ')' ;
    public final void parExpression() throws RecognitionException {
        int parExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }

            // StateMachine.g:215:5: ( '(' expression ')' )
            // StateMachine.g:215:9: '(' expression ')'
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_parExpression1276); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_parExpression1278);
            expression();

            state._fsp--;
            if (state.failed) return ;

            match(input,RPAREN,FOLLOW_RPAREN_in_parExpression1280); if (state.failed) return ;

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


 

    public static final BitSet FOLLOW_MACHINE_in_machine71 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_identifier_in_machine73 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LBRACE_in_machine75 = new BitSet(new long[]{0x0170280014120080L});
    public static final BitSet FOLLOW_globalVariableDecl_in_machine86 = new BitSet(new long[]{0x0170280014120080L});
    public static final BitSet FOLLOW_state_in_machine99 = new BitSet(new long[]{0x0130080010100000L});
    public static final BitSet FOLLOW_trans_in_machine104 = new BitSet(new long[]{0x0100080010000000L});
    public static final BitSet FOLLOW_invariantExpression_in_machine117 = new BitSet(new long[]{0x0000080010000000L});
    public static final BitSet FOLLOW_RBRACE_in_machine125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_machine127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stateModifier_in_state140 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_STATE_in_state145 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_identifier_in_state147 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LBRACE_in_state149 = new BitSet(new long[]{0xC8C06C280E020580L});
    public static final BitSet FOLLOW_localVariableDecl_in_state160 = new BitSet(new long[]{0xC8C06C280E020580L});
    public static final BitSet FOLLOW_expression_in_state173 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SEMI_in_state175 = new BitSet(new long[]{0xC8804C280A000500L});
    public static final BitSet FOLLOW_RBRACE_in_state183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANS_in_trans191 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_identifier_in_trans193 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LBRACE_in_trans195 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_identifier_in_trans205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARROW_in_trans207 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_identifier_in_trans209 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ON_in_trans211 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_label_in_trans213 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RBRACE_in_trans219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVARIANT_in_invariantExpression231 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_identifier_in_invariantExpression243 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LBRACE_in_invariantExpression253 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_expression_in_invariantExpression265 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SEMI_in_invariantExpression267 = new BitSet(new long[]{0xC8804C280A000500L});
    public static final BitSet FOLLOW_RBRACE_in_invariantExpression276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_label288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identifier306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_globalVariableDecl396 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_globalVariableDecl400 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SEMI_in_globalVariableDecl408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_localVariableDecl421 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDecl423 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SEMI_in_localVariableDecl429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumType_in_type491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primitiveType519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_primitiveType529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primitiveType540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumType554 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LBRACE_in_enumType556 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_identifier_in_enumType558 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_COMMA_in_enumType561 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_identifier_in_enumType563 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_RBRACE_in_enumType567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclarator591 = new BitSet(new long[]{0x0200000000040002L});
    public static final BitSet FOLLOW_EQUAL_in_variableDeclarator600 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator602 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_WHERE_in_variableDeclarator612 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_expression_in_variableDeclarator614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_expression633 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression644 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_expression_in_expression646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_assignmentOperator678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression694 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_conditionalOrExpression705 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression707 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExpression_in_conditionalAndExpression739 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_conditionalAndExpression748 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_relationalExpression_in_conditionalAndExpression750 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression779 = new BitSet(new long[]{0x0000000600600002L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression790 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression792 = new BitSet(new long[]{0x0000000600600002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression872 = new BitSet(new long[]{0x0000042000000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression899 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression949 = new BitSet(new long[]{0x0000042000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression987 = new BitSet(new long[]{0x100A000000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1014 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1082 = new BitSet(new long[]{0x100A000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression1113 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression1126 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_unaryExpression1138 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_unaryExpression1150 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_unaryExpressionNotPlusMinus1182 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_primary1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression1276 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_expression_in_parExpression1278 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression1280 = new BitSet(new long[]{0x0000000000000002L});

}