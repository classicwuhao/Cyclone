// $ANTLR 3.4 StateMachine.g 2020-07-17 15:11:53

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "BOOL", "BOOLLITERAL", "CHAR", "CHARLITERAL", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "ENUM", "ENUMLITERAL", "EQUAL", "EscapeSequence", "FINAL", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "INTLITERAL", "INVARIANT", "IdentifierPart", "IdentifierStart", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MACHINE", "MINUS", "ML_COMMENT", "NEWLINE", "NOT_EQUAL", "ON", "PLUS", "RBRACE", "RBRACK", "REAL", "REALLITERAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "START", "STATE", "STRING", "STRINGLITERAL", "TRANS", "WHERE", "WS", "'!'", "'%'", "'&&'", "'++'", "'--'", "'global'", "'native'", "'||'"
    };

    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
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
    public static final int ENUMLITERAL=18;
    public static final int EQUAL=19;
    public static final int EscapeSequence=20;
    public static final int FINAL=21;
    public static final int GREATER=22;
    public static final int GREATER_EQUAL=23;
    public static final int HASH=24;
    public static final int HEX_DIGIT=25;
    public static final int IDENT=26;
    public static final int INT=27;
    public static final int INTLITERAL=28;
    public static final int INVARIANT=29;
    public static final int IdentifierPart=30;
    public static final int IdentifierStart=31;
    public static final int LBRACE=32;
    public static final int LBRACK=33;
    public static final int LESS=34;
    public static final int LESS_EQUAL=35;
    public static final int LPAREN=36;
    public static final int MACHINE=37;
    public static final int MINUS=38;
    public static final int ML_COMMENT=39;
    public static final int NEWLINE=40;
    public static final int NOT_EQUAL=41;
    public static final int ON=42;
    public static final int PLUS=43;
    public static final int RBRACE=44;
    public static final int RBRACK=45;
    public static final int REAL=46;
    public static final int REALLITERAL=47;
    public static final int RPAREN=48;
    public static final int SEMI=49;
    public static final int SLASH=50;
    public static final int SL_COMMENT=51;
    public static final int STAR=52;
    public static final int START=53;
    public static final int STATE=54;
    public static final int STRING=55;
    public static final int STRINGLITERAL=56;
    public static final int TRANS=57;
    public static final int WHERE=58;
    public static final int WS=59;

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

        ASTExpression name =null;

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

            if ( state.backtracking==0 ) {machine = new ASTMachine( ((ASTIdentifier) name).identifier() );}

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

                if ( (LA7_0==BOOLLITERAL||LA7_0==CHARLITERAL||LA7_0==IDENT||LA7_0==INTLITERAL||LA7_0==LPAREN||LA7_0==MINUS||LA7_0==PLUS||LA7_0==REALLITERAL||LA7_0==STRINGLITERAL||LA7_0==60||(LA7_0 >= 63 && LA7_0 <= 64)) ) {
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

                if ( (LA9_0==BOOLLITERAL||LA9_0==CHARLITERAL||LA9_0==IDENT||LA9_0==INTLITERAL||LA9_0==LPAREN||LA9_0==MINUS||LA9_0==PLUS||LA9_0==REALLITERAL||LA9_0==STRINGLITERAL||LA9_0==60||(LA9_0 >= 63 && LA9_0 <= 64)) ) {
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
    // StateMachine.g:79:1: identifier returns [ASTExpression expr] : str= IDENT ;
    public final ASTExpression identifier() throws RecognitionException {
        ASTExpression expr = null;

        int identifier_StartIndex = input.index();

        Token str=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return expr; }

            // StateMachine.g:79:40: (str= IDENT )
            // StateMachine.g:80:5: str= IDENT
            {
            str=(Token)match(input,IDENT,FOLLOW_IDENT_in_identifier319); if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr = new ASTIdentifier(str);}

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
        return expr;
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
    // StateMachine.g:88:1: literal returns [ASTLiteral literal_node] : (l= INTLITERAL |r= REALLITERAL |b= BOOLLITERAL |s= STRINGLITERAL |c= CHARLITERAL );
    public final ASTLiteral literal() throws RecognitionException {
        ASTLiteral literal_node = null;

        int literal_StartIndex = input.index();

        Token l=null;
        Token r=null;
        Token b=null;
        Token s=null;
        Token c=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return literal_node; }

            // StateMachine.g:88:42: (l= INTLITERAL |r= REALLITERAL |b= BOOLLITERAL |s= STRINGLITERAL |c= CHARLITERAL )
            int alt10=5;
            switch ( input.LA(1) ) {
            case INTLITERAL:
                {
                alt10=1;
                }
                break;
            case REALLITERAL:
                {
                alt10=2;
                }
                break;
            case BOOLLITERAL:
                {
                alt10=3;
                }
                break;
            case STRINGLITERAL:
                {
                alt10=4;
                }
                break;
            case CHARLITERAL:
                {
                alt10=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return literal_node;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // StateMachine.g:89:7: l= INTLITERAL
                    {
                    l=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literal365); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.INT,l);}

                    }
                    break;
                case 2 :
                    // StateMachine.g:90:7: r= REALLITERAL
                    {
                    r=(Token)match(input,REALLITERAL,FOLLOW_REALLITERAL_in_literal377); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.REAL,r);}

                    }
                    break;
                case 3 :
                    // StateMachine.g:91:7: b= BOOLLITERAL
                    {
                    b=(Token)match(input,BOOLLITERAL,FOLLOW_BOOLLITERAL_in_literal389); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.BOOL,b);}

                    }
                    break;
                case 4 :
                    // StateMachine.g:92:7: s= STRINGLITERAL
                    {
                    s=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literal401); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.STRING,s);}

                    }
                    break;
                case 5 :
                    // StateMachine.g:93:7: c= CHARLITERAL
                    {
                    c=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literal413); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.CHAR,c);}

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
            if ( state.backtracking>0 ) { memoize(input, 8, literal_StartIndex); }

        }
        return literal_node;
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
            pushFollow(FOLLOW_type_in_globalVariableDecl433);
            t=type();

            state._fsp--;
            if (state.failed) return v;

            pushFollow(FOLLOW_variableDeclarator_in_globalVariableDecl437);
            n=variableDeclarator();

            state._fsp--;
            if (state.failed) return v;

            if ( state.backtracking==0 ) {n.type=t;n.createVariable();v =n;}

            match(input,SEMI,FOLLOW_SEMI_in_globalVariableDecl445); if (state.failed) return v;

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
            pushFollow(FOLLOW_type_in_localVariableDecl458);
            type();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_variableDeclarator_in_localVariableDecl460);
            variableDeclarator();

            state._fsp--;
            if (state.failed) return ;

            match(input,SEMI,FOLLOW_SEMI_in_localVariableDecl466); if (state.failed) return ;

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
            if ( (input.LA(1) >= 65 && input.LA(1) <= 66) ) {
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
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==BOOL||LA11_0==INT||LA11_0==REAL||LA11_0==STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==ENUM) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // StateMachine.g:112:9: p= primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type516);
                    p=primitiveType();

                    state._fsp--;
                    if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =p;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:113:9: e= enumType
                    {
                    pushFollow(FOLLOW_enumType_in_type530);
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
            int alt12=4;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt12=1;
                }
                break;
            case BOOL:
                {
                alt12=2;
                }
                break;
            case REAL:
                {
                alt12=3;
                }
                break;
            case STRING:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // StateMachine.g:117:7: INT
                    {
                    match(input,INT,FOLLOW_INT_in_primitiveType549); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t = new IntType();}

                    }
                    break;
                case 2 :
                    // StateMachine.g:118:7: BOOL
                    {
                    match(input,BOOL,FOLLOW_BOOL_in_primitiveType559); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =new BoolType();}

                    }
                    break;
                case 3 :
                    // StateMachine.g:119:7: REAL
                    {
                    match(input,REAL,FOLLOW_REAL_in_primitiveType569); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =new RealType();}

                    }
                    break;
                case 4 :
                    // StateMachine.g:120:7: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_primitiveType580); if (state.failed) return t;

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

        ASTExpression name =null;

        ASTExpression l =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return t; }

            // StateMachine.g:123:31: ( ENUM LBRACE name= identifier ( COMMA l= identifier )* RBRACE )
            // StateMachine.g:124:5: ENUM LBRACE name= identifier ( COMMA l= identifier )* RBRACE
            {
            match(input,ENUM,FOLLOW_ENUM_in_enumType599); if (state.failed) return t;

            if ( state.backtracking==0 ) {t =new EnumType();}

            match(input,LBRACE,FOLLOW_LBRACE_in_enumType603); if (state.failed) return t;

            pushFollow(FOLLOW_identifier_in_enumType607);
            name=identifier();

            state._fsp--;
            if (state.failed) return t;

            if ( state.backtracking==0 ) {t.add(name.toString());}

            // StateMachine.g:125:5: ( COMMA l= identifier )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // StateMachine.g:125:6: COMMA l= identifier
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_enumType617); if (state.failed) return t;

            	    pushFollow(FOLLOW_identifier_in_enumType621);
            	    l=identifier();

            	    state._fsp--;
            	    if (state.failed) return t;

            	    if ( state.backtracking==0 ) {t.add(l.toString());}

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_enumType627); if (state.failed) return t;

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
    // StateMachine.g:128:1: variableDeclarator returns [ASTVariable var] :n= identifier ( '=' n= variableInitializer )? ( WHERE expression )? ;
    public final ASTVariable variableDeclarator() throws RecognitionException {
        ASTVariable var = null;

        int variableDeclarator_StartIndex = input.index();

        ASTExpression n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return var; }

            // StateMachine.g:128:45: (n= identifier ( '=' n= variableInitializer )? ( WHERE expression )? )
            // StateMachine.g:129:5: n= identifier ( '=' n= variableInitializer )? ( WHERE expression )?
            {
            if ( state.backtracking==0 ) {var =new ASTVariable();}

            pushFollow(FOLLOW_identifier_in_variableDeclarator651);
            n=identifier();

            state._fsp--;
            if (state.failed) return var;

            if ( state.backtracking==0 ) {var.name=n.toString();}

            // StateMachine.g:131:5: ( '=' n= variableInitializer )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EQUAL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // StateMachine.g:131:6: '=' n= variableInitializer
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_variableDeclarator660); if (state.failed) return var;

                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator664);
                    n=variableInitializer();

                    state._fsp--;
                    if (state.failed) return var;

                    if ( state.backtracking==0 ) {var.initializer=n;}

                    }
                    break;

            }


            // StateMachine.g:132:5: ( WHERE expression )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==WHERE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // StateMachine.g:132:6: WHERE expression
                    {
                    match(input,WHERE,FOLLOW_WHERE_in_variableDeclarator676); if (state.failed) return var;

                    pushFollow(FOLLOW_expression_in_variableDeclarator678);
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



    // $ANTLR start "variableInitializer"
    // StateMachine.g:135:1: variableInitializer returns [ASTExpression expr] : n= expression ;
    public final ASTExpression variableInitializer() throws RecognitionException {
        ASTExpression expr = null;

        int variableInitializer_StartIndex = input.index();

        ASTExpression n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return expr; }

            // StateMachine.g:135:49: (n= expression )
            // StateMachine.g:136:9: n= expression
            {
            pushFollow(FOLLOW_expression_in_variableInitializer704);
            n=expression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =n;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, variableInitializer_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "variableInitializer"



    // $ANTLR start "expression"
    // StateMachine.g:139:1: expression returns [ASTExpression expr] : nOrExpr= conditionalOrExpression ( assignmentOperator nExpr= expression )? ;
    public final ASTExpression expression() throws RecognitionException {
        ASTExpression expr = null;

        int expression_StartIndex = input.index();

        ASTExpression nOrExpr =null;

        ASTExpression nExpr =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return expr; }

            // StateMachine.g:139:40: (nOrExpr= conditionalOrExpression ( assignmentOperator nExpr= expression )? )
            // StateMachine.g:140:9: nOrExpr= conditionalOrExpression ( assignmentOperator nExpr= expression )?
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_expression732);
            nOrExpr=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nOrExpr;}

            // StateMachine.g:141:9: ( assignmentOperator nExpr= expression )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==EQUAL) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // StateMachine.g:141:10: assignmentOperator nExpr= expression
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_expression745);
                    assignmentOperator();

                    state._fsp--;
                    if (state.failed) return expr;

                    pushFollow(FOLLOW_expression_in_expression749);
                    nExpr=expression();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =nExpr;}

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
            if ( state.backtracking>0 ) { memoize(input, 17, expression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "expression"



    // $ANTLR start "assignmentOperator"
    // StateMachine.g:145:1: assignmentOperator : '=' ;
    public final void assignmentOperator() throws RecognitionException {
        int assignmentOperator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }

            // StateMachine.g:146:5: ( '=' )
            // StateMachine.g:146:9: '='
            {
            match(input,EQUAL,FOLLOW_EQUAL_in_assignmentOperator781); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, assignmentOperator_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "assignmentOperator"



    // $ANTLR start "conditionalOrExpression"
    // StateMachine.g:149:1: conditionalOrExpression returns [ASTExpression expr] : n= conditionalAndExpression ( '||' conditionalAndExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalOrExpression_StartIndex = input.index();

        ASTExpression n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return expr; }

            // StateMachine.g:150:5: (n= conditionalAndExpression ( '||' conditionalAndExpression )* )
            // StateMachine.g:150:9: n= conditionalAndExpression ( '||' conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression802);
            n=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =n;}

            // StateMachine.g:151:9: ( '||' conditionalAndExpression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==67) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // StateMachine.g:151:10: '||' conditionalAndExpression
            	    {
            	    match(input,67,FOLLOW_67_in_conditionalOrExpression815); if (state.failed) return expr;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression817);
            	    conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

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
            if ( state.backtracking>0 ) { memoize(input, 19, conditionalOrExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // StateMachine.g:155:1: conditionalAndExpression returns [ASTExpression expr] : n= relationalExpression ( '&&' relationalExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalAndExpression_StartIndex = input.index();

        ASTExpression n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return expr; }

            // StateMachine.g:156:5: (n= relationalExpression ( '&&' relationalExpression )* )
            // StateMachine.g:157:6: n= relationalExpression ( '&&' relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_conditionalAndExpression856);
            n=relationalExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =n;}

            // StateMachine.g:158:6: ( '&&' relationalExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==62) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // StateMachine.g:158:7: '&&' relationalExpression
            	    {
            	    match(input,62,FOLLOW_62_in_conditionalAndExpression866); if (state.failed) return expr;

            	    pushFollow(FOLLOW_relationalExpression_in_conditionalAndExpression868);
            	    relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

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
            if ( state.backtracking>0 ) { memoize(input, 20, conditionalAndExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "relationalExpression"
    // StateMachine.g:162:1: relationalExpression returns [ASTExpression expr] : n= additiveExpression ( relationalOp additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression expr = null;

        int relationalExpression_StartIndex = input.index();

        ASTExpression n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return expr; }

            // StateMachine.g:163:5: (n= additiveExpression ( relationalOp additiveExpression )* )
            // StateMachine.g:163:7: n= additiveExpression ( relationalOp additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression902);
            n=additiveExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =n;}

            // StateMachine.g:164:9: ( relationalOp additiveExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0 >= GREATER && LA19_0 <= GREATER_EQUAL)||(LA19_0 >= LESS && LA19_0 <= LESS_EQUAL)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // StateMachine.g:164:10: relationalOp additiveExpression
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression915);
            	    relationalOp();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression917);
            	    additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

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
            if ( state.backtracking>0 ) { memoize(input, 21, relationalExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "relationalExpression"



    // $ANTLR start "relationalOp"
    // StateMachine.g:168:1: relationalOp : ( '<=' | '>=' | '<' | '>' );
    public final void relationalOp() throws RecognitionException {
        int relationalOp_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }

            // StateMachine.g:169:5: ( '<=' | '>=' | '<' | '>' )
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
            if ( state.backtracking>0 ) { memoize(input, 22, relationalOp_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "relationalOp"



    // $ANTLR start "additiveExpression"
    // StateMachine.g:175:1: additiveExpression returns [ASTExpression expr] : n= multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression expr = null;

        int additiveExpression_StartIndex = input.index();

        ASTExpression n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return expr; }

            // StateMachine.g:176:5: (n= multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // StateMachine.g:176:9: n= multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1002);
            n=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =n;}

            // StateMachine.g:177:9: ( ( '+' | '-' ) multiplicativeExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==MINUS||LA20_0==PLUS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // StateMachine.g:178:13: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return expr;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1081);
            	    multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

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
            if ( state.backtracking>0 ) { memoize(input, 23, additiveExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // StateMachine.g:185:1: multiplicativeExpression returns [ASTExpression expr] : n= unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression expr = null;

        int multiplicativeExpression_StartIndex = input.index();

        ASTExpression n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return expr; }

            // StateMachine.g:186:5: (n= unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            // StateMachine.g:187:9: n= unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1124);
            n=unaryExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =n;}

            // StateMachine.g:188:9: ( ( '*' | '/' | '%' ) unaryExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==SLASH||LA21_0==STAR||LA21_0==61) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // StateMachine.g:189:13: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==61 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return expr;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1221);
            	    unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    }
            	    break;

            	default :
            	    break loop21;
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
            if ( state.backtracking>0 ) { memoize(input, 24, multiplicativeExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // StateMachine.g:197:1: unaryExpression returns [ASTExpression expr] : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression |n= unaryExpressionNotPlusMinus );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression expr = null;

        int unaryExpression_StartIndex = input.index();

        ASTExpression n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return expr; }

            // StateMachine.g:198:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression |n= unaryExpressionNotPlusMinus )
            int alt22=5;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt22=1;
                }
                break;
            case MINUS:
                {
                alt22=2;
                }
                break;
            case 63:
                {
                alt22=3;
                }
                break;
            case 64:
                {
                alt22=4;
                }
                break;
            case BOOLLITERAL:
            case CHARLITERAL:
            case IDENT:
            case INTLITERAL:
            case LPAREN:
            case REALLITERAL:
            case STRINGLITERAL:
            case 60:
                {
                alt22=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // StateMachine.g:198:9: '+' unaryExpression
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_unaryExpression1255); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1258);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 2 :
                    // StateMachine.g:199:9: '-' unaryExpression
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_unaryExpression1268); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1270);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 3 :
                    // StateMachine.g:200:9: '++' unaryExpression
                    {
                    match(input,63,FOLLOW_63_in_unaryExpression1280); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1282);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 4 :
                    // StateMachine.g:201:9: '--' unaryExpression
                    {
                    match(input,64,FOLLOW_64_in_unaryExpression1292); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1294);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 5 :
                    // StateMachine.g:202:9: n= unaryExpressionNotPlusMinus
                    {
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1306);
                    n=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =n;}

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
            if ( state.backtracking>0 ) { memoize(input, 25, unaryExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "unaryExpression"



    // $ANTLR start "unaryExpressionNotPlusMinus"
    // StateMachine.g:205:1: unaryExpressionNotPlusMinus returns [ASTExpression expr] : ( '!' unaryExpression |p= primary );
    public final ASTExpression unaryExpressionNotPlusMinus() throws RecognitionException {
        ASTExpression expr = null;

        int unaryExpressionNotPlusMinus_StartIndex = input.index();

        ASTExpression p =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return expr; }

            // StateMachine.g:206:5: ( '!' unaryExpression |p= primary )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==60) ) {
                alt23=1;
            }
            else if ( (LA23_0==BOOLLITERAL||LA23_0==CHARLITERAL||LA23_0==IDENT||LA23_0==INTLITERAL||LA23_0==LPAREN||LA23_0==REALLITERAL||LA23_0==STRINGLITERAL) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // StateMachine.g:206:9: '!' unaryExpression
                    {
                    match(input,60,FOLLOW_60_in_unaryExpressionNotPlusMinus1331); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1333);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 2 :
                    // StateMachine.g:207:9: p= primary
                    {
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus1345);
                    p=primary();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =p;}

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
            if ( state.backtracking>0 ) { memoize(input, 26, unaryExpressionNotPlusMinus_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"



    // $ANTLR start "primary"
    // StateMachine.g:210:1: primary returns [ASTExpression expr] : ( parExpression | identifier |literExpr= literal );
    public final ASTExpression primary() throws RecognitionException {
        ASTExpression expr = null;

        int primary_StartIndex = input.index();

        ASTLiteral literExpr =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return expr; }

            // StateMachine.g:211:5: ( parExpression | identifier |literExpr= literal )
            int alt24=3;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt24=1;
                }
                break;
            case IDENT:
                {
                alt24=2;
                }
                break;
            case BOOLLITERAL:
            case CHARLITERAL:
            case INTLITERAL:
            case REALLITERAL:
            case STRINGLITERAL:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // StateMachine.g:211:9: parExpression
                    {
                    pushFollow(FOLLOW_parExpression_in_primary1370);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 2 :
                    // StateMachine.g:212:9: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_primary1381);
                    identifier();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 3 :
                    // StateMachine.g:213:9: literExpr= literal
                    {
                    pushFollow(FOLLOW_literal_in_primary1393);
                    literExpr=literal();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =literExpr;}

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
            if ( state.backtracking>0 ) { memoize(input, 27, primary_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "primary"



    // $ANTLR start "parExpression"
    // StateMachine.g:216:1: parExpression returns [ASTExpression expr] : '(' expression ')' ;
    public final ASTExpression parExpression() throws RecognitionException {
        ASTExpression expr = null;

        int parExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return expr; }

            // StateMachine.g:217:5: ( '(' expression ')' )
            // StateMachine.g:217:9: '(' expression ')'
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_parExpression1418); if (state.failed) return expr;

            pushFollow(FOLLOW_expression_in_parExpression1420);
            expression();

            state._fsp--;
            if (state.failed) return expr;

            match(input,RPAREN,FOLLOW_RPAREN_in_parExpression1422); if (state.failed) return expr;

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
        return expr;
    }
    // $ANTLR end "parExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_MACHINE_in_machine76 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_identifier_in_machine80 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LBRACE_in_machine84 = new BitSet(new long[]{0x02E0500028220080L});
    public static final BitSet FOLLOW_globalVariableDecl_in_machine97 = new BitSet(new long[]{0x02E0500028220080L});
    public static final BitSet FOLLOW_state_in_machine112 = new BitSet(new long[]{0x0260100020200000L});
    public static final BitSet FOLLOW_trans_in_machine117 = new BitSet(new long[]{0x0200100020000000L});
    public static final BitSet FOLLOW_invariantExpression_in_machine130 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_RBRACE_in_machine138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_machine140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stateModifier_in_state153 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_STATE_in_state158 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_identifier_in_state160 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LBRACE_in_state162 = new BitSet(new long[]{0x9180D8501C020580L,0x0000000000000001L});
    public static final BitSet FOLLOW_localVariableDecl_in_state173 = new BitSet(new long[]{0x9180D8501C020580L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_state186 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_SEMI_in_state188 = new BitSet(new long[]{0x9100985014000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_state196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANS_in_trans204 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_identifier_in_trans206 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LBRACE_in_trans208 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_identifier_in_trans218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARROW_in_trans220 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_identifier_in_trans222 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ON_in_trans224 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_label_in_trans226 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RBRACE_in_trans232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVARIANT_in_invariantExpression244 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_identifier_in_invariantExpression256 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LBRACE_in_invariantExpression266 = new BitSet(new long[]{0x9100885014000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_invariantExpression278 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_SEMI_in_invariantExpression280 = new BitSet(new long[]{0x9100985014000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_invariantExpression289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_label301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identifier319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_literal365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REALLITERAL_in_literal377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLLITERAL_in_literal389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literal401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literal413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_globalVariableDecl433 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_globalVariableDecl437 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_SEMI_in_globalVariableDecl445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_localVariableDecl458 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDecl460 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_SEMI_in_localVariableDecl466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumType_in_type530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primitiveType559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_primitiveType569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primitiveType580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumType599 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LBRACE_in_enumType603 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_identifier_in_enumType607 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_COMMA_in_enumType617 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_identifier_in_enumType621 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_RBRACE_in_enumType627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclarator651 = new BitSet(new long[]{0x0400000000080002L});
    public static final BitSet FOLLOW_EQUAL_in_variableDeclarator660 = new BitSet(new long[]{0x9100885014000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator664 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_WHERE_in_variableDeclarator676 = new BitSet(new long[]{0x9100885014000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_variableDeclarator678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_expression732 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression745 = new BitSet(new long[]{0x9100885014000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_expression749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_assignmentOperator781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression802 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_conditionalOrExpression815 = new BitSet(new long[]{0x9100885014000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression817 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_relationalExpression_in_conditionalAndExpression856 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_conditionalAndExpression866 = new BitSet(new long[]{0x9100885014000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_relationalExpression_in_conditionalAndExpression868 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression902 = new BitSet(new long[]{0x0000000C00C00002L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression915 = new BitSet(new long[]{0x9100885014000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression917 = new BitSet(new long[]{0x0000000C00C00002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1002 = new BitSet(new long[]{0x0000084000000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1031 = new BitSet(new long[]{0x9100885014000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1081 = new BitSet(new long[]{0x0000084000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1124 = new BitSet(new long[]{0x2014000000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1153 = new BitSet(new long[]{0x9100885014000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1221 = new BitSet(new long[]{0x2014000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression1255 = new BitSet(new long[]{0x9100885014000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression1268 = new BitSet(new long[]{0x9100885014000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_unaryExpression1280 = new BitSet(new long[]{0x9100885014000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_unaryExpression1292 = new BitSet(new long[]{0x9100885014000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_unaryExpressionNotPlusMinus1331 = new BitSet(new long[]{0x9100885014000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_primary1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression1418 = new BitSet(new long[]{0x9100885014000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_parExpression1420 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression1422 = new BitSet(new long[]{0x0000000000000002L});

}