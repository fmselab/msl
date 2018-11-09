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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PATTERN_ID", "RULE_COMPONENT_TYPE", "RULE_MULTIPLICITY", "RULE_INSTANCE_ID", "RULE_FQN_COMPONENT", "RULE_FQN_PATTERN_ID", "RULE_FQN_INSTANCE_ID", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'abstract'", "'pattern'", "'{'", "'}'", "'system'", "'['", "']'", "'='", "'group'", "'components'", "'managedSyS'", "','", "'managedGrp'", "'interaction'", "'->'", "':'", "'concrete'", "'concretizationOf'", "'configuration'", "'instanceOf'"
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


    // $ANTLR start "entryRuleAttValue"
    // InternalMSL.g:203:1: entryRuleAttValue : ruleAttValue EOF ;
    public final void entryRuleAttValue() throws RecognitionException {
        try {
            // InternalMSL.g:204:1: ( ruleAttValue EOF )
            // InternalMSL.g:205:1: ruleAttValue EOF
            {
             before(grammarAccess.getAttValueRule()); 
            pushFollow(FOLLOW_1);
            ruleAttValue();

            state._fsp--;

             after(grammarAccess.getAttValueRule()); 
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
    // $ANTLR end "entryRuleAttValue"


    // $ANTLR start "ruleAttValue"
    // InternalMSL.g:212:1: ruleAttValue : ( ( rule__AttValue__Group__0 ) ) ;
    public final void ruleAttValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:216:2: ( ( ( rule__AttValue__Group__0 ) ) )
            // InternalMSL.g:217:2: ( ( rule__AttValue__Group__0 ) )
            {
            // InternalMSL.g:217:2: ( ( rule__AttValue__Group__0 ) )
            // InternalMSL.g:218:3: ( rule__AttValue__Group__0 )
            {
             before(grammarAccess.getAttValueAccess().getGroup()); 
            // InternalMSL.g:219:3: ( rule__AttValue__Group__0 )
            // InternalMSL.g:219:4: rule__AttValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttValue"


    // $ANTLR start "entryRuleAbstractGroup"
    // InternalMSL.g:228:1: entryRuleAbstractGroup : ruleAbstractGroup EOF ;
    public final void entryRuleAbstractGroup() throws RecognitionException {
        try {
            // InternalMSL.g:229:1: ( ruleAbstractGroup EOF )
            // InternalMSL.g:230:1: ruleAbstractGroup EOF
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
    // InternalMSL.g:237:1: ruleAbstractGroup : ( ( rule__AbstractGroup__Group__0 ) ) ;
    public final void ruleAbstractGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:241:2: ( ( ( rule__AbstractGroup__Group__0 ) ) )
            // InternalMSL.g:242:2: ( ( rule__AbstractGroup__Group__0 ) )
            {
            // InternalMSL.g:242:2: ( ( rule__AbstractGroup__Group__0 ) )
            // InternalMSL.g:243:3: ( rule__AbstractGroup__Group__0 )
            {
             before(grammarAccess.getAbstractGroupAccess().getGroup()); 
            // InternalMSL.g:244:3: ( rule__AbstractGroup__Group__0 )
            // InternalMSL.g:244:4: rule__AbstractGroup__Group__0
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
    // InternalMSL.g:253:1: entryRuleAbstractInteraction : ruleAbstractInteraction EOF ;
    public final void entryRuleAbstractInteraction() throws RecognitionException {
        try {
            // InternalMSL.g:254:1: ( ruleAbstractInteraction EOF )
            // InternalMSL.g:255:1: ruleAbstractInteraction EOF
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
    // InternalMSL.g:262:1: ruleAbstractInteraction : ( ( rule__AbstractInteraction__Group__0 ) ) ;
    public final void ruleAbstractInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:266:2: ( ( ( rule__AbstractInteraction__Group__0 ) ) )
            // InternalMSL.g:267:2: ( ( rule__AbstractInteraction__Group__0 ) )
            {
            // InternalMSL.g:267:2: ( ( rule__AbstractInteraction__Group__0 ) )
            // InternalMSL.g:268:3: ( rule__AbstractInteraction__Group__0 )
            {
             before(grammarAccess.getAbstractInteractionAccess().getGroup()); 
            // InternalMSL.g:269:3: ( rule__AbstractInteraction__Group__0 )
            // InternalMSL.g:269:4: rule__AbstractInteraction__Group__0
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
    // InternalMSL.g:278:1: entryRuleAbstractComponentName : ruleAbstractComponentName EOF ;
    public final void entryRuleAbstractComponentName() throws RecognitionException {
        try {
            // InternalMSL.g:279:1: ( ruleAbstractComponentName EOF )
            // InternalMSL.g:280:1: ruleAbstractComponentName EOF
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
    // InternalMSL.g:287:1: ruleAbstractComponentName : ( ( rule__AbstractComponentName__TypeAssignment ) ) ;
    public final void ruleAbstractComponentName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:291:2: ( ( ( rule__AbstractComponentName__TypeAssignment ) ) )
            // InternalMSL.g:292:2: ( ( rule__AbstractComponentName__TypeAssignment ) )
            {
            // InternalMSL.g:292:2: ( ( rule__AbstractComponentName__TypeAssignment ) )
            // InternalMSL.g:293:3: ( rule__AbstractComponentName__TypeAssignment )
            {
             before(grammarAccess.getAbstractComponentNameAccess().getTypeAssignment()); 
            // InternalMSL.g:294:3: ( rule__AbstractComponentName__TypeAssignment )
            // InternalMSL.g:294:4: rule__AbstractComponentName__TypeAssignment
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
    // InternalMSL.g:303:1: entryRuleSystemBinding : ruleSystemBinding EOF ;
    public final void entryRuleSystemBinding() throws RecognitionException {
        try {
            // InternalMSL.g:304:1: ( ruleSystemBinding EOF )
            // InternalMSL.g:305:1: ruleSystemBinding EOF
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
    // InternalMSL.g:312:1: ruleSystemBinding : ( ( rule__SystemBinding__Group__0 ) ) ;
    public final void ruleSystemBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:316:2: ( ( ( rule__SystemBinding__Group__0 ) ) )
            // InternalMSL.g:317:2: ( ( rule__SystemBinding__Group__0 ) )
            {
            // InternalMSL.g:317:2: ( ( rule__SystemBinding__Group__0 ) )
            // InternalMSL.g:318:3: ( rule__SystemBinding__Group__0 )
            {
             before(grammarAccess.getSystemBindingAccess().getGroup()); 
            // InternalMSL.g:319:3: ( rule__SystemBinding__Group__0 )
            // InternalMSL.g:319:4: rule__SystemBinding__Group__0
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
    // InternalMSL.g:328:1: entryRuleGroupBinding : ruleGroupBinding EOF ;
    public final void entryRuleGroupBinding() throws RecognitionException {
        try {
            // InternalMSL.g:329:1: ( ruleGroupBinding EOF )
            // InternalMSL.g:330:1: ruleGroupBinding EOF
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
    // InternalMSL.g:337:1: ruleGroupBinding : ( ( rule__GroupBinding__Group__0 ) ) ;
    public final void ruleGroupBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:341:2: ( ( ( rule__GroupBinding__Group__0 ) ) )
            // InternalMSL.g:342:2: ( ( rule__GroupBinding__Group__0 ) )
            {
            // InternalMSL.g:342:2: ( ( rule__GroupBinding__Group__0 ) )
            // InternalMSL.g:343:3: ( rule__GroupBinding__Group__0 )
            {
             before(grammarAccess.getGroupBindingAccess().getGroup()); 
            // InternalMSL.g:344:3: ( rule__GroupBinding__Group__0 )
            // InternalMSL.g:344:4: rule__GroupBinding__Group__0
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
    // InternalMSL.g:353:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalMSL.g:354:1: ( rulePattern EOF )
            // InternalMSL.g:355:1: rulePattern EOF
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
    // InternalMSL.g:362:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:366:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalMSL.g:367:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalMSL.g:367:2: ( ( rule__Pattern__Group__0 ) )
            // InternalMSL.g:368:3: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // InternalMSL.g:369:3: ( rule__Pattern__Group__0 )
            // InternalMSL.g:369:4: rule__Pattern__Group__0
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
    // InternalMSL.g:378:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // InternalMSL.g:379:1: ( ruleConfiguration EOF )
            // InternalMSL.g:380:1: ruleConfiguration EOF
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
    // InternalMSL.g:387:1: ruleConfiguration : ( ( rule__Configuration__Group__0 ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:391:2: ( ( ( rule__Configuration__Group__0 ) ) )
            // InternalMSL.g:392:2: ( ( rule__Configuration__Group__0 ) )
            {
            // InternalMSL.g:392:2: ( ( rule__Configuration__Group__0 ) )
            // InternalMSL.g:393:3: ( rule__Configuration__Group__0 )
            {
             before(grammarAccess.getConfigurationAccess().getGroup()); 
            // InternalMSL.g:394:3: ( rule__Configuration__Group__0 )
            // InternalMSL.g:394:4: rule__Configuration__Group__0
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
    // InternalMSL.g:403:1: entryRuleConcreteSystem : ruleConcreteSystem EOF ;
    public final void entryRuleConcreteSystem() throws RecognitionException {
        try {
            // InternalMSL.g:404:1: ( ruleConcreteSystem EOF )
            // InternalMSL.g:405:1: ruleConcreteSystem EOF
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
    // InternalMSL.g:412:1: ruleConcreteSystem : ( ( rule__ConcreteSystem__Group__0 ) ) ;
    public final void ruleConcreteSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:416:2: ( ( ( rule__ConcreteSystem__Group__0 ) ) )
            // InternalMSL.g:417:2: ( ( rule__ConcreteSystem__Group__0 ) )
            {
            // InternalMSL.g:417:2: ( ( rule__ConcreteSystem__Group__0 ) )
            // InternalMSL.g:418:3: ( rule__ConcreteSystem__Group__0 )
            {
             before(grammarAccess.getConcreteSystemAccess().getGroup()); 
            // InternalMSL.g:419:3: ( rule__ConcreteSystem__Group__0 )
            // InternalMSL.g:419:4: rule__ConcreteSystem__Group__0
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
    // InternalMSL.g:428:1: entryRuleConcreteGroup : ruleConcreteGroup EOF ;
    public final void entryRuleConcreteGroup() throws RecognitionException {
        try {
            // InternalMSL.g:429:1: ( ruleConcreteGroup EOF )
            // InternalMSL.g:430:1: ruleConcreteGroup EOF
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
    // InternalMSL.g:437:1: ruleConcreteGroup : ( ( rule__ConcreteGroup__Group__0 ) ) ;
    public final void ruleConcreteGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:441:2: ( ( ( rule__ConcreteGroup__Group__0 ) ) )
            // InternalMSL.g:442:2: ( ( rule__ConcreteGroup__Group__0 ) )
            {
            // InternalMSL.g:442:2: ( ( rule__ConcreteGroup__Group__0 ) )
            // InternalMSL.g:443:3: ( rule__ConcreteGroup__Group__0 )
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup()); 
            // InternalMSL.g:444:3: ( rule__ConcreteGroup__Group__0 )
            // InternalMSL.g:444:4: rule__ConcreteGroup__Group__0
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


    // $ANTLR start "rule__Specification__Group__0"
    // InternalMSL.g:527:1: rule__Specification__Group__0 : rule__Specification__Group__0__Impl rule__Specification__Group__1 ;
    public final void rule__Specification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:531:1: ( rule__Specification__Group__0__Impl rule__Specification__Group__1 )
            // InternalMSL.g:532:2: rule__Specification__Group__0__Impl rule__Specification__Group__1
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
    // InternalMSL.g:539:1: rule__Specification__Group__0__Impl : ( ( rule__Specification__ImportsAssignment_0 )* ) ;
    public final void rule__Specification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:543:1: ( ( ( rule__Specification__ImportsAssignment_0 )* ) )
            // InternalMSL.g:544:1: ( ( rule__Specification__ImportsAssignment_0 )* )
            {
            // InternalMSL.g:544:1: ( ( rule__Specification__ImportsAssignment_0 )* )
            // InternalMSL.g:545:2: ( rule__Specification__ImportsAssignment_0 )*
            {
             before(grammarAccess.getSpecificationAccess().getImportsAssignment_0()); 
            // InternalMSL.g:546:2: ( rule__Specification__ImportsAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMSL.g:546:3: rule__Specification__ImportsAssignment_0
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
    // InternalMSL.g:554:1: rule__Specification__Group__1 : rule__Specification__Group__1__Impl rule__Specification__Group__2 ;
    public final void rule__Specification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:558:1: ( rule__Specification__Group__1__Impl rule__Specification__Group__2 )
            // InternalMSL.g:559:2: rule__Specification__Group__1__Impl rule__Specification__Group__2
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
    // InternalMSL.g:566:1: rule__Specification__Group__1__Impl : ( ( rule__Specification__AbsPatternAssignment_1 )? ) ;
    public final void rule__Specification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:570:1: ( ( ( rule__Specification__AbsPatternAssignment_1 )? ) )
            // InternalMSL.g:571:1: ( ( rule__Specification__AbsPatternAssignment_1 )? )
            {
            // InternalMSL.g:571:1: ( ( rule__Specification__AbsPatternAssignment_1 )? )
            // InternalMSL.g:572:2: ( rule__Specification__AbsPatternAssignment_1 )?
            {
             before(grammarAccess.getSpecificationAccess().getAbsPatternAssignment_1()); 
            // InternalMSL.g:573:2: ( rule__Specification__AbsPatternAssignment_1 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMSL.g:573:3: rule__Specification__AbsPatternAssignment_1
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
    // InternalMSL.g:581:1: rule__Specification__Group__2 : rule__Specification__Group__2__Impl rule__Specification__Group__3 ;
    public final void rule__Specification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:585:1: ( rule__Specification__Group__2__Impl rule__Specification__Group__3 )
            // InternalMSL.g:586:2: rule__Specification__Group__2__Impl rule__Specification__Group__3
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
    // InternalMSL.g:593:1: rule__Specification__Group__2__Impl : ( ( rule__Specification__PatternAssignment_2 )* ) ;
    public final void rule__Specification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:597:1: ( ( ( rule__Specification__PatternAssignment_2 )* ) )
            // InternalMSL.g:598:1: ( ( rule__Specification__PatternAssignment_2 )* )
            {
            // InternalMSL.g:598:1: ( ( rule__Specification__PatternAssignment_2 )* )
            // InternalMSL.g:599:2: ( rule__Specification__PatternAssignment_2 )*
            {
             before(grammarAccess.getSpecificationAccess().getPatternAssignment_2()); 
            // InternalMSL.g:600:2: ( rule__Specification__PatternAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==35) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMSL.g:600:3: rule__Specification__PatternAssignment_2
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
    // InternalMSL.g:608:1: rule__Specification__Group__3 : rule__Specification__Group__3__Impl ;
    public final void rule__Specification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:612:1: ( rule__Specification__Group__3__Impl )
            // InternalMSL.g:613:2: rule__Specification__Group__3__Impl
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
    // InternalMSL.g:619:1: rule__Specification__Group__3__Impl : ( ( rule__Specification__ConfigurationAssignment_3 )? ) ;
    public final void rule__Specification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:623:1: ( ( ( rule__Specification__ConfigurationAssignment_3 )? ) )
            // InternalMSL.g:624:1: ( ( rule__Specification__ConfigurationAssignment_3 )? )
            {
            // InternalMSL.g:624:1: ( ( rule__Specification__ConfigurationAssignment_3 )? )
            // InternalMSL.g:625:2: ( rule__Specification__ConfigurationAssignment_3 )?
            {
             before(grammarAccess.getSpecificationAccess().getConfigurationAssignment_3()); 
            // InternalMSL.g:626:2: ( rule__Specification__ConfigurationAssignment_3 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==37) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMSL.g:626:3: rule__Specification__ConfigurationAssignment_3
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
    // InternalMSL.g:635:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:639:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMSL.g:640:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalMSL.g:647:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:651:1: ( ( 'import' ) )
            // InternalMSL.g:652:1: ( 'import' )
            {
            // InternalMSL.g:652:1: ( 'import' )
            // InternalMSL.g:653:2: 'import'
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
    // InternalMSL.g:662:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:666:1: ( rule__Import__Group__1__Impl )
            // InternalMSL.g:667:2: rule__Import__Group__1__Impl
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
    // InternalMSL.g:673:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:677:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalMSL.g:678:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalMSL.g:678:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalMSL.g:679:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalMSL.g:680:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalMSL.g:680:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalMSL.g:689:1: rule__AbstractPattern__Group__0 : rule__AbstractPattern__Group__0__Impl rule__AbstractPattern__Group__1 ;
    public final void rule__AbstractPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:693:1: ( rule__AbstractPattern__Group__0__Impl rule__AbstractPattern__Group__1 )
            // InternalMSL.g:694:2: rule__AbstractPattern__Group__0__Impl rule__AbstractPattern__Group__1
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
    // InternalMSL.g:701:1: rule__AbstractPattern__Group__0__Impl : ( 'abstract' ) ;
    public final void rule__AbstractPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:705:1: ( ( 'abstract' ) )
            // InternalMSL.g:706:1: ( 'abstract' )
            {
            // InternalMSL.g:706:1: ( 'abstract' )
            // InternalMSL.g:707:2: 'abstract'
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
    // InternalMSL.g:716:1: rule__AbstractPattern__Group__1 : rule__AbstractPattern__Group__1__Impl rule__AbstractPattern__Group__2 ;
    public final void rule__AbstractPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:720:1: ( rule__AbstractPattern__Group__1__Impl rule__AbstractPattern__Group__2 )
            // InternalMSL.g:721:2: rule__AbstractPattern__Group__1__Impl rule__AbstractPattern__Group__2
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
    // InternalMSL.g:728:1: rule__AbstractPattern__Group__1__Impl : ( 'pattern' ) ;
    public final void rule__AbstractPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:732:1: ( ( 'pattern' ) )
            // InternalMSL.g:733:1: ( 'pattern' )
            {
            // InternalMSL.g:733:1: ( 'pattern' )
            // InternalMSL.g:734:2: 'pattern'
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
    // InternalMSL.g:743:1: rule__AbstractPattern__Group__2 : rule__AbstractPattern__Group__2__Impl rule__AbstractPattern__Group__3 ;
    public final void rule__AbstractPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:747:1: ( rule__AbstractPattern__Group__2__Impl rule__AbstractPattern__Group__3 )
            // InternalMSL.g:748:2: rule__AbstractPattern__Group__2__Impl rule__AbstractPattern__Group__3
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
    // InternalMSL.g:755:1: rule__AbstractPattern__Group__2__Impl : ( ( rule__AbstractPattern__NameAssignment_2 ) ) ;
    public final void rule__AbstractPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:759:1: ( ( ( rule__AbstractPattern__NameAssignment_2 ) ) )
            // InternalMSL.g:760:1: ( ( rule__AbstractPattern__NameAssignment_2 ) )
            {
            // InternalMSL.g:760:1: ( ( rule__AbstractPattern__NameAssignment_2 ) )
            // InternalMSL.g:761:2: ( rule__AbstractPattern__NameAssignment_2 )
            {
             before(grammarAccess.getAbstractPatternAccess().getNameAssignment_2()); 
            // InternalMSL.g:762:2: ( rule__AbstractPattern__NameAssignment_2 )
            // InternalMSL.g:762:3: rule__AbstractPattern__NameAssignment_2
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
    // InternalMSL.g:770:1: rule__AbstractPattern__Group__3 : rule__AbstractPattern__Group__3__Impl rule__AbstractPattern__Group__4 ;
    public final void rule__AbstractPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:774:1: ( rule__AbstractPattern__Group__3__Impl rule__AbstractPattern__Group__4 )
            // InternalMSL.g:775:2: rule__AbstractPattern__Group__3__Impl rule__AbstractPattern__Group__4
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
    // InternalMSL.g:782:1: rule__AbstractPattern__Group__3__Impl : ( '{' ) ;
    public final void rule__AbstractPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:786:1: ( ( '{' ) )
            // InternalMSL.g:787:1: ( '{' )
            {
            // InternalMSL.g:787:1: ( '{' )
            // InternalMSL.g:788:2: '{'
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
    // InternalMSL.g:797:1: rule__AbstractPattern__Group__4 : rule__AbstractPattern__Group__4__Impl rule__AbstractPattern__Group__5 ;
    public final void rule__AbstractPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:801:1: ( rule__AbstractPattern__Group__4__Impl rule__AbstractPattern__Group__5 )
            // InternalMSL.g:802:2: rule__AbstractPattern__Group__4__Impl rule__AbstractPattern__Group__5
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
    // InternalMSL.g:809:1: rule__AbstractPattern__Group__4__Impl : ( ( rule__AbstractPattern__ManagedSystemsAssignment_4 )* ) ;
    public final void rule__AbstractPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:813:1: ( ( ( rule__AbstractPattern__ManagedSystemsAssignment_4 )* ) )
            // InternalMSL.g:814:1: ( ( rule__AbstractPattern__ManagedSystemsAssignment_4 )* )
            {
            // InternalMSL.g:814:1: ( ( rule__AbstractPattern__ManagedSystemsAssignment_4 )* )
            // InternalMSL.g:815:2: ( rule__AbstractPattern__ManagedSystemsAssignment_4 )*
            {
             before(grammarAccess.getAbstractPatternAccess().getManagedSystemsAssignment_4()); 
            // InternalMSL.g:816:2: ( rule__AbstractPattern__ManagedSystemsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMSL.g:816:3: rule__AbstractPattern__ManagedSystemsAssignment_4
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
    // InternalMSL.g:824:1: rule__AbstractPattern__Group__5 : rule__AbstractPattern__Group__5__Impl rule__AbstractPattern__Group__6 ;
    public final void rule__AbstractPattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:828:1: ( rule__AbstractPattern__Group__5__Impl rule__AbstractPattern__Group__6 )
            // InternalMSL.g:829:2: rule__AbstractPattern__Group__5__Impl rule__AbstractPattern__Group__6
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
    // InternalMSL.g:836:1: rule__AbstractPattern__Group__5__Impl : ( ( rule__AbstractPattern__AbstractGroupsAssignment_5 )* ) ;
    public final void rule__AbstractPattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:840:1: ( ( ( rule__AbstractPattern__AbstractGroupsAssignment_5 )* ) )
            // InternalMSL.g:841:1: ( ( rule__AbstractPattern__AbstractGroupsAssignment_5 )* )
            {
            // InternalMSL.g:841:1: ( ( rule__AbstractPattern__AbstractGroupsAssignment_5 )* )
            // InternalMSL.g:842:2: ( rule__AbstractPattern__AbstractGroupsAssignment_5 )*
            {
             before(grammarAccess.getAbstractPatternAccess().getAbstractGroupsAssignment_5()); 
            // InternalMSL.g:843:2: ( rule__AbstractPattern__AbstractGroupsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMSL.g:843:3: rule__AbstractPattern__AbstractGroupsAssignment_5
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
    // InternalMSL.g:851:1: rule__AbstractPattern__Group__6 : rule__AbstractPattern__Group__6__Impl rule__AbstractPattern__Group__7 ;
    public final void rule__AbstractPattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:855:1: ( rule__AbstractPattern__Group__6__Impl rule__AbstractPattern__Group__7 )
            // InternalMSL.g:856:2: rule__AbstractPattern__Group__6__Impl rule__AbstractPattern__Group__7
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
    // InternalMSL.g:863:1: rule__AbstractPattern__Group__6__Impl : ( ( rule__AbstractPattern__InteractionsAssignment_6 )* ) ;
    public final void rule__AbstractPattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:867:1: ( ( ( rule__AbstractPattern__InteractionsAssignment_6 )* ) )
            // InternalMSL.g:868:1: ( ( rule__AbstractPattern__InteractionsAssignment_6 )* )
            {
            // InternalMSL.g:868:1: ( ( rule__AbstractPattern__InteractionsAssignment_6 )* )
            // InternalMSL.g:869:2: ( rule__AbstractPattern__InteractionsAssignment_6 )*
            {
             before(grammarAccess.getAbstractPatternAccess().getInteractionsAssignment_6()); 
            // InternalMSL.g:870:2: ( rule__AbstractPattern__InteractionsAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMSL.g:870:3: rule__AbstractPattern__InteractionsAssignment_6
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
    // InternalMSL.g:878:1: rule__AbstractPattern__Group__7 : rule__AbstractPattern__Group__7__Impl ;
    public final void rule__AbstractPattern__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:882:1: ( rule__AbstractPattern__Group__7__Impl )
            // InternalMSL.g:883:2: rule__AbstractPattern__Group__7__Impl
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
    // InternalMSL.g:889:1: rule__AbstractPattern__Group__7__Impl : ( '}' ) ;
    public final void rule__AbstractPattern__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:893:1: ( ( '}' ) )
            // InternalMSL.g:894:1: ( '}' )
            {
            // InternalMSL.g:894:1: ( '}' )
            // InternalMSL.g:895:2: '}'
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
    // InternalMSL.g:905:1: rule__AbstractSystem__Group__0 : rule__AbstractSystem__Group__0__Impl rule__AbstractSystem__Group__1 ;
    public final void rule__AbstractSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:909:1: ( rule__AbstractSystem__Group__0__Impl rule__AbstractSystem__Group__1 )
            // InternalMSL.g:910:2: rule__AbstractSystem__Group__0__Impl rule__AbstractSystem__Group__1
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
    // InternalMSL.g:917:1: rule__AbstractSystem__Group__0__Impl : ( 'system' ) ;
    public final void rule__AbstractSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:921:1: ( ( 'system' ) )
            // InternalMSL.g:922:1: ( 'system' )
            {
            // InternalMSL.g:922:1: ( 'system' )
            // InternalMSL.g:923:2: 'system'
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
    // InternalMSL.g:932:1: rule__AbstractSystem__Group__1 : rule__AbstractSystem__Group__1__Impl ;
    public final void rule__AbstractSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:936:1: ( rule__AbstractSystem__Group__1__Impl )
            // InternalMSL.g:937:2: rule__AbstractSystem__Group__1__Impl
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
    // InternalMSL.g:943:1: rule__AbstractSystem__Group__1__Impl : ( ( rule__AbstractSystem__NameAssignment_1 ) ) ;
    public final void rule__AbstractSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:947:1: ( ( ( rule__AbstractSystem__NameAssignment_1 ) ) )
            // InternalMSL.g:948:1: ( ( rule__AbstractSystem__NameAssignment_1 ) )
            {
            // InternalMSL.g:948:1: ( ( rule__AbstractSystem__NameAssignment_1 ) )
            // InternalMSL.g:949:2: ( rule__AbstractSystem__NameAssignment_1 )
            {
             before(grammarAccess.getAbstractSystemAccess().getNameAssignment_1()); 
            // InternalMSL.g:950:2: ( rule__AbstractSystem__NameAssignment_1 )
            // InternalMSL.g:950:3: rule__AbstractSystem__NameAssignment_1
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
    // InternalMSL.g:959:1: rule__GroupDef__Group__0 : rule__GroupDef__Group__0__Impl rule__GroupDef__Group__1 ;
    public final void rule__GroupDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:963:1: ( rule__GroupDef__Group__0__Impl rule__GroupDef__Group__1 )
            // InternalMSL.g:964:2: rule__GroupDef__Group__0__Impl rule__GroupDef__Group__1
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
    // InternalMSL.g:971:1: rule__GroupDef__Group__0__Impl : ( ( rule__GroupDef__GrpAssignment_0 ) ) ;
    public final void rule__GroupDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:975:1: ( ( ( rule__GroupDef__GrpAssignment_0 ) ) )
            // InternalMSL.g:976:1: ( ( rule__GroupDef__GrpAssignment_0 ) )
            {
            // InternalMSL.g:976:1: ( ( rule__GroupDef__GrpAssignment_0 ) )
            // InternalMSL.g:977:2: ( rule__GroupDef__GrpAssignment_0 )
            {
             before(grammarAccess.getGroupDefAccess().getGrpAssignment_0()); 
            // InternalMSL.g:978:2: ( rule__GroupDef__GrpAssignment_0 )
            // InternalMSL.g:978:3: rule__GroupDef__GrpAssignment_0
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
    // InternalMSL.g:986:1: rule__GroupDef__Group__1 : rule__GroupDef__Group__1__Impl ;
    public final void rule__GroupDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:990:1: ( rule__GroupDef__Group__1__Impl )
            // InternalMSL.g:991:2: rule__GroupDef__Group__1__Impl
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
    // InternalMSL.g:997:1: rule__GroupDef__Group__1__Impl : ( ( rule__GroupDef__Group_1__0 )? ) ;
    public final void rule__GroupDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1001:1: ( ( ( rule__GroupDef__Group_1__0 )? ) )
            // InternalMSL.g:1002:1: ( ( rule__GroupDef__Group_1__0 )? )
            {
            // InternalMSL.g:1002:1: ( ( rule__GroupDef__Group_1__0 )? )
            // InternalMSL.g:1003:2: ( rule__GroupDef__Group_1__0 )?
            {
             before(grammarAccess.getGroupDefAccess().getGroup_1()); 
            // InternalMSL.g:1004:2: ( rule__GroupDef__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMSL.g:1004:3: rule__GroupDef__Group_1__0
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
    // InternalMSL.g:1013:1: rule__GroupDef__Group_1__0 : rule__GroupDef__Group_1__0__Impl rule__GroupDef__Group_1__1 ;
    public final void rule__GroupDef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1017:1: ( rule__GroupDef__Group_1__0__Impl rule__GroupDef__Group_1__1 )
            // InternalMSL.g:1018:2: rule__GroupDef__Group_1__0__Impl rule__GroupDef__Group_1__1
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
    // InternalMSL.g:1025:1: rule__GroupDef__Group_1__0__Impl : ( '[' ) ;
    public final void rule__GroupDef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1029:1: ( ( '[' ) )
            // InternalMSL.g:1030:1: ( '[' )
            {
            // InternalMSL.g:1030:1: ( '[' )
            // InternalMSL.g:1031:2: '['
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
    // InternalMSL.g:1040:1: rule__GroupDef__Group_1__1 : rule__GroupDef__Group_1__1__Impl rule__GroupDef__Group_1__2 ;
    public final void rule__GroupDef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1044:1: ( rule__GroupDef__Group_1__1__Impl rule__GroupDef__Group_1__2 )
            // InternalMSL.g:1045:2: rule__GroupDef__Group_1__1__Impl rule__GroupDef__Group_1__2
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
    // InternalMSL.g:1052:1: rule__GroupDef__Group_1__1__Impl : ( ( rule__GroupDef__MultAssignment_1_1 ) ) ;
    public final void rule__GroupDef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1056:1: ( ( ( rule__GroupDef__MultAssignment_1_1 ) ) )
            // InternalMSL.g:1057:1: ( ( rule__GroupDef__MultAssignment_1_1 ) )
            {
            // InternalMSL.g:1057:1: ( ( rule__GroupDef__MultAssignment_1_1 ) )
            // InternalMSL.g:1058:2: ( rule__GroupDef__MultAssignment_1_1 )
            {
             before(grammarAccess.getGroupDefAccess().getMultAssignment_1_1()); 
            // InternalMSL.g:1059:2: ( rule__GroupDef__MultAssignment_1_1 )
            // InternalMSL.g:1059:3: rule__GroupDef__MultAssignment_1_1
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
    // InternalMSL.g:1067:1: rule__GroupDef__Group_1__2 : rule__GroupDef__Group_1__2__Impl ;
    public final void rule__GroupDef__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1071:1: ( rule__GroupDef__Group_1__2__Impl )
            // InternalMSL.g:1072:2: rule__GroupDef__Group_1__2__Impl
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
    // InternalMSL.g:1078:1: rule__GroupDef__Group_1__2__Impl : ( ']' ) ;
    public final void rule__GroupDef__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1082:1: ( ( ']' ) )
            // InternalMSL.g:1083:1: ( ']' )
            {
            // InternalMSL.g:1083:1: ( ']' )
            // InternalMSL.g:1084:2: ']'
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


    // $ANTLR start "rule__AttValue__Group__0"
    // InternalMSL.g:1094:1: rule__AttValue__Group__0 : rule__AttValue__Group__0__Impl rule__AttValue__Group__1 ;
    public final void rule__AttValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1098:1: ( rule__AttValue__Group__0__Impl rule__AttValue__Group__1 )
            // InternalMSL.g:1099:2: rule__AttValue__Group__0__Impl rule__AttValue__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__AttValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttValue__Group__1();

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
    // $ANTLR end "rule__AttValue__Group__0"


    // $ANTLR start "rule__AttValue__Group__0__Impl"
    // InternalMSL.g:1106:1: rule__AttValue__Group__0__Impl : ( ( rule__AttValue__NameAttAssignment_0 ) ) ;
    public final void rule__AttValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1110:1: ( ( ( rule__AttValue__NameAttAssignment_0 ) ) )
            // InternalMSL.g:1111:1: ( ( rule__AttValue__NameAttAssignment_0 ) )
            {
            // InternalMSL.g:1111:1: ( ( rule__AttValue__NameAttAssignment_0 ) )
            // InternalMSL.g:1112:2: ( rule__AttValue__NameAttAssignment_0 )
            {
             before(grammarAccess.getAttValueAccess().getNameAttAssignment_0()); 
            // InternalMSL.g:1113:2: ( rule__AttValue__NameAttAssignment_0 )
            // InternalMSL.g:1113:3: rule__AttValue__NameAttAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttValue__NameAttAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttValueAccess().getNameAttAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttValue__Group__0__Impl"


    // $ANTLR start "rule__AttValue__Group__1"
    // InternalMSL.g:1121:1: rule__AttValue__Group__1 : rule__AttValue__Group__1__Impl rule__AttValue__Group__2 ;
    public final void rule__AttValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1125:1: ( rule__AttValue__Group__1__Impl rule__AttValue__Group__2 )
            // InternalMSL.g:1126:2: rule__AttValue__Group__1__Impl rule__AttValue__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__AttValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttValue__Group__2();

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
    // $ANTLR end "rule__AttValue__Group__1"


    // $ANTLR start "rule__AttValue__Group__1__Impl"
    // InternalMSL.g:1133:1: rule__AttValue__Group__1__Impl : ( '=' ) ;
    public final void rule__AttValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1137:1: ( ( '=' ) )
            // InternalMSL.g:1138:1: ( '=' )
            {
            // InternalMSL.g:1138:1: ( '=' )
            // InternalMSL.g:1139:2: '='
            {
             before(grammarAccess.getAttValueAccess().getEqualsSignKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAttValueAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttValue__Group__1__Impl"


    // $ANTLR start "rule__AttValue__Group__2"
    // InternalMSL.g:1148:1: rule__AttValue__Group__2 : rule__AttValue__Group__2__Impl ;
    public final void rule__AttValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1152:1: ( rule__AttValue__Group__2__Impl )
            // InternalMSL.g:1153:2: rule__AttValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttValue__Group__2__Impl();

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
    // $ANTLR end "rule__AttValue__Group__2"


    // $ANTLR start "rule__AttValue__Group__2__Impl"
    // InternalMSL.g:1159:1: rule__AttValue__Group__2__Impl : ( ( rule__AttValue__ValAttAssignment_2 ) ) ;
    public final void rule__AttValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1163:1: ( ( ( rule__AttValue__ValAttAssignment_2 ) ) )
            // InternalMSL.g:1164:1: ( ( rule__AttValue__ValAttAssignment_2 ) )
            {
            // InternalMSL.g:1164:1: ( ( rule__AttValue__ValAttAssignment_2 ) )
            // InternalMSL.g:1165:2: ( rule__AttValue__ValAttAssignment_2 )
            {
             before(grammarAccess.getAttValueAccess().getValAttAssignment_2()); 
            // InternalMSL.g:1166:2: ( rule__AttValue__ValAttAssignment_2 )
            // InternalMSL.g:1166:3: rule__AttValue__ValAttAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttValue__ValAttAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttValueAccess().getValAttAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttValue__Group__2__Impl"


    // $ANTLR start "rule__AbstractGroup__Group__0"
    // InternalMSL.g:1175:1: rule__AbstractGroup__Group__0 : rule__AbstractGroup__Group__0__Impl rule__AbstractGroup__Group__1 ;
    public final void rule__AbstractGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1179:1: ( rule__AbstractGroup__Group__0__Impl rule__AbstractGroup__Group__1 )
            // InternalMSL.g:1180:2: rule__AbstractGroup__Group__0__Impl rule__AbstractGroup__Group__1
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
    // InternalMSL.g:1187:1: rule__AbstractGroup__Group__0__Impl : ( 'group' ) ;
    public final void rule__AbstractGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1191:1: ( ( 'group' ) )
            // InternalMSL.g:1192:1: ( 'group' )
            {
            // InternalMSL.g:1192:1: ( 'group' )
            // InternalMSL.g:1193:2: 'group'
            {
             before(grammarAccess.getAbstractGroupAccess().getGroupKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMSL.g:1202:1: rule__AbstractGroup__Group__1 : rule__AbstractGroup__Group__1__Impl rule__AbstractGroup__Group__2 ;
    public final void rule__AbstractGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1206:1: ( rule__AbstractGroup__Group__1__Impl rule__AbstractGroup__Group__2 )
            // InternalMSL.g:1207:2: rule__AbstractGroup__Group__1__Impl rule__AbstractGroup__Group__2
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
    // InternalMSL.g:1214:1: rule__AbstractGroup__Group__1__Impl : ( ( rule__AbstractGroup__NameAssignment_1 ) ) ;
    public final void rule__AbstractGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1218:1: ( ( ( rule__AbstractGroup__NameAssignment_1 ) ) )
            // InternalMSL.g:1219:1: ( ( rule__AbstractGroup__NameAssignment_1 ) )
            {
            // InternalMSL.g:1219:1: ( ( rule__AbstractGroup__NameAssignment_1 ) )
            // InternalMSL.g:1220:2: ( rule__AbstractGroup__NameAssignment_1 )
            {
             before(grammarAccess.getAbstractGroupAccess().getNameAssignment_1()); 
            // InternalMSL.g:1221:2: ( rule__AbstractGroup__NameAssignment_1 )
            // InternalMSL.g:1221:3: rule__AbstractGroup__NameAssignment_1
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
    // InternalMSL.g:1229:1: rule__AbstractGroup__Group__2 : rule__AbstractGroup__Group__2__Impl rule__AbstractGroup__Group__3 ;
    public final void rule__AbstractGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1233:1: ( rule__AbstractGroup__Group__2__Impl rule__AbstractGroup__Group__3 )
            // InternalMSL.g:1234:2: rule__AbstractGroup__Group__2__Impl rule__AbstractGroup__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalMSL.g:1241:1: rule__AbstractGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__AbstractGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1245:1: ( ( '{' ) )
            // InternalMSL.g:1246:1: ( '{' )
            {
            // InternalMSL.g:1246:1: ( '{' )
            // InternalMSL.g:1247:2: '{'
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
    // InternalMSL.g:1256:1: rule__AbstractGroup__Group__3 : rule__AbstractGroup__Group__3__Impl rule__AbstractGroup__Group__4 ;
    public final void rule__AbstractGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1260:1: ( rule__AbstractGroup__Group__3__Impl rule__AbstractGroup__Group__4 )
            // InternalMSL.g:1261:2: rule__AbstractGroup__Group__3__Impl rule__AbstractGroup__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMSL.g:1268:1: rule__AbstractGroup__Group__3__Impl : ( ( rule__AbstractGroup__Group_3__0 )? ) ;
    public final void rule__AbstractGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1272:1: ( ( ( rule__AbstractGroup__Group_3__0 )? ) )
            // InternalMSL.g:1273:1: ( ( rule__AbstractGroup__Group_3__0 )? )
            {
            // InternalMSL.g:1273:1: ( ( rule__AbstractGroup__Group_3__0 )? )
            // InternalMSL.g:1274:2: ( rule__AbstractGroup__Group_3__0 )?
            {
             before(grammarAccess.getAbstractGroupAccess().getGroup_3()); 
            // InternalMSL.g:1275:2: ( rule__AbstractGroup__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMSL.g:1275:3: rule__AbstractGroup__Group_3__0
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
    // InternalMSL.g:1283:1: rule__AbstractGroup__Group__4 : rule__AbstractGroup__Group__4__Impl rule__AbstractGroup__Group__5 ;
    public final void rule__AbstractGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1287:1: ( rule__AbstractGroup__Group__4__Impl rule__AbstractGroup__Group__5 )
            // InternalMSL.g:1288:2: rule__AbstractGroup__Group__4__Impl rule__AbstractGroup__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalMSL.g:1295:1: rule__AbstractGroup__Group__4__Impl : ( ( rule__AbstractGroup__Group_4__0 )? ) ;
    public final void rule__AbstractGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1299:1: ( ( ( rule__AbstractGroup__Group_4__0 )? ) )
            // InternalMSL.g:1300:1: ( ( rule__AbstractGroup__Group_4__0 )? )
            {
            // InternalMSL.g:1300:1: ( ( rule__AbstractGroup__Group_4__0 )? )
            // InternalMSL.g:1301:2: ( rule__AbstractGroup__Group_4__0 )?
            {
             before(grammarAccess.getAbstractGroupAccess().getGroup_4()); 
            // InternalMSL.g:1302:2: ( rule__AbstractGroup__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMSL.g:1302:3: rule__AbstractGroup__Group_4__0
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
    // InternalMSL.g:1310:1: rule__AbstractGroup__Group__5 : rule__AbstractGroup__Group__5__Impl rule__AbstractGroup__Group__6 ;
    public final void rule__AbstractGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1314:1: ( rule__AbstractGroup__Group__5__Impl rule__AbstractGroup__Group__6 )
            // InternalMSL.g:1315:2: rule__AbstractGroup__Group__5__Impl rule__AbstractGroup__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalMSL.g:1322:1: rule__AbstractGroup__Group__5__Impl : ( 'components' ) ;
    public final void rule__AbstractGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1326:1: ( ( 'components' ) )
            // InternalMSL.g:1327:1: ( 'components' )
            {
            // InternalMSL.g:1327:1: ( 'components' )
            // InternalMSL.g:1328:2: 'components'
            {
             before(grammarAccess.getAbstractGroupAccess().getComponentsKeyword_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMSL.g:1337:1: rule__AbstractGroup__Group__6 : rule__AbstractGroup__Group__6__Impl rule__AbstractGroup__Group__7 ;
    public final void rule__AbstractGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1341:1: ( rule__AbstractGroup__Group__6__Impl rule__AbstractGroup__Group__7 )
            // InternalMSL.g:1342:2: rule__AbstractGroup__Group__6__Impl rule__AbstractGroup__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalMSL.g:1349:1: rule__AbstractGroup__Group__6__Impl : ( ( rule__AbstractGroup__ComponentsAssignment_6 ) ) ;
    public final void rule__AbstractGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1353:1: ( ( ( rule__AbstractGroup__ComponentsAssignment_6 ) ) )
            // InternalMSL.g:1354:1: ( ( rule__AbstractGroup__ComponentsAssignment_6 ) )
            {
            // InternalMSL.g:1354:1: ( ( rule__AbstractGroup__ComponentsAssignment_6 ) )
            // InternalMSL.g:1355:2: ( rule__AbstractGroup__ComponentsAssignment_6 )
            {
             before(grammarAccess.getAbstractGroupAccess().getComponentsAssignment_6()); 
            // InternalMSL.g:1356:2: ( rule__AbstractGroup__ComponentsAssignment_6 )
            // InternalMSL.g:1356:3: rule__AbstractGroup__ComponentsAssignment_6
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
    // InternalMSL.g:1364:1: rule__AbstractGroup__Group__7 : rule__AbstractGroup__Group__7__Impl rule__AbstractGroup__Group__8 ;
    public final void rule__AbstractGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1368:1: ( rule__AbstractGroup__Group__7__Impl rule__AbstractGroup__Group__8 )
            // InternalMSL.g:1369:2: rule__AbstractGroup__Group__7__Impl rule__AbstractGroup__Group__8
            {
            pushFollow(FOLLOW_20);
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
    // InternalMSL.g:1376:1: rule__AbstractGroup__Group__7__Impl : ( ( rule__AbstractGroup__Group_7__0 )* ) ;
    public final void rule__AbstractGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1380:1: ( ( ( rule__AbstractGroup__Group_7__0 )* ) )
            // InternalMSL.g:1381:1: ( ( rule__AbstractGroup__Group_7__0 )* )
            {
            // InternalMSL.g:1381:1: ( ( rule__AbstractGroup__Group_7__0 )* )
            // InternalMSL.g:1382:2: ( rule__AbstractGroup__Group_7__0 )*
            {
             before(grammarAccess.getAbstractGroupAccess().getGroup_7()); 
            // InternalMSL.g:1383:2: ( rule__AbstractGroup__Group_7__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMSL.g:1383:3: rule__AbstractGroup__Group_7__0
            	    {
            	    pushFollow(FOLLOW_21);
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
    // InternalMSL.g:1391:1: rule__AbstractGroup__Group__8 : rule__AbstractGroup__Group__8__Impl ;
    public final void rule__AbstractGroup__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1395:1: ( rule__AbstractGroup__Group__8__Impl )
            // InternalMSL.g:1396:2: rule__AbstractGroup__Group__8__Impl
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
    // InternalMSL.g:1402:1: rule__AbstractGroup__Group__8__Impl : ( '}' ) ;
    public final void rule__AbstractGroup__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1406:1: ( ( '}' ) )
            // InternalMSL.g:1407:1: ( '}' )
            {
            // InternalMSL.g:1407:1: ( '}' )
            // InternalMSL.g:1408:2: '}'
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
    // InternalMSL.g:1418:1: rule__AbstractGroup__Group_3__0 : rule__AbstractGroup__Group_3__0__Impl rule__AbstractGroup__Group_3__1 ;
    public final void rule__AbstractGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1422:1: ( rule__AbstractGroup__Group_3__0__Impl rule__AbstractGroup__Group_3__1 )
            // InternalMSL.g:1423:2: rule__AbstractGroup__Group_3__0__Impl rule__AbstractGroup__Group_3__1
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
    // InternalMSL.g:1430:1: rule__AbstractGroup__Group_3__0__Impl : ( 'managedSyS' ) ;
    public final void rule__AbstractGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1434:1: ( ( 'managedSyS' ) )
            // InternalMSL.g:1435:1: ( 'managedSyS' )
            {
            // InternalMSL.g:1435:1: ( 'managedSyS' )
            // InternalMSL.g:1436:2: 'managedSyS'
            {
             before(grammarAccess.getAbstractGroupAccess().getManagedSySKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMSL.g:1445:1: rule__AbstractGroup__Group_3__1 : rule__AbstractGroup__Group_3__1__Impl rule__AbstractGroup__Group_3__2 ;
    public final void rule__AbstractGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1449:1: ( rule__AbstractGroup__Group_3__1__Impl rule__AbstractGroup__Group_3__2 )
            // InternalMSL.g:1450:2: rule__AbstractGroup__Group_3__1__Impl rule__AbstractGroup__Group_3__2
            {
            pushFollow(FOLLOW_13);
            rule__AbstractGroup__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group_3__2();

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
    // InternalMSL.g:1457:1: rule__AbstractGroup__Group_3__1__Impl : ( ( rule__AbstractGroup__ManSysAssignment_3_1 ) ) ;
    public final void rule__AbstractGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1461:1: ( ( ( rule__AbstractGroup__ManSysAssignment_3_1 ) ) )
            // InternalMSL.g:1462:1: ( ( rule__AbstractGroup__ManSysAssignment_3_1 ) )
            {
            // InternalMSL.g:1462:1: ( ( rule__AbstractGroup__ManSysAssignment_3_1 ) )
            // InternalMSL.g:1463:2: ( rule__AbstractGroup__ManSysAssignment_3_1 )
            {
             before(grammarAccess.getAbstractGroupAccess().getManSysAssignment_3_1()); 
            // InternalMSL.g:1464:2: ( rule__AbstractGroup__ManSysAssignment_3_1 )
            // InternalMSL.g:1464:3: rule__AbstractGroup__ManSysAssignment_3_1
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


    // $ANTLR start "rule__AbstractGroup__Group_3__2"
    // InternalMSL.g:1472:1: rule__AbstractGroup__Group_3__2 : rule__AbstractGroup__Group_3__2__Impl ;
    public final void rule__AbstractGroup__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1476:1: ( rule__AbstractGroup__Group_3__2__Impl )
            // InternalMSL.g:1477:2: rule__AbstractGroup__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group_3__2__Impl();

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
    // $ANTLR end "rule__AbstractGroup__Group_3__2"


    // $ANTLR start "rule__AbstractGroup__Group_3__2__Impl"
    // InternalMSL.g:1483:1: rule__AbstractGroup__Group_3__2__Impl : ( ( rule__AbstractGroup__Group_3_2__0 )? ) ;
    public final void rule__AbstractGroup__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1487:1: ( ( ( rule__AbstractGroup__Group_3_2__0 )? ) )
            // InternalMSL.g:1488:1: ( ( rule__AbstractGroup__Group_3_2__0 )? )
            {
            // InternalMSL.g:1488:1: ( ( rule__AbstractGroup__Group_3_2__0 )? )
            // InternalMSL.g:1489:2: ( rule__AbstractGroup__Group_3_2__0 )?
            {
             before(grammarAccess.getAbstractGroupAccess().getGroup_3_2()); 
            // InternalMSL.g:1490:2: ( rule__AbstractGroup__Group_3_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMSL.g:1490:3: rule__AbstractGroup__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractGroup__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbstractGroupAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_3__2__Impl"


    // $ANTLR start "rule__AbstractGroup__Group_3_2__0"
    // InternalMSL.g:1499:1: rule__AbstractGroup__Group_3_2__0 : rule__AbstractGroup__Group_3_2__0__Impl rule__AbstractGroup__Group_3_2__1 ;
    public final void rule__AbstractGroup__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1503:1: ( rule__AbstractGroup__Group_3_2__0__Impl rule__AbstractGroup__Group_3_2__1 )
            // InternalMSL.g:1504:2: rule__AbstractGroup__Group_3_2__0__Impl rule__AbstractGroup__Group_3_2__1
            {
            pushFollow(FOLLOW_17);
            rule__AbstractGroup__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group_3_2__1();

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
    // $ANTLR end "rule__AbstractGroup__Group_3_2__0"


    // $ANTLR start "rule__AbstractGroup__Group_3_2__0__Impl"
    // InternalMSL.g:1511:1: rule__AbstractGroup__Group_3_2__0__Impl : ( '[' ) ;
    public final void rule__AbstractGroup__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1515:1: ( ( '[' ) )
            // InternalMSL.g:1516:1: ( '[' )
            {
            // InternalMSL.g:1516:1: ( '[' )
            // InternalMSL.g:1517:2: '['
            {
             before(grammarAccess.getAbstractGroupAccess().getLeftSquareBracketKeyword_3_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAbstractGroupAccess().getLeftSquareBracketKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_3_2__0__Impl"


    // $ANTLR start "rule__AbstractGroup__Group_3_2__1"
    // InternalMSL.g:1526:1: rule__AbstractGroup__Group_3_2__1 : rule__AbstractGroup__Group_3_2__1__Impl rule__AbstractGroup__Group_3_2__2 ;
    public final void rule__AbstractGroup__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1530:1: ( rule__AbstractGroup__Group_3_2__1__Impl rule__AbstractGroup__Group_3_2__2 )
            // InternalMSL.g:1531:2: rule__AbstractGroup__Group_3_2__1__Impl rule__AbstractGroup__Group_3_2__2
            {
            pushFollow(FOLLOW_22);
            rule__AbstractGroup__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group_3_2__2();

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
    // $ANTLR end "rule__AbstractGroup__Group_3_2__1"


    // $ANTLR start "rule__AbstractGroup__Group_3_2__1__Impl"
    // InternalMSL.g:1538:1: rule__AbstractGroup__Group_3_2__1__Impl : ( ( rule__AbstractGroup__AttValuesAssignment_3_2_1 ) ) ;
    public final void rule__AbstractGroup__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1542:1: ( ( ( rule__AbstractGroup__AttValuesAssignment_3_2_1 ) ) )
            // InternalMSL.g:1543:1: ( ( rule__AbstractGroup__AttValuesAssignment_3_2_1 ) )
            {
            // InternalMSL.g:1543:1: ( ( rule__AbstractGroup__AttValuesAssignment_3_2_1 ) )
            // InternalMSL.g:1544:2: ( rule__AbstractGroup__AttValuesAssignment_3_2_1 )
            {
             before(grammarAccess.getAbstractGroupAccess().getAttValuesAssignment_3_2_1()); 
            // InternalMSL.g:1545:2: ( rule__AbstractGroup__AttValuesAssignment_3_2_1 )
            // InternalMSL.g:1545:3: rule__AbstractGroup__AttValuesAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AbstractGroup__AttValuesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAbstractGroupAccess().getAttValuesAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_3_2__1__Impl"


    // $ANTLR start "rule__AbstractGroup__Group_3_2__2"
    // InternalMSL.g:1553:1: rule__AbstractGroup__Group_3_2__2 : rule__AbstractGroup__Group_3_2__2__Impl rule__AbstractGroup__Group_3_2__3 ;
    public final void rule__AbstractGroup__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1557:1: ( rule__AbstractGroup__Group_3_2__2__Impl rule__AbstractGroup__Group_3_2__3 )
            // InternalMSL.g:1558:2: rule__AbstractGroup__Group_3_2__2__Impl rule__AbstractGroup__Group_3_2__3
            {
            pushFollow(FOLLOW_22);
            rule__AbstractGroup__Group_3_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group_3_2__3();

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
    // $ANTLR end "rule__AbstractGroup__Group_3_2__2"


    // $ANTLR start "rule__AbstractGroup__Group_3_2__2__Impl"
    // InternalMSL.g:1565:1: rule__AbstractGroup__Group_3_2__2__Impl : ( ( rule__AbstractGroup__Group_3_2_2__0 )* ) ;
    public final void rule__AbstractGroup__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1569:1: ( ( ( rule__AbstractGroup__Group_3_2_2__0 )* ) )
            // InternalMSL.g:1570:1: ( ( rule__AbstractGroup__Group_3_2_2__0 )* )
            {
            // InternalMSL.g:1570:1: ( ( rule__AbstractGroup__Group_3_2_2__0 )* )
            // InternalMSL.g:1571:2: ( rule__AbstractGroup__Group_3_2_2__0 )*
            {
             before(grammarAccess.getAbstractGroupAccess().getGroup_3_2_2()); 
            // InternalMSL.g:1572:2: ( rule__AbstractGroup__Group_3_2_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMSL.g:1572:3: rule__AbstractGroup__Group_3_2_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__AbstractGroup__Group_3_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAbstractGroupAccess().getGroup_3_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_3_2__2__Impl"


    // $ANTLR start "rule__AbstractGroup__Group_3_2__3"
    // InternalMSL.g:1580:1: rule__AbstractGroup__Group_3_2__3 : rule__AbstractGroup__Group_3_2__3__Impl ;
    public final void rule__AbstractGroup__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1584:1: ( rule__AbstractGroup__Group_3_2__3__Impl )
            // InternalMSL.g:1585:2: rule__AbstractGroup__Group_3_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group_3_2__3__Impl();

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
    // $ANTLR end "rule__AbstractGroup__Group_3_2__3"


    // $ANTLR start "rule__AbstractGroup__Group_3_2__3__Impl"
    // InternalMSL.g:1591:1: rule__AbstractGroup__Group_3_2__3__Impl : ( ']' ) ;
    public final void rule__AbstractGroup__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1595:1: ( ( ']' ) )
            // InternalMSL.g:1596:1: ( ']' )
            {
            // InternalMSL.g:1596:1: ( ']' )
            // InternalMSL.g:1597:2: ']'
            {
             before(grammarAccess.getAbstractGroupAccess().getRightSquareBracketKeyword_3_2_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAbstractGroupAccess().getRightSquareBracketKeyword_3_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_3_2__3__Impl"


    // $ANTLR start "rule__AbstractGroup__Group_3_2_2__0"
    // InternalMSL.g:1607:1: rule__AbstractGroup__Group_3_2_2__0 : rule__AbstractGroup__Group_3_2_2__0__Impl rule__AbstractGroup__Group_3_2_2__1 ;
    public final void rule__AbstractGroup__Group_3_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1611:1: ( rule__AbstractGroup__Group_3_2_2__0__Impl rule__AbstractGroup__Group_3_2_2__1 )
            // InternalMSL.g:1612:2: rule__AbstractGroup__Group_3_2_2__0__Impl rule__AbstractGroup__Group_3_2_2__1
            {
            pushFollow(FOLLOW_17);
            rule__AbstractGroup__Group_3_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group_3_2_2__1();

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
    // $ANTLR end "rule__AbstractGroup__Group_3_2_2__0"


    // $ANTLR start "rule__AbstractGroup__Group_3_2_2__0__Impl"
    // InternalMSL.g:1619:1: rule__AbstractGroup__Group_3_2_2__0__Impl : ( ',' ) ;
    public final void rule__AbstractGroup__Group_3_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1623:1: ( ( ',' ) )
            // InternalMSL.g:1624:1: ( ',' )
            {
            // InternalMSL.g:1624:1: ( ',' )
            // InternalMSL.g:1625:2: ','
            {
             before(grammarAccess.getAbstractGroupAccess().getCommaKeyword_3_2_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAbstractGroupAccess().getCommaKeyword_3_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_3_2_2__0__Impl"


    // $ANTLR start "rule__AbstractGroup__Group_3_2_2__1"
    // InternalMSL.g:1634:1: rule__AbstractGroup__Group_3_2_2__1 : rule__AbstractGroup__Group_3_2_2__1__Impl ;
    public final void rule__AbstractGroup__Group_3_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1638:1: ( rule__AbstractGroup__Group_3_2_2__1__Impl )
            // InternalMSL.g:1639:2: rule__AbstractGroup__Group_3_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractGroup__Group_3_2_2__1__Impl();

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
    // $ANTLR end "rule__AbstractGroup__Group_3_2_2__1"


    // $ANTLR start "rule__AbstractGroup__Group_3_2_2__1__Impl"
    // InternalMSL.g:1645:1: rule__AbstractGroup__Group_3_2_2__1__Impl : ( ( rule__AbstractGroup__AttValuesAssignment_3_2_2_1 ) ) ;
    public final void rule__AbstractGroup__Group_3_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1649:1: ( ( ( rule__AbstractGroup__AttValuesAssignment_3_2_2_1 ) ) )
            // InternalMSL.g:1650:1: ( ( rule__AbstractGroup__AttValuesAssignment_3_2_2_1 ) )
            {
            // InternalMSL.g:1650:1: ( ( rule__AbstractGroup__AttValuesAssignment_3_2_2_1 ) )
            // InternalMSL.g:1651:2: ( rule__AbstractGroup__AttValuesAssignment_3_2_2_1 )
            {
             before(grammarAccess.getAbstractGroupAccess().getAttValuesAssignment_3_2_2_1()); 
            // InternalMSL.g:1652:2: ( rule__AbstractGroup__AttValuesAssignment_3_2_2_1 )
            // InternalMSL.g:1652:3: rule__AbstractGroup__AttValuesAssignment_3_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AbstractGroup__AttValuesAssignment_3_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAbstractGroupAccess().getAttValuesAssignment_3_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__Group_3_2_2__1__Impl"


    // $ANTLR start "rule__AbstractGroup__Group_4__0"
    // InternalMSL.g:1661:1: rule__AbstractGroup__Group_4__0 : rule__AbstractGroup__Group_4__0__Impl rule__AbstractGroup__Group_4__1 ;
    public final void rule__AbstractGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1665:1: ( rule__AbstractGroup__Group_4__0__Impl rule__AbstractGroup__Group_4__1 )
            // InternalMSL.g:1666:2: rule__AbstractGroup__Group_4__0__Impl rule__AbstractGroup__Group_4__1
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
    // InternalMSL.g:1673:1: rule__AbstractGroup__Group_4__0__Impl : ( 'managedGrp' ) ;
    public final void rule__AbstractGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1677:1: ( ( 'managedGrp' ) )
            // InternalMSL.g:1678:1: ( 'managedGrp' )
            {
            // InternalMSL.g:1678:1: ( 'managedGrp' )
            // InternalMSL.g:1679:2: 'managedGrp'
            {
             before(grammarAccess.getAbstractGroupAccess().getManagedGrpKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMSL.g:1688:1: rule__AbstractGroup__Group_4__1 : rule__AbstractGroup__Group_4__1__Impl rule__AbstractGroup__Group_4__2 ;
    public final void rule__AbstractGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1692:1: ( rule__AbstractGroup__Group_4__1__Impl rule__AbstractGroup__Group_4__2 )
            // InternalMSL.g:1693:2: rule__AbstractGroup__Group_4__1__Impl rule__AbstractGroup__Group_4__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMSL.g:1700:1: rule__AbstractGroup__Group_4__1__Impl : ( ( rule__AbstractGroup__ManGrpAssignment_4_1 ) ) ;
    public final void rule__AbstractGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1704:1: ( ( ( rule__AbstractGroup__ManGrpAssignment_4_1 ) ) )
            // InternalMSL.g:1705:1: ( ( rule__AbstractGroup__ManGrpAssignment_4_1 ) )
            {
            // InternalMSL.g:1705:1: ( ( rule__AbstractGroup__ManGrpAssignment_4_1 ) )
            // InternalMSL.g:1706:2: ( rule__AbstractGroup__ManGrpAssignment_4_1 )
            {
             before(grammarAccess.getAbstractGroupAccess().getManGrpAssignment_4_1()); 
            // InternalMSL.g:1707:2: ( rule__AbstractGroup__ManGrpAssignment_4_1 )
            // InternalMSL.g:1707:3: rule__AbstractGroup__ManGrpAssignment_4_1
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
    // InternalMSL.g:1715:1: rule__AbstractGroup__Group_4__2 : rule__AbstractGroup__Group_4__2__Impl ;
    public final void rule__AbstractGroup__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1719:1: ( rule__AbstractGroup__Group_4__2__Impl )
            // InternalMSL.g:1720:2: rule__AbstractGroup__Group_4__2__Impl
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
    // InternalMSL.g:1726:1: rule__AbstractGroup__Group_4__2__Impl : ( ( rule__AbstractGroup__Group_4_2__0 )* ) ;
    public final void rule__AbstractGroup__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1730:1: ( ( ( rule__AbstractGroup__Group_4_2__0 )* ) )
            // InternalMSL.g:1731:1: ( ( rule__AbstractGroup__Group_4_2__0 )* )
            {
            // InternalMSL.g:1731:1: ( ( rule__AbstractGroup__Group_4_2__0 )* )
            // InternalMSL.g:1732:2: ( rule__AbstractGroup__Group_4_2__0 )*
            {
             before(grammarAccess.getAbstractGroupAccess().getGroup_4_2()); 
            // InternalMSL.g:1733:2: ( rule__AbstractGroup__Group_4_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMSL.g:1733:3: rule__AbstractGroup__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__AbstractGroup__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMSL.g:1742:1: rule__AbstractGroup__Group_4_2__0 : rule__AbstractGroup__Group_4_2__0__Impl rule__AbstractGroup__Group_4_2__1 ;
    public final void rule__AbstractGroup__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1746:1: ( rule__AbstractGroup__Group_4_2__0__Impl rule__AbstractGroup__Group_4_2__1 )
            // InternalMSL.g:1747:2: rule__AbstractGroup__Group_4_2__0__Impl rule__AbstractGroup__Group_4_2__1
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
    // InternalMSL.g:1754:1: rule__AbstractGroup__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__AbstractGroup__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1758:1: ( ( ',' ) )
            // InternalMSL.g:1759:1: ( ',' )
            {
            // InternalMSL.g:1759:1: ( ',' )
            // InternalMSL.g:1760:2: ','
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
    // InternalMSL.g:1769:1: rule__AbstractGroup__Group_4_2__1 : rule__AbstractGroup__Group_4_2__1__Impl ;
    public final void rule__AbstractGroup__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1773:1: ( rule__AbstractGroup__Group_4_2__1__Impl )
            // InternalMSL.g:1774:2: rule__AbstractGroup__Group_4_2__1__Impl
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
    // InternalMSL.g:1780:1: rule__AbstractGroup__Group_4_2__1__Impl : ( ( rule__AbstractGroup__ManGrpAssignment_4_2_1 ) ) ;
    public final void rule__AbstractGroup__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1784:1: ( ( ( rule__AbstractGroup__ManGrpAssignment_4_2_1 ) ) )
            // InternalMSL.g:1785:1: ( ( rule__AbstractGroup__ManGrpAssignment_4_2_1 ) )
            {
            // InternalMSL.g:1785:1: ( ( rule__AbstractGroup__ManGrpAssignment_4_2_1 ) )
            // InternalMSL.g:1786:2: ( rule__AbstractGroup__ManGrpAssignment_4_2_1 )
            {
             before(grammarAccess.getAbstractGroupAccess().getManGrpAssignment_4_2_1()); 
            // InternalMSL.g:1787:2: ( rule__AbstractGroup__ManGrpAssignment_4_2_1 )
            // InternalMSL.g:1787:3: rule__AbstractGroup__ManGrpAssignment_4_2_1
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
    // InternalMSL.g:1796:1: rule__AbstractGroup__Group_7__0 : rule__AbstractGroup__Group_7__0__Impl rule__AbstractGroup__Group_7__1 ;
    public final void rule__AbstractGroup__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1800:1: ( rule__AbstractGroup__Group_7__0__Impl rule__AbstractGroup__Group_7__1 )
            // InternalMSL.g:1801:2: rule__AbstractGroup__Group_7__0__Impl rule__AbstractGroup__Group_7__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMSL.g:1808:1: rule__AbstractGroup__Group_7__0__Impl : ( ',' ) ;
    public final void rule__AbstractGroup__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1812:1: ( ( ',' ) )
            // InternalMSL.g:1813:1: ( ',' )
            {
            // InternalMSL.g:1813:1: ( ',' )
            // InternalMSL.g:1814:2: ','
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
    // InternalMSL.g:1823:1: rule__AbstractGroup__Group_7__1 : rule__AbstractGroup__Group_7__1__Impl ;
    public final void rule__AbstractGroup__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1827:1: ( rule__AbstractGroup__Group_7__1__Impl )
            // InternalMSL.g:1828:2: rule__AbstractGroup__Group_7__1__Impl
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
    // InternalMSL.g:1834:1: rule__AbstractGroup__Group_7__1__Impl : ( ( rule__AbstractGroup__ComponentsAssignment_7_1 ) ) ;
    public final void rule__AbstractGroup__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1838:1: ( ( ( rule__AbstractGroup__ComponentsAssignment_7_1 ) ) )
            // InternalMSL.g:1839:1: ( ( rule__AbstractGroup__ComponentsAssignment_7_1 ) )
            {
            // InternalMSL.g:1839:1: ( ( rule__AbstractGroup__ComponentsAssignment_7_1 ) )
            // InternalMSL.g:1840:2: ( rule__AbstractGroup__ComponentsAssignment_7_1 )
            {
             before(grammarAccess.getAbstractGroupAccess().getComponentsAssignment_7_1()); 
            // InternalMSL.g:1841:2: ( rule__AbstractGroup__ComponentsAssignment_7_1 )
            // InternalMSL.g:1841:3: rule__AbstractGroup__ComponentsAssignment_7_1
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
    // InternalMSL.g:1850:1: rule__AbstractInteraction__Group__0 : rule__AbstractInteraction__Group__0__Impl rule__AbstractInteraction__Group__1 ;
    public final void rule__AbstractInteraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1854:1: ( rule__AbstractInteraction__Group__0__Impl rule__AbstractInteraction__Group__1 )
            // InternalMSL.g:1855:2: rule__AbstractInteraction__Group__0__Impl rule__AbstractInteraction__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMSL.g:1862:1: rule__AbstractInteraction__Group__0__Impl : ( 'interaction' ) ;
    public final void rule__AbstractInteraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1866:1: ( ( 'interaction' ) )
            // InternalMSL.g:1867:1: ( 'interaction' )
            {
            // InternalMSL.g:1867:1: ( 'interaction' )
            // InternalMSL.g:1868:2: 'interaction'
            {
             before(grammarAccess.getAbstractInteractionAccess().getInteractionKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMSL.g:1877:1: rule__AbstractInteraction__Group__1 : rule__AbstractInteraction__Group__1__Impl rule__AbstractInteraction__Group__2 ;
    public final void rule__AbstractInteraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1881:1: ( rule__AbstractInteraction__Group__1__Impl rule__AbstractInteraction__Group__2 )
            // InternalMSL.g:1882:2: rule__AbstractInteraction__Group__1__Impl rule__AbstractInteraction__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalMSL.g:1889:1: rule__AbstractInteraction__Group__1__Impl : ( ( rule__AbstractInteraction__StartAssignment_1 ) ) ;
    public final void rule__AbstractInteraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1893:1: ( ( ( rule__AbstractInteraction__StartAssignment_1 ) ) )
            // InternalMSL.g:1894:1: ( ( rule__AbstractInteraction__StartAssignment_1 ) )
            {
            // InternalMSL.g:1894:1: ( ( rule__AbstractInteraction__StartAssignment_1 ) )
            // InternalMSL.g:1895:2: ( rule__AbstractInteraction__StartAssignment_1 )
            {
             before(grammarAccess.getAbstractInteractionAccess().getStartAssignment_1()); 
            // InternalMSL.g:1896:2: ( rule__AbstractInteraction__StartAssignment_1 )
            // InternalMSL.g:1896:3: rule__AbstractInteraction__StartAssignment_1
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
    // InternalMSL.g:1904:1: rule__AbstractInteraction__Group__2 : rule__AbstractInteraction__Group__2__Impl rule__AbstractInteraction__Group__3 ;
    public final void rule__AbstractInteraction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1908:1: ( rule__AbstractInteraction__Group__2__Impl rule__AbstractInteraction__Group__3 )
            // InternalMSL.g:1909:2: rule__AbstractInteraction__Group__2__Impl rule__AbstractInteraction__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalMSL.g:1916:1: rule__AbstractInteraction__Group__2__Impl : ( '->' ) ;
    public final void rule__AbstractInteraction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1920:1: ( ( '->' ) )
            // InternalMSL.g:1921:1: ( '->' )
            {
            // InternalMSL.g:1921:1: ( '->' )
            // InternalMSL.g:1922:2: '->'
            {
             before(grammarAccess.getAbstractInteractionAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMSL.g:1931:1: rule__AbstractInteraction__Group__3 : rule__AbstractInteraction__Group__3__Impl rule__AbstractInteraction__Group__4 ;
    public final void rule__AbstractInteraction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1935:1: ( rule__AbstractInteraction__Group__3__Impl rule__AbstractInteraction__Group__4 )
            // InternalMSL.g:1936:2: rule__AbstractInteraction__Group__3__Impl rule__AbstractInteraction__Group__4
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
    // InternalMSL.g:1943:1: rule__AbstractInteraction__Group__3__Impl : ( ( rule__AbstractInteraction__EndAssignment_3 ) ) ;
    public final void rule__AbstractInteraction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1947:1: ( ( ( rule__AbstractInteraction__EndAssignment_3 ) ) )
            // InternalMSL.g:1948:1: ( ( rule__AbstractInteraction__EndAssignment_3 ) )
            {
            // InternalMSL.g:1948:1: ( ( rule__AbstractInteraction__EndAssignment_3 ) )
            // InternalMSL.g:1949:2: ( rule__AbstractInteraction__EndAssignment_3 )
            {
             before(grammarAccess.getAbstractInteractionAccess().getEndAssignment_3()); 
            // InternalMSL.g:1950:2: ( rule__AbstractInteraction__EndAssignment_3 )
            // InternalMSL.g:1950:3: rule__AbstractInteraction__EndAssignment_3
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
    // InternalMSL.g:1958:1: rule__AbstractInteraction__Group__4 : rule__AbstractInteraction__Group__4__Impl ;
    public final void rule__AbstractInteraction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1962:1: ( rule__AbstractInteraction__Group__4__Impl )
            // InternalMSL.g:1963:2: rule__AbstractInteraction__Group__4__Impl
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
    // InternalMSL.g:1969:1: rule__AbstractInteraction__Group__4__Impl : ( ( rule__AbstractInteraction__Group_4__0 )? ) ;
    public final void rule__AbstractInteraction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1973:1: ( ( ( rule__AbstractInteraction__Group_4__0 )? ) )
            // InternalMSL.g:1974:1: ( ( rule__AbstractInteraction__Group_4__0 )? )
            {
            // InternalMSL.g:1974:1: ( ( rule__AbstractInteraction__Group_4__0 )? )
            // InternalMSL.g:1975:2: ( rule__AbstractInteraction__Group_4__0 )?
            {
             before(grammarAccess.getAbstractInteractionAccess().getGroup_4()); 
            // InternalMSL.g:1976:2: ( rule__AbstractInteraction__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMSL.g:1976:3: rule__AbstractInteraction__Group_4__0
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
    // InternalMSL.g:1985:1: rule__AbstractInteraction__Group_4__0 : rule__AbstractInteraction__Group_4__0__Impl rule__AbstractInteraction__Group_4__1 ;
    public final void rule__AbstractInteraction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:1989:1: ( rule__AbstractInteraction__Group_4__0__Impl rule__AbstractInteraction__Group_4__1 )
            // InternalMSL.g:1990:2: rule__AbstractInteraction__Group_4__0__Impl rule__AbstractInteraction__Group_4__1
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
    // InternalMSL.g:1997:1: rule__AbstractInteraction__Group_4__0__Impl : ( '[' ) ;
    public final void rule__AbstractInteraction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2001:1: ( ( '[' ) )
            // InternalMSL.g:2002:1: ( '[' )
            {
            // InternalMSL.g:2002:1: ( '[' )
            // InternalMSL.g:2003:2: '['
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
    // InternalMSL.g:2012:1: rule__AbstractInteraction__Group_4__1 : rule__AbstractInteraction__Group_4__1__Impl rule__AbstractInteraction__Group_4__2 ;
    public final void rule__AbstractInteraction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2016:1: ( rule__AbstractInteraction__Group_4__1__Impl rule__AbstractInteraction__Group_4__2 )
            // InternalMSL.g:2017:2: rule__AbstractInteraction__Group_4__1__Impl rule__AbstractInteraction__Group_4__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMSL.g:2024:1: rule__AbstractInteraction__Group_4__1__Impl : ( ( rule__AbstractInteraction__LowAssignment_4_1 ) ) ;
    public final void rule__AbstractInteraction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2028:1: ( ( ( rule__AbstractInteraction__LowAssignment_4_1 ) ) )
            // InternalMSL.g:2029:1: ( ( rule__AbstractInteraction__LowAssignment_4_1 ) )
            {
            // InternalMSL.g:2029:1: ( ( rule__AbstractInteraction__LowAssignment_4_1 ) )
            // InternalMSL.g:2030:2: ( rule__AbstractInteraction__LowAssignment_4_1 )
            {
             before(grammarAccess.getAbstractInteractionAccess().getLowAssignment_4_1()); 
            // InternalMSL.g:2031:2: ( rule__AbstractInteraction__LowAssignment_4_1 )
            // InternalMSL.g:2031:3: rule__AbstractInteraction__LowAssignment_4_1
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
    // InternalMSL.g:2039:1: rule__AbstractInteraction__Group_4__2 : rule__AbstractInteraction__Group_4__2__Impl rule__AbstractInteraction__Group_4__3 ;
    public final void rule__AbstractInteraction__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2043:1: ( rule__AbstractInteraction__Group_4__2__Impl rule__AbstractInteraction__Group_4__3 )
            // InternalMSL.g:2044:2: rule__AbstractInteraction__Group_4__2__Impl rule__AbstractInteraction__Group_4__3
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
    // InternalMSL.g:2051:1: rule__AbstractInteraction__Group_4__2__Impl : ( ',' ) ;
    public final void rule__AbstractInteraction__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2055:1: ( ( ',' ) )
            // InternalMSL.g:2056:1: ( ',' )
            {
            // InternalMSL.g:2056:1: ( ',' )
            // InternalMSL.g:2057:2: ','
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
    // InternalMSL.g:2066:1: rule__AbstractInteraction__Group_4__3 : rule__AbstractInteraction__Group_4__3__Impl rule__AbstractInteraction__Group_4__4 ;
    public final void rule__AbstractInteraction__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2070:1: ( rule__AbstractInteraction__Group_4__3__Impl rule__AbstractInteraction__Group_4__4 )
            // InternalMSL.g:2071:2: rule__AbstractInteraction__Group_4__3__Impl rule__AbstractInteraction__Group_4__4
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
    // InternalMSL.g:2078:1: rule__AbstractInteraction__Group_4__3__Impl : ( ( rule__AbstractInteraction__HighAssignment_4_3 ) ) ;
    public final void rule__AbstractInteraction__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2082:1: ( ( ( rule__AbstractInteraction__HighAssignment_4_3 ) ) )
            // InternalMSL.g:2083:1: ( ( rule__AbstractInteraction__HighAssignment_4_3 ) )
            {
            // InternalMSL.g:2083:1: ( ( rule__AbstractInteraction__HighAssignment_4_3 ) )
            // InternalMSL.g:2084:2: ( rule__AbstractInteraction__HighAssignment_4_3 )
            {
             before(grammarAccess.getAbstractInteractionAccess().getHighAssignment_4_3()); 
            // InternalMSL.g:2085:2: ( rule__AbstractInteraction__HighAssignment_4_3 )
            // InternalMSL.g:2085:3: rule__AbstractInteraction__HighAssignment_4_3
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
    // InternalMSL.g:2093:1: rule__AbstractInteraction__Group_4__4 : rule__AbstractInteraction__Group_4__4__Impl ;
    public final void rule__AbstractInteraction__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2097:1: ( rule__AbstractInteraction__Group_4__4__Impl )
            // InternalMSL.g:2098:2: rule__AbstractInteraction__Group_4__4__Impl
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
    // InternalMSL.g:2104:1: rule__AbstractInteraction__Group_4__4__Impl : ( ']' ) ;
    public final void rule__AbstractInteraction__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2108:1: ( ( ']' ) )
            // InternalMSL.g:2109:1: ( ']' )
            {
            // InternalMSL.g:2109:1: ( ']' )
            // InternalMSL.g:2110:2: ']'
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
    // InternalMSL.g:2120:1: rule__SystemBinding__Group__0 : rule__SystemBinding__Group__0__Impl rule__SystemBinding__Group__1 ;
    public final void rule__SystemBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2124:1: ( rule__SystemBinding__Group__0__Impl rule__SystemBinding__Group__1 )
            // InternalMSL.g:2125:2: rule__SystemBinding__Group__0__Impl rule__SystemBinding__Group__1
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
    // InternalMSL.g:2132:1: rule__SystemBinding__Group__0__Impl : ( 'system' ) ;
    public final void rule__SystemBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2136:1: ( ( 'system' ) )
            // InternalMSL.g:2137:1: ( 'system' )
            {
            // InternalMSL.g:2137:1: ( 'system' )
            // InternalMSL.g:2138:2: 'system'
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
    // InternalMSL.g:2147:1: rule__SystemBinding__Group__1 : rule__SystemBinding__Group__1__Impl rule__SystemBinding__Group__2 ;
    public final void rule__SystemBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2151:1: ( rule__SystemBinding__Group__1__Impl rule__SystemBinding__Group__2 )
            // InternalMSL.g:2152:2: rule__SystemBinding__Group__1__Impl rule__SystemBinding__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMSL.g:2159:1: rule__SystemBinding__Group__1__Impl : ( ( rule__SystemBinding__NameAssignment_1 ) ) ;
    public final void rule__SystemBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2163:1: ( ( ( rule__SystemBinding__NameAssignment_1 ) ) )
            // InternalMSL.g:2164:1: ( ( rule__SystemBinding__NameAssignment_1 ) )
            {
            // InternalMSL.g:2164:1: ( ( rule__SystemBinding__NameAssignment_1 ) )
            // InternalMSL.g:2165:2: ( rule__SystemBinding__NameAssignment_1 )
            {
             before(grammarAccess.getSystemBindingAccess().getNameAssignment_1()); 
            // InternalMSL.g:2166:2: ( rule__SystemBinding__NameAssignment_1 )
            // InternalMSL.g:2166:3: rule__SystemBinding__NameAssignment_1
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
    // InternalMSL.g:2174:1: rule__SystemBinding__Group__2 : rule__SystemBinding__Group__2__Impl rule__SystemBinding__Group__3 ;
    public final void rule__SystemBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2178:1: ( rule__SystemBinding__Group__2__Impl rule__SystemBinding__Group__3 )
            // InternalMSL.g:2179:2: rule__SystemBinding__Group__2__Impl rule__SystemBinding__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalMSL.g:2186:1: rule__SystemBinding__Group__2__Impl : ( ':' ) ;
    public final void rule__SystemBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2190:1: ( ( ':' ) )
            // InternalMSL.g:2191:1: ( ':' )
            {
            // InternalMSL.g:2191:1: ( ':' )
            // InternalMSL.g:2192:2: ':'
            {
             before(grammarAccess.getSystemBindingAccess().getColonKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMSL.g:2201:1: rule__SystemBinding__Group__3 : rule__SystemBinding__Group__3__Impl ;
    public final void rule__SystemBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2205:1: ( rule__SystemBinding__Group__3__Impl )
            // InternalMSL.g:2206:2: rule__SystemBinding__Group__3__Impl
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
    // InternalMSL.g:2212:1: rule__SystemBinding__Group__3__Impl : ( ( rule__SystemBinding__AbsSysAssignment_3 ) ) ;
    public final void rule__SystemBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2216:1: ( ( ( rule__SystemBinding__AbsSysAssignment_3 ) ) )
            // InternalMSL.g:2217:1: ( ( rule__SystemBinding__AbsSysAssignment_3 ) )
            {
            // InternalMSL.g:2217:1: ( ( rule__SystemBinding__AbsSysAssignment_3 ) )
            // InternalMSL.g:2218:2: ( rule__SystemBinding__AbsSysAssignment_3 )
            {
             before(grammarAccess.getSystemBindingAccess().getAbsSysAssignment_3()); 
            // InternalMSL.g:2219:2: ( rule__SystemBinding__AbsSysAssignment_3 )
            // InternalMSL.g:2219:3: rule__SystemBinding__AbsSysAssignment_3
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
    // InternalMSL.g:2228:1: rule__GroupBinding__Group__0 : rule__GroupBinding__Group__0__Impl rule__GroupBinding__Group__1 ;
    public final void rule__GroupBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2232:1: ( rule__GroupBinding__Group__0__Impl rule__GroupBinding__Group__1 )
            // InternalMSL.g:2233:2: rule__GroupBinding__Group__0__Impl rule__GroupBinding__Group__1
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
    // InternalMSL.g:2240:1: rule__GroupBinding__Group__0__Impl : ( 'group' ) ;
    public final void rule__GroupBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2244:1: ( ( 'group' ) )
            // InternalMSL.g:2245:1: ( 'group' )
            {
            // InternalMSL.g:2245:1: ( 'group' )
            // InternalMSL.g:2246:2: 'group'
            {
             before(grammarAccess.getGroupBindingAccess().getGroupKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMSL.g:2255:1: rule__GroupBinding__Group__1 : rule__GroupBinding__Group__1__Impl rule__GroupBinding__Group__2 ;
    public final void rule__GroupBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2259:1: ( rule__GroupBinding__Group__1__Impl rule__GroupBinding__Group__2 )
            // InternalMSL.g:2260:2: rule__GroupBinding__Group__1__Impl rule__GroupBinding__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMSL.g:2267:1: rule__GroupBinding__Group__1__Impl : ( ( rule__GroupBinding__NameAssignment_1 ) ) ;
    public final void rule__GroupBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2271:1: ( ( ( rule__GroupBinding__NameAssignment_1 ) ) )
            // InternalMSL.g:2272:1: ( ( rule__GroupBinding__NameAssignment_1 ) )
            {
            // InternalMSL.g:2272:1: ( ( rule__GroupBinding__NameAssignment_1 ) )
            // InternalMSL.g:2273:2: ( rule__GroupBinding__NameAssignment_1 )
            {
             before(grammarAccess.getGroupBindingAccess().getNameAssignment_1()); 
            // InternalMSL.g:2274:2: ( rule__GroupBinding__NameAssignment_1 )
            // InternalMSL.g:2274:3: rule__GroupBinding__NameAssignment_1
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
    // InternalMSL.g:2282:1: rule__GroupBinding__Group__2 : rule__GroupBinding__Group__2__Impl rule__GroupBinding__Group__3 ;
    public final void rule__GroupBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2286:1: ( rule__GroupBinding__Group__2__Impl rule__GroupBinding__Group__3 )
            // InternalMSL.g:2287:2: rule__GroupBinding__Group__2__Impl rule__GroupBinding__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalMSL.g:2294:1: rule__GroupBinding__Group__2__Impl : ( ':' ) ;
    public final void rule__GroupBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2298:1: ( ( ':' ) )
            // InternalMSL.g:2299:1: ( ':' )
            {
            // InternalMSL.g:2299:1: ( ':' )
            // InternalMSL.g:2300:2: ':'
            {
             before(grammarAccess.getGroupBindingAccess().getColonKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMSL.g:2309:1: rule__GroupBinding__Group__3 : rule__GroupBinding__Group__3__Impl ;
    public final void rule__GroupBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2313:1: ( rule__GroupBinding__Group__3__Impl )
            // InternalMSL.g:2314:2: rule__GroupBinding__Group__3__Impl
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
    // InternalMSL.g:2320:1: rule__GroupBinding__Group__3__Impl : ( ( rule__GroupBinding__AbsGroupAssignment_3 ) ) ;
    public final void rule__GroupBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2324:1: ( ( ( rule__GroupBinding__AbsGroupAssignment_3 ) ) )
            // InternalMSL.g:2325:1: ( ( rule__GroupBinding__AbsGroupAssignment_3 ) )
            {
            // InternalMSL.g:2325:1: ( ( rule__GroupBinding__AbsGroupAssignment_3 ) )
            // InternalMSL.g:2326:2: ( rule__GroupBinding__AbsGroupAssignment_3 )
            {
             before(grammarAccess.getGroupBindingAccess().getAbsGroupAssignment_3()); 
            // InternalMSL.g:2327:2: ( rule__GroupBinding__AbsGroupAssignment_3 )
            // InternalMSL.g:2327:3: rule__GroupBinding__AbsGroupAssignment_3
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
    // InternalMSL.g:2336:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2340:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalMSL.g:2341:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
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
    // InternalMSL.g:2348:1: rule__Pattern__Group__0__Impl : ( 'concrete' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2352:1: ( ( 'concrete' ) )
            // InternalMSL.g:2353:1: ( 'concrete' )
            {
            // InternalMSL.g:2353:1: ( 'concrete' )
            // InternalMSL.g:2354:2: 'concrete'
            {
             before(grammarAccess.getPatternAccess().getConcreteKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMSL.g:2363:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2367:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalMSL.g:2368:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
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
    // InternalMSL.g:2375:1: rule__Pattern__Group__1__Impl : ( 'pattern' ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2379:1: ( ( 'pattern' ) )
            // InternalMSL.g:2380:1: ( 'pattern' )
            {
            // InternalMSL.g:2380:1: ( 'pattern' )
            // InternalMSL.g:2381:2: 'pattern'
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
    // InternalMSL.g:2390:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2394:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalMSL.g:2395:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalMSL.g:2402:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__NameAssignment_2 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2406:1: ( ( ( rule__Pattern__NameAssignment_2 ) ) )
            // InternalMSL.g:2407:1: ( ( rule__Pattern__NameAssignment_2 ) )
            {
            // InternalMSL.g:2407:1: ( ( rule__Pattern__NameAssignment_2 ) )
            // InternalMSL.g:2408:2: ( rule__Pattern__NameAssignment_2 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_2()); 
            // InternalMSL.g:2409:2: ( rule__Pattern__NameAssignment_2 )
            // InternalMSL.g:2409:3: rule__Pattern__NameAssignment_2
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
    // InternalMSL.g:2417:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2421:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalMSL.g:2422:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
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
    // InternalMSL.g:2429:1: rule__Pattern__Group__3__Impl : ( 'concretizationOf' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2433:1: ( ( 'concretizationOf' ) )
            // InternalMSL.g:2434:1: ( 'concretizationOf' )
            {
            // InternalMSL.g:2434:1: ( 'concretizationOf' )
            // InternalMSL.g:2435:2: 'concretizationOf'
            {
             before(grammarAccess.getPatternAccess().getConcretizationOfKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMSL.g:2444:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2448:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalMSL.g:2449:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
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
    // InternalMSL.g:2456:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__AbsPatternAssignment_4 ) ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2460:1: ( ( ( rule__Pattern__AbsPatternAssignment_4 ) ) )
            // InternalMSL.g:2461:1: ( ( rule__Pattern__AbsPatternAssignment_4 ) )
            {
            // InternalMSL.g:2461:1: ( ( rule__Pattern__AbsPatternAssignment_4 ) )
            // InternalMSL.g:2462:2: ( rule__Pattern__AbsPatternAssignment_4 )
            {
             before(grammarAccess.getPatternAccess().getAbsPatternAssignment_4()); 
            // InternalMSL.g:2463:2: ( rule__Pattern__AbsPatternAssignment_4 )
            // InternalMSL.g:2463:3: rule__Pattern__AbsPatternAssignment_4
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
    // InternalMSL.g:2471:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl rule__Pattern__Group__6 ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2475:1: ( rule__Pattern__Group__5__Impl rule__Pattern__Group__6 )
            // InternalMSL.g:2476:2: rule__Pattern__Group__5__Impl rule__Pattern__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalMSL.g:2483:1: rule__Pattern__Group__5__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2487:1: ( ( '{' ) )
            // InternalMSL.g:2488:1: ( '{' )
            {
            // InternalMSL.g:2488:1: ( '{' )
            // InternalMSL.g:2489:2: '{'
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
    // InternalMSL.g:2498:1: rule__Pattern__Group__6 : rule__Pattern__Group__6__Impl rule__Pattern__Group__7 ;
    public final void rule__Pattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2502:1: ( rule__Pattern__Group__6__Impl rule__Pattern__Group__7 )
            // InternalMSL.g:2503:2: rule__Pattern__Group__6__Impl rule__Pattern__Group__7
            {
            pushFollow(FOLLOW_29);
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
    // InternalMSL.g:2510:1: rule__Pattern__Group__6__Impl : ( ( rule__Pattern__ManagedSystemsAssignment_6 )* ) ;
    public final void rule__Pattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2514:1: ( ( ( rule__Pattern__ManagedSystemsAssignment_6 )* ) )
            // InternalMSL.g:2515:1: ( ( rule__Pattern__ManagedSystemsAssignment_6 )* )
            {
            // InternalMSL.g:2515:1: ( ( rule__Pattern__ManagedSystemsAssignment_6 )* )
            // InternalMSL.g:2516:2: ( rule__Pattern__ManagedSystemsAssignment_6 )*
            {
             before(grammarAccess.getPatternAccess().getManagedSystemsAssignment_6()); 
            // InternalMSL.g:2517:2: ( rule__Pattern__ManagedSystemsAssignment_6 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMSL.g:2517:3: rule__Pattern__ManagedSystemsAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Pattern__ManagedSystemsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalMSL.g:2525:1: rule__Pattern__Group__7 : rule__Pattern__Group__7__Impl rule__Pattern__Group__8 ;
    public final void rule__Pattern__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2529:1: ( rule__Pattern__Group__7__Impl rule__Pattern__Group__8 )
            // InternalMSL.g:2530:2: rule__Pattern__Group__7__Impl rule__Pattern__Group__8
            {
            pushFollow(FOLLOW_29);
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
    // InternalMSL.g:2537:1: rule__Pattern__Group__7__Impl : ( ( rule__Pattern__GroupsAssignment_7 )* ) ;
    public final void rule__Pattern__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2541:1: ( ( ( rule__Pattern__GroupsAssignment_7 )* ) )
            // InternalMSL.g:2542:1: ( ( rule__Pattern__GroupsAssignment_7 )* )
            {
            // InternalMSL.g:2542:1: ( ( rule__Pattern__GroupsAssignment_7 )* )
            // InternalMSL.g:2543:2: ( rule__Pattern__GroupsAssignment_7 )*
            {
             before(grammarAccess.getPatternAccess().getGroupsAssignment_7()); 
            // InternalMSL.g:2544:2: ( rule__Pattern__GroupsAssignment_7 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMSL.g:2544:3: rule__Pattern__GroupsAssignment_7
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Pattern__GroupsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalMSL.g:2552:1: rule__Pattern__Group__8 : rule__Pattern__Group__8__Impl ;
    public final void rule__Pattern__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2556:1: ( rule__Pattern__Group__8__Impl )
            // InternalMSL.g:2557:2: rule__Pattern__Group__8__Impl
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
    // InternalMSL.g:2563:1: rule__Pattern__Group__8__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2567:1: ( ( '}' ) )
            // InternalMSL.g:2568:1: ( '}' )
            {
            // InternalMSL.g:2568:1: ( '}' )
            // InternalMSL.g:2569:2: '}'
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
    // InternalMSL.g:2579:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2583:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // InternalMSL.g:2584:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
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
    // InternalMSL.g:2591:1: rule__Configuration__Group__0__Impl : ( 'configuration' ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2595:1: ( ( 'configuration' ) )
            // InternalMSL.g:2596:1: ( 'configuration' )
            {
            // InternalMSL.g:2596:1: ( 'configuration' )
            // InternalMSL.g:2597:2: 'configuration'
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMSL.g:2606:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2610:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // InternalMSL.g:2611:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalMSL.g:2618:1: rule__Configuration__Group__1__Impl : ( ( rule__Configuration__NameAssignment_1 ) ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2622:1: ( ( ( rule__Configuration__NameAssignment_1 ) ) )
            // InternalMSL.g:2623:1: ( ( rule__Configuration__NameAssignment_1 ) )
            {
            // InternalMSL.g:2623:1: ( ( rule__Configuration__NameAssignment_1 ) )
            // InternalMSL.g:2624:2: ( rule__Configuration__NameAssignment_1 )
            {
             before(grammarAccess.getConfigurationAccess().getNameAssignment_1()); 
            // InternalMSL.g:2625:2: ( rule__Configuration__NameAssignment_1 )
            // InternalMSL.g:2625:3: rule__Configuration__NameAssignment_1
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
    // InternalMSL.g:2633:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl rule__Configuration__Group__3 ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2637:1: ( rule__Configuration__Group__2__Impl rule__Configuration__Group__3 )
            // InternalMSL.g:2638:2: rule__Configuration__Group__2__Impl rule__Configuration__Group__3
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
    // InternalMSL.g:2645:1: rule__Configuration__Group__2__Impl : ( 'instanceOf' ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2649:1: ( ( 'instanceOf' ) )
            // InternalMSL.g:2650:1: ( 'instanceOf' )
            {
            // InternalMSL.g:2650:1: ( 'instanceOf' )
            // InternalMSL.g:2651:2: 'instanceOf'
            {
             before(grammarAccess.getConfigurationAccess().getInstanceOfKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMSL.g:2660:1: rule__Configuration__Group__3 : rule__Configuration__Group__3__Impl rule__Configuration__Group__4 ;
    public final void rule__Configuration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2664:1: ( rule__Configuration__Group__3__Impl rule__Configuration__Group__4 )
            // InternalMSL.g:2665:2: rule__Configuration__Group__3__Impl rule__Configuration__Group__4
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
    // InternalMSL.g:2672:1: rule__Configuration__Group__3__Impl : ( ( rule__Configuration__Group_3__0 ) ) ;
    public final void rule__Configuration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2676:1: ( ( ( rule__Configuration__Group_3__0 ) ) )
            // InternalMSL.g:2677:1: ( ( rule__Configuration__Group_3__0 ) )
            {
            // InternalMSL.g:2677:1: ( ( rule__Configuration__Group_3__0 ) )
            // InternalMSL.g:2678:2: ( rule__Configuration__Group_3__0 )
            {
             before(grammarAccess.getConfigurationAccess().getGroup_3()); 
            // InternalMSL.g:2679:2: ( rule__Configuration__Group_3__0 )
            // InternalMSL.g:2679:3: rule__Configuration__Group_3__0
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
    // InternalMSL.g:2687:1: rule__Configuration__Group__4 : rule__Configuration__Group__4__Impl rule__Configuration__Group__5 ;
    public final void rule__Configuration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2691:1: ( rule__Configuration__Group__4__Impl rule__Configuration__Group__5 )
            // InternalMSL.g:2692:2: rule__Configuration__Group__4__Impl rule__Configuration__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalMSL.g:2699:1: rule__Configuration__Group__4__Impl : ( '{' ) ;
    public final void rule__Configuration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2703:1: ( ( '{' ) )
            // InternalMSL.g:2704:1: ( '{' )
            {
            // InternalMSL.g:2704:1: ( '{' )
            // InternalMSL.g:2705:2: '{'
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
    // InternalMSL.g:2714:1: rule__Configuration__Group__5 : rule__Configuration__Group__5__Impl rule__Configuration__Group__6 ;
    public final void rule__Configuration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2718:1: ( rule__Configuration__Group__5__Impl rule__Configuration__Group__6 )
            // InternalMSL.g:2719:2: rule__Configuration__Group__5__Impl rule__Configuration__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalMSL.g:2726:1: rule__Configuration__Group__5__Impl : ( ( rule__Configuration__ConcreteSystemsAssignment_5 )* ) ;
    public final void rule__Configuration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2730:1: ( ( ( rule__Configuration__ConcreteSystemsAssignment_5 )* ) )
            // InternalMSL.g:2731:1: ( ( rule__Configuration__ConcreteSystemsAssignment_5 )* )
            {
            // InternalMSL.g:2731:1: ( ( rule__Configuration__ConcreteSystemsAssignment_5 )* )
            // InternalMSL.g:2732:2: ( rule__Configuration__ConcreteSystemsAssignment_5 )*
            {
             before(grammarAccess.getConfigurationAccess().getConcreteSystemsAssignment_5()); 
            // InternalMSL.g:2733:2: ( rule__Configuration__ConcreteSystemsAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // InternalMSL.g:2733:3: rule__Configuration__ConcreteSystemsAssignment_5
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Configuration__ConcreteSystemsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMSL.g:2741:1: rule__Configuration__Group__6 : rule__Configuration__Group__6__Impl rule__Configuration__Group__7 ;
    public final void rule__Configuration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2745:1: ( rule__Configuration__Group__6__Impl rule__Configuration__Group__7 )
            // InternalMSL.g:2746:2: rule__Configuration__Group__6__Impl rule__Configuration__Group__7
            {
            pushFollow(FOLLOW_31);
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
    // InternalMSL.g:2753:1: rule__Configuration__Group__6__Impl : ( ( rule__Configuration__ConcreteGroupsAssignment_6 )* ) ;
    public final void rule__Configuration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2757:1: ( ( ( rule__Configuration__ConcreteGroupsAssignment_6 )* ) )
            // InternalMSL.g:2758:1: ( ( rule__Configuration__ConcreteGroupsAssignment_6 )* )
            {
            // InternalMSL.g:2758:1: ( ( rule__Configuration__ConcreteGroupsAssignment_6 )* )
            // InternalMSL.g:2759:2: ( rule__Configuration__ConcreteGroupsAssignment_6 )*
            {
             before(grammarAccess.getConfigurationAccess().getConcreteGroupsAssignment_6()); 
            // InternalMSL.g:2760:2: ( rule__Configuration__ConcreteGroupsAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_INSTANCE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMSL.g:2760:3: rule__Configuration__ConcreteGroupsAssignment_6
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Configuration__ConcreteGroupsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalMSL.g:2768:1: rule__Configuration__Group__7 : rule__Configuration__Group__7__Impl rule__Configuration__Group__8 ;
    public final void rule__Configuration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2772:1: ( rule__Configuration__Group__7__Impl rule__Configuration__Group__8 )
            // InternalMSL.g:2773:2: rule__Configuration__Group__7__Impl rule__Configuration__Group__8
            {
            pushFollow(FOLLOW_31);
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
    // InternalMSL.g:2780:1: rule__Configuration__Group__7__Impl : ( ( rule__Configuration__ConcreteInteractionsAssignment_7 )* ) ;
    public final void rule__Configuration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2784:1: ( ( ( rule__Configuration__ConcreteInteractionsAssignment_7 )* ) )
            // InternalMSL.g:2785:1: ( ( rule__Configuration__ConcreteInteractionsAssignment_7 )* )
            {
            // InternalMSL.g:2785:1: ( ( rule__Configuration__ConcreteInteractionsAssignment_7 )* )
            // InternalMSL.g:2786:2: ( rule__Configuration__ConcreteInteractionsAssignment_7 )*
            {
             before(grammarAccess.getConfigurationAccess().getConcreteInteractionsAssignment_7()); 
            // InternalMSL.g:2787:2: ( rule__Configuration__ConcreteInteractionsAssignment_7 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_FQN_INSTANCE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMSL.g:2787:3: rule__Configuration__ConcreteInteractionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Configuration__ConcreteInteractionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMSL.g:2795:1: rule__Configuration__Group__8 : rule__Configuration__Group__8__Impl ;
    public final void rule__Configuration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2799:1: ( rule__Configuration__Group__8__Impl )
            // InternalMSL.g:2800:2: rule__Configuration__Group__8__Impl
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
    // InternalMSL.g:2806:1: rule__Configuration__Group__8__Impl : ( '}' ) ;
    public final void rule__Configuration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2810:1: ( ( '}' ) )
            // InternalMSL.g:2811:1: ( '}' )
            {
            // InternalMSL.g:2811:1: ( '}' )
            // InternalMSL.g:2812:2: '}'
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
    // InternalMSL.g:2822:1: rule__Configuration__Group_3__0 : rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1 ;
    public final void rule__Configuration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2826:1: ( rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1 )
            // InternalMSL.g:2827:2: rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMSL.g:2834:1: rule__Configuration__Group_3__0__Impl : ( ( rule__Configuration__PatternAssignment_3_0 ) ) ;
    public final void rule__Configuration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2838:1: ( ( ( rule__Configuration__PatternAssignment_3_0 ) ) )
            // InternalMSL.g:2839:1: ( ( rule__Configuration__PatternAssignment_3_0 ) )
            {
            // InternalMSL.g:2839:1: ( ( rule__Configuration__PatternAssignment_3_0 ) )
            // InternalMSL.g:2840:2: ( rule__Configuration__PatternAssignment_3_0 )
            {
             before(grammarAccess.getConfigurationAccess().getPatternAssignment_3_0()); 
            // InternalMSL.g:2841:2: ( rule__Configuration__PatternAssignment_3_0 )
            // InternalMSL.g:2841:3: rule__Configuration__PatternAssignment_3_0
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
    // InternalMSL.g:2849:1: rule__Configuration__Group_3__1 : rule__Configuration__Group_3__1__Impl ;
    public final void rule__Configuration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2853:1: ( rule__Configuration__Group_3__1__Impl )
            // InternalMSL.g:2854:2: rule__Configuration__Group_3__1__Impl
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
    // InternalMSL.g:2860:1: rule__Configuration__Group_3__1__Impl : ( ( rule__Configuration__Group_3_1__0 )* ) ;
    public final void rule__Configuration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2864:1: ( ( ( rule__Configuration__Group_3_1__0 )* ) )
            // InternalMSL.g:2865:1: ( ( rule__Configuration__Group_3_1__0 )* )
            {
            // InternalMSL.g:2865:1: ( ( rule__Configuration__Group_3_1__0 )* )
            // InternalMSL.g:2866:2: ( rule__Configuration__Group_3_1__0 )*
            {
             before(grammarAccess.getConfigurationAccess().getGroup_3_1()); 
            // InternalMSL.g:2867:2: ( rule__Configuration__Group_3_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMSL.g:2867:3: rule__Configuration__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Configuration__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMSL.g:2876:1: rule__Configuration__Group_3_1__0 : rule__Configuration__Group_3_1__0__Impl rule__Configuration__Group_3_1__1 ;
    public final void rule__Configuration__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2880:1: ( rule__Configuration__Group_3_1__0__Impl rule__Configuration__Group_3_1__1 )
            // InternalMSL.g:2881:2: rule__Configuration__Group_3_1__0__Impl rule__Configuration__Group_3_1__1
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
    // InternalMSL.g:2888:1: rule__Configuration__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Configuration__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2892:1: ( ( ',' ) )
            // InternalMSL.g:2893:1: ( ',' )
            {
            // InternalMSL.g:2893:1: ( ',' )
            // InternalMSL.g:2894:2: ','
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
    // InternalMSL.g:2903:1: rule__Configuration__Group_3_1__1 : rule__Configuration__Group_3_1__1__Impl ;
    public final void rule__Configuration__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2907:1: ( rule__Configuration__Group_3_1__1__Impl )
            // InternalMSL.g:2908:2: rule__Configuration__Group_3_1__1__Impl
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
    // InternalMSL.g:2914:1: rule__Configuration__Group_3_1__1__Impl : ( ( rule__Configuration__PatternAssignment_3_1_1 ) ) ;
    public final void rule__Configuration__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2918:1: ( ( ( rule__Configuration__PatternAssignment_3_1_1 ) ) )
            // InternalMSL.g:2919:1: ( ( rule__Configuration__PatternAssignment_3_1_1 ) )
            {
            // InternalMSL.g:2919:1: ( ( rule__Configuration__PatternAssignment_3_1_1 ) )
            // InternalMSL.g:2920:2: ( rule__Configuration__PatternAssignment_3_1_1 )
            {
             before(grammarAccess.getConfigurationAccess().getPatternAssignment_3_1_1()); 
            // InternalMSL.g:2921:2: ( rule__Configuration__PatternAssignment_3_1_1 )
            // InternalMSL.g:2921:3: rule__Configuration__PatternAssignment_3_1_1
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
    // InternalMSL.g:2930:1: rule__ConcreteSystem__Group__0 : rule__ConcreteSystem__Group__0__Impl rule__ConcreteSystem__Group__1 ;
    public final void rule__ConcreteSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2934:1: ( rule__ConcreteSystem__Group__0__Impl rule__ConcreteSystem__Group__1 )
            // InternalMSL.g:2935:2: rule__ConcreteSystem__Group__0__Impl rule__ConcreteSystem__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMSL.g:2942:1: rule__ConcreteSystem__Group__0__Impl : ( ( rule__ConcreteSystem__NameAssignment_0 ) ) ;
    public final void rule__ConcreteSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2946:1: ( ( ( rule__ConcreteSystem__NameAssignment_0 ) ) )
            // InternalMSL.g:2947:1: ( ( rule__ConcreteSystem__NameAssignment_0 ) )
            {
            // InternalMSL.g:2947:1: ( ( rule__ConcreteSystem__NameAssignment_0 ) )
            // InternalMSL.g:2948:2: ( rule__ConcreteSystem__NameAssignment_0 )
            {
             before(grammarAccess.getConcreteSystemAccess().getNameAssignment_0()); 
            // InternalMSL.g:2949:2: ( rule__ConcreteSystem__NameAssignment_0 )
            // InternalMSL.g:2949:3: rule__ConcreteSystem__NameAssignment_0
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
    // InternalMSL.g:2957:1: rule__ConcreteSystem__Group__1 : rule__ConcreteSystem__Group__1__Impl rule__ConcreteSystem__Group__2 ;
    public final void rule__ConcreteSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2961:1: ( rule__ConcreteSystem__Group__1__Impl rule__ConcreteSystem__Group__2 )
            // InternalMSL.g:2962:2: rule__ConcreteSystem__Group__1__Impl rule__ConcreteSystem__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMSL.g:2969:1: rule__ConcreteSystem__Group__1__Impl : ( ':' ) ;
    public final void rule__ConcreteSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2973:1: ( ( ':' ) )
            // InternalMSL.g:2974:1: ( ':' )
            {
            // InternalMSL.g:2974:1: ( ':' )
            // InternalMSL.g:2975:2: ':'
            {
             before(grammarAccess.getConcreteSystemAccess().getColonKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMSL.g:2984:1: rule__ConcreteSystem__Group__2 : rule__ConcreteSystem__Group__2__Impl ;
    public final void rule__ConcreteSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2988:1: ( rule__ConcreteSystem__Group__2__Impl )
            // InternalMSL.g:2989:2: rule__ConcreteSystem__Group__2__Impl
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
    // InternalMSL.g:2995:1: rule__ConcreteSystem__Group__2__Impl : ( ( rule__ConcreteSystem__Group_2__0 ) ) ;
    public final void rule__ConcreteSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:2999:1: ( ( ( rule__ConcreteSystem__Group_2__0 ) ) )
            // InternalMSL.g:3000:1: ( ( rule__ConcreteSystem__Group_2__0 ) )
            {
            // InternalMSL.g:3000:1: ( ( rule__ConcreteSystem__Group_2__0 ) )
            // InternalMSL.g:3001:2: ( rule__ConcreteSystem__Group_2__0 )
            {
             before(grammarAccess.getConcreteSystemAccess().getGroup_2()); 
            // InternalMSL.g:3002:2: ( rule__ConcreteSystem__Group_2__0 )
            // InternalMSL.g:3002:3: rule__ConcreteSystem__Group_2__0
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
    // InternalMSL.g:3011:1: rule__ConcreteSystem__Group_2__0 : rule__ConcreteSystem__Group_2__0__Impl rule__ConcreteSystem__Group_2__1 ;
    public final void rule__ConcreteSystem__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3015:1: ( rule__ConcreteSystem__Group_2__0__Impl rule__ConcreteSystem__Group_2__1 )
            // InternalMSL.g:3016:2: rule__ConcreteSystem__Group_2__0__Impl rule__ConcreteSystem__Group_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMSL.g:3023:1: rule__ConcreteSystem__Group_2__0__Impl : ( ( rule__ConcreteSystem__BindingsAssignment_2_0 ) ) ;
    public final void rule__ConcreteSystem__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3027:1: ( ( ( rule__ConcreteSystem__BindingsAssignment_2_0 ) ) )
            // InternalMSL.g:3028:1: ( ( rule__ConcreteSystem__BindingsAssignment_2_0 ) )
            {
            // InternalMSL.g:3028:1: ( ( rule__ConcreteSystem__BindingsAssignment_2_0 ) )
            // InternalMSL.g:3029:2: ( rule__ConcreteSystem__BindingsAssignment_2_0 )
            {
             before(grammarAccess.getConcreteSystemAccess().getBindingsAssignment_2_0()); 
            // InternalMSL.g:3030:2: ( rule__ConcreteSystem__BindingsAssignment_2_0 )
            // InternalMSL.g:3030:3: rule__ConcreteSystem__BindingsAssignment_2_0
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
    // InternalMSL.g:3038:1: rule__ConcreteSystem__Group_2__1 : rule__ConcreteSystem__Group_2__1__Impl ;
    public final void rule__ConcreteSystem__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3042:1: ( rule__ConcreteSystem__Group_2__1__Impl )
            // InternalMSL.g:3043:2: rule__ConcreteSystem__Group_2__1__Impl
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
    // InternalMSL.g:3049:1: rule__ConcreteSystem__Group_2__1__Impl : ( ( rule__ConcreteSystem__Group_2_1__0 )* ) ;
    public final void rule__ConcreteSystem__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3053:1: ( ( ( rule__ConcreteSystem__Group_2_1__0 )* ) )
            // InternalMSL.g:3054:1: ( ( rule__ConcreteSystem__Group_2_1__0 )* )
            {
            // InternalMSL.g:3054:1: ( ( rule__ConcreteSystem__Group_2_1__0 )* )
            // InternalMSL.g:3055:2: ( rule__ConcreteSystem__Group_2_1__0 )*
            {
             before(grammarAccess.getConcreteSystemAccess().getGroup_2_1()); 
            // InternalMSL.g:3056:2: ( rule__ConcreteSystem__Group_2_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMSL.g:3056:3: rule__ConcreteSystem__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ConcreteSystem__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalMSL.g:3065:1: rule__ConcreteSystem__Group_2_1__0 : rule__ConcreteSystem__Group_2_1__0__Impl rule__ConcreteSystem__Group_2_1__1 ;
    public final void rule__ConcreteSystem__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3069:1: ( rule__ConcreteSystem__Group_2_1__0__Impl rule__ConcreteSystem__Group_2_1__1 )
            // InternalMSL.g:3070:2: rule__ConcreteSystem__Group_2_1__0__Impl rule__ConcreteSystem__Group_2_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMSL.g:3077:1: rule__ConcreteSystem__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ConcreteSystem__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3081:1: ( ( ',' ) )
            // InternalMSL.g:3082:1: ( ',' )
            {
            // InternalMSL.g:3082:1: ( ',' )
            // InternalMSL.g:3083:2: ','
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
    // InternalMSL.g:3092:1: rule__ConcreteSystem__Group_2_1__1 : rule__ConcreteSystem__Group_2_1__1__Impl ;
    public final void rule__ConcreteSystem__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3096:1: ( rule__ConcreteSystem__Group_2_1__1__Impl )
            // InternalMSL.g:3097:2: rule__ConcreteSystem__Group_2_1__1__Impl
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
    // InternalMSL.g:3103:1: rule__ConcreteSystem__Group_2_1__1__Impl : ( ( rule__ConcreteSystem__BindingsAssignment_2_1_1 ) ) ;
    public final void rule__ConcreteSystem__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3107:1: ( ( ( rule__ConcreteSystem__BindingsAssignment_2_1_1 ) ) )
            // InternalMSL.g:3108:1: ( ( rule__ConcreteSystem__BindingsAssignment_2_1_1 ) )
            {
            // InternalMSL.g:3108:1: ( ( rule__ConcreteSystem__BindingsAssignment_2_1_1 ) )
            // InternalMSL.g:3109:2: ( rule__ConcreteSystem__BindingsAssignment_2_1_1 )
            {
             before(grammarAccess.getConcreteSystemAccess().getBindingsAssignment_2_1_1()); 
            // InternalMSL.g:3110:2: ( rule__ConcreteSystem__BindingsAssignment_2_1_1 )
            // InternalMSL.g:3110:3: rule__ConcreteSystem__BindingsAssignment_2_1_1
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
    // InternalMSL.g:3119:1: rule__ConcreteGroup__Group__0 : rule__ConcreteGroup__Group__0__Impl rule__ConcreteGroup__Group__1 ;
    public final void rule__ConcreteGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3123:1: ( rule__ConcreteGroup__Group__0__Impl rule__ConcreteGroup__Group__1 )
            // InternalMSL.g:3124:2: rule__ConcreteGroup__Group__0__Impl rule__ConcreteGroup__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMSL.g:3131:1: rule__ConcreteGroup__Group__0__Impl : ( ( rule__ConcreteGroup__NameAssignment_0 ) ) ;
    public final void rule__ConcreteGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3135:1: ( ( ( rule__ConcreteGroup__NameAssignment_0 ) ) )
            // InternalMSL.g:3136:1: ( ( rule__ConcreteGroup__NameAssignment_0 ) )
            {
            // InternalMSL.g:3136:1: ( ( rule__ConcreteGroup__NameAssignment_0 ) )
            // InternalMSL.g:3137:2: ( rule__ConcreteGroup__NameAssignment_0 )
            {
             before(grammarAccess.getConcreteGroupAccess().getNameAssignment_0()); 
            // InternalMSL.g:3138:2: ( rule__ConcreteGroup__NameAssignment_0 )
            // InternalMSL.g:3138:3: rule__ConcreteGroup__NameAssignment_0
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
    // InternalMSL.g:3146:1: rule__ConcreteGroup__Group__1 : rule__ConcreteGroup__Group__1__Impl rule__ConcreteGroup__Group__2 ;
    public final void rule__ConcreteGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3150:1: ( rule__ConcreteGroup__Group__1__Impl rule__ConcreteGroup__Group__2 )
            // InternalMSL.g:3151:2: rule__ConcreteGroup__Group__1__Impl rule__ConcreteGroup__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMSL.g:3158:1: rule__ConcreteGroup__Group__1__Impl : ( ':' ) ;
    public final void rule__ConcreteGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3162:1: ( ( ':' ) )
            // InternalMSL.g:3163:1: ( ':' )
            {
            // InternalMSL.g:3163:1: ( ':' )
            // InternalMSL.g:3164:2: ':'
            {
             before(grammarAccess.getConcreteGroupAccess().getColonKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMSL.g:3173:1: rule__ConcreteGroup__Group__2 : rule__ConcreteGroup__Group__2__Impl rule__ConcreteGroup__Group__3 ;
    public final void rule__ConcreteGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3177:1: ( rule__ConcreteGroup__Group__2__Impl rule__ConcreteGroup__Group__3 )
            // InternalMSL.g:3178:2: rule__ConcreteGroup__Group__2__Impl rule__ConcreteGroup__Group__3
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
    // InternalMSL.g:3185:1: rule__ConcreteGroup__Group__2__Impl : ( ( rule__ConcreteGroup__Group_2__0 ) ) ;
    public final void rule__ConcreteGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3189:1: ( ( ( rule__ConcreteGroup__Group_2__0 ) ) )
            // InternalMSL.g:3190:1: ( ( rule__ConcreteGroup__Group_2__0 ) )
            {
            // InternalMSL.g:3190:1: ( ( rule__ConcreteGroup__Group_2__0 ) )
            // InternalMSL.g:3191:2: ( rule__ConcreteGroup__Group_2__0 )
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup_2()); 
            // InternalMSL.g:3192:2: ( rule__ConcreteGroup__Group_2__0 )
            // InternalMSL.g:3192:3: rule__ConcreteGroup__Group_2__0
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
    // InternalMSL.g:3200:1: rule__ConcreteGroup__Group__3 : rule__ConcreteGroup__Group__3__Impl rule__ConcreteGroup__Group__4 ;
    public final void rule__ConcreteGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3204:1: ( rule__ConcreteGroup__Group__3__Impl rule__ConcreteGroup__Group__4 )
            // InternalMSL.g:3205:2: rule__ConcreteGroup__Group__3__Impl rule__ConcreteGroup__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMSL.g:3212:1: rule__ConcreteGroup__Group__3__Impl : ( '{' ) ;
    public final void rule__ConcreteGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3216:1: ( ( '{' ) )
            // InternalMSL.g:3217:1: ( '{' )
            {
            // InternalMSL.g:3217:1: ( '{' )
            // InternalMSL.g:3218:2: '{'
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
    // InternalMSL.g:3227:1: rule__ConcreteGroup__Group__4 : rule__ConcreteGroup__Group__4__Impl rule__ConcreteGroup__Group__5 ;
    public final void rule__ConcreteGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3231:1: ( rule__ConcreteGroup__Group__4__Impl rule__ConcreteGroup__Group__5 )
            // InternalMSL.g:3232:2: rule__ConcreteGroup__Group__4__Impl rule__ConcreteGroup__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalMSL.g:3239:1: rule__ConcreteGroup__Group__4__Impl : ( ( rule__ConcreteGroup__Group_4__0 )? ) ;
    public final void rule__ConcreteGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3243:1: ( ( ( rule__ConcreteGroup__Group_4__0 )? ) )
            // InternalMSL.g:3244:1: ( ( rule__ConcreteGroup__Group_4__0 )? )
            {
            // InternalMSL.g:3244:1: ( ( rule__ConcreteGroup__Group_4__0 )? )
            // InternalMSL.g:3245:2: ( rule__ConcreteGroup__Group_4__0 )?
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup_4()); 
            // InternalMSL.g:3246:2: ( rule__ConcreteGroup__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMSL.g:3246:3: rule__ConcreteGroup__Group_4__0
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
    // InternalMSL.g:3254:1: rule__ConcreteGroup__Group__5 : rule__ConcreteGroup__Group__5__Impl rule__ConcreteGroup__Group__6 ;
    public final void rule__ConcreteGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3258:1: ( rule__ConcreteGroup__Group__5__Impl rule__ConcreteGroup__Group__6 )
            // InternalMSL.g:3259:2: rule__ConcreteGroup__Group__5__Impl rule__ConcreteGroup__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalMSL.g:3266:1: rule__ConcreteGroup__Group__5__Impl : ( ( rule__ConcreteGroup__Group_5__0 )? ) ;
    public final void rule__ConcreteGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3270:1: ( ( ( rule__ConcreteGroup__Group_5__0 )? ) )
            // InternalMSL.g:3271:1: ( ( rule__ConcreteGroup__Group_5__0 )? )
            {
            // InternalMSL.g:3271:1: ( ( rule__ConcreteGroup__Group_5__0 )? )
            // InternalMSL.g:3272:2: ( rule__ConcreteGroup__Group_5__0 )?
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup_5()); 
            // InternalMSL.g:3273:2: ( rule__ConcreteGroup__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMSL.g:3273:3: rule__ConcreteGroup__Group_5__0
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
    // InternalMSL.g:3281:1: rule__ConcreteGroup__Group__6 : rule__ConcreteGroup__Group__6__Impl rule__ConcreteGroup__Group__7 ;
    public final void rule__ConcreteGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3285:1: ( rule__ConcreteGroup__Group__6__Impl rule__ConcreteGroup__Group__7 )
            // InternalMSL.g:3286:2: rule__ConcreteGroup__Group__6__Impl rule__ConcreteGroup__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalMSL.g:3293:1: rule__ConcreteGroup__Group__6__Impl : ( 'components' ) ;
    public final void rule__ConcreteGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3297:1: ( ( 'components' ) )
            // InternalMSL.g:3298:1: ( 'components' )
            {
            // InternalMSL.g:3298:1: ( 'components' )
            // InternalMSL.g:3299:2: 'components'
            {
             before(grammarAccess.getConcreteGroupAccess().getComponentsKeyword_6()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMSL.g:3308:1: rule__ConcreteGroup__Group__7 : rule__ConcreteGroup__Group__7__Impl rule__ConcreteGroup__Group__8 ;
    public final void rule__ConcreteGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3312:1: ( rule__ConcreteGroup__Group__7__Impl rule__ConcreteGroup__Group__8 )
            // InternalMSL.g:3313:2: rule__ConcreteGroup__Group__7__Impl rule__ConcreteGroup__Group__8
            {
            pushFollow(FOLLOW_20);
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
    // InternalMSL.g:3320:1: rule__ConcreteGroup__Group__7__Impl : ( ( rule__ConcreteGroup__ComponentsAssignment_7 ) ) ;
    public final void rule__ConcreteGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3324:1: ( ( ( rule__ConcreteGroup__ComponentsAssignment_7 ) ) )
            // InternalMSL.g:3325:1: ( ( rule__ConcreteGroup__ComponentsAssignment_7 ) )
            {
            // InternalMSL.g:3325:1: ( ( rule__ConcreteGroup__ComponentsAssignment_7 ) )
            // InternalMSL.g:3326:2: ( rule__ConcreteGroup__ComponentsAssignment_7 )
            {
             before(grammarAccess.getConcreteGroupAccess().getComponentsAssignment_7()); 
            // InternalMSL.g:3327:2: ( rule__ConcreteGroup__ComponentsAssignment_7 )
            // InternalMSL.g:3327:3: rule__ConcreteGroup__ComponentsAssignment_7
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
    // InternalMSL.g:3335:1: rule__ConcreteGroup__Group__8 : rule__ConcreteGroup__Group__8__Impl rule__ConcreteGroup__Group__9 ;
    public final void rule__ConcreteGroup__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3339:1: ( rule__ConcreteGroup__Group__8__Impl rule__ConcreteGroup__Group__9 )
            // InternalMSL.g:3340:2: rule__ConcreteGroup__Group__8__Impl rule__ConcreteGroup__Group__9
            {
            pushFollow(FOLLOW_20);
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
    // InternalMSL.g:3347:1: rule__ConcreteGroup__Group__8__Impl : ( ( rule__ConcreteGroup__Group_8__0 )* ) ;
    public final void rule__ConcreteGroup__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3351:1: ( ( ( rule__ConcreteGroup__Group_8__0 )* ) )
            // InternalMSL.g:3352:1: ( ( rule__ConcreteGroup__Group_8__0 )* )
            {
            // InternalMSL.g:3352:1: ( ( rule__ConcreteGroup__Group_8__0 )* )
            // InternalMSL.g:3353:2: ( rule__ConcreteGroup__Group_8__0 )*
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup_8()); 
            // InternalMSL.g:3354:2: ( rule__ConcreteGroup__Group_8__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==30) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMSL.g:3354:3: rule__ConcreteGroup__Group_8__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ConcreteGroup__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalMSL.g:3362:1: rule__ConcreteGroup__Group__9 : rule__ConcreteGroup__Group__9__Impl ;
    public final void rule__ConcreteGroup__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3366:1: ( rule__ConcreteGroup__Group__9__Impl )
            // InternalMSL.g:3367:2: rule__ConcreteGroup__Group__9__Impl
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
    // InternalMSL.g:3373:1: rule__ConcreteGroup__Group__9__Impl : ( '}' ) ;
    public final void rule__ConcreteGroup__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3377:1: ( ( '}' ) )
            // InternalMSL.g:3378:1: ( '}' )
            {
            // InternalMSL.g:3378:1: ( '}' )
            // InternalMSL.g:3379:2: '}'
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
    // InternalMSL.g:3389:1: rule__ConcreteGroup__Group_2__0 : rule__ConcreteGroup__Group_2__0__Impl rule__ConcreteGroup__Group_2__1 ;
    public final void rule__ConcreteGroup__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3393:1: ( rule__ConcreteGroup__Group_2__0__Impl rule__ConcreteGroup__Group_2__1 )
            // InternalMSL.g:3394:2: rule__ConcreteGroup__Group_2__0__Impl rule__ConcreteGroup__Group_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMSL.g:3401:1: rule__ConcreteGroup__Group_2__0__Impl : ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_0 ) ) ;
    public final void rule__ConcreteGroup__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3405:1: ( ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_0 ) ) )
            // InternalMSL.g:3406:1: ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_0 ) )
            {
            // InternalMSL.g:3406:1: ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_0 ) )
            // InternalMSL.g:3407:2: ( rule__ConcreteGroup__AbstractGroupsAssignment_2_0 )
            {
             before(grammarAccess.getConcreteGroupAccess().getAbstractGroupsAssignment_2_0()); 
            // InternalMSL.g:3408:2: ( rule__ConcreteGroup__AbstractGroupsAssignment_2_0 )
            // InternalMSL.g:3408:3: rule__ConcreteGroup__AbstractGroupsAssignment_2_0
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
    // InternalMSL.g:3416:1: rule__ConcreteGroup__Group_2__1 : rule__ConcreteGroup__Group_2__1__Impl ;
    public final void rule__ConcreteGroup__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3420:1: ( rule__ConcreteGroup__Group_2__1__Impl )
            // InternalMSL.g:3421:2: rule__ConcreteGroup__Group_2__1__Impl
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
    // InternalMSL.g:3427:1: rule__ConcreteGroup__Group_2__1__Impl : ( ( rule__ConcreteGroup__Group_2_1__0 )* ) ;
    public final void rule__ConcreteGroup__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3431:1: ( ( ( rule__ConcreteGroup__Group_2_1__0 )* ) )
            // InternalMSL.g:3432:1: ( ( rule__ConcreteGroup__Group_2_1__0 )* )
            {
            // InternalMSL.g:3432:1: ( ( rule__ConcreteGroup__Group_2_1__0 )* )
            // InternalMSL.g:3433:2: ( rule__ConcreteGroup__Group_2_1__0 )*
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup_2_1()); 
            // InternalMSL.g:3434:2: ( rule__ConcreteGroup__Group_2_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==30) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMSL.g:3434:3: rule__ConcreteGroup__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ConcreteGroup__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalMSL.g:3443:1: rule__ConcreteGroup__Group_2_1__0 : rule__ConcreteGroup__Group_2_1__0__Impl rule__ConcreteGroup__Group_2_1__1 ;
    public final void rule__ConcreteGroup__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3447:1: ( rule__ConcreteGroup__Group_2_1__0__Impl rule__ConcreteGroup__Group_2_1__1 )
            // InternalMSL.g:3448:2: rule__ConcreteGroup__Group_2_1__0__Impl rule__ConcreteGroup__Group_2_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMSL.g:3455:1: rule__ConcreteGroup__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ConcreteGroup__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3459:1: ( ( ',' ) )
            // InternalMSL.g:3460:1: ( ',' )
            {
            // InternalMSL.g:3460:1: ( ',' )
            // InternalMSL.g:3461:2: ','
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
    // InternalMSL.g:3470:1: rule__ConcreteGroup__Group_2_1__1 : rule__ConcreteGroup__Group_2_1__1__Impl ;
    public final void rule__ConcreteGroup__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3474:1: ( rule__ConcreteGroup__Group_2_1__1__Impl )
            // InternalMSL.g:3475:2: rule__ConcreteGroup__Group_2_1__1__Impl
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
    // InternalMSL.g:3481:1: rule__ConcreteGroup__Group_2_1__1__Impl : ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 ) ) ;
    public final void rule__ConcreteGroup__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3485:1: ( ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 ) ) )
            // InternalMSL.g:3486:1: ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 ) )
            {
            // InternalMSL.g:3486:1: ( ( rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 ) )
            // InternalMSL.g:3487:2: ( rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 )
            {
             before(grammarAccess.getConcreteGroupAccess().getAbstractGroupsAssignment_2_1_1()); 
            // InternalMSL.g:3488:2: ( rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 )
            // InternalMSL.g:3488:3: rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1
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
    // InternalMSL.g:3497:1: rule__ConcreteGroup__Group_4__0 : rule__ConcreteGroup__Group_4__0__Impl rule__ConcreteGroup__Group_4__1 ;
    public final void rule__ConcreteGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3501:1: ( rule__ConcreteGroup__Group_4__0__Impl rule__ConcreteGroup__Group_4__1 )
            // InternalMSL.g:3502:2: rule__ConcreteGroup__Group_4__0__Impl rule__ConcreteGroup__Group_4__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMSL.g:3509:1: rule__ConcreteGroup__Group_4__0__Impl : ( 'managedSyS' ) ;
    public final void rule__ConcreteGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3513:1: ( ( 'managedSyS' ) )
            // InternalMSL.g:3514:1: ( 'managedSyS' )
            {
            // InternalMSL.g:3514:1: ( 'managedSyS' )
            // InternalMSL.g:3515:2: 'managedSyS'
            {
             before(grammarAccess.getConcreteGroupAccess().getManagedSySKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMSL.g:3524:1: rule__ConcreteGroup__Group_4__1 : rule__ConcreteGroup__Group_4__1__Impl ;
    public final void rule__ConcreteGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3528:1: ( rule__ConcreteGroup__Group_4__1__Impl )
            // InternalMSL.g:3529:2: rule__ConcreteGroup__Group_4__1__Impl
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
    // InternalMSL.g:3535:1: rule__ConcreteGroup__Group_4__1__Impl : ( ( rule__ConcreteGroup__ManSysAssignment_4_1 ) ) ;
    public final void rule__ConcreteGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3539:1: ( ( ( rule__ConcreteGroup__ManSysAssignment_4_1 ) ) )
            // InternalMSL.g:3540:1: ( ( rule__ConcreteGroup__ManSysAssignment_4_1 ) )
            {
            // InternalMSL.g:3540:1: ( ( rule__ConcreteGroup__ManSysAssignment_4_1 ) )
            // InternalMSL.g:3541:2: ( rule__ConcreteGroup__ManSysAssignment_4_1 )
            {
             before(grammarAccess.getConcreteGroupAccess().getManSysAssignment_4_1()); 
            // InternalMSL.g:3542:2: ( rule__ConcreteGroup__ManSysAssignment_4_1 )
            // InternalMSL.g:3542:3: rule__ConcreteGroup__ManSysAssignment_4_1
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
    // InternalMSL.g:3551:1: rule__ConcreteGroup__Group_5__0 : rule__ConcreteGroup__Group_5__0__Impl rule__ConcreteGroup__Group_5__1 ;
    public final void rule__ConcreteGroup__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3555:1: ( rule__ConcreteGroup__Group_5__0__Impl rule__ConcreteGroup__Group_5__1 )
            // InternalMSL.g:3556:2: rule__ConcreteGroup__Group_5__0__Impl rule__ConcreteGroup__Group_5__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMSL.g:3563:1: rule__ConcreteGroup__Group_5__0__Impl : ( 'managedGrp' ) ;
    public final void rule__ConcreteGroup__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3567:1: ( ( 'managedGrp' ) )
            // InternalMSL.g:3568:1: ( 'managedGrp' )
            {
            // InternalMSL.g:3568:1: ( 'managedGrp' )
            // InternalMSL.g:3569:2: 'managedGrp'
            {
             before(grammarAccess.getConcreteGroupAccess().getManagedGrpKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMSL.g:3578:1: rule__ConcreteGroup__Group_5__1 : rule__ConcreteGroup__Group_5__1__Impl rule__ConcreteGroup__Group_5__2 ;
    public final void rule__ConcreteGroup__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3582:1: ( rule__ConcreteGroup__Group_5__1__Impl rule__ConcreteGroup__Group_5__2 )
            // InternalMSL.g:3583:2: rule__ConcreteGroup__Group_5__1__Impl rule__ConcreteGroup__Group_5__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMSL.g:3590:1: rule__ConcreteGroup__Group_5__1__Impl : ( ( rule__ConcreteGroup__ManGrpAssignment_5_1 ) ) ;
    public final void rule__ConcreteGroup__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3594:1: ( ( ( rule__ConcreteGroup__ManGrpAssignment_5_1 ) ) )
            // InternalMSL.g:3595:1: ( ( rule__ConcreteGroup__ManGrpAssignment_5_1 ) )
            {
            // InternalMSL.g:3595:1: ( ( rule__ConcreteGroup__ManGrpAssignment_5_1 ) )
            // InternalMSL.g:3596:2: ( rule__ConcreteGroup__ManGrpAssignment_5_1 )
            {
             before(grammarAccess.getConcreteGroupAccess().getManGrpAssignment_5_1()); 
            // InternalMSL.g:3597:2: ( rule__ConcreteGroup__ManGrpAssignment_5_1 )
            // InternalMSL.g:3597:3: rule__ConcreteGroup__ManGrpAssignment_5_1
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
    // InternalMSL.g:3605:1: rule__ConcreteGroup__Group_5__2 : rule__ConcreteGroup__Group_5__2__Impl ;
    public final void rule__ConcreteGroup__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3609:1: ( rule__ConcreteGroup__Group_5__2__Impl )
            // InternalMSL.g:3610:2: rule__ConcreteGroup__Group_5__2__Impl
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
    // InternalMSL.g:3616:1: rule__ConcreteGroup__Group_5__2__Impl : ( ( rule__ConcreteGroup__Group_5_2__0 )* ) ;
    public final void rule__ConcreteGroup__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3620:1: ( ( ( rule__ConcreteGroup__Group_5_2__0 )* ) )
            // InternalMSL.g:3621:1: ( ( rule__ConcreteGroup__Group_5_2__0 )* )
            {
            // InternalMSL.g:3621:1: ( ( rule__ConcreteGroup__Group_5_2__0 )* )
            // InternalMSL.g:3622:2: ( rule__ConcreteGroup__Group_5_2__0 )*
            {
             before(grammarAccess.getConcreteGroupAccess().getGroup_5_2()); 
            // InternalMSL.g:3623:2: ( rule__ConcreteGroup__Group_5_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==30) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMSL.g:3623:3: rule__ConcreteGroup__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_21);
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
    // InternalMSL.g:3632:1: rule__ConcreteGroup__Group_5_2__0 : rule__ConcreteGroup__Group_5_2__0__Impl rule__ConcreteGroup__Group_5_2__1 ;
    public final void rule__ConcreteGroup__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3636:1: ( rule__ConcreteGroup__Group_5_2__0__Impl rule__ConcreteGroup__Group_5_2__1 )
            // InternalMSL.g:3637:2: rule__ConcreteGroup__Group_5_2__0__Impl rule__ConcreteGroup__Group_5_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMSL.g:3644:1: rule__ConcreteGroup__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__ConcreteGroup__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3648:1: ( ( ',' ) )
            // InternalMSL.g:3649:1: ( ',' )
            {
            // InternalMSL.g:3649:1: ( ',' )
            // InternalMSL.g:3650:2: ','
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
    // InternalMSL.g:3659:1: rule__ConcreteGroup__Group_5_2__1 : rule__ConcreteGroup__Group_5_2__1__Impl ;
    public final void rule__ConcreteGroup__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3663:1: ( rule__ConcreteGroup__Group_5_2__1__Impl )
            // InternalMSL.g:3664:2: rule__ConcreteGroup__Group_5_2__1__Impl
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
    // InternalMSL.g:3670:1: rule__ConcreteGroup__Group_5_2__1__Impl : ( ( rule__ConcreteGroup__ManGrpAssignment_5_2_1 ) ) ;
    public final void rule__ConcreteGroup__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3674:1: ( ( ( rule__ConcreteGroup__ManGrpAssignment_5_2_1 ) ) )
            // InternalMSL.g:3675:1: ( ( rule__ConcreteGroup__ManGrpAssignment_5_2_1 ) )
            {
            // InternalMSL.g:3675:1: ( ( rule__ConcreteGroup__ManGrpAssignment_5_2_1 ) )
            // InternalMSL.g:3676:2: ( rule__ConcreteGroup__ManGrpAssignment_5_2_1 )
            {
             before(grammarAccess.getConcreteGroupAccess().getManGrpAssignment_5_2_1()); 
            // InternalMSL.g:3677:2: ( rule__ConcreteGroup__ManGrpAssignment_5_2_1 )
            // InternalMSL.g:3677:3: rule__ConcreteGroup__ManGrpAssignment_5_2_1
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
    // InternalMSL.g:3686:1: rule__ConcreteGroup__Group_8__0 : rule__ConcreteGroup__Group_8__0__Impl rule__ConcreteGroup__Group_8__1 ;
    public final void rule__ConcreteGroup__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3690:1: ( rule__ConcreteGroup__Group_8__0__Impl rule__ConcreteGroup__Group_8__1 )
            // InternalMSL.g:3691:2: rule__ConcreteGroup__Group_8__0__Impl rule__ConcreteGroup__Group_8__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMSL.g:3698:1: rule__ConcreteGroup__Group_8__0__Impl : ( ',' ) ;
    public final void rule__ConcreteGroup__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3702:1: ( ( ',' ) )
            // InternalMSL.g:3703:1: ( ',' )
            {
            // InternalMSL.g:3703:1: ( ',' )
            // InternalMSL.g:3704:2: ','
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
    // InternalMSL.g:3713:1: rule__ConcreteGroup__Group_8__1 : rule__ConcreteGroup__Group_8__1__Impl ;
    public final void rule__ConcreteGroup__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3717:1: ( rule__ConcreteGroup__Group_8__1__Impl )
            // InternalMSL.g:3718:2: rule__ConcreteGroup__Group_8__1__Impl
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
    // InternalMSL.g:3724:1: rule__ConcreteGroup__Group_8__1__Impl : ( ( rule__ConcreteGroup__ComponentsAssignment_8_1 ) ) ;
    public final void rule__ConcreteGroup__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3728:1: ( ( ( rule__ConcreteGroup__ComponentsAssignment_8_1 ) ) )
            // InternalMSL.g:3729:1: ( ( rule__ConcreteGroup__ComponentsAssignment_8_1 ) )
            {
            // InternalMSL.g:3729:1: ( ( rule__ConcreteGroup__ComponentsAssignment_8_1 ) )
            // InternalMSL.g:3730:2: ( rule__ConcreteGroup__ComponentsAssignment_8_1 )
            {
             before(grammarAccess.getConcreteGroupAccess().getComponentsAssignment_8_1()); 
            // InternalMSL.g:3731:2: ( rule__ConcreteGroup__ComponentsAssignment_8_1 )
            // InternalMSL.g:3731:3: rule__ConcreteGroup__ComponentsAssignment_8_1
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
    // InternalMSL.g:3740:1: rule__ComponentInstance__Group__0 : rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 ;
    public final void rule__ComponentInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3744:1: ( rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 )
            // InternalMSL.g:3745:2: rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMSL.g:3752:1: rule__ComponentInstance__Group__0__Impl : ( ( rule__ComponentInstance__NameAssignment_0 ) ) ;
    public final void rule__ComponentInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3756:1: ( ( ( rule__ComponentInstance__NameAssignment_0 ) ) )
            // InternalMSL.g:3757:1: ( ( rule__ComponentInstance__NameAssignment_0 ) )
            {
            // InternalMSL.g:3757:1: ( ( rule__ComponentInstance__NameAssignment_0 ) )
            // InternalMSL.g:3758:2: ( rule__ComponentInstance__NameAssignment_0 )
            {
             before(grammarAccess.getComponentInstanceAccess().getNameAssignment_0()); 
            // InternalMSL.g:3759:2: ( rule__ComponentInstance__NameAssignment_0 )
            // InternalMSL.g:3759:3: rule__ComponentInstance__NameAssignment_0
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
    // InternalMSL.g:3767:1: rule__ComponentInstance__Group__1 : rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 ;
    public final void rule__ComponentInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3771:1: ( rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 )
            // InternalMSL.g:3772:2: rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMSL.g:3779:1: rule__ComponentInstance__Group__1__Impl : ( ':' ) ;
    public final void rule__ComponentInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3783:1: ( ( ':' ) )
            // InternalMSL.g:3784:1: ( ':' )
            {
            // InternalMSL.g:3784:1: ( ':' )
            // InternalMSL.g:3785:2: ':'
            {
             before(grammarAccess.getComponentInstanceAccess().getColonKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMSL.g:3794:1: rule__ComponentInstance__Group__2 : rule__ComponentInstance__Group__2__Impl ;
    public final void rule__ComponentInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3798:1: ( rule__ComponentInstance__Group__2__Impl )
            // InternalMSL.g:3799:2: rule__ComponentInstance__Group__2__Impl
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
    // InternalMSL.g:3805:1: rule__ComponentInstance__Group__2__Impl : ( ( rule__ComponentInstance__TypeAssignment_2 ) ) ;
    public final void rule__ComponentInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3809:1: ( ( ( rule__ComponentInstance__TypeAssignment_2 ) ) )
            // InternalMSL.g:3810:1: ( ( rule__ComponentInstance__TypeAssignment_2 ) )
            {
            // InternalMSL.g:3810:1: ( ( rule__ComponentInstance__TypeAssignment_2 ) )
            // InternalMSL.g:3811:2: ( rule__ComponentInstance__TypeAssignment_2 )
            {
             before(grammarAccess.getComponentInstanceAccess().getTypeAssignment_2()); 
            // InternalMSL.g:3812:2: ( rule__ComponentInstance__TypeAssignment_2 )
            // InternalMSL.g:3812:3: rule__ComponentInstance__TypeAssignment_2
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
    // InternalMSL.g:3821:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3825:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // InternalMSL.g:3826:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMSL.g:3833:1: rule__Interaction__Group__0__Impl : ( ( rule__Interaction__StartAssignment_0 ) ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3837:1: ( ( ( rule__Interaction__StartAssignment_0 ) ) )
            // InternalMSL.g:3838:1: ( ( rule__Interaction__StartAssignment_0 ) )
            {
            // InternalMSL.g:3838:1: ( ( rule__Interaction__StartAssignment_0 ) )
            // InternalMSL.g:3839:2: ( rule__Interaction__StartAssignment_0 )
            {
             before(grammarAccess.getInteractionAccess().getStartAssignment_0()); 
            // InternalMSL.g:3840:2: ( rule__Interaction__StartAssignment_0 )
            // InternalMSL.g:3840:3: rule__Interaction__StartAssignment_0
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
    // InternalMSL.g:3848:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3852:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // InternalMSL.g:3853:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalMSL.g:3860:1: rule__Interaction__Group__1__Impl : ( '->' ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3864:1: ( ( '->' ) )
            // InternalMSL.g:3865:1: ( '->' )
            {
            // InternalMSL.g:3865:1: ( '->' )
            // InternalMSL.g:3866:2: '->'
            {
             before(grammarAccess.getInteractionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMSL.g:3875:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3879:1: ( rule__Interaction__Group__2__Impl )
            // InternalMSL.g:3880:2: rule__Interaction__Group__2__Impl
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
    // InternalMSL.g:3886:1: rule__Interaction__Group__2__Impl : ( ( rule__Interaction__EndAssignment_2 ) ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3890:1: ( ( ( rule__Interaction__EndAssignment_2 ) ) )
            // InternalMSL.g:3891:1: ( ( rule__Interaction__EndAssignment_2 ) )
            {
            // InternalMSL.g:3891:1: ( ( rule__Interaction__EndAssignment_2 ) )
            // InternalMSL.g:3892:2: ( rule__Interaction__EndAssignment_2 )
            {
             before(grammarAccess.getInteractionAccess().getEndAssignment_2()); 
            // InternalMSL.g:3893:2: ( rule__Interaction__EndAssignment_2 )
            // InternalMSL.g:3893:3: rule__Interaction__EndAssignment_2
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
    // InternalMSL.g:3902:1: rule__Specification__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Specification__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3906:1: ( ( ruleImport ) )
            // InternalMSL.g:3907:2: ( ruleImport )
            {
            // InternalMSL.g:3907:2: ( ruleImport )
            // InternalMSL.g:3908:3: ruleImport
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
    // InternalMSL.g:3917:1: rule__Specification__AbsPatternAssignment_1 : ( ruleAbstractPattern ) ;
    public final void rule__Specification__AbsPatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3921:1: ( ( ruleAbstractPattern ) )
            // InternalMSL.g:3922:2: ( ruleAbstractPattern )
            {
            // InternalMSL.g:3922:2: ( ruleAbstractPattern )
            // InternalMSL.g:3923:3: ruleAbstractPattern
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
    // InternalMSL.g:3932:1: rule__Specification__PatternAssignment_2 : ( rulePattern ) ;
    public final void rule__Specification__PatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3936:1: ( ( rulePattern ) )
            // InternalMSL.g:3937:2: ( rulePattern )
            {
            // InternalMSL.g:3937:2: ( rulePattern )
            // InternalMSL.g:3938:3: rulePattern
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
    // InternalMSL.g:3947:1: rule__Specification__ConfigurationAssignment_3 : ( ruleConfiguration ) ;
    public final void rule__Specification__ConfigurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3951:1: ( ( ruleConfiguration ) )
            // InternalMSL.g:3952:2: ( ruleConfiguration )
            {
            // InternalMSL.g:3952:2: ( ruleConfiguration )
            // InternalMSL.g:3953:3: ruleConfiguration
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
    // InternalMSL.g:3962:1: rule__Import__ImportedNamespaceAssignment_1 : ( ( RULE_PATTERN_ID ) ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3966:1: ( ( ( RULE_PATTERN_ID ) ) )
            // InternalMSL.g:3967:2: ( ( RULE_PATTERN_ID ) )
            {
            // InternalMSL.g:3967:2: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:3968:3: ( RULE_PATTERN_ID )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAbstractPatternCrossReference_1_0()); 
            // InternalMSL.g:3969:3: ( RULE_PATTERN_ID )
            // InternalMSL.g:3970:4: RULE_PATTERN_ID
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
    // InternalMSL.g:3981:1: rule__AbstractPattern__NameAssignment_2 : ( RULE_PATTERN_ID ) ;
    public final void rule__AbstractPattern__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:3985:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:3986:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:3986:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:3987:3: RULE_PATTERN_ID
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
    // InternalMSL.g:3996:1: rule__AbstractPattern__ManagedSystemsAssignment_4 : ( ruleAbstractSystem ) ;
    public final void rule__AbstractPattern__ManagedSystemsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4000:1: ( ( ruleAbstractSystem ) )
            // InternalMSL.g:4001:2: ( ruleAbstractSystem )
            {
            // InternalMSL.g:4001:2: ( ruleAbstractSystem )
            // InternalMSL.g:4002:3: ruleAbstractSystem
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
    // InternalMSL.g:4011:1: rule__AbstractPattern__AbstractGroupsAssignment_5 : ( ruleAbstractGroup ) ;
    public final void rule__AbstractPattern__AbstractGroupsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4015:1: ( ( ruleAbstractGroup ) )
            // InternalMSL.g:4016:2: ( ruleAbstractGroup )
            {
            // InternalMSL.g:4016:2: ( ruleAbstractGroup )
            // InternalMSL.g:4017:3: ruleAbstractGroup
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
    // InternalMSL.g:4026:1: rule__AbstractPattern__InteractionsAssignment_6 : ( ruleAbstractInteraction ) ;
    public final void rule__AbstractPattern__InteractionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4030:1: ( ( ruleAbstractInteraction ) )
            // InternalMSL.g:4031:2: ( ruleAbstractInteraction )
            {
            // InternalMSL.g:4031:2: ( ruleAbstractInteraction )
            // InternalMSL.g:4032:3: ruleAbstractInteraction
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
    // InternalMSL.g:4041:1: rule__AbstractSystem__NameAssignment_1 : ( RULE_PATTERN_ID ) ;
    public final void rule__AbstractSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4045:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4046:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:4046:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:4047:3: RULE_PATTERN_ID
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
    // InternalMSL.g:4056:1: rule__AbstractComponent__NameAssignment : ( RULE_COMPONENT_TYPE ) ;
    public final void rule__AbstractComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4060:1: ( ( RULE_COMPONENT_TYPE ) )
            // InternalMSL.g:4061:2: ( RULE_COMPONENT_TYPE )
            {
            // InternalMSL.g:4061:2: ( RULE_COMPONENT_TYPE )
            // InternalMSL.g:4062:3: RULE_COMPONENT_TYPE
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
    // InternalMSL.g:4071:1: rule__GroupDef__GrpAssignment_0 : ( ( RULE_PATTERN_ID ) ) ;
    public final void rule__GroupDef__GrpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4075:1: ( ( ( RULE_PATTERN_ID ) ) )
            // InternalMSL.g:4076:2: ( ( RULE_PATTERN_ID ) )
            {
            // InternalMSL.g:4076:2: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4077:3: ( RULE_PATTERN_ID )
            {
             before(grammarAccess.getGroupDefAccess().getGrpAbstractGroupCrossReference_0_0()); 
            // InternalMSL.g:4078:3: ( RULE_PATTERN_ID )
            // InternalMSL.g:4079:4: RULE_PATTERN_ID
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
    // InternalMSL.g:4090:1: rule__GroupDef__MultAssignment_1_1 : ( RULE_MULTIPLICITY ) ;
    public final void rule__GroupDef__MultAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4094:1: ( ( RULE_MULTIPLICITY ) )
            // InternalMSL.g:4095:2: ( RULE_MULTIPLICITY )
            {
            // InternalMSL.g:4095:2: ( RULE_MULTIPLICITY )
            // InternalMSL.g:4096:3: RULE_MULTIPLICITY
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


    // $ANTLR start "rule__AttValue__NameAttAssignment_0"
    // InternalMSL.g:4105:1: rule__AttValue__NameAttAssignment_0 : ( RULE_INSTANCE_ID ) ;
    public final void rule__AttValue__NameAttAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4109:1: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4110:2: ( RULE_INSTANCE_ID )
            {
            // InternalMSL.g:4110:2: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4111:3: RULE_INSTANCE_ID
            {
             before(grammarAccess.getAttValueAccess().getNameAttINSTANCE_IDTerminalRuleCall_0_0()); 
            match(input,RULE_INSTANCE_ID,FOLLOW_2); 
             after(grammarAccess.getAttValueAccess().getNameAttINSTANCE_IDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttValue__NameAttAssignment_0"


    // $ANTLR start "rule__AttValue__ValAttAssignment_2"
    // InternalMSL.g:4120:1: rule__AttValue__ValAttAssignment_2 : ( RULE_INSTANCE_ID ) ;
    public final void rule__AttValue__ValAttAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4124:1: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4125:2: ( RULE_INSTANCE_ID )
            {
            // InternalMSL.g:4125:2: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4126:3: RULE_INSTANCE_ID
            {
             before(grammarAccess.getAttValueAccess().getValAttINSTANCE_IDTerminalRuleCall_2_0()); 
            match(input,RULE_INSTANCE_ID,FOLLOW_2); 
             after(grammarAccess.getAttValueAccess().getValAttINSTANCE_IDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttValue__ValAttAssignment_2"


    // $ANTLR start "rule__AbstractGroup__NameAssignment_1"
    // InternalMSL.g:4135:1: rule__AbstractGroup__NameAssignment_1 : ( RULE_PATTERN_ID ) ;
    public final void rule__AbstractGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4139:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4140:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:4140:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:4141:3: RULE_PATTERN_ID
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
    // InternalMSL.g:4150:1: rule__AbstractGroup__ManSysAssignment_3_1 : ( ( RULE_PATTERN_ID ) ) ;
    public final void rule__AbstractGroup__ManSysAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4154:1: ( ( ( RULE_PATTERN_ID ) ) )
            // InternalMSL.g:4155:2: ( ( RULE_PATTERN_ID ) )
            {
            // InternalMSL.g:4155:2: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4156:3: ( RULE_PATTERN_ID )
            {
             before(grammarAccess.getAbstractGroupAccess().getManSysAbstractSystemCrossReference_3_1_0()); 
            // InternalMSL.g:4157:3: ( RULE_PATTERN_ID )
            // InternalMSL.g:4158:4: RULE_PATTERN_ID
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


    // $ANTLR start "rule__AbstractGroup__AttValuesAssignment_3_2_1"
    // InternalMSL.g:4169:1: rule__AbstractGroup__AttValuesAssignment_3_2_1 : ( ruleAttValue ) ;
    public final void rule__AbstractGroup__AttValuesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4173:1: ( ( ruleAttValue ) )
            // InternalMSL.g:4174:2: ( ruleAttValue )
            {
            // InternalMSL.g:4174:2: ( ruleAttValue )
            // InternalMSL.g:4175:3: ruleAttValue
            {
             before(grammarAccess.getAbstractGroupAccess().getAttValuesAttValueParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttValue();

            state._fsp--;

             after(grammarAccess.getAbstractGroupAccess().getAttValuesAttValueParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__AttValuesAssignment_3_2_1"


    // $ANTLR start "rule__AbstractGroup__AttValuesAssignment_3_2_2_1"
    // InternalMSL.g:4184:1: rule__AbstractGroup__AttValuesAssignment_3_2_2_1 : ( ruleAttValue ) ;
    public final void rule__AbstractGroup__AttValuesAssignment_3_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4188:1: ( ( ruleAttValue ) )
            // InternalMSL.g:4189:2: ( ruleAttValue )
            {
            // InternalMSL.g:4189:2: ( ruleAttValue )
            // InternalMSL.g:4190:3: ruleAttValue
            {
             before(grammarAccess.getAbstractGroupAccess().getAttValuesAttValueParserRuleCall_3_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttValue();

            state._fsp--;

             after(grammarAccess.getAbstractGroupAccess().getAttValuesAttValueParserRuleCall_3_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractGroup__AttValuesAssignment_3_2_2_1"


    // $ANTLR start "rule__AbstractGroup__ManGrpAssignment_4_1"
    // InternalMSL.g:4199:1: rule__AbstractGroup__ManGrpAssignment_4_1 : ( ruleGroupDef ) ;
    public final void rule__AbstractGroup__ManGrpAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4203:1: ( ( ruleGroupDef ) )
            // InternalMSL.g:4204:2: ( ruleGroupDef )
            {
            // InternalMSL.g:4204:2: ( ruleGroupDef )
            // InternalMSL.g:4205:3: ruleGroupDef
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
    // InternalMSL.g:4214:1: rule__AbstractGroup__ManGrpAssignment_4_2_1 : ( ruleGroupDef ) ;
    public final void rule__AbstractGroup__ManGrpAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4218:1: ( ( ruleGroupDef ) )
            // InternalMSL.g:4219:2: ( ruleGroupDef )
            {
            // InternalMSL.g:4219:2: ( ruleGroupDef )
            // InternalMSL.g:4220:3: ruleGroupDef
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
    // InternalMSL.g:4229:1: rule__AbstractGroup__ComponentsAssignment_6 : ( ruleAbstractComponent ) ;
    public final void rule__AbstractGroup__ComponentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4233:1: ( ( ruleAbstractComponent ) )
            // InternalMSL.g:4234:2: ( ruleAbstractComponent )
            {
            // InternalMSL.g:4234:2: ( ruleAbstractComponent )
            // InternalMSL.g:4235:3: ruleAbstractComponent
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
    // InternalMSL.g:4244:1: rule__AbstractGroup__ComponentsAssignment_7_1 : ( ruleAbstractComponent ) ;
    public final void rule__AbstractGroup__ComponentsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4248:1: ( ( ruleAbstractComponent ) )
            // InternalMSL.g:4249:2: ( ruleAbstractComponent )
            {
            // InternalMSL.g:4249:2: ( ruleAbstractComponent )
            // InternalMSL.g:4250:3: ruleAbstractComponent
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
    // InternalMSL.g:4259:1: rule__AbstractInteraction__StartAssignment_1 : ( ruleAbstractComponentName ) ;
    public final void rule__AbstractInteraction__StartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4263:1: ( ( ruleAbstractComponentName ) )
            // InternalMSL.g:4264:2: ( ruleAbstractComponentName )
            {
            // InternalMSL.g:4264:2: ( ruleAbstractComponentName )
            // InternalMSL.g:4265:3: ruleAbstractComponentName
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
    // InternalMSL.g:4274:1: rule__AbstractInteraction__EndAssignment_3 : ( ruleAbstractComponentName ) ;
    public final void rule__AbstractInteraction__EndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4278:1: ( ( ruleAbstractComponentName ) )
            // InternalMSL.g:4279:2: ( ruleAbstractComponentName )
            {
            // InternalMSL.g:4279:2: ( ruleAbstractComponentName )
            // InternalMSL.g:4280:3: ruleAbstractComponentName
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
    // InternalMSL.g:4289:1: rule__AbstractInteraction__LowAssignment_4_1 : ( RULE_MULTIPLICITY ) ;
    public final void rule__AbstractInteraction__LowAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4293:1: ( ( RULE_MULTIPLICITY ) )
            // InternalMSL.g:4294:2: ( RULE_MULTIPLICITY )
            {
            // InternalMSL.g:4294:2: ( RULE_MULTIPLICITY )
            // InternalMSL.g:4295:3: RULE_MULTIPLICITY
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
    // InternalMSL.g:4304:1: rule__AbstractInteraction__HighAssignment_4_3 : ( RULE_MULTIPLICITY ) ;
    public final void rule__AbstractInteraction__HighAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4308:1: ( ( RULE_MULTIPLICITY ) )
            // InternalMSL.g:4309:2: ( RULE_MULTIPLICITY )
            {
            // InternalMSL.g:4309:2: ( RULE_MULTIPLICITY )
            // InternalMSL.g:4310:3: RULE_MULTIPLICITY
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
    // InternalMSL.g:4319:1: rule__AbstractComponentName__TypeAssignment : ( ( RULE_FQN_COMPONENT ) ) ;
    public final void rule__AbstractComponentName__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4323:1: ( ( ( RULE_FQN_COMPONENT ) ) )
            // InternalMSL.g:4324:2: ( ( RULE_FQN_COMPONENT ) )
            {
            // InternalMSL.g:4324:2: ( ( RULE_FQN_COMPONENT ) )
            // InternalMSL.g:4325:3: ( RULE_FQN_COMPONENT )
            {
             before(grammarAccess.getAbstractComponentNameAccess().getTypeAbstractComponentCrossReference_0()); 
            // InternalMSL.g:4326:3: ( RULE_FQN_COMPONENT )
            // InternalMSL.g:4327:4: RULE_FQN_COMPONENT
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
    // InternalMSL.g:4338:1: rule__SystemBinding__NameAssignment_1 : ( RULE_PATTERN_ID ) ;
    public final void rule__SystemBinding__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4342:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4343:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:4343:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:4344:3: RULE_PATTERN_ID
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
    // InternalMSL.g:4353:1: rule__SystemBinding__AbsSysAssignment_3 : ( ( RULE_FQN_PATTERN_ID ) ) ;
    public final void rule__SystemBinding__AbsSysAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4357:1: ( ( ( RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:4358:2: ( ( RULE_FQN_PATTERN_ID ) )
            {
            // InternalMSL.g:4358:2: ( ( RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:4359:3: ( RULE_FQN_PATTERN_ID )
            {
             before(grammarAccess.getSystemBindingAccess().getAbsSysAbstractSystemCrossReference_3_0()); 
            // InternalMSL.g:4360:3: ( RULE_FQN_PATTERN_ID )
            // InternalMSL.g:4361:4: RULE_FQN_PATTERN_ID
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
    // InternalMSL.g:4372:1: rule__GroupBinding__NameAssignment_1 : ( RULE_PATTERN_ID ) ;
    public final void rule__GroupBinding__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4376:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4377:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:4377:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:4378:3: RULE_PATTERN_ID
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
    // InternalMSL.g:4387:1: rule__GroupBinding__AbsGroupAssignment_3 : ( ( RULE_FQN_PATTERN_ID ) ) ;
    public final void rule__GroupBinding__AbsGroupAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4391:1: ( ( ( RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:4392:2: ( ( RULE_FQN_PATTERN_ID ) )
            {
            // InternalMSL.g:4392:2: ( ( RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:4393:3: ( RULE_FQN_PATTERN_ID )
            {
             before(grammarAccess.getGroupBindingAccess().getAbsGroupAbstractGroupCrossReference_3_0()); 
            // InternalMSL.g:4394:3: ( RULE_FQN_PATTERN_ID )
            // InternalMSL.g:4395:4: RULE_FQN_PATTERN_ID
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
    // InternalMSL.g:4406:1: rule__Pattern__NameAssignment_2 : ( RULE_PATTERN_ID ) ;
    public final void rule__Pattern__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4410:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4411:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:4411:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:4412:3: RULE_PATTERN_ID
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
    // InternalMSL.g:4421:1: rule__Pattern__AbsPatternAssignment_4 : ( ( RULE_PATTERN_ID ) ) ;
    public final void rule__Pattern__AbsPatternAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4425:1: ( ( ( RULE_PATTERN_ID ) ) )
            // InternalMSL.g:4426:2: ( ( RULE_PATTERN_ID ) )
            {
            // InternalMSL.g:4426:2: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4427:3: ( RULE_PATTERN_ID )
            {
             before(grammarAccess.getPatternAccess().getAbsPatternAbstractPatternCrossReference_4_0()); 
            // InternalMSL.g:4428:3: ( RULE_PATTERN_ID )
            // InternalMSL.g:4429:4: RULE_PATTERN_ID
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
    // InternalMSL.g:4440:1: rule__Pattern__ManagedSystemsAssignment_6 : ( ruleSystemBinding ) ;
    public final void rule__Pattern__ManagedSystemsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4444:1: ( ( ruleSystemBinding ) )
            // InternalMSL.g:4445:2: ( ruleSystemBinding )
            {
            // InternalMSL.g:4445:2: ( ruleSystemBinding )
            // InternalMSL.g:4446:3: ruleSystemBinding
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
    // InternalMSL.g:4455:1: rule__Pattern__GroupsAssignment_7 : ( ruleGroupBinding ) ;
    public final void rule__Pattern__GroupsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4459:1: ( ( ruleGroupBinding ) )
            // InternalMSL.g:4460:2: ( ruleGroupBinding )
            {
            // InternalMSL.g:4460:2: ( ruleGroupBinding )
            // InternalMSL.g:4461:3: ruleGroupBinding
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
    // InternalMSL.g:4470:1: rule__Configuration__NameAssignment_1 : ( RULE_PATTERN_ID ) ;
    public final void rule__Configuration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4474:1: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4475:2: ( RULE_PATTERN_ID )
            {
            // InternalMSL.g:4475:2: ( RULE_PATTERN_ID )
            // InternalMSL.g:4476:3: RULE_PATTERN_ID
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
    // InternalMSL.g:4485:1: rule__Configuration__PatternAssignment_3_0 : ( ( RULE_PATTERN_ID ) ) ;
    public final void rule__Configuration__PatternAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4489:1: ( ( ( RULE_PATTERN_ID ) ) )
            // InternalMSL.g:4490:2: ( ( RULE_PATTERN_ID ) )
            {
            // InternalMSL.g:4490:2: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4491:3: ( RULE_PATTERN_ID )
            {
             before(grammarAccess.getConfigurationAccess().getPatternPatternCrossReference_3_0_0()); 
            // InternalMSL.g:4492:3: ( RULE_PATTERN_ID )
            // InternalMSL.g:4493:4: RULE_PATTERN_ID
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
    // InternalMSL.g:4504:1: rule__Configuration__PatternAssignment_3_1_1 : ( ( RULE_PATTERN_ID ) ) ;
    public final void rule__Configuration__PatternAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4508:1: ( ( ( RULE_PATTERN_ID ) ) )
            // InternalMSL.g:4509:2: ( ( RULE_PATTERN_ID ) )
            {
            // InternalMSL.g:4509:2: ( ( RULE_PATTERN_ID ) )
            // InternalMSL.g:4510:3: ( RULE_PATTERN_ID )
            {
             before(grammarAccess.getConfigurationAccess().getPatternPatternCrossReference_3_1_1_0()); 
            // InternalMSL.g:4511:3: ( RULE_PATTERN_ID )
            // InternalMSL.g:4512:4: RULE_PATTERN_ID
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
    // InternalMSL.g:4523:1: rule__Configuration__ConcreteSystemsAssignment_5 : ( ruleConcreteSystem ) ;
    public final void rule__Configuration__ConcreteSystemsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4527:1: ( ( ruleConcreteSystem ) )
            // InternalMSL.g:4528:2: ( ruleConcreteSystem )
            {
            // InternalMSL.g:4528:2: ( ruleConcreteSystem )
            // InternalMSL.g:4529:3: ruleConcreteSystem
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
    // InternalMSL.g:4538:1: rule__Configuration__ConcreteGroupsAssignment_6 : ( ruleConcreteGroup ) ;
    public final void rule__Configuration__ConcreteGroupsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4542:1: ( ( ruleConcreteGroup ) )
            // InternalMSL.g:4543:2: ( ruleConcreteGroup )
            {
            // InternalMSL.g:4543:2: ( ruleConcreteGroup )
            // InternalMSL.g:4544:3: ruleConcreteGroup
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
    // InternalMSL.g:4553:1: rule__Configuration__ConcreteInteractionsAssignment_7 : ( ruleInteraction ) ;
    public final void rule__Configuration__ConcreteInteractionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4557:1: ( ( ruleInteraction ) )
            // InternalMSL.g:4558:2: ( ruleInteraction )
            {
            // InternalMSL.g:4558:2: ( ruleInteraction )
            // InternalMSL.g:4559:3: ruleInteraction
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
    // InternalMSL.g:4568:1: rule__ConcreteSystem__NameAssignment_0 : ( RULE_INSTANCE_ID ) ;
    public final void rule__ConcreteSystem__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4572:1: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4573:2: ( RULE_INSTANCE_ID )
            {
            // InternalMSL.g:4573:2: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4574:3: RULE_INSTANCE_ID
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
    // InternalMSL.g:4583:1: rule__ConcreteSystem__BindingsAssignment_2_0 : ( ( RULE_FQN_PATTERN_ID ) ) ;
    public final void rule__ConcreteSystem__BindingsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4587:1: ( ( ( RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:4588:2: ( ( RULE_FQN_PATTERN_ID ) )
            {
            // InternalMSL.g:4588:2: ( ( RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:4589:3: ( RULE_FQN_PATTERN_ID )
            {
             before(grammarAccess.getConcreteSystemAccess().getBindingsSystemBindingCrossReference_2_0_0()); 
            // InternalMSL.g:4590:3: ( RULE_FQN_PATTERN_ID )
            // InternalMSL.g:4591:4: RULE_FQN_PATTERN_ID
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
    // InternalMSL.g:4602:1: rule__ConcreteSystem__BindingsAssignment_2_1_1 : ( ( RULE_FQN_PATTERN_ID ) ) ;
    public final void rule__ConcreteSystem__BindingsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4606:1: ( ( ( RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:4607:2: ( ( RULE_FQN_PATTERN_ID ) )
            {
            // InternalMSL.g:4607:2: ( ( RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:4608:3: ( RULE_FQN_PATTERN_ID )
            {
             before(grammarAccess.getConcreteSystemAccess().getBindingsSystemBindingCrossReference_2_1_1_0()); 
            // InternalMSL.g:4609:3: ( RULE_FQN_PATTERN_ID )
            // InternalMSL.g:4610:4: RULE_FQN_PATTERN_ID
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
    // InternalMSL.g:4621:1: rule__ConcreteGroup__NameAssignment_0 : ( RULE_INSTANCE_ID ) ;
    public final void rule__ConcreteGroup__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4625:1: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4626:2: ( RULE_INSTANCE_ID )
            {
            // InternalMSL.g:4626:2: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4627:3: RULE_INSTANCE_ID
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
    // InternalMSL.g:4636:1: rule__ConcreteGroup__AbstractGroupsAssignment_2_0 : ( ( RULE_FQN_PATTERN_ID ) ) ;
    public final void rule__ConcreteGroup__AbstractGroupsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4640:1: ( ( ( RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:4641:2: ( ( RULE_FQN_PATTERN_ID ) )
            {
            // InternalMSL.g:4641:2: ( ( RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:4642:3: ( RULE_FQN_PATTERN_ID )
            {
             before(grammarAccess.getConcreteGroupAccess().getAbstractGroupsGroupBindingCrossReference_2_0_0()); 
            // InternalMSL.g:4643:3: ( RULE_FQN_PATTERN_ID )
            // InternalMSL.g:4644:4: RULE_FQN_PATTERN_ID
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
    // InternalMSL.g:4655:1: rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1 : ( ( RULE_FQN_PATTERN_ID ) ) ;
    public final void rule__ConcreteGroup__AbstractGroupsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4659:1: ( ( ( RULE_FQN_PATTERN_ID ) ) )
            // InternalMSL.g:4660:2: ( ( RULE_FQN_PATTERN_ID ) )
            {
            // InternalMSL.g:4660:2: ( ( RULE_FQN_PATTERN_ID ) )
            // InternalMSL.g:4661:3: ( RULE_FQN_PATTERN_ID )
            {
             before(grammarAccess.getConcreteGroupAccess().getAbstractGroupsGroupBindingCrossReference_2_1_1_0()); 
            // InternalMSL.g:4662:3: ( RULE_FQN_PATTERN_ID )
            // InternalMSL.g:4663:4: RULE_FQN_PATTERN_ID
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
    // InternalMSL.g:4674:1: rule__ConcreteGroup__ManSysAssignment_4_1 : ( ( RULE_INSTANCE_ID ) ) ;
    public final void rule__ConcreteGroup__ManSysAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4678:1: ( ( ( RULE_INSTANCE_ID ) ) )
            // InternalMSL.g:4679:2: ( ( RULE_INSTANCE_ID ) )
            {
            // InternalMSL.g:4679:2: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4680:3: ( RULE_INSTANCE_ID )
            {
             before(grammarAccess.getConcreteGroupAccess().getManSysConcreteSystemCrossReference_4_1_0()); 
            // InternalMSL.g:4681:3: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4682:4: RULE_INSTANCE_ID
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
    // InternalMSL.g:4693:1: rule__ConcreteGroup__ManGrpAssignment_5_1 : ( ( RULE_INSTANCE_ID ) ) ;
    public final void rule__ConcreteGroup__ManGrpAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4697:1: ( ( ( RULE_INSTANCE_ID ) ) )
            // InternalMSL.g:4698:2: ( ( RULE_INSTANCE_ID ) )
            {
            // InternalMSL.g:4698:2: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4699:3: ( RULE_INSTANCE_ID )
            {
             before(grammarAccess.getConcreteGroupAccess().getManGrpConcreteGroupCrossReference_5_1_0()); 
            // InternalMSL.g:4700:3: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4701:4: RULE_INSTANCE_ID
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
    // InternalMSL.g:4712:1: rule__ConcreteGroup__ManGrpAssignment_5_2_1 : ( ( RULE_INSTANCE_ID ) ) ;
    public final void rule__ConcreteGroup__ManGrpAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4716:1: ( ( ( RULE_INSTANCE_ID ) ) )
            // InternalMSL.g:4717:2: ( ( RULE_INSTANCE_ID ) )
            {
            // InternalMSL.g:4717:2: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4718:3: ( RULE_INSTANCE_ID )
            {
             before(grammarAccess.getConcreteGroupAccess().getManGrpConcreteGroupCrossReference_5_2_1_0()); 
            // InternalMSL.g:4719:3: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4720:4: RULE_INSTANCE_ID
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
    // InternalMSL.g:4731:1: rule__ConcreteGroup__ComponentsAssignment_7 : ( ruleComponentInstance ) ;
    public final void rule__ConcreteGroup__ComponentsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4735:1: ( ( ruleComponentInstance ) )
            // InternalMSL.g:4736:2: ( ruleComponentInstance )
            {
            // InternalMSL.g:4736:2: ( ruleComponentInstance )
            // InternalMSL.g:4737:3: ruleComponentInstance
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
    // InternalMSL.g:4746:1: rule__ConcreteGroup__ComponentsAssignment_8_1 : ( ruleComponentInstance ) ;
    public final void rule__ConcreteGroup__ComponentsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4750:1: ( ( ruleComponentInstance ) )
            // InternalMSL.g:4751:2: ( ruleComponentInstance )
            {
            // InternalMSL.g:4751:2: ( ruleComponentInstance )
            // InternalMSL.g:4752:3: ruleComponentInstance
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
    // InternalMSL.g:4761:1: rule__ComponentInstance__NameAssignment_0 : ( RULE_INSTANCE_ID ) ;
    public final void rule__ComponentInstance__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4765:1: ( ( RULE_INSTANCE_ID ) )
            // InternalMSL.g:4766:2: ( RULE_INSTANCE_ID )
            {
            // InternalMSL.g:4766:2: ( RULE_INSTANCE_ID )
            // InternalMSL.g:4767:3: RULE_INSTANCE_ID
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
    // InternalMSL.g:4776:1: rule__ComponentInstance__TypeAssignment_2 : ( RULE_COMPONENT_TYPE ) ;
    public final void rule__ComponentInstance__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4780:1: ( ( RULE_COMPONENT_TYPE ) )
            // InternalMSL.g:4781:2: ( RULE_COMPONENT_TYPE )
            {
            // InternalMSL.g:4781:2: ( RULE_COMPONENT_TYPE )
            // InternalMSL.g:4782:3: RULE_COMPONENT_TYPE
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
    // InternalMSL.g:4791:1: rule__Interaction__StartAssignment_0 : ( ruleComponentName ) ;
    public final void rule__Interaction__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4795:1: ( ( ruleComponentName ) )
            // InternalMSL.g:4796:2: ( ruleComponentName )
            {
            // InternalMSL.g:4796:2: ( ruleComponentName )
            // InternalMSL.g:4797:3: ruleComponentName
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
    // InternalMSL.g:4806:1: rule__Interaction__EndAssignment_2 : ( ruleComponentName ) ;
    public final void rule__Interaction__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4810:1: ( ( ruleComponentName ) )
            // InternalMSL.g:4811:2: ( ruleComponentName )
            {
            // InternalMSL.g:4811:2: ( ruleComponentName )
            // InternalMSL.g:4812:3: ruleComponentName
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
    // InternalMSL.g:4821:1: rule__ComponentName__ComponentAssignment : ( ( RULE_FQN_INSTANCE_ID ) ) ;
    public final void rule__ComponentName__ComponentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSL.g:4825:1: ( ( ( RULE_FQN_INSTANCE_ID ) ) )
            // InternalMSL.g:4826:2: ( ( RULE_FQN_INSTANCE_ID ) )
            {
            // InternalMSL.g:4826:2: ( ( RULE_FQN_INSTANCE_ID ) )
            // InternalMSL.g:4827:3: ( RULE_FQN_INSTANCE_ID )
            {
             before(grammarAccess.getComponentNameAccess().getComponentComponentInstanceCrossReference_0()); 
            // InternalMSL.g:4828:3: ( RULE_FQN_INSTANCE_ID )
            // InternalMSL.g:4829:4: RULE_FQN_INSTANCE_ID
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


    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\7\1\42\1\uffff\1\11\1\7\1\11\1\uffff\1\7";
    static final String dfa_3s = "\1\26\1\42\1\uffff\1\11\1\36\1\11\1\uffff\1\36";
    static final String dfa_4s = "\2\uffff\1\2\3\uffff\1\1\1\uffff";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2\13\uffff\1\2",
            "\1\3",
            "",
            "\1\4",
            "\1\6\2\uffff\1\6\12\uffff\1\2\1\6\7\uffff\1\5",
            "\1\7",
            "",
            "\1\6\2\uffff\1\6\12\uffff\1\2\1\6\7\uffff\1\5"
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
        public String getDescription() {
            return "()* loopback of 2733:2: ( rule__Configuration__ConcreteSystemsAssignment_5 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002800080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000108C00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000B0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008C00000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000400480L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000400L});

}