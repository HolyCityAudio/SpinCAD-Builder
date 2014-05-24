package com.holycityaudio.spincadmenu.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.holycityaudio.spincadmenu.services.SpinCADMenuGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpinCADMenuParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@menu'", "'@menuitem'", "'@testItem'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalSpinCADMenuParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpinCADMenuParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpinCADMenuParser.tokenNames; }
    public String getGrammarFileName() { return "../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g"; }



     	private SpinCADMenuGrammarAccess grammarAccess;
     	
        public InternalSpinCADMenuParser(TokenStream input, SpinCADMenuGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Menu";	
       	}
       	
       	@Override
       	protected SpinCADMenuGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMenu"
    // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:67:1: entryRuleMenu returns [EObject current=null] : iv_ruleMenu= ruleMenu EOF ;
    public final EObject entryRuleMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenu = null;


        try {
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:68:2: (iv_ruleMenu= ruleMenu EOF )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:69:2: iv_ruleMenu= ruleMenu EOF
            {
             newCompositeNode(grammarAccess.getMenuRule()); 
            pushFollow(FOLLOW_ruleMenu_in_entryRuleMenu75);
            iv_ruleMenu=ruleMenu();

            state._fsp--;

             current =iv_ruleMenu; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMenu85); 

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
    // $ANTLR end "entryRuleMenu"


    // $ANTLR start "ruleMenu"
    // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:76:1: ruleMenu returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleMenu() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:79:28: ( ( (lv_elements_0_0= ruleElement ) )* )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:80:1: ( (lv_elements_0_0= ruleElement ) )*
            {
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:80:1: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=13)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:81:1: (lv_elements_0_0= ruleElement )
            	    {
            	    // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:81:1: (lv_elements_0_0= ruleElement )
            	    // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:82:3: lv_elements_0_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMenuAccess().getElementsElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleMenu130);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMenuRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleMenu"


    // $ANTLR start "entryRuleElement"
    // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:106:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:107:2: (iv_ruleElement= ruleElement EOF )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:108:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement166);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement176); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:115:1: ruleElement returns [EObject current=null] : (this_MENU_HEADER_0= ruleMENU_HEADER | this_MENU_ITEM_1= ruleMENU_ITEM | this_TEST_ITEM_2= ruleTEST_ITEM ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_MENU_HEADER_0 = null;

        EObject this_MENU_ITEM_1 = null;

        EObject this_TEST_ITEM_2 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:118:28: ( (this_MENU_HEADER_0= ruleMENU_HEADER | this_MENU_ITEM_1= ruleMENU_ITEM | this_TEST_ITEM_2= ruleTEST_ITEM ) )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:119:1: (this_MENU_HEADER_0= ruleMENU_HEADER | this_MENU_ITEM_1= ruleMENU_ITEM | this_TEST_ITEM_2= ruleTEST_ITEM )
            {
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:119:1: (this_MENU_HEADER_0= ruleMENU_HEADER | this_MENU_ITEM_1= ruleMENU_ITEM | this_TEST_ITEM_2= ruleTEST_ITEM )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:120:5: this_MENU_HEADER_0= ruleMENU_HEADER
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getMENU_HEADERParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMENU_HEADER_in_ruleElement223);
                    this_MENU_HEADER_0=ruleMENU_HEADER();

                    state._fsp--;

                     
                            current = this_MENU_HEADER_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:130:5: this_MENU_ITEM_1= ruleMENU_ITEM
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getMENU_ITEMParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMENU_ITEM_in_ruleElement250);
                    this_MENU_ITEM_1=ruleMENU_ITEM();

                    state._fsp--;

                     
                            current = this_MENU_ITEM_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:140:5: this_TEST_ITEM_2= ruleTEST_ITEM
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getTEST_ITEMParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTEST_ITEM_in_ruleElement277);
                    this_TEST_ITEM_2=ruleTEST_ITEM();

                    state._fsp--;

                     
                            current = this_TEST_ITEM_2; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleMENU_HEADER"
    // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:156:1: entryRuleMENU_HEADER returns [EObject current=null] : iv_ruleMENU_HEADER= ruleMENU_HEADER EOF ;
    public final EObject entryRuleMENU_HEADER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMENU_HEADER = null;


        try {
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:157:2: (iv_ruleMENU_HEADER= ruleMENU_HEADER EOF )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:158:2: iv_ruleMENU_HEADER= ruleMENU_HEADER EOF
            {
             newCompositeNode(grammarAccess.getMENU_HEADERRule()); 
            pushFollow(FOLLOW_ruleMENU_HEADER_in_entryRuleMENU_HEADER312);
            iv_ruleMENU_HEADER=ruleMENU_HEADER();

            state._fsp--;

             current =iv_ruleMENU_HEADER; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMENU_HEADER322); 

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
    // $ANTLR end "entryRuleMENU_HEADER"


    // $ANTLR start "ruleMENU_HEADER"
    // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:165:1: ruleMENU_HEADER returns [EObject current=null] : (otherlv_0= '@menu' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMENU_HEADER() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:168:28: ( (otherlv_0= '@menu' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:169:1: (otherlv_0= '@menu' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:169:1: (otherlv_0= '@menu' ( (lv_name_1_0= RULE_STRING ) ) )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:169:3: otherlv_0= '@menu' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleMENU_HEADER359); 

                	newLeafNode(otherlv_0, grammarAccess.getMENU_HEADERAccess().getMenuKeyword_0());
                
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:173:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:174:1: (lv_name_1_0= RULE_STRING )
            {
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:174:1: (lv_name_1_0= RULE_STRING )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:175:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMENU_HEADER376); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMENU_HEADERAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMENU_HEADERRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
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
    // $ANTLR end "ruleMENU_HEADER"


    // $ANTLR start "entryRuleMENU_ITEM"
    // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:199:1: entryRuleMENU_ITEM returns [EObject current=null] : iv_ruleMENU_ITEM= ruleMENU_ITEM EOF ;
    public final EObject entryRuleMENU_ITEM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMENU_ITEM = null;


        try {
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:200:2: (iv_ruleMENU_ITEM= ruleMENU_ITEM EOF )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:201:2: iv_ruleMENU_ITEM= ruleMENU_ITEM EOF
            {
             newCompositeNode(grammarAccess.getMENU_ITEMRule()); 
            pushFollow(FOLLOW_ruleMENU_ITEM_in_entryRuleMENU_ITEM417);
            iv_ruleMENU_ITEM=ruleMENU_ITEM();

            state._fsp--;

             current =iv_ruleMENU_ITEM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMENU_ITEM427); 

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
    // $ANTLR end "entryRuleMENU_ITEM"


    // $ANTLR start "ruleMENU_ITEM"
    // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:208:1: ruleMENU_ITEM returns [EObject current=null] : (otherlv_0= '@menuitem' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_className_2_0= RULE_ID ) ) ) ;
    public final EObject ruleMENU_ITEM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_className_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:211:28: ( (otherlv_0= '@menuitem' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_className_2_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:212:1: (otherlv_0= '@menuitem' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_className_2_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:212:1: (otherlv_0= '@menuitem' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_className_2_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:212:3: otherlv_0= '@menuitem' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_className_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleMENU_ITEM464); 

                	newLeafNode(otherlv_0, grammarAccess.getMENU_ITEMAccess().getMenuitemKeyword_0());
                
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:216:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:217:1: (lv_name_1_0= RULE_STRING )
            {
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:217:1: (lv_name_1_0= RULE_STRING )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:218:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMENU_ITEM481); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMENU_ITEMAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMENU_ITEMRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:234:2: ( (lv_className_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:235:1: (lv_className_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:235:1: (lv_className_2_0= RULE_ID )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:236:3: lv_className_2_0= RULE_ID
            {
            lv_className_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMENU_ITEM503); 

            			newLeafNode(lv_className_2_0, grammarAccess.getMENU_ITEMAccess().getClassNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMENU_ITEMRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"className",
                    		lv_className_2_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleMENU_ITEM"


    // $ANTLR start "entryRuleTEST_ITEM"
    // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:260:1: entryRuleTEST_ITEM returns [EObject current=null] : iv_ruleTEST_ITEM= ruleTEST_ITEM EOF ;
    public final EObject entryRuleTEST_ITEM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTEST_ITEM = null;


        try {
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:261:2: (iv_ruleTEST_ITEM= ruleTEST_ITEM EOF )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:262:2: iv_ruleTEST_ITEM= ruleTEST_ITEM EOF
            {
             newCompositeNode(grammarAccess.getTEST_ITEMRule()); 
            pushFollow(FOLLOW_ruleTEST_ITEM_in_entryRuleTEST_ITEM544);
            iv_ruleTEST_ITEM=ruleTEST_ITEM();

            state._fsp--;

             current =iv_ruleTEST_ITEM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTEST_ITEM554); 

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
    // $ANTLR end "entryRuleTEST_ITEM"


    // $ANTLR start "ruleTEST_ITEM"
    // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:269:1: ruleTEST_ITEM returns [EObject current=null] : (otherlv_0= '@testItem' ( (lv_className_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTEST_ITEM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_className_1_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:272:28: ( (otherlv_0= '@testItem' ( (lv_className_1_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:273:1: (otherlv_0= '@testItem' ( (lv_className_1_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:273:1: (otherlv_0= '@testItem' ( (lv_className_1_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:273:3: otherlv_0= '@testItem' ( (lv_className_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleTEST_ITEM591); 

                	newLeafNode(otherlv_0, grammarAccess.getTEST_ITEMAccess().getTestItemKeyword_0());
                
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:277:1: ( (lv_className_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:278:1: (lv_className_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:278:1: (lv_className_1_0= RULE_ID )
            // ../com.holycityaudio.spincadmenu/src-gen/com/holycityaudio/spincadmenu/parser/antlr/internal/InternalSpinCADMenu.g:279:3: lv_className_1_0= RULE_ID
            {
            lv_className_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTEST_ITEM608); 

            			newLeafNode(lv_className_1_0, grammarAccess.getTEST_ITEMAccess().getClassNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTEST_ITEMRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"className",
                    		lv_className_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleTEST_ITEM"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMenu_in_entryRuleMenu75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMenu85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleMenu130 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMENU_HEADER_in_ruleElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMENU_ITEM_in_ruleElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEST_ITEM_in_ruleElement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMENU_HEADER_in_entryRuleMENU_HEADER312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMENU_HEADER322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMENU_HEADER359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMENU_HEADER376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMENU_ITEM_in_entryRuleMENU_ITEM417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMENU_ITEM427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleMENU_ITEM464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMENU_ITEM481 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMENU_ITEM503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEST_ITEM_in_entryRuleTEST_ITEM544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTEST_ITEM554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTEST_ITEM591 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTEST_ITEM608 = new BitSet(new long[]{0x0000000000000002L});

}