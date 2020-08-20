// $ANTLR 3.4 StateMachine.g 2020-08-20 16:38:01

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ARROW", "AT", "BAR", "BOOL", "BOOLLITERAL", "CHAR", "CHARLITERAL", "CHECK", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "ENUM", "ENUMLITERAL", "EQUAL", "EscapeSequence", "FINAL", "FOR", "GOAL", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "IMPLIES", "INT", "INTLITERAL", "INVARIANT", "IdentifierPart", "IdentifierStart", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MACHINE", "MINUS", "ML_COMMENT", "NEWLINE", "NORMAL", "NOT", "NOT_EQUAL", "ON", "PLUS", "PREV", "RBRACE", "RBRACK", "REAL", "REALLITERAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "START", "STATE", "STOP", "STRING", "STRINGLITERAL", "TRANS", "WHERE", "WS", "XOR", "'%'", "'&&'", "'*='", "'++'", "'+='", "'--'", "'-='", "'/='", "'=='", "'global'", "'native'", "'||'"
    };

    public static final int EOF=-1;
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
    public static final int T__81=81;
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
    public static final int STOP=63;
    public static final int STRING=64;
    public static final int STRINGLITERAL=65;
    public static final int TRANS=66;
    public static final int WHERE=67;
    public static final int WS=68;
    public static final int XOR=69;

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
        this.state.ruleMemo = new HashMap[94+1];
         

    }

    public String[] getTokenNames() { return StateMachineParser.tokenNames; }
    public String getGrammarFileName() { return "StateMachine.g"; }



    // $ANTLR start "machine"
    // StateMachine.g:46:1: machine returns [ASTMachine machine] : MACHINE name= identifier LBRACE (v= globalVariableDecl )* (s= state )* (t= trans )* (i= invariantExpression )* (g= goal )? RBRACE EOF ;
    public final ASTMachine machine() throws RecognitionException {
        ASTMachine machine = null;

        int machine_StartIndex = input.index();

        ASTIdentifier name =null;

        ASTVariable v =null;

        ASTState s =null;

        ASTTransition t =null;

        ASTInvariant i =null;

        ASTGoal g =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return machine; }

            // StateMachine.g:46:37: ( MACHINE name= identifier LBRACE (v= globalVariableDecl )* (s= state )* (t= trans )* (i= invariantExpression )* (g= goal )? RBRACE EOF )
            // StateMachine.g:48:5: MACHINE name= identifier LBRACE (v= globalVariableDecl )* (s= state )* (t= trans )* (i= invariantExpression )* (g= goal )? RBRACE EOF
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


            // StateMachine.g:51:9: (t= trans )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==TRANS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // StateMachine.g:51:10: t= trans
            	    {
            	    pushFollow(FOLLOW_trans_in_machine133);
            	    t=trans();

            	    state._fsp--;
            	    if (state.failed) return machine;

            	    if ( state.backtracking==0 ) {machine.addTrans(t);}

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // StateMachine.g:52:9: (i= invariantExpression )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==INVARIANT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // StateMachine.g:52:10: i= invariantExpression
            	    {
            	    pushFollow(FOLLOW_invariantExpression_in_machine150);
            	    i=invariantExpression();

            	    state._fsp--;
            	    if (state.failed) return machine;

            	    if ( state.backtracking==0 ) {machine.addInv(i);}

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // StateMachine.g:53:9: (g= goal )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==GOAL) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // StateMachine.g:53:10: g= goal
                    {
                    pushFollow(FOLLOW_goal_in_machine167);
                    g=goal();

                    state._fsp--;
                    if (state.failed) return machine;

                    if ( state.backtracking==0 ) {machine.addGoal(g);}

                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_machine178); if (state.failed) return machine;

            match(input,EOF,FOLLOW_EOF_in_machine180); if (state.failed) return machine;

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
    // StateMachine.g:57:1: state returns [ASTState aststate] : (m= stateModifier )* STATE e= identifier LBRACE (v= localVariableDecl )* (expr= expression SEMI )* RBRACE ;
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

            // StateMachine.g:61:5: ( (m= stateModifier )* STATE e= identifier LBRACE (v= localVariableDecl )* (expr= expression SEMI )* RBRACE )
            // StateMachine.g:62:5: (m= stateModifier )* STATE e= identifier LBRACE (v= localVariableDecl )* (expr= expression SEMI )* RBRACE
            {
            // StateMachine.g:62:5: (m= stateModifier )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ABSTRACT||LA6_0==FINAL||LA6_0==NORMAL||LA6_0==START) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // StateMachine.g:62:6: m= stateModifier
            	    {
            	    pushFollow(FOLLOW_stateModifier_in_state204);
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
            	    break loop6;
                }
            } while (true);


            if ( state.backtracking==0 ) {
                    try{
                        if (!aststate.isModifierSet()) 
                            aststate.setModifier(ASTStateModifier.NORMAL);
                    }
                    catch (SemanticException exception){System.err.println(exception.getMessage());}
                }

            match(input,STATE,FOLLOW_STATE_in_state234); if (state.failed) return aststate;

            pushFollow(FOLLOW_identifier_in_state238);
            e=identifier();

            state._fsp--;
            if (state.failed) return aststate;

            if ( state.backtracking==0 ) {aststate.setName(e.identifier());aststate.setToken(e.token());}

            match(input,LBRACE,FOLLOW_LBRACE_in_state242); if (state.failed) return aststate;

            // StateMachine.g:80:9: (v= localVariableDecl )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==BOOL||LA7_0==ENUM||LA7_0==INT||LA7_0==REAL||LA7_0==STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // StateMachine.g:80:10: v= localVariableDecl
            	    {
            	    pushFollow(FOLLOW_localVariableDecl_in_state255);
            	    v=localVariableDecl();

            	    state._fsp--;
            	    if (state.failed) return aststate;

            	    if ( state.backtracking==0 ) {aststate.addVar(v);}

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // StateMachine.g:81:9: (expr= expression SEMI )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==BOOLLITERAL||LA8_0==CHARLITERAL||LA8_0==IDENT||LA8_0==INTLITERAL||LA8_0==LPAREN||LA8_0==MINUS||LA8_0==NOT||(LA8_0 >= PLUS && LA8_0 <= PREV)||LA8_0==REALLITERAL||LA8_0==STRINGLITERAL) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // StateMachine.g:81:10: expr= expression SEMI
            	    {
            	    pushFollow(FOLLOW_expression_in_state274);
            	    expr=expression();

            	    state._fsp--;
            	    if (state.failed) return aststate;

            	    match(input,SEMI,FOLLOW_SEMI_in_state276); if (state.failed) return aststate;

            	    if ( state.backtracking==0 ) {aststate.addExpr(expr);}

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_state287); if (state.failed) return aststate;

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
    // StateMachine.g:85:1: trans returns [ASTTransition asttran] : TRANS (name= identifier ) LBRACE (src= identifier ) ARROW (tar= identifier ) ( ON (l= label ) )? ( WHERE e= expression SEMI )? RBRACE ;
    public final ASTTransition trans() throws RecognitionException {
        ASTTransition asttran = null;

        int trans_StartIndex = input.index();

        ASTIdentifier name =null;

        ASTIdentifier src =null;

        ASTIdentifier tar =null;

        ASTLiteral l =null;

        ASTExpression e =null;



             asttran = new ASTTransition();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return asttran; }

            // StateMachine.g:89:3: ( TRANS (name= identifier ) LBRACE (src= identifier ) ARROW (tar= identifier ) ( ON (l= label ) )? ( WHERE e= expression SEMI )? RBRACE )
            // StateMachine.g:89:3: TRANS (name= identifier ) LBRACE (src= identifier ) ARROW (tar= identifier ) ( ON (l= label ) )? ( WHERE e= expression SEMI )? RBRACE
            {
            match(input,TRANS,FOLLOW_TRANS_in_trans304); if (state.failed) return asttran;

            // StateMachine.g:89:9: (name= identifier )
            // StateMachine.g:89:10: name= identifier
            {
            pushFollow(FOLLOW_identifier_in_trans311);
            name=identifier();

            state._fsp--;
            if (state.failed) return asttran;

            }


            if ( state.backtracking==0 ) {asttran.setName(name.identifier());}

            match(input,LBRACE,FOLLOW_LBRACE_in_trans316); if (state.failed) return asttran;

            // StateMachine.g:90:9: (src= identifier )
            // StateMachine.g:90:10: src= identifier
            {
            pushFollow(FOLLOW_identifier_in_trans331);
            src=identifier();

            state._fsp--;
            if (state.failed) return asttran;

            }


            if ( state.backtracking==0 ) {asttran.setSrc(src.token());}

            match(input,ARROW,FOLLOW_ARROW_in_trans345); if (state.failed) return asttran;

            // StateMachine.g:91:15: (tar= identifier )
            // StateMachine.g:91:16: tar= identifier
            {
            pushFollow(FOLLOW_identifier_in_trans352);
            tar=identifier();

            state._fsp--;
            if (state.failed) return asttran;

            }


            if ( state.backtracking==0 ) {asttran.setTar(tar.token());}

            // StateMachine.g:92:9: ( ON (l= label ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ON) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // StateMachine.g:92:10: ON (l= label )
                    {
                    match(input,ON,FOLLOW_ON_in_trans366); if (state.failed) return asttran;

                    // StateMachine.g:92:13: (l= label )
                    // StateMachine.g:92:14: l= label
                    {
                    pushFollow(FOLLOW_label_in_trans371);
                    l=label();

                    state._fsp--;
                    if (state.failed) return asttran;

                    }


                    if ( state.backtracking==0 ) {asttran.setLabel(l.toString());}

                    }
                    break;

            }


            // StateMachine.g:93:9: ( WHERE e= expression SEMI )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==WHERE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // StateMachine.g:93:10: WHERE e= expression SEMI
                    {
                    match(input,WHERE,FOLLOW_WHERE_in_trans387); if (state.failed) return asttran;

                    pushFollow(FOLLOW_expression_in_trans391);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return asttran;

                    if ( state.backtracking==0 ) {asttran.setExpression(e);}

                    match(input,SEMI,FOLLOW_SEMI_in_trans395); if (state.failed) return asttran;

                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_trans403); if (state.failed) return asttran;

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
        return asttran;
    }
    // $ANTLR end "trans"



    // $ANTLR start "invariantExpression"
    // StateMachine.g:97:1: invariantExpression returns [ASTInvariant astinv] : INVARIANT name= identifier LBRACE (e= expression SEMI )+ RBRACE ( FOR LBRACE s= identifier ( COMMA t= identifier )* RBRACE )? ;
    public final ASTInvariant invariantExpression() throws RecognitionException {
        ASTInvariant astinv = null;

        int invariantExpression_StartIndex = input.index();

        ASTIdentifier name =null;

        ASTExpression e =null;

        ASTIdentifier s =null;

        ASTIdentifier t =null;



            astinv = new ASTInvariant();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return astinv; }

            // StateMachine.g:101:5: ( INVARIANT name= identifier LBRACE (e= expression SEMI )+ RBRACE ( FOR LBRACE s= identifier ( COMMA t= identifier )* RBRACE )? )
            // StateMachine.g:101:5: INVARIANT name= identifier LBRACE (e= expression SEMI )+ RBRACE ( FOR LBRACE s= identifier ( COMMA t= identifier )* RBRACE )?
            {
            match(input,INVARIANT,FOLLOW_INVARIANT_in_invariantExpression422); if (state.failed) return astinv;

            pushFollow(FOLLOW_identifier_in_invariantExpression436);
            name=identifier();

            state._fsp--;
            if (state.failed) return astinv;

            if ( state.backtracking==0 ) {astinv.setToken(name.token());}

            match(input,LBRACE,FOLLOW_LBRACE_in_invariantExpression444); if (state.failed) return astinv;

            // StateMachine.g:104:9: (e= expression SEMI )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==BOOLLITERAL||LA11_0==CHARLITERAL||LA11_0==IDENT||LA11_0==INTLITERAL||LA11_0==LPAREN||LA11_0==MINUS||LA11_0==NOT||(LA11_0 >= PLUS && LA11_0 <= PREV)||LA11_0==REALLITERAL||LA11_0==STRINGLITERAL) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // StateMachine.g:104:10: e= expression SEMI
            	    {
            	    pushFollow(FOLLOW_expression_in_invariantExpression458);
            	    e=expression();

            	    state._fsp--;
            	    if (state.failed) return astinv;

            	    match(input,SEMI,FOLLOW_SEMI_in_invariantExpression460); if (state.failed) return astinv;

            	    if ( state.backtracking==0 ) {astinv.addExpr(e);}

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return astinv;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_invariantExpression471); if (state.failed) return astinv;

            // StateMachine.g:107:5: ( FOR LBRACE s= identifier ( COMMA t= identifier )* RBRACE )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==FOR) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // StateMachine.g:107:6: FOR LBRACE s= identifier ( COMMA t= identifier )* RBRACE
                    {
                    match(input,FOR,FOLLOW_FOR_in_invariantExpression483); if (state.failed) return astinv;

                    match(input,LBRACE,FOLLOW_LBRACE_in_invariantExpression485); if (state.failed) return astinv;

                    pushFollow(FOLLOW_identifier_in_invariantExpression489);
                    s=identifier();

                    state._fsp--;
                    if (state.failed) return astinv;

                    if ( state.backtracking==0 ) {astinv.addState(s);}

                    // StateMachine.g:107:53: ( COMMA t= identifier )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // StateMachine.g:107:54: COMMA t= identifier
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_invariantExpression494); if (state.failed) return astinv;

                    	    pushFollow(FOLLOW_identifier_in_invariantExpression498);
                    	    t=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return astinv;

                    	    if ( state.backtracking==0 ) {astinv.addState(t);}

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    match(input,RBRACE,FOLLOW_RBRACE_in_invariantExpression505); if (state.failed) return astinv;

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
        return astinv;
    }
    // $ANTLR end "invariantExpression"



    // $ANTLR start "goal"
    // StateMachine.g:110:1: goal returns [ASTGoal astgoal] : g= GOAL LBRACE t= CHECK f= forExpr (s= stopExpr )? RBRACE ;
    public final ASTGoal goal() throws RecognitionException {
        ASTGoal astgoal = null;

        int goal_StartIndex = input.index();

        Token g=null;
        Token t=null;
        ASTForExpression f =null;

        ASTStopExpression s =null;



            astgoal = new ASTGoal();
         
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return astgoal; }

            // StateMachine.g:112:3: (g= GOAL LBRACE t= CHECK f= forExpr (s= stopExpr )? RBRACE )
            // StateMachine.g:113:5: g= GOAL LBRACE t= CHECK f= forExpr (s= stopExpr )? RBRACE
            {
            g=(Token)match(input,GOAL,FOLLOW_GOAL_in_goal528); if (state.failed) return astgoal;

            match(input,LBRACE,FOLLOW_LBRACE_in_goal530); if (state.failed) return astgoal;

            t=(Token)match(input,CHECK,FOLLOW_CHECK_in_goal538); if (state.failed) return astgoal;

            pushFollow(FOLLOW_forExpr_in_goal542);
            f=forExpr();

            state._fsp--;
            if (state.failed) return astgoal;

            if ( state.backtracking==0 ) {
                    astgoal.setToken(g);
                    astgoal.setFor(f);
                }

            // StateMachine.g:118:5: (s= stopExpr )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==STOP) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // StateMachine.g:118:6: s= stopExpr
                    {
                    pushFollow(FOLLOW_stopExpr_in_goal554);
                    s=stopExpr();

                    state._fsp--;
                    if (state.failed) return astgoal;

                    if ( state.backtracking==0 ) {
                                astgoal.setStop(s);
                            }

                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_goal581); if (state.failed) return astgoal;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, goal_StartIndex); }

        }
        return astgoal;
    }
    // $ANTLR end "goal"



    // $ANTLR start "forExpr"
    // StateMachine.g:126:1: forExpr returns [ASTForExpression forexpr] : t= FOR l= INTLITERAL ;
    public final ASTForExpression forExpr() throws RecognitionException {
        ASTForExpression forexpr = null;

        int forExpr_StartIndex = input.index();

        Token t=null;
        Token l=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return forexpr; }

            // StateMachine.g:126:43: (t= FOR l= INTLITERAL )
            // StateMachine.g:127:5: t= FOR l= INTLITERAL
            {
            t=(Token)match(input,FOR,FOLLOW_FOR_in_forExpr599); if (state.failed) return forexpr;

            l=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_forExpr603); if (state.failed) return forexpr;

            if ( state.backtracking==0 ) {
                    int s = Integer.parseInt(l.getText());
                    forexpr = new ASTForExpression(t,s);
                }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, forExpr_StartIndex); }

        }
        return forexpr;
    }
    // $ANTLR end "forExpr"



    // $ANTLR start "stopExpr"
    // StateMachine.g:133:1: stopExpr returns [ASTStopExpression aststop] : (t= STOP AT LPAREN s1= identifier ( COMMA s2= identifier )* RPAREN ) ;
    public final ASTStopExpression stopExpr() throws RecognitionException {
        ASTStopExpression aststop = null;

        int stopExpr_StartIndex = input.index();

        Token t=null;
        ASTIdentifier s1 =null;

        ASTIdentifier s2 =null;



            aststop = new ASTStopExpression();
         
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return aststop; }

            // StateMachine.g:135:3: ( (t= STOP AT LPAREN s1= identifier ( COMMA s2= identifier )* RPAREN ) )
            // StateMachine.g:136:5: (t= STOP AT LPAREN s1= identifier ( COMMA s2= identifier )* RPAREN )
            {
            // StateMachine.g:136:5: (t= STOP AT LPAREN s1= identifier ( COMMA s2= identifier )* RPAREN )
            // StateMachine.g:136:6: t= STOP AT LPAREN s1= identifier ( COMMA s2= identifier )* RPAREN
            {
            t=(Token)match(input,STOP,FOLLOW_STOP_in_stopExpr626); if (state.failed) return aststop;

            if ( state.backtracking==0 ) {aststop.setToken(t);}

            match(input,AT,FOLLOW_AT_in_stopExpr630); if (state.failed) return aststop;

            match(input,LPAREN,FOLLOW_LPAREN_in_stopExpr633); if (state.failed) return aststop;

            pushFollow(FOLLOW_identifier_in_stopExpr648);
            s1=identifier();

            state._fsp--;
            if (state.failed) return aststop;

            if ( state.backtracking==0 ) {
                        aststop.addState(s1.identifier());
                    }

            // StateMachine.g:140:9: ( COMMA s2= identifier )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // StateMachine.g:140:10: COMMA s2= identifier
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_stopExpr661); if (state.failed) return aststop;

            	    pushFollow(FOLLOW_identifier_in_stopExpr665);
            	    s2=identifier();

            	    state._fsp--;
            	    if (state.failed) return aststop;

            	    if ( state.backtracking==0 ) {
            	                aststop.addState(s2.identifier());}

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_stopExpr685); if (state.failed) return aststop;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, stopExpr_StartIndex); }

        }
        return aststop;
    }
    // $ANTLR end "stopExpr"



    // $ANTLR start "label"
    // StateMachine.g:146:1: label returns [ASTLiteral literal_node] : s= STRINGLITERAL ;
    public final ASTLiteral label() throws RecognitionException {
        ASTLiteral literal_node = null;

        int label_StartIndex = input.index();

        Token s=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return literal_node; }

            // StateMachine.g:146:40: (s= STRINGLITERAL )
            // StateMachine.g:147:5: s= STRINGLITERAL
            {
            s=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_label705); if (state.failed) return literal_node;

            if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.STRING,s);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, label_StartIndex); }

        }
        return literal_node;
    }
    // $ANTLR end "label"



    // $ANTLR start "identifier"
    // StateMachine.g:150:1: identifier returns [ASTIdentifier expr] : str= IDENT ;
    public final ASTIdentifier identifier() throws RecognitionException {
        ASTIdentifier expr = null;

        int identifier_StartIndex = input.index();

        Token str=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return expr; }

            // StateMachine.g:150:40: (str= IDENT )
            // StateMachine.g:151:5: str= IDENT
            {
            str=(Token)match(input,IDENT,FOLLOW_IDENT_in_identifier724); if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr = new ASTIdentifier(str);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, identifier_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "identifier"



    // $ANTLR start "stateModifier"
    // StateMachine.g:154:1: stateModifier returns [ASTStateModifier modifier] : ( START | FINAL | ABSTRACT | NORMAL );
    public final ASTStateModifier stateModifier() throws RecognitionException {
        ASTStateModifier modifier = null;

        int stateModifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return modifier; }

            // StateMachine.g:154:50: ( START | FINAL | ABSTRACT | NORMAL )
            int alt16=4;
            switch ( input.LA(1) ) {
            case START:
                {
                alt16=1;
                }
                break;
            case FINAL:
                {
                alt16=2;
                }
                break;
            case ABSTRACT:
                {
                alt16=3;
                }
                break;
            case NORMAL:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return modifier;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // StateMachine.g:155:7: START
                    {
                    match(input,START,FOLLOW_START_in_stateModifier745); if (state.failed) return modifier;

                    if ( state.backtracking==0 ) {modifier =ASTStateModifier.START;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:156:7: FINAL
                    {
                    match(input,FINAL,FOLLOW_FINAL_in_stateModifier755); if (state.failed) return modifier;

                    if ( state.backtracking==0 ) {modifier =ASTStateModifier.FINAL;}

                    }
                    break;
                case 3 :
                    // StateMachine.g:157:7: ABSTRACT
                    {
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_stateModifier765); if (state.failed) return modifier;

                    if ( state.backtracking==0 ) {modifier =ASTStateModifier.ABSTRACT;}

                    }
                    break;
                case 4 :
                    // StateMachine.g:158:7: NORMAL
                    {
                    match(input,NORMAL,FOLLOW_NORMAL_in_stateModifier775); if (state.failed) return modifier;

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
            if ( state.backtracking>0 ) { memoize(input, 10, stateModifier_StartIndex); }

        }
        return modifier;
    }
    // $ANTLR end "stateModifier"



    // $ANTLR start "literal"
    // StateMachine.g:161:1: literal returns [ASTLiteral literal_node] : (l= INTLITERAL |r= REALLITERAL |b= BOOLLITERAL |s= STRINGLITERAL |c= CHARLITERAL );
    public final ASTLiteral literal() throws RecognitionException {
        ASTLiteral literal_node = null;

        int literal_StartIndex = input.index();

        Token l=null;
        Token r=null;
        Token b=null;
        Token s=null;
        Token c=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return literal_node; }

            // StateMachine.g:161:42: (l= INTLITERAL |r= REALLITERAL |b= BOOLLITERAL |s= STRINGLITERAL |c= CHARLITERAL )
            int alt17=5;
            switch ( input.LA(1) ) {
            case INTLITERAL:
                {
                alt17=1;
                }
                break;
            case REALLITERAL:
                {
                alt17=2;
                }
                break;
            case BOOLLITERAL:
                {
                alt17=3;
                }
                break;
            case STRINGLITERAL:
                {
                alt17=4;
                }
                break;
            case CHARLITERAL:
                {
                alt17=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return literal_node;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // StateMachine.g:162:7: l= INTLITERAL
                    {
                    l=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literal797); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.INT,l);}

                    }
                    break;
                case 2 :
                    // StateMachine.g:163:7: r= REALLITERAL
                    {
                    r=(Token)match(input,REALLITERAL,FOLLOW_REALLITERAL_in_literal809); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.REAL,r);}

                    }
                    break;
                case 3 :
                    // StateMachine.g:164:7: b= BOOLLITERAL
                    {
                    b=(Token)match(input,BOOLLITERAL,FOLLOW_BOOLLITERAL_in_literal821); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.BOOL,b);}

                    }
                    break;
                case 4 :
                    // StateMachine.g:165:7: s= STRINGLITERAL
                    {
                    s=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literal833); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.STRING,s);}

                    }
                    break;
                case 5 :
                    // StateMachine.g:166:7: c= CHARLITERAL
                    {
                    c=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literal845); if (state.failed) return literal_node;

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
            if ( state.backtracking>0 ) { memoize(input, 11, literal_StartIndex); }

        }
        return literal_node;
    }
    // $ANTLR end "literal"



    // $ANTLR start "globalVariableDecl"
    // StateMachine.g:169:1: globalVariableDecl returns [ASTVariable v] : t= type n= variableDeclarator SEMI ;
    public final ASTVariable globalVariableDecl() throws RecognitionException {
        ASTVariable v = null;

        int globalVariableDecl_StartIndex = input.index();

        Type t =null;

        ASTVariable n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return v; }

            // StateMachine.g:169:43: (t= type n= variableDeclarator SEMI )
            // StateMachine.g:170:5: t= type n= variableDeclarator SEMI
            {
            pushFollow(FOLLOW_type_in_globalVariableDecl865);
            t=type();

            state._fsp--;
            if (state.failed) return v;

            pushFollow(FOLLOW_variableDeclarator_in_globalVariableDecl869);
            n=variableDeclarator();

            state._fsp--;
            if (state.failed) return v;

            if ( state.backtracking==0 ) {n.type=t;n.createVariable();v =n;}

            match(input,SEMI,FOLLOW_SEMI_in_globalVariableDecl877); if (state.failed) return v;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, globalVariableDecl_StartIndex); }

        }
        return v;
    }
    // $ANTLR end "globalVariableDecl"



    // $ANTLR start "localVariableDecl"
    // StateMachine.g:174:1: localVariableDecl returns [ASTVariable v] : t= type n= variableDeclarator SEMI ;
    public final ASTVariable localVariableDecl() throws RecognitionException {
        ASTVariable v = null;

        int localVariableDecl_StartIndex = input.index();

        Type t =null;

        ASTVariable n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return v; }

            // StateMachine.g:174:42: (t= type n= variableDeclarator SEMI )
            // StateMachine.g:175:5: t= type n= variableDeclarator SEMI
            {
            pushFollow(FOLLOW_type_in_localVariableDecl895);
            t=type();

            state._fsp--;
            if (state.failed) return v;

            pushFollow(FOLLOW_variableDeclarator_in_localVariableDecl899);
            n=variableDeclarator();

            state._fsp--;
            if (state.failed) return v;

            if ( state.backtracking==0 ) {n.type=t;n.createVariable();v =n;}

            match(input,SEMI,FOLLOW_SEMI_in_localVariableDecl907); if (state.failed) return v;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, localVariableDecl_StartIndex); }

        }
        return v;
    }
    // $ANTLR end "localVariableDecl"



    // $ANTLR start "modifier"
    // StateMachine.g:179:1: modifier : ( 'global' | 'native' );
    public final void modifier() throws RecognitionException {
        int modifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }

            // StateMachine.g:179:10: ( 'global' | 'native' )
            // StateMachine.g:
            {
            if ( (input.LA(1) >= 79 && input.LA(1) <= 80) ) {
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
            if ( state.backtracking>0 ) { memoize(input, 14, modifier_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "modifier"



    // $ANTLR start "type"
    // StateMachine.g:184:1: type returns [Type t] : (p= primitiveType |e= enumType );
    public final Type type() throws RecognitionException {
        Type t = null;

        int type_StartIndex = input.index();

        Type p =null;

        EnumType e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return t; }

            // StateMachine.g:184:23: (p= primitiveType |e= enumType )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==BOOL||LA18_0==INT||LA18_0==REAL||LA18_0==STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==ENUM) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // StateMachine.g:185:9: p= primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type957);
                    p=primitiveType();

                    state._fsp--;
                    if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =p;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:186:9: e= enumType
                    {
                    pushFollow(FOLLOW_enumType_in_type971);
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
            if ( state.backtracking>0 ) { memoize(input, 15, type_StartIndex); }

        }
        return t;
    }
    // $ANTLR end "type"



    // $ANTLR start "primitiveType"
    // StateMachine.g:189:1: primitiveType returns [Type t] : ( INT | BOOL | REAL | STRING );
    public final Type primitiveType() throws RecognitionException {
        Type t = null;

        int primitiveType_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return t; }

            // StateMachine.g:189:31: ( INT | BOOL | REAL | STRING )
            int alt19=4;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt19=1;
                }
                break;
            case BOOL:
                {
                alt19=2;
                }
                break;
            case REAL:
                {
                alt19=3;
                }
                break;
            case STRING:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // StateMachine.g:190:7: INT
                    {
                    match(input,INT,FOLLOW_INT_in_primitiveType990); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t = new IntType();}

                    }
                    break;
                case 2 :
                    // StateMachine.g:191:7: BOOL
                    {
                    match(input,BOOL,FOLLOW_BOOL_in_primitiveType1000); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =new BoolType();}

                    }
                    break;
                case 3 :
                    // StateMachine.g:192:7: REAL
                    {
                    match(input,REAL,FOLLOW_REAL_in_primitiveType1010); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =new RealType();}

                    }
                    break;
                case 4 :
                    // StateMachine.g:193:7: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_primitiveType1021); if (state.failed) return t;

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
            if ( state.backtracking>0 ) { memoize(input, 16, primitiveType_StartIndex); }

        }
        return t;
    }
    // $ANTLR end "primitiveType"



    // $ANTLR start "enumType"
    // StateMachine.g:196:1: enumType returns [EnumType t] : ENUM LBRACE name= identifier ( COMMA l= identifier )* RBRACE ;
    public final EnumType enumType() throws RecognitionException {
        EnumType t = null;

        int enumType_StartIndex = input.index();

        ASTIdentifier name =null;

        ASTIdentifier l =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return t; }

            // StateMachine.g:196:31: ( ENUM LBRACE name= identifier ( COMMA l= identifier )* RBRACE )
            // StateMachine.g:197:5: ENUM LBRACE name= identifier ( COMMA l= identifier )* RBRACE
            {
            match(input,ENUM,FOLLOW_ENUM_in_enumType1040); if (state.failed) return t;

            if ( state.backtracking==0 ) {t =new EnumType();}

            match(input,LBRACE,FOLLOW_LBRACE_in_enumType1044); if (state.failed) return t;

            pushFollow(FOLLOW_identifier_in_enumType1048);
            name=identifier();

            state._fsp--;
            if (state.failed) return t;

            if ( state.backtracking==0 ) {t.add(name.toString());}

            // StateMachine.g:198:5: ( COMMA l= identifier )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // StateMachine.g:198:6: COMMA l= identifier
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_enumType1058); if (state.failed) return t;

            	    pushFollow(FOLLOW_identifier_in_enumType1062);
            	    l=identifier();

            	    state._fsp--;
            	    if (state.failed) return t;

            	    if ( state.backtracking==0 ) {t.add(l.toString());}

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_enumType1068); if (state.failed) return t;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, enumType_StartIndex); }

        }
        return t;
    }
    // $ANTLR end "enumType"



    // $ANTLR start "variableDeclarator"
    // StateMachine.g:201:1: variableDeclarator returns [ASTVariable var] :n= identifier ( '=' n= variableInitializer )? ( WHERE e= expression )? ;
    public final ASTVariable variableDeclarator() throws RecognitionException {
        ASTVariable var = null;

        int variableDeclarator_StartIndex = input.index();

        ASTExpression n =null;

        ASTExpression e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return var; }

            // StateMachine.g:201:45: (n= identifier ( '=' n= variableInitializer )? ( WHERE e= expression )? )
            // StateMachine.g:202:5: n= identifier ( '=' n= variableInitializer )? ( WHERE e= expression )?
            {
            if ( state.backtracking==0 ) {var =new ASTVariable();}

            pushFollow(FOLLOW_identifier_in_variableDeclarator1092);
            n=identifier();

            state._fsp--;
            if (state.failed) return var;

            if ( state.backtracking==0 ) {
                        var.name=n.toString();
                        var.setToken( ((ASTIdentifier)n).token());
                    }

            // StateMachine.g:208:5: ( '=' n= variableInitializer )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==EQUAL) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // StateMachine.g:208:6: '=' n= variableInitializer
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_variableDeclarator1110); if (state.failed) return var;

                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator1114);
                    n=variableInitializer();

                    state._fsp--;
                    if (state.failed) return var;

                    if ( state.backtracking==0 ) {var.initializer=n;}

                    }
                    break;

            }


            // StateMachine.g:209:5: ( WHERE e= expression )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==WHERE) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // StateMachine.g:209:6: WHERE e= expression
                    {
                    match(input,WHERE,FOLLOW_WHERE_in_variableDeclarator1126); if (state.failed) return var;

                    pushFollow(FOLLOW_expression_in_variableDeclarator1130);
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
            if ( state.backtracking>0 ) { memoize(input, 18, variableDeclarator_StartIndex); }

        }
        return var;
    }
    // $ANTLR end "variableDeclarator"



    // $ANTLR start "variableInitializer"
    // StateMachine.g:212:1: variableInitializer returns [ASTExpression expr] : n= expression ;
    public final ASTExpression variableInitializer() throws RecognitionException {
        ASTExpression expr = null;

        int variableInitializer_StartIndex = input.index();

        ASTExpression n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return expr; }

            // StateMachine.g:212:49: (n= expression )
            // StateMachine.g:213:9: n= expression
            {
            pushFollow(FOLLOW_expression_in_variableInitializer1158);
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
            if ( state.backtracking>0 ) { memoize(input, 19, variableInitializer_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "variableInitializer"



    // $ANTLR start "expression"
    // StateMachine.g:216:1: expression returns [ASTExpression expr] : nImpliesExpr= conditionalImpliesExpression (operator= assignmentOperator nExpr= expression )? ;
    public final ASTExpression expression() throws RecognitionException {
        ASTExpression expr = null;

        int expression_StartIndex = input.index();

        ASTExpression nImpliesExpr =null;

        Token operator =null;

        ASTExpression nExpr =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return expr; }

            // StateMachine.g:216:40: (nImpliesExpr= conditionalImpliesExpression (operator= assignmentOperator nExpr= expression )? )
            // StateMachine.g:217:9: nImpliesExpr= conditionalImpliesExpression (operator= assignmentOperator nExpr= expression )?
            {
            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression1188);
            nImpliesExpr=conditionalImpliesExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nImpliesExpr;}

            // StateMachine.g:218:9: (operator= assignmentOperator nExpr= expression )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==EQUAL||LA23_0==72||LA23_0==74||(LA23_0 >= 76 && LA23_0 <= 77)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // StateMachine.g:219:13: operator= assignmentOperator nExpr= expression
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_expression1217);
                    operator=assignmentOperator();

                    state._fsp--;
                    if (state.failed) return expr;

                    pushFollow(FOLLOW_expression_in_expression1221);
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
            if ( state.backtracking>0 ) { memoize(input, 20, expression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "expression"



    // $ANTLR start "assignmentOperator"
    // StateMachine.g:226:1: assignmentOperator returns [Token token] : (t= '=' |t= '+=' |t= '-=' |t= '*=' |t= '/=' );
    public final Token assignmentOperator() throws RecognitionException {
        Token token = null;

        int assignmentOperator_StartIndex = input.index();

        Token t=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return token; }

            // StateMachine.g:227:5: (t= '=' |t= '+=' |t= '-=' |t= '*=' |t= '/=' )
            int alt24=5;
            switch ( input.LA(1) ) {
            case EQUAL:
                {
                alt24=1;
                }
                break;
            case 74:
                {
                alt24=2;
                }
                break;
            case 76:
                {
                alt24=3;
                }
                break;
            case 72:
                {
                alt24=4;
                }
                break;
            case 77:
                {
                alt24=5;
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
                    // StateMachine.g:227:9: t= '='
                    {
                    t=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assignmentOperator1273); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:228:9: t= '+='
                    {
                    t=(Token)match(input,74,FOLLOW_74_in_assignmentOperator1289); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 3 :
                    // StateMachine.g:229:9: t= '-='
                    {
                    t=(Token)match(input,76,FOLLOW_76_in_assignmentOperator1304); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 4 :
                    // StateMachine.g:230:9: t= '*='
                    {
                    t=(Token)match(input,72,FOLLOW_72_in_assignmentOperator1319); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 5 :
                    // StateMachine.g:231:9: t= '/='
                    {
                    t=(Token)match(input,77,FOLLOW_77_in_assignmentOperator1334); if (state.failed) return token;

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
            if ( state.backtracking>0 ) { memoize(input, 21, assignmentOperator_StartIndex); }

        }
        return token;
    }
    // $ANTLR end "assignmentOperator"



    // $ANTLR start "conditionalImpliesExpression"
    // StateMachine.g:234:1: conditionalImpliesExpression returns [ASTExpression expr] : nOrExpr= conditionalOrExpression (operator= IMPLIES n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalImpliesExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nOrExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return expr; }

            // StateMachine.g:235:5: (nOrExpr= conditionalOrExpression (operator= IMPLIES n1= conditionalOrExpression )* )
            // StateMachine.g:235:9: nOrExpr= conditionalOrExpression (operator= IMPLIES n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1357);
            nOrExpr=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nOrExpr;}

            // StateMachine.g:236:9: (operator= IMPLIES n1= conditionalOrExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==IMPLIES) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // StateMachine.g:237:13: operator= IMPLIES n1= conditionalOrExpression
            	    {
            	    operator=(Token)match(input,IMPLIES,FOLLOW_IMPLIES_in_conditionalImpliesExpression1385); if (state.failed) return expr;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1389);
            	    n1=conditionalOrExpression();

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
            if ( state.backtracking>0 ) { memoize(input, 22, conditionalImpliesExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalImpliesExpression"



    // $ANTLR start "conditionalOrExpression"
    // StateMachine.g:242:1: conditionalOrExpression returns [ASTExpression expr] : nAndExpr= conditionalAndExpression (operator= '||' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalOrExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nAndExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return expr; }

            // StateMachine.g:243:5: (nAndExpr= conditionalAndExpression (operator= '||' n1= conditionalAndExpression )* )
            // StateMachine.g:243:9: nAndExpr= conditionalAndExpression (operator= '||' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression1436);
            nAndExpr=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nAndExpr;}

            // StateMachine.g:244:9: (operator= '||' n1= conditionalAndExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==81) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // StateMachine.g:245:13: operator= '||' n1= conditionalAndExpression
            	    {
            	    operator=(Token)match(input,81,FOLLOW_81_in_conditionalOrExpression1464); if (state.failed) return expr;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression1468);
            	    n1=conditionalAndExpression();

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
            if ( state.backtracking>0 ) { memoize(input, 23, conditionalOrExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // StateMachine.g:250:1: conditionalAndExpression returns [ASTExpression expr] : nXorExpr= conditionalXorExpression (operator= '&&' n1= conditionalXorExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalAndExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nXorExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return expr; }

            // StateMachine.g:251:5: (nXorExpr= conditionalXorExpression (operator= '&&' n1= conditionalXorExpression )* )
            // StateMachine.g:251:9: nXorExpr= conditionalXorExpression (operator= '&&' n1= conditionalXorExpression )*
            {
            pushFollow(FOLLOW_conditionalXorExpression_in_conditionalAndExpression1518);
            nXorExpr=conditionalXorExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nXorExpr;}

            // StateMachine.g:252:9: (operator= '&&' n1= conditionalXorExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==71) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // StateMachine.g:253:14: operator= '&&' n1= conditionalXorExpression
            	    {
            	    operator=(Token)match(input,71,FOLLOW_71_in_conditionalAndExpression1548); if (state.failed) return expr;

            	    pushFollow(FOLLOW_conditionalXorExpression_in_conditionalAndExpression1552);
            	    n1=conditionalXorExpression();

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
            if ( state.backtracking>0 ) { memoize(input, 24, conditionalAndExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "conditionalXorExpression"
    // StateMachine.g:258:1: conditionalXorExpression returns [ASTExpression expr] : nEquality= equalityExpression (operator= XOR n1= equalityExpression )* ;
    public final ASTExpression conditionalXorExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalXorExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nEquality =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return expr; }

            // StateMachine.g:259:5: (nEquality= equalityExpression (operator= XOR n1= equalityExpression )* )
            // StateMachine.g:259:9: nEquality= equalityExpression (operator= XOR n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalXorExpression1603);
            nEquality=equalityExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nEquality;}

            // StateMachine.g:260:9: (operator= XOR n1= equalityExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==XOR) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // StateMachine.g:261:13: operator= XOR n1= equalityExpression
            	    {
            	    operator=(Token)match(input,XOR,FOLLOW_XOR_in_conditionalXorExpression1631); if (state.failed) return expr;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalXorExpression1635);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

            	    }
            	    break;

            	default :
            	    break loop28;
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
            if ( state.backtracking>0 ) { memoize(input, 25, conditionalXorExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalXorExpression"



    // $ANTLR start "equalityExpression"
    // StateMachine.g:266:1: equalityExpression returns [ASTExpression expr] : nRelExpr= relationalExpression (operator= ( '==' | '!=' ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression expr = null;

        int equalityExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nRelExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return expr; }

            // StateMachine.g:267:5: (nRelExpr= relationalExpression (operator= ( '==' | '!=' ) n1= relationalExpression )* )
            // StateMachine.g:267:9: nRelExpr= relationalExpression (operator= ( '==' | '!=' ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1683);
            nRelExpr=relationalExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nRelExpr;}

            // StateMachine.g:268:5: (operator= ( '==' | '!=' ) n1= relationalExpression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==NOT_EQUAL||LA29_0==78) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // StateMachine.g:269:9: operator= ( '==' | '!=' ) n1= relationalExpression
            	    {
            	    operator=(Token)input.LT(1);

            	    if ( input.LA(1)==NOT_EQUAL||input.LA(1)==78 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return expr;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1714);
            	    n1=relationalExpression();

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
            if ( state.backtracking>0 ) { memoize(input, 26, equalityExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "equalityExpression"



    // $ANTLR start "relationalExpression"
    // StateMachine.g:274:1: relationalExpression returns [ASTExpression expr] : nAddExpr= additiveExpression (operator= relationalOp n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression expr = null;

        int relationalExpression_StartIndex = input.index();

        ASTExpression nAddExpr =null;

        Token operator =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return expr; }

            // StateMachine.g:275:5: (nAddExpr= additiveExpression (operator= relationalOp n1= additiveExpression )* )
            // StateMachine.g:275:7: nAddExpr= additiveExpression (operator= relationalOp n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1751);
            nAddExpr=additiveExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nAddExpr;}

            // StateMachine.g:276:9: (operator= relationalOp n1= additiveExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0 >= GREATER && LA30_0 <= GREATER_EQUAL)||(LA30_0 >= LESS && LA30_0 <= LESS_EQUAL)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // StateMachine.g:277:13: operator= relationalOp n1= additiveExpression
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression1779);
            	    operator=relationalOp();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1783);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

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
            if ( state.backtracking>0 ) { memoize(input, 27, relationalExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "relationalExpression"



    // $ANTLR start "relationalOp"
    // StateMachine.g:282:1: relationalOp returns [Token token] : (t= '<=' |t= '>=' |t= '<' |t= '>' );
    public final Token relationalOp() throws RecognitionException {
        Token token = null;

        int relationalOp_StartIndex = input.index();

        Token t=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return token; }

            // StateMachine.g:283:5: (t= '<=' |t= '>=' |t= '<' |t= '>' )
            int alt31=4;
            switch ( input.LA(1) ) {
            case LESS_EQUAL:
                {
                alt31=1;
                }
                break;
            case GREATER_EQUAL:
                {
                alt31=2;
                }
                break;
            case LESS:
                {
                alt31=3;
                }
                break;
            case GREATER:
                {
                alt31=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return token;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // StateMachine.g:283:10: t= '<='
                    {
                    t=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_relationalOp1830); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:284:10: t= '>='
                    {
                    t=(Token)match(input,GREATER_EQUAL,FOLLOW_GREATER_EQUAL_in_relationalOp1845); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 3 :
                    // StateMachine.g:285:10: t= '<'
                    {
                    t=(Token)match(input,LESS,FOLLOW_LESS_in_relationalOp1860); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 4 :
                    // StateMachine.g:286:10: t= '>'
                    {
                    t=(Token)match(input,GREATER,FOLLOW_GREATER_in_relationalOp1876); if (state.failed) return token;

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
            if ( state.backtracking>0 ) { memoize(input, 28, relationalOp_StartIndex); }

        }
        return token;
    }
    // $ANTLR end "relationalOp"



    // $ANTLR start "additiveExpression"
    // StateMachine.g:289:1: additiveExpression returns [ASTExpression expr] : nMulExpr= multiplicativeExpression (operator= ( '+' | '-' ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression expr = null;

        int additiveExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nMulExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return expr; }

            // StateMachine.g:290:5: (nMulExpr= multiplicativeExpression (operator= ( '+' | '-' ) n1= multiplicativeExpression )* )
            // StateMachine.g:290:9: nMulExpr= multiplicativeExpression (operator= ( '+' | '-' ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1904);
            nMulExpr=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nMulExpr;}

            // StateMachine.g:291:9: (operator= ( '+' | '-' ) n1= multiplicativeExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==MINUS||LA32_0==PLUS) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // StateMachine.g:292:13: operator= ( '+' | '-' ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1945);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

            	    }
            	    break;

            	default :
            	    break loop32;
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
            if ( state.backtracking>0 ) { memoize(input, 29, additiveExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // StateMachine.g:297:1: multiplicativeExpression returns [ASTExpression expr] : nUnrExpr= unaryExpression (operator= ( '*' | '/' | '%' ) m1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression expr = null;

        int multiplicativeExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nUnrExpr =null;

        ASTExpression m1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return expr; }

            // StateMachine.g:298:5: (nUnrExpr= unaryExpression (operator= ( '*' | '/' | '%' ) m1= unaryExpression )* )
            // StateMachine.g:299:9: nUnrExpr= unaryExpression (operator= ( '*' | '/' | '%' ) m1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2001);
            nUnrExpr=unaryExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nUnrExpr;}

            // StateMachine.g:300:9: (operator= ( '*' | '/' | '%' ) m1= unaryExpression )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==SLASH||LA33_0==STAR||LA33_0==70) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // StateMachine.g:301:13: operator= ( '*' | '/' | '%' ) m1= unaryExpression
            	    {
            	    operator=(Token)input.LT(1);

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==70 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return expr;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2068);
            	    m1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr, m1);}

            	    }
            	    break;

            	default :
            	    break loop33;
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
            if ( state.backtracking>0 ) { memoize(input, 30, multiplicativeExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // StateMachine.g:306:1: unaryExpression returns [ASTExpression expr] : ( '+' unrExpr= unaryExpression | '-' unrExpr= unaryExpression |nUnrExprOther= unaryExpressionNotPlusMinus );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression expr = null;

        int unaryExpression_StartIndex = input.index();

        ASTExpression unrExpr =null;

        ASTExpression nUnrExprOther =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return expr; }

            // StateMachine.g:307:5: ( '+' unrExpr= unaryExpression | '-' unrExpr= unaryExpression |nUnrExprOther= unaryExpressionNotPlusMinus )
            int alt34=3;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt34=1;
                }
                break;
            case MINUS:
                {
                alt34=2;
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
                alt34=3;
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
                    // StateMachine.g:307:9: '+' unrExpr= unaryExpression
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_unaryExpression2104); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2108);
                    unrExpr=unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =unrExpr;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:308:9: '-' unrExpr= unaryExpression
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_unaryExpression2120); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2124);
                    unrExpr=unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {   
                            if (unrExpr.isASTLitreal())
                                ((ASTLiteral)unrExpr).setMinus();

                            if (unrExpr.isASTIdentifier())
                                ((ASTIdentifier)unrExpr).setMinus();
                            
                            expr =unrExpr;
                        }

                    }
                    break;
                case 3 :
                    // StateMachine.g:320:9: nUnrExprOther= unaryExpressionNotPlusMinus
                    {
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2153);
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
            if ( state.backtracking>0 ) { memoize(input, 31, unaryExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "unaryExpression"



    // $ANTLR start "unaryExpressionNotPlusMinus"
    // StateMachine.g:323:1: unaryExpressionNotPlusMinus returns [ASTExpression expr] : (not= '!' UnrExpr= unaryExpression |nPriExpr= primary (postfix= ( '--' | '++' ) )? );
    public final ASTExpression unaryExpressionNotPlusMinus() throws RecognitionException {
        ASTExpression expr = null;

        int unaryExpressionNotPlusMinus_StartIndex = input.index();

        Token not=null;
        Token postfix=null;
        ASTExpression UnrExpr =null;

        ASTExpression nPriExpr =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return expr; }

            // StateMachine.g:327:5: (not= '!' UnrExpr= unaryExpression |nPriExpr= primary (postfix= ( '--' | '++' ) )? )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==NOT) ) {
                alt36=1;
            }
            else if ( (LA36_0==BOOLLITERAL||LA36_0==CHARLITERAL||LA36_0==IDENT||LA36_0==INTLITERAL||LA36_0==LPAREN||LA36_0==PREV||LA36_0==REALLITERAL||LA36_0==STRINGLITERAL) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // StateMachine.g:327:9: not= '!' UnrExpr= unaryExpression
                    {
                    not=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpressionNotPlusMinus2184); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2188);
                    UnrExpr=unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =new ASTUnaryExpression(not,UnrExpr);}

                    }
                    break;
                case 2 :
                    // StateMachine.g:328:9: nPriExpr= primary (postfix= ( '--' | '++' ) )?
                    {
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus2202);
                    nPriExpr=primary();

                    state._fsp--;
                    if (state.failed) return expr;

                    // StateMachine.g:328:33: (postfix= ( '--' | '++' ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==73||LA35_0==75) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // StateMachine.g:328:33: postfix= ( '--' | '++' )
                            {
                            postfix=(Token)input.LT(1);

                            if ( input.LA(1)==73||input.LA(1)==75 ) {
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
                                else{
                                    //System.out.println("non-unary expression");
                                    expr =nPriExpr;
                                }
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
            if ( state.backtracking>0 ) { memoize(input, 32, unaryExpressionNotPlusMinus_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"



    // $ANTLR start "primary"
    // StateMachine.g:339:1: primary returns [ASTExpression expr] : (pExpr= parExpression |id= identifier ( DOT member= identifier )? |nLiteralExpr= literal | PREV LPAREN pid= identifier RPAREN );
    public final ASTExpression primary() throws RecognitionException {
        ASTExpression expr = null;

        int primary_StartIndex = input.index();

        ASTExpression pExpr =null;

        ASTIdentifier id =null;

        ASTIdentifier member =null;

        ASTLiteral nLiteralExpr =null;

        ASTIdentifier pid =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return expr; }

            // StateMachine.g:340:5: (pExpr= parExpression |id= identifier ( DOT member= identifier )? |nLiteralExpr= literal | PREV LPAREN pid= identifier RPAREN )
            int alt38=4;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt38=1;
                }
                break;
            case IDENT:
                {
                alt38=2;
                }
                break;
            case BOOLLITERAL:
            case CHARLITERAL:
            case INTLITERAL:
            case REALLITERAL:
            case STRINGLITERAL:
                {
                alt38=3;
                }
                break;
            case PREV:
                {
                alt38=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // StateMachine.g:340:9: pExpr= parExpression
                    {
                    pushFollow(FOLLOW_parExpression_in_primary2248);
                    pExpr=parExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =pExpr;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:341:9: id= identifier ( DOT member= identifier )?
                    {
                    pushFollow(FOLLOW_identifier_in_primary2262);
                    id=identifier();

                    state._fsp--;
                    if (state.failed) return expr;

                    // StateMachine.g:342:9: ( DOT member= identifier )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==DOT) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // StateMachine.g:342:11: DOT member= identifier
                            {
                            match(input,DOT,FOLLOW_DOT_in_primary2274); if (state.failed) return expr;

                            pushFollow(FOLLOW_identifier_in_primary2278);
                            member=identifier();

                            state._fsp--;
                            if (state.failed) return expr;

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                                if (member==null){
                                    ((ASTIdentifier)id).setExpression();
                                    expr =id;
                                }
                                else{
                                    ASTMember m = new ASTMember(id.token(), id, member);
                                    expr = m;
                                }
                            }

                    }
                    break;
                case 3 :
                    // StateMachine.g:353:9: nLiteralExpr= literal
                    {
                    pushFollow(FOLLOW_literal_in_primary2303);
                    nLiteralExpr=literal();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =nLiteralExpr;}

                    }
                    break;
                case 4 :
                    // StateMachine.g:354:9: PREV LPAREN pid= identifier RPAREN
                    {
                    match(input,PREV,FOLLOW_PREV_in_primary2315); if (state.failed) return expr;

                    match(input,LPAREN,FOLLOW_LPAREN_in_primary2317); if (state.failed) return expr;

                    pushFollow(FOLLOW_identifier_in_primary2321);
                    pid=identifier();

                    state._fsp--;
                    if (state.failed) return expr;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primary2323); if (state.failed) return expr;

                    if ( state.backtracking==0 ) {
                                ((ASTIdentifier)pid).setExpression();
                                pid.setPrevious();
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
            if ( state.backtracking>0 ) { memoize(input, 33, primary_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "primary"



    // $ANTLR start "parExpression"
    // StateMachine.g:362:1: parExpression returns [ASTExpression expr] : '(' e= expression ')' ;
    public final ASTExpression parExpression() throws RecognitionException {
        ASTExpression expr = null;

        int parExpression_StartIndex = input.index();

        ASTExpression e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return expr; }

            // StateMachine.g:363:5: ( '(' e= expression ')' )
            // StateMachine.g:363:9: '(' e= expression ')'
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2349); if (state.failed) return expr;

            pushFollow(FOLLOW_expression_in_parExpression2353);
            e=expression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =e;}

            match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2357); if (state.failed) return expr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 34, parExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "parExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_MACHINE_in_machine76 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_machine80 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_machine84 = new BitSet(new long[]{0x6050400502880110L,0x0000000000000005L});
    public static final BitSet FOLLOW_globalVariableDecl_in_machine97 = new BitSet(new long[]{0x6050400502880110L,0x0000000000000005L});
    public static final BitSet FOLLOW_state_in_machine114 = new BitSet(new long[]{0x6010400402800010L,0x0000000000000004L});
    public static final BitSet FOLLOW_trans_in_machine133 = new BitSet(new long[]{0x0010000402000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_invariantExpression_in_machine150 = new BitSet(new long[]{0x0010000402000000L});
    public static final BitSet FOLLOW_goal_in_machine167 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_machine178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_machine180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stateModifier_in_state204 = new BitSet(new long[]{0x6000400000800010L});
    public static final BitSet FOLLOW_STATE_in_state234 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_state238 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_state242 = new BitSet(new long[]{0x00DC8A0340080B00L,0x0000000000000003L});
    public static final BitSet FOLLOW_localVariableDecl_in_state255 = new BitSet(new long[]{0x00DC8A0340080B00L,0x0000000000000003L});
    public static final BitSet FOLLOW_expression_in_state274 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SEMI_in_state276 = new BitSet(new long[]{0x009C8A0240000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_state287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANS_in_trans304 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_trans311 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_trans316 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_trans331 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ARROW_in_trans345 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_trans352 = new BitSet(new long[]{0x0012000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ON_in_trans366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_trans371 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_in_trans387 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_trans391 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SEMI_in_trans395 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_trans403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVARIANT_in_invariantExpression422 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_invariantExpression436 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_invariantExpression444 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_invariantExpression458 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SEMI_in_invariantExpression460 = new BitSet(new long[]{0x009C8A0240000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_invariantExpression471 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_FOR_in_invariantExpression483 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_invariantExpression485 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_invariantExpression489 = new BitSet(new long[]{0x0010000000010000L});
    public static final BitSet FOLLOW_COMMA_in_invariantExpression494 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_invariantExpression498 = new BitSet(new long[]{0x0010000000010000L});
    public static final BitSet FOLLOW_RBRACE_in_invariantExpression505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOAL_in_goal528 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_goal530 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CHECK_in_goal538 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_forExpr_in_goal542 = new BitSet(new long[]{0x8010000000000000L});
    public static final BitSet FOLLOW_stopExpr_in_goal554 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_goal581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forExpr599 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_forExpr603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOP_in_stopExpr626 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AT_in_stopExpr630 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LPAREN_in_stopExpr633 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_stopExpr648 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_COMMA_in_stopExpr661 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_stopExpr665 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_stopExpr685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_label705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identifier724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_stateModifier745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINAL_in_stateModifier755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_stateModifier765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORMAL_in_stateModifier775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_literal797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REALLITERAL_in_literal809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLLITERAL_in_literal821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literal833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literal845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_globalVariableDecl865 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_globalVariableDecl869 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SEMI_in_globalVariableDecl877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_localVariableDecl895 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDecl899 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SEMI_in_localVariableDecl907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumType_in_type971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primitiveType1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_primitiveType1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primitiveType1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumType1040 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enumType1044 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_enumType1048 = new BitSet(new long[]{0x0010000000010000L});
    public static final BitSet FOLLOW_COMMA_in_enumType1058 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_enumType1062 = new BitSet(new long[]{0x0010000000010000L});
    public static final BitSet FOLLOW_RBRACE_in_enumType1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclarator1092 = new BitSet(new long[]{0x0000000000200002L,0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_variableDeclarator1110 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator1114 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_in_variableDeclarator1126 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableDeclarator1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression1188 = new BitSet(new long[]{0x0000000000200002L,0x0000000000003500L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression1217 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_assignmentOperator1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_assignmentOperator1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_assignmentOperator1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_assignmentOperator1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_assignmentOperator1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1357 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_IMPLIES_in_conditionalImpliesExpression1385 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1389 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression1436 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_conditionalOrExpression1464 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression1468 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_conditionalXorExpression_in_conditionalAndExpression1518 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_conditionalAndExpression1548 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalXorExpression_in_conditionalAndExpression1552 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalXorExpression1603 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_conditionalXorExpression1631 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalXorExpression1635 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1683 = new BitSet(new long[]{0x0001000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_set_in_equalityExpression1703 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1714 = new BitSet(new long[]{0x0001000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1751 = new BitSet(new long[]{0x000001800C000002L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression1779 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1783 = new BitSet(new long[]{0x000001800C000002L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_relationalOp1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_EQUAL_in_relationalOp1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_relationalOp1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_relationalOp1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1904 = new BitSet(new long[]{0x0004080000000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1935 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1945 = new BitSet(new long[]{0x0004080000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2001 = new BitSet(new long[]{0x1400000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression2034 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2068 = new BitSet(new long[]{0x1400000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression2104 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression2120 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryExpressionNotPlusMinus2184 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus2202 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000A00L});
    public static final BitSet FOLLOW_set_in_unaryExpressionNotPlusMinus2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_primary2262 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_DOT_in_primary2274 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_primary2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREV_in_primary2315 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LPAREN_in_primary2317 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_primary2321 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primary2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2349 = new BitSet(new long[]{0x008C8A0240000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_parExpression2353 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2357 = new BitSet(new long[]{0x0000000000000002L});

}