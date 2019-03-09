package org.xtext.msl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.msl.services.MSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PATTERN_ID", "RULE_COMPONENT_TYPE", "RULE_MULTIPLICITY", "RULE_FQN_COMPONENT", "RULE_FQN_PATTERN_ID", "RULE_INSTANCE_ID", "RULE_DECIMAL", "RULE_FQN_INSTANCE_ID", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'s'", "'ms'", "'us'", "'ns'", "'min'", "'hrs'", "'dys'", "'import'", "'abstract'", "'pattern'", "'{'", "'}'", "'system'", "'['", "']'", "'group'", "'components'", "'managedSyS'", "'managedGrp'", "','", "'interaction'", "'->'", "':'", "'concrete'", "'concretizationOf'", "'configuration'", "'instanceOf'", "'='"
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
        

    public String[] getTokenNames() { return InternalMSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMSL.g"; }


    	private MSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(MSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSpecification"
    // InternalMSL.g:53:1: entryRuleSpecification : ruleSpecification EOF ;
    public final void entryRuleSpecification() throws RecognitionException {
        try {
            // InternalMSL.g:54:1: ( ruleSpecification EOF )
            // InternalMSL.g:55:1: ruleSpecification EOF
            {
             before(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecification();

            state._fsp--;

             after(grammarAccess.getSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalMSL.g:62:1: ruleSpecification : ( ( rule__Specification__Group__0 ) ) ;
    public final void ruleSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:66:2: ( ( ( rule__Specification__Group__0 ) ) )
            // InternalMSL.g:67:2: ( ( rule__Specification__Group__0 ) )
            {
            // InternalMSL.g:67:2: ( ( rule__Specification__Group__0 ) )
            // InternalMSL.g:68:3: ( rule__Specification__Group__0 )
            {
             before(grammarAccess.getSpecificationAccess().getGroup()); 
            // InternalMSL.g:69:3: ( rule__Specification__Group__0 )
            // InternalMSL.g:69:4: rule__Specification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Specification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleImport"
    // InternalMSL.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMSL.g:79:1: ( ruleImport EOF )
            // InternalMSL.g:80:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMSL.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMSL.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMSL.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalMSL.g:93:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalMSL.g:94:3: ( rule__Import__Group__0 )
            // InternalMSL.g:94:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleAbstractPattern"
    // InternalMSL.g:103:1: entryRuleAbstractPattern : ruleAbstractPattern EOF ;
    public final void entryRuleAbstractPattern() throws RecognitionException {
        try {
            // InternalMSL.g:104:1: ( ruleAbstractPattern EOF )
            // InternalMSL.g:105:1: ruleAbstractPattern EOF
            {
             before(grammarAccess.getAbstractPatternRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractPattern();

            state._fsp--;

             after(grammarAccess.getAbstractPatternRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractPattern"


    // $ANTLR start "ruleAbstractPattern"
    // InternalMSL.g:112:1: ruleAbstractPattern : ( ( rule__AbstractPattern__Group__0 ) ) ;
    public final void ruleAbstractPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:116:2: ( ( ( rule__AbstractPattern__Group__0 ) ) )
            // InternalMSL.g:117:2: ( ( rule__AbstractPattern__Group__0 ) )
            {
            // InternalMSL.g:117:2: ( ( rule__AbstractPattern__Group__0 ) )
            // InternalMSL.g:118:3: ( rule__AbstractPattern__Group__0 )
            {
             before(grammarAccess.getAbstractPatternAccess().getGroup()); 
            // InternalMSL.g:119:3: ( rule__AbstractPattern__Group__0 )
            // InternalMSL.g:119:4: rule__AbstractPattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractPattern"


    // $ANTLR start "entryRuleAbstractSystem"
    // InternalMSL.g:128:1: entryRuleAbstractSystem : ruleAbstractSystem EOF ;
    public final void entryRuleAbstractSystem() throws RecognitionException {
        try {
            // InternalMSL.g:129:1: ( ruleAbstractSystem EOF )
            // InternalMSL.g:130:1: ruleAbstractSystem EOF
            {
             before(grammarAccess.getAbstractSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractSystem();

            state._fsp--;

             after(grammarAccess.getAbstractSystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractSystem"


    // $ANTLR start "ruleAbstractSystem"
    // InternalMSL.g:137:1: ruleAbstractSystem : ( ( rule__AbstractSystem__Group__0 ) ) ;
    public final void ruleAbstractSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:141:2: ( ( ( rule__AbstractSystem__Group__0 ) ) )
            // InternalMSL.g:142:2: ( ( rule__AbstractSystem__Group__0 ) )
            {
            // InternalMSL.g:142:2: ( ( rule__AbstractSystem__Group__0 ) )
            // InternalMSL.g:143:3: ( rule__AbstractSystem__Group__0 )
            {
             before(grammarAccess.getAbstractSystemAccess().getGroup()); 
            // InternalMSL.g:144:3: ( rule__AbstractSystem__Group__0 )
            // InternalMSL.g:144:4: rule__AbstractSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractSystem"


    // $ANTLR start "entryRuleAbstractComponent"
    // InternalMSL.g:153:1: entryRuleAbstractComponent : ruleAbstractComponent EOF ;
    public final void entryRuleAbstractComponent() throws RecognitionException {
        try {
            // InternalMSL.g:154:1: ( ruleAbstractComponent EOF )
            // InternalMSL.g:155:1: ruleAbstractComponent EOF
            {
             before(grammarAccess.getAbstractComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractComponent();

            state._fsp--;

             after(grammarAccess.getAbstractComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractComponent"


    // $ANTLR start "ruleAbstractComponent"
    // InternalMSL.g:162:1: ruleAbstractComponent : ( ( rule__AbstractComponent__NameAssignment ) ) ;
    public final void ruleAbstractComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:166:2: ( ( ( rule__AbstractComponent__NameAssignment ) ) )
            // InternalMSL.g:167:2: ( ( rule__AbstractComponent__NameAssignment ) )
            {
            // InternalMSL.g:167:2: ( ( rule__AbstractComponent__NameAssignment ) )
            // InternalMSL.g:168:3: ( rule__AbstractComponent__NameAssignment )
            {
             before(grammarAccess.getAbstractComponentAccess().getNameAssignment()); 
            // InternalMSL.g:169:3: ( rule__AbstractComponent__NameAssignment )
            // InternalMSL.g:169:4: rule__AbstractComponent__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__AbstractComponent__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAbstractComponentAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractComponent"


    // $ANTLR start "entryRuleGroupDef"
    // InternalMSL.g:178:1: entryRuleGroupDef : ruleGroupDef EOF ;
    public final void entryRuleGroupDef() throws RecognitionException {
        try {
            // InternalMSL.g:179:1: ( ruleGroupDef EOF )
            // InternalMSL.g:180:1: ruleGroupDef EOF
            {
             before(grammarAccess.getGroupDefRule()); 
            pushFollow(FOLLOW_1);
            ruleGroupDef();

            state._fsp--;

             after(grammarAccess.getGroupDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroupDef"


    // $ANTLR start "ruleGroupDef"
    // InternalMSL.g:187:1: ruleGroupDef : ( ( rule__GroupDef__Group__0 ) ) ;
    public final void ruleGroupDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:191:2: ( ( ( rule__GroupDef__Group__0 ) ) )
            // InternalMSL.g:192:2: ( ( rule__GroupDef__Group__0 ) )
            {
            // InternalMSL.g:192:2: ( ( rule__GroupDef__Group__0 ) )
            // InternalMSL.g:193:3: ( rule__GroupDef__Group__0 )
            {
             before(grammarAccess.getGroupDefAccess().getGroup()); 
            // InternalMSL.g:194:3: ( rule__GroupDef__Group__0 )
            // InternalMSL.g:194:4: rule__GroupDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroupDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupDef"


    // $ANTLR start "entryRuleAbstractGroup"
    // InternalMSL.g:203:1: entryRuleAbstractGroup : ruleAbstractGroup EOF ;
    public final void entryRuleAbstractGroup() throws RecognitionException {
        try {
            // InternalMSL.g:204:1: ( ruleAbstractGroup EOF )
            // InternalMSL.g:205:1: ruleAbstractGroup EOF
            {
             before(grammarAccess.getAbstractGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractGroup();

            state._fsp--;

             after(grammarAccess.getAbstractGroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractGroup"


    // $ANTLR start "ruleAbstractGroup"
    // InternalMSL.g:212:1: ruleAbstractGroup : ( ( rule__AbstractGroup__Group__0 ) ) ;
    public final void ruleAbstractGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:216:2: ( ( ( rule__AbstractGroup__Group__0 ) ) )
            // InternalMSL.g:217:2: ( ( rule__AbstractGroup__Group__0 ) )
            {
            // InternalMSL.g:217:2: ( ( rule__AbstractGroup__Group__0 ) )
            // InternalMSL.g:218:3: ( rule__AbstractGroup__Group__0 )
            {
             before(grammarAccess.getAbstractGroupAccess().getGroup()); 
            // InternalMSL.g:219:3: ( rule__AbstractGroup__Group__0 )
            // InternalMSL.g:219:4: rule__AbstractGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractGroup"


    // $ANTLR start "entryRuleAbstractInteraction"
    // InternalMSL.g:228:1: entryRuleAbstractInteraction : ruleAbstractInteraction EOF ;
    public final void entryRuleAbstractInteraction() throws RecognitionException {
        try {
            // InternalMSL.g:229:1: ( ruleAbstractInteraction EOF )
            // InternalMSL.g:230:1: ruleAbstractInteraction EOF
            {
             before(grammarAccess.getAbstractInteractionRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractInteraction();

            state._fsp--;

             after(grammarAccess.getAbstractInteractionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractInteraction"


    // $ANTLR start "ruleAbstractInteraction"
    // InternalMSL.g:237:1: ruleAbstractInteraction : ( ( rule__AbstractInteraction__Group__0 ) ) ;
    public final void ruleAbstractInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:241:2: ( ( ( rule__AbstractInteraction__Group__0 ) ) )
            // InternalMSL.g:242:2: ( ( rule__AbstractInteraction__Group__0 ) )
            {
            // InternalMSL.g:242:2: ( ( rule__AbstractInteraction__Group__0 ) )
            // InternalMSL.g:243:3: ( rule__AbstractInteraction__Group__0 )
            {
             before(grammarAccess.getAbstractInteractionAccess().getGroup()); 
            // InternalMSL.g:244:3: ( rule__AbstractInteraction__Group__0 )
            // InternalMSL.g:244:4: rule__AbstractInteraction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractInteraction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractInteractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractInteraction"


    // $ANTLR start "entryRuleAbstractComponentName"
    // InternalMSL.g:253:1: entryRuleAbstractComponentName : ruleAbstractComponentName EOF ;
    public final void entryRuleAbstractComponentName() throws RecognitionException {
        try {
            // InternalMSL.g:254:1: ( ruleAbstractComponentName EOF )
            // InternalMSL.g:255:1: ruleAbstractComponentName EOF
            {
             before(grammarAccess.getAbstractComponentNameRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractComponentName();

            state._fsp--;

             after(grammarAccess.getAbstractComponentNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractComponentName"


    // $ANTLR start "ruleAbstractComponentName"
    // InternalMSL.g:262:1: ruleAbstractComponentName : ( ( rule__AbstractComponentName__TypeAssignment ) ) ;
    public final void ruleAbstractComponentName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:266:2: ( ( ( rule__AbstractComponentName__TypeAssignment ) ) )
            // InternalMSL.g:267:2: ( ( rule__AbstractComponentName__TypeAssignment ) )
            {
            // InternalMSL.g:267:2: ( ( rule__AbstractComponentName__TypeAssignment ) )
            // InternalMSL.g:268:3: ( rule__AbstractComponentName__TypeAssignment )
            {
             before(grammarAccess.getAbstractComponentNameAccess().getTypeAssignment()); 
            // InternalMSL.g:269:3: ( rule__AbstractComponentName__TypeAssignment )
            // InternalMSL.g:269:4: rule__AbstractComponentName__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__AbstractComponentName__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAbstractComponentNameAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractComponentName"


    // $ANTLR start "entryRuleSystemBinding"
    // InternalMSL.g:278:1: entryRuleSystemBinding : ruleSystemBinding EOF ;
    public final void entryRuleSystemBinding() throws RecognitionException {
        try {
            // InternalMSL.g:279:1: ( ruleSystemBinding EOF )
            // InternalMSL.g:280:1: ruleSystemBinding EOF
            {
             before(grammarAccess.getSystemBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemBinding();

            state._fsp--;

             after(grammarAccess.getSystemBindingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystemBinding"


    // $ANTLR start "ruleSystemBinding"
    // InternalMSL.g:287:1: ruleSystemBinding : ( ( rule__SystemBinding__Group__0 ) ) ;
    public final void ruleSystemBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:291:2: ( ( ( rule__SystemBinding__Group__0 ) ) )
            // InternalMSL.g:292:2: ( ( rule__SystemBinding__Group__0 ) )
            {
            // InternalMSL.g:292:2: ( ( rule__SystemBinding__Group__0 ) )
            // InternalMSL.g:293:3: ( rule__SystemBinding__Group__0 )
            {
             before(grammarAccess.getSystemBindingAccess().getGroup()); 
            // InternalMSL.g:294:3: ( rule__SystemBinding__Group__0 )
            // InternalMSL.g:294:4: rule__SystemBinding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemBinding"


    // $ANTLR start "entryRuleGroupBinding"
    // InternalMSL.g:303:1: entryRuleGroupBinding : ruleGroupBinding EOF ;
    public final void entryRuleGroupBinding() throws RecognitionException {
        try {
            // InternalMSL.g:304:1: ( ruleGroupBinding EOF )
            // InternalMSL.g:305:1: ruleGroupBinding EOF
            {
             before(grammarAccess.getGroupBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleGroupBinding();

            state._fsp--;

             after(grammarAccess.getGroupBindingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroupBinding"


    // $ANTLR start "ruleGroupBinding"
    // InternalMSL.g:312:1: ruleGroupBinding : ( ( rule__GroupBinding__Group__0 ) ) ;
    public final void ruleGroupBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:316:2: ( ( ( rule__GroupBinding__Group__0 ) ) )
            // InternalMSL.g:317:2: ( ( rule__GroupBinding__Group__0 ) )
            {
            // InternalMSL.g:317:2: ( ( rule__GroupBinding__Group__0 ) )
            // InternalMSL.g:318:3: ( rule__GroupBinding__Group__0 )
            {
             before(grammarAccess.getGroupBindingAccess().getGroup()); 
            // InternalMSL.g:319:3: ( rule__GroupBinding__Group__0 )
            // InternalMSL.g:319:4: rule__GroupBinding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroupBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupBinding"


    // $ANTLR start "entryRulePattern"
    // InternalMSL.g:328:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalMSL.g:329:1: ( rulePattern EOF )
            // InternalMSL.g:330:1: rulePattern EOF
            {
             before(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalMSL.g:337:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:341:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalMSL.g:342:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalMSL.g:342:2: ( ( rule__Pattern__Group__0 ) )
            // InternalMSL.g:343:3: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // InternalMSL.g:344:3: ( rule__Pattern__Group__0 )
            // InternalMSL.g:344:4: rule__Pattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleConfiguration"
    // InternalMSL.g:353:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // InternalMSL.g:354:1: ( ruleConfiguration EOF )
            // InternalMSL.g:355:1: ruleConfiguration EOF
            {
             before(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getConfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalMSL.g:362:1: ruleConfiguration : ( ( rule__Configuration__Group__0 ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:366:2: ( ( ( rule__Configuration__Group__0 ) ) )
            // InternalMSL.g:367:2: ( ( rule__Configuration__Group__0 ) )
            {
            // InternalMSL.g:367:2: ( ( rule__Configuration__Group__0 ) )
            // InternalMSL.g:368:3: ( rule__Configuration__Group__0 )
            {
             before(grammarAccess.getConfigurationAccess().getGroup()); 
            // InternalMSL.g:369:3: ( rule__Configuration__Group__0 )
            // InternalMSL.g:369:4: rule__Configuration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleConcreteSystem"
    // InternalMSL.g:378:1: entryRuleConcreteSystem : ruleConcreteSystem EOF ;
    public final void entryRuleConcreteSystem() throws RecognitionException {
        try {
            // InternalMSL.g:379:1: ( ruleConcreteSystem EOF )
            // InternalMSL.g:380:1: ruleConcreteSystem EOF
            {
             before(grammarAccess.getConcreteSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleConcreteSystem();

            state._fsp--;

             after(grammarAccess.getConcreteSystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConcreteSystem"


    // $ANTLR start "ruleConcreteSystem"
    // InternalMSL.g:387:1: ruleConcreteSystem : ( ( rule__ConcreteSystem__Group__0 ) ) ;
    public final void ruleConcreteSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:391:2: ( ( ( rule__ConcreteSystem__Group__0 ) ) )
            // InternalMSL.g:392:2: ( ( rule__ConcreteSystem__Group__0 ) )
            {
            // InternalMSL.g:392:2: ( ( rule__ConcreteSystem__Group__0 ) )
            // InternalMSL.g:393:3: ( rule__ConcreteSystem__Group__0 )
            {
             before(grammarAccess.getConcreteSystemAccess().getGroup()); 
            // InternalMSL.g:394:3: ( rule__ConcreteSystem__Group__0 )
            // InternalMSL.g:394:4: rule__ConcreteSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConcreteSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConcreteSystem"


    // $ANTLR start "entryRuleConcreteGroup"
    // InternalMSL.g:403:1: entryRuleConcreteGroup : ruleConcreteGroup EOF ;
    public final void entryRuleConcreteGroup() throws RecognitionException {
        try {
            // InternalMSL.g:404:1: ( ruleConcreteGroup EOF )
            // InternalMSL.g:405:1: ruleConcreteGroup EOF
            {
             before(grammarAccess.getConcreteGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleConcreteGroup();

            state._fsp--;

             after(grammarAccess.getConcreteGroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConcreteGroup"


    // $ANTLR start "ruleConcreteGroup"
    // InternalMSL.g:412:1: ruleConcreteGroup : ( ( rule__ConcreteGroup__Group__0 ) ) ;
    public final void ruleConcreteGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:416:2: ( ( ( rule__ConcreteGroup__Group__0 ) ) )
            // InternalMSL.g:417:2: ( ( rule__ConcreteGroup__Group__0 ) )
            {
            // InternalMSL.g:417:2: ( ( rule__ConcreteGroup__Group__0 ) )
            // InternalMSL.g:418:3: ( rule__ConcreteGroup__Group__0 )
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup()); 
            // InternalMSL.g:419:3: ( rule__ConcreteGroup__Group__0 )
            // InternalMSL.g:419:4: rule__ConcreteGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConcreteGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConcreteGroup"


    // $ANTLR start "entryRuleParamValue"
    // InternalMSL.g:428:1: entryRuleParamValue : ruleParamValue EOF ;
    public final void entryRuleParamValue() throws RecognitionException {
        try {
            // InternalMSL.g:429:1: ( ruleParamValue EOF )
            // InternalMSL.g:430:1: ruleParamValue EOF
            {
             before(grammarAccess.getParamValueRule()); 
            pushFollow(FOLLOW_1);
            ruleParamValue();

            state._fsp--;

             after(grammarAccess.getParamValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParamValue"


    // $ANTLR start "ruleParamValue"
    // InternalMSL.g:437:1: ruleParamValue : ( ( rule__ParamValue__Group__0 ) ) ;
    public final void ruleParamValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:441:2: ( ( ( rule__ParamValue__Group__0 ) ) )
            // InternalMSL.g:442:2: ( ( rule__ParamValue__Group__0 ) )
            {
            // InternalMSL.g:442:2: ( ( rule__ParamValue__Group__0 ) )
            // InternalMSL.g:443:3: ( rule__ParamValue__Group__0 )
            {
             before(grammarAccess.getParamValueAccess().getGroup()); 
            // InternalMSL.g:444:3: ( rule__ParamValue__Group__0 )
            // InternalMSL.g:444:4: rule__ParamValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParamValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParamValue"


    // $ANTLR start "entryRuleComponentInstance"
    // InternalMSL.g:453:1: entryRuleComponentInstance : ruleComponentInstance EOF ;
    public final void entryRuleComponentInstance() throws RecognitionException {
        try {
            // InternalMSL.g:454:1: ( ruleComponentInstance EOF )
            // InternalMSL.g:455:1: ruleComponentInstance EOF
            {
             before(grammarAccess.getComponentInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentInstance();

            state._fsp--;

             after(grammarAccess.getComponentInstanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentInstance"


    // $ANTLR start "ruleComponentInstance"
    // InternalMSL.g:462:1: ruleComponentInstance : ( ( rule__ComponentInstance__Group__0 ) ) ;
    public final void ruleComponentInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:466:2: ( ( ( rule__ComponentInstance__Group__0 ) ) )
            // InternalMSL.g:467:2: ( ( rule__ComponentInstance__Group__0 ) )
            {
            // InternalMSL.g:467:2: ( ( rule__ComponentInstance__Group__0 ) )
            // InternalMSL.g:468:3: ( rule__ComponentInstance__Group__0 )
            {
             before(grammarAccess.getComponentInstanceAccess().getGroup()); 
            // InternalMSL.g:469:3: ( rule__ComponentInstance__Group__0 )
            // InternalMSL.g:469:4: rule__ComponentInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentInstance"


    // $ANTLR start "entryRuleInteraction"
    // InternalMSL.g:478:1: entryRuleInteraction : ruleInteraction EOF ;
    public final void entryRuleInteraction() throws RecognitionException {
        try {
            // InternalMSL.g:479:1: ( ruleInteraction EOF )
            // InternalMSL.g:480:1: ruleInteraction EOF
            {
             before(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_1);
            ruleInteraction();

            state._fsp--;

             after(grammarAccess.getInteractionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalMSL.g:487:1: ruleInteraction : ( ( rule__Interaction__Group__0 ) ) ;
    public final void ruleInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:491:2: ( ( ( rule__Interaction__Group__0 ) ) )
            // InternalMSL.g:492:2: ( ( rule__Interaction__Group__0 ) )
            {
            // InternalMSL.g:492:2: ( ( rule__Interaction__Group__0 ) )
            // InternalMSL.g:493:3: ( rule__Interaction__Group__0 )
            {
             before(grammarAccess.getInteractionAccess().getGroup()); 
            // InternalMSL.g:494:3: ( rule__Interaction__Group__0 )
            // InternalMSL.g:494:4: rule__Interaction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleComponentName"
    // InternalMSL.g:503:1: entryRuleComponentName : ruleComponentName EOF ;
    public final void entryRuleComponentName() throws RecognitionException {
        try {
            // InternalMSL.g:504:1: ( ruleComponentName EOF )
            // InternalMSL.g:505:1: ruleComponentName EOF
            {
             before(grammarAccess.getComponentNameRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentName();

            state._fsp--;

             after(grammarAccess.getComponentNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentName"


    // $ANTLR start "ruleComponentName"
    // InternalMSL.g:512:1: ruleComponentName : ( ( rule__ComponentName__ComponentAssignment ) ) ;
    public final void ruleComponentName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:516:2: ( ( ( rule__ComponentName__ComponentAssignment ) ) )
            // InternalMSL.g:517:2: ( ( rule__ComponentName__ComponentAssignment ) )
            {
            // InternalMSL.g:517:2: ( ( rule__ComponentName__ComponentAssignment ) )
            // InternalMSL.g:518:3: ( rule__ComponentName__ComponentAssignment )
            {
             before(grammarAccess.getComponentNameAccess().getComponentAssignment()); 
            // InternalMSL.g:519:3: ( rule__ComponentName__ComponentAssignment )
            // InternalMSL.g:519:4: rule__ComponentName__ComponentAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ComponentName__ComponentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getComponentNameAccess().getComponentAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentName"


    // $ANTLR start "ruleTimeUnitKind"
    // InternalMSL.g:528:1: ruleTimeUnitKind : ( ( rule__TimeUnitKind__Alternatives ) ) ;
    public final void ruleTimeUnitKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:532:1: ( ( ( rule__TimeUnitKind__Alternatives ) ) )
            // InternalMSL.g:533:2: ( ( rule__TimeUnitKind__Alternatives ) )
            {
            // InternalMSL.g:533:2: ( ( rule__TimeUnitKind__Alternatives ) )
            // InternalMSL.g:534:3: ( rule__TimeUnitKind__Alternatives )
            {
             before(grammarAccess.getTimeUnitKindAccess().getAlternatives()); 
            // InternalMSL.g:535:3: ( rule__TimeUnitKind__Alternatives )
            // InternalMSL.g:535:4: rule__TimeUnitKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnitKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeUnitKind"


    // $ANTLR start "rule__TimeUnitKind__Alternatives"
    // InternalMSL.g:543:1: rule__TimeUnitKind__Alternatives : ( ( ( 's' ) ) | ( ( 'ms' ) ) | ( ( 'us' ) ) | ( ( 'ns' ) ) | ( ( 'min' ) ) | ( ( 'hrs' ) ) | ( ( 'dys' ) ) );
    public final void rule__TimeUnitKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:547:1: ( ( ( 's' ) ) | ( ( 'ms' ) ) | ( ( 'us' ) ) | ( ( 'ns' ) ) | ( ( 'min' ) ) | ( ( 'hrs' ) ) | ( ( 'dys' ) ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            case 22:
                {
                alt1=4;
                }
                break;
            case 23:
                {
                alt1=5;
                }
                break;
            case 24:
                {
                alt1=6;
                }
                break;
            case 25:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMSL.g:548:2: ( ( 's' ) )
                    {
                    // InternalMSL.g:548:2: ( ( 's' ) )
                    // InternalMSL.g:549:3: ( 's' )
                    {
                     before(grammarAccess.getTimeUnitKindAccess().getSECONDEnumLiteralDeclaration_0()); 
                    // InternalMSL.g:550:3: ( 's' )
                    // InternalMSL.g:550:4: 's'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitKindAccess().getSECONDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSL.g:554:2: ( ( 'ms' ) )
                    {
                    // InternalMSL.g:554:2: ( ( 'ms' ) )
                    // InternalMSL.g:555:3: ( 'ms' )
                    {
                     before(grammarAccess.getTimeUnitKindAccess().getMSECONDEnumLiteralDeclaration_1()); 
                    // InternalMSL.g:556:3: ( 'ms' )
                    // InternalMSL.g:556:4: 'ms'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitKindAccess().getMSECONDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMSL.g:560:2: ( ( 'us' ) )
                    {
                    // InternalMSL.g:560:2: ( ( 'us' ) )
                    // InternalMSL.g:561:3: ( 'us' )
                    {
                     before(grammarAccess.getTimeUnitKindAccess().getUSECONDEnumLiteralDeclaration_2()); 
                    // InternalMSL.g:562:3: ( 'us' )
                    // InternalMSL.g:562:4: 'us'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitKindAccess().getUSECONDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMSL.g:566:2: ( ( 'ns' ) )
                    {
                    // InternalMSL.g:566:2: ( ( 'ns' ) )
                    // InternalMSL.g:567:3: ( 'ns' )
                    {
                     before(grammarAccess.getTimeUnitKindAccess().getNSECONDEnumLiteralDeclaration_3()); 
                    // InternalMSL.g:568:3: ( 'ns' )
                    // InternalMSL.g:568:4: 'ns'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitKindAccess().getNSECONDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMSL.g:572:2: ( ( 'min' ) )
                    {
                    // InternalMSL.g:572:2: ( ( 'min' ) )
                    // InternalMSL.g:573:3: ( 'min' )
                    {
                     before(grammarAccess.getTimeUnitKindAccess().getMINUTEEnumLiteralDeclaration_4()); 
                    // InternalMSL.g:574:3: ( 'min' )
                    // InternalMSL.g:574:4: 'min'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitKindAccess().getMINUTEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMSL.g:578:2: ( ( 'hrs' ) )
                    {
                    // InternalMSL.g:578:2: ( ( 'hrs' ) )
                    // InternalMSL.g:579:3: ( 'hrs' )
                    {
                     before(grammarAccess.getTimeUnitKindAccess().getHOUREnumLiteralDeclaration_5()); 
                    // InternalMSL.g:580:3: ( 'hrs' )
                    // InternalMSL.g:580:4: 'hrs'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitKindAccess().getHOUREnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMSL.g:584:2: ( ( 'dys' ) )
                    {
                    // InternalMSL.g:584:2: ( ( 'dys' ) )
                    // InternalMSL.g:585:3: ( 'dys' )
                    {
                     before(grammarAccess.getTimeUnitKindAccess().getDAYEnumLiteralDeclaration_6()); 
                    // InternalMSL.g:586:3: ( 'dys' )
                    // InternalMSL.g:586:4: 'dys'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitKindAccess().getDAYEnumLiteralDeclaration_6()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUnitKind__Alternatives"


    // $ANTLR start "rule__Specification__Group__0"
    // InternalMSL.g:594:1: rule__Specification__Group__0 : rule__Specification__Group__0__Impl rule__Specification__Group__1 ;
    public final void rule__Specification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:598:1: ( rule__Specification__Group__0__Impl rule__Specification__Group__1 )
            // InternalMSL.g:599:2: rule__Specification__Group__0__Impl rule__Specification__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Specification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__0"


    // $ANTLR start "rule__Specification__Group__0__Impl"
    // InternalMSL.g:606:1: rule__Specification__Group__0__Impl : ( ( rule__Specification__ImportsAssignment_0 )* ) ;
    public final void rule__Specification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:610:1: ( ( ( rule__Specification__ImportsAssignment_0 )* ) )
            // InternalMSL.g:611:1: ( ( rule__Specification__ImportsAssignment_0 )* )
            {
            // InternalMSL.g:611:1: ( ( rule__Specification__ImportsAssignment_0 )* )
            // InternalMSL.g:612:2: ( rule__Specification__ImportsAssignment_0 )*
            {
             before(grammarAccess.getSpecificationAccess().getImportsAssignment_0()); 
            // InternalMSL.g:613:2: ( rule__Specification__ImportsAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==26) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMSL.g:613:3: rule__Specification__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Specification__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getSpecificationAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__0__Impl"


    // $ANTLR start "rule__Specification__Group__1"
    // InternalMSL.g:621:1: rule__Specification__Group__1 : rule__Specification__Group__1__Impl rule__Specification__Group__2 ;
    public final void rule__Specification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:625:1: ( rule__Specification__Group__1__Impl rule__Specification__Group__2 )
            // InternalMSL.g:626:2: rule__Specification__Group__1__Impl rule__Specification__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Specification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__1"


    // $ANTLR start "rule__Specification__Group__1__Impl"
    // InternalMSL.g:633:1: rule__Specification__Group__1__Impl : ( ( rule__Specification__AbsPatternAssignment_1 )? ) ;
    public final void rule__Specification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:637:1: ( ( ( rule__Specification__AbsPatternAssignment_1 )? ) )
            // InternalMSL.g:638:1: ( ( rule__Specification__AbsPatternAssignment_1 )? )
            {
            // InternalMSL.g:638:1: ( ( rule__Specification__AbsPatternAssignment_1 )? )
            // InternalMSL.g:639:2: ( rule__Specification__AbsPatternAssignment_1 )?
            {
             before(grammarAccess.getSpecificationAccess().getAbsPatternAssignment_1()); 
            // InternalMSL.g:640:2: ( rule__Specification__AbsPatternAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMSL.g:640:3: rule__Specification__AbsPatternAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Specification__AbsPatternAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpecificationAccess().getAbsPatternAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__1__Impl"


    // $ANTLR start "rule__Specification__Group__2"
    // InternalMSL.g:648:1: rule__Specification__Group__2 : rule__Specification__Group__2__Impl rule__Specification__Group__3 ;
    public final void rule__Specification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:652:1: ( rule__Specification__Group__2__Impl rule__Specification__Group__3 )
            // InternalMSL.g:653:2: rule__Specification__Group__2__Impl rule__Specification__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Specification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__2"


    // $ANTLR start "rule__Specification__Group__2__Impl"
    // InternalMSL.g:660:1: rule__Specification__Group__2__Impl : ( ( rule__Specification__PatternAssignment_2 )* ) ;
    public final void rule__Specification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:664:1: ( ( ( rule__Specification__PatternAssignment_2 )* ) )
            // InternalMSL.g:665:1: ( ( rule__Specification__PatternAssignment_2 )* )
            {
            // InternalMSL.g:665:1: ( ( rule__Specification__PatternAssignment_2 )* )
            // InternalMSL.g:666:2: ( rule__Specification__PatternAssignment_2 )*
            {
             before(grammarAccess.getSpecificationAccess().getPatternAssignment_2()); 
            // InternalMSL.g:667:2: ( rule__Specification__PatternAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==42) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMSL.g:667:3: rule__Specification__PatternAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Specification__PatternAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSpecificationAccess().getPatternAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__2__Impl"


    // $ANTLR start "rule__Specification__Group__3"
    // InternalMSL.g:675:1: rule__Specification__Group__3 : rule__Specification__Group__3__Impl ;
    public final void rule__Specification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:679:1: ( rule__Specification__Group__3__Impl )
            // InternalMSL.g:680:2: rule__Specification__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Specification__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__3"


    // $ANTLR start "rule__Specification__Group__3__Impl"
    // InternalMSL.g:686:1: rule__Specification__Group__3__Impl : ( ( rule__Specification__ConfigurationAssignment_3 )? ) ;
    public final void rule__Specification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:690:1: ( ( ( rule__Specification__ConfigurationAssignment_3 )? ) )
            // InternalMSL.g:691:1: ( ( rule__Specification__ConfigurationAssignment_3 )? )
            {
            // InternalMSL.g:691:1: ( ( rule__Specification__ConfigurationAssignment_3 )? )
            // InternalMSL.g:692:2: ( rule__Specification__ConfigurationAssignment_3 )?
            {
             before(grammarAccess.getSpecificationAccess().getConfigurationAssignment_3()); 
            // InternalMSL.g:693:2: ( rule__Specification__ConfigurationAssignment_3 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==44) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMSL.g:693:3: rule__Specification__ConfigurationAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Specification__ConfigurationAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpecificationAccess().getConfigurationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalMSL.g:702:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:706:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMSL.g:707:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalMSL.g:714:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:718:1: ( ( 'import' ) )
            // InternalMSL.g:719:1: ( 'import' )
            {
            // InternalMSL.g:719:1: ( 'import' )
            // InternalMSL.g:720:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalMSL.g:729:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:733:1: ( rule__Import__Group__1__Impl )
            // InternalMSL.g:734:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalMSL.g:740:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:744:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalMSL.g:745:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalMSL.g:745:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalMSL.g:746:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalMSL.g:747:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalMSL.g:747:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__AbstractPattern__Group__0"
    // InternalMSL.g:756:1: rule__AbstractPattern__Group__0 : rule__AbstractPattern__Group__0__Impl rule__AbstractPattern__Group__1 ;
    public final void rule__AbstractPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:760:1: ( rule__AbstractPattern__Group__0__Impl rule__AbstractPattern__Group__1 )
            // InternalMSL.g:761:2: rule__AbstractPattern__Group__0__Impl rule__AbstractPattern__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__AbstractPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractPattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPattern__Group__0"


    // $ANTLR start "rule__AbstractPattern__Group__0__Impl"
    // InternalMSL.g:768:1: rule__AbstractPattern__Group__0__Impl : ( 'abstract' ) ;
    public final void rule__AbstractPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:772:1: ( ( 'abstract' ) )
            // InternalMSL.g:773:1: ( 'abstract' )
            {
            // InternalMSL.g:773:1: ( 'abstract' )
            // InternalMSL.g:774:2: 'abstract'
            {
             before(grammarAccess.getAbstractPatternAccess().getAbstractKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAbstractPatternAccess().getAbstractKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPattern__Group__0__Impl"


    // $ANTLR start "rule__AbstractPattern__Group__1"
    // InternalMSL.g:783:1: rule__AbstractPattern__Group__1 : rule__AbstractPattern__Group__1__Impl rule__AbstractPattern__Group__2 ;
    public final void rule__AbstractPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:787:1: ( rule__AbstractPattern__Group__1__Impl rule__AbstractPattern__Group__2 )
            // InternalMSL.g:788:2: rule__AbstractPattern__Group__1__Impl rule__AbstractPattern__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__AbstractPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractPattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPattern__Group__1"


    // $ANTLR start "rule__AbstractPattern__Group__1__Impl"
    // InternalMSL.g:795:1: rule__AbstractPattern__Group__1__Impl : ( 'pattern' ) ;
    public final void rule__AbstractPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:799:1: ( ( 'pattern' ) )
            // InternalMSL.g:800:1: ( 'pattern' )
            {
            // InternalMSL.g:800:1: ( 'pattern' )
            // InternalMSL.g:801:2: 'pattern'
            {
             before(grammarAccess.getAbstractPatternAccess().getPatternKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAbstractPatternAccess().getPatternKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPattern__Group__1__Impl"


    // $ANTLR start "rule__AbstractPattern__Group__2"
    // InternalMSL.g:810:1: rule__AbstractPattern__Group__2 : rule__AbstractPattern__Group__2__Impl rule__AbstractPattern__Group__3 ;
    public final void rule__AbstractPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:814:1: ( rule__AbstractPattern__Group__2__Impl rule__AbstractPattern__Group__3 )
            // InternalMSL.g:815:2: rule__AbstractPattern__Group__2__Impl rule__AbstractPattern__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__AbstractPattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractPattern__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPattern__Group__2"


    // $ANTLR start "rule__AbstractPattern__Group__2__Impl"
    // InternalMSL.g:822:1: rule__AbstractPattern__Group__2__Impl : ( ( rule__AbstractPattern__NameAssignment_2 ) ) ;
    public final void rule__AbstractPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:826:1: ( ( ( rule__AbstractPattern__NameAssignment_2 ) ) )
            // InternalMSL.g:827:1: ( ( rule__AbstractPattern__NameAssignment_2 ) )
            {
            // InternalMSL.g:827:1: ( ( rule__AbstractPattern__NameAssignment_2 ) )
            // InternalMSL.g:828:2: ( rule__AbstractPattern__NameAssignment_2 )
            {
             before(grammarAccess.getAbstractPatternAccess().getNameAssignment_2()); 
            // InternalMSL.g:829:2: ( rule__AbstractPattern__NameAssignment_2 )
            // InternalMSL.g:829:3: rule__AbstractPattern__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AbstractPattern__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAbstractPatternAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPattern__Group__2__Impl"


    // $ANTLR start "rule__AbstractPattern__Group__3"
    // InternalMSL.g:837:1: rule__AbstractPattern__Group__3 : rule__AbstractPattern__Group__3__Impl rule__AbstractPattern__Group__4 ;
    public final void rule__AbstractPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:841:1: ( rule__AbstractPattern__Group__3__Impl rule__AbstractPattern__Group__4 )
            // InternalMSL.g:842:2: rule__AbstractPattern__Group__3__Impl rule__AbstractPattern__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__AbstractPattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractPattern__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPattern__Group__3"


    // $ANTLR start "rule__AbstractPattern__Group__3__Impl"
    // InternalMSL.g:849:1: rule__AbstractPattern__Group__3__Impl : ( '{' ) ;
    public final void rule__AbstractPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:853:1: ( ( '{' ) )
            // InternalMSL.g:854:1: ( '{' )
            {
            // InternalMSL.g:854:1: ( '{' )
            // InternalMSL.g:855:2: '{'
            {
             before(grammarAccess.getAbstractPatternAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAbstractPatternAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPattern__Group__3__Impl"


    // $ANTLR start "rule__AbstractPattern__Group__4"
    // InternalMSL.g:864:1: rule__AbstractPattern__Group__4 : rule__AbstractPattern__Group__4__Impl rule__AbstractPattern__Group__5 ;
    public final void rule__AbstractPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:868:1: ( rule__AbstractPattern__Group__4__Impl rule__AbstractPattern__Group__5 )
            // InternalMSL.g:869:2: rule__AbstractPattern__Group__4__Impl rule__AbstractPattern__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__AbstractPattern__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractPattern__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPattern__Group__4"


    // $ANTLR start "rule__AbstractPattern__Group__4__Impl"
    // InternalMSL.g:876:1: rule__AbstractPattern__Group__4__Impl : ( ( rule__AbstractPattern__ManagedSystemsAssignment_4 )* ) ;
    public final void rule__AbstractPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:880:1: ( ( ( rule__AbstractPattern__ManagedSystemsAssignment_4 )* ) )
            // InternalMSL.g:881:1: ( ( rule__AbstractPattern__ManagedSystemsAssignment_4 )* )
            {
            // InternalMSL.g:881:1: ( ( rule__AbstractPattern__ManagedSystemsAssignment_4 )* )
            // InternalMSL.g:882:2: ( rule__AbstractPattern__ManagedSystemsAssignment_4 )*
            {
             before(grammarAccess.getAbstractPatternAccess().getManagedSystemsAssignment_4()); 
            // InternalMSL.g:883:2: ( rule__AbstractPattern__ManagedSystemsAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==31) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMSL.g:883:3: rule__AbstractPattern__ManagedSystemsAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AbstractPattern__ManagedSystemsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAbstractPatternAccess().getManagedSystemsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPattern__Group__4__Impl"


    // $ANTLR start "rule__AbstractPattern__Group__5"
    // InternalMSL.g:891:1: rule__AbstractPattern__Group__5 : rule__AbstractPattern__Group__5__Impl rule__AbstractPattern__Group__6 ;
    public final void rule__AbstractPattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:895:1: ( rule__AbstractPattern__Group__5__Impl rule__AbstractPattern__Group__6 )
            // InternalMSL.g:896:2: rule__AbstractPattern__Group__5__Impl rule__AbstractPattern__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__AbstractPattern__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractPattern__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPattern__Group__5"


    // $ANTLR start "rule__AbstractPattern__Group__5__Impl"
    // InternalMSL.g:903:1: rule__AbstractPattern__Group__5__Impl : ( ( rule__AbstractPattern__AbstractGroupsAssignment_5 )* ) ;
    public final void rule__AbstractPattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:907:1: ( ( ( rule__AbstractPattern__AbstractGroupsAssignment_5 )* ) )
            // InternalMSL.g:908:1: ( ( rule__AbstractPattern__AbstractGroupsAssignment_5 )* )
            {
            // InternalMSL.g:908:1: ( ( rule__AbstractPattern__AbstractGroupsAssignment_5 )* )
            // InternalMSL.g:909:2: ( rule__AbstractPattern__AbstractGroupsAssignment_5 )*
            {
             before(grammarAccess.getAbstractPatternAccess().getAbstractGroupsAssignment_5()); 
            // InternalMSL.g:910:2: ( rule__AbstractPattern__AbstractGroupsAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==34) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMSL.g:910:3: rule__AbstractPattern__AbstractGroupsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AbstractPattern__AbstractGroupsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAbstractPatternAccess().getAbstractGroupsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPattern__Group__5__Impl"


    // $ANTLR start "rule__AbstractPattern__Group__6"
    // InternalMSL.g:918:1: rule__AbstractPattern__Group__6 : rule__AbstractPattern__Group__6__Impl rule__AbstractPattern__Group__7 ;
    public final void rule__AbstractPattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:922:1: ( rule__AbstractPattern__Group__6__Impl rule__AbstractPattern__Group__7 )
            // InternalMSL.g:923:2: rule__AbstractPattern__Group__6__Impl rule__AbstractPattern__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__AbstractPattern__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractPattern__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPattern__Group__6"


    // $ANTLR start "rule__AbstractPattern__Group__6__Impl"
    // InternalMSL.g:930:1: rule__AbstractPattern__Group__6__Impl : ( ( rule__AbstractPattern__InteractionsAssignment_6 )* ) ;
    public final void rule__AbstractPattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:934:1: ( ( ( rule__AbstractPattern__InteractionsAssignment_6 )* ) )
            // InternalMSL.g:935:1: ( ( rule__AbstractPattern__InteractionsAssignment_6 )* )
            {
            // InternalMSL.g:935:1: ( ( rule__AbstractPattern__InteractionsAssignment_6 )* )
            // InternalMSL.g:936:2: ( rule__AbstractPattern__InteractionsAssignment_6 )*
            {
             before(grammarAccess.getAbstractPatternAccess().getInteractionsAssignment_6()); 
            // InternalMSL.g:937:2: ( rule__AbstractPattern__InteractionsAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==39) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMSL.g:937:3: rule__AbstractPattern__InteractionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__AbstractPattern__InteractionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getAbstractPatternAccess().getInteractionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPattern__Group__6__Impl"


    // $ANTLR start "rule__AbstractPattern__Group__7"
    // InternalMSL.g:945:1: rule__AbstractPattern__Group__7 : rule__AbstractPattern__Group__7__Impl ;
    public final void rule__AbstractPattern__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:949:1: ( rule__AbstractPattern__Group__7__Impl )
            // InternalMSL.g:950:2: rule__AbstractPattern__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractPattern__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPattern__Group__7"


    // $ANTLR start "rule__AbstractPattern__Group__7__Impl"
    // InternalMSL.g:956:1: rule__AbstractPattern__Group__7__Impl : ( '}' ) ;
    public final void rule__AbstractPattern__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:960:1: ( ( '}' ) )
            // InternalMSL.g:961:1: ( '}' )
            {
            // InternalMSL.g:961:1: ( '}' )
            // InternalMSL.g:962:2: '}'
            {
             before(grammarAccess.getAbstractPatternAccess().getRightCurlyBracketKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAbstractPatternAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPattern__Group__7__Impl"


    // $ANTLR start "rule__AbstractSystem__Group__0"
    // InternalMSL.g:972:1: rule__AbstractSystem__Group__0 : rule__AbstractSystem__Group__0__Impl rule__AbstractSystem__Group__1 ;
    public final void rule__AbstractSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:976:1: ( rule__AbstractSystem__Group__0__Impl rule__AbstractSystem__Group__1 )
            // InternalMSL.g:977:2: rule__AbstractSystem__Group__0__Impl rule__AbstractSystem__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AbstractSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractSystem__Group__0"


    // $ANTLR start "rule__AbstractSystem__Group__0__Impl"
    // InternalMSL.g:984:1: rule__AbstractSystem__Group__0__Impl : ( 'system' ) ;
    public final void rule__AbstractSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:988:1: ( ( 'system' ) )
            // InternalMSL.g:989:1: ( 'system' )
            {
            // InternalMSL.g:989:1: ( 'system' )
            // InternalMSL.g:990:2: 'system'
            {
             before(grammarAccess.getAbstractSystemAccess().getSystemKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAbstractSystemAccess().getSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractSystem__Group__0__Impl"


    // $ANTLR start "rule__AbstractSystem__Group__1"
    // InternalMSL.g:999:1: rule__AbstractSystem__Group__1 : rule__AbstractSystem__Group__1__Impl ;
    public final void rule__AbstractSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1003:1: ( rule__AbstractSystem__Group__1__Impl )
            // InternalMSL.g:1004:2: rule__AbstractSystem__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractSystem__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractSystem__Group__1"


    // $ANTLR start "rule__AbstractSystem__Group__1__Impl"
    // InternalMSL.g:1010:1: rule__AbstractSystem__Group__1__Impl : ( ( rule__AbstractSystem__NameAssignment_1 ) ) ;
    public final void rule__AbstractSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1014:1: ( ( ( rule__AbstractSystem__NameAssignment_1 ) ) )
            // InternalMSL.g:1015:1: ( ( rule__AbstractSystem__NameAssignment_1 ) )
            {
            // InternalMSL.g:1015:1: ( ( rule__AbstractSystem__NameAssignment_1 ) )
            // InternalMSL.g:1016:2: ( rule__AbstractSystem__NameAssignment_1 )
            {
             before(grammarAccess.getAbstractSystemAccess().getNameAssignment_1()); 
            // InternalMSL.g:1017:2: ( rule__AbstractSystem__NameAssignment_1 )
            // InternalMSL.g:1017:3: rule__AbstractSystem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AbstractSystem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAbstractSystemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractSystem__Group__1__Impl"


    // $ANTLR start "rule__GroupDef__Group__0"
    // InternalMSL.g:1026:1: rule__GroupDef__Group__0 : rule__GroupDef__Group__0__Impl rule__GroupDef__Group__1 ;
    public final void rule__GroupDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1030:1: ( rule__GroupDef__Group__0__Impl rule__GroupDef__Group__1 )
            // InternalMSL.g:1031:2: rule__GroupDef__Group__0__Impl rule__GroupDef__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__GroupDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupDef__Group__0"


    // $ANTLR start "rule__GroupDef__Group__0__Impl"
    // InternalMSL.g:1038:1: rule__GroupDef__Group__0__Impl : ( ( rule__GroupDef__GrpAssignment_0 ) ) ;
    public final void rule__GroupDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1042:1: ( ( ( rule__GroupDef__GrpAssignment_0 ) ) )
            // InternalMSL.g:1043:1: ( ( rule__GroupDef__GrpAssignment_0 ) )
            {
            // InternalMSL.g:1043:1: ( ( rule__GroupDef__GrpAssignment_0 ) )
            // InternalMSL.g:1044:2: ( rule__GroupDef__GrpAssignment_0 )
            {
             before(grammarAccess.getGroupDefAccess().getGrpAssignment_0()); 
            // InternalMSL.g:1045:2: ( rule__GroupDef__GrpAssignment_0 )
            // InternalMSL.g:1045:3: rule__GroupDef__GrpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GroupDef__GrpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGroupDefAccess().getGrpAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupDef__Group__0__Impl"


    // $ANTLR start "rule__GroupDef__Group__1"
    // InternalMSL.g:1053:1: rule__GroupDef__Group__1 : rule__GroupDef__Group__1__Impl ;
    public final void rule__GroupDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1057:1: ( rule__GroupDef__Group__1__Impl )
            // InternalMSL.g:1058:2: rule__GroupDef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupDef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupDef__Group__1"


    // $ANTLR start "rule__GroupDef__Group__1__Impl"
    // InternalMSL.g:1064:1: rule__GroupDef__Group__1__Impl : ( ( rule__GroupDef__Group_1__0 )? ) ;
    public final void rule__GroupDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1068:1: ( ( ( rule__GroupDef__Group_1__0 )? ) )
            // InternalMSL.g:1069:1: ( ( rule__GroupDef__Group_1__0 )? )
            {
            // InternalMSL.g:1069:1: ( ( rule__GroupDef__Group_1__0 )? )
            // InternalMSL.g:1070:2: ( rule__GroupDef__Group_1__0 )?
            {
             before(grammarAccess.getGroupDefAccess().getGroup_1()); 
            // InternalMSL.g:1071:2: ( rule__GroupDef__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMSL.g:1071:3: rule__GroupDef__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GroupDef__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupDefAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupDef__Group__1__Impl"


    // $ANTLR start "rule__GroupDef__Group_1__0"
    // InternalMSL.g:1080:1: rule__GroupDef__Group_1__0 : rule__GroupDef__Group_1__0__Impl rule__GroupDef__Group_1__1 ;
    public final void rule__GroupDef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1084:1: ( rule__GroupDef__Group_1__0__Impl rule__GroupDef__Group_1__1 )
            // InternalMSL.g:1085:2: rule__GroupDef__Group_1__0__Impl rule__GroupDef__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__GroupDef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupDef__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupDef__Group_1__0"


    // $ANTLR start "rule__GroupDef__Group_1__0__Impl"
    // InternalMSL.g:1092:1: rule__GroupDef__Group_1__0__Impl : ( '[' ) ;
    public final void rule__GroupDef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1096:1: ( ( '[' ) )
            // InternalMSL.g:1097:1: ( '[' )
            {
            // InternalMSL.g:1097:1: ( '[' )
            // InternalMSL.g:1098:2: '['
            {
             before(grammarAccess.getGroupDefAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGroupDefAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupDef__Group_1__0__Impl"


    // $ANTLR start "rule__GroupDef__Group_1__1"
    // InternalMSL.g:1107:1: rule__GroupDef__Group_1__1 : rule__GroupDef__Group_1__1__Impl rule__GroupDef__Group_1__2 ;
    public final void rule__GroupDef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1111:1: ( rule__GroupDef__Group_1__1__Impl rule__GroupDef__Group_1__2 )
            // InternalMSL.g:1112:2: rule__GroupDef__Group_1__1__Impl rule__GroupDef__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__GroupDef__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupDef__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupDef__Group_1__1"


    // $ANTLR start "rule__GroupDef__Group_1__1__Impl"
    // InternalMSL.g:1119:1: rule__GroupDef__Group_1__1__Impl : ( ( rule__GroupDef__MultAssignment_1_1 ) ) ;
    public final void rule__GroupDef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1123:1: ( ( ( rule__GroupDef__MultAssignment_1_1 ) ) )
            // InternalMSL.g:1124:1: ( ( rule__GroupDef__MultAssignment_1_1 ) )
            {
            // InternalMSL.g:1124:1: ( ( rule__GroupDef__MultAssignment_1_1 ) )
            // InternalMSL.g:1125:2: ( rule__GroupDef__MultAssignment_1_1 )
            {
             before(grammarAccess.getGroupDefAccess().getMultAssignment_1_1()); 
            // InternalMSL.g:1126:2: ( rule__GroupDef__MultAssignment_1_1 )
            // InternalMSL.g:1126:3: rule__GroupDef__MultAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GroupDef__MultAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupDefAccess().getMultAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupDef__Group_1__1__Impl"


    // $ANTLR start "rule__GroupDef__Group_1__2"
    // InternalMSL.g:1134:1: rule__GroupDef__Group_1__2 : rule__GroupDef__Group_1__2__Impl ;
    public final void rule__GroupDef__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1138:1: ( rule__GroupDef__Group_1__2__Impl )
            // InternalMSL.g:1139:2: rule__GroupDef__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupDef__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupDef__Group_1__2"


    // $ANTLR start "rule__GroupDef__Group_1__2__Impl"
    // InternalMSL.g:1145:1: rule__GroupDef__Group_1__2__Impl : ( ']' ) ;
    public final void rule__GroupDef__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1149:1: ( ( ']' ) )
            // InternalMSL.g:1150:1: ( ']' )
            {
            // InternalMSL.g:1150:1: ( ']' )
            // InternalMSL.g:1151:2: ']'
            {
             before(grammarAccess.getGroupDefAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGroupDefAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupDef__Group_1__2__Impl"


    // $ANTLR start "rule__AbstractGroup__Group__0"
    // InternalMSL.g:1161:1: rule__AbstractGroup__Group__0 : rule__AbstractGroup__Group__0__Impl rule__AbstractGroup__Group__1 ;
    public final void rule__AbstractGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1165:1: ( rule__AbstractGroup__Group__0__Impl rule__AbstractGroup__Group__1 )
            // InternalMSL.g:1166:2: rule__AbstractGroup__Group__0__Impl rule__AbstractGroup__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AbstractGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group__0"


    // $ANTLR start "rule__AbstractGroup__Group__0__Impl"
    // InternalMSL.g:1173:1: rule__AbstractGroup__Group__0__Impl : ( 'group' ) ;
    public final void rule__AbstractGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1177:1: ( ( 'group' ) )
            // InternalMSL.g:1178:1: ( 'group' )
            {
            // InternalMSL.g:1178:1: ( 'group' )
            // InternalMSL.g:1179:2: 'group'
            {
             before(grammarAccess.getAbstractGroupAccess().getGroupKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAbstractGroupAccess().getGroupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group__0__Impl"


    // $ANTLR start "rule__AbstractGroup__Group__1"
    // InternalMSL.g:1188:1: rule__AbstractGroup__Group__1 : rule__AbstractGroup__Group__1__Impl rule__AbstractGroup__Group__2 ;
    public final void rule__AbstractGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1192:1: ( rule__AbstractGroup__Group__1__Impl rule__AbstractGroup__Group__2 )
            // InternalMSL.g:1193:2: rule__AbstractGroup__Group__1__Impl rule__AbstractGroup__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AbstractGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group__1"


    // $ANTLR start "rule__AbstractGroup__Group__1__Impl"
    // InternalMSL.g:1200:1: rule__AbstractGroup__Group__1__Impl : ( ( rule__AbstractGroup__NameAssignment_1 ) ) ;
    public final void rule__AbstractGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1204:1: ( ( ( rule__AbstractGroup__NameAssignment_1 ) ) )
            // InternalMSL.g:1205:1: ( ( rule__AbstractGroup__NameAssignment_1 ) )
            {
            // InternalMSL.g:1205:1: ( ( rule__AbstractGroup__NameAssignment_1 ) )
            // InternalMSL.g:1206:2: ( rule__AbstractGroup__NameAssignment_1 )
            {
             before(grammarAccess.getAbstractGroupAccess().getNameAssignment_1()); 
            // InternalMSL.g:1207:2: ( rule__AbstractGroup__NameAssignment_1 )
            // InternalMSL.g:1207:3: rule__AbstractGroup__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AbstractGroup__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAbstractGroupAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group__1__Impl"


    // $ANTLR start "rule__AbstractGroup__Group__2"
    // InternalMSL.g:1215:1: rule__AbstractGroup__Group__2 : rule__AbstractGroup__Group__2__Impl rule__AbstractGroup__Group__3 ;
    public final void rule__AbstractGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1219:1: ( rule__AbstractGroup__Group__2__Impl rule__AbstractGroup__Group__3 )
            // InternalMSL.g:1220:2: rule__AbstractGroup__Group__2__Impl rule__AbstractGroup__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__AbstractGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group__2"


    // $ANTLR start "rule__AbstractGroup__Group__2__Impl"
    // InternalMSL.g:1227:1: rule__AbstractGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__AbstractGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1231:1: ( ( '{' ) )
            // InternalMSL.g:1232:1: ( '{' )
            {
            // InternalMSL.g:1232:1: ( '{' )
            // InternalMSL.g:1233:2: '{'
            {
             before(grammarAccess.getAbstractGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAbstractGroupAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group__2__Impl"


    // $ANTLR start "rule__AbstractGroup__Group__3"
    // InternalMSL.g:1242:1: rule__AbstractGroup__Group__3 : rule__AbstractGroup__Group__3__Impl rule__AbstractGroup__Group__4 ;
    public final void rule__AbstractGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1246:1: ( rule__AbstractGroup__Group__3__Impl rule__AbstractGroup__Group__4 )
            // InternalMSL.g:1247:2: rule__AbstractGroup__Group__3__Impl rule__AbstractGroup__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__AbstractGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group__3"


    // $ANTLR start "rule__AbstractGroup__Group__3__Impl"
    // InternalMSL.g:1254:1: rule__AbstractGroup__Group__3__Impl : ( ( rule__AbstractGroup__Group_3__0 )? ) ;
    public final void rule__AbstractGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1258:1: ( ( ( rule__AbstractGroup__Group_3__0 )? ) )
            // InternalMSL.g:1259:1: ( ( rule__AbstractGroup__Group_3__0 )? )
            {
            // InternalMSL.g:1259:1: ( ( rule__AbstractGroup__Group_3__0 )? )
            // InternalMSL.g:1260:2: ( rule__AbstractGroup__Group_3__0 )?
            {
             before(grammarAccess.getAbstractGroupAccess().getGroup_3()); 
            // InternalMSL.g:1261:2: ( rule__AbstractGroup__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMSL.g:1261:3: rule__AbstractGroup__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractGroup__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbstractGroupAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group__3__Impl"


    // $ANTLR start "rule__AbstractGroup__Group__4"
    // InternalMSL.g:1269:1: rule__AbstractGroup__Group__4 : rule__AbstractGroup__Group__4__Impl rule__AbstractGroup__Group__5 ;
    public final void rule__AbstractGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1273:1: ( rule__AbstractGroup__Group__4__Impl rule__AbstractGroup__Group__5 )
            // InternalMSL.g:1274:2: rule__AbstractGroup__Group__4__Impl rule__AbstractGroup__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__AbstractGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group__4"


    // $ANTLR start "rule__AbstractGroup__Group__4__Impl"
    // InternalMSL.g:1281:1: rule__AbstractGroup__Group__4__Impl : ( ( rule__AbstractGroup__Group_4__0 )? ) ;
    public final void rule__AbstractGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1285:1: ( ( ( rule__AbstractGroup__Group_4__0 )? ) )
            // InternalMSL.g:1286:1: ( ( rule__AbstractGroup__Group_4__0 )? )
            {
            // InternalMSL.g:1286:1: ( ( rule__AbstractGroup__Group_4__0 )? )
            // InternalMSL.g:1287:2: ( rule__AbstractGroup__Group_4__0 )?
            {
             before(grammarAccess.getAbstractGroupAccess().getGroup_4()); 
            // InternalMSL.g:1288:2: ( rule__AbstractGroup__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==37) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMSL.g:1288:3: rule__AbstractGroup__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractGroup__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbstractGroupAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group__4__Impl"


    // $ANTLR start "rule__AbstractGroup__Group__5"
    // InternalMSL.g:1296:1: rule__AbstractGroup__Group__5 : rule__AbstractGroup__Group__5__Impl rule__AbstractGroup__Group__6 ;
    public final void rule__AbstractGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1300:1: ( rule__AbstractGroup__Group__5__Impl rule__AbstractGroup__Group__6 )
            // InternalMSL.g:1301:2: rule__AbstractGroup__Group__5__Impl rule__AbstractGroup__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__AbstractGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group__5"


    // $ANTLR start "rule__AbstractGroup__Group__5__Impl"
    // InternalMSL.g:1308:1: rule__AbstractGroup__Group__5__Impl : ( 'components' ) ;
    public final void rule__AbstractGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1312:1: ( ( 'components' ) )
            // InternalMSL.g:1313:1: ( 'components' )
            {
            // InternalMSL.g:1313:1: ( 'components' )
            // InternalMSL.g:1314:2: 'components'
            {
             before(grammarAccess.getAbstractGroupAccess().getComponentsKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAbstractGroupAccess().getComponentsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group__5__Impl"


    // $ANTLR start "rule__AbstractGroup__Group__6"
    // InternalMSL.g:1323:1: rule__AbstractGroup__Group__6 : rule__AbstractGroup__Group__6__Impl rule__AbstractGroup__Group__7 ;
    public final void rule__AbstractGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1327:1: ( rule__AbstractGroup__Group__6__Impl rule__AbstractGroup__Group__7 )
            // InternalMSL.g:1328:2: rule__AbstractGroup__Group__6__Impl rule__AbstractGroup__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__AbstractGroup__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group__6"


    // $ANTLR start "rule__AbstractGroup__Group__6__Impl"
    // InternalMSL.g:1335:1: rule__AbstractGroup__Group__6__Impl : ( ( rule__AbstractGroup__ComponentsAssignment_6 ) ) ;
    public final void rule__AbstractGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1339:1: ( ( ( rule__AbstractGroup__ComponentsAssignment_6 ) ) )
            // InternalMSL.g:1340:1: ( ( rule__AbstractGroup__ComponentsAssignment_6 ) )
            {
            // InternalMSL.g:1340:1: ( ( rule__AbstractGroup__ComponentsAssignment_6 ) )
            // InternalMSL.g:1341:2: ( rule__AbstractGroup__ComponentsAssignment_6 )
            {
             before(grammarAccess.getAbstractGroupAccess().getComponentsAssignment_6()); 
            // InternalMSL.g:1342:2: ( rule__AbstractGroup__ComponentsAssignment_6 )
            // InternalMSL.g:1342:3: rule__AbstractGroup__ComponentsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__AbstractGroup__ComponentsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAbstractGroupAccess().getComponentsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group__6__Impl"


    // $ANTLR start "rule__AbstractGroup__Group__7"
    // InternalMSL.g:1350:1: rule__AbstractGroup__Group__7 : rule__AbstractGroup__Group__7__Impl rule__AbstractGroup__Group__8 ;
    public final void rule__AbstractGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1354:1: ( rule__AbstractGroup__Group__7__Impl rule__AbstractGroup__Group__8 )
            // InternalMSL.g:1355:2: rule__AbstractGroup__Group__7__Impl rule__AbstractGroup__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__AbstractGroup__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group__7"


    // $ANTLR start "rule__AbstractGroup__Group__7__Impl"
    // InternalMSL.g:1362:1: rule__AbstractGroup__Group__7__Impl : ( ( rule__AbstractGroup__Group_7__0 )* ) ;
    public final void rule__AbstractGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1366:1: ( ( ( rule__AbstractGroup__Group_7__0 )* ) )
            // InternalMSL.g:1367:1: ( ( rule__AbstractGroup__Group_7__0 )* )
            {
            // InternalMSL.g:1367:1: ( ( rule__AbstractGroup__Group_7__0 )* )
            // InternalMSL.g:1368:2: ( rule__AbstractGroup__Group_7__0 )*
            {
             before(grammarAccess.getAbstractGroupAccess().getGroup_7()); 
            // InternalMSL.g:1369:2: ( rule__AbstractGroup__Group_7__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMSL.g:1369:3: rule__AbstractGroup__Group_7__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__AbstractGroup__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAbstractGroupAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group__7__Impl"


    // $ANTLR start "rule__AbstractGroup__Group__8"
    // InternalMSL.g:1377:1: rule__AbstractGroup__Group__8 : rule__AbstractGroup__Group__8__Impl ;
    public final void rule__AbstractGroup__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1381:1: ( rule__AbstractGroup__Group__8__Impl )
            // InternalMSL.g:1382:2: rule__AbstractGroup__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group__8"


    // $ANTLR start "rule__AbstractGroup__Group__8__Impl"
    // InternalMSL.g:1388:1: rule__AbstractGroup__Group__8__Impl : ( '}' ) ;
    public final void rule__AbstractGroup__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1392:1: ( ( '}' ) )
            // InternalMSL.g:1393:1: ( '}' )
            {
            // InternalMSL.g:1393:1: ( '}' )
            // InternalMSL.g:1394:2: '}'
            {
             before(grammarAccess.getAbstractGroupAccess().getRightCurlyBracketKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAbstractGroupAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group__8__Impl"


    // $ANTLR start "rule__AbstractGroup__Group_3__0"
    // InternalMSL.g:1404:1: rule__AbstractGroup__Group_3__0 : rule__AbstractGroup__Group_3__0__Impl rule__AbstractGroup__Group_3__1 ;
    public final void rule__AbstractGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1408:1: ( rule__AbstractGroup__Group_3__0__Impl rule__AbstractGroup__Group_3__1 )
            // InternalMSL.g:1409:2: rule__AbstractGroup__Group_3__0__Impl rule__AbstractGroup__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__AbstractGroup__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_3__0"


    // $ANTLR start "rule__AbstractGroup__Group_3__0__Impl"
    // InternalMSL.g:1416:1: rule__AbstractGroup__Group_3__0__Impl : ( 'managedSyS' ) ;
    public final void rule__AbstractGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1420:1: ( ( 'managedSyS' ) )
            // InternalMSL.g:1421:1: ( 'managedSyS' )
            {
            // InternalMSL.g:1421:1: ( 'managedSyS' )
            // InternalMSL.g:1422:2: 'managedSyS'
            {
             before(grammarAccess.getAbstractGroupAccess().getManagedSySKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAbstractGroupAccess().getManagedSySKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_3__0__Impl"


    // $ANTLR start "rule__AbstractGroup__Group_3__1"
    // InternalMSL.g:1431:1: rule__AbstractGroup__Group_3__1 : rule__AbstractGroup__Group_3__1__Impl ;
    public final void rule__AbstractGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1435:1: ( rule__AbstractGroup__Group_3__1__Impl )
            // InternalMSL.g:1436:2: rule__AbstractGroup__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_3__1"


    // $ANTLR start "rule__AbstractGroup__Group_3__1__Impl"
    // InternalMSL.g:1442:1: rule__AbstractGroup__Group_3__1__Impl : ( ( rule__AbstractGroup__ManSysAssignment_3_1 ) ) ;
    public final void rule__AbstractGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1446:1: ( ( ( rule__AbstractGroup__ManSysAssignment_3_1 ) ) )
            // InternalMSL.g:1447:1: ( ( rule__AbstractGroup__ManSysAssignment_3_1 ) )
            {
            // InternalMSL.g:1447:1: ( ( rule__AbstractGroup__ManSysAssignment_3_1 ) )
            // InternalMSL.g:1448:2: ( rule__AbstractGroup__ManSysAssignment_3_1 )
            {
             before(grammarAccess.getAbstractGroupAccess().getManSysAssignment_3_1()); 
            // InternalMSL.g:1449:2: ( rule__AbstractGroup__ManSysAssignment_3_1 )
            // InternalMSL.g:1449:3: rule__AbstractGroup__ManSysAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AbstractGroup__ManSysAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAbstractGroupAccess().getManSysAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_3__1__Impl"


    // $ANTLR start "rule__AbstractGroup__Group_4__0"
    // InternalMSL.g:1458:1: rule__AbstractGroup__Group_4__0 : rule__AbstractGroup__Group_4__0__Impl rule__AbstractGroup__Group_4__1 ;
    public final void rule__AbstractGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1462:1: ( rule__AbstractGroup__Group_4__0__Impl rule__AbstractGroup__Group_4__1 )
            // InternalMSL.g:1463:2: rule__AbstractGroup__Group_4__0__Impl rule__AbstractGroup__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__AbstractGroup__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_4__0"


    // $ANTLR start "rule__AbstractGroup__Group_4__0__Impl"
    // InternalMSL.g:1470:1: rule__AbstractGroup__Group_4__0__Impl : ( 'managedGrp' ) ;
    public final void rule__AbstractGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1474:1: ( ( 'managedGrp' ) )
            // InternalMSL.g:1475:1: ( 'managedGrp' )
            {
            // InternalMSL.g:1475:1: ( 'managedGrp' )
            // InternalMSL.g:1476:2: 'managedGrp'
            {
             before(grammarAccess.getAbstractGroupAccess().getManagedGrpKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAbstractGroupAccess().getManagedGrpKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_4__0__Impl"


    // $ANTLR start "rule__AbstractGroup__Group_4__1"
    // InternalMSL.g:1485:1: rule__AbstractGroup__Group_4__1 : rule__AbstractGroup__Group_4__1__Impl rule__AbstractGroup__Group_4__2 ;
    public final void rule__AbstractGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1489:1: ( rule__AbstractGroup__Group_4__1__Impl rule__AbstractGroup__Group_4__2 )
            // InternalMSL.g:1490:2: rule__AbstractGroup__Group_4__1__Impl rule__AbstractGroup__Group_4__2
            {
            pushFollow(FOLLOW_20);
            rule__AbstractGroup__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_4__1"


    // $ANTLR start "rule__AbstractGroup__Group_4__1__Impl"
    // InternalMSL.g:1497:1: rule__AbstractGroup__Group_4__1__Impl : ( ( rule__AbstractGroup__ManGrpAssignment_4_1 ) ) ;
    public final void rule__AbstractGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1501:1: ( ( ( rule__AbstractGroup__ManGrpAssignment_4_1 ) ) )
            // InternalMSL.g:1502:1: ( ( rule__AbstractGroup__ManGrpAssignment_4_1 ) )
            {
            // InternalMSL.g:1502:1: ( ( rule__AbstractGroup__ManGrpAssignment_4_1 ) )
            // InternalMSL.g:1503:2: ( rule__AbstractGroup__ManGrpAssignment_4_1 )
            {
             before(grammarAccess.getAbstractGroupAccess().getManGrpAssignment_4_1()); 
            // InternalMSL.g:1504:2: ( rule__AbstractGroup__ManGrpAssignment_4_1 )
            // InternalMSL.g:1504:3: rule__AbstractGroup__ManGrpAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AbstractGroup__ManGrpAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAbstractGroupAccess().getManGrpAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_4__1__Impl"


    // $ANTLR start "rule__AbstractGroup__Group_4__2"
    // InternalMSL.g:1512:1: rule__AbstractGroup__Group_4__2 : rule__AbstractGroup__Group_4__2__Impl ;
    public final void rule__AbstractGroup__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1516:1: ( rule__AbstractGroup__Group_4__2__Impl )
            // InternalMSL.g:1517:2: rule__AbstractGroup__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_4__2"


    // $ANTLR start "rule__AbstractGroup__Group_4__2__Impl"
    // InternalMSL.g:1523:1: rule__AbstractGroup__Group_4__2__Impl : ( ( rule__AbstractGroup__Group_4_2__0 )* ) ;
    public final void rule__AbstractGroup__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1527:1: ( ( ( rule__AbstractGroup__Group_4_2__0 )* ) )
            // InternalMSL.g:1528:1: ( ( rule__AbstractGroup__Group_4_2__0 )* )
            {
            // InternalMSL.g:1528:1: ( ( rule__AbstractGroup__Group_4_2__0 )* )
            // InternalMSL.g:1529:2: ( rule__AbstractGroup__Group_4_2__0 )*
            {
             before(grammarAccess.getAbstractGroupAccess().getGroup_4_2()); 
            // InternalMSL.g:1530:2: ( rule__AbstractGroup__Group_4_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==38) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMSL.g:1530:3: rule__AbstractGroup__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__AbstractGroup__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAbstractGroupAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_4__2__Impl"


    // $ANTLR start "rule__AbstractGroup__Group_4_2__0"
    // InternalMSL.g:1539:1: rule__AbstractGroup__Group_4_2__0 : rule__AbstractGroup__Group_4_2__0__Impl rule__AbstractGroup__Group_4_2__1 ;
    public final void rule__AbstractGroup__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1543:1: ( rule__AbstractGroup__Group_4_2__0__Impl rule__AbstractGroup__Group_4_2__1 )
            // InternalMSL.g:1544:2: rule__AbstractGroup__Group_4_2__0__Impl rule__AbstractGroup__Group_4_2__1
            {
            pushFollow(FOLLOW_6);
            rule__AbstractGroup__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_4_2__0"


    // $ANTLR start "rule__AbstractGroup__Group_4_2__0__Impl"
    // InternalMSL.g:1551:1: rule__AbstractGroup__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__AbstractGroup__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1555:1: ( ( ',' ) )
            // InternalMSL.g:1556:1: ( ',' )
            {
            // InternalMSL.g:1556:1: ( ',' )
            // InternalMSL.g:1557:2: ','
            {
             before(grammarAccess.getAbstractGroupAccess().getCommaKeyword_4_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAbstractGroupAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_4_2__0__Impl"


    // $ANTLR start "rule__AbstractGroup__Group_4_2__1"
    // InternalMSL.g:1566:1: rule__AbstractGroup__Group_4_2__1 : rule__AbstractGroup__Group_4_2__1__Impl ;
    public final void rule__AbstractGroup__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1570:1: ( rule__AbstractGroup__Group_4_2__1__Impl )
            // InternalMSL.g:1571:2: rule__AbstractGroup__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_4_2__1"


    // $ANTLR start "rule__AbstractGroup__Group_4_2__1__Impl"
    // InternalMSL.g:1577:1: rule__AbstractGroup__Group_4_2__1__Impl : ( ( rule__AbstractGroup__ManGrpAssignment_4_2_1 ) ) ;
    public final void rule__AbstractGroup__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1581:1: ( ( ( rule__AbstractGroup__ManGrpAssignment_4_2_1 ) ) )
            // InternalMSL.g:1582:1: ( ( rule__AbstractGroup__ManGrpAssignment_4_2_1 ) )
            {
            // InternalMSL.g:1582:1: ( ( rule__AbstractGroup__ManGrpAssignment_4_2_1 ) )
            // InternalMSL.g:1583:2: ( rule__AbstractGroup__ManGrpAssignment_4_2_1 )
            {
             before(grammarAccess.getAbstractGroupAccess().getManGrpAssignment_4_2_1()); 
            // InternalMSL.g:1584:2: ( rule__AbstractGroup__ManGrpAssignment_4_2_1 )
            // InternalMSL.g:1584:3: rule__AbstractGroup__ManGrpAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AbstractGroup__ManGrpAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAbstractGroupAccess().getManGrpAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_4_2__1__Impl"


    // $ANTLR start "rule__AbstractGroup__Group_7__0"
    // InternalMSL.g:1593:1: rule__AbstractGroup__Group_7__0 : rule__AbstractGroup__Group_7__0__Impl rule__AbstractGroup__Group_7__1 ;
    public final void rule__AbstractGroup__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1597:1: ( rule__AbstractGroup__Group_7__0__Impl rule__AbstractGroup__Group_7__1 )
            // InternalMSL.g:1598:2: rule__AbstractGroup__Group_7__0__Impl rule__AbstractGroup__Group_7__1
            {
            pushFollow(FOLLOW_17);
            rule__AbstractGroup__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_7__0"


    // $ANTLR start "rule__AbstractGroup__Group_7__0__Impl"
    // InternalMSL.g:1605:1: rule__AbstractGroup__Group_7__0__Impl : ( ',' ) ;
    public final void rule__AbstractGroup__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1609:1: ( ( ',' ) )
            // InternalMSL.g:1610:1: ( ',' )
            {
            // InternalMSL.g:1610:1: ( ',' )
            // InternalMSL.g:1611:2: ','
            {
             before(grammarAccess.getAbstractGroupAccess().getCommaKeyword_7_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAbstractGroupAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_7__0__Impl"


    // $ANTLR start "rule__AbstractGroup__Group_7__1"
    // InternalMSL.g:1620:1: rule__AbstractGroup__Group_7__1 : rule__AbstractGroup__Group_7__1__Impl ;
    public final void rule__AbstractGroup__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1624:1: ( rule__AbstractGroup__Group_7__1__Impl )
            // InternalMSL.g:1625:2: rule__AbstractGroup__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_7__1"


    // $ANTLR start "rule__AbstractGroup__Group_7__1__Impl"
    // InternalMSL.g:1631:1: rule__AbstractGroup__Group_7__1__Impl : ( ( rule__AbstractGroup__ComponentsAssignment_7_1 ) ) ;
    public final void rule__AbstractGroup__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1635:1: ( ( ( rule__AbstractGroup__ComponentsAssignment_7_1 ) ) )
            // InternalMSL.g:1636:1: ( ( rule__AbstractGroup__ComponentsAssignment_7_1 ) )
            {
            // InternalMSL.g:1636:1: ( ( rule__AbstractGroup__ComponentsAssignment_7_1 ) )
            // InternalMSL.g:1637:2: ( rule__AbstractGroup__ComponentsAssignment_7_1 )
            {
             before(grammarAccess.getAbstractGroupAccess().getComponentsAssignment_7_1()); 
            // InternalMSL.g:1638:2: ( rule__AbstractGroup__ComponentsAssignment_7_1 )
            // InternalMSL.g:1638:3: rule__AbstractGroup__ComponentsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__AbstractGroup__ComponentsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getAbstractGroupAccess().getComponentsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_7__1__Impl"


    // $ANTLR start "rule__AbstractInteraction__Group__0"
    // InternalMSL.g:1647:1: rule__AbstractInteraction__Group__0 : rule__AbstractInteraction__Group__0__Impl rule__AbstractInteraction__Group__1 ;
    public final void rule__AbstractInteraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1651:1: ( rule__AbstractInteraction__Group__0__Impl rule__AbstractInteraction__Group__1 )
            // InternalMSL.g:1652:2: rule__AbstractInteraction__Group__0__Impl rule__AbstractInteraction__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__AbstractInteraction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractInteraction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__Group__0"


    // $ANTLR start "rule__AbstractInteraction__Group__0__Impl"
    // InternalMSL.g:1659:1: rule__AbstractInteraction__Group__0__Impl : ( 'interaction' ) ;
    public final void rule__AbstractInteraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1663:1: ( ( 'interaction' ) )
            // InternalMSL.g:1664:1: ( 'interaction' )
            {
            // InternalMSL.g:1664:1: ( 'interaction' )
            // InternalMSL.g:1665:2: 'interaction'
            {
             before(grammarAccess.getAbstractInteractionAccess().getInteractionKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAbstractInteractionAccess().getInteractionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__Group__0__Impl"


    // $ANTLR start "rule__AbstractInteraction__Group__1"
    // InternalMSL.g:1674:1: rule__AbstractInteraction__Group__1 : rule__AbstractInteraction__Group__1__Impl rule__AbstractInteraction__Group__2 ;
    public final void rule__AbstractInteraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1678:1: ( rule__AbstractInteraction__Group__1__Impl rule__AbstractInteraction__Group__2 )
            // InternalMSL.g:1679:2: rule__AbstractInteraction__Group__1__Impl rule__AbstractInteraction__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__AbstractInteraction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractInteraction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__Group__1"


    // $ANTLR start "rule__AbstractInteraction__Group__1__Impl"
    // InternalMSL.g:1686:1: rule__AbstractInteraction__Group__1__Impl : ( ( rule__AbstractInteraction__StartAssignment_1 ) ) ;
    public final void rule__AbstractInteraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1690:1: ( ( ( rule__AbstractInteraction__StartAssignment_1 ) ) )
            // InternalMSL.g:1691:1: ( ( rule__AbstractInteraction__StartAssignment_1 ) )
            {
            // InternalMSL.g:1691:1: ( ( rule__AbstractInteraction__StartAssignment_1 ) )
            // InternalMSL.g:1692:2: ( rule__AbstractInteraction__StartAssignment_1 )
            {
             before(grammarAccess.getAbstractInteractionAccess().getStartAssignment_1()); 
            // InternalMSL.g:1693:2: ( rule__AbstractInteraction__StartAssignment_1 )
            // InternalMSL.g:1693:3: rule__AbstractInteraction__StartAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AbstractInteraction__StartAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAbstractInteractionAccess().getStartAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__Group__1__Impl"


    // $ANTLR start "rule__AbstractInteraction__Group__2"
    // InternalMSL.g:1701:1: rule__AbstractInteraction__Group__2 : rule__AbstractInteraction__Group__2__Impl rule__AbstractInteraction__Group__3 ;
    public final void rule__AbstractInteraction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1705:1: ( rule__AbstractInteraction__Group__2__Impl rule__AbstractInteraction__Group__3 )
            // InternalMSL.g:1706:2: rule__AbstractInteraction__Group__2__Impl rule__AbstractInteraction__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__AbstractInteraction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractInteraction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__Group__2"


    // $ANTLR start "rule__AbstractInteraction__Group__2__Impl"
    // InternalMSL.g:1713:1: rule__AbstractInteraction__Group__2__Impl : ( '->' ) ;
    public final void rule__AbstractInteraction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1717:1: ( ( '->' ) )
            // InternalMSL.g:1718:1: ( '->' )
            {
            // InternalMSL.g:1718:1: ( '->' )
            // InternalMSL.g:1719:2: '->'
            {
             before(grammarAccess.getAbstractInteractionAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAbstractInteractionAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__Group__2__Impl"


    // $ANTLR start "rule__AbstractInteraction__Group__3"
    // InternalMSL.g:1728:1: rule__AbstractInteraction__Group__3 : rule__AbstractInteraction__Group__3__Impl rule__AbstractInteraction__Group__4 ;
    public final void rule__AbstractInteraction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1732:1: ( rule__AbstractInteraction__Group__3__Impl rule__AbstractInteraction__Group__4 )
            // InternalMSL.g:1733:2: rule__AbstractInteraction__Group__3__Impl rule__AbstractInteraction__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__AbstractInteraction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractInteraction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__Group__3"


    // $ANTLR start "rule__AbstractInteraction__Group__3__Impl"
    // InternalMSL.g:1740:1: rule__AbstractInteraction__Group__3__Impl : ( ( rule__AbstractInteraction__EndAssignment_3 ) ) ;
    public final void rule__AbstractInteraction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1744:1: ( ( ( rule__AbstractInteraction__EndAssignment_3 ) ) )
            // InternalMSL.g:1745:1: ( ( rule__AbstractInteraction__EndAssignment_3 ) )
            {
            // InternalMSL.g:1745:1: ( ( rule__AbstractInteraction__EndAssignment_3 ) )
            // InternalMSL.g:1746:2: ( rule__AbstractInteraction__EndAssignment_3 )
            {
             before(grammarAccess.getAbstractInteractionAccess().getEndAssignment_3()); 
            // InternalMSL.g:1747:2: ( rule__AbstractInteraction__EndAssignment_3 )
            // InternalMSL.g:1747:3: rule__AbstractInteraction__EndAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AbstractInteraction__EndAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAbstractInteractionAccess().getEndAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__Group__3__Impl"


    // $ANTLR start "rule__AbstractInteraction__Group__4"
    // InternalMSL.g:1755:1: rule__AbstractInteraction__Group__4 : rule__AbstractInteraction__Group__4__Impl ;
    public final void rule__AbstractInteraction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1759:1: ( rule__AbstractInteraction__Group__4__Impl )
            // InternalMSL.g:1760:2: rule__AbstractInteraction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractInteraction__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__Group__4"


    // $ANTLR start "rule__AbstractInteraction__Group__4__Impl"
    // InternalMSL.g:1766:1: rule__AbstractInteraction__Group__4__Impl : ( ( rule__AbstractInteraction__Group_4__0 )? ) ;
    public final void rule__AbstractInteraction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1770:1: ( ( ( rule__AbstractInteraction__Group_4__0 )? ) )
            // InternalMSL.g:1771:1: ( ( rule__AbstractInteraction__Group_4__0 )? )
            {
            // InternalMSL.g:1771:1: ( ( rule__AbstractInteraction__Group_4__0 )? )
            // InternalMSL.g:1772:2: ( rule__AbstractInteraction__Group_4__0 )?
            {
             before(grammarAccess.getAbstractInteractionAccess().getGroup_4()); 
            // InternalMSL.g:1773:2: ( rule__AbstractInteraction__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMSL.g:1773:3: rule__AbstractInteraction__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractInteraction__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbstractInteractionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__Group__4__Impl"


    // $ANTLR start "rule__AbstractInteraction__Group_4__0"
    // InternalMSL.g:1782:1: rule__AbstractInteraction__Group_4__0 : rule__AbstractInteraction__Group_4__0__Impl rule__AbstractInteraction__Group_4__1 ;
    public final void rule__AbstractInteraction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1786:1: ( rule__AbstractInteraction__Group_4__0__Impl rule__AbstractInteraction__Group_4__1 )
            // InternalMSL.g:1787:2: rule__AbstractInteraction__Group_4__0__Impl rule__AbstractInteraction__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__AbstractInteraction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractInteraction__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__Group_4__0"


    // $ANTLR start "rule__AbstractInteraction__Group_4__0__Impl"
    // InternalMSL.g:1794:1: rule__AbstractInteraction__Group_4__0__Impl : ( '[' ) ;
    public final void rule__AbstractInteraction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1798:1: ( ( '[' ) )
            // InternalMSL.g:1799:1: ( '[' )
            {
            // InternalMSL.g:1799:1: ( '[' )
            // InternalMSL.g:1800:2: '['
            {
             before(grammarAccess.getAbstractInteractionAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAbstractInteractionAccess().getLeftSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__Group_4__0__Impl"


    // $ANTLR start "rule__AbstractInteraction__Group_4__1"
    // InternalMSL.g:1809:1: rule__AbstractInteraction__Group_4__1 : rule__AbstractInteraction__Group_4__1__Impl rule__AbstractInteraction__Group_4__2 ;
    public final void rule__AbstractInteraction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1813:1: ( rule__AbstractInteraction__Group_4__1__Impl rule__AbstractInteraction__Group_4__2 )
            // InternalMSL.g:1814:2: rule__AbstractInteraction__Group_4__1__Impl rule__AbstractInteraction__Group_4__2
            {
            pushFollow(FOLLOW_20);
            rule__AbstractInteraction__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractInteraction__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__Group_4__1"


    // $ANTLR start "rule__AbstractInteraction__Group_4__1__Impl"
    // InternalMSL.g:1821:1: rule__AbstractInteraction__Group_4__1__Impl : ( ( rule__AbstractInteraction__LowAssignment_4_1 ) ) ;
    public final void rule__AbstractInteraction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1825:1: ( ( ( rule__AbstractInteraction__LowAssignment_4_1 ) ) )
            // InternalMSL.g:1826:1: ( ( rule__AbstractInteraction__LowAssignment_4_1 ) )
            {
            // InternalMSL.g:1826:1: ( ( rule__AbstractInteraction__LowAssignment_4_1 ) )
            // InternalMSL.g:1827:2: ( rule__AbstractInteraction__LowAssignment_4_1 )
            {
             before(grammarAccess.getAbstractInteractionAccess().getLowAssignment_4_1()); 
            // InternalMSL.g:1828:2: ( rule__AbstractInteraction__LowAssignment_4_1 )
            // InternalMSL.g:1828:3: rule__AbstractInteraction__LowAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AbstractInteraction__LowAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAbstractInteractionAccess().getLowAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__Group_4__1__Impl"


    // $ANTLR start "rule__AbstractInteraction__Group_4__2"
    // InternalMSL.g:1836:1: rule__AbstractInteraction__Group_4__2 : rule__AbstractInteraction__Group_4__2__Impl rule__AbstractInteraction__Group_4__3 ;
    public final void rule__AbstractInteraction__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1840:1: ( rule__AbstractInteraction__Group_4__2__Impl rule__AbstractInteraction__Group_4__3 )
            // InternalMSL.g:1841:2: rule__AbstractInteraction__Group_4__2__Impl rule__AbstractInteraction__Group_4__3
            {
            pushFollow(FOLLOW_14);
            rule__AbstractInteraction__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractInteraction__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__Group_4__2"


    // $ANTLR start "rule__AbstractInteraction__Group_4__2__Impl"
    // InternalMSL.g:1848:1: rule__AbstractInteraction__Group_4__2__Impl : ( ',' ) ;
    public final void rule__AbstractInteraction__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1852:1: ( ( ',' ) )
            // InternalMSL.g:1853:1: ( ',' )
            {
            // InternalMSL.g:1853:1: ( ',' )
            // InternalMSL.g:1854:2: ','
            {
             before(grammarAccess.getAbstractInteractionAccess().getCommaKeyword_4_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAbstractInteractionAccess().getCommaKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__Group_4__2__Impl"


    // $ANTLR start "rule__AbstractInteraction__Group_4__3"
    // InternalMSL.g:1863:1: rule__AbstractInteraction__Group_4__3 : rule__AbstractInteraction__Group_4__3__Impl rule__AbstractInteraction__Group_4__4 ;
    public final void rule__AbstractInteraction__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1867:1: ( rule__AbstractInteraction__Group_4__3__Impl rule__AbstractInteraction__Group_4__4 )
            // InternalMSL.g:1868:2: rule__AbstractInteraction__Group_4__3__Impl rule__AbstractInteraction__Group_4__4
            {
            pushFollow(FOLLOW_15);
            rule__AbstractInteraction__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractInteraction__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__Group_4__3"


    // $ANTLR start "rule__AbstractInteraction__Group_4__3__Impl"
    // InternalMSL.g:1875:1: rule__AbstractInteraction__Group_4__3__Impl : ( ( rule__AbstractInteraction__HighAssignment_4_3 ) ) ;
    public final void rule__AbstractInteraction__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1879:1: ( ( ( rule__AbstractInteraction__HighAssignment_4_3 ) ) )
            // InternalMSL.g:1880:1: ( ( rule__AbstractInteraction__HighAssignment_4_3 ) )
            {
            // InternalMSL.g:1880:1: ( ( rule__AbstractInteraction__HighAssignment_4_3 ) )
            // InternalMSL.g:1881:2: ( rule__AbstractInteraction__HighAssignment_4_3 )
            {
             before(grammarAccess.getAbstractInteractionAccess().getHighAssignment_4_3()); 
            // InternalMSL.g:1882:2: ( rule__AbstractInteraction__HighAssignment_4_3 )
            // InternalMSL.g:1882:3: rule__AbstractInteraction__HighAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__AbstractInteraction__HighAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getAbstractInteractionAccess().getHighAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__Group_4__3__Impl"


    // $ANTLR start "rule__AbstractInteraction__Group_4__4"
    // InternalMSL.g:1890:1: rule__AbstractInteraction__Group_4__4 : rule__AbstractInteraction__Group_4__4__Impl ;
    public final void rule__AbstractInteraction__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1894:1: ( rule__AbstractInteraction__Group_4__4__Impl )
            // InternalMSL.g:1895:2: rule__AbstractInteraction__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractInteraction__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__Group_4__4"


    // $ANTLR start "rule__AbstractInteraction__Group_4__4__Impl"
    // InternalMSL.g:1901:1: rule__AbstractInteraction__Group_4__4__Impl : ( ']' ) ;
    public final void rule__AbstractInteraction__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1905:1: ( ( ']' ) )
            // InternalMSL.g:1906:1: ( ']' )
            {
            // InternalMSL.g:1906:1: ( ']' )
            // InternalMSL.g:1907:2: ']'
            {
             before(grammarAccess.getAbstractInteractionAccess().getRightSquareBracketKeyword_4_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAbstractInteractionAccess().getRightSquareBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__Group_4__4__Impl"


    // $ANTLR start "rule__SystemBinding__Group__0"
    // InternalMSL.g:1917:1: rule__SystemBinding__Group__0 : rule__SystemBinding__Group__0__Impl rule__SystemBinding__Group__1 ;
    public final void rule__SystemBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1921:1: ( rule__SystemBinding__Group__0__Impl rule__SystemBinding__Group__1 )
            // InternalMSL.g:1922:2: rule__SystemBinding__Group__0__Impl rule__SystemBinding__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SystemBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemBinding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemBinding__Group__0"


    // $ANTLR start "rule__SystemBinding__Group__0__Impl"
    // InternalMSL.g:1929:1: rule__SystemBinding__Group__0__Impl : ( 'system' ) ;
    public final void rule__SystemBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1933:1: ( ( 'system' ) )
            // InternalMSL.g:1934:1: ( 'system' )
            {
            // InternalMSL.g:1934:1: ( 'system' )
            // InternalMSL.g:1935:2: 'system'
            {
             before(grammarAccess.getSystemBindingAccess().getSystemKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSystemBindingAccess().getSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemBinding__Group__0__Impl"


    // $ANTLR start "rule__SystemBinding__Group__1"
    // InternalMSL.g:1944:1: rule__SystemBinding__Group__1 : rule__SystemBinding__Group__1__Impl rule__SystemBinding__Group__2 ;
    public final void rule__SystemBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1948:1: ( rule__SystemBinding__Group__1__Impl rule__SystemBinding__Group__2 )
            // InternalMSL.g:1949:2: rule__SystemBinding__Group__1__Impl rule__SystemBinding__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__SystemBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemBinding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemBinding__Group__1"


    // $ANTLR start "rule__SystemBinding__Group__1__Impl"
    // InternalMSL.g:1956:1: rule__SystemBinding__Group__1__Impl : ( ( rule__SystemBinding__NameAssignment_1 ) ) ;
    public final void rule__SystemBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1960:1: ( ( ( rule__SystemBinding__NameAssignment_1 ) ) )
            // InternalMSL.g:1961:1: ( ( rule__SystemBinding__NameAssignment_1 ) )
            {
            // InternalMSL.g:1961:1: ( ( rule__SystemBinding__NameAssignment_1 ) )
            // InternalMSL.g:1962:2: ( rule__SystemBinding__NameAssignment_1 )
            {
             before(grammarAccess.getSystemBindingAccess().getNameAssignment_1()); 
            // InternalMSL.g:1963:2: ( rule__SystemBinding__NameAssignment_1 )
            // InternalMSL.g:1963:3: rule__SystemBinding__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemBinding__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemBindingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemBinding__Group__1__Impl"


    // $ANTLR start "rule__SystemBinding__Group__2"
    // InternalMSL.g:1971:1: rule__SystemBinding__Group__2 : rule__SystemBinding__Group__2__Impl rule__SystemBinding__Group__3 ;
    public final void rule__SystemBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1975:1: ( rule__SystemBinding__Group__2__Impl rule__SystemBinding__Group__3 )
            // InternalMSL.g:1976:2: rule__SystemBinding__Group__2__Impl rule__SystemBinding__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__SystemBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemBinding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemBinding__Group__2"


    // $ANTLR start "rule__SystemBinding__Group__2__Impl"
    // InternalMSL.g:1983:1: rule__SystemBinding__Group__2__Impl : ( ':' ) ;
    public final void rule__SystemBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1987:1: ( ( ':' ) )
            // InternalMSL.g:1988:1: ( ':' )
            {
            // InternalMSL.g:1988:1: ( ':' )
            // InternalMSL.g:1989:2: ':'
            {
             before(grammarAccess.getSystemBindingAccess().getColonKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSystemBindingAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemBinding__Group__2__Impl"


    // $ANTLR start "rule__SystemBinding__Group__3"
    // InternalMSL.g:1998:1: rule__SystemBinding__Group__3 : rule__SystemBinding__Group__3__Impl ;
    public final void rule__SystemBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2002:1: ( rule__SystemBinding__Group__3__Impl )
            // InternalMSL.g:2003:2: rule__SystemBinding__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemBinding__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemBinding__Group__3"


    // $ANTLR start "rule__SystemBinding__Group__3__Impl"
    // InternalMSL.g:2009:1: rule__SystemBinding__Group__3__Impl : ( ( rule__SystemBinding__AbsSysAssignment_3 ) ) ;
    public final void rule__SystemBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2013:1: ( ( ( rule__SystemBinding__AbsSysAssignment_3 ) ) )
            // InternalMSL.g:2014:1: ( ( rule__SystemBinding__AbsSysAssignment_3 ) )
            {
            // InternalMSL.g:2014:1: ( ( rule__SystemBinding__AbsSysAssignment_3 ) )
            // InternalMSL.g:2015:2: ( rule__SystemBinding__AbsSysAssignment_3 )
            {
             before(grammarAccess.getSystemBindingAccess().getAbsSysAssignment_3()); 
            // InternalMSL.g:2016:2: ( rule__SystemBinding__AbsSysAssignment_3 )
            // InternalMSL.g:2016:3: rule__SystemBinding__AbsSysAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SystemBinding__AbsSysAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemBindingAccess().getAbsSysAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemBinding__Group__3__Impl"


    // $ANTLR start "rule__GroupBinding__Group__0"
    // InternalMSL.g:2025:1: rule__GroupBinding__Group__0 : rule__GroupBinding__Group__0__Impl rule__GroupBinding__Group__1 ;
    public final void rule__GroupBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2029:1: ( rule__GroupBinding__Group__0__Impl rule__GroupBinding__Group__1 )
            // InternalMSL.g:2030:2: rule__GroupBinding__Group__0__Impl rule__GroupBinding__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__GroupBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupBinding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBinding__Group__0"


    // $ANTLR start "rule__GroupBinding__Group__0__Impl"
    // InternalMSL.g:2037:1: rule__GroupBinding__Group__0__Impl : ( 'group' ) ;
    public final void rule__GroupBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2041:1: ( ( 'group' ) )
            // InternalMSL.g:2042:1: ( 'group' )
            {
            // InternalMSL.g:2042:1: ( 'group' )
            // InternalMSL.g:2043:2: 'group'
            {
             before(grammarAccess.getGroupBindingAccess().getGroupKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGroupBindingAccess().getGroupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBinding__Group__0__Impl"


    // $ANTLR start "rule__GroupBinding__Group__1"
    // InternalMSL.g:2052:1: rule__GroupBinding__Group__1 : rule__GroupBinding__Group__1__Impl rule__GroupBinding__Group__2 ;
    public final void rule__GroupBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2056:1: ( rule__GroupBinding__Group__1__Impl rule__GroupBinding__Group__2 )
            // InternalMSL.g:2057:2: rule__GroupBinding__Group__1__Impl rule__GroupBinding__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__GroupBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupBinding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBinding__Group__1"


    // $ANTLR start "rule__GroupBinding__Group__1__Impl"
    // InternalMSL.g:2064:1: rule__GroupBinding__Group__1__Impl : ( ( rule__GroupBinding__NameAssignment_1 ) ) ;
    public final void rule__GroupBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2068:1: ( ( ( rule__GroupBinding__NameAssignment_1 ) ) )
            // InternalMSL.g:2069:1: ( ( rule__GroupBinding__NameAssignment_1 ) )
            {
            // InternalMSL.g:2069:1: ( ( rule__GroupBinding__NameAssignment_1 ) )
            // InternalMSL.g:2070:2: ( rule__GroupBinding__NameAssignment_1 )
            {
             before(grammarAccess.getGroupBindingAccess().getNameAssignment_1()); 
            // InternalMSL.g:2071:2: ( rule__GroupBinding__NameAssignment_1 )
            // InternalMSL.g:2071:3: rule__GroupBinding__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GroupBinding__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupBindingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBinding__Group__1__Impl"


    // $ANTLR start "rule__GroupBinding__Group__2"
    // InternalMSL.g:2079:1: rule__GroupBinding__Group__2 : rule__GroupBinding__Group__2__Impl rule__GroupBinding__Group__3 ;
    public final void rule__GroupBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2083:1: ( rule__GroupBinding__Group__2__Impl rule__GroupBinding__Group__3 )
            // InternalMSL.g:2084:2: rule__GroupBinding__Group__2__Impl rule__GroupBinding__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__GroupBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupBinding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBinding__Group__2"


    // $ANTLR start "rule__GroupBinding__Group__2__Impl"
    // InternalMSL.g:2091:1: rule__GroupBinding__Group__2__Impl : ( ':' ) ;
    public final void rule__GroupBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2095:1: ( ( ':' ) )
            // InternalMSL.g:2096:1: ( ':' )
            {
            // InternalMSL.g:2096:1: ( ':' )
            // InternalMSL.g:2097:2: ':'
            {
             before(grammarAccess.getGroupBindingAccess().getColonKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getGroupBindingAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBinding__Group__2__Impl"


    // $ANTLR start "rule__GroupBinding__Group__3"
    // InternalMSL.g:2106:1: rule__GroupBinding__Group__3 : rule__GroupBinding__Group__3__Impl ;
    public final void rule__GroupBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2110:1: ( rule__GroupBinding__Group__3__Impl )
            // InternalMSL.g:2111:2: rule__GroupBinding__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupBinding__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBinding__Group__3"


    // $ANTLR start "rule__GroupBinding__Group__3__Impl"
    // InternalMSL.g:2117:1: rule__GroupBinding__Group__3__Impl : ( ( rule__GroupBinding__AbsGroupAssignment_3 ) ) ;
    public final void rule__GroupBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2121:1: ( ( ( rule__GroupBinding__AbsGroupAssignment_3 ) ) )
            // InternalMSL.g:2122:1: ( ( rule__GroupBinding__AbsGroupAssignment_3 ) )
            {
            // InternalMSL.g:2122:1: ( ( rule__GroupBinding__AbsGroupAssignment_3 ) )
            // InternalMSL.g:2123:2: ( rule__GroupBinding__AbsGroupAssignment_3 )
            {
             before(grammarAccess.getGroupBindingAccess().getAbsGroupAssignment_3()); 
            // InternalMSL.g:2124:2: ( rule__GroupBinding__AbsGroupAssignment_3 )
            // InternalMSL.g:2124:3: rule__GroupBinding__AbsGroupAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GroupBinding__AbsGroupAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGroupBindingAccess().getAbsGroupAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBinding__Group__3__Impl"


    // $ANTLR start "rule__Pattern__Group__0"
    // InternalMSL.g:2133:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2137:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalMSL.g:2138:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Pattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0"


    // $ANTLR start "rule__Pattern__Group__0__Impl"
    // InternalMSL.g:2145:1: rule__Pattern__Group__0__Impl : ( 'concrete' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2149:1: ( ( 'concrete' ) )
            // InternalMSL.g:2150:1: ( 'concrete' )
            {
            // InternalMSL.g:2150:1: ( 'concrete' )
            // InternalMSL.g:2151:2: 'concrete'
            {
             before(grammarAccess.getPatternAccess().getConcreteKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getConcreteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0__Impl"


    // $ANTLR start "rule__Pattern__Group__1"
    // InternalMSL.g:2160:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2164:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalMSL.g:2165:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Pattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1"


    // $ANTLR start "rule__Pattern__Group__1__Impl"
    // InternalMSL.g:2172:1: rule__Pattern__Group__1__Impl : ( 'pattern' ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2176:1: ( ( 'pattern' ) )
            // InternalMSL.g:2177:1: ( 'pattern' )
            {
            // InternalMSL.g:2177:1: ( 'pattern' )
            // InternalMSL.g:2178:2: 'pattern'
            {
             before(grammarAccess.getPatternAccess().getPatternKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getPatternKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1__Impl"


    // $ANTLR start "rule__Pattern__Group__2"
    // InternalMSL.g:2187:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2191:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalMSL.g:2192:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Pattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2"


    // $ANTLR start "rule__Pattern__Group__2__Impl"
    // InternalMSL.g:2199:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__NameAssignment_2 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2203:1: ( ( ( rule__Pattern__NameAssignment_2 ) ) )
            // InternalMSL.g:2204:1: ( ( rule__Pattern__NameAssignment_2 ) )
            {
            // InternalMSL.g:2204:1: ( ( rule__Pattern__NameAssignment_2 ) )
            // InternalMSL.g:2205:2: ( rule__Pattern__NameAssignment_2 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_2()); 
            // InternalMSL.g:2206:2: ( rule__Pattern__NameAssignment_2 )
            // InternalMSL.g:2206:3: rule__Pattern__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2__Impl"


    // $ANTLR start "rule__Pattern__Group__3"
    // InternalMSL.g:2214:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2218:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalMSL.g:2219:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Pattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__3"


    // $ANTLR start "rule__Pattern__Group__3__Impl"
    // InternalMSL.g:2226:1: rule__Pattern__Group__3__Impl : ( 'concretizationOf' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2230:1: ( ( 'concretizationOf' ) )
            // InternalMSL.g:2231:1: ( 'concretizationOf' )
            {
            // InternalMSL.g:2231:1: ( 'concretizationOf' )
            // InternalMSL.g:2232:2: 'concretizationOf'
            {
             before(grammarAccess.getPatternAccess().getConcretizationOfKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getConcretizationOfKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__3__Impl"


    // $ANTLR start "rule__Pattern__Group__4"
    // InternalMSL.g:2241:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2245:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalMSL.g:2246:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Pattern__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__4"


    // $ANTLR start "rule__Pattern__Group__4__Impl"
    // InternalMSL.g:2253:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__AbsPatternAssignment_4 ) ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2257:1: ( ( ( rule__Pattern__AbsPatternAssignment_4 ) ) )
            // InternalMSL.g:2258:1: ( ( rule__Pattern__AbsPatternAssignment_4 ) )
            {
            // InternalMSL.g:2258:1: ( ( rule__Pattern__AbsPatternAssignment_4 ) )
            // InternalMSL.g:2259:2: ( rule__Pattern__AbsPatternAssignment_4 )
            {
             before(grammarAccess.getPatternAccess().getAbsPatternAssignment_4()); 
            // InternalMSL.g:2260:2: ( rule__Pattern__AbsPatternAssignment_4 )
            // InternalMSL.g:2260:3: rule__Pattern__AbsPatternAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__AbsPatternAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getAbsPatternAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__4__Impl"


    // $ANTLR start "rule__Pattern__Group__5"
    // InternalMSL.g:2268:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl rule__Pattern__Group__6 ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2272:1: ( rule__Pattern__Group__5__Impl rule__Pattern__Group__6 )
            // InternalMSL.g:2273:2: rule__Pattern__Group__5__Impl rule__Pattern__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Pattern__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__5"


    // $ANTLR start "rule__Pattern__Group__5__Impl"
    // InternalMSL.g:2280:1: rule__Pattern__Group__5__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2284:1: ( ( '{' ) )
            // InternalMSL.g:2285:1: ( '{' )
            {
            // InternalMSL.g:2285:1: ( '{' )
            // InternalMSL.g:2286:2: '{'
            {
             before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__5__Impl"


    // $ANTLR start "rule__Pattern__Group__6"
    // InternalMSL.g:2295:1: rule__Pattern__Group__6 : rule__Pattern__Group__6__Impl rule__Pattern__Group__7 ;
    public final void rule__Pattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2299:1: ( rule__Pattern__Group__6__Impl rule__Pattern__Group__7 )
            // InternalMSL.g:2300:2: rule__Pattern__Group__6__Impl rule__Pattern__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Pattern__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__6"


    // $ANTLR start "rule__Pattern__Group__6__Impl"
    // InternalMSL.g:2307:1: rule__Pattern__Group__6__Impl : ( ( rule__Pattern__ManagedSystemsAssignment_6 )* ) ;
    public final void rule__Pattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2311:1: ( ( ( rule__Pattern__ManagedSystemsAssignment_6 )* ) )
            // InternalMSL.g:2312:1: ( ( rule__Pattern__ManagedSystemsAssignment_6 )* )
            {
            // InternalMSL.g:2312:1: ( ( rule__Pattern__ManagedSystemsAssignment_6 )* )
            // InternalMSL.g:2313:2: ( rule__Pattern__ManagedSystemsAssignment_6 )*
            {
             before(grammarAccess.getPatternAccess().getManagedSystemsAssignment_6()); 
            // InternalMSL.g:2314:2: ( rule__Pattern__ManagedSystemsAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMSL.g:2314:3: rule__Pattern__ManagedSystemsAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Pattern__ManagedSystemsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPatternAccess().getManagedSystemsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__6__Impl"


    // $ANTLR start "rule__Pattern__Group__7"
    // InternalMSL.g:2322:1: rule__Pattern__Group__7 : rule__Pattern__Group__7__Impl rule__Pattern__Group__8 ;
    public final void rule__Pattern__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2326:1: ( rule__Pattern__Group__7__Impl rule__Pattern__Group__8 )
            // InternalMSL.g:2327:2: rule__Pattern__Group__7__Impl rule__Pattern__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Pattern__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__7"


    // $ANTLR start "rule__Pattern__Group__7__Impl"
    // InternalMSL.g:2334:1: rule__Pattern__Group__7__Impl : ( ( rule__Pattern__GroupsAssignment_7 )* ) ;
    public final void rule__Pattern__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2338:1: ( ( ( rule__Pattern__GroupsAssignment_7 )* ) )
            // InternalMSL.g:2339:1: ( ( rule__Pattern__GroupsAssignment_7 )* )
            {
            // InternalMSL.g:2339:1: ( ( rule__Pattern__GroupsAssignment_7 )* )
            // InternalMSL.g:2340:2: ( rule__Pattern__GroupsAssignment_7 )*
            {
             before(grammarAccess.getPatternAccess().getGroupsAssignment_7()); 
            // InternalMSL.g:2341:2: ( rule__Pattern__GroupsAssignment_7 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMSL.g:2341:3: rule__Pattern__GroupsAssignment_7
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Pattern__GroupsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getPatternAccess().getGroupsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__7__Impl"


    // $ANTLR start "rule__Pattern__Group__8"
    // InternalMSL.g:2349:1: rule__Pattern__Group__8 : rule__Pattern__Group__8__Impl ;
    public final void rule__Pattern__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2353:1: ( rule__Pattern__Group__8__Impl )
            // InternalMSL.g:2354:2: rule__Pattern__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__8"


    // $ANTLR start "rule__Pattern__Group__8__Impl"
    // InternalMSL.g:2360:1: rule__Pattern__Group__8__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2364:1: ( ( '}' ) )
            // InternalMSL.g:2365:1: ( '}' )
            {
            // InternalMSL.g:2365:1: ( '}' )
            // InternalMSL.g:2366:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__8__Impl"


    // $ANTLR start "rule__Configuration__Group__0"
    // InternalMSL.g:2376:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2380:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // InternalMSL.g:2381:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Configuration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0"


    // $ANTLR start "rule__Configuration__Group__0__Impl"
    // InternalMSL.g:2388:1: rule__Configuration__Group__0__Impl : ( 'configuration' ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2392:1: ( ( 'configuration' ) )
            // InternalMSL.g:2393:1: ( 'configuration' )
            {
            // InternalMSL.g:2393:1: ( 'configuration' )
            // InternalMSL.g:2394:2: 'configuration'
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getConfigurationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0__Impl"


    // $ANTLR start "rule__Configuration__Group__1"
    // InternalMSL.g:2403:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2407:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // InternalMSL.g:2408:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Configuration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1"


    // $ANTLR start "rule__Configuration__Group__1__Impl"
    // InternalMSL.g:2415:1: rule__Configuration__Group__1__Impl : ( ( rule__Configuration__NameAssignment_1 ) ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2419:1: ( ( ( rule__Configuration__NameAssignment_1 ) ) )
            // InternalMSL.g:2420:1: ( ( rule__Configuration__NameAssignment_1 ) )
            {
            // InternalMSL.g:2420:1: ( ( rule__Configuration__NameAssignment_1 ) )
            // InternalMSL.g:2421:2: ( rule__Configuration__NameAssignment_1 )
            {
             before(grammarAccess.getConfigurationAccess().getNameAssignment_1()); 
            // InternalMSL.g:2422:2: ( rule__Configuration__NameAssignment_1 )
            // InternalMSL.g:2422:3: rule__Configuration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1__Impl"


    // $ANTLR start "rule__Configuration__Group__2"
    // InternalMSL.g:2430:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl rule__Configuration__Group__3 ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2434:1: ( rule__Configuration__Group__2__Impl rule__Configuration__Group__3 )
            // InternalMSL.g:2435:2: rule__Configuration__Group__2__Impl rule__Configuration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Configuration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__2"


    // $ANTLR start "rule__Configuration__Group__2__Impl"
    // InternalMSL.g:2442:1: rule__Configuration__Group__2__Impl : ( 'instanceOf' ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2446:1: ( ( 'instanceOf' ) )
            // InternalMSL.g:2447:1: ( 'instanceOf' )
            {
            // InternalMSL.g:2447:1: ( 'instanceOf' )
            // InternalMSL.g:2448:2: 'instanceOf'
            {
             before(grammarAccess.getConfigurationAccess().getInstanceOfKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getInstanceOfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__2__Impl"


    // $ANTLR start "rule__Configuration__Group__3"
    // InternalMSL.g:2457:1: rule__Configuration__Group__3 : rule__Configuration__Group__3__Impl rule__Configuration__Group__4 ;
    public final void rule__Configuration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2461:1: ( rule__Configuration__Group__3__Impl rule__Configuration__Group__4 )
            // InternalMSL.g:2462:2: rule__Configuration__Group__3__Impl rule__Configuration__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Configuration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__3"


    // $ANTLR start "rule__Configuration__Group__3__Impl"
    // InternalMSL.g:2469:1: rule__Configuration__Group__3__Impl : ( ( rule__Configuration__Group_3__0 ) ) ;
    public final void rule__Configuration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2473:1: ( ( ( rule__Configuration__Group_3__0 ) ) )
            // InternalMSL.g:2474:1: ( ( rule__Configuration__Group_3__0 ) )
            {
            // InternalMSL.g:2474:1: ( ( rule__Configuration__Group_3__0 ) )
            // InternalMSL.g:2475:2: ( rule__Configuration__Group_3__0 )
            {
             before(grammarAccess.getConfigurationAccess().getGroup_3()); 
            // InternalMSL.g:2476:2: ( rule__Configuration__Group_3__0 )
            // InternalMSL.g:2476:3: rule__Configuration__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__3__Impl"


    // $ANTLR start "rule__Configuration__Group__4"
    // InternalMSL.g:2484:1: rule__Configuration__Group__4 : rule__Configuration__Group__4__Impl rule__Configuration__Group__5 ;
    public final void rule__Configuration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2488:1: ( rule__Configuration__Group__4__Impl rule__Configuration__Group__5 )
            // InternalMSL.g:2489:2: rule__Configuration__Group__4__Impl rule__Configuration__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Configuration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__4"


    // $ANTLR start "rule__Configuration__Group__4__Impl"
    // InternalMSL.g:2496:1: rule__Configuration__Group__4__Impl : ( '{' ) ;
    public final void rule__Configuration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2500:1: ( ( '{' ) )
            // InternalMSL.g:2501:1: ( '{' )
            {
            // InternalMSL.g:2501:1: ( '{' )
            // InternalMSL.g:2502:2: '{'
            {
             before(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__4__Impl"


    // $ANTLR start "rule__Configuration__Group__5"
    // InternalMSL.g:2511:1: rule__Configuration__Group__5 : rule__Configuration__Group__5__Impl rule__Configuration__Group__6 ;
    public final void rule__Configuration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2515:1: ( rule__Configuration__Group__5__Impl rule__Configuration__Group__6 )
            // InternalMSL.g:2516:2: rule__Configuration__Group__5__Impl rule__Configuration__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Configuration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__5"


    // $ANTLR start "rule__Configuration__Group__5__Impl"
    // InternalMSL.g:2523:1: rule__Configuration__Group__5__Impl : ( ( rule__Configuration__ConcreteSystemsAssignment_5 )* ) ;
    public final void rule__Configuration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2527:1: ( ( ( rule__Configuration__ConcreteSystemsAssignment_5 )* ) )
            // InternalMSL.g:2528:1: ( ( rule__Configuration__ConcreteSystemsAssignment_5 )* )
            {
            // InternalMSL.g:2528:1: ( ( rule__Configuration__ConcreteSystemsAssignment_5 )* )
            // InternalMSL.g:2529:2: ( rule__Configuration__ConcreteSystemsAssignment_5 )*
            {
             before(grammarAccess.getConfigurationAccess().getConcreteSystemsAssignment_5()); 
            // InternalMSL.g:2530:2: ( rule__Configuration__ConcreteSystemsAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // InternalMSL.g:2530:3: rule__Configuration__ConcreteSystemsAssignment_5
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Configuration__ConcreteSystemsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getConfigurationAccess().getConcreteSystemsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__5__Impl"


    // $ANTLR start "rule__Configuration__Group__6"
    // InternalMSL.g:2538:1: rule__Configuration__Group__6 : rule__Configuration__Group__6__Impl rule__Configuration__Group__7 ;
    public final void rule__Configuration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2542:1: ( rule__Configuration__Group__6__Impl rule__Configuration__Group__7 )
            // InternalMSL.g:2543:2: rule__Configuration__Group__6__Impl rule__Configuration__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__Configuration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__6"


    // $ANTLR start "rule__Configuration__Group__6__Impl"
    // InternalMSL.g:2550:1: rule__Configuration__Group__6__Impl : ( ( rule__Configuration__ConcreteGroupsAssignment_6 )* ) ;
    public final void rule__Configuration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2554:1: ( ( ( rule__Configuration__ConcreteGroupsAssignment_6 )* ) )
            // InternalMSL.g:2555:1: ( ( rule__Configuration__ConcreteGroupsAssignment_6 )* )
            {
            // InternalMSL.g:2555:1: ( ( rule__Configuration__ConcreteGroupsAssignment_6 )* )
            // InternalMSL.g:2556:2: ( rule__Configuration__ConcreteGroupsAssignment_6 )*
            {
             before(grammarAccess.getConfigurationAccess().getConcreteGroupsAssignment_6()); 
            // InternalMSL.g:2557:2: ( rule__Configuration__ConcreteGroupsAssignment_6 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_INSTANCE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMSL.g:2557:3: rule__Configuration__ConcreteGroupsAssignment_6
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Configuration__ConcreteGroupsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getConfigurationAccess().getConcreteGroupsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__6__Impl"


    // $ANTLR start "rule__Configuration__Group__7"
    // InternalMSL.g:2565:1: rule__Configuration__Group__7 : rule__Configuration__Group__7__Impl rule__Configuration__Group__8 ;
    public final void rule__Configuration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2569:1: ( rule__Configuration__Group__7__Impl rule__Configuration__Group__8 )
            // InternalMSL.g:2570:2: rule__Configuration__Group__7__Impl rule__Configuration__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__Configuration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__7"


    // $ANTLR start "rule__Configuration__Group__7__Impl"
    // InternalMSL.g:2577:1: rule__Configuration__Group__7__Impl : ( ( rule__Configuration__ConcreteInteractionsAssignment_7 )* ) ;
    public final void rule__Configuration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2581:1: ( ( ( rule__Configuration__ConcreteInteractionsAssignment_7 )* ) )
            // InternalMSL.g:2582:1: ( ( rule__Configuration__ConcreteInteractionsAssignment_7 )* )
            {
            // InternalMSL.g:2582:1: ( ( rule__Configuration__ConcreteInteractionsAssignment_7 )* )
            // InternalMSL.g:2583:2: ( rule__Configuration__ConcreteInteractionsAssignment_7 )*
            {
             before(grammarAccess.getConfigurationAccess().getConcreteInteractionsAssignment_7()); 
            // InternalMSL.g:2584:2: ( rule__Configuration__ConcreteInteractionsAssignment_7 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_FQN_INSTANCE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMSL.g:2584:3: rule__Configuration__ConcreteInteractionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Configuration__ConcreteInteractionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getConfigurationAccess().getConcreteInteractionsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__7__Impl"


    // $ANTLR start "rule__Configuration__Group__8"
    // InternalMSL.g:2592:1: rule__Configuration__Group__8 : rule__Configuration__Group__8__Impl ;
    public final void rule__Configuration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2596:1: ( rule__Configuration__Group__8__Impl )
            // InternalMSL.g:2597:2: rule__Configuration__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__8"


    // $ANTLR start "rule__Configuration__Group__8__Impl"
    // InternalMSL.g:2603:1: rule__Configuration__Group__8__Impl : ( '}' ) ;
    public final void rule__Configuration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2607:1: ( ( '}' ) )
            // InternalMSL.g:2608:1: ( '}' )
            {
            // InternalMSL.g:2608:1: ( '}' )
            // InternalMSL.g:2609:2: '}'
            {
             before(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__8__Impl"


    // $ANTLR start "rule__Configuration__Group_3__0"
    // InternalMSL.g:2619:1: rule__Configuration__Group_3__0 : rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1 ;
    public final void rule__Configuration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2623:1: ( rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1 )
            // InternalMSL.g:2624:2: rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Configuration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3__0"


    // $ANTLR start "rule__Configuration__Group_3__0__Impl"
    // InternalMSL.g:2631:1: rule__Configuration__Group_3__0__Impl : ( ( rule__Configuration__PatternAssignment_3_0 ) ) ;
    public final void rule__Configuration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2635:1: ( ( ( rule__Configuration__PatternAssignment_3_0 ) ) )
            // InternalMSL.g:2636:1: ( ( rule__Configuration__PatternAssignment_3_0 ) )
            {
            // InternalMSL.g:2636:1: ( ( rule__Configuration__PatternAssignment_3_0 ) )
            // InternalMSL.g:2637:2: ( rule__Configuration__PatternAssignment_3_0 )
            {
             before(grammarAccess.getConfigurationAccess().getPatternAssignment_3_0()); 
            // InternalMSL.g:2638:2: ( rule__Configuration__PatternAssignment_3_0 )
            // InternalMSL.g:2638:3: rule__Configuration__PatternAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__PatternAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getPatternAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3__0__Impl"


    // $ANTLR start "rule__Configuration__Group_3__1"
    // InternalMSL.g:2646:1: rule__Configuration__Group_3__1 : rule__Configuration__Group_3__1__Impl ;
    public final void rule__Configuration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2650:1: ( rule__Configuration__Group_3__1__Impl )
            // InternalMSL.g:2651:2: rule__Configuration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3__1"


    // $ANTLR start "rule__Configuration__Group_3__1__Impl"
    // InternalMSL.g:2657:1: rule__Configuration__Group_3__1__Impl : ( ( rule__Configuration__Group_3_1__0 )* ) ;
    public final void rule__Configuration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2661:1: ( ( ( rule__Configuration__Group_3_1__0 )* ) )
            // InternalMSL.g:2662:1: ( ( rule__Configuration__Group_3_1__0 )* )
            {
            // InternalMSL.g:2662:1: ( ( rule__Configuration__Group_3_1__0 )* )
            // InternalMSL.g:2663:2: ( rule__Configuration__Group_3_1__0 )*
            {
             before(grammarAccess.getConfigurationAccess().getGroup_3_1()); 
            // InternalMSL.g:2664:2: ( rule__Configuration__Group_3_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==38) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMSL.g:2664:3: rule__Configuration__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Configuration__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getConfigurationAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3__1__Impl"


    // $ANTLR start "rule__Configuration__Group_3_1__0"
    // InternalMSL.g:2673:1: rule__Configuration__Group_3_1__0 : rule__Configuration__Group_3_1__0__Impl rule__Configuration__Group_3_1__1 ;
    public final void rule__Configuration__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2677:1: ( rule__Configuration__Group_3_1__0__Impl rule__Configuration__Group_3_1__1 )
            // InternalMSL.g:2678:2: rule__Configuration__Group_3_1__0__Impl rule__Configuration__Group_3_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Configuration__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3_1__0"


    // $ANTLR start "rule__Configuration__Group_3_1__0__Impl"
    // InternalMSL.g:2685:1: rule__Configuration__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Configuration__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2689:1: ( ( ',' ) )
            // InternalMSL.g:2690:1: ( ',' )
            {
            // InternalMSL.g:2690:1: ( ',' )
            // InternalMSL.g:2691:2: ','
            {
             before(grammarAccess.getConfigurationAccess().getCommaKeyword_3_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3_1__0__Impl"


    // $ANTLR start "rule__Configuration__Group_3_1__1"
    // InternalMSL.g:2700:1: rule__Configuration__Group_3_1__1 : rule__Configuration__Group_3_1__1__Impl ;
    public final void rule__Configuration__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2704:1: ( rule__Configuration__Group_3_1__1__Impl )
            // InternalMSL.g:2705:2: rule__Configuration__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3_1__1"


    // $ANTLR start "rule__Configuration__Group_3_1__1__Impl"
    // InternalMSL.g:2711:1: rule__Configuration__Group_3_1__1__Impl : ( ( rule__Configuration__PatternAssignment_3_1_1 ) ) ;
    public final void rule__Configuration__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2715:1: ( ( ( rule__Configuration__PatternAssignment_3_1_1 ) ) )
            // InternalMSL.g:2716:1: ( ( rule__Configuration__PatternAssignment_3_1_1 ) )
            {
            // InternalMSL.g:2716:1: ( ( rule__Configuration__PatternAssignment_3_1_1 ) )
            // InternalMSL.g:2717:2: ( rule__Configuration__PatternAssignment_3_1_1 )
            {
             before(grammarAccess.getConfigurationAccess().getPatternAssignment_3_1_1()); 
            // InternalMSL.g:2718:2: ( rule__Configuration__PatternAssignment_3_1_1 )
            // InternalMSL.g:2718:3: rule__Configuration__PatternAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__PatternAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getPatternAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3_1__1__Impl"


    // $ANTLR start "rule__ConcreteSystem__Group__0"
    // InternalMSL.g:2727:1: rule__ConcreteSystem__Group__0 : rule__ConcreteSystem__Group__0__Impl rule__ConcreteSystem__Group__1 ;
    public final void rule__ConcreteSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2731:1: ( rule__ConcreteSystem__Group__0__Impl rule__ConcreteSystem__Group__1 )
            // InternalMSL.g:2732:2: rule__ConcreteSystem__Group__0__Impl rule__ConcreteSystem__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ConcreteSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteSystem__Group__0"


    // $ANTLR start "rule__ConcreteSystem__Group__0__Impl"
    // InternalMSL.g:2739:1: rule__ConcreteSystem__Group__0__Impl : ( ( rule__ConcreteSystem__NameAssignment_0 ) ) ;
    public final void rule__ConcreteSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2743:1: ( ( ( rule__ConcreteSystem__NameAssignment_0 ) ) )
            // InternalMSL.g:2744:1: ( ( rule__ConcreteSystem__NameAssignment_0 ) )
            {
            // InternalMSL.g:2744:1: ( ( rule__ConcreteSystem__NameAssignment_0 ) )
            // InternalMSL.g:2745:2: ( rule__ConcreteSystem__NameAssignment_0 )
            {
             before(grammarAccess.getConcreteSystemAccess().getNameAssignment_0()); 
            // InternalMSL.g:2746:2: ( rule__ConcreteSystem__NameAssignment_0 )
            // InternalMSL.g:2746:3: rule__ConcreteSystem__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteSystem__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConcreteSystemAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteSystem__Group__0__Impl"


    // $ANTLR start "rule__ConcreteSystem__Group__1"
    // InternalMSL.g:2754:1: rule__ConcreteSystem__Group__1 : rule__ConcreteSystem__Group__1__Impl rule__ConcreteSystem__Group__2 ;
    public final void rule__ConcreteSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2758:1: ( rule__ConcreteSystem__Group__1__Impl rule__ConcreteSystem__Group__2 )
            // InternalMSL.g:2759:2: rule__ConcreteSystem__Group__1__Impl rule__ConcreteSystem__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ConcreteSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteSystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteSystem__Group__1"


    // $ANTLR start "rule__ConcreteSystem__Group__1__Impl"
    // InternalMSL.g:2766:1: rule__ConcreteSystem__Group__1__Impl : ( ':' ) ;
    public final void rule__ConcreteSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2770:1: ( ( ':' ) )
            // InternalMSL.g:2771:1: ( ':' )
            {
            // InternalMSL.g:2771:1: ( ':' )
            // InternalMSL.g:2772:2: ':'
            {
             before(grammarAccess.getConcreteSystemAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getConcreteSystemAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteSystem__Group__1__Impl"


    // $ANTLR start "rule__ConcreteSystem__Group__2"
    // InternalMSL.g:2781:1: rule__ConcreteSystem__Group__2 : rule__ConcreteSystem__Group__2__Impl ;
    public final void rule__ConcreteSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2785:1: ( rule__ConcreteSystem__Group__2__Impl )
            // InternalMSL.g:2786:2: rule__ConcreteSystem__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteSystem__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteSystem__Group__2"


    // $ANTLR start "rule__ConcreteSystem__Group__2__Impl"
    // InternalMSL.g:2792:1: rule__ConcreteSystem__Group__2__Impl : ( ( rule__ConcreteSystem__Group_2__0 ) ) ;
    public final void rule__ConcreteSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2796:1: ( ( ( rule__ConcreteSystem__Group_2__0 ) ) )
            // InternalMSL.g:2797:1: ( ( rule__ConcreteSystem__Group_2__0 ) )
            {
            // InternalMSL.g:2797:1: ( ( rule__ConcreteSystem__Group_2__0 ) )
            // InternalMSL.g:2798:2: ( rule__ConcreteSystem__Group_2__0 )
            {
             before(grammarAccess.getConcreteSystemAccess().getGroup_2()); 
            // InternalMSL.g:2799:2: ( rule__ConcreteSystem__Group_2__0 )
            // InternalMSL.g:2799:3: rule__ConcreteSystem__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteSystem__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getConcreteSystemAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteSystem__Group__2__Impl"


    // $ANTLR start "rule__ConcreteSystem__Group_2__0"
    // InternalMSL.g:2808:1: rule__ConcreteSystem__Group_2__0 : rule__ConcreteSystem__Group_2__0__Impl rule__ConcreteSystem__Group_2__1 ;
    public final void rule__ConcreteSystem__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2812:1: ( rule__ConcreteSystem__Group_2__0__Impl rule__ConcreteSystem__Group_2__1 )
            // InternalMSL.g:2813:2: rule__ConcreteSystem__Group_2__0__Impl rule__ConcreteSystem__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__ConcreteSystem__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteSystem__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteSystem__Group_2__0"


    // $ANTLR start "rule__ConcreteSystem__Group_2__0__Impl"
    // InternalMSL.g:2820:1: rule__ConcreteSystem__Group_2__0__Impl : ( ( rule__ConcreteSystem__BindingsAssignment_2_0 ) ) ;
    public final void rule__ConcreteSystem__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2824:1: ( ( ( rule__ConcreteSystem__BindingsAssignment_2_0 ) ) )
            // InternalMSL.g:2825:1: ( ( rule__ConcreteSystem__BindingsAssignment_2_0 ) )
            {
            // InternalMSL.g:2825:1: ( ( rule__ConcreteSystem__BindingsAssignment_2_0 ) )
            // InternalMSL.g:2826:2: ( rule__ConcreteSystem__BindingsAssignment_2_0 )
            {
             before(grammarAccess.getConcreteSystemAccess().getBindingsAssignment_2_0()); 
            // InternalMSL.g:2827:2: ( rule__ConcreteSystem__BindingsAssignment_2_0 )
            // InternalMSL.g:2827:3: rule__ConcreteSystem__BindingsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteSystem__BindingsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getConcreteSystemAccess().getBindingsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteSystem__Group_2__0__Impl"


    // $ANTLR start "rule__ConcreteSystem__Group_2__1"
    // InternalMSL.g:2835:1: rule__ConcreteSystem__Group_2__1 : rule__ConcreteSystem__Group_2__1__Impl ;
    public final void rule__ConcreteSystem__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2839:1: ( rule__ConcreteSystem__Group_2__1__Impl )
            // InternalMSL.g:2840:2: rule__ConcreteSystem__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteSystem__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteSystem__Group_2__1"


    // $ANTLR start "rule__ConcreteSystem__Group_2__1__Impl"
    // InternalMSL.g:2846:1: rule__ConcreteSystem__Group_2__1__Impl : ( ( rule__ConcreteSystem__Group_2_1__0 )* ) ;
    public final void rule__ConcreteSystem__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2850:1: ( ( ( rule__ConcreteSystem__Group_2_1__0 )* ) )
            // InternalMSL.g:2851:1: ( ( rule__ConcreteSystem__Group_2_1__0 )* )
            {
            // InternalMSL.g:2851:1: ( ( rule__ConcreteSystem__Group_2_1__0 )* )
            // InternalMSL.g:2852:2: ( rule__ConcreteSystem__Group_2_1__0 )*
            {
             before(grammarAccess.getConcreteSystemAccess().getGroup_2_1()); 
            // InternalMSL.g:2853:2: ( rule__ConcreteSystem__Group_2_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==38) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMSL.g:2853:3: rule__ConcreteSystem__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ConcreteSystem__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getConcreteSystemAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteSystem__Group_2__1__Impl"


    // $ANTLR start "rule__ConcreteSystem__Group_2_1__0"
    // InternalMSL.g:2862:1: rule__ConcreteSystem__Group_2_1__0 : rule__ConcreteSystem__Group_2_1__0__Impl rule__ConcreteSystem__Group_2_1__1 ;
    public final void rule__ConcreteSystem__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2866:1: ( rule__ConcreteSystem__Group_2_1__0__Impl rule__ConcreteSystem__Group_2_1__1 )
            // InternalMSL.g:2867:2: rule__ConcreteSystem__Group_2_1__0__Impl rule__ConcreteSystem__Group_2_1__1
            {
            pushFollow(FOLLOW_24);
            rule__ConcreteSystem__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteSystem__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteSystem__Group_2_1__0"


    // $ANTLR start "rule__ConcreteSystem__Group_2_1__0__Impl"
    // InternalMSL.g:2874:1: rule__ConcreteSystem__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ConcreteSystem__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2878:1: ( ( ',' ) )
            // InternalMSL.g:2879:1: ( ',' )
            {
            // InternalMSL.g:2879:1: ( ',' )
            // InternalMSL.g:2880:2: ','
            {
             before(grammarAccess.getConcreteSystemAccess().getCommaKeyword_2_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConcreteSystemAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteSystem__Group_2_1__0__Impl"


    // $ANTLR start "rule__ConcreteSystem__Group_2_1__1"
    // InternalMSL.g:2889:1: rule__ConcreteSystem__Group_2_1__1 : rule__ConcreteSystem__Group_2_1__1__Impl ;
    public final void rule__ConcreteSystem__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2893:1: ( rule__ConcreteSystem__Group_2_1__1__Impl )
            // InternalMSL.g:2894:2: rule__ConcreteSystem__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteSystem__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteSystem__Group_2_1__1"


    // $ANTLR start "rule__ConcreteSystem__Group_2_1__1__Impl"
    // InternalMSL.g:2900:1: rule__ConcreteSystem__Group_2_1__1__Impl : ( ( rule__ConcreteSystem__BindingsAssignment_2_1_1 ) ) ;
    public final void rule__ConcreteSystem__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2904:1: ( ( ( rule__ConcreteSystem__BindingsAssignment_2_1_1 ) ) )
            // InternalMSL.g:2905:1: ( ( rule__ConcreteSystem__BindingsAssignment_2_1_1 ) )
            {
            // InternalMSL.g:2905:1: ( ( rule__ConcreteSystem__BindingsAssignment_2_1_1 ) )
            // InternalMSL.g:2906:2: ( rule__ConcreteSystem__BindingsAssignment_2_1_1 )
            {
             before(grammarAccess.getConcreteSystemAccess().getBindingsAssignment_2_1_1()); 
            // InternalMSL.g:2907:2: ( rule__ConcreteSystem__BindingsAssignment_2_1_1 )
            // InternalMSL.g:2907:3: rule__ConcreteSystem__BindingsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteSystem__BindingsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConcreteSystemAccess().getBindingsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteSystem__Group_2_1__1__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group__0"
    // InternalMSL.g:2916:1: rule__ConcreteGroup__Group__0 : rule__ConcreteGroup__Group__0__Impl rule__ConcreteGroup__Group__1 ;
    public final void rule__ConcreteGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2920:1: ( rule__ConcreteGroup__Group__0__Impl rule__ConcreteGroup__Group__1 )
            // InternalMSL.g:2921:2: rule__ConcreteGroup__Group__0__Impl rule__ConcreteGroup__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ConcreteGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group__0"


    // $ANTLR start "rule__ConcreteGroup__Group__0__Impl"
    // InternalMSL.g:2928:1: rule__ConcreteGroup__Group__0__Impl : ( ( rule__ConcreteGroup__NameAssignment_0 ) ) ;
    public final void rule__ConcreteGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2932:1: ( ( ( rule__ConcreteGroup__NameAssignment_0 ) ) )
            // InternalMSL.g:2933:1: ( ( rule__ConcreteGroup__NameAssignment_0 ) )
            {
            // InternalMSL.g:2933:1: ( ( rule__ConcreteGroup__NameAssignment_0 ) )
            // InternalMSL.g:2934:2: ( rule__ConcreteGroup__NameAssignment_0 )
            {
             before(grammarAccess.getConcreteGroupAccess().getNameAssignment_0()); 
            // InternalMSL.g:2935:2: ( rule__ConcreteGroup__NameAssignment_0 )
            // InternalMSL.g:2935:3: rule__ConcreteGroup__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConcreteGroupAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group__0__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group__1"
    // InternalMSL.g:2943:1: rule__ConcreteGroup__Group__1 : rule__ConcreteGroup__Group__1__Impl rule__ConcreteGroup__Group__2 ;
    public final void rule__ConcreteGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2947:1: ( rule__ConcreteGroup__Group__1__Impl rule__ConcreteGroup__Group__2 )
            // InternalMSL.g:2948:2: rule__ConcreteGroup__Group__1__Impl rule__ConcreteGroup__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ConcreteGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group__1"


    // $ANTLR start "rule__ConcreteGroup__Group__1__Impl"
    // InternalMSL.g:2955:1: rule__ConcreteGroup__Group__1__Impl : ( ':' ) ;
    public final void rule__ConcreteGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2959:1: ( ( ':' ) )
            // InternalMSL.g:2960:1: ( ':' )
            {
            // InternalMSL.g:2960:1: ( ':' )
            // InternalMSL.g:2961:2: ':'
            {
             before(grammarAccess.getConcreteGroupAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getConcreteGroupAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group__1__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group__2"
    // InternalMSL.g:2970:1: rule__ConcreteGroup__Group__2 : rule__ConcreteGroup__Group__2__Impl rule__ConcreteGroup__Group__3 ;
    public final void rule__ConcreteGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2974:1: ( rule__ConcreteGroup__Group__2__Impl rule__ConcreteGroup__Group__3 )
            // InternalMSL.g:2975:2: rule__ConcreteGroup__Group__2__Impl rule__ConcreteGroup__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ConcreteGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group__2"


    // $ANTLR start "rule__ConcreteGroup__Group__2__Impl"
    // InternalMSL.g:2982:1: rule__ConcreteGroup__Group__2__Impl : ( ( rule__ConcreteGroup__Group_2__0 ) ) ;
    public final void rule__ConcreteGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2986:1: ( ( ( rule__ConcreteGroup__Group_2__0 ) ) )
            // InternalMSL.g:2987:1: ( ( rule__ConcreteGroup__Group_2__0 ) )
            {
            // InternalMSL.g:2987:1: ( ( rule__ConcreteGroup__Group_2__0 ) )
            // InternalMSL.g:2988:2: ( rule__ConcreteGroup__Group_2__0 )
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup_2()); 
            // InternalMSL.g:2989:2: ( rule__ConcreteGroup__Group_2__0 )
            // InternalMSL.g:2989:3: rule__ConcreteGroup__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getConcreteGroupAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group__2__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group__3"
    // InternalMSL.g:2997:1: rule__ConcreteGroup__Group__3 : rule__ConcreteGroup__Group__3__Impl rule__ConcreteGroup__Group__4 ;
    public final void rule__ConcreteGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3001:1: ( rule__ConcreteGroup__Group__3__Impl rule__ConcreteGroup__Group__4 )
            // InternalMSL.g:3002:2: rule__ConcreteGroup__Group__3__Impl rule__ConcreteGroup__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ConcreteGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group__3"


    // $ANTLR start "rule__ConcreteGroup__Group__3__Impl"
    // InternalMSL.g:3009:1: rule__ConcreteGroup__Group__3__Impl : ( '{' ) ;
    public final void rule__ConcreteGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3013:1: ( ( '{' ) )
            // InternalMSL.g:3014:1: ( '{' )
            {
            // InternalMSL.g:3014:1: ( '{' )
            // InternalMSL.g:3015:2: '{'
            {
             before(grammarAccess.getConcreteGroupAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConcreteGroupAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group__3__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group__4"
    // InternalMSL.g:3024:1: rule__ConcreteGroup__Group__4 : rule__ConcreteGroup__Group__4__Impl rule__ConcreteGroup__Group__5 ;
    public final void rule__ConcreteGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3028:1: ( rule__ConcreteGroup__Group__4__Impl rule__ConcreteGroup__Group__5 )
            // InternalMSL.g:3029:2: rule__ConcreteGroup__Group__4__Impl rule__ConcreteGroup__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__ConcreteGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group__4"


    // $ANTLR start "rule__ConcreteGroup__Group__4__Impl"
    // InternalMSL.g:3036:1: rule__ConcreteGroup__Group__4__Impl : ( ( rule__ConcreteGroup__Group_4__0 )? ) ;
    public final void rule__ConcreteGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3040:1: ( ( ( rule__ConcreteGroup__Group_4__0 )? ) )
            // InternalMSL.g:3041:1: ( ( rule__ConcreteGroup__Group_4__0 )? )
            {
            // InternalMSL.g:3041:1: ( ( rule__ConcreteGroup__Group_4__0 )? )
            // InternalMSL.g:3042:2: ( rule__ConcreteGroup__Group_4__0 )?
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup_4()); 
            // InternalMSL.g:3043:2: ( rule__ConcreteGroup__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMSL.g:3043:3: rule__ConcreteGroup__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConcreteGroup__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConcreteGroupAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group__4__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group__5"
    // InternalMSL.g:3051:1: rule__ConcreteGroup__Group__5 : rule__ConcreteGroup__Group__5__Impl rule__ConcreteGroup__Group__6 ;
    public final void rule__ConcreteGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3055:1: ( rule__ConcreteGroup__Group__5__Impl rule__ConcreteGroup__Group__6 )
            // InternalMSL.g:3056:2: rule__ConcreteGroup__Group__5__Impl rule__ConcreteGroup__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__ConcreteGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group__5"


    // $ANTLR start "rule__ConcreteGroup__Group__5__Impl"
    // InternalMSL.g:3063:1: rule__ConcreteGroup__Group__5__Impl : ( ( rule__ConcreteGroup__Group_5__0 )? ) ;
    public final void rule__ConcreteGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3067:1: ( ( ( rule__ConcreteGroup__Group_5__0 )? ) )
            // InternalMSL.g:3068:1: ( ( rule__ConcreteGroup__Group_5__0 )? )
            {
            // InternalMSL.g:3068:1: ( ( rule__ConcreteGroup__Group_5__0 )? )
            // InternalMSL.g:3069:2: ( rule__ConcreteGroup__Group_5__0 )?
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup_5()); 
            // InternalMSL.g:3070:2: ( rule__ConcreteGroup__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMSL.g:3070:3: rule__ConcreteGroup__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConcreteGroup__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConcreteGroupAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group__5__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group__6"
    // InternalMSL.g:3078:1: rule__ConcreteGroup__Group__6 : rule__ConcreteGroup__Group__6__Impl rule__ConcreteGroup__Group__7 ;
    public final void rule__ConcreteGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3082:1: ( rule__ConcreteGroup__Group__6__Impl rule__ConcreteGroup__Group__7 )
            // InternalMSL.g:3083:2: rule__ConcreteGroup__Group__6__Impl rule__ConcreteGroup__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__ConcreteGroup__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group__6"


    // $ANTLR start "rule__ConcreteGroup__Group__6__Impl"
    // InternalMSL.g:3090:1: rule__ConcreteGroup__Group__6__Impl : ( 'components' ) ;
    public final void rule__ConcreteGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3094:1: ( ( 'components' ) )
            // InternalMSL.g:3095:1: ( 'components' )
            {
            // InternalMSL.g:3095:1: ( 'components' )
            // InternalMSL.g:3096:2: 'components'
            {
             before(grammarAccess.getConcreteGroupAccess().getComponentsKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getConcreteGroupAccess().getComponentsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group__6__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group__7"
    // InternalMSL.g:3105:1: rule__ConcreteGroup__Group__7 : rule__ConcreteGroup__Group__7__Impl rule__ConcreteGroup__Group__8 ;
    public final void rule__ConcreteGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3109:1: ( rule__ConcreteGroup__Group__7__Impl rule__ConcreteGroup__Group__8 )
            // InternalMSL.g:3110:2: rule__ConcreteGroup__Group__7__Impl rule__ConcreteGroup__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__ConcreteGroup__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group__7"


    // $ANTLR start "rule__ConcreteGroup__Group__7__Impl"
    // InternalMSL.g:3117:1: rule__ConcreteGroup__Group__7__Impl : ( ( rule__ConcreteGroup__ComponentsAssignment_7 ) ) ;
    public final void rule__ConcreteGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3121:1: ( ( ( rule__ConcreteGroup__ComponentsAssignment_7 ) ) )
            // InternalMSL.g:3122:1: ( ( rule__ConcreteGroup__ComponentsAssignment_7 ) )
            {
            // InternalMSL.g:3122:1: ( ( rule__ConcreteGroup__ComponentsAssignment_7 ) )
            // InternalMSL.g:3123:2: ( rule__ConcreteGroup__ComponentsAssignment_7 )
            {
             before(grammarAccess.getConcreteGroupAccess().getComponentsAssignment_7()); 
            // InternalMSL.g:3124:2: ( rule__ConcreteGroup__ComponentsAssignment_7 )
            // InternalMSL.g:3124:3: rule__ConcreteGroup__ComponentsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__ComponentsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getConcreteGroupAccess().getComponentsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group__7__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group__8"
    // InternalMSL.g:3132:1: rule__ConcreteGroup__Group__8 : rule__ConcreteGroup__Group__8__Impl rule__ConcreteGroup__Group__9 ;
    public final void rule__ConcreteGroup__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3136:1: ( rule__ConcreteGroup__Group__8__Impl rule__ConcreteGroup__Group__9 )
            // InternalMSL.g:3137:2: rule__ConcreteGroup__Group__8__Impl rule__ConcreteGroup__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__ConcreteGroup__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group__8"


    // $ANTLR start "rule__ConcreteGroup__Group__8__Impl"
    // InternalMSL.g:3144:1: rule__ConcreteGroup__Group__8__Impl : ( ( rule__ConcreteGroup__Group_8__0 )* ) ;
    public final void rule__ConcreteGroup__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3148:1: ( ( ( rule__ConcreteGroup__Group_8__0 )* ) )
            // InternalMSL.g:3149:1: ( ( rule__ConcreteGroup__Group_8__0 )* )
            {
            // InternalMSL.g:3149:1: ( ( rule__ConcreteGroup__Group_8__0 )* )
            // InternalMSL.g:3150:2: ( rule__ConcreteGroup__Group_8__0 )*
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup_8()); 
            // InternalMSL.g:3151:2: ( rule__ConcreteGroup__Group_8__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==38) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMSL.g:3151:3: rule__ConcreteGroup__Group_8__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ConcreteGroup__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getConcreteGroupAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group__8__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group__9"
    // InternalMSL.g:3159:1: rule__ConcreteGroup__Group__9 : rule__ConcreteGroup__Group__9__Impl ;
    public final void rule__ConcreteGroup__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3163:1: ( rule__ConcreteGroup__Group__9__Impl )
            // InternalMSL.g:3164:2: rule__ConcreteGroup__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group__9"


    // $ANTLR start "rule__ConcreteGroup__Group__9__Impl"
    // InternalMSL.g:3170:1: rule__ConcreteGroup__Group__9__Impl : ( '}' ) ;
    public final void rule__ConcreteGroup__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3174:1: ( ( '}' ) )
            // InternalMSL.g:3175:1: ( '}' )
            {
            // InternalMSL.g:3175:1: ( '}' )
            // InternalMSL.g:3176:2: '}'
            {
             before(grammarAccess.getConcreteGroupAccess().getRightCurlyBracketKeyword_9()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConcreteGroupAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group__9__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group_2__0"
    // InternalMSL.g:3186:1: rule__ConcreteGroup__Group_2__0 : rule__ConcreteGroup__Group_2__0__Impl rule__ConcreteGroup__Group_2__1 ;
    public final void rule__ConcreteGroup__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3190:1: ( rule__ConcreteGroup__Group_2__0__Impl rule__ConcreteGroup__Group_2__1 )
            // InternalMSL.g:3191:2: rule__ConcreteGroup__Group_2__0__Impl rule__ConcreteGroup__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__ConcreteGroup__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_2__0"


    // $ANTLR start "rule__ConcreteGroup__Group_2__0__Impl"
    // InternalMSL.g:3198:1: rule__ConcreteGroup__Group_2__0__Impl : ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_0 ) ) ;
    public final void rule__ConcreteGroup__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3202:1: ( ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_0 ) ) )
            // InternalMSL.g:3203:1: ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_0 ) )
            {
            // InternalMSL.g:3203:1: ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_0 ) )
            // InternalMSL.g:3204:2: ( rule__ConcreteGroup__AbstractGroupsAssignment_2_0 )
            {
             before(grammarAccess.getConcreteGroupAccess().getAbstractGroupsAssignment_2_0()); 
            // InternalMSL.g:3205:2: ( rule__ConcreteGroup__AbstractGroupsAssignment_2_0 )
            // InternalMSL.g:3205:3: rule__ConcreteGroup__AbstractGroupsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__AbstractGroupsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getConcreteGroupAccess().getAbstractGroupsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_2__0__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group_2__1"
    // InternalMSL.g:3213:1: rule__ConcreteGroup__Group_2__1 : rule__ConcreteGroup__Group_2__1__Impl ;
    public final void rule__ConcreteGroup__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3217:1: ( rule__ConcreteGroup__Group_2__1__Impl )
            // InternalMSL.g:3218:2: rule__ConcreteGroup__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_2__1"


    // $ANTLR start "rule__ConcreteGroup__Group_2__1__Impl"
    // InternalMSL.g:3224:1: rule__ConcreteGroup__Group_2__1__Impl : ( ( rule__ConcreteGroup__Group_2_1__0 )* ) ;
    public final void rule__ConcreteGroup__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3228:1: ( ( ( rule__ConcreteGroup__Group_2_1__0 )* ) )
            // InternalMSL.g:3229:1: ( ( rule__ConcreteGroup__Group_2_1__0 )* )
            {
            // InternalMSL.g:3229:1: ( ( rule__ConcreteGroup__Group_2_1__0 )* )
            // InternalMSL.g:3230:2: ( rule__ConcreteGroup__Group_2_1__0 )*
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup_2_1()); 
            // InternalMSL.g:3231:2: ( rule__ConcreteGroup__Group_2_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==38) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMSL.g:3231:3: rule__ConcreteGroup__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ConcreteGroup__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getConcreteGroupAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_2__1__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group_2_1__0"
    // InternalMSL.g:3240:1: rule__ConcreteGroup__Group_2_1__0 : rule__ConcreteGroup__Group_2_1__0__Impl rule__ConcreteGroup__Group_2_1__1 ;
    public final void rule__ConcreteGroup__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3244:1: ( rule__ConcreteGroup__Group_2_1__0__Impl rule__ConcreteGroup__Group_2_1__1 )
            // InternalMSL.g:3245:2: rule__ConcreteGroup__Group_2_1__0__Impl rule__ConcreteGroup__Group_2_1__1
            {
            pushFollow(FOLLOW_24);
            rule__ConcreteGroup__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_2_1__0"


    // $ANTLR start "rule__ConcreteGroup__Group_2_1__0__Impl"
    // InternalMSL.g:3252:1: rule__ConcreteGroup__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ConcreteGroup__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3256:1: ( ( ',' ) )
            // InternalMSL.g:3257:1: ( ',' )
            {
            // InternalMSL.g:3257:1: ( ',' )
            // InternalMSL.g:3258:2: ','
            {
             before(grammarAccess.getConcreteGroupAccess().getCommaKeyword_2_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConcreteGroupAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_2_1__0__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group_2_1__1"
    // InternalMSL.g:3267:1: rule__ConcreteGroup__Group_2_1__1 : rule__ConcreteGroup__Group_2_1__1__Impl ;
    public final void rule__ConcreteGroup__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3271:1: ( rule__ConcreteGroup__Group_2_1__1__Impl )
            // InternalMSL.g:3272:2: rule__ConcreteGroup__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_2_1__1"


    // $ANTLR start "rule__ConcreteGroup__Group_2_1__1__Impl"
    // InternalMSL.g:3278:1: rule__ConcreteGroup__Group_2_1__1__Impl : ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 ) ) ;
    public final void rule__ConcreteGroup__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3282:1: ( ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 ) ) )
            // InternalMSL.g:3283:1: ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 ) )
            {
            // InternalMSL.g:3283:1: ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 ) )
            // InternalMSL.g:3284:2: ( rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 )
            {
             before(grammarAccess.getConcreteGroupAccess().getAbstractGroupsAssignment_2_1_1()); 
            // InternalMSL.g:3285:2: ( rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 )
            // InternalMSL.g:3285:3: rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConcreteGroupAccess().getAbstractGroupsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_2_1__1__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group_4__0"
    // InternalMSL.g:3294:1: rule__ConcreteGroup__Group_4__0 : rule__ConcreteGroup__Group_4__0__Impl rule__ConcreteGroup__Group_4__1 ;
    public final void rule__ConcreteGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3298:1: ( rule__ConcreteGroup__Group_4__0__Impl rule__ConcreteGroup__Group_4__1 )
            // InternalMSL.g:3299:2: rule__ConcreteGroup__Group_4__0__Impl rule__ConcreteGroup__Group_4__1
            {
            pushFollow(FOLLOW_31);
            rule__ConcreteGroup__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_4__0"


    // $ANTLR start "rule__ConcreteGroup__Group_4__0__Impl"
    // InternalMSL.g:3306:1: rule__ConcreteGroup__Group_4__0__Impl : ( 'managedSyS' ) ;
    public final void rule__ConcreteGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3310:1: ( ( 'managedSyS' ) )
            // InternalMSL.g:3311:1: ( 'managedSyS' )
            {
            // InternalMSL.g:3311:1: ( 'managedSyS' )
            // InternalMSL.g:3312:2: 'managedSyS'
            {
             before(grammarAccess.getConcreteGroupAccess().getManagedSySKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getConcreteGroupAccess().getManagedSySKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_4__0__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group_4__1"
    // InternalMSL.g:3321:1: rule__ConcreteGroup__Group_4__1 : rule__ConcreteGroup__Group_4__1__Impl rule__ConcreteGroup__Group_4__2 ;
    public final void rule__ConcreteGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3325:1: ( rule__ConcreteGroup__Group_4__1__Impl rule__ConcreteGroup__Group_4__2 )
            // InternalMSL.g:3326:2: rule__ConcreteGroup__Group_4__1__Impl rule__ConcreteGroup__Group_4__2
            {
            pushFollow(FOLLOW_20);
            rule__ConcreteGroup__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_4__1"


    // $ANTLR start "rule__ConcreteGroup__Group_4__1__Impl"
    // InternalMSL.g:3333:1: rule__ConcreteGroup__Group_4__1__Impl : ( ( rule__ConcreteGroup__ManSysAssignment_4_1 ) ) ;
    public final void rule__ConcreteGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3337:1: ( ( ( rule__ConcreteGroup__ManSysAssignment_4_1 ) ) )
            // InternalMSL.g:3338:1: ( ( rule__ConcreteGroup__ManSysAssignment_4_1 ) )
            {
            // InternalMSL.g:3338:1: ( ( rule__ConcreteGroup__ManSysAssignment_4_1 ) )
            // InternalMSL.g:3339:2: ( rule__ConcreteGroup__ManSysAssignment_4_1 )
            {
             before(grammarAccess.getConcreteGroupAccess().getManSysAssignment_4_1()); 
            // InternalMSL.g:3340:2: ( rule__ConcreteGroup__ManSysAssignment_4_1 )
            // InternalMSL.g:3340:3: rule__ConcreteGroup__ManSysAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__ManSysAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConcreteGroupAccess().getManSysAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_4__1__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group_4__2"
    // InternalMSL.g:3348:1: rule__ConcreteGroup__Group_4__2 : rule__ConcreteGroup__Group_4__2__Impl ;
    public final void rule__ConcreteGroup__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3352:1: ( rule__ConcreteGroup__Group_4__2__Impl )
            // InternalMSL.g:3353:2: rule__ConcreteGroup__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_4__2"


    // $ANTLR start "rule__ConcreteGroup__Group_4__2__Impl"
    // InternalMSL.g:3359:1: rule__ConcreteGroup__Group_4__2__Impl : ( ( rule__ConcreteGroup__Group_4_2__0 )* ) ;
    public final void rule__ConcreteGroup__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3363:1: ( ( ( rule__ConcreteGroup__Group_4_2__0 )* ) )
            // InternalMSL.g:3364:1: ( ( rule__ConcreteGroup__Group_4_2__0 )* )
            {
            // InternalMSL.g:3364:1: ( ( rule__ConcreteGroup__Group_4_2__0 )* )
            // InternalMSL.g:3365:2: ( rule__ConcreteGroup__Group_4_2__0 )*
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup_4_2()); 
            // InternalMSL.g:3366:2: ( rule__ConcreteGroup__Group_4_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==38) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMSL.g:3366:3: rule__ConcreteGroup__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ConcreteGroup__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getConcreteGroupAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_4__2__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group_4_2__0"
    // InternalMSL.g:3375:1: rule__ConcreteGroup__Group_4_2__0 : rule__ConcreteGroup__Group_4_2__0__Impl rule__ConcreteGroup__Group_4_2__1 ;
    public final void rule__ConcreteGroup__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3379:1: ( rule__ConcreteGroup__Group_4_2__0__Impl rule__ConcreteGroup__Group_4_2__1 )
            // InternalMSL.g:3380:2: rule__ConcreteGroup__Group_4_2__0__Impl rule__ConcreteGroup__Group_4_2__1
            {
            pushFollow(FOLLOW_31);
            rule__ConcreteGroup__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_4_2__0"


    // $ANTLR start "rule__ConcreteGroup__Group_4_2__0__Impl"
    // InternalMSL.g:3387:1: rule__ConcreteGroup__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__ConcreteGroup__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3391:1: ( ( ',' ) )
            // InternalMSL.g:3392:1: ( ',' )
            {
            // InternalMSL.g:3392:1: ( ',' )
            // InternalMSL.g:3393:2: ','
            {
             before(grammarAccess.getConcreteGroupAccess().getCommaKeyword_4_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConcreteGroupAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_4_2__0__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group_4_2__1"
    // InternalMSL.g:3402:1: rule__ConcreteGroup__Group_4_2__1 : rule__ConcreteGroup__Group_4_2__1__Impl ;
    public final void rule__ConcreteGroup__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3406:1: ( rule__ConcreteGroup__Group_4_2__1__Impl )
            // InternalMSL.g:3407:2: rule__ConcreteGroup__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_4_2__1"


    // $ANTLR start "rule__ConcreteGroup__Group_4_2__1__Impl"
    // InternalMSL.g:3413:1: rule__ConcreteGroup__Group_4_2__1__Impl : ( ( rule__ConcreteGroup__ManSysAssignment_4_2_1 ) ) ;
    public final void rule__ConcreteGroup__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3417:1: ( ( ( rule__ConcreteGroup__ManSysAssignment_4_2_1 ) ) )
            // InternalMSL.g:3418:1: ( ( rule__ConcreteGroup__ManSysAssignment_4_2_1 ) )
            {
            // InternalMSL.g:3418:1: ( ( rule__ConcreteGroup__ManSysAssignment_4_2_1 ) )
            // InternalMSL.g:3419:2: ( rule__ConcreteGroup__ManSysAssignment_4_2_1 )
            {
             before(grammarAccess.getConcreteGroupAccess().getManSysAssignment_4_2_1()); 
            // InternalMSL.g:3420:2: ( rule__ConcreteGroup__ManSysAssignment_4_2_1 )
            // InternalMSL.g:3420:3: rule__ConcreteGroup__ManSysAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__ManSysAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConcreteGroupAccess().getManSysAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_4_2__1__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group_5__0"
    // InternalMSL.g:3429:1: rule__ConcreteGroup__Group_5__0 : rule__ConcreteGroup__Group_5__0__Impl rule__ConcreteGroup__Group_5__1 ;
    public final void rule__ConcreteGroup__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3433:1: ( rule__ConcreteGroup__Group_5__0__Impl rule__ConcreteGroup__Group_5__1 )
            // InternalMSL.g:3434:2: rule__ConcreteGroup__Group_5__0__Impl rule__ConcreteGroup__Group_5__1
            {
            pushFollow(FOLLOW_31);
            rule__ConcreteGroup__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_5__0"


    // $ANTLR start "rule__ConcreteGroup__Group_5__0__Impl"
    // InternalMSL.g:3441:1: rule__ConcreteGroup__Group_5__0__Impl : ( 'managedGrp' ) ;
    public final void rule__ConcreteGroup__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3445:1: ( ( 'managedGrp' ) )
            // InternalMSL.g:3446:1: ( 'managedGrp' )
            {
            // InternalMSL.g:3446:1: ( 'managedGrp' )
            // InternalMSL.g:3447:2: 'managedGrp'
            {
             before(grammarAccess.getConcreteGroupAccess().getManagedGrpKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getConcreteGroupAccess().getManagedGrpKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_5__0__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group_5__1"
    // InternalMSL.g:3456:1: rule__ConcreteGroup__Group_5__1 : rule__ConcreteGroup__Group_5__1__Impl rule__ConcreteGroup__Group_5__2 ;
    public final void rule__ConcreteGroup__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3460:1: ( rule__ConcreteGroup__Group_5__1__Impl rule__ConcreteGroup__Group_5__2 )
            // InternalMSL.g:3461:2: rule__ConcreteGroup__Group_5__1__Impl rule__ConcreteGroup__Group_5__2
            {
            pushFollow(FOLLOW_20);
            rule__ConcreteGroup__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_5__1"


    // $ANTLR start "rule__ConcreteGroup__Group_5__1__Impl"
    // InternalMSL.g:3468:1: rule__ConcreteGroup__Group_5__1__Impl : ( ( rule__ConcreteGroup__ManGrpAssignment_5_1 ) ) ;
    public final void rule__ConcreteGroup__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3472:1: ( ( ( rule__ConcreteGroup__ManGrpAssignment_5_1 ) ) )
            // InternalMSL.g:3473:1: ( ( rule__ConcreteGroup__ManGrpAssignment_5_1 ) )
            {
            // InternalMSL.g:3473:1: ( ( rule__ConcreteGroup__ManGrpAssignment_5_1 ) )
            // InternalMSL.g:3474:2: ( rule__ConcreteGroup__ManGrpAssignment_5_1 )
            {
             before(grammarAccess.getConcreteGroupAccess().getManGrpAssignment_5_1()); 
            // InternalMSL.g:3475:2: ( rule__ConcreteGroup__ManGrpAssignment_5_1 )
            // InternalMSL.g:3475:3: rule__ConcreteGroup__ManGrpAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__ManGrpAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConcreteGroupAccess().getManGrpAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_5__1__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group_5__2"
    // InternalMSL.g:3483:1: rule__ConcreteGroup__Group_5__2 : rule__ConcreteGroup__Group_5__2__Impl ;
    public final void rule__ConcreteGroup__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3487:1: ( rule__ConcreteGroup__Group_5__2__Impl )
            // InternalMSL.g:3488:2: rule__ConcreteGroup__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_5__2"


    // $ANTLR start "rule__ConcreteGroup__Group_5__2__Impl"
    // InternalMSL.g:3494:1: rule__ConcreteGroup__Group_5__2__Impl : ( ( rule__ConcreteGroup__Group_5_2__0 )* ) ;
    public final void rule__ConcreteGroup__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3498:1: ( ( ( rule__ConcreteGroup__Group_5_2__0 )* ) )
            // InternalMSL.g:3499:1: ( ( rule__ConcreteGroup__Group_5_2__0 )* )
            {
            // InternalMSL.g:3499:1: ( ( rule__ConcreteGroup__Group_5_2__0 )* )
            // InternalMSL.g:3500:2: ( rule__ConcreteGroup__Group_5_2__0 )*
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup_5_2()); 
            // InternalMSL.g:3501:2: ( rule__ConcreteGroup__Group_5_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==38) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMSL.g:3501:3: rule__ConcreteGroup__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ConcreteGroup__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getConcreteGroupAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_5__2__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group_5_2__0"
    // InternalMSL.g:3510:1: rule__ConcreteGroup__Group_5_2__0 : rule__ConcreteGroup__Group_5_2__0__Impl rule__ConcreteGroup__Group_5_2__1 ;
    public final void rule__ConcreteGroup__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3514:1: ( rule__ConcreteGroup__Group_5_2__0__Impl rule__ConcreteGroup__Group_5_2__1 )
            // InternalMSL.g:3515:2: rule__ConcreteGroup__Group_5_2__0__Impl rule__ConcreteGroup__Group_5_2__1
            {
            pushFollow(FOLLOW_31);
            rule__ConcreteGroup__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_5_2__0"


    // $ANTLR start "rule__ConcreteGroup__Group_5_2__0__Impl"
    // InternalMSL.g:3522:1: rule__ConcreteGroup__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__ConcreteGroup__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3526:1: ( ( ',' ) )
            // InternalMSL.g:3527:1: ( ',' )
            {
            // InternalMSL.g:3527:1: ( ',' )
            // InternalMSL.g:3528:2: ','
            {
             before(grammarAccess.getConcreteGroupAccess().getCommaKeyword_5_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConcreteGroupAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_5_2__0__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group_5_2__1"
    // InternalMSL.g:3537:1: rule__ConcreteGroup__Group_5_2__1 : rule__ConcreteGroup__Group_5_2__1__Impl ;
    public final void rule__ConcreteGroup__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3541:1: ( rule__ConcreteGroup__Group_5_2__1__Impl )
            // InternalMSL.g:3542:2: rule__ConcreteGroup__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_5_2__1"


    // $ANTLR start "rule__ConcreteGroup__Group_5_2__1__Impl"
    // InternalMSL.g:3548:1: rule__ConcreteGroup__Group_5_2__1__Impl : ( ( rule__ConcreteGroup__ManGrpAssignment_5_2_1 ) ) ;
    public final void rule__ConcreteGroup__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3552:1: ( ( ( rule__ConcreteGroup__ManGrpAssignment_5_2_1 ) ) )
            // InternalMSL.g:3553:1: ( ( rule__ConcreteGroup__ManGrpAssignment_5_2_1 ) )
            {
            // InternalMSL.g:3553:1: ( ( rule__ConcreteGroup__ManGrpAssignment_5_2_1 ) )
            // InternalMSL.g:3554:2: ( rule__ConcreteGroup__ManGrpAssignment_5_2_1 )
            {
             before(grammarAccess.getConcreteGroupAccess().getManGrpAssignment_5_2_1()); 
            // InternalMSL.g:3555:2: ( rule__ConcreteGroup__ManGrpAssignment_5_2_1 )
            // InternalMSL.g:3555:3: rule__ConcreteGroup__ManGrpAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__ManGrpAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConcreteGroupAccess().getManGrpAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_5_2__1__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group_8__0"
    // InternalMSL.g:3564:1: rule__ConcreteGroup__Group_8__0 : rule__ConcreteGroup__Group_8__0__Impl rule__ConcreteGroup__Group_8__1 ;
    public final void rule__ConcreteGroup__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3568:1: ( rule__ConcreteGroup__Group_8__0__Impl rule__ConcreteGroup__Group_8__1 )
            // InternalMSL.g:3569:2: rule__ConcreteGroup__Group_8__0__Impl rule__ConcreteGroup__Group_8__1
            {
            pushFollow(FOLLOW_31);
            rule__ConcreteGroup__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_8__0"


    // $ANTLR start "rule__ConcreteGroup__Group_8__0__Impl"
    // InternalMSL.g:3576:1: rule__ConcreteGroup__Group_8__0__Impl : ( ',' ) ;
    public final void rule__ConcreteGroup__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3580:1: ( ( ',' ) )
            // InternalMSL.g:3581:1: ( ',' )
            {
            // InternalMSL.g:3581:1: ( ',' )
            // InternalMSL.g:3582:2: ','
            {
             before(grammarAccess.getConcreteGroupAccess().getCommaKeyword_8_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConcreteGroupAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_8__0__Impl"


    // $ANTLR start "rule__ConcreteGroup__Group_8__1"
    // InternalMSL.g:3591:1: rule__ConcreteGroup__Group_8__1 : rule__ConcreteGroup__Group_8__1__Impl ;
    public final void rule__ConcreteGroup__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3595:1: ( rule__ConcreteGroup__Group_8__1__Impl )
            // InternalMSL.g:3596:2: rule__ConcreteGroup__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_8__1"


    // $ANTLR start "rule__ConcreteGroup__Group_8__1__Impl"
    // InternalMSL.g:3602:1: rule__ConcreteGroup__Group_8__1__Impl : ( ( rule__ConcreteGroup__ComponentsAssignment_8_1 ) ) ;
    public final void rule__ConcreteGroup__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3606:1: ( ( ( rule__ConcreteGroup__ComponentsAssignment_8_1 ) ) )
            // InternalMSL.g:3607:1: ( ( rule__ConcreteGroup__ComponentsAssignment_8_1 ) )
            {
            // InternalMSL.g:3607:1: ( ( rule__ConcreteGroup__ComponentsAssignment_8_1 ) )
            // InternalMSL.g:3608:2: ( rule__ConcreteGroup__ComponentsAssignment_8_1 )
            {
             before(grammarAccess.getConcreteGroupAccess().getComponentsAssignment_8_1()); 
            // InternalMSL.g:3609:2: ( rule__ConcreteGroup__ComponentsAssignment_8_1 )
            // InternalMSL.g:3609:3: rule__ConcreteGroup__ComponentsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__ComponentsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getConcreteGroupAccess().getComponentsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__Group_8__1__Impl"


    // $ANTLR start "rule__ParamValue__Group__0"
    // InternalMSL.g:3618:1: rule__ParamValue__Group__0 : rule__ParamValue__Group__0__Impl rule__ParamValue__Group__1 ;
    public final void rule__ParamValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3622:1: ( rule__ParamValue__Group__0__Impl rule__ParamValue__Group__1 )
            // InternalMSL.g:3623:2: rule__ParamValue__Group__0__Impl rule__ParamValue__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__ParamValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValue__Group__0"


    // $ANTLR start "rule__ParamValue__Group__0__Impl"
    // InternalMSL.g:3630:1: rule__ParamValue__Group__0__Impl : ( '[' ) ;
    public final void rule__ParamValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3634:1: ( ( '[' ) )
            // InternalMSL.g:3635:1: ( '[' )
            {
            // InternalMSL.g:3635:1: ( '[' )
            // InternalMSL.g:3636:2: '['
            {
             before(grammarAccess.getParamValueAccess().getLeftSquareBracketKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getParamValueAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValue__Group__0__Impl"


    // $ANTLR start "rule__ParamValue__Group__1"
    // InternalMSL.g:3645:1: rule__ParamValue__Group__1 : rule__ParamValue__Group__1__Impl rule__ParamValue__Group__2 ;
    public final void rule__ParamValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3649:1: ( rule__ParamValue__Group__1__Impl rule__ParamValue__Group__2 )
            // InternalMSL.g:3650:2: rule__ParamValue__Group__1__Impl rule__ParamValue__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__ParamValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValue__Group__1"


    // $ANTLR start "rule__ParamValue__Group__1__Impl"
    // InternalMSL.g:3657:1: rule__ParamValue__Group__1__Impl : ( ( rule__ParamValue__NameParamAssignment_1 ) ) ;
    public final void rule__ParamValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3661:1: ( ( ( rule__ParamValue__NameParamAssignment_1 ) ) )
            // InternalMSL.g:3662:1: ( ( rule__ParamValue__NameParamAssignment_1 ) )
            {
            // InternalMSL.g:3662:1: ( ( rule__ParamValue__NameParamAssignment_1 ) )
            // InternalMSL.g:3663:2: ( rule__ParamValue__NameParamAssignment_1 )
            {
             before(grammarAccess.getParamValueAccess().getNameParamAssignment_1()); 
            // InternalMSL.g:3664:2: ( rule__ParamValue__NameParamAssignment_1 )
            // InternalMSL.g:3664:3: rule__ParamValue__NameParamAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParamValue__NameParamAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParamValueAccess().getNameParamAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValue__Group__1__Impl"


    // $ANTLR start "rule__ParamValue__Group__2"
    // InternalMSL.g:3672:1: rule__ParamValue__Group__2 : rule__ParamValue__Group__2__Impl rule__ParamValue__Group__3 ;
    public final void rule__ParamValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3676:1: ( rule__ParamValue__Group__2__Impl rule__ParamValue__Group__3 )
            // InternalMSL.g:3677:2: rule__ParamValue__Group__2__Impl rule__ParamValue__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__ParamValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValue__Group__2"


    // $ANTLR start "rule__ParamValue__Group__2__Impl"
    // InternalMSL.g:3684:1: rule__ParamValue__Group__2__Impl : ( '=' ) ;
    public final void rule__ParamValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3688:1: ( ( '=' ) )
            // InternalMSL.g:3689:1: ( '=' )
            {
            // InternalMSL.g:3689:1: ( '=' )
            // InternalMSL.g:3690:2: '='
            {
             before(grammarAccess.getParamValueAccess().getEqualsSignKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getParamValueAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValue__Group__2__Impl"


    // $ANTLR start "rule__ParamValue__Group__3"
    // InternalMSL.g:3699:1: rule__ParamValue__Group__3 : rule__ParamValue__Group__3__Impl rule__ParamValue__Group__4 ;
    public final void rule__ParamValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3703:1: ( rule__ParamValue__Group__3__Impl rule__ParamValue__Group__4 )
            // InternalMSL.g:3704:2: rule__ParamValue__Group__3__Impl rule__ParamValue__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__ParamValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValue__Group__3"


    // $ANTLR start "rule__ParamValue__Group__3__Impl"
    // InternalMSL.g:3711:1: rule__ParamValue__Group__3__Impl : ( ( rule__ParamValue__ValParamAssignment_3 ) ) ;
    public final void rule__ParamValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3715:1: ( ( ( rule__ParamValue__ValParamAssignment_3 ) ) )
            // InternalMSL.g:3716:1: ( ( rule__ParamValue__ValParamAssignment_3 ) )
            {
            // InternalMSL.g:3716:1: ( ( rule__ParamValue__ValParamAssignment_3 ) )
            // InternalMSL.g:3717:2: ( rule__ParamValue__ValParamAssignment_3 )
            {
             before(grammarAccess.getParamValueAccess().getValParamAssignment_3()); 
            // InternalMSL.g:3718:2: ( rule__ParamValue__ValParamAssignment_3 )
            // InternalMSL.g:3718:3: rule__ParamValue__ValParamAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ParamValue__ValParamAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParamValueAccess().getValParamAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValue__Group__3__Impl"


    // $ANTLR start "rule__ParamValue__Group__4"
    // InternalMSL.g:3726:1: rule__ParamValue__Group__4 : rule__ParamValue__Group__4__Impl rule__ParamValue__Group__5 ;
    public final void rule__ParamValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3730:1: ( rule__ParamValue__Group__4__Impl rule__ParamValue__Group__5 )
            // InternalMSL.g:3731:2: rule__ParamValue__Group__4__Impl rule__ParamValue__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__ParamValue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamValue__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValue__Group__4"


    // $ANTLR start "rule__ParamValue__Group__4__Impl"
    // InternalMSL.g:3738:1: rule__ParamValue__Group__4__Impl : ( ( rule__ParamValue__UnitAssignment_4 )? ) ;
    public final void rule__ParamValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3742:1: ( ( ( rule__ParamValue__UnitAssignment_4 )? ) )
            // InternalMSL.g:3743:1: ( ( rule__ParamValue__UnitAssignment_4 )? )
            {
            // InternalMSL.g:3743:1: ( ( rule__ParamValue__UnitAssignment_4 )? )
            // InternalMSL.g:3744:2: ( rule__ParamValue__UnitAssignment_4 )?
            {
             before(grammarAccess.getParamValueAccess().getUnitAssignment_4()); 
            // InternalMSL.g:3745:2: ( rule__ParamValue__UnitAssignment_4 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=19 && LA28_0<=25)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMSL.g:3745:3: rule__ParamValue__UnitAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParamValue__UnitAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParamValueAccess().getUnitAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValue__Group__4__Impl"


    // $ANTLR start "rule__ParamValue__Group__5"
    // InternalMSL.g:3753:1: rule__ParamValue__Group__5 : rule__ParamValue__Group__5__Impl ;
    public final void rule__ParamValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3757:1: ( rule__ParamValue__Group__5__Impl )
            // InternalMSL.g:3758:2: rule__ParamValue__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamValue__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValue__Group__5"


    // $ANTLR start "rule__ParamValue__Group__5__Impl"
    // InternalMSL.g:3764:1: rule__ParamValue__Group__5__Impl : ( ']' ) ;
    public final void rule__ParamValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3768:1: ( ( ']' ) )
            // InternalMSL.g:3769:1: ( ']' )
            {
            // InternalMSL.g:3769:1: ( ']' )
            // InternalMSL.g:3770:2: ']'
            {
             before(grammarAccess.getParamValueAccess().getRightSquareBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getParamValueAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValue__Group__5__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__0"
    // InternalMSL.g:3780:1: rule__ComponentInstance__Group__0 : rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 ;
    public final void rule__ComponentInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3784:1: ( rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 )
            // InternalMSL.g:3785:2: rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ComponentInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__0"


    // $ANTLR start "rule__ComponentInstance__Group__0__Impl"
    // InternalMSL.g:3792:1: rule__ComponentInstance__Group__0__Impl : ( ( rule__ComponentInstance__NameAssignment_0 ) ) ;
    public final void rule__ComponentInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3796:1: ( ( ( rule__ComponentInstance__NameAssignment_0 ) ) )
            // InternalMSL.g:3797:1: ( ( rule__ComponentInstance__NameAssignment_0 ) )
            {
            // InternalMSL.g:3797:1: ( ( rule__ComponentInstance__NameAssignment_0 ) )
            // InternalMSL.g:3798:2: ( rule__ComponentInstance__NameAssignment_0 )
            {
             before(grammarAccess.getComponentInstanceAccess().getNameAssignment_0()); 
            // InternalMSL.g:3799:2: ( rule__ComponentInstance__NameAssignment_0 )
            // InternalMSL.g:3799:3: rule__ComponentInstance__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstanceAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__0__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__1"
    // InternalMSL.g:3807:1: rule__ComponentInstance__Group__1 : rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 ;
    public final void rule__ComponentInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3811:1: ( rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 )
            // InternalMSL.g:3812:2: rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ComponentInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__1"


    // $ANTLR start "rule__ComponentInstance__Group__1__Impl"
    // InternalMSL.g:3819:1: rule__ComponentInstance__Group__1__Impl : ( ':' ) ;
    public final void rule__ComponentInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3823:1: ( ( ':' ) )
            // InternalMSL.g:3824:1: ( ':' )
            {
            // InternalMSL.g:3824:1: ( ':' )
            // InternalMSL.g:3825:2: ':'
            {
             before(grammarAccess.getComponentInstanceAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__1__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__2"
    // InternalMSL.g:3834:1: rule__ComponentInstance__Group__2 : rule__ComponentInstance__Group__2__Impl rule__ComponentInstance__Group__3 ;
    public final void rule__ComponentInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3838:1: ( rule__ComponentInstance__Group__2__Impl rule__ComponentInstance__Group__3 )
            // InternalMSL.g:3839:2: rule__ComponentInstance__Group__2__Impl rule__ComponentInstance__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ComponentInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__2"


    // $ANTLR start "rule__ComponentInstance__Group__2__Impl"
    // InternalMSL.g:3846:1: rule__ComponentInstance__Group__2__Impl : ( ( rule__ComponentInstance__TypeAssignment_2 ) ) ;
    public final void rule__ComponentInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3850:1: ( ( ( rule__ComponentInstance__TypeAssignment_2 ) ) )
            // InternalMSL.g:3851:1: ( ( rule__ComponentInstance__TypeAssignment_2 ) )
            {
            // InternalMSL.g:3851:1: ( ( rule__ComponentInstance__TypeAssignment_2 ) )
            // InternalMSL.g:3852:2: ( rule__ComponentInstance__TypeAssignment_2 )
            {
             before(grammarAccess.getComponentInstanceAccess().getTypeAssignment_2()); 
            // InternalMSL.g:3853:2: ( rule__ComponentInstance__TypeAssignment_2 )
            // InternalMSL.g:3853:3: rule__ComponentInstance__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstanceAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__2__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__3"
    // InternalMSL.g:3861:1: rule__ComponentInstance__Group__3 : rule__ComponentInstance__Group__3__Impl ;
    public final void rule__ComponentInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3865:1: ( rule__ComponentInstance__Group__3__Impl )
            // InternalMSL.g:3866:2: rule__ComponentInstance__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__3"


    // $ANTLR start "rule__ComponentInstance__Group__3__Impl"
    // InternalMSL.g:3872:1: rule__ComponentInstance__Group__3__Impl : ( ( rule__ComponentInstance__Group_3__0 )? ) ;
    public final void rule__ComponentInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3876:1: ( ( ( rule__ComponentInstance__Group_3__0 )? ) )
            // InternalMSL.g:3877:1: ( ( rule__ComponentInstance__Group_3__0 )? )
            {
            // InternalMSL.g:3877:1: ( ( rule__ComponentInstance__Group_3__0 )? )
            // InternalMSL.g:3878:2: ( rule__ComponentInstance__Group_3__0 )?
            {
             before(grammarAccess.getComponentInstanceAccess().getGroup_3()); 
            // InternalMSL.g:3879:2: ( rule__ComponentInstance__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMSL.g:3879:3: rule__ComponentInstance__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInstance__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInstanceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__3__Impl"


    // $ANTLR start "rule__ComponentInstance__Group_3__0"
    // InternalMSL.g:3888:1: rule__ComponentInstance__Group_3__0 : rule__ComponentInstance__Group_3__0__Impl rule__ComponentInstance__Group_3__1 ;
    public final void rule__ComponentInstance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3892:1: ( rule__ComponentInstance__Group_3__0__Impl rule__ComponentInstance__Group_3__1 )
            // InternalMSL.g:3893:2: rule__ComponentInstance__Group_3__0__Impl rule__ComponentInstance__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ComponentInstance__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group_3__0"


    // $ANTLR start "rule__ComponentInstance__Group_3__0__Impl"
    // InternalMSL.g:3900:1: rule__ComponentInstance__Group_3__0__Impl : ( ( rule__ComponentInstance__ParamValuesAssignment_3_0 ) ) ;
    public final void rule__ComponentInstance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3904:1: ( ( ( rule__ComponentInstance__ParamValuesAssignment_3_0 ) ) )
            // InternalMSL.g:3905:1: ( ( rule__ComponentInstance__ParamValuesAssignment_3_0 ) )
            {
            // InternalMSL.g:3905:1: ( ( rule__ComponentInstance__ParamValuesAssignment_3_0 ) )
            // InternalMSL.g:3906:2: ( rule__ComponentInstance__ParamValuesAssignment_3_0 )
            {
             before(grammarAccess.getComponentInstanceAccess().getParamValuesAssignment_3_0()); 
            // InternalMSL.g:3907:2: ( rule__ComponentInstance__ParamValuesAssignment_3_0 )
            // InternalMSL.g:3907:3: rule__ComponentInstance__ParamValuesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__ParamValuesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstanceAccess().getParamValuesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group_3__0__Impl"


    // $ANTLR start "rule__ComponentInstance__Group_3__1"
    // InternalMSL.g:3915:1: rule__ComponentInstance__Group_3__1 : rule__ComponentInstance__Group_3__1__Impl ;
    public final void rule__ComponentInstance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3919:1: ( rule__ComponentInstance__Group_3__1__Impl )
            // InternalMSL.g:3920:2: rule__ComponentInstance__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group_3__1"


    // $ANTLR start "rule__ComponentInstance__Group_3__1__Impl"
    // InternalMSL.g:3926:1: rule__ComponentInstance__Group_3__1__Impl : ( ( rule__ComponentInstance__ParamValuesAssignment_3_1 )* ) ;
    public final void rule__ComponentInstance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3930:1: ( ( ( rule__ComponentInstance__ParamValuesAssignment_3_1 )* ) )
            // InternalMSL.g:3931:1: ( ( rule__ComponentInstance__ParamValuesAssignment_3_1 )* )
            {
            // InternalMSL.g:3931:1: ( ( rule__ComponentInstance__ParamValuesAssignment_3_1 )* )
            // InternalMSL.g:3932:2: ( rule__ComponentInstance__ParamValuesAssignment_3_1 )*
            {
             before(grammarAccess.getComponentInstanceAccess().getParamValuesAssignment_3_1()); 
            // InternalMSL.g:3933:2: ( rule__ComponentInstance__ParamValuesAssignment_3_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==32) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMSL.g:3933:3: rule__ComponentInstance__ParamValuesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__ComponentInstance__ParamValuesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getComponentInstanceAccess().getParamValuesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group_3__1__Impl"


    // $ANTLR start "rule__Interaction__Group__0"
    // InternalMSL.g:3942:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3946:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // InternalMSL.g:3947:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Interaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__0"


    // $ANTLR start "rule__Interaction__Group__0__Impl"
    // InternalMSL.g:3954:1: rule__Interaction__Group__0__Impl : ( ( rule__Interaction__StartAssignment_0 ) ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3958:1: ( ( ( rule__Interaction__StartAssignment_0 ) ) )
            // InternalMSL.g:3959:1: ( ( rule__Interaction__StartAssignment_0 ) )
            {
            // InternalMSL.g:3959:1: ( ( rule__Interaction__StartAssignment_0 ) )
            // InternalMSL.g:3960:2: ( rule__Interaction__StartAssignment_0 )
            {
             before(grammarAccess.getInteractionAccess().getStartAssignment_0()); 
            // InternalMSL.g:3961:2: ( rule__Interaction__StartAssignment_0 )
            // InternalMSL.g:3961:3: rule__Interaction__StartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__StartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getStartAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__0__Impl"


    // $ANTLR start "rule__Interaction__Group__1"
    // InternalMSL.g:3969:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3973:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // InternalMSL.g:3974:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Interaction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__1"


    // $ANTLR start "rule__Interaction__Group__1__Impl"
    // InternalMSL.g:3981:1: rule__Interaction__Group__1__Impl : ( '->' ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3985:1: ( ( '->' ) )
            // InternalMSL.g:3986:1: ( '->' )
            {
            // InternalMSL.g:3986:1: ( '->' )
            // InternalMSL.g:3987:2: '->'
            {
             before(grammarAccess.getInteractionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__1__Impl"


    // $ANTLR start "rule__Interaction__Group__2"
    // InternalMSL.g:3996:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4000:1: ( rule__Interaction__Group__2__Impl )
            // InternalMSL.g:4001:2: rule__Interaction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__2"


    // $ANTLR start "rule__Interaction__Group__2__Impl"
    // InternalMSL.g:4007:1: rule__Interaction__Group__2__Impl : ( ( rule__Interaction__EndAssignment_2 ) ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4011:1: ( ( ( rule__Interaction__EndAssignment_2 ) ) )
            // InternalMSL.g:4012:1: ( ( rule__Interaction__EndAssignment_2 ) )
            {
            // InternalMSL.g:4012:1: ( ( rule__Interaction__EndAssignment_2 ) )
            // InternalMSL.g:4013:2: ( rule__Interaction__EndAssignment_2 )
            {
             before(grammarAccess.getInteractionAccess().getEndAssignment_2()); 
            // InternalMSL.g:4014:2: ( rule__Interaction__EndAssignment_2 )
            // InternalMSL.g:4014:3: rule__Interaction__EndAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__EndAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getEndAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__2__Impl"


    // $ANTLR start "rule__Specification__ImportsAssignment_0"
    // InternalMSL.g:4023:1: rule__Specification__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Specification__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4027:1: ( ( ruleImport ) )
            // InternalMSL.g:4028:2: ( ruleImport )
            {
            // InternalMSL.g:4028:2: ( ruleImport )
            // InternalMSL.g:4029:3: ruleImport
            {
             before(grammarAccess.getSpecificationAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__ImportsAssignment_0"


    // $ANTLR start "rule__Specification__AbsPatternAssignment_1"
    // InternalMSL.g:4038:1: rule__Specification__AbsPatternAssignment_1 : ( ruleAbstractPattern ) ;
    public final void rule__Specification__AbsPatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4042:1: ( ( ruleAbstractPattern ) )
            // InternalMSL.g:4043:2: ( ruleAbstractPattern )
            {
            // InternalMSL.g:4043:2: ( ruleAbstractPattern )
            // InternalMSL.g:4044:3: ruleAbstractPattern
            {
             before(grammarAccess.getSpecificationAccess().getAbsPatternAbstractPatternParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractPattern();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getAbsPatternAbstractPatternParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__AbsPatternAssignment_1"


    // $ANTLR start "rule__Specification__PatternAssignment_2"
    // InternalMSL.g:4053:1: rule__Specification__PatternAssignment_2 : ( rulePattern ) ;
    public final void rule__Specification__PatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4057:1: ( ( rulePattern ) )
            // InternalMSL.g:4058:2: ( rulePattern )
            {
            // InternalMSL.g:4058:2: ( rulePattern )
            // InternalMSL.g:4059:3: rulePattern
            {
             before(grammarAccess.getSpecificationAccess().getPatternPatternParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getPatternPatternParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__PatternAssignment_2"


    // $ANTLR start "rule__Specification__ConfigurationAssignment_3"
    // InternalMSL.g:4068:1: rule__Specification__ConfigurationAssignment_3 : ( ruleConfiguration ) ;
    public final void rule__Specification__ConfigurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4072:1: ( ( ruleConfiguration ) )
            // InternalMSL.g:4073:2: ( ruleConfiguration )
            {
            // InternalMSL.g:4073:2: ( ruleConfiguration )
            // InternalMSL.g:4074:3: ruleConfiguration
            {
             before(grammarAccess.getSpecificationAccess().getConfigurationConfigurationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getConfigurationConfigurationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__ConfigurationAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalMSL.g:4083:1: rule__Import__ImportedNamespaceAssignment_1 : ( ( RULE_PATTERN_ID ) ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4087:1: ( ( ( RULE_PATTERN_ID ) ) )
            // InternalMSL.g:4088:2: ( ( RULE_PATTERN_ID ) )
            {
            // InternalMSL.g:4088:2: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4089:3: ( RULE_PATTERN_ID )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAbstractPatternCrossReference_1_0()); 
            // InternalMSL.g:4090:3: ( RULE_PATTERN_ID )
            // InternalMSL.g:4091:4: RULE_PATTERN_ID
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAbstractPatternPATTERN_IDTerminalRuleCall_1_0_1()); 
            match(input,RULE_PATTERN_ID,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportedNamespaceAbstractPatternPATTERN_IDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAbstractPatternCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__AbstractPattern__NameAssignment_2"
    // InternalMSL.g:4102:1: rule__AbstractPattern__NameAssignment_2 : ( RULE_PATTERN_ID ) ;
    public final void rule__AbstractPattern__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4106:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4107:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:4107:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:4108:3: RULE_PATTERN_ID
            {
             before(grammarAccess.getAbstractPatternAccess().getNamePATTERN_IDTerminalRuleCall_2_0()); 
            match(input,RULE_PATTERN_ID,FOLLOW_2); 
             after(grammarAccess.getAbstractPatternAccess().getNamePATTERN_IDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPattern__NameAssignment_2"


    // $ANTLR start "rule__AbstractPattern__ManagedSystemsAssignment_4"
    // InternalMSL.g:4117:1: rule__AbstractPattern__ManagedSystemsAssignment_4 : ( ruleAbstractSystem ) ;
    public final void rule__AbstractPattern__ManagedSystemsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4121:1: ( ( ruleAbstractSystem ) )
            // InternalMSL.g:4122:2: ( ruleAbstractSystem )
            {
            // InternalMSL.g:4122:2: ( ruleAbstractSystem )
            // InternalMSL.g:4123:3: ruleAbstractSystem
            {
             before(grammarAccess.getAbstractPatternAccess().getManagedSystemsAbstractSystemParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractSystem();

            state._fsp--;

             after(grammarAccess.getAbstractPatternAccess().getManagedSystemsAbstractSystemParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPattern__ManagedSystemsAssignment_4"


    // $ANTLR start "rule__AbstractPattern__AbstractGroupsAssignment_5"
    // InternalMSL.g:4132:1: rule__AbstractPattern__AbstractGroupsAssignment_5 : ( ruleAbstractGroup ) ;
    public final void rule__AbstractPattern__AbstractGroupsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4136:1: ( ( ruleAbstractGroup ) )
            // InternalMSL.g:4137:2: ( ruleAbstractGroup )
            {
            // InternalMSL.g:4137:2: ( ruleAbstractGroup )
            // InternalMSL.g:4138:3: ruleAbstractGroup
            {
             before(grammarAccess.getAbstractPatternAccess().getAbstractGroupsAbstractGroupParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractGroup();

            state._fsp--;

             after(grammarAccess.getAbstractPatternAccess().getAbstractGroupsAbstractGroupParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPattern__AbstractGroupsAssignment_5"


    // $ANTLR start "rule__AbstractPattern__InteractionsAssignment_6"
    // InternalMSL.g:4147:1: rule__AbstractPattern__InteractionsAssignment_6 : ( ruleAbstractInteraction ) ;
    public final void rule__AbstractPattern__InteractionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4151:1: ( ( ruleAbstractInteraction ) )
            // InternalMSL.g:4152:2: ( ruleAbstractInteraction )
            {
            // InternalMSL.g:4152:2: ( ruleAbstractInteraction )
            // InternalMSL.g:4153:3: ruleAbstractInteraction
            {
             before(grammarAccess.getAbstractPatternAccess().getInteractionsAbstractInteractionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractInteraction();

            state._fsp--;

             after(grammarAccess.getAbstractPatternAccess().getInteractionsAbstractInteractionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPattern__InteractionsAssignment_6"


    // $ANTLR start "rule__AbstractSystem__NameAssignment_1"
    // InternalMSL.g:4162:1: rule__AbstractSystem__NameAssignment_1 : ( RULE_PATTERN_ID ) ;
    public final void rule__AbstractSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4166:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4167:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:4167:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:4168:3: RULE_PATTERN_ID
            {
             before(grammarAccess.getAbstractSystemAccess().getNamePATTERN_IDTerminalRuleCall_1_0()); 
            match(input,RULE_PATTERN_ID,FOLLOW_2); 
             after(grammarAccess.getAbstractSystemAccess().getNamePATTERN_IDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractSystem__NameAssignment_1"


    // $ANTLR start "rule__AbstractComponent__NameAssignment"
    // InternalMSL.g:4177:1: rule__AbstractComponent__NameAssignment : ( RULE_COMPONENT_TYPE ) ;
    public final void rule__AbstractComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4181:1: ( ( RULE_COMPONENT_TYPE ) )
            // InternalMSL.g:4182:2: ( RULE_COMPONENT_TYPE )
            {
            // InternalMSL.g:4182:2: ( RULE_COMPONENT_TYPE )
            // InternalMSL.g:4183:3: RULE_COMPONENT_TYPE
            {
             before(grammarAccess.getAbstractComponentAccess().getNameCOMPONENT_TYPETerminalRuleCall_0()); 
            match(input,RULE_COMPONENT_TYPE,FOLLOW_2); 
             after(grammarAccess.getAbstractComponentAccess().getNameCOMPONENT_TYPETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractComponent__NameAssignment"


    // $ANTLR start "rule__GroupDef__GrpAssignment_0"
    // InternalMSL.g:4192:1: rule__GroupDef__GrpAssignment_0 : ( ( RULE_PATTERN_ID ) ) ;
    public final void rule__GroupDef__GrpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4196:1: ( ( ( RULE_PATTERN_ID ) ) )
            // InternalMSL.g:4197:2: ( ( RULE_PATTERN_ID ) )
            {
            // InternalMSL.g:4197:2: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4198:3: ( RULE_PATTERN_ID )
            {
             before(grammarAccess.getGroupDefAccess().getGrpAbstractGroupCrossReference_0_0()); 
            // InternalMSL.g:4199:3: ( RULE_PATTERN_ID )
            // InternalMSL.g:4200:4: RULE_PATTERN_ID
            {
             before(grammarAccess.getGroupDefAccess().getGrpAbstractGroupPATTERN_IDTerminalRuleCall_0_0_1()); 
            match(input,RULE_PATTERN_ID,FOLLOW_2); 
             after(grammarAccess.getGroupDefAccess().getGrpAbstractGroupPATTERN_IDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getGroupDefAccess().getGrpAbstractGroupCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupDef__GrpAssignment_0"


    // $ANTLR start "rule__GroupDef__MultAssignment_1_1"
    // InternalMSL.g:4211:1: rule__GroupDef__MultAssignment_1_1 : ( RULE_MULTIPLICITY ) ;
    public final void rule__GroupDef__MultAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4215:1: ( ( RULE_MULTIPLICITY ) )
            // InternalMSL.g:4216:2: ( RULE_MULTIPLICITY )
            {
            // InternalMSL.g:4216:2: ( RULE_MULTIPLICITY )
            // InternalMSL.g:4217:3: RULE_MULTIPLICITY
            {
             before(grammarAccess.getGroupDefAccess().getMultMULTIPLICITYTerminalRuleCall_1_1_0()); 
            match(input,RULE_MULTIPLICITY,FOLLOW_2); 
             after(grammarAccess.getGroupDefAccess().getMultMULTIPLICITYTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupDef__MultAssignment_1_1"


    // $ANTLR start "rule__AbstractGroup__NameAssignment_1"
    // InternalMSL.g:4226:1: rule__AbstractGroup__NameAssignment_1 : ( RULE_PATTERN_ID ) ;
    public final void rule__AbstractGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4230:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4231:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:4231:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:4232:3: RULE_PATTERN_ID
            {
             before(grammarAccess.getAbstractGroupAccess().getNamePATTERN_IDTerminalRuleCall_1_0()); 
            match(input,RULE_PATTERN_ID,FOLLOW_2); 
             after(grammarAccess.getAbstractGroupAccess().getNamePATTERN_IDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__NameAssignment_1"


    // $ANTLR start "rule__AbstractGroup__ManSysAssignment_3_1"
    // InternalMSL.g:4241:1: rule__AbstractGroup__ManSysAssignment_3_1 : ( ( RULE_PATTERN_ID ) ) ;
    public final void rule__AbstractGroup__ManSysAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4245:1: ( ( ( RULE_PATTERN_ID ) ) )
            // InternalMSL.g:4246:2: ( ( RULE_PATTERN_ID ) )
            {
            // InternalMSL.g:4246:2: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4247:3: ( RULE_PATTERN_ID )
            {
             before(grammarAccess.getAbstractGroupAccess().getManSysAbstractSystemCrossReference_3_1_0()); 
            // InternalMSL.g:4248:3: ( RULE_PATTERN_ID )
            // InternalMSL.g:4249:4: RULE_PATTERN_ID
            {
             before(grammarAccess.getAbstractGroupAccess().getManSysAbstractSystemPATTERN_IDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_PATTERN_ID,FOLLOW_2); 
             after(grammarAccess.getAbstractGroupAccess().getManSysAbstractSystemPATTERN_IDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAbstractGroupAccess().getManSysAbstractSystemCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__ManSysAssignment_3_1"


    // $ANTLR start "rule__AbstractGroup__ManGrpAssignment_4_1"
    // InternalMSL.g:4260:1: rule__AbstractGroup__ManGrpAssignment_4_1 : ( ruleGroupDef ) ;
    public final void rule__AbstractGroup__ManGrpAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4264:1: ( ( ruleGroupDef ) )
            // InternalMSL.g:4265:2: ( ruleGroupDef )
            {
            // InternalMSL.g:4265:2: ( ruleGroupDef )
            // InternalMSL.g:4266:3: ruleGroupDef
            {
             before(grammarAccess.getAbstractGroupAccess().getManGrpGroupDefParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGroupDef();

            state._fsp--;

             after(grammarAccess.getAbstractGroupAccess().getManGrpGroupDefParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__ManGrpAssignment_4_1"


    // $ANTLR start "rule__AbstractGroup__ManGrpAssignment_4_2_1"
    // InternalMSL.g:4275:1: rule__AbstractGroup__ManGrpAssignment_4_2_1 : ( ruleGroupDef ) ;
    public final void rule__AbstractGroup__ManGrpAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4279:1: ( ( ruleGroupDef ) )
            // InternalMSL.g:4280:2: ( ruleGroupDef )
            {
            // InternalMSL.g:4280:2: ( ruleGroupDef )
            // InternalMSL.g:4281:3: ruleGroupDef
            {
             before(grammarAccess.getAbstractGroupAccess().getManGrpGroupDefParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGroupDef();

            state._fsp--;

             after(grammarAccess.getAbstractGroupAccess().getManGrpGroupDefParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__ManGrpAssignment_4_2_1"


    // $ANTLR start "rule__AbstractGroup__ComponentsAssignment_6"
    // InternalMSL.g:4290:1: rule__AbstractGroup__ComponentsAssignment_6 : ( ruleAbstractComponent ) ;
    public final void rule__AbstractGroup__ComponentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4294:1: ( ( ruleAbstractComponent ) )
            // InternalMSL.g:4295:2: ( ruleAbstractComponent )
            {
            // InternalMSL.g:4295:2: ( ruleAbstractComponent )
            // InternalMSL.g:4296:3: ruleAbstractComponent
            {
             before(grammarAccess.getAbstractGroupAccess().getComponentsAbstractComponentParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractComponent();

            state._fsp--;

             after(grammarAccess.getAbstractGroupAccess().getComponentsAbstractComponentParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__ComponentsAssignment_6"


    // $ANTLR start "rule__AbstractGroup__ComponentsAssignment_7_1"
    // InternalMSL.g:4305:1: rule__AbstractGroup__ComponentsAssignment_7_1 : ( ruleAbstractComponent ) ;
    public final void rule__AbstractGroup__ComponentsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4309:1: ( ( ruleAbstractComponent ) )
            // InternalMSL.g:4310:2: ( ruleAbstractComponent )
            {
            // InternalMSL.g:4310:2: ( ruleAbstractComponent )
            // InternalMSL.g:4311:3: ruleAbstractComponent
            {
             before(grammarAccess.getAbstractGroupAccess().getComponentsAbstractComponentParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractComponent();

            state._fsp--;

             after(grammarAccess.getAbstractGroupAccess().getComponentsAbstractComponentParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__ComponentsAssignment_7_1"


    // $ANTLR start "rule__AbstractInteraction__StartAssignment_1"
    // InternalMSL.g:4320:1: rule__AbstractInteraction__StartAssignment_1 : ( ruleAbstractComponentName ) ;
    public final void rule__AbstractInteraction__StartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4324:1: ( ( ruleAbstractComponentName ) )
            // InternalMSL.g:4325:2: ( ruleAbstractComponentName )
            {
            // InternalMSL.g:4325:2: ( ruleAbstractComponentName )
            // InternalMSL.g:4326:3: ruleAbstractComponentName
            {
             before(grammarAccess.getAbstractInteractionAccess().getStartAbstractComponentNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractComponentName();

            state._fsp--;

             after(grammarAccess.getAbstractInteractionAccess().getStartAbstractComponentNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__StartAssignment_1"


    // $ANTLR start "rule__AbstractInteraction__EndAssignment_3"
    // InternalMSL.g:4335:1: rule__AbstractInteraction__EndAssignment_3 : ( ruleAbstractComponentName ) ;
    public final void rule__AbstractInteraction__EndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4339:1: ( ( ruleAbstractComponentName ) )
            // InternalMSL.g:4340:2: ( ruleAbstractComponentName )
            {
            // InternalMSL.g:4340:2: ( ruleAbstractComponentName )
            // InternalMSL.g:4341:3: ruleAbstractComponentName
            {
             before(grammarAccess.getAbstractInteractionAccess().getEndAbstractComponentNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractComponentName();

            state._fsp--;

             after(grammarAccess.getAbstractInteractionAccess().getEndAbstractComponentNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__EndAssignment_3"


    // $ANTLR start "rule__AbstractInteraction__LowAssignment_4_1"
    // InternalMSL.g:4350:1: rule__AbstractInteraction__LowAssignment_4_1 : ( RULE_MULTIPLICITY ) ;
    public final void rule__AbstractInteraction__LowAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4354:1: ( ( RULE_MULTIPLICITY ) )
            // InternalMSL.g:4355:2: ( RULE_MULTIPLICITY )
            {
            // InternalMSL.g:4355:2: ( RULE_MULTIPLICITY )
            // InternalMSL.g:4356:3: RULE_MULTIPLICITY
            {
             before(grammarAccess.getAbstractInteractionAccess().getLowMULTIPLICITYTerminalRuleCall_4_1_0()); 
            match(input,RULE_MULTIPLICITY,FOLLOW_2); 
             after(grammarAccess.getAbstractInteractionAccess().getLowMULTIPLICITYTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__LowAssignment_4_1"


    // $ANTLR start "rule__AbstractInteraction__HighAssignment_4_3"
    // InternalMSL.g:4365:1: rule__AbstractInteraction__HighAssignment_4_3 : ( RULE_MULTIPLICITY ) ;
    public final void rule__AbstractInteraction__HighAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4369:1: ( ( RULE_MULTIPLICITY ) )
            // InternalMSL.g:4370:2: ( RULE_MULTIPLICITY )
            {
            // InternalMSL.g:4370:2: ( RULE_MULTIPLICITY )
            // InternalMSL.g:4371:3: RULE_MULTIPLICITY
            {
             before(grammarAccess.getAbstractInteractionAccess().getHighMULTIPLICITYTerminalRuleCall_4_3_0()); 
            match(input,RULE_MULTIPLICITY,FOLLOW_2); 
             after(grammarAccess.getAbstractInteractionAccess().getHighMULTIPLICITYTerminalRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInteraction__HighAssignment_4_3"


    // $ANTLR start "rule__AbstractComponentName__TypeAssignment"
    // InternalMSL.g:4380:1: rule__AbstractComponentName__TypeAssignment : ( ( RULE_FQN_COMPONENT ) ) ;
    public final void rule__AbstractComponentName__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4384:1: ( ( ( RULE_FQN_COMPONENT ) ) )
            // InternalMSL.g:4385:2: ( ( RULE_FQN_COMPONENT ) )
            {
            // InternalMSL.g:4385:2: ( ( RULE_FQN_COMPONENT ) )
            // InternalMSL.g:4386:3: ( RULE_FQN_COMPONENT )
            {
             before(grammarAccess.getAbstractComponentNameAccess().getTypeAbstractComponentCrossReference_0()); 
            // InternalMSL.g:4387:3: ( RULE_FQN_COMPONENT )
            // InternalMSL.g:4388:4: RULE_FQN_COMPONENT
            {
             before(grammarAccess.getAbstractComponentNameAccess().getTypeAbstractComponentFQN_COMPONENTTerminalRuleCall_0_1()); 
            match(input,RULE_FQN_COMPONENT,FOLLOW_2); 
             after(grammarAccess.getAbstractComponentNameAccess().getTypeAbstractComponentFQN_COMPONENTTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getAbstractComponentNameAccess().getTypeAbstractComponentCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractComponentName__TypeAssignment"


    // $ANTLR start "rule__SystemBinding__NameAssignment_1"
    // InternalMSL.g:4399:1: rule__SystemBinding__NameAssignment_1 : ( RULE_PATTERN_ID ) ;
    public final void rule__SystemBinding__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4403:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4404:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:4404:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:4405:3: RULE_PATTERN_ID
            {
             before(grammarAccess.getSystemBindingAccess().getNamePATTERN_IDTerminalRuleCall_1_0()); 
            match(input,RULE_PATTERN_ID,FOLLOW_2); 
             after(grammarAccess.getSystemBindingAccess().getNamePATTERN_IDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemBinding__NameAssignment_1"


    // $ANTLR start "rule__SystemBinding__AbsSysAssignment_3"
    // InternalMSL.g:4414:1: rule__SystemBinding__AbsSysAssignment_3 : ( ( RULE_FQN_PATTERN_ID ) ) ;
    public final void rule__SystemBinding__AbsSysAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4418:1: ( ( ( RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:4419:2: ( ( RULE_FQN_PATTERN_ID ) )
            {
            // InternalMSL.g:4419:2: ( ( RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:4420:3: ( RULE_FQN_PATTERN_ID )
            {
             before(grammarAccess.getSystemBindingAccess().getAbsSysAbstractSystemCrossReference_3_0()); 
            // InternalMSL.g:4421:3: ( RULE_FQN_PATTERN_ID )
            // InternalMSL.g:4422:4: RULE_FQN_PATTERN_ID
            {
             before(grammarAccess.getSystemBindingAccess().getAbsSysAbstractSystemFQN_PATTERN_IDTerminalRuleCall_3_0_1()); 
            match(input,RULE_FQN_PATTERN_ID,FOLLOW_2); 
             after(grammarAccess.getSystemBindingAccess().getAbsSysAbstractSystemFQN_PATTERN_IDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSystemBindingAccess().getAbsSysAbstractSystemCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemBinding__AbsSysAssignment_3"


    // $ANTLR start "rule__GroupBinding__NameAssignment_1"
    // InternalMSL.g:4433:1: rule__GroupBinding__NameAssignment_1 : ( RULE_PATTERN_ID ) ;
    public final void rule__GroupBinding__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4437:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4438:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:4438:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:4439:3: RULE_PATTERN_ID
            {
             before(grammarAccess.getGroupBindingAccess().getNamePATTERN_IDTerminalRuleCall_1_0()); 
            match(input,RULE_PATTERN_ID,FOLLOW_2); 
             after(grammarAccess.getGroupBindingAccess().getNamePATTERN_IDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBinding__NameAssignment_1"


    // $ANTLR start "rule__GroupBinding__AbsGroupAssignment_3"
    // InternalMSL.g:4448:1: rule__GroupBinding__AbsGroupAssignment_3 : ( ( RULE_FQN_PATTERN_ID ) ) ;
    public final void rule__GroupBinding__AbsGroupAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4452:1: ( ( ( RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:4453:2: ( ( RULE_FQN_PATTERN_ID ) )
            {
            // InternalMSL.g:4453:2: ( ( RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:4454:3: ( RULE_FQN_PATTERN_ID )
            {
             before(grammarAccess.getGroupBindingAccess().getAbsGroupAbstractGroupCrossReference_3_0()); 
            // InternalMSL.g:4455:3: ( RULE_FQN_PATTERN_ID )
            // InternalMSL.g:4456:4: RULE_FQN_PATTERN_ID
            {
             before(grammarAccess.getGroupBindingAccess().getAbsGroupAbstractGroupFQN_PATTERN_IDTerminalRuleCall_3_0_1()); 
            match(input,RULE_FQN_PATTERN_ID,FOLLOW_2); 
             after(grammarAccess.getGroupBindingAccess().getAbsGroupAbstractGroupFQN_PATTERN_IDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGroupBindingAccess().getAbsGroupAbstractGroupCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBinding__AbsGroupAssignment_3"


    // $ANTLR start "rule__Pattern__NameAssignment_2"
    // InternalMSL.g:4467:1: rule__Pattern__NameAssignment_2 : ( RULE_PATTERN_ID ) ;
    public final void rule__Pattern__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4471:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4472:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:4472:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:4473:3: RULE_PATTERN_ID
            {
             before(grammarAccess.getPatternAccess().getNamePATTERN_IDTerminalRuleCall_2_0()); 
            match(input,RULE_PATTERN_ID,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getNamePATTERN_IDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__NameAssignment_2"


    // $ANTLR start "rule__Pattern__AbsPatternAssignment_4"
    // InternalMSL.g:4482:1: rule__Pattern__AbsPatternAssignment_4 : ( ( RULE_PATTERN_ID ) ) ;
    public final void rule__Pattern__AbsPatternAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4486:1: ( ( ( RULE_PATTERN_ID ) ) )
            // InternalMSL.g:4487:2: ( ( RULE_PATTERN_ID ) )
            {
            // InternalMSL.g:4487:2: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4488:3: ( RULE_PATTERN_ID )
            {
             before(grammarAccess.getPatternAccess().getAbsPatternAbstractPatternCrossReference_4_0()); 
            // InternalMSL.g:4489:3: ( RULE_PATTERN_ID )
            // InternalMSL.g:4490:4: RULE_PATTERN_ID
            {
             before(grammarAccess.getPatternAccess().getAbsPatternAbstractPatternPATTERN_IDTerminalRuleCall_4_0_1()); 
            match(input,RULE_PATTERN_ID,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getAbsPatternAbstractPatternPATTERN_IDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getPatternAccess().getAbsPatternAbstractPatternCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__AbsPatternAssignment_4"


    // $ANTLR start "rule__Pattern__ManagedSystemsAssignment_6"
    // InternalMSL.g:4501:1: rule__Pattern__ManagedSystemsAssignment_6 : ( ruleSystemBinding ) ;
    public final void rule__Pattern__ManagedSystemsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4505:1: ( ( ruleSystemBinding ) )
            // InternalMSL.g:4506:2: ( ruleSystemBinding )
            {
            // InternalMSL.g:4506:2: ( ruleSystemBinding )
            // InternalMSL.g:4507:3: ruleSystemBinding
            {
             before(grammarAccess.getPatternAccess().getManagedSystemsSystemBindingParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemBinding();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getManagedSystemsSystemBindingParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__ManagedSystemsAssignment_6"


    // $ANTLR start "rule__Pattern__GroupsAssignment_7"
    // InternalMSL.g:4516:1: rule__Pattern__GroupsAssignment_7 : ( ruleGroupBinding ) ;
    public final void rule__Pattern__GroupsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4520:1: ( ( ruleGroupBinding ) )
            // InternalMSL.g:4521:2: ( ruleGroupBinding )
            {
            // InternalMSL.g:4521:2: ( ruleGroupBinding )
            // InternalMSL.g:4522:3: ruleGroupBinding
            {
             before(grammarAccess.getPatternAccess().getGroupsGroupBindingParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleGroupBinding();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getGroupsGroupBindingParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__GroupsAssignment_7"


    // $ANTLR start "rule__Configuration__NameAssignment_1"
    // InternalMSL.g:4531:1: rule__Configuration__NameAssignment_1 : ( RULE_PATTERN_ID ) ;
    public final void rule__Configuration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4535:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4536:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:4536:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:4537:3: RULE_PATTERN_ID
            {
             before(grammarAccess.getConfigurationAccess().getNamePATTERN_IDTerminalRuleCall_1_0()); 
            match(input,RULE_PATTERN_ID,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getNamePATTERN_IDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__NameAssignment_1"


    // $ANTLR start "rule__Configuration__PatternAssignment_3_0"
    // InternalMSL.g:4546:1: rule__Configuration__PatternAssignment_3_0 : ( ( RULE_PATTERN_ID ) ) ;
    public final void rule__Configuration__PatternAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4550:1: ( ( ( RULE_PATTERN_ID ) ) )
            // InternalMSL.g:4551:2: ( ( RULE_PATTERN_ID ) )
            {
            // InternalMSL.g:4551:2: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4552:3: ( RULE_PATTERN_ID )
            {
             before(grammarAccess.getConfigurationAccess().getPatternPatternCrossReference_3_0_0()); 
            // InternalMSL.g:4553:3: ( RULE_PATTERN_ID )
            // InternalMSL.g:4554:4: RULE_PATTERN_ID
            {
             before(grammarAccess.getConfigurationAccess().getPatternPatternPATTERN_IDTerminalRuleCall_3_0_0_1()); 
            match(input,RULE_PATTERN_ID,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getPatternPatternPATTERN_IDTerminalRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getConfigurationAccess().getPatternPatternCrossReference_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__PatternAssignment_3_0"


    // $ANTLR start "rule__Configuration__PatternAssignment_3_1_1"
    // InternalMSL.g:4565:1: rule__Configuration__PatternAssignment_3_1_1 : ( ( RULE_PATTERN_ID ) ) ;
    public final void rule__Configuration__PatternAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4569:1: ( ( ( RULE_PATTERN_ID ) ) )
            // InternalMSL.g:4570:2: ( ( RULE_PATTERN_ID ) )
            {
            // InternalMSL.g:4570:2: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4571:3: ( RULE_PATTERN_ID )
            {
             before(grammarAccess.getConfigurationAccess().getPatternPatternCrossReference_3_1_1_0()); 
            // InternalMSL.g:4572:3: ( RULE_PATTERN_ID )
            // InternalMSL.g:4573:4: RULE_PATTERN_ID
            {
             before(grammarAccess.getConfigurationAccess().getPatternPatternPATTERN_IDTerminalRuleCall_3_1_1_0_1()); 
            match(input,RULE_PATTERN_ID,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getPatternPatternPATTERN_IDTerminalRuleCall_3_1_1_0_1()); 

            }

             after(grammarAccess.getConfigurationAccess().getPatternPatternCrossReference_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__PatternAssignment_3_1_1"


    // $ANTLR start "rule__Configuration__ConcreteSystemsAssignment_5"
    // InternalMSL.g:4584:1: rule__Configuration__ConcreteSystemsAssignment_5 : ( ruleConcreteSystem ) ;
    public final void rule__Configuration__ConcreteSystemsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4588:1: ( ( ruleConcreteSystem ) )
            // InternalMSL.g:4589:2: ( ruleConcreteSystem )
            {
            // InternalMSL.g:4589:2: ( ruleConcreteSystem )
            // InternalMSL.g:4590:3: ruleConcreteSystem
            {
             before(grammarAccess.getConfigurationAccess().getConcreteSystemsConcreteSystemParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleConcreteSystem();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getConcreteSystemsConcreteSystemParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__ConcreteSystemsAssignment_5"


    // $ANTLR start "rule__Configuration__ConcreteGroupsAssignment_6"
    // InternalMSL.g:4599:1: rule__Configuration__ConcreteGroupsAssignment_6 : ( ruleConcreteGroup ) ;
    public final void rule__Configuration__ConcreteGroupsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4603:1: ( ( ruleConcreteGroup ) )
            // InternalMSL.g:4604:2: ( ruleConcreteGroup )
            {
            // InternalMSL.g:4604:2: ( ruleConcreteGroup )
            // InternalMSL.g:4605:3: ruleConcreteGroup
            {
             before(grammarAccess.getConfigurationAccess().getConcreteGroupsConcreteGroupParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleConcreteGroup();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getConcreteGroupsConcreteGroupParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__ConcreteGroupsAssignment_6"


    // $ANTLR start "rule__Configuration__ConcreteInteractionsAssignment_7"
    // InternalMSL.g:4614:1: rule__Configuration__ConcreteInteractionsAssignment_7 : ( ruleInteraction ) ;
    public final void rule__Configuration__ConcreteInteractionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4618:1: ( ( ruleInteraction ) )
            // InternalMSL.g:4619:2: ( ruleInteraction )
            {
            // InternalMSL.g:4619:2: ( ruleInteraction )
            // InternalMSL.g:4620:3: ruleInteraction
            {
             before(grammarAccess.getConfigurationAccess().getConcreteInteractionsInteractionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleInteraction();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getConcreteInteractionsInteractionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__ConcreteInteractionsAssignment_7"


    // $ANTLR start "rule__ConcreteSystem__NameAssignment_0"
    // InternalMSL.g:4629:1: rule__ConcreteSystem__NameAssignment_0 : ( RULE_INSTANCE_ID ) ;
    public final void rule__ConcreteSystem__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4633:1: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4634:2: ( RULE_INSTANCE_ID )
            {
            // InternalMSL.g:4634:2: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4635:3: RULE_INSTANCE_ID
            {
             before(grammarAccess.getConcreteSystemAccess().getNameINSTANCE_IDTerminalRuleCall_0_0()); 
            match(input,RULE_INSTANCE_ID,FOLLOW_2); 
             after(grammarAccess.getConcreteSystemAccess().getNameINSTANCE_IDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteSystem__NameAssignment_0"


    // $ANTLR start "rule__ConcreteSystem__BindingsAssignment_2_0"
    // InternalMSL.g:4644:1: rule__ConcreteSystem__BindingsAssignment_2_0 : ( ( RULE_FQN_PATTERN_ID ) ) ;
    public final void rule__ConcreteSystem__BindingsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4648:1: ( ( ( RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:4649:2: ( ( RULE_FQN_PATTERN_ID ) )
            {
            // InternalMSL.g:4649:2: ( ( RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:4650:3: ( RULE_FQN_PATTERN_ID )
            {
             before(grammarAccess.getConcreteSystemAccess().getBindingsSystemBindingCrossReference_2_0_0()); 
            // InternalMSL.g:4651:3: ( RULE_FQN_PATTERN_ID )
            // InternalMSL.g:4652:4: RULE_FQN_PATTERN_ID
            {
             before(grammarAccess.getConcreteSystemAccess().getBindingsSystemBindingFQN_PATTERN_IDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_FQN_PATTERN_ID,FOLLOW_2); 
             after(grammarAccess.getConcreteSystemAccess().getBindingsSystemBindingFQN_PATTERN_IDTerminalRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getConcreteSystemAccess().getBindingsSystemBindingCrossReference_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteSystem__BindingsAssignment_2_0"


    // $ANTLR start "rule__ConcreteSystem__BindingsAssignment_2_1_1"
    // InternalMSL.g:4663:1: rule__ConcreteSystem__BindingsAssignment_2_1_1 : ( ( RULE_FQN_PATTERN_ID ) ) ;
    public final void rule__ConcreteSystem__BindingsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4667:1: ( ( ( RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:4668:2: ( ( RULE_FQN_PATTERN_ID ) )
            {
            // InternalMSL.g:4668:2: ( ( RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:4669:3: ( RULE_FQN_PATTERN_ID )
            {
             before(grammarAccess.getConcreteSystemAccess().getBindingsSystemBindingCrossReference_2_1_1_0()); 
            // InternalMSL.g:4670:3: ( RULE_FQN_PATTERN_ID )
            // InternalMSL.g:4671:4: RULE_FQN_PATTERN_ID
            {
             before(grammarAccess.getConcreteSystemAccess().getBindingsSystemBindingFQN_PATTERN_IDTerminalRuleCall_2_1_1_0_1()); 
            match(input,RULE_FQN_PATTERN_ID,FOLLOW_2); 
             after(grammarAccess.getConcreteSystemAccess().getBindingsSystemBindingFQN_PATTERN_IDTerminalRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getConcreteSystemAccess().getBindingsSystemBindingCrossReference_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteSystem__BindingsAssignment_2_1_1"


    // $ANTLR start "rule__ConcreteGroup__NameAssignment_0"
    // InternalMSL.g:4682:1: rule__ConcreteGroup__NameAssignment_0 : ( RULE_INSTANCE_ID ) ;
    public final void rule__ConcreteGroup__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4686:1: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4687:2: ( RULE_INSTANCE_ID )
            {
            // InternalMSL.g:4687:2: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4688:3: RULE_INSTANCE_ID
            {
             before(grammarAccess.getConcreteGroupAccess().getNameINSTANCE_IDTerminalRuleCall_0_0()); 
            match(input,RULE_INSTANCE_ID,FOLLOW_2); 
             after(grammarAccess.getConcreteGroupAccess().getNameINSTANCE_IDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__NameAssignment_0"


    // $ANTLR start "rule__ConcreteGroup__AbstractGroupsAssignment_2_0"
    // InternalMSL.g:4697:1: rule__ConcreteGroup__AbstractGroupsAssignment_2_0 : ( ( RULE_FQN_PATTERN_ID ) ) ;
    public final void rule__ConcreteGroup__AbstractGroupsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4701:1: ( ( ( RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:4702:2: ( ( RULE_FQN_PATTERN_ID ) )
            {
            // InternalMSL.g:4702:2: ( ( RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:4703:3: ( RULE_FQN_PATTERN_ID )
            {
             before(grammarAccess.getConcreteGroupAccess().getAbstractGroupsGroupBindingCrossReference_2_0_0()); 
            // InternalMSL.g:4704:3: ( RULE_FQN_PATTERN_ID )
            // InternalMSL.g:4705:4: RULE_FQN_PATTERN_ID
            {
             before(grammarAccess.getConcreteGroupAccess().getAbstractGroupsGroupBindingFQN_PATTERN_IDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_FQN_PATTERN_ID,FOLLOW_2); 
             after(grammarAccess.getConcreteGroupAccess().getAbstractGroupsGroupBindingFQN_PATTERN_IDTerminalRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getConcreteGroupAccess().getAbstractGroupsGroupBindingCrossReference_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__AbstractGroupsAssignment_2_0"


    // $ANTLR start "rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1"
    // InternalMSL.g:4716:1: rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 : ( ( RULE_FQN_PATTERN_ID ) ) ;
    public final void rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4720:1: ( ( ( RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:4721:2: ( ( RULE_FQN_PATTERN_ID ) )
            {
            // InternalMSL.g:4721:2: ( ( RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:4722:3: ( RULE_FQN_PATTERN_ID )
            {
             before(grammarAccess.getConcreteGroupAccess().getAbstractGroupsGroupBindingCrossReference_2_1_1_0()); 
            // InternalMSL.g:4723:3: ( RULE_FQN_PATTERN_ID )
            // InternalMSL.g:4724:4: RULE_FQN_PATTERN_ID
            {
             before(grammarAccess.getConcreteGroupAccess().getAbstractGroupsGroupBindingFQN_PATTERN_IDTerminalRuleCall_2_1_1_0_1()); 
            match(input,RULE_FQN_PATTERN_ID,FOLLOW_2); 
             after(grammarAccess.getConcreteGroupAccess().getAbstractGroupsGroupBindingFQN_PATTERN_IDTerminalRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getConcreteGroupAccess().getAbstractGroupsGroupBindingCrossReference_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1"


    // $ANTLR start "rule__ConcreteGroup__ManSysAssignment_4_1"
    // InternalMSL.g:4735:1: rule__ConcreteGroup__ManSysAssignment_4_1 : ( ( RULE_INSTANCE_ID ) ) ;
    public final void rule__ConcreteGroup__ManSysAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4739:1: ( ( ( RULE_INSTANCE_ID ) ) )
            // InternalMSL.g:4740:2: ( ( RULE_INSTANCE_ID ) )
            {
            // InternalMSL.g:4740:2: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4741:3: ( RULE_INSTANCE_ID )
            {
             before(grammarAccess.getConcreteGroupAccess().getManSysConcreteSystemCrossReference_4_1_0()); 
            // InternalMSL.g:4742:3: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4743:4: RULE_INSTANCE_ID
            {
             before(grammarAccess.getConcreteGroupAccess().getManSysConcreteSystemINSTANCE_IDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_INSTANCE_ID,FOLLOW_2); 
             after(grammarAccess.getConcreteGroupAccess().getManSysConcreteSystemINSTANCE_IDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getConcreteGroupAccess().getManSysConcreteSystemCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__ManSysAssignment_4_1"


    // $ANTLR start "rule__ConcreteGroup__ManSysAssignment_4_2_1"
    // InternalMSL.g:4754:1: rule__ConcreteGroup__ManSysAssignment_4_2_1 : ( ( RULE_INSTANCE_ID ) ) ;
    public final void rule__ConcreteGroup__ManSysAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4758:1: ( ( ( RULE_INSTANCE_ID ) ) )
            // InternalMSL.g:4759:2: ( ( RULE_INSTANCE_ID ) )
            {
            // InternalMSL.g:4759:2: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4760:3: ( RULE_INSTANCE_ID )
            {
             before(grammarAccess.getConcreteGroupAccess().getManSysConcreteSystemCrossReference_4_2_1_0()); 
            // InternalMSL.g:4761:3: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4762:4: RULE_INSTANCE_ID
            {
             before(grammarAccess.getConcreteGroupAccess().getManSysConcreteSystemINSTANCE_IDTerminalRuleCall_4_2_1_0_1()); 
            match(input,RULE_INSTANCE_ID,FOLLOW_2); 
             after(grammarAccess.getConcreteGroupAccess().getManSysConcreteSystemINSTANCE_IDTerminalRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getConcreteGroupAccess().getManSysConcreteSystemCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__ManSysAssignment_4_2_1"


    // $ANTLR start "rule__ConcreteGroup__ManGrpAssignment_5_1"
    // InternalMSL.g:4773:1: rule__ConcreteGroup__ManGrpAssignment_5_1 : ( ( RULE_INSTANCE_ID ) ) ;
    public final void rule__ConcreteGroup__ManGrpAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4777:1: ( ( ( RULE_INSTANCE_ID ) ) )
            // InternalMSL.g:4778:2: ( ( RULE_INSTANCE_ID ) )
            {
            // InternalMSL.g:4778:2: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4779:3: ( RULE_INSTANCE_ID )
            {
             before(grammarAccess.getConcreteGroupAccess().getManGrpConcreteGroupCrossReference_5_1_0()); 
            // InternalMSL.g:4780:3: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4781:4: RULE_INSTANCE_ID
            {
             before(grammarAccess.getConcreteGroupAccess().getManGrpConcreteGroupINSTANCE_IDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_INSTANCE_ID,FOLLOW_2); 
             after(grammarAccess.getConcreteGroupAccess().getManGrpConcreteGroupINSTANCE_IDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getConcreteGroupAccess().getManGrpConcreteGroupCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__ManGrpAssignment_5_1"


    // $ANTLR start "rule__ConcreteGroup__ManGrpAssignment_5_2_1"
    // InternalMSL.g:4792:1: rule__ConcreteGroup__ManGrpAssignment_5_2_1 : ( ( RULE_INSTANCE_ID ) ) ;
    public final void rule__ConcreteGroup__ManGrpAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4796:1: ( ( ( RULE_INSTANCE_ID ) ) )
            // InternalMSL.g:4797:2: ( ( RULE_INSTANCE_ID ) )
            {
            // InternalMSL.g:4797:2: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4798:3: ( RULE_INSTANCE_ID )
            {
             before(grammarAccess.getConcreteGroupAccess().getManGrpConcreteGroupCrossReference_5_2_1_0()); 
            // InternalMSL.g:4799:3: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4800:4: RULE_INSTANCE_ID
            {
             before(grammarAccess.getConcreteGroupAccess().getManGrpConcreteGroupINSTANCE_IDTerminalRuleCall_5_2_1_0_1()); 
            match(input,RULE_INSTANCE_ID,FOLLOW_2); 
             after(grammarAccess.getConcreteGroupAccess().getManGrpConcreteGroupINSTANCE_IDTerminalRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getConcreteGroupAccess().getManGrpConcreteGroupCrossReference_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__ManGrpAssignment_5_2_1"


    // $ANTLR start "rule__ConcreteGroup__ComponentsAssignment_7"
    // InternalMSL.g:4811:1: rule__ConcreteGroup__ComponentsAssignment_7 : ( ruleComponentInstance ) ;
    public final void rule__ConcreteGroup__ComponentsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4815:1: ( ( ruleComponentInstance ) )
            // InternalMSL.g:4816:2: ( ruleComponentInstance )
            {
            // InternalMSL.g:4816:2: ( ruleComponentInstance )
            // InternalMSL.g:4817:3: ruleComponentInstance
            {
             before(grammarAccess.getConcreteGroupAccess().getComponentsComponentInstanceParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentInstance();

            state._fsp--;

             after(grammarAccess.getConcreteGroupAccess().getComponentsComponentInstanceParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__ComponentsAssignment_7"


    // $ANTLR start "rule__ConcreteGroup__ComponentsAssignment_8_1"
    // InternalMSL.g:4826:1: rule__ConcreteGroup__ComponentsAssignment_8_1 : ( ruleComponentInstance ) ;
    public final void rule__ConcreteGroup__ComponentsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4830:1: ( ( ruleComponentInstance ) )
            // InternalMSL.g:4831:2: ( ruleComponentInstance )
            {
            // InternalMSL.g:4831:2: ( ruleComponentInstance )
            // InternalMSL.g:4832:3: ruleComponentInstance
            {
             before(grammarAccess.getConcreteGroupAccess().getComponentsComponentInstanceParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentInstance();

            state._fsp--;

             after(grammarAccess.getConcreteGroupAccess().getComponentsComponentInstanceParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteGroup__ComponentsAssignment_8_1"


    // $ANTLR start "rule__ParamValue__NameParamAssignment_1"
    // InternalMSL.g:4841:1: rule__ParamValue__NameParamAssignment_1 : ( RULE_INSTANCE_ID ) ;
    public final void rule__ParamValue__NameParamAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4845:1: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4846:2: ( RULE_INSTANCE_ID )
            {
            // InternalMSL.g:4846:2: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4847:3: RULE_INSTANCE_ID
            {
             before(grammarAccess.getParamValueAccess().getNameParamINSTANCE_IDTerminalRuleCall_1_0()); 
            match(input,RULE_INSTANCE_ID,FOLLOW_2); 
             after(grammarAccess.getParamValueAccess().getNameParamINSTANCE_IDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValue__NameParamAssignment_1"


    // $ANTLR start "rule__ParamValue__ValParamAssignment_3"
    // InternalMSL.g:4856:1: rule__ParamValue__ValParamAssignment_3 : ( RULE_DECIMAL ) ;
    public final void rule__ParamValue__ValParamAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4860:1: ( ( RULE_DECIMAL ) )
            // InternalMSL.g:4861:2: ( RULE_DECIMAL )
            {
            // InternalMSL.g:4861:2: ( RULE_DECIMAL )
            // InternalMSL.g:4862:3: RULE_DECIMAL
            {
             before(grammarAccess.getParamValueAccess().getValParamDECIMALTerminalRuleCall_3_0()); 
            match(input,RULE_DECIMAL,FOLLOW_2); 
             after(grammarAccess.getParamValueAccess().getValParamDECIMALTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValue__ValParamAssignment_3"


    // $ANTLR start "rule__ParamValue__UnitAssignment_4"
    // InternalMSL.g:4871:1: rule__ParamValue__UnitAssignment_4 : ( ruleTimeUnitKind ) ;
    public final void rule__ParamValue__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4875:1: ( ( ruleTimeUnitKind ) )
            // InternalMSL.g:4876:2: ( ruleTimeUnitKind )
            {
            // InternalMSL.g:4876:2: ( ruleTimeUnitKind )
            // InternalMSL.g:4877:3: ruleTimeUnitKind
            {
             before(grammarAccess.getParamValueAccess().getUnitTimeUnitKindEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnitKind();

            state._fsp--;

             after(grammarAccess.getParamValueAccess().getUnitTimeUnitKindEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValue__UnitAssignment_4"


    // $ANTLR start "rule__ComponentInstance__NameAssignment_0"
    // InternalMSL.g:4886:1: rule__ComponentInstance__NameAssignment_0 : ( RULE_INSTANCE_ID ) ;
    public final void rule__ComponentInstance__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4890:1: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4891:2: ( RULE_INSTANCE_ID )
            {
            // InternalMSL.g:4891:2: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4892:3: RULE_INSTANCE_ID
            {
             before(grammarAccess.getComponentInstanceAccess().getNameINSTANCE_IDTerminalRuleCall_0_0()); 
            match(input,RULE_INSTANCE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getNameINSTANCE_IDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__NameAssignment_0"


    // $ANTLR start "rule__ComponentInstance__TypeAssignment_2"
    // InternalMSL.g:4901:1: rule__ComponentInstance__TypeAssignment_2 : ( RULE_COMPONENT_TYPE ) ;
    public final void rule__ComponentInstance__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4905:1: ( ( RULE_COMPONENT_TYPE ) )
            // InternalMSL.g:4906:2: ( RULE_COMPONENT_TYPE )
            {
            // InternalMSL.g:4906:2: ( RULE_COMPONENT_TYPE )
            // InternalMSL.g:4907:3: RULE_COMPONENT_TYPE
            {
             before(grammarAccess.getComponentInstanceAccess().getTypeCOMPONENT_TYPETerminalRuleCall_2_0()); 
            match(input,RULE_COMPONENT_TYPE,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getTypeCOMPONENT_TYPETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__TypeAssignment_2"


    // $ANTLR start "rule__ComponentInstance__ParamValuesAssignment_3_0"
    // InternalMSL.g:4916:1: rule__ComponentInstance__ParamValuesAssignment_3_0 : ( ruleParamValue ) ;
    public final void rule__ComponentInstance__ParamValuesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4920:1: ( ( ruleParamValue ) )
            // InternalMSL.g:4921:2: ( ruleParamValue )
            {
            // InternalMSL.g:4921:2: ( ruleParamValue )
            // InternalMSL.g:4922:3: ruleParamValue
            {
             before(grammarAccess.getComponentInstanceAccess().getParamValuesParamValueParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParamValue();

            state._fsp--;

             after(grammarAccess.getComponentInstanceAccess().getParamValuesParamValueParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__ParamValuesAssignment_3_0"


    // $ANTLR start "rule__ComponentInstance__ParamValuesAssignment_3_1"
    // InternalMSL.g:4931:1: rule__ComponentInstance__ParamValuesAssignment_3_1 : ( ruleParamValue ) ;
    public final void rule__ComponentInstance__ParamValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4935:1: ( ( ruleParamValue ) )
            // InternalMSL.g:4936:2: ( ruleParamValue )
            {
            // InternalMSL.g:4936:2: ( ruleParamValue )
            // InternalMSL.g:4937:3: ruleParamValue
            {
             before(grammarAccess.getComponentInstanceAccess().getParamValuesParamValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParamValue();

            state._fsp--;

             after(grammarAccess.getComponentInstanceAccess().getParamValuesParamValueParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__ParamValuesAssignment_3_1"


    // $ANTLR start "rule__Interaction__StartAssignment_0"
    // InternalMSL.g:4946:1: rule__Interaction__StartAssignment_0 : ( ruleComponentName ) ;
    public final void rule__Interaction__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4950:1: ( ( ruleComponentName ) )
            // InternalMSL.g:4951:2: ( ruleComponentName )
            {
            // InternalMSL.g:4951:2: ( ruleComponentName )
            // InternalMSL.g:4952:3: ruleComponentName
            {
             before(grammarAccess.getInteractionAccess().getStartComponentNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentName();

            state._fsp--;

             after(grammarAccess.getInteractionAccess().getStartComponentNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__StartAssignment_0"


    // $ANTLR start "rule__Interaction__EndAssignment_2"
    // InternalMSL.g:4961:1: rule__Interaction__EndAssignment_2 : ( ruleComponentName ) ;
    public final void rule__Interaction__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4965:1: ( ( ruleComponentName ) )
            // InternalMSL.g:4966:2: ( ruleComponentName )
            {
            // InternalMSL.g:4966:2: ( ruleComponentName )
            // InternalMSL.g:4967:3: ruleComponentName
            {
             before(grammarAccess.getInteractionAccess().getEndComponentNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentName();

            state._fsp--;

             after(grammarAccess.getInteractionAccess().getEndComponentNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__EndAssignment_2"


    // $ANTLR start "rule__ComponentName__ComponentAssignment"
    // InternalMSL.g:4976:1: rule__ComponentName__ComponentAssignment : ( ( RULE_FQN_INSTANCE_ID ) ) ;
    public final void rule__ComponentName__ComponentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4980:1: ( ( ( RULE_FQN_INSTANCE_ID ) ) )
            // InternalMSL.g:4981:2: ( ( RULE_FQN_INSTANCE_ID ) )
            {
            // InternalMSL.g:4981:2: ( ( RULE_FQN_INSTANCE_ID ) )
            // InternalMSL.g:4982:3: ( RULE_FQN_INSTANCE_ID )
            {
             before(grammarAccess.getComponentNameAccess().getComponentComponentInstanceCrossReference_0()); 
            // InternalMSL.g:4983:3: ( RULE_FQN_INSTANCE_ID )
            // InternalMSL.g:4984:4: RULE_FQN_INSTANCE_ID
            {
             before(grammarAccess.getComponentNameAccess().getComponentComponentInstanceFQN_INSTANCE_IDTerminalRuleCall_0_1()); 
            match(input,RULE_FQN_INSTANCE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentNameAccess().getComponentComponentInstanceFQN_INSTANCE_IDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getComponentNameAccess().getComponentComponentInstanceCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentName__ComponentAssignment"

    // Delegated rules


    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\11\1\51\1\uffff\1\10\1\11\1\10\1\uffff\1\11";
    static final String dfa_3s = "\1\36\1\51\1\uffff\1\10\1\46\1\10\1\uffff\1\46";
    static final String dfa_4s = "\2\uffff\1\2\3\uffff\1\1\1\uffff";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\22\uffff\1\2",
            "\1\3",
            "",
            "\1\4",
            "\1\6\1\uffff\1\6\21\uffff\1\2\1\6\7\uffff\1\5",
            "\1\7",
            "",
            "\1\6\1\uffff\1\6\21\uffff\1\2\1\6\7\uffff\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 2530:2: ( rule__Configuration__ConcreteSystemsAssignment_5 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000140008000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000084C0000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000004C0000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000A00L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000203F80000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000800L});

}