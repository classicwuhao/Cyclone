// $ANTLR 3.4 StateMachine.g 2020-07-10 07:09:07

package org.nuim.cyclone.parser;
import java.util.Collections;
import java.util.Arrays;


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
    // StateMachine.g:43:1: machine : MACHINE identifier LBRACE ( globalVariableDecl )* ( state )* ( trans )* ( invariantExpression )* RBRACE EOF ;
    public final void machine() throws RecognitionException {
        int machine_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }

            // StateMachine.g:43:8: ( MACHINE identifier LBRACE ( globalVariableDecl )* ( state )* ( trans )* ( invariantExpression )* RBRACE EOF )
            // StateMachine.g:44:5: MACHINE identifier LBRACE ( globalVariableDecl )* ( state )* ( trans )* ( invariantExpression )* RBRACE EOF
            {
            match(input,MACHINE,FOLLOW_MACHINE_in_machine71); if (state.failed) return ;

            pushFollow(FOLLOW_identifier_in_machine73);
            identifier();

            state._fsp--;
            if (state.failed) return ;

            match(input,LBRACE,FOLLOW_LBRACE_in_machine75); if (state.failed) return ;

            // StateMachine.g:45:9: ( globalVariableDecl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BOOL||LA1_0==ENUM||LA1_0==INT||LA1_0==REAL||LA1_0==STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // StateMachine.g:45:10: globalVariableDecl
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


            // StateMachine.g:46:9: ( state )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==FINAL||(LA2_0 >= START && LA2_0 <= STATE)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // StateMachine.g:46:10: state
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


            // StateMachine.g:46:18: ( trans )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==TRANS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // StateMachine.g:46:19: trans
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


            // StateMachine.g:47:9: ( invariantExpression )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==INVARIANT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // StateMachine.g:47:10: invariantExpression
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
    // StateMachine.g:51:1: state : ( stateModifier )? STATE identifier LBRACE ( localVariableDecl )* ( expression SEMI )* RBRACE ;
    public final void state() throws RecognitionException {
        int state_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }

            // StateMachine.g:51:6: ( ( stateModifier )? STATE identifier LBRACE ( localVariableDecl )* ( expression SEMI )* RBRACE )
            // StateMachine.g:52:5: ( stateModifier )? STATE identifier LBRACE ( localVariableDecl )* ( expression SEMI )* RBRACE
            {
            // StateMachine.g:52:5: ( stateModifier )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==FINAL||LA5_0==START) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // StateMachine.g:52:6: stateModifier
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

            // StateMachine.g:53:9: ( localVariableDecl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==BOOL||LA6_0==ENUM||LA6_0==INT||LA6_0==REAL||LA6_0==STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // StateMachine.g:53:10: localVariableDecl
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


            // StateMachine.g:54:9: ( expression SEMI )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==BOOLLITERAL||LA7_0==CHARLITERAL||LA7_0==IDENT||LA7_0==INTLITERAL||LA7_0==LPAREN||LA7_0==MINUS||LA7_0==PLUS||LA7_0==REALLITERAL||LA7_0==STRINGLITERAL||LA7_0==59||(LA7_0 >= 62 && LA7_0 <= 63)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // StateMachine.g:54:10: expression SEMI
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
    // StateMachine.g:58:1: trans : TRANS identifier LBRACE identifier ARROW identifier ON label RBRACE ;
    public final void trans() throws RecognitionException {
        int trans_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }

            // StateMachine.g:58:6: ( TRANS identifier LBRACE identifier ARROW identifier ON label RBRACE )
            // StateMachine.g:58:8: TRANS identifier LBRACE identifier ARROW identifier ON label RBRACE
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
    // StateMachine.g:63:1: invariantExpression : INVARIANT ( identifier )? LBRACE ( expression SEMI )+ RBRACE ;
    public final void invariantExpression() throws RecognitionException {
        int invariantExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }

            // StateMachine.g:63:20: ( INVARIANT ( identifier )? LBRACE ( expression SEMI )+ RBRACE )
            // StateMachine.g:64:5: INVARIANT ( identifier )? LBRACE ( expression SEMI )+ RBRACE
            {
            match(input,INVARIANT,FOLLOW_INVARIANT_in_invariantExpression231); if (state.failed) return ;

            // StateMachine.g:65:9: ( identifier )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // StateMachine.g:65:10: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_invariantExpression243);
                    identifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,LBRACE,FOLLOW_LBRACE_in_invariantExpression253); if (state.failed) return ;

            // StateMachine.g:67:9: ( expression SEMI )+
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
            	    // StateMachine.g:67:10: expression SEMI
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
    // StateMachine.g:71:1: label : STRINGLITERAL ;
    public final void label() throws RecognitionException {
        int label_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }

            // StateMachine.g:71:6: ( STRINGLITERAL )
            // StateMachine.g:72:5: STRINGLITERAL
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
    // StateMachine.g:75:1: identifier : IDENT ;
    public final void identifier() throws RecognitionException {
        int identifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }

            // StateMachine.g:75:11: ( IDENT )
            // StateMachine.g:75:13: IDENT
            {
            match(input,IDENT,FOLLOW_IDENT_in_identifier296); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "identifier"



    // $ANTLR start "stateModifier"
    // StateMachine.g:77:1: stateModifier : ( START | FINAL );
    public final void stateModifier() throws RecognitionException {
        int stateModifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }

            // StateMachine.g:77:14: ( START | FINAL )
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
    // StateMachine.g:82:1: literal : ( INTLITERAL | REALLITERAL | BOOLLITERAL | STRINGLITERAL | CHARLITERAL );
    public final void literal() throws RecognitionException {
        int literal_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }

            // StateMachine.g:82:8: ( INTLITERAL | REALLITERAL | BOOLLITERAL | STRINGLITERAL | CHARLITERAL )
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
    // StateMachine.g:90:1: globalVariableDecl : type variableDeclarator SEMI ;
    public final void globalVariableDecl() throws RecognitionException {
        int globalVariableDecl_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }

            // StateMachine.g:90:20: ( type variableDeclarator SEMI )
            // StateMachine.g:91:5: type variableDeclarator SEMI
            {
            pushFollow(FOLLOW_type_in_globalVariableDecl379);
            type();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_variableDeclarator_in_globalVariableDecl381);
            variableDeclarator();

            state._fsp--;
            if (state.failed) return ;

            match(input,SEMI,FOLLOW_SEMI_in_globalVariableDecl387); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "globalVariableDecl"



    // $ANTLR start "localVariableDecl"
    // StateMachine.g:95:1: localVariableDecl : type variableDeclarator SEMI ;
    public final void localVariableDecl() throws RecognitionException {
        int localVariableDecl_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }

            // StateMachine.g:95:19: ( type variableDeclarator SEMI )
            // StateMachine.g:96:5: type variableDeclarator SEMI
            {
            pushFollow(FOLLOW_type_in_localVariableDecl400);
            type();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_variableDeclarator_in_localVariableDecl402);
            variableDeclarator();

            state._fsp--;
            if (state.failed) return ;

            match(input,SEMI,FOLLOW_SEMI_in_localVariableDecl408); if (state.failed) return ;

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
    // StateMachine.g:100:1: modifier : ( 'global' | 'native' );
    public final void modifier() throws RecognitionException {
        int modifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }

            // StateMachine.g:100:10: ( 'global' | 'native' )
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
    // StateMachine.g:105:1: type : ( primitiveType | enumType );
    public final void type() throws RecognitionException {
        int type_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }

            // StateMachine.g:105:6: ( primitiveType | enumType )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==BOOL||LA10_0==INT||LA10_0==REAL||LA10_0==STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==ENUM) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // StateMachine.g:106:9: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type452);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // StateMachine.g:107:9: enumType
                    {
                    pushFollow(FOLLOW_enumType_in_type462);
                    enumType();

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
            if ( state.backtracking>0 ) { memoize(input, 12, type_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "type"



    // $ANTLR start "primitiveType"
    // StateMachine.g:110:1: primitiveType : ( INT | BOOL | REAL | STRING );
    public final void primitiveType() throws RecognitionException {
        int primitiveType_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }

            // StateMachine.g:110:14: ( INT | BOOL | REAL | STRING )
            // StateMachine.g:
            {
            if ( input.LA(1)==BOOL||input.LA(1)==INT||input.LA(1)==REAL||input.LA(1)==STRING ) {
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
            if ( state.backtracking>0 ) { memoize(input, 13, primitiveType_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "primitiveType"



    // $ANTLR start "enumType"
    // StateMachine.g:117:1: enumType : ENUM LBRACE identifier ( COMMA identifier )* RBRACE ;
    public final void enumType() throws RecognitionException {
        int enumType_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }

            // StateMachine.g:117:10: ( ENUM LBRACE identifier ( COMMA identifier )* RBRACE )
            // StateMachine.g:118:5: ENUM LBRACE identifier ( COMMA identifier )* RBRACE
            {
            match(input,ENUM,FOLLOW_ENUM_in_enumType544); if (state.failed) return ;

            match(input,LBRACE,FOLLOW_LBRACE_in_enumType546); if (state.failed) return ;

            pushFollow(FOLLOW_identifier_in_enumType548);
            identifier();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:118:28: ( COMMA identifier )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // StateMachine.g:118:29: COMMA identifier
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_enumType551); if (state.failed) return ;

            	    pushFollow(FOLLOW_identifier_in_enumType553);
            	    identifier();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_enumType557); if (state.failed) return ;

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
    // StateMachine.g:121:1: variableDeclarator : identifier ( '=' variableInitializer )? ( WHERE expression )? ;
    public final void variableDeclarator() throws RecognitionException {
        int variableDeclarator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }

            // StateMachine.g:121:20: ( identifier ( '=' variableInitializer )? ( WHERE expression )? )
            // StateMachine.g:122:5: identifier ( '=' variableInitializer )? ( WHERE expression )?
            {
            pushFollow(FOLLOW_identifier_in_variableDeclarator570);
            identifier();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:123:5: ( '=' variableInitializer )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==EQUAL) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // StateMachine.g:123:6: '=' variableInitializer
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_variableDeclarator578); if (state.failed) return ;

                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator580);
                    variableInitializer();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // StateMachine.g:124:5: ( WHERE expression )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==WHERE) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // StateMachine.g:124:6: WHERE expression
                    {
                    match(input,WHERE,FOLLOW_WHERE_in_variableDeclarator590); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_variableDeclarator592);
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
            if ( state.backtracking>0 ) { memoize(input, 15, variableDeclarator_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "variableDeclarator"



    // $ANTLR start "expression"
    // StateMachine.g:127:1: expression : conditionalOrExpression ( assignmentOperator expression )? ;
    public final void expression() throws RecognitionException {
        int expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }

            // StateMachine.g:127:11: ( conditionalOrExpression ( assignmentOperator expression )? )
            // StateMachine.g:128:9: conditionalOrExpression ( assignmentOperator expression )?
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_expression611);
            conditionalOrExpression();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:129:9: ( assignmentOperator expression )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EQUAL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // StateMachine.g:129:10: assignmentOperator expression
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_expression622);
                    assignmentOperator();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_expression624);
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
    // StateMachine.g:133:1: assignmentOperator : '=' ;
    public final void assignmentOperator() throws RecognitionException {
        int assignmentOperator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }

            // StateMachine.g:134:5: ( '=' )
            // StateMachine.g:134:9: '='
            {
            match(input,EQUAL,FOLLOW_EQUAL_in_assignmentOperator656); if (state.failed) return ;

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
    // StateMachine.g:137:1: conditionalOrExpression : conditionalAndExpression ( '||' conditionalAndExpression )* ;
    public final void conditionalOrExpression() throws RecognitionException {
        int conditionalOrExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }

            // StateMachine.g:138:5: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
            // StateMachine.g:138:9: conditionalAndExpression ( '||' conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression672);
            conditionalAndExpression();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:139:9: ( '||' conditionalAndExpression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==66) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // StateMachine.g:139:10: '||' conditionalAndExpression
            	    {
            	    match(input,66,FOLLOW_66_in_conditionalOrExpression683); if (state.failed) return ;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression685);
            	    conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // StateMachine.g:143:1: conditionalAndExpression : relationalExpression ( '&&' relationalExpression )* ;
    public final void conditionalAndExpression() throws RecognitionException {
        int conditionalAndExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }

            // StateMachine.g:144:5: ( relationalExpression ( '&&' relationalExpression )* )
            // StateMachine.g:145:5: relationalExpression ( '&&' relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_conditionalAndExpression717);
            relationalExpression();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:146:6: ( '&&' relationalExpression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==61) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // StateMachine.g:146:7: '&&' relationalExpression
            	    {
            	    match(input,61,FOLLOW_61_in_conditionalAndExpression726); if (state.failed) return ;

            	    pushFollow(FOLLOW_relationalExpression_in_conditionalAndExpression728);
            	    relationalExpression();

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
            if ( state.backtracking>0 ) { memoize(input, 19, conditionalAndExpression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "relationalExpression"
    // StateMachine.g:150:1: relationalExpression : additiveExpression ( relationalOp additiveExpression )* ;
    public final void relationalExpression() throws RecognitionException {
        int relationalExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }

            // StateMachine.g:151:5: ( additiveExpression ( relationalOp additiveExpression )* )
            // StateMachine.g:151:7: additiveExpression ( relationalOp additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression757);
            additiveExpression();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:152:9: ( relationalOp additiveExpression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= GREATER && LA17_0 <= GREATER_EQUAL)||(LA17_0 >= LESS && LA17_0 <= LESS_EQUAL)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // StateMachine.g:152:10: relationalOp additiveExpression
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression768);
            	    relationalOp();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression770);
            	    additiveExpression();

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
            if ( state.backtracking>0 ) { memoize(input, 20, relationalExpression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "relationalExpression"



    // $ANTLR start "relationalOp"
    // StateMachine.g:156:1: relationalOp : ( '<=' | '>=' | '<' | '>' );
    public final void relationalOp() throws RecognitionException {
        int relationalOp_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }

            // StateMachine.g:157:5: ( '<=' | '>=' | '<' | '>' )
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
    // StateMachine.g:163:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final void additiveExpression() throws RecognitionException {
        int additiveExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }

            // StateMachine.g:164:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // StateMachine.g:164:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression850);
            multiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:165:9: ( ( '+' | '-' ) multiplicativeExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==MINUS||LA18_0==PLUS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // StateMachine.g:166:13: ( '+' | '-' ) multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression927);
            	    multiplicativeExpression();

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
            if ( state.backtracking>0 ) { memoize(input, 22, additiveExpression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // StateMachine.g:173:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
    public final void multiplicativeExpression() throws RecognitionException {
        int multiplicativeExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }

            // StateMachine.g:174:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            // StateMachine.g:175:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression965);
            unaryExpression();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:176:9: ( ( '*' | '/' | '%' ) unaryExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==SLASH||LA19_0==STAR||LA19_0==60) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // StateMachine.g:177:13: ( '*' | '/' | '%' ) unaryExpression
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


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1060);
            	    unaryExpression();

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
            if ( state.backtracking>0 ) { memoize(input, 23, multiplicativeExpression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // StateMachine.g:185:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus );
    public final void unaryExpression() throws RecognitionException {
        int unaryExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }

            // StateMachine.g:186:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus )
            int alt20=5;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt20=1;
                }
                break;
            case MINUS:
                {
                alt20=2;
                }
                break;
            case 62:
                {
                alt20=3;
                }
                break;
            case 63:
                {
                alt20=4;
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
                alt20=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // StateMachine.g:186:9: '+' unaryExpression
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_unaryExpression1091); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1094);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // StateMachine.g:187:9: '-' unaryExpression
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_unaryExpression1104); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1106);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // StateMachine.g:188:9: '++' unaryExpression
                    {
                    match(input,62,FOLLOW_62_in_unaryExpression1116); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1118);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // StateMachine.g:189:9: '--' unaryExpression
                    {
                    match(input,63,FOLLOW_63_in_unaryExpression1128); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1130);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // StateMachine.g:190:9: unaryExpressionNotPlusMinus
                    {
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1140);
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
    // StateMachine.g:193:1: unaryExpressionNotPlusMinus : ( '!' unaryExpression | primary );
    public final void unaryExpressionNotPlusMinus() throws RecognitionException {
        int unaryExpressionNotPlusMinus_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }

            // StateMachine.g:194:5: ( '!' unaryExpression | primary )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==59) ) {
                alt21=1;
            }
            else if ( (LA21_0==BOOLLITERAL||LA21_0==CHARLITERAL||LA21_0==IDENT||LA21_0==INTLITERAL||LA21_0==LPAREN||LA21_0==REALLITERAL||LA21_0==STRINGLITERAL) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // StateMachine.g:194:9: '!' unaryExpression
                    {
                    match(input,59,FOLLOW_59_in_unaryExpressionNotPlusMinus1160); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1162);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // StateMachine.g:195:9: primary
                    {
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus1172);
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
    // StateMachine.g:198:1: primary : ( parExpression | identifier | literal );
    public final void primary() throws RecognitionException {
        int primary_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }

            // StateMachine.g:199:5: ( parExpression | identifier | literal )
            int alt22=3;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt22=1;
                }
                break;
            case IDENT:
                {
                alt22=2;
                }
                break;
            case BOOLLITERAL:
            case CHARLITERAL:
            case INTLITERAL:
            case REALLITERAL:
            case STRINGLITERAL:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // StateMachine.g:199:9: parExpression
                    {
                    pushFollow(FOLLOW_parExpression_in_primary1192);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // StateMachine.g:200:9: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_primary1203);
                    identifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // StateMachine.g:201:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primary1213);
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
    // StateMachine.g:204:1: variableInitializer : expression ;
    public final void variableInitializer() throws RecognitionException {
        int variableInitializer_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }

            // StateMachine.g:204:20: ( expression )
            // StateMachine.g:205:9: expression
            {
            pushFollow(FOLLOW_expression_in_variableInitializer1234);
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
    // StateMachine.g:208:1: parExpression : '(' expression ')' ;
    public final void parExpression() throws RecognitionException {
        int parExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }

            // StateMachine.g:209:5: ( '(' expression ')' )
            // StateMachine.g:209:9: '(' expression ')'
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_parExpression1254); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_parExpression1256);
            expression();

            state._fsp--;
            if (state.failed) return ;

            match(input,RPAREN,FOLLOW_RPAREN_in_parExpression1258); if (state.failed) return ;

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
    public static final BitSet FOLLOW_IDENT_in_identifier296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_globalVariableDecl379 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_globalVariableDecl381 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SEMI_in_globalVariableDecl387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_localVariableDecl400 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDecl402 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SEMI_in_localVariableDecl408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumType_in_type462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumType544 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LBRACE_in_enumType546 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_identifier_in_enumType548 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_COMMA_in_enumType551 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_identifier_in_enumType553 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_RBRACE_in_enumType557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclarator570 = new BitSet(new long[]{0x0200000000040002L});
    public static final BitSet FOLLOW_EQUAL_in_variableDeclarator578 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator580 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_WHERE_in_variableDeclarator590 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_expression_in_variableDeclarator592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_expression611 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression622 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_expression_in_expression624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_assignmentOperator656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression672 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_conditionalOrExpression683 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression685 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExpression_in_conditionalAndExpression717 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_conditionalAndExpression726 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_relationalExpression_in_conditionalAndExpression728 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression757 = new BitSet(new long[]{0x0000000600600002L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression768 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression770 = new BitSet(new long[]{0x0000000600600002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression850 = new BitSet(new long[]{0x0000042000000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression877 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression927 = new BitSet(new long[]{0x0000042000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression965 = new BitSet(new long[]{0x100A000000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression992 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1060 = new BitSet(new long[]{0x100A000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression1091 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression1104 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_unaryExpression1116 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_unaryExpression1128 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_unaryExpressionNotPlusMinus1160 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_primary1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression1254 = new BitSet(new long[]{0xC88044280A000500L});
    public static final BitSet FOLLOW_expression_in_parExpression1256 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression1258 = new BitSet(new long[]{0x0000000000000002L});

}