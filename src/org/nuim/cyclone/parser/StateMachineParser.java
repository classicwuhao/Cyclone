// $ANTLR 3.4 StateMachine.g 2020-07-29 14:52:04

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ARROW", "AT", "BAR", "BOOL", "BOOLLITERAL", "CHAR", "CHARLITERAL", "CHECK", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "ENUM", "ENUMLITERAL", "EQUAL", "EscapeSequence", "FINAL", "FOR", "GOAL", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "IMPLIES", "INT", "INTLITERAL", "INVARIANT", "IdentifierPart", "IdentifierStart", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MACHINE", "MINUS", "ML_COMMENT", "NEWLINE", "NORMAL", "NOT", "NOT_EQUAL", "ON", "PLUS", "PREV", "RBRACE", "RBRACK", "REAL", "REALLITERAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "START", "STATE", "STRING", "STRINGLITERAL", "TRANS", "WHERE", "WS", "XOR", "'%'", "'&&'", "'*='", "'++'", "'+='", "'--'", "'-='", "'/='", "'=='", "'global'", "'native'", "'||'"
    };

    public static final int EOF=-1;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int ABSTRACT=4;
    public static final int ARROW=5;
    public static final int AT=6;
    public static final int BAR=7;
    public static final int BOOL=8;
    public static final int BOOLLITERAL=9;
    public static final int CHAR=10;
    public static final int CHARLITERAL=11;
    public static final int CHECK=12;
    public static final int COLON=13;
    public static final int COLON_COLON=14;
    public static final int COLON_EQUAL=15;
    public static final int COMMA=16;
    public static final int DOT=17;
    public static final int DOTDOT=18;
    public static final int ENUM=19;
    public static final int ENUMLITERAL=20;
    public static final int EQUAL=21;
    public static final int EscapeSequence=22;
    public static final int FINAL=23;
    public static final int FOR=24;
    public static final int GOAL=25;
    public static final int GREATER=26;
    public static final int GREATER_EQUAL=27;
    public static final int HASH=28;
    public static final int HEX_DIGIT=29;
    public static final int IDENT=30;
    public static final int IMPLIES=31;
    public static final int INT=32;
    public static final int INTLITERAL=33;
    public static final int INVARIANT=34;
    public static final int IdentifierPart=35;
    public static final int IdentifierStart=36;
    public static final int LBRACE=37;
    public static final int LBRACK=38;
    public static final int LESS=39;
    public static final int LESS_EQUAL=40;
    public static final int LPAREN=41;
    public static final int MACHINE=42;
    public static final int MINUS=43;
    public static final int ML_COMMENT=44;
    public static final int NEWLINE=45;
    public static final int NORMAL=46;
    public static final int NOT=47;
    public static final int NOT_EQUAL=48;
    public static final int ON=49;
    public static final int PLUS=50;
    public static final int PREV=51;
    public static final int RBRACE=52;
    public static final int RBRACK=53;
    public static final int REAL=54;
    public static final int REALLITERAL=55;
    public static final int RPAREN=56;
    public static final int SEMI=57;
    public static final int SLASH=58;
    public static final int SL_COMMENT=59;
    public static final int STAR=60;
    public static final int START=61;
    public static final int STATE=62;
    public static final int STRING=63;
    public static final int STRINGLITERAL=64;
    public static final int TRANS=65;
    public static final int WHERE=66;
    public static final int WS=67;
    public static final int XOR=68;

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
        this.state.ruleMemo = new HashMap[89+1];
         

    }

    public String[] getTokenNames() { return StateMachineParser.tokenNames; }
    public String getGrammarFileName() { return "StateMachine.g"; }



    // $ANTLR start "machine"
    // StateMachine.g:46:1: machine returns [ASTMachine machine] : MACHINE name= identifier LBRACE (v= globalVariableDecl )* (s= state )* ( trans )* ( invariantExpression )* RBRACE EOF ;
    public final ASTMachine machine() throws RecognitionException {
        ASTMachine machine = null;

        int machine_StartIndex = input.index();

        ASTIdentifier name =null;

        ASTVariable v =null;

        ASTState s =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return machine; }

            // StateMachine.g:46:37: ( MACHINE name= identifier LBRACE (v= globalVariableDecl )* (s= state )* ( trans )* ( invariantExpression )* RBRACE EOF )
            // StateMachine.g:48:5: MACHINE name= identifier LBRACE (v= globalVariableDecl )* (s= state )* ( trans )* ( invariantExpression )* RBRACE EOF
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


            // StateMachine.g:50:9: (s= state )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ABSTRACT||LA2_0==FINAL||LA2_0==NORMAL||(LA2_0 >= START && LA2_0 <= STATE)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // StateMachine.g:50:10: s= state
            	    {
            	    pushFollow(FOLLOW_state_in_machine114);
            	    s=state();

            	    state._fsp--;
            	    if (state.failed) return machine;

            	    if ( state.backtracking==0 ) {machine.addState(s);}

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // StateMachine.g:50:45: ( trans )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==TRANS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // StateMachine.g:50:46: trans
            	    {
            	    pushFollow(FOLLOW_trans_in_machine122);
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
            	    pushFollow(FOLLOW_invariantExpression_in_machine135);
            	    invariantExpression();

            	    state._fsp--;
            	    if (state.failed) return machine;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_machine143); if (state.failed) return machine;

            match(input,EOF,FOLLOW_EOF_in_machine145); if (state.failed) return machine;

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
    // StateMachine.g:55:1: state returns [ASTState aststate] : (m= stateModifier )* STATE e= identifier LBRACE (v= localVariableDecl )* (expr= expression SEMI )* RBRACE ;
    public final ASTState state() throws RecognitionException {
        ASTState aststate = null;

        int state_StartIndex = input.index();

        ASTStateModifier m =null;

        ASTIdentifier e =null;

        ASTVariable v =null;

        ASTExpression expr =null;



            aststate =new ASTState();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return aststate; }

            // StateMachine.g:59:5: ( (m= stateModifier )* STATE e= identifier LBRACE (v= localVariableDecl )* (expr= expression SEMI )* RBRACE )
            // StateMachine.g:60:5: (m= stateModifier )* STATE e= identifier LBRACE (v= localVariableDecl )* (expr= expression SEMI )* RBRACE
            {
            // StateMachine.g:60:5: (m= stateModifier )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ABSTRACT||LA5_0==FINAL||LA5_0==NORMAL||LA5_0==START) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // StateMachine.g:60:6: m= stateModifier
            	    {
            	    pushFollow(FOLLOW_stateModifier_in_state169);
            	    m=stateModifier();

            	    state._fsp--;
            	    if (state.failed) return aststate;

            	    if ( state.backtracking==0 ) { 
            	                try{
            	                    aststate.setModifier(m);
            	                }
            	                catch (SemanticException exception){
            	                    System.err.println(exception.getMessage());
            	                }
            	            }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            if ( state.backtracking==0 ) {
                    try{
                        if (!aststate.isModifierSet()) 
                            aststate.setModifier(ASTStateModifier.NORMAL);
                    }
                    catch (SemanticException exception){System.err.println(exception.getMessage());}
                }

            match(input,STATE,FOLLOW_STATE_in_state199); if (state.failed) return aststate;

            pushFollow(FOLLOW_identifier_in_state203);
            e=identifier();

            state._fsp--;
            if (state.failed) return aststate;

            if ( state.backtracking==0 ) {aststate.setName(e.identifier());aststate.setToken(e.token());}

            match(input,LBRACE,FOLLOW_LBRACE_in_state207); if (state.failed) return aststate;

            // StateMachine.g:78:9: (v= localVariableDecl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==BOOL||LA6_0==ENUM||LA6_0==INT||LA6_0==REAL||LA6_0==STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // StateMachine.g:78:10: v= localVariableDecl
            	    {
            	    pushFollow(FOLLOW_localVariableDecl_in_state220);
            	    v=localVariableDecl();

            	    state._fsp--;
            	    if (state.failed) return aststate;

            	    if ( state.backtracking==0 ) {aststate.addVar(v);}

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // StateMachine.g:79:9: (expr= expression SEMI )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==BOOLLITERAL||LA7_0==CHARLITERAL||LA7_0==IDENT||LA7_0==INTLITERAL||LA7_0==LPAREN||LA7_0==MINUS||LA7_0==NOT||(LA7_0 >= PLUS && LA7_0 <= PREV)||LA7_0==REALLITERAL||LA7_0==STRINGLITERAL||LA7_0==72||LA7_0==74) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // StateMachine.g:79:10: expr= expression SEMI
            	    {
            	    pushFollow(FOLLOW_expression_in_state239);
            	    expr=expression();

            	    state._fsp--;
            	    if (state.failed) return aststate;

            	    match(input,SEMI,FOLLOW_SEMI_in_state241); if (state.failed) return aststate;

            	    if ( state.backtracking==0 ) {aststate.addExpr(expr);}

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_state252); if (state.failed) return aststate;

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
        return aststate;
    }
    // $ANTLR end "state"



    // $ANTLR start "trans"
    // StateMachine.g:83:1: trans : TRANS identifier LBRACE identifier ARROW identifier ON label ( WHERE expression )? RBRACE ;
    public final void trans() throws RecognitionException {
        int trans_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }

            // StateMachine.g:83:6: ( TRANS identifier LBRACE identifier ARROW identifier ON label ( WHERE expression )? RBRACE )
            // StateMachine.g:83:8: TRANS identifier LBRACE identifier ARROW identifier ON label ( WHERE expression )? RBRACE
            {
            match(input,TRANS,FOLLOW_TRANS_in_trans260); if (state.failed) return ;

            pushFollow(FOLLOW_identifier_in_trans262);
            identifier();

            state._fsp--;
            if (state.failed) return ;

            match(input,LBRACE,FOLLOW_LBRACE_in_trans264); if (state.failed) return ;

            pushFollow(FOLLOW_identifier_in_trans274);
            identifier();

            state._fsp--;
            if (state.failed) return ;

            match(input,ARROW,FOLLOW_ARROW_in_trans276); if (state.failed) return ;

            pushFollow(FOLLOW_identifier_in_trans278);
            identifier();

            state._fsp--;
            if (state.failed) return ;

            match(input,ON,FOLLOW_ON_in_trans280); if (state.failed) return ;

            pushFollow(FOLLOW_label_in_trans282);
            label();

            state._fsp--;
            if (state.failed) return ;

            // StateMachine.g:84:46: ( WHERE expression )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==WHERE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // StateMachine.g:84:47: WHERE expression
                    {
                    match(input,WHERE,FOLLOW_WHERE_in_trans285); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_trans287);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_trans295); if (state.failed) return ;

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
    // StateMachine.g:88:1: invariantExpression : INVARIANT ( identifier )? LBRACE ( expression SEMI )+ RBRACE ( FOR LBRACE identifier ( COMMA identifier )* RBRACE )? ;
    public final void invariantExpression() throws RecognitionException {
        int invariantExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }

            // StateMachine.g:88:20: ( INVARIANT ( identifier )? LBRACE ( expression SEMI )+ RBRACE ( FOR LBRACE identifier ( COMMA identifier )* RBRACE )? )
            // StateMachine.g:89:5: INVARIANT ( identifier )? LBRACE ( expression SEMI )+ RBRACE ( FOR LBRACE identifier ( COMMA identifier )* RBRACE )?
            {
            match(input,INVARIANT,FOLLOW_INVARIANT_in_invariantExpression307); if (state.failed) return ;

            // StateMachine.g:90:9: ( identifier )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDENT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // StateMachine.g:90:10: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_invariantExpression319);
                    identifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,LBRACE,FOLLOW_LBRACE_in_invariantExpression329); if (state.failed) return ;

            // StateMachine.g:92:9: ( expression SEMI )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==BOOLLITERAL||LA10_0==CHARLITERAL||LA10_0==IDENT||LA10_0==INTLITERAL||LA10_0==LPAREN||LA10_0==MINUS||LA10_0==NOT||(LA10_0 >= PLUS && LA10_0 <= PREV)||LA10_0==REALLITERAL||LA10_0==STRINGLITERAL||LA10_0==72||LA10_0==74) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // StateMachine.g:92:10: expression SEMI
            	    {
            	    pushFollow(FOLLOW_expression_in_invariantExpression341);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    match(input,SEMI,FOLLOW_SEMI_in_invariantExpression343); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_invariantExpression352); if (state.failed) return ;

            // StateMachine.g:95:5: ( FOR LBRACE identifier ( COMMA identifier )* RBRACE )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==FOR) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // StateMachine.g:95:6: FOR LBRACE identifier ( COMMA identifier )* RBRACE
                    {
                    match(input,FOR,FOLLOW_FOR_in_invariantExpression364); if (state.failed) return ;

                    match(input,LBRACE,FOLLOW_LBRACE_in_invariantExpression366); if (state.failed) return ;

                    pushFollow(FOLLOW_identifier_in_invariantExpression368);
                    identifier();

                    state._fsp--;
                    if (state.failed) return ;

                    // StateMachine.g:95:28: ( COMMA identifier )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // StateMachine.g:95:29: COMMA identifier
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_invariantExpression371); if (state.failed) return ;

                    	    pushFollow(FOLLOW_identifier_in_invariantExpression373);
                    	    identifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    match(input,RBRACE,FOLLOW_RBRACE_in_invariantExpression377); if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 4, invariantExpression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "invariantExpression"



    // $ANTLR start "label"
    // StateMachine.g:98:1: label : STRINGLITERAL ;
    public final void label() throws RecognitionException {
        int label_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }

            // StateMachine.g:98:6: ( STRINGLITERAL )
            // StateMachine.g:99:5: STRINGLITERAL
            {
            match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_label391); if (state.failed) return ;

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
    // StateMachine.g:102:1: identifier returns [ASTIdentifier expr] : str= IDENT ;
    public final ASTIdentifier identifier() throws RecognitionException {
        ASTIdentifier expr = null;

        int identifier_StartIndex = input.index();

        Token str=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return expr; }

            // StateMachine.g:102:40: (str= IDENT )
            // StateMachine.g:103:5: str= IDENT
            {
            str=(Token)match(input,IDENT,FOLLOW_IDENT_in_identifier409); if (state.failed) return expr;

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
    // StateMachine.g:106:1: stateModifier returns [ASTStateModifier modifier] : ( START | FINAL | ABSTRACT | NORMAL );
    public final ASTStateModifier stateModifier() throws RecognitionException {
        ASTStateModifier modifier = null;

        int stateModifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return modifier; }

            // StateMachine.g:106:50: ( START | FINAL | ABSTRACT | NORMAL )
            int alt13=4;
            switch ( input.LA(1) ) {
            case START:
                {
                alt13=1;
                }
                break;
            case FINAL:
                {
                alt13=2;
                }
                break;
            case ABSTRACT:
                {
                alt13=3;
                }
                break;
            case NORMAL:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return modifier;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // StateMachine.g:107:7: START
                    {
                    match(input,START,FOLLOW_START_in_stateModifier430); if (state.failed) return modifier;

                    if ( state.backtracking==0 ) {modifier =ASTStateModifier.START;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:108:7: FINAL
                    {
                    match(input,FINAL,FOLLOW_FINAL_in_stateModifier440); if (state.failed) return modifier;

                    if ( state.backtracking==0 ) {modifier =ASTStateModifier.FINAL;}

                    }
                    break;
                case 3 :
                    // StateMachine.g:109:7: ABSTRACT
                    {
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_stateModifier450); if (state.failed) return modifier;

                    if ( state.backtracking==0 ) {modifier =ASTStateModifier.ABSTRACT;}

                    }
                    break;
                case 4 :
                    // StateMachine.g:110:7: NORMAL
                    {
                    match(input,NORMAL,FOLLOW_NORMAL_in_stateModifier460); if (state.failed) return modifier;

                    if ( state.backtracking==0 ) {modifier =ASTStateModifier.NORMAL;}

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
            if ( state.backtracking>0 ) { memoize(input, 7, stateModifier_StartIndex); }

        }
        return modifier;
    }
    // $ANTLR end "stateModifier"



    // $ANTLR start "literal"
    // StateMachine.g:113:1: literal returns [ASTLiteral literal_node] : (l= INTLITERAL |r= REALLITERAL |b= BOOLLITERAL |s= STRINGLITERAL |c= CHARLITERAL );
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

            // StateMachine.g:113:42: (l= INTLITERAL |r= REALLITERAL |b= BOOLLITERAL |s= STRINGLITERAL |c= CHARLITERAL )
            int alt14=5;
            switch ( input.LA(1) ) {
            case INTLITERAL:
                {
                alt14=1;
                }
                break;
            case REALLITERAL:
                {
                alt14=2;
                }
                break;
            case BOOLLITERAL:
                {
                alt14=3;
                }
                break;
            case STRINGLITERAL:
                {
                alt14=4;
                }
                break;
            case CHARLITERAL:
                {
                alt14=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return literal_node;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // StateMachine.g:114:7: l= INTLITERAL
                    {
                    l=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literal482); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.INT,l);}

                    }
                    break;
                case 2 :
                    // StateMachine.g:115:7: r= REALLITERAL
                    {
                    r=(Token)match(input,REALLITERAL,FOLLOW_REALLITERAL_in_literal494); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.REAL,r);}

                    }
                    break;
                case 3 :
                    // StateMachine.g:116:7: b= BOOLLITERAL
                    {
                    b=(Token)match(input,BOOLLITERAL,FOLLOW_BOOLLITERAL_in_literal506); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.BOOL,b);}

                    }
                    break;
                case 4 :
                    // StateMachine.g:117:7: s= STRINGLITERAL
                    {
                    s=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literal518); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.STRING,s);}

                    }
                    break;
                case 5 :
                    // StateMachine.g:118:7: c= CHARLITERAL
                    {
                    c=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literal530); if (state.failed) return literal_node;

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
    // StateMachine.g:121:1: globalVariableDecl returns [ASTVariable v] : t= type n= variableDeclarator SEMI ;
    public final ASTVariable globalVariableDecl() throws RecognitionException {
        ASTVariable v = null;

        int globalVariableDecl_StartIndex = input.index();

        Type t =null;

        ASTVariable n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return v; }

            // StateMachine.g:121:43: (t= type n= variableDeclarator SEMI )
            // StateMachine.g:122:5: t= type n= variableDeclarator SEMI
            {
            pushFollow(FOLLOW_type_in_globalVariableDecl550);
            t=type();

            state._fsp--;
            if (state.failed) return v;

            pushFollow(FOLLOW_variableDeclarator_in_globalVariableDecl554);
            n=variableDeclarator();

            state._fsp--;
            if (state.failed) return v;

            if ( state.backtracking==0 ) {n.type=t;n.createVariable();v =n;}

            match(input,SEMI,FOLLOW_SEMI_in_globalVariableDecl562); if (state.failed) return v;

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
    // StateMachine.g:126:1: localVariableDecl returns [ASTVariable v] : t= type n= variableDeclarator SEMI ;
    public final ASTVariable localVariableDecl() throws RecognitionException {
        ASTVariable v = null;

        int localVariableDecl_StartIndex = input.index();

        Type t =null;

        ASTVariable n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return v; }

            // StateMachine.g:126:42: (t= type n= variableDeclarator SEMI )
            // StateMachine.g:127:5: t= type n= variableDeclarator SEMI
            {
            pushFollow(FOLLOW_type_in_localVariableDecl580);
            t=type();

            state._fsp--;
            if (state.failed) return v;

            pushFollow(FOLLOW_variableDeclarator_in_localVariableDecl584);
            n=variableDeclarator();

            state._fsp--;
            if (state.failed) return v;

            if ( state.backtracking==0 ) {n.type=t;n.createVariable();v =n;}

            match(input,SEMI,FOLLOW_SEMI_in_localVariableDecl592); if (state.failed) return v;

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
        return v;
    }
    // $ANTLR end "localVariableDecl"



    // $ANTLR start "modifier"
    // StateMachine.g:131:1: modifier : ( 'global' | 'native' );
    public final void modifier() throws RecognitionException {
        int modifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }

            // StateMachine.g:131:10: ( 'global' | 'native' )
            // StateMachine.g:
            {
            if ( (input.LA(1) >= 78 && input.LA(1) <= 79) ) {
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
    // StateMachine.g:136:1: type returns [Type t] : (p= primitiveType |e= enumType );
    public final Type type() throws RecognitionException {
        Type t = null;

        int type_StartIndex = input.index();

        Type p =null;

        EnumType e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return t; }

            // StateMachine.g:136:23: (p= primitiveType |e= enumType )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==BOOL||LA15_0==INT||LA15_0==REAL||LA15_0==STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==ENUM) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // StateMachine.g:137:9: p= primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type642);
                    p=primitiveType();

                    state._fsp--;
                    if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =p;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:138:9: e= enumType
                    {
                    pushFollow(FOLLOW_enumType_in_type656);
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
    // StateMachine.g:141:1: primitiveType returns [Type t] : ( INT | BOOL | REAL | STRING );
    public final Type primitiveType() throws RecognitionException {
        Type t = null;

        int primitiveType_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return t; }

            // StateMachine.g:141:31: ( INT | BOOL | REAL | STRING )
            int alt16=4;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt16=1;
                }
                break;
            case BOOL:
                {
                alt16=2;
                }
                break;
            case REAL:
                {
                alt16=3;
                }
                break;
            case STRING:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // StateMachine.g:142:7: INT
                    {
                    match(input,INT,FOLLOW_INT_in_primitiveType675); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t = new IntType();}

                    }
                    break;
                case 2 :
                    // StateMachine.g:143:7: BOOL
                    {
                    match(input,BOOL,FOLLOW_BOOL_in_primitiveType685); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =new BoolType();}

                    }
                    break;
                case 3 :
                    // StateMachine.g:144:7: REAL
                    {
                    match(input,REAL,FOLLOW_REAL_in_primitiveType695); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =new RealType();}

                    }
                    break;
                case 4 :
                    // StateMachine.g:145:7: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_primitiveType706); if (state.failed) return t;

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
    // StateMachine.g:148:1: enumType returns [EnumType t] : ENUM LBRACE name= identifier ( COMMA l= identifier )* RBRACE ;
    public final EnumType enumType() throws RecognitionException {
        EnumType t = null;

        int enumType_StartIndex = input.index();

        ASTIdentifier name =null;

        ASTIdentifier l =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return t; }

            // StateMachine.g:148:31: ( ENUM LBRACE name= identifier ( COMMA l= identifier )* RBRACE )
            // StateMachine.g:149:5: ENUM LBRACE name= identifier ( COMMA l= identifier )* RBRACE
            {
            match(input,ENUM,FOLLOW_ENUM_in_enumType725); if (state.failed) return t;

            if ( state.backtracking==0 ) {t =new EnumType();}

            match(input,LBRACE,FOLLOW_LBRACE_in_enumType729); if (state.failed) return t;

            pushFollow(FOLLOW_identifier_in_enumType733);
            name=identifier();

            state._fsp--;
            if (state.failed) return t;

            if ( state.backtracking==0 ) {t.add(name.toString());}

            // StateMachine.g:150:5: ( COMMA l= identifier )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // StateMachine.g:150:6: COMMA l= identifier
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_enumType743); if (state.failed) return t;

            	    pushFollow(FOLLOW_identifier_in_enumType747);
            	    l=identifier();

            	    state._fsp--;
            	    if (state.failed) return t;

            	    if ( state.backtracking==0 ) {t.add(l.toString());}

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_enumType753); if (state.failed) return t;

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
    // StateMachine.g:153:1: variableDeclarator returns [ASTVariable var] :n= identifier ( '=' n= variableInitializer )? ( WHERE e= expression )? ;
    public final ASTVariable variableDeclarator() throws RecognitionException {
        ASTVariable var = null;

        int variableDeclarator_StartIndex = input.index();

        ASTExpression n =null;

        ASTExpression e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return var; }

            // StateMachine.g:153:45: (n= identifier ( '=' n= variableInitializer )? ( WHERE e= expression )? )
            // StateMachine.g:154:5: n= identifier ( '=' n= variableInitializer )? ( WHERE e= expression )?
            {
            if ( state.backtracking==0 ) {var =new ASTVariable();}

            pushFollow(FOLLOW_identifier_in_variableDeclarator777);
            n=identifier();

            state._fsp--;
            if (state.failed) return var;

            if ( state.backtracking==0 ) {
                        var.name=n.toString();
                        var.setToken( ((ASTIdentifier)n).token());
                    }

            // StateMachine.g:160:5: ( '=' n= variableInitializer )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==EQUAL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // StateMachine.g:160:6: '=' n= variableInitializer
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_variableDeclarator795); if (state.failed) return var;

                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator799);
                    n=variableInitializer();

                    state._fsp--;
                    if (state.failed) return var;

                    if ( state.backtracking==0 ) {var.initializer=n;}

                    }
                    break;

            }


            // StateMachine.g:161:5: ( WHERE e= expression )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==WHERE) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // StateMachine.g:161:6: WHERE e= expression
                    {
                    match(input,WHERE,FOLLOW_WHERE_in_variableDeclarator811); if (state.failed) return var;

                    pushFollow(FOLLOW_expression_in_variableDeclarator815);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return var;

                    if ( state.backtracking==0 ) {var.constraint=e;}

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
    // StateMachine.g:164:1: variableInitializer returns [ASTExpression expr] : n= expression ;
    public final ASTExpression variableInitializer() throws RecognitionException {
        ASTExpression expr = null;

        int variableInitializer_StartIndex = input.index();

        ASTExpression n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return expr; }

            // StateMachine.g:164:49: (n= expression )
            // StateMachine.g:165:9: n= expression
            {
            pushFollow(FOLLOW_expression_in_variableInitializer843);
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
    // StateMachine.g:168:1: expression returns [ASTExpression expr] : nImpliesExpr= conditionalImpliesExpression (operator= assignmentOperator nExpr= expression )? ;
    public final ASTExpression expression() throws RecognitionException {
        ASTExpression expr = null;

        int expression_StartIndex = input.index();

        ASTExpression nImpliesExpr =null;

        Token operator =null;

        ASTExpression nExpr =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return expr; }

            // StateMachine.g:168:40: (nImpliesExpr= conditionalImpliesExpression (operator= assignmentOperator nExpr= expression )? )
            // StateMachine.g:169:9: nImpliesExpr= conditionalImpliesExpression (operator= assignmentOperator nExpr= expression )?
            {
            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression873);
            nImpliesExpr=conditionalImpliesExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nImpliesExpr;}

            // StateMachine.g:170:9: (operator= assignmentOperator nExpr= expression )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==EQUAL||LA20_0==71||LA20_0==73||(LA20_0 >= 75 && LA20_0 <= 76)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // StateMachine.g:171:13: operator= assignmentOperator nExpr= expression
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_expression902);
                    operator=assignmentOperator();

                    state._fsp--;
                    if (state.failed) return expr;

                    pushFollow(FOLLOW_expression_in_expression906);
                    nExpr=expression();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {
                                    expr =new ASTAssignment(operator,nImpliesExpr,nExpr);
                                }

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
    // StateMachine.g:178:1: assignmentOperator returns [Token token] : (t= '=' |t= '+=' |t= '-=' |t= '*=' |t= '/=' );
    public final Token assignmentOperator() throws RecognitionException {
        Token token = null;

        int assignmentOperator_StartIndex = input.index();

        Token t=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return token; }

            // StateMachine.g:179:5: (t= '=' |t= '+=' |t= '-=' |t= '*=' |t= '/=' )
            int alt21=5;
            switch ( input.LA(1) ) {
            case EQUAL:
                {
                alt21=1;
                }
                break;
            case 73:
                {
                alt21=2;
                }
                break;
            case 75:
                {
                alt21=3;
                }
                break;
            case 71:
                {
                alt21=4;
                }
                break;
            case 76:
                {
                alt21=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return token;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // StateMachine.g:179:9: t= '='
                    {
                    t=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assignmentOperator958); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:180:9: t= '+='
                    {
                    t=(Token)match(input,73,FOLLOW_73_in_assignmentOperator974); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 3 :
                    // StateMachine.g:181:9: t= '-='
                    {
                    t=(Token)match(input,75,FOLLOW_75_in_assignmentOperator989); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 4 :
                    // StateMachine.g:182:9: t= '*='
                    {
                    t=(Token)match(input,71,FOLLOW_71_in_assignmentOperator1004); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 5 :
                    // StateMachine.g:183:9: t= '/='
                    {
                    t=(Token)match(input,76,FOLLOW_76_in_assignmentOperator1019); if (state.failed) return token;

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
            if ( state.backtracking>0 ) { memoize(input, 18, assignmentOperator_StartIndex); }

        }
        return token;
    }
    // $ANTLR end "assignmentOperator"



    // $ANTLR start "conditionalImpliesExpression"
    // StateMachine.g:186:1: conditionalImpliesExpression returns [ASTExpression expr] : nOrExpr= conditionalOrExpression (operator= IMPLIES n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalImpliesExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nOrExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return expr; }

            // StateMachine.g:187:5: (nOrExpr= conditionalOrExpression (operator= IMPLIES n1= conditionalOrExpression )* )
            // StateMachine.g:187:9: nOrExpr= conditionalOrExpression (operator= IMPLIES n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1042);
            nOrExpr=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nOrExpr;}

            // StateMachine.g:188:9: (operator= IMPLIES n1= conditionalOrExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==IMPLIES) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // StateMachine.g:189:13: operator= IMPLIES n1= conditionalOrExpression
            	    {
            	    operator=(Token)match(input,IMPLIES,FOLLOW_IMPLIES_in_conditionalImpliesExpression1070); if (state.failed) return expr;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1074);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

            	    }
            	    break;

            	default :
            	    break loop22;
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
            if ( state.backtracking>0 ) { memoize(input, 19, conditionalImpliesExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalImpliesExpression"



    // $ANTLR start "conditionalOrExpression"
    // StateMachine.g:194:1: conditionalOrExpression returns [ASTExpression expr] : nAndExpr= conditionalAndExpression (operator= '||' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalOrExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nAndExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return expr; }

            // StateMachine.g:195:5: (nAndExpr= conditionalAndExpression (operator= '||' n1= conditionalAndExpression )* )
            // StateMachine.g:195:9: nAndExpr= conditionalAndExpression (operator= '||' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression1121);
            nAndExpr=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nAndExpr;}

            // StateMachine.g:196:9: (operator= '||' n1= conditionalAndExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==80) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // StateMachine.g:197:13: operator= '||' n1= conditionalAndExpression
            	    {
            	    operator=(Token)match(input,80,FOLLOW_80_in_conditionalOrExpression1149); if (state.failed) return expr;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression1153);
            	    n1=conditionalAndExpression();

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
            if ( state.backtracking>0 ) { memoize(input, 20, conditionalOrExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // StateMachine.g:202:1: conditionalAndExpression returns [ASTExpression expr] : nXorExpr= conditionalXorExpression (operator= '&&' n1= conditionalXorExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalAndExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nXorExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return expr; }

            // StateMachine.g:203:5: (nXorExpr= conditionalXorExpression (operator= '&&' n1= conditionalXorExpression )* )
            // StateMachine.g:203:9: nXorExpr= conditionalXorExpression (operator= '&&' n1= conditionalXorExpression )*
            {
            pushFollow(FOLLOW_conditionalXorExpression_in_conditionalAndExpression1203);
            nXorExpr=conditionalXorExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nXorExpr;}

            // StateMachine.g:204:9: (operator= '&&' n1= conditionalXorExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==70) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // StateMachine.g:205:14: operator= '&&' n1= conditionalXorExpression
            	    {
            	    operator=(Token)match(input,70,FOLLOW_70_in_conditionalAndExpression1233); if (state.failed) return expr;

            	    pushFollow(FOLLOW_conditionalXorExpression_in_conditionalAndExpression1237);
            	    n1=conditionalXorExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

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
            if ( state.backtracking>0 ) { memoize(input, 21, conditionalAndExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "conditionalXorExpression"
    // StateMachine.g:210:1: conditionalXorExpression returns [ASTExpression expr] : nEquality= equalityExpression (operator= XOR n1= equalityExpression )* ;
    public final ASTExpression conditionalXorExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalXorExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nEquality =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return expr; }

            // StateMachine.g:211:5: (nEquality= equalityExpression (operator= XOR n1= equalityExpression )* )
            // StateMachine.g:211:9: nEquality= equalityExpression (operator= XOR n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalXorExpression1288);
            nEquality=equalityExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nEquality;}

            // StateMachine.g:212:9: (operator= XOR n1= equalityExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==XOR) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // StateMachine.g:213:13: operator= XOR n1= equalityExpression
            	    {
            	    operator=(Token)match(input,XOR,FOLLOW_XOR_in_conditionalXorExpression1316); if (state.failed) return expr;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalXorExpression1320);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

            	    }
            	    break;

            	default :
            	    break loop25;
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
            if ( state.backtracking>0 ) { memoize(input, 22, conditionalXorExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalXorExpression"



    // $ANTLR start "equalityExpression"
    // StateMachine.g:218:1: equalityExpression returns [ASTExpression expr] : nRelExpr= relationalExpression (operator= ( '==' | '!=' ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression expr = null;

        int equalityExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nRelExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return expr; }

            // StateMachine.g:219:5: (nRelExpr= relationalExpression (operator= ( '==' | '!=' ) n1= relationalExpression )* )
            // StateMachine.g:219:9: nRelExpr= relationalExpression (operator= ( '==' | '!=' ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1368);
            nRelExpr=relationalExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nRelExpr;}

            // StateMachine.g:220:5: (operator= ( '==' | '!=' ) n1= relationalExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==NOT_EQUAL||LA26_0==77) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // StateMachine.g:221:9: operator= ( '==' | '!=' ) n1= relationalExpression
            	    {
            	    operator=(Token)input.LT(1);

            	    if ( input.LA(1)==NOT_EQUAL||input.LA(1)==77 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return expr;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1399);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

            	    }
            	    break;

            	default :
            	    break loop26;
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
            if ( state.backtracking>0 ) { memoize(input, 23, equalityExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "equalityExpression"



    // $ANTLR start "relationalExpression"
    // StateMachine.g:226:1: relationalExpression returns [ASTExpression expr] : nAddExpr= additiveExpression (operator= relationalOp n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression expr = null;

        int relationalExpression_StartIndex = input.index();

        ASTExpression nAddExpr =null;

        Token operator =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return expr; }

            // StateMachine.g:227:5: (nAddExpr= additiveExpression (operator= relationalOp n1= additiveExpression )* )
            // StateMachine.g:227:7: nAddExpr= additiveExpression (operator= relationalOp n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1436);
            nAddExpr=additiveExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nAddExpr;}

            // StateMachine.g:228:9: (operator= relationalOp n1= additiveExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0 >= GREATER && LA27_0 <= GREATER_EQUAL)||(LA27_0 >= LESS && LA27_0 <= LESS_EQUAL)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // StateMachine.g:229:13: operator= relationalOp n1= additiveExpression
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression1464);
            	    operator=relationalOp();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1468);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

            	    }
            	    break;

            	default :
            	    break loop27;
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
            if ( state.backtracking>0 ) { memoize(input, 24, relationalExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "relationalExpression"



    // $ANTLR start "relationalOp"
    // StateMachine.g:234:1: relationalOp returns [Token token] : (t= '<=' |t= '>=' |t= '<' |t= '>' );
    public final Token relationalOp() throws RecognitionException {
        Token token = null;

        int relationalOp_StartIndex = input.index();

        Token t=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return token; }

            // StateMachine.g:235:5: (t= '<=' |t= '>=' |t= '<' |t= '>' )
            int alt28=4;
            switch ( input.LA(1) ) {
            case LESS_EQUAL:
                {
                alt28=1;
                }
                break;
            case GREATER_EQUAL:
                {
                alt28=2;
                }
                break;
            case LESS:
                {
                alt28=3;
                }
                break;
            case GREATER:
                {
                alt28=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return token;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // StateMachine.g:235:10: t= '<='
                    {
                    t=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_relationalOp1515); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:236:10: t= '>='
                    {
                    t=(Token)match(input,GREATER_EQUAL,FOLLOW_GREATER_EQUAL_in_relationalOp1530); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 3 :
                    // StateMachine.g:237:10: t= '<'
                    {
                    t=(Token)match(input,LESS,FOLLOW_LESS_in_relationalOp1545); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 4 :
                    // StateMachine.g:238:10: t= '>'
                    {
                    t=(Token)match(input,GREATER,FOLLOW_GREATER_in_relationalOp1561); if (state.failed) return token;

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
            if ( state.backtracking>0 ) { memoize(input, 25, relationalOp_StartIndex); }

        }
        return token;
    }
    // $ANTLR end "relationalOp"



    // $ANTLR start "additiveExpression"
    // StateMachine.g:241:1: additiveExpression returns [ASTExpression expr] : nMulExpr= multiplicativeExpression (operator= ( '+' | '-' ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression expr = null;

        int additiveExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nMulExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return expr; }

            // StateMachine.g:242:5: (nMulExpr= multiplicativeExpression (operator= ( '+' | '-' ) n1= multiplicativeExpression )* )
            // StateMachine.g:242:9: nMulExpr= multiplicativeExpression (operator= ( '+' | '-' ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1589);
            nMulExpr=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nMulExpr;}

            // StateMachine.g:243:9: (operator= ( '+' | '-' ) n1= multiplicativeExpression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==MINUS||LA29_0==PLUS) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // StateMachine.g:244:13: operator= ( '+' | '-' ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1630);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

            	    }
            	    break;

            	default :
            	    break loop29;
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
            if ( state.backtracking>0 ) { memoize(input, 26, additiveExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // StateMachine.g:249:1: multiplicativeExpression returns [ASTExpression expr] : nUnrExpr= unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression expr = null;

        int multiplicativeExpression_StartIndex = input.index();

        ASTExpression nUnrExpr =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return expr; }

            // StateMachine.g:250:5: (nUnrExpr= unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            // StateMachine.g:251:9: nUnrExpr= unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1686);
            nUnrExpr=unaryExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nUnrExpr;}

            // StateMachine.g:252:9: ( ( '*' | '/' | '%' ) unaryExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==SLASH||LA30_0==STAR||LA30_0==69) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // StateMachine.g:253:13: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==69 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return expr;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1783);
            	    unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    }
            	    break;

            	default :
            	    break loop30;
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
            if ( state.backtracking>0 ) { memoize(input, 27, multiplicativeExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // StateMachine.g:261:1: unaryExpression returns [ASTExpression expr] : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression |nUnrExprOther= unaryExpressionNotPlusMinus );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression expr = null;

        int unaryExpression_StartIndex = input.index();

        ASTExpression nUnrExprOther =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return expr; }

            // StateMachine.g:262:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression |nUnrExprOther= unaryExpressionNotPlusMinus )
            int alt31=5;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt31=1;
                }
                break;
            case MINUS:
                {
                alt31=2;
                }
                break;
            case 72:
                {
                alt31=3;
                }
                break;
            case 74:
                {
                alt31=4;
                }
                break;
            case BOOLLITERAL:
            case CHARLITERAL:
            case IDENT:
            case INTLITERAL:
            case LPAREN:
            case NOT:
            case PREV:
            case REALLITERAL:
            case STRINGLITERAL:
                {
                alt31=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // StateMachine.g:262:9: '+' unaryExpression
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_unaryExpression1817); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1819);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 2 :
                    // StateMachine.g:263:9: '-' unaryExpression
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_unaryExpression1829); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1831);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 3 :
                    // StateMachine.g:264:9: '++' unaryExpression
                    {
                    match(input,72,FOLLOW_72_in_unaryExpression1841); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1843);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 4 :
                    // StateMachine.g:265:9: '--' unaryExpression
                    {
                    match(input,74,FOLLOW_74_in_unaryExpression1853); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1855);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 5 :
                    // StateMachine.g:266:9: nUnrExprOther= unaryExpressionNotPlusMinus
                    {
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1868);
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
            if ( state.backtracking>0 ) { memoize(input, 28, unaryExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "unaryExpression"



    // $ANTLR start "unaryExpressionNotPlusMinus"
    // StateMachine.g:269:1: unaryExpressionNotPlusMinus returns [ASTExpression expr] : (not= '!' UnrExpr= unaryExpression |nPriExpr= primary (postfix= ( '--' | '++' ) )? );
    public final ASTExpression unaryExpressionNotPlusMinus() throws RecognitionException {
        ASTExpression expr = null;

        int unaryExpressionNotPlusMinus_StartIndex = input.index();

        Token not=null;
        Token postfix=null;
        ASTExpression UnrExpr =null;

        ASTExpression nPriExpr =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return expr; }

            // StateMachine.g:273:5: (not= '!' UnrExpr= unaryExpression |nPriExpr= primary (postfix= ( '--' | '++' ) )? )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==NOT) ) {
                alt33=1;
            }
            else if ( (LA33_0==BOOLLITERAL||LA33_0==CHARLITERAL||LA33_0==IDENT||LA33_0==INTLITERAL||LA33_0==LPAREN||LA33_0==PREV||LA33_0==REALLITERAL||LA33_0==STRINGLITERAL) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // StateMachine.g:273:9: not= '!' UnrExpr= unaryExpression
                    {
                    not=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpressionNotPlusMinus1899); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1903);
                    UnrExpr=unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =new ASTUnaryExpression(not,UnrExpr);}

                    }
                    break;
                case 2 :
                    // StateMachine.g:274:9: nPriExpr= primary (postfix= ( '--' | '++' ) )?
                    {
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus1917);
                    nPriExpr=primary();

                    state._fsp--;
                    if (state.failed) return expr;

                    // StateMachine.g:274:33: (postfix= ( '--' | '++' ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==72||LA32_0==74) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // StateMachine.g:274:33: postfix= ( '--' | '++' )
                            {
                            postfix=(Token)input.LT(1);

                            if ( input.LA(1)==72||input.LA(1)==74 ) {
                                input.consume();
                                state.errorRecovery=false;
                                state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return expr;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                                if (postfix!=null)
                                    expr =new ASTUnaryExpression(postfix,nPriExpr);
                                else
                                    expr =nPriExpr;
                            }

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
            if ( state.backtracking>0 ) { memoize(input, 29, unaryExpressionNotPlusMinus_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"



    // $ANTLR start "primary"
    // StateMachine.g:283:1: primary returns [ASTExpression expr] : (pExpr= parExpression |id= identifier |nLiteralExpr= literal | PREV LPAREN pid= identifier RPAREN );
    public final ASTExpression primary() throws RecognitionException {
        ASTExpression expr = null;

        int primary_StartIndex = input.index();

        ASTExpression pExpr =null;

        ASTIdentifier id =null;

        ASTLiteral nLiteralExpr =null;

        ASTIdentifier pid =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return expr; }

            // StateMachine.g:284:5: (pExpr= parExpression |id= identifier |nLiteralExpr= literal | PREV LPAREN pid= identifier RPAREN )
            int alt34=4;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt34=1;
                }
                break;
            case IDENT:
                {
                alt34=2;
                }
                break;
            case BOOLLITERAL:
            case CHARLITERAL:
            case INTLITERAL:
            case REALLITERAL:
            case STRINGLITERAL:
                {
                alt34=3;
                }
                break;
            case PREV:
                {
                alt34=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }

            switch (alt34) {
                case 1 :
                    // StateMachine.g:284:9: pExpr= parExpression
                    {
                    pushFollow(FOLLOW_parExpression_in_primary1963);
                    pExpr=parExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =pExpr;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:285:9: id= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_primary1977);
                    id=identifier();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {
                                ((ASTIdentifier)id).setExpression();expr =id;
                                //System.out.println(id+":"+id.token().getLine());
                            }

                    }
                    break;
                case 3 :
                    // StateMachine.g:289:9: nLiteralExpr= literal
                    {
                    pushFollow(FOLLOW_literal_in_primary1991);
                    nLiteralExpr=literal();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =nLiteralExpr;}

                    }
                    break;
                case 4 :
                    // StateMachine.g:290:9: PREV LPAREN pid= identifier RPAREN
                    {
                    match(input,PREV,FOLLOW_PREV_in_primary2003); if (state.failed) return expr;

                    match(input,LPAREN,FOLLOW_LPAREN_in_primary2005); if (state.failed) return expr;

                    pushFollow(FOLLOW_identifier_in_primary2009);
                    pid=identifier();

                    state._fsp--;
                    if (state.failed) return expr;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primary2011); if (state.failed) return expr;

                    if ( state.backtracking==0 ) {
                                ((ASTIdentifier)pid).setExpression();
                                expr =pid;
                            }

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
            if ( state.backtracking>0 ) { memoize(input, 30, primary_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "primary"



    // $ANTLR start "parExpression"
    // StateMachine.g:296:1: parExpression returns [ASTExpression expr] : '(' e= expression ')' ;
    public final ASTExpression parExpression() throws RecognitionException {
        ASTExpression expr = null;

        int parExpression_StartIndex = input.index();

        ASTExpression e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return expr; }

            // StateMachine.g:297:5: ( '(' e= expression ')' )
            // StateMachine.g:297:9: '(' e= expression ')'
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2036); if (state.failed) return expr;

            pushFollow(FOLLOW_expression_in_parExpression2040);
            e=expression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =e;}

            match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2044); if (state.failed) return expr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, parExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "parExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_MACHINE_in_machine76 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_machine80 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_machine84 = new BitSet(new long[]{0xE050400500880110L,0x0000000000000002L});
    public static final BitSet FOLLOW_globalVariableDecl_in_machine97 = new BitSet(new long[]{0xE050400500880110L,0x0000000000000002L});
    public static final BitSet FOLLOW_state_in_machine114 = new BitSet(new long[]{0x6010400400800010L,0x0000000000000002L});
    public static final BitSet FOLLOW_trans_in_machine122 = new BitSet(new long[]{0x0010000400000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_invariantExpression_in_machine135 = new BitSet(new long[]{0x0010000400000000L});
    public static final BitSet FOLLOW_RBRACE_in_machine143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_machine145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stateModifier_in_state169 = new BitSet(new long[]{0x6000400000800010L});
    public static final BitSet FOLLOW_STATE_in_state199 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_state203 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_state207 = new BitSet(new long[]{0x80DC8A0340080B00L,0x0000000000000501L});
    public static final BitSet FOLLOW_localVariableDecl_in_state220 = new BitSet(new long[]{0x80DC8A0340080B00L,0x0000000000000501L});
    public static final BitSet FOLLOW_expression_in_state239 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SEMI_in_state241 = new BitSet(new long[]{0x009C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_RBRACE_in_state252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANS_in_trans260 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_trans262 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_trans264 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_trans274 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ARROW_in_trans276 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_trans278 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ON_in_trans280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_label_in_trans282 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_WHERE_in_trans285 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_expression_in_trans287 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_trans295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVARIANT_in_invariantExpression307 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_identifier_in_invariantExpression319 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_invariantExpression329 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_expression_in_invariantExpression341 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SEMI_in_invariantExpression343 = new BitSet(new long[]{0x009C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_RBRACE_in_invariantExpression352 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_FOR_in_invariantExpression364 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_invariantExpression366 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_invariantExpression368 = new BitSet(new long[]{0x0010000000010000L});
    public static final BitSet FOLLOW_COMMA_in_invariantExpression371 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_invariantExpression373 = new BitSet(new long[]{0x0010000000010000L});
    public static final BitSet FOLLOW_RBRACE_in_invariantExpression377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_label391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identifier409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_stateModifier430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINAL_in_stateModifier440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_stateModifier450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORMAL_in_stateModifier460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_literal482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REALLITERAL_in_literal494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLLITERAL_in_literal506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literal518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literal530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_globalVariableDecl550 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_globalVariableDecl554 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SEMI_in_globalVariableDecl562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_localVariableDecl580 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDecl584 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SEMI_in_localVariableDecl592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumType_in_type656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primitiveType685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_primitiveType695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primitiveType706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumType725 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enumType729 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_enumType733 = new BitSet(new long[]{0x0010000000010000L});
    public static final BitSet FOLLOW_COMMA_in_enumType743 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_enumType747 = new BitSet(new long[]{0x0010000000010000L});
    public static final BitSet FOLLOW_RBRACE_in_enumType753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclarator777 = new BitSet(new long[]{0x0000000000200002L,0x0000000000000004L});
    public static final BitSet FOLLOW_EQUAL_in_variableDeclarator795 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator799 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_WHERE_in_variableDeclarator811 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_expression_in_variableDeclarator815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression873 = new BitSet(new long[]{0x0000000000200002L,0x0000000000001A80L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression902 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_expression_in_expression906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_assignmentOperator958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_assignmentOperator974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_assignmentOperator989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_assignmentOperator1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_assignmentOperator1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1042 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_IMPLIES_in_conditionalImpliesExpression1070 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1074 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression1121 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_conditionalOrExpression1149 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression1153 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_conditionalXorExpression_in_conditionalAndExpression1203 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_conditionalAndExpression1233 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_conditionalXorExpression_in_conditionalAndExpression1237 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalXorExpression1288 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_XOR_in_conditionalXorExpression1316 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalXorExpression1320 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1368 = new BitSet(new long[]{0x0001000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_set_in_equalityExpression1388 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1399 = new BitSet(new long[]{0x0001000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1436 = new BitSet(new long[]{0x000001800C000002L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression1464 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1468 = new BitSet(new long[]{0x000001800C000002L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_relationalOp1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_EQUAL_in_relationalOp1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_relationalOp1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_relationalOp1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1589 = new BitSet(new long[]{0x0004080000000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1620 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1630 = new BitSet(new long[]{0x0004080000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1686 = new BitSet(new long[]{0x1400000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1715 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1783 = new BitSet(new long[]{0x1400000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression1817 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression1829 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_unaryExpression1841 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_unaryExpression1853 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryExpressionNotPlusMinus1899 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus1917 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000500L});
    public static final BitSet FOLLOW_set_in_unaryExpressionNotPlusMinus1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_primary1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREV_in_primary2003 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LPAREN_in_primary2005 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_primary2009 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primary2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2036 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000501L});
    public static final BitSet FOLLOW_expression_in_parExpression2040 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2044 = new BitSet(new long[]{0x0000000000000002L});

}