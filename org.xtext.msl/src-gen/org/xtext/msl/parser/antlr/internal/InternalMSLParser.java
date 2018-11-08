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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PATTERN_ID", "RULE_COMPONENT_TYPE", "RULE_MULTIPLICITY", "RULE_STRING", "RULE_FQN_COMPONENT", "RULE_FQN_PATTERN_ID", "RULE_INSTANCE_ID", "RULE_FQN_INSTANCE_ID", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'abstract'", "'pattern'", "'{'", "'}'", "'system'", "'['", "']'", "'='", "'group'", "'managedSyS'", "','", "'managedGrp'", "'components'", "'interaction'", "'->'", "':'", "'concrete'", "'concretizationOf'", "'configuration'", "'instanceOf'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_FQN_INSTANCE_ID=11;
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
    public static final int RULE_ID=12;
    public static final int RULE_WS=16;
    public static final int RULE_FQN_PATTERN_ID=9;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_INSTANCE_ID=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=13;
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
    // InternalMSL.g:448:1: ruleAttValue returns [EObject current=null] : ( ( (lv_nameAtt_0_0= RULE_STRING ) )+ (otherlv_1= '=' )+ ( (lv_valAtt_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAttValue() throws RecognitionException {
        EObject current = null;

        Token lv_nameAtt_0_0=null;
        Token otherlv_1=null;
        Token lv_valAtt_2_0=null;


        	enterRule();

        try {
            // InternalMSL.g:454:2: ( ( ( (lv_nameAtt_0_0= RULE_STRING ) )+ (otherlv_1= '=' )+ ( (lv_valAtt_2_0= RULE_STRING ) ) ) )
            // InternalMSL.g:455:2: ( ( (lv_nameAtt_0_0= RULE_STRING ) )+ (otherlv_1= '=' )+ ( (lv_valAtt_2_0= RULE_STRING ) ) )
            {
            // InternalMSL.g:455:2: ( ( (lv_nameAtt_0_0= RULE_STRING ) )+ (otherlv_1= '=' )+ ( (lv_valAtt_2_0= RULE_STRING ) ) )
            // InternalMSL.g:456:3: ( (lv_nameAtt_0_0= RULE_STRING ) )+ (otherlv_1= '=' )+ ( (lv_valAtt_2_0= RULE_STRING ) )
            {
            // InternalMSL.g:456:3: ( (lv_nameAtt_0_0= RULE_STRING ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMSL.g:457:4: (lv_nameAtt_0_0= RULE_STRING )
            	    {
            	    // InternalMSL.g:457:4: (lv_nameAtt_0_0= RULE_STRING )
            	    // InternalMSL.g:458:5: lv_nameAtt_0_0= RULE_STRING
            	    {
            	    lv_nameAtt_0_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            	    					newLeafNode(lv_nameAtt_0_0, grammarAccess.getAttValueAccess().getNameAttSTRINGTerminalRuleCall_0_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getAttValueRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"nameAtt",
            	    						lv_nameAtt_0_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // InternalMSL.g:474:3: (otherlv_1= '=' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMSL.g:475:4: otherlv_1= '='
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_14); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAttValueAccess().getEqualsSignKeyword_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // InternalMSL.g:480:3: ( (lv_valAtt_2_0= RULE_STRING ) )
            // InternalMSL.g:481:4: (lv_valAtt_2_0= RULE_STRING )
            {
            // InternalMSL.g:481:4: (lv_valAtt_2_0= RULE_STRING )
            // InternalMSL.g:482:5: lv_valAtt_2_0= RULE_STRING
            {
            lv_valAtt_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_valAtt_2_0, grammarAccess.getAttValueAccess().getValAttSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valAtt",
            						lv_valAtt_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // InternalMSL.g:502:1: entryRuleAbstractGroup returns [EObject current=null] : iv_ruleAbstractGroup= ruleAbstractGroup EOF ;
    public final EObject entryRuleAbstractGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractGroup = null;


        try {
            // InternalMSL.g:502:54: (iv_ruleAbstractGroup= ruleAbstractGroup EOF )
            // InternalMSL.g:503:2: iv_ruleAbstractGroup= ruleAbstractGroup EOF
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
    // InternalMSL.g:509:1: ruleAbstractGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= '{' (otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= '[' ( (lv_attValues_6_0= ruleAttValue ) ) (otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) ) )* otherlv_9= ']' )? )? (otherlv_10= 'managedGrp' ( (lv_manGrp_11_0= ruleGroupDef ) ) (otherlv_12= ',' ( (lv_manGrp_13_0= ruleGroupDef ) ) )* )? otherlv_14= 'components' ( (lv_components_15_0= ruleAbstractComponent ) ) (otherlv_16= ',' ( (lv_components_17_0= ruleAbstractComponent ) ) )* otherlv_18= '}' ) ;
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
            // InternalMSL.g:515:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= '{' (otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= '[' ( (lv_attValues_6_0= ruleAttValue ) ) (otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) ) )* otherlv_9= ']' )? )? (otherlv_10= 'managedGrp' ( (lv_manGrp_11_0= ruleGroupDef ) ) (otherlv_12= ',' ( (lv_manGrp_13_0= ruleGroupDef ) ) )* )? otherlv_14= 'components' ( (lv_components_15_0= ruleAbstractComponent ) ) (otherlv_16= ',' ( (lv_components_17_0= ruleAbstractComponent ) ) )* otherlv_18= '}' ) )
            // InternalMSL.g:516:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= '{' (otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= '[' ( (lv_attValues_6_0= ruleAttValue ) ) (otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) ) )* otherlv_9= ']' )? )? (otherlv_10= 'managedGrp' ( (lv_manGrp_11_0= ruleGroupDef ) ) (otherlv_12= ',' ( (lv_manGrp_13_0= ruleGroupDef ) ) )* )? otherlv_14= 'components' ( (lv_components_15_0= ruleAbstractComponent ) ) (otherlv_16= ',' ( (lv_components_17_0= ruleAbstractComponent ) ) )* otherlv_18= '}' )
            {
            // InternalMSL.g:516:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= '{' (otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= '[' ( (lv_attValues_6_0= ruleAttValue ) ) (otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) ) )* otherlv_9= ']' )? )? (otherlv_10= 'managedGrp' ( (lv_manGrp_11_0= ruleGroupDef ) ) (otherlv_12= ',' ( (lv_manGrp_13_0= ruleGroupDef ) ) )* )? otherlv_14= 'components' ( (lv_components_15_0= ruleAbstractComponent ) ) (otherlv_16= ',' ( (lv_components_17_0= ruleAbstractComponent ) ) )* otherlv_18= '}' )
            // InternalMSL.g:517:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= '{' (otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= '[' ( (lv_attValues_6_0= ruleAttValue ) ) (otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) ) )* otherlv_9= ']' )? )? (otherlv_10= 'managedGrp' ( (lv_manGrp_11_0= ruleGroupDef ) ) (otherlv_12= ',' ( (lv_manGrp_13_0= ruleGroupDef ) ) )* )? otherlv_14= 'components' ( (lv_components_15_0= ruleAbstractComponent ) ) (otherlv_16= ',' ( (lv_components_17_0= ruleAbstractComponent ) ) )* otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractGroupAccess().getGroupKeyword_0());
            		
            // InternalMSL.g:521:3: ( (lv_name_1_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:522:4: (lv_name_1_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:522:4: (lv_name_1_0= RULE_PATTERN_ID )
            // InternalMSL.g:523:5: lv_name_1_0= RULE_PATTERN_ID
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

            otherlv_2=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getAbstractGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMSL.g:543:3: (otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= '[' ( (lv_attValues_6_0= ruleAttValue ) ) (otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) ) )* otherlv_9= ']' )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMSL.g:544:4: otherlv_3= 'managedSyS' ( (otherlv_4= RULE_PATTERN_ID ) ) (otherlv_5= '[' ( (lv_attValues_6_0= ruleAttValue ) ) (otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) ) )* otherlv_9= ']' )?
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getAbstractGroupAccess().getManagedSySKeyword_3_0());
                    			
                    // InternalMSL.g:548:4: ( (otherlv_4= RULE_PATTERN_ID ) )
                    // InternalMSL.g:549:5: (otherlv_4= RULE_PATTERN_ID )
                    {
                    // InternalMSL.g:549:5: (otherlv_4= RULE_PATTERN_ID )
                    // InternalMSL.g:550:6: otherlv_4= RULE_PATTERN_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAbstractGroupRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_PATTERN_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_4, grammarAccess.getAbstractGroupAccess().getManSysAbstractSystemCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalMSL.g:561:4: (otherlv_5= '[' ( (lv_attValues_6_0= ruleAttValue ) ) (otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) ) )* otherlv_9= ']' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==24) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMSL.g:562:5: otherlv_5= '[' ( (lv_attValues_6_0= ruleAttValue ) ) (otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) ) )* otherlv_9= ']'
                            {
                            otherlv_5=(Token)match(input,24,FOLLOW_17); 

                            					newLeafNode(otherlv_5, grammarAccess.getAbstractGroupAccess().getLeftSquareBracketKeyword_3_2_0());
                            				
                            // InternalMSL.g:566:5: ( (lv_attValues_6_0= ruleAttValue ) )
                            // InternalMSL.g:567:6: (lv_attValues_6_0= ruleAttValue )
                            {
                            // InternalMSL.g:567:6: (lv_attValues_6_0= ruleAttValue )
                            // InternalMSL.g:568:7: lv_attValues_6_0= ruleAttValue
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

                            // InternalMSL.g:585:5: (otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) ) )*
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( (LA11_0==29) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // InternalMSL.g:586:6: otherlv_7= ',' ( (lv_attValues_8_0= ruleAttValue ) )
                            	    {
                            	    otherlv_7=(Token)match(input,29,FOLLOW_17); 

                            	    						newLeafNode(otherlv_7, grammarAccess.getAbstractGroupAccess().getCommaKeyword_3_2_2_0());
                            	    					
                            	    // InternalMSL.g:590:6: ( (lv_attValues_8_0= ruleAttValue ) )
                            	    // InternalMSL.g:591:7: (lv_attValues_8_0= ruleAttValue )
                            	    {
                            	    // InternalMSL.g:591:7: (lv_attValues_8_0= ruleAttValue )
                            	    // InternalMSL.g:592:8: lv_attValues_8_0= ruleAttValue
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
                            	    break loop11;
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

            // InternalMSL.g:616:3: (otherlv_10= 'managedGrp' ( (lv_manGrp_11_0= ruleGroupDef ) ) (otherlv_12= ',' ( (lv_manGrp_13_0= ruleGroupDef ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMSL.g:617:4: otherlv_10= 'managedGrp' ( (lv_manGrp_11_0= ruleGroupDef ) ) (otherlv_12= ',' ( (lv_manGrp_13_0= ruleGroupDef ) ) )*
                    {
                    otherlv_10=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getAbstractGroupAccess().getManagedGrpKeyword_4_0());
                    			
                    // InternalMSL.g:621:4: ( (lv_manGrp_11_0= ruleGroupDef ) )
                    // InternalMSL.g:622:5: (lv_manGrp_11_0= ruleGroupDef )
                    {
                    // InternalMSL.g:622:5: (lv_manGrp_11_0= ruleGroupDef )
                    // InternalMSL.g:623:6: lv_manGrp_11_0= ruleGroupDef
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

                    // InternalMSL.g:640:4: (otherlv_12= ',' ( (lv_manGrp_13_0= ruleGroupDef ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==29) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMSL.g:641:5: otherlv_12= ',' ( (lv_manGrp_13_0= ruleGroupDef ) )
                    	    {
                    	    otherlv_12=(Token)match(input,29,FOLLOW_5); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getAbstractGroupAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMSL.g:645:5: ( (lv_manGrp_13_0= ruleGroupDef ) )
                    	    // InternalMSL.g:646:6: (lv_manGrp_13_0= ruleGroupDef )
                    	    {
                    	    // InternalMSL.g:646:6: (lv_manGrp_13_0= ruleGroupDef )
                    	    // InternalMSL.g:647:7: lv_manGrp_13_0= ruleGroupDef
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
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_14, grammarAccess.getAbstractGroupAccess().getComponentsKeyword_5());
            		
            // InternalMSL.g:670:3: ( (lv_components_15_0= ruleAbstractComponent ) )
            // InternalMSL.g:671:4: (lv_components_15_0= ruleAbstractComponent )
            {
            // InternalMSL.g:671:4: (lv_components_15_0= ruleAbstractComponent )
            // InternalMSL.g:672:5: lv_components_15_0= ruleAbstractComponent
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

            // InternalMSL.g:689:3: (otherlv_16= ',' ( (lv_components_17_0= ruleAbstractComponent ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMSL.g:690:4: otherlv_16= ',' ( (lv_components_17_0= ruleAbstractComponent ) )
            	    {
            	    otherlv_16=(Token)match(input,29,FOLLOW_21); 

            	    				newLeafNode(otherlv_16, grammarAccess.getAbstractGroupAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMSL.g:694:4: ( (lv_components_17_0= ruleAbstractComponent ) )
            	    // InternalMSL.g:695:5: (lv_components_17_0= ruleAbstractComponent )
            	    {
            	    // InternalMSL.g:695:5: (lv_components_17_0= ruleAbstractComponent )
            	    // InternalMSL.g:696:6: lv_components_17_0= ruleAbstractComponent
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
            	    break loop16;
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
    // InternalMSL.g:722:1: entryRuleAbstractInteraction returns [EObject current=null] : iv_ruleAbstractInteraction= ruleAbstractInteraction EOF ;
    public final EObject entryRuleAbstractInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractInteraction = null;


        try {
            // InternalMSL.g:722:60: (iv_ruleAbstractInteraction= ruleAbstractInteraction EOF )
            // InternalMSL.g:723:2: iv_ruleAbstractInteraction= ruleAbstractInteraction EOF
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
    // InternalMSL.g:729:1: ruleAbstractInteraction returns [EObject current=null] : (otherlv_0= 'interaction' ( (lv_start_1_0= ruleAbstractComponentName ) ) otherlv_2= '->' ( (lv_end_3_0= ruleAbstractComponentName ) ) (otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']' )? ) ;
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
            // InternalMSL.g:735:2: ( (otherlv_0= 'interaction' ( (lv_start_1_0= ruleAbstractComponentName ) ) otherlv_2= '->' ( (lv_end_3_0= ruleAbstractComponentName ) ) (otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']' )? ) )
            // InternalMSL.g:736:2: (otherlv_0= 'interaction' ( (lv_start_1_0= ruleAbstractComponentName ) ) otherlv_2= '->' ( (lv_end_3_0= ruleAbstractComponentName ) ) (otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']' )? )
            {
            // InternalMSL.g:736:2: (otherlv_0= 'interaction' ( (lv_start_1_0= ruleAbstractComponentName ) ) otherlv_2= '->' ( (lv_end_3_0= ruleAbstractComponentName ) ) (otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']' )? )
            // InternalMSL.g:737:3: otherlv_0= 'interaction' ( (lv_start_1_0= ruleAbstractComponentName ) ) otherlv_2= '->' ( (lv_end_3_0= ruleAbstractComponentName ) ) (otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']' )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractInteractionAccess().getInteractionKeyword_0());
            		
            // InternalMSL.g:741:3: ( (lv_start_1_0= ruleAbstractComponentName ) )
            // InternalMSL.g:742:4: (lv_start_1_0= ruleAbstractComponentName )
            {
            // InternalMSL.g:742:4: (lv_start_1_0= ruleAbstractComponentName )
            // InternalMSL.g:743:5: lv_start_1_0= ruleAbstractComponentName
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
            		
            // InternalMSL.g:764:3: ( (lv_end_3_0= ruleAbstractComponentName ) )
            // InternalMSL.g:765:4: (lv_end_3_0= ruleAbstractComponentName )
            {
            // InternalMSL.g:765:4: (lv_end_3_0= ruleAbstractComponentName )
            // InternalMSL.g:766:5: lv_end_3_0= ruleAbstractComponentName
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

            // InternalMSL.g:783:3: (otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMSL.g:784:4: otherlv_4= '[' ( (lv_low_5_0= RULE_MULTIPLICITY ) ) otherlv_6= ',' ( (lv_high_7_0= RULE_MULTIPLICITY ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getAbstractInteractionAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalMSL.g:788:4: ( (lv_low_5_0= RULE_MULTIPLICITY ) )
                    // InternalMSL.g:789:5: (lv_low_5_0= RULE_MULTIPLICITY )
                    {
                    // InternalMSL.g:789:5: (lv_low_5_0= RULE_MULTIPLICITY )
                    // InternalMSL.g:790:6: lv_low_5_0= RULE_MULTIPLICITY
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
                    			
                    // InternalMSL.g:810:4: ( (lv_high_7_0= RULE_MULTIPLICITY ) )
                    // InternalMSL.g:811:5: (lv_high_7_0= RULE_MULTIPLICITY )
                    {
                    // InternalMSL.g:811:5: (lv_high_7_0= RULE_MULTIPLICITY )
                    // InternalMSL.g:812:6: lv_high_7_0= RULE_MULTIPLICITY
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
    // InternalMSL.g:837:1: entryRuleAbstractComponentName returns [EObject current=null] : iv_ruleAbstractComponentName= ruleAbstractComponentName EOF ;
    public final EObject entryRuleAbstractComponentName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComponentName = null;


        try {
            // InternalMSL.g:837:62: (iv_ruleAbstractComponentName= ruleAbstractComponentName EOF )
            // InternalMSL.g:838:2: iv_ruleAbstractComponentName= ruleAbstractComponentName EOF
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
    // InternalMSL.g:844:1: ruleAbstractComponentName returns [EObject current=null] : ( (otherlv_0= RULE_FQN_COMPONENT ) ) ;
    public final EObject ruleAbstractComponentName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMSL.g:850:2: ( ( (otherlv_0= RULE_FQN_COMPONENT ) ) )
            // InternalMSL.g:851:2: ( (otherlv_0= RULE_FQN_COMPONENT ) )
            {
            // InternalMSL.g:851:2: ( (otherlv_0= RULE_FQN_COMPONENT ) )
            // InternalMSL.g:852:3: (otherlv_0= RULE_FQN_COMPONENT )
            {
            // InternalMSL.g:852:3: (otherlv_0= RULE_FQN_COMPONENT )
            // InternalMSL.g:853:4: otherlv_0= RULE_FQN_COMPONENT
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
    // InternalMSL.g:867:1: entryRuleSystemBinding returns [EObject current=null] : iv_ruleSystemBinding= ruleSystemBinding EOF ;
    public final EObject entryRuleSystemBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemBinding = null;


        try {
            // InternalMSL.g:867:54: (iv_ruleSystemBinding= ruleSystemBinding EOF )
            // InternalMSL.g:868:2: iv_ruleSystemBinding= ruleSystemBinding EOF
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
    // InternalMSL.g:874:1: ruleSystemBinding returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) ) ;
    public final EObject ruleSystemBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMSL.g:880:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) ) )
            // InternalMSL.g:881:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) )
            {
            // InternalMSL.g:881:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:882:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemBindingAccess().getSystemKeyword_0());
            		
            // InternalMSL.g:886:3: ( (lv_name_1_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:887:4: (lv_name_1_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:887:4: (lv_name_1_0= RULE_PATTERN_ID )
            // InternalMSL.g:888:5: lv_name_1_0= RULE_PATTERN_ID
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
            		
            // InternalMSL.g:908:3: ( (otherlv_3= RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:909:4: (otherlv_3= RULE_FQN_PATTERN_ID )
            {
            // InternalMSL.g:909:4: (otherlv_3= RULE_FQN_PATTERN_ID )
            // InternalMSL.g:910:5: otherlv_3= RULE_FQN_PATTERN_ID
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
    // InternalMSL.g:925:1: entryRuleGroupBinding returns [EObject current=null] : iv_ruleGroupBinding= ruleGroupBinding EOF ;
    public final EObject entryRuleGroupBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupBinding = null;


        try {
            // InternalMSL.g:925:53: (iv_ruleGroupBinding= ruleGroupBinding EOF )
            // InternalMSL.g:926:2: iv_ruleGroupBinding= ruleGroupBinding EOF
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
    // InternalMSL.g:932:1: ruleGroupBinding returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) ) ;
    public final EObject ruleGroupBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMSL.g:938:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) ) )
            // InternalMSL.g:939:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) )
            {
            // InternalMSL.g:939:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:940:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_FQN_PATTERN_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupBindingAccess().getGroupKeyword_0());
            		
            // InternalMSL.g:944:3: ( (lv_name_1_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:945:4: (lv_name_1_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:945:4: (lv_name_1_0= RULE_PATTERN_ID )
            // InternalMSL.g:946:5: lv_name_1_0= RULE_PATTERN_ID
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
            		
            // InternalMSL.g:966:3: ( (otherlv_3= RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:967:4: (otherlv_3= RULE_FQN_PATTERN_ID )
            {
            // InternalMSL.g:967:4: (otherlv_3= RULE_FQN_PATTERN_ID )
            // InternalMSL.g:968:5: otherlv_3= RULE_FQN_PATTERN_ID
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
    // InternalMSL.g:983:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalMSL.g:983:48: (iv_rulePattern= rulePattern EOF )
            // InternalMSL.g:984:2: iv_rulePattern= rulePattern EOF
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
    // InternalMSL.g:990:1: rulePattern returns [EObject current=null] : (otherlv_0= 'concrete' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= 'concretizationOf' ( (otherlv_4= RULE_PATTERN_ID ) ) otherlv_5= '{' ( (lv_managedSystems_6_0= ruleSystemBinding ) )* ( (lv_groups_7_0= ruleGroupBinding ) )* otherlv_8= '}' ) ;
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
            // InternalMSL.g:996:2: ( (otherlv_0= 'concrete' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= 'concretizationOf' ( (otherlv_4= RULE_PATTERN_ID ) ) otherlv_5= '{' ( (lv_managedSystems_6_0= ruleSystemBinding ) )* ( (lv_groups_7_0= ruleGroupBinding ) )* otherlv_8= '}' ) )
            // InternalMSL.g:997:2: (otherlv_0= 'concrete' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= 'concretizationOf' ( (otherlv_4= RULE_PATTERN_ID ) ) otherlv_5= '{' ( (lv_managedSystems_6_0= ruleSystemBinding ) )* ( (lv_groups_7_0= ruleGroupBinding ) )* otherlv_8= '}' )
            {
            // InternalMSL.g:997:2: (otherlv_0= 'concrete' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= 'concretizationOf' ( (otherlv_4= RULE_PATTERN_ID ) ) otherlv_5= '{' ( (lv_managedSystems_6_0= ruleSystemBinding ) )* ( (lv_groups_7_0= ruleGroupBinding ) )* otherlv_8= '}' )
            // InternalMSL.g:998:3: otherlv_0= 'concrete' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_PATTERN_ID ) ) otherlv_3= 'concretizationOf' ( (otherlv_4= RULE_PATTERN_ID ) ) otherlv_5= '{' ( (lv_managedSystems_6_0= ruleSystemBinding ) )* ( (lv_groups_7_0= ruleGroupBinding ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getConcreteKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getPatternKeyword_1());
            		
            // InternalMSL.g:1006:3: ( (lv_name_2_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:1007:4: (lv_name_2_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:1007:4: (lv_name_2_0= RULE_PATTERN_ID )
            // InternalMSL.g:1008:5: lv_name_2_0= RULE_PATTERN_ID
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
            		
            // InternalMSL.g:1028:3: ( (otherlv_4= RULE_PATTERN_ID ) )
            // InternalMSL.g:1029:4: (otherlv_4= RULE_PATTERN_ID )
            {
            // InternalMSL.g:1029:4: (otherlv_4= RULE_PATTERN_ID )
            // InternalMSL.g:1030:5: otherlv_4= RULE_PATTERN_ID
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
            		
            // InternalMSL.g:1045:3: ( (lv_managedSystems_6_0= ruleSystemBinding ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMSL.g:1046:4: (lv_managedSystems_6_0= ruleSystemBinding )
            	    {
            	    // InternalMSL.g:1046:4: (lv_managedSystems_6_0= ruleSystemBinding )
            	    // InternalMSL.g:1047:5: lv_managedSystems_6_0= ruleSystemBinding
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
            	    break loop18;
                }
            } while (true);

            // InternalMSL.g:1064:3: ( (lv_groups_7_0= ruleGroupBinding ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMSL.g:1065:4: (lv_groups_7_0= ruleGroupBinding )
            	    {
            	    // InternalMSL.g:1065:4: (lv_groups_7_0= ruleGroupBinding )
            	    // InternalMSL.g:1066:5: lv_groups_7_0= ruleGroupBinding
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
            	    break loop19;
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
    // InternalMSL.g:1091:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalMSL.g:1091:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalMSL.g:1092:2: iv_ruleConfiguration= ruleConfiguration EOF
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
    // InternalMSL.g:1098:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= 'instanceOf' ( ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )* ) otherlv_6= '{' ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )* ( (lv_concreteGroups_8_0= ruleConcreteGroup ) )* ( (lv_concreteInteractions_9_0= ruleInteraction ) )* otherlv_10= '}' ) ;
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
            // InternalMSL.g:1104:2: ( (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= 'instanceOf' ( ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )* ) otherlv_6= '{' ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )* ( (lv_concreteGroups_8_0= ruleConcreteGroup ) )* ( (lv_concreteInteractions_9_0= ruleInteraction ) )* otherlv_10= '}' ) )
            // InternalMSL.g:1105:2: (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= 'instanceOf' ( ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )* ) otherlv_6= '{' ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )* ( (lv_concreteGroups_8_0= ruleConcreteGroup ) )* ( (lv_concreteInteractions_9_0= ruleInteraction ) )* otherlv_10= '}' )
            {
            // InternalMSL.g:1105:2: (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= 'instanceOf' ( ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )* ) otherlv_6= '{' ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )* ( (lv_concreteGroups_8_0= ruleConcreteGroup ) )* ( (lv_concreteInteractions_9_0= ruleInteraction ) )* otherlv_10= '}' )
            // InternalMSL.g:1106:3: otherlv_0= 'configuration' ( (lv_name_1_0= RULE_PATTERN_ID ) ) otherlv_2= 'instanceOf' ( ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )* ) otherlv_6= '{' ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )* ( (lv_concreteGroups_8_0= ruleConcreteGroup ) )* ( (lv_concreteInteractions_9_0= ruleInteraction ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigurationKeyword_0());
            		
            // InternalMSL.g:1110:3: ( (lv_name_1_0= RULE_PATTERN_ID ) )
            // InternalMSL.g:1111:4: (lv_name_1_0= RULE_PATTERN_ID )
            {
            // InternalMSL.g:1111:4: (lv_name_1_0= RULE_PATTERN_ID )
            // InternalMSL.g:1112:5: lv_name_1_0= RULE_PATTERN_ID
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
            		
            // InternalMSL.g:1132:3: ( ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )* )
            // InternalMSL.g:1133:4: ( (otherlv_3= RULE_PATTERN_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )*
            {
            // InternalMSL.g:1133:4: ( (otherlv_3= RULE_PATTERN_ID ) )
            // InternalMSL.g:1134:5: (otherlv_3= RULE_PATTERN_ID )
            {
            // InternalMSL.g:1134:5: (otherlv_3= RULE_PATTERN_ID )
            // InternalMSL.g:1135:6: otherlv_3= RULE_PATTERN_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getConfigurationRule());
            						}
            					
            otherlv_3=(Token)match(input,RULE_PATTERN_ID,FOLLOW_32); 

            						newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getPatternPatternCrossReference_3_0_0());
            					

            }


            }

            // InternalMSL.g:1146:4: (otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMSL.g:1147:5: otherlv_4= ',' ( (otherlv_5= RULE_PATTERN_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_5); 

            	    					newLeafNode(otherlv_4, grammarAccess.getConfigurationAccess().getCommaKeyword_3_1_0());
            	    				
            	    // InternalMSL.g:1151:5: ( (otherlv_5= RULE_PATTERN_ID ) )
            	    // InternalMSL.g:1152:6: (otherlv_5= RULE_PATTERN_ID )
            	    {
            	    // InternalMSL.g:1152:6: (otherlv_5= RULE_PATTERN_ID )
            	    // InternalMSL.g:1153:7: otherlv_5= RULE_PATTERN_ID
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
            	    break loop20;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,21,FOLLOW_33); 

            			newLeafNode(otherlv_6, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMSL.g:1170:3: ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )*
            loop21:
            do {
                int alt21=2;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // InternalMSL.g:1171:4: (lv_concreteSystems_7_0= ruleConcreteSystem )
            	    {
            	    // InternalMSL.g:1171:4: (lv_concreteSystems_7_0= ruleConcreteSystem )
            	    // InternalMSL.g:1172:5: lv_concreteSystems_7_0= ruleConcreteSystem
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
            	    break loop21;
                }
            } while (true);

            // InternalMSL.g:1189:3: ( (lv_concreteGroups_8_0= ruleConcreteGroup ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_INSTANCE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMSL.g:1190:4: (lv_concreteGroups_8_0= ruleConcreteGroup )
            	    {
            	    // InternalMSL.g:1190:4: (lv_concreteGroups_8_0= ruleConcreteGroup )
            	    // InternalMSL.g:1191:5: lv_concreteGroups_8_0= ruleConcreteGroup
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
            	    break loop22;
                }
            } while (true);

            // InternalMSL.g:1208:3: ( (lv_concreteInteractions_9_0= ruleInteraction ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_FQN_INSTANCE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMSL.g:1209:4: (lv_concreteInteractions_9_0= ruleInteraction )
            	    {
            	    // InternalMSL.g:1209:4: (lv_concreteInteractions_9_0= ruleInteraction )
            	    // InternalMSL.g:1210:5: lv_concreteInteractions_9_0= ruleInteraction
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
            	    break loop23;
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
    // InternalMSL.g:1235:1: entryRuleConcreteSystem returns [EObject current=null] : iv_ruleConcreteSystem= ruleConcreteSystem EOF ;
    public final EObject entryRuleConcreteSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteSystem = null;


        try {
            // InternalMSL.g:1235:55: (iv_ruleConcreteSystem= ruleConcreteSystem EOF )
            // InternalMSL.g:1236:2: iv_ruleConcreteSystem= ruleConcreteSystem EOF
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
    // InternalMSL.g:1242:1: ruleConcreteSystem returns [EObject current=null] : ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) ) ;
    public final EObject ruleConcreteSystem() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMSL.g:1248:2: ( ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) ) )
            // InternalMSL.g:1249:2: ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) )
            {
            // InternalMSL.g:1249:2: ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) )
            // InternalMSL.g:1250:3: ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* )
            {
            // InternalMSL.g:1250:3: ( (lv_name_0_0= RULE_INSTANCE_ID ) )
            // InternalMSL.g:1251:4: (lv_name_0_0= RULE_INSTANCE_ID )
            {
            // InternalMSL.g:1251:4: (lv_name_0_0= RULE_INSTANCE_ID )
            // InternalMSL.g:1252:5: lv_name_0_0= RULE_INSTANCE_ID
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
            		
            // InternalMSL.g:1272:3: ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* )
            // InternalMSL.g:1273:4: ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )*
            {
            // InternalMSL.g:1273:4: ( (otherlv_2= RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:1274:5: (otherlv_2= RULE_FQN_PATTERN_ID )
            {
            // InternalMSL.g:1274:5: (otherlv_2= RULE_FQN_PATTERN_ID )
            // InternalMSL.g:1275:6: otherlv_2= RULE_FQN_PATTERN_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getConcreteSystemRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_FQN_PATTERN_ID,FOLLOW_35); 

            						newLeafNode(otherlv_2, grammarAccess.getConcreteSystemAccess().getBindingsSystemBindingCrossReference_2_0_0());
            					

            }


            }

            // InternalMSL.g:1286:4: (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMSL.g:1287:5: otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_27); 

            	    					newLeafNode(otherlv_3, grammarAccess.getConcreteSystemAccess().getCommaKeyword_2_1_0());
            	    				
            	    // InternalMSL.g:1291:5: ( (otherlv_4= RULE_FQN_PATTERN_ID ) )
            	    // InternalMSL.g:1292:6: (otherlv_4= RULE_FQN_PATTERN_ID )
            	    {
            	    // InternalMSL.g:1292:6: (otherlv_4= RULE_FQN_PATTERN_ID )
            	    // InternalMSL.g:1293:7: otherlv_4= RULE_FQN_PATTERN_ID
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
            	    break loop24;
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
    // InternalMSL.g:1310:1: entryRuleConcreteGroup returns [EObject current=null] : iv_ruleConcreteGroup= ruleConcreteGroup EOF ;
    public final EObject entryRuleConcreteGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteGroup = null;


        try {
            // InternalMSL.g:1310:54: (iv_ruleConcreteGroup= ruleConcreteGroup EOF )
            // InternalMSL.g:1311:2: iv_ruleConcreteGroup= ruleConcreteGroup EOF
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
    // InternalMSL.g:1317:1: ruleConcreteGroup returns [EObject current=null] : ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) otherlv_5= '{' (otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) ) )? (otherlv_8= 'managedGrp' ( (otherlv_9= RULE_INSTANCE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_INSTANCE_ID ) ) )* )? otherlv_12= 'components' ( (lv_components_13_0= ruleComponentInstance ) ) (otherlv_14= ',' ( (lv_components_15_0= ruleComponentInstance ) ) )* otherlv_16= '}' ) ;
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
            // InternalMSL.g:1323:2: ( ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) otherlv_5= '{' (otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) ) )? (otherlv_8= 'managedGrp' ( (otherlv_9= RULE_INSTANCE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_INSTANCE_ID ) ) )* )? otherlv_12= 'components' ( (lv_components_13_0= ruleComponentInstance ) ) (otherlv_14= ',' ( (lv_components_15_0= ruleComponentInstance ) ) )* otherlv_16= '}' ) )
            // InternalMSL.g:1324:2: ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) otherlv_5= '{' (otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) ) )? (otherlv_8= 'managedGrp' ( (otherlv_9= RULE_INSTANCE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_INSTANCE_ID ) ) )* )? otherlv_12= 'components' ( (lv_components_13_0= ruleComponentInstance ) ) (otherlv_14= ',' ( (lv_components_15_0= ruleComponentInstance ) ) )* otherlv_16= '}' )
            {
            // InternalMSL.g:1324:2: ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) otherlv_5= '{' (otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) ) )? (otherlv_8= 'managedGrp' ( (otherlv_9= RULE_INSTANCE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_INSTANCE_ID ) ) )* )? otherlv_12= 'components' ( (lv_components_13_0= ruleComponentInstance ) ) (otherlv_14= ',' ( (lv_components_15_0= ruleComponentInstance ) ) )* otherlv_16= '}' )
            // InternalMSL.g:1325:3: ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* ) otherlv_5= '{' (otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) ) )? (otherlv_8= 'managedGrp' ( (otherlv_9= RULE_INSTANCE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_INSTANCE_ID ) ) )* )? otherlv_12= 'components' ( (lv_components_13_0= ruleComponentInstance ) ) (otherlv_14= ',' ( (lv_components_15_0= ruleComponentInstance ) ) )* otherlv_16= '}'
            {
            // InternalMSL.g:1325:3: ( (lv_name_0_0= RULE_INSTANCE_ID ) )
            // InternalMSL.g:1326:4: (lv_name_0_0= RULE_INSTANCE_ID )
            {
            // InternalMSL.g:1326:4: (lv_name_0_0= RULE_INSTANCE_ID )
            // InternalMSL.g:1327:5: lv_name_0_0= RULE_INSTANCE_ID
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
            		
            // InternalMSL.g:1347:3: ( ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )* )
            // InternalMSL.g:1348:4: ( (otherlv_2= RULE_FQN_PATTERN_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )*
            {
            // InternalMSL.g:1348:4: ( (otherlv_2= RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:1349:5: (otherlv_2= RULE_FQN_PATTERN_ID )
            {
            // InternalMSL.g:1349:5: (otherlv_2= RULE_FQN_PATTERN_ID )
            // InternalMSL.g:1350:6: otherlv_2= RULE_FQN_PATTERN_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getConcreteGroupRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_FQN_PATTERN_ID,FOLLOW_32); 

            						newLeafNode(otherlv_2, grammarAccess.getConcreteGroupAccess().getAbstractGroupsGroupBindingCrossReference_2_0_0());
            					

            }


            }

            // InternalMSL.g:1361:4: (otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMSL.g:1362:5: otherlv_3= ',' ( (otherlv_4= RULE_FQN_PATTERN_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_27); 

            	    					newLeafNode(otherlv_3, grammarAccess.getConcreteGroupAccess().getCommaKeyword_2_1_0());
            	    				
            	    // InternalMSL.g:1366:5: ( (otherlv_4= RULE_FQN_PATTERN_ID ) )
            	    // InternalMSL.g:1367:6: (otherlv_4= RULE_FQN_PATTERN_ID )
            	    {
            	    // InternalMSL.g:1367:6: (otherlv_4= RULE_FQN_PATTERN_ID )
            	    // InternalMSL.g:1368:7: otherlv_4= RULE_FQN_PATTERN_ID
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
            	    break loop25;
                }
            } while (true);


            }

            otherlv_5=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getConcreteGroupAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMSL.g:1385:3: (otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMSL.g:1386:4: otherlv_6= 'managedSyS' ( (otherlv_7= RULE_INSTANCE_ID ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_36); 

                    				newLeafNode(otherlv_6, grammarAccess.getConcreteGroupAccess().getManagedSySKeyword_4_0());
                    			
                    // InternalMSL.g:1390:4: ( (otherlv_7= RULE_INSTANCE_ID ) )
                    // InternalMSL.g:1391:5: (otherlv_7= RULE_INSTANCE_ID )
                    {
                    // InternalMSL.g:1391:5: (otherlv_7= RULE_INSTANCE_ID )
                    // InternalMSL.g:1392:6: otherlv_7= RULE_INSTANCE_ID
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

            // InternalMSL.g:1404:3: (otherlv_8= 'managedGrp' ( (otherlv_9= RULE_INSTANCE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_INSTANCE_ID ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMSL.g:1405:4: otherlv_8= 'managedGrp' ( (otherlv_9= RULE_INSTANCE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_INSTANCE_ID ) ) )*
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_36); 

                    				newLeafNode(otherlv_8, grammarAccess.getConcreteGroupAccess().getManagedGrpKeyword_5_0());
                    			
                    // InternalMSL.g:1409:4: ( (otherlv_9= RULE_INSTANCE_ID ) )
                    // InternalMSL.g:1410:5: (otherlv_9= RULE_INSTANCE_ID )
                    {
                    // InternalMSL.g:1410:5: (otherlv_9= RULE_INSTANCE_ID )
                    // InternalMSL.g:1411:6: otherlv_9= RULE_INSTANCE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConcreteGroupRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_INSTANCE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_9, grammarAccess.getConcreteGroupAccess().getManGrpConcreteGroupCrossReference_5_1_0());
                    					

                    }


                    }

                    // InternalMSL.g:1422:4: (otherlv_10= ',' ( (otherlv_11= RULE_INSTANCE_ID ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==29) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalMSL.g:1423:5: otherlv_10= ',' ( (otherlv_11= RULE_INSTANCE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,29,FOLLOW_36); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getConcreteGroupAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMSL.g:1427:5: ( (otherlv_11= RULE_INSTANCE_ID ) )
                    	    // InternalMSL.g:1428:6: (otherlv_11= RULE_INSTANCE_ID )
                    	    {
                    	    // InternalMSL.g:1428:6: (otherlv_11= RULE_INSTANCE_ID )
                    	    // InternalMSL.g:1429:7: otherlv_11= RULE_INSTANCE_ID
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
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,31,FOLLOW_36); 

            			newLeafNode(otherlv_12, grammarAccess.getConcreteGroupAccess().getComponentsKeyword_6());
            		
            // InternalMSL.g:1446:3: ( (lv_components_13_0= ruleComponentInstance ) )
            // InternalMSL.g:1447:4: (lv_components_13_0= ruleComponentInstance )
            {
            // InternalMSL.g:1447:4: (lv_components_13_0= ruleComponentInstance )
            // InternalMSL.g:1448:5: lv_components_13_0= ruleComponentInstance
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

            // InternalMSL.g:1465:3: (otherlv_14= ',' ( (lv_components_15_0= ruleComponentInstance ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==29) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMSL.g:1466:4: otherlv_14= ',' ( (lv_components_15_0= ruleComponentInstance ) )
            	    {
            	    otherlv_14=(Token)match(input,29,FOLLOW_36); 

            	    				newLeafNode(otherlv_14, grammarAccess.getConcreteGroupAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalMSL.g:1470:4: ( (lv_components_15_0= ruleComponentInstance ) )
            	    // InternalMSL.g:1471:5: (lv_components_15_0= ruleComponentInstance )
            	    {
            	    // InternalMSL.g:1471:5: (lv_components_15_0= ruleComponentInstance )
            	    // InternalMSL.g:1472:6: lv_components_15_0= ruleComponentInstance
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
            	    break loop29;
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
    // InternalMSL.g:1498:1: entryRuleComponentInstance returns [EObject current=null] : iv_ruleComponentInstance= ruleComponentInstance EOF ;
    public final EObject entryRuleComponentInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInstance = null;


        try {
            // InternalMSL.g:1498:58: (iv_ruleComponentInstance= ruleComponentInstance EOF )
            // InternalMSL.g:1499:2: iv_ruleComponentInstance= ruleComponentInstance EOF
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
    // InternalMSL.g:1505:1: ruleComponentInstance returns [EObject current=null] : ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_COMPONENT_TYPE ) ) ) ;
    public final EObject ruleComponentInstance() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalMSL.g:1511:2: ( ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_COMPONENT_TYPE ) ) ) )
            // InternalMSL.g:1512:2: ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_COMPONENT_TYPE ) ) )
            {
            // InternalMSL.g:1512:2: ( ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_COMPONENT_TYPE ) ) )
            // InternalMSL.g:1513:3: ( (lv_name_0_0= RULE_INSTANCE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_COMPONENT_TYPE ) )
            {
            // InternalMSL.g:1513:3: ( (lv_name_0_0= RULE_INSTANCE_ID ) )
            // InternalMSL.g:1514:4: (lv_name_0_0= RULE_INSTANCE_ID )
            {
            // InternalMSL.g:1514:4: (lv_name_0_0= RULE_INSTANCE_ID )
            // InternalMSL.g:1515:5: lv_name_0_0= RULE_INSTANCE_ID
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
            		
            // InternalMSL.g:1535:3: ( (lv_type_2_0= RULE_COMPONENT_TYPE ) )
            // InternalMSL.g:1536:4: (lv_type_2_0= RULE_COMPONENT_TYPE )
            {
            // InternalMSL.g:1536:4: (lv_type_2_0= RULE_COMPONENT_TYPE )
            // InternalMSL.g:1537:5: lv_type_2_0= RULE_COMPONENT_TYPE
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
    // InternalMSL.g:1557:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalMSL.g:1557:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalMSL.g:1558:2: iv_ruleInteraction= ruleInteraction EOF
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
    // InternalMSL.g:1564:1: ruleInteraction returns [EObject current=null] : ( ( (lv_start_0_0= ruleComponentName ) ) otherlv_1= '->' ( (lv_end_2_0= ruleComponentName ) ) ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_start_0_0 = null;

        EObject lv_end_2_0 = null;



        	enterRule();

        try {
            // InternalMSL.g:1570:2: ( ( ( (lv_start_0_0= ruleComponentName ) ) otherlv_1= '->' ( (lv_end_2_0= ruleComponentName ) ) ) )
            // InternalMSL.g:1571:2: ( ( (lv_start_0_0= ruleComponentName ) ) otherlv_1= '->' ( (lv_end_2_0= ruleComponentName ) ) )
            {
            // InternalMSL.g:1571:2: ( ( (lv_start_0_0= ruleComponentName ) ) otherlv_1= '->' ( (lv_end_2_0= ruleComponentName ) ) )
            // InternalMSL.g:1572:3: ( (lv_start_0_0= ruleComponentName ) ) otherlv_1= '->' ( (lv_end_2_0= ruleComponentName ) )
            {
            // InternalMSL.g:1572:3: ( (lv_start_0_0= ruleComponentName ) )
            // InternalMSL.g:1573:4: (lv_start_0_0= ruleComponentName )
            {
            // InternalMSL.g:1573:4: (lv_start_0_0= ruleComponentName )
            // InternalMSL.g:1574:5: lv_start_0_0= ruleComponentName
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

            otherlv_1=(Token)match(input,33,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getInteractionAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalMSL.g:1595:3: ( (lv_end_2_0= ruleComponentName ) )
            // InternalMSL.g:1596:4: (lv_end_2_0= ruleComponentName )
            {
            // InternalMSL.g:1596:4: (lv_end_2_0= ruleComponentName )
            // InternalMSL.g:1597:5: lv_end_2_0= ruleComponentName
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
    // InternalMSL.g:1618:1: entryRuleComponentName returns [EObject current=null] : iv_ruleComponentName= ruleComponentName EOF ;
    public final EObject entryRuleComponentName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentName = null;


        try {
            // InternalMSL.g:1618:54: (iv_ruleComponentName= ruleComponentName EOF )
            // InternalMSL.g:1619:2: iv_ruleComponentName= ruleComponentName EOF
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
    // InternalMSL.g:1625:1: ruleComponentName returns [EObject current=null] : ( (otherlv_0= RULE_FQN_INSTANCE_ID ) ) ;
    public final EObject ruleComponentName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMSL.g:1631:2: ( ( (otherlv_0= RULE_FQN_INSTANCE_ID ) ) )
            // InternalMSL.g:1632:2: ( (otherlv_0= RULE_FQN_INSTANCE_ID ) )
            {
            // InternalMSL.g:1632:2: ( (otherlv_0= RULE_FQN_INSTANCE_ID ) )
            // InternalMSL.g:1633:3: (otherlv_0= RULE_FQN_INSTANCE_ID )
            {
            // InternalMSL.g:1633:3: (otherlv_0= RULE_FQN_INSTANCE_ID )
            // InternalMSL.g:1634:4: otherlv_0= RULE_FQN_INSTANCE_ID
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


    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\12\1\42\1\uffff\1\11\1\12\1\11\1\uffff\1\12";
    static final String dfa_3s = "\1\26\1\42\1\uffff\1\11\1\35\1\11\1\uffff\1\35";
    static final String dfa_4s = "\2\uffff\1\2\3\uffff\1\1\1\uffff";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\12\uffff\1\2",
            "\1\3",
            "",
            "\1\4",
            "\2\6\11\uffff\1\2\1\6\6\uffff\1\5",
            "\1\7",
            "",
            "\2\6\11\uffff\1\2\1\6\6\uffff\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 1170:3: ( (lv_concreteSystems_7_0= ruleConcreteSystem ) )*";
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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000D0000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000C1000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
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
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000400C00L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000800L});

}