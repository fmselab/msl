/*
 * generated by Xtext 2.12.0
 */
package org.xtext.msl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.msl.parser.antlr.internal.InternalMSLParser;
import org.xtext.msl.services.MSLGrammarAccess;

public class MSLParser extends AbstractAntlrParser {

	@Inject
	private MSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMSLParser createParser(XtextTokenStream stream) {
		return new InternalMSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Specification";
	}

	public MSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
