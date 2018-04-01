package org.xtext.msl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMSLLexer extends Lexer {
    public static final int RULE_STRING=13;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int RULE_FQN_INSTANCE_ID=10;
    public static final int T__18=18;
    public static final int RULE_PATTERN_ID=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_COMPONENT_TYPE=5;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_MULTIPLICITY=6;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=11;
    public static final int RULE_WS=16;
    public static final int RULE_FQN_PATTERN_ID=8;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_INSTANCE_ID=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=12;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int RULE_FQN_COMPONENT=7;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalMSLLexer() {;} 
    public InternalMSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMSL.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:11:7: ( 'import' )
            // InternalMSL.g:11:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:12:7: ( 'abstract' )
            // InternalMSL.g:12:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:13:7: ( 'pattern' )
            // InternalMSL.g:13:9: 'pattern'
            {
            match("pattern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:14:7: ( '{' )
            // InternalMSL.g:14:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:15:7: ( '}' )
            // InternalMSL.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:16:7: ( 'system' )
            // InternalMSL.g:16:9: 'system'
            {
            match("system"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:17:7: ( '[' )
            // InternalMSL.g:17:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:18:7: ( ']' )
            // InternalMSL.g:18:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:19:7: ( 'group' )
            // InternalMSL.g:19:9: 'group'
            {
            match("group"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:20:7: ( 'components' )
            // InternalMSL.g:20:9: 'components'
            {
            match("components"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:21:7: ( 'managedSyS' )
            // InternalMSL.g:21:9: 'managedSyS'
            {
            match("managedSyS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:22:7: ( 'managedGrp' )
            // InternalMSL.g:22:9: 'managedGrp'
            {
            match("managedGrp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:23:7: ( ',' )
            // InternalMSL.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:24:7: ( 'interaction' )
            // InternalMSL.g:24:9: 'interaction'
            {
            match("interaction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:25:7: ( '->' )
            // InternalMSL.g:25:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:26:7: ( ':' )
            // InternalMSL.g:26:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:27:7: ( 'concrete' )
            // InternalMSL.g:27:9: 'concrete'
            {
            match("concrete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:28:7: ( 'concretizationOf' )
            // InternalMSL.g:28:9: 'concretizationOf'
            {
            match("concretizationOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:29:7: ( 'configuration' )
            // InternalMSL.g:29:9: 'configuration'
            {
            match("configuration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:30:7: ( 'instanceOf' )
            // InternalMSL.g:30:9: 'instanceOf'
            {
            match("instanceOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_COMPONENT_TYPE"
    public final void mRULE_COMPONENT_TYPE() throws RecognitionException {
        try {
            int _type = RULE_COMPONENT_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:4485:21: ( ( 'M' | 'A' | 'P' | 'E' ) )
            // InternalMSL.g:4485:23: ( 'M' | 'A' | 'P' | 'E' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='E'||input.LA(1)=='M'||input.LA(1)=='P' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMPONENT_TYPE"

    // $ANTLR start "RULE_MULTIPLICITY"
    public final void mRULE_MULTIPLICITY() throws RecognitionException {
        try {
            int _type = RULE_MULTIPLICITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:4487:19: ( ( '1' | '*-ALL' | '*-SOME' | '*-ONE' ) )
            // InternalMSL.g:4487:21: ( '1' | '*-ALL' | '*-SOME' | '*-ONE' )
            {
            // InternalMSL.g:4487:21: ( '1' | '*-ALL' | '*-SOME' | '*-ONE' )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='1') ) {
                alt1=1;
            }
            else if ( (LA1_0=='*') ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='-') ) {
                    switch ( input.LA(3) ) {
                    case 'A':
                        {
                        alt1=2;
                        }
                        break;
                    case 'S':
                        {
                        alt1=3;
                        }
                        break;
                    case 'O':
                        {
                        alt1=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMSL.g:4487:22: '1'
                    {
                    match('1'); 

                    }
                    break;
                case 2 :
                    // InternalMSL.g:4487:26: '*-ALL'
                    {
                    match("*-ALL"); 


                    }
                    break;
                case 3 :
                    // InternalMSL.g:4487:34: '*-SOME'
                    {
                    match("*-SOME"); 


                    }
                    break;
                case 4 :
                    // InternalMSL.g:4487:43: '*-ONE'
                    {
                    match("*-ONE"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTIPLICITY"

    // $ANTLR start "RULE_PATTERN_ID"
    public final void mRULE_PATTERN_ID() throws RecognitionException {
        try {
            int _type = RULE_PATTERN_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:4489:17: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+ )
            // InternalMSL.g:4489:19: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            {
            matchRange('A','Z'); 
            // InternalMSL.g:4489:28: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMSL.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PATTERN_ID"

    // $ANTLR start "RULE_INSTANCE_ID"
    public final void mRULE_INSTANCE_ID() throws RecognitionException {
        try {
            int _type = RULE_INSTANCE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:4491:18: ( 'a' .. 'z' ( 'a' .. 'z' | '0' .. '9' | '_' )+ )
            // InternalMSL.g:4491:20: 'a' .. 'z' ( 'a' .. 'z' | '0' .. '9' | '_' )+
            {
            matchRange('a','z'); 
            // InternalMSL.g:4491:29: ( 'a' .. 'z' | '0' .. '9' | '_' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INSTANCE_ID"

    // $ANTLR start "RULE_FQN_PATTERN_ID"
    public final void mRULE_FQN_PATTERN_ID() throws RecognitionException {
        try {
            int _type = RULE_FQN_PATTERN_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:4493:21: ( RULE_PATTERN_ID ( '.' RULE_PATTERN_ID )+ )
            // InternalMSL.g:4493:23: RULE_PATTERN_ID ( '.' RULE_PATTERN_ID )+
            {
            mRULE_PATTERN_ID(); 
            // InternalMSL.g:4493:39: ( '.' RULE_PATTERN_ID )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='.') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMSL.g:4493:40: '.' RULE_PATTERN_ID
            	    {
            	    match('.'); 
            	    mRULE_PATTERN_ID(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FQN_PATTERN_ID"

    // $ANTLR start "RULE_FQN_INSTANCE_ID"
    public final void mRULE_FQN_INSTANCE_ID() throws RecognitionException {
        try {
            int _type = RULE_FQN_INSTANCE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:4495:22: ( RULE_INSTANCE_ID '.' RULE_INSTANCE_ID )
            // InternalMSL.g:4495:24: RULE_INSTANCE_ID '.' RULE_INSTANCE_ID
            {
            mRULE_INSTANCE_ID(); 
            match('.'); 
            mRULE_INSTANCE_ID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FQN_INSTANCE_ID"

    // $ANTLR start "RULE_FQN_COMPONENT"
    public final void mRULE_FQN_COMPONENT() throws RecognitionException {
        try {
            int _type = RULE_FQN_COMPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:4497:20: ( RULE_PATTERN_ID '.' RULE_COMPONENT_TYPE )
            // InternalMSL.g:4497:22: RULE_PATTERN_ID '.' RULE_COMPONENT_TYPE
            {
            mRULE_PATTERN_ID(); 
            match('.'); 
            mRULE_COMPONENT_TYPE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FQN_COMPONENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:4499:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMSL.g:4499:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMSL.g:4499:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMSL.g:4499:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMSL.g:4499:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:4501:10: ( ( '0' .. '9' )+ )
            // InternalMSL.g:4501:12: ( '0' .. '9' )+
            {
            // InternalMSL.g:4501:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMSL.g:4501:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:4503:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMSL.g:4503:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMSL.g:4503:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMSL.g:4503:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMSL.g:4503:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMSL.g:4503:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMSL.g:4503:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMSL.g:4503:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMSL.g:4503:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMSL.g:4503:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMSL.g:4503:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:4505:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMSL.g:4505:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMSL.g:4505:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMSL.g:4505:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:4507:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMSL.g:4507:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMSL.g:4507:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMSL.g:4507:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalMSL.g:4507:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMSL.g:4507:41: ( '\\r' )? '\\n'
                    {
                    // InternalMSL.g:4507:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMSL.g:4507:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:4509:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMSL.g:4509:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMSL.g:4509:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:4511:16: ( . )
            // InternalMSL.g:4511:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMSL.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_COMPONENT_TYPE | RULE_MULTIPLICITY | RULE_PATTERN_ID | RULE_INSTANCE_ID | RULE_FQN_PATTERN_ID | RULE_FQN_INSTANCE_ID | RULE_FQN_COMPONENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=34;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalMSL.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // InternalMSL.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // InternalMSL.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // InternalMSL.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // InternalMSL.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // InternalMSL.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // InternalMSL.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // InternalMSL.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // InternalMSL.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // InternalMSL.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // InternalMSL.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // InternalMSL.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // InternalMSL.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // InternalMSL.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // InternalMSL.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // InternalMSL.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // InternalMSL.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // InternalMSL.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // InternalMSL.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // InternalMSL.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // InternalMSL.g:1:130: RULE_COMPONENT_TYPE
                {
                mRULE_COMPONENT_TYPE(); 

                }
                break;
            case 22 :
                // InternalMSL.g:1:150: RULE_MULTIPLICITY
                {
                mRULE_MULTIPLICITY(); 

                }
                break;
            case 23 :
                // InternalMSL.g:1:168: RULE_PATTERN_ID
                {
                mRULE_PATTERN_ID(); 

                }
                break;
            case 24 :
                // InternalMSL.g:1:184: RULE_INSTANCE_ID
                {
                mRULE_INSTANCE_ID(); 

                }
                break;
            case 25 :
                // InternalMSL.g:1:201: RULE_FQN_PATTERN_ID
                {
                mRULE_FQN_PATTERN_ID(); 

                }
                break;
            case 26 :
                // InternalMSL.g:1:221: RULE_FQN_INSTANCE_ID
                {
                mRULE_FQN_INSTANCE_ID(); 

                }
                break;
            case 27 :
                // InternalMSL.g:1:242: RULE_FQN_COMPONENT
                {
                mRULE_FQN_COMPONENT(); 

                }
                break;
            case 28 :
                // InternalMSL.g:1:261: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 29 :
                // InternalMSL.g:1:269: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 30 :
                // InternalMSL.g:1:278: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 31 :
                // InternalMSL.g:1:290: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // InternalMSL.g:1:306: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // InternalMSL.g:1:322: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // InternalMSL.g:1:330: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\3\36\2\uffff\1\36\2\uffff\3\36\1\uffff\1\33\1\uffff\1\56\1\57\1\33\2\36\1\33\2\uffff\3\33\2\uffff\2\66\1\uffff\3\66\2\uffff\1\66\2\uffff\3\66\3\uffff\1\101\7\uffff\1\66\2\uffff\11\66\2\uffff\13\66\1\133\1\uffff\6\66\1\142\4\66\1\uffff\1\147\4\66\1\154\1\uffff\4\66\1\uffff\3\66\1\164\1\uffff\6\66\1\175\1\uffff\1\66\1\177\2\66\2\36\1\66\1\36\1\uffff\1\66\1\uffff\2\66\2\36\1\66\1\u008c\1\u008d\2\66\1\u0090\1\u0091\1\u0092\2\uffff\2\66\3\uffff\3\66\1\u0098\1\66\1\uffff\1\36\1\u009b\1\uffff";
    static final String DFA16_eofS =
        "\u009c\uffff";
    static final String DFA16_minS =
        "\1\0\3\60\2\uffff\1\60\2\uffff\3\60\1\uffff\1\76\1\uffff\2\60\1\55\1\101\1\60\1\101\2\uffff\2\0\1\52\2\uffff\2\56\1\uffff\3\56\2\uffff\1\56\2\uffff\3\56\3\uffff\1\56\7\uffff\1\56\2\uffff\11\56\1\uffff\1\101\13\56\1\101\1\uffff\13\56\1\uffff\6\56\1\uffff\4\56\1\uffff\4\56\1\uffff\7\56\1\uffff\4\56\1\171\1\162\1\56\1\146\1\uffff\1\56\1\uffff\2\56\1\123\1\160\1\56\1\60\3\56\2\60\1\56\2\uffff\2\56\3\uffff\5\56\1\uffff\1\146\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\3\172\2\uffff\1\172\2\uffff\3\172\1\uffff\1\76\1\uffff\1\172\1\71\1\55\3\172\2\uffff\2\uffff\1\57\2\uffff\2\172\1\uffff\3\172\2\uffff\1\172\2\uffff\3\172\3\uffff\1\172\7\uffff\1\172\2\uffff\11\172\1\uffff\1\132\14\172\1\uffff\13\172\1\uffff\6\172\1\uffff\4\172\1\uffff\4\172\1\uffff\7\172\1\uffff\4\172\1\171\1\162\1\172\1\146\1\uffff\1\172\1\uffff\2\172\1\123\1\160\10\172\2\uffff\2\172\3\uffff\5\172\1\uffff\1\146\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\4\uffff\1\4\1\5\1\uffff\1\7\1\10\3\uffff\1\15\1\uffff\1\20\6\uffff\1\34\1\35\3\uffff\1\41\1\42\2\uffff\1\34\3\uffff\1\4\1\5\1\uffff\1\7\1\10\3\uffff\1\15\1\17\1\20\1\uffff\1\25\1\26\1\35\1\36\1\37\1\40\1\41\1\uffff\1\30\1\32\11\uffff\1\27\15\uffff\1\31\13\uffff\1\33\6\uffff\1\11\4\uffff\1\1\4\uffff\1\6\7\uffff\1\3\10\uffff\1\2\1\uffff\1\21\14\uffff\1\24\1\12\2\uffff\1\13\1\14\1\16\5\uffff\1\23\2\uffff\1\22";
    static final String DFA16_specialS =
        "\1\1\26\uffff\1\0\1\2\u0083\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\33\2\32\2\33\1\32\22\33\1\32\1\33\1\27\4\33\1\30\2\33\1\21\1\33\1\14\1\15\1\33\1\31\1\26\1\20\10\26\1\16\6\33\1\17\3\22\1\17\7\22\1\17\2\22\1\17\12\22\1\7\1\33\1\10\1\24\1\25\1\33\1\2\1\23\1\12\3\23\1\11\1\23\1\1\3\23\1\13\2\23\1\3\2\23\1\6\7\23\1\4\1\33\1\5\uff82\33",
            "\12\37\45\uffff\1\37\1\uffff\14\37\1\34\1\35\14\37",
            "\12\37\45\uffff\1\37\1\uffff\1\37\1\40\30\37",
            "\12\37\45\uffff\1\37\1\uffff\1\41\31\37",
            "",
            "",
            "\12\37\45\uffff\1\37\1\uffff\30\37\1\44\1\37",
            "",
            "",
            "\12\37\45\uffff\1\37\1\uffff\21\37\1\47\10\37",
            "\12\37\45\uffff\1\37\1\uffff\16\37\1\50\13\37",
            "\12\37\45\uffff\1\37\1\uffff\1\51\31\37",
            "",
            "\1\53",
            "",
            "\12\36\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\60",
            "\1\57",
            "\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\37\45\uffff\1\37\1\uffff\32\37",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\0\61",
            "\0\61",
            "\1\62\4\uffff\1\63",
            "",
            "",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\17\37\1\65\12\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\22\37\1\71\1\70\6\37",
            "",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\32\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\22\37\1\72\7\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\23\37\1\73\6\37",
            "",
            "",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\22\37\1\74\7\37",
            "",
            "",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\16\37\1\75\13\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\14\37\1\76\1\77\14\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\15\37\1\100\14\37",
            "",
            "",
            "",
            "\1\102\1\uffff\12\36\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\16\37\1\103\13\37",
            "",
            "",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\4\37\1\104\25\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\23\37\1\105\6\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\23\37\1\106\6\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\23\37\1\107\6\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\23\37\1\110\6\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\24\37\1\111\5\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\17\37\1\112\12\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\2\37\1\113\2\37\1\114\24\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\1\115\31\37",
            "",
            "\1\116\3\117\1\116\7\117\1\116\2\117\1\116\12\117",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\21\37\1\120\10\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\21\37\1\121\10\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\1\122\31\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\21\37\1\123\10\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\4\37\1\124\25\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\4\37\1\125\25\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\17\37\1\126\12\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\16\37\1\127\13\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\21\37\1\130\10\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\10\37\1\131\21\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\6\37\1\132\23\37",
            "\32\117\4\uffff\1\117\1\uffff\32\117",
            "",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\23\37\1\134\6\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\1\135\31\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\15\37\1\136\14\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\1\137\31\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\21\37\1\140\10\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\14\37\1\141\15\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\32\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\15\37\1\143\14\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\4\37\1\144\25\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\6\37\1\145\23\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\4\37\1\146\25\37",
            "",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\32\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\2\37\1\150\27\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\2\37\1\151\27\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\2\37\1\152\27\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\15\37\1\153\14\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\4\37\1\155\25\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\23\37\1\156\6\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\24\37\1\157\5\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\3\37\1\160\26\37",
            "",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\23\37\1\161\6\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\4\37\1\162\25\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\23\37\1\163\6\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\15\37\1\165\14\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\4\37\1\166\3\37\1\167\21\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\21\37\1\170\10\37",
            "\1\67\1\uffff\12\37\7\uffff\6\36\1\172\13\36\1\171\7\36\4\uffff\1\37\1\uffff\32\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\10\37\1\173\21\37",
            "\1\67\1\uffff\12\37\7\uffff\16\36\1\174\13\36\4\uffff\1\37\1\uffff\32\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\23\37\1\176\6\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\32\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\31\37\1\u0080",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\1\u0081\31\37",
            "\1\u0082",
            "\1\u0083",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\16\37\1\u0084\13\37",
            "\1\u0085",
            "",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\22\37\1\u0086\7\37",
            "",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\1\u0087\31\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\23\37\1\u0088\6\37",
            "\1\u0089",
            "\1\u008a",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\15\37\1\u008b\14\37",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\32\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\23\37\1\u008e\6\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\10\37\1\u008f\21\37",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\10\37\1\u0093\21\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\16\37\1\u0094\13\37",
            "",
            "",
            "",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\16\37\1\u0095\13\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\15\37\1\u0096\14\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\15\37\1\u0097\14\37",
            "\1\67\1\uffff\12\37\7\uffff\32\36\4\uffff\1\37\1\uffff\32\37",
            "\1\67\1\uffff\12\37\7\uffff\16\36\1\u0099\13\36\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u009a",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_COMPONENT_TYPE | RULE_MULTIPLICITY | RULE_PATTERN_ID | RULE_INSTANCE_ID | RULE_FQN_PATTERN_ID | RULE_FQN_INSTANCE_ID | RULE_FQN_COMPONENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_23 = input.LA(1);

                        s = -1;
                        if ( ((LA16_23>='\u0000' && LA16_23<='\uFFFF')) ) {s = 49;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='i') ) {s = 1;}

                        else if ( (LA16_0=='a') ) {s = 2;}

                        else if ( (LA16_0=='p') ) {s = 3;}

                        else if ( (LA16_0=='{') ) {s = 4;}

                        else if ( (LA16_0=='}') ) {s = 5;}

                        else if ( (LA16_0=='s') ) {s = 6;}

                        else if ( (LA16_0=='[') ) {s = 7;}

                        else if ( (LA16_0==']') ) {s = 8;}

                        else if ( (LA16_0=='g') ) {s = 9;}

                        else if ( (LA16_0=='c') ) {s = 10;}

                        else if ( (LA16_0=='m') ) {s = 11;}

                        else if ( (LA16_0==',') ) {s = 12;}

                        else if ( (LA16_0=='-') ) {s = 13;}

                        else if ( (LA16_0==':') ) {s = 14;}

                        else if ( (LA16_0=='A'||LA16_0=='E'||LA16_0=='M'||LA16_0=='P') ) {s = 15;}

                        else if ( (LA16_0=='1') ) {s = 16;}

                        else if ( (LA16_0=='*') ) {s = 17;}

                        else if ( ((LA16_0>='B' && LA16_0<='D')||(LA16_0>='F' && LA16_0<='L')||(LA16_0>='N' && LA16_0<='O')||(LA16_0>='Q' && LA16_0<='Z')) ) {s = 18;}

                        else if ( (LA16_0=='b'||(LA16_0>='d' && LA16_0<='f')||LA16_0=='h'||(LA16_0>='j' && LA16_0<='l')||(LA16_0>='n' && LA16_0<='o')||(LA16_0>='q' && LA16_0<='r')||(LA16_0>='t' && LA16_0<='z')) ) {s = 19;}

                        else if ( (LA16_0=='^') ) {s = 20;}

                        else if ( (LA16_0=='_') ) {s = 21;}

                        else if ( (LA16_0=='0'||(LA16_0>='2' && LA16_0<='9')) ) {s = 22;}

                        else if ( (LA16_0=='\"') ) {s = 23;}

                        else if ( (LA16_0=='\'') ) {s = 24;}

                        else if ( (LA16_0=='/') ) {s = 25;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 26;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='(' && LA16_0<=')')||LA16_0=='+'||LA16_0=='.'||(LA16_0>=';' && LA16_0<='@')||LA16_0=='\\'||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_24 = input.LA(1);

                        s = -1;
                        if ( ((LA16_24>='\u0000' && LA16_24<='\uFFFF')) ) {s = 49;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}