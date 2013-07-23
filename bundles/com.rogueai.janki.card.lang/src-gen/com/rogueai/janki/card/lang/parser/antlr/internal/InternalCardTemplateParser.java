package com.rogueai.janki.card.lang.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.rogueai.janki.card.lang.services.CardTemplateGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCardTemplateParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_9", "KEYWORD_8", "KEYWORD_6", "KEYWORD_7", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_1", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=13;
    public static final int RULE_ANY_OTHER=19;
    public static final int KEYWORD_1=12;
    public static final int KEYWORD_5=11;
    public static final int KEYWORD_4=10;
    public static final int KEYWORD_3=9;
    public static final int KEYWORD_2=8;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=17;
    public static final int RULE_ML_COMMENT=16;
    public static final int RULE_STRING=15;
    public static final int KEYWORD_6=6;
    public static final int KEYWORD_7=7;
    public static final int KEYWORD_8=5;
    public static final int KEYWORD_9=4;
    public static final int RULE_INT=14;
    public static final int RULE_WS=18;

    // delegates
    // delegators


        public InternalCardTemplateParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCardTemplateParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCardTemplateParser.tokenNames; }
    public String getGrammarFileName() { return "../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g"; }




    	private CardTemplateGrammarAccess grammarAccess;
    	 	
    	public InternalCardTemplateParser(TokenStream input, CardTemplateGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "Html";	
    	} 
    	   	   	
    	@Override
    	protected CardTemplateGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleHtml"
    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:61:1: entryRuleHtml returns [EObject current=null] : iv_ruleHtml= ruleHtml EOF ;
    public final EObject entryRuleHtml() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHtml = null;


        try {
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:62:2: (iv_ruleHtml= ruleHtml EOF )
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:63:2: iv_ruleHtml= ruleHtml EOF
            {
             newCompositeNode(grammarAccess.getHtmlRule()); 
            pushFollow(FOLLOW_ruleHtml_in_entryRuleHtml67);
            iv_ruleHtml=ruleHtml();

            state._fsp--;

             current =iv_ruleHtml; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHtml77); 

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
    // $ANTLR end "entryRuleHtml"


    // $ANTLR start "ruleHtml"
    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:70:1: ruleHtml returns [EObject current=null] : (otherlv_0= KEYWORD_8 ( (lv_content_1_0= ruleTag ) )* otherlv_2= KEYWORD_9 ) ;
    public final EObject ruleHtml() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_content_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:73:28: ( (otherlv_0= KEYWORD_8 ( (lv_content_1_0= ruleTag ) )* otherlv_2= KEYWORD_9 ) )
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:74:1: (otherlv_0= KEYWORD_8 ( (lv_content_1_0= ruleTag ) )* otherlv_2= KEYWORD_9 )
            {
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:74:1: (otherlv_0= KEYWORD_8 ( (lv_content_1_0= ruleTag ) )* otherlv_2= KEYWORD_9 )
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:75:2: otherlv_0= KEYWORD_8 ( (lv_content_1_0= ruleTag ) )* otherlv_2= KEYWORD_9
            {
            otherlv_0=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleHtml115); 

                	newLeafNode(otherlv_0, grammarAccess.getHtmlAccess().getHtmlKeyword_0());
                
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:79:1: ( (lv_content_1_0= ruleTag ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KEYWORD_3||LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:80:1: (lv_content_1_0= ruleTag )
            	    {
            	    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:80:1: (lv_content_1_0= ruleTag )
            	    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:81:3: lv_content_1_0= ruleTag
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHtmlAccess().getContentTagParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTag_in_ruleHtml135);
            	    lv_content_1_0=ruleTag();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHtmlRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"content",
            	            		lv_content_1_0, 
            	            		"Tag");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_2=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleHtml149); 

                	newLeafNode(otherlv_2, grammarAccess.getHtmlAccess().getHtmlKeyword_2());
                

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
    // $ANTLR end "ruleHtml"


    // $ANTLR start "entryRuleTag"
    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:110:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:111:2: (iv_ruleTag= ruleTag EOF )
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:112:2: iv_ruleTag= ruleTag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_ruleTag_in_entryRuleTag183);
            iv_ruleTag=ruleTag();

            state._fsp--;

             current =iv_ruleTag; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTag193); 

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
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:119:1: ruleTag returns [EObject current=null] : ( (otherlv_0= KEYWORD_3 ( ( (lv_startTagName_1_0= ruleType ) ) ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= KEYWORD_5 ( (lv_children_4_0= ruleTag ) )* otherlv_5= KEYWORD_7 ( (lv_endTagName_6_0= ruleType ) ) otherlv_7= KEYWORD_5 ) ) | ( ( (lv_startTagName_8_0= ruleType ) ) ( (lv_attributes_9_0= ruleAttribute ) )* ( (lv_endTagName_10_0= KEYWORD_1 ) ) otherlv_11= KEYWORD_6 ) ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_endTagName_10_0=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_startTagName_1_0 = null;

        EObject lv_attributes_2_0 = null;

        EObject lv_children_4_0 = null;

        AntlrDatatypeRuleToken lv_endTagName_6_0 = null;

        AntlrDatatypeRuleToken lv_startTagName_8_0 = null;

        EObject lv_attributes_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:122:28: ( ( (otherlv_0= KEYWORD_3 ( ( (lv_startTagName_1_0= ruleType ) ) ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= KEYWORD_5 ( (lv_children_4_0= ruleTag ) )* otherlv_5= KEYWORD_7 ( (lv_endTagName_6_0= ruleType ) ) otherlv_7= KEYWORD_5 ) ) | ( ( (lv_startTagName_8_0= ruleType ) ) ( (lv_attributes_9_0= ruleAttribute ) )* ( (lv_endTagName_10_0= KEYWORD_1 ) ) otherlv_11= KEYWORD_6 ) ) )
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:123:1: ( (otherlv_0= KEYWORD_3 ( ( (lv_startTagName_1_0= ruleType ) ) ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= KEYWORD_5 ( (lv_children_4_0= ruleTag ) )* otherlv_5= KEYWORD_7 ( (lv_endTagName_6_0= ruleType ) ) otherlv_7= KEYWORD_5 ) ) | ( ( (lv_startTagName_8_0= ruleType ) ) ( (lv_attributes_9_0= ruleAttribute ) )* ( (lv_endTagName_10_0= KEYWORD_1 ) ) otherlv_11= KEYWORD_6 ) )
            {
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:123:1: ( (otherlv_0= KEYWORD_3 ( ( (lv_startTagName_1_0= ruleType ) ) ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= KEYWORD_5 ( (lv_children_4_0= ruleTag ) )* otherlv_5= KEYWORD_7 ( (lv_endTagName_6_0= ruleType ) ) otherlv_7= KEYWORD_5 ) ) | ( ( (lv_startTagName_8_0= ruleType ) ) ( (lv_attributes_9_0= ruleAttribute ) )* ( (lv_endTagName_10_0= KEYWORD_1 ) ) otherlv_11= KEYWORD_6 ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==KEYWORD_3) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:123:2: (otherlv_0= KEYWORD_3 ( ( (lv_startTagName_1_0= ruleType ) ) ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= KEYWORD_5 ( (lv_children_4_0= ruleTag ) )* otherlv_5= KEYWORD_7 ( (lv_endTagName_6_0= ruleType ) ) otherlv_7= KEYWORD_5 ) )
                    {
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:123:2: (otherlv_0= KEYWORD_3 ( ( (lv_startTagName_1_0= ruleType ) ) ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= KEYWORD_5 ( (lv_children_4_0= ruleTag ) )* otherlv_5= KEYWORD_7 ( (lv_endTagName_6_0= ruleType ) ) otherlv_7= KEYWORD_5 ) )
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:124:2: otherlv_0= KEYWORD_3 ( ( (lv_startTagName_1_0= ruleType ) ) ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= KEYWORD_5 ( (lv_children_4_0= ruleTag ) )* otherlv_5= KEYWORD_7 ( (lv_endTagName_6_0= ruleType ) ) otherlv_7= KEYWORD_5 )
                    {
                    otherlv_0=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleTag232); 

                        	newLeafNode(otherlv_0, grammarAccess.getTagAccess().getLessThanSignKeyword_0_0());
                        
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:128:1: ( ( (lv_startTagName_1_0= ruleType ) ) ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= KEYWORD_5 ( (lv_children_4_0= ruleTag ) )* otherlv_5= KEYWORD_7 ( (lv_endTagName_6_0= ruleType ) ) otherlv_7= KEYWORD_5 )
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:128:2: ( (lv_startTagName_1_0= ruleType ) ) ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= KEYWORD_5 ( (lv_children_4_0= ruleTag ) )* otherlv_5= KEYWORD_7 ( (lv_endTagName_6_0= ruleType ) ) otherlv_7= KEYWORD_5
                    {
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:128:2: ( (lv_startTagName_1_0= ruleType ) )
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:129:1: (lv_startTagName_1_0= ruleType )
                    {
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:129:1: (lv_startTagName_1_0= ruleType )
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:130:3: lv_startTagName_1_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTagAccess().getStartTagNameTypeParserRuleCall_0_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleTag253);
                    lv_startTagName_1_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTagRule());
                    	        }
                           		set(
                           			current, 
                           			"startTagName",
                            		lv_startTagName_1_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:146:2: ( (lv_attributes_2_0= ruleAttribute ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:147:1: (lv_attributes_2_0= ruleAttribute )
                    	    {
                    	    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:147:1: (lv_attributes_2_0= ruleAttribute )
                    	    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:148:3: lv_attributes_2_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTagAccess().getAttributesAttributeParserRuleCall_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleTag274);
                    	    lv_attributes_2_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTagRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_2_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleTag288); 

                        	newLeafNode(otherlv_3, grammarAccess.getTagAccess().getGreaterThanSignKeyword_0_1_2());
                        
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:169:1: ( (lv_children_4_0= ruleTag ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==KEYWORD_3||LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:170:1: (lv_children_4_0= ruleTag )
                    	    {
                    	    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:170:1: (lv_children_4_0= ruleTag )
                    	    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:171:3: lv_children_4_0= ruleTag
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTagAccess().getChildrenTagParserRuleCall_0_1_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTag_in_ruleTag308);
                    	    lv_children_4_0=ruleTag();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTagRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_4_0, 
                    	            		"Tag");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleTag322); 

                        	newLeafNode(otherlv_5, grammarAccess.getTagAccess().getLessThanSignSolidusKeyword_0_1_4());
                        
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:192:1: ( (lv_endTagName_6_0= ruleType ) )
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:193:1: (lv_endTagName_6_0= ruleType )
                    {
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:193:1: (lv_endTagName_6_0= ruleType )
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:194:3: lv_endTagName_6_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTagAccess().getEndTagNameTypeParserRuleCall_0_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleTag342);
                    lv_endTagName_6_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTagRule());
                    	        }
                           		set(
                           			current, 
                           			"endTagName",
                            		lv_endTagName_6_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleTag355); 

                        	newLeafNode(otherlv_7, grammarAccess.getTagAccess().getGreaterThanSignKeyword_0_1_6());
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:216:6: ( ( (lv_startTagName_8_0= ruleType ) ) ( (lv_attributes_9_0= ruleAttribute ) )* ( (lv_endTagName_10_0= KEYWORD_1 ) ) otherlv_11= KEYWORD_6 )
                    {
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:216:6: ( ( (lv_startTagName_8_0= ruleType ) ) ( (lv_attributes_9_0= ruleAttribute ) )* ( (lv_endTagName_10_0= KEYWORD_1 ) ) otherlv_11= KEYWORD_6 )
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:216:7: ( (lv_startTagName_8_0= ruleType ) ) ( (lv_attributes_9_0= ruleAttribute ) )* ( (lv_endTagName_10_0= KEYWORD_1 ) ) otherlv_11= KEYWORD_6
                    {
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:216:7: ( (lv_startTagName_8_0= ruleType ) )
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:217:1: (lv_startTagName_8_0= ruleType )
                    {
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:217:1: (lv_startTagName_8_0= ruleType )
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:218:3: lv_startTagName_8_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTagAccess().getStartTagNameTypeParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleTag384);
                    lv_startTagName_8_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTagRule());
                    	        }
                           		set(
                           			current, 
                           			"startTagName",
                            		lv_startTagName_8_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:234:2: ( (lv_attributes_9_0= ruleAttribute ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:235:1: (lv_attributes_9_0= ruleAttribute )
                    	    {
                    	    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:235:1: (lv_attributes_9_0= ruleAttribute )
                    	    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:236:3: lv_attributes_9_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTagAccess().getAttributesAttributeParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleTag405);
                    	    lv_attributes_9_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTagRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_9_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:252:3: ( (lv_endTagName_10_0= KEYWORD_1 ) )
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:253:1: (lv_endTagName_10_0= KEYWORD_1 )
                    {
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:253:1: (lv_endTagName_10_0= KEYWORD_1 )
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:254:3: lv_endTagName_10_0= KEYWORD_1
                    {
                    lv_endTagName_10_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleTag425); 

                            newLeafNode(lv_endTagName_10_0, grammarAccess.getTagAccess().getEndTagNameKeyword_1_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTagRule());
                    	        }
                           		setWithLastConsumed(current, "endTagName", lv_endTagName_10_0, "");
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleTag449); 

                        	newLeafNode(otherlv_11, grammarAccess.getTagAccess().getSolidusGreaterThanSignKeyword_1_3());
                        

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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleAttribute"
    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:281:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:282:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:283:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute484);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute494); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:290:1: ruleAttribute returns [EObject current=null] : ( ( (lv_attributeName_0_0= RULE_ID ) ) otherlv_1= KEYWORD_4 ( (lv_attributeValue_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_0_0=null;
        Token otherlv_1=null;
        Token lv_attributeValue_2_0=null;

         enterRule(); 
            
        try {
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:293:28: ( ( ( (lv_attributeName_0_0= RULE_ID ) ) otherlv_1= KEYWORD_4 ( (lv_attributeValue_2_0= RULE_STRING ) ) ) )
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:294:1: ( ( (lv_attributeName_0_0= RULE_ID ) ) otherlv_1= KEYWORD_4 ( (lv_attributeValue_2_0= RULE_STRING ) ) )
            {
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:294:1: ( ( (lv_attributeName_0_0= RULE_ID ) ) otherlv_1= KEYWORD_4 ( (lv_attributeValue_2_0= RULE_STRING ) ) )
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:294:2: ( (lv_attributeName_0_0= RULE_ID ) ) otherlv_1= KEYWORD_4 ( (lv_attributeValue_2_0= RULE_STRING ) )
            {
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:294:2: ( (lv_attributeName_0_0= RULE_ID ) )
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:295:1: (lv_attributeName_0_0= RULE_ID )
            {
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:295:1: (lv_attributeName_0_0= RULE_ID )
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:296:3: lv_attributeName_0_0= RULE_ID
            {
            lv_attributeName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute536); 

            			newLeafNode(lv_attributeName_0_0, grammarAccess.getAttributeAccess().getAttributeNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attributeName",
                    		lv_attributeName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleAttribute554); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1());
                
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:317:1: ( (lv_attributeValue_2_0= RULE_STRING ) )
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:318:1: (lv_attributeValue_2_0= RULE_STRING )
            {
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:318:1: (lv_attributeValue_2_0= RULE_STRING )
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:319:3: lv_attributeValue_2_0= RULE_STRING
            {
            lv_attributeValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute570); 

            			newLeafNode(lv_attributeValue_2_0, grammarAccess.getAttributeAccess().getAttributeValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attributeValue",
                    		lv_attributeValue_2_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:343:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:344:1: (iv_ruleType= ruleType EOF )
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:345:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType611);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType622); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:352:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= KEYWORD_2 (this_ID_2= RULE_ID )* )? ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:356:6: ( (this_ID_0= RULE_ID (kw= KEYWORD_2 (this_ID_2= RULE_ID )* )? ) )
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:357:1: (this_ID_0= RULE_ID (kw= KEYWORD_2 (this_ID_2= RULE_ID )* )? )
            {
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:357:1: (this_ID_0= RULE_ID (kw= KEYWORD_2 (this_ID_2= RULE_ID )* )? )
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:357:6: this_ID_0= RULE_ID (kw= KEYWORD_2 (this_ID_2= RULE_ID )* )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType662); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getTypeAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:364:1: (kw= KEYWORD_2 (this_ID_2= RULE_ID )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_2) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:365:2: kw= KEYWORD_2 (this_ID_2= RULE_ID )*
                    {
                    kw=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleType681); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getColonKeyword_1_0()); 
                        
                    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:370:1: (this_ID_2= RULE_ID )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            int LA6_1 = input.LA(2);

                            if ( (LA6_1==EOF||(LA6_1>=KEYWORD_5 && LA6_1<=RULE_ID)) ) {
                                alt6=1;
                            }


                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../com.rogueai.janki.card.lang/src-gen/com/rogueai/janki/card/lang/parser/antlr/internal/InternalCardTemplateParser.g:370:6: this_ID_2= RULE_ID
                    	    {
                    	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType697); 

                    	    		current.merge(this_ID_2);
                    	        
                    	     
                    	        newLeafNode(this_ID_2, grammarAccess.getTypeAccess().getIDTerminalRuleCall_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
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
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleHtml_in_entryRuleHtml67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHtml77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleHtml115 = new BitSet(new long[]{0x0000000000002210L});
    public static final BitSet FOLLOW_ruleTag_in_ruleHtml135 = new BitSet(new long[]{0x0000000000002210L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleHtml149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTag_in_entryRuleTag183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTag193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleTag232 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_ruleType_in_ruleTag253 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleTag274 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleTag288 = new BitSet(new long[]{0x0000000000002280L});
    public static final BitSet FOLLOW_ruleTag_in_ruleTag308 = new BitSet(new long[]{0x0000000000002280L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleTag322 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_ruleType_in_ruleTag342 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleTag355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleTag384 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleTag405 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleTag425 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleTag449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute536 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleAttribute554 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType662 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleType681 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType697 = new BitSet(new long[]{0x0000000000002002L});

}