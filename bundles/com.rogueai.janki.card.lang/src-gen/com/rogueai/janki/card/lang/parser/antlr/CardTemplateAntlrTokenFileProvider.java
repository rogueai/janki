/*
* generated by Xtext
*/
package com.rogueai.janki.card.lang.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CardTemplateAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.tokens");
	}
}