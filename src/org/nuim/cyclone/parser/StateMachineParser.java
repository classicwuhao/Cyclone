// $ANTLR 3.4 StateMachine.g 2020-07-22 21:46:01

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ARROW", "AT", "BAR", "BOOL", "BOOLLITERAL", "CHAR", "CHARLITERAL", "CHECK", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "ENUM", "ENUMLITERAL", "EQUAL", "EscapeSequence", "FINAL", "FOR", "GOAL", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "IMPLIES", "INT", "INTLITERAL", "INVARIANT", "IdentifierPart", "IdentifierStart", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MACHINE", "MINUS", "ML_COMMENT", "NEWLINE", "NORMAL", "NOT", "NOT_EQUAL", "ON", "PLUS", "RBRACE", "RBRACK", "REAL", "REALLITERAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "START", "STATE", "STRING", "STRINGLITERAL", "TRANS", "WHERE", "WS", "XOR", "'%'", "'&&'", "'++'", "'--'", "'=='", "'global'", "'native'", "'||'"
    };

    public static final int EOF=-1;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
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
    public static final int RBRACE=51;
    public static final int RBRACK=52;
    public static final int REAL=53;
    public static final int REALLITERAL=54;
    public static final int RPAREN=55;
    public static final int SEMI=56;
    public static final int SLASH=57;
    public static final int SL_COMMENT=58;
    public static final int STAR=59;
    public static final int START=60;
    public static final int STATE=61;
    public static final int STRING=62;
    public static final int STRINGLITERAL=63;
    public static final int TRANS=64;
    public static final int WHERE=65;
    public static final int WS=66;
    public static final int XOR=67;

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
        this.state.ruleMemo = new HashMap[80+1];
         

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
    // StateMachine.g:55:1: state returns [ASTState aststate] : (m= stateModifier )? STATE e= identifier LBRACE (v= localVariableDecl )* (expr= expression SEMI )* RBRACE ;
    public final ASTState state() throws RecognitionException {
        ASTState aststate = null;

        int state_StartIndex = input.index();

        ASTStateModifier m =null;

        ASTIdentifier e =null;

        ASTVariable v =null;

        ASTExpression expr =null;



            aststate =new ASTState();
            aststate.setModifier(ASTStateModifier.NORMAL);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return aststate; }

            // StateMachine.g:60:5: ( (m= stateModifier )? STATE e= identifier LBRACE (v= localVariableDecl )* (expr= expression SEMI )* RBRACE )
            // StateMachine.g:61:5: (m= stateModifier )? STATE e= identifier LBRACE (v= localVariableDecl )* (expr= expression SEMI )* RBRACE
            {
            // StateMachine.g:61:5: (m= stateModifier )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ABSTRACT||LA5_0==FINAL||LA5_0==NORMAL||LA5_0==START) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // StateMachine.g:61:6: m= stateModifier
                    {
                    pushFollow(FOLLOW_stateModifier_in_state169);
                    m=stateModifier();

                    state._fsp--;
                    if (state.failed) return aststate;

                    if ( state.backtracking==0 ) {aststate.setModifier(m);}

                    }
                    break;

            }


            match(input,STATE,FOLLOW_STATE_in_state183); if (state.failed) return aststate;

            pushFollow(FOLLOW_identifier_in_state187);
            e=identifier();

            state._fsp--;
            if (state.failed) return aststate;

            if ( state.backtracking==0 ) {aststate.setName(e.identifier());aststate.setToken(e.token());}

            match(input,LBRACE,FOLLOW_LBRACE_in_state191); if (state.failed) return aststate;

            // StateMachine.g:63:9: (v= localVariableDecl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==BOOL||LA6_0==ENUM||LA6_0==INT||LA6_0==REAL||LA6_0==STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // StateMachine.g:63:10: v= localVariableDecl
            	    {
            	    pushFollow(FOLLOW_localVariableDecl_in_state204);
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


            // StateMachine.g:64:9: (expr= expression SEMI )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==BOOLLITERAL||LA7_0==CHARLITERAL||LA7_0==IDENT||LA7_0==INTLITERAL||LA7_0==LPAREN||LA7_0==MINUS||LA7_0==NOT||LA7_0==PLUS||LA7_0==REALLITERAL||LA7_0==STRINGLITERAL||(LA7_0 >= 70 && LA7_0 <= 71)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // StateMachine.g:64:10: expr= expression SEMI
            	    {
            	    pushFollow(FOLLOW_expression_in_state223);
            	    expr=expression();

            	    state._fsp--;
            	    if (state.failed) return aststate;

            	    match(input,SEMI,FOLLOW_SEMI_in_state225); if (state.failed) return aststate;

            	    if ( state.backtracking==0 ) {aststate.addExpr(expr);}

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_state236); if (state.failed) return aststate;

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
    // StateMachine.g:68:1: trans : TRANS identifier LBRACE identifier ARROW identifier ON label RBRACE ;
    public final void trans() throws RecognitionException {
        int trans_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }

            // StateMachine.g:68:6: ( TRANS identifier LBRACE identifier ARROW identifier ON label RBRACE )
            // StateMachine.g:68:8: TRANS identifier LBRACE identifier ARROW identifier ON label RBRACE
            {
            match(input,TRANS,FOLLOW_TRANS_in_trans244); if (state.failed) return ;

            pushFollow(FOLLOW_identifier_in_trans246);
            identifier();

            state._fsp--;
            if (state.failed) return ;

            match(input,LBRACE,FOLLOW_LBRACE_in_trans248); if (state.failed) return ;

            pushFollow(FOLLOW_identifier_in_trans258);
            identifier();

            state._fsp--;
            if (state.failed) return ;

            match(input,ARROW,FOLLOW_ARROW_in_trans260); if (state.failed) return ;

            pushFollow(FOLLOW_identifier_in_trans262);
            identifier();

            state._fsp--;
            if (state.failed) return ;

            match(input,ON,FOLLOW_ON_in_trans264); if (state.failed) return ;

            pushFollow(FOLLOW_label_in_trans266);
            label();

            state._fsp--;
            if (state.failed) return ;

            match(input,RBRACE,FOLLOW_RBRACE_in_trans272); if (state.failed) return ;

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
    // StateMachine.g:73:1: invariantExpression : INVARIANT ( identifier )? LBRACE ( expression SEMI )+ RBRACE ;
    public final void invariantExpression() throws RecognitionException {
        int invariantExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }

            // StateMachine.g:73:20: ( INVARIANT ( identifier )? LBRACE ( expression SEMI )+ RBRACE )
            // StateMachine.g:74:5: INVARIANT ( identifier )? LBRACE ( expression SEMI )+ RBRACE
            {
            match(input,INVARIANT,FOLLOW_INVARIANT_in_invariantExpression284); if (state.failed) return ;

            // StateMachine.g:75:9: ( identifier )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // StateMachine.g:75:10: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_invariantExpression296);
                    identifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,LBRACE,FOLLOW_LBRACE_in_invariantExpression306); if (state.failed) return ;

            // StateMachine.g:77:9: ( expression SEMI )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==BOOLLITERAL||LA9_0==CHARLITERAL||LA9_0==IDENT||LA9_0==INTLITERAL||LA9_0==LPAREN||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==REALLITERAL||LA9_0==STRINGLITERAL||(LA9_0 >= 70 && LA9_0 <= 71)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // StateMachine.g:77:10: expression SEMI
            	    {
            	    pushFollow(FOLLOW_expression_in_invariantExpression318);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    match(input,SEMI,FOLLOW_SEMI_in_invariantExpression320); if (state.failed) return ;

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


            match(input,RBRACE,FOLLOW_RBRACE_in_invariantExpression329); if (state.failed) return ;

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
    // StateMachine.g:81:1: label : STRINGLITERAL ;
    public final void label() throws RecognitionException {
        int label_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }

            // StateMachine.g:81:6: ( STRINGLITERAL )
            // StateMachine.g:82:5: STRINGLITERAL
            {
            match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_label341); if (state.failed) return ;

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
    // StateMachine.g:85:1: identifier returns [ASTIdentifier expr] : str= IDENT ;
    public final ASTIdentifier identifier() throws RecognitionException {
        ASTIdentifier expr = null;

        int identifier_StartIndex = input.index();

        Token str=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return expr; }

            // StateMachine.g:85:40: (str= IDENT )
            // StateMachine.g:86:5: str= IDENT
            {
            str=(Token)match(input,IDENT,FOLLOW_IDENT_in_identifier359); if (state.failed) return expr;

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
    // StateMachine.g:89:1: stateModifier returns [ASTStateModifier modifier] : ( START | FINAL | ABSTRACT | NORMAL );
    public final ASTStateModifier stateModifier() throws RecognitionException {
        ASTStateModifier modifier = null;

        int stateModifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return modifier; }

            // StateMachine.g:89:50: ( START | FINAL | ABSTRACT | NORMAL )
            int alt10=4;
            switch ( input.LA(1) ) {
            case START:
                {
                alt10=1;
                }
                break;
            case FINAL:
                {
                alt10=2;
                }
                break;
            case ABSTRACT:
                {
                alt10=3;
                }
                break;
            case NORMAL:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return modifier;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // StateMachine.g:90:7: START
                    {
                    match(input,START,FOLLOW_START_in_stateModifier380); if (state.failed) return modifier;

                    if ( state.backtracking==0 ) {modifier =ASTStateModifier.START;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:91:7: FINAL
                    {
                    match(input,FINAL,FOLLOW_FINAL_in_stateModifier390); if (state.failed) return modifier;

                    if ( state.backtracking==0 ) {modifier =ASTStateModifier.FINAL;}

                    }
                    break;
                case 3 :
                    // StateMachine.g:92:7: ABSTRACT
                    {
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_stateModifier400); if (state.failed) return modifier;

                    if ( state.backtracking==0 ) {modifier =ASTStateModifier.ABSTRACT;}

                    }
                    break;
                case 4 :
                    // StateMachine.g:93:7: NORMAL
                    {
                    match(input,NORMAL,FOLLOW_NORMAL_in_stateModifier410); if (state.failed) return modifier;

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
    // StateMachine.g:96:1: literal returns [ASTLiteral literal_node] : (l= INTLITERAL |r= REALLITERAL |b= BOOLLITERAL |s= STRINGLITERAL |c= CHARLITERAL );
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

            // StateMachine.g:96:42: (l= INTLITERAL |r= REALLITERAL |b= BOOLLITERAL |s= STRINGLITERAL |c= CHARLITERAL )
            int alt11=5;
            switch ( input.LA(1) ) {
            case INTLITERAL:
                {
                alt11=1;
                }
                break;
            case REALLITERAL:
                {
                alt11=2;
                }
                break;
            case BOOLLITERAL:
                {
                alt11=3;
                }
                break;
            case STRINGLITERAL:
                {
                alt11=4;
                }
                break;
            case CHARLITERAL:
                {
                alt11=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return literal_node;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // StateMachine.g:97:7: l= INTLITERAL
                    {
                    l=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literal432); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.INT,l);}

                    }
                    break;
                case 2 :
                    // StateMachine.g:98:7: r= REALLITERAL
                    {
                    r=(Token)match(input,REALLITERAL,FOLLOW_REALLITERAL_in_literal444); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.REAL,r);}

                    }
                    break;
                case 3 :
                    // StateMachine.g:99:7: b= BOOLLITERAL
                    {
                    b=(Token)match(input,BOOLLITERAL,FOLLOW_BOOLLITERAL_in_literal456); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.BOOL,b);}

                    }
                    break;
                case 4 :
                    // StateMachine.g:100:7: s= STRINGLITERAL
                    {
                    s=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literal468); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.STRING,s);}

                    }
                    break;
                case 5 :
                    // StateMachine.g:101:7: c= CHARLITERAL
                    {
                    c=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literal480); if (state.failed) return literal_node;

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
    // StateMachine.g:104:1: globalVariableDecl returns [ASTVariable v] : t= type n= variableDeclarator SEMI ;
    public final ASTVariable globalVariableDecl() throws RecognitionException {
        ASTVariable v = null;

        int globalVariableDecl_StartIndex = input.index();

        Type t =null;

        ASTVariable n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return v; }

            // StateMachine.g:104:43: (t= type n= variableDeclarator SEMI )
            // StateMachine.g:105:5: t= type n= variableDeclarator SEMI
            {
            pushFollow(FOLLOW_type_in_globalVariableDecl500);
            t=type();

            state._fsp--;
            if (state.failed) return v;

            pushFollow(FOLLOW_variableDeclarator_in_globalVariableDecl504);
            n=variableDeclarator();

            state._fsp--;
            if (state.failed) return v;

            if ( state.backtracking==0 ) {n.type=t;n.createVariable();v =n;}

            match(input,SEMI,FOLLOW_SEMI_in_globalVariableDecl512); if (state.failed) return v;

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
    // StateMachine.g:109:1: localVariableDecl returns [ASTVariable v] : t= type n= variableDeclarator SEMI ;
    public final ASTVariable localVariableDecl() throws RecognitionException {
        ASTVariable v = null;

        int localVariableDecl_StartIndex = input.index();

        Type t =null;

        ASTVariable n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return v; }

            // StateMachine.g:109:42: (t= type n= variableDeclarator SEMI )
            // StateMachine.g:110:5: t= type n= variableDeclarator SEMI
            {
            pushFollow(FOLLOW_type_in_localVariableDecl530);
            t=type();

            state._fsp--;
            if (state.failed) return v;

            pushFollow(FOLLOW_variableDeclarator_in_localVariableDecl534);
            n=variableDeclarator();

            state._fsp--;
            if (state.failed) return v;

            if ( state.backtracking==0 ) {n.type=t;n.createVariable();v =n;}

            match(input,SEMI,FOLLOW_SEMI_in_localVariableDecl542); if (state.failed) return v;

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
    // StateMachine.g:114:1: modifier : ( 'global' | 'native' );
    public final void modifier() throws RecognitionException {
        int modifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }

            // StateMachine.g:114:10: ( 'global' | 'native' )
            // StateMachine.g:
            {
            if ( (input.LA(1) >= 73 && input.LA(1) <= 74) ) {
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
    // StateMachine.g:119:1: type returns [Type t] : (p= primitiveType |e= enumType );
    public final Type type() throws RecognitionException {
        Type t = null;

        int type_StartIndex = input.index();

        Type p =null;

        EnumType e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return t; }

            // StateMachine.g:119:23: (p= primitiveType |e= enumType )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==BOOL||LA12_0==INT||LA12_0==REAL||LA12_0==STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==ENUM) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // StateMachine.g:120:9: p= primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type592);
                    p=primitiveType();

                    state._fsp--;
                    if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =p;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:121:9: e= enumType
                    {
                    pushFollow(FOLLOW_enumType_in_type606);
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
    // StateMachine.g:124:1: primitiveType returns [Type t] : ( INT | BOOL | REAL | STRING );
    public final Type primitiveType() throws RecognitionException {
        Type t = null;

        int primitiveType_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return t; }

            // StateMachine.g:124:31: ( INT | BOOL | REAL | STRING )
            int alt13=4;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt13=1;
                }
                break;
            case BOOL:
                {
                alt13=2;
                }
                break;
            case REAL:
                {
                alt13=3;
                }
                break;
            case STRING:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // StateMachine.g:125:7: INT
                    {
                    match(input,INT,FOLLOW_INT_in_primitiveType625); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t = new IntType();}

                    }
                    break;
                case 2 :
                    // StateMachine.g:126:7: BOOL
                    {
                    match(input,BOOL,FOLLOW_BOOL_in_primitiveType635); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =new BoolType();}

                    }
                    break;
                case 3 :
                    // StateMachine.g:127:7: REAL
                    {
                    match(input,REAL,FOLLOW_REAL_in_primitiveType645); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =new RealType();}

                    }
                    break;
                case 4 :
                    // StateMachine.g:128:7: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_primitiveType656); if (state.failed) return t;

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
    // StateMachine.g:131:1: enumType returns [EnumType t] : ENUM LBRACE name= identifier ( COMMA l= identifier )* RBRACE ;
    public final EnumType enumType() throws RecognitionException {
        EnumType t = null;

        int enumType_StartIndex = input.index();

        ASTIdentifier name =null;

        ASTIdentifier l =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return t; }

            // StateMachine.g:131:31: ( ENUM LBRACE name= identifier ( COMMA l= identifier )* RBRACE )
            // StateMachine.g:132:5: ENUM LBRACE name= identifier ( COMMA l= identifier )* RBRACE
            {
            match(input,ENUM,FOLLOW_ENUM_in_enumType675); if (state.failed) return t;

            if ( state.backtracking==0 ) {t =new EnumType();}

            match(input,LBRACE,FOLLOW_LBRACE_in_enumType679); if (state.failed) return t;

            pushFollow(FOLLOW_identifier_in_enumType683);
            name=identifier();

            state._fsp--;
            if (state.failed) return t;

            if ( state.backtracking==0 ) {t.add(name.toString());}

            // StateMachine.g:133:5: ( COMMA l= identifier )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // StateMachine.g:133:6: COMMA l= identifier
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_enumType693); if (state.failed) return t;

            	    pushFollow(FOLLOW_identifier_in_enumType697);
            	    l=identifier();

            	    state._fsp--;
            	    if (state.failed) return t;

            	    if ( state.backtracking==0 ) {t.add(l.toString());}

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_enumType703); if (state.failed) return t;

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
    // StateMachine.g:136:1: variableDeclarator returns [ASTVariable var] :n= identifier ( '=' n= variableInitializer )? ( WHERE e= expression )? ;
    public final ASTVariable variableDeclarator() throws RecognitionException {
        ASTVariable var = null;

        int variableDeclarator_StartIndex = input.index();

        ASTExpression n =null;

        ASTExpression e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return var; }

            // StateMachine.g:136:45: (n= identifier ( '=' n= variableInitializer )? ( WHERE e= expression )? )
            // StateMachine.g:137:5: n= identifier ( '=' n= variableInitializer )? ( WHERE e= expression )?
            {
            if ( state.backtracking==0 ) {var =new ASTVariable();}

            pushFollow(FOLLOW_identifier_in_variableDeclarator727);
            n=identifier();

            state._fsp--;
            if (state.failed) return var;

            if ( state.backtracking==0 ) {
                        var.name=n.toString();
                        var.setToken( ((ASTIdentifier)n).token());
                    }

            // StateMachine.g:143:5: ( '=' n= variableInitializer )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EQUAL) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // StateMachine.g:143:6: '=' n= variableInitializer
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_variableDeclarator745); if (state.failed) return var;

                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator749);
                    n=variableInitializer();

                    state._fsp--;
                    if (state.failed) return var;

                    if ( state.backtracking==0 ) {var.initializer=n;}

                    }
                    break;

            }


            // StateMachine.g:144:5: ( WHERE e= expression )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==WHERE) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // StateMachine.g:144:6: WHERE e= expression
                    {
                    match(input,WHERE,FOLLOW_WHERE_in_variableDeclarator761); if (state.failed) return var;

                    pushFollow(FOLLOW_expression_in_variableDeclarator765);
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
    // StateMachine.g:147:1: variableInitializer returns [ASTExpression expr] : n= expression ;
    public final ASTExpression variableInitializer() throws RecognitionException {
        ASTExpression expr = null;

        int variableInitializer_StartIndex = input.index();

        ASTExpression n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return expr; }

            // StateMachine.g:147:49: (n= expression )
            // StateMachine.g:148:9: n= expression
            {
            pushFollow(FOLLOW_expression_in_variableInitializer793);
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
    // StateMachine.g:151:1: expression returns [ASTExpression expr] : nImpliesExpr= conditionalImpliesExpression ( '=' nExpr= expression )? ;
    public final ASTExpression expression() throws RecognitionException {
        ASTExpression expr = null;

        int expression_StartIndex = input.index();

        ASTExpression nImpliesExpr =null;

        ASTExpression nExpr =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return expr; }

            // StateMachine.g:151:40: (nImpliesExpr= conditionalImpliesExpression ( '=' nExpr= expression )? )
            // StateMachine.g:152:9: nImpliesExpr= conditionalImpliesExpression ( '=' nExpr= expression )?
            {
            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression823);
            nImpliesExpr=conditionalImpliesExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nImpliesExpr;}

            // StateMachine.g:153:9: ( '=' nExpr= expression )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==EQUAL) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // StateMachine.g:153:10: '=' nExpr= expression
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_expression836); if (state.failed) return expr;

                    pushFollow(FOLLOW_expression_in_expression840);
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
    // StateMachine.g:157:1: conditionalImpliesExpression returns [ASTExpression expr] : nOrExpr= conditionalOrExpression (operator= IMPLIES n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalImpliesExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nOrExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return expr; }

            // StateMachine.g:158:5: (nOrExpr= conditionalOrExpression (operator= IMPLIES n1= conditionalOrExpression )* )
            // StateMachine.g:158:9: nOrExpr= conditionalOrExpression (operator= IMPLIES n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression877);
            nOrExpr=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nOrExpr;}

            // StateMachine.g:159:9: (operator= IMPLIES n1= conditionalOrExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==IMPLIES) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // StateMachine.g:160:13: operator= IMPLIES n1= conditionalOrExpression
            	    {
            	    operator=(Token)match(input,IMPLIES,FOLLOW_IMPLIES_in_conditionalImpliesExpression905); if (state.failed) return expr;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression909);
            	    n1=conditionalOrExpression();

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
            if ( state.backtracking>0 ) { memoize(input, 18, conditionalImpliesExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalImpliesExpression"



    // $ANTLR start "conditionalOrExpression"
    // StateMachine.g:165:1: conditionalOrExpression returns [ASTExpression expr] : nAndExpr= conditionalAndExpression (operator= '||' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalOrExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nAndExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return expr; }

            // StateMachine.g:166:5: (nAndExpr= conditionalAndExpression (operator= '||' n1= conditionalAndExpression )* )
            // StateMachine.g:166:9: nAndExpr= conditionalAndExpression (operator= '||' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression956);
            nAndExpr=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nAndExpr;}

            // StateMachine.g:167:9: (operator= '||' n1= conditionalAndExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==75) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // StateMachine.g:168:13: operator= '||' n1= conditionalAndExpression
            	    {
            	    operator=(Token)match(input,75,FOLLOW_75_in_conditionalOrExpression984); if (state.failed) return expr;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression988);
            	    n1=conditionalAndExpression();

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
            if ( state.backtracking>0 ) { memoize(input, 19, conditionalOrExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // StateMachine.g:173:1: conditionalAndExpression returns [ASTExpression expr] : nXorExpr= conditionalXorExpression (operator= '&&' n1= conditionalXorExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalAndExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nXorExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return expr; }

            // StateMachine.g:174:5: (nXorExpr= conditionalXorExpression (operator= '&&' n1= conditionalXorExpression )* )
            // StateMachine.g:174:9: nXorExpr= conditionalXorExpression (operator= '&&' n1= conditionalXorExpression )*
            {
            pushFollow(FOLLOW_conditionalXorExpression_in_conditionalAndExpression1038);
            nXorExpr=conditionalXorExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nXorExpr;}

            // StateMachine.g:175:9: (operator= '&&' n1= conditionalXorExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==69) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // StateMachine.g:176:14: operator= '&&' n1= conditionalXorExpression
            	    {
            	    operator=(Token)match(input,69,FOLLOW_69_in_conditionalAndExpression1068); if (state.failed) return expr;

            	    pushFollow(FOLLOW_conditionalXorExpression_in_conditionalAndExpression1072);
            	    n1=conditionalXorExpression();

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
            if ( state.backtracking>0 ) { memoize(input, 20, conditionalAndExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "conditionalXorExpression"
    // StateMachine.g:181:1: conditionalXorExpression returns [ASTExpression expr] : nEquality= equalityExpression (operator= XOR n1= equalityExpression )* ;
    public final ASTExpression conditionalXorExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalXorExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nEquality =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return expr; }

            // StateMachine.g:182:5: (nEquality= equalityExpression (operator= XOR n1= equalityExpression )* )
            // StateMachine.g:182:9: nEquality= equalityExpression (operator= XOR n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalXorExpression1123);
            nEquality=equalityExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nEquality;}

            // StateMachine.g:183:9: (operator= XOR n1= equalityExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==XOR) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // StateMachine.g:184:13: operator= XOR n1= equalityExpression
            	    {
            	    operator=(Token)match(input,XOR,FOLLOW_XOR_in_conditionalXorExpression1151); if (state.failed) return expr;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalXorExpression1155);
            	    n1=equalityExpression();

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
            if ( state.backtracking>0 ) { memoize(input, 21, conditionalXorExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalXorExpression"



    // $ANTLR start "equalityExpression"
    // StateMachine.g:189:1: equalityExpression returns [ASTExpression expr] : nRelExpr= relationalExpression (operator= ( '==' | '!=' ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression expr = null;

        int equalityExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nRelExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return expr; }

            // StateMachine.g:190:5: (nRelExpr= relationalExpression (operator= ( '==' | '!=' ) n1= relationalExpression )* )
            // StateMachine.g:190:9: nRelExpr= relationalExpression (operator= ( '==' | '!=' ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1203);
            nRelExpr=relationalExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nRelExpr;}

            // StateMachine.g:191:5: (operator= ( '==' | '!=' ) n1= relationalExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==NOT_EQUAL||LA22_0==72) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // StateMachine.g:192:9: operator= ( '==' | '!=' ) n1= relationalExpression
            	    {
            	    operator=(Token)input.LT(1);

            	    if ( input.LA(1)==NOT_EQUAL||input.LA(1)==72 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return expr;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1234);
            	    n1=relationalExpression();

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
            if ( state.backtracking>0 ) { memoize(input, 22, equalityExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "equalityExpression"



    // $ANTLR start "relationalExpression"
    // StateMachine.g:197:1: relationalExpression returns [ASTExpression expr] : nAddExpr= additiveExpression (operator= relationalOp n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression expr = null;

        int relationalExpression_StartIndex = input.index();

        ASTExpression nAddExpr =null;

        Token operator =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return expr; }

            // StateMachine.g:198:5: (nAddExpr= additiveExpression (operator= relationalOp n1= additiveExpression )* )
            // StateMachine.g:198:7: nAddExpr= additiveExpression (operator= relationalOp n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1271);
            nAddExpr=additiveExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nAddExpr;}

            // StateMachine.g:199:9: (operator= relationalOp n1= additiveExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0 >= GREATER && LA23_0 <= GREATER_EQUAL)||(LA23_0 >= LESS && LA23_0 <= LESS_EQUAL)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // StateMachine.g:200:13: operator= relationalOp n1= additiveExpression
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression1299);
            	    operator=relationalOp();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1303);
            	    n1=additiveExpression();

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
            if ( state.backtracking>0 ) { memoize(input, 23, relationalExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "relationalExpression"



    // $ANTLR start "relationalOp"
    // StateMachine.g:205:1: relationalOp returns [Token token] : (t= '<=' |t= '>=' |t= '<' |t= '>' );
    public final Token relationalOp() throws RecognitionException {
        Token token = null;

        int relationalOp_StartIndex = input.index();

        Token t=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return token; }

            // StateMachine.g:206:5: (t= '<=' |t= '>=' |t= '<' |t= '>' )
            int alt24=4;
            switch ( input.LA(1) ) {
            case LESS_EQUAL:
                {
                alt24=1;
                }
                break;
            case GREATER_EQUAL:
                {
                alt24=2;
                }
                break;
            case LESS:
                {
                alt24=3;
                }
                break;
            case GREATER:
                {
                alt24=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return token;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // StateMachine.g:206:10: t= '<='
                    {
                    t=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_relationalOp1350); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:207:10: t= '>='
                    {
                    t=(Token)match(input,GREATER_EQUAL,FOLLOW_GREATER_EQUAL_in_relationalOp1365); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 3 :
                    // StateMachine.g:208:10: t= '<'
                    {
                    t=(Token)match(input,LESS,FOLLOW_LESS_in_relationalOp1380); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 4 :
                    // StateMachine.g:209:10: t= '>'
                    {
                    t=(Token)match(input,GREATER,FOLLOW_GREATER_in_relationalOp1396); if (state.failed) return token;

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
            if ( state.backtracking>0 ) { memoize(input, 24, relationalOp_StartIndex); }

        }
        return token;
    }
    // $ANTLR end "relationalOp"



    // $ANTLR start "additiveExpression"
    // StateMachine.g:212:1: additiveExpression returns [ASTExpression expr] : nMulExpr= multiplicativeExpression (operator= ( '+' | '-' ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression expr = null;

        int additiveExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nMulExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return expr; }

            // StateMachine.g:213:5: (nMulExpr= multiplicativeExpression (operator= ( '+' | '-' ) n1= multiplicativeExpression )* )
            // StateMachine.g:213:9: nMulExpr= multiplicativeExpression (operator= ( '+' | '-' ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1424);
            nMulExpr=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nMulExpr;}

            // StateMachine.g:214:9: (operator= ( '+' | '-' ) n1= multiplicativeExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==MINUS||LA25_0==PLUS) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // StateMachine.g:215:13: operator= ( '+' | '-' ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1465);
            	    n1=multiplicativeExpression();

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
            if ( state.backtracking>0 ) { memoize(input, 25, additiveExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // StateMachine.g:220:1: multiplicativeExpression returns [ASTExpression expr] : nUnrExpr= unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression expr = null;

        int multiplicativeExpression_StartIndex = input.index();

        ASTExpression nUnrExpr =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return expr; }

            // StateMachine.g:221:5: (nUnrExpr= unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            // StateMachine.g:222:9: nUnrExpr= unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1521);
            nUnrExpr=unaryExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nUnrExpr;}

            // StateMachine.g:223:9: ( ( '*' | '/' | '%' ) unaryExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==SLASH||LA26_0==STAR||LA26_0==68) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // StateMachine.g:224:13: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==68 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return expr;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1618);
            	    unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

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
            if ( state.backtracking>0 ) { memoize(input, 26, multiplicativeExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // StateMachine.g:232:1: unaryExpression returns [ASTExpression expr] : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression |nUnrExprOther= unaryExpressionNotPlusMinus );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression expr = null;

        int unaryExpression_StartIndex = input.index();

        ASTExpression nUnrExprOther =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return expr; }

            // StateMachine.g:233:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression |nUnrExprOther= unaryExpressionNotPlusMinus )
            int alt27=5;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt27=1;
                }
                break;
            case MINUS:
                {
                alt27=2;
                }
                break;
            case 70:
                {
                alt27=3;
                }
                break;
            case 71:
                {
                alt27=4;
                }
                break;
            case BOOLLITERAL:
            case CHARLITERAL:
            case IDENT:
            case INTLITERAL:
            case LPAREN:
            case NOT:
            case REALLITERAL:
            case STRINGLITERAL:
                {
                alt27=5;
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
                    // StateMachine.g:233:9: '+' unaryExpression
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_unaryExpression1652); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1654);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 2 :
                    // StateMachine.g:234:9: '-' unaryExpression
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_unaryExpression1664); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1666);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 3 :
                    // StateMachine.g:235:9: '++' unaryExpression
                    {
                    match(input,70,FOLLOW_70_in_unaryExpression1676); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1678);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 4 :
                    // StateMachine.g:236:9: '--' unaryExpression
                    {
                    match(input,71,FOLLOW_71_in_unaryExpression1688); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1690);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 5 :
                    // StateMachine.g:237:9: nUnrExprOther= unaryExpressionNotPlusMinus
                    {
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1703);
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
            if ( state.backtracking>0 ) { memoize(input, 27, unaryExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "unaryExpression"



    // $ANTLR start "unaryExpressionNotPlusMinus"
    // StateMachine.g:240:1: unaryExpressionNotPlusMinus returns [ASTExpression expr] : (not= '!' UnrExpr= unaryExpression |nPriExpr= primary (postfix= ( '--' | '++' ) )? );
    public final ASTExpression unaryExpressionNotPlusMinus() throws RecognitionException {
        ASTExpression expr = null;

        int unaryExpressionNotPlusMinus_StartIndex = input.index();

        Token not=null;
        Token postfix=null;
        ASTExpression UnrExpr =null;

        ASTExpression nPriExpr =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return expr; }

            // StateMachine.g:244:5: (not= '!' UnrExpr= unaryExpression |nPriExpr= primary (postfix= ( '--' | '++' ) )? )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==NOT) ) {
                alt29=1;
            }
            else if ( (LA29_0==BOOLLITERAL||LA29_0==CHARLITERAL||LA29_0==IDENT||LA29_0==INTLITERAL||LA29_0==LPAREN||LA29_0==REALLITERAL||LA29_0==STRINGLITERAL) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // StateMachine.g:244:9: not= '!' UnrExpr= unaryExpression
                    {
                    not=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpressionNotPlusMinus1734); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1738);
                    UnrExpr=unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =new ASTUnaryExpression(not,UnrExpr);}

                    }
                    break;
                case 2 :
                    // StateMachine.g:245:9: nPriExpr= primary (postfix= ( '--' | '++' ) )?
                    {
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus1752);
                    nPriExpr=primary();

                    state._fsp--;
                    if (state.failed) return expr;

                    // StateMachine.g:245:33: (postfix= ( '--' | '++' ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0 >= 70 && LA28_0 <= 71)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // StateMachine.g:245:33: postfix= ( '--' | '++' )
                            {
                            postfix=(Token)input.LT(1);

                            if ( (input.LA(1) >= 70 && input.LA(1) <= 71) ) {
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
            if ( state.backtracking>0 ) { memoize(input, 28, unaryExpressionNotPlusMinus_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"



    // $ANTLR start "primary"
    // StateMachine.g:254:1: primary returns [ASTExpression expr] : (pExpr= parExpression |id= identifier |nLiteralExpr= literal );
    public final ASTExpression primary() throws RecognitionException {
        ASTExpression expr = null;

        int primary_StartIndex = input.index();

        ASTExpression pExpr =null;

        ASTIdentifier id =null;

        ASTLiteral nLiteralExpr =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return expr; }

            // StateMachine.g:255:5: (pExpr= parExpression |id= identifier |nLiteralExpr= literal )
            int alt30=3;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt30=1;
                }
                break;
            case IDENT:
                {
                alt30=2;
                }
                break;
            case BOOLLITERAL:
            case CHARLITERAL:
            case INTLITERAL:
            case REALLITERAL:
            case STRINGLITERAL:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // StateMachine.g:255:9: pExpr= parExpression
                    {
                    pushFollow(FOLLOW_parExpression_in_primary1798);
                    pExpr=parExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =pExpr;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:256:9: id= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_primary1812);
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
                    // StateMachine.g:260:9: nLiteralExpr= literal
                    {
                    pushFollow(FOLLOW_literal_in_primary1826);
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
            if ( state.backtracking>0 ) { memoize(input, 29, primary_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "primary"



    // $ANTLR start "parExpression"
    // StateMachine.g:263:1: parExpression returns [ASTExpression expr] : '(' e= expression ')' ;
    public final ASTExpression parExpression() throws RecognitionException {
        ASTExpression expr = null;

        int parExpression_StartIndex = input.index();

        ASTExpression e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return expr; }

            // StateMachine.g:264:5: ( '(' e= expression ')' )
            // StateMachine.g:264:9: '(' e= expression ')'
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_parExpression1851); if (state.failed) return expr;

            pushFollow(FOLLOW_expression_in_parExpression1855);
            e=expression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =e;}

            match(input,RPAREN,FOLLOW_RPAREN_in_parExpression1859); if (state.failed) return expr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, parExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "parExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_MACHINE_in_machine76 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_machine80 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_machine84 = new BitSet(new long[]{0x7028400500880110L,0x0000000000000001L});
    public static final BitSet FOLLOW_globalVariableDecl_in_machine97 = new BitSet(new long[]{0x7028400500880110L,0x0000000000000001L});
    public static final BitSet FOLLOW_state_in_machine114 = new BitSet(new long[]{0x3008400400800010L,0x0000000000000001L});
    public static final BitSet FOLLOW_trans_in_machine122 = new BitSet(new long[]{0x0008000400000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_invariantExpression_in_machine135 = new BitSet(new long[]{0x0008000400000000L});
    public static final BitSet FOLLOW_RBRACE_in_machine143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_machine145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stateModifier_in_state169 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_STATE_in_state183 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_state187 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_state191 = new BitSet(new long[]{0xC06C8A0340080B00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_localVariableDecl_in_state204 = new BitSet(new long[]{0xC06C8A0340080B00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expression_in_state223 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_SEMI_in_state225 = new BitSet(new long[]{0x804C8A0240000A00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_RBRACE_in_state236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANS_in_trans244 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_trans246 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_trans248 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_trans258 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ARROW_in_trans260 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_trans262 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ON_in_trans264 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_label_in_trans266 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_trans272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVARIANT_in_invariantExpression284 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_identifier_in_invariantExpression296 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_invariantExpression306 = new BitSet(new long[]{0x80448A0240000A00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expression_in_invariantExpression318 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_SEMI_in_invariantExpression320 = new BitSet(new long[]{0x804C8A0240000A00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_RBRACE_in_invariantExpression329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_label341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identifier359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_stateModifier380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINAL_in_stateModifier390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_stateModifier400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORMAL_in_stateModifier410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_literal432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REALLITERAL_in_literal444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLLITERAL_in_literal456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literal468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literal480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_globalVariableDecl500 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_globalVariableDecl504 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_SEMI_in_globalVariableDecl512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_localVariableDecl530 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDecl534 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_SEMI_in_localVariableDecl542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumType_in_type606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primitiveType635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_primitiveType645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primitiveType656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumType675 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enumType679 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_enumType683 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_COMMA_in_enumType693 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_enumType697 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_RBRACE_in_enumType703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclarator727 = new BitSet(new long[]{0x0000000000200002L,0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_variableDeclarator745 = new BitSet(new long[]{0x80448A0240000A00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator749 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_variableDeclarator761 = new BitSet(new long[]{0x80448A0240000A00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expression_in_variableDeclarator765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression823 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_EQUAL_in_expression836 = new BitSet(new long[]{0x80448A0240000A00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expression_in_expression840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression877 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_IMPLIES_in_conditionalImpliesExpression905 = new BitSet(new long[]{0x80448A0240000A00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression909 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression956 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_conditionalOrExpression984 = new BitSet(new long[]{0x80448A0240000A00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression988 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_conditionalXorExpression_in_conditionalAndExpression1038 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_conditionalAndExpression1068 = new BitSet(new long[]{0x80448A0240000A00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_conditionalXorExpression_in_conditionalAndExpression1072 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalXorExpression1123 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_conditionalXorExpression1151 = new BitSet(new long[]{0x80448A0240000A00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalXorExpression1155 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1203 = new BitSet(new long[]{0x0001000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_set_in_equalityExpression1223 = new BitSet(new long[]{0x80448A0240000A00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1234 = new BitSet(new long[]{0x0001000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1271 = new BitSet(new long[]{0x000001800C000002L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression1299 = new BitSet(new long[]{0x80448A0240000A00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1303 = new BitSet(new long[]{0x000001800C000002L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_relationalOp1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_EQUAL_in_relationalOp1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_relationalOp1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_relationalOp1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1424 = new BitSet(new long[]{0x0004080000000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1455 = new BitSet(new long[]{0x80448A0240000A00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1465 = new BitSet(new long[]{0x0004080000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1521 = new BitSet(new long[]{0x0A00000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1550 = new BitSet(new long[]{0x80448A0240000A00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1618 = new BitSet(new long[]{0x0A00000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression1652 = new BitSet(new long[]{0x80448A0240000A00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression1664 = new BitSet(new long[]{0x80448A0240000A00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_unaryExpression1676 = new BitSet(new long[]{0x80448A0240000A00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_unaryExpression1688 = new BitSet(new long[]{0x80448A0240000A00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryExpressionNotPlusMinus1734 = new BitSet(new long[]{0x80448A0240000A00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus1752 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_set_in_unaryExpressionNotPlusMinus1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_primary1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression1851 = new BitSet(new long[]{0x80448A0240000A00L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expression_in_parExpression1855 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression1859 = new BitSet(new long[]{0x0000000000000002L});

}