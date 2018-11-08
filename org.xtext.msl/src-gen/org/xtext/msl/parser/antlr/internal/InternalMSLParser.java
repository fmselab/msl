package org.xtext.msl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.msl.services.MSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PATTERN_ID", "RULE_COMPONENT_TYPE", "RULE_MULTIPLICITY", "RULE_INSTANCE_ID", "RULE_FQN_COMPONENT", "RULE_FQN_PATTERN_ID", "RULE_FQN_INSTANCE_ID", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'abstract'", "'pattern'", "'{'", "'}'", "'system'", "'['", "']'", "'='", "'group'", "'managedSyS'", "','", "'managedGrp'", "'components'", "'interaction'", "'->'", "':'", "'concrete'", "'concretizationOf'", "'configuration'", "'instanceOf'"
    };
    public static final int RULE_STRING=13;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int T__38=38;
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
    public static final int RULE_FQN_PATTERN_ID=9;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_INSTANCE_ID=7;
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
    public static final int RULE_FQN_COMPONENT=8;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMSL.g"; }



     	private MSLGrammarAccess grammarAccess;

        public InternalMSLParser(TokenStream input, MSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Specification";
       	}

       	@Override
       	protected MSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSpecification"
    // InternalMSL.g:64:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalMSL.g:64:54: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalMSL.g:65:2: iv_ruleSpecification= ruleSpecification EOF
            {
             newCompositeNode(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;

             current =iv_ruleSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalMSL.g:71:1: ruleSpecification returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_absPattern_1_0= ruleAbstractPattern ) )? ( (lv_pattern_2_0= rulePattern ) )* ( (lv_configuration_3_0= ruleConfiguration ) )? ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_absPattern_1_0 = null;

        EObject lv_pattern_2_0 = null;

        EObject lv_configuration_3_0 = null;



        	enterRule();

        try {
            // InternalMSL.g:77:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_absPattern_1_0= ruleAbstractPattern ) )? ( (lv_pattern_2_0= rulePattern ) )* ( (lv_configuration_3_0= ruleConfiguration ) )? ) )
            // InternalMSL.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_absPattern_1_0= ruleAbstractPattern ) )? ( (lv_pattern_2_0= rulePattern ) )* ( (lv_configuration_3_0= ruleConfiguration ) )? )
            {
            // InternalMSL.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_absPattern_1_0= ruleAbstractPattern ) )? ( (lv_pattern_2_0= rulePattern ) )* ( (lv_configuration_3_0= ruleConfiguration ) )? )
            // InternalMSL.g:79:3: ( (lv_imports_0_0= ruleImport ) )* ( (lv_absPattern_1_0= ruleAbstractPattern ) )? ( (lv_pattern_2_0= rulePattern ) )* ( (lv_configuration_3_0= ruleConfiguration ) )?
            {
            // InternalMSL.g:79:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMSL.g:80:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalMSL.g:80:4: (lv_imports_0_0= ruleImport )
            	    // InternalMSL.g:81:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getSpecificationAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"org.xtext.msl.MSL.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMSL.g:98:3: ( (lv_absPattern_1_0= ruleAbstractPattern ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMSL.g:99:4: (lv_absPattern_1_0= ruleAbstractPattern )
                    {
                    // InternalMSL.g:99:4: (lv_absPattern_1_0= ruleAbstractPattern )
                    // InternalMSL.g:100:5: lv_absPattern_1_0= ruleAbstractPattern
                    {

                    					newCompositeNode(grammarAccess.getSpecificationAccess().getAbsPatternAbstractPatternParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_absPattern_1_0=ruleAbstractPattern();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    					}
                    					set(
                    						current,
                    						"absPattern",
                    						lv_absPattern_1_0,
                    						"org.xtext.msl.MSL.AbstractPattern");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMSL.g:117:3: ( (lv_pattern_2_0= rulePattern ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==35) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMSL.g:118:4: (lv_pattern_2_0= rulePattern )
            	    {
            	    // InternalMSL.g:118:4: (lv_pattern_2_0= rulePattern )
            	    // InternalMSL.g:119:5: lv_pattern_2_0= rulePattern
            	    {

            	    					newCompositeNode(grammarAccess.getSpecificationAccess().getPatternPatternParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_pattern_2_0=rulePattern();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pattern",
            	    						lv_pattern_2_0,
            	    						"org.xtext.msl.MSL.Pattern");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMSL.g:136:3: ( (lv_configuration_3_0= ruleConfiguration ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==37) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMSL.g:137:4: (lv_configuration_3_0= ruleConfiguration )
                    {
                    // InternalMSL.g:137:4: (lv_configuration_3_0= ruleConfiguration )
                    // InternalMSL.g:138:5: lv_configuration_3_0= ruleConfiguration
                    {

                    					newCompositeNode(grammarAccess.getSpecificationAccess().getConfigurationConfigurationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_configuration_3_0=ruleConfiguration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    					}
                    					set(
                    						current,
                    						"configuration",
                    						lv_configuration_3_0,
                    						"org.xtext.msl.MSL.Configuration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleImport"
    // InternalMSL.g:159:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMSL.g:159:47: (iv_ruleImport= ruleImport EOF )
            // InternalMSL.g:160:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMSL.g:166:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (otherlv_1= RULE_PATTERN_ID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMSL.g:172:2: ( (otherlv_0= 'import' ( (otherlv_1= RULE_PATTERN_ID ) ) ) )
            // InternalMSL.g:173:2: (otherlv_0= 'import' ( (otherlv_1= RULE_PATTERN_ID ) ) )
            {
            // InternalMSL.g:173:2: (otherlv_0= 'import' ( (otherlv_1= RULE_PATTERN_ID ) ) )
            // InternalMSL.g:174:3: otherlv_0= 'import' ( (otherlv_1= RULE_PATTERN_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalMSL.g:178:3: ( (otherlv_1= RULE_PATTERN_ID ) )
            // InternalMSL.g:179:4: (otherlv_1= RULE_PATTERN_ID )
            {
            // InternalMSL.g:179:4: (otherlv_1= RULE_PATTERN_ID )
            // InternalMSL.g:180:5: otherlv_1= RULE_PATTERN_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_PATTERN_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getImportAccess().getImportedNamespaceAbstractPatternCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleAbstractPattern"
    // InternalMSL.g:195:1: entryRuleAbstractPattern returns [EObject current=null] : iv_ruleAbstractPattern= ruleAbstractPattern EOF ;
    public final EObject entryRuleAbstractPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractPattern = null;


        try {
            // InternalMSL.g:195:56: (iv_ruleAbstractPattern= ruleAbstractPattern EOF )
            // InternalMSL.g:196:2: iv_ruleAbstractPattern= ruleAbstractPattern EOF
            {
             newCompositeNode(grammarAccess.getAbstractPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractPattern=ruleAbstractPattern();

            state._fsp--;

             current =iv_ruleAbstractPattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractPattern"


    // $ANTLR start "ruleAbstractPattern"
    // InternalMSL.g:202:1: ruleAbstractPattern returns [EObject current=null] : (otherlv_0= 'abstract' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= '{' ( (lv_managedSystems_4_0= ruleAbstractSystem ) )* ( (lv_abstractGroups_5_0= ruleAbstractGroup ) )* ( (lv_interactions_6_0= ruleAbstractInteraction ) )* otherlv_7= '}' ) ;
    public final EObject ruleAbstractPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_managedSystems_4_0 = null;

        EObject lv_abstractGroups_5_0 = null;

        EObject lv_interactions_6_0 = null;



        	enterRule();

        try {
            // InternalMSL.g:208:2: ( (otherlv_0= 'abstract' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= '{' ( (lv_managedSystems_4_0= ruleAbstractSystem ) )* ( (lv_abstractGroups_5_0= ruleAbstractGroup ) )* ( (lv_interactions_6_0= ruleAbstractInteraction ) )* otherlv_7= '}' ) )
            // InternalMSL.g:209:2: (otherlv_0= 'abstract' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= '{' ( (lv_managedSystems_4_0= ruleAbstractSystem ) )* ( (lv_abstractGroups_5_0= ruleAbstractGroup ) )* ( (lv_interactions_6_0= ruleAbstractInteraction ) )* otherlv_7= '}' )
            {
            // InternalMSL.g:209:2: (otherlv_0= 'abstract' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= '{' ( (lv_managedSystems_4_0= ruleAbstractSystem ) )* ( (lv_abstractGroups_5_0= ruleAbstractGroup ) )* ( (lv_interactions_6_0= ruleAbstractInteraction ) )* otherlv_7= '}' )
            // InternalMSL.g:210:3: otherlv_0= 'abstract' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= '{' ( (lv_managedSystems_4_0= ruleAbstractSystem ) )* ( (lv_abstractGroups_5_0= ruleAbstractGroup ) )* ( (lv_interactions_6_0= ruleAbstractInteraction ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractPatternAccess().getAbstractKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAbstractPatternAccess().getPatternKeyword_1());
            		
            // InternalMSL.g:218:3: ( (lv_name_2_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:219:4: (lv_name_2_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:219:4: (lv_name_2_0= RULE_PATTERN_ID )
            // InternalMSL.g:220:5: lv_name_2_0= RULE_PATTERN_ID
            {
            lv_name_2_0=(Token)match(input,RULE_PATTERN_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAbstractPatternAccess().getNamePATTERN_IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbstractPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.msl.MSL.PATTERN_ID");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getAbstractPatternAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMSL.g:240:3: ( (lv_managedSystems_4_0= ruleAbstractSystem ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMSL.g:241:4: (lv_managedSystems_4_0= ruleAbstractSystem )
            	    {
            	    // InternalMSL.g:241:4: (lv_managedSystems_4_0= ruleAbstractSystem )
            	    // InternalMSL.g:242:5: lv_managedSystems_4_0= ruleAbstractSystem
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractPatternAccess().getManagedSystemsAbstractSystemParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_managedSystems_4_0=ruleAbstractSystem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbstractPatternRule());
            	    					}
            	    					add(
            	    						current,
            	    						"managedSystems",
            	    						lv_managedSystems_4_0,
            	    						"org.xtext.msl.MSL.AbstractSystem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalMSL.g:259:3: ( (lv_abstractGroups_5_0= ruleAbstractGroup ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMSL.g:260:4: (lv_abstractGroups_5_0= ruleAbstractGroup )
            	    {
            	    // InternalMSL.g:260:4: (lv_abstractGroups_5_0= ruleAbstractGroup )
            	    // InternalMSL.g:261:5: lv_abstractGroups_5_0= ruleAbstractGroup
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractPatternAccess().getAbstractGroupsAbstractGroupParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_abstractGroups_5_0=ruleAbstractGroup();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbstractPatternRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abstractGroups",
            	    						lv_abstractGroups_5_0,
            	    						"org.xtext.msl.MSL.AbstractGroup");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalMSL.g:278:3: ( (lv_interactions_6_0= ruleAbstractInteraction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMSL.g:279:4: (lv_interactions_6_0= ruleAbstractInteraction )
            	    {
            	    // InternalMSL.g:279:4: (lv_interactions_6_0= ruleAbstractInteraction )
            	    // InternalMSL.g:280:5: lv_interactions_6_0= ruleAbstractInteraction
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractPatternAccess().getInteractionsAbstractInteractionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_interactions_6_0=ruleAbstractInteraction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbstractPatternRule());
            	    					}
            	    					add(
            	    						current,
            	    						"interactions",
            	    						lv_interactions_6_0,
            	    						"org.xtext.msl.MSL.AbstractInteraction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAbstractPatternAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractPattern"


    // $ANTLR start "entryRuleAbstractSystem"
    // InternalMSL.g:305:1: entryRuleAbstractSystem returns [EObject current=null] : iv_ruleAbstractSystem= ruleAbstractSystem EOF ;
    public final EObject entryRuleAbstractSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSystem = null;


        try {
            // InternalMSL.g:305:55: (iv_ruleAbstractSystem= ruleAbstractSystem EOF )
            // InternalMSL.g:306:2: iv_ruleAbstractSystem= ruleAbstractSystem EOF
            {
             newCompositeNode(grammarAccess.getAbstractSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractSystem=ruleAbstractSystem();

            state._fsp--;

             current =iv_ruleAbstractSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractSystem"


    // $ANTLR start "ruleAbstractSystem"
    // InternalMSL.g:312:1: ruleAbstractSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) ) ;
    public final EObject ruleAbstractSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMSL.g:318:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) ) )
            // InternalMSL.g:319:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) )
            {
            // InternalMSL.g:319:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) )
            // InternalMSL.g:320:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractSystemAccess().getSystemKeyword_0());
            		
            // InternalMSL.g:324:3: ( (lv_name_1_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:325:4: (lv_name_1_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:325:4: (lv_name_1_0= RULE_PATTERN_ID )
            // InternalMSL.g:326:5: lv_name_1_0= RULE_PATTERN_ID
            {
            lv_name_1_0=(Token)match(input,RULE_PATTERN_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAbstractSystemAccess().getNamePATTERN_IDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbstractSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.msl.MSL.PATTERN_ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractSystem"


    // $ANTLR start "entryRuleAbstractComponent"
    // InternalMSL.g:346:1: entryRuleAbstractComponent returns [EObject current=null] : iv_ruleAbstractComponent= ruleAbstractComponent EOF ;
    public final EObject entryRuleAbstractComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComponent = null;


        try {
            // InternalMSL.g:346:58: (iv_ruleAbstractComponent= ruleAbstractComponent EOF )
            // InternalMSL.g:347:2: iv_ruleAbstractComponent= ruleAbstractComponent EOF
            {
             newCompositeNode(grammarAccess.getAbstractComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractComponent=ruleAbstractComponent();

            state._fsp--;

             current =iv_ruleAbstractComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractComponent"


    // $ANTLR start "ruleAbstractComponent"
    // InternalMSL.g:353:1: ruleAbstractComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_COMPONENT_TYPE ) ) ;
    public final EObject ruleAbstractComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMSL.g:359:2: ( ( (lv_name_0_0= RULE_COMPONENT_TYPE ) ) )
            // InternalMSL.g:360:2: ( (lv_name_0_0= RULE_COMPONENT_TYPE ) )
            {
            // InternalMSL.g:360:2: ( (lv_name_0_0= RULE_COMPONENT_TYPE ) )
            // InternalMSL.g:361:3: (lv_name_0_0= RULE_COMPONENT_TYPE )
            {
            // InternalMSL.g:361:3: (lv_name_0_0= RULE_COMPONENT_TYPE )
            // InternalMSL.g:362:4: lv_name_0_0= RULE_COMPONENT_TYPE
            {
            lv_name_0_0=(Token)match(input,RULE_COMPONENT_TYPE,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAbstractComponentAccess().getNameCOMPONENT_TYPETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAbstractComponentRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.msl.MSL.COMPONENT_TYPE");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractComponent"


    // $ANTLR start "entryRuleGroupDef"
    // InternalMSL.g:381:1: entryRuleGroupDef returns [EObject current=null] : iv_ruleGroupDef= ruleGroupDef EOF ;
    public final EObject entryRuleGroupDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupDef = null;


        try {
            // InternalMSL.g:381:49: (iv_ruleGroupDef= ruleGroupDef EOF )
            // InternalMSL.g:382:2: iv_ruleGroupDef= ruleGroupDef EOF
            {
             newCompositeNode(grammarAccess.getGroupDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupDef=ruleGroupDef();

            state._fsp--;

             current =iv_ruleGroupDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupDef"


    // $ANTLR start "ruleGroupDef"
    // InternalMSL.g:388:1: ruleGroupDef returns [EObject current=null] : ( ( (otherlv_0= RULE_PATTERN_ID ) ) (otherlv_1= '[' ( (lv_mult_2_0= RULE_MULTIPLICITY ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleGroupDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_mult_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMSL.g:394:2: ( ( ( (otherlv_0= RULE_PATTERN_ID ) ) (otherlv_1= '[' ( (lv_mult_2_0= RULE_MULTIPLICITY ) ) otherlv_3= ']' )? ) )
            // InternalMSL.g:395:2: ( ( (otherlv_0= RULE_PATTERN_ID ) ) (otherlv_1= '[' ( (lv_mult_2_0= RULE_MULTIPLICITY ) ) otherlv_3= ']' )? )
            {
            // InternalMSL.g:395:2: ( ( (otherlv_0= RULE_PATTERN_ID ) ) (otherlv_1= '[' ( (lv_mult_2_0= RULE_MULTIPLICITY ) ) otherlv_3= ']' )? )
            // InternalMSL.g:396:3: ( (otherlv_0= RULE_PATTERN_ID ) ) (otherlv_1= '[' ( (lv_mult_2_0= RULE_MULTIPLICITY ) ) otherlv_3= ']' )?
            {
            // InternalMSL.g:396:3: ( (otherlv_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:397:4: (otherlv_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:397:4: (otherlv_0= RULE_PATTERN_ID )
            // InternalMSL.g:398:5: otherlv_0= RULE_PATTERN_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupDefRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_PATTERN_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getGroupDefAccess().getGrpAbstractGroupCrossReference_0_0());
            				

            }


            }

            // InternalMSL.g:409:3: (otherlv_1= '[' ( (lv_mult_2_0= RULE_MULTIPLICITY ) ) otherlv_3= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMSL.g:410:4: otherlv_1= '[' ( (lv_mult_2_0= RULE_MULTIPLICITY ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getGroupDefAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalMSL.g:414:4: ( (lv_mult_2_0= RULE_MULTIPLICITY ) )
                    // InternalMSL.g:415:5: (lv_mult_2_0= RULE_MULTIPLICITY )
                    {
                    // InternalMSL.g:415:5: (lv_mult_2_0= RULE_MULTIPLICITY )
                    // InternalMSL.g:416:6: lv_mult_2_0= RULE_MULTIPLICITY
                    {
                    lv_mult_2_0=(Token)match(input,RULE_MULTIPLICITY,FOLLOW_13); 

                    						newLeafNode(lv_mult_2_0, grammarAccess.getGroupDefAccess().getMultMULTIPLICITYTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGroupDefRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"mult",
                    							lv_mult_2_0,
                    							"org.xtext.msl.MSL.MULTIPLICITY");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getGroupDefAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupDef"


    // $ANTLR start "entryRuleAttValue"
    // InternalMSL.g:441:1: entryRuleAttValue returns [EObject current=null] : iv_ruleAttValue= ruleAttValue EOF ;
    public final EObject entryRuleAttValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttValue = null;


        try {
            // InternalMSL.g:441:49: (iv_ruleAttValue= ruleAttValue EOF )
            // InternalMSL.g:442:2: iv_ruleAttValue= ruleAttValue EOF
            {
             newCompositeNode(grammarAccess.getAttValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttValue=ruleAttValue();

            state._fsp--;

             current =iv_ruleAttValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttValue"


    // $ANTLR start "ruleAttValue"
    // InternalMSL.g:448:1: ruleAttValue returns [EObject current=null] : ( ( (lv_nameAtt_0_0= RULE_INSTANCE_ID ) ) otherlv_1= '=' ( (lv_valAtt_2_0= RULE_INSTANCE_ID ) ) ) ;
    public final EObject ruleAttValue() throws RecognitionException {
        EObject current = null;

        Token lv_nameAtt_0_0=null;
        Token otherlv_1=null;
        Token lv_valAtt_2_0=null;


        	enterRule();

        try {
            // InternalMSL.g:454:2: ( ( ( (lv_nameAtt_0_0= RULE_INSTANCE_ID ) ) otherlv_1= '=' ( (lv_valAtt_2_0= RULE_INSTANCE_ID ) ) ) )
            // InternalMSL.g:455:2: ( ( (lv_nameAtt_0_0= RULE_INSTANCE_ID ) ) otherlv_1= '=' ( (lv_valAtt_2_0= RULE_INSTANCE_ID ) ) )
            {
            // InternalMSL.g:455:2: ( ( (lv_nameAtt_0_0= RULE_INSTANCE_ID ) ) otherlv_1= '=' ( (lv_valAtt_2_0= RULE_INSTANCE_ID ) ) )
            // InternalMSL.g:456:3: ( (lv_nameAtt_0_0= RULE_INSTANCE_ID ) ) otherlv_1= '=' ( (lv_valAtt_2_0= RULE_INSTANCE_ID ) )
            {
            // InternalMSL.g:456:3: ( (lv_nameAtt_0_0= RULE_INSTANCE_ID ) )
            // InternalMSL.g:457:4: (lv_nameAtt_0_0= RULE_INSTANCE_ID )
            {
            // InternalMSL.g:457:4: (lv_nameAtt_0_0= RULE_INSTANCE_ID )
            // InternalMSL.g:458:5: lv_nameAtt_0_0= RULE_INSTANCE_ID
            {
            lv_nameAtt_0_0=(Token)match(input,RULE_INSTANCE_ID,FOLLOW_14); 

            					newLeafNode(lv_nameAtt_0_0, grammarAccess.getAttValueAccess().getNameAttINSTANCE_IDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nameAtt",
            						lv_nameAtt_0_0,
            						"org.xtext.msl.MSL.INSTANCE_ID");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAttValueAccess().getEqualsSignKeyword_1());
            		
            // InternalMSL.g:478:3: ( (lv_valAtt_2_0= RULE_INSTANCE_ID ) )
            // InternalMSL.g:479:4: (lv_valAtt_2_0= RULE_INSTANCE_ID )
            {
            // InternalMSL.g:479:4: (lv_valAtt_2_0= RULE_INSTANCE_ID )
            // InternalMSL.g:480:5: lv_valAtt_2_0= RULE_INSTANCE_ID
            {
            lv_valAtt_2_0=(Token)match(input,RULE_INSTANCE_ID,FOLLOW_2); 

            					newLeafNode(lv_valAtt_2_0, grammarAccess.getAttValueAccess().getValAttINSTANCE_IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valAtt",
            						lv_valAtt_2_0,
            						"org.xtext.msl.MSL.INSTANCE_ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttValue"


    // $ANTLR start "entryRuleAbstractGroup"
    // InternalMSL.g:500:1: entryRuleAbstractGroup returns [EObject current=null] : iv_ruleAbstractGroup= ruleAbstractGroup EOF ;
    public final EObject entryRuleAbstractGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractGroup = null;


        try {
            // InternalMSL.g:500:54: (iv_ruleAbstractGroup= ruleAbstractGroup EOF )
            // InternalMSL.g:501:2: iv_ruleAbstractGroup= ruleAbstractGroup EOF
            {
             newCompositeNode(grammarAccess.getAbstractGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractGroup=ruleAbstractGroup();

            state._fsp--;

             current =iv_ruleAbstractGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractGroup"


    // $ANTLR start "ruleAbstractGroup"
    // InternalMSL.g:507:1: ruleAbstractGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= '{' (otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= '[' ( (lv_attValues_6_0= ruleAttValue ) ) (otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) ) )* otherlv_9= ']' )? )? (otherlv_10= 'managedGrp' ( (lv_manGrp_11_0= ruleGroupDef ) ) (otherlv_12= ',' ( (lv_manGrp_13_0= ruleGroupDef ) ) )* )? otherlv_14= 'components' ( (lv_components_15_0= ruleAbstractComponent ) ) (otherlv_16= ',' ( (lv_components_17_0= ruleAbstractComponent ) ) )* otherlv_18= '}' ) ;
    public final EObject ruleAbstractGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_attValues_6_0 = null;

        EObject lv_attValues_8_0 = null;

        EObject lv_manGrp_11_0 = null;

        EObject lv_manGrp_13_0 = null;

        EObject lv_components_15_0 = null;

        EObject lv_components_17_0 = null;



        	enterRule();

        try {
            // InternalMSL.g:513:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= '{' (otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= '[' ( (lv_attValues_6_0= ruleAttValue ) ) (otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) ) )* otherlv_9= ']' )? )? (otherlv_10= 'managedGrp' ( (lv_manGrp_11_0= ruleGroupDef ) ) (otherlv_12= ',' ( (lv_manGrp_13_0= ruleGroupDef ) ) )* )? otherlv_14= 'components' ( (lv_components_15_0= ruleAbstractComponent ) ) (otherlv_16= ',' ( (lv_components_17_0= ruleAbstractComponent ) ) )* otherlv_18= '}' ) )
            // InternalMSL.g:514:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= '{' (otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= '[' ( (lv_attValues_6_0= ruleAttValue ) ) (otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) ) )* otherlv_9= ']' )? )? (otherlv_10= 'managedGrp' ( (lv_manGrp_11_0= ruleGroupDef ) ) (otherlv_12= ',' ( (lv_manGrp_13_0= ruleGroupDef ) ) )* )? otherlv_14= 'components' ( (lv_components_15_0= ruleAbstractComponent ) ) (otherlv_16= ',' ( (lv_components_17_0= ruleAbstractComponent ) ) )* otherlv_18= '}' )
            {
            // InternalMSL.g:514:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= '{' (otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= '[' ( (lv_attValues_6_0= ruleAttValue ) ) (otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) ) )* otherlv_9= ']' )? )? (otherlv_10= 'managedGrp' ( (lv_manGrp_11_0= ruleGroupDef ) ) (otherlv_12= ',' ( (lv_manGrp_13_0= ruleGroupDef ) ) )* )? otherlv_14= 'components' ( (lv_components_15_0= ruleAbstractComponent ) ) (otherlv_16= ',' ( (lv_components_17_0= ruleAbstractComponent ) ) )* otherlv_18= '}' )
            // InternalMSL.g:515:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= '{' (otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= '[' ( (lv_attValues_6_0= ruleAttValue ) ) (otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) ) )* otherlv_9= ']' )? )? (otherlv_10= 'managedGrp' ( (lv_manGrp_11_0= ruleGroupDef ) ) (otherlv_12= ',' ( (lv_manGrp_13_0= ruleGroupDef ) ) )* )? otherlv_14= 'components' ( (lv_components_15_0= ruleAbstractComponent ) ) (otherlv_16= ',' ( (lv_components_17_0= ruleAbstractComponent ) ) )* otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractGroupAccess().getGroupKeyword_0());
            		
            // InternalMSL.g:519:3: ( (lv_name_1_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:520:4: (lv_name_1_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:520:4: (lv_name_1_0= RULE_PATTERN_ID )
            // InternalMSL.g:521:5: lv_name_1_0= RULE_PATTERN_ID
            {
            lv_name_1_0=(Token)match(input,RULE_PATTERN_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAbstractGroupAccess().getNamePATTERN_IDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbstractGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.msl.MSL.PATTERN_ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getAbstractGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMSL.g:541:3: (otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= '[' ( (lv_attValues_6_0= ruleAttValue ) ) (otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) ) )* otherlv_9= ']' )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMSL.g:542:4: otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= '[' ( (lv_attValues_6_0= ruleAttValue ) ) (otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) ) )* otherlv_9= ']' )?
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getAbstractGroupAccess().getManagedSySKeyword_3_0());
                    			
                    // InternalMSL.g:546:4: ( (otherlv_4= RULE_PATTERN_ID ) )
                    // InternalMSL.g:547:5: (otherlv_4= RULE_PATTERN_ID )
                    {
                    // InternalMSL.g:547:5: (otherlv_4= RULE_PATTERN_ID )
                    // InternalMSL.g:548:6: otherlv_4= RULE_PATTERN_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAbstractGroupRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_PATTERN_ID,FOLLOW_17); 

                    						newLeafNode(otherlv_4, grammarAccess.getAbstractGroupAccess().getManSysAbstractSystemCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalMSL.g:559:4: (otherlv_5= '[' ( (lv_attValues_6_0= ruleAttValue ) ) (otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) ) )* otherlv_9= ']' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==24) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMSL.g:560:5: otherlv_5= '[' ( (lv_attValues_6_0= ruleAttValue ) ) (otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) ) )* otherlv_9= ']'
                            {
                            otherlv_5=(Token)match(input,24,FOLLOW_15); 

                            					newLeafNode(otherlv_5, grammarAccess.getAbstractGroupAccess().getLeftSquareBracketKeyword_3_2_0());
                            				
                            // InternalMSL.g:564:5: ( (lv_attValues_6_0= ruleAttValue ) )
                            // InternalMSL.g:565:6: (lv_attValues_6_0= ruleAttValue )
                            {
                            // InternalMSL.g:565:6: (lv_attValues_6_0= ruleAttValue )
                            // InternalMSL.g:566:7: lv_attValues_6_0= ruleAttValue
                            {

                            							newCompositeNode(grammarAccess.getAbstractGroupAccess().getAttValuesAttValueParserRuleCall_3_2_1_0());
                            						
                            pushFollow(FOLLOW_18);
                            lv_attValues_6_0=ruleAttValue();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAbstractGroupRule());
                            							}
                            							add(
                            								current,
                            								"attValues",
                            								lv_attValues_6_0,
                            								"org.xtext.msl.MSL.AttValue");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMSL.g:583:5: (otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) ) )*
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( (LA9_0==29) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // InternalMSL.g:584:6: otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) )
                            	    {
                            	    otherlv_7=(Token)match(input,29,FOLLOW_15); 

                            	    						newLeafNode(otherlv_7, grammarAccess.getAbstractGroupAccess().getCommaKeyword_3_2_2_0());
                            	    					
                            	    // InternalMSL.g:588:6: ( (lv_attValues_8_0= ruleAttValue ) )
                            	    // InternalMSL.g:589:7: (lv_attValues_8_0= ruleAttValue )
                            	    {
                            	    // InternalMSL.g:589:7: (lv_attValues_8_0= ruleAttValue )
                            	    // InternalMSL.g:590:8: lv_attValues_8_0= ruleAttValue
                            	    {

                            	    								newCompositeNode(grammarAccess.getAbstractGroupAccess().getAttValuesAttValueParserRuleCall_3_2_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_18);
                            	    lv_attValues_8_0=ruleAttValue();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getAbstractGroupRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"attValues",
                            	    									lv_attValues_8_0,
                            	    									"org.xtext.msl.MSL.AttValue");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop9;
                                }
                            } while (true);

                            otherlv_9=(Token)match(input,25,FOLLOW_19); 

                            					newLeafNode(otherlv_9, grammarAccess.getAbstractGroupAccess().getRightSquareBracketKeyword_3_2_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalMSL.g:614:3: (otherlv_10= 'managedGrp' ( (lv_manGrp_11_0= ruleGroupDef ) ) (otherlv_12= ',' ( (lv_manGrp_13_0= ruleGroupDef ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMSL.g:615:4: otherlv_10= 'managedGrp' ( (lv_manGrp_11_0= ruleGroupDef ) ) (otherlv_12= ',' ( (lv_manGrp_13_0= ruleGroupDef ) ) )*
                    {
                    otherlv_10=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getAbstractGroupAccess().getManagedGrpKeyword_4_0());
                    			
                    // InternalMSL.g:619:4: ( (lv_manGrp_11_0= ruleGroupDef ) )
                    // InternalMSL.g:620:5: (lv_manGrp_11_0= ruleGroupDef )
                    {
                    // InternalMSL.g:620:5: (lv_manGrp_11_0= ruleGroupDef )
                    // InternalMSL.g:621:6: lv_manGrp_11_0= ruleGroupDef
                    {

                    						newCompositeNode(grammarAccess.getAbstractGroupAccess().getManGrpGroupDefParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_manGrp_11_0=ruleGroupDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAbstractGroupRule());
                    						}
                    						add(
                    							current,
                    							"manGrp",
                    							lv_manGrp_11_0,
                    							"org.xtext.msl.MSL.GroupDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMSL.g:638:4: (otherlv_12= ',' ( (lv_manGrp_13_0= ruleGroupDef ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==29) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMSL.g:639:5: otherlv_12= ',' ( (lv_manGrp_13_0= ruleGroupDef ) )
                    	    {
                    	    otherlv_12=(Token)match(input,29,FOLLOW_5); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getAbstractGroupAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMSL.g:643:5: ( (lv_manGrp_13_0= ruleGroupDef ) )
                    	    // InternalMSL.g:644:6: (lv_manGrp_13_0= ruleGroupDef )
                    	    {
                    	    // InternalMSL.g:644:6: (lv_manGrp_13_0= ruleGroupDef )
                    	    // InternalMSL.g:645:7: lv_manGrp_13_0= ruleGroupDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getAbstractGroupAccess().getManGrpGroupDefParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_manGrp_13_0=ruleGroupDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAbstractGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"manGrp",
                    	    								lv_manGrp_13_0,
                    	    								"org.xtext.msl.MSL.GroupDef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_14, grammarAccess.getAbstractGroupAccess().getComponentsKeyword_5());
            		
            // InternalMSL.g:668:3: ( (lv_components_15_0= ruleAbstractComponent ) )
            // InternalMSL.g:669:4: (lv_components_15_0= ruleAbstractComponent )
            {
            // InternalMSL.g:669:4: (lv_components_15_0= ruleAbstractComponent )
            // InternalMSL.g:670:5: lv_components_15_0= ruleAbstractComponent
            {

            					newCompositeNode(grammarAccess.getAbstractGroupAccess().getComponentsAbstractComponentParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_22);
            lv_components_15_0=ruleAbstractComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbstractGroupRule());
            					}
            					add(
            						current,
            						"components",
            						lv_components_15_0,
            						"org.xtext.msl.MSL.AbstractComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSL.g:687:3: (otherlv_16= ',' ( (lv_components_17_0= ruleAbstractComponent ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMSL.g:688:4: otherlv_16= ',' ( (lv_components_17_0= ruleAbstractComponent ) )
            	    {
            	    otherlv_16=(Token)match(input,29,FOLLOW_21); 

            	    				newLeafNode(otherlv_16, grammarAccess.getAbstractGroupAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMSL.g:692:4: ( (lv_components_17_0= ruleAbstractComponent ) )
            	    // InternalMSL.g:693:5: (lv_components_17_0= ruleAbstractComponent )
            	    {
            	    // InternalMSL.g:693:5: (lv_components_17_0= ruleAbstractComponent )
            	    // InternalMSL.g:694:6: lv_components_17_0= ruleAbstractComponent
            	    {

            	    						newCompositeNode(grammarAccess.getAbstractGroupAccess().getComponentsAbstractComponentParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_components_17_0=ruleAbstractComponent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAbstractGroupRule());
            	    						}
            	    						add(
            	    							current,
            	    							"components",
            	    							lv_components_17_0,
            	    							"org.xtext.msl.MSL.AbstractComponent");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_18=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getAbstractGroupAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractGroup"


    // $ANTLR start "entryRuleAbstractInteraction"
    // InternalMSL.g:720:1: entryRuleAbstractInteraction returns [EObject current=null] : iv_ruleAbstractInteraction= ruleAbstractInteraction EOF ;
    public final EObject entryRuleAbstractInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractInteraction = null;


        try {
            // InternalMSL.g:720:60: (iv_ruleAbstractInteraction= ruleAbstractInteraction EOF )
            // InternalMSL.g:721:2: iv_ruleAbstractInteraction= ruleAbstractInteraction EOF
            {
             newCompositeNode(grammarAccess.getAbstractInteractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractInteraction=ruleAbstractInteraction();

            state._fsp--;

             current =iv_ruleAbstractInteraction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractInteraction"


    // $ANTLR start "ruleAbstractInteraction"
    // InternalMSL.g:727:1: ruleAbstractInteraction returns [EObject current=null] : (otherlv_0= 'interaction' ( (lv_start_1_0= ruleAbstractComponentName ) ) otherlv_2= '->' ( (lv_end_3_0= ruleAbstractComponentName ) ) (otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']' )? ) ;
    public final EObject ruleAbstractInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_low_5_0=null;
        Token otherlv_6=null;
        Token lv_high_7_0=null;
        Token otherlv_8=null;
        EObject lv_start_1_0 = null;

        EObject lv_end_3_0 = null;



        	enterRule();

        try {
            // InternalMSL.g:733:2: ( (otherlv_0= 'interaction' ( (lv_start_1_0= ruleAbstractComponentName ) ) otherlv_2= '->' ( (lv_end_3_0= ruleAbstractComponentName ) ) (otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']' )? ) )
            // InternalMSL.g:734:2: (otherlv_0= 'interaction' ( (lv_start_1_0= ruleAbstractComponentName ) ) otherlv_2= '->' ( (lv_end_3_0= ruleAbstractComponentName ) ) (otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']' )? )
            {
            // InternalMSL.g:734:2: (otherlv_0= 'interaction' ( (lv_start_1_0= ruleAbstractComponentName ) ) otherlv_2= '->' ( (lv_end_3_0= ruleAbstractComponentName ) ) (otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']' )? )
            // InternalMSL.g:735:3: otherlv_0= 'interaction' ( (lv_start_1_0= ruleAbstractComponentName ) ) otherlv_2= '->' ( (lv_end_3_0= ruleAbstractComponentName ) ) (otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']' )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractInteractionAccess().getInteractionKeyword_0());
            		
            // InternalMSL.g:739:3: ( (lv_start_1_0= ruleAbstractComponentName ) )
            // InternalMSL.g:740:4: (lv_start_1_0= ruleAbstractComponentName )
            {
            // InternalMSL.g:740:4: (lv_start_1_0= ruleAbstractComponentName )
            // InternalMSL.g:741:5: lv_start_1_0= ruleAbstractComponentName
            {

            					newCompositeNode(grammarAccess.getAbstractInteractionAccess().getStartAbstractComponentNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_start_1_0=ruleAbstractComponentName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbstractInteractionRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_1_0,
            						"org.xtext.msl.MSL.AbstractComponentName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getAbstractInteractionAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalMSL.g:762:3: ( (lv_end_3_0= ruleAbstractComponentName ) )
            // InternalMSL.g:763:4: (lv_end_3_0= ruleAbstractComponentName )
            {
            // InternalMSL.g:763:4: (lv_end_3_0= ruleAbstractComponentName )
            // InternalMSL.g:764:5: lv_end_3_0= ruleAbstractComponentName
            {

            					newCompositeNode(grammarAccess.getAbstractInteractionAccess().getEndAbstractComponentNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_end_3_0=ruleAbstractComponentName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbstractInteractionRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_3_0,
            						"org.xtext.msl.MSL.AbstractComponentName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSL.g:781:3: (otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMSL.g:782:4: otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getAbstractInteractionAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalMSL.g:786:4: ( (lv_low_5_0= RULE_MULTIPLICITY ) )
                    // InternalMSL.g:787:5: (lv_low_5_0= RULE_MULTIPLICITY )
                    {
                    // InternalMSL.g:787:5: (lv_low_5_0= RULE_MULTIPLICITY )
                    // InternalMSL.g:788:6: lv_low_5_0= RULE_MULTIPLICITY
                    {
                    lv_low_5_0=(Token)match(input,RULE_MULTIPLICITY,FOLLOW_25); 

                    						newLeafNode(lv_low_5_0, grammarAccess.getAbstractInteractionAccess().getLowMULTIPLICITYTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAbstractInteractionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"low",
                    							lv_low_5_0,
                    							"org.xtext.msl.MSL.MULTIPLICITY");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getAbstractInteractionAccess().getCommaKeyword_4_2());
                    			
                    // InternalMSL.g:808:4: ( (lv_high_7_0= RULE_MULTIPLICITY ) )
                    // InternalMSL.g:809:5: (lv_high_7_0= RULE_MULTIPLICITY )
                    {
                    // InternalMSL.g:809:5: (lv_high_7_0= RULE_MULTIPLICITY )
                    // InternalMSL.g:810:6: lv_high_7_0= RULE_MULTIPLICITY
                    {
                    lv_high_7_0=(Token)match(input,RULE_MULTIPLICITY,FOLLOW_13); 

                    						newLeafNode(lv_high_7_0, grammarAccess.getAbstractInteractionAccess().getHighMULTIPLICITYTerminalRuleCall_4_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAbstractInteractionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"high",
                    							lv_high_7_0,
                    							"org.xtext.msl.MSL.MULTIPLICITY");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getAbstractInteractionAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractInteraction"


    // $ANTLR start "entryRuleAbstractComponentName"
    // InternalMSL.g:835:1: entryRuleAbstractComponentName returns [EObject current=null] : iv_ruleAbstractComponentName= ruleAbstractComponentName EOF ;
    public final EObject entryRuleAbstractComponentName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComponentName = null;


        try {
            // InternalMSL.g:835:62: (iv_ruleAbstractComponentName= ruleAbstractComponentName EOF )
            // InternalMSL.g:836:2: iv_ruleAbstractComponentName= ruleAbstractComponentName EOF
            {
             newCompositeNode(grammarAccess.getAbstractComponentNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractComponentName=ruleAbstractComponentName();

            state._fsp--;

             current =iv_ruleAbstractComponentName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractComponentName"


    // $ANTLR start "ruleAbstractComponentName"
    // InternalMSL.g:842:1: ruleAbstractComponentName returns [EObject current=null] : ( (otherlv_0= RULE_FQN_COMPONENT ) ) ;
    public final EObject ruleAbstractComponentName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMSL.g:848:2: ( ( (otherlv_0= RULE_FQN_COMPONENT ) ) )
            // InternalMSL.g:849:2: ( (otherlv_0= RULE_FQN_COMPONENT ) )
            {
            // InternalMSL.g:849:2: ( (otherlv_0= RULE_FQN_COMPONENT ) )
            // InternalMSL.g:850:3: (otherlv_0= RULE_FQN_COMPONENT )
            {
            // InternalMSL.g:850:3: (otherlv_0= RULE_FQN_COMPONENT )
            // InternalMSL.g:851:4: otherlv_0= RULE_FQN_COMPONENT
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAbstractComponentNameRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_FQN_COMPONENT,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getAbstractComponentNameAccess().getTypeAbstractComponentCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractComponentName"


    // $ANTLR start "entryRuleSystemBinding"
    // InternalMSL.g:865:1: entryRuleSystemBinding returns [EObject current=null] : iv_ruleSystemBinding= ruleSystemBinding EOF ;
    public final EObject entryRuleSystemBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemBinding = null;


        try {
            // InternalMSL.g:865:54: (iv_ruleSystemBinding= ruleSystemBinding EOF )
            // InternalMSL.g:866:2: iv_ruleSystemBinding= ruleSystemBinding EOF
            {
             newCompositeNode(grammarAccess.getSystemBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemBinding=ruleSystemBinding();

            state._fsp--;

             current =iv_ruleSystemBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemBinding"


    // $ANTLR start "ruleSystemBinding"
    // InternalMSL.g:872:1: ruleSystemBinding returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) ) ;
    public final EObject ruleSystemBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMSL.g:878:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) ) )
            // InternalMSL.g:879:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) )
            {
            // InternalMSL.g:879:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:880:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemBindingAccess().getSystemKeyword_0());
            		
            // InternalMSL.g:884:3: ( (lv_name_1_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:885:4: (lv_name_1_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:885:4: (lv_name_1_0= RULE_PATTERN_ID )
            // InternalMSL.g:886:5: lv_name_1_0= RULE_PATTERN_ID
            {
            lv_name_1_0=(Token)match(input,RULE_PATTERN_ID,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemBindingAccess().getNamePATTERN_IDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.msl.MSL.PATTERN_ID");
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemBindingAccess().getColonKeyword_2());
            		
            // InternalMSL.g:906:3: ( (otherlv_3= RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:907:4: (otherlv_3= RULE_FQN_PATTERN_ID )
            {
            // InternalMSL.g:907:4: (otherlv_3= RULE_FQN_PATTERN_ID )
            // InternalMSL.g:908:5: otherlv_3= RULE_FQN_PATTERN_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemBindingRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_FQN_PATTERN_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getSystemBindingAccess().getAbsSysAbstractSystemCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemBinding"


    // $ANTLR start "entryRuleGroupBinding"
    // InternalMSL.g:923:1: entryRuleGroupBinding returns [EObject current=null] : iv_ruleGroupBinding= ruleGroupBinding EOF ;
    public final EObject entryRuleGroupBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupBinding = null;


        try {
            // InternalMSL.g:923:53: (iv_ruleGroupBinding= ruleGroupBinding EOF )
            // InternalMSL.g:924:2: iv_ruleGroupBinding= ruleGroupBinding EOF
            {
             newCompositeNode(grammarAccess.getGroupBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupBinding=ruleGroupBinding();

            state._fsp--;

             current =iv_ruleGroupBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupBinding"


    // $ANTLR start "ruleGroupBinding"
    // InternalMSL.g:930:1: ruleGroupBinding returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) ) ;
    public final EObject ruleGroupBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMSL.g:936:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) ) )
            // InternalMSL.g:937:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) )
            {
            // InternalMSL.g:937:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:938:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupBindingAccess().getGroupKeyword_0());
            		
            // InternalMSL.g:942:3: ( (lv_name_1_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:943:4: (lv_name_1_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:943:4: (lv_name_1_0= RULE_PATTERN_ID )
            // InternalMSL.g:944:5: lv_name_1_0= RULE_PATTERN_ID
            {
            lv_name_1_0=(Token)match(input,RULE_PATTERN_ID,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGroupBindingAccess().getNamePATTERN_IDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.msl.MSL.PATTERN_ID");
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupBindingAccess().getColonKeyword_2());
            		
            // InternalMSL.g:964:3: ( (otherlv_3= RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:965:4: (otherlv_3= RULE_FQN_PATTERN_ID )
            {
            // InternalMSL.g:965:4: (otherlv_3= RULE_FQN_PATTERN_ID )
            // InternalMSL.g:966:5: otherlv_3= RULE_FQN_PATTERN_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupBindingRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_FQN_PATTERN_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getGroupBindingAccess().getAbsGroupAbstractGroupCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupBinding"


    // $ANTLR start "entryRulePattern"
    // InternalMSL.g:981:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalMSL.g:981:48: (iv_rulePattern= rulePattern EOF )
            // InternalMSL.g:982:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalMSL.g:988:1: rulePattern returns [EObject current=null] : (otherlv_0= 'concrete' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= 'concretizationOf' ( (otherlv_4= RULE_PATTERN_ID ) ) otherlv_5= '{' ( (lv_managedSystems_6_0= ruleSystemBinding ) )* ( (lv_groups_7_0= ruleGroupBinding ) )* otherlv_8= '}' ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_managedSystems_6_0 = null;

        EObject lv_groups_7_0 = null;



        	enterRule();

        try {
            // InternalMSL.g:994:2: ( (otherlv_0= 'concrete' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= 'concretizationOf' ( (otherlv_4= RULE_PATTERN_ID ) ) otherlv_5= '{' ( (lv_managedSystems_6_0= ruleSystemBinding ) )* ( (lv_groups_7_0= ruleGroupBinding ) )* otherlv_8= '}' ) )
            // InternalMSL.g:995:2: (otherlv_0= 'concrete' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= 'concretizationOf' ( (otherlv_4= RULE_PATTERN_ID ) ) otherlv_5= '{' ( (lv_managedSystems_6_0= ruleSystemBinding ) )* ( (lv_groups_7_0= ruleGroupBinding ) )* otherlv_8= '}' )
            {
            // InternalMSL.g:995:2: (otherlv_0= 'concrete' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= 'concretizationOf' ( (otherlv_4= RULE_PATTERN_ID ) ) otherlv_5= '{' ( (lv_managedSystems_6_0= ruleSystemBinding ) )* ( (lv_groups_7_0= ruleGroupBinding ) )* otherlv_8= '}' )
            // InternalMSL.g:996:3: otherlv_0= 'concrete' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= 'concretizationOf' ( (otherlv_4= RULE_PATTERN_ID ) ) otherlv_5= '{' ( (lv_managedSystems_6_0= ruleSystemBinding ) )* ( (lv_groups_7_0= ruleGroupBinding ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getConcreteKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getPatternKeyword_1());
            		
            // InternalMSL.g:1004:3: ( (lv_name_2_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:1005:4: (lv_name_2_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:1005:4: (lv_name_2_0= RULE_PATTERN_ID )
            // InternalMSL.g:1006:5: lv_name_2_0= RULE_PATTERN_ID
            {
            lv_name_2_0=(Token)match(input,RULE_PATTERN_ID,FOLLOW_28); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPatternAccess().getNamePATTERN_IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.msl.MSL.PATTERN_ID");
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getConcretizationOfKeyword_3());
            		
            // InternalMSL.g:1026:3: ( (otherlv_4= RULE_PATTERN_ID ) )
            // InternalMSL.g:1027:4: (otherlv_4= RULE_PATTERN_ID )
            {
            // InternalMSL.g:1027:4: (otherlv_4= RULE_PATTERN_ID )
            // InternalMSL.g:1028:5: otherlv_4= RULE_PATTERN_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_PATTERN_ID,FOLLOW_7); 

            					newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getAbsPatternAbstractPatternCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_29); 

            			newLeafNode(otherlv_5, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMSL.g:1043:3: ( (lv_managedSystems_6_0= ruleSystemBinding ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMSL.g:1044:4: (lv_managedSystems_6_0= ruleSystemBinding )
            	    {
            	    // InternalMSL.g:1044:4: (lv_managedSystems_6_0= ruleSystemBinding )
            	    // InternalMSL.g:1045:5: lv_managedSystems_6_0= ruleSystemBinding
            	    {

            	    					newCompositeNode(grammarAccess.getPatternAccess().getManagedSystemsSystemBindingParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_managedSystems_6_0=ruleSystemBinding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPatternRule());
            	    					}
            	    					add(
            	    						current,
            	    						"managedSystems",
            	    						lv_managedSystems_6_0,
            	    						"org.xtext.msl.MSL.SystemBinding");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalMSL.g:1062:3: ( (lv_groups_7_0= ruleGroupBinding ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMSL.g:1063:4: (lv_groups_7_0= ruleGroupBinding )
            	    {
            	    // InternalMSL.g:1063:4: (lv_groups_7_0= ruleGroupBinding )
            	    // InternalMSL.g:1064:5: lv_groups_7_0= ruleGroupBinding
            	    {

            	    					newCompositeNode(grammarAccess.getPatternAccess().getGroupsGroupBindingParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_groups_7_0=ruleGroupBinding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPatternRule());
            	    					}
            	    					add(
            	    						current,
            	    						"groups",
            	    						lv_groups_7_0,
            	    						"org.xtext.msl.MSL.GroupBinding");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleConfiguration"
    // InternalMSL.g:1089:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalMSL.g:1089:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalMSL.g:1090:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalMSL.g:1096:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= 'instanceOf' ( ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )* ) otherlv_6= '{' ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )* ( (lv_concreteGroups_8_0= ruleConcreteGroup ) )* ( (lv_concreteInteractions_9_0= ruleInteraction ) )* otherlv_10= '}' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        EObject lv_concreteSystems_7_0 = null;

        EObject lv_concreteGroups_8_0 = null;

        EObject lv_concreteInteractions_9_0 = null;



        	enterRule();

        try {
            // InternalMSL.g:1102:2: ( (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= 'instanceOf' ( ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )* ) otherlv_6= '{' ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )* ( (lv_concreteGroups_8_0= ruleConcreteGroup ) )* ( (lv_concreteInteractions_9_0= ruleInteraction ) )* otherlv_10= '}' ) )
            // InternalMSL.g:1103:2: (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= 'instanceOf' ( ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )* ) otherlv_6= '{' ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )* ( (lv_concreteGroups_8_0= ruleConcreteGroup ) )* ( (lv_concreteInteractions_9_0= ruleInteraction ) )* otherlv_10= '}' )
            {
            // InternalMSL.g:1103:2: (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= 'instanceOf' ( ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )* ) otherlv_6= '{' ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )* ( (lv_concreteGroups_8_0= ruleConcreteGroup ) )* ( (lv_concreteInteractions_9_0= ruleInteraction ) )* otherlv_10= '}' )
            // InternalMSL.g:1104:3: otherlv_0= 'configuration' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= 'instanceOf' ( ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )* ) otherlv_6= '{' ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )* ( (lv_concreteGroups_8_0= ruleConcreteGroup ) )* ( (lv_concreteInteractions_9_0= ruleInteraction ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigurationKeyword_0());
            		
            // InternalMSL.g:1108:3: ( (lv_name_1_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:1109:4: (lv_name_1_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:1109:4: (lv_name_1_0= RULE_PATTERN_ID )
            // InternalMSL.g:1110:5: lv_name_1_0= RULE_PATTERN_ID
            {
            lv_name_1_0=(Token)match(input,RULE_PATTERN_ID,FOLLOW_31); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConfigurationAccess().getNamePATTERN_IDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.msl.MSL.PATTERN_ID");
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getInstanceOfKeyword_2());
            		
            // InternalMSL.g:1130:3: ( ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )* )
            // InternalMSL.g:1131:4: ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )*
            {
            // InternalMSL.g:1131:4: ( (otherlv_3= RULE_PATTERN_ID ) )
            // InternalMSL.g:1132:5: (otherlv_3= RULE_PATTERN_ID )
            {
            // InternalMSL.g:1132:5: (otherlv_3= RULE_PATTERN_ID )
            // InternalMSL.g:1133:6: otherlv_3= RULE_PATTERN_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getConfigurationRule());
            						}
            					
            otherlv_3=(Token)match(input,RULE_PATTERN_ID,FOLLOW_32); 

            						newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getPatternPatternCrossReference_3_0_0());
            					

            }


            }

            // InternalMSL.g:1144:4: (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMSL.g:1145:5: otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_5); 

            	    					newLeafNode(otherlv_4, grammarAccess.getConfigurationAccess().getCommaKeyword_3_1_0());
            	    				
            	    // InternalMSL.g:1149:5: ( (otherlv_5= RULE_PATTERN_ID ) )
            	    // InternalMSL.g:1150:6: (otherlv_5= RULE_PATTERN_ID )
            	    {
            	    // InternalMSL.g:1150:6: (otherlv_5= RULE_PATTERN_ID )
            	    // InternalMSL.g:1151:7: otherlv_5= RULE_PATTERN_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getConfigurationRule());
            	    							}
            	    						
            	    otherlv_5=(Token)match(input,RULE_PATTERN_ID,FOLLOW_32); 

            	    							newLeafNode(otherlv_5, grammarAccess.getConfigurationAccess().getPatternPatternCrossReference_3_1_1_0());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,21,FOLLOW_33); 

            			newLeafNode(otherlv_6, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMSL.g:1168:3: ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // InternalMSL.g:1169:4: (lv_concreteSystems_7_0= ruleConcreteSystem )
            	    {
            	    // InternalMSL.g:1169:4: (lv_concreteSystems_7_0= ruleConcreteSystem )
            	    // InternalMSL.g:1170:5: lv_concreteSystems_7_0= ruleConcreteSystem
            	    {

            	    					newCompositeNode(grammarAccess.getConfigurationAccess().getConcreteSystemsConcreteSystemParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_concreteSystems_7_0=ruleConcreteSystem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"concreteSystems",
            	    						lv_concreteSystems_7_0,
            	    						"org.xtext.msl.MSL.ConcreteSystem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalMSL.g:1187:3: ( (lv_concreteGroups_8_0= ruleConcreteGroup ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_INSTANCE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMSL.g:1188:4: (lv_concreteGroups_8_0= ruleConcreteGroup )
            	    {
            	    // InternalMSL.g:1188:4: (lv_concreteGroups_8_0= ruleConcreteGroup )
            	    // InternalMSL.g:1189:5: lv_concreteGroups_8_0= ruleConcreteGroup
            	    {

            	    					newCompositeNode(grammarAccess.getConfigurationAccess().getConcreteGroupsConcreteGroupParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_concreteGroups_8_0=ruleConcreteGroup();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"concreteGroups",
            	    						lv_concreteGroups_8_0,
            	    						"org.xtext.msl.MSL.ConcreteGroup");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalMSL.g:1206:3: ( (lv_concreteInteractions_9_0= ruleInteraction ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_FQN_INSTANCE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMSL.g:1207:4: (lv_concreteInteractions_9_0= ruleInteraction )
            	    {
            	    // InternalMSL.g:1207:4: (lv_concreteInteractions_9_0= ruleInteraction )
            	    // InternalMSL.g:1208:5: lv_concreteInteractions_9_0= ruleInteraction
            	    {

            	    					newCompositeNode(grammarAccess.getConfigurationAccess().getConcreteInteractionsInteractionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_concreteInteractions_9_0=ruleInteraction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"concreteInteractions",
            	    						lv_concreteInteractions_9_0,
            	    						"org.xtext.msl.MSL.Interaction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleConcreteSystem"
    // InternalMSL.g:1233:1: entryRuleConcreteSystem returns [EObject current=null] : iv_ruleConcreteSystem= ruleConcreteSystem EOF ;
    public final EObject entryRuleConcreteSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteSystem = null;


        try {
            // InternalMSL.g:1233:55: (iv_ruleConcreteSystem= ruleConcreteSystem EOF )
            // InternalMSL.g:1234:2: iv_ruleConcreteSystem= ruleConcreteSystem EOF
            {
             newCompositeNode(grammarAccess.getConcreteSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcreteSystem=ruleConcreteSystem();

            state._fsp--;

             current =iv_ruleConcreteSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcreteSystem"


    // $ANTLR start "ruleConcreteSystem"
    // InternalMSL.g:1240:1: ruleConcreteSystem returns [EObject current=null] : ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) ) ;
    public final EObject ruleConcreteSystem() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMSL.g:1246:2: ( ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) ) )
            // InternalMSL.g:1247:2: ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) )
            {
            // InternalMSL.g:1247:2: ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) )
            // InternalMSL.g:1248:3: ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* )
            {
            // InternalMSL.g:1248:3: ( (lv_name_0_0= RULE_INSTANCE_ID ) )
            // InternalMSL.g:1249:4: (lv_name_0_0= RULE_INSTANCE_ID )
            {
            // InternalMSL.g:1249:4: (lv_name_0_0= RULE_INSTANCE_ID )
            // InternalMSL.g:1250:5: lv_name_0_0= RULE_INSTANCE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_INSTANCE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConcreteSystemAccess().getNameINSTANCE_IDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConcreteSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.msl.MSL.INSTANCE_ID");
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getConcreteSystemAccess().getColonKeyword_1());
            		
            // InternalMSL.g:1270:3: ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* )
            // InternalMSL.g:1271:4: ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )*
            {
            // InternalMSL.g:1271:4: ( (otherlv_2= RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:1272:5: (otherlv_2= RULE_FQN_PATTERN_ID )
            {
            // InternalMSL.g:1272:5: (otherlv_2= RULE_FQN_PATTERN_ID )
            // InternalMSL.g:1273:6: otherlv_2= RULE_FQN_PATTERN_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getConcreteSystemRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_FQN_PATTERN_ID,FOLLOW_35); 

            						newLeafNode(otherlv_2, grammarAccess.getConcreteSystemAccess().getBindingsSystemBindingCrossReference_2_0_0());
            					

            }


            }

            // InternalMSL.g:1284:4: (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMSL.g:1285:5: otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_27); 

            	    					newLeafNode(otherlv_3, grammarAccess.getConcreteSystemAccess().getCommaKeyword_2_1_0());
            	    				
            	    // InternalMSL.g:1289:5: ( (otherlv_4= RULE_FQN_PATTERN_ID ) )
            	    // InternalMSL.g:1290:6: (otherlv_4= RULE_FQN_PATTERN_ID )
            	    {
            	    // InternalMSL.g:1290:6: (otherlv_4= RULE_FQN_PATTERN_ID )
            	    // InternalMSL.g:1291:7: otherlv_4= RULE_FQN_PATTERN_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getConcreteSystemRule());
            	    							}
            	    						
            	    otherlv_4=(Token)match(input,RULE_FQN_PATTERN_ID,FOLLOW_35); 

            	    							newLeafNode(otherlv_4, grammarAccess.getConcreteSystemAccess().getBindingsSystemBindingCrossReference_2_1_1_0());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcreteSystem"


    // $ANTLR start "entryRuleConcreteGroup"
    // InternalMSL.g:1308:1: entryRuleConcreteGroup returns [EObject current=null] : iv_ruleConcreteGroup= ruleConcreteGroup EOF ;
    public final EObject entryRuleConcreteGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteGroup = null;


        try {
            // InternalMSL.g:1308:54: (iv_ruleConcreteGroup= ruleConcreteGroup EOF )
            // InternalMSL.g:1309:2: iv_ruleConcreteGroup= ruleConcreteGroup EOF
            {
             newCompositeNode(grammarAccess.getConcreteGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcreteGroup=ruleConcreteGroup();

            state._fsp--;

             current =iv_ruleConcreteGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcreteGroup"


    // $ANTLR start "ruleConcreteGroup"
    // InternalMSL.g:1315:1: ruleConcreteGroup returns [EObject current=null] : ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) otherlv_5= '{' (otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) ) )? (otherlv_8= 'managedGrp' ( (otherlv_9= RULE_INSTANCE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_INSTANCE_ID ) ) )* )? otherlv_12= 'components' ( (lv_components_13_0= ruleComponentInstance ) ) (otherlv_14= ',' ( (lv_components_15_0= ruleComponentInstance ) ) )* otherlv_16= '}' ) ;
    public final EObject ruleConcreteGroup() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_components_13_0 = null;

        EObject lv_components_15_0 = null;



        	enterRule();

        try {
            // InternalMSL.g:1321:2: ( ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) otherlv_5= '{' (otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) ) )? (otherlv_8= 'managedGrp' ( (otherlv_9= RULE_INSTANCE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_INSTANCE_ID ) ) )* )? otherlv_12= 'components' ( (lv_components_13_0= ruleComponentInstance ) ) (otherlv_14= ',' ( (lv_components_15_0= ruleComponentInstance ) ) )* otherlv_16= '}' ) )
            // InternalMSL.g:1322:2: ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) otherlv_5= '{' (otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) ) )? (otherlv_8= 'managedGrp' ( (otherlv_9= RULE_INSTANCE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_INSTANCE_ID ) ) )* )? otherlv_12= 'components' ( (lv_components_13_0= ruleComponentInstance ) ) (otherlv_14= ',' ( (lv_components_15_0= ruleComponentInstance ) ) )* otherlv_16= '}' )
            {
            // InternalMSL.g:1322:2: ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) otherlv_5= '{' (otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) ) )? (otherlv_8= 'managedGrp' ( (otherlv_9= RULE_INSTANCE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_INSTANCE_ID ) ) )* )? otherlv_12= 'components' ( (lv_components_13_0= ruleComponentInstance ) ) (otherlv_14= ',' ( (lv_components_15_0= ruleComponentInstance ) ) )* otherlv_16= '}' )
            // InternalMSL.g:1323:3: ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) otherlv_5= '{' (otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) ) )? (otherlv_8= 'managedGrp' ( (otherlv_9= RULE_INSTANCE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_INSTANCE_ID ) ) )* )? otherlv_12= 'components' ( (lv_components_13_0= ruleComponentInstance ) ) (otherlv_14= ',' ( (lv_components_15_0= ruleComponentInstance ) ) )* otherlv_16= '}'
            {
            // InternalMSL.g:1323:3: ( (lv_name_0_0= RULE_INSTANCE_ID ) )
            // InternalMSL.g:1324:4: (lv_name_0_0= RULE_INSTANCE_ID )
            {
            // InternalMSL.g:1324:4: (lv_name_0_0= RULE_INSTANCE_ID )
            // InternalMSL.g:1325:5: lv_name_0_0= RULE_INSTANCE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_INSTANCE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConcreteGroupAccess().getNameINSTANCE_IDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConcreteGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.msl.MSL.INSTANCE_ID");
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getConcreteGroupAccess().getColonKeyword_1());
            		
            // InternalMSL.g:1345:3: ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* )
            // InternalMSL.g:1346:4: ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )*
            {
            // InternalMSL.g:1346:4: ( (otherlv_2= RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:1347:5: (otherlv_2= RULE_FQN_PATTERN_ID )
            {
            // InternalMSL.g:1347:5: (otherlv_2= RULE_FQN_PATTERN_ID )
            // InternalMSL.g:1348:6: otherlv_2= RULE_FQN_PATTERN_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getConcreteGroupRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_FQN_PATTERN_ID,FOLLOW_32); 

            						newLeafNode(otherlv_2, grammarAccess.getConcreteGroupAccess().getAbstractGroupsGroupBindingCrossReference_2_0_0());
            					

            }


            }

            // InternalMSL.g:1359:4: (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==29) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMSL.g:1360:5: otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_27); 

            	    					newLeafNode(otherlv_3, grammarAccess.getConcreteGroupAccess().getCommaKeyword_2_1_0());
            	    				
            	    // InternalMSL.g:1364:5: ( (otherlv_4= RULE_FQN_PATTERN_ID ) )
            	    // InternalMSL.g:1365:6: (otherlv_4= RULE_FQN_PATTERN_ID )
            	    {
            	    // InternalMSL.g:1365:6: (otherlv_4= RULE_FQN_PATTERN_ID )
            	    // InternalMSL.g:1366:7: otherlv_4= RULE_FQN_PATTERN_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getConcreteGroupRule());
            	    							}
            	    						
            	    otherlv_4=(Token)match(input,RULE_FQN_PATTERN_ID,FOLLOW_32); 

            	    							newLeafNode(otherlv_4, grammarAccess.getConcreteGroupAccess().getAbstractGroupsGroupBindingCrossReference_2_1_1_0());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            otherlv_5=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getConcreteGroupAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMSL.g:1383:3: (otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMSL.g:1384:4: otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getConcreteGroupAccess().getManagedSySKeyword_4_0());
                    			
                    // InternalMSL.g:1388:4: ( (otherlv_7= RULE_INSTANCE_ID ) )
                    // InternalMSL.g:1389:5: (otherlv_7= RULE_INSTANCE_ID )
                    {
                    // InternalMSL.g:1389:5: (otherlv_7= RULE_INSTANCE_ID )
                    // InternalMSL.g:1390:6: otherlv_7= RULE_INSTANCE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConcreteGroupRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_INSTANCE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_7, grammarAccess.getConcreteGroupAccess().getManSysConcreteSystemCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMSL.g:1402:3: (otherlv_8= 'managedGrp' ( (otherlv_9= RULE_INSTANCE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_INSTANCE_ID ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMSL.g:1403:4: otherlv_8= 'managedGrp' ( (otherlv_9= RULE_INSTANCE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_INSTANCE_ID ) ) )*
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getConcreteGroupAccess().getManagedGrpKeyword_5_0());
                    			
                    // InternalMSL.g:1407:4: ( (otherlv_9= RULE_INSTANCE_ID ) )
                    // InternalMSL.g:1408:5: (otherlv_9= RULE_INSTANCE_ID )
                    {
                    // InternalMSL.g:1408:5: (otherlv_9= RULE_INSTANCE_ID )
                    // InternalMSL.g:1409:6: otherlv_9= RULE_INSTANCE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConcreteGroupRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_INSTANCE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_9, grammarAccess.getConcreteGroupAccess().getManGrpConcreteGroupCrossReference_5_1_0());
                    					

                    }


                    }

                    // InternalMSL.g:1420:4: (otherlv_10= ',' ( (otherlv_11= RULE_INSTANCE_ID ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==29) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalMSL.g:1421:5: otherlv_10= ',' ( (otherlv_11= RULE_INSTANCE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,29,FOLLOW_15); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getConcreteGroupAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMSL.g:1425:5: ( (otherlv_11= RULE_INSTANCE_ID ) )
                    	    // InternalMSL.g:1426:6: (otherlv_11= RULE_INSTANCE_ID )
                    	    {
                    	    // InternalMSL.g:1426:6: (otherlv_11= RULE_INSTANCE_ID )
                    	    // InternalMSL.g:1427:7: otherlv_11= RULE_INSTANCE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getConcreteGroupRule());
                    	    							}
                    	    						
                    	    otherlv_11=(Token)match(input,RULE_INSTANCE_ID,FOLLOW_20); 

                    	    							newLeafNode(otherlv_11, grammarAccess.getConcreteGroupAccess().getManGrpConcreteGroupCrossReference_5_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_12, grammarAccess.getConcreteGroupAccess().getComponentsKeyword_6());
            		
            // InternalMSL.g:1444:3: ( (lv_components_13_0= ruleComponentInstance ) )
            // InternalMSL.g:1445:4: (lv_components_13_0= ruleComponentInstance )
            {
            // InternalMSL.g:1445:4: (lv_components_13_0= ruleComponentInstance )
            // InternalMSL.g:1446:5: lv_components_13_0= ruleComponentInstance
            {

            					newCompositeNode(grammarAccess.getConcreteGroupAccess().getComponentsComponentInstanceParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_22);
            lv_components_13_0=ruleComponentInstance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConcreteGroupRule());
            					}
            					add(
            						current,
            						"components",
            						lv_components_13_0,
            						"org.xtext.msl.MSL.ComponentInstance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSL.g:1463:3: (otherlv_14= ',' ( (lv_components_15_0= ruleComponentInstance ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==29) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMSL.g:1464:4: otherlv_14= ',' ( (lv_components_15_0= ruleComponentInstance ) )
            	    {
            	    otherlv_14=(Token)match(input,29,FOLLOW_15); 

            	    				newLeafNode(otherlv_14, grammarAccess.getConcreteGroupAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalMSL.g:1468:4: ( (lv_components_15_0= ruleComponentInstance ) )
            	    // InternalMSL.g:1469:5: (lv_components_15_0= ruleComponentInstance )
            	    {
            	    // InternalMSL.g:1469:5: (lv_components_15_0= ruleComponentInstance )
            	    // InternalMSL.g:1470:6: lv_components_15_0= ruleComponentInstance
            	    {

            	    						newCompositeNode(grammarAccess.getConcreteGroupAccess().getComponentsComponentInstanceParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_components_15_0=ruleComponentInstance();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConcreteGroupRule());
            	    						}
            	    						add(
            	    							current,
            	    							"components",
            	    							lv_components_15_0,
            	    							"org.xtext.msl.MSL.ComponentInstance");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_16=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getConcreteGroupAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcreteGroup"


    // $ANTLR start "entryRuleComponentInstance"
    // InternalMSL.g:1496:1: entryRuleComponentInstance returns [EObject current=null] : iv_ruleComponentInstance= ruleComponentInstance EOF ;
    public final EObject entryRuleComponentInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInstance = null;


        try {
            // InternalMSL.g:1496:58: (iv_ruleComponentInstance= ruleComponentInstance EOF )
            // InternalMSL.g:1497:2: iv_ruleComponentInstance= ruleComponentInstance EOF
            {
             newCompositeNode(grammarAccess.getComponentInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentInstance=ruleComponentInstance();

            state._fsp--;

             current =iv_ruleComponentInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentInstance"


    // $ANTLR start "ruleComponentInstance"
    // InternalMSL.g:1503:1: ruleComponentInstance returns [EObject current=null] : ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_COMPONENT_TYPE ) ) ) ;
    public final EObject ruleComponentInstance() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalMSL.g:1509:2: ( ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_COMPONENT_TYPE ) ) ) )
            // InternalMSL.g:1510:2: ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_COMPONENT_TYPE ) ) )
            {
            // InternalMSL.g:1510:2: ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_COMPONENT_TYPE ) ) )
            // InternalMSL.g:1511:3: ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_COMPONENT_TYPE ) )
            {
            // InternalMSL.g:1511:3: ( (lv_name_0_0= RULE_INSTANCE_ID ) )
            // InternalMSL.g:1512:4: (lv_name_0_0= RULE_INSTANCE_ID )
            {
            // InternalMSL.g:1512:4: (lv_name_0_0= RULE_INSTANCE_ID )
            // InternalMSL.g:1513:5: lv_name_0_0= RULE_INSTANCE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_INSTANCE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_0_0, grammarAccess.getComponentInstanceAccess().getNameINSTANCE_IDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.msl.MSL.INSTANCE_ID");
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentInstanceAccess().getColonKeyword_1());
            		
            // InternalMSL.g:1533:3: ( (lv_type_2_0= RULE_COMPONENT_TYPE ) )
            // InternalMSL.g:1534:4: (lv_type_2_0= RULE_COMPONENT_TYPE )
            {
            // InternalMSL.g:1534:4: (lv_type_2_0= RULE_COMPONENT_TYPE )
            // InternalMSL.g:1535:5: lv_type_2_0= RULE_COMPONENT_TYPE
            {
            lv_type_2_0=(Token)match(input,RULE_COMPONENT_TYPE,FOLLOW_2); 

            					newLeafNode(lv_type_2_0, grammarAccess.getComponentInstanceAccess().getTypeCOMPONENT_TYPETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.msl.MSL.COMPONENT_TYPE");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentInstance"


    // $ANTLR start "entryRuleInteraction"
    // InternalMSL.g:1555:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalMSL.g:1555:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalMSL.g:1556:2: iv_ruleInteraction= ruleInteraction EOF
            {
             newCompositeNode(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;

             current =iv_ruleInteraction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalMSL.g:1562:1: ruleInteraction returns [EObject current=null] : ( ( (lv_start_0_0= ruleComponentName ) ) otherlv_1= '->' ( (lv_end_2_0= ruleComponentName ) ) ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_start_0_0 = null;

        EObject lv_end_2_0 = null;



        	enterRule();

        try {
            // InternalMSL.g:1568:2: ( ( ( (lv_start_0_0= ruleComponentName ) ) otherlv_1= '->' ( (lv_end_2_0= ruleComponentName ) ) ) )
            // InternalMSL.g:1569:2: ( ( (lv_start_0_0= ruleComponentName ) ) otherlv_1= '->' ( (lv_end_2_0= ruleComponentName ) ) )
            {
            // InternalMSL.g:1569:2: ( ( (lv_start_0_0= ruleComponentName ) ) otherlv_1= '->' ( (lv_end_2_0= ruleComponentName ) ) )
            // InternalMSL.g:1570:3: ( (lv_start_0_0= ruleComponentName ) ) otherlv_1= '->' ( (lv_end_2_0= ruleComponentName ) )
            {
            // InternalMSL.g:1570:3: ( (lv_start_0_0= ruleComponentName ) )
            // InternalMSL.g:1571:4: (lv_start_0_0= ruleComponentName )
            {
            // InternalMSL.g:1571:4: (lv_start_0_0= ruleComponentName )
            // InternalMSL.g:1572:5: lv_start_0_0= ruleComponentName
            {

            					newCompositeNode(grammarAccess.getInteractionAccess().getStartComponentNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_start_0_0=ruleComponentName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInteractionRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_0_0,
            						"org.xtext.msl.MSL.ComponentName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getInteractionAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalMSL.g:1593:3: ( (lv_end_2_0= ruleComponentName ) )
            // InternalMSL.g:1594:4: (lv_end_2_0= ruleComponentName )
            {
            // InternalMSL.g:1594:4: (lv_end_2_0= ruleComponentName )
            // InternalMSL.g:1595:5: lv_end_2_0= ruleComponentName
            {

            					newCompositeNode(grammarAccess.getInteractionAccess().getEndComponentNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_end_2_0=ruleComponentName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInteractionRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_2_0,
            						"org.xtext.msl.MSL.ComponentName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleComponentName"
    // InternalMSL.g:1616:1: entryRuleComponentName returns [EObject current=null] : iv_ruleComponentName= ruleComponentName EOF ;
    public final EObject entryRuleComponentName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentName = null;


        try {
            // InternalMSL.g:1616:54: (iv_ruleComponentName= ruleComponentName EOF )
            // InternalMSL.g:1617:2: iv_ruleComponentName= ruleComponentName EOF
            {
             newCompositeNode(grammarAccess.getComponentNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentName=ruleComponentName();

            state._fsp--;

             current =iv_ruleComponentName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentName"


    // $ANTLR start "ruleComponentName"
    // InternalMSL.g:1623:1: ruleComponentName returns [EObject current=null] : ( (otherlv_0= RULE_FQN_INSTANCE_ID ) ) ;
    public final EObject ruleComponentName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMSL.g:1629:2: ( ( (otherlv_0= RULE_FQN_INSTANCE_ID ) ) )
            // InternalMSL.g:1630:2: ( (otherlv_0= RULE_FQN_INSTANCE_ID ) )
            {
            // InternalMSL.g:1630:2: ( (otherlv_0= RULE_FQN_INSTANCE_ID ) )
            // InternalMSL.g:1631:3: (otherlv_0= RULE_FQN_INSTANCE_ID )
            {
            // InternalMSL.g:1631:3: (otherlv_0= RULE_FQN_INSTANCE_ID )
            // InternalMSL.g:1632:4: otherlv_0= RULE_FQN_INSTANCE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getComponentNameRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_FQN_INSTANCE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getComponentNameAccess().getComponentComponentInstanceCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentName"

    // Delegated rules


    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\7\1\42\1\uffff\1\11\1\7\1\11\1\uffff\1\7";
    static final String dfa_3s = "\1\26\1\42\1\uffff\1\11\1\35\1\11\1\uffff\1\35";
    static final String dfa_4s = "\2\uffff\1\2\3\uffff\1\1\1\uffff";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2\13\uffff\1\2",
            "\1\3",
            "",
            "\1\4",
            "\1\6\2\uffff\1\6\12\uffff\1\2\1\6\6\uffff\1\5",
            "\1\7",
            "",
            "\1\6\2\uffff\1\6\12\uffff\1\2\1\6\6\uffff\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 1168:3: ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000028000C0002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000108C00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000108400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000D0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000C1000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008C00000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000400480L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000400400L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000400L});

}