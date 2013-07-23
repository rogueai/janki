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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCardTemplateParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g"; }


     
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



    // $ANTLR start "entryRuleHtml"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:72:1: entryRuleHtml : ruleHtml EOF ;
    public final void entryRuleHtml() throws RecognitionException {
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:73:1: ( ruleHtml EOF )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:74:1: ruleHtml EOF
            {
             before(grammarAccess.getHtmlRule()); 
            pushFollow(FOLLOW_ruleHtml_in_entryRuleHtml54);
            ruleHtml();

            state._fsp--;

             after(grammarAccess.getHtmlRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHtml61); 

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
    // $ANTLR end "entryRuleHtml"


    // $ANTLR start "ruleHtml"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:81:1: ruleHtml : ( ( rule__Html__Group__0 ) ) ;
    public final void ruleHtml() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:85:5: ( ( ( rule__Html__Group__0 ) ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:86:1: ( ( rule__Html__Group__0 ) )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:86:1: ( ( rule__Html__Group__0 ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:87:1: ( rule__Html__Group__0 )
            {
             before(grammarAccess.getHtmlAccess().getGroup()); 
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:88:1: ( rule__Html__Group__0 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:88:2: rule__Html__Group__0
            {
            pushFollow(FOLLOW_rule__Html__Group__0_in_ruleHtml91);
            rule__Html__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHtmlAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHtml"


    // $ANTLR start "entryRuleTag"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:100:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:101:1: ( ruleTag EOF )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:102:1: ruleTag EOF
            {
             before(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_ruleTag_in_entryRuleTag118);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getTagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTag125); 

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
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:109:1: ruleTag : ( ( rule__Tag__Alternatives ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:113:5: ( ( ( rule__Tag__Alternatives ) ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:114:1: ( ( rule__Tag__Alternatives ) )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:114:1: ( ( rule__Tag__Alternatives ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:115:1: ( rule__Tag__Alternatives )
            {
             before(grammarAccess.getTagAccess().getAlternatives()); 
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:116:1: ( rule__Tag__Alternatives )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:116:2: rule__Tag__Alternatives
            {
            pushFollow(FOLLOW_rule__Tag__Alternatives_in_ruleTag155);
            rule__Tag__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleAttribute"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:128:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:129:1: ( ruleAttribute EOF )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:130:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute182);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute189); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:137:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:141:5: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:142:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:142:1: ( ( rule__Attribute__Group__0 ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:143:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:144:1: ( rule__Attribute__Group__0 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:144:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute219);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:156:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:157:1: ( ruleType EOF )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:158:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType246);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType253); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:165:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:169:5: ( ( ( rule__Type__Group__0 ) ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:170:1: ( ( rule__Type__Group__0 ) )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:170:1: ( ( rule__Type__Group__0 ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:171:1: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:172:1: ( rule__Type__Group__0 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:172:2: rule__Type__Group__0
            {
            pushFollow(FOLLOW_rule__Type__Group__0_in_ruleType283);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Tag__Alternatives"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:184:1: rule__Tag__Alternatives : ( ( ( rule__Tag__Group_0__0 ) ) | ( ( rule__Tag__Group_1__0 ) ) );
    public final void rule__Tag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:188:1: ( ( ( rule__Tag__Group_0__0 ) ) | ( ( rule__Tag__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==KEYWORD_3) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:189:1: ( ( rule__Tag__Group_0__0 ) )
                    {
                    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:189:1: ( ( rule__Tag__Group_0__0 ) )
                    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:190:1: ( rule__Tag__Group_0__0 )
                    {
                     before(grammarAccess.getTagAccess().getGroup_0()); 
                    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:191:1: ( rule__Tag__Group_0__0 )
                    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:191:2: rule__Tag__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Tag__Group_0__0_in_rule__Tag__Alternatives319);
                    rule__Tag__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTagAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:195:6: ( ( rule__Tag__Group_1__0 ) )
                    {
                    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:195:6: ( ( rule__Tag__Group_1__0 ) )
                    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:196:1: ( rule__Tag__Group_1__0 )
                    {
                     before(grammarAccess.getTagAccess().getGroup_1()); 
                    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:197:1: ( rule__Tag__Group_1__0 )
                    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:197:2: rule__Tag__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Tag__Group_1__0_in_rule__Tag__Alternatives337);
                    rule__Tag__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTagAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Tag__Alternatives"


    // $ANTLR start "rule__Html__Group__0"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:208:1: rule__Html__Group__0 : rule__Html__Group__0__Impl rule__Html__Group__1 ;
    public final void rule__Html__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:212:1: ( rule__Html__Group__0__Impl rule__Html__Group__1 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:213:2: rule__Html__Group__0__Impl rule__Html__Group__1
            {
            pushFollow(FOLLOW_rule__Html__Group__0__Impl_in_rule__Html__Group__0368);
            rule__Html__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Html__Group__1_in_rule__Html__Group__0371);
            rule__Html__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html__Group__0"


    // $ANTLR start "rule__Html__Group__0__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:220:1: rule__Html__Group__0__Impl : ( KEYWORD_8 ) ;
    public final void rule__Html__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:224:1: ( ( KEYWORD_8 ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:225:1: ( KEYWORD_8 )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:225:1: ( KEYWORD_8 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:226:1: KEYWORD_8
            {
             before(grammarAccess.getHtmlAccess().getHtmlKeyword_0()); 
            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__Html__Group__0__Impl399); 
             after(grammarAccess.getHtmlAccess().getHtmlKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html__Group__0__Impl"


    // $ANTLR start "rule__Html__Group__1"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:239:1: rule__Html__Group__1 : rule__Html__Group__1__Impl rule__Html__Group__2 ;
    public final void rule__Html__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:243:1: ( rule__Html__Group__1__Impl rule__Html__Group__2 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:244:2: rule__Html__Group__1__Impl rule__Html__Group__2
            {
            pushFollow(FOLLOW_rule__Html__Group__1__Impl_in_rule__Html__Group__1430);
            rule__Html__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Html__Group__2_in_rule__Html__Group__1433);
            rule__Html__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html__Group__1"


    // $ANTLR start "rule__Html__Group__1__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:251:1: rule__Html__Group__1__Impl : ( ( rule__Html__ContentAssignment_1 )* ) ;
    public final void rule__Html__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:255:1: ( ( ( rule__Html__ContentAssignment_1 )* ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:256:1: ( ( rule__Html__ContentAssignment_1 )* )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:256:1: ( ( rule__Html__ContentAssignment_1 )* )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:257:1: ( rule__Html__ContentAssignment_1 )*
            {
             before(grammarAccess.getHtmlAccess().getContentAssignment_1()); 
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:258:1: ( rule__Html__ContentAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==KEYWORD_3||LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:258:2: rule__Html__ContentAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Html__ContentAssignment_1_in_rule__Html__Group__1__Impl460);
            	    rule__Html__ContentAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getHtmlAccess().getContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html__Group__1__Impl"


    // $ANTLR start "rule__Html__Group__2"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:268:1: rule__Html__Group__2 : rule__Html__Group__2__Impl ;
    public final void rule__Html__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:272:1: ( rule__Html__Group__2__Impl )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:273:2: rule__Html__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Html__Group__2__Impl_in_rule__Html__Group__2491);
            rule__Html__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html__Group__2"


    // $ANTLR start "rule__Html__Group__2__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:279:1: rule__Html__Group__2__Impl : ( KEYWORD_9 ) ;
    public final void rule__Html__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:283:1: ( ( KEYWORD_9 ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:284:1: ( KEYWORD_9 )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:284:1: ( KEYWORD_9 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:285:1: KEYWORD_9
            {
             before(grammarAccess.getHtmlAccess().getHtmlKeyword_2()); 
            match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rule__Html__Group__2__Impl519); 
             after(grammarAccess.getHtmlAccess().getHtmlKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html__Group__2__Impl"


    // $ANTLR start "rule__Tag__Group_0__0"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:304:1: rule__Tag__Group_0__0 : rule__Tag__Group_0__0__Impl rule__Tag__Group_0__1 ;
    public final void rule__Tag__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:308:1: ( rule__Tag__Group_0__0__Impl rule__Tag__Group_0__1 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:309:2: rule__Tag__Group_0__0__Impl rule__Tag__Group_0__1
            {
            pushFollow(FOLLOW_rule__Tag__Group_0__0__Impl_in_rule__Tag__Group_0__0556);
            rule__Tag__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tag__Group_0__1_in_rule__Tag__Group_0__0559);
            rule__Tag__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_0__0"


    // $ANTLR start "rule__Tag__Group_0__0__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:316:1: rule__Tag__Group_0__0__Impl : ( KEYWORD_3 ) ;
    public final void rule__Tag__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:320:1: ( ( KEYWORD_3 ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:321:1: ( KEYWORD_3 )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:321:1: ( KEYWORD_3 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:322:1: KEYWORD_3
            {
             before(grammarAccess.getTagAccess().getLessThanSignKeyword_0_0()); 
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rule__Tag__Group_0__0__Impl587); 
             after(grammarAccess.getTagAccess().getLessThanSignKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_0__0__Impl"


    // $ANTLR start "rule__Tag__Group_0__1"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:335:1: rule__Tag__Group_0__1 : rule__Tag__Group_0__1__Impl ;
    public final void rule__Tag__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:339:1: ( rule__Tag__Group_0__1__Impl )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:340:2: rule__Tag__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Tag__Group_0__1__Impl_in_rule__Tag__Group_0__1618);
            rule__Tag__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_0__1"


    // $ANTLR start "rule__Tag__Group_0__1__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:346:1: rule__Tag__Group_0__1__Impl : ( ( rule__Tag__Group_0_1__0 ) ) ;
    public final void rule__Tag__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:350:1: ( ( ( rule__Tag__Group_0_1__0 ) ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:351:1: ( ( rule__Tag__Group_0_1__0 ) )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:351:1: ( ( rule__Tag__Group_0_1__0 ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:352:1: ( rule__Tag__Group_0_1__0 )
            {
             before(grammarAccess.getTagAccess().getGroup_0_1()); 
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:353:1: ( rule__Tag__Group_0_1__0 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:353:2: rule__Tag__Group_0_1__0
            {
            pushFollow(FOLLOW_rule__Tag__Group_0_1__0_in_rule__Tag__Group_0__1__Impl645);
            rule__Tag__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_0__1__Impl"


    // $ANTLR start "rule__Tag__Group_0_1__0"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:367:1: rule__Tag__Group_0_1__0 : rule__Tag__Group_0_1__0__Impl rule__Tag__Group_0_1__1 ;
    public final void rule__Tag__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:371:1: ( rule__Tag__Group_0_1__0__Impl rule__Tag__Group_0_1__1 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:372:2: rule__Tag__Group_0_1__0__Impl rule__Tag__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__Tag__Group_0_1__0__Impl_in_rule__Tag__Group_0_1__0679);
            rule__Tag__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tag__Group_0_1__1_in_rule__Tag__Group_0_1__0682);
            rule__Tag__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_0_1__0"


    // $ANTLR start "rule__Tag__Group_0_1__0__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:379:1: rule__Tag__Group_0_1__0__Impl : ( ( rule__Tag__StartTagNameAssignment_0_1_0 ) ) ;
    public final void rule__Tag__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:383:1: ( ( ( rule__Tag__StartTagNameAssignment_0_1_0 ) ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:384:1: ( ( rule__Tag__StartTagNameAssignment_0_1_0 ) )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:384:1: ( ( rule__Tag__StartTagNameAssignment_0_1_0 ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:385:1: ( rule__Tag__StartTagNameAssignment_0_1_0 )
            {
             before(grammarAccess.getTagAccess().getStartTagNameAssignment_0_1_0()); 
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:386:1: ( rule__Tag__StartTagNameAssignment_0_1_0 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:386:2: rule__Tag__StartTagNameAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__Tag__StartTagNameAssignment_0_1_0_in_rule__Tag__Group_0_1__0__Impl709);
            rule__Tag__StartTagNameAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getStartTagNameAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_0_1__0__Impl"


    // $ANTLR start "rule__Tag__Group_0_1__1"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:396:1: rule__Tag__Group_0_1__1 : rule__Tag__Group_0_1__1__Impl rule__Tag__Group_0_1__2 ;
    public final void rule__Tag__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:400:1: ( rule__Tag__Group_0_1__1__Impl rule__Tag__Group_0_1__2 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:401:2: rule__Tag__Group_0_1__1__Impl rule__Tag__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__Tag__Group_0_1__1__Impl_in_rule__Tag__Group_0_1__1739);
            rule__Tag__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tag__Group_0_1__2_in_rule__Tag__Group_0_1__1742);
            rule__Tag__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_0_1__1"


    // $ANTLR start "rule__Tag__Group_0_1__1__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:408:1: rule__Tag__Group_0_1__1__Impl : ( ( rule__Tag__AttributesAssignment_0_1_1 )* ) ;
    public final void rule__Tag__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:412:1: ( ( ( rule__Tag__AttributesAssignment_0_1_1 )* ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:413:1: ( ( rule__Tag__AttributesAssignment_0_1_1 )* )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:413:1: ( ( rule__Tag__AttributesAssignment_0_1_1 )* )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:414:1: ( rule__Tag__AttributesAssignment_0_1_1 )*
            {
             before(grammarAccess.getTagAccess().getAttributesAssignment_0_1_1()); 
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:415:1: ( rule__Tag__AttributesAssignment_0_1_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:415:2: rule__Tag__AttributesAssignment_0_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Tag__AttributesAssignment_0_1_1_in_rule__Tag__Group_0_1__1__Impl769);
            	    rule__Tag__AttributesAssignment_0_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTagAccess().getAttributesAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_0_1__1__Impl"


    // $ANTLR start "rule__Tag__Group_0_1__2"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:425:1: rule__Tag__Group_0_1__2 : rule__Tag__Group_0_1__2__Impl rule__Tag__Group_0_1__3 ;
    public final void rule__Tag__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:429:1: ( rule__Tag__Group_0_1__2__Impl rule__Tag__Group_0_1__3 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:430:2: rule__Tag__Group_0_1__2__Impl rule__Tag__Group_0_1__3
            {
            pushFollow(FOLLOW_rule__Tag__Group_0_1__2__Impl_in_rule__Tag__Group_0_1__2800);
            rule__Tag__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tag__Group_0_1__3_in_rule__Tag__Group_0_1__2803);
            rule__Tag__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_0_1__2"


    // $ANTLR start "rule__Tag__Group_0_1__2__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:437:1: rule__Tag__Group_0_1__2__Impl : ( KEYWORD_5 ) ;
    public final void rule__Tag__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:441:1: ( ( KEYWORD_5 ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:442:1: ( KEYWORD_5 )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:442:1: ( KEYWORD_5 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:443:1: KEYWORD_5
            {
             before(grammarAccess.getTagAccess().getGreaterThanSignKeyword_0_1_2()); 
            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__Tag__Group_0_1__2__Impl831); 
             after(grammarAccess.getTagAccess().getGreaterThanSignKeyword_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_0_1__2__Impl"


    // $ANTLR start "rule__Tag__Group_0_1__3"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:456:1: rule__Tag__Group_0_1__3 : rule__Tag__Group_0_1__3__Impl rule__Tag__Group_0_1__4 ;
    public final void rule__Tag__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:460:1: ( rule__Tag__Group_0_1__3__Impl rule__Tag__Group_0_1__4 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:461:2: rule__Tag__Group_0_1__3__Impl rule__Tag__Group_0_1__4
            {
            pushFollow(FOLLOW_rule__Tag__Group_0_1__3__Impl_in_rule__Tag__Group_0_1__3862);
            rule__Tag__Group_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tag__Group_0_1__4_in_rule__Tag__Group_0_1__3865);
            rule__Tag__Group_0_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_0_1__3"


    // $ANTLR start "rule__Tag__Group_0_1__3__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:468:1: rule__Tag__Group_0_1__3__Impl : ( ( rule__Tag__ChildrenAssignment_0_1_3 )* ) ;
    public final void rule__Tag__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:472:1: ( ( ( rule__Tag__ChildrenAssignment_0_1_3 )* ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:473:1: ( ( rule__Tag__ChildrenAssignment_0_1_3 )* )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:473:1: ( ( rule__Tag__ChildrenAssignment_0_1_3 )* )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:474:1: ( rule__Tag__ChildrenAssignment_0_1_3 )*
            {
             before(grammarAccess.getTagAccess().getChildrenAssignment_0_1_3()); 
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:475:1: ( rule__Tag__ChildrenAssignment_0_1_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==KEYWORD_3||LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:475:2: rule__Tag__ChildrenAssignment_0_1_3
            	    {
            	    pushFollow(FOLLOW_rule__Tag__ChildrenAssignment_0_1_3_in_rule__Tag__Group_0_1__3__Impl892);
            	    rule__Tag__ChildrenAssignment_0_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTagAccess().getChildrenAssignment_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_0_1__3__Impl"


    // $ANTLR start "rule__Tag__Group_0_1__4"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:485:1: rule__Tag__Group_0_1__4 : rule__Tag__Group_0_1__4__Impl rule__Tag__Group_0_1__5 ;
    public final void rule__Tag__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:489:1: ( rule__Tag__Group_0_1__4__Impl rule__Tag__Group_0_1__5 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:490:2: rule__Tag__Group_0_1__4__Impl rule__Tag__Group_0_1__5
            {
            pushFollow(FOLLOW_rule__Tag__Group_0_1__4__Impl_in_rule__Tag__Group_0_1__4923);
            rule__Tag__Group_0_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tag__Group_0_1__5_in_rule__Tag__Group_0_1__4926);
            rule__Tag__Group_0_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_0_1__4"


    // $ANTLR start "rule__Tag__Group_0_1__4__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:497:1: rule__Tag__Group_0_1__4__Impl : ( KEYWORD_7 ) ;
    public final void rule__Tag__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:501:1: ( ( KEYWORD_7 ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:502:1: ( KEYWORD_7 )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:502:1: ( KEYWORD_7 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:503:1: KEYWORD_7
            {
             before(grammarAccess.getTagAccess().getLessThanSignSolidusKeyword_0_1_4()); 
            match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rule__Tag__Group_0_1__4__Impl954); 
             after(grammarAccess.getTagAccess().getLessThanSignSolidusKeyword_0_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_0_1__4__Impl"


    // $ANTLR start "rule__Tag__Group_0_1__5"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:516:1: rule__Tag__Group_0_1__5 : rule__Tag__Group_0_1__5__Impl rule__Tag__Group_0_1__6 ;
    public final void rule__Tag__Group_0_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:520:1: ( rule__Tag__Group_0_1__5__Impl rule__Tag__Group_0_1__6 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:521:2: rule__Tag__Group_0_1__5__Impl rule__Tag__Group_0_1__6
            {
            pushFollow(FOLLOW_rule__Tag__Group_0_1__5__Impl_in_rule__Tag__Group_0_1__5985);
            rule__Tag__Group_0_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tag__Group_0_1__6_in_rule__Tag__Group_0_1__5988);
            rule__Tag__Group_0_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_0_1__5"


    // $ANTLR start "rule__Tag__Group_0_1__5__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:528:1: rule__Tag__Group_0_1__5__Impl : ( ( rule__Tag__EndTagNameAssignment_0_1_5 ) ) ;
    public final void rule__Tag__Group_0_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:532:1: ( ( ( rule__Tag__EndTagNameAssignment_0_1_5 ) ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:533:1: ( ( rule__Tag__EndTagNameAssignment_0_1_5 ) )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:533:1: ( ( rule__Tag__EndTagNameAssignment_0_1_5 ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:534:1: ( rule__Tag__EndTagNameAssignment_0_1_5 )
            {
             before(grammarAccess.getTagAccess().getEndTagNameAssignment_0_1_5()); 
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:535:1: ( rule__Tag__EndTagNameAssignment_0_1_5 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:535:2: rule__Tag__EndTagNameAssignment_0_1_5
            {
            pushFollow(FOLLOW_rule__Tag__EndTagNameAssignment_0_1_5_in_rule__Tag__Group_0_1__5__Impl1015);
            rule__Tag__EndTagNameAssignment_0_1_5();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getEndTagNameAssignment_0_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_0_1__5__Impl"


    // $ANTLR start "rule__Tag__Group_0_1__6"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:545:1: rule__Tag__Group_0_1__6 : rule__Tag__Group_0_1__6__Impl ;
    public final void rule__Tag__Group_0_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:549:1: ( rule__Tag__Group_0_1__6__Impl )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:550:2: rule__Tag__Group_0_1__6__Impl
            {
            pushFollow(FOLLOW_rule__Tag__Group_0_1__6__Impl_in_rule__Tag__Group_0_1__61045);
            rule__Tag__Group_0_1__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_0_1__6"


    // $ANTLR start "rule__Tag__Group_0_1__6__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:556:1: rule__Tag__Group_0_1__6__Impl : ( KEYWORD_5 ) ;
    public final void rule__Tag__Group_0_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:560:1: ( ( KEYWORD_5 ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:561:1: ( KEYWORD_5 )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:561:1: ( KEYWORD_5 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:562:1: KEYWORD_5
            {
             before(grammarAccess.getTagAccess().getGreaterThanSignKeyword_0_1_6()); 
            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__Tag__Group_0_1__6__Impl1073); 
             after(grammarAccess.getTagAccess().getGreaterThanSignKeyword_0_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_0_1__6__Impl"


    // $ANTLR start "rule__Tag__Group_1__0"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:589:1: rule__Tag__Group_1__0 : rule__Tag__Group_1__0__Impl rule__Tag__Group_1__1 ;
    public final void rule__Tag__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:593:1: ( rule__Tag__Group_1__0__Impl rule__Tag__Group_1__1 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:594:2: rule__Tag__Group_1__0__Impl rule__Tag__Group_1__1
            {
            pushFollow(FOLLOW_rule__Tag__Group_1__0__Impl_in_rule__Tag__Group_1__01118);
            rule__Tag__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tag__Group_1__1_in_rule__Tag__Group_1__01121);
            rule__Tag__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_1__0"


    // $ANTLR start "rule__Tag__Group_1__0__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:601:1: rule__Tag__Group_1__0__Impl : ( ( rule__Tag__StartTagNameAssignment_1_0 ) ) ;
    public final void rule__Tag__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:605:1: ( ( ( rule__Tag__StartTagNameAssignment_1_0 ) ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:606:1: ( ( rule__Tag__StartTagNameAssignment_1_0 ) )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:606:1: ( ( rule__Tag__StartTagNameAssignment_1_0 ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:607:1: ( rule__Tag__StartTagNameAssignment_1_0 )
            {
             before(grammarAccess.getTagAccess().getStartTagNameAssignment_1_0()); 
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:608:1: ( rule__Tag__StartTagNameAssignment_1_0 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:608:2: rule__Tag__StartTagNameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Tag__StartTagNameAssignment_1_0_in_rule__Tag__Group_1__0__Impl1148);
            rule__Tag__StartTagNameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getStartTagNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_1__0__Impl"


    // $ANTLR start "rule__Tag__Group_1__1"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:618:1: rule__Tag__Group_1__1 : rule__Tag__Group_1__1__Impl rule__Tag__Group_1__2 ;
    public final void rule__Tag__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:622:1: ( rule__Tag__Group_1__1__Impl rule__Tag__Group_1__2 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:623:2: rule__Tag__Group_1__1__Impl rule__Tag__Group_1__2
            {
            pushFollow(FOLLOW_rule__Tag__Group_1__1__Impl_in_rule__Tag__Group_1__11178);
            rule__Tag__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tag__Group_1__2_in_rule__Tag__Group_1__11181);
            rule__Tag__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_1__1"


    // $ANTLR start "rule__Tag__Group_1__1__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:630:1: rule__Tag__Group_1__1__Impl : ( ( rule__Tag__AttributesAssignment_1_1 )* ) ;
    public final void rule__Tag__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:634:1: ( ( ( rule__Tag__AttributesAssignment_1_1 )* ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:635:1: ( ( rule__Tag__AttributesAssignment_1_1 )* )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:635:1: ( ( rule__Tag__AttributesAssignment_1_1 )* )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:636:1: ( rule__Tag__AttributesAssignment_1_1 )*
            {
             before(grammarAccess.getTagAccess().getAttributesAssignment_1_1()); 
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:637:1: ( rule__Tag__AttributesAssignment_1_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:637:2: rule__Tag__AttributesAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Tag__AttributesAssignment_1_1_in_rule__Tag__Group_1__1__Impl1208);
            	    rule__Tag__AttributesAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTagAccess().getAttributesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_1__1__Impl"


    // $ANTLR start "rule__Tag__Group_1__2"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:647:1: rule__Tag__Group_1__2 : rule__Tag__Group_1__2__Impl rule__Tag__Group_1__3 ;
    public final void rule__Tag__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:651:1: ( rule__Tag__Group_1__2__Impl rule__Tag__Group_1__3 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:652:2: rule__Tag__Group_1__2__Impl rule__Tag__Group_1__3
            {
            pushFollow(FOLLOW_rule__Tag__Group_1__2__Impl_in_rule__Tag__Group_1__21239);
            rule__Tag__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tag__Group_1__3_in_rule__Tag__Group_1__21242);
            rule__Tag__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_1__2"


    // $ANTLR start "rule__Tag__Group_1__2__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:659:1: rule__Tag__Group_1__2__Impl : ( ( rule__Tag__EndTagNameAssignment_1_2 ) ) ;
    public final void rule__Tag__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:663:1: ( ( ( rule__Tag__EndTagNameAssignment_1_2 ) ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:664:1: ( ( rule__Tag__EndTagNameAssignment_1_2 ) )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:664:1: ( ( rule__Tag__EndTagNameAssignment_1_2 ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:665:1: ( rule__Tag__EndTagNameAssignment_1_2 )
            {
             before(grammarAccess.getTagAccess().getEndTagNameAssignment_1_2()); 
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:666:1: ( rule__Tag__EndTagNameAssignment_1_2 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:666:2: rule__Tag__EndTagNameAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Tag__EndTagNameAssignment_1_2_in_rule__Tag__Group_1__2__Impl1269);
            rule__Tag__EndTagNameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getEndTagNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_1__2__Impl"


    // $ANTLR start "rule__Tag__Group_1__3"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:676:1: rule__Tag__Group_1__3 : rule__Tag__Group_1__3__Impl ;
    public final void rule__Tag__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:680:1: ( rule__Tag__Group_1__3__Impl )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:681:2: rule__Tag__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Tag__Group_1__3__Impl_in_rule__Tag__Group_1__31299);
            rule__Tag__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_1__3"


    // $ANTLR start "rule__Tag__Group_1__3__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:687:1: rule__Tag__Group_1__3__Impl : ( KEYWORD_6 ) ;
    public final void rule__Tag__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:691:1: ( ( KEYWORD_6 ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:692:1: ( KEYWORD_6 )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:692:1: ( KEYWORD_6 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:693:1: KEYWORD_6
            {
             before(grammarAccess.getTagAccess().getSolidusGreaterThanSignKeyword_1_3()); 
            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__Tag__Group_1__3__Impl1327); 
             after(grammarAccess.getTagAccess().getSolidusGreaterThanSignKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group_1__3__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:714:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:718:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:719:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01366);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01369);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:726:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__AttributeNameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:730:1: ( ( ( rule__Attribute__AttributeNameAssignment_0 ) ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:731:1: ( ( rule__Attribute__AttributeNameAssignment_0 ) )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:731:1: ( ( rule__Attribute__AttributeNameAssignment_0 ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:732:1: ( rule__Attribute__AttributeNameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeNameAssignment_0()); 
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:733:1: ( rule__Attribute__AttributeNameAssignment_0 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:733:2: rule__Attribute__AttributeNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__AttributeNameAssignment_0_in_rule__Attribute__Group__0__Impl1396);
            rule__Attribute__AttributeNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttributeNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:743:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:747:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:748:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11426);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11429);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:755:1: rule__Attribute__Group__1__Impl : ( KEYWORD_4 ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:759:1: ( ( KEYWORD_4 ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:760:1: ( KEYWORD_4 )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:760:1: ( KEYWORD_4 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:761:1: KEYWORD_4
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 
            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__Attribute__Group__1__Impl1457); 
             after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:774:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:778:1: ( rule__Attribute__Group__2__Impl )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:779:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21488);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:785:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__AttributeValueAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:789:1: ( ( ( rule__Attribute__AttributeValueAssignment_2 ) ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:790:1: ( ( rule__Attribute__AttributeValueAssignment_2 ) )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:790:1: ( ( rule__Attribute__AttributeValueAssignment_2 ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:791:1: ( rule__Attribute__AttributeValueAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeValueAssignment_2()); 
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:792:1: ( rule__Attribute__AttributeValueAssignment_2 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:792:2: rule__Attribute__AttributeValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__AttributeValueAssignment_2_in_rule__Attribute__Group__2__Impl1515);
            rule__Attribute__AttributeValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttributeValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:808:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:812:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:813:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__01551);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__01554);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:820:1: rule__Type__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:824:1: ( ( RULE_ID ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:825:1: ( RULE_ID )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:825:1: ( RULE_ID )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:826:1: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__Group__0__Impl1581); 
             after(grammarAccess.getTypeAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:837:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:841:1: ( rule__Type__Group__1__Impl )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:842:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__11610);
            rule__Type__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:848:1: rule__Type__Group__1__Impl : ( ( rule__Type__Group_1__0 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:852:1: ( ( ( rule__Type__Group_1__0 )? ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:853:1: ( ( rule__Type__Group_1__0 )? )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:853:1: ( ( rule__Type__Group_1__0 )? )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:854:1: ( rule__Type__Group_1__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_1()); 
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:855:1: ( rule__Type__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KEYWORD_2) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:855:2: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_1__0_in_rule__Type__Group__1__Impl1637);
                    rule__Type__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:869:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:873:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:874:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__01672);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__01675);
            rule__Type__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:881:1: rule__Type__Group_1__0__Impl : ( KEYWORD_2 ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:885:1: ( ( KEYWORD_2 ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:886:1: ( KEYWORD_2 )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:886:1: ( KEYWORD_2 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:887:1: KEYWORD_2
            {
             before(grammarAccess.getTypeAccess().getColonKeyword_1_0()); 
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__Type__Group_1__0__Impl1703); 
             after(grammarAccess.getTypeAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:900:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:904:1: ( rule__Type__Group_1__1__Impl )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:905:2: rule__Type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__11734);
            rule__Type__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:911:1: rule__Type__Group_1__1__Impl : ( ( RULE_ID )* ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:915:1: ( ( ( RULE_ID )* ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:916:1: ( ( RULE_ID )* )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:916:1: ( ( RULE_ID )* )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:917:1: ( RULE_ID )*
            {
             before(grammarAccess.getTypeAccess().getIDTerminalRuleCall_1_1()); 
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:918:1: ( RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==EOF||(LA7_2>=KEYWORD_5 && LA7_2<=RULE_ID)) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:918:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__Group_1__1__Impl1762); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Html__ContentAssignment_1"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:933:1: rule__Html__ContentAssignment_1 : ( ruleTag ) ;
    public final void rule__Html__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:937:1: ( ( ruleTag ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:938:1: ( ruleTag )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:938:1: ( ruleTag )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:939:1: ruleTag
            {
             before(grammarAccess.getHtmlAccess().getContentTagParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTag_in_rule__Html__ContentAssignment_11802);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getHtmlAccess().getContentTagParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html__ContentAssignment_1"


    // $ANTLR start "rule__Tag__StartTagNameAssignment_0_1_0"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:948:1: rule__Tag__StartTagNameAssignment_0_1_0 : ( ruleType ) ;
    public final void rule__Tag__StartTagNameAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:952:1: ( ( ruleType ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:953:1: ( ruleType )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:953:1: ( ruleType )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:954:1: ruleType
            {
             before(grammarAccess.getTagAccess().getStartTagNameTypeParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Tag__StartTagNameAssignment_0_1_01833);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTagAccess().getStartTagNameTypeParserRuleCall_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__StartTagNameAssignment_0_1_0"


    // $ANTLR start "rule__Tag__AttributesAssignment_0_1_1"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:963:1: rule__Tag__AttributesAssignment_0_1_1 : ( ruleAttribute ) ;
    public final void rule__Tag__AttributesAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:967:1: ( ( ruleAttribute ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:968:1: ( ruleAttribute )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:968:1: ( ruleAttribute )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:969:1: ruleAttribute
            {
             before(grammarAccess.getTagAccess().getAttributesAttributeParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Tag__AttributesAssignment_0_1_11864);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getTagAccess().getAttributesAttributeParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__AttributesAssignment_0_1_1"


    // $ANTLR start "rule__Tag__ChildrenAssignment_0_1_3"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:978:1: rule__Tag__ChildrenAssignment_0_1_3 : ( ruleTag ) ;
    public final void rule__Tag__ChildrenAssignment_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:982:1: ( ( ruleTag ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:983:1: ( ruleTag )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:983:1: ( ruleTag )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:984:1: ruleTag
            {
             before(grammarAccess.getTagAccess().getChildrenTagParserRuleCall_0_1_3_0()); 
            pushFollow(FOLLOW_ruleTag_in_rule__Tag__ChildrenAssignment_0_1_31895);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getTagAccess().getChildrenTagParserRuleCall_0_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__ChildrenAssignment_0_1_3"


    // $ANTLR start "rule__Tag__EndTagNameAssignment_0_1_5"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:993:1: rule__Tag__EndTagNameAssignment_0_1_5 : ( ruleType ) ;
    public final void rule__Tag__EndTagNameAssignment_0_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:997:1: ( ( ruleType ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:998:1: ( ruleType )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:998:1: ( ruleType )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:999:1: ruleType
            {
             before(grammarAccess.getTagAccess().getEndTagNameTypeParserRuleCall_0_1_5_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Tag__EndTagNameAssignment_0_1_51926);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTagAccess().getEndTagNameTypeParserRuleCall_0_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__EndTagNameAssignment_0_1_5"


    // $ANTLR start "rule__Tag__StartTagNameAssignment_1_0"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1008:1: rule__Tag__StartTagNameAssignment_1_0 : ( ruleType ) ;
    public final void rule__Tag__StartTagNameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1012:1: ( ( ruleType ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1013:1: ( ruleType )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1013:1: ( ruleType )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1014:1: ruleType
            {
             before(grammarAccess.getTagAccess().getStartTagNameTypeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Tag__StartTagNameAssignment_1_01957);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTagAccess().getStartTagNameTypeParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__StartTagNameAssignment_1_0"


    // $ANTLR start "rule__Tag__AttributesAssignment_1_1"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1023:1: rule__Tag__AttributesAssignment_1_1 : ( ruleAttribute ) ;
    public final void rule__Tag__AttributesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1027:1: ( ( ruleAttribute ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1028:1: ( ruleAttribute )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1028:1: ( ruleAttribute )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1029:1: ruleAttribute
            {
             before(grammarAccess.getTagAccess().getAttributesAttributeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Tag__AttributesAssignment_1_11988);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getTagAccess().getAttributesAttributeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__AttributesAssignment_1_1"


    // $ANTLR start "rule__Tag__EndTagNameAssignment_1_2"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1038:1: rule__Tag__EndTagNameAssignment_1_2 : ( ( KEYWORD_1 ) ) ;
    public final void rule__Tag__EndTagNameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1042:1: ( ( ( KEYWORD_1 ) ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1043:1: ( ( KEYWORD_1 ) )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1043:1: ( ( KEYWORD_1 ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1044:1: ( KEYWORD_1 )
            {
             before(grammarAccess.getTagAccess().getEndTagNameKeyword_1_2_0()); 
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1045:1: ( KEYWORD_1 )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1046:1: KEYWORD_1
            {
             before(grammarAccess.getTagAccess().getEndTagNameKeyword_1_2_0()); 
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rule__Tag__EndTagNameAssignment_1_22024); 
             after(grammarAccess.getTagAccess().getEndTagNameKeyword_1_2_0()); 

            }

             after(grammarAccess.getTagAccess().getEndTagNameKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__EndTagNameAssignment_1_2"


    // $ANTLR start "rule__Attribute__AttributeNameAssignment_0"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1061:1: rule__Attribute__AttributeNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__AttributeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1065:1: ( ( RULE_ID ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1066:1: ( RULE_ID )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1066:1: ( RULE_ID )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1067:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getAttributeNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__AttributeNameAssignment_02063); 
             after(grammarAccess.getAttributeAccess().getAttributeNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AttributeNameAssignment_0"


    // $ANTLR start "rule__Attribute__AttributeValueAssignment_2"
    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1076:1: rule__Attribute__AttributeValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Attribute__AttributeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1080:1: ( ( RULE_STRING ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1081:1: ( RULE_STRING )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1081:1: ( RULE_STRING )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/internal/InternalCardTemplateParser.g:1082:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getAttributeValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__AttributeValueAssignment_22094); 
             after(grammarAccess.getAttributeAccess().getAttributeValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AttributeValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleHtml_in_entryRuleHtml54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHtml61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Html__Group__0_in_ruleHtml91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTag_in_entryRuleTag118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTag125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__Alternatives_in_ruleTag155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0_in_ruleType283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__Group_0__0_in_rule__Tag__Alternatives319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__Group_1__0_in_rule__Tag__Alternatives337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Html__Group__0__Impl_in_rule__Html__Group__0368 = new BitSet(new long[]{0x0000000000002210L});
    public static final BitSet FOLLOW_rule__Html__Group__1_in_rule__Html__Group__0371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__Html__Group__0__Impl399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Html__Group__1__Impl_in_rule__Html__Group__1430 = new BitSet(new long[]{0x0000000000002210L});
    public static final BitSet FOLLOW_rule__Html__Group__2_in_rule__Html__Group__1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Html__ContentAssignment_1_in_rule__Html__Group__1__Impl460 = new BitSet(new long[]{0x0000000000002202L});
    public static final BitSet FOLLOW_rule__Html__Group__2__Impl_in_rule__Html__Group__2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rule__Html__Group__2__Impl519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__Group_0__0__Impl_in_rule__Tag__Group_0__0556 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_rule__Tag__Group_0__1_in_rule__Tag__Group_0__0559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rule__Tag__Group_0__0__Impl587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__Group_0__1__Impl_in_rule__Tag__Group_0__1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__Group_0_1__0_in_rule__Tag__Group_0__1__Impl645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__Group_0_1__0__Impl_in_rule__Tag__Group_0_1__0679 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_rule__Tag__Group_0_1__1_in_rule__Tag__Group_0_1__0682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__StartTagNameAssignment_0_1_0_in_rule__Tag__Group_0_1__0__Impl709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__Group_0_1__1__Impl_in_rule__Tag__Group_0_1__1739 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_rule__Tag__Group_0_1__2_in_rule__Tag__Group_0_1__1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__AttributesAssignment_0_1_1_in_rule__Tag__Group_0_1__1__Impl769 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Tag__Group_0_1__2__Impl_in_rule__Tag__Group_0_1__2800 = new BitSet(new long[]{0x0000000000002280L});
    public static final BitSet FOLLOW_rule__Tag__Group_0_1__3_in_rule__Tag__Group_0_1__2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__Tag__Group_0_1__2__Impl831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__Group_0_1__3__Impl_in_rule__Tag__Group_0_1__3862 = new BitSet(new long[]{0x0000000000002280L});
    public static final BitSet FOLLOW_rule__Tag__Group_0_1__4_in_rule__Tag__Group_0_1__3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__ChildrenAssignment_0_1_3_in_rule__Tag__Group_0_1__3__Impl892 = new BitSet(new long[]{0x0000000000002202L});
    public static final BitSet FOLLOW_rule__Tag__Group_0_1__4__Impl_in_rule__Tag__Group_0_1__4923 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_rule__Tag__Group_0_1__5_in_rule__Tag__Group_0_1__4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rule__Tag__Group_0_1__4__Impl954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__Group_0_1__5__Impl_in_rule__Tag__Group_0_1__5985 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Tag__Group_0_1__6_in_rule__Tag__Group_0_1__5988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__EndTagNameAssignment_0_1_5_in_rule__Tag__Group_0_1__5__Impl1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__Group_0_1__6__Impl_in_rule__Tag__Group_0_1__61045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__Tag__Group_0_1__6__Impl1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__Group_1__0__Impl_in_rule__Tag__Group_1__01118 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Tag__Group_1__1_in_rule__Tag__Group_1__01121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__StartTagNameAssignment_1_0_in_rule__Tag__Group_1__0__Impl1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__Group_1__1__Impl_in_rule__Tag__Group_1__11178 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Tag__Group_1__2_in_rule__Tag__Group_1__11181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__AttributesAssignment_1_1_in_rule__Tag__Group_1__1__Impl1208 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Tag__Group_1__2__Impl_in_rule__Tag__Group_1__21239 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Tag__Group_1__3_in_rule__Tag__Group_1__21242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__EndTagNameAssignment_1_2_in_rule__Tag__Group_1__2__Impl1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__Group_1__3__Impl_in_rule__Tag__Group_1__31299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__Tag__Group_1__3__Impl1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01366 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AttributeNameAssignment_0_in_rule__Attribute__Group__0__Impl1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11426 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__Attribute__Group__1__Impl1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AttributeValueAssignment_2_in_rule__Attribute__Group__2__Impl1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__01551 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__01554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__Group__0__Impl1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__11610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0_in_rule__Type__Group__1__Impl1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__01672 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__01675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__Type__Group_1__0__Impl1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__11734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__Group_1__1__Impl1762 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleTag_in_rule__Html__ContentAssignment_11802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Tag__StartTagNameAssignment_0_1_01833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Tag__AttributesAssignment_0_1_11864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTag_in_rule__Tag__ChildrenAssignment_0_1_31895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Tag__EndTagNameAssignment_0_1_51926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Tag__StartTagNameAssignment_1_01957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Tag__AttributesAssignment_1_11988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rule__Tag__EndTagNameAssignment_1_22024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__AttributeNameAssignment_02063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__AttributeValueAssignment_22094 = new BitSet(new long[]{0x0000000000000002L});

}