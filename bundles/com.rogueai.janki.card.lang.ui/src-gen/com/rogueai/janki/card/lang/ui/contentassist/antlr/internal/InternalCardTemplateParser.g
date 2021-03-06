/*
* generated by Xtext
*/
parser grammar InternalCardTemplateParser;

options {
	tokenVocab=InternalCardTemplateLexer;
	superClass=AbstractInternalContentAssistParser;
	
}

@header {
package com.rogueai.janki.card.lang.ui.contentassist.antlr.internal; 

import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.rogueai.janki.card.lang.services.CardTemplateGrammarAccess;

}

@members {
 
 	private CardTemplateGrammarAccess grammarAccess;
 	
 	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
 	
 	{
		tokenNameToValue.put("KEYWORD_1", "''");
		tokenNameToValue.put("KEYWORD_2", "':'");
		tokenNameToValue.put("KEYWORD_3", "'<'");
		tokenNameToValue.put("KEYWORD_4", "'='");
		tokenNameToValue.put("KEYWORD_5", "'>'");
		tokenNameToValue.put("KEYWORD_6", "'/>'");
		tokenNameToValue.put("KEYWORD_7", "'</'");
		tokenNameToValue.put("KEYWORD_8", "'<html>'");
		tokenNameToValue.put("KEYWORD_9", "'</html>'");
 	}
 	
    public void setGrammarAccess(CardTemplateGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }

	@Override
    protected String getValueForTokenName(String tokenName) {
    	String result = tokenNameToValue.get(tokenName);
    	if (result == null)
    		result = tokenName;
    	return result;
    }
}




// Entry rule entryRuleHtml
entryRuleHtml 
:
{ before(grammarAccess.getHtmlRule()); }
	 ruleHtml
{ after(grammarAccess.getHtmlRule()); } 
	 EOF 
;

// Rule Html
ruleHtml 
    @init {
		int stackSize = keepStackSize();
    }
    :
(
{ before(grammarAccess.getHtmlAccess().getGroup()); }
(rule__Html__Group__0)
{ after(grammarAccess.getHtmlAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTag
entryRuleTag 
:
{ before(grammarAccess.getTagRule()); }
	 ruleTag
{ after(grammarAccess.getTagRule()); } 
	 EOF 
;

// Rule Tag
ruleTag 
    @init {
		int stackSize = keepStackSize();
    }
    :
(
{ before(grammarAccess.getTagAccess().getAlternatives()); }
(rule__Tag__Alternatives)
{ after(grammarAccess.getTagAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAttribute
entryRuleAttribute 
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute 
    @init {
		int stackSize = keepStackSize();
    }
    :
(
{ before(grammarAccess.getAttributeAccess().getGroup()); }
(rule__Attribute__Group__0)
{ after(grammarAccess.getAttributeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleType
entryRuleType 
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
    @init {
		int stackSize = keepStackSize();
    }
    :
(
{ before(grammarAccess.getTypeAccess().getGroup()); }
(rule__Type__Group__0)
{ after(grammarAccess.getTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Tag__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getGroup_0()); }
(rule__Tag__Group_0__0)
{ after(grammarAccess.getTagAccess().getGroup_0()); }
)

    |(
{ before(grammarAccess.getTagAccess().getGroup_1()); }
(rule__Tag__Group_1__0)
{ after(grammarAccess.getTagAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Html__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Html__Group__0__Impl
	rule__Html__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Html__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHtmlAccess().getHtmlKeyword_0()); }

	KEYWORD_8 

{ after(grammarAccess.getHtmlAccess().getHtmlKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Html__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Html__Group__1__Impl
	rule__Html__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Html__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHtmlAccess().getContentAssignment_1()); }
(rule__Html__ContentAssignment_1)*
{ after(grammarAccess.getHtmlAccess().getContentAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Html__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Html__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Html__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHtmlAccess().getHtmlKeyword_2()); }

	KEYWORD_9 

{ after(grammarAccess.getHtmlAccess().getHtmlKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Tag__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Tag__Group_0__0__Impl
	rule__Tag__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getLessThanSignKeyword_0_0()); }

	KEYWORD_3 

{ after(grammarAccess.getTagAccess().getLessThanSignKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Tag__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Tag__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getGroup_0_1()); }
(rule__Tag__Group_0_1__0)
{ after(grammarAccess.getTagAccess().getGroup_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Tag__Group_0_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Tag__Group_0_1__0__Impl
	rule__Tag__Group_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__Group_0_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getStartTagNameAssignment_0_1_0()); }
(rule__Tag__StartTagNameAssignment_0_1_0)
{ after(grammarAccess.getTagAccess().getStartTagNameAssignment_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Tag__Group_0_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Tag__Group_0_1__1__Impl
	rule__Tag__Group_0_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__Group_0_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getAttributesAssignment_0_1_1()); }
(rule__Tag__AttributesAssignment_0_1_1)*
{ after(grammarAccess.getTagAccess().getAttributesAssignment_0_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Tag__Group_0_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Tag__Group_0_1__2__Impl
	rule__Tag__Group_0_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__Group_0_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getGreaterThanSignKeyword_0_1_2()); }

	KEYWORD_5 

{ after(grammarAccess.getTagAccess().getGreaterThanSignKeyword_0_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Tag__Group_0_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Tag__Group_0_1__3__Impl
	rule__Tag__Group_0_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__Group_0_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getChildrenAssignment_0_1_3()); }
(rule__Tag__ChildrenAssignment_0_1_3)*
{ after(grammarAccess.getTagAccess().getChildrenAssignment_0_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Tag__Group_0_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Tag__Group_0_1__4__Impl
	rule__Tag__Group_0_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__Group_0_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getLessThanSignSolidusKeyword_0_1_4()); }

	KEYWORD_7 

{ after(grammarAccess.getTagAccess().getLessThanSignSolidusKeyword_0_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Tag__Group_0_1__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Tag__Group_0_1__5__Impl
	rule__Tag__Group_0_1__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__Group_0_1__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getEndTagNameAssignment_0_1_5()); }
(rule__Tag__EndTagNameAssignment_0_1_5)
{ after(grammarAccess.getTagAccess().getEndTagNameAssignment_0_1_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Tag__Group_0_1__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Tag__Group_0_1__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__Group_0_1__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getGreaterThanSignKeyword_0_1_6()); }

	KEYWORD_5 

{ after(grammarAccess.getTagAccess().getGreaterThanSignKeyword_0_1_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__Tag__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Tag__Group_1__0__Impl
	rule__Tag__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getStartTagNameAssignment_1_0()); }
(rule__Tag__StartTagNameAssignment_1_0)
{ after(grammarAccess.getTagAccess().getStartTagNameAssignment_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Tag__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Tag__Group_1__1__Impl
	rule__Tag__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getAttributesAssignment_1_1()); }
(rule__Tag__AttributesAssignment_1_1)*
{ after(grammarAccess.getTagAccess().getAttributesAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Tag__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Tag__Group_1__2__Impl
	rule__Tag__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getEndTagNameAssignment_1_2()); }
(rule__Tag__EndTagNameAssignment_1_2)
{ after(grammarAccess.getTagAccess().getEndTagNameAssignment_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Tag__Group_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Tag__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__Group_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getSolidusGreaterThanSignKeyword_1_3()); }

	KEYWORD_6 

{ after(grammarAccess.getTagAccess().getSolidusGreaterThanSignKeyword_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Attribute__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getAttributeNameAssignment_0()); }
(rule__Attribute__AttributeNameAssignment_0)
{ after(grammarAccess.getAttributeAccess().getAttributeNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); }

	KEYWORD_4 

{ after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getAttributeValueAssignment_2()); }
(rule__Attribute__AttributeValueAssignment_2)
{ after(grammarAccess.getAttributeAccess().getAttributeValueAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Type__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Type__Group__0__Impl
	rule__Type__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getTypeAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Type__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getGroup_1()); }
(rule__Type__Group_1__0)?
{ after(grammarAccess.getTypeAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Type__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Type__Group_1__0__Impl
	rule__Type__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getColonKeyword_1_0()); }

	KEYWORD_2 

{ after(grammarAccess.getTypeAccess().getColonKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Type__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getIDTerminalRuleCall_1_1()); }
(	RULE_ID)*
{ after(grammarAccess.getTypeAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Html__ContentAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHtmlAccess().getContentTagParserRuleCall_1_0()); }
	ruleTag{ after(grammarAccess.getHtmlAccess().getContentTagParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__StartTagNameAssignment_0_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getStartTagNameTypeParserRuleCall_0_1_0_0()); }
	ruleType{ after(grammarAccess.getTagAccess().getStartTagNameTypeParserRuleCall_0_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__AttributesAssignment_0_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getAttributesAttributeParserRuleCall_0_1_1_0()); }
	ruleAttribute{ after(grammarAccess.getTagAccess().getAttributesAttributeParserRuleCall_0_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__ChildrenAssignment_0_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getChildrenTagParserRuleCall_0_1_3_0()); }
	ruleTag{ after(grammarAccess.getTagAccess().getChildrenTagParserRuleCall_0_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__EndTagNameAssignment_0_1_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getEndTagNameTypeParserRuleCall_0_1_5_0()); }
	ruleType{ after(grammarAccess.getTagAccess().getEndTagNameTypeParserRuleCall_0_1_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__StartTagNameAssignment_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getStartTagNameTypeParserRuleCall_1_0_0()); }
	ruleType{ after(grammarAccess.getTagAccess().getStartTagNameTypeParserRuleCall_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__AttributesAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getAttributesAttributeParserRuleCall_1_1_0()); }
	ruleAttribute{ after(grammarAccess.getTagAccess().getAttributesAttributeParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__EndTagNameAssignment_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagAccess().getEndTagNameKeyword_1_2_0()); }
(
{ before(grammarAccess.getTagAccess().getEndTagNameKeyword_1_2_0()); }

	KEYWORD_1 

{ after(grammarAccess.getTagAccess().getEndTagNameKeyword_1_2_0()); }
)

{ after(grammarAccess.getTagAccess().getEndTagNameKeyword_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__AttributeNameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getAttributeNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getAttributeAccess().getAttributeNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__AttributeValueAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getAttributeValueSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getAttributeAccess().getAttributeValueSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


