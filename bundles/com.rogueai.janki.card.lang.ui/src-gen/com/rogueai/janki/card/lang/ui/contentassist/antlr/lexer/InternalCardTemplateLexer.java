package com.rogueai.janki.card.lang.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCardTemplateLexer extends Lexer {
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

    public InternalCardTemplateLexer() {;} 
    public InternalCardTemplateLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCardTemplateLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g"; }

    // $ANTLR start "KEYWORD_9"
    public final void mKEYWORD_9() throws RecognitionException {
        try {
            int _type = KEYWORD_9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:19:11: ( '<' '/' ( 'H' | 'h' ) ( 'T' | 't' ) ( 'M' | 'm' ) ( 'L' | 'l' ) '>' )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:19:13: '<' '/' ( 'H' | 'h' ) ( 'T' | 't' ) ( 'M' | 'm' ) ( 'L' | 'l' ) '>'
            {
            match('<'); 
            match('/'); 
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_9"

    // $ANTLR start "KEYWORD_8"
    public final void mKEYWORD_8() throws RecognitionException {
        try {
            int _type = KEYWORD_8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:21:11: ( '<' ( 'H' | 'h' ) ( 'T' | 't' ) ( 'M' | 'm' ) ( 'L' | 'l' ) '>' )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:21:13: '<' ( 'H' | 'h' ) ( 'T' | 't' ) ( 'M' | 'm' ) ( 'L' | 'l' ) '>'
            {
            match('<'); 
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_8"

    // $ANTLR start "KEYWORD_6"
    public final void mKEYWORD_6() throws RecognitionException {
        try {
            int _type = KEYWORD_6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:23:11: ( '/' '>' )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:23:13: '/' '>'
            {
            match('/'); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_6"

    // $ANTLR start "KEYWORD_7"
    public final void mKEYWORD_7() throws RecognitionException {
        try {
            int _type = KEYWORD_7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:25:11: ( '<' '/' )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:25:13: '<' '/'
            {
            match('<'); 
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_7"

    // $ANTLR start "KEYWORD_2"
    public final void mKEYWORD_2() throws RecognitionException {
        try {
            int _type = KEYWORD_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:27:11: ( ':' )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:27:13: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_2"

    // $ANTLR start "KEYWORD_3"
    public final void mKEYWORD_3() throws RecognitionException {
        try {
            int _type = KEYWORD_3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:29:11: ( '<' )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:29:13: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_3"

    // $ANTLR start "KEYWORD_4"
    public final void mKEYWORD_4() throws RecognitionException {
        try {
            int _type = KEYWORD_4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:31:11: ( '=' )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:31:13: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_4"

    // $ANTLR start "KEYWORD_5"
    public final void mKEYWORD_5() throws RecognitionException {
        try {
            int _type = KEYWORD_5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:33:11: ( '>' )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:33:13: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_5"

    // $ANTLR start "KEYWORD_1"
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:35:11: ()
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:35:13: 
            {
            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_1"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:39:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:39:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:39:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:39:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:39:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:41:10: ( ( '0' .. '9' )+ )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:41:12: ( '0' .. '9' )+
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:41:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:41:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:43:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:43:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:43:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:43:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:43:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:43:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:43:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:43:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:43:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:43:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:43:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:45:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:45:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:45:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:45:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:47:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:47:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:47:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:47:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:47:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:47:41: ( '\\r' )? '\\n'
                    {
                    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:47:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:47:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:49:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:49:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:49:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:51:16: ( . )
            // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:51:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:1:8: ( KEYWORD_9 | KEYWORD_8 | KEYWORD_6 | KEYWORD_7 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_1 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=16;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:1:10: KEYWORD_9
                {
                mKEYWORD_9(); 

                }
                break;
            case 2 :
                // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:1:20: KEYWORD_8
                {
                mKEYWORD_8(); 

                }
                break;
            case 3 :
                // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:1:30: KEYWORD_6
                {
                mKEYWORD_6(); 

                }
                break;
            case 4 :
                // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:1:40: KEYWORD_7
                {
                mKEYWORD_7(); 

                }
                break;
            case 5 :
                // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:1:50: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 6 :
                // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:1:60: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 7 :
                // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:1:70: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 8 :
                // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:1:80: KEYWORD_5
                {
                mKEYWORD_5(); 

                }
                break;
            case 9 :
                // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:1:90: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 10 :
                // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:1:100: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 11 :
                // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:1:108: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 12 :
                // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:1:117: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:1:129: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 14 :
                // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:1:145: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:1:161: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 16 :
                // ../com.rogueai.janki.card.lang.ui/src-gen/com/rogueai/janki/card/lang/ui/contentassist/antlr/lexer/InternalCardTemplateLexer.g:1:169: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\6\1\20\1\15\4\uffff\1\15\2\uffff\2\15\2\uffff\1\34\16\uffff";
    static final String DFA12_eofS =
        "\35\uffff";
    static final String DFA12_minS =
        "\1\0\1\57\1\52\4\uffff\1\101\2\uffff\2\0\2\uffff\1\110\16\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\150\1\76\4\uffff\1\172\2\uffff\2\uffff\2\uffff\1\150"+
        "\16\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\5\1\7\1\10\1\11\1\uffff\1\12\1\13\2\uffff\1\17\1\20\1"+
        "\uffff\1\2\1\6\1\3\1\15\1\16\1\5\1\7\1\10\1\12\1\13\1\14\1\17\1"+
        "\1\1\4";
    static final String DFA12_specialS =
        "\1\1\11\uffff\1\0\1\2\21\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\15\2\14\2\15\1\14\22\15\1\14\1\15\1\12\4\15\1\13\7\15\1"+
            "\2\12\11\1\3\1\15\1\1\1\4\1\5\2\15\32\10\3\15\1\7\1\10\1\15"+
            "\32\10\uff85\15",
            "\1\16\30\uffff\1\17\37\uffff\1\17",
            "\1\22\4\uffff\1\23\16\uffff\1\21",
            "",
            "",
            "",
            "",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\0\31",
            "\0\31",
            "",
            "",
            "\1\33\37\uffff\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KEYWORD_9 | KEYWORD_8 | KEYWORD_6 | KEYWORD_7 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_1 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_10 = input.LA(1);

                        s = -1;
                        if ( ((LA12_10>='\u0000' && LA12_10<='\uFFFF')) ) {s = 25;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='<') ) {s = 1;}

                        else if ( (LA12_0=='/') ) {s = 2;}

                        else if ( (LA12_0==':') ) {s = 3;}

                        else if ( (LA12_0=='=') ) {s = 4;}

                        else if ( (LA12_0=='>') ) {s = 5;}

                        else if ( (LA12_0=='^') ) {s = 7;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {s = 8;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 9;}

                        else if ( (LA12_0=='\"') ) {s = 10;}

                        else if ( (LA12_0=='\'') ) {s = 11;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 12;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||LA12_0==';'||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 13;}

                        else s = 6;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_11 = input.LA(1);

                        s = -1;
                        if ( ((LA12_11>='\u0000' && LA12_11<='\uFFFF')) ) {s = 25;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}