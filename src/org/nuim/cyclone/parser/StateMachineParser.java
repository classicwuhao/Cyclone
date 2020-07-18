// $ANTLR 3.4 StateMachine.g 2020-07-18 16:32:26

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "BOOL", "BOOLLITERAL", "CHAR", "CHARLITERAL", "CHECK", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "ENUM", "ENUMLITERAL", "EQUAL", "EscapeSequence", "FINAL", "FOR", "GOAL", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "IMPLIES", "INT", "INTLITERAL", "INVARIANT", "IdentifierPart", "IdentifierStart", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MACHINE", "MINUS", "ML_COMMENT", "NEWLINE", "NOT_EQUAL", "ON", "PLUS", "RBRACE", "RBRACK", "REAL", "REALLITERAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "START", "STATE", "STRING", "STRINGLITERAL", "TRANS", "WHERE", "WS", "XOR", "'!'", "'%'", "'&&'", "'++'", "'--'", "'global'", "'native'", "'||'"
    };

    public static final int EOF=-1;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int ARROW=4;
    public static final int AT=5;
    public static final int BAR=6;
    public static final int BOOL=7;
    public static final int BOOLLITERAL=8;
    public static final int CHAR=9;
    public static final int CHARLITERAL=10;
    public static final int CHECK=11;
    public static final int COLON=12;
    public static final int COLON_COLON=13;
    public static final int COLON_EQUAL=14;
    public static final int COMMA=15;
    public static final int DOT=16;
    public static final int DOTDOT=17;
    public static final int ENUM=18;
    public static final int ENUMLITERAL=19;
    public static final int EQUAL=20;
    public static final int EscapeSequence=21;
    public static final int FINAL=22;
    public static final int FOR=23;
    public static final int GOAL=24;
    public static final int GREATER=25;
    public static final int GREATER_EQUAL=26;
    public static final int HASH=27;
    public static final int HEX_DIGIT=28;
    public static final int IDENT=29;
    public static final int IMPLIES=30;
    public static final int INT=31;
    public static final int INTLITERAL=32;
    public static final int INVARIANT=33;
    public static final int IdentifierPart=34;
    public static final int IdentifierStart=35;
    public static final int LBRACE=36;
    public static final int LBRACK=37;
    public static final int LESS=38;
    public static final int LESS_EQUAL=39;
    public static final int LPAREN=40;
    public static final int MACHINE=41;
    public static final int MINUS=42;
    public static final int ML_COMMENT=43;
    public static final int NEWLINE=44;
    public static final int NOT_EQUAL=45;
    public static final int ON=46;
    public static final int PLUS=47;
    public static final int RBRACE=48;
    public static final int RBRACK=49;
    public static final int REAL=50;
    public static final int REALLITERAL=51;
    public static final int RPAREN=52;
    public static final int SEMI=53;
    public static final int SLASH=54;
    public static final int SL_COMMENT=55;
    public static final int STAR=56;
    public static final int START=57;
    public static final int STATE=58;
    public static final int STRING=59;
    public static final int STRINGLITERAL=60;
    public static final int TRANS=61;
    public static final int WHERE=62;
    public static final int WS=63;
    public static final int XOR=64;

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
        this.state.ruleMemo = new HashMap[72+1];
         

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

                if ( (LA7_0==BOOLLITERAL||LA7_0==CHARLITERAL||LA7_0==IDENT||LA7_0==INTLITERAL||LA7_0==LPAREN||LA7_0==MINUS||LA7_0==PLUS||LA7_0==REALLITERAL||LA7_0==STRINGLITERAL||LA7_0==65||(LA7_0 >= 68 && LA7_0 <= 69)) ) {
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

                if ( (LA9_0==BOOLLITERAL||LA9_0==CHARLITERAL||LA9_0==IDENT||LA9_0==INTLITERAL||LA9_0==LPAREN||LA9_0==MINUS||LA9_0==PLUS||LA9_0==REALLITERAL||LA9_0==STRINGLITERAL||LA9_0==65||(LA9_0 >= 68 && LA9_0 <= 69)) ) {
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
            if ( (input.LA(1) >= 70 && input.LA(1) <= 71) ) {
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
    // StateMachine.g:139:1: expression returns [ASTExpression expr] : nImpliesExpr= conditionalImpliesExpression ( '=' nExpr= expression )? ;
    public final ASTExpression expression() throws RecognitionException {
        ASTExpression expr = null;

        int expression_StartIndex = input.index();

        ASTExpression nImpliesExpr =null;

        ASTExpression nExpr =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return expr; }

            // StateMachine.g:139:40: (nImpliesExpr= conditionalImpliesExpression ( '=' nExpr= expression )? )
            // StateMachine.g:140:9: nImpliesExpr= conditionalImpliesExpression ( '=' nExpr= expression )?
            {
            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression734);
            nImpliesExpr=conditionalImpliesExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nImpliesExpr;}

            // StateMachine.g:141:9: ( '=' nExpr= expression )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==EQUAL) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // StateMachine.g:141:10: '=' nExpr= expression
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_expression747); if (state.failed) return expr;

                    pushFollow(FOLLOW_expression_in_expression751);
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



    // $ANTLR start "conditionalImpliesExpression"
    // StateMachine.g:145:1: conditionalImpliesExpression returns [ASTExpression expr] : nOrExpr= conditionalOrExpression (operator= IMPLIES n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalImpliesExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nOrExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return expr; }

            // StateMachine.g:146:5: (nOrExpr= conditionalOrExpression (operator= IMPLIES n1= conditionalOrExpression )* )
            // StateMachine.g:146:9: nOrExpr= conditionalOrExpression (operator= IMPLIES n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression788);
            nOrExpr=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nOrExpr;}

            // StateMachine.g:147:9: (operator= IMPLIES n1= conditionalOrExpression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==IMPLIES) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // StateMachine.g:148:13: operator= IMPLIES n1= conditionalOrExpression
            	    {
            	    operator=(Token)match(input,IMPLIES,FOLLOW_IMPLIES_in_conditionalImpliesExpression816); if (state.failed) return expr;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression820);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

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
            if ( state.backtracking>0 ) { memoize(input, 18, conditionalImpliesExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalImpliesExpression"



    // $ANTLR start "conditionalOrExpression"
    // StateMachine.g:153:1: conditionalOrExpression returns [ASTExpression expr] : nAndExpr= conditionalAndExpression (operator= '||' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalOrExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nAndExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return expr; }

            // StateMachine.g:154:5: (nAndExpr= conditionalAndExpression (operator= '||' n1= conditionalAndExpression )* )
            // StateMachine.g:154:9: nAndExpr= conditionalAndExpression (operator= '||' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression867);
            nAndExpr=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nAndExpr;}

            // StateMachine.g:155:9: (operator= '||' n1= conditionalAndExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==72) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // StateMachine.g:156:13: operator= '||' n1= conditionalAndExpression
            	    {
            	    operator=(Token)match(input,72,FOLLOW_72_in_conditionalOrExpression895); if (state.failed) return expr;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression899);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

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
            if ( state.backtracking>0 ) { memoize(input, 19, conditionalOrExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // StateMachine.g:161:1: conditionalAndExpression returns [ASTExpression expr] : nXorExpr= conditionalXorExpression (operator= '&&' n1= conditionalXorExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalAndExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nXorExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return expr; }

            // StateMachine.g:162:5: (nXorExpr= conditionalXorExpression (operator= '&&' n1= conditionalXorExpression )* )
            // StateMachine.g:162:9: nXorExpr= conditionalXorExpression (operator= '&&' n1= conditionalXorExpression )*
            {
            pushFollow(FOLLOW_conditionalXorExpression_in_conditionalAndExpression949);
            nXorExpr=conditionalXorExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nXorExpr;}

            // StateMachine.g:163:9: (operator= '&&' n1= conditionalXorExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==67) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // StateMachine.g:164:14: operator= '&&' n1= conditionalXorExpression
            	    {
            	    operator=(Token)match(input,67,FOLLOW_67_in_conditionalAndExpression979); if (state.failed) return expr;

            	    pushFollow(FOLLOW_conditionalXorExpression_in_conditionalAndExpression983);
            	    n1=conditionalXorExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

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
            if ( state.backtracking>0 ) { memoize(input, 20, conditionalAndExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "conditionalXorExpression"
    // StateMachine.g:169:1: conditionalXorExpression returns [ASTExpression expr] : nRelExpr= relationalExpression (operator= XOR n1= relationalExpression )* ;
    public final ASTExpression conditionalXorExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalXorExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nRelExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return expr; }

            // StateMachine.g:170:5: (nRelExpr= relationalExpression (operator= XOR n1= relationalExpression )* )
            // StateMachine.g:170:9: nRelExpr= relationalExpression (operator= XOR n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_conditionalXorExpression1036);
            nRelExpr=relationalExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nRelExpr;}

            // StateMachine.g:171:9: (operator= XOR n1= relationalExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==XOR) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // StateMachine.g:172:13: operator= XOR n1= relationalExpression
            	    {
            	    operator=(Token)match(input,XOR,FOLLOW_XOR_in_conditionalXorExpression1064); if (state.failed) return expr;

            	    pushFollow(FOLLOW_relationalExpression_in_conditionalXorExpression1068);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

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
            if ( state.backtracking>0 ) { memoize(input, 21, conditionalXorExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalXorExpression"



    // $ANTLR start "relationalExpression"
    // StateMachine.g:177:1: relationalExpression returns [ASTExpression expr] : nAddExpr= additiveExpression (operator= relationalOp n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression expr = null;

        int relationalExpression_StartIndex = input.index();

        ASTExpression nAddExpr =null;

        Token operator =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return expr; }

            // StateMachine.g:178:5: (nAddExpr= additiveExpression (operator= relationalOp n1= additiveExpression )* )
            // StateMachine.g:178:7: nAddExpr= additiveExpression (operator= relationalOp n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1112);
            nAddExpr=additiveExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nAddExpr;}

            // StateMachine.g:179:9: (operator= relationalOp n1= additiveExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0 >= GREATER && LA21_0 <= GREATER_EQUAL)||(LA21_0 >= LESS && LA21_0 <= LESS_EQUAL)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // StateMachine.g:180:13: operator= relationalOp n1= additiveExpression
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression1140);
            	    operator=relationalOp();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1144);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

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
            if ( state.backtracking>0 ) { memoize(input, 22, relationalExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "relationalExpression"



    // $ANTLR start "relationalOp"
    // StateMachine.g:185:1: relationalOp returns [Token token] : (t= '<=' |t= '>=' |t= '<' |t= '>' );
    public final Token relationalOp() throws RecognitionException {
        Token token = null;

        int relationalOp_StartIndex = input.index();

        Token t=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return token; }

            // StateMachine.g:186:5: (t= '<=' |t= '>=' |t= '<' |t= '>' )
            int alt22=4;
            switch ( input.LA(1) ) {
            case LESS_EQUAL:
                {
                alt22=1;
                }
                break;
            case GREATER_EQUAL:
                {
                alt22=2;
                }
                break;
            case LESS:
                {
                alt22=3;
                }
                break;
            case GREATER:
                {
                alt22=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return token;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // StateMachine.g:186:10: t= '<='
                    {
                    t=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_relationalOp1191); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:187:10: t= '>='
                    {
                    t=(Token)match(input,GREATER_EQUAL,FOLLOW_GREATER_EQUAL_in_relationalOp1206); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 3 :
                    // StateMachine.g:188:10: t= '<'
                    {
                    t=(Token)match(input,LESS,FOLLOW_LESS_in_relationalOp1221); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 4 :
                    // StateMachine.g:189:10: t= '>'
                    {
                    t=(Token)match(input,GREATER,FOLLOW_GREATER_in_relationalOp1237); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

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
            if ( state.backtracking>0 ) { memoize(input, 23, relationalOp_StartIndex); }

        }
        return token;
    }
    // $ANTLR end "relationalOp"



    // $ANTLR start "additiveExpression"
    // StateMachine.g:192:1: additiveExpression returns [ASTExpression expr] : nMulExpr= multiplicativeExpression (operator= ( '+' | '-' ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression expr = null;

        int additiveExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nMulExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return expr; }

            // StateMachine.g:193:5: (nMulExpr= multiplicativeExpression (operator= ( '+' | '-' ) n1= multiplicativeExpression )* )
            // StateMachine.g:193:9: nMulExpr= multiplicativeExpression (operator= ( '+' | '-' ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1265);
            nMulExpr=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nMulExpr;}

            // StateMachine.g:194:9: (operator= ( '+' | '-' ) n1= multiplicativeExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==MINUS||LA23_0==PLUS) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // StateMachine.g:195:13: operator= ( '+' | '-' ) n1= multiplicativeExpression
            	    {
            	    operator=(Token)input.LT(1);

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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1306);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

            	    }
            	    break;

            	default :
            	    break loop23;
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
            if ( state.backtracking>0 ) { memoize(input, 24, additiveExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // StateMachine.g:200:1: multiplicativeExpression returns [ASTExpression expr] : nUnrExpr= unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression expr = null;

        int multiplicativeExpression_StartIndex = input.index();

        ASTExpression nUnrExpr =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return expr; }

            // StateMachine.g:201:5: (nUnrExpr= unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            // StateMachine.g:202:9: nUnrExpr= unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1362);
            nUnrExpr=unaryExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nUnrExpr;}

            // StateMachine.g:203:9: ( ( '*' | '/' | '%' ) unaryExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==SLASH||LA24_0==STAR||LA24_0==66) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // StateMachine.g:204:13: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==66 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return expr;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1459);
            	    unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    }
            	    break;

            	default :
            	    break loop24;
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
            if ( state.backtracking>0 ) { memoize(input, 25, multiplicativeExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // StateMachine.g:212:1: unaryExpression returns [ASTExpression expr] : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression |nUnrExprOther= unaryExpressionNotPlusMinus );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression expr = null;

        int unaryExpression_StartIndex = input.index();

        ASTExpression nUnrExprOther =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return expr; }

            // StateMachine.g:213:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression |nUnrExprOther= unaryExpressionNotPlusMinus )
            int alt25=5;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt25=1;
                }
                break;
            case MINUS:
                {
                alt25=2;
                }
                break;
            case 68:
                {
                alt25=3;
                }
                break;
            case 69:
                {
                alt25=4;
                }
                break;
            case BOOLLITERAL:
            case CHARLITERAL:
            case IDENT:
            case INTLITERAL:
            case LPAREN:
            case REALLITERAL:
            case STRINGLITERAL:
            case 65:
                {
                alt25=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // StateMachine.g:213:9: '+' unaryExpression
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_unaryExpression1493); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1495);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 2 :
                    // StateMachine.g:214:9: '-' unaryExpression
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_unaryExpression1505); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1507);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 3 :
                    // StateMachine.g:215:9: '++' unaryExpression
                    {
                    match(input,68,FOLLOW_68_in_unaryExpression1517); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1519);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 4 :
                    // StateMachine.g:216:9: '--' unaryExpression
                    {
                    match(input,69,FOLLOW_69_in_unaryExpression1529); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1531);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 5 :
                    // StateMachine.g:217:9: nUnrExprOther= unaryExpressionNotPlusMinus
                    {
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1543);
                    nUnrExprOther=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =nUnrExprOther;}

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
            if ( state.backtracking>0 ) { memoize(input, 26, unaryExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "unaryExpression"



    // $ANTLR start "unaryExpressionNotPlusMinus"
    // StateMachine.g:220:1: unaryExpressionNotPlusMinus returns [ASTExpression expr] : ( '!' UnrExpr= unaryExpression |nPriExpr= primary );
    public final ASTExpression unaryExpressionNotPlusMinus() throws RecognitionException {
        ASTExpression expr = null;

        int unaryExpressionNotPlusMinus_StartIndex = input.index();

        ASTExpression UnrExpr =null;

        ASTExpression nPriExpr =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return expr; }

            // StateMachine.g:221:5: ( '!' UnrExpr= unaryExpression |nPriExpr= primary )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==65) ) {
                alt26=1;
            }
            else if ( (LA26_0==BOOLLITERAL||LA26_0==CHARLITERAL||LA26_0==IDENT||LA26_0==INTLITERAL||LA26_0==LPAREN||LA26_0==REALLITERAL||LA26_0==STRINGLITERAL) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // StateMachine.g:221:9: '!' UnrExpr= unaryExpression
                    {
                    match(input,65,FOLLOW_65_in_unaryExpressionNotPlusMinus1568); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1572);
                    UnrExpr=unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =UnrExpr;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:222:9: nPriExpr= primary
                    {
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus1586);
                    nPriExpr=primary();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =nPriExpr;}

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
            if ( state.backtracking>0 ) { memoize(input, 27, unaryExpressionNotPlusMinus_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"



    // $ANTLR start "primary"
    // StateMachine.g:225:1: primary returns [ASTExpression expr] : (pExpr= parExpression |id= identifier |nLiteralExpr= literal );
    public final ASTExpression primary() throws RecognitionException {
        ASTExpression expr = null;

        int primary_StartIndex = input.index();

        ASTExpression pExpr =null;

        ASTExpression id =null;

        ASTLiteral nLiteralExpr =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return expr; }

            // StateMachine.g:226:5: (pExpr= parExpression |id= identifier |nLiteralExpr= literal )
            int alt27=3;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt27=1;
                }
                break;
            case IDENT:
                {
                alt27=2;
                }
                break;
            case BOOLLITERAL:
            case CHARLITERAL:
            case INTLITERAL:
            case REALLITERAL:
            case STRINGLITERAL:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // StateMachine.g:226:9: pExpr= parExpression
                    {
                    pushFollow(FOLLOW_parExpression_in_primary1613);
                    pExpr=parExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =pExpr;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:227:9: id= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_primary1627);
                    id=identifier();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =id;}

                    }
                    break;
                case 3 :
                    // StateMachine.g:228:9: nLiteralExpr= literal
                    {
                    pushFollow(FOLLOW_literal_in_primary1641);
                    nLiteralExpr=literal();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =nLiteralExpr;}

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
            if ( state.backtracking>0 ) { memoize(input, 28, primary_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "primary"



    // $ANTLR start "parExpression"
    // StateMachine.g:231:1: parExpression returns [ASTExpression expr] : '(' e= expression ')' ;
    public final ASTExpression parExpression() throws RecognitionException {
        ASTExpression expr = null;

        int parExpression_StartIndex = input.index();

        ASTExpression e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return expr; }

            // StateMachine.g:232:5: ( '(' e= expression ')' )
            // StateMachine.g:232:9: '(' e= expression ')'
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_parExpression1666); if (state.failed) return expr;

            pushFollow(FOLLOW_expression_in_parExpression1670);
            e=expression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =e;}

            match(input,RPAREN,FOLLOW_RPAREN_in_parExpression1674); if (state.failed) return expr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, parExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "parExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_MACHINE_in_machine76 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_machine80 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LBRACE_in_machine84 = new BitSet(new long[]{0x2E05000280440080L});
    public static final BitSet FOLLOW_globalVariableDecl_in_machine97 = new BitSet(new long[]{0x2E05000280440080L});
    public static final BitSet FOLLOW_state_in_machine112 = new BitSet(new long[]{0x2601000200400000L});
    public static final BitSet FOLLOW_trans_in_machine117 = new BitSet(new long[]{0x2001000200000000L});
    public static final BitSet FOLLOW_invariantExpression_in_machine130 = new BitSet(new long[]{0x0001000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_machine138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_machine140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stateModifier_in_state153 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_STATE_in_state158 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_state160 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LBRACE_in_state162 = new BitSet(new long[]{0x180D8501A0040580L,0x0000000000000032L});
    public static final BitSet FOLLOW_localVariableDecl_in_state173 = new BitSet(new long[]{0x180D8501A0040580L,0x0000000000000032L});
    public static final BitSet FOLLOW_expression_in_state186 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SEMI_in_state188 = new BitSet(new long[]{0x1009850120000500L,0x0000000000000032L});
    public static final BitSet FOLLOW_RBRACE_in_state196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANS_in_trans204 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_trans206 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LBRACE_in_trans208 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_trans218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARROW_in_trans220 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_trans222 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ON_in_trans224 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_label_in_trans226 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_trans232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVARIANT_in_invariantExpression244 = new BitSet(new long[]{0x0000001020000000L});
    public static final BitSet FOLLOW_identifier_in_invariantExpression256 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LBRACE_in_invariantExpression266 = new BitSet(new long[]{0x1008850120000500L,0x0000000000000032L});
    public static final BitSet FOLLOW_expression_in_invariantExpression278 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SEMI_in_invariantExpression280 = new BitSet(new long[]{0x1009850120000500L,0x0000000000000032L});
    public static final BitSet FOLLOW_RBRACE_in_invariantExpression289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_label301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identifier319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_literal365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REALLITERAL_in_literal377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLLITERAL_in_literal389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literal401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literal413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_globalVariableDecl433 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_globalVariableDecl437 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SEMI_in_globalVariableDecl445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_localVariableDecl458 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDecl460 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SEMI_in_localVariableDecl466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumType_in_type530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primitiveType559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_primitiveType569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primitiveType580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumType599 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enumType603 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_enumType607 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_COMMA_in_enumType617 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_enumType621 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_enumType627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclarator651 = new BitSet(new long[]{0x4000000000100002L});
    public static final BitSet FOLLOW_EQUAL_in_variableDeclarator660 = new BitSet(new long[]{0x1008850120000500L,0x0000000000000032L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator664 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_variableDeclarator676 = new BitSet(new long[]{0x1008850120000500L,0x0000000000000032L});
    public static final BitSet FOLLOW_expression_in_variableDeclarator678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression734 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_EQUAL_in_expression747 = new BitSet(new long[]{0x1008850120000500L,0x0000000000000032L});
    public static final BitSet FOLLOW_expression_in_expression751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression788 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_IMPLIES_in_conditionalImpliesExpression816 = new BitSet(new long[]{0x1008850120000500L,0x0000000000000032L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression820 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression867 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_conditionalOrExpression895 = new BitSet(new long[]{0x1008850120000500L,0x0000000000000032L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression899 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_conditionalXorExpression_in_conditionalAndExpression949 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_conditionalAndExpression979 = new BitSet(new long[]{0x1008850120000500L,0x0000000000000032L});
    public static final BitSet FOLLOW_conditionalXorExpression_in_conditionalAndExpression983 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_relationalExpression_in_conditionalXorExpression1036 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_XOR_in_conditionalXorExpression1064 = new BitSet(new long[]{0x1008850120000500L,0x0000000000000032L});
    public static final BitSet FOLLOW_relationalExpression_in_conditionalXorExpression1068 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1112 = new BitSet(new long[]{0x000000C006000002L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression1140 = new BitSet(new long[]{0x1008850120000500L,0x0000000000000032L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1144 = new BitSet(new long[]{0x000000C006000002L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_relationalOp1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_EQUAL_in_relationalOp1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_relationalOp1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_relationalOp1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1265 = new BitSet(new long[]{0x0000840000000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1296 = new BitSet(new long[]{0x1008850120000500L,0x0000000000000032L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1306 = new BitSet(new long[]{0x0000840000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1362 = new BitSet(new long[]{0x0140000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1391 = new BitSet(new long[]{0x1008850120000500L,0x0000000000000032L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1459 = new BitSet(new long[]{0x0140000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression1493 = new BitSet(new long[]{0x1008850120000500L,0x0000000000000032L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression1505 = new BitSet(new long[]{0x1008850120000500L,0x0000000000000032L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_unaryExpression1517 = new BitSet(new long[]{0x1008850120000500L,0x0000000000000032L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_unaryExpression1529 = new BitSet(new long[]{0x1008850120000500L,0x0000000000000032L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_unaryExpressionNotPlusMinus1568 = new BitSet(new long[]{0x1008850120000500L,0x0000000000000032L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_primary1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression1666 = new BitSet(new long[]{0x1008850120000500L,0x0000000000000032L});
    public static final BitSet FOLLOW_expression_in_parExpression1670 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression1674 = new BitSet(new long[]{0x0000000000000002L});

}