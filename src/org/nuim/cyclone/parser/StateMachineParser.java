// $ANTLR 3.4 StateMachine.g 2020-12-17 11:31:39

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ARROW", "AT", "BAR", "BOOL", "BOOLLITERAL", "CHAR", "CHARLITERAL", "CHECK", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "ENUM", "ENUMERATE", "ENUMLITERAL", "EQUAL", "EscapeSequence", "FINAL", "FOR", "GOAL", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "IMPLIES", "INT", "INTLITERAL", "INVARIANT", "IdentifierPart", "IdentifierStart", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MACHINE", "MINUS", "ML_COMMENT", "NEWLINE", "NORMAL", "NOT", "NOT_EQUAL", "ON", "PLUS", "PREV", "P_OP_ONE", "RBRACE", "RBRACK", "REACH", "REAL", "REALLITERAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "START", "STATE", "STOP", "STRING", "STRINGLITERAL", "TRANS", "VIA", "WHERE", "WS", "XOR", "'%'", "'&&'", "'*='", "'++'", "'+='", "'--'", "'-='", "'/='", "'=='", "'global'", "'native'", "'||'"
    };

    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
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
    public static final int ENUMERATE=20;
    public static final int ENUMLITERAL=21;
    public static final int EQUAL=22;
    public static final int EscapeSequence=23;
    public static final int FINAL=24;
    public static final int FOR=25;
    public static final int GOAL=26;
    public static final int GREATER=27;
    public static final int GREATER_EQUAL=28;
    public static final int HASH=29;
    public static final int HEX_DIGIT=30;
    public static final int IDENT=31;
    public static final int IMPLIES=32;
    public static final int INT=33;
    public static final int INTLITERAL=34;
    public static final int INVARIANT=35;
    public static final int IdentifierPart=36;
    public static final int IdentifierStart=37;
    public static final int LBRACE=38;
    public static final int LBRACK=39;
    public static final int LESS=40;
    public static final int LESS_EQUAL=41;
    public static final int LPAREN=42;
    public static final int MACHINE=43;
    public static final int MINUS=44;
    public static final int ML_COMMENT=45;
    public static final int NEWLINE=46;
    public static final int NORMAL=47;
    public static final int NOT=48;
    public static final int NOT_EQUAL=49;
    public static final int ON=50;
    public static final int PLUS=51;
    public static final int PREV=52;
    public static final int P_OP_ONE=53;
    public static final int RBRACE=54;
    public static final int RBRACK=55;
    public static final int REACH=56;
    public static final int REAL=57;
    public static final int REALLITERAL=58;
    public static final int RPAREN=59;
    public static final int SEMI=60;
    public static final int SLASH=61;
    public static final int SL_COMMENT=62;
    public static final int STAR=63;
    public static final int START=64;
    public static final int STATE=65;
    public static final int STOP=66;
    public static final int STRING=67;
    public static final int STRINGLITERAL=68;
    public static final int TRANS=69;
    public static final int VIA=70;
    public static final int WHERE=71;
    public static final int WS=72;
    public static final int XOR=73;

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
        this.state.ruleMemo = new HashMap[106+1];
         

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
    // StateMachine.g:110:1: goal returns [ASTGoal astgoal] : g= GOAL LBRACE t= ( CHECK | ENUMERATE ) f= forExpr (v= viaExpr )? (s= stopExpr )? RBRACE ;
    public final ASTGoal goal() throws RecognitionException {
        ASTGoal astgoal = null;

        int goal_StartIndex = input.index();

        Token g=null;
        Token t=null;
        ASTForExpression f =null;

        ASTViaExpression v =null;

        ASTStopExpression s =null;



            astgoal = new ASTGoal();
         
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return astgoal; }

            // StateMachine.g:112:3: (g= GOAL LBRACE t= ( CHECK | ENUMERATE ) f= forExpr (v= viaExpr )? (s= stopExpr )? RBRACE )
            // StateMachine.g:113:5: g= GOAL LBRACE t= ( CHECK | ENUMERATE ) f= forExpr (v= viaExpr )? (s= stopExpr )? RBRACE
            {
            g=(Token)match(input,GOAL,FOLLOW_GOAL_in_goal528); if (state.failed) return astgoal;

            if ( state.backtracking==0 ) {astgoal.setToken(g);}

            match(input,LBRACE,FOLLOW_LBRACE_in_goal532); if (state.failed) return astgoal;

            t=(Token)input.LT(1);

            if ( input.LA(1)==CHECK||input.LA(1)==ENUMERATE ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return astgoal;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) {
                    if (t.getText().equals("enumerate")) astgoal.setEnumerate(true);
                }

            pushFollow(FOLLOW_forExpr_in_goal560);
            f=forExpr();

            state._fsp--;
            if (state.failed) return astgoal;

            if ( state.backtracking==0 ) {
                    astgoal.setFor(f);
                }

            // StateMachine.g:122:5: (v= viaExpr )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==VIA) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // StateMachine.g:122:6: v= viaExpr
                    {
                    pushFollow(FOLLOW_viaExpr_in_goal572);
                    v=viaExpr();

                    state._fsp--;
                    if (state.failed) return astgoal;

                    if ( state.backtracking==0 ) {astgoal.setVia(v);}

                    }
                    break;

            }


            // StateMachine.g:124:5: (s= stopExpr )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==REACH) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // StateMachine.g:124:6: s= stopExpr
                    {
                    pushFollow(FOLLOW_stopExpr_in_goal589);
                    s=stopExpr();

                    state._fsp--;
                    if (state.failed) return astgoal;

                    if ( state.backtracking==0 ) {
                                //astgoal.setToken(g);
                                astgoal.setStop(s);
                            }

                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_goal616); if (state.failed) return astgoal;

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
    // StateMachine.g:133:1: forExpr returns [ASTForExpression forexpr] : t= FOR l= INTLITERAL ;
    public final ASTForExpression forExpr() throws RecognitionException {
        ASTForExpression forexpr = null;

        int forExpr_StartIndex = input.index();

        Token t=null;
        Token l=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return forexpr; }

            // StateMachine.g:133:43: (t= FOR l= INTLITERAL )
            // StateMachine.g:134:5: t= FOR l= INTLITERAL
            {
            t=(Token)match(input,FOR,FOLLOW_FOR_in_forExpr634); if (state.failed) return forexpr;

            l=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_forExpr638); if (state.failed) return forexpr;

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
    // StateMachine.g:140:1: stopExpr returns [ASTStopExpression aststop] : (t= REACH LPAREN s1= identifier ( COMMA s2= identifier )* RPAREN ) ;
    public final ASTStopExpression stopExpr() throws RecognitionException {
        ASTStopExpression aststop = null;

        int stopExpr_StartIndex = input.index();

        Token t=null;
        ASTIdentifier s1 =null;

        ASTIdentifier s2 =null;



            aststop = new ASTStopExpression();
         
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return aststop; }

            // StateMachine.g:142:3: ( (t= REACH LPAREN s1= identifier ( COMMA s2= identifier )* RPAREN ) )
            // StateMachine.g:143:5: (t= REACH LPAREN s1= identifier ( COMMA s2= identifier )* RPAREN )
            {
            // StateMachine.g:143:5: (t= REACH LPAREN s1= identifier ( COMMA s2= identifier )* RPAREN )
            // StateMachine.g:143:6: t= REACH LPAREN s1= identifier ( COMMA s2= identifier )* RPAREN
            {
            t=(Token)match(input,REACH,FOLLOW_REACH_in_stopExpr661); if (state.failed) return aststop;

            match(input,LPAREN,FOLLOW_LPAREN_in_stopExpr663); if (state.failed) return aststop;

            pushFollow(FOLLOW_identifier_in_stopExpr678);
            s1=identifier();

            state._fsp--;
            if (state.failed) return aststop;

            if ( state.backtracking==0 ) {
                        aststop.setToken(s1.token());
                        aststop.addState(s1.identifier());
                    }

            // StateMachine.g:148:9: ( COMMA s2= identifier )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // StateMachine.g:148:10: COMMA s2= identifier
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_stopExpr691); if (state.failed) return aststop;

            	    pushFollow(FOLLOW_identifier_in_stopExpr695);
            	    s2=identifier();

            	    state._fsp--;
            	    if (state.failed) return aststop;

            	    if ( state.backtracking==0 ) {
            	                aststop.addState(s2.identifier());}

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_stopExpr715); if (state.failed) return aststop;

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



    // $ANTLR start "viaExpr"
    // StateMachine.g:154:1: viaExpr returns [ASTViaExpression astvia] : t= VIA LPAREN (p1= pathExpr ( COMMA p2= pathExpr )* ) RPAREN ;
    public final ASTViaExpression viaExpr() throws RecognitionException {
        ASTViaExpression astvia = null;

        int viaExpr_StartIndex = input.index();

        Token t=null;
        ASTPathExpression p1 =null;

        ASTPathExpression p2 =null;



            astvia = new ASTViaExpression();   

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return astvia; }

            // StateMachine.g:156:2: (t= VIA LPAREN (p1= pathExpr ( COMMA p2= pathExpr )* ) RPAREN )
            // StateMachine.g:157:5: t= VIA LPAREN (p1= pathExpr ( COMMA p2= pathExpr )* ) RPAREN
            {
            t=(Token)match(input,VIA,FOLLOW_VIA_in_viaExpr738); if (state.failed) return astvia;

            if ( state.backtracking==0 ) {astvia.setToken(t);}

            match(input,LPAREN,FOLLOW_LPAREN_in_viaExpr742); if (state.failed) return astvia;

            // StateMachine.g:157:41: (p1= pathExpr ( COMMA p2= pathExpr )* )
            // StateMachine.g:157:42: p1= pathExpr ( COMMA p2= pathExpr )*
            {
            pushFollow(FOLLOW_pathExpr_in_viaExpr747);
            p1=pathExpr();

            state._fsp--;
            if (state.failed) return astvia;

            if ( state.backtracking==0 ) {astvia.addPathExpr(p1);}

            // StateMachine.g:157:82: ( COMMA p2= pathExpr )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // StateMachine.g:157:83: COMMA p2= pathExpr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_viaExpr753); if (state.failed) return astvia;

            	    pushFollow(FOLLOW_pathExpr_in_viaExpr757);
            	    p2=pathExpr();

            	    state._fsp--;
            	    if (state.failed) return astvia;

            	    if ( state.backtracking==0 ) {astvia.addPathExpr(p2);}

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            match(input,RPAREN,FOLLOW_RPAREN_in_viaExpr766); if (state.failed) return astvia;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, viaExpr_StartIndex); }

        }
        return astvia;
    }
    // $ANTLR end "viaExpr"



    // $ANTLR start "pathExpr"
    // StateMachine.g:160:1: pathExpr returns [ASTPathExpression astpexpr] : (si= stateIncExpr |ti= transIncExpr );
    public final ASTPathExpression pathExpr() throws RecognitionException {
        ASTPathExpression astpexpr = null;

        int pathExpr_StartIndex = input.index();

        ASTStateInclusion si =null;

        ASTTransInclusion ti =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return astpexpr; }

            // StateMachine.g:160:46: (si= stateIncExpr |ti= transIncExpr )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENT) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==EOF||LA18_1==COMMA||LA18_1==RPAREN) ) {
                    alt18=1;
                }
                else if ( (LA18_1==ARROW) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return astpexpr;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA18_0==P_OP_ONE) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return astpexpr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // StateMachine.g:161:5: si= stateIncExpr
                    {
                    pushFollow(FOLLOW_stateIncExpr_in_pathExpr784);
                    si=stateIncExpr();

                    state._fsp--;
                    if (state.failed) return astpexpr;

                    if ( state.backtracking==0 ) {astpexpr =si;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:162:7: ti= transIncExpr
                    {
                    pushFollow(FOLLOW_transIncExpr_in_pathExpr796);
                    ti=transIncExpr();

                    state._fsp--;
                    if (state.failed) return astpexpr;

                    if ( state.backtracking==0 ) {astpexpr =ti;}

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
            if ( state.backtracking>0 ) { memoize(input, 9, pathExpr_StartIndex); }

        }
        return astpexpr;
    }
    // $ANTLR end "pathExpr"



    // $ANTLR start "stateIncExpr"
    // StateMachine.g:165:1: stateIncExpr returns [ASTStateInclusion astsi] : s1= identifier ;
    public final ASTStateInclusion stateIncExpr() throws RecognitionException {
        ASTStateInclusion astsi = null;

        int stateIncExpr_StartIndex = input.index();

        ASTIdentifier s1 =null;



            astsi = new ASTStateInclusion();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return astsi; }

            // StateMachine.g:167:2: (s1= identifier )
            // StateMachine.g:168:5: s1= identifier
            {
            pushFollow(FOLLOW_identifier_in_stateIncExpr821);
            s1=identifier();

            state._fsp--;
            if (state.failed) return astsi;

            if ( state.backtracking==0 ) {
                    astsi.setState(s1.identifier());
                    astsi.setToken(s1.token());
                }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, stateIncExpr_StartIndex); }

        }
        return astsi;
    }
    // $ANTLR end "stateIncExpr"



    // $ANTLR start "transIncExpr"
    // StateMachine.g:177:1: transIncExpr returns [ASTTransInclusion astti] : ( (src= identifier |op= pathOP ) ( ARROW (tar= identifier |op= pathOP ) )+ ) ;
    public final ASTTransInclusion transIncExpr() throws RecognitionException {
        ASTTransInclusion astti = null;

        int transIncExpr_StartIndex = input.index();

        ASTIdentifier src =null;

        ASTPathOperator op =null;

        ASTIdentifier tar =null;



            astti = new ASTTransInclusion();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return astti; }

            // StateMachine.g:180:5: ( ( (src= identifier |op= pathOP ) ( ARROW (tar= identifier |op= pathOP ) )+ ) )
            // StateMachine.g:181:5: ( (src= identifier |op= pathOP ) ( ARROW (tar= identifier |op= pathOP ) )+ )
            {
            // StateMachine.g:181:5: ( (src= identifier |op= pathOP ) ( ARROW (tar= identifier |op= pathOP ) )+ )
            // StateMachine.g:182:9: (src= identifier |op= pathOP ) ( ARROW (tar= identifier |op= pathOP ) )+
            {
            // StateMachine.g:182:9: (src= identifier |op= pathOP )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENT) ) {
                alt19=1;
            }
            else if ( (LA19_0==P_OP_ONE) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return astti;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // StateMachine.g:182:10: src= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_transIncExpr872);
                    src=identifier();

                    state._fsp--;
                    if (state.failed) return astti;

                    if ( state.backtracking==0 ) {
                                astti.setToken(src.token());
                                astti.addState(src.identifier());
                            }

                    }
                    break;
                case 2 :
                    // StateMachine.g:186:9: op= pathOP
                    {
                    pushFollow(FOLLOW_pathOP_in_transIncExpr889);
                    op=pathOP();

                    state._fsp--;
                    if (state.failed) return astti;

                    if ( state.backtracking==0 ) {
                                astti.setToken(op.token());
                                astti.addState(op.operator());
                                astti.addPathOperator(op);
                            }

                    }
                    break;

            }


            // StateMachine.g:192:9: ( ARROW (tar= identifier |op= pathOP ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==ARROW) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // StateMachine.g:193:13: ARROW (tar= identifier |op= pathOP )
            	    {
            	    match(input,ARROW,FOLLOW_ARROW_in_transIncExpr921); if (state.failed) return astti;

            	    // StateMachine.g:194:13: (tar= identifier |op= pathOP )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==IDENT) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==P_OP_ONE) ) {
            	        alt20=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return astti;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // StateMachine.g:194:14: tar= identifier
            	            {
            	            pushFollow(FOLLOW_identifier_in_transIncExpr947);
            	            tar=identifier();

            	            state._fsp--;
            	            if (state.failed) return astti;

            	            if ( state.backtracking==0 ) {    
            	                            astti.addState(tar.identifier());
            	                        }

            	            }
            	            break;
            	        case 2 :
            	            // StateMachine.g:197:13: op= pathOP
            	            {
            	            pushFollow(FOLLOW_pathOP_in_transIncExpr968);
            	            op=pathOP();

            	            state._fsp--;
            	            if (state.failed) return astti;

            	            if ( state.backtracking==0 ) {
            	                            astti.addState(op.operator());
            	                            astti.addPathOperator(op);
            	                        }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return astti;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, transIncExpr_StartIndex); }

        }
        return astti;
    }
    // $ANTLR end "transIncExpr"



    // $ANTLR start "pathOP"
    // StateMachine.g:205:1: pathOP returns [ASTPathOperator operator] : t= P_OP_ONE ;
    public final ASTPathOperator pathOP() throws RecognitionException {
        ASTPathOperator operator = null;

        int pathOP_StartIndex = input.index();

        Token t=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return operator; }

            // StateMachine.g:205:43: (t= P_OP_ONE )
            // StateMachine.g:206:5: t= P_OP_ONE
            {
            t=(Token)match(input,P_OP_ONE,FOLLOW_P_OP_ONE_in_pathOP1009); if (state.failed) return operator;

            if ( state.backtracking==0 ) {operator = new ASTPathOpOne(t);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, pathOP_StartIndex); }

        }
        return operator;
    }
    // $ANTLR end "pathOP"



    // $ANTLR start "label"
    // StateMachine.g:209:1: label returns [ASTLiteral literal_node] : s= STRINGLITERAL ;
    public final ASTLiteral label() throws RecognitionException {
        ASTLiteral literal_node = null;

        int label_StartIndex = input.index();

        Token s=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return literal_node; }

            // StateMachine.g:209:40: (s= STRINGLITERAL )
            // StateMachine.g:210:5: s= STRINGLITERAL
            {
            s=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_label1029); if (state.failed) return literal_node;

            if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.STRING,s);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, label_StartIndex); }

        }
        return literal_node;
    }
    // $ANTLR end "label"



    // $ANTLR start "identifier"
    // StateMachine.g:213:1: identifier returns [ASTIdentifier expr] : str= IDENT ;
    public final ASTIdentifier identifier() throws RecognitionException {
        ASTIdentifier expr = null;

        int identifier_StartIndex = input.index();

        Token str=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return expr; }

            // StateMachine.g:213:40: (str= IDENT )
            // StateMachine.g:214:5: str= IDENT
            {
            str=(Token)match(input,IDENT,FOLLOW_IDENT_in_identifier1048); if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr = new ASTIdentifier(str);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, identifier_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "identifier"



    // $ANTLR start "stateModifier"
    // StateMachine.g:217:1: stateModifier returns [ASTStateModifier modifier] : ( START | FINAL | ABSTRACT | NORMAL );
    public final ASTStateModifier stateModifier() throws RecognitionException {
        ASTStateModifier modifier = null;

        int stateModifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return modifier; }

            // StateMachine.g:217:50: ( START | FINAL | ABSTRACT | NORMAL )
            int alt22=4;
            switch ( input.LA(1) ) {
            case START:
                {
                alt22=1;
                }
                break;
            case FINAL:
                {
                alt22=2;
                }
                break;
            case ABSTRACT:
                {
                alt22=3;
                }
                break;
            case NORMAL:
                {
                alt22=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return modifier;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // StateMachine.g:218:7: START
                    {
                    match(input,START,FOLLOW_START_in_stateModifier1069); if (state.failed) return modifier;

                    if ( state.backtracking==0 ) {modifier =ASTStateModifier.START;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:219:7: FINAL
                    {
                    match(input,FINAL,FOLLOW_FINAL_in_stateModifier1079); if (state.failed) return modifier;

                    if ( state.backtracking==0 ) {modifier =ASTStateModifier.FINAL;}

                    }
                    break;
                case 3 :
                    // StateMachine.g:220:7: ABSTRACT
                    {
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_stateModifier1089); if (state.failed) return modifier;

                    if ( state.backtracking==0 ) {modifier =ASTStateModifier.ABSTRACT;}

                    }
                    break;
                case 4 :
                    // StateMachine.g:221:7: NORMAL
                    {
                    match(input,NORMAL,FOLLOW_NORMAL_in_stateModifier1099); if (state.failed) return modifier;

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
            if ( state.backtracking>0 ) { memoize(input, 15, stateModifier_StartIndex); }

        }
        return modifier;
    }
    // $ANTLR end "stateModifier"



    // $ANTLR start "literal"
    // StateMachine.g:224:1: literal returns [ASTLiteral literal_node] : (l= INTLITERAL |r= REALLITERAL |b= BOOLLITERAL |s= STRINGLITERAL |c= CHARLITERAL );
    public final ASTLiteral literal() throws RecognitionException {
        ASTLiteral literal_node = null;

        int literal_StartIndex = input.index();

        Token l=null;
        Token r=null;
        Token b=null;
        Token s=null;
        Token c=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return literal_node; }

            // StateMachine.g:224:42: (l= INTLITERAL |r= REALLITERAL |b= BOOLLITERAL |s= STRINGLITERAL |c= CHARLITERAL )
            int alt23=5;
            switch ( input.LA(1) ) {
            case INTLITERAL:
                {
                alt23=1;
                }
                break;
            case REALLITERAL:
                {
                alt23=2;
                }
                break;
            case BOOLLITERAL:
                {
                alt23=3;
                }
                break;
            case STRINGLITERAL:
                {
                alt23=4;
                }
                break;
            case CHARLITERAL:
                {
                alt23=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return literal_node;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // StateMachine.g:225:7: l= INTLITERAL
                    {
                    l=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literal1121); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.INT,l);}

                    }
                    break;
                case 2 :
                    // StateMachine.g:226:7: r= REALLITERAL
                    {
                    r=(Token)match(input,REALLITERAL,FOLLOW_REALLITERAL_in_literal1133); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.REAL,r);}

                    }
                    break;
                case 3 :
                    // StateMachine.g:227:7: b= BOOLLITERAL
                    {
                    b=(Token)match(input,BOOLLITERAL,FOLLOW_BOOLLITERAL_in_literal1145); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.BOOL,b);}

                    }
                    break;
                case 4 :
                    // StateMachine.g:228:7: s= STRINGLITERAL
                    {
                    s=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literal1157); if (state.failed) return literal_node;

                    if ( state.backtracking==0 ) {literal_node =new ASTLiteral(ASTLiteral.LiteralType.STRING,s);}

                    }
                    break;
                case 5 :
                    // StateMachine.g:229:7: c= CHARLITERAL
                    {
                    c=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literal1169); if (state.failed) return literal_node;

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
            if ( state.backtracking>0 ) { memoize(input, 16, literal_StartIndex); }

        }
        return literal_node;
    }
    // $ANTLR end "literal"



    // $ANTLR start "globalVariableDecl"
    // StateMachine.g:232:1: globalVariableDecl returns [ASTVariable v] : t= type n= variableDeclarator SEMI ;
    public final ASTVariable globalVariableDecl() throws RecognitionException {
        ASTVariable v = null;

        int globalVariableDecl_StartIndex = input.index();

        Type t =null;

        ASTVariable n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return v; }

            // StateMachine.g:232:43: (t= type n= variableDeclarator SEMI )
            // StateMachine.g:233:5: t= type n= variableDeclarator SEMI
            {
            pushFollow(FOLLOW_type_in_globalVariableDecl1189);
            t=type();

            state._fsp--;
            if (state.failed) return v;

            pushFollow(FOLLOW_variableDeclarator_in_globalVariableDecl1193);
            n=variableDeclarator();

            state._fsp--;
            if (state.failed) return v;

            if ( state.backtracking==0 ) {n.type=t;n.createVariable();v =n;}

            match(input,SEMI,FOLLOW_SEMI_in_globalVariableDecl1201); if (state.failed) return v;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, globalVariableDecl_StartIndex); }

        }
        return v;
    }
    // $ANTLR end "globalVariableDecl"



    // $ANTLR start "localVariableDecl"
    // StateMachine.g:237:1: localVariableDecl returns [ASTVariable v] : t= type n= variableDeclarator SEMI ;
    public final ASTVariable localVariableDecl() throws RecognitionException {
        ASTVariable v = null;

        int localVariableDecl_StartIndex = input.index();

        Type t =null;

        ASTVariable n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return v; }

            // StateMachine.g:237:42: (t= type n= variableDeclarator SEMI )
            // StateMachine.g:238:5: t= type n= variableDeclarator SEMI
            {
            pushFollow(FOLLOW_type_in_localVariableDecl1219);
            t=type();

            state._fsp--;
            if (state.failed) return v;

            pushFollow(FOLLOW_variableDeclarator_in_localVariableDecl1223);
            n=variableDeclarator();

            state._fsp--;
            if (state.failed) return v;

            if ( state.backtracking==0 ) {n.type=t;n.createVariable();v =n;}

            match(input,SEMI,FOLLOW_SEMI_in_localVariableDecl1231); if (state.failed) return v;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, localVariableDecl_StartIndex); }

        }
        return v;
    }
    // $ANTLR end "localVariableDecl"



    // $ANTLR start "modifier"
    // StateMachine.g:242:1: modifier : ( 'global' | 'native' );
    public final void modifier() throws RecognitionException {
        int modifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }

            // StateMachine.g:242:10: ( 'global' | 'native' )
            // StateMachine.g:
            {
            if ( (input.LA(1) >= 83 && input.LA(1) <= 84) ) {
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
            if ( state.backtracking>0 ) { memoize(input, 19, modifier_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "modifier"



    // $ANTLR start "type"
    // StateMachine.g:247:1: type returns [Type t] : (p= primitiveType |e= enumType );
    public final Type type() throws RecognitionException {
        Type t = null;

        int type_StartIndex = input.index();

        Type p =null;

        EnumType e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return t; }

            // StateMachine.g:247:23: (p= primitiveType |e= enumType )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==BOOL||LA24_0==INT||LA24_0==REAL||LA24_0==STRING) ) {
                alt24=1;
            }
            else if ( (LA24_0==ENUM) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // StateMachine.g:248:9: p= primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type1281);
                    p=primitiveType();

                    state._fsp--;
                    if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =p;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:249:9: e= enumType
                    {
                    pushFollow(FOLLOW_enumType_in_type1295);
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
            if ( state.backtracking>0 ) { memoize(input, 20, type_StartIndex); }

        }
        return t;
    }
    // $ANTLR end "type"



    // $ANTLR start "primitiveType"
    // StateMachine.g:252:1: primitiveType returns [Type t] : ( INT | BOOL | REAL | STRING );
    public final Type primitiveType() throws RecognitionException {
        Type t = null;

        int primitiveType_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return t; }

            // StateMachine.g:252:31: ( INT | BOOL | REAL | STRING )
            int alt25=4;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt25=1;
                }
                break;
            case BOOL:
                {
                alt25=2;
                }
                break;
            case REAL:
                {
                alt25=3;
                }
                break;
            case STRING:
                {
                alt25=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // StateMachine.g:253:7: INT
                    {
                    match(input,INT,FOLLOW_INT_in_primitiveType1314); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t = new IntType();}

                    }
                    break;
                case 2 :
                    // StateMachine.g:254:7: BOOL
                    {
                    match(input,BOOL,FOLLOW_BOOL_in_primitiveType1324); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =new BoolType();}

                    }
                    break;
                case 3 :
                    // StateMachine.g:255:7: REAL
                    {
                    match(input,REAL,FOLLOW_REAL_in_primitiveType1334); if (state.failed) return t;

                    if ( state.backtracking==0 ) {t =new RealType();}

                    }
                    break;
                case 4 :
                    // StateMachine.g:256:7: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_primitiveType1345); if (state.failed) return t;

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
            if ( state.backtracking>0 ) { memoize(input, 21, primitiveType_StartIndex); }

        }
        return t;
    }
    // $ANTLR end "primitiveType"



    // $ANTLR start "enumType"
    // StateMachine.g:259:1: enumType returns [EnumType t] : ENUM LBRACE name= identifier ( COMMA l= identifier )* RBRACE ;
    public final EnumType enumType() throws RecognitionException {
        EnumType t = null;

        int enumType_StartIndex = input.index();

        ASTIdentifier name =null;

        ASTIdentifier l =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return t; }

            // StateMachine.g:259:31: ( ENUM LBRACE name= identifier ( COMMA l= identifier )* RBRACE )
            // StateMachine.g:260:5: ENUM LBRACE name= identifier ( COMMA l= identifier )* RBRACE
            {
            match(input,ENUM,FOLLOW_ENUM_in_enumType1364); if (state.failed) return t;

            if ( state.backtracking==0 ) {t =new EnumType();}

            match(input,LBRACE,FOLLOW_LBRACE_in_enumType1368); if (state.failed) return t;

            pushFollow(FOLLOW_identifier_in_enumType1372);
            name=identifier();

            state._fsp--;
            if (state.failed) return t;

            if ( state.backtracking==0 ) {t.add(name.toString());}

            // StateMachine.g:261:5: ( COMMA l= identifier )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==COMMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // StateMachine.g:261:6: COMMA l= identifier
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_enumType1382); if (state.failed) return t;

            	    pushFollow(FOLLOW_identifier_in_enumType1386);
            	    l=identifier();

            	    state._fsp--;
            	    if (state.failed) return t;

            	    if ( state.backtracking==0 ) {t.add(l.toString());}

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_enumType1392); if (state.failed) return t;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, enumType_StartIndex); }

        }
        return t;
    }
    // $ANTLR end "enumType"



    // $ANTLR start "variableDeclarator"
    // StateMachine.g:264:1: variableDeclarator returns [ASTVariable var] :n= identifier ( '=' n= variableInitializer )? ( WHERE e= expression )? ;
    public final ASTVariable variableDeclarator() throws RecognitionException {
        ASTVariable var = null;

        int variableDeclarator_StartIndex = input.index();

        ASTExpression n =null;

        ASTExpression e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return var; }

            // StateMachine.g:264:45: (n= identifier ( '=' n= variableInitializer )? ( WHERE e= expression )? )
            // StateMachine.g:265:5: n= identifier ( '=' n= variableInitializer )? ( WHERE e= expression )?
            {
            if ( state.backtracking==0 ) {var =new ASTVariable();}

            pushFollow(FOLLOW_identifier_in_variableDeclarator1416);
            n=identifier();

            state._fsp--;
            if (state.failed) return var;

            if ( state.backtracking==0 ) {
                        var.name=n.toString();
                        var.setToken( ((ASTIdentifier)n).token());
                    }

            // StateMachine.g:271:5: ( '=' n= variableInitializer )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==EQUAL) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // StateMachine.g:271:6: '=' n= variableInitializer
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_variableDeclarator1434); if (state.failed) return var;

                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator1438);
                    n=variableInitializer();

                    state._fsp--;
                    if (state.failed) return var;

                    if ( state.backtracking==0 ) {var.initializer=n;}

                    }
                    break;

            }


            // StateMachine.g:272:5: ( WHERE e= expression )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==WHERE) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // StateMachine.g:272:6: WHERE e= expression
                    {
                    match(input,WHERE,FOLLOW_WHERE_in_variableDeclarator1450); if (state.failed) return var;

                    pushFollow(FOLLOW_expression_in_variableDeclarator1454);
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
            if ( state.backtracking>0 ) { memoize(input, 23, variableDeclarator_StartIndex); }

        }
        return var;
    }
    // $ANTLR end "variableDeclarator"



    // $ANTLR start "variableInitializer"
    // StateMachine.g:275:1: variableInitializer returns [ASTExpression expr] : n= expression ;
    public final ASTExpression variableInitializer() throws RecognitionException {
        ASTExpression expr = null;

        int variableInitializer_StartIndex = input.index();

        ASTExpression n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return expr; }

            // StateMachine.g:275:49: (n= expression )
            // StateMachine.g:276:9: n= expression
            {
            pushFollow(FOLLOW_expression_in_variableInitializer1482);
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
            if ( state.backtracking>0 ) { memoize(input, 24, variableInitializer_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "variableInitializer"



    // $ANTLR start "expression"
    // StateMachine.g:279:1: expression returns [ASTExpression expr] : nImpliesExpr= conditionalImpliesExpression (operator= assignmentOperator nExpr= expression )? ;
    public final ASTExpression expression() throws RecognitionException {
        ASTExpression expr = null;

        int expression_StartIndex = input.index();

        ASTExpression nImpliesExpr =null;

        Token operator =null;

        ASTExpression nExpr =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return expr; }

            // StateMachine.g:279:40: (nImpliesExpr= conditionalImpliesExpression (operator= assignmentOperator nExpr= expression )? )
            // StateMachine.g:280:9: nImpliesExpr= conditionalImpliesExpression (operator= assignmentOperator nExpr= expression )?
            {
            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression1512);
            nImpliesExpr=conditionalImpliesExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nImpliesExpr;}

            // StateMachine.g:281:9: (operator= assignmentOperator nExpr= expression )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==EQUAL||LA29_0==76||LA29_0==78||(LA29_0 >= 80 && LA29_0 <= 81)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // StateMachine.g:282:13: operator= assignmentOperator nExpr= expression
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_expression1541);
                    operator=assignmentOperator();

                    state._fsp--;
                    if (state.failed) return expr;

                    pushFollow(FOLLOW_expression_in_expression1545);
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
            if ( state.backtracking>0 ) { memoize(input, 25, expression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "expression"



    // $ANTLR start "assignmentOperator"
    // StateMachine.g:289:1: assignmentOperator returns [Token token] : (t= '=' |t= '+=' |t= '-=' |t= '*=' |t= '/=' );
    public final Token assignmentOperator() throws RecognitionException {
        Token token = null;

        int assignmentOperator_StartIndex = input.index();

        Token t=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return token; }

            // StateMachine.g:290:5: (t= '=' |t= '+=' |t= '-=' |t= '*=' |t= '/=' )
            int alt30=5;
            switch ( input.LA(1) ) {
            case EQUAL:
                {
                alt30=1;
                }
                break;
            case 78:
                {
                alt30=2;
                }
                break;
            case 80:
                {
                alt30=3;
                }
                break;
            case 76:
                {
                alt30=4;
                }
                break;
            case 81:
                {
                alt30=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return token;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // StateMachine.g:290:9: t= '='
                    {
                    t=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assignmentOperator1597); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:291:9: t= '+='
                    {
                    t=(Token)match(input,78,FOLLOW_78_in_assignmentOperator1613); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 3 :
                    // StateMachine.g:292:9: t= '-='
                    {
                    t=(Token)match(input,80,FOLLOW_80_in_assignmentOperator1628); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 4 :
                    // StateMachine.g:293:9: t= '*='
                    {
                    t=(Token)match(input,76,FOLLOW_76_in_assignmentOperator1643); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 5 :
                    // StateMachine.g:294:9: t= '/='
                    {
                    t=(Token)match(input,81,FOLLOW_81_in_assignmentOperator1658); if (state.failed) return token;

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
            if ( state.backtracking>0 ) { memoize(input, 26, assignmentOperator_StartIndex); }

        }
        return token;
    }
    // $ANTLR end "assignmentOperator"



    // $ANTLR start "conditionalImpliesExpression"
    // StateMachine.g:297:1: conditionalImpliesExpression returns [ASTExpression expr] : nOrExpr= conditionalOrExpression (operator= IMPLIES n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalImpliesExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nOrExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return expr; }

            // StateMachine.g:298:5: (nOrExpr= conditionalOrExpression (operator= IMPLIES n1= conditionalOrExpression )* )
            // StateMachine.g:298:9: nOrExpr= conditionalOrExpression (operator= IMPLIES n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1681);
            nOrExpr=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nOrExpr;}

            // StateMachine.g:299:9: (operator= IMPLIES n1= conditionalOrExpression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==IMPLIES) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // StateMachine.g:300:13: operator= IMPLIES n1= conditionalOrExpression
            	    {
            	    operator=(Token)match(input,IMPLIES,FOLLOW_IMPLIES_in_conditionalImpliesExpression1709); if (state.failed) return expr;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1713);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

            	    }
            	    break;

            	default :
            	    break loop31;
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
            if ( state.backtracking>0 ) { memoize(input, 27, conditionalImpliesExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalImpliesExpression"



    // $ANTLR start "conditionalOrExpression"
    // StateMachine.g:305:1: conditionalOrExpression returns [ASTExpression expr] : nAndExpr= conditionalAndExpression (operator= '||' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalOrExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nAndExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return expr; }

            // StateMachine.g:306:5: (nAndExpr= conditionalAndExpression (operator= '||' n1= conditionalAndExpression )* )
            // StateMachine.g:306:9: nAndExpr= conditionalAndExpression (operator= '||' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression1760);
            nAndExpr=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nAndExpr;}

            // StateMachine.g:307:9: (operator= '||' n1= conditionalAndExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==85) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // StateMachine.g:308:13: operator= '||' n1= conditionalAndExpression
            	    {
            	    operator=(Token)match(input,85,FOLLOW_85_in_conditionalOrExpression1788); if (state.failed) return expr;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression1792);
            	    n1=conditionalAndExpression();

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
            if ( state.backtracking>0 ) { memoize(input, 28, conditionalOrExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // StateMachine.g:313:1: conditionalAndExpression returns [ASTExpression expr] : nXorExpr= conditionalXorExpression (operator= '&&' n1= conditionalXorExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalAndExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nXorExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return expr; }

            // StateMachine.g:314:5: (nXorExpr= conditionalXorExpression (operator= '&&' n1= conditionalXorExpression )* )
            // StateMachine.g:314:9: nXorExpr= conditionalXorExpression (operator= '&&' n1= conditionalXorExpression )*
            {
            pushFollow(FOLLOW_conditionalXorExpression_in_conditionalAndExpression1842);
            nXorExpr=conditionalXorExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nXorExpr;}

            // StateMachine.g:315:9: (operator= '&&' n1= conditionalXorExpression )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==75) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // StateMachine.g:316:14: operator= '&&' n1= conditionalXorExpression
            	    {
            	    operator=(Token)match(input,75,FOLLOW_75_in_conditionalAndExpression1872); if (state.failed) return expr;

            	    pushFollow(FOLLOW_conditionalXorExpression_in_conditionalAndExpression1876);
            	    n1=conditionalXorExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

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
            if ( state.backtracking>0 ) { memoize(input, 29, conditionalAndExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "conditionalXorExpression"
    // StateMachine.g:321:1: conditionalXorExpression returns [ASTExpression expr] : nEquality= equalityExpression (operator= XOR n1= equalityExpression )* ;
    public final ASTExpression conditionalXorExpression() throws RecognitionException {
        ASTExpression expr = null;

        int conditionalXorExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nEquality =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return expr; }

            // StateMachine.g:322:5: (nEquality= equalityExpression (operator= XOR n1= equalityExpression )* )
            // StateMachine.g:322:9: nEquality= equalityExpression (operator= XOR n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalXorExpression1927);
            nEquality=equalityExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nEquality;}

            // StateMachine.g:323:9: (operator= XOR n1= equalityExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==XOR) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // StateMachine.g:324:13: operator= XOR n1= equalityExpression
            	    {
            	    operator=(Token)match(input,XOR,FOLLOW_XOR_in_conditionalXorExpression1955); if (state.failed) return expr;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalXorExpression1959);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

            	    }
            	    break;

            	default :
            	    break loop34;
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
            if ( state.backtracking>0 ) { memoize(input, 30, conditionalXorExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "conditionalXorExpression"



    // $ANTLR start "equalityExpression"
    // StateMachine.g:329:1: equalityExpression returns [ASTExpression expr] : nRelExpr= relationalExpression (operator= ( '==' | '!=' ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression expr = null;

        int equalityExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nRelExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return expr; }

            // StateMachine.g:330:5: (nRelExpr= relationalExpression (operator= ( '==' | '!=' ) n1= relationalExpression )* )
            // StateMachine.g:330:9: nRelExpr= relationalExpression (operator= ( '==' | '!=' ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression2007);
            nRelExpr=relationalExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nRelExpr;}

            // StateMachine.g:331:5: (operator= ( '==' | '!=' ) n1= relationalExpression )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==NOT_EQUAL||LA35_0==82) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // StateMachine.g:332:9: operator= ( '==' | '!=' ) n1= relationalExpression
            	    {
            	    operator=(Token)input.LT(1);

            	    if ( input.LA(1)==NOT_EQUAL||input.LA(1)==82 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return expr;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression2038);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

            	    }
            	    break;

            	default :
            	    break loop35;
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
            if ( state.backtracking>0 ) { memoize(input, 31, equalityExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "equalityExpression"



    // $ANTLR start "relationalExpression"
    // StateMachine.g:337:1: relationalExpression returns [ASTExpression expr] : nAddExpr= additiveExpression (operator= relationalOp n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression expr = null;

        int relationalExpression_StartIndex = input.index();

        ASTExpression nAddExpr =null;

        Token operator =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return expr; }

            // StateMachine.g:338:5: (nAddExpr= additiveExpression (operator= relationalOp n1= additiveExpression )* )
            // StateMachine.g:338:7: nAddExpr= additiveExpression (operator= relationalOp n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression2075);
            nAddExpr=additiveExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nAddExpr;}

            // StateMachine.g:339:9: (operator= relationalOp n1= additiveExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0 >= GREATER && LA36_0 <= GREATER_EQUAL)||(LA36_0 >= LESS && LA36_0 <= LESS_EQUAL)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // StateMachine.g:340:13: operator= relationalOp n1= additiveExpression
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression2103);
            	    operator=relationalOp();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression2107);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

            	    }
            	    break;

            	default :
            	    break loop36;
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
            if ( state.backtracking>0 ) { memoize(input, 32, relationalExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "relationalExpression"



    // $ANTLR start "relationalOp"
    // StateMachine.g:345:1: relationalOp returns [Token token] : (t= '<=' |t= '>=' |t= '<' |t= '>' );
    public final Token relationalOp() throws RecognitionException {
        Token token = null;

        int relationalOp_StartIndex = input.index();

        Token t=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return token; }

            // StateMachine.g:346:5: (t= '<=' |t= '>=' |t= '<' |t= '>' )
            int alt37=4;
            switch ( input.LA(1) ) {
            case LESS_EQUAL:
                {
                alt37=1;
                }
                break;
            case GREATER_EQUAL:
                {
                alt37=2;
                }
                break;
            case LESS:
                {
                alt37=3;
                }
                break;
            case GREATER:
                {
                alt37=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return token;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }

            switch (alt37) {
                case 1 :
                    // StateMachine.g:346:10: t= '<='
                    {
                    t=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_relationalOp2154); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:347:10: t= '>='
                    {
                    t=(Token)match(input,GREATER_EQUAL,FOLLOW_GREATER_EQUAL_in_relationalOp2169); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 3 :
                    // StateMachine.g:348:10: t= '<'
                    {
                    t=(Token)match(input,LESS,FOLLOW_LESS_in_relationalOp2184); if (state.failed) return token;

                    if ( state.backtracking==0 ) {token =t;}

                    }
                    break;
                case 4 :
                    // StateMachine.g:349:10: t= '>'
                    {
                    t=(Token)match(input,GREATER,FOLLOW_GREATER_in_relationalOp2200); if (state.failed) return token;

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
            if ( state.backtracking>0 ) { memoize(input, 33, relationalOp_StartIndex); }

        }
        return token;
    }
    // $ANTLR end "relationalOp"



    // $ANTLR start "additiveExpression"
    // StateMachine.g:352:1: additiveExpression returns [ASTExpression expr] : nMulExpr= multiplicativeExpression (operator= ( '+' | '-' ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression expr = null;

        int additiveExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nMulExpr =null;

        ASTExpression n1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return expr; }

            // StateMachine.g:353:5: (nMulExpr= multiplicativeExpression (operator= ( '+' | '-' ) n1= multiplicativeExpression )* )
            // StateMachine.g:353:9: nMulExpr= multiplicativeExpression (operator= ( '+' | '-' ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2228);
            nMulExpr=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nMulExpr;}

            // StateMachine.g:354:9: (operator= ( '+' | '-' ) n1= multiplicativeExpression )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==MINUS||LA38_0==PLUS) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // StateMachine.g:355:13: operator= ( '+' | '-' ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2269);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr,n1);}

            	    }
            	    break;

            	default :
            	    break loop38;
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
            if ( state.backtracking>0 ) { memoize(input, 34, additiveExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // StateMachine.g:360:1: multiplicativeExpression returns [ASTExpression expr] : nUnrExpr= unaryExpression (operator= ( '*' | '/' | '%' ) m1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression expr = null;

        int multiplicativeExpression_StartIndex = input.index();

        Token operator=null;
        ASTExpression nUnrExpr =null;

        ASTExpression m1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return expr; }

            // StateMachine.g:361:5: (nUnrExpr= unaryExpression (operator= ( '*' | '/' | '%' ) m1= unaryExpression )* )
            // StateMachine.g:362:9: nUnrExpr= unaryExpression (operator= ( '*' | '/' | '%' ) m1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2325);
            nUnrExpr=unaryExpression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =nUnrExpr;}

            // StateMachine.g:363:9: (operator= ( '*' | '/' | '%' ) m1= unaryExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==SLASH||LA39_0==STAR||LA39_0==74) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // StateMachine.g:364:13: operator= ( '*' | '/' | '%' ) m1= unaryExpression
            	    {
            	    operator=(Token)input.LT(1);

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==74 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return expr;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2392);
            	    m1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {expr = new ASTBinaryExpression(operator,expr, m1);}

            	    }
            	    break;

            	default :
            	    break loop39;
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
            if ( state.backtracking>0 ) { memoize(input, 35, multiplicativeExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // StateMachine.g:369:1: unaryExpression returns [ASTExpression expr] : ( '+' unrExpr= unaryExpression | '-' unrExpr= unaryExpression |nUnrExprOther= unaryExpressionNotPlusMinus );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression expr = null;

        int unaryExpression_StartIndex = input.index();

        ASTExpression unrExpr =null;

        ASTExpression nUnrExprOther =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return expr; }

            // StateMachine.g:370:5: ( '+' unrExpr= unaryExpression | '-' unrExpr= unaryExpression |nUnrExprOther= unaryExpressionNotPlusMinus )
            int alt40=3;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt40=1;
                }
                break;
            case MINUS:
                {
                alt40=2;
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
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // StateMachine.g:370:9: '+' unrExpr= unaryExpression
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_unaryExpression2428); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2432);
                    unrExpr=unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =unrExpr;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:371:9: '-' unrExpr= unaryExpression
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_unaryExpression2444); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2448);
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
                    // StateMachine.g:383:9: nUnrExprOther= unaryExpressionNotPlusMinus
                    {
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2477);
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
            if ( state.backtracking>0 ) { memoize(input, 36, unaryExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "unaryExpression"



    // $ANTLR start "unaryExpressionNotPlusMinus"
    // StateMachine.g:386:1: unaryExpressionNotPlusMinus returns [ASTExpression expr] : (not= '!' UnrExpr= unaryExpression |nPriExpr= primary (postfix= ( '--' | '++' ) )? );
    public final ASTExpression unaryExpressionNotPlusMinus() throws RecognitionException {
        ASTExpression expr = null;

        int unaryExpressionNotPlusMinus_StartIndex = input.index();

        Token not=null;
        Token postfix=null;
        ASTExpression UnrExpr =null;

        ASTExpression nPriExpr =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return expr; }

            // StateMachine.g:390:5: (not= '!' UnrExpr= unaryExpression |nPriExpr= primary (postfix= ( '--' | '++' ) )? )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==NOT) ) {
                alt42=1;
            }
            else if ( (LA42_0==BOOLLITERAL||LA42_0==CHARLITERAL||LA42_0==IDENT||LA42_0==INTLITERAL||LA42_0==LPAREN||LA42_0==PREV||LA42_0==REALLITERAL||LA42_0==STRINGLITERAL) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // StateMachine.g:390:9: not= '!' UnrExpr= unaryExpression
                    {
                    not=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpressionNotPlusMinus2508); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2512);
                    UnrExpr=unaryExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =new ASTUnaryExpression(not,UnrExpr);}

                    }
                    break;
                case 2 :
                    // StateMachine.g:391:9: nPriExpr= primary (postfix= ( '--' | '++' ) )?
                    {
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus2526);
                    nPriExpr=primary();

                    state._fsp--;
                    if (state.failed) return expr;

                    // StateMachine.g:391:33: (postfix= ( '--' | '++' ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==77||LA41_0==79) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // StateMachine.g:391:33: postfix= ( '--' | '++' )
                            {
                            postfix=(Token)input.LT(1);

                            if ( input.LA(1)==77||input.LA(1)==79 ) {
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
            if ( state.backtracking>0 ) { memoize(input, 37, unaryExpressionNotPlusMinus_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"



    // $ANTLR start "primary"
    // StateMachine.g:402:1: primary returns [ASTExpression expr] : (pExpr= parExpression |id= identifier ( DOT member= identifier )? |nLiteralExpr= literal | PREV LPAREN pid= identifier RPAREN );
    public final ASTExpression primary() throws RecognitionException {
        ASTExpression expr = null;

        int primary_StartIndex = input.index();

        ASTExpression pExpr =null;

        ASTIdentifier id =null;

        ASTIdentifier member =null;

        ASTLiteral nLiteralExpr =null;

        ASTIdentifier pid =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return expr; }

            // StateMachine.g:403:5: (pExpr= parExpression |id= identifier ( DOT member= identifier )? |nLiteralExpr= literal | PREV LPAREN pid= identifier RPAREN )
            int alt44=4;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt44=1;
                }
                break;
            case IDENT:
                {
                alt44=2;
                }
                break;
            case BOOLLITERAL:
            case CHARLITERAL:
            case INTLITERAL:
            case REALLITERAL:
            case STRINGLITERAL:
                {
                alt44=3;
                }
                break;
            case PREV:
                {
                alt44=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }

            switch (alt44) {
                case 1 :
                    // StateMachine.g:403:9: pExpr= parExpression
                    {
                    pushFollow(FOLLOW_parExpression_in_primary2572);
                    pExpr=parExpression();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =pExpr;}

                    }
                    break;
                case 2 :
                    // StateMachine.g:404:9: id= identifier ( DOT member= identifier )?
                    {
                    pushFollow(FOLLOW_identifier_in_primary2586);
                    id=identifier();

                    state._fsp--;
                    if (state.failed) return expr;

                    // StateMachine.g:405:9: ( DOT member= identifier )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==DOT) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // StateMachine.g:405:11: DOT member= identifier
                            {
                            match(input,DOT,FOLLOW_DOT_in_primary2598); if (state.failed) return expr;

                            pushFollow(FOLLOW_identifier_in_primary2602);
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
                    // StateMachine.g:416:9: nLiteralExpr= literal
                    {
                    pushFollow(FOLLOW_literal_in_primary2627);
                    nLiteralExpr=literal();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =nLiteralExpr;}

                    }
                    break;
                case 4 :
                    // StateMachine.g:417:9: PREV LPAREN pid= identifier RPAREN
                    {
                    match(input,PREV,FOLLOW_PREV_in_primary2639); if (state.failed) return expr;

                    match(input,LPAREN,FOLLOW_LPAREN_in_primary2641); if (state.failed) return expr;

                    pushFollow(FOLLOW_identifier_in_primary2645);
                    pid=identifier();

                    state._fsp--;
                    if (state.failed) return expr;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primary2647); if (state.failed) return expr;

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
            if ( state.backtracking>0 ) { memoize(input, 38, primary_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "primary"



    // $ANTLR start "parExpression"
    // StateMachine.g:425:1: parExpression returns [ASTExpression expr] : '(' e= expression ')' ;
    public final ASTExpression parExpression() throws RecognitionException {
        ASTExpression expr = null;

        int parExpression_StartIndex = input.index();

        ASTExpression e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return expr; }

            // StateMachine.g:426:5: ( '(' e= expression ')' )
            // StateMachine.g:426:9: '(' e= expression ')'
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2673); if (state.failed) return expr;

            pushFollow(FOLLOW_expression_in_parExpression2677);
            e=expression();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =e;}

            match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2681); if (state.failed) return expr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 39, parExpression_StartIndex); }

        }
        return expr;
    }
    // $ANTLR end "parExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_MACHINE_in_machine76 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_identifier_in_machine80 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_machine84 = new BitSet(new long[]{0x0240800A05080110L,0x000000000000002BL});
    public static final BitSet FOLLOW_globalVariableDecl_in_machine97 = new BitSet(new long[]{0x0240800A05080110L,0x000000000000002BL});
    public static final BitSet FOLLOW_state_in_machine114 = new BitSet(new long[]{0x0040800805000010L,0x0000000000000023L});
    public static final BitSet FOLLOW_trans_in_machine133 = new BitSet(new long[]{0x0040000804000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_invariantExpression_in_machine150 = new BitSet(new long[]{0x0040000804000000L});
    public static final BitSet FOLLOW_goal_in_machine167 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_machine178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_machine180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stateModifier_in_state204 = new BitSet(new long[]{0x0000800001000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_STATE_in_state234 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_identifier_in_state238 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_state242 = new BitSet(new long[]{0x0659140680080B00L,0x0000000000000018L});
    public static final BitSet FOLLOW_localVariableDecl_in_state255 = new BitSet(new long[]{0x0659140680080B00L,0x0000000000000018L});
    public static final BitSet FOLLOW_expression_in_state274 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_state276 = new BitSet(new long[]{0x0459140480000A00L,0x0000000000000010L});
    public static final BitSet FOLLOW_RBRACE_in_state287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANS_in_trans304 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_identifier_in_trans311 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_trans316 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_identifier_in_trans331 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ARROW_in_trans345 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_identifier_in_trans352 = new BitSet(new long[]{0x0044000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ON_in_trans366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_label_in_trans371 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_WHERE_in_trans387 = new BitSet(new long[]{0x0419140480000A00L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_trans391 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_trans395 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_trans403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVARIANT_in_invariantExpression422 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_identifier_in_invariantExpression436 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_invariantExpression444 = new BitSet(new long[]{0x0419140480000A00L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_invariantExpression458 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_invariantExpression460 = new BitSet(new long[]{0x0459140480000A00L,0x0000000000000010L});
    public static final BitSet FOLLOW_RBRACE_in_invariantExpression471 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_FOR_in_invariantExpression483 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_invariantExpression485 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_identifier_in_invariantExpression489 = new BitSet(new long[]{0x0040000000010000L});
    public static final BitSet FOLLOW_COMMA_in_invariantExpression494 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_identifier_in_invariantExpression498 = new BitSet(new long[]{0x0040000000010000L});
    public static final BitSet FOLLOW_RBRACE_in_invariantExpression505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOAL_in_goal528 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_goal532 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_set_in_goal540 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_forExpr_in_goal560 = new BitSet(new long[]{0x0140000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_viaExpr_in_goal572 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_stopExpr_in_goal589 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_goal616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forExpr634 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_forExpr638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REACH_in_stopExpr661 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_stopExpr663 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_identifier_in_stopExpr678 = new BitSet(new long[]{0x0800000000010000L});
    public static final BitSet FOLLOW_COMMA_in_stopExpr691 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_identifier_in_stopExpr695 = new BitSet(new long[]{0x0800000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_stopExpr715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VIA_in_viaExpr738 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_viaExpr742 = new BitSet(new long[]{0x0020000080000000L});
    public static final BitSet FOLLOW_pathExpr_in_viaExpr747 = new BitSet(new long[]{0x0800000000010000L});
    public static final BitSet FOLLOW_COMMA_in_viaExpr753 = new BitSet(new long[]{0x0020000080000000L});
    public static final BitSet FOLLOW_pathExpr_in_viaExpr757 = new BitSet(new long[]{0x0800000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_viaExpr766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stateIncExpr_in_pathExpr784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_transIncExpr_in_pathExpr796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_stateIncExpr821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_transIncExpr872 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_pathOP_in_transIncExpr889 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ARROW_in_transIncExpr921 = new BitSet(new long[]{0x0020000080000000L});
    public static final BitSet FOLLOW_identifier_in_transIncExpr947 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_pathOP_in_transIncExpr968 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_P_OP_ONE_in_pathOP1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_label1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identifier1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_stateModifier1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINAL_in_stateModifier1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_stateModifier1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORMAL_in_stateModifier1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_literal1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REALLITERAL_in_literal1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLLITERAL_in_literal1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literal1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literal1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_globalVariableDecl1189 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_globalVariableDecl1193 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_globalVariableDecl1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_localVariableDecl1219 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDecl1223 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_localVariableDecl1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumType_in_type1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primitiveType1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_primitiveType1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primitiveType1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumType1364 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enumType1368 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_identifier_in_enumType1372 = new BitSet(new long[]{0x0040000000010000L});
    public static final BitSet FOLLOW_COMMA_in_enumType1382 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_identifier_in_enumType1386 = new BitSet(new long[]{0x0040000000010000L});
    public static final BitSet FOLLOW_RBRACE_in_enumType1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclarator1416 = new BitSet(new long[]{0x0000000000400002L,0x0000000000000080L});
    public static final BitSet FOLLOW_EQUAL_in_variableDeclarator1434 = new BitSet(new long[]{0x0419140480000A00L,0x0000000000000010L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator1438 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_WHERE_in_variableDeclarator1450 = new BitSet(new long[]{0x0419140480000A00L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_variableDeclarator1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression1512 = new BitSet(new long[]{0x0000000000400002L,0x0000000000035000L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression1541 = new BitSet(new long[]{0x0419140480000A00L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_expression1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_assignmentOperator1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_assignmentOperator1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_assignmentOperator1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_assignmentOperator1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_assignmentOperator1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1681 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_IMPLIES_in_conditionalImpliesExpression1709 = new BitSet(new long[]{0x0419140480000A00L,0x0000000000000010L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1713 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression1760 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_conditionalOrExpression1788 = new BitSet(new long[]{0x0419140480000A00L,0x0000000000000010L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression1792 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_conditionalXorExpression_in_conditionalAndExpression1842 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_conditionalAndExpression1872 = new BitSet(new long[]{0x0419140480000A00L,0x0000000000000010L});
    public static final BitSet FOLLOW_conditionalXorExpression_in_conditionalAndExpression1876 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalXorExpression1927 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_XOR_in_conditionalXorExpression1955 = new BitSet(new long[]{0x0419140480000A00L,0x0000000000000010L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalXorExpression1959 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression2007 = new BitSet(new long[]{0x0002000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_set_in_equalityExpression2027 = new BitSet(new long[]{0x0419140480000A00L,0x0000000000000010L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression2038 = new BitSet(new long[]{0x0002000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2075 = new BitSet(new long[]{0x0000030018000002L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression2103 = new BitSet(new long[]{0x0419140480000A00L,0x0000000000000010L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2107 = new BitSet(new long[]{0x0000030018000002L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_relationalOp2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_EQUAL_in_relationalOp2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_relationalOp2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_relationalOp2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2228 = new BitSet(new long[]{0x0008100000000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression2259 = new BitSet(new long[]{0x0419140480000A00L,0x0000000000000010L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2269 = new BitSet(new long[]{0x0008100000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2325 = new BitSet(new long[]{0xA000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression2358 = new BitSet(new long[]{0x0419140480000A00L,0x0000000000000010L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2392 = new BitSet(new long[]{0xA000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression2428 = new BitSet(new long[]{0x0419140480000A00L,0x0000000000000010L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression2444 = new BitSet(new long[]{0x0419140480000A00L,0x0000000000000010L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryExpressionNotPlusMinus2508 = new BitSet(new long[]{0x0419140480000A00L,0x0000000000000010L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus2526 = new BitSet(new long[]{0x0000000000000002L,0x000000000000A000L});
    public static final BitSet FOLLOW_set_in_unaryExpressionNotPlusMinus2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_primary2586 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_DOT_in_primary2598 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_identifier_in_primary2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREV_in_primary2639 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_primary2641 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_identifier_in_primary2645 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primary2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2673 = new BitSet(new long[]{0x0419140480000A00L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_parExpression2677 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2681 = new BitSet(new long[]{0x0000000000000002L});

}