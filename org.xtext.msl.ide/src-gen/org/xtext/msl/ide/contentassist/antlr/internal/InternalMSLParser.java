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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PATTERN_ID", "RULE_COMPONENT_TYPE", "RULE_MULTIPLICITY", "RULE_FQN_COMPONENT", "RULE_FQN_PATTERN_ID", "RULE_INSTANCE_ID", "RULE_FQN_INSTANCE_ID", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'abstract'", "'pattern'", "'{'", "'}'", "'system'", "'['", "']'", "'group'", "'components'", "'managedSyS'", "'managedGrp'", "','", "'interaction'", "'->'", "':'", "'concrete'", "'concretizationOf'", "'configuration'", "'instanceOf'"
    };
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


    // $ANTLR start "entryRuleComponentInstance"
    // InternalMSL.g:428:1: entryRuleComponentInstance : ruleComponentInstance EOF ;
    public final void entryRuleComponentInstance() throws RecognitionException {
        try {
            // InternalMSL.g:429:1: ( ruleComponentInstance EOF )
            // InternalMSL.g:430:1: ruleComponentInstance EOF
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
    // InternalMSL.g:437:1: ruleComponentInstance : ( ( rule__ComponentInstance__Group__0 ) ) ;
    public final void ruleComponentInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:441:2: ( ( ( rule__ComponentInstance__Group__0 ) ) )
            // InternalMSL.g:442:2: ( ( rule__ComponentInstance__Group__0 ) )
            {
            // InternalMSL.g:442:2: ( ( rule__ComponentInstance__Group__0 ) )
            // InternalMSL.g:443:3: ( rule__ComponentInstance__Group__0 )
            {
             before(grammarAccess.getComponentInstanceAccess().getGroup()); 
            // InternalMSL.g:444:3: ( rule__ComponentInstance__Group__0 )
            // InternalMSL.g:444:4: rule__ComponentInstance__Group__0
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
    // InternalMSL.g:453:1: entryRuleInteraction : ruleInteraction EOF ;
    public final void entryRuleInteraction() throws RecognitionException {
        try {
            // InternalMSL.g:454:1: ( ruleInteraction EOF )
            // InternalMSL.g:455:1: ruleInteraction EOF
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
    // InternalMSL.g:462:1: ruleInteraction : ( ( rule__Interaction__Group__0 ) ) ;
    public final void ruleInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:466:2: ( ( ( rule__Interaction__Group__0 ) ) )
            // InternalMSL.g:467:2: ( ( rule__Interaction__Group__0 ) )
            {
            // InternalMSL.g:467:2: ( ( rule__Interaction__Group__0 ) )
            // InternalMSL.g:468:3: ( rule__Interaction__Group__0 )
            {
             before(grammarAccess.getInteractionAccess().getGroup()); 
            // InternalMSL.g:469:3: ( rule__Interaction__Group__0 )
            // InternalMSL.g:469:4: rule__Interaction__Group__0
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
    // InternalMSL.g:478:1: entryRuleComponentName : ruleComponentName EOF ;
    public final void entryRuleComponentName() throws RecognitionException {
        try {
            // InternalMSL.g:479:1: ( ruleComponentName EOF )
            // InternalMSL.g:480:1: ruleComponentName EOF
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
    // InternalMSL.g:487:1: ruleComponentName : ( ( rule__ComponentName__ComponentAssignment ) ) ;
    public final void ruleComponentName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:491:2: ( ( ( rule__ComponentName__ComponentAssignment ) ) )
            // InternalMSL.g:492:2: ( ( rule__ComponentName__ComponentAssignment ) )
            {
            // InternalMSL.g:492:2: ( ( rule__ComponentName__ComponentAssignment ) )
            // InternalMSL.g:493:3: ( rule__ComponentName__ComponentAssignment )
            {
             before(grammarAccess.getComponentNameAccess().getComponentAssignment()); 
            // InternalMSL.g:494:3: ( rule__ComponentName__ComponentAssignment )
            // InternalMSL.g:494:4: rule__ComponentName__ComponentAssignment
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


    // $ANTLR start "rule__Specification__Group__0"
    // InternalMSL.g:502:1: rule__Specification__Group__0 : rule__Specification__Group__0__Impl rule__Specification__Group__1 ;
    public final void rule__Specification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:506:1: ( rule__Specification__Group__0__Impl rule__Specification__Group__1 )
            // InternalMSL.g:507:2: rule__Specification__Group__0__Impl rule__Specification__Group__1
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
    // InternalMSL.g:514:1: rule__Specification__Group__0__Impl : ( ( rule__Specification__ImportsAssignment_0 )* ) ;
    public final void rule__Specification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:518:1: ( ( ( rule__Specification__ImportsAssignment_0 )* ) )
            // InternalMSL.g:519:1: ( ( rule__Specification__ImportsAssignment_0 )* )
            {
            // InternalMSL.g:519:1: ( ( rule__Specification__ImportsAssignment_0 )* )
            // InternalMSL.g:520:2: ( rule__Specification__ImportsAssignment_0 )*
            {
             before(grammarAccess.getSpecificationAccess().getImportsAssignment_0()); 
            // InternalMSL.g:521:2: ( rule__Specification__ImportsAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMSL.g:521:3: rule__Specification__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Specification__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalMSL.g:529:1: rule__Specification__Group__1 : rule__Specification__Group__1__Impl rule__Specification__Group__2 ;
    public final void rule__Specification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:533:1: ( rule__Specification__Group__1__Impl rule__Specification__Group__2 )
            // InternalMSL.g:534:2: rule__Specification__Group__1__Impl rule__Specification__Group__2
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
    // InternalMSL.g:541:1: rule__Specification__Group__1__Impl : ( ( rule__Specification__AbsPatternAssignment_1 )? ) ;
    public final void rule__Specification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:545:1: ( ( ( rule__Specification__AbsPatternAssignment_1 )? ) )
            // InternalMSL.g:546:1: ( ( rule__Specification__AbsPatternAssignment_1 )? )
            {
            // InternalMSL.g:546:1: ( ( rule__Specification__AbsPatternAssignment_1 )? )
            // InternalMSL.g:547:2: ( rule__Specification__AbsPatternAssignment_1 )?
            {
             before(grammarAccess.getSpecificationAccess().getAbsPatternAssignment_1()); 
            // InternalMSL.g:548:2: ( rule__Specification__AbsPatternAssignment_1 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMSL.g:548:3: rule__Specification__AbsPatternAssignment_1
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
    // InternalMSL.g:556:1: rule__Specification__Group__2 : rule__Specification__Group__2__Impl rule__Specification__Group__3 ;
    public final void rule__Specification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:560:1: ( rule__Specification__Group__2__Impl rule__Specification__Group__3 )
            // InternalMSL.g:561:2: rule__Specification__Group__2__Impl rule__Specification__Group__3
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
    // InternalMSL.g:568:1: rule__Specification__Group__2__Impl : ( ( rule__Specification__PatternAssignment_2 )* ) ;
    public final void rule__Specification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:572:1: ( ( ( rule__Specification__PatternAssignment_2 )* ) )
            // InternalMSL.g:573:1: ( ( rule__Specification__PatternAssignment_2 )* )
            {
            // InternalMSL.g:573:1: ( ( rule__Specification__PatternAssignment_2 )* )
            // InternalMSL.g:574:2: ( rule__Specification__PatternAssignment_2 )*
            {
             before(grammarAccess.getSpecificationAccess().getPatternAssignment_2()); 
            // InternalMSL.g:575:2: ( rule__Specification__PatternAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==34) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMSL.g:575:3: rule__Specification__PatternAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Specification__PatternAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalMSL.g:583:1: rule__Specification__Group__3 : rule__Specification__Group__3__Impl ;
    public final void rule__Specification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:587:1: ( rule__Specification__Group__3__Impl )
            // InternalMSL.g:588:2: rule__Specification__Group__3__Impl
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
    // InternalMSL.g:594:1: rule__Specification__Group__3__Impl : ( ( rule__Specification__ConfigurationAssignment_3 )? ) ;
    public final void rule__Specification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:598:1: ( ( ( rule__Specification__ConfigurationAssignment_3 )? ) )
            // InternalMSL.g:599:1: ( ( rule__Specification__ConfigurationAssignment_3 )? )
            {
            // InternalMSL.g:599:1: ( ( rule__Specification__ConfigurationAssignment_3 )? )
            // InternalMSL.g:600:2: ( rule__Specification__ConfigurationAssignment_3 )?
            {
             before(grammarAccess.getSpecificationAccess().getConfigurationAssignment_3()); 
            // InternalMSL.g:601:2: ( rule__Specification__ConfigurationAssignment_3 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMSL.g:601:3: rule__Specification__ConfigurationAssignment_3
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
    // InternalMSL.g:610:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:614:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMSL.g:615:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalMSL.g:622:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:626:1: ( ( 'import' ) )
            // InternalMSL.g:627:1: ( 'import' )
            {
            // InternalMSL.g:627:1: ( 'import' )
            // InternalMSL.g:628:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMSL.g:637:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:641:1: ( rule__Import__Group__1__Impl )
            // InternalMSL.g:642:2: rule__Import__Group__1__Impl
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
    // InternalMSL.g:648:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:652:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalMSL.g:653:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalMSL.g:653:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalMSL.g:654:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalMSL.g:655:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalMSL.g:655:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalMSL.g:664:1: rule__AbstractPattern__Group__0 : rule__AbstractPattern__Group__0__Impl rule__AbstractPattern__Group__1 ;
    public final void rule__AbstractPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:668:1: ( rule__AbstractPattern__Group__0__Impl rule__AbstractPattern__Group__1 )
            // InternalMSL.g:669:2: rule__AbstractPattern__Group__0__Impl rule__AbstractPattern__Group__1
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
    // InternalMSL.g:676:1: rule__AbstractPattern__Group__0__Impl : ( 'abstract' ) ;
    public final void rule__AbstractPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:680:1: ( ( 'abstract' ) )
            // InternalMSL.g:681:1: ( 'abstract' )
            {
            // InternalMSL.g:681:1: ( 'abstract' )
            // InternalMSL.g:682:2: 'abstract'
            {
             before(grammarAccess.getAbstractPatternAccess().getAbstractKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMSL.g:691:1: rule__AbstractPattern__Group__1 : rule__AbstractPattern__Group__1__Impl rule__AbstractPattern__Group__2 ;
    public final void rule__AbstractPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:695:1: ( rule__AbstractPattern__Group__1__Impl rule__AbstractPattern__Group__2 )
            // InternalMSL.g:696:2: rule__AbstractPattern__Group__1__Impl rule__AbstractPattern__Group__2
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
    // InternalMSL.g:703:1: rule__AbstractPattern__Group__1__Impl : ( 'pattern' ) ;
    public final void rule__AbstractPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:707:1: ( ( 'pattern' ) )
            // InternalMSL.g:708:1: ( 'pattern' )
            {
            // InternalMSL.g:708:1: ( 'pattern' )
            // InternalMSL.g:709:2: 'pattern'
            {
             before(grammarAccess.getAbstractPatternAccess().getPatternKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMSL.g:718:1: rule__AbstractPattern__Group__2 : rule__AbstractPattern__Group__2__Impl rule__AbstractPattern__Group__3 ;
    public final void rule__AbstractPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:722:1: ( rule__AbstractPattern__Group__2__Impl rule__AbstractPattern__Group__3 )
            // InternalMSL.g:723:2: rule__AbstractPattern__Group__2__Impl rule__AbstractPattern__Group__3
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
    // InternalMSL.g:730:1: rule__AbstractPattern__Group__2__Impl : ( ( rule__AbstractPattern__NameAssignment_2 ) ) ;
    public final void rule__AbstractPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:734:1: ( ( ( rule__AbstractPattern__NameAssignment_2 ) ) )
            // InternalMSL.g:735:1: ( ( rule__AbstractPattern__NameAssignment_2 ) )
            {
            // InternalMSL.g:735:1: ( ( rule__AbstractPattern__NameAssignment_2 ) )
            // InternalMSL.g:736:2: ( rule__AbstractPattern__NameAssignment_2 )
            {
             before(grammarAccess.getAbstractPatternAccess().getNameAssignment_2()); 
            // InternalMSL.g:737:2: ( rule__AbstractPattern__NameAssignment_2 )
            // InternalMSL.g:737:3: rule__AbstractPattern__NameAssignment_2
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
    // InternalMSL.g:745:1: rule__AbstractPattern__Group__3 : rule__AbstractPattern__Group__3__Impl rule__AbstractPattern__Group__4 ;
    public final void rule__AbstractPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:749:1: ( rule__AbstractPattern__Group__3__Impl rule__AbstractPattern__Group__4 )
            // InternalMSL.g:750:2: rule__AbstractPattern__Group__3__Impl rule__AbstractPattern__Group__4
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
    // InternalMSL.g:757:1: rule__AbstractPattern__Group__3__Impl : ( '{' ) ;
    public final void rule__AbstractPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:761:1: ( ( '{' ) )
            // InternalMSL.g:762:1: ( '{' )
            {
            // InternalMSL.g:762:1: ( '{' )
            // InternalMSL.g:763:2: '{'
            {
             before(grammarAccess.getAbstractPatternAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMSL.g:772:1: rule__AbstractPattern__Group__4 : rule__AbstractPattern__Group__4__Impl rule__AbstractPattern__Group__5 ;
    public final void rule__AbstractPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:776:1: ( rule__AbstractPattern__Group__4__Impl rule__AbstractPattern__Group__5 )
            // InternalMSL.g:777:2: rule__AbstractPattern__Group__4__Impl rule__AbstractPattern__Group__5
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
    // InternalMSL.g:784:1: rule__AbstractPattern__Group__4__Impl : ( ( rule__AbstractPattern__ManagedSystemsAssignment_4 )* ) ;
    public final void rule__AbstractPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:788:1: ( ( ( rule__AbstractPattern__ManagedSystemsAssignment_4 )* ) )
            // InternalMSL.g:789:1: ( ( rule__AbstractPattern__ManagedSystemsAssignment_4 )* )
            {
            // InternalMSL.g:789:1: ( ( rule__AbstractPattern__ManagedSystemsAssignment_4 )* )
            // InternalMSL.g:790:2: ( rule__AbstractPattern__ManagedSystemsAssignment_4 )*
            {
             before(grammarAccess.getAbstractPatternAccess().getManagedSystemsAssignment_4()); 
            // InternalMSL.g:791:2: ( rule__AbstractPattern__ManagedSystemsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMSL.g:791:3: rule__AbstractPattern__ManagedSystemsAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AbstractPattern__ManagedSystemsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalMSL.g:799:1: rule__AbstractPattern__Group__5 : rule__AbstractPattern__Group__5__Impl rule__AbstractPattern__Group__6 ;
    public final void rule__AbstractPattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:803:1: ( rule__AbstractPattern__Group__5__Impl rule__AbstractPattern__Group__6 )
            // InternalMSL.g:804:2: rule__AbstractPattern__Group__5__Impl rule__AbstractPattern__Group__6
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
    // InternalMSL.g:811:1: rule__AbstractPattern__Group__5__Impl : ( ( rule__AbstractPattern__AbstractGroupsAssignment_5 )* ) ;
    public final void rule__AbstractPattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:815:1: ( ( ( rule__AbstractPattern__AbstractGroupsAssignment_5 )* ) )
            // InternalMSL.g:816:1: ( ( rule__AbstractPattern__AbstractGroupsAssignment_5 )* )
            {
            // InternalMSL.g:816:1: ( ( rule__AbstractPattern__AbstractGroupsAssignment_5 )* )
            // InternalMSL.g:817:2: ( rule__AbstractPattern__AbstractGroupsAssignment_5 )*
            {
             before(grammarAccess.getAbstractPatternAccess().getAbstractGroupsAssignment_5()); 
            // InternalMSL.g:818:2: ( rule__AbstractPattern__AbstractGroupsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMSL.g:818:3: rule__AbstractPattern__AbstractGroupsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AbstractPattern__AbstractGroupsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalMSL.g:826:1: rule__AbstractPattern__Group__6 : rule__AbstractPattern__Group__6__Impl rule__AbstractPattern__Group__7 ;
    public final void rule__AbstractPattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:830:1: ( rule__AbstractPattern__Group__6__Impl rule__AbstractPattern__Group__7 )
            // InternalMSL.g:831:2: rule__AbstractPattern__Group__6__Impl rule__AbstractPattern__Group__7
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
    // InternalMSL.g:838:1: rule__AbstractPattern__Group__6__Impl : ( ( rule__AbstractPattern__InteractionsAssignment_6 )* ) ;
    public final void rule__AbstractPattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:842:1: ( ( ( rule__AbstractPattern__InteractionsAssignment_6 )* ) )
            // InternalMSL.g:843:1: ( ( rule__AbstractPattern__InteractionsAssignment_6 )* )
            {
            // InternalMSL.g:843:1: ( ( rule__AbstractPattern__InteractionsAssignment_6 )* )
            // InternalMSL.g:844:2: ( rule__AbstractPattern__InteractionsAssignment_6 )*
            {
             before(grammarAccess.getAbstractPatternAccess().getInteractionsAssignment_6()); 
            // InternalMSL.g:845:2: ( rule__AbstractPattern__InteractionsAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMSL.g:845:3: rule__AbstractPattern__InteractionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__AbstractPattern__InteractionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalMSL.g:853:1: rule__AbstractPattern__Group__7 : rule__AbstractPattern__Group__7__Impl ;
    public final void rule__AbstractPattern__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:857:1: ( rule__AbstractPattern__Group__7__Impl )
            // InternalMSL.g:858:2: rule__AbstractPattern__Group__7__Impl
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
    // InternalMSL.g:864:1: rule__AbstractPattern__Group__7__Impl : ( '}' ) ;
    public final void rule__AbstractPattern__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:868:1: ( ( '}' ) )
            // InternalMSL.g:869:1: ( '}' )
            {
            // InternalMSL.g:869:1: ( '}' )
            // InternalMSL.g:870:2: '}'
            {
             before(grammarAccess.getAbstractPatternAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMSL.g:880:1: rule__AbstractSystem__Group__0 : rule__AbstractSystem__Group__0__Impl rule__AbstractSystem__Group__1 ;
    public final void rule__AbstractSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:884:1: ( rule__AbstractSystem__Group__0__Impl rule__AbstractSystem__Group__1 )
            // InternalMSL.g:885:2: rule__AbstractSystem__Group__0__Impl rule__AbstractSystem__Group__1
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
    // InternalMSL.g:892:1: rule__AbstractSystem__Group__0__Impl : ( 'system' ) ;
    public final void rule__AbstractSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:896:1: ( ( 'system' ) )
            // InternalMSL.g:897:1: ( 'system' )
            {
            // InternalMSL.g:897:1: ( 'system' )
            // InternalMSL.g:898:2: 'system'
            {
             before(grammarAccess.getAbstractSystemAccess().getSystemKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMSL.g:907:1: rule__AbstractSystem__Group__1 : rule__AbstractSystem__Group__1__Impl ;
    public final void rule__AbstractSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:911:1: ( rule__AbstractSystem__Group__1__Impl )
            // InternalMSL.g:912:2: rule__AbstractSystem__Group__1__Impl
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
    // InternalMSL.g:918:1: rule__AbstractSystem__Group__1__Impl : ( ( rule__AbstractSystem__NameAssignment_1 ) ) ;
    public final void rule__AbstractSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:922:1: ( ( ( rule__AbstractSystem__NameAssignment_1 ) ) )
            // InternalMSL.g:923:1: ( ( rule__AbstractSystem__NameAssignment_1 ) )
            {
            // InternalMSL.g:923:1: ( ( rule__AbstractSystem__NameAssignment_1 ) )
            // InternalMSL.g:924:2: ( rule__AbstractSystem__NameAssignment_1 )
            {
             before(grammarAccess.getAbstractSystemAccess().getNameAssignment_1()); 
            // InternalMSL.g:925:2: ( rule__AbstractSystem__NameAssignment_1 )
            // InternalMSL.g:925:3: rule__AbstractSystem__NameAssignment_1
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
    // InternalMSL.g:934:1: rule__GroupDef__Group__0 : rule__GroupDef__Group__0__Impl rule__GroupDef__Group__1 ;
    public final void rule__GroupDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:938:1: ( rule__GroupDef__Group__0__Impl rule__GroupDef__Group__1 )
            // InternalMSL.g:939:2: rule__GroupDef__Group__0__Impl rule__GroupDef__Group__1
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
    // InternalMSL.g:946:1: rule__GroupDef__Group__0__Impl : ( ( rule__GroupDef__GrpAssignment_0 ) ) ;
    public final void rule__GroupDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:950:1: ( ( ( rule__GroupDef__GrpAssignment_0 ) ) )
            // InternalMSL.g:951:1: ( ( rule__GroupDef__GrpAssignment_0 ) )
            {
            // InternalMSL.g:951:1: ( ( rule__GroupDef__GrpAssignment_0 ) )
            // InternalMSL.g:952:2: ( rule__GroupDef__GrpAssignment_0 )
            {
             before(grammarAccess.getGroupDefAccess().getGrpAssignment_0()); 
            // InternalMSL.g:953:2: ( rule__GroupDef__GrpAssignment_0 )
            // InternalMSL.g:953:3: rule__GroupDef__GrpAssignment_0
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
    // InternalMSL.g:961:1: rule__GroupDef__Group__1 : rule__GroupDef__Group__1__Impl ;
    public final void rule__GroupDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:965:1: ( rule__GroupDef__Group__1__Impl )
            // InternalMSL.g:966:2: rule__GroupDef__Group__1__Impl
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
    // InternalMSL.g:972:1: rule__GroupDef__Group__1__Impl : ( ( rule__GroupDef__Group_1__0 )? ) ;
    public final void rule__GroupDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:976:1: ( ( ( rule__GroupDef__Group_1__0 )? ) )
            // InternalMSL.g:977:1: ( ( rule__GroupDef__Group_1__0 )? )
            {
            // InternalMSL.g:977:1: ( ( rule__GroupDef__Group_1__0 )? )
            // InternalMSL.g:978:2: ( rule__GroupDef__Group_1__0 )?
            {
             before(grammarAccess.getGroupDefAccess().getGroup_1()); 
            // InternalMSL.g:979:2: ( rule__GroupDef__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMSL.g:979:3: rule__GroupDef__Group_1__0
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
    // InternalMSL.g:988:1: rule__GroupDef__Group_1__0 : rule__GroupDef__Group_1__0__Impl rule__GroupDef__Group_1__1 ;
    public final void rule__GroupDef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:992:1: ( rule__GroupDef__Group_1__0__Impl rule__GroupDef__Group_1__1 )
            // InternalMSL.g:993:2: rule__GroupDef__Group_1__0__Impl rule__GroupDef__Group_1__1
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
    // InternalMSL.g:1000:1: rule__GroupDef__Group_1__0__Impl : ( '[' ) ;
    public final void rule__GroupDef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1004:1: ( ( '[' ) )
            // InternalMSL.g:1005:1: ( '[' )
            {
            // InternalMSL.g:1005:1: ( '[' )
            // InternalMSL.g:1006:2: '['
            {
             before(grammarAccess.getGroupDefAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMSL.g:1015:1: rule__GroupDef__Group_1__1 : rule__GroupDef__Group_1__1__Impl rule__GroupDef__Group_1__2 ;
    public final void rule__GroupDef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1019:1: ( rule__GroupDef__Group_1__1__Impl rule__GroupDef__Group_1__2 )
            // InternalMSL.g:1020:2: rule__GroupDef__Group_1__1__Impl rule__GroupDef__Group_1__2
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
    // InternalMSL.g:1027:1: rule__GroupDef__Group_1__1__Impl : ( ( rule__GroupDef__MultAssignment_1_1 ) ) ;
    public final void rule__GroupDef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1031:1: ( ( ( rule__GroupDef__MultAssignment_1_1 ) ) )
            // InternalMSL.g:1032:1: ( ( rule__GroupDef__MultAssignment_1_1 ) )
            {
            // InternalMSL.g:1032:1: ( ( rule__GroupDef__MultAssignment_1_1 ) )
            // InternalMSL.g:1033:2: ( rule__GroupDef__MultAssignment_1_1 )
            {
             before(grammarAccess.getGroupDefAccess().getMultAssignment_1_1()); 
            // InternalMSL.g:1034:2: ( rule__GroupDef__MultAssignment_1_1 )
            // InternalMSL.g:1034:3: rule__GroupDef__MultAssignment_1_1
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
    // InternalMSL.g:1042:1: rule__GroupDef__Group_1__2 : rule__GroupDef__Group_1__2__Impl ;
    public final void rule__GroupDef__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1046:1: ( rule__GroupDef__Group_1__2__Impl )
            // InternalMSL.g:1047:2: rule__GroupDef__Group_1__2__Impl
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
    // InternalMSL.g:1053:1: rule__GroupDef__Group_1__2__Impl : ( ']' ) ;
    public final void rule__GroupDef__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1057:1: ( ( ']' ) )
            // InternalMSL.g:1058:1: ( ']' )
            {
            // InternalMSL.g:1058:1: ( ']' )
            // InternalMSL.g:1059:2: ']'
            {
             before(grammarAccess.getGroupDefAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMSL.g:1069:1: rule__AbstractGroup__Group__0 : rule__AbstractGroup__Group__0__Impl rule__AbstractGroup__Group__1 ;
    public final void rule__AbstractGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1073:1: ( rule__AbstractGroup__Group__0__Impl rule__AbstractGroup__Group__1 )
            // InternalMSL.g:1074:2: rule__AbstractGroup__Group__0__Impl rule__AbstractGroup__Group__1
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
    // InternalMSL.g:1081:1: rule__AbstractGroup__Group__0__Impl : ( 'group' ) ;
    public final void rule__AbstractGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1085:1: ( ( 'group' ) )
            // InternalMSL.g:1086:1: ( 'group' )
            {
            // InternalMSL.g:1086:1: ( 'group' )
            // InternalMSL.g:1087:2: 'group'
            {
             before(grammarAccess.getAbstractGroupAccess().getGroupKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMSL.g:1096:1: rule__AbstractGroup__Group__1 : rule__AbstractGroup__Group__1__Impl rule__AbstractGroup__Group__2 ;
    public final void rule__AbstractGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1100:1: ( rule__AbstractGroup__Group__1__Impl rule__AbstractGroup__Group__2 )
            // InternalMSL.g:1101:2: rule__AbstractGroup__Group__1__Impl rule__AbstractGroup__Group__2
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
    // InternalMSL.g:1108:1: rule__AbstractGroup__Group__1__Impl : ( ( rule__AbstractGroup__NameAssignment_1 ) ) ;
    public final void rule__AbstractGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1112:1: ( ( ( rule__AbstractGroup__NameAssignment_1 ) ) )
            // InternalMSL.g:1113:1: ( ( rule__AbstractGroup__NameAssignment_1 ) )
            {
            // InternalMSL.g:1113:1: ( ( rule__AbstractGroup__NameAssignment_1 ) )
            // InternalMSL.g:1114:2: ( rule__AbstractGroup__NameAssignment_1 )
            {
             before(grammarAccess.getAbstractGroupAccess().getNameAssignment_1()); 
            // InternalMSL.g:1115:2: ( rule__AbstractGroup__NameAssignment_1 )
            // InternalMSL.g:1115:3: rule__AbstractGroup__NameAssignment_1
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
    // InternalMSL.g:1123:1: rule__AbstractGroup__Group__2 : rule__AbstractGroup__Group__2__Impl rule__AbstractGroup__Group__3 ;
    public final void rule__AbstractGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1127:1: ( rule__AbstractGroup__Group__2__Impl rule__AbstractGroup__Group__3 )
            // InternalMSL.g:1128:2: rule__AbstractGroup__Group__2__Impl rule__AbstractGroup__Group__3
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
    // InternalMSL.g:1135:1: rule__AbstractGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__AbstractGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1139:1: ( ( '{' ) )
            // InternalMSL.g:1140:1: ( '{' )
            {
            // InternalMSL.g:1140:1: ( '{' )
            // InternalMSL.g:1141:2: '{'
            {
             before(grammarAccess.getAbstractGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMSL.g:1150:1: rule__AbstractGroup__Group__3 : rule__AbstractGroup__Group__3__Impl rule__AbstractGroup__Group__4 ;
    public final void rule__AbstractGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1154:1: ( rule__AbstractGroup__Group__3__Impl rule__AbstractGroup__Group__4 )
            // InternalMSL.g:1155:2: rule__AbstractGroup__Group__3__Impl rule__AbstractGroup__Group__4
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
    // InternalMSL.g:1162:1: rule__AbstractGroup__Group__3__Impl : ( ( rule__AbstractGroup__Group_3__0 )? ) ;
    public final void rule__AbstractGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1166:1: ( ( ( rule__AbstractGroup__Group_3__0 )? ) )
            // InternalMSL.g:1167:1: ( ( rule__AbstractGroup__Group_3__0 )? )
            {
            // InternalMSL.g:1167:1: ( ( rule__AbstractGroup__Group_3__0 )? )
            // InternalMSL.g:1168:2: ( rule__AbstractGroup__Group_3__0 )?
            {
             before(grammarAccess.getAbstractGroupAccess().getGroup_3()); 
            // InternalMSL.g:1169:2: ( rule__AbstractGroup__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMSL.g:1169:3: rule__AbstractGroup__Group_3__0
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
    // InternalMSL.g:1177:1: rule__AbstractGroup__Group__4 : rule__AbstractGroup__Group__4__Impl rule__AbstractGroup__Group__5 ;
    public final void rule__AbstractGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1181:1: ( rule__AbstractGroup__Group__4__Impl rule__AbstractGroup__Group__5 )
            // InternalMSL.g:1182:2: rule__AbstractGroup__Group__4__Impl rule__AbstractGroup__Group__5
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
    // InternalMSL.g:1189:1: rule__AbstractGroup__Group__4__Impl : ( ( rule__AbstractGroup__Group_4__0 )? ) ;
    public final void rule__AbstractGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1193:1: ( ( ( rule__AbstractGroup__Group_4__0 )? ) )
            // InternalMSL.g:1194:1: ( ( rule__AbstractGroup__Group_4__0 )? )
            {
            // InternalMSL.g:1194:1: ( ( rule__AbstractGroup__Group_4__0 )? )
            // InternalMSL.g:1195:2: ( rule__AbstractGroup__Group_4__0 )?
            {
             before(grammarAccess.getAbstractGroupAccess().getGroup_4()); 
            // InternalMSL.g:1196:2: ( rule__AbstractGroup__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMSL.g:1196:3: rule__AbstractGroup__Group_4__0
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
    // InternalMSL.g:1204:1: rule__AbstractGroup__Group__5 : rule__AbstractGroup__Group__5__Impl rule__AbstractGroup__Group__6 ;
    public final void rule__AbstractGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1208:1: ( rule__AbstractGroup__Group__5__Impl rule__AbstractGroup__Group__6 )
            // InternalMSL.g:1209:2: rule__AbstractGroup__Group__5__Impl rule__AbstractGroup__Group__6
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
    // InternalMSL.g:1216:1: rule__AbstractGroup__Group__5__Impl : ( 'components' ) ;
    public final void rule__AbstractGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1220:1: ( ( 'components' ) )
            // InternalMSL.g:1221:1: ( 'components' )
            {
            // InternalMSL.g:1221:1: ( 'components' )
            // InternalMSL.g:1222:2: 'components'
            {
             before(grammarAccess.getAbstractGroupAccess().getComponentsKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMSL.g:1231:1: rule__AbstractGroup__Group__6 : rule__AbstractGroup__Group__6__Impl rule__AbstractGroup__Group__7 ;
    public final void rule__AbstractGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1235:1: ( rule__AbstractGroup__Group__6__Impl rule__AbstractGroup__Group__7 )
            // InternalMSL.g:1236:2: rule__AbstractGroup__Group__6__Impl rule__AbstractGroup__Group__7
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
    // InternalMSL.g:1243:1: rule__AbstractGroup__Group__6__Impl : ( ( rule__AbstractGroup__ComponentsAssignment_6 ) ) ;
    public final void rule__AbstractGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1247:1: ( ( ( rule__AbstractGroup__ComponentsAssignment_6 ) ) )
            // InternalMSL.g:1248:1: ( ( rule__AbstractGroup__ComponentsAssignment_6 ) )
            {
            // InternalMSL.g:1248:1: ( ( rule__AbstractGroup__ComponentsAssignment_6 ) )
            // InternalMSL.g:1249:2: ( rule__AbstractGroup__ComponentsAssignment_6 )
            {
             before(grammarAccess.getAbstractGroupAccess().getComponentsAssignment_6()); 
            // InternalMSL.g:1250:2: ( rule__AbstractGroup__ComponentsAssignment_6 )
            // InternalMSL.g:1250:3: rule__AbstractGroup__ComponentsAssignment_6
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
    // InternalMSL.g:1258:1: rule__AbstractGroup__Group__7 : rule__AbstractGroup__Group__7__Impl rule__AbstractGroup__Group__8 ;
    public final void rule__AbstractGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1262:1: ( rule__AbstractGroup__Group__7__Impl rule__AbstractGroup__Group__8 )
            // InternalMSL.g:1263:2: rule__AbstractGroup__Group__7__Impl rule__AbstractGroup__Group__8
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
    // InternalMSL.g:1270:1: rule__AbstractGroup__Group__7__Impl : ( ( rule__AbstractGroup__Group_7__0 )* ) ;
    public final void rule__AbstractGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1274:1: ( ( ( rule__AbstractGroup__Group_7__0 )* ) )
            // InternalMSL.g:1275:1: ( ( rule__AbstractGroup__Group_7__0 )* )
            {
            // InternalMSL.g:1275:1: ( ( rule__AbstractGroup__Group_7__0 )* )
            // InternalMSL.g:1276:2: ( rule__AbstractGroup__Group_7__0 )*
            {
             before(grammarAccess.getAbstractGroupAccess().getGroup_7()); 
            // InternalMSL.g:1277:2: ( rule__AbstractGroup__Group_7__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMSL.g:1277:3: rule__AbstractGroup__Group_7__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__AbstractGroup__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalMSL.g:1285:1: rule__AbstractGroup__Group__8 : rule__AbstractGroup__Group__8__Impl ;
    public final void rule__AbstractGroup__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1289:1: ( rule__AbstractGroup__Group__8__Impl )
            // InternalMSL.g:1290:2: rule__AbstractGroup__Group__8__Impl
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
    // InternalMSL.g:1296:1: rule__AbstractGroup__Group__8__Impl : ( '}' ) ;
    public final void rule__AbstractGroup__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1300:1: ( ( '}' ) )
            // InternalMSL.g:1301:1: ( '}' )
            {
            // InternalMSL.g:1301:1: ( '}' )
            // InternalMSL.g:1302:2: '}'
            {
             before(grammarAccess.getAbstractGroupAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMSL.g:1312:1: rule__AbstractGroup__Group_3__0 : rule__AbstractGroup__Group_3__0__Impl rule__AbstractGroup__Group_3__1 ;
    public final void rule__AbstractGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1316:1: ( rule__AbstractGroup__Group_3__0__Impl rule__AbstractGroup__Group_3__1 )
            // InternalMSL.g:1317:2: rule__AbstractGroup__Group_3__0__Impl rule__AbstractGroup__Group_3__1
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
    // InternalMSL.g:1324:1: rule__AbstractGroup__Group_3__0__Impl : ( 'managedSyS' ) ;
    public final void rule__AbstractGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1328:1: ( ( 'managedSyS' ) )
            // InternalMSL.g:1329:1: ( 'managedSyS' )
            {
            // InternalMSL.g:1329:1: ( 'managedSyS' )
            // InternalMSL.g:1330:2: 'managedSyS'
            {
             before(grammarAccess.getAbstractGroupAccess().getManagedSySKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMSL.g:1339:1: rule__AbstractGroup__Group_3__1 : rule__AbstractGroup__Group_3__1__Impl ;
    public final void rule__AbstractGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1343:1: ( rule__AbstractGroup__Group_3__1__Impl )
            // InternalMSL.g:1344:2: rule__AbstractGroup__Group_3__1__Impl
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
    // InternalMSL.g:1350:1: rule__AbstractGroup__Group_3__1__Impl : ( ( rule__AbstractGroup__ManSysAssignment_3_1 ) ) ;
    public final void rule__AbstractGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1354:1: ( ( ( rule__AbstractGroup__ManSysAssignment_3_1 ) ) )
            // InternalMSL.g:1355:1: ( ( rule__AbstractGroup__ManSysAssignment_3_1 ) )
            {
            // InternalMSL.g:1355:1: ( ( rule__AbstractGroup__ManSysAssignment_3_1 ) )
            // InternalMSL.g:1356:2: ( rule__AbstractGroup__ManSysAssignment_3_1 )
            {
             before(grammarAccess.getAbstractGroupAccess().getManSysAssignment_3_1()); 
            // InternalMSL.g:1357:2: ( rule__AbstractGroup__ManSysAssignment_3_1 )
            // InternalMSL.g:1357:3: rule__AbstractGroup__ManSysAssignment_3_1
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
    // InternalMSL.g:1366:1: rule__AbstractGroup__Group_4__0 : rule__AbstractGroup__Group_4__0__Impl rule__AbstractGroup__Group_4__1 ;
    public final void rule__AbstractGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1370:1: ( rule__AbstractGroup__Group_4__0__Impl rule__AbstractGroup__Group_4__1 )
            // InternalMSL.g:1371:2: rule__AbstractGroup__Group_4__0__Impl rule__AbstractGroup__Group_4__1
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
    // InternalMSL.g:1378:1: rule__AbstractGroup__Group_4__0__Impl : ( 'managedGrp' ) ;
    public final void rule__AbstractGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1382:1: ( ( 'managedGrp' ) )
            // InternalMSL.g:1383:1: ( 'managedGrp' )
            {
            // InternalMSL.g:1383:1: ( 'managedGrp' )
            // InternalMSL.g:1384:2: 'managedGrp'
            {
             before(grammarAccess.getAbstractGroupAccess().getManagedGrpKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMSL.g:1393:1: rule__AbstractGroup__Group_4__1 : rule__AbstractGroup__Group_4__1__Impl rule__AbstractGroup__Group_4__2 ;
    public final void rule__AbstractGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1397:1: ( rule__AbstractGroup__Group_4__1__Impl rule__AbstractGroup__Group_4__2 )
            // InternalMSL.g:1398:2: rule__AbstractGroup__Group_4__1__Impl rule__AbstractGroup__Group_4__2
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
    // InternalMSL.g:1405:1: rule__AbstractGroup__Group_4__1__Impl : ( ( rule__AbstractGroup__ManGrpAssignment_4_1 ) ) ;
    public final void rule__AbstractGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1409:1: ( ( ( rule__AbstractGroup__ManGrpAssignment_4_1 ) ) )
            // InternalMSL.g:1410:1: ( ( rule__AbstractGroup__ManGrpAssignment_4_1 ) )
            {
            // InternalMSL.g:1410:1: ( ( rule__AbstractGroup__ManGrpAssignment_4_1 ) )
            // InternalMSL.g:1411:2: ( rule__AbstractGroup__ManGrpAssignment_4_1 )
            {
             before(grammarAccess.getAbstractGroupAccess().getManGrpAssignment_4_1()); 
            // InternalMSL.g:1412:2: ( rule__AbstractGroup__ManGrpAssignment_4_1 )
            // InternalMSL.g:1412:3: rule__AbstractGroup__ManGrpAssignment_4_1
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
    // InternalMSL.g:1420:1: rule__AbstractGroup__Group_4__2 : rule__AbstractGroup__Group_4__2__Impl ;
    public final void rule__AbstractGroup__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1424:1: ( rule__AbstractGroup__Group_4__2__Impl )
            // InternalMSL.g:1425:2: rule__AbstractGroup__Group_4__2__Impl
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
    // InternalMSL.g:1431:1: rule__AbstractGroup__Group_4__2__Impl : ( ( rule__AbstractGroup__Group_4_2__0 )* ) ;
    public final void rule__AbstractGroup__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1435:1: ( ( ( rule__AbstractGroup__Group_4_2__0 )* ) )
            // InternalMSL.g:1436:1: ( ( rule__AbstractGroup__Group_4_2__0 )* )
            {
            // InternalMSL.g:1436:1: ( ( rule__AbstractGroup__Group_4_2__0 )* )
            // InternalMSL.g:1437:2: ( rule__AbstractGroup__Group_4_2__0 )*
            {
             before(grammarAccess.getAbstractGroupAccess().getGroup_4_2()); 
            // InternalMSL.g:1438:2: ( rule__AbstractGroup__Group_4_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMSL.g:1438:3: rule__AbstractGroup__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__AbstractGroup__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMSL.g:1447:1: rule__AbstractGroup__Group_4_2__0 : rule__AbstractGroup__Group_4_2__0__Impl rule__AbstractGroup__Group_4_2__1 ;
    public final void rule__AbstractGroup__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1451:1: ( rule__AbstractGroup__Group_4_2__0__Impl rule__AbstractGroup__Group_4_2__1 )
            // InternalMSL.g:1452:2: rule__AbstractGroup__Group_4_2__0__Impl rule__AbstractGroup__Group_4_2__1
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
    // InternalMSL.g:1459:1: rule__AbstractGroup__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__AbstractGroup__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1463:1: ( ( ',' ) )
            // InternalMSL.g:1464:1: ( ',' )
            {
            // InternalMSL.g:1464:1: ( ',' )
            // InternalMSL.g:1465:2: ','
            {
             before(grammarAccess.getAbstractGroupAccess().getCommaKeyword_4_2_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMSL.g:1474:1: rule__AbstractGroup__Group_4_2__1 : rule__AbstractGroup__Group_4_2__1__Impl ;
    public final void rule__AbstractGroup__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1478:1: ( rule__AbstractGroup__Group_4_2__1__Impl )
            // InternalMSL.g:1479:2: rule__AbstractGroup__Group_4_2__1__Impl
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
    // InternalMSL.g:1485:1: rule__AbstractGroup__Group_4_2__1__Impl : ( ( rule__AbstractGroup__ManGrpAssignment_4_2_1 ) ) ;
    public final void rule__AbstractGroup__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1489:1: ( ( ( rule__AbstractGroup__ManGrpAssignment_4_2_1 ) ) )
            // InternalMSL.g:1490:1: ( ( rule__AbstractGroup__ManGrpAssignment_4_2_1 ) )
            {
            // InternalMSL.g:1490:1: ( ( rule__AbstractGroup__ManGrpAssignment_4_2_1 ) )
            // InternalMSL.g:1491:2: ( rule__AbstractGroup__ManGrpAssignment_4_2_1 )
            {
             before(grammarAccess.getAbstractGroupAccess().getManGrpAssignment_4_2_1()); 
            // InternalMSL.g:1492:2: ( rule__AbstractGroup__ManGrpAssignment_4_2_1 )
            // InternalMSL.g:1492:3: rule__AbstractGroup__ManGrpAssignment_4_2_1
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
    // InternalMSL.g:1501:1: rule__AbstractGroup__Group_7__0 : rule__AbstractGroup__Group_7__0__Impl rule__AbstractGroup__Group_7__1 ;
    public final void rule__AbstractGroup__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1505:1: ( rule__AbstractGroup__Group_7__0__Impl rule__AbstractGroup__Group_7__1 )
            // InternalMSL.g:1506:2: rule__AbstractGroup__Group_7__0__Impl rule__AbstractGroup__Group_7__1
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
    // InternalMSL.g:1513:1: rule__AbstractGroup__Group_7__0__Impl : ( ',' ) ;
    public final void rule__AbstractGroup__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1517:1: ( ( ',' ) )
            // InternalMSL.g:1518:1: ( ',' )
            {
            // InternalMSL.g:1518:1: ( ',' )
            // InternalMSL.g:1519:2: ','
            {
             before(grammarAccess.getAbstractGroupAccess().getCommaKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMSL.g:1528:1: rule__AbstractGroup__Group_7__1 : rule__AbstractGroup__Group_7__1__Impl ;
    public final void rule__AbstractGroup__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1532:1: ( rule__AbstractGroup__Group_7__1__Impl )
            // InternalMSL.g:1533:2: rule__AbstractGroup__Group_7__1__Impl
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
    // InternalMSL.g:1539:1: rule__AbstractGroup__Group_7__1__Impl : ( ( rule__AbstractGroup__ComponentsAssignment_7_1 ) ) ;
    public final void rule__AbstractGroup__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1543:1: ( ( ( rule__AbstractGroup__ComponentsAssignment_7_1 ) ) )
            // InternalMSL.g:1544:1: ( ( rule__AbstractGroup__ComponentsAssignment_7_1 ) )
            {
            // InternalMSL.g:1544:1: ( ( rule__AbstractGroup__ComponentsAssignment_7_1 ) )
            // InternalMSL.g:1545:2: ( rule__AbstractGroup__ComponentsAssignment_7_1 )
            {
             before(grammarAccess.getAbstractGroupAccess().getComponentsAssignment_7_1()); 
            // InternalMSL.g:1546:2: ( rule__AbstractGroup__ComponentsAssignment_7_1 )
            // InternalMSL.g:1546:3: rule__AbstractGroup__ComponentsAssignment_7_1
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
    // InternalMSL.g:1555:1: rule__AbstractInteraction__Group__0 : rule__AbstractInteraction__Group__0__Impl rule__AbstractInteraction__Group__1 ;
    public final void rule__AbstractInteraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1559:1: ( rule__AbstractInteraction__Group__0__Impl rule__AbstractInteraction__Group__1 )
            // InternalMSL.g:1560:2: rule__AbstractInteraction__Group__0__Impl rule__AbstractInteraction__Group__1
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
    // InternalMSL.g:1567:1: rule__AbstractInteraction__Group__0__Impl : ( 'interaction' ) ;
    public final void rule__AbstractInteraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1571:1: ( ( 'interaction' ) )
            // InternalMSL.g:1572:1: ( 'interaction' )
            {
            // InternalMSL.g:1572:1: ( 'interaction' )
            // InternalMSL.g:1573:2: 'interaction'
            {
             before(grammarAccess.getAbstractInteractionAccess().getInteractionKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMSL.g:1582:1: rule__AbstractInteraction__Group__1 : rule__AbstractInteraction__Group__1__Impl rule__AbstractInteraction__Group__2 ;
    public final void rule__AbstractInteraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1586:1: ( rule__AbstractInteraction__Group__1__Impl rule__AbstractInteraction__Group__2 )
            // InternalMSL.g:1587:2: rule__AbstractInteraction__Group__1__Impl rule__AbstractInteraction__Group__2
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
    // InternalMSL.g:1594:1: rule__AbstractInteraction__Group__1__Impl : ( ( rule__AbstractInteraction__StartAssignment_1 ) ) ;
    public final void rule__AbstractInteraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1598:1: ( ( ( rule__AbstractInteraction__StartAssignment_1 ) ) )
            // InternalMSL.g:1599:1: ( ( rule__AbstractInteraction__StartAssignment_1 ) )
            {
            // InternalMSL.g:1599:1: ( ( rule__AbstractInteraction__StartAssignment_1 ) )
            // InternalMSL.g:1600:2: ( rule__AbstractInteraction__StartAssignment_1 )
            {
             before(grammarAccess.getAbstractInteractionAccess().getStartAssignment_1()); 
            // InternalMSL.g:1601:2: ( rule__AbstractInteraction__StartAssignment_1 )
            // InternalMSL.g:1601:3: rule__AbstractInteraction__StartAssignment_1
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
    // InternalMSL.g:1609:1: rule__AbstractInteraction__Group__2 : rule__AbstractInteraction__Group__2__Impl rule__AbstractInteraction__Group__3 ;
    public final void rule__AbstractInteraction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1613:1: ( rule__AbstractInteraction__Group__2__Impl rule__AbstractInteraction__Group__3 )
            // InternalMSL.g:1614:2: rule__AbstractInteraction__Group__2__Impl rule__AbstractInteraction__Group__3
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
    // InternalMSL.g:1621:1: rule__AbstractInteraction__Group__2__Impl : ( '->' ) ;
    public final void rule__AbstractInteraction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1625:1: ( ( '->' ) )
            // InternalMSL.g:1626:1: ( '->' )
            {
            // InternalMSL.g:1626:1: ( '->' )
            // InternalMSL.g:1627:2: '->'
            {
             before(grammarAccess.getAbstractInteractionAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMSL.g:1636:1: rule__AbstractInteraction__Group__3 : rule__AbstractInteraction__Group__3__Impl rule__AbstractInteraction__Group__4 ;
    public final void rule__AbstractInteraction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1640:1: ( rule__AbstractInteraction__Group__3__Impl rule__AbstractInteraction__Group__4 )
            // InternalMSL.g:1641:2: rule__AbstractInteraction__Group__3__Impl rule__AbstractInteraction__Group__4
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
    // InternalMSL.g:1648:1: rule__AbstractInteraction__Group__3__Impl : ( ( rule__AbstractInteraction__EndAssignment_3 ) ) ;
    public final void rule__AbstractInteraction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1652:1: ( ( ( rule__AbstractInteraction__EndAssignment_3 ) ) )
            // InternalMSL.g:1653:1: ( ( rule__AbstractInteraction__EndAssignment_3 ) )
            {
            // InternalMSL.g:1653:1: ( ( rule__AbstractInteraction__EndAssignment_3 ) )
            // InternalMSL.g:1654:2: ( rule__AbstractInteraction__EndAssignment_3 )
            {
             before(grammarAccess.getAbstractInteractionAccess().getEndAssignment_3()); 
            // InternalMSL.g:1655:2: ( rule__AbstractInteraction__EndAssignment_3 )
            // InternalMSL.g:1655:3: rule__AbstractInteraction__EndAssignment_3
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
    // InternalMSL.g:1663:1: rule__AbstractInteraction__Group__4 : rule__AbstractInteraction__Group__4__Impl ;
    public final void rule__AbstractInteraction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1667:1: ( rule__AbstractInteraction__Group__4__Impl )
            // InternalMSL.g:1668:2: rule__AbstractInteraction__Group__4__Impl
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
    // InternalMSL.g:1674:1: rule__AbstractInteraction__Group__4__Impl : ( ( rule__AbstractInteraction__Group_4__0 )? ) ;
    public final void rule__AbstractInteraction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1678:1: ( ( ( rule__AbstractInteraction__Group_4__0 )? ) )
            // InternalMSL.g:1679:1: ( ( rule__AbstractInteraction__Group_4__0 )? )
            {
            // InternalMSL.g:1679:1: ( ( rule__AbstractInteraction__Group_4__0 )? )
            // InternalMSL.g:1680:2: ( rule__AbstractInteraction__Group_4__0 )?
            {
             before(grammarAccess.getAbstractInteractionAccess().getGroup_4()); 
            // InternalMSL.g:1681:2: ( rule__AbstractInteraction__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMSL.g:1681:3: rule__AbstractInteraction__Group_4__0
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
    // InternalMSL.g:1690:1: rule__AbstractInteraction__Group_4__0 : rule__AbstractInteraction__Group_4__0__Impl rule__AbstractInteraction__Group_4__1 ;
    public final void rule__AbstractInteraction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1694:1: ( rule__AbstractInteraction__Group_4__0__Impl rule__AbstractInteraction__Group_4__1 )
            // InternalMSL.g:1695:2: rule__AbstractInteraction__Group_4__0__Impl rule__AbstractInteraction__Group_4__1
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
    // InternalMSL.g:1702:1: rule__AbstractInteraction__Group_4__0__Impl : ( '[' ) ;
    public final void rule__AbstractInteraction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1706:1: ( ( '[' ) )
            // InternalMSL.g:1707:1: ( '[' )
            {
            // InternalMSL.g:1707:1: ( '[' )
            // InternalMSL.g:1708:2: '['
            {
             before(grammarAccess.getAbstractInteractionAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMSL.g:1717:1: rule__AbstractInteraction__Group_4__1 : rule__AbstractInteraction__Group_4__1__Impl rule__AbstractInteraction__Group_4__2 ;
    public final void rule__AbstractInteraction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1721:1: ( rule__AbstractInteraction__Group_4__1__Impl rule__AbstractInteraction__Group_4__2 )
            // InternalMSL.g:1722:2: rule__AbstractInteraction__Group_4__1__Impl rule__AbstractInteraction__Group_4__2
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
    // InternalMSL.g:1729:1: rule__AbstractInteraction__Group_4__1__Impl : ( ( rule__AbstractInteraction__LowAssignment_4_1 ) ) ;
    public final void rule__AbstractInteraction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1733:1: ( ( ( rule__AbstractInteraction__LowAssignment_4_1 ) ) )
            // InternalMSL.g:1734:1: ( ( rule__AbstractInteraction__LowAssignment_4_1 ) )
            {
            // InternalMSL.g:1734:1: ( ( rule__AbstractInteraction__LowAssignment_4_1 ) )
            // InternalMSL.g:1735:2: ( rule__AbstractInteraction__LowAssignment_4_1 )
            {
             before(grammarAccess.getAbstractInteractionAccess().getLowAssignment_4_1()); 
            // InternalMSL.g:1736:2: ( rule__AbstractInteraction__LowAssignment_4_1 )
            // InternalMSL.g:1736:3: rule__AbstractInteraction__LowAssignment_4_1
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
    // InternalMSL.g:1744:1: rule__AbstractInteraction__Group_4__2 : rule__AbstractInteraction__Group_4__2__Impl rule__AbstractInteraction__Group_4__3 ;
    public final void rule__AbstractInteraction__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1748:1: ( rule__AbstractInteraction__Group_4__2__Impl rule__AbstractInteraction__Group_4__3 )
            // InternalMSL.g:1749:2: rule__AbstractInteraction__Group_4__2__Impl rule__AbstractInteraction__Group_4__3
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
    // InternalMSL.g:1756:1: rule__AbstractInteraction__Group_4__2__Impl : ( ',' ) ;
    public final void rule__AbstractInteraction__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1760:1: ( ( ',' ) )
            // InternalMSL.g:1761:1: ( ',' )
            {
            // InternalMSL.g:1761:1: ( ',' )
            // InternalMSL.g:1762:2: ','
            {
             before(grammarAccess.getAbstractInteractionAccess().getCommaKeyword_4_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMSL.g:1771:1: rule__AbstractInteraction__Group_4__3 : rule__AbstractInteraction__Group_4__3__Impl rule__AbstractInteraction__Group_4__4 ;
    public final void rule__AbstractInteraction__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1775:1: ( rule__AbstractInteraction__Group_4__3__Impl rule__AbstractInteraction__Group_4__4 )
            // InternalMSL.g:1776:2: rule__AbstractInteraction__Group_4__3__Impl rule__AbstractInteraction__Group_4__4
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
    // InternalMSL.g:1783:1: rule__AbstractInteraction__Group_4__3__Impl : ( ( rule__AbstractInteraction__HighAssignment_4_3 ) ) ;
    public final void rule__AbstractInteraction__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1787:1: ( ( ( rule__AbstractInteraction__HighAssignment_4_3 ) ) )
            // InternalMSL.g:1788:1: ( ( rule__AbstractInteraction__HighAssignment_4_3 ) )
            {
            // InternalMSL.g:1788:1: ( ( rule__AbstractInteraction__HighAssignment_4_3 ) )
            // InternalMSL.g:1789:2: ( rule__AbstractInteraction__HighAssignment_4_3 )
            {
             before(grammarAccess.getAbstractInteractionAccess().getHighAssignment_4_3()); 
            // InternalMSL.g:1790:2: ( rule__AbstractInteraction__HighAssignment_4_3 )
            // InternalMSL.g:1790:3: rule__AbstractInteraction__HighAssignment_4_3
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
    // InternalMSL.g:1798:1: rule__AbstractInteraction__Group_4__4 : rule__AbstractInteraction__Group_4__4__Impl ;
    public final void rule__AbstractInteraction__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1802:1: ( rule__AbstractInteraction__Group_4__4__Impl )
            // InternalMSL.g:1803:2: rule__AbstractInteraction__Group_4__4__Impl
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
    // InternalMSL.g:1809:1: rule__AbstractInteraction__Group_4__4__Impl : ( ']' ) ;
    public final void rule__AbstractInteraction__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1813:1: ( ( ']' ) )
            // InternalMSL.g:1814:1: ( ']' )
            {
            // InternalMSL.g:1814:1: ( ']' )
            // InternalMSL.g:1815:2: ']'
            {
             before(grammarAccess.getAbstractInteractionAccess().getRightSquareBracketKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMSL.g:1825:1: rule__SystemBinding__Group__0 : rule__SystemBinding__Group__0__Impl rule__SystemBinding__Group__1 ;
    public final void rule__SystemBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1829:1: ( rule__SystemBinding__Group__0__Impl rule__SystemBinding__Group__1 )
            // InternalMSL.g:1830:2: rule__SystemBinding__Group__0__Impl rule__SystemBinding__Group__1
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
    // InternalMSL.g:1837:1: rule__SystemBinding__Group__0__Impl : ( 'system' ) ;
    public final void rule__SystemBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1841:1: ( ( 'system' ) )
            // InternalMSL.g:1842:1: ( 'system' )
            {
            // InternalMSL.g:1842:1: ( 'system' )
            // InternalMSL.g:1843:2: 'system'
            {
             before(grammarAccess.getSystemBindingAccess().getSystemKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMSL.g:1852:1: rule__SystemBinding__Group__1 : rule__SystemBinding__Group__1__Impl rule__SystemBinding__Group__2 ;
    public final void rule__SystemBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1856:1: ( rule__SystemBinding__Group__1__Impl rule__SystemBinding__Group__2 )
            // InternalMSL.g:1857:2: rule__SystemBinding__Group__1__Impl rule__SystemBinding__Group__2
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
    // InternalMSL.g:1864:1: rule__SystemBinding__Group__1__Impl : ( ( rule__SystemBinding__NameAssignment_1 ) ) ;
    public final void rule__SystemBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1868:1: ( ( ( rule__SystemBinding__NameAssignment_1 ) ) )
            // InternalMSL.g:1869:1: ( ( rule__SystemBinding__NameAssignment_1 ) )
            {
            // InternalMSL.g:1869:1: ( ( rule__SystemBinding__NameAssignment_1 ) )
            // InternalMSL.g:1870:2: ( rule__SystemBinding__NameAssignment_1 )
            {
             before(grammarAccess.getSystemBindingAccess().getNameAssignment_1()); 
            // InternalMSL.g:1871:2: ( rule__SystemBinding__NameAssignment_1 )
            // InternalMSL.g:1871:3: rule__SystemBinding__NameAssignment_1
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
    // InternalMSL.g:1879:1: rule__SystemBinding__Group__2 : rule__SystemBinding__Group__2__Impl rule__SystemBinding__Group__3 ;
    public final void rule__SystemBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1883:1: ( rule__SystemBinding__Group__2__Impl rule__SystemBinding__Group__3 )
            // InternalMSL.g:1884:2: rule__SystemBinding__Group__2__Impl rule__SystemBinding__Group__3
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
    // InternalMSL.g:1891:1: rule__SystemBinding__Group__2__Impl : ( ':' ) ;
    public final void rule__SystemBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1895:1: ( ( ':' ) )
            // InternalMSL.g:1896:1: ( ':' )
            {
            // InternalMSL.g:1896:1: ( ':' )
            // InternalMSL.g:1897:2: ':'
            {
             before(grammarAccess.getSystemBindingAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMSL.g:1906:1: rule__SystemBinding__Group__3 : rule__SystemBinding__Group__3__Impl ;
    public final void rule__SystemBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1910:1: ( rule__SystemBinding__Group__3__Impl )
            // InternalMSL.g:1911:2: rule__SystemBinding__Group__3__Impl
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
    // InternalMSL.g:1917:1: rule__SystemBinding__Group__3__Impl : ( ( rule__SystemBinding__AbsSysAssignment_3 ) ) ;
    public final void rule__SystemBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1921:1: ( ( ( rule__SystemBinding__AbsSysAssignment_3 ) ) )
            // InternalMSL.g:1922:1: ( ( rule__SystemBinding__AbsSysAssignment_3 ) )
            {
            // InternalMSL.g:1922:1: ( ( rule__SystemBinding__AbsSysAssignment_3 ) )
            // InternalMSL.g:1923:2: ( rule__SystemBinding__AbsSysAssignment_3 )
            {
             before(grammarAccess.getSystemBindingAccess().getAbsSysAssignment_3()); 
            // InternalMSL.g:1924:2: ( rule__SystemBinding__AbsSysAssignment_3 )
            // InternalMSL.g:1924:3: rule__SystemBinding__AbsSysAssignment_3
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
    // InternalMSL.g:1933:1: rule__GroupBinding__Group__0 : rule__GroupBinding__Group__0__Impl rule__GroupBinding__Group__1 ;
    public final void rule__GroupBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1937:1: ( rule__GroupBinding__Group__0__Impl rule__GroupBinding__Group__1 )
            // InternalMSL.g:1938:2: rule__GroupBinding__Group__0__Impl rule__GroupBinding__Group__1
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
    // InternalMSL.g:1945:1: rule__GroupBinding__Group__0__Impl : ( 'group' ) ;
    public final void rule__GroupBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1949:1: ( ( 'group' ) )
            // InternalMSL.g:1950:1: ( 'group' )
            {
            // InternalMSL.g:1950:1: ( 'group' )
            // InternalMSL.g:1951:2: 'group'
            {
             before(grammarAccess.getGroupBindingAccess().getGroupKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMSL.g:1960:1: rule__GroupBinding__Group__1 : rule__GroupBinding__Group__1__Impl rule__GroupBinding__Group__2 ;
    public final void rule__GroupBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1964:1: ( rule__GroupBinding__Group__1__Impl rule__GroupBinding__Group__2 )
            // InternalMSL.g:1965:2: rule__GroupBinding__Group__1__Impl rule__GroupBinding__Group__2
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
    // InternalMSL.g:1972:1: rule__GroupBinding__Group__1__Impl : ( ( rule__GroupBinding__NameAssignment_1 ) ) ;
    public final void rule__GroupBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1976:1: ( ( ( rule__GroupBinding__NameAssignment_1 ) ) )
            // InternalMSL.g:1977:1: ( ( rule__GroupBinding__NameAssignment_1 ) )
            {
            // InternalMSL.g:1977:1: ( ( rule__GroupBinding__NameAssignment_1 ) )
            // InternalMSL.g:1978:2: ( rule__GroupBinding__NameAssignment_1 )
            {
             before(grammarAccess.getGroupBindingAccess().getNameAssignment_1()); 
            // InternalMSL.g:1979:2: ( rule__GroupBinding__NameAssignment_1 )
            // InternalMSL.g:1979:3: rule__GroupBinding__NameAssignment_1
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
    // InternalMSL.g:1987:1: rule__GroupBinding__Group__2 : rule__GroupBinding__Group__2__Impl rule__GroupBinding__Group__3 ;
    public final void rule__GroupBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1991:1: ( rule__GroupBinding__Group__2__Impl rule__GroupBinding__Group__3 )
            // InternalMSL.g:1992:2: rule__GroupBinding__Group__2__Impl rule__GroupBinding__Group__3
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
    // InternalMSL.g:1999:1: rule__GroupBinding__Group__2__Impl : ( ':' ) ;
    public final void rule__GroupBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2003:1: ( ( ':' ) )
            // InternalMSL.g:2004:1: ( ':' )
            {
            // InternalMSL.g:2004:1: ( ':' )
            // InternalMSL.g:2005:2: ':'
            {
             before(grammarAccess.getGroupBindingAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMSL.g:2014:1: rule__GroupBinding__Group__3 : rule__GroupBinding__Group__3__Impl ;
    public final void rule__GroupBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2018:1: ( rule__GroupBinding__Group__3__Impl )
            // InternalMSL.g:2019:2: rule__GroupBinding__Group__3__Impl
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
    // InternalMSL.g:2025:1: rule__GroupBinding__Group__3__Impl : ( ( rule__GroupBinding__AbsGroupAssignment_3 ) ) ;
    public final void rule__GroupBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2029:1: ( ( ( rule__GroupBinding__AbsGroupAssignment_3 ) ) )
            // InternalMSL.g:2030:1: ( ( rule__GroupBinding__AbsGroupAssignment_3 ) )
            {
            // InternalMSL.g:2030:1: ( ( rule__GroupBinding__AbsGroupAssignment_3 ) )
            // InternalMSL.g:2031:2: ( rule__GroupBinding__AbsGroupAssignment_3 )
            {
             before(grammarAccess.getGroupBindingAccess().getAbsGroupAssignment_3()); 
            // InternalMSL.g:2032:2: ( rule__GroupBinding__AbsGroupAssignment_3 )
            // InternalMSL.g:2032:3: rule__GroupBinding__AbsGroupAssignment_3
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
    // InternalMSL.g:2041:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2045:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalMSL.g:2046:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
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
    // InternalMSL.g:2053:1: rule__Pattern__Group__0__Impl : ( 'concrete' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2057:1: ( ( 'concrete' ) )
            // InternalMSL.g:2058:1: ( 'concrete' )
            {
            // InternalMSL.g:2058:1: ( 'concrete' )
            // InternalMSL.g:2059:2: 'concrete'
            {
             before(grammarAccess.getPatternAccess().getConcreteKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMSL.g:2068:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2072:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalMSL.g:2073:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
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
    // InternalMSL.g:2080:1: rule__Pattern__Group__1__Impl : ( 'pattern' ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2084:1: ( ( 'pattern' ) )
            // InternalMSL.g:2085:1: ( 'pattern' )
            {
            // InternalMSL.g:2085:1: ( 'pattern' )
            // InternalMSL.g:2086:2: 'pattern'
            {
             before(grammarAccess.getPatternAccess().getPatternKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMSL.g:2095:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2099:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalMSL.g:2100:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
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
    // InternalMSL.g:2107:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__NameAssignment_2 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2111:1: ( ( ( rule__Pattern__NameAssignment_2 ) ) )
            // InternalMSL.g:2112:1: ( ( rule__Pattern__NameAssignment_2 ) )
            {
            // InternalMSL.g:2112:1: ( ( rule__Pattern__NameAssignment_2 ) )
            // InternalMSL.g:2113:2: ( rule__Pattern__NameAssignment_2 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_2()); 
            // InternalMSL.g:2114:2: ( rule__Pattern__NameAssignment_2 )
            // InternalMSL.g:2114:3: rule__Pattern__NameAssignment_2
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
    // InternalMSL.g:2122:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2126:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalMSL.g:2127:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
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
    // InternalMSL.g:2134:1: rule__Pattern__Group__3__Impl : ( 'concretizationOf' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2138:1: ( ( 'concretizationOf' ) )
            // InternalMSL.g:2139:1: ( 'concretizationOf' )
            {
            // InternalMSL.g:2139:1: ( 'concretizationOf' )
            // InternalMSL.g:2140:2: 'concretizationOf'
            {
             before(grammarAccess.getPatternAccess().getConcretizationOfKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMSL.g:2149:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2153:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalMSL.g:2154:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
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
    // InternalMSL.g:2161:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__AbsPatternAssignment_4 ) ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2165:1: ( ( ( rule__Pattern__AbsPatternAssignment_4 ) ) )
            // InternalMSL.g:2166:1: ( ( rule__Pattern__AbsPatternAssignment_4 ) )
            {
            // InternalMSL.g:2166:1: ( ( rule__Pattern__AbsPatternAssignment_4 ) )
            // InternalMSL.g:2167:2: ( rule__Pattern__AbsPatternAssignment_4 )
            {
             before(grammarAccess.getPatternAccess().getAbsPatternAssignment_4()); 
            // InternalMSL.g:2168:2: ( rule__Pattern__AbsPatternAssignment_4 )
            // InternalMSL.g:2168:3: rule__Pattern__AbsPatternAssignment_4
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
    // InternalMSL.g:2176:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl rule__Pattern__Group__6 ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2180:1: ( rule__Pattern__Group__5__Impl rule__Pattern__Group__6 )
            // InternalMSL.g:2181:2: rule__Pattern__Group__5__Impl rule__Pattern__Group__6
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
    // InternalMSL.g:2188:1: rule__Pattern__Group__5__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2192:1: ( ( '{' ) )
            // InternalMSL.g:2193:1: ( '{' )
            {
            // InternalMSL.g:2193:1: ( '{' )
            // InternalMSL.g:2194:2: '{'
            {
             before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMSL.g:2203:1: rule__Pattern__Group__6 : rule__Pattern__Group__6__Impl rule__Pattern__Group__7 ;
    public final void rule__Pattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2207:1: ( rule__Pattern__Group__6__Impl rule__Pattern__Group__7 )
            // InternalMSL.g:2208:2: rule__Pattern__Group__6__Impl rule__Pattern__Group__7
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
    // InternalMSL.g:2215:1: rule__Pattern__Group__6__Impl : ( ( rule__Pattern__ManagedSystemsAssignment_6 )* ) ;
    public final void rule__Pattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2219:1: ( ( ( rule__Pattern__ManagedSystemsAssignment_6 )* ) )
            // InternalMSL.g:2220:1: ( ( rule__Pattern__ManagedSystemsAssignment_6 )* )
            {
            // InternalMSL.g:2220:1: ( ( rule__Pattern__ManagedSystemsAssignment_6 )* )
            // InternalMSL.g:2221:2: ( rule__Pattern__ManagedSystemsAssignment_6 )*
            {
             before(grammarAccess.getPatternAccess().getManagedSystemsAssignment_6()); 
            // InternalMSL.g:2222:2: ( rule__Pattern__ManagedSystemsAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMSL.g:2222:3: rule__Pattern__ManagedSystemsAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Pattern__ManagedSystemsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMSL.g:2230:1: rule__Pattern__Group__7 : rule__Pattern__Group__7__Impl rule__Pattern__Group__8 ;
    public final void rule__Pattern__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2234:1: ( rule__Pattern__Group__7__Impl rule__Pattern__Group__8 )
            // InternalMSL.g:2235:2: rule__Pattern__Group__7__Impl rule__Pattern__Group__8
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
    // InternalMSL.g:2242:1: rule__Pattern__Group__7__Impl : ( ( rule__Pattern__GroupsAssignment_7 )* ) ;
    public final void rule__Pattern__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2246:1: ( ( ( rule__Pattern__GroupsAssignment_7 )* ) )
            // InternalMSL.g:2247:1: ( ( rule__Pattern__GroupsAssignment_7 )* )
            {
            // InternalMSL.g:2247:1: ( ( rule__Pattern__GroupsAssignment_7 )* )
            // InternalMSL.g:2248:2: ( rule__Pattern__GroupsAssignment_7 )*
            {
             before(grammarAccess.getPatternAccess().getGroupsAssignment_7()); 
            // InternalMSL.g:2249:2: ( rule__Pattern__GroupsAssignment_7 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMSL.g:2249:3: rule__Pattern__GroupsAssignment_7
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Pattern__GroupsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMSL.g:2257:1: rule__Pattern__Group__8 : rule__Pattern__Group__8__Impl ;
    public final void rule__Pattern__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2261:1: ( rule__Pattern__Group__8__Impl )
            // InternalMSL.g:2262:2: rule__Pattern__Group__8__Impl
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
    // InternalMSL.g:2268:1: rule__Pattern__Group__8__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2272:1: ( ( '}' ) )
            // InternalMSL.g:2273:1: ( '}' )
            {
            // InternalMSL.g:2273:1: ( '}' )
            // InternalMSL.g:2274:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMSL.g:2284:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2288:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // InternalMSL.g:2289:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
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
    // InternalMSL.g:2296:1: rule__Configuration__Group__0__Impl : ( 'configuration' ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2300:1: ( ( 'configuration' ) )
            // InternalMSL.g:2301:1: ( 'configuration' )
            {
            // InternalMSL.g:2301:1: ( 'configuration' )
            // InternalMSL.g:2302:2: 'configuration'
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMSL.g:2311:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2315:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // InternalMSL.g:2316:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
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
    // InternalMSL.g:2323:1: rule__Configuration__Group__1__Impl : ( ( rule__Configuration__NameAssignment_1 ) ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2327:1: ( ( ( rule__Configuration__NameAssignment_1 ) ) )
            // InternalMSL.g:2328:1: ( ( rule__Configuration__NameAssignment_1 ) )
            {
            // InternalMSL.g:2328:1: ( ( rule__Configuration__NameAssignment_1 ) )
            // InternalMSL.g:2329:2: ( rule__Configuration__NameAssignment_1 )
            {
             before(grammarAccess.getConfigurationAccess().getNameAssignment_1()); 
            // InternalMSL.g:2330:2: ( rule__Configuration__NameAssignment_1 )
            // InternalMSL.g:2330:3: rule__Configuration__NameAssignment_1
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
    // InternalMSL.g:2338:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl rule__Configuration__Group__3 ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2342:1: ( rule__Configuration__Group__2__Impl rule__Configuration__Group__3 )
            // InternalMSL.g:2343:2: rule__Configuration__Group__2__Impl rule__Configuration__Group__3
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
    // InternalMSL.g:2350:1: rule__Configuration__Group__2__Impl : ( 'instanceOf' ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2354:1: ( ( 'instanceOf' ) )
            // InternalMSL.g:2355:1: ( 'instanceOf' )
            {
            // InternalMSL.g:2355:1: ( 'instanceOf' )
            // InternalMSL.g:2356:2: 'instanceOf'
            {
             before(grammarAccess.getConfigurationAccess().getInstanceOfKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMSL.g:2365:1: rule__Configuration__Group__3 : rule__Configuration__Group__3__Impl rule__Configuration__Group__4 ;
    public final void rule__Configuration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2369:1: ( rule__Configuration__Group__3__Impl rule__Configuration__Group__4 )
            // InternalMSL.g:2370:2: rule__Configuration__Group__3__Impl rule__Configuration__Group__4
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
    // InternalMSL.g:2377:1: rule__Configuration__Group__3__Impl : ( ( rule__Configuration__Group_3__0 ) ) ;
    public final void rule__Configuration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2381:1: ( ( ( rule__Configuration__Group_3__0 ) ) )
            // InternalMSL.g:2382:1: ( ( rule__Configuration__Group_3__0 ) )
            {
            // InternalMSL.g:2382:1: ( ( rule__Configuration__Group_3__0 ) )
            // InternalMSL.g:2383:2: ( rule__Configuration__Group_3__0 )
            {
             before(grammarAccess.getConfigurationAccess().getGroup_3()); 
            // InternalMSL.g:2384:2: ( rule__Configuration__Group_3__0 )
            // InternalMSL.g:2384:3: rule__Configuration__Group_3__0
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
    // InternalMSL.g:2392:1: rule__Configuration__Group__4 : rule__Configuration__Group__4__Impl rule__Configuration__Group__5 ;
    public final void rule__Configuration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2396:1: ( rule__Configuration__Group__4__Impl rule__Configuration__Group__5 )
            // InternalMSL.g:2397:2: rule__Configuration__Group__4__Impl rule__Configuration__Group__5
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
    // InternalMSL.g:2404:1: rule__Configuration__Group__4__Impl : ( '{' ) ;
    public final void rule__Configuration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2408:1: ( ( '{' ) )
            // InternalMSL.g:2409:1: ( '{' )
            {
            // InternalMSL.g:2409:1: ( '{' )
            // InternalMSL.g:2410:2: '{'
            {
             before(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMSL.g:2419:1: rule__Configuration__Group__5 : rule__Configuration__Group__5__Impl rule__Configuration__Group__6 ;
    public final void rule__Configuration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2423:1: ( rule__Configuration__Group__5__Impl rule__Configuration__Group__6 )
            // InternalMSL.g:2424:2: rule__Configuration__Group__5__Impl rule__Configuration__Group__6
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
    // InternalMSL.g:2431:1: rule__Configuration__Group__5__Impl : ( ( rule__Configuration__ConcreteSystemsAssignment_5 )* ) ;
    public final void rule__Configuration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2435:1: ( ( ( rule__Configuration__ConcreteSystemsAssignment_5 )* ) )
            // InternalMSL.g:2436:1: ( ( rule__Configuration__ConcreteSystemsAssignment_5 )* )
            {
            // InternalMSL.g:2436:1: ( ( rule__Configuration__ConcreteSystemsAssignment_5 )* )
            // InternalMSL.g:2437:2: ( rule__Configuration__ConcreteSystemsAssignment_5 )*
            {
             before(grammarAccess.getConfigurationAccess().getConcreteSystemsAssignment_5()); 
            // InternalMSL.g:2438:2: ( rule__Configuration__ConcreteSystemsAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // InternalMSL.g:2438:3: rule__Configuration__ConcreteSystemsAssignment_5
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Configuration__ConcreteSystemsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalMSL.g:2446:1: rule__Configuration__Group__6 : rule__Configuration__Group__6__Impl rule__Configuration__Group__7 ;
    public final void rule__Configuration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2450:1: ( rule__Configuration__Group__6__Impl rule__Configuration__Group__7 )
            // InternalMSL.g:2451:2: rule__Configuration__Group__6__Impl rule__Configuration__Group__7
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
    // InternalMSL.g:2458:1: rule__Configuration__Group__6__Impl : ( ( rule__Configuration__ConcreteGroupsAssignment_6 )* ) ;
    public final void rule__Configuration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2462:1: ( ( ( rule__Configuration__ConcreteGroupsAssignment_6 )* ) )
            // InternalMSL.g:2463:1: ( ( rule__Configuration__ConcreteGroupsAssignment_6 )* )
            {
            // InternalMSL.g:2463:1: ( ( rule__Configuration__ConcreteGroupsAssignment_6 )* )
            // InternalMSL.g:2464:2: ( rule__Configuration__ConcreteGroupsAssignment_6 )*
            {
             before(grammarAccess.getConfigurationAccess().getConcreteGroupsAssignment_6()); 
            // InternalMSL.g:2465:2: ( rule__Configuration__ConcreteGroupsAssignment_6 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_INSTANCE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMSL.g:2465:3: rule__Configuration__ConcreteGroupsAssignment_6
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Configuration__ConcreteGroupsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalMSL.g:2473:1: rule__Configuration__Group__7 : rule__Configuration__Group__7__Impl rule__Configuration__Group__8 ;
    public final void rule__Configuration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2477:1: ( rule__Configuration__Group__7__Impl rule__Configuration__Group__8 )
            // InternalMSL.g:2478:2: rule__Configuration__Group__7__Impl rule__Configuration__Group__8
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
    // InternalMSL.g:2485:1: rule__Configuration__Group__7__Impl : ( ( rule__Configuration__ConcreteInteractionsAssignment_7 )* ) ;
    public final void rule__Configuration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2489:1: ( ( ( rule__Configuration__ConcreteInteractionsAssignment_7 )* ) )
            // InternalMSL.g:2490:1: ( ( rule__Configuration__ConcreteInteractionsAssignment_7 )* )
            {
            // InternalMSL.g:2490:1: ( ( rule__Configuration__ConcreteInteractionsAssignment_7 )* )
            // InternalMSL.g:2491:2: ( rule__Configuration__ConcreteInteractionsAssignment_7 )*
            {
             before(grammarAccess.getConfigurationAccess().getConcreteInteractionsAssignment_7()); 
            // InternalMSL.g:2492:2: ( rule__Configuration__ConcreteInteractionsAssignment_7 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_FQN_INSTANCE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMSL.g:2492:3: rule__Configuration__ConcreteInteractionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Configuration__ConcreteInteractionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMSL.g:2500:1: rule__Configuration__Group__8 : rule__Configuration__Group__8__Impl ;
    public final void rule__Configuration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2504:1: ( rule__Configuration__Group__8__Impl )
            // InternalMSL.g:2505:2: rule__Configuration__Group__8__Impl
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
    // InternalMSL.g:2511:1: rule__Configuration__Group__8__Impl : ( '}' ) ;
    public final void rule__Configuration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2515:1: ( ( '}' ) )
            // InternalMSL.g:2516:1: ( '}' )
            {
            // InternalMSL.g:2516:1: ( '}' )
            // InternalMSL.g:2517:2: '}'
            {
             before(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMSL.g:2527:1: rule__Configuration__Group_3__0 : rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1 ;
    public final void rule__Configuration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2531:1: ( rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1 )
            // InternalMSL.g:2532:2: rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1
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
    // InternalMSL.g:2539:1: rule__Configuration__Group_3__0__Impl : ( ( rule__Configuration__PatternAssignment_3_0 ) ) ;
    public final void rule__Configuration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2543:1: ( ( ( rule__Configuration__PatternAssignment_3_0 ) ) )
            // InternalMSL.g:2544:1: ( ( rule__Configuration__PatternAssignment_3_0 ) )
            {
            // InternalMSL.g:2544:1: ( ( rule__Configuration__PatternAssignment_3_0 ) )
            // InternalMSL.g:2545:2: ( rule__Configuration__PatternAssignment_3_0 )
            {
             before(grammarAccess.getConfigurationAccess().getPatternAssignment_3_0()); 
            // InternalMSL.g:2546:2: ( rule__Configuration__PatternAssignment_3_0 )
            // InternalMSL.g:2546:3: rule__Configuration__PatternAssignment_3_0
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
    // InternalMSL.g:2554:1: rule__Configuration__Group_3__1 : rule__Configuration__Group_3__1__Impl ;
    public final void rule__Configuration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2558:1: ( rule__Configuration__Group_3__1__Impl )
            // InternalMSL.g:2559:2: rule__Configuration__Group_3__1__Impl
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
    // InternalMSL.g:2565:1: rule__Configuration__Group_3__1__Impl : ( ( rule__Configuration__Group_3_1__0 )* ) ;
    public final void rule__Configuration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2569:1: ( ( ( rule__Configuration__Group_3_1__0 )* ) )
            // InternalMSL.g:2570:1: ( ( rule__Configuration__Group_3_1__0 )* )
            {
            // InternalMSL.g:2570:1: ( ( rule__Configuration__Group_3_1__0 )* )
            // InternalMSL.g:2571:2: ( rule__Configuration__Group_3_1__0 )*
            {
             before(grammarAccess.getConfigurationAccess().getGroup_3_1()); 
            // InternalMSL.g:2572:2: ( rule__Configuration__Group_3_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMSL.g:2572:3: rule__Configuration__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Configuration__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalMSL.g:2581:1: rule__Configuration__Group_3_1__0 : rule__Configuration__Group_3_1__0__Impl rule__Configuration__Group_3_1__1 ;
    public final void rule__Configuration__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2585:1: ( rule__Configuration__Group_3_1__0__Impl rule__Configuration__Group_3_1__1 )
            // InternalMSL.g:2586:2: rule__Configuration__Group_3_1__0__Impl rule__Configuration__Group_3_1__1
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
    // InternalMSL.g:2593:1: rule__Configuration__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Configuration__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2597:1: ( ( ',' ) )
            // InternalMSL.g:2598:1: ( ',' )
            {
            // InternalMSL.g:2598:1: ( ',' )
            // InternalMSL.g:2599:2: ','
            {
             before(grammarAccess.getConfigurationAccess().getCommaKeyword_3_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMSL.g:2608:1: rule__Configuration__Group_3_1__1 : rule__Configuration__Group_3_1__1__Impl ;
    public final void rule__Configuration__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2612:1: ( rule__Configuration__Group_3_1__1__Impl )
            // InternalMSL.g:2613:2: rule__Configuration__Group_3_1__1__Impl
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
    // InternalMSL.g:2619:1: rule__Configuration__Group_3_1__1__Impl : ( ( rule__Configuration__PatternAssignment_3_1_1 ) ) ;
    public final void rule__Configuration__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2623:1: ( ( ( rule__Configuration__PatternAssignment_3_1_1 ) ) )
            // InternalMSL.g:2624:1: ( ( rule__Configuration__PatternAssignment_3_1_1 ) )
            {
            // InternalMSL.g:2624:1: ( ( rule__Configuration__PatternAssignment_3_1_1 ) )
            // InternalMSL.g:2625:2: ( rule__Configuration__PatternAssignment_3_1_1 )
            {
             before(grammarAccess.getConfigurationAccess().getPatternAssignment_3_1_1()); 
            // InternalMSL.g:2626:2: ( rule__Configuration__PatternAssignment_3_1_1 )
            // InternalMSL.g:2626:3: rule__Configuration__PatternAssignment_3_1_1
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
    // InternalMSL.g:2635:1: rule__ConcreteSystem__Group__0 : rule__ConcreteSystem__Group__0__Impl rule__ConcreteSystem__Group__1 ;
    public final void rule__ConcreteSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2639:1: ( rule__ConcreteSystem__Group__0__Impl rule__ConcreteSystem__Group__1 )
            // InternalMSL.g:2640:2: rule__ConcreteSystem__Group__0__Impl rule__ConcreteSystem__Group__1
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
    // InternalMSL.g:2647:1: rule__ConcreteSystem__Group__0__Impl : ( ( rule__ConcreteSystem__NameAssignment_0 ) ) ;
    public final void rule__ConcreteSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2651:1: ( ( ( rule__ConcreteSystem__NameAssignment_0 ) ) )
            // InternalMSL.g:2652:1: ( ( rule__ConcreteSystem__NameAssignment_0 ) )
            {
            // InternalMSL.g:2652:1: ( ( rule__ConcreteSystem__NameAssignment_0 ) )
            // InternalMSL.g:2653:2: ( rule__ConcreteSystem__NameAssignment_0 )
            {
             before(grammarAccess.getConcreteSystemAccess().getNameAssignment_0()); 
            // InternalMSL.g:2654:2: ( rule__ConcreteSystem__NameAssignment_0 )
            // InternalMSL.g:2654:3: rule__ConcreteSystem__NameAssignment_0
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
    // InternalMSL.g:2662:1: rule__ConcreteSystem__Group__1 : rule__ConcreteSystem__Group__1__Impl rule__ConcreteSystem__Group__2 ;
    public final void rule__ConcreteSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2666:1: ( rule__ConcreteSystem__Group__1__Impl rule__ConcreteSystem__Group__2 )
            // InternalMSL.g:2667:2: rule__ConcreteSystem__Group__1__Impl rule__ConcreteSystem__Group__2
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
    // InternalMSL.g:2674:1: rule__ConcreteSystem__Group__1__Impl : ( ':' ) ;
    public final void rule__ConcreteSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2678:1: ( ( ':' ) )
            // InternalMSL.g:2679:1: ( ':' )
            {
            // InternalMSL.g:2679:1: ( ':' )
            // InternalMSL.g:2680:2: ':'
            {
             before(grammarAccess.getConcreteSystemAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMSL.g:2689:1: rule__ConcreteSystem__Group__2 : rule__ConcreteSystem__Group__2__Impl ;
    public final void rule__ConcreteSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2693:1: ( rule__ConcreteSystem__Group__2__Impl )
            // InternalMSL.g:2694:2: rule__ConcreteSystem__Group__2__Impl
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
    // InternalMSL.g:2700:1: rule__ConcreteSystem__Group__2__Impl : ( ( rule__ConcreteSystem__Group_2__0 ) ) ;
    public final void rule__ConcreteSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2704:1: ( ( ( rule__ConcreteSystem__Group_2__0 ) ) )
            // InternalMSL.g:2705:1: ( ( rule__ConcreteSystem__Group_2__0 ) )
            {
            // InternalMSL.g:2705:1: ( ( rule__ConcreteSystem__Group_2__0 ) )
            // InternalMSL.g:2706:2: ( rule__ConcreteSystem__Group_2__0 )
            {
             before(grammarAccess.getConcreteSystemAccess().getGroup_2()); 
            // InternalMSL.g:2707:2: ( rule__ConcreteSystem__Group_2__0 )
            // InternalMSL.g:2707:3: rule__ConcreteSystem__Group_2__0
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
    // InternalMSL.g:2716:1: rule__ConcreteSystem__Group_2__0 : rule__ConcreteSystem__Group_2__0__Impl rule__ConcreteSystem__Group_2__1 ;
    public final void rule__ConcreteSystem__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2720:1: ( rule__ConcreteSystem__Group_2__0__Impl rule__ConcreteSystem__Group_2__1 )
            // InternalMSL.g:2721:2: rule__ConcreteSystem__Group_2__0__Impl rule__ConcreteSystem__Group_2__1
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
    // InternalMSL.g:2728:1: rule__ConcreteSystem__Group_2__0__Impl : ( ( rule__ConcreteSystem__BindingsAssignment_2_0 ) ) ;
    public final void rule__ConcreteSystem__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2732:1: ( ( ( rule__ConcreteSystem__BindingsAssignment_2_0 ) ) )
            // InternalMSL.g:2733:1: ( ( rule__ConcreteSystem__BindingsAssignment_2_0 ) )
            {
            // InternalMSL.g:2733:1: ( ( rule__ConcreteSystem__BindingsAssignment_2_0 ) )
            // InternalMSL.g:2734:2: ( rule__ConcreteSystem__BindingsAssignment_2_0 )
            {
             before(grammarAccess.getConcreteSystemAccess().getBindingsAssignment_2_0()); 
            // InternalMSL.g:2735:2: ( rule__ConcreteSystem__BindingsAssignment_2_0 )
            // InternalMSL.g:2735:3: rule__ConcreteSystem__BindingsAssignment_2_0
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
    // InternalMSL.g:2743:1: rule__ConcreteSystem__Group_2__1 : rule__ConcreteSystem__Group_2__1__Impl ;
    public final void rule__ConcreteSystem__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2747:1: ( rule__ConcreteSystem__Group_2__1__Impl )
            // InternalMSL.g:2748:2: rule__ConcreteSystem__Group_2__1__Impl
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
    // InternalMSL.g:2754:1: rule__ConcreteSystem__Group_2__1__Impl : ( ( rule__ConcreteSystem__Group_2_1__0 )* ) ;
    public final void rule__ConcreteSystem__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2758:1: ( ( ( rule__ConcreteSystem__Group_2_1__0 )* ) )
            // InternalMSL.g:2759:1: ( ( rule__ConcreteSystem__Group_2_1__0 )* )
            {
            // InternalMSL.g:2759:1: ( ( rule__ConcreteSystem__Group_2_1__0 )* )
            // InternalMSL.g:2760:2: ( rule__ConcreteSystem__Group_2_1__0 )*
            {
             before(grammarAccess.getConcreteSystemAccess().getGroup_2_1()); 
            // InternalMSL.g:2761:2: ( rule__ConcreteSystem__Group_2_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMSL.g:2761:3: rule__ConcreteSystem__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ConcreteSystem__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMSL.g:2770:1: rule__ConcreteSystem__Group_2_1__0 : rule__ConcreteSystem__Group_2_1__0__Impl rule__ConcreteSystem__Group_2_1__1 ;
    public final void rule__ConcreteSystem__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2774:1: ( rule__ConcreteSystem__Group_2_1__0__Impl rule__ConcreteSystem__Group_2_1__1 )
            // InternalMSL.g:2775:2: rule__ConcreteSystem__Group_2_1__0__Impl rule__ConcreteSystem__Group_2_1__1
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
    // InternalMSL.g:2782:1: rule__ConcreteSystem__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ConcreteSystem__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2786:1: ( ( ',' ) )
            // InternalMSL.g:2787:1: ( ',' )
            {
            // InternalMSL.g:2787:1: ( ',' )
            // InternalMSL.g:2788:2: ','
            {
             before(grammarAccess.getConcreteSystemAccess().getCommaKeyword_2_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMSL.g:2797:1: rule__ConcreteSystem__Group_2_1__1 : rule__ConcreteSystem__Group_2_1__1__Impl ;
    public final void rule__ConcreteSystem__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2801:1: ( rule__ConcreteSystem__Group_2_1__1__Impl )
            // InternalMSL.g:2802:2: rule__ConcreteSystem__Group_2_1__1__Impl
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
    // InternalMSL.g:2808:1: rule__ConcreteSystem__Group_2_1__1__Impl : ( ( rule__ConcreteSystem__BindingsAssignment_2_1_1 ) ) ;
    public final void rule__ConcreteSystem__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2812:1: ( ( ( rule__ConcreteSystem__BindingsAssignment_2_1_1 ) ) )
            // InternalMSL.g:2813:1: ( ( rule__ConcreteSystem__BindingsAssignment_2_1_1 ) )
            {
            // InternalMSL.g:2813:1: ( ( rule__ConcreteSystem__BindingsAssignment_2_1_1 ) )
            // InternalMSL.g:2814:2: ( rule__ConcreteSystem__BindingsAssignment_2_1_1 )
            {
             before(grammarAccess.getConcreteSystemAccess().getBindingsAssignment_2_1_1()); 
            // InternalMSL.g:2815:2: ( rule__ConcreteSystem__BindingsAssignment_2_1_1 )
            // InternalMSL.g:2815:3: rule__ConcreteSystem__BindingsAssignment_2_1_1
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
    // InternalMSL.g:2824:1: rule__ConcreteGroup__Group__0 : rule__ConcreteGroup__Group__0__Impl rule__ConcreteGroup__Group__1 ;
    public final void rule__ConcreteGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2828:1: ( rule__ConcreteGroup__Group__0__Impl rule__ConcreteGroup__Group__1 )
            // InternalMSL.g:2829:2: rule__ConcreteGroup__Group__0__Impl rule__ConcreteGroup__Group__1
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
    // InternalMSL.g:2836:1: rule__ConcreteGroup__Group__0__Impl : ( ( rule__ConcreteGroup__NameAssignment_0 ) ) ;
    public final void rule__ConcreteGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2840:1: ( ( ( rule__ConcreteGroup__NameAssignment_0 ) ) )
            // InternalMSL.g:2841:1: ( ( rule__ConcreteGroup__NameAssignment_0 ) )
            {
            // InternalMSL.g:2841:1: ( ( rule__ConcreteGroup__NameAssignment_0 ) )
            // InternalMSL.g:2842:2: ( rule__ConcreteGroup__NameAssignment_0 )
            {
             before(grammarAccess.getConcreteGroupAccess().getNameAssignment_0()); 
            // InternalMSL.g:2843:2: ( rule__ConcreteGroup__NameAssignment_0 )
            // InternalMSL.g:2843:3: rule__ConcreteGroup__NameAssignment_0
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
    // InternalMSL.g:2851:1: rule__ConcreteGroup__Group__1 : rule__ConcreteGroup__Group__1__Impl rule__ConcreteGroup__Group__2 ;
    public final void rule__ConcreteGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2855:1: ( rule__ConcreteGroup__Group__1__Impl rule__ConcreteGroup__Group__2 )
            // InternalMSL.g:2856:2: rule__ConcreteGroup__Group__1__Impl rule__ConcreteGroup__Group__2
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
    // InternalMSL.g:2863:1: rule__ConcreteGroup__Group__1__Impl : ( ':' ) ;
    public final void rule__ConcreteGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2867:1: ( ( ':' ) )
            // InternalMSL.g:2868:1: ( ':' )
            {
            // InternalMSL.g:2868:1: ( ':' )
            // InternalMSL.g:2869:2: ':'
            {
             before(grammarAccess.getConcreteGroupAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMSL.g:2878:1: rule__ConcreteGroup__Group__2 : rule__ConcreteGroup__Group__2__Impl rule__ConcreteGroup__Group__3 ;
    public final void rule__ConcreteGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2882:1: ( rule__ConcreteGroup__Group__2__Impl rule__ConcreteGroup__Group__3 )
            // InternalMSL.g:2883:2: rule__ConcreteGroup__Group__2__Impl rule__ConcreteGroup__Group__3
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
    // InternalMSL.g:2890:1: rule__ConcreteGroup__Group__2__Impl : ( ( rule__ConcreteGroup__Group_2__0 ) ) ;
    public final void rule__ConcreteGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2894:1: ( ( ( rule__ConcreteGroup__Group_2__0 ) ) )
            // InternalMSL.g:2895:1: ( ( rule__ConcreteGroup__Group_2__0 ) )
            {
            // InternalMSL.g:2895:1: ( ( rule__ConcreteGroup__Group_2__0 ) )
            // InternalMSL.g:2896:2: ( rule__ConcreteGroup__Group_2__0 )
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup_2()); 
            // InternalMSL.g:2897:2: ( rule__ConcreteGroup__Group_2__0 )
            // InternalMSL.g:2897:3: rule__ConcreteGroup__Group_2__0
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
    // InternalMSL.g:2905:1: rule__ConcreteGroup__Group__3 : rule__ConcreteGroup__Group__3__Impl rule__ConcreteGroup__Group__4 ;
    public final void rule__ConcreteGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2909:1: ( rule__ConcreteGroup__Group__3__Impl rule__ConcreteGroup__Group__4 )
            // InternalMSL.g:2910:2: rule__ConcreteGroup__Group__3__Impl rule__ConcreteGroup__Group__4
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
    // InternalMSL.g:2917:1: rule__ConcreteGroup__Group__3__Impl : ( '{' ) ;
    public final void rule__ConcreteGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2921:1: ( ( '{' ) )
            // InternalMSL.g:2922:1: ( '{' )
            {
            // InternalMSL.g:2922:1: ( '{' )
            // InternalMSL.g:2923:2: '{'
            {
             before(grammarAccess.getConcreteGroupAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMSL.g:2932:1: rule__ConcreteGroup__Group__4 : rule__ConcreteGroup__Group__4__Impl rule__ConcreteGroup__Group__5 ;
    public final void rule__ConcreteGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2936:1: ( rule__ConcreteGroup__Group__4__Impl rule__ConcreteGroup__Group__5 )
            // InternalMSL.g:2937:2: rule__ConcreteGroup__Group__4__Impl rule__ConcreteGroup__Group__5
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
    // InternalMSL.g:2944:1: rule__ConcreteGroup__Group__4__Impl : ( ( rule__ConcreteGroup__Group_4__0 )? ) ;
    public final void rule__ConcreteGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2948:1: ( ( ( rule__ConcreteGroup__Group_4__0 )? ) )
            // InternalMSL.g:2949:1: ( ( rule__ConcreteGroup__Group_4__0 )? )
            {
            // InternalMSL.g:2949:1: ( ( rule__ConcreteGroup__Group_4__0 )? )
            // InternalMSL.g:2950:2: ( rule__ConcreteGroup__Group_4__0 )?
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup_4()); 
            // InternalMSL.g:2951:2: ( rule__ConcreteGroup__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMSL.g:2951:3: rule__ConcreteGroup__Group_4__0
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
    // InternalMSL.g:2959:1: rule__ConcreteGroup__Group__5 : rule__ConcreteGroup__Group__5__Impl rule__ConcreteGroup__Group__6 ;
    public final void rule__ConcreteGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2963:1: ( rule__ConcreteGroup__Group__5__Impl rule__ConcreteGroup__Group__6 )
            // InternalMSL.g:2964:2: rule__ConcreteGroup__Group__5__Impl rule__ConcreteGroup__Group__6
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
    // InternalMSL.g:2971:1: rule__ConcreteGroup__Group__5__Impl : ( ( rule__ConcreteGroup__Group_5__0 )? ) ;
    public final void rule__ConcreteGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2975:1: ( ( ( rule__ConcreteGroup__Group_5__0 )? ) )
            // InternalMSL.g:2976:1: ( ( rule__ConcreteGroup__Group_5__0 )? )
            {
            // InternalMSL.g:2976:1: ( ( rule__ConcreteGroup__Group_5__0 )? )
            // InternalMSL.g:2977:2: ( rule__ConcreteGroup__Group_5__0 )?
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup_5()); 
            // InternalMSL.g:2978:2: ( rule__ConcreteGroup__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMSL.g:2978:3: rule__ConcreteGroup__Group_5__0
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
    // InternalMSL.g:2986:1: rule__ConcreteGroup__Group__6 : rule__ConcreteGroup__Group__6__Impl rule__ConcreteGroup__Group__7 ;
    public final void rule__ConcreteGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2990:1: ( rule__ConcreteGroup__Group__6__Impl rule__ConcreteGroup__Group__7 )
            // InternalMSL.g:2991:2: rule__ConcreteGroup__Group__6__Impl rule__ConcreteGroup__Group__7
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
    // InternalMSL.g:2998:1: rule__ConcreteGroup__Group__6__Impl : ( 'components' ) ;
    public final void rule__ConcreteGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3002:1: ( ( 'components' ) )
            // InternalMSL.g:3003:1: ( 'components' )
            {
            // InternalMSL.g:3003:1: ( 'components' )
            // InternalMSL.g:3004:2: 'components'
            {
             before(grammarAccess.getConcreteGroupAccess().getComponentsKeyword_6()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMSL.g:3013:1: rule__ConcreteGroup__Group__7 : rule__ConcreteGroup__Group__7__Impl rule__ConcreteGroup__Group__8 ;
    public final void rule__ConcreteGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3017:1: ( rule__ConcreteGroup__Group__7__Impl rule__ConcreteGroup__Group__8 )
            // InternalMSL.g:3018:2: rule__ConcreteGroup__Group__7__Impl rule__ConcreteGroup__Group__8
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
    // InternalMSL.g:3025:1: rule__ConcreteGroup__Group__7__Impl : ( ( rule__ConcreteGroup__ComponentsAssignment_7 ) ) ;
    public final void rule__ConcreteGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3029:1: ( ( ( rule__ConcreteGroup__ComponentsAssignment_7 ) ) )
            // InternalMSL.g:3030:1: ( ( rule__ConcreteGroup__ComponentsAssignment_7 ) )
            {
            // InternalMSL.g:3030:1: ( ( rule__ConcreteGroup__ComponentsAssignment_7 ) )
            // InternalMSL.g:3031:2: ( rule__ConcreteGroup__ComponentsAssignment_7 )
            {
             before(grammarAccess.getConcreteGroupAccess().getComponentsAssignment_7()); 
            // InternalMSL.g:3032:2: ( rule__ConcreteGroup__ComponentsAssignment_7 )
            // InternalMSL.g:3032:3: rule__ConcreteGroup__ComponentsAssignment_7
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
    // InternalMSL.g:3040:1: rule__ConcreteGroup__Group__8 : rule__ConcreteGroup__Group__8__Impl rule__ConcreteGroup__Group__9 ;
    public final void rule__ConcreteGroup__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3044:1: ( rule__ConcreteGroup__Group__8__Impl rule__ConcreteGroup__Group__9 )
            // InternalMSL.g:3045:2: rule__ConcreteGroup__Group__8__Impl rule__ConcreteGroup__Group__9
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
    // InternalMSL.g:3052:1: rule__ConcreteGroup__Group__8__Impl : ( ( rule__ConcreteGroup__Group_8__0 )* ) ;
    public final void rule__ConcreteGroup__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3056:1: ( ( ( rule__ConcreteGroup__Group_8__0 )* ) )
            // InternalMSL.g:3057:1: ( ( rule__ConcreteGroup__Group_8__0 )* )
            {
            // InternalMSL.g:3057:1: ( ( rule__ConcreteGroup__Group_8__0 )* )
            // InternalMSL.g:3058:2: ( rule__ConcreteGroup__Group_8__0 )*
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup_8()); 
            // InternalMSL.g:3059:2: ( rule__ConcreteGroup__Group_8__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==30) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMSL.g:3059:3: rule__ConcreteGroup__Group_8__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ConcreteGroup__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalMSL.g:3067:1: rule__ConcreteGroup__Group__9 : rule__ConcreteGroup__Group__9__Impl ;
    public final void rule__ConcreteGroup__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3071:1: ( rule__ConcreteGroup__Group__9__Impl )
            // InternalMSL.g:3072:2: rule__ConcreteGroup__Group__9__Impl
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
    // InternalMSL.g:3078:1: rule__ConcreteGroup__Group__9__Impl : ( '}' ) ;
    public final void rule__ConcreteGroup__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3082:1: ( ( '}' ) )
            // InternalMSL.g:3083:1: ( '}' )
            {
            // InternalMSL.g:3083:1: ( '}' )
            // InternalMSL.g:3084:2: '}'
            {
             before(grammarAccess.getConcreteGroupAccess().getRightCurlyBracketKeyword_9()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMSL.g:3094:1: rule__ConcreteGroup__Group_2__0 : rule__ConcreteGroup__Group_2__0__Impl rule__ConcreteGroup__Group_2__1 ;
    public final void rule__ConcreteGroup__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3098:1: ( rule__ConcreteGroup__Group_2__0__Impl rule__ConcreteGroup__Group_2__1 )
            // InternalMSL.g:3099:2: rule__ConcreteGroup__Group_2__0__Impl rule__ConcreteGroup__Group_2__1
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
    // InternalMSL.g:3106:1: rule__ConcreteGroup__Group_2__0__Impl : ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_0 ) ) ;
    public final void rule__ConcreteGroup__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3110:1: ( ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_0 ) ) )
            // InternalMSL.g:3111:1: ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_0 ) )
            {
            // InternalMSL.g:3111:1: ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_0 ) )
            // InternalMSL.g:3112:2: ( rule__ConcreteGroup__AbstractGroupsAssignment_2_0 )
            {
             before(grammarAccess.getConcreteGroupAccess().getAbstractGroupsAssignment_2_0()); 
            // InternalMSL.g:3113:2: ( rule__ConcreteGroup__AbstractGroupsAssignment_2_0 )
            // InternalMSL.g:3113:3: rule__ConcreteGroup__AbstractGroupsAssignment_2_0
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
    // InternalMSL.g:3121:1: rule__ConcreteGroup__Group_2__1 : rule__ConcreteGroup__Group_2__1__Impl ;
    public final void rule__ConcreteGroup__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3125:1: ( rule__ConcreteGroup__Group_2__1__Impl )
            // InternalMSL.g:3126:2: rule__ConcreteGroup__Group_2__1__Impl
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
    // InternalMSL.g:3132:1: rule__ConcreteGroup__Group_2__1__Impl : ( ( rule__ConcreteGroup__Group_2_1__0 )* ) ;
    public final void rule__ConcreteGroup__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3136:1: ( ( ( rule__ConcreteGroup__Group_2_1__0 )* ) )
            // InternalMSL.g:3137:1: ( ( rule__ConcreteGroup__Group_2_1__0 )* )
            {
            // InternalMSL.g:3137:1: ( ( rule__ConcreteGroup__Group_2_1__0 )* )
            // InternalMSL.g:3138:2: ( rule__ConcreteGroup__Group_2_1__0 )*
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup_2_1()); 
            // InternalMSL.g:3139:2: ( rule__ConcreteGroup__Group_2_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==30) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMSL.g:3139:3: rule__ConcreteGroup__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ConcreteGroup__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalMSL.g:3148:1: rule__ConcreteGroup__Group_2_1__0 : rule__ConcreteGroup__Group_2_1__0__Impl rule__ConcreteGroup__Group_2_1__1 ;
    public final void rule__ConcreteGroup__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3152:1: ( rule__ConcreteGroup__Group_2_1__0__Impl rule__ConcreteGroup__Group_2_1__1 )
            // InternalMSL.g:3153:2: rule__ConcreteGroup__Group_2_1__0__Impl rule__ConcreteGroup__Group_2_1__1
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
    // InternalMSL.g:3160:1: rule__ConcreteGroup__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ConcreteGroup__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3164:1: ( ( ',' ) )
            // InternalMSL.g:3165:1: ( ',' )
            {
            // InternalMSL.g:3165:1: ( ',' )
            // InternalMSL.g:3166:2: ','
            {
             before(grammarAccess.getConcreteGroupAccess().getCommaKeyword_2_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMSL.g:3175:1: rule__ConcreteGroup__Group_2_1__1 : rule__ConcreteGroup__Group_2_1__1__Impl ;
    public final void rule__ConcreteGroup__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3179:1: ( rule__ConcreteGroup__Group_2_1__1__Impl )
            // InternalMSL.g:3180:2: rule__ConcreteGroup__Group_2_1__1__Impl
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
    // InternalMSL.g:3186:1: rule__ConcreteGroup__Group_2_1__1__Impl : ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 ) ) ;
    public final void rule__ConcreteGroup__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3190:1: ( ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 ) ) )
            // InternalMSL.g:3191:1: ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 ) )
            {
            // InternalMSL.g:3191:1: ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 ) )
            // InternalMSL.g:3192:2: ( rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 )
            {
             before(grammarAccess.getConcreteGroupAccess().getAbstractGroupsAssignment_2_1_1()); 
            // InternalMSL.g:3193:2: ( rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 )
            // InternalMSL.g:3193:3: rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1
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
    // InternalMSL.g:3202:1: rule__ConcreteGroup__Group_4__0 : rule__ConcreteGroup__Group_4__0__Impl rule__ConcreteGroup__Group_4__1 ;
    public final void rule__ConcreteGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3206:1: ( rule__ConcreteGroup__Group_4__0__Impl rule__ConcreteGroup__Group_4__1 )
            // InternalMSL.g:3207:2: rule__ConcreteGroup__Group_4__0__Impl rule__ConcreteGroup__Group_4__1
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
    // InternalMSL.g:3214:1: rule__ConcreteGroup__Group_4__0__Impl : ( 'managedSyS' ) ;
    public final void rule__ConcreteGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3218:1: ( ( 'managedSyS' ) )
            // InternalMSL.g:3219:1: ( 'managedSyS' )
            {
            // InternalMSL.g:3219:1: ( 'managedSyS' )
            // InternalMSL.g:3220:2: 'managedSyS'
            {
             before(grammarAccess.getConcreteGroupAccess().getManagedSySKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMSL.g:3229:1: rule__ConcreteGroup__Group_4__1 : rule__ConcreteGroup__Group_4__1__Impl ;
    public final void rule__ConcreteGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3233:1: ( rule__ConcreteGroup__Group_4__1__Impl )
            // InternalMSL.g:3234:2: rule__ConcreteGroup__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteGroup__Group_4__1__Impl();

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
    // InternalMSL.g:3240:1: rule__ConcreteGroup__Group_4__1__Impl : ( ( rule__ConcreteGroup__ManSysAssignment_4_1 ) ) ;
    public final void rule__ConcreteGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3244:1: ( ( ( rule__ConcreteGroup__ManSysAssignment_4_1 ) ) )
            // InternalMSL.g:3245:1: ( ( rule__ConcreteGroup__ManSysAssignment_4_1 ) )
            {
            // InternalMSL.g:3245:1: ( ( rule__ConcreteGroup__ManSysAssignment_4_1 ) )
            // InternalMSL.g:3246:2: ( rule__ConcreteGroup__ManSysAssignment_4_1 )
            {
             before(grammarAccess.getConcreteGroupAccess().getManSysAssignment_4_1()); 
            // InternalMSL.g:3247:2: ( rule__ConcreteGroup__ManSysAssignment_4_1 )
            // InternalMSL.g:3247:3: rule__ConcreteGroup__ManSysAssignment_4_1
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


    // $ANTLR start "rule__ConcreteGroup__Group_5__0"
    // InternalMSL.g:3256:1: rule__ConcreteGroup__Group_5__0 : rule__ConcreteGroup__Group_5__0__Impl rule__ConcreteGroup__Group_5__1 ;
    public final void rule__ConcreteGroup__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3260:1: ( rule__ConcreteGroup__Group_5__0__Impl rule__ConcreteGroup__Group_5__1 )
            // InternalMSL.g:3261:2: rule__ConcreteGroup__Group_5__0__Impl rule__ConcreteGroup__Group_5__1
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
    // InternalMSL.g:3268:1: rule__ConcreteGroup__Group_5__0__Impl : ( 'managedGrp' ) ;
    public final void rule__ConcreteGroup__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3272:1: ( ( 'managedGrp' ) )
            // InternalMSL.g:3273:1: ( 'managedGrp' )
            {
            // InternalMSL.g:3273:1: ( 'managedGrp' )
            // InternalMSL.g:3274:2: 'managedGrp'
            {
             before(grammarAccess.getConcreteGroupAccess().getManagedGrpKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMSL.g:3283:1: rule__ConcreteGroup__Group_5__1 : rule__ConcreteGroup__Group_5__1__Impl rule__ConcreteGroup__Group_5__2 ;
    public final void rule__ConcreteGroup__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3287:1: ( rule__ConcreteGroup__Group_5__1__Impl rule__ConcreteGroup__Group_5__2 )
            // InternalMSL.g:3288:2: rule__ConcreteGroup__Group_5__1__Impl rule__ConcreteGroup__Group_5__2
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
    // InternalMSL.g:3295:1: rule__ConcreteGroup__Group_5__1__Impl : ( ( rule__ConcreteGroup__ManGrpAssignment_5_1 ) ) ;
    public final void rule__ConcreteGroup__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3299:1: ( ( ( rule__ConcreteGroup__ManGrpAssignment_5_1 ) ) )
            // InternalMSL.g:3300:1: ( ( rule__ConcreteGroup__ManGrpAssignment_5_1 ) )
            {
            // InternalMSL.g:3300:1: ( ( rule__ConcreteGroup__ManGrpAssignment_5_1 ) )
            // InternalMSL.g:3301:2: ( rule__ConcreteGroup__ManGrpAssignment_5_1 )
            {
             before(grammarAccess.getConcreteGroupAccess().getManGrpAssignment_5_1()); 
            // InternalMSL.g:3302:2: ( rule__ConcreteGroup__ManGrpAssignment_5_1 )
            // InternalMSL.g:3302:3: rule__ConcreteGroup__ManGrpAssignment_5_1
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
    // InternalMSL.g:3310:1: rule__ConcreteGroup__Group_5__2 : rule__ConcreteGroup__Group_5__2__Impl ;
    public final void rule__ConcreteGroup__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3314:1: ( rule__ConcreteGroup__Group_5__2__Impl )
            // InternalMSL.g:3315:2: rule__ConcreteGroup__Group_5__2__Impl
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
    // InternalMSL.g:3321:1: rule__ConcreteGroup__Group_5__2__Impl : ( ( rule__ConcreteGroup__Group_5_2__0 )* ) ;
    public final void rule__ConcreteGroup__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3325:1: ( ( ( rule__ConcreteGroup__Group_5_2__0 )* ) )
            // InternalMSL.g:3326:1: ( ( rule__ConcreteGroup__Group_5_2__0 )* )
            {
            // InternalMSL.g:3326:1: ( ( rule__ConcreteGroup__Group_5_2__0 )* )
            // InternalMSL.g:3327:2: ( rule__ConcreteGroup__Group_5_2__0 )*
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup_5_2()); 
            // InternalMSL.g:3328:2: ( rule__ConcreteGroup__Group_5_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==30) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMSL.g:3328:3: rule__ConcreteGroup__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ConcreteGroup__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalMSL.g:3337:1: rule__ConcreteGroup__Group_5_2__0 : rule__ConcreteGroup__Group_5_2__0__Impl rule__ConcreteGroup__Group_5_2__1 ;
    public final void rule__ConcreteGroup__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3341:1: ( rule__ConcreteGroup__Group_5_2__0__Impl rule__ConcreteGroup__Group_5_2__1 )
            // InternalMSL.g:3342:2: rule__ConcreteGroup__Group_5_2__0__Impl rule__ConcreteGroup__Group_5_2__1
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
    // InternalMSL.g:3349:1: rule__ConcreteGroup__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__ConcreteGroup__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3353:1: ( ( ',' ) )
            // InternalMSL.g:3354:1: ( ',' )
            {
            // InternalMSL.g:3354:1: ( ',' )
            // InternalMSL.g:3355:2: ','
            {
             before(grammarAccess.getConcreteGroupAccess().getCommaKeyword_5_2_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMSL.g:3364:1: rule__ConcreteGroup__Group_5_2__1 : rule__ConcreteGroup__Group_5_2__1__Impl ;
    public final void rule__ConcreteGroup__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3368:1: ( rule__ConcreteGroup__Group_5_2__1__Impl )
            // InternalMSL.g:3369:2: rule__ConcreteGroup__Group_5_2__1__Impl
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
    // InternalMSL.g:3375:1: rule__ConcreteGroup__Group_5_2__1__Impl : ( ( rule__ConcreteGroup__ManGrpAssignment_5_2_1 ) ) ;
    public final void rule__ConcreteGroup__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3379:1: ( ( ( rule__ConcreteGroup__ManGrpAssignment_5_2_1 ) ) )
            // InternalMSL.g:3380:1: ( ( rule__ConcreteGroup__ManGrpAssignment_5_2_1 ) )
            {
            // InternalMSL.g:3380:1: ( ( rule__ConcreteGroup__ManGrpAssignment_5_2_1 ) )
            // InternalMSL.g:3381:2: ( rule__ConcreteGroup__ManGrpAssignment_5_2_1 )
            {
             before(grammarAccess.getConcreteGroupAccess().getManGrpAssignment_5_2_1()); 
            // InternalMSL.g:3382:2: ( rule__ConcreteGroup__ManGrpAssignment_5_2_1 )
            // InternalMSL.g:3382:3: rule__ConcreteGroup__ManGrpAssignment_5_2_1
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
    // InternalMSL.g:3391:1: rule__ConcreteGroup__Group_8__0 : rule__ConcreteGroup__Group_8__0__Impl rule__ConcreteGroup__Group_8__1 ;
    public final void rule__ConcreteGroup__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3395:1: ( rule__ConcreteGroup__Group_8__0__Impl rule__ConcreteGroup__Group_8__1 )
            // InternalMSL.g:3396:2: rule__ConcreteGroup__Group_8__0__Impl rule__ConcreteGroup__Group_8__1
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
    // InternalMSL.g:3403:1: rule__ConcreteGroup__Group_8__0__Impl : ( ',' ) ;
    public final void rule__ConcreteGroup__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3407:1: ( ( ',' ) )
            // InternalMSL.g:3408:1: ( ',' )
            {
            // InternalMSL.g:3408:1: ( ',' )
            // InternalMSL.g:3409:2: ','
            {
             before(grammarAccess.getConcreteGroupAccess().getCommaKeyword_8_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMSL.g:3418:1: rule__ConcreteGroup__Group_8__1 : rule__ConcreteGroup__Group_8__1__Impl ;
    public final void rule__ConcreteGroup__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3422:1: ( rule__ConcreteGroup__Group_8__1__Impl )
            // InternalMSL.g:3423:2: rule__ConcreteGroup__Group_8__1__Impl
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
    // InternalMSL.g:3429:1: rule__ConcreteGroup__Group_8__1__Impl : ( ( rule__ConcreteGroup__ComponentsAssignment_8_1 ) ) ;
    public final void rule__ConcreteGroup__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3433:1: ( ( ( rule__ConcreteGroup__ComponentsAssignment_8_1 ) ) )
            // InternalMSL.g:3434:1: ( ( rule__ConcreteGroup__ComponentsAssignment_8_1 ) )
            {
            // InternalMSL.g:3434:1: ( ( rule__ConcreteGroup__ComponentsAssignment_8_1 ) )
            // InternalMSL.g:3435:2: ( rule__ConcreteGroup__ComponentsAssignment_8_1 )
            {
             before(grammarAccess.getConcreteGroupAccess().getComponentsAssignment_8_1()); 
            // InternalMSL.g:3436:2: ( rule__ConcreteGroup__ComponentsAssignment_8_1 )
            // InternalMSL.g:3436:3: rule__ConcreteGroup__ComponentsAssignment_8_1
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


    // $ANTLR start "rule__ComponentInstance__Group__0"
    // InternalMSL.g:3445:1: rule__ComponentInstance__Group__0 : rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 ;
    public final void rule__ComponentInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3449:1: ( rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 )
            // InternalMSL.g:3450:2: rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1
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
    // InternalMSL.g:3457:1: rule__ComponentInstance__Group__0__Impl : ( ( rule__ComponentInstance__NameAssignment_0 ) ) ;
    public final void rule__ComponentInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3461:1: ( ( ( rule__ComponentInstance__NameAssignment_0 ) ) )
            // InternalMSL.g:3462:1: ( ( rule__ComponentInstance__NameAssignment_0 ) )
            {
            // InternalMSL.g:3462:1: ( ( rule__ComponentInstance__NameAssignment_0 ) )
            // InternalMSL.g:3463:2: ( rule__ComponentInstance__NameAssignment_0 )
            {
             before(grammarAccess.getComponentInstanceAccess().getNameAssignment_0()); 
            // InternalMSL.g:3464:2: ( rule__ComponentInstance__NameAssignment_0 )
            // InternalMSL.g:3464:3: rule__ComponentInstance__NameAssignment_0
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
    // InternalMSL.g:3472:1: rule__ComponentInstance__Group__1 : rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 ;
    public final void rule__ComponentInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3476:1: ( rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 )
            // InternalMSL.g:3477:2: rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2
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
    // InternalMSL.g:3484:1: rule__ComponentInstance__Group__1__Impl : ( ':' ) ;
    public final void rule__ComponentInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3488:1: ( ( ':' ) )
            // InternalMSL.g:3489:1: ( ':' )
            {
            // InternalMSL.g:3489:1: ( ':' )
            // InternalMSL.g:3490:2: ':'
            {
             before(grammarAccess.getComponentInstanceAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMSL.g:3499:1: rule__ComponentInstance__Group__2 : rule__ComponentInstance__Group__2__Impl ;
    public final void rule__ComponentInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3503:1: ( rule__ComponentInstance__Group__2__Impl )
            // InternalMSL.g:3504:2: rule__ComponentInstance__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__2__Impl();

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
    // InternalMSL.g:3510:1: rule__ComponentInstance__Group__2__Impl : ( ( rule__ComponentInstance__TypeAssignment_2 ) ) ;
    public final void rule__ComponentInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3514:1: ( ( ( rule__ComponentInstance__TypeAssignment_2 ) ) )
            // InternalMSL.g:3515:1: ( ( rule__ComponentInstance__TypeAssignment_2 ) )
            {
            // InternalMSL.g:3515:1: ( ( rule__ComponentInstance__TypeAssignment_2 ) )
            // InternalMSL.g:3516:2: ( rule__ComponentInstance__TypeAssignment_2 )
            {
             before(grammarAccess.getComponentInstanceAccess().getTypeAssignment_2()); 
            // InternalMSL.g:3517:2: ( rule__ComponentInstance__TypeAssignment_2 )
            // InternalMSL.g:3517:3: rule__ComponentInstance__TypeAssignment_2
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


    // $ANTLR start "rule__Interaction__Group__0"
    // InternalMSL.g:3526:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3530:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // InternalMSL.g:3531:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
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
    // InternalMSL.g:3538:1: rule__Interaction__Group__0__Impl : ( ( rule__Interaction__StartAssignment_0 ) ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3542:1: ( ( ( rule__Interaction__StartAssignment_0 ) ) )
            // InternalMSL.g:3543:1: ( ( rule__Interaction__StartAssignment_0 ) )
            {
            // InternalMSL.g:3543:1: ( ( rule__Interaction__StartAssignment_0 ) )
            // InternalMSL.g:3544:2: ( rule__Interaction__StartAssignment_0 )
            {
             before(grammarAccess.getInteractionAccess().getStartAssignment_0()); 
            // InternalMSL.g:3545:2: ( rule__Interaction__StartAssignment_0 )
            // InternalMSL.g:3545:3: rule__Interaction__StartAssignment_0
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
    // InternalMSL.g:3553:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3557:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // InternalMSL.g:3558:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalMSL.g:3565:1: rule__Interaction__Group__1__Impl : ( '->' ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3569:1: ( ( '->' ) )
            // InternalMSL.g:3570:1: ( '->' )
            {
            // InternalMSL.g:3570:1: ( '->' )
            // InternalMSL.g:3571:2: '->'
            {
             before(grammarAccess.getInteractionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMSL.g:3580:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3584:1: ( rule__Interaction__Group__2__Impl )
            // InternalMSL.g:3585:2: rule__Interaction__Group__2__Impl
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
    // InternalMSL.g:3591:1: rule__Interaction__Group__2__Impl : ( ( rule__Interaction__EndAssignment_2 ) ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3595:1: ( ( ( rule__Interaction__EndAssignment_2 ) ) )
            // InternalMSL.g:3596:1: ( ( rule__Interaction__EndAssignment_2 ) )
            {
            // InternalMSL.g:3596:1: ( ( rule__Interaction__EndAssignment_2 ) )
            // InternalMSL.g:3597:2: ( rule__Interaction__EndAssignment_2 )
            {
             before(grammarAccess.getInteractionAccess().getEndAssignment_2()); 
            // InternalMSL.g:3598:2: ( rule__Interaction__EndAssignment_2 )
            // InternalMSL.g:3598:3: rule__Interaction__EndAssignment_2
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
    // InternalMSL.g:3607:1: rule__Specification__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Specification__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3611:1: ( ( ruleImport ) )
            // InternalMSL.g:3612:2: ( ruleImport )
            {
            // InternalMSL.g:3612:2: ( ruleImport )
            // InternalMSL.g:3613:3: ruleImport
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
    // InternalMSL.g:3622:1: rule__Specification__AbsPatternAssignment_1 : ( ruleAbstractPattern ) ;
    public final void rule__Specification__AbsPatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3626:1: ( ( ruleAbstractPattern ) )
            // InternalMSL.g:3627:2: ( ruleAbstractPattern )
            {
            // InternalMSL.g:3627:2: ( ruleAbstractPattern )
            // InternalMSL.g:3628:3: ruleAbstractPattern
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
    // InternalMSL.g:3637:1: rule__Specification__PatternAssignment_2 : ( rulePattern ) ;
    public final void rule__Specification__PatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3641:1: ( ( rulePattern ) )
            // InternalMSL.g:3642:2: ( rulePattern )
            {
            // InternalMSL.g:3642:2: ( rulePattern )
            // InternalMSL.g:3643:3: rulePattern
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
    // InternalMSL.g:3652:1: rule__Specification__ConfigurationAssignment_3 : ( ruleConfiguration ) ;
    public final void rule__Specification__ConfigurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3656:1: ( ( ruleConfiguration ) )
            // InternalMSL.g:3657:2: ( ruleConfiguration )
            {
            // InternalMSL.g:3657:2: ( ruleConfiguration )
            // InternalMSL.g:3658:3: ruleConfiguration
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
    // InternalMSL.g:3667:1: rule__Import__ImportedNamespaceAssignment_1 : ( ( RULE_PATTERN_ID ) ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3671:1: ( ( ( RULE_PATTERN_ID ) ) )
            // InternalMSL.g:3672:2: ( ( RULE_PATTERN_ID ) )
            {
            // InternalMSL.g:3672:2: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:3673:3: ( RULE_PATTERN_ID )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAbstractPatternCrossReference_1_0()); 
            // InternalMSL.g:3674:3: ( RULE_PATTERN_ID )
            // InternalMSL.g:3675:4: RULE_PATTERN_ID
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
    // InternalMSL.g:3686:1: rule__AbstractPattern__NameAssignment_2 : ( RULE_PATTERN_ID ) ;
    public final void rule__AbstractPattern__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3690:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:3691:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:3691:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:3692:3: RULE_PATTERN_ID
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
    // InternalMSL.g:3701:1: rule__AbstractPattern__ManagedSystemsAssignment_4 : ( ruleAbstractSystem ) ;
    public final void rule__AbstractPattern__ManagedSystemsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3705:1: ( ( ruleAbstractSystem ) )
            // InternalMSL.g:3706:2: ( ruleAbstractSystem )
            {
            // InternalMSL.g:3706:2: ( ruleAbstractSystem )
            // InternalMSL.g:3707:3: ruleAbstractSystem
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
    // InternalMSL.g:3716:1: rule__AbstractPattern__AbstractGroupsAssignment_5 : ( ruleAbstractGroup ) ;
    public final void rule__AbstractPattern__AbstractGroupsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3720:1: ( ( ruleAbstractGroup ) )
            // InternalMSL.g:3721:2: ( ruleAbstractGroup )
            {
            // InternalMSL.g:3721:2: ( ruleAbstractGroup )
            // InternalMSL.g:3722:3: ruleAbstractGroup
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
    // InternalMSL.g:3731:1: rule__AbstractPattern__InteractionsAssignment_6 : ( ruleAbstractInteraction ) ;
    public final void rule__AbstractPattern__InteractionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3735:1: ( ( ruleAbstractInteraction ) )
            // InternalMSL.g:3736:2: ( ruleAbstractInteraction )
            {
            // InternalMSL.g:3736:2: ( ruleAbstractInteraction )
            // InternalMSL.g:3737:3: ruleAbstractInteraction
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
    // InternalMSL.g:3746:1: rule__AbstractSystem__NameAssignment_1 : ( RULE_PATTERN_ID ) ;
    public final void rule__AbstractSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3750:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:3751:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:3751:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:3752:3: RULE_PATTERN_ID
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
    // InternalMSL.g:3761:1: rule__AbstractComponent__NameAssignment : ( RULE_COMPONENT_TYPE ) ;
    public final void rule__AbstractComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3765:1: ( ( RULE_COMPONENT_TYPE ) )
            // InternalMSL.g:3766:2: ( RULE_COMPONENT_TYPE )
            {
            // InternalMSL.g:3766:2: ( RULE_COMPONENT_TYPE )
            // InternalMSL.g:3767:3: RULE_COMPONENT_TYPE
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
    // InternalMSL.g:3776:1: rule__GroupDef__GrpAssignment_0 : ( ( RULE_PATTERN_ID ) ) ;
    public final void rule__GroupDef__GrpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3780:1: ( ( ( RULE_PATTERN_ID ) ) )
            // InternalMSL.g:3781:2: ( ( RULE_PATTERN_ID ) )
            {
            // InternalMSL.g:3781:2: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:3782:3: ( RULE_PATTERN_ID )
            {
             before(grammarAccess.getGroupDefAccess().getGrpAbstractGroupCrossReference_0_0()); 
            // InternalMSL.g:3783:3: ( RULE_PATTERN_ID )
            // InternalMSL.g:3784:4: RULE_PATTERN_ID
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
    // InternalMSL.g:3795:1: rule__GroupDef__MultAssignment_1_1 : ( RULE_MULTIPLICITY ) ;
    public final void rule__GroupDef__MultAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3799:1: ( ( RULE_MULTIPLICITY ) )
            // InternalMSL.g:3800:2: ( RULE_MULTIPLICITY )
            {
            // InternalMSL.g:3800:2: ( RULE_MULTIPLICITY )
            // InternalMSL.g:3801:3: RULE_MULTIPLICITY
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
    // InternalMSL.g:3810:1: rule__AbstractGroup__NameAssignment_1 : ( RULE_PATTERN_ID ) ;
    public final void rule__AbstractGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3814:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:3815:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:3815:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:3816:3: RULE_PATTERN_ID
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
    // InternalMSL.g:3825:1: rule__AbstractGroup__ManSysAssignment_3_1 : ( ( RULE_PATTERN_ID ) ) ;
    public final void rule__AbstractGroup__ManSysAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3829:1: ( ( ( RULE_PATTERN_ID ) ) )
            // InternalMSL.g:3830:2: ( ( RULE_PATTERN_ID ) )
            {
            // InternalMSL.g:3830:2: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:3831:3: ( RULE_PATTERN_ID )
            {
             before(grammarAccess.getAbstractGroupAccess().getManSysAbstractSystemCrossReference_3_1_0()); 
            // InternalMSL.g:3832:3: ( RULE_PATTERN_ID )
            // InternalMSL.g:3833:4: RULE_PATTERN_ID
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
    // InternalMSL.g:3844:1: rule__AbstractGroup__ManGrpAssignment_4_1 : ( ruleGroupDef ) ;
    public final void rule__AbstractGroup__ManGrpAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3848:1: ( ( ruleGroupDef ) )
            // InternalMSL.g:3849:2: ( ruleGroupDef )
            {
            // InternalMSL.g:3849:2: ( ruleGroupDef )
            // InternalMSL.g:3850:3: ruleGroupDef
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
    // InternalMSL.g:3859:1: rule__AbstractGroup__ManGrpAssignment_4_2_1 : ( ruleGroupDef ) ;
    public final void rule__AbstractGroup__ManGrpAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3863:1: ( ( ruleGroupDef ) )
            // InternalMSL.g:3864:2: ( ruleGroupDef )
            {
            // InternalMSL.g:3864:2: ( ruleGroupDef )
            // InternalMSL.g:3865:3: ruleGroupDef
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
    // InternalMSL.g:3874:1: rule__AbstractGroup__ComponentsAssignment_6 : ( ruleAbstractComponent ) ;
    public final void rule__AbstractGroup__ComponentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3878:1: ( ( ruleAbstractComponent ) )
            // InternalMSL.g:3879:2: ( ruleAbstractComponent )
            {
            // InternalMSL.g:3879:2: ( ruleAbstractComponent )
            // InternalMSL.g:3880:3: ruleAbstractComponent
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
    // InternalMSL.g:3889:1: rule__AbstractGroup__ComponentsAssignment_7_1 : ( ruleAbstractComponent ) ;
    public final void rule__AbstractGroup__ComponentsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3893:1: ( ( ruleAbstractComponent ) )
            // InternalMSL.g:3894:2: ( ruleAbstractComponent )
            {
            // InternalMSL.g:3894:2: ( ruleAbstractComponent )
            // InternalMSL.g:3895:3: ruleAbstractComponent
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
    // InternalMSL.g:3904:1: rule__AbstractInteraction__StartAssignment_1 : ( ruleAbstractComponentName ) ;
    public final void rule__AbstractInteraction__StartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3908:1: ( ( ruleAbstractComponentName ) )
            // InternalMSL.g:3909:2: ( ruleAbstractComponentName )
            {
            // InternalMSL.g:3909:2: ( ruleAbstractComponentName )
            // InternalMSL.g:3910:3: ruleAbstractComponentName
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
    // InternalMSL.g:3919:1: rule__AbstractInteraction__EndAssignment_3 : ( ruleAbstractComponentName ) ;
    public final void rule__AbstractInteraction__EndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3923:1: ( ( ruleAbstractComponentName ) )
            // InternalMSL.g:3924:2: ( ruleAbstractComponentName )
            {
            // InternalMSL.g:3924:2: ( ruleAbstractComponentName )
            // InternalMSL.g:3925:3: ruleAbstractComponentName
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
    // InternalMSL.g:3934:1: rule__AbstractInteraction__LowAssignment_4_1 : ( RULE_MULTIPLICITY ) ;
    public final void rule__AbstractInteraction__LowAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3938:1: ( ( RULE_MULTIPLICITY ) )
            // InternalMSL.g:3939:2: ( RULE_MULTIPLICITY )
            {
            // InternalMSL.g:3939:2: ( RULE_MULTIPLICITY )
            // InternalMSL.g:3940:3: RULE_MULTIPLICITY
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
    // InternalMSL.g:3949:1: rule__AbstractInteraction__HighAssignment_4_3 : ( RULE_MULTIPLICITY ) ;
    public final void rule__AbstractInteraction__HighAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3953:1: ( ( RULE_MULTIPLICITY ) )
            // InternalMSL.g:3954:2: ( RULE_MULTIPLICITY )
            {
            // InternalMSL.g:3954:2: ( RULE_MULTIPLICITY )
            // InternalMSL.g:3955:3: RULE_MULTIPLICITY
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
    // InternalMSL.g:3964:1: rule__AbstractComponentName__TypeAssignment : ( ( RULE_FQN_COMPONENT ) ) ;
    public final void rule__AbstractComponentName__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3968:1: ( ( ( RULE_FQN_COMPONENT ) ) )
            // InternalMSL.g:3969:2: ( ( RULE_FQN_COMPONENT ) )
            {
            // InternalMSL.g:3969:2: ( ( RULE_FQN_COMPONENT ) )
            // InternalMSL.g:3970:3: ( RULE_FQN_COMPONENT )
            {
             before(grammarAccess.getAbstractComponentNameAccess().getTypeAbstractComponentCrossReference_0()); 
            // InternalMSL.g:3971:3: ( RULE_FQN_COMPONENT )
            // InternalMSL.g:3972:4: RULE_FQN_COMPONENT
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
    // InternalMSL.g:3983:1: rule__SystemBinding__NameAssignment_1 : ( RULE_PATTERN_ID ) ;
    public final void rule__SystemBinding__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3987:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:3988:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:3988:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:3989:3: RULE_PATTERN_ID
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
    // InternalMSL.g:3998:1: rule__SystemBinding__AbsSysAssignment_3 : ( ( RULE_FQN_PATTERN_ID ) ) ;
    public final void rule__SystemBinding__AbsSysAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4002:1: ( ( ( RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:4003:2: ( ( RULE_FQN_PATTERN_ID ) )
            {
            // InternalMSL.g:4003:2: ( ( RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:4004:3: ( RULE_FQN_PATTERN_ID )
            {
             before(grammarAccess.getSystemBindingAccess().getAbsSysAbstractSystemCrossReference_3_0()); 
            // InternalMSL.g:4005:3: ( RULE_FQN_PATTERN_ID )
            // InternalMSL.g:4006:4: RULE_FQN_PATTERN_ID
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
    // InternalMSL.g:4017:1: rule__GroupBinding__NameAssignment_1 : ( RULE_PATTERN_ID ) ;
    public final void rule__GroupBinding__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4021:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4022:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:4022:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:4023:3: RULE_PATTERN_ID
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
    // InternalMSL.g:4032:1: rule__GroupBinding__AbsGroupAssignment_3 : ( ( RULE_FQN_PATTERN_ID ) ) ;
    public final void rule__GroupBinding__AbsGroupAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4036:1: ( ( ( RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:4037:2: ( ( RULE_FQN_PATTERN_ID ) )
            {
            // InternalMSL.g:4037:2: ( ( RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:4038:3: ( RULE_FQN_PATTERN_ID )
            {
             before(grammarAccess.getGroupBindingAccess().getAbsGroupAbstractGroupCrossReference_3_0()); 
            // InternalMSL.g:4039:3: ( RULE_FQN_PATTERN_ID )
            // InternalMSL.g:4040:4: RULE_FQN_PATTERN_ID
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
    // InternalMSL.g:4051:1: rule__Pattern__NameAssignment_2 : ( RULE_PATTERN_ID ) ;
    public final void rule__Pattern__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4055:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4056:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:4056:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:4057:3: RULE_PATTERN_ID
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
    // InternalMSL.g:4066:1: rule__Pattern__AbsPatternAssignment_4 : ( ( RULE_PATTERN_ID ) ) ;
    public final void rule__Pattern__AbsPatternAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4070:1: ( ( ( RULE_PATTERN_ID ) ) )
            // InternalMSL.g:4071:2: ( ( RULE_PATTERN_ID ) )
            {
            // InternalMSL.g:4071:2: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4072:3: ( RULE_PATTERN_ID )
            {
             before(grammarAccess.getPatternAccess().getAbsPatternAbstractPatternCrossReference_4_0()); 
            // InternalMSL.g:4073:3: ( RULE_PATTERN_ID )
            // InternalMSL.g:4074:4: RULE_PATTERN_ID
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
    // InternalMSL.g:4085:1: rule__Pattern__ManagedSystemsAssignment_6 : ( ruleSystemBinding ) ;
    public final void rule__Pattern__ManagedSystemsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4089:1: ( ( ruleSystemBinding ) )
            // InternalMSL.g:4090:2: ( ruleSystemBinding )
            {
            // InternalMSL.g:4090:2: ( ruleSystemBinding )
            // InternalMSL.g:4091:3: ruleSystemBinding
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
    // InternalMSL.g:4100:1: rule__Pattern__GroupsAssignment_7 : ( ruleGroupBinding ) ;
    public final void rule__Pattern__GroupsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4104:1: ( ( ruleGroupBinding ) )
            // InternalMSL.g:4105:2: ( ruleGroupBinding )
            {
            // InternalMSL.g:4105:2: ( ruleGroupBinding )
            // InternalMSL.g:4106:3: ruleGroupBinding
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
    // InternalMSL.g:4115:1: rule__Configuration__NameAssignment_1 : ( RULE_PATTERN_ID ) ;
    public final void rule__Configuration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4119:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4120:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:4120:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:4121:3: RULE_PATTERN_ID
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
    // InternalMSL.g:4130:1: rule__Configuration__PatternAssignment_3_0 : ( ( RULE_PATTERN_ID ) ) ;
    public final void rule__Configuration__PatternAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4134:1: ( ( ( RULE_PATTERN_ID ) ) )
            // InternalMSL.g:4135:2: ( ( RULE_PATTERN_ID ) )
            {
            // InternalMSL.g:4135:2: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4136:3: ( RULE_PATTERN_ID )
            {
             before(grammarAccess.getConfigurationAccess().getPatternPatternCrossReference_3_0_0()); 
            // InternalMSL.g:4137:3: ( RULE_PATTERN_ID )
            // InternalMSL.g:4138:4: RULE_PATTERN_ID
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
    // InternalMSL.g:4149:1: rule__Configuration__PatternAssignment_3_1_1 : ( ( RULE_PATTERN_ID ) ) ;
    public final void rule__Configuration__PatternAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4153:1: ( ( ( RULE_PATTERN_ID ) ) )
            // InternalMSL.g:4154:2: ( ( RULE_PATTERN_ID ) )
            {
            // InternalMSL.g:4154:2: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4155:3: ( RULE_PATTERN_ID )
            {
             before(grammarAccess.getConfigurationAccess().getPatternPatternCrossReference_3_1_1_0()); 
            // InternalMSL.g:4156:3: ( RULE_PATTERN_ID )
            // InternalMSL.g:4157:4: RULE_PATTERN_ID
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
    // InternalMSL.g:4168:1: rule__Configuration__ConcreteSystemsAssignment_5 : ( ruleConcreteSystem ) ;
    public final void rule__Configuration__ConcreteSystemsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4172:1: ( ( ruleConcreteSystem ) )
            // InternalMSL.g:4173:2: ( ruleConcreteSystem )
            {
            // InternalMSL.g:4173:2: ( ruleConcreteSystem )
            // InternalMSL.g:4174:3: ruleConcreteSystem
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
    // InternalMSL.g:4183:1: rule__Configuration__ConcreteGroupsAssignment_6 : ( ruleConcreteGroup ) ;
    public final void rule__Configuration__ConcreteGroupsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4187:1: ( ( ruleConcreteGroup ) )
            // InternalMSL.g:4188:2: ( ruleConcreteGroup )
            {
            // InternalMSL.g:4188:2: ( ruleConcreteGroup )
            // InternalMSL.g:4189:3: ruleConcreteGroup
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
    // InternalMSL.g:4198:1: rule__Configuration__ConcreteInteractionsAssignment_7 : ( ruleInteraction ) ;
    public final void rule__Configuration__ConcreteInteractionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4202:1: ( ( ruleInteraction ) )
            // InternalMSL.g:4203:2: ( ruleInteraction )
            {
            // InternalMSL.g:4203:2: ( ruleInteraction )
            // InternalMSL.g:4204:3: ruleInteraction
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
    // InternalMSL.g:4213:1: rule__ConcreteSystem__NameAssignment_0 : ( RULE_INSTANCE_ID ) ;
    public final void rule__ConcreteSystem__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4217:1: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4218:2: ( RULE_INSTANCE_ID )
            {
            // InternalMSL.g:4218:2: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4219:3: RULE_INSTANCE_ID
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
    // InternalMSL.g:4228:1: rule__ConcreteSystem__BindingsAssignment_2_0 : ( ( RULE_FQN_PATTERN_ID ) ) ;
    public final void rule__ConcreteSystem__BindingsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4232:1: ( ( ( RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:4233:2: ( ( RULE_FQN_PATTERN_ID ) )
            {
            // InternalMSL.g:4233:2: ( ( RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:4234:3: ( RULE_FQN_PATTERN_ID )
            {
             before(grammarAccess.getConcreteSystemAccess().getBindingsSystemBindingCrossReference_2_0_0()); 
            // InternalMSL.g:4235:3: ( RULE_FQN_PATTERN_ID )
            // InternalMSL.g:4236:4: RULE_FQN_PATTERN_ID
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
    // InternalMSL.g:4247:1: rule__ConcreteSystem__BindingsAssignment_2_1_1 : ( ( RULE_FQN_PATTERN_ID ) ) ;
    public final void rule__ConcreteSystem__BindingsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4251:1: ( ( ( RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:4252:2: ( ( RULE_FQN_PATTERN_ID ) )
            {
            // InternalMSL.g:4252:2: ( ( RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:4253:3: ( RULE_FQN_PATTERN_ID )
            {
             before(grammarAccess.getConcreteSystemAccess().getBindingsSystemBindingCrossReference_2_1_1_0()); 
            // InternalMSL.g:4254:3: ( RULE_FQN_PATTERN_ID )
            // InternalMSL.g:4255:4: RULE_FQN_PATTERN_ID
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
    // InternalMSL.g:4266:1: rule__ConcreteGroup__NameAssignment_0 : ( RULE_INSTANCE_ID ) ;
    public final void rule__ConcreteGroup__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4270:1: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4271:2: ( RULE_INSTANCE_ID )
            {
            // InternalMSL.g:4271:2: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4272:3: RULE_INSTANCE_ID
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
    // InternalMSL.g:4281:1: rule__ConcreteGroup__AbstractGroupsAssignment_2_0 : ( ( RULE_FQN_PATTERN_ID ) ) ;
    public final void rule__ConcreteGroup__AbstractGroupsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4285:1: ( ( ( RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:4286:2: ( ( RULE_FQN_PATTERN_ID ) )
            {
            // InternalMSL.g:4286:2: ( ( RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:4287:3: ( RULE_FQN_PATTERN_ID )
            {
             before(grammarAccess.getConcreteGroupAccess().getAbstractGroupsGroupBindingCrossReference_2_0_0()); 
            // InternalMSL.g:4288:3: ( RULE_FQN_PATTERN_ID )
            // InternalMSL.g:4289:4: RULE_FQN_PATTERN_ID
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
    // InternalMSL.g:4300:1: rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 : ( ( RULE_FQN_PATTERN_ID ) ) ;
    public final void rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4304:1: ( ( ( RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:4305:2: ( ( RULE_FQN_PATTERN_ID ) )
            {
            // InternalMSL.g:4305:2: ( ( RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:4306:3: ( RULE_FQN_PATTERN_ID )
            {
             before(grammarAccess.getConcreteGroupAccess().getAbstractGroupsGroupBindingCrossReference_2_1_1_0()); 
            // InternalMSL.g:4307:3: ( RULE_FQN_PATTERN_ID )
            // InternalMSL.g:4308:4: RULE_FQN_PATTERN_ID
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
    // InternalMSL.g:4319:1: rule__ConcreteGroup__ManSysAssignment_4_1 : ( ( RULE_INSTANCE_ID ) ) ;
    public final void rule__ConcreteGroup__ManSysAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4323:1: ( ( ( RULE_INSTANCE_ID ) ) )
            // InternalMSL.g:4324:2: ( ( RULE_INSTANCE_ID ) )
            {
            // InternalMSL.g:4324:2: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4325:3: ( RULE_INSTANCE_ID )
            {
             before(grammarAccess.getConcreteGroupAccess().getManSysConcreteSystemCrossReference_4_1_0()); 
            // InternalMSL.g:4326:3: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4327:4: RULE_INSTANCE_ID
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


    // $ANTLR start "rule__ConcreteGroup__ManGrpAssignment_5_1"
    // InternalMSL.g:4338:1: rule__ConcreteGroup__ManGrpAssignment_5_1 : ( ( RULE_INSTANCE_ID ) ) ;
    public final void rule__ConcreteGroup__ManGrpAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4342:1: ( ( ( RULE_INSTANCE_ID ) ) )
            // InternalMSL.g:4343:2: ( ( RULE_INSTANCE_ID ) )
            {
            // InternalMSL.g:4343:2: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4344:3: ( RULE_INSTANCE_ID )
            {
             before(grammarAccess.getConcreteGroupAccess().getManGrpConcreteGroupCrossReference_5_1_0()); 
            // InternalMSL.g:4345:3: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4346:4: RULE_INSTANCE_ID
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
    // InternalMSL.g:4357:1: rule__ConcreteGroup__ManGrpAssignment_5_2_1 : ( ( RULE_INSTANCE_ID ) ) ;
    public final void rule__ConcreteGroup__ManGrpAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4361:1: ( ( ( RULE_INSTANCE_ID ) ) )
            // InternalMSL.g:4362:2: ( ( RULE_INSTANCE_ID ) )
            {
            // InternalMSL.g:4362:2: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4363:3: ( RULE_INSTANCE_ID )
            {
             before(grammarAccess.getConcreteGroupAccess().getManGrpConcreteGroupCrossReference_5_2_1_0()); 
            // InternalMSL.g:4364:3: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4365:4: RULE_INSTANCE_ID
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
    // InternalMSL.g:4376:1: rule__ConcreteGroup__ComponentsAssignment_7 : ( ruleComponentInstance ) ;
    public final void rule__ConcreteGroup__ComponentsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4380:1: ( ( ruleComponentInstance ) )
            // InternalMSL.g:4381:2: ( ruleComponentInstance )
            {
            // InternalMSL.g:4381:2: ( ruleComponentInstance )
            // InternalMSL.g:4382:3: ruleComponentInstance
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
    // InternalMSL.g:4391:1: rule__ConcreteGroup__ComponentsAssignment_8_1 : ( ruleComponentInstance ) ;
    public final void rule__ConcreteGroup__ComponentsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4395:1: ( ( ruleComponentInstance ) )
            // InternalMSL.g:4396:2: ( ruleComponentInstance )
            {
            // InternalMSL.g:4396:2: ( ruleComponentInstance )
            // InternalMSL.g:4397:3: ruleComponentInstance
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


    // $ANTLR start "rule__ComponentInstance__NameAssignment_0"
    // InternalMSL.g:4406:1: rule__ComponentInstance__NameAssignment_0 : ( RULE_INSTANCE_ID ) ;
    public final void rule__ComponentInstance__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4410:1: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4411:2: ( RULE_INSTANCE_ID )
            {
            // InternalMSL.g:4411:2: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4412:3: RULE_INSTANCE_ID
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
    // InternalMSL.g:4421:1: rule__ComponentInstance__TypeAssignment_2 : ( RULE_COMPONENT_TYPE ) ;
    public final void rule__ComponentInstance__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4425:1: ( ( RULE_COMPONENT_TYPE ) )
            // InternalMSL.g:4426:2: ( RULE_COMPONENT_TYPE )
            {
            // InternalMSL.g:4426:2: ( RULE_COMPONENT_TYPE )
            // InternalMSL.g:4427:3: RULE_COMPONENT_TYPE
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


    // $ANTLR start "rule__Interaction__StartAssignment_0"
    // InternalMSL.g:4436:1: rule__Interaction__StartAssignment_0 : ( ruleComponentName ) ;
    public final void rule__Interaction__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4440:1: ( ( ruleComponentName ) )
            // InternalMSL.g:4441:2: ( ruleComponentName )
            {
            // InternalMSL.g:4441:2: ( ruleComponentName )
            // InternalMSL.g:4442:3: ruleComponentName
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
    // InternalMSL.g:4451:1: rule__Interaction__EndAssignment_2 : ( ruleComponentName ) ;
    public final void rule__Interaction__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4455:1: ( ( ruleComponentName ) )
            // InternalMSL.g:4456:2: ( ruleComponentName )
            {
            // InternalMSL.g:4456:2: ( ruleComponentName )
            // InternalMSL.g:4457:3: ruleComponentName
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
    // InternalMSL.g:4466:1: rule__ComponentName__ComponentAssignment : ( ( RULE_FQN_INSTANCE_ID ) ) ;
    public final void rule__ComponentName__ComponentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4470:1: ( ( ( RULE_FQN_INSTANCE_ID ) ) )
            // InternalMSL.g:4471:2: ( ( RULE_FQN_INSTANCE_ID ) )
            {
            // InternalMSL.g:4471:2: ( ( RULE_FQN_INSTANCE_ID ) )
            // InternalMSL.g:4472:3: ( RULE_FQN_INSTANCE_ID )
            {
             before(grammarAccess.getComponentNameAccess().getComponentComponentInstanceCrossReference_0()); 
            // InternalMSL.g:4473:3: ( RULE_FQN_INSTANCE_ID )
            // InternalMSL.g:4474:4: RULE_FQN_INSTANCE_ID
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


    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\11\1\41\1\uffff\1\10\1\11\1\10\1\uffff\1\11";
    static final String dfa_3s = "\1\26\1\41\1\uffff\1\10\1\36\1\10\1\uffff\1\36";
    static final String dfa_4s = "\2\uffff\1\2\3\uffff\1\1\1\uffff";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\13\uffff\1\2",
            "\1\3",
            "",
            "\1\4",
            "\2\6\12\uffff\1\2\1\6\7\uffff\1\5",
            "\1\7",
            "",
            "\2\6\12\uffff\1\2\1\6\7\uffff\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 2438:2: ( rule__Configuration__ConcreteSystemsAssignment_5 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001400080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000084C00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004C00000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000400600L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000400L});

}