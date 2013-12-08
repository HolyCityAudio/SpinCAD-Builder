/*
* generated by Xtext
*/
package com.holycityaudio.spincad.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.holycityaudio.spincad.services.SpinCADGrammarAccess;

public class SpinCADParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SpinCADGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.holycityaudio.spincad.parser.antlr.internal.InternalSpinCADParser createParser(XtextTokenStream stream) {
		return new com.holycityaudio.spincad.parser.antlr.internal.InternalSpinCADParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}
	
	public SpinCADGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SpinCADGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
