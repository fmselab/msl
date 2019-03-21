package org.xtext.msl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;

@SuppressWarnings("all")
public class InternalMSLLexer extends Lexer {
    public static final int T__19=19;
    public static final int RULE_MULTIPLICITY=6;
    public static final int RULE_ID=13;
    public static final int RULE_FQN_PATTERN_ID=8;
    public static final int RULE_DECIMAL=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=12;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=14;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_FQN_INSTANCE_ID=11;
    public static final int RULE_PATTERN_ID=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_COMPONENT_TYPE=5;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=17;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_INSTANCE_ID=9;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int RULE_FQN_COMPONENT=7;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalMSLLexer() {;} 
    public InternalMSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    @Override
	public String getGrammarFileName() { return "InternalMSL.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:20:7: ( 'managedSyS' )
            // InternalMSL.g:20:9: 'managedSyS'
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
            // InternalMSL.g:21:7: ( ',' )
            // InternalMSL.g:21:9: ','
            {
            match(','); 

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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:23:7: ( 'components' )
            // InternalMSL.g:23:9: 'components'
            {
            match("components"); 


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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:31:7: ( '=' )
            // InternalMSL.g:31:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:32:7: ( 's' )
            // InternalMSL.g:32:9: 's'
            {
            match('s'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:33:7: ( 'ms' )
            // InternalMSL.g:33:9: 'ms'
            {
            match("ms"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:34:7: ( 'us' )
            // InternalMSL.g:34:9: 'us'
            {
            match("us"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:35:7: ( 'ns' )
            // InternalMSL.g:35:9: 'ns'
            {
            match("ns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:36:7: ( 'min' )
            // InternalMSL.g:36:9: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:37:7: ( 'hrs' )
            // InternalMSL.g:37:9: 'hrs'
            {
            match("hrs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:38:7: ( 'dys' )
            // InternalMSL.g:38:9: 'dys'
            {
            match("dys"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_COMPONENT_TYPE"
    public final void mRULE_COMPONENT_TYPE() throws RecognitionException {
        try {
            int _type = RULE_COMPONENT_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:1764:21: ( ( 'M' | 'A' | 'P' | 'E' ) )
            // InternalMSL.g:1764:23: ( 'M' | 'A' | 'P' | 'E' )
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
            // InternalMSL.g:1766:19: ( ( '1' | '*-ALL' | '*-SOME' | '*-ONE' ) )
            // InternalMSL.g:1766:21: ( '1' | '*-ALL' | '*-SOME' | '*-ONE' )
            {
            // InternalMSL.g:1766:21: ( '1' | '*-ALL' | '*-SOME' | '*-ONE' )
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
                    // InternalMSL.g:1766:22: '1'
                    {
                    match('1'); 

                    }
                    break;
                case 2 :
                    // InternalMSL.g:1766:26: '*-ALL'
                    {
                    match("*-ALL"); 


                    }
                    break;
                case 3 :
                    // InternalMSL.g:1766:34: '*-SOME'
                    {
                    match("*-SOME"); 


                    }
                    break;
                case 4 :
                    // InternalMSL.g:1766:43: '*-ONE'
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
            // InternalMSL.g:1768:17: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+ )
            // InternalMSL.g:1768:19: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            {
            matchRange('A','Z'); 
            // InternalMSL.g:1768:28: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
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
            // InternalMSL.g:1770:18: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+ )
            // InternalMSL.g:1770:20: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
            {
            matchRange('a','z'); 
            // InternalMSL.g:1770:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            // InternalMSL.g:1772:21: ( RULE_PATTERN_ID ( '.' RULE_PATTERN_ID )+ )
            // InternalMSL.g:1772:23: RULE_PATTERN_ID ( '.' RULE_PATTERN_ID )+
            {
            mRULE_PATTERN_ID(); 
            // InternalMSL.g:1772:39: ( '.' RULE_PATTERN_ID )+
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
            	    // InternalMSL.g:1772:40: '.' RULE_PATTERN_ID
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
            // InternalMSL.g:1774:22: ( RULE_INSTANCE_ID '.' RULE_INSTANCE_ID )
            // InternalMSL.g:1774:24: RULE_INSTANCE_ID '.' RULE_INSTANCE_ID
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
            // InternalMSL.g:1776:20: ( RULE_PATTERN_ID '.' RULE_COMPONENT_TYPE )
            // InternalMSL.g:1776:22: RULE_PATTERN_ID '.' RULE_COMPONENT_TYPE
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

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:1778:14: ( RULE_INT '.' RULE_INT )
            // InternalMSL.g:1778:16: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMSL.g:1780:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMSL.g:1780:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMSL.g:1780:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMSL.g:1780:11: '^'
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

            // InternalMSL.g:1780:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalMSL.g:1782:19: ( ( '0' .. '9' )+ )
            // InternalMSL.g:1782:21: ( '0' .. '9' )+
            {
            // InternalMSL.g:1782:21: ( '0' .. '9' )+
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
            	    // InternalMSL.g:1782:22: '0' .. '9'
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
            // InternalMSL.g:1784:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMSL.g:1784:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMSL.g:1784:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalMSL.g:1784:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMSL.g:1784:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalMSL.g:1784:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMSL.g:1784:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalMSL.g:1784:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMSL.g:1784:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalMSL.g:1784:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMSL.g:1784:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalMSL.g:1786:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMSL.g:1786:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMSL.g:1786:24: ( options {greedy=false; } : . )*
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
            	    // InternalMSL.g:1786:52: .
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
            // InternalMSL.g:1788:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMSL.g:1788:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMSL.g:1788:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMSL.g:1788:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalMSL.g:1788:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMSL.g:1788:41: ( '\\r' )? '\\n'
                    {
                    // InternalMSL.g:1788:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMSL.g:1788:41: '\\r'
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
            // InternalMSL.g:1790:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMSL.g:1790:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMSL.g:1790:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalMSL.g:1792:16: ( . )
            // InternalMSL.g:1792:18: .
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

    @Override
	public void mTokens() throws RecognitionException {
        // InternalMSL.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_COMPONENT_TYPE | RULE_MULTIPLICITY | RULE_PATTERN_ID | RULE_INSTANCE_ID | RULE_FQN_PATTERN_ID | RULE_FQN_INSTANCE_ID | RULE_FQN_COMPONENT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=42;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalMSL.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // InternalMSL.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // InternalMSL.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // InternalMSL.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // InternalMSL.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // InternalMSL.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // InternalMSL.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // InternalMSL.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // InternalMSL.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // InternalMSL.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // InternalMSL.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // InternalMSL.g:1:76: T__30
                {
                mT__30(); 

                }
                break;
            case 13 :
                // InternalMSL.g:1:82: T__31
                {
                mT__31(); 

                }
                break;
            case 14 :
                // InternalMSL.g:1:88: T__32
                {
                mT__32(); 

                }
                break;
            case 15 :
                // InternalMSL.g:1:94: T__33
                {
                mT__33(); 

                }
                break;
            case 16 :
                // InternalMSL.g:1:100: T__34
                {
                mT__34(); 

                }
                break;
            case 17 :
                // InternalMSL.g:1:106: T__35
                {
                mT__35(); 

                }
                break;
            case 18 :
                // InternalMSL.g:1:112: T__36
                {
                mT__36(); 

                }
                break;
            case 19 :
                // InternalMSL.g:1:118: T__37
                {
                mT__37(); 

                }
                break;
            case 20 :
                // InternalMSL.g:1:124: T__38
                {
                mT__38(); 

                }
                break;
            case 21 :
                // InternalMSL.g:1:130: T__39
                {
                mT__39(); 

                }
                break;
            case 22 :
                // InternalMSL.g:1:136: T__40
                {
                mT__40(); 

                }
                break;
            case 23 :
                // InternalMSL.g:1:142: T__41
                {
                mT__41(); 

                }
                break;
            case 24 :
                // InternalMSL.g:1:148: T__42
                {
                mT__42(); 

                }
                break;
            case 25 :
                // InternalMSL.g:1:154: T__43
                {
                mT__43(); 

                }
                break;
            case 26 :
                // InternalMSL.g:1:160: T__44
                {
                mT__44(); 

                }
                break;
            case 27 :
                // InternalMSL.g:1:166: T__45
                {
                mT__45(); 

                }
                break;
            case 28 :
                // InternalMSL.g:1:172: T__46
                {
                mT__46(); 

                }
                break;
            case 29 :
                // InternalMSL.g:1:178: RULE_COMPONENT_TYPE
                {
                mRULE_COMPONENT_TYPE(); 

                }
                break;
            case 30 :
                // InternalMSL.g:1:198: RULE_MULTIPLICITY
                {
                mRULE_MULTIPLICITY(); 

                }
                break;
            case 31 :
                // InternalMSL.g:1:216: RULE_PATTERN_ID
                {
                mRULE_PATTERN_ID(); 

                }
                break;
            case 32 :
                // InternalMSL.g:1:232: RULE_INSTANCE_ID
                {
                mRULE_INSTANCE_ID(); 

                }
                break;
            case 33 :
                // InternalMSL.g:1:249: RULE_FQN_PATTERN_ID
                {
                mRULE_FQN_PATTERN_ID(); 

                }
                break;
            case 34 :
                // InternalMSL.g:1:269: RULE_FQN_INSTANCE_ID
                {
                mRULE_FQN_INSTANCE_ID(); 

                }
                break;
            case 35 :
                // InternalMSL.g:1:290: RULE_FQN_COMPONENT
                {
                mRULE_FQN_COMPONENT(); 

                }
                break;
            case 36 :
                // InternalMSL.g:1:309: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 37 :
                // InternalMSL.g:1:322: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // InternalMSL.g:1:330: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 39 :
                // InternalMSL.g:1:342: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 40 :
                // InternalMSL.g:1:358: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 41 :
                // InternalMSL.g:1:374: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 42 :
                // InternalMSL.g:1:382: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\3\44\2\uffff\1\52\2\uffff\2\44\1\uffff\1\44\1\40\2\uffff\4\44\1\72\1\74\1\40\2\44\2\40\1\uffff\3\40\2\uffff\3\103\1\uffff\2\103\2\uffff\1\103\3\uffff\2\103\1\114\1\103\1\uffff\1\103\3\uffff\1\120\1\121\2\103\1\uffff\1\124\6\uffff\1\103\2\uffff\7\103\1\uffff\1\136\2\103\2\uffff\1\142\1\143\2\uffff\10\103\1\uffff\3\103\2\uffff\1\161\1\uffff\6\103\1\170\4\103\1\uffff\1\175\4\103\1\u0082\1\uffff\4\103\1\uffff\3\103\1\u008a\1\uffff\6\103\1\u0093\1\uffff\3\103\1\u0097\4\103\1\uffff\3\103\1\uffff\3\103\1\u00a2\1\u00a3\1\u00a4\1\u00a5\2\103\1\u00a8\4\uffff\2\103\1\uffff\3\103\1\u00ae\1\103\1\uffff\1\103\1\u00b1\1\uffff";
    static final String DFA16_eofS =
        "\u00b2\uffff";
    static final String DFA16_minS =
        "\1\0\3\60\2\uffff\1\60\2\uffff\2\60\1\uffff\1\60\1\76\2\uffff\5\60\1\56\1\55\1\101\1\60\1\56\1\101\1\uffff\2\0\1\52\2\uffff\3\56\1\uffff\2\56\2\uffff\1\56\3\uffff\4\56\1\uffff\1\56\3\uffff\4\56\1\uffff\1\56\6\uffff\1\56\2\uffff\7\56\1\uffff\3\56\2\uffff\2\56\1\uffff\1\101\10\56\1\uffff\3\56\2\uffff\1\101\1\uffff\13\56\1\uffff\6\56\1\uffff\4\56\1\uffff\4\56\1\uffff\7\56\1\uffff\10\56\1\uffff\3\56\1\uffff\12\56\4\uffff\2\56\1\uffff\5\56\1\uffff\2\56\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\3\172\2\uffff\1\172\2\uffff\2\172\1\uffff\1\172\1\76\2\uffff\5\172\1\71\1\55\2\172\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff\3\172\1\uffff\2\172\2\uffff\1\172\3\uffff\4\172\1\uffff\1\172\3\uffff\4\172\1\uffff\1\172\6\uffff\1\172\2\uffff\7\172\1\uffff\3\172\2\uffff\2\172\1\uffff\1\132\10\172\1\uffff\3\172\2\uffff\1\172\1\uffff\13\172\1\uffff\6\172\1\uffff\4\172\1\uffff\4\172\1\uffff\7\172\1\uffff\10\172\1\uffff\3\172\1\uffff\12\172\4\uffff\2\172\1\uffff\5\172\1\uffff\2\172\1\uffff";
    static final String DFA16_acceptS =
        "\4\uffff\1\4\1\5\1\uffff\1\7\1\10\2\uffff\1\13\2\uffff\1\20\1\25\13\uffff\1\45\3\uffff\1\51\1\52\3\uffff\1\45\2\uffff\1\4\1\5\1\uffff\1\26\1\7\1\10\4\uffff\1\13\1\uffff\1\17\1\20\1\25\4\uffff\1\35\1\uffff\1\36\1\44\1\46\1\47\1\50\1\51\1\uffff\1\40\1\42\7\uffff\1\27\3\uffff\1\30\1\31\2\uffff\1\37\11\uffff\1\32\3\uffff\1\33\1\34\1\uffff\1\41\13\uffff\1\43\6\uffff\1\11\4\uffff\1\1\4\uffff\1\6\7\uffff\1\3\10\uffff\1\2\3\uffff\1\21\12\uffff\1\24\1\12\1\14\1\15\2\uffff\1\16\5\uffff\1\23\2\uffff\1\22";
    static final String DFA16_specialS =
        "\1\1\33\uffff\1\0\1\2\u0094\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\40\1\34\4\40\1\35\2\40\1\26\1\40\1\13\1\15\1\40\1\36\1\31\1\25\10\31\1\16\2\40\1\17\3\40\1\24\3\27\1\24\7\27\1\24\2\27\1\24\12\27\1\7\1\40\1\10\1\32\1\33\1\40\1\2\1\30\1\14\1\23\2\30\1\11\1\22\1\1\3\30\1\12\1\21\1\30\1\3\2\30\1\6\1\30\1\20\5\30\1\4\1\40\1\5\uff82\40",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\14\43\1\41\1\42\14\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\43\1\45\30\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\46\31\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\30\43\1\51\1\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\55\10\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\56\7\43\1\60\11\43\1\57\7\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\62\13\43",
            "\1\63",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\66\7\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\67\7\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\70\10\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\30\43\1\71\1\43",
            "\12\44\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\75\1\uffff\12\75",
            "\1\74",
            "\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\75\1\uffff\12\75",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\0\76",
            "\0\76",
            "\1\77\4\uffff\1\100",
            "",
            "",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\17\43\1\102\12\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\106\1\105\6\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\107\7\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\110\6\43",
            "",
            "",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\111\7\43",
            "",
            "",
            "",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\112\13\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\113\14\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\115\14\43",
            "",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\14\43\1\116\1\117\14\43",
            "",
            "",
            "",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\122\7\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\123\7\43",
            "",
            "\1\125\1\uffff\12\44\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\126\13\43",
            "",
            "",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\127\25\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\130\6\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\131\6\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\132\6\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\133\6\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\24\43\1\134\5\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\135\31\43",
            "",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\17\43\1\137\12\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\2\43\1\140\2\43\1\141\24\43",
            "",
            "",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\144\3\145\1\144\7\145\1\144\2\145\1\144\12\145",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\146\10\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\147\10\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\150\31\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\151\10\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\152\25\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\153\25\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\17\43\1\154\12\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\6\43\1\155\23\43",
            "",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\156\13\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\157\10\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\160\21\43",
            "",
            "",
            "\32\145\4\uffff\1\145\1\uffff\32\145",
            "",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\162\6\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\163\31\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\164\14\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\165\31\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\166\10\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\14\43\1\167\15\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\171\25\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\172\14\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\173\25\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\6\43\1\174\23\43",
            "",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\2\43\1\176\27\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\2\43\1\177\27\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\2\43\1\u0080\27\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u0081\14\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\3\43\1\u0083\26\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u0084\25\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u0085\6\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\24\43\1\u0086\5\43",
            "",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u0087\6\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u0088\25\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u0089\6\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\104\1\uffff\12\43\7\uffff\6\43\1\u008c\13\43\1\u008b\7\43\4\uffff\1\43\1\uffff\32\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u008d\14\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u008e\3\43\1\u008f\21\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\u0090\10\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u0091\21\43",
            "\1\104\1\uffff\12\43\7\uffff\16\43\1\u0092\13\43\4\uffff\1\43\1\uffff\32\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\30\43\1\u0094\1\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\u0095\10\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u0096\6\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\31\43\1\u0098",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\u0099\31\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\u009a\13\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\5\43\1\u009b\24\43",
            "",
            "\1\104\1\uffff\12\43\7\uffff\22\43\1\u009c\7\43\4\uffff\1\43\1\uffff\32\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\17\43\1\u009d\12\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\u009e\7\43",
            "",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\u009f\31\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u00a0\6\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u00a1\14\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u00a6\6\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u00a7\21\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u00a9\21\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\u00aa\13\43",
            "",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\u00ab\13\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u00ac\14\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u00ad\14\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\104\1\uffff\12\43\7\uffff\16\43\1\u00af\13\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\5\43\1\u00b0\24\43",
            "\1\104\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
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
        @Override
		public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_COMPONENT_TYPE | RULE_MULTIPLICITY | RULE_PATTERN_ID | RULE_INSTANCE_ID | RULE_FQN_PATTERN_ID | RULE_FQN_INSTANCE_ID | RULE_FQN_COMPONENT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        @Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_28 = input.LA(1);

                        s = -1;
                        if ( ((LA16_28>='\u0000' && LA16_28<='\uFFFF')) ) {s = 62;}

                        else s = 32;

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

                        else if ( (LA16_0=='m') ) {s = 10;}

                        else if ( (LA16_0==',') ) {s = 11;}

                        else if ( (LA16_0=='c') ) {s = 12;}

                        else if ( (LA16_0=='-') ) {s = 13;}

                        else if ( (LA16_0==':') ) {s = 14;}

                        else if ( (LA16_0=='=') ) {s = 15;}

                        else if ( (LA16_0=='u') ) {s = 16;}

                        else if ( (LA16_0=='n') ) {s = 17;}

                        else if ( (LA16_0=='h') ) {s = 18;}

                        else if ( (LA16_0=='d') ) {s = 19;}

                        else if ( (LA16_0=='A'||LA16_0=='E'||LA16_0=='M'||LA16_0=='P') ) {s = 20;}

                        else if ( (LA16_0=='1') ) {s = 21;}

                        else if ( (LA16_0=='*') ) {s = 22;}

                        else if ( ((LA16_0>='B' && LA16_0<='D')||(LA16_0>='F' && LA16_0<='L')||(LA16_0>='N' && LA16_0<='O')||(LA16_0>='Q' && LA16_0<='Z')) ) {s = 23;}

                        else if ( (LA16_0=='b'||(LA16_0>='e' && LA16_0<='f')||(LA16_0>='j' && LA16_0<='l')||LA16_0=='o'||(LA16_0>='q' && LA16_0<='r')||LA16_0=='t'||(LA16_0>='v' && LA16_0<='z')) ) {s = 24;}

                        else if ( (LA16_0=='0'||(LA16_0>='2' && LA16_0<='9')) ) {s = 25;}

                        else if ( (LA16_0=='^') ) {s = 26;}

                        else if ( (LA16_0=='_') ) {s = 27;}

                        else if ( (LA16_0=='\"') ) {s = 28;}

                        else if ( (LA16_0=='\'') ) {s = 29;}

                        else if ( (LA16_0=='/') ) {s = 30;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 31;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='(' && LA16_0<=')')||LA16_0=='+'||LA16_0=='.'||(LA16_0>=';' && LA16_0<='<')||(LA16_0>='>' && LA16_0<='@')||LA16_0=='\\'||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_29 = input.LA(1);

                        s = -1;
                        if ( ((LA16_29>='\u0000' && LA16_29<='\uFFFF')) ) {s = 62;}

                        else s = 32;

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