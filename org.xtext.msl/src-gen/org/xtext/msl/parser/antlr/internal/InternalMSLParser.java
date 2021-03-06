package org.xtext.msl.parser.antlr.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.xtext.msl.services.MSLGrammarAccess;



import org.antlr.runtime.*;

@SuppressWarnings("all")
public class InternalMSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PATTERN_ID", "RULE_COMPONENT_TYPE", "RULE_MULTIPLICITY", "RULE_FQN_COMPONENT", "RULE_FQN_PATTERN_ID", "RULE_INSTANCE_ID", "RULE_DECIMAL", "RULE_FQN_INSTANCE_ID", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'abstract'", "'pattern'", "'{'", "'}'", "'system'", "'['", "']'", "'group'", "'managedSyS'", "','", "'managedGrp'", "'components'", "'interaction'", "'->'", "':'", "'concrete'", "'concretizationOf'", "'configuration'", "'instanceOf'", "'='", "'s'", "'ms'", "'us'", "'ns'", "'min'", "'hrs'", "'dys'"
    };
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


        public InternalMSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    @Override
	public String[] getTokenNames() { return InternalMSLParser.tokenNames; }
    @Override
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
    // InternalMSL.g:65:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalMSL.g:65:54: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalMSL.g:66:2: iv_ruleSpecification= ruleSpecification EOF
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
    // InternalMSL.g:72:1: ruleSpecification returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_absPattern_1_0= ruleAbstractPattern ) )? ( (lv_pattern_2_0= rulePattern ) )* ( (lv_configuration_3_0= ruleConfiguration ) )? ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_absPattern_1_0 = null;

        EObject lv_pattern_2_0 = null;

        EObject lv_configuration_3_0 = null;



        	enterRule();

        try {
            // InternalMSL.g:78:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_absPattern_1_0= ruleAbstractPattern ) )? ( (lv_pattern_2_0= rulePattern ) )* ( (lv_configuration_3_0= ruleConfiguration ) )? ) )
            // InternalMSL.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_absPattern_1_0= ruleAbstractPattern ) )? ( (lv_pattern_2_0= rulePattern ) )* ( (lv_configuration_3_0= ruleConfiguration ) )? )
            {
            // InternalMSL.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_absPattern_1_0= ruleAbstractPattern ) )? ( (lv_pattern_2_0= rulePattern ) )* ( (lv_configuration_3_0= ruleConfiguration ) )? )
            // InternalMSL.g:80:3: ( (lv_imports_0_0= ruleImport ) )* ( (lv_absPattern_1_0= ruleAbstractPattern ) )? ( (lv_pattern_2_0= rulePattern ) )* ( (lv_configuration_3_0= ruleConfiguration ) )?
            {
            // InternalMSL.g:80:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMSL.g:81:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalMSL.g:81:4: (lv_imports_0_0= ruleImport )
            	    // InternalMSL.g:82:5: lv_imports_0_0= ruleImport
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

            // InternalMSL.g:99:3: ( (lv_absPattern_1_0= ruleAbstractPattern ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMSL.g:100:4: (lv_absPattern_1_0= ruleAbstractPattern )
                    {
                    // InternalMSL.g:100:4: (lv_absPattern_1_0= ruleAbstractPattern )
                    // InternalMSL.g:101:5: lv_absPattern_1_0= ruleAbstractPattern
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

            // InternalMSL.g:118:3: ( (lv_pattern_2_0= rulePattern ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==35) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMSL.g:119:4: (lv_pattern_2_0= rulePattern )
            	    {
            	    // InternalMSL.g:119:4: (lv_pattern_2_0= rulePattern )
            	    // InternalMSL.g:120:5: lv_pattern_2_0= rulePattern
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

            // InternalMSL.g:137:3: ( (lv_configuration_3_0= ruleConfiguration ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==37) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMSL.g:138:4: (lv_configuration_3_0= ruleConfiguration )
                    {
                    // InternalMSL.g:138:4: (lv_configuration_3_0= ruleConfiguration )
                    // InternalMSL.g:139:5: lv_configuration_3_0= ruleConfiguration
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
    // InternalMSL.g:160:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMSL.g:160:47: (iv_ruleImport= ruleImport EOF )
            // InternalMSL.g:161:2: iv_ruleImport= ruleImport EOF
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
    // InternalMSL.g:167:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (otherlv_1= RULE_PATTERN_ID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMSL.g:173:2: ( (otherlv_0= 'import' ( (otherlv_1= RULE_PATTERN_ID ) ) ) )
            // InternalMSL.g:174:2: (otherlv_0= 'import' ( (otherlv_1= RULE_PATTERN_ID ) ) )
            {
            // InternalMSL.g:174:2: (otherlv_0= 'import' ( (otherlv_1= RULE_PATTERN_ID ) ) )
            // InternalMSL.g:175:3: otherlv_0= 'import' ( (otherlv_1= RULE_PATTERN_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalMSL.g:179:3: ( (otherlv_1= RULE_PATTERN_ID ) )
            // InternalMSL.g:180:4: (otherlv_1= RULE_PATTERN_ID )
            {
            // InternalMSL.g:180:4: (otherlv_1= RULE_PATTERN_ID )
            // InternalMSL.g:181:5: otherlv_1= RULE_PATTERN_ID
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
    // InternalMSL.g:196:1: entryRuleAbstractPattern returns [EObject current=null] : iv_ruleAbstractPattern= ruleAbstractPattern EOF ;
    public final EObject entryRuleAbstractPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractPattern = null;


        try {
            // InternalMSL.g:196:56: (iv_ruleAbstractPattern= ruleAbstractPattern EOF )
            // InternalMSL.g:197:2: iv_ruleAbstractPattern= ruleAbstractPattern EOF
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
    // InternalMSL.g:203:1: ruleAbstractPattern returns [EObject current=null] : (otherlv_0= 'abstract' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= '{' ( (lv_managedSystems_4_0= ruleAbstractSystem ) )* ( (lv_abstractGroups_5_0= ruleAbstractGroup ) )* ( (lv_interactions_6_0= ruleAbstractInteraction ) )* otherlv_7= '}' ) ;
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
            // InternalMSL.g:209:2: ( (otherlv_0= 'abstract' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= '{' ( (lv_managedSystems_4_0= ruleAbstractSystem ) )* ( (lv_abstractGroups_5_0= ruleAbstractGroup ) )* ( (lv_interactions_6_0= ruleAbstractInteraction ) )* otherlv_7= '}' ) )
            // InternalMSL.g:210:2: (otherlv_0= 'abstract' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= '{' ( (lv_managedSystems_4_0= ruleAbstractSystem ) )* ( (lv_abstractGroups_5_0= ruleAbstractGroup ) )* ( (lv_interactions_6_0= ruleAbstractInteraction ) )* otherlv_7= '}' )
            {
            // InternalMSL.g:210:2: (otherlv_0= 'abstract' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= '{' ( (lv_managedSystems_4_0= ruleAbstractSystem ) )* ( (lv_abstractGroups_5_0= ruleAbstractGroup ) )* ( (lv_interactions_6_0= ruleAbstractInteraction ) )* otherlv_7= '}' )
            // InternalMSL.g:211:3: otherlv_0= 'abstract' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= '{' ( (lv_managedSystems_4_0= ruleAbstractSystem ) )* ( (lv_abstractGroups_5_0= ruleAbstractGroup ) )* ( (lv_interactions_6_0= ruleAbstractInteraction ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractPatternAccess().getAbstractKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAbstractPatternAccess().getPatternKeyword_1());
            		
            // InternalMSL.g:219:3: ( (lv_name_2_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:220:4: (lv_name_2_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:220:4: (lv_name_2_0= RULE_PATTERN_ID )
            // InternalMSL.g:221:5: lv_name_2_0= RULE_PATTERN_ID
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

            otherlv_3=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getAbstractPatternAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMSL.g:241:3: ( (lv_managedSystems_4_0= ruleAbstractSystem ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMSL.g:242:4: (lv_managedSystems_4_0= ruleAbstractSystem )
            	    {
            	    // InternalMSL.g:242:4: (lv_managedSystems_4_0= ruleAbstractSystem )
            	    // InternalMSL.g:243:5: lv_managedSystems_4_0= ruleAbstractSystem
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

            // InternalMSL.g:260:3: ( (lv_abstractGroups_5_0= ruleAbstractGroup ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMSL.g:261:4: (lv_abstractGroups_5_0= ruleAbstractGroup )
            	    {
            	    // InternalMSL.g:261:4: (lv_abstractGroups_5_0= ruleAbstractGroup )
            	    // InternalMSL.g:262:5: lv_abstractGroups_5_0= ruleAbstractGroup
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

            // InternalMSL.g:279:3: ( (lv_interactions_6_0= ruleAbstractInteraction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMSL.g:280:4: (lv_interactions_6_0= ruleAbstractInteraction )
            	    {
            	    // InternalMSL.g:280:4: (lv_interactions_6_0= ruleAbstractInteraction )
            	    // InternalMSL.g:281:5: lv_interactions_6_0= ruleAbstractInteraction
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

            otherlv_7=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMSL.g:306:1: entryRuleAbstractSystem returns [EObject current=null] : iv_ruleAbstractSystem= ruleAbstractSystem EOF ;
    public final EObject entryRuleAbstractSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSystem = null;


        try {
            // InternalMSL.g:306:55: (iv_ruleAbstractSystem= ruleAbstractSystem EOF )
            // InternalMSL.g:307:2: iv_ruleAbstractSystem= ruleAbstractSystem EOF
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
    // InternalMSL.g:313:1: ruleAbstractSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) ) ;
    public final EObject ruleAbstractSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMSL.g:319:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) ) )
            // InternalMSL.g:320:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) )
            {
            // InternalMSL.g:320:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) )
            // InternalMSL.g:321:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractSystemAccess().getSystemKeyword_0());
            		
            // InternalMSL.g:325:3: ( (lv_name_1_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:326:4: (lv_name_1_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:326:4: (lv_name_1_0= RULE_PATTERN_ID )
            // InternalMSL.g:327:5: lv_name_1_0= RULE_PATTERN_ID
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
    // InternalMSL.g:347:1: entryRuleAbstractComponent returns [EObject current=null] : iv_ruleAbstractComponent= ruleAbstractComponent EOF ;
    public final EObject entryRuleAbstractComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComponent = null;


        try {
            // InternalMSL.g:347:58: (iv_ruleAbstractComponent= ruleAbstractComponent EOF )
            // InternalMSL.g:348:2: iv_ruleAbstractComponent= ruleAbstractComponent EOF
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
    // InternalMSL.g:354:1: ruleAbstractComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_COMPONENT_TYPE ) ) ;
    public final EObject ruleAbstractComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMSL.g:360:2: ( ( (lv_name_0_0= RULE_COMPONENT_TYPE ) ) )
            // InternalMSL.g:361:2: ( (lv_name_0_0= RULE_COMPONENT_TYPE ) )
            {
            // InternalMSL.g:361:2: ( (lv_name_0_0= RULE_COMPONENT_TYPE ) )
            // InternalMSL.g:362:3: (lv_name_0_0= RULE_COMPONENT_TYPE )
            {
            // InternalMSL.g:362:3: (lv_name_0_0= RULE_COMPONENT_TYPE )
            // InternalMSL.g:363:4: lv_name_0_0= RULE_COMPONENT_TYPE
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
    // InternalMSL.g:382:1: entryRuleGroupDef returns [EObject current=null] : iv_ruleGroupDef= ruleGroupDef EOF ;
    public final EObject entryRuleGroupDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupDef = null;


        try {
            // InternalMSL.g:382:49: (iv_ruleGroupDef= ruleGroupDef EOF )
            // InternalMSL.g:383:2: iv_ruleGroupDef= ruleGroupDef EOF
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
    // InternalMSL.g:389:1: ruleGroupDef returns [EObject current=null] : ( ( (otherlv_0= RULE_PATTERN_ID ) ) (otherlv_1= '[' ( (lv_mult_2_0= RULE_MULTIPLICITY ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleGroupDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_mult_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMSL.g:395:2: ( ( ( (otherlv_0= RULE_PATTERN_ID ) ) (otherlv_1= '[' ( (lv_mult_2_0= RULE_MULTIPLICITY ) ) otherlv_3= ']' )? ) )
            // InternalMSL.g:396:2: ( ( (otherlv_0= RULE_PATTERN_ID ) ) (otherlv_1= '[' ( (lv_mult_2_0= RULE_MULTIPLICITY ) ) otherlv_3= ']' )? )
            {
            // InternalMSL.g:396:2: ( ( (otherlv_0= RULE_PATTERN_ID ) ) (otherlv_1= '[' ( (lv_mult_2_0= RULE_MULTIPLICITY ) ) otherlv_3= ']' )? )
            // InternalMSL.g:397:3: ( (otherlv_0= RULE_PATTERN_ID ) ) (otherlv_1= '[' ( (lv_mult_2_0= RULE_MULTIPLICITY ) ) otherlv_3= ']' )?
            {
            // InternalMSL.g:397:3: ( (otherlv_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:398:4: (otherlv_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:398:4: (otherlv_0= RULE_PATTERN_ID )
            // InternalMSL.g:399:5: otherlv_0= RULE_PATTERN_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupDefRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_PATTERN_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getGroupDefAccess().getGrpAbstractGroupCrossReference_0_0());
            				

            }


            }

            // InternalMSL.g:410:3: (otherlv_1= '[' ( (lv_mult_2_0= RULE_MULTIPLICITY ) ) otherlv_3= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMSL.g:411:4: otherlv_1= '[' ( (lv_mult_2_0= RULE_MULTIPLICITY ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getGroupDefAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalMSL.g:415:4: ( (lv_mult_2_0= RULE_MULTIPLICITY ) )
                    // InternalMSL.g:416:5: (lv_mult_2_0= RULE_MULTIPLICITY )
                    {
                    // InternalMSL.g:416:5: (lv_mult_2_0= RULE_MULTIPLICITY )
                    // InternalMSL.g:417:6: lv_mult_2_0= RULE_MULTIPLICITY
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

                    otherlv_3=(Token)match(input,26,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAbstractGroup"
    // InternalMSL.g:442:1: entryRuleAbstractGroup returns [EObject current=null] : iv_ruleAbstractGroup= ruleAbstractGroup EOF ;
    public final EObject entryRuleAbstractGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractGroup = null;


        try {
            // InternalMSL.g:442:54: (iv_ruleAbstractGroup= ruleAbstractGroup EOF )
            // InternalMSL.g:443:2: iv_ruleAbstractGroup= ruleAbstractGroup EOF
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
    // InternalMSL.g:449:1: ruleAbstractGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= '{' (otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_PATTERN_ID ) ) )* )? (otherlv_7= 'managedGrp' ( (lv_manGrp_8_0= ruleGroupDef ) ) (otherlv_9= ',' ( (lv_manGrp_10_0= ruleGroupDef ) ) )* )? otherlv_11= 'components' ( (lv_components_12_0= ruleAbstractComponent ) ) (otherlv_13= ',' ( (lv_components_14_0= ruleAbstractComponent ) ) )* otherlv_15= '}' ) ;
    public final EObject ruleAbstractGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_manGrp_8_0 = null;

        EObject lv_manGrp_10_0 = null;

        EObject lv_components_12_0 = null;

        EObject lv_components_14_0 = null;



        	enterRule();

        try {
            // InternalMSL.g:455:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= '{' (otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_PATTERN_ID ) ) )* )? (otherlv_7= 'managedGrp' ( (lv_manGrp_8_0= ruleGroupDef ) ) (otherlv_9= ',' ( (lv_manGrp_10_0= ruleGroupDef ) ) )* )? otherlv_11= 'components' ( (lv_components_12_0= ruleAbstractComponent ) ) (otherlv_13= ',' ( (lv_components_14_0= ruleAbstractComponent ) ) )* otherlv_15= '}' ) )
            // InternalMSL.g:456:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= '{' (otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_PATTERN_ID ) ) )* )? (otherlv_7= 'managedGrp' ( (lv_manGrp_8_0= ruleGroupDef ) ) (otherlv_9= ',' ( (lv_manGrp_10_0= ruleGroupDef ) ) )* )? otherlv_11= 'components' ( (lv_components_12_0= ruleAbstractComponent ) ) (otherlv_13= ',' ( (lv_components_14_0= ruleAbstractComponent ) ) )* otherlv_15= '}' )
            {
            // InternalMSL.g:456:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= '{' (otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_PATTERN_ID ) ) )* )? (otherlv_7= 'managedGrp' ( (lv_manGrp_8_0= ruleGroupDef ) ) (otherlv_9= ',' ( (lv_manGrp_10_0= ruleGroupDef ) ) )* )? otherlv_11= 'components' ( (lv_components_12_0= ruleAbstractComponent ) ) (otherlv_13= ',' ( (lv_components_14_0= ruleAbstractComponent ) ) )* otherlv_15= '}' )
            // InternalMSL.g:457:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= '{' (otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_PATTERN_ID ) ) )* )? (otherlv_7= 'managedGrp' ( (lv_manGrp_8_0= ruleGroupDef ) ) (otherlv_9= ',' ( (lv_manGrp_10_0= ruleGroupDef ) ) )* )? otherlv_11= 'components' ( (lv_components_12_0= ruleAbstractComponent ) ) (otherlv_13= ',' ( (lv_components_14_0= ruleAbstractComponent ) ) )* otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractGroupAccess().getGroupKeyword_0());
            		
            // InternalMSL.g:461:3: ( (lv_name_1_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:462:4: (lv_name_1_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:462:4: (lv_name_1_0= RULE_PATTERN_ID )
            // InternalMSL.g:463:5: lv_name_1_0= RULE_PATTERN_ID
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

            otherlv_2=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getAbstractGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMSL.g:483:3: (otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_PATTERN_ID ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMSL.g:484:4: otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_PATTERN_ID ) ) )*
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getAbstractGroupAccess().getManagedSySKeyword_3_0());
                    			
                    // InternalMSL.g:488:4: ( (otherlv_4= RULE_PATTERN_ID ) )
                    // InternalMSL.g:489:5: (otherlv_4= RULE_PATTERN_ID )
                    {
                    // InternalMSL.g:489:5: (otherlv_4= RULE_PATTERN_ID )
                    // InternalMSL.g:490:6: otherlv_4= RULE_PATTERN_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAbstractGroupRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_PATTERN_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_4, grammarAccess.getAbstractGroupAccess().getManSysAbstractSystemCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalMSL.g:501:4: (otherlv_5= ',' ( (otherlv_6= RULE_PATTERN_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==29) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMSL.g:502:5: otherlv_5= ',' ( (otherlv_6= RULE_PATTERN_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,29,FOLLOW_5); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAbstractGroupAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMSL.g:506:5: ( (otherlv_6= RULE_PATTERN_ID ) )
                    	    // InternalMSL.g:507:6: (otherlv_6= RULE_PATTERN_ID )
                    	    {
                    	    // InternalMSL.g:507:6: (otherlv_6= RULE_PATTERN_ID )
                    	    // InternalMSL.g:508:7: otherlv_6= RULE_PATTERN_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAbstractGroupRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_PATTERN_ID,FOLLOW_15); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getAbstractGroupAccess().getManSysAbstractSystemCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMSL.g:521:3: (otherlv_7= 'managedGrp' ( (lv_manGrp_8_0= ruleGroupDef ) ) (otherlv_9= ',' ( (lv_manGrp_10_0= ruleGroupDef ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMSL.g:522:4: otherlv_7= 'managedGrp' ( (lv_manGrp_8_0= ruleGroupDef ) ) (otherlv_9= ',' ( (lv_manGrp_10_0= ruleGroupDef ) ) )*
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getAbstractGroupAccess().getManagedGrpKeyword_4_0());
                    			
                    // InternalMSL.g:526:4: ( (lv_manGrp_8_0= ruleGroupDef ) )
                    // InternalMSL.g:527:5: (lv_manGrp_8_0= ruleGroupDef )
                    {
                    // InternalMSL.g:527:5: (lv_manGrp_8_0= ruleGroupDef )
                    // InternalMSL.g:528:6: lv_manGrp_8_0= ruleGroupDef
                    {

                    						newCompositeNode(grammarAccess.getAbstractGroupAccess().getManGrpGroupDefParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_manGrp_8_0=ruleGroupDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAbstractGroupRule());
                    						}
                    						add(
                    							current,
                    							"manGrp",
                    							lv_manGrp_8_0,
                    							"org.xtext.msl.MSL.GroupDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMSL.g:545:4: (otherlv_9= ',' ( (lv_manGrp_10_0= ruleGroupDef ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==29) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMSL.g:546:5: otherlv_9= ',' ( (lv_manGrp_10_0= ruleGroupDef ) )
                    	    {
                    	    otherlv_9=(Token)match(input,29,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getAbstractGroupAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMSL.g:550:5: ( (lv_manGrp_10_0= ruleGroupDef ) )
                    	    // InternalMSL.g:551:6: (lv_manGrp_10_0= ruleGroupDef )
                    	    {
                    	    // InternalMSL.g:551:6: (lv_manGrp_10_0= ruleGroupDef )
                    	    // InternalMSL.g:552:7: lv_manGrp_10_0= ruleGroupDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getAbstractGroupAccess().getManGrpGroupDefParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_manGrp_10_0=ruleGroupDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAbstractGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"manGrp",
                    	    								lv_manGrp_10_0,
                    	    								"org.xtext.msl.MSL.GroupDef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getAbstractGroupAccess().getComponentsKeyword_5());
            		
            // InternalMSL.g:575:3: ( (lv_components_12_0= ruleAbstractComponent ) )
            // InternalMSL.g:576:4: (lv_components_12_0= ruleAbstractComponent )
            {
            // InternalMSL.g:576:4: (lv_components_12_0= ruleAbstractComponent )
            // InternalMSL.g:577:5: lv_components_12_0= ruleAbstractComponent
            {

            					newCompositeNode(grammarAccess.getAbstractGroupAccess().getComponentsAbstractComponentParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
            lv_components_12_0=ruleAbstractComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbstractGroupRule());
            					}
            					add(
            						current,
            						"components",
            						lv_components_12_0,
            						"org.xtext.msl.MSL.AbstractComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSL.g:594:3: (otherlv_13= ',' ( (lv_components_14_0= ruleAbstractComponent ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMSL.g:595:4: otherlv_13= ',' ( (lv_components_14_0= ruleAbstractComponent ) )
            	    {
            	    otherlv_13=(Token)match(input,29,FOLLOW_17); 

            	    				newLeafNode(otherlv_13, grammarAccess.getAbstractGroupAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMSL.g:599:4: ( (lv_components_14_0= ruleAbstractComponent ) )
            	    // InternalMSL.g:600:5: (lv_components_14_0= ruleAbstractComponent )
            	    {
            	    // InternalMSL.g:600:5: (lv_components_14_0= ruleAbstractComponent )
            	    // InternalMSL.g:601:6: lv_components_14_0= ruleAbstractComponent
            	    {

            	    						newCompositeNode(grammarAccess.getAbstractGroupAccess().getComponentsAbstractComponentParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_components_14_0=ruleAbstractComponent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAbstractGroupRule());
            	    						}
            	    						add(
            	    							current,
            	    							"components",
            	    							lv_components_14_0,
            	    							"org.xtext.msl.MSL.AbstractComponent");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_15=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getAbstractGroupAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalMSL.g:627:1: entryRuleAbstractInteraction returns [EObject current=null] : iv_ruleAbstractInteraction= ruleAbstractInteraction EOF ;
    public final EObject entryRuleAbstractInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractInteraction = null;


        try {
            // InternalMSL.g:627:60: (iv_ruleAbstractInteraction= ruleAbstractInteraction EOF )
            // InternalMSL.g:628:2: iv_ruleAbstractInteraction= ruleAbstractInteraction EOF
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
    // InternalMSL.g:634:1: ruleAbstractInteraction returns [EObject current=null] : (otherlv_0= 'interaction' ( (lv_start_1_0= ruleAbstractComponentName ) ) otherlv_2= '->' ( (lv_end_3_0= ruleAbstractComponentName ) ) (otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']' )? ) ;
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
            // InternalMSL.g:640:2: ( (otherlv_0= 'interaction' ( (lv_start_1_0= ruleAbstractComponentName ) ) otherlv_2= '->' ( (lv_end_3_0= ruleAbstractComponentName ) ) (otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']' )? ) )
            // InternalMSL.g:641:2: (otherlv_0= 'interaction' ( (lv_start_1_0= ruleAbstractComponentName ) ) otherlv_2= '->' ( (lv_end_3_0= ruleAbstractComponentName ) ) (otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']' )? )
            {
            // InternalMSL.g:641:2: (otherlv_0= 'interaction' ( (lv_start_1_0= ruleAbstractComponentName ) ) otherlv_2= '->' ( (lv_end_3_0= ruleAbstractComponentName ) ) (otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']' )? )
            // InternalMSL.g:642:3: otherlv_0= 'interaction' ( (lv_start_1_0= ruleAbstractComponentName ) ) otherlv_2= '->' ( (lv_end_3_0= ruleAbstractComponentName ) ) (otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']' )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractInteractionAccess().getInteractionKeyword_0());
            		
            // InternalMSL.g:646:3: ( (lv_start_1_0= ruleAbstractComponentName ) )
            // InternalMSL.g:647:4: (lv_start_1_0= ruleAbstractComponentName )
            {
            // InternalMSL.g:647:4: (lv_start_1_0= ruleAbstractComponentName )
            // InternalMSL.g:648:5: lv_start_1_0= ruleAbstractComponentName
            {

            					newCompositeNode(grammarAccess.getAbstractInteractionAccess().getStartAbstractComponentNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_2=(Token)match(input,33,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getAbstractInteractionAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalMSL.g:669:3: ( (lv_end_3_0= ruleAbstractComponentName ) )
            // InternalMSL.g:670:4: (lv_end_3_0= ruleAbstractComponentName )
            {
            // InternalMSL.g:670:4: (lv_end_3_0= ruleAbstractComponentName )
            // InternalMSL.g:671:5: lv_end_3_0= ruleAbstractComponentName
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

            // InternalMSL.g:688:3: (otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMSL.g:689:4: otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getAbstractInteractionAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalMSL.g:693:4: ( (lv_low_5_0= RULE_MULTIPLICITY ) )
                    // InternalMSL.g:694:5: (lv_low_5_0= RULE_MULTIPLICITY )
                    {
                    // InternalMSL.g:694:5: (lv_low_5_0= RULE_MULTIPLICITY )
                    // InternalMSL.g:695:6: lv_low_5_0= RULE_MULTIPLICITY
                    {
                    lv_low_5_0=(Token)match(input,RULE_MULTIPLICITY,FOLLOW_21); 

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
                    			
                    // InternalMSL.g:715:4: ( (lv_high_7_0= RULE_MULTIPLICITY ) )
                    // InternalMSL.g:716:5: (lv_high_7_0= RULE_MULTIPLICITY )
                    {
                    // InternalMSL.g:716:5: (lv_high_7_0= RULE_MULTIPLICITY )
                    // InternalMSL.g:717:6: lv_high_7_0= RULE_MULTIPLICITY
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

                    otherlv_8=(Token)match(input,26,FOLLOW_2); 

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
    // InternalMSL.g:742:1: entryRuleAbstractComponentName returns [EObject current=null] : iv_ruleAbstractComponentName= ruleAbstractComponentName EOF ;
    public final EObject entryRuleAbstractComponentName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComponentName = null;


        try {
            // InternalMSL.g:742:62: (iv_ruleAbstractComponentName= ruleAbstractComponentName EOF )
            // InternalMSL.g:743:2: iv_ruleAbstractComponentName= ruleAbstractComponentName EOF
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
    // InternalMSL.g:749:1: ruleAbstractComponentName returns [EObject current=null] : ( (otherlv_0= RULE_FQN_COMPONENT ) ) ;
    public final EObject ruleAbstractComponentName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMSL.g:755:2: ( ( (otherlv_0= RULE_FQN_COMPONENT ) ) )
            // InternalMSL.g:756:2: ( (otherlv_0= RULE_FQN_COMPONENT ) )
            {
            // InternalMSL.g:756:2: ( (otherlv_0= RULE_FQN_COMPONENT ) )
            // InternalMSL.g:757:3: (otherlv_0= RULE_FQN_COMPONENT )
            {
            // InternalMSL.g:757:3: (otherlv_0= RULE_FQN_COMPONENT )
            // InternalMSL.g:758:4: otherlv_0= RULE_FQN_COMPONENT
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
    // InternalMSL.g:772:1: entryRuleSystemBinding returns [EObject current=null] : iv_ruleSystemBinding= ruleSystemBinding EOF ;
    public final EObject entryRuleSystemBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemBinding = null;


        try {
            // InternalMSL.g:772:54: (iv_ruleSystemBinding= ruleSystemBinding EOF )
            // InternalMSL.g:773:2: iv_ruleSystemBinding= ruleSystemBinding EOF
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
    // InternalMSL.g:779:1: ruleSystemBinding returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) ) ;
    public final EObject ruleSystemBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMSL.g:785:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) ) )
            // InternalMSL.g:786:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) )
            {
            // InternalMSL.g:786:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:787:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemBindingAccess().getSystemKeyword_0());
            		
            // InternalMSL.g:791:3: ( (lv_name_1_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:792:4: (lv_name_1_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:792:4: (lv_name_1_0= RULE_PATTERN_ID )
            // InternalMSL.g:793:5: lv_name_1_0= RULE_PATTERN_ID
            {
            lv_name_1_0=(Token)match(input,RULE_PATTERN_ID,FOLLOW_22); 

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

            otherlv_2=(Token)match(input,34,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemBindingAccess().getColonKeyword_2());
            		
            // InternalMSL.g:813:3: ( (otherlv_3= RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:814:4: (otherlv_3= RULE_FQN_PATTERN_ID )
            {
            // InternalMSL.g:814:4: (otherlv_3= RULE_FQN_PATTERN_ID )
            // InternalMSL.g:815:5: otherlv_3= RULE_FQN_PATTERN_ID
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
    // InternalMSL.g:830:1: entryRuleGroupBinding returns [EObject current=null] : iv_ruleGroupBinding= ruleGroupBinding EOF ;
    public final EObject entryRuleGroupBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupBinding = null;


        try {
            // InternalMSL.g:830:53: (iv_ruleGroupBinding= ruleGroupBinding EOF )
            // InternalMSL.g:831:2: iv_ruleGroupBinding= ruleGroupBinding EOF
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
    // InternalMSL.g:837:1: ruleGroupBinding returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) ) ;
    public final EObject ruleGroupBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMSL.g:843:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) ) )
            // InternalMSL.g:844:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) )
            {
            // InternalMSL.g:844:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:845:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupBindingAccess().getGroupKeyword_0());
            		
            // InternalMSL.g:849:3: ( (lv_name_1_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:850:4: (lv_name_1_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:850:4: (lv_name_1_0= RULE_PATTERN_ID )
            // InternalMSL.g:851:5: lv_name_1_0= RULE_PATTERN_ID
            {
            lv_name_1_0=(Token)match(input,RULE_PATTERN_ID,FOLLOW_22); 

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

            otherlv_2=(Token)match(input,34,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupBindingAccess().getColonKeyword_2());
            		
            // InternalMSL.g:871:3: ( (otherlv_3= RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:872:4: (otherlv_3= RULE_FQN_PATTERN_ID )
            {
            // InternalMSL.g:872:4: (otherlv_3= RULE_FQN_PATTERN_ID )
            // InternalMSL.g:873:5: otherlv_3= RULE_FQN_PATTERN_ID
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
    // InternalMSL.g:888:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalMSL.g:888:48: (iv_rulePattern= rulePattern EOF )
            // InternalMSL.g:889:2: iv_rulePattern= rulePattern EOF
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
    // InternalMSL.g:895:1: rulePattern returns [EObject current=null] : (otherlv_0= 'concrete' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= 'concretizationOf' ( (otherlv_4= RULE_PATTERN_ID ) ) otherlv_5= '{' ( (lv_managedSystems_6_0= ruleSystemBinding ) )* ( (lv_groups_7_0= ruleGroupBinding ) )* otherlv_8= '}' ) ;
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
            // InternalMSL.g:901:2: ( (otherlv_0= 'concrete' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= 'concretizationOf' ( (otherlv_4= RULE_PATTERN_ID ) ) otherlv_5= '{' ( (lv_managedSystems_6_0= ruleSystemBinding ) )* ( (lv_groups_7_0= ruleGroupBinding ) )* otherlv_8= '}' ) )
            // InternalMSL.g:902:2: (otherlv_0= 'concrete' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= 'concretizationOf' ( (otherlv_4= RULE_PATTERN_ID ) ) otherlv_5= '{' ( (lv_managedSystems_6_0= ruleSystemBinding ) )* ( (lv_groups_7_0= ruleGroupBinding ) )* otherlv_8= '}' )
            {
            // InternalMSL.g:902:2: (otherlv_0= 'concrete' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= 'concretizationOf' ( (otherlv_4= RULE_PATTERN_ID ) ) otherlv_5= '{' ( (lv_managedSystems_6_0= ruleSystemBinding ) )* ( (lv_groups_7_0= ruleGroupBinding ) )* otherlv_8= '}' )
            // InternalMSL.g:903:3: otherlv_0= 'concrete' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= 'concretizationOf' ( (otherlv_4= RULE_PATTERN_ID ) ) otherlv_5= '{' ( (lv_managedSystems_6_0= ruleSystemBinding ) )* ( (lv_groups_7_0= ruleGroupBinding ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getConcreteKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getPatternKeyword_1());
            		
            // InternalMSL.g:911:3: ( (lv_name_2_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:912:4: (lv_name_2_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:912:4: (lv_name_2_0= RULE_PATTERN_ID )
            // InternalMSL.g:913:5: lv_name_2_0= RULE_PATTERN_ID
            {
            lv_name_2_0=(Token)match(input,RULE_PATTERN_ID,FOLLOW_24); 

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
            		
            // InternalMSL.g:933:3: ( (otherlv_4= RULE_PATTERN_ID ) )
            // InternalMSL.g:934:4: (otherlv_4= RULE_PATTERN_ID )
            {
            // InternalMSL.g:934:4: (otherlv_4= RULE_PATTERN_ID )
            // InternalMSL.g:935:5: otherlv_4= RULE_PATTERN_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_PATTERN_ID,FOLLOW_7); 

            					newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getAbsPatternAbstractPatternCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMSL.g:950:3: ( (lv_managedSystems_6_0= ruleSystemBinding ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMSL.g:951:4: (lv_managedSystems_6_0= ruleSystemBinding )
            	    {
            	    // InternalMSL.g:951:4: (lv_managedSystems_6_0= ruleSystemBinding )
            	    // InternalMSL.g:952:5: lv_managedSystems_6_0= ruleSystemBinding
            	    {

            	    					newCompositeNode(grammarAccess.getPatternAccess().getManagedSystemsSystemBindingParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_25);
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
            	    break loop15;
                }
            } while (true);

            // InternalMSL.g:969:3: ( (lv_groups_7_0= ruleGroupBinding ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMSL.g:970:4: (lv_groups_7_0= ruleGroupBinding )
            	    {
            	    // InternalMSL.g:970:4: (lv_groups_7_0= ruleGroupBinding )
            	    // InternalMSL.g:971:5: lv_groups_7_0= ruleGroupBinding
            	    {

            	    					newCompositeNode(grammarAccess.getPatternAccess().getGroupsGroupBindingParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_26);
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
            	    break loop16;
                }
            } while (true);

            otherlv_8=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMSL.g:996:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalMSL.g:996:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalMSL.g:997:2: iv_ruleConfiguration= ruleConfiguration EOF
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
    // InternalMSL.g:1003:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= 'instanceOf' ( ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )* ) otherlv_6= '{' ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )* ( (lv_concreteGroups_8_0= ruleConcreteGroup ) )* ( (lv_concreteInteractions_9_0= ruleInteraction ) )* otherlv_10= '}' ) ;
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
            // InternalMSL.g:1009:2: ( (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= 'instanceOf' ( ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )* ) otherlv_6= '{' ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )* ( (lv_concreteGroups_8_0= ruleConcreteGroup ) )* ( (lv_concreteInteractions_9_0= ruleInteraction ) )* otherlv_10= '}' ) )
            // InternalMSL.g:1010:2: (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= 'instanceOf' ( ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )* ) otherlv_6= '{' ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )* ( (lv_concreteGroups_8_0= ruleConcreteGroup ) )* ( (lv_concreteInteractions_9_0= ruleInteraction ) )* otherlv_10= '}' )
            {
            // InternalMSL.g:1010:2: (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= 'instanceOf' ( ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )* ) otherlv_6= '{' ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )* ( (lv_concreteGroups_8_0= ruleConcreteGroup ) )* ( (lv_concreteInteractions_9_0= ruleInteraction ) )* otherlv_10= '}' )
            // InternalMSL.g:1011:3: otherlv_0= 'configuration' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= 'instanceOf' ( ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )* ) otherlv_6= '{' ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )* ( (lv_concreteGroups_8_0= ruleConcreteGroup ) )* ( (lv_concreteInteractions_9_0= ruleInteraction ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigurationKeyword_0());
            		
            // InternalMSL.g:1015:3: ( (lv_name_1_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:1016:4: (lv_name_1_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:1016:4: (lv_name_1_0= RULE_PATTERN_ID )
            // InternalMSL.g:1017:5: lv_name_1_0= RULE_PATTERN_ID
            {
            lv_name_1_0=(Token)match(input,RULE_PATTERN_ID,FOLLOW_27); 

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
            		
            // InternalMSL.g:1037:3: ( ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )* )
            // InternalMSL.g:1038:4: ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )*
            {
            // InternalMSL.g:1038:4: ( (otherlv_3= RULE_PATTERN_ID ) )
            // InternalMSL.g:1039:5: (otherlv_3= RULE_PATTERN_ID )
            {
            // InternalMSL.g:1039:5: (otherlv_3= RULE_PATTERN_ID )
            // InternalMSL.g:1040:6: otherlv_3= RULE_PATTERN_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getConfigurationRule());
            						}
            					
            otherlv_3=(Token)match(input,RULE_PATTERN_ID,FOLLOW_28); 

            						newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getPatternPatternCrossReference_3_0_0());
            					

            }


            }

            // InternalMSL.g:1051:4: (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMSL.g:1052:5: otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_5); 

            	    					newLeafNode(otherlv_4, grammarAccess.getConfigurationAccess().getCommaKeyword_3_1_0());
            	    				
            	    // InternalMSL.g:1056:5: ( (otherlv_5= RULE_PATTERN_ID ) )
            	    // InternalMSL.g:1057:6: (otherlv_5= RULE_PATTERN_ID )
            	    {
            	    // InternalMSL.g:1057:6: (otherlv_5= RULE_PATTERN_ID )
            	    // InternalMSL.g:1058:7: otherlv_5= RULE_PATTERN_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getConfigurationRule());
            	    							}
            	    						
            	    otherlv_5=(Token)match(input,RULE_PATTERN_ID,FOLLOW_28); 

            	    							newLeafNode(otherlv_5, grammarAccess.getConfigurationAccess().getPatternPatternCrossReference_3_1_1_0());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,22,FOLLOW_29); 

            			newLeafNode(otherlv_6, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMSL.g:1075:3: ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // InternalMSL.g:1076:4: (lv_concreteSystems_7_0= ruleConcreteSystem )
            	    {
            	    // InternalMSL.g:1076:4: (lv_concreteSystems_7_0= ruleConcreteSystem )
            	    // InternalMSL.g:1077:5: lv_concreteSystems_7_0= ruleConcreteSystem
            	    {

            	    					newCompositeNode(grammarAccess.getConfigurationAccess().getConcreteSystemsConcreteSystemParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    break loop18;
                }
            } while (true);

            // InternalMSL.g:1094:3: ( (lv_concreteGroups_8_0= ruleConcreteGroup ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_INSTANCE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMSL.g:1095:4: (lv_concreteGroups_8_0= ruleConcreteGroup )
            	    {
            	    // InternalMSL.g:1095:4: (lv_concreteGroups_8_0= ruleConcreteGroup )
            	    // InternalMSL.g:1096:5: lv_concreteGroups_8_0= ruleConcreteGroup
            	    {

            	    					newCompositeNode(grammarAccess.getConfigurationAccess().getConcreteGroupsConcreteGroupParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    break loop19;
                }
            } while (true);

            // InternalMSL.g:1113:3: ( (lv_concreteInteractions_9_0= ruleInteraction ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_FQN_INSTANCE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMSL.g:1114:4: (lv_concreteInteractions_9_0= ruleInteraction )
            	    {
            	    // InternalMSL.g:1114:4: (lv_concreteInteractions_9_0= ruleInteraction )
            	    // InternalMSL.g:1115:5: lv_concreteInteractions_9_0= ruleInteraction
            	    {

            	    					newCompositeNode(grammarAccess.getConfigurationAccess().getConcreteInteractionsInteractionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop20;
                }
            } while (true);

            otherlv_10=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMSL.g:1140:1: entryRuleConcreteSystem returns [EObject current=null] : iv_ruleConcreteSystem= ruleConcreteSystem EOF ;
    public final EObject entryRuleConcreteSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteSystem = null;


        try {
            // InternalMSL.g:1140:55: (iv_ruleConcreteSystem= ruleConcreteSystem EOF )
            // InternalMSL.g:1141:2: iv_ruleConcreteSystem= ruleConcreteSystem EOF
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
    // InternalMSL.g:1147:1: ruleConcreteSystem returns [EObject current=null] : ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) ) ;
    public final EObject ruleConcreteSystem() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMSL.g:1153:2: ( ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) ) )
            // InternalMSL.g:1154:2: ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) )
            {
            // InternalMSL.g:1154:2: ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) )
            // InternalMSL.g:1155:3: ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* )
            {
            // InternalMSL.g:1155:3: ( (lv_name_0_0= RULE_INSTANCE_ID ) )
            // InternalMSL.g:1156:4: (lv_name_0_0= RULE_INSTANCE_ID )
            {
            // InternalMSL.g:1156:4: (lv_name_0_0= RULE_INSTANCE_ID )
            // InternalMSL.g:1157:5: lv_name_0_0= RULE_INSTANCE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_INSTANCE_ID,FOLLOW_22); 

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

            otherlv_1=(Token)match(input,34,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getConcreteSystemAccess().getColonKeyword_1());
            		
            // InternalMSL.g:1177:3: ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* )
            // InternalMSL.g:1178:4: ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )*
            {
            // InternalMSL.g:1178:4: ( (otherlv_2= RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:1179:5: (otherlv_2= RULE_FQN_PATTERN_ID )
            {
            // InternalMSL.g:1179:5: (otherlv_2= RULE_FQN_PATTERN_ID )
            // InternalMSL.g:1180:6: otherlv_2= RULE_FQN_PATTERN_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getConcreteSystemRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_FQN_PATTERN_ID,FOLLOW_31); 

            						newLeafNode(otherlv_2, grammarAccess.getConcreteSystemAccess().getBindingsSystemBindingCrossReference_2_0_0());
            					

            }


            }

            // InternalMSL.g:1191:4: (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMSL.g:1192:5: otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_23); 

            	    					newLeafNode(otherlv_3, grammarAccess.getConcreteSystemAccess().getCommaKeyword_2_1_0());
            	    				
            	    // InternalMSL.g:1196:5: ( (otherlv_4= RULE_FQN_PATTERN_ID ) )
            	    // InternalMSL.g:1197:6: (otherlv_4= RULE_FQN_PATTERN_ID )
            	    {
            	    // InternalMSL.g:1197:6: (otherlv_4= RULE_FQN_PATTERN_ID )
            	    // InternalMSL.g:1198:7: otherlv_4= RULE_FQN_PATTERN_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getConcreteSystemRule());
            	    							}
            	    						
            	    otherlv_4=(Token)match(input,RULE_FQN_PATTERN_ID,FOLLOW_31); 

            	    							newLeafNode(otherlv_4, grammarAccess.getConcreteSystemAccess().getBindingsSystemBindingCrossReference_2_1_1_0());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMSL.g:1215:1: entryRuleConcreteGroup returns [EObject current=null] : iv_ruleConcreteGroup= ruleConcreteGroup EOF ;
    public final EObject entryRuleConcreteGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteGroup = null;


        try {
            // InternalMSL.g:1215:54: (iv_ruleConcreteGroup= ruleConcreteGroup EOF )
            // InternalMSL.g:1216:2: iv_ruleConcreteGroup= ruleConcreteGroup EOF
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
    // InternalMSL.g:1222:1: ruleConcreteGroup returns [EObject current=null] : ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) otherlv_5= '{' (otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_INSTANCE_ID ) ) )* )? (otherlv_10= 'managedGrp' ( (otherlv_11= RULE_INSTANCE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_INSTANCE_ID ) ) )* )? otherlv_14= 'components' ( (lv_components_15_0= ruleComponentInstance ) ) (otherlv_16= ',' ( (lv_components_17_0= ruleComponentInstance ) ) )* otherlv_18= '}' ) ;
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
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_components_15_0 = null;

        EObject lv_components_17_0 = null;



        	enterRule();

        try {
            // InternalMSL.g:1228:2: ( ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) otherlv_5= '{' (otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_INSTANCE_ID ) ) )* )? (otherlv_10= 'managedGrp' ( (otherlv_11= RULE_INSTANCE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_INSTANCE_ID ) ) )* )? otherlv_14= 'components' ( (lv_components_15_0= ruleComponentInstance ) ) (otherlv_16= ',' ( (lv_components_17_0= ruleComponentInstance ) ) )* otherlv_18= '}' ) )
            // InternalMSL.g:1229:2: ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) otherlv_5= '{' (otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_INSTANCE_ID ) ) )* )? (otherlv_10= 'managedGrp' ( (otherlv_11= RULE_INSTANCE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_INSTANCE_ID ) ) )* )? otherlv_14= 'components' ( (lv_components_15_0= ruleComponentInstance ) ) (otherlv_16= ',' ( (lv_components_17_0= ruleComponentInstance ) ) )* otherlv_18= '}' )
            {
            // InternalMSL.g:1229:2: ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) otherlv_5= '{' (otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_INSTANCE_ID ) ) )* )? (otherlv_10= 'managedGrp' ( (otherlv_11= RULE_INSTANCE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_INSTANCE_ID ) ) )* )? otherlv_14= 'components' ( (lv_components_15_0= ruleComponentInstance ) ) (otherlv_16= ',' ( (lv_components_17_0= ruleComponentInstance ) ) )* otherlv_18= '}' )
            // InternalMSL.g:1230:3: ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) otherlv_5= '{' (otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_INSTANCE_ID ) ) )* )? (otherlv_10= 'managedGrp' ( (otherlv_11= RULE_INSTANCE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_INSTANCE_ID ) ) )* )? otherlv_14= 'components' ( (lv_components_15_0= ruleComponentInstance ) ) (otherlv_16= ',' ( (lv_components_17_0= ruleComponentInstance ) ) )* otherlv_18= '}'
            {
            // InternalMSL.g:1230:3: ( (lv_name_0_0= RULE_INSTANCE_ID ) )
            // InternalMSL.g:1231:4: (lv_name_0_0= RULE_INSTANCE_ID )
            {
            // InternalMSL.g:1231:4: (lv_name_0_0= RULE_INSTANCE_ID )
            // InternalMSL.g:1232:5: lv_name_0_0= RULE_INSTANCE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_INSTANCE_ID,FOLLOW_22); 

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

            otherlv_1=(Token)match(input,34,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getConcreteGroupAccess().getColonKeyword_1());
            		
            // InternalMSL.g:1252:3: ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* )
            // InternalMSL.g:1253:4: ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )*
            {
            // InternalMSL.g:1253:4: ( (otherlv_2= RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:1254:5: (otherlv_2= RULE_FQN_PATTERN_ID )
            {
            // InternalMSL.g:1254:5: (otherlv_2= RULE_FQN_PATTERN_ID )
            // InternalMSL.g:1255:6: otherlv_2= RULE_FQN_PATTERN_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getConcreteGroupRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_FQN_PATTERN_ID,FOLLOW_28); 

            						newLeafNode(otherlv_2, grammarAccess.getConcreteGroupAccess().getAbstractGroupsGroupBindingCrossReference_2_0_0());
            					

            }


            }

            // InternalMSL.g:1266:4: (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMSL.g:1267:5: otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_23); 

            	    					newLeafNode(otherlv_3, grammarAccess.getConcreteGroupAccess().getCommaKeyword_2_1_0());
            	    				
            	    // InternalMSL.g:1271:5: ( (otherlv_4= RULE_FQN_PATTERN_ID ) )
            	    // InternalMSL.g:1272:6: (otherlv_4= RULE_FQN_PATTERN_ID )
            	    {
            	    // InternalMSL.g:1272:6: (otherlv_4= RULE_FQN_PATTERN_ID )
            	    // InternalMSL.g:1273:7: otherlv_4= RULE_FQN_PATTERN_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getConcreteGroupRule());
            	    							}
            	    						
            	    otherlv_4=(Token)match(input,RULE_FQN_PATTERN_ID,FOLLOW_28); 

            	    							newLeafNode(otherlv_4, grammarAccess.getConcreteGroupAccess().getAbstractGroupsGroupBindingCrossReference_2_1_1_0());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            otherlv_5=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getConcreteGroupAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMSL.g:1290:3: (otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_INSTANCE_ID ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMSL.g:1291:4: otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_INSTANCE_ID ) ) )*
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_32); 

                    				newLeafNode(otherlv_6, grammarAccess.getConcreteGroupAccess().getManagedSySKeyword_4_0());
                    			
                    // InternalMSL.g:1295:4: ( (otherlv_7= RULE_INSTANCE_ID ) )
                    // InternalMSL.g:1296:5: (otherlv_7= RULE_INSTANCE_ID )
                    {
                    // InternalMSL.g:1296:5: (otherlv_7= RULE_INSTANCE_ID )
                    // InternalMSL.g:1297:6: otherlv_7= RULE_INSTANCE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConcreteGroupRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_INSTANCE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_7, grammarAccess.getConcreteGroupAccess().getManSysConcreteSystemCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalMSL.g:1308:4: (otherlv_8= ',' ( (otherlv_9= RULE_INSTANCE_ID ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==29) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalMSL.g:1309:5: otherlv_8= ',' ( (otherlv_9= RULE_INSTANCE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,29,FOLLOW_32); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getConcreteGroupAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMSL.g:1313:5: ( (otherlv_9= RULE_INSTANCE_ID ) )
                    	    // InternalMSL.g:1314:6: (otherlv_9= RULE_INSTANCE_ID )
                    	    {
                    	    // InternalMSL.g:1314:6: (otherlv_9= RULE_INSTANCE_ID )
                    	    // InternalMSL.g:1315:7: otherlv_9= RULE_INSTANCE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getConcreteGroupRule());
                    	    							}
                    	    						
                    	    otherlv_9=(Token)match(input,RULE_INSTANCE_ID,FOLLOW_15); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getConcreteGroupAccess().getManSysConcreteSystemCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMSL.g:1328:3: (otherlv_10= 'managedGrp' ( (otherlv_11= RULE_INSTANCE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_INSTANCE_ID ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMSL.g:1329:4: otherlv_10= 'managedGrp' ( (otherlv_11= RULE_INSTANCE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_INSTANCE_ID ) ) )*
                    {
                    otherlv_10=(Token)match(input,30,FOLLOW_32); 

                    				newLeafNode(otherlv_10, grammarAccess.getConcreteGroupAccess().getManagedGrpKeyword_5_0());
                    			
                    // InternalMSL.g:1333:4: ( (otherlv_11= RULE_INSTANCE_ID ) )
                    // InternalMSL.g:1334:5: (otherlv_11= RULE_INSTANCE_ID )
                    {
                    // InternalMSL.g:1334:5: (otherlv_11= RULE_INSTANCE_ID )
                    // InternalMSL.g:1335:6: otherlv_11= RULE_INSTANCE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConcreteGroupRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_INSTANCE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_11, grammarAccess.getConcreteGroupAccess().getManGrpConcreteGroupCrossReference_5_1_0());
                    					

                    }


                    }

                    // InternalMSL.g:1346:4: (otherlv_12= ',' ( (otherlv_13= RULE_INSTANCE_ID ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==29) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalMSL.g:1347:5: otherlv_12= ',' ( (otherlv_13= RULE_INSTANCE_ID ) )
                    	    {
                    	    otherlv_12=(Token)match(input,29,FOLLOW_32); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getConcreteGroupAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMSL.g:1351:5: ( (otherlv_13= RULE_INSTANCE_ID ) )
                    	    // InternalMSL.g:1352:6: (otherlv_13= RULE_INSTANCE_ID )
                    	    {
                    	    // InternalMSL.g:1352:6: (otherlv_13= RULE_INSTANCE_ID )
                    	    // InternalMSL.g:1353:7: otherlv_13= RULE_INSTANCE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getConcreteGroupRule());
                    	    							}
                    	    						
                    	    otherlv_13=(Token)match(input,RULE_INSTANCE_ID,FOLLOW_16); 

                    	    							newLeafNode(otherlv_13, grammarAccess.getConcreteGroupAccess().getManGrpConcreteGroupCrossReference_5_2_1_0());
                    	    						

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

            otherlv_14=(Token)match(input,31,FOLLOW_32); 

            			newLeafNode(otherlv_14, grammarAccess.getConcreteGroupAccess().getComponentsKeyword_6());
            		
            // InternalMSL.g:1370:3: ( (lv_components_15_0= ruleComponentInstance ) )
            // InternalMSL.g:1371:4: (lv_components_15_0= ruleComponentInstance )
            {
            // InternalMSL.g:1371:4: (lv_components_15_0= ruleComponentInstance )
            // InternalMSL.g:1372:5: lv_components_15_0= ruleComponentInstance
            {

            					newCompositeNode(grammarAccess.getConcreteGroupAccess().getComponentsComponentInstanceParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalMSL.g:1389:3: (otherlv_16= ',' ( (lv_components_17_0= ruleComponentInstance ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==29) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMSL.g:1390:4: otherlv_16= ',' ( (lv_components_17_0= ruleComponentInstance ) )
            	    {
            	    otherlv_16=(Token)match(input,29,FOLLOW_32); 

            	    				newLeafNode(otherlv_16, grammarAccess.getConcreteGroupAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalMSL.g:1394:4: ( (lv_components_17_0= ruleComponentInstance ) )
            	    // InternalMSL.g:1395:5: (lv_components_17_0= ruleComponentInstance )
            	    {
            	    // InternalMSL.g:1395:5: (lv_components_17_0= ruleComponentInstance )
            	    // InternalMSL.g:1396:6: lv_components_17_0= ruleComponentInstance
            	    {

            	    						newCompositeNode(grammarAccess.getConcreteGroupAccess().getComponentsComponentInstanceParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_components_17_0=ruleComponentInstance();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConcreteGroupRule());
            	    						}
            	    						add(
            	    							current,
            	    							"components",
            	    							lv_components_17_0,
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

            otherlv_18=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getConcreteGroupAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleParamValue"
    // InternalMSL.g:1422:1: entryRuleParamValue returns [EObject current=null] : iv_ruleParamValue= ruleParamValue EOF ;
    public final EObject entryRuleParamValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamValue = null;


        try {
            // InternalMSL.g:1422:51: (iv_ruleParamValue= ruleParamValue EOF )
            // InternalMSL.g:1423:2: iv_ruleParamValue= ruleParamValue EOF
            {
             newCompositeNode(grammarAccess.getParamValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamValue=ruleParamValue();

            state._fsp--;

             current =iv_ruleParamValue; 
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
    // $ANTLR end "entryRuleParamValue"


    // $ANTLR start "ruleParamValue"
    // InternalMSL.g:1429:1: ruleParamValue returns [EObject current=null] : (otherlv_0= '[' ( (lv_nameParam_1_0= RULE_INSTANCE_ID ) ) otherlv_2= '=' ( (lv_valParam_3_0= RULE_DECIMAL ) ) ( (lv_unit_4_0= ruleTimeUnitKind ) )? otherlv_5= ']' ) ;
    public final EObject ruleParamValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nameParam_1_0=null;
        Token otherlv_2=null;
        Token lv_valParam_3_0=null;
        Token otherlv_5=null;
        Enumerator lv_unit_4_0 = null;



        	enterRule();

        try {
            // InternalMSL.g:1435:2: ( (otherlv_0= '[' ( (lv_nameParam_1_0= RULE_INSTANCE_ID ) ) otherlv_2= '=' ( (lv_valParam_3_0= RULE_DECIMAL ) ) ( (lv_unit_4_0= ruleTimeUnitKind ) )? otherlv_5= ']' ) )
            // InternalMSL.g:1436:2: (otherlv_0= '[' ( (lv_nameParam_1_0= RULE_INSTANCE_ID ) ) otherlv_2= '=' ( (lv_valParam_3_0= RULE_DECIMAL ) ) ( (lv_unit_4_0= ruleTimeUnitKind ) )? otherlv_5= ']' )
            {
            // InternalMSL.g:1436:2: (otherlv_0= '[' ( (lv_nameParam_1_0= RULE_INSTANCE_ID ) ) otherlv_2= '=' ( (lv_valParam_3_0= RULE_DECIMAL ) ) ( (lv_unit_4_0= ruleTimeUnitKind ) )? otherlv_5= ']' )
            // InternalMSL.g:1437:3: otherlv_0= '[' ( (lv_nameParam_1_0= RULE_INSTANCE_ID ) ) otherlv_2= '=' ( (lv_valParam_3_0= RULE_DECIMAL ) ) ( (lv_unit_4_0= ruleTimeUnitKind ) )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getParamValueAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMSL.g:1441:3: ( (lv_nameParam_1_0= RULE_INSTANCE_ID ) )
            // InternalMSL.g:1442:4: (lv_nameParam_1_0= RULE_INSTANCE_ID )
            {
            // InternalMSL.g:1442:4: (lv_nameParam_1_0= RULE_INSTANCE_ID )
            // InternalMSL.g:1443:5: lv_nameParam_1_0= RULE_INSTANCE_ID
            {
            lv_nameParam_1_0=(Token)match(input,RULE_INSTANCE_ID,FOLLOW_33); 

            					newLeafNode(lv_nameParam_1_0, grammarAccess.getParamValueAccess().getNameParamINSTANCE_IDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nameParam",
            						lv_nameParam_1_0,
            						"org.xtext.msl.MSL.INSTANCE_ID");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getParamValueAccess().getEqualsSignKeyword_2());
            		
            // InternalMSL.g:1463:3: ( (lv_valParam_3_0= RULE_DECIMAL ) )
            // InternalMSL.g:1464:4: (lv_valParam_3_0= RULE_DECIMAL )
            {
            // InternalMSL.g:1464:4: (lv_valParam_3_0= RULE_DECIMAL )
            // InternalMSL.g:1465:5: lv_valParam_3_0= RULE_DECIMAL
            {
            lv_valParam_3_0=(Token)match(input,RULE_DECIMAL,FOLLOW_35); 

            					newLeafNode(lv_valParam_3_0, grammarAccess.getParamValueAccess().getValParamDECIMALTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valParam",
            						lv_valParam_3_0,
            						"org.xtext.msl.MSL.DECIMAL");
            				

            }


            }

            // InternalMSL.g:1481:3: ( (lv_unit_4_0= ruleTimeUnitKind ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=40 && LA28_0<=46)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMSL.g:1482:4: (lv_unit_4_0= ruleTimeUnitKind )
                    {
                    // InternalMSL.g:1482:4: (lv_unit_4_0= ruleTimeUnitKind )
                    // InternalMSL.g:1483:5: lv_unit_4_0= ruleTimeUnitKind
                    {

                    					newCompositeNode(grammarAccess.getParamValueAccess().getUnitTimeUnitKindEnumRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_unit_4_0=ruleTimeUnitKind();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParamValueRule());
                    					}
                    					set(
                    						current,
                    						"unit",
                    						lv_unit_4_0,
                    						"org.xtext.msl.MSL.TimeUnitKind");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParamValueAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleParamValue"


    // $ANTLR start "entryRuleComponentInstance"
    // InternalMSL.g:1508:1: entryRuleComponentInstance returns [EObject current=null] : iv_ruleComponentInstance= ruleComponentInstance EOF ;
    public final EObject entryRuleComponentInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInstance = null;


        try {
            // InternalMSL.g:1508:58: (iv_ruleComponentInstance= ruleComponentInstance EOF )
            // InternalMSL.g:1509:2: iv_ruleComponentInstance= ruleComponentInstance EOF
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
    // InternalMSL.g:1515:1: ruleComponentInstance returns [EObject current=null] : ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_COMPONENT_TYPE ) ) ( ( (lv_paramValues_3_0= ruleParamValue ) ) ( (lv_paramValues_4_0= ruleParamValue ) )* )? ) ;
    public final EObject ruleComponentInstance() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;
        EObject lv_paramValues_3_0 = null;

        EObject lv_paramValues_4_0 = null;



        	enterRule();

        try {
            // InternalMSL.g:1521:2: ( ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_COMPONENT_TYPE ) ) ( ( (lv_paramValues_3_0= ruleParamValue ) ) ( (lv_paramValues_4_0= ruleParamValue ) )* )? ) )
            // InternalMSL.g:1522:2: ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_COMPONENT_TYPE ) ) ( ( (lv_paramValues_3_0= ruleParamValue ) ) ( (lv_paramValues_4_0= ruleParamValue ) )* )? )
            {
            // InternalMSL.g:1522:2: ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_COMPONENT_TYPE ) ) ( ( (lv_paramValues_3_0= ruleParamValue ) ) ( (lv_paramValues_4_0= ruleParamValue ) )* )? )
            // InternalMSL.g:1523:3: ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_COMPONENT_TYPE ) ) ( ( (lv_paramValues_3_0= ruleParamValue ) ) ( (lv_paramValues_4_0= ruleParamValue ) )* )?
            {
            // InternalMSL.g:1523:3: ( (lv_name_0_0= RULE_INSTANCE_ID ) )
            // InternalMSL.g:1524:4: (lv_name_0_0= RULE_INSTANCE_ID )
            {
            // InternalMSL.g:1524:4: (lv_name_0_0= RULE_INSTANCE_ID )
            // InternalMSL.g:1525:5: lv_name_0_0= RULE_INSTANCE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_INSTANCE_ID,FOLLOW_22); 

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

            otherlv_1=(Token)match(input,34,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentInstanceAccess().getColonKeyword_1());
            		
            // InternalMSL.g:1545:3: ( (lv_type_2_0= RULE_COMPONENT_TYPE ) )
            // InternalMSL.g:1546:4: (lv_type_2_0= RULE_COMPONENT_TYPE )
            {
            // InternalMSL.g:1546:4: (lv_type_2_0= RULE_COMPONENT_TYPE )
            // InternalMSL.g:1547:5: lv_type_2_0= RULE_COMPONENT_TYPE
            {
            lv_type_2_0=(Token)match(input,RULE_COMPONENT_TYPE,FOLLOW_11); 

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

            // InternalMSL.g:1563:3: ( ( (lv_paramValues_3_0= ruleParamValue ) ) ( (lv_paramValues_4_0= ruleParamValue ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMSL.g:1564:4: ( (lv_paramValues_3_0= ruleParamValue ) ) ( (lv_paramValues_4_0= ruleParamValue ) )*
                    {
                    // InternalMSL.g:1564:4: ( (lv_paramValues_3_0= ruleParamValue ) )
                    // InternalMSL.g:1565:5: (lv_paramValues_3_0= ruleParamValue )
                    {
                    // InternalMSL.g:1565:5: (lv_paramValues_3_0= ruleParamValue )
                    // InternalMSL.g:1566:6: lv_paramValues_3_0= ruleParamValue
                    {

                    						newCompositeNode(grammarAccess.getComponentInstanceAccess().getParamValuesParamValueParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_paramValues_3_0=ruleParamValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInstanceRule());
                    						}
                    						add(
                    							current,
                    							"paramValues",
                    							lv_paramValues_3_0,
                    							"org.xtext.msl.MSL.ParamValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMSL.g:1583:4: ( (lv_paramValues_4_0= ruleParamValue ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==25) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMSL.g:1584:5: (lv_paramValues_4_0= ruleParamValue )
                    	    {
                    	    // InternalMSL.g:1584:5: (lv_paramValues_4_0= ruleParamValue )
                    	    // InternalMSL.g:1585:6: lv_paramValues_4_0= ruleParamValue
                    	    {

                    	    						newCompositeNode(grammarAccess.getComponentInstanceAccess().getParamValuesParamValueParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_paramValues_4_0=ruleParamValue();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComponentInstanceRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"paramValues",
                    	    							lv_paramValues_4_0,
                    	    							"org.xtext.msl.MSL.ParamValue");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


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
    // $ANTLR end "ruleComponentInstance"


    // $ANTLR start "entryRuleInteraction"
    // InternalMSL.g:1607:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalMSL.g:1607:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalMSL.g:1608:2: iv_ruleInteraction= ruleInteraction EOF
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
    // InternalMSL.g:1614:1: ruleInteraction returns [EObject current=null] : ( ( (lv_start_0_0= ruleComponentName ) ) otherlv_1= '->' ( (lv_end_2_0= ruleComponentName ) ) ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_start_0_0 = null;

        EObject lv_end_2_0 = null;



        	enterRule();

        try {
            // InternalMSL.g:1620:2: ( ( ( (lv_start_0_0= ruleComponentName ) ) otherlv_1= '->' ( (lv_end_2_0= ruleComponentName ) ) ) )
            // InternalMSL.g:1621:2: ( ( (lv_start_0_0= ruleComponentName ) ) otherlv_1= '->' ( (lv_end_2_0= ruleComponentName ) ) )
            {
            // InternalMSL.g:1621:2: ( ( (lv_start_0_0= ruleComponentName ) ) otherlv_1= '->' ( (lv_end_2_0= ruleComponentName ) ) )
            // InternalMSL.g:1622:3: ( (lv_start_0_0= ruleComponentName ) ) otherlv_1= '->' ( (lv_end_2_0= ruleComponentName ) )
            {
            // InternalMSL.g:1622:3: ( (lv_start_0_0= ruleComponentName ) )
            // InternalMSL.g:1623:4: (lv_start_0_0= ruleComponentName )
            {
            // InternalMSL.g:1623:4: (lv_start_0_0= ruleComponentName )
            // InternalMSL.g:1624:5: lv_start_0_0= ruleComponentName
            {

            					newCompositeNode(grammarAccess.getInteractionAccess().getStartComponentNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
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
            		
            // InternalMSL.g:1645:3: ( (lv_end_2_0= ruleComponentName ) )
            // InternalMSL.g:1646:4: (lv_end_2_0= ruleComponentName )
            {
            // InternalMSL.g:1646:4: (lv_end_2_0= ruleComponentName )
            // InternalMSL.g:1647:5: lv_end_2_0= ruleComponentName
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
    // InternalMSL.g:1668:1: entryRuleComponentName returns [EObject current=null] : iv_ruleComponentName= ruleComponentName EOF ;
    public final EObject entryRuleComponentName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentName = null;


        try {
            // InternalMSL.g:1668:54: (iv_ruleComponentName= ruleComponentName EOF )
            // InternalMSL.g:1669:2: iv_ruleComponentName= ruleComponentName EOF
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
    // InternalMSL.g:1675:1: ruleComponentName returns [EObject current=null] : ( (otherlv_0= RULE_FQN_INSTANCE_ID ) ) ;
    public final EObject ruleComponentName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMSL.g:1681:2: ( ( (otherlv_0= RULE_FQN_INSTANCE_ID ) ) )
            // InternalMSL.g:1682:2: ( (otherlv_0= RULE_FQN_INSTANCE_ID ) )
            {
            // InternalMSL.g:1682:2: ( (otherlv_0= RULE_FQN_INSTANCE_ID ) )
            // InternalMSL.g:1683:3: (otherlv_0= RULE_FQN_INSTANCE_ID )
            {
            // InternalMSL.g:1683:3: (otherlv_0= RULE_FQN_INSTANCE_ID )
            // InternalMSL.g:1684:4: otherlv_0= RULE_FQN_INSTANCE_ID
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


    // $ANTLR start "ruleTimeUnitKind"
    // InternalMSL.g:1698:1: ruleTimeUnitKind returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= 'hrs' ) | (enumLiteral_6= 'dys' ) ) ;
    public final Enumerator ruleTimeUnitKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalMSL.g:1704:2: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= 'hrs' ) | (enumLiteral_6= 'dys' ) ) )
            // InternalMSL.g:1705:2: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= 'hrs' ) | (enumLiteral_6= 'dys' ) )
            {
            // InternalMSL.g:1705:2: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= 'hrs' ) | (enumLiteral_6= 'dys' ) )
            int alt31=7;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt31=1;
                }
                break;
            case 41:
                {
                alt31=2;
                }
                break;
            case 42:
                {
                alt31=3;
                }
                break;
            case 43:
                {
                alt31=4;
                }
                break;
            case 44:
                {
                alt31=5;
                }
                break;
            case 45:
                {
                alt31=6;
                }
                break;
            case 46:
                {
                alt31=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalMSL.g:1706:3: (enumLiteral_0= 's' )
                    {
                    // InternalMSL.g:1706:3: (enumLiteral_0= 's' )
                    // InternalMSL.g:1707:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitKindAccess().getSECONDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitKindAccess().getSECONDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMSL.g:1714:3: (enumLiteral_1= 'ms' )
                    {
                    // InternalMSL.g:1714:3: (enumLiteral_1= 'ms' )
                    // InternalMSL.g:1715:4: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitKindAccess().getMSECONDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitKindAccess().getMSECONDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMSL.g:1722:3: (enumLiteral_2= 'us' )
                    {
                    // InternalMSL.g:1722:3: (enumLiteral_2= 'us' )
                    // InternalMSL.g:1723:4: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitKindAccess().getUSECONDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitKindAccess().getUSECONDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMSL.g:1730:3: (enumLiteral_3= 'ns' )
                    {
                    // InternalMSL.g:1730:3: (enumLiteral_3= 'ns' )
                    // InternalMSL.g:1731:4: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitKindAccess().getNSECONDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitKindAccess().getNSECONDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMSL.g:1738:3: (enumLiteral_4= 'min' )
                    {
                    // InternalMSL.g:1738:3: (enumLiteral_4= 'min' )
                    // InternalMSL.g:1739:4: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitKindAccess().getMINUTEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitKindAccess().getMINUTEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMSL.g:1746:3: (enumLiteral_5= 'hrs' )
                    {
                    // InternalMSL.g:1746:3: (enumLiteral_5= 'hrs' )
                    // InternalMSL.g:1747:4: enumLiteral_5= 'hrs'
                    {
                    enumLiteral_5=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitKindAccess().getHOUREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTimeUnitKindAccess().getHOUREnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMSL.g:1754:3: (enumLiteral_6= 'dys' )
                    {
                    // InternalMSL.g:1754:3: (enumLiteral_6= 'dys' )
                    // InternalMSL.g:1755:4: enumLiteral_6= 'dys'
                    {
                    enumLiteral_6=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitKindAccess().getDAYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTimeUnitKindAccess().getDAYEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleTimeUnitKind"

    // Delegated rules


    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\11\1\42\1\uffff\1\10\1\11\1\10\1\uffff\1\11";
    static final String dfa_3s = "\1\27\1\42\1\uffff\1\10\1\35\1\10\1\uffff\1\35";
    static final String dfa_4s = "\2\uffff\1\2\3\uffff\1\1\1\uffff";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\13\uffff\1\2",
            "\1\3",
            "",
            "\1\4",
            "\1\6\1\uffff\1\6\12\uffff\1\2\1\6\5\uffff\1\5",
            "\1\7",
            "",
            "\1\6\1\uffff\1\6\12\uffff\1\2\1\6\5\uffff\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        @Override
		public String getDescription() {
            return "()* loopback of 1075:3: ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002800180002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000109800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000108800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000D0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000009800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000800A00L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000800800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00007F0004000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000800L});

}