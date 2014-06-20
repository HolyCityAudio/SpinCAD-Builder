package com.holycityaudio.spincad.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.holycityaudio.spincad.services.SpinCADGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpinCADParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_SC_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@name'", "'@audioInput'", "'@audioOutput'", "'@controlInput'", "'@controlOutput'", "'equ'", "'mem'", "'offset'", "'bool'", "':'", "'@isPinConnected'", "'@isTrue'", "'@else'", "'@endif'", "'@getInputDefault'", "'@getDelayScaleControl'", "'@getBaseAddress'", "'@setOutputPin'", "'rdax'", "','", "'wrlx'", "'wrhx'", "'wrax'", "'maxx'", "'rdfx'", "'mulx'", "'ldax'", "'exp'", "'log'", "'sof'", "'wra'", "'wrap'", "'rda'", "'wlds'", "'wldr'", "'cho rda'", "'cho rdal'", "'cho sof'", "'rmpa'", "'and'", "'or'", "'xor'", "'jam'", "'clr'", "'not'", "'absa'", "'skp'", "'-'", "'.'", "'|'", "'#'", "'^'", "'+'", "'%'", "'$'", "'true'", "'false'"
    };
    public static final int RULE_SC_COMMENT=6;
    public static final int T__68=68;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalSpinCADParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpinCADParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpinCADParser.tokenNames; }
    public String getGrammarFileName() { return "../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g"; }



     	private SpinCADGrammarAccess grammarAccess;
     	
        public InternalSpinCADParser(TokenStream input, SpinCADGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected SpinCADGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:76:1: ruleProgram returns [EObject current=null] : (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) ( (lv_pins_2_0= rulePin ) )+ ( (lv_elements_3_0= ruleSpinElement ) )+ ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_pins_2_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:79:28: ( (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) ( (lv_pins_2_0= rulePin ) )+ ( (lv_elements_3_0= ruleSpinElement ) )+ ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:80:1: (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) ( (lv_pins_2_0= rulePin ) )+ ( (lv_elements_3_0= ruleSpinElement ) )+ )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:80:1: (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) ( (lv_pins_2_0= rulePin ) )+ ( (lv_elements_3_0= ruleSpinElement ) )+ )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:80:3: otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) ( (lv_pins_2_0= rulePin ) )+ ( (lv_elements_3_0= ruleSpinElement ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleProgram122); 

                	newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getNameKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:85:1: (lv_name_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProgram139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProgramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:102:2: ( (lv_pins_2_0= rulePin ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:103:1: (lv_pins_2_0= rulePin )
            	    {
            	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:103:1: (lv_pins_2_0= rulePin )
            	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:104:3: lv_pins_2_0= rulePin
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getPinsPinParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePin_in_ruleProgram165);
            	    lv_pins_2_0=rulePin();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pins",
            	            		lv_pins_2_0, 
            	            		"Pin");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:120:3: ( (lv_elements_3_0= ruleSpinElement ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==RULE_SC_COMMENT||(LA2_0>=17 && LA2_0<=20)||(LA2_0>=22 && LA2_0<=30)||(LA2_0>=32 && LA2_0<=58)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:121:1: (lv_elements_3_0= ruleSpinElement )
            	    {
            	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:121:1: (lv_elements_3_0= ruleSpinElement )
            	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:122:3: lv_elements_3_0= ruleSpinElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getElementsSpinElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSpinElement_in_ruleProgram187);
            	    lv_elements_3_0=ruleSpinElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"SpinElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRulePin"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:146:1: entryRulePin returns [EObject current=null] : iv_rulePin= rulePin EOF ;
    public final EObject entryRulePin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePin = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:147:2: (iv_rulePin= rulePin EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:148:2: iv_rulePin= rulePin EOF
            {
             newCompositeNode(grammarAccess.getPinRule()); 
            pushFollow(FOLLOW_rulePin_in_entryRulePin224);
            iv_rulePin=rulePin();

            state._fsp--;

             current =iv_rulePin; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePin234); 

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
    // $ANTLR end "entryRulePin"


    // $ANTLR start "rulePin"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:155:1: rulePin returns [EObject current=null] : (this_InputPin_0= ruleInputPin | this_OutputPin_1= ruleOutputPin ) ;
    public final EObject rulePin() throws RecognitionException {
        EObject current = null;

        EObject this_InputPin_0 = null;

        EObject this_OutputPin_1 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:158:28: ( (this_InputPin_0= ruleInputPin | this_OutputPin_1= ruleOutputPin ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:159:1: (this_InputPin_0= ruleInputPin | this_OutputPin_1= ruleOutputPin )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:159:1: (this_InputPin_0= ruleInputPin | this_OutputPin_1= ruleOutputPin )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13||LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==14||LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:160:5: this_InputPin_0= ruleInputPin
                    {
                     
                            newCompositeNode(grammarAccess.getPinAccess().getInputPinParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInputPin_in_rulePin281);
                    this_InputPin_0=ruleInputPin();

                    state._fsp--;

                     
                            current = this_InputPin_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:170:5: this_OutputPin_1= ruleOutputPin
                    {
                     
                            newCompositeNode(grammarAccess.getPinAccess().getOutputPinParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOutputPin_in_rulePin308);
                    this_OutputPin_1=ruleOutputPin();

                    state._fsp--;

                     
                            current = this_OutputPin_1; 
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
    // $ANTLR end "rulePin"


    // $ANTLR start "entryRuleInputPin"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:186:1: entryRuleInputPin returns [EObject current=null] : iv_ruleInputPin= ruleInputPin EOF ;
    public final EObject entryRuleInputPin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputPin = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:187:2: (iv_ruleInputPin= ruleInputPin EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:188:2: iv_ruleInputPin= ruleInputPin EOF
            {
             newCompositeNode(grammarAccess.getInputPinRule()); 
            pushFollow(FOLLOW_ruleInputPin_in_entryRuleInputPin343);
            iv_ruleInputPin=ruleInputPin();

            state._fsp--;

             current =iv_ruleInputPin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputPin353); 

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
    // $ANTLR end "entryRuleInputPin"


    // $ANTLR start "ruleInputPin"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:195:1: ruleInputPin returns [EObject current=null] : (this_AudioInput_0= ruleAudioInput | this_ControlInput_1= ruleControlInput ) ;
    public final EObject ruleInputPin() throws RecognitionException {
        EObject current = null;

        EObject this_AudioInput_0 = null;

        EObject this_ControlInput_1 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:198:28: ( (this_AudioInput_0= ruleAudioInput | this_ControlInput_1= ruleControlInput ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:199:1: (this_AudioInput_0= ruleAudioInput | this_ControlInput_1= ruleControlInput )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:199:1: (this_AudioInput_0= ruleAudioInput | this_ControlInput_1= ruleControlInput )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:200:5: this_AudioInput_0= ruleAudioInput
                    {
                     
                            newCompositeNode(grammarAccess.getInputPinAccess().getAudioInputParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAudioInput_in_ruleInputPin400);
                    this_AudioInput_0=ruleAudioInput();

                    state._fsp--;

                     
                            current = this_AudioInput_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:210:5: this_ControlInput_1= ruleControlInput
                    {
                     
                            newCompositeNode(grammarAccess.getInputPinAccess().getControlInputParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleControlInput_in_ruleInputPin427);
                    this_ControlInput_1=ruleControlInput();

                    state._fsp--;

                     
                            current = this_ControlInput_1; 
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
    // $ANTLR end "ruleInputPin"


    // $ANTLR start "entryRuleOutputPin"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:226:1: entryRuleOutputPin returns [EObject current=null] : iv_ruleOutputPin= ruleOutputPin EOF ;
    public final EObject entryRuleOutputPin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputPin = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:227:2: (iv_ruleOutputPin= ruleOutputPin EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:228:2: iv_ruleOutputPin= ruleOutputPin EOF
            {
             newCompositeNode(grammarAccess.getOutputPinRule()); 
            pushFollow(FOLLOW_ruleOutputPin_in_entryRuleOutputPin462);
            iv_ruleOutputPin=ruleOutputPin();

            state._fsp--;

             current =iv_ruleOutputPin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputPin472); 

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
    // $ANTLR end "entryRuleOutputPin"


    // $ANTLR start "ruleOutputPin"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:235:1: ruleOutputPin returns [EObject current=null] : (this_AudioOutput_0= ruleAudioOutput | this_ControlOutput_1= ruleControlOutput ) ;
    public final EObject ruleOutputPin() throws RecognitionException {
        EObject current = null;

        EObject this_AudioOutput_0 = null;

        EObject this_ControlOutput_1 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:238:28: ( (this_AudioOutput_0= ruleAudioOutput | this_ControlOutput_1= ruleControlOutput ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:239:1: (this_AudioOutput_0= ruleAudioOutput | this_ControlOutput_1= ruleControlOutput )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:239:1: (this_AudioOutput_0= ruleAudioOutput | this_ControlOutput_1= ruleControlOutput )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:240:5: this_AudioOutput_0= ruleAudioOutput
                    {
                     
                            newCompositeNode(grammarAccess.getOutputPinAccess().getAudioOutputParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAudioOutput_in_ruleOutputPin519);
                    this_AudioOutput_0=ruleAudioOutput();

                    state._fsp--;

                     
                            current = this_AudioOutput_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:250:5: this_ControlOutput_1= ruleControlOutput
                    {
                     
                            newCompositeNode(grammarAccess.getOutputPinAccess().getControlOutputParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleControlOutput_in_ruleOutputPin546);
                    this_ControlOutput_1=ruleControlOutput();

                    state._fsp--;

                     
                            current = this_ControlOutput_1; 
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
    // $ANTLR end "ruleOutputPin"


    // $ANTLR start "entryRuleAudioInput"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:266:1: entryRuleAudioInput returns [EObject current=null] : iv_ruleAudioInput= ruleAudioInput EOF ;
    public final EObject entryRuleAudioInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudioInput = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:267:2: (iv_ruleAudioInput= ruleAudioInput EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:268:2: iv_ruleAudioInput= ruleAudioInput EOF
            {
             newCompositeNode(grammarAccess.getAudioInputRule()); 
            pushFollow(FOLLOW_ruleAudioInput_in_entryRuleAudioInput581);
            iv_ruleAudioInput=ruleAudioInput();

            state._fsp--;

             current =iv_ruleAudioInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAudioInput591); 

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
    // $ANTLR end "entryRuleAudioInput"


    // $ANTLR start "ruleAudioInput"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:275:1: ruleAudioInput returns [EObject current=null] : (otherlv_0= '@audioInput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAudioInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:278:28: ( (otherlv_0= '@audioInput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:279:1: (otherlv_0= '@audioInput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:279:1: (otherlv_0= '@audioInput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:279:3: otherlv_0= '@audioInput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleAudioInput628); 

                	newLeafNode(otherlv_0, grammarAccess.getAudioInputAccess().getAudioInputKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:283:1: ( (lv_varName_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:284:1: (lv_varName_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:284:1: (lv_varName_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:285:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAudioInput645); 

            			newLeafNode(lv_varName_1_0, grammarAccess.getAudioInputAccess().getVarNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAudioInputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:301:2: ( (lv_name_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:302:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:302:1: (lv_name_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:303:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAudioInput667); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAudioInputAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAudioInputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
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
    // $ANTLR end "ruleAudioInput"


    // $ANTLR start "entryRuleAudioOutput"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:327:1: entryRuleAudioOutput returns [EObject current=null] : iv_ruleAudioOutput= ruleAudioOutput EOF ;
    public final EObject entryRuleAudioOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudioOutput = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:328:2: (iv_ruleAudioOutput= ruleAudioOutput EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:329:2: iv_ruleAudioOutput= ruleAudioOutput EOF
            {
             newCompositeNode(grammarAccess.getAudioOutputRule()); 
            pushFollow(FOLLOW_ruleAudioOutput_in_entryRuleAudioOutput708);
            iv_ruleAudioOutput=ruleAudioOutput();

            state._fsp--;

             current =iv_ruleAudioOutput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAudioOutput718); 

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
    // $ANTLR end "entryRuleAudioOutput"


    // $ANTLR start "ruleAudioOutput"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:336:1: ruleAudioOutput returns [EObject current=null] : (otherlv_0= '@audioOutput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAudioOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:339:28: ( (otherlv_0= '@audioOutput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:340:1: (otherlv_0= '@audioOutput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:340:1: (otherlv_0= '@audioOutput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:340:3: otherlv_0= '@audioOutput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleAudioOutput755); 

                	newLeafNode(otherlv_0, grammarAccess.getAudioOutputAccess().getAudioOutputKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:344:1: ( (lv_varName_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:345:1: (lv_varName_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:345:1: (lv_varName_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:346:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAudioOutput772); 

            			newLeafNode(lv_varName_1_0, grammarAccess.getAudioOutputAccess().getVarNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAudioOutputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:362:2: ( (lv_name_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:363:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:363:1: (lv_name_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:364:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAudioOutput794); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAudioOutputAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAudioOutputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
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
    // $ANTLR end "ruleAudioOutput"


    // $ANTLR start "entryRuleControlInput"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:388:1: entryRuleControlInput returns [EObject current=null] : iv_ruleControlInput= ruleControlInput EOF ;
    public final EObject entryRuleControlInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlInput = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:389:2: (iv_ruleControlInput= ruleControlInput EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:390:2: iv_ruleControlInput= ruleControlInput EOF
            {
             newCompositeNode(grammarAccess.getControlInputRule()); 
            pushFollow(FOLLOW_ruleControlInput_in_entryRuleControlInput835);
            iv_ruleControlInput=ruleControlInput();

            state._fsp--;

             current =iv_ruleControlInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControlInput845); 

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
    // $ANTLR end "entryRuleControlInput"


    // $ANTLR start "ruleControlInput"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:397:1: ruleControlInput returns [EObject current=null] : (otherlv_0= '@controlInput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleControlInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:400:28: ( (otherlv_0= '@controlInput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:401:1: (otherlv_0= '@controlInput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:401:1: (otherlv_0= '@controlInput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:401:3: otherlv_0= '@controlInput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleControlInput882); 

                	newLeafNode(otherlv_0, grammarAccess.getControlInputAccess().getControlInputKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:405:1: ( (lv_varName_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:406:1: (lv_varName_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:406:1: (lv_varName_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:407:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleControlInput899); 

            			newLeafNode(lv_varName_1_0, grammarAccess.getControlInputAccess().getVarNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getControlInputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:423:2: ( (lv_name_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:424:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:424:1: (lv_name_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:425:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleControlInput921); 

            			newLeafNode(lv_name_2_0, grammarAccess.getControlInputAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getControlInputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
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
    // $ANTLR end "ruleControlInput"


    // $ANTLR start "entryRuleControlOutput"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:449:1: entryRuleControlOutput returns [EObject current=null] : iv_ruleControlOutput= ruleControlOutput EOF ;
    public final EObject entryRuleControlOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlOutput = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:450:2: (iv_ruleControlOutput= ruleControlOutput EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:451:2: iv_ruleControlOutput= ruleControlOutput EOF
            {
             newCompositeNode(grammarAccess.getControlOutputRule()); 
            pushFollow(FOLLOW_ruleControlOutput_in_entryRuleControlOutput962);
            iv_ruleControlOutput=ruleControlOutput();

            state._fsp--;

             current =iv_ruleControlOutput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControlOutput972); 

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
    // $ANTLR end "entryRuleControlOutput"


    // $ANTLR start "ruleControlOutput"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:458:1: ruleControlOutput returns [EObject current=null] : (otherlv_0= '@controlOutput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleControlOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:461:28: ( (otherlv_0= '@controlOutput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:462:1: (otherlv_0= '@controlOutput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:462:1: (otherlv_0= '@controlOutput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:462:3: otherlv_0= '@controlOutput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleControlOutput1009); 

                	newLeafNode(otherlv_0, grammarAccess.getControlOutputAccess().getControlOutputKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:466:1: ( (lv_varName_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:467:1: (lv_varName_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:467:1: (lv_varName_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:468:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleControlOutput1026); 

            			newLeafNode(lv_varName_1_0, grammarAccess.getControlOutputAccess().getVarNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getControlOutputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:484:2: ( (lv_name_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:485:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:485:1: (lv_name_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:486:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleControlOutput1048); 

            			newLeafNode(lv_name_2_0, grammarAccess.getControlOutputAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getControlOutputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
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
    // $ANTLR end "ruleControlOutput"


    // $ANTLR start "entryRuleSpinElement"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:510:1: entryRuleSpinElement returns [EObject current=null] : iv_ruleSpinElement= ruleSpinElement EOF ;
    public final EObject entryRuleSpinElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinElement = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:511:2: (iv_ruleSpinElement= ruleSpinElement EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:512:2: iv_ruleSpinElement= ruleSpinElement EOF
            {
             newCompositeNode(grammarAccess.getSpinElementRule()); 
            pushFollow(FOLLOW_ruleSpinElement_in_entryRuleSpinElement1089);
            iv_ruleSpinElement=ruleSpinElement();

            state._fsp--;

             current =iv_ruleSpinElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpinElement1099); 

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
    // $ANTLR end "entryRuleSpinElement"


    // $ANTLR start "ruleSpinElement"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:519:1: ruleSpinElement returns [EObject current=null] : (this_Equate_0= ruleEquate | this_Bool_1= ruleBool | this_Mem_2= ruleMem | this_Instruction_3= ruleInstruction | this_Label_4= ruleLabel | this_Comment_5= ruleComment | this_Macro_6= ruleMacro | this_Offset_7= ruleOffset ) ;
    public final EObject ruleSpinElement() throws RecognitionException {
        EObject current = null;

        EObject this_Equate_0 = null;

        EObject this_Bool_1 = null;

        EObject this_Mem_2 = null;

        EObject this_Instruction_3 = null;

        EObject this_Label_4 = null;

        EObject this_Comment_5 = null;

        EObject this_Macro_6 = null;

        EObject this_Offset_7 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:522:28: ( (this_Equate_0= ruleEquate | this_Bool_1= ruleBool | this_Mem_2= ruleMem | this_Instruction_3= ruleInstruction | this_Label_4= ruleLabel | this_Comment_5= ruleComment | this_Macro_6= ruleMacro | this_Offset_7= ruleOffset ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:523:1: (this_Equate_0= ruleEquate | this_Bool_1= ruleBool | this_Mem_2= ruleMem | this_Instruction_3= ruleInstruction | this_Label_4= ruleLabel | this_Comment_5= ruleComment | this_Macro_6= ruleMacro | this_Offset_7= ruleOffset )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:523:1: (this_Equate_0= ruleEquate | this_Bool_1= ruleBool | this_Mem_2= ruleMem | this_Instruction_3= ruleInstruction | this_Label_4= ruleLabel | this_Comment_5= ruleComment | this_Macro_6= ruleMacro | this_Offset_7= ruleOffset )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 30:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
                {
                alt6=4;
                }
                break;
            case RULE_ID:
                {
                alt6=5;
                }
                break;
            case RULE_SC_COMMENT:
                {
                alt6=6;
                }
                break;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt6=7;
                }
                break;
            case 19:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:524:5: this_Equate_0= ruleEquate
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getEquateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEquate_in_ruleSpinElement1146);
                    this_Equate_0=ruleEquate();

                    state._fsp--;

                     
                            current = this_Equate_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:534:5: this_Bool_1= ruleBool
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getBoolParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBool_in_ruleSpinElement1173);
                    this_Bool_1=ruleBool();

                    state._fsp--;

                     
                            current = this_Bool_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:544:5: this_Mem_2= ruleMem
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getMemParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMem_in_ruleSpinElement1200);
                    this_Mem_2=ruleMem();

                    state._fsp--;

                     
                            current = this_Mem_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:554:5: this_Instruction_3= ruleInstruction
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getInstructionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleInstruction_in_ruleSpinElement1227);
                    this_Instruction_3=ruleInstruction();

                    state._fsp--;

                     
                            current = this_Instruction_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:564:5: this_Label_4= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getLabelParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleSpinElement1254);
                    this_Label_4=ruleLabel();

                    state._fsp--;

                     
                            current = this_Label_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:574:5: this_Comment_5= ruleComment
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getCommentParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleComment_in_ruleSpinElement1281);
                    this_Comment_5=ruleComment();

                    state._fsp--;

                     
                            current = this_Comment_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:584:5: this_Macro_6= ruleMacro
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getMacroParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleMacro_in_ruleSpinElement1308);
                    this_Macro_6=ruleMacro();

                    state._fsp--;

                     
                            current = this_Macro_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:594:5: this_Offset_7= ruleOffset
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getOffsetParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleOffset_in_ruleSpinElement1335);
                    this_Offset_7=ruleOffset();

                    state._fsp--;

                     
                            current = this_Offset_7; 
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
    // $ANTLR end "ruleSpinElement"


    // $ANTLR start "entryRuleEquate"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:610:1: entryRuleEquate returns [EObject current=null] : iv_ruleEquate= ruleEquate EOF ;
    public final EObject entryRuleEquate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquate = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:611:2: (iv_ruleEquate= ruleEquate EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:612:2: iv_ruleEquate= ruleEquate EOF
            {
             newCompositeNode(grammarAccess.getEquateRule()); 
            pushFollow(FOLLOW_ruleEquate_in_entryRuleEquate1370);
            iv_ruleEquate=ruleEquate();

            state._fsp--;

             current =iv_ruleEquate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquate1380); 

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
    // $ANTLR end "entryRuleEquate"


    // $ANTLR start "ruleEquate"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:619:1: ruleEquate returns [EObject current=null] : (otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) ( ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) ) ( ( (lv_minVal_5_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_6_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_7_0= ruleSPINDOUBLE ) ) ( (lv_precision_8_0= RULE_INT ) ) ( (lv_option_9_0= RULE_ID ) )? )? )? ) ;
    public final EObject ruleEquate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ename_1_0=null;
        Token lv_controlType_3_0=null;
        Token lv_controlName_4_0=null;
        Token lv_precision_8_0=null;
        Token lv_option_9_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_minVal_5_0 = null;

        AntlrDatatypeRuleToken lv_maxVal_6_0 = null;

        AntlrDatatypeRuleToken lv_multiplier_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:622:28: ( (otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) ( ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) ) ( ( (lv_minVal_5_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_6_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_7_0= ruleSPINDOUBLE ) ) ( (lv_precision_8_0= RULE_INT ) ) ( (lv_option_9_0= RULE_ID ) )? )? )? ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:623:1: (otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) ( ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) ) ( ( (lv_minVal_5_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_6_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_7_0= ruleSPINDOUBLE ) ) ( (lv_precision_8_0= RULE_INT ) ) ( (lv_option_9_0= RULE_ID ) )? )? )? )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:623:1: (otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) ( ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) ) ( ( (lv_minVal_5_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_6_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_7_0= ruleSPINDOUBLE ) ) ( (lv_precision_8_0= RULE_INT ) ) ( (lv_option_9_0= RULE_ID ) )? )? )? )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:623:3: otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) ( ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) ) ( ( (lv_minVal_5_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_6_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_7_0= ruleSPINDOUBLE ) ) ( (lv_precision_8_0= RULE_INT ) ) ( (lv_option_9_0= RULE_ID ) )? )? )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleEquate1417); 

                	newLeafNode(otherlv_0, grammarAccess.getEquateAccess().getEquKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:627:1: ( (lv_ename_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:628:1: (lv_ename_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:628:1: (lv_ename_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:629:3: lv_ename_1_0= RULE_ID
            {
            lv_ename_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEquate1434); 

            			newLeafNode(lv_ename_1_0, grammarAccess.getEquateAccess().getEnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEquateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ename",
                    		lv_ename_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:645:2: ( (lv_value_2_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:646:1: (lv_value_2_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:646:1: (lv_value_2_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:647:3: lv_value_2_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getEquateAccess().getValueSPINDOUBLEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleEquate1460);
            lv_value_2_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEquateRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:663:2: ( ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) ) ( ( (lv_minVal_5_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_6_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_7_0= ruleSPINDOUBLE ) ) ( (lv_precision_8_0= RULE_INT ) ) ( (lv_option_9_0= RULE_ID ) )? )? )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_ID) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:663:3: ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) ) ( ( (lv_minVal_5_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_6_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_7_0= ruleSPINDOUBLE ) ) ( (lv_precision_8_0= RULE_INT ) ) ( (lv_option_9_0= RULE_ID ) )? )?
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:663:3: ( (lv_controlType_3_0= RULE_ID ) )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:664:1: (lv_controlType_3_0= RULE_ID )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:664:1: (lv_controlType_3_0= RULE_ID )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:665:3: lv_controlType_3_0= RULE_ID
                    {
                    lv_controlType_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEquate1478); 

                    			newLeafNode(lv_controlType_3_0, grammarAccess.getEquateAccess().getControlTypeIDTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEquateRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"controlType",
                            		lv_controlType_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:681:2: ( (lv_controlName_4_0= RULE_ID ) )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:682:1: (lv_controlName_4_0= RULE_ID )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:682:1: (lv_controlName_4_0= RULE_ID )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:683:3: lv_controlName_4_0= RULE_ID
                    {
                    lv_controlName_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEquate1500); 

                    			newLeafNode(lv_controlName_4_0, grammarAccess.getEquateAccess().getControlNameIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEquateRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"controlName",
                            		lv_controlName_4_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:699:2: ( ( (lv_minVal_5_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_6_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_7_0= ruleSPINDOUBLE ) ) ( (lv_precision_8_0= RULE_INT ) ) ( (lv_option_9_0= RULE_ID ) )? )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_INT||LA8_0==59) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==RULE_ID) ) {
                        int LA8_2 = input.LA(2);

                        if ( ((LA8_2>=RULE_ID && LA8_2<=RULE_INT)||LA8_2==59) ) {
                            alt8=1;
                        }
                    }
                    switch (alt8) {
                        case 1 :
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:699:3: ( (lv_minVal_5_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_6_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_7_0= ruleSPINDOUBLE ) ) ( (lv_precision_8_0= RULE_INT ) ) ( (lv_option_9_0= RULE_ID ) )?
                            {
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:699:3: ( (lv_minVal_5_0= ruleSPINDOUBLE ) )
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:700:1: (lv_minVal_5_0= ruleSPINDOUBLE )
                            {
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:700:1: (lv_minVal_5_0= ruleSPINDOUBLE )
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:701:3: lv_minVal_5_0= ruleSPINDOUBLE
                            {
                             
                            	        newCompositeNode(grammarAccess.getEquateAccess().getMinValSPINDOUBLEParserRuleCall_3_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleEquate1527);
                            lv_minVal_5_0=ruleSPINDOUBLE();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getEquateRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"minVal",
                                    		lv_minVal_5_0, 
                                    		"SPINDOUBLE");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:717:2: ( (lv_maxVal_6_0= ruleSPINDOUBLE ) )
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:718:1: (lv_maxVal_6_0= ruleSPINDOUBLE )
                            {
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:718:1: (lv_maxVal_6_0= ruleSPINDOUBLE )
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:719:3: lv_maxVal_6_0= ruleSPINDOUBLE
                            {
                             
                            	        newCompositeNode(grammarAccess.getEquateAccess().getMaxValSPINDOUBLEParserRuleCall_3_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleEquate1548);
                            lv_maxVal_6_0=ruleSPINDOUBLE();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getEquateRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"maxVal",
                                    		lv_maxVal_6_0, 
                                    		"SPINDOUBLE");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:735:2: ( (lv_multiplier_7_0= ruleSPINDOUBLE ) )
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:736:1: (lv_multiplier_7_0= ruleSPINDOUBLE )
                            {
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:736:1: (lv_multiplier_7_0= ruleSPINDOUBLE )
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:737:3: lv_multiplier_7_0= ruleSPINDOUBLE
                            {
                             
                            	        newCompositeNode(grammarAccess.getEquateAccess().getMultiplierSPINDOUBLEParserRuleCall_3_2_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleEquate1569);
                            lv_multiplier_7_0=ruleSPINDOUBLE();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getEquateRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"multiplier",
                                    		lv_multiplier_7_0, 
                                    		"SPINDOUBLE");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:753:2: ( (lv_precision_8_0= RULE_INT ) )
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:754:1: (lv_precision_8_0= RULE_INT )
                            {
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:754:1: (lv_precision_8_0= RULE_INT )
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:755:3: lv_precision_8_0= RULE_INT
                            {
                            lv_precision_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEquate1586); 

                            			newLeafNode(lv_precision_8_0, grammarAccess.getEquateAccess().getPrecisionINTTerminalRuleCall_3_2_3_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEquateRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"precision",
                                    		lv_precision_8_0, 
                                    		"INT");
                            	    

                            }


                            }

                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:771:2: ( (lv_option_9_0= RULE_ID ) )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0==RULE_ID) ) {
                                int LA7_1 = input.LA(2);

                                if ( (LA7_1==EOF||LA7_1==RULE_ID||LA7_1==RULE_SC_COMMENT||(LA7_1>=17 && LA7_1<=20)||(LA7_1>=22 && LA7_1<=30)||(LA7_1>=32 && LA7_1<=58)) ) {
                                    alt7=1;
                                }
                            }
                            switch (alt7) {
                                case 1 :
                                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:772:1: (lv_option_9_0= RULE_ID )
                                    {
                                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:772:1: (lv_option_9_0= RULE_ID )
                                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:773:3: lv_option_9_0= RULE_ID
                                    {
                                    lv_option_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEquate1608); 

                                    			newLeafNode(lv_option_9_0, grammarAccess.getEquateAccess().getOptionIDTerminalRuleCall_3_2_4_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getEquateRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"option",
                                            		lv_option_9_0, 
                                            		"ID");
                                    	    

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


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
    // $ANTLR end "ruleEquate"


    // $ANTLR start "entryRuleMem"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:797:1: entryRuleMem returns [EObject current=null] : iv_ruleMem= ruleMem EOF ;
    public final EObject entryRuleMem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMem = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:798:2: (iv_ruleMem= ruleMem EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:799:2: iv_ruleMem= ruleMem EOF
            {
             newCompositeNode(grammarAccess.getMemRule()); 
            pushFollow(FOLLOW_ruleMem_in_entryRuleMem1654);
            iv_ruleMem=ruleMem();

            state._fsp--;

             current =iv_ruleMem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMem1664); 

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
    // $ANTLR end "entryRuleMem"


    // $ANTLR start "ruleMem"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:806:1: ruleMem returns [EObject current=null] : (otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) ) ) ;
    public final EObject ruleMem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_buffer_1_0=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:809:28: ( (otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:810:1: (otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:810:1: (otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:810:3: otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleMem1701); 

                	newLeafNode(otherlv_0, grammarAccess.getMemAccess().getMemKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:814:1: ( (lv_buffer_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:815:1: (lv_buffer_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:815:1: (lv_buffer_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:816:3: lv_buffer_1_0= RULE_ID
            {
            lv_buffer_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMem1718); 

            			newLeafNode(lv_buffer_1_0, grammarAccess.getMemAccess().getBufferIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"buffer",
                    		lv_buffer_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:832:2: ( (lv_length_2_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:833:1: (lv_length_2_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:833:1: (lv_length_2_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:834:3: lv_length_2_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getMemAccess().getLengthSPINREGISTERParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleMem1744);
            lv_length_2_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMemRule());
            	        }
                   		set(
                   			current, 
                   			"length",
                    		lv_length_2_0, 
                    		"SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleMem"


    // $ANTLR start "entryRuleOffset"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:858:1: entryRuleOffset returns [EObject current=null] : iv_ruleOffset= ruleOffset EOF ;
    public final EObject entryRuleOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOffset = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:859:2: (iv_ruleOffset= ruleOffset EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:860:2: iv_ruleOffset= ruleOffset EOF
            {
             newCompositeNode(grammarAccess.getOffsetRule()); 
            pushFollow(FOLLOW_ruleOffset_in_entryRuleOffset1780);
            iv_ruleOffset=ruleOffset();

            state._fsp--;

             current =iv_ruleOffset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOffset1790); 

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
    // $ANTLR end "entryRuleOffset"


    // $ANTLR start "ruleOffset"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:867:1: ruleOffset returns [EObject current=null] : (otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) ) ) ;
    public final EObject ruleOffset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_length_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:870:28: ( (otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:871:1: (otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:871:1: (otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:871:3: otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleOffset1827); 

                	newLeafNode(otherlv_0, grammarAccess.getOffsetAccess().getOffsetKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:875:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:876:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:876:1: (lv_name_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:877:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOffset1844); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOffsetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOffsetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:893:2: ( (lv_length_2_0= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:894:1: (lv_length_2_0= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:894:1: (lv_length_2_0= RULE_INT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:895:3: lv_length_2_0= RULE_INT
            {
            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleOffset1866); 

            			newLeafNode(lv_length_2_0, grammarAccess.getOffsetAccess().getLengthINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOffsetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"length",
                    		lv_length_2_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleOffset"


    // $ANTLR start "entryRuleBool"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:919:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:920:2: (iv_ruleBool= ruleBool EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:921:2: iv_ruleBool= ruleBool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_ruleBool_in_entryRuleBool1907);
            iv_ruleBool=ruleBool();

            state._fsp--;

             current =iv_ruleBool; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBool1917); 

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
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:928:1: ruleBool returns [EObject current=null] : (otherlv_0= 'bool' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleBOOLEAN ) ) ( ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) ) )? ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ename_1_0=null;
        Token lv_controlType_3_0=null;
        Token lv_controlName_4_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:931:28: ( (otherlv_0= 'bool' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleBOOLEAN ) ) ( ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) ) )? ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:932:1: (otherlv_0= 'bool' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleBOOLEAN ) ) ( ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) ) )? )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:932:1: (otherlv_0= 'bool' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleBOOLEAN ) ) ( ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) ) )? )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:932:3: otherlv_0= 'bool' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleBOOLEAN ) ) ( ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleBool1954); 

                	newLeafNode(otherlv_0, grammarAccess.getBoolAccess().getBoolKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:936:1: ( (lv_ename_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:937:1: (lv_ename_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:937:1: (lv_ename_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:938:3: lv_ename_1_0= RULE_ID
            {
            lv_ename_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBool1971); 

            			newLeafNode(lv_ename_1_0, grammarAccess.getBoolAccess().getEnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBoolRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ename",
                    		lv_ename_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:954:2: ( (lv_value_2_0= ruleBOOLEAN ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:955:1: (lv_value_2_0= ruleBOOLEAN )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:955:1: (lv_value_2_0= ruleBOOLEAN )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:956:3: lv_value_2_0= ruleBOOLEAN
            {
             
            	        newCompositeNode(grammarAccess.getBoolAccess().getValueBOOLEANParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBOOLEAN_in_ruleBool1997);
            lv_value_2_0=ruleBOOLEAN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBoolRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"BOOLEAN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:972:2: ( ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_ID) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:972:3: ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:972:3: ( (lv_controlType_3_0= RULE_ID ) )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:973:1: (lv_controlType_3_0= RULE_ID )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:973:1: (lv_controlType_3_0= RULE_ID )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:974:3: lv_controlType_3_0= RULE_ID
                    {
                    lv_controlType_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBool2015); 

                    			newLeafNode(lv_controlType_3_0, grammarAccess.getBoolAccess().getControlTypeIDTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBoolRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"controlType",
                            		lv_controlType_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:990:2: ( (lv_controlName_4_0= RULE_ID ) )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:991:1: (lv_controlName_4_0= RULE_ID )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:991:1: (lv_controlName_4_0= RULE_ID )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:992:3: lv_controlName_4_0= RULE_ID
                    {
                    lv_controlName_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBool2037); 

                    			newLeafNode(lv_controlName_4_0, grammarAccess.getBoolAccess().getControlNameIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBoolRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"controlName",
                            		lv_controlName_4_0, 
                            		"ID");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleComment"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1016:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1017:2: (iv_ruleComment= ruleComment EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1018:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment2080);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment2090); 

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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1025:1: ruleComment returns [EObject current=null] : ( (lv_remark_0_0= RULE_SC_COMMENT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_remark_0_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1028:28: ( ( (lv_remark_0_0= RULE_SC_COMMENT ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1029:1: ( (lv_remark_0_0= RULE_SC_COMMENT ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1029:1: ( (lv_remark_0_0= RULE_SC_COMMENT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1030:1: (lv_remark_0_0= RULE_SC_COMMENT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1030:1: (lv_remark_0_0= RULE_SC_COMMENT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1031:3: lv_remark_0_0= RULE_SC_COMMENT
            {
            lv_remark_0_0=(Token)match(input,RULE_SC_COMMENT,FOLLOW_RULE_SC_COMMENT_in_ruleComment2131); 

            			newLeafNode(lv_remark_0_0, grammarAccess.getCommentAccess().getRemarkSC_COMMENTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"remark",
                    		lv_remark_0_0, 
                    		"SC_COMMENT");
            	    

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleLabel"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1055:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1056:2: (iv_ruleLabel= ruleLabel EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1057:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel2171);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel2181); 

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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1064:1: ruleLabel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1067:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1068:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1068:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1068:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1068:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1069:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1069:1: (lv_name_0_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1070:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel2223); 

            			newLeafNode(lv_name_0_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleLabel2240); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getColonKeyword_1());
                

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleMacro"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1098:1: entryRuleMacro returns [EObject current=null] : iv_ruleMacro= ruleMacro EOF ;
    public final EObject entryRuleMacro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacro = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1099:2: (iv_ruleMacro= ruleMacro EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1100:2: iv_ruleMacro= ruleMacro EOF
            {
             newCompositeNode(grammarAccess.getMacroRule()); 
            pushFollow(FOLLOW_ruleMacro_in_entryRuleMacro2276);
            iv_ruleMacro=ruleMacro();

            state._fsp--;

             current =iv_ruleMacro; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMacro2286); 

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
    // $ANTLR end "entryRuleMacro"


    // $ANTLR start "ruleMacro"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1107:1: ruleMacro returns [EObject current=null] : (this_IsPinConnected_0= ruleIsPinConnected | this_IsTrue_1= ruleIsTrue | this_IsElse_2= ruleIsElse | this_IsEndif_3= ruleIsEndif | this_GetInputDefault_4= ruleGetInputDefault | this_GetDelayScaleControl_5= ruleGetDelayScaleControl | this_SetOutputPin_6= ruleSetOutputPin | this_GetBaseAddress_7= ruleGetBaseAddress ) ;
    public final EObject ruleMacro() throws RecognitionException {
        EObject current = null;

        EObject this_IsPinConnected_0 = null;

        EObject this_IsTrue_1 = null;

        EObject this_IsElse_2 = null;

        EObject this_IsEndif_3 = null;

        EObject this_GetInputDefault_4 = null;

        EObject this_GetDelayScaleControl_5 = null;

        EObject this_SetOutputPin_6 = null;

        EObject this_GetBaseAddress_7 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1110:28: ( (this_IsPinConnected_0= ruleIsPinConnected | this_IsTrue_1= ruleIsTrue | this_IsElse_2= ruleIsElse | this_IsEndif_3= ruleIsEndif | this_GetInputDefault_4= ruleGetInputDefault | this_GetDelayScaleControl_5= ruleGetDelayScaleControl | this_SetOutputPin_6= ruleSetOutputPin | this_GetBaseAddress_7= ruleGetBaseAddress ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1111:1: (this_IsPinConnected_0= ruleIsPinConnected | this_IsTrue_1= ruleIsTrue | this_IsElse_2= ruleIsElse | this_IsEndif_3= ruleIsEndif | this_GetInputDefault_4= ruleGetInputDefault | this_GetDelayScaleControl_5= ruleGetDelayScaleControl | this_SetOutputPin_6= ruleSetOutputPin | this_GetBaseAddress_7= ruleGetBaseAddress )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1111:1: (this_IsPinConnected_0= ruleIsPinConnected | this_IsTrue_1= ruleIsTrue | this_IsElse_2= ruleIsElse | this_IsEndif_3= ruleIsEndif | this_GetInputDefault_4= ruleGetInputDefault | this_GetDelayScaleControl_5= ruleGetDelayScaleControl | this_SetOutputPin_6= ruleSetOutputPin | this_GetBaseAddress_7= ruleGetBaseAddress )
            int alt11=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            case 25:
                {
                alt11=4;
                }
                break;
            case 26:
                {
                alt11=5;
                }
                break;
            case 27:
                {
                alt11=6;
                }
                break;
            case 29:
                {
                alt11=7;
                }
                break;
            case 28:
                {
                alt11=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1112:5: this_IsPinConnected_0= ruleIsPinConnected
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsPinConnectedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIsPinConnected_in_ruleMacro2333);
                    this_IsPinConnected_0=ruleIsPinConnected();

                    state._fsp--;

                     
                            current = this_IsPinConnected_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1122:5: this_IsTrue_1= ruleIsTrue
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsTrueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIsTrue_in_ruleMacro2360);
                    this_IsTrue_1=ruleIsTrue();

                    state._fsp--;

                     
                            current = this_IsTrue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1132:5: this_IsElse_2= ruleIsElse
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsElseParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIsElse_in_ruleMacro2387);
                    this_IsElse_2=ruleIsElse();

                    state._fsp--;

                     
                            current = this_IsElse_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1142:5: this_IsEndif_3= ruleIsEndif
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsEndifParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleIsEndif_in_ruleMacro2414);
                    this_IsEndif_3=ruleIsEndif();

                    state._fsp--;

                     
                            current = this_IsEndif_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1152:5: this_GetInputDefault_4= ruleGetInputDefault
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getGetInputDefaultParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleGetInputDefault_in_ruleMacro2441);
                    this_GetInputDefault_4=ruleGetInputDefault();

                    state._fsp--;

                     
                            current = this_GetInputDefault_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1162:5: this_GetDelayScaleControl_5= ruleGetDelayScaleControl
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getGetDelayScaleControlParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleGetDelayScaleControl_in_ruleMacro2468);
                    this_GetDelayScaleControl_5=ruleGetDelayScaleControl();

                    state._fsp--;

                     
                            current = this_GetDelayScaleControl_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1172:5: this_SetOutputPin_6= ruleSetOutputPin
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getSetOutputPinParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleSetOutputPin_in_ruleMacro2495);
                    this_SetOutputPin_6=ruleSetOutputPin();

                    state._fsp--;

                     
                            current = this_SetOutputPin_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1182:5: this_GetBaseAddress_7= ruleGetBaseAddress
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getGetBaseAddressParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleGetBaseAddress_in_ruleMacro2522);
                    this_GetBaseAddress_7=ruleGetBaseAddress();

                    state._fsp--;

                     
                            current = this_GetBaseAddress_7; 
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
    // $ANTLR end "ruleMacro"


    // $ANTLR start "entryRuleIsPinConnected"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1198:1: entryRuleIsPinConnected returns [EObject current=null] : iv_ruleIsPinConnected= ruleIsPinConnected EOF ;
    public final EObject entryRuleIsPinConnected() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsPinConnected = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1199:2: (iv_ruleIsPinConnected= ruleIsPinConnected EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1200:2: iv_ruleIsPinConnected= ruleIsPinConnected EOF
            {
             newCompositeNode(grammarAccess.getIsPinConnectedRule()); 
            pushFollow(FOLLOW_ruleIsPinConnected_in_entryRuleIsPinConnected2557);
            iv_ruleIsPinConnected=ruleIsPinConnected();

            state._fsp--;

             current =iv_ruleIsPinConnected; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsPinConnected2567); 

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
    // $ANTLR end "entryRuleIsPinConnected"


    // $ANTLR start "ruleIsPinConnected"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1207:1: ruleIsPinConnected returns [EObject current=null] : (otherlv_0= '@isPinConnected' ( (lv_arg1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIsPinConnected() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1210:28: ( (otherlv_0= '@isPinConnected' ( (lv_arg1_1_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1211:1: (otherlv_0= '@isPinConnected' ( (lv_arg1_1_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1211:1: (otherlv_0= '@isPinConnected' ( (lv_arg1_1_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1211:3: otherlv_0= '@isPinConnected' ( (lv_arg1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleIsPinConnected2604); 

                	newLeafNode(otherlv_0, grammarAccess.getIsPinConnectedAccess().getIsPinConnectedKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1215:1: ( (lv_arg1_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1216:1: (lv_arg1_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1216:1: (lv_arg1_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1217:3: lv_arg1_1_0= RULE_ID
            {
            lv_arg1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIsPinConnected2621); 

            			newLeafNode(lv_arg1_1_0, grammarAccess.getIsPinConnectedAccess().getArg1IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIsPinConnectedRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
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
    // $ANTLR end "ruleIsPinConnected"


    // $ANTLR start "entryRuleIsTrue"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1241:1: entryRuleIsTrue returns [EObject current=null] : iv_ruleIsTrue= ruleIsTrue EOF ;
    public final EObject entryRuleIsTrue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsTrue = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1242:2: (iv_ruleIsTrue= ruleIsTrue EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1243:2: iv_ruleIsTrue= ruleIsTrue EOF
            {
             newCompositeNode(grammarAccess.getIsTrueRule()); 
            pushFollow(FOLLOW_ruleIsTrue_in_entryRuleIsTrue2662);
            iv_ruleIsTrue=ruleIsTrue();

            state._fsp--;

             current =iv_ruleIsTrue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsTrue2672); 

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
    // $ANTLR end "entryRuleIsTrue"


    // $ANTLR start "ruleIsTrue"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1250:1: ruleIsTrue returns [EObject current=null] : (otherlv_0= '@isTrue' ( (lv_arg1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIsTrue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1253:28: ( (otherlv_0= '@isTrue' ( (lv_arg1_1_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1254:1: (otherlv_0= '@isTrue' ( (lv_arg1_1_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1254:1: (otherlv_0= '@isTrue' ( (lv_arg1_1_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1254:3: otherlv_0= '@isTrue' ( (lv_arg1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleIsTrue2709); 

                	newLeafNode(otherlv_0, grammarAccess.getIsTrueAccess().getIsTrueKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1258:1: ( (lv_arg1_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1259:1: (lv_arg1_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1259:1: (lv_arg1_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1260:3: lv_arg1_1_0= RULE_ID
            {
            lv_arg1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIsTrue2726); 

            			newLeafNode(lv_arg1_1_0, grammarAccess.getIsTrueAccess().getArg1IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIsTrueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
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
    // $ANTLR end "ruleIsTrue"


    // $ANTLR start "entryRuleIsElse"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1284:1: entryRuleIsElse returns [EObject current=null] : iv_ruleIsElse= ruleIsElse EOF ;
    public final EObject entryRuleIsElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsElse = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1285:2: (iv_ruleIsElse= ruleIsElse EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1286:2: iv_ruleIsElse= ruleIsElse EOF
            {
             newCompositeNode(grammarAccess.getIsElseRule()); 
            pushFollow(FOLLOW_ruleIsElse_in_entryRuleIsElse2767);
            iv_ruleIsElse=ruleIsElse();

            state._fsp--;

             current =iv_ruleIsElse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsElse2777); 

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
    // $ANTLR end "entryRuleIsElse"


    // $ANTLR start "ruleIsElse"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1293:1: ruleIsElse returns [EObject current=null] : ( () otherlv_1= '@else' ) ;
    public final EObject ruleIsElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1296:28: ( ( () otherlv_1= '@else' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1297:1: ( () otherlv_1= '@else' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1297:1: ( () otherlv_1= '@else' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1297:2: () otherlv_1= '@else'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1297:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1298:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIsElseAccess().getIsElseAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleIsElse2823); 

                	newLeafNode(otherlv_1, grammarAccess.getIsElseAccess().getElseKeyword_1());
                

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
    // $ANTLR end "ruleIsElse"


    // $ANTLR start "entryRuleIsEndif"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1315:1: entryRuleIsEndif returns [EObject current=null] : iv_ruleIsEndif= ruleIsEndif EOF ;
    public final EObject entryRuleIsEndif() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsEndif = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1316:2: (iv_ruleIsEndif= ruleIsEndif EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1317:2: iv_ruleIsEndif= ruleIsEndif EOF
            {
             newCompositeNode(grammarAccess.getIsEndifRule()); 
            pushFollow(FOLLOW_ruleIsEndif_in_entryRuleIsEndif2859);
            iv_ruleIsEndif=ruleIsEndif();

            state._fsp--;

             current =iv_ruleIsEndif; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsEndif2869); 

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
    // $ANTLR end "entryRuleIsEndif"


    // $ANTLR start "ruleIsEndif"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1324:1: ruleIsEndif returns [EObject current=null] : ( () otherlv_1= '@endif' ) ;
    public final EObject ruleIsEndif() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1327:28: ( ( () otherlv_1= '@endif' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1328:1: ( () otherlv_1= '@endif' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1328:1: ( () otherlv_1= '@endif' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1328:2: () otherlv_1= '@endif'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1328:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1329:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIsEndifAccess().getIsEndifAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleIsEndif2915); 

                	newLeafNode(otherlv_1, grammarAccess.getIsEndifAccess().getEndifKeyword_1());
                

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
    // $ANTLR end "ruleIsEndif"


    // $ANTLR start "entryRuleGetInputDefault"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1346:1: entryRuleGetInputDefault returns [EObject current=null] : iv_ruleGetInputDefault= ruleGetInputDefault EOF ;
    public final EObject entryRuleGetInputDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetInputDefault = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1347:2: (iv_ruleGetInputDefault= ruleGetInputDefault EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1348:2: iv_ruleGetInputDefault= ruleGetInputDefault EOF
            {
             newCompositeNode(grammarAccess.getGetInputDefaultRule()); 
            pushFollow(FOLLOW_ruleGetInputDefault_in_entryRuleGetInputDefault2951);
            iv_ruleGetInputDefault=ruleGetInputDefault();

            state._fsp--;

             current =iv_ruleGetInputDefault; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetInputDefault2961); 

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
    // $ANTLR end "entryRuleGetInputDefault"


    // $ANTLR start "ruleGetInputDefault"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1355:1: ruleGetInputDefault returns [EObject current=null] : (otherlv_0= '@getInputDefault' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleGetInputDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_variable_2_0=null;
        AntlrDatatypeRuleToken lv_scale_3_0 = null;

        AntlrDatatypeRuleToken lv_defaultVal_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1358:28: ( (otherlv_0= '@getInputDefault' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1359:1: (otherlv_0= '@getInputDefault' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1359:1: (otherlv_0= '@getInputDefault' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1359:3: otherlv_0= '@getInputDefault' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleGetInputDefault2998); 

                	newLeafNode(otherlv_0, grammarAccess.getGetInputDefaultAccess().getGetInputDefaultKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1363:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1364:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1364:1: (lv_name_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1365:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetInputDefault3015); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGetInputDefaultAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGetInputDefaultRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1381:2: ( (lv_variable_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1382:1: (lv_variable_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1382:1: (lv_variable_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1383:3: lv_variable_2_0= RULE_ID
            {
            lv_variable_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetInputDefault3037); 

            			newLeafNode(lv_variable_2_0, grammarAccess.getGetInputDefaultAccess().getVariableIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGetInputDefaultRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1399:2: ( (lv_scale_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1400:1: (lv_scale_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1400:1: (lv_scale_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1401:3: lv_scale_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getGetInputDefaultAccess().getScaleSPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleGetInputDefault3063);
            lv_scale_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGetInputDefaultRule());
            	        }
                   		set(
                   			current, 
                   			"scale",
                    		lv_scale_3_0, 
                    		"SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1417:2: ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1418:1: (lv_defaultVal_4_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1418:1: (lv_defaultVal_4_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1419:3: lv_defaultVal_4_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getGetInputDefaultAccess().getDefaultValSPINDOUBLEParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleGetInputDefault3084);
            lv_defaultVal_4_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGetInputDefaultRule());
            	        }
                   		set(
                   			current, 
                   			"defaultVal",
                    		lv_defaultVal_4_0, 
                    		"SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleGetInputDefault"


    // $ANTLR start "entryRuleGetDelayScaleControl"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1443:1: entryRuleGetDelayScaleControl returns [EObject current=null] : iv_ruleGetDelayScaleControl= ruleGetDelayScaleControl EOF ;
    public final EObject entryRuleGetDelayScaleControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetDelayScaleControl = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1444:2: (iv_ruleGetDelayScaleControl= ruleGetDelayScaleControl EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1445:2: iv_ruleGetDelayScaleControl= ruleGetDelayScaleControl EOF
            {
             newCompositeNode(grammarAccess.getGetDelayScaleControlRule()); 
            pushFollow(FOLLOW_ruleGetDelayScaleControl_in_entryRuleGetDelayScaleControl3120);
            iv_ruleGetDelayScaleControl=ruleGetDelayScaleControl();

            state._fsp--;

             current =iv_ruleGetDelayScaleControl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetDelayScaleControl3130); 

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
    // $ANTLR end "entryRuleGetDelayScaleControl"


    // $ANTLR start "ruleGetDelayScaleControl"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1452:1: ruleGetDelayScaleControl returns [EObject current=null] : (otherlv_0= '@getDelayScaleControl' ( (lv_ratio_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_offset_3_0= RULE_ID ) ) ( (lv_control_4_0= RULE_ID ) )? ) ;
    public final EObject ruleGetDelayScaleControl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ratio_1_0=null;
        Token lv_length_2_0=null;
        Token lv_offset_3_0=null;
        Token lv_control_4_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1455:28: ( (otherlv_0= '@getDelayScaleControl' ( (lv_ratio_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_offset_3_0= RULE_ID ) ) ( (lv_control_4_0= RULE_ID ) )? ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1456:1: (otherlv_0= '@getDelayScaleControl' ( (lv_ratio_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_offset_3_0= RULE_ID ) ) ( (lv_control_4_0= RULE_ID ) )? )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1456:1: (otherlv_0= '@getDelayScaleControl' ( (lv_ratio_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_offset_3_0= RULE_ID ) ) ( (lv_control_4_0= RULE_ID ) )? )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1456:3: otherlv_0= '@getDelayScaleControl' ( (lv_ratio_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_offset_3_0= RULE_ID ) ) ( (lv_control_4_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleGetDelayScaleControl3167); 

                	newLeafNode(otherlv_0, grammarAccess.getGetDelayScaleControlAccess().getGetDelayScaleControlKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1460:1: ( (lv_ratio_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1461:1: (lv_ratio_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1461:1: (lv_ratio_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1462:3: lv_ratio_1_0= RULE_ID
            {
            lv_ratio_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3184); 

            			newLeafNode(lv_ratio_1_0, grammarAccess.getGetDelayScaleControlAccess().getRatioIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGetDelayScaleControlRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ratio",
                    		lv_ratio_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1478:2: ( (lv_length_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1479:1: (lv_length_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1479:1: (lv_length_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1480:3: lv_length_2_0= RULE_ID
            {
            lv_length_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3206); 

            			newLeafNode(lv_length_2_0, grammarAccess.getGetDelayScaleControlAccess().getLengthIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGetDelayScaleControlRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"length",
                    		lv_length_2_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1496:2: ( (lv_offset_3_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1497:1: (lv_offset_3_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1497:1: (lv_offset_3_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1498:3: lv_offset_3_0= RULE_ID
            {
            lv_offset_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3228); 

            			newLeafNode(lv_offset_3_0, grammarAccess.getGetDelayScaleControlAccess().getOffsetIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGetDelayScaleControlRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"offset",
                    		lv_offset_3_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1514:2: ( (lv_control_4_0= RULE_ID ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||LA12_1==RULE_ID||LA12_1==RULE_SC_COMMENT||(LA12_1>=17 && LA12_1<=20)||(LA12_1>=22 && LA12_1<=30)||(LA12_1>=32 && LA12_1<=58)) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1515:1: (lv_control_4_0= RULE_ID )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1515:1: (lv_control_4_0= RULE_ID )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1516:3: lv_control_4_0= RULE_ID
                    {
                    lv_control_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3250); 

                    			newLeafNode(lv_control_4_0, grammarAccess.getGetDelayScaleControlAccess().getControlIDTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGetDelayScaleControlRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"control",
                            		lv_control_4_0, 
                            		"ID");
                    	    

                    }


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
    // $ANTLR end "ruleGetDelayScaleControl"


    // $ANTLR start "entryRuleGetBaseAddress"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1540:1: entryRuleGetBaseAddress returns [EObject current=null] : iv_ruleGetBaseAddress= ruleGetBaseAddress EOF ;
    public final EObject entryRuleGetBaseAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetBaseAddress = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1541:2: (iv_ruleGetBaseAddress= ruleGetBaseAddress EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1542:2: iv_ruleGetBaseAddress= ruleGetBaseAddress EOF
            {
             newCompositeNode(grammarAccess.getGetBaseAddressRule()); 
            pushFollow(FOLLOW_ruleGetBaseAddress_in_entryRuleGetBaseAddress3292);
            iv_ruleGetBaseAddress=ruleGetBaseAddress();

            state._fsp--;

             current =iv_ruleGetBaseAddress; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetBaseAddress3302); 

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
    // $ANTLR end "entryRuleGetBaseAddress"


    // $ANTLR start "ruleGetBaseAddress"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1549:1: ruleGetBaseAddress returns [EObject current=null] : ( () otherlv_1= '@getBaseAddress' ) ;
    public final EObject ruleGetBaseAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1552:28: ( ( () otherlv_1= '@getBaseAddress' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1553:1: ( () otherlv_1= '@getBaseAddress' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1553:1: ( () otherlv_1= '@getBaseAddress' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1553:2: () otherlv_1= '@getBaseAddress'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1553:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1554:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGetBaseAddressAccess().getGetBaseAddressAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleGetBaseAddress3348); 

                	newLeafNode(otherlv_1, grammarAccess.getGetBaseAddressAccess().getGetBaseAddressKeyword_1());
                

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
    // $ANTLR end "ruleGetBaseAddress"


    // $ANTLR start "entryRuleSetOutputPin"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1571:1: entryRuleSetOutputPin returns [EObject current=null] : iv_ruleSetOutputPin= ruleSetOutputPin EOF ;
    public final EObject entryRuleSetOutputPin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetOutputPin = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1572:2: (iv_ruleSetOutputPin= ruleSetOutputPin EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1573:2: iv_ruleSetOutputPin= ruleSetOutputPin EOF
            {
             newCompositeNode(grammarAccess.getSetOutputPinRule()); 
            pushFollow(FOLLOW_ruleSetOutputPin_in_entryRuleSetOutputPin3384);
            iv_ruleSetOutputPin=ruleSetOutputPin();

            state._fsp--;

             current =iv_ruleSetOutputPin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetOutputPin3394); 

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
    // $ANTLR end "entryRuleSetOutputPin"


    // $ANTLR start "ruleSetOutputPin"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1580:1: ruleSetOutputPin returns [EObject current=null] : (otherlv_0= '@setOutputPin' ( (lv_pinName_1_0= RULE_ID ) ) ( (lv_varName_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSetOutputPin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_pinName_1_0=null;
        Token lv_varName_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1583:28: ( (otherlv_0= '@setOutputPin' ( (lv_pinName_1_0= RULE_ID ) ) ( (lv_varName_2_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1584:1: (otherlv_0= '@setOutputPin' ( (lv_pinName_1_0= RULE_ID ) ) ( (lv_varName_2_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1584:1: (otherlv_0= '@setOutputPin' ( (lv_pinName_1_0= RULE_ID ) ) ( (lv_varName_2_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1584:3: otherlv_0= '@setOutputPin' ( (lv_pinName_1_0= RULE_ID ) ) ( (lv_varName_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleSetOutputPin3431); 

                	newLeafNode(otherlv_0, grammarAccess.getSetOutputPinAccess().getSetOutputPinKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1588:1: ( (lv_pinName_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1589:1: (lv_pinName_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1589:1: (lv_pinName_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1590:3: lv_pinName_1_0= RULE_ID
            {
            lv_pinName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetOutputPin3448); 

            			newLeafNode(lv_pinName_1_0, grammarAccess.getSetOutputPinAccess().getPinNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetOutputPinRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"pinName",
                    		lv_pinName_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1606:2: ( (lv_varName_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1607:1: (lv_varName_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1607:1: (lv_varName_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1608:3: lv_varName_2_0= RULE_ID
            {
            lv_varName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetOutputPin3470); 

            			newLeafNode(lv_varName_2_0, grammarAccess.getSetOutputPinAccess().getVarNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetOutputPinRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_2_0, 
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
    // $ANTLR end "ruleSetOutputPin"


    // $ANTLR start "entryRuleInstruction"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1632:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1633:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1634:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction3511);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction3521); 

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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1641:1: ruleInstruction returns [EObject current=null] : (this_Inst_B15_S1_9_0= ruleInst_B15_S1_9 | this_Inst_B6_S1_14_1= ruleInst_B6_S1_14 | this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10 | this_Inst_B6_3= ruleInst_B6 | this_Inst_B24_4= ruleInst_B24 | this_Skip_5= ruleSkip | this_Jam_6= ruleJam | this_Inst_X0_7= ruleInst_X0 | this_LoadSinLFO_8= ruleLoadSinLFO | this_LoadRampLFO_9= ruleLoadRampLFO | this_ChorusReadDelay_10= ruleChorusReadDelay | this_ChorusReadValue_11= ruleChorusReadValue | this_ChorusScaleOffset_12= ruleChorusScaleOffset | this_Log_13= ruleLog | this_ReadDelayPointer_14= ruleReadDelayPointer ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Inst_B15_S1_9_0 = null;

        EObject this_Inst_B6_S1_14_1 = null;

        EObject this_Inst_S1_14_S1_10_2 = null;

        EObject this_Inst_B6_3 = null;

        EObject this_Inst_B24_4 = null;

        EObject this_Skip_5 = null;

        EObject this_Jam_6 = null;

        EObject this_Inst_X0_7 = null;

        EObject this_LoadSinLFO_8 = null;

        EObject this_LoadRampLFO_9 = null;

        EObject this_ChorusReadDelay_10 = null;

        EObject this_ChorusReadValue_11 = null;

        EObject this_ChorusScaleOffset_12 = null;

        EObject this_Log_13 = null;

        EObject this_ReadDelayPointer_14 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1644:28: ( (this_Inst_B15_S1_9_0= ruleInst_B15_S1_9 | this_Inst_B6_S1_14_1= ruleInst_B6_S1_14 | this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10 | this_Inst_B6_3= ruleInst_B6 | this_Inst_B24_4= ruleInst_B24 | this_Skip_5= ruleSkip | this_Jam_6= ruleJam | this_Inst_X0_7= ruleInst_X0 | this_LoadSinLFO_8= ruleLoadSinLFO | this_LoadRampLFO_9= ruleLoadRampLFO | this_ChorusReadDelay_10= ruleChorusReadDelay | this_ChorusReadValue_11= ruleChorusReadValue | this_ChorusScaleOffset_12= ruleChorusScaleOffset | this_Log_13= ruleLog | this_ReadDelayPointer_14= ruleReadDelayPointer ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1645:1: (this_Inst_B15_S1_9_0= ruleInst_B15_S1_9 | this_Inst_B6_S1_14_1= ruleInst_B6_S1_14 | this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10 | this_Inst_B6_3= ruleInst_B6 | this_Inst_B24_4= ruleInst_B24 | this_Skip_5= ruleSkip | this_Jam_6= ruleJam | this_Inst_X0_7= ruleInst_X0 | this_LoadSinLFO_8= ruleLoadSinLFO | this_LoadRampLFO_9= ruleLoadRampLFO | this_ChorusReadDelay_10= ruleChorusReadDelay | this_ChorusReadValue_11= ruleChorusReadValue | this_ChorusScaleOffset_12= ruleChorusScaleOffset | this_Log_13= ruleLog | this_ReadDelayPointer_14= ruleReadDelayPointer )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1645:1: (this_Inst_B15_S1_9_0= ruleInst_B15_S1_9 | this_Inst_B6_S1_14_1= ruleInst_B6_S1_14 | this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10 | this_Inst_B6_3= ruleInst_B6 | this_Inst_B24_4= ruleInst_B24 | this_Skip_5= ruleSkip | this_Jam_6= ruleJam | this_Inst_X0_7= ruleInst_X0 | this_LoadSinLFO_8= ruleLoadSinLFO | this_LoadRampLFO_9= ruleLoadRampLFO | this_ChorusReadDelay_10= ruleChorusReadDelay | this_ChorusReadValue_11= ruleChorusReadValue | this_ChorusScaleOffset_12= ruleChorusScaleOffset | this_Log_13= ruleLog | this_ReadDelayPointer_14= ruleReadDelayPointer )
            int alt13=15;
            switch ( input.LA(1) ) {
            case 42:
            case 43:
            case 44:
                {
                alt13=1;
                }
                break;
            case 30:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
                {
                alt13=2;
                }
                break;
            case 39:
            case 41:
                {
                alt13=3;
                }
                break;
            case 37:
            case 38:
                {
                alt13=4;
                }
                break;
            case 51:
            case 52:
            case 53:
                {
                alt13=5;
                }
                break;
            case 58:
                {
                alt13=6;
                }
                break;
            case 54:
                {
                alt13=7;
                }
                break;
            case 55:
            case 56:
            case 57:
                {
                alt13=8;
                }
                break;
            case 45:
                {
                alt13=9;
                }
                break;
            case 46:
                {
                alt13=10;
                }
                break;
            case 47:
                {
                alt13=11;
                }
                break;
            case 48:
                {
                alt13=12;
                }
                break;
            case 49:
                {
                alt13=13;
                }
                break;
            case 40:
                {
                alt13=14;
                }
                break;
            case 50:
                {
                alt13=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1646:5: this_Inst_B15_S1_9_0= ruleInst_B15_S1_9
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_B15_S1_9ParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInst_B15_S1_9_in_ruleInstruction3568);
                    this_Inst_B15_S1_9_0=ruleInst_B15_S1_9();

                    state._fsp--;

                     
                            current = this_Inst_B15_S1_9_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1656:5: this_Inst_B6_S1_14_1= ruleInst_B6_S1_14
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_B6_S1_14ParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInst_B6_S1_14_in_ruleInstruction3595);
                    this_Inst_B6_S1_14_1=ruleInst_B6_S1_14();

                    state._fsp--;

                     
                            current = this_Inst_B6_S1_14_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1666:5: this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_S1_14_S1_10ParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInst_S1_14_S1_10_in_ruleInstruction3622);
                    this_Inst_S1_14_S1_10_2=ruleInst_S1_14_S1_10();

                    state._fsp--;

                     
                            current = this_Inst_S1_14_S1_10_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1676:5: this_Inst_B6_3= ruleInst_B6
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_B6ParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleInst_B6_in_ruleInstruction3649);
                    this_Inst_B6_3=ruleInst_B6();

                    state._fsp--;

                     
                            current = this_Inst_B6_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1686:5: this_Inst_B24_4= ruleInst_B24
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_B24ParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleInst_B24_in_ruleInstruction3676);
                    this_Inst_B24_4=ruleInst_B24();

                    state._fsp--;

                     
                            current = this_Inst_B24_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1696:5: this_Skip_5= ruleSkip
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getSkipParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSkip_in_ruleInstruction3703);
                    this_Skip_5=ruleSkip();

                    state._fsp--;

                     
                            current = this_Skip_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1706:5: this_Jam_6= ruleJam
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getJamParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleJam_in_ruleInstruction3730);
                    this_Jam_6=ruleJam();

                    state._fsp--;

                     
                            current = this_Jam_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1716:5: this_Inst_X0_7= ruleInst_X0
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_X0ParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleInst_X0_in_ruleInstruction3757);
                    this_Inst_X0_7=ruleInst_X0();

                    state._fsp--;

                     
                            current = this_Inst_X0_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1726:5: this_LoadSinLFO_8= ruleLoadSinLFO
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLoadSinLFOParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleLoadSinLFO_in_ruleInstruction3784);
                    this_LoadSinLFO_8=ruleLoadSinLFO();

                    state._fsp--;

                     
                            current = this_LoadSinLFO_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1736:5: this_LoadRampLFO_9= ruleLoadRampLFO
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLoadRampLFOParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleLoadRampLFO_in_ruleInstruction3811);
                    this_LoadRampLFO_9=ruleLoadRampLFO();

                    state._fsp--;

                     
                            current = this_LoadRampLFO_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1746:5: this_ChorusReadDelay_10= ruleChorusReadDelay
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getChorusReadDelayParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleChorusReadDelay_in_ruleInstruction3838);
                    this_ChorusReadDelay_10=ruleChorusReadDelay();

                    state._fsp--;

                     
                            current = this_ChorusReadDelay_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1756:5: this_ChorusReadValue_11= ruleChorusReadValue
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getChorusReadValueParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleChorusReadValue_in_ruleInstruction3865);
                    this_ChorusReadValue_11=ruleChorusReadValue();

                    state._fsp--;

                     
                            current = this_ChorusReadValue_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1766:5: this_ChorusScaleOffset_12= ruleChorusScaleOffset
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getChorusScaleOffsetParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleChorusScaleOffset_in_ruleInstruction3892);
                    this_ChorusScaleOffset_12=ruleChorusScaleOffset();

                    state._fsp--;

                     
                            current = this_ChorusScaleOffset_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1776:5: this_Log_13= ruleLog
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLogParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleLog_in_ruleInstruction3919);
                    this_Log_13=ruleLog();

                    state._fsp--;

                     
                            current = this_Log_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1786:5: this_ReadDelayPointer_14= ruleReadDelayPointer
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getReadDelayPointerParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleReadDelayPointer_in_ruleInstruction3946);
                    this_ReadDelayPointer_14=ruleReadDelayPointer();

                    state._fsp--;

                     
                            current = this_ReadDelayPointer_14; 
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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleInst_B6_S1_14"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1802:1: entryRuleInst_B6_S1_14 returns [EObject current=null] : iv_ruleInst_B6_S1_14= ruleInst_B6_S1_14 EOF ;
    public final EObject entryRuleInst_B6_S1_14() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_B6_S1_14 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1803:2: (iv_ruleInst_B6_S1_14= ruleInst_B6_S1_14 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1804:2: iv_ruleInst_B6_S1_14= ruleInst_B6_S1_14 EOF
            {
             newCompositeNode(grammarAccess.getInst_B6_S1_14Rule()); 
            pushFollow(FOLLOW_ruleInst_B6_S1_14_in_entryRuleInst_B6_S1_143981);
            iv_ruleInst_B6_S1_14=ruleInst_B6_S1_14();

            state._fsp--;

             current =iv_ruleInst_B6_S1_14; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_B6_S1_143991); 

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
    // $ANTLR end "entryRuleInst_B6_S1_14"


    // $ANTLR start "ruleInst_B6_S1_14"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1811:1: ruleInst_B6_S1_14 returns [EObject current=null] : (this_ReadRegister_0= ruleReadRegister | this_WriteRegister_1= ruleWriteRegister | this_ReadRegisterFilter_2= ruleReadRegisterFilter | this_Maxx_3= ruleMaxx | this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf | this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf ) ;
    public final EObject ruleInst_B6_S1_14() throws RecognitionException {
        EObject current = null;

        EObject this_ReadRegister_0 = null;

        EObject this_WriteRegister_1 = null;

        EObject this_ReadRegisterFilter_2 = null;

        EObject this_Maxx_3 = null;

        EObject this_WriteRegisterHighshelf_4 = null;

        EObject this_WriteRegisterLowshelf_5 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1814:28: ( (this_ReadRegister_0= ruleReadRegister | this_WriteRegister_1= ruleWriteRegister | this_ReadRegisterFilter_2= ruleReadRegisterFilter | this_Maxx_3= ruleMaxx | this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf | this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1815:1: (this_ReadRegister_0= ruleReadRegister | this_WriteRegister_1= ruleWriteRegister | this_ReadRegisterFilter_2= ruleReadRegisterFilter | this_Maxx_3= ruleMaxx | this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf | this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1815:1: (this_ReadRegister_0= ruleReadRegister | this_WriteRegister_1= ruleWriteRegister | this_ReadRegisterFilter_2= ruleReadRegisterFilter | this_Maxx_3= ruleMaxx | this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf | this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt14=1;
                }
                break;
            case 34:
                {
                alt14=2;
                }
                break;
            case 36:
                {
                alt14=3;
                }
                break;
            case 35:
                {
                alt14=4;
                }
                break;
            case 33:
                {
                alt14=5;
                }
                break;
            case 32:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1816:5: this_ReadRegister_0= ruleReadRegister
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getReadRegisterParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleReadRegister_in_ruleInst_B6_S1_144038);
                    this_ReadRegister_0=ruleReadRegister();

                    state._fsp--;

                     
                            current = this_ReadRegister_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1826:5: this_WriteRegister_1= ruleWriteRegister
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getWriteRegisterParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWriteRegister_in_ruleInst_B6_S1_144065);
                    this_WriteRegister_1=ruleWriteRegister();

                    state._fsp--;

                     
                            current = this_WriteRegister_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1836:5: this_ReadRegisterFilter_2= ruleReadRegisterFilter
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getReadRegisterFilterParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleReadRegisterFilter_in_ruleInst_B6_S1_144092);
                    this_ReadRegisterFilter_2=ruleReadRegisterFilter();

                    state._fsp--;

                     
                            current = this_ReadRegisterFilter_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1846:5: this_Maxx_3= ruleMaxx
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getMaxxParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleMaxx_in_ruleInst_B6_S1_144119);
                    this_Maxx_3=ruleMaxx();

                    state._fsp--;

                     
                            current = this_Maxx_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1856:5: this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getWriteRegisterHighshelfParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleWriteRegisterHighshelf_in_ruleInst_B6_S1_144146);
                    this_WriteRegisterHighshelf_4=ruleWriteRegisterHighshelf();

                    state._fsp--;

                     
                            current = this_WriteRegisterHighshelf_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1866:5: this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getWriteRegisterLowshelfParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleWriteRegisterLowshelf_in_ruleInst_B6_S1_144173);
                    this_WriteRegisterLowshelf_5=ruleWriteRegisterLowshelf();

                    state._fsp--;

                     
                            current = this_WriteRegisterLowshelf_5; 
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
    // $ANTLR end "ruleInst_B6_S1_14"


    // $ANTLR start "entryRuleInst_B15_S1_9"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1882:1: entryRuleInst_B15_S1_9 returns [EObject current=null] : iv_ruleInst_B15_S1_9= ruleInst_B15_S1_9 EOF ;
    public final EObject entryRuleInst_B15_S1_9() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_B15_S1_9 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1883:2: (iv_ruleInst_B15_S1_9= ruleInst_B15_S1_9 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1884:2: iv_ruleInst_B15_S1_9= ruleInst_B15_S1_9 EOF
            {
             newCompositeNode(grammarAccess.getInst_B15_S1_9Rule()); 
            pushFollow(FOLLOW_ruleInst_B15_S1_9_in_entryRuleInst_B15_S1_94208);
            iv_ruleInst_B15_S1_9=ruleInst_B15_S1_9();

            state._fsp--;

             current =iv_ruleInst_B15_S1_9; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_B15_S1_94218); 

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
    // $ANTLR end "entryRuleInst_B15_S1_9"


    // $ANTLR start "ruleInst_B15_S1_9"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1891:1: ruleInst_B15_S1_9 returns [EObject current=null] : (this_ReadDelay_0= ruleReadDelay | this_WriteDelay_1= ruleWriteDelay | this_WriteAllpass_2= ruleWriteAllpass ) ;
    public final EObject ruleInst_B15_S1_9() throws RecognitionException {
        EObject current = null;

        EObject this_ReadDelay_0 = null;

        EObject this_WriteDelay_1 = null;

        EObject this_WriteAllpass_2 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1894:28: ( (this_ReadDelay_0= ruleReadDelay | this_WriteDelay_1= ruleWriteDelay | this_WriteAllpass_2= ruleWriteAllpass ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1895:1: (this_ReadDelay_0= ruleReadDelay | this_WriteDelay_1= ruleWriteDelay | this_WriteAllpass_2= ruleWriteAllpass )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1895:1: (this_ReadDelay_0= ruleReadDelay | this_WriteDelay_1= ruleWriteDelay | this_WriteAllpass_2= ruleWriteAllpass )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt15=1;
                }
                break;
            case 42:
                {
                alt15=2;
                }
                break;
            case 43:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1896:5: this_ReadDelay_0= ruleReadDelay
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B15_S1_9Access().getReadDelayParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleReadDelay_in_ruleInst_B15_S1_94265);
                    this_ReadDelay_0=ruleReadDelay();

                    state._fsp--;

                     
                            current = this_ReadDelay_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1906:5: this_WriteDelay_1= ruleWriteDelay
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B15_S1_9Access().getWriteDelayParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWriteDelay_in_ruleInst_B15_S1_94292);
                    this_WriteDelay_1=ruleWriteDelay();

                    state._fsp--;

                     
                            current = this_WriteDelay_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1916:5: this_WriteAllpass_2= ruleWriteAllpass
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B15_S1_9Access().getWriteAllpassParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleWriteAllpass_in_ruleInst_B15_S1_94319);
                    this_WriteAllpass_2=ruleWriteAllpass();

                    state._fsp--;

                     
                            current = this_WriteAllpass_2; 
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
    // $ANTLR end "ruleInst_B15_S1_9"


    // $ANTLR start "entryRuleInst_B6"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1932:1: entryRuleInst_B6 returns [EObject current=null] : iv_ruleInst_B6= ruleInst_B6 EOF ;
    public final EObject entryRuleInst_B6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_B6 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1933:2: (iv_ruleInst_B6= ruleInst_B6 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1934:2: iv_ruleInst_B6= ruleInst_B6 EOF
            {
             newCompositeNode(grammarAccess.getInst_B6Rule()); 
            pushFollow(FOLLOW_ruleInst_B6_in_entryRuleInst_B64354);
            iv_ruleInst_B6=ruleInst_B6();

            state._fsp--;

             current =iv_ruleInst_B6; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_B64364); 

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
    // $ANTLR end "entryRuleInst_B6"


    // $ANTLR start "ruleInst_B6"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1941:1: ruleInst_B6 returns [EObject current=null] : (this_Mulx_0= ruleMulx | this_Ldax_1= ruleLdax ) ;
    public final EObject ruleInst_B6() throws RecognitionException {
        EObject current = null;

        EObject this_Mulx_0 = null;

        EObject this_Ldax_1 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1944:28: ( (this_Mulx_0= ruleMulx | this_Ldax_1= ruleLdax ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1945:1: (this_Mulx_0= ruleMulx | this_Ldax_1= ruleLdax )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1945:1: (this_Mulx_0= ruleMulx | this_Ldax_1= ruleLdax )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            else if ( (LA16_0==38) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1946:5: this_Mulx_0= ruleMulx
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6Access().getMulxParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMulx_in_ruleInst_B64411);
                    this_Mulx_0=ruleMulx();

                    state._fsp--;

                     
                            current = this_Mulx_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1956:5: this_Ldax_1= ruleLdax
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6Access().getLdaxParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLdax_in_ruleInst_B64438);
                    this_Ldax_1=ruleLdax();

                    state._fsp--;

                     
                            current = this_Ldax_1; 
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
    // $ANTLR end "ruleInst_B6"


    // $ANTLR start "entryRuleInst_B24"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1972:1: entryRuleInst_B24 returns [EObject current=null] : iv_ruleInst_B24= ruleInst_B24 EOF ;
    public final EObject entryRuleInst_B24() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_B24 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1973:2: (iv_ruleInst_B24= ruleInst_B24 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1974:2: iv_ruleInst_B24= ruleInst_B24 EOF
            {
             newCompositeNode(grammarAccess.getInst_B24Rule()); 
            pushFollow(FOLLOW_ruleInst_B24_in_entryRuleInst_B244473);
            iv_ruleInst_B24=ruleInst_B24();

            state._fsp--;

             current =iv_ruleInst_B24; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_B244483); 

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
    // $ANTLR end "entryRuleInst_B24"


    // $ANTLR start "ruleInst_B24"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1981:1: ruleInst_B24 returns [EObject current=null] : (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor ) ;
    public final EObject ruleInst_B24() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        EObject this_Or_1 = null;

        EObject this_Xor_2 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1984:28: ( (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1985:1: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1985:1: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt17=1;
                }
                break;
            case 52:
                {
                alt17=2;
                }
                break;
            case 53:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1986:5: this_And_0= ruleAnd
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B24Access().getAndParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAnd_in_ruleInst_B244530);
                    this_And_0=ruleAnd();

                    state._fsp--;

                     
                            current = this_And_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1996:5: this_Or_1= ruleOr
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B24Access().getOrParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOr_in_ruleInst_B244557);
                    this_Or_1=ruleOr();

                    state._fsp--;

                     
                            current = this_Or_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2006:5: this_Xor_2= ruleXor
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B24Access().getXorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleXor_in_ruleInst_B244584);
                    this_Xor_2=ruleXor();

                    state._fsp--;

                     
                            current = this_Xor_2; 
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
    // $ANTLR end "ruleInst_B24"


    // $ANTLR start "entryRuleInst_X0"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2022:1: entryRuleInst_X0 returns [EObject current=null] : iv_ruleInst_X0= ruleInst_X0 EOF ;
    public final EObject entryRuleInst_X0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_X0 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2023:2: (iv_ruleInst_X0= ruleInst_X0 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2024:2: iv_ruleInst_X0= ruleInst_X0 EOF
            {
             newCompositeNode(grammarAccess.getInst_X0Rule()); 
            pushFollow(FOLLOW_ruleInst_X0_in_entryRuleInst_X04619);
            iv_ruleInst_X0=ruleInst_X0();

            state._fsp--;

             current =iv_ruleInst_X0; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_X04629); 

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
    // $ANTLR end "entryRuleInst_X0"


    // $ANTLR start "ruleInst_X0"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2031:1: ruleInst_X0 returns [EObject current=null] : (this_Clr_0= ruleClr | this_Not_1= ruleNot | this_Absa_2= ruleAbsa ) ;
    public final EObject ruleInst_X0() throws RecognitionException {
        EObject current = null;

        EObject this_Clr_0 = null;

        EObject this_Not_1 = null;

        EObject this_Absa_2 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2034:28: ( (this_Clr_0= ruleClr | this_Not_1= ruleNot | this_Absa_2= ruleAbsa ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2035:1: (this_Clr_0= ruleClr | this_Not_1= ruleNot | this_Absa_2= ruleAbsa )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2035:1: (this_Clr_0= ruleClr | this_Not_1= ruleNot | this_Absa_2= ruleAbsa )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt18=1;
                }
                break;
            case 56:
                {
                alt18=2;
                }
                break;
            case 57:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2036:5: this_Clr_0= ruleClr
                    {
                     
                            newCompositeNode(grammarAccess.getInst_X0Access().getClrParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClr_in_ruleInst_X04676);
                    this_Clr_0=ruleClr();

                    state._fsp--;

                     
                            current = this_Clr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2046:5: this_Not_1= ruleNot
                    {
                     
                            newCompositeNode(grammarAccess.getInst_X0Access().getNotParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNot_in_ruleInst_X04703);
                    this_Not_1=ruleNot();

                    state._fsp--;

                     
                            current = this_Not_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2056:5: this_Absa_2= ruleAbsa
                    {
                     
                            newCompositeNode(grammarAccess.getInst_X0Access().getAbsaParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAbsa_in_ruleInst_X04730);
                    this_Absa_2=ruleAbsa();

                    state._fsp--;

                     
                            current = this_Absa_2; 
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
    // $ANTLR end "ruleInst_X0"


    // $ANTLR start "entryRuleInst_S1_14_S1_10"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2072:1: entryRuleInst_S1_14_S1_10 returns [EObject current=null] : iv_ruleInst_S1_14_S1_10= ruleInst_S1_14_S1_10 EOF ;
    public final EObject entryRuleInst_S1_14_S1_10() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_S1_14_S1_10 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2073:2: (iv_ruleInst_S1_14_S1_10= ruleInst_S1_14_S1_10 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2074:2: iv_ruleInst_S1_14_S1_10= ruleInst_S1_14_S1_10 EOF
            {
             newCompositeNode(grammarAccess.getInst_S1_14_S1_10Rule()); 
            pushFollow(FOLLOW_ruleInst_S1_14_S1_10_in_entryRuleInst_S1_14_S1_104765);
            iv_ruleInst_S1_14_S1_10=ruleInst_S1_14_S1_10();

            state._fsp--;

             current =iv_ruleInst_S1_14_S1_10; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_S1_14_S1_104775); 

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
    // $ANTLR end "entryRuleInst_S1_14_S1_10"


    // $ANTLR start "ruleInst_S1_14_S1_10"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2081:1: ruleInst_S1_14_S1_10 returns [EObject current=null] : (this_Exp_0= ruleExp | this_ScaleOffset_1= ruleScaleOffset ) ;
    public final EObject ruleInst_S1_14_S1_10() throws RecognitionException {
        EObject current = null;

        EObject this_Exp_0 = null;

        EObject this_ScaleOffset_1 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2084:28: ( (this_Exp_0= ruleExp | this_ScaleOffset_1= ruleScaleOffset ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2085:1: (this_Exp_0= ruleExp | this_ScaleOffset_1= ruleScaleOffset )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2085:1: (this_Exp_0= ruleExp | this_ScaleOffset_1= ruleScaleOffset )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            else if ( (LA19_0==41) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2086:5: this_Exp_0= ruleExp
                    {
                     
                            newCompositeNode(grammarAccess.getInst_S1_14_S1_10Access().getExpParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExp_in_ruleInst_S1_14_S1_104822);
                    this_Exp_0=ruleExp();

                    state._fsp--;

                     
                            current = this_Exp_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2096:5: this_ScaleOffset_1= ruleScaleOffset
                    {
                     
                            newCompositeNode(grammarAccess.getInst_S1_14_S1_10Access().getScaleOffsetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleScaleOffset_in_ruleInst_S1_14_S1_104849);
                    this_ScaleOffset_1=ruleScaleOffset();

                    state._fsp--;

                     
                            current = this_ScaleOffset_1; 
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
    // $ANTLR end "ruleInst_S1_14_S1_10"


    // $ANTLR start "entryRuleReadRegister"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2112:1: entryRuleReadRegister returns [EObject current=null] : iv_ruleReadRegister= ruleReadRegister EOF ;
    public final EObject entryRuleReadRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadRegister = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2113:2: (iv_ruleReadRegister= ruleReadRegister EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2114:2: iv_ruleReadRegister= ruleReadRegister EOF
            {
             newCompositeNode(grammarAccess.getReadRegisterRule()); 
            pushFollow(FOLLOW_ruleReadRegister_in_entryRuleReadRegister4884);
            iv_ruleReadRegister=ruleReadRegister();

            state._fsp--;

             current =iv_ruleReadRegister; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadRegister4894); 

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
    // $ANTLR end "entryRuleReadRegister"


    // $ANTLR start "ruleReadRegister"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2121:1: ruleReadRegister returns [EObject current=null] : (otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleReadRegister() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2124:28: ( (otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2125:1: (otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2125:1: (otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2125:3: otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleReadRegister4931); 

                	newLeafNode(otherlv_0, grammarAccess.getReadRegisterAccess().getRdaxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2129:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2130:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2130:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2131:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getReadRegisterAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleReadRegister4952);
            lv_arg1_1_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReadRegisterRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleReadRegister4964); 

                	newLeafNode(otherlv_2, grammarAccess.getReadRegisterAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2151:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2152:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2152:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2153:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getReadRegisterAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleReadRegister4985);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReadRegisterRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleReadRegister"


    // $ANTLR start "entryRuleWriteRegisterLowshelf"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2177:1: entryRuleWriteRegisterLowshelf returns [EObject current=null] : iv_ruleWriteRegisterLowshelf= ruleWriteRegisterLowshelf EOF ;
    public final EObject entryRuleWriteRegisterLowshelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteRegisterLowshelf = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2178:2: (iv_ruleWriteRegisterLowshelf= ruleWriteRegisterLowshelf EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2179:2: iv_ruleWriteRegisterLowshelf= ruleWriteRegisterLowshelf EOF
            {
             newCompositeNode(grammarAccess.getWriteRegisterLowshelfRule()); 
            pushFollow(FOLLOW_ruleWriteRegisterLowshelf_in_entryRuleWriteRegisterLowshelf5021);
            iv_ruleWriteRegisterLowshelf=ruleWriteRegisterLowshelf();

            state._fsp--;

             current =iv_ruleWriteRegisterLowshelf; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWriteRegisterLowshelf5031); 

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
    // $ANTLR end "entryRuleWriteRegisterLowshelf"


    // $ANTLR start "ruleWriteRegisterLowshelf"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2186:1: ruleWriteRegisterLowshelf returns [EObject current=null] : (otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteRegisterLowshelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2189:28: ( (otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2190:1: (otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2190:1: (otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2190:3: otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleWriteRegisterLowshelf5068); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteRegisterLowshelfAccess().getWrlxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2194:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2195:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2195:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2196:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterLowshelfAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleWriteRegisterLowshelf5089);
            lv_arg1_1_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteRegisterLowshelfRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleWriteRegisterLowshelf5101); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteRegisterLowshelfAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2216:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2217:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2217:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2218:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterLowshelfAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegisterLowshelf5122);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteRegisterLowshelfRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleWriteRegisterLowshelf"


    // $ANTLR start "entryRuleWriteRegisterHighshelf"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2242:1: entryRuleWriteRegisterHighshelf returns [EObject current=null] : iv_ruleWriteRegisterHighshelf= ruleWriteRegisterHighshelf EOF ;
    public final EObject entryRuleWriteRegisterHighshelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteRegisterHighshelf = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2243:2: (iv_ruleWriteRegisterHighshelf= ruleWriteRegisterHighshelf EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2244:2: iv_ruleWriteRegisterHighshelf= ruleWriteRegisterHighshelf EOF
            {
             newCompositeNode(grammarAccess.getWriteRegisterHighshelfRule()); 
            pushFollow(FOLLOW_ruleWriteRegisterHighshelf_in_entryRuleWriteRegisterHighshelf5158);
            iv_ruleWriteRegisterHighshelf=ruleWriteRegisterHighshelf();

            state._fsp--;

             current =iv_ruleWriteRegisterHighshelf; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWriteRegisterHighshelf5168); 

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
    // $ANTLR end "entryRuleWriteRegisterHighshelf"


    // $ANTLR start "ruleWriteRegisterHighshelf"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2251:1: ruleWriteRegisterHighshelf returns [EObject current=null] : (otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteRegisterHighshelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2254:28: ( (otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2255:1: (otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2255:1: (otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2255:3: otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleWriteRegisterHighshelf5205); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteRegisterHighshelfAccess().getWrhxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2259:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2260:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2260:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2261:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterHighshelfAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleWriteRegisterHighshelf5226);
            lv_arg1_1_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteRegisterHighshelfRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleWriteRegisterHighshelf5238); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteRegisterHighshelfAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2281:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2282:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2282:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2283:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterHighshelfAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegisterHighshelf5259);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteRegisterHighshelfRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleWriteRegisterHighshelf"


    // $ANTLR start "entryRuleWriteRegister"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2307:1: entryRuleWriteRegister returns [EObject current=null] : iv_ruleWriteRegister= ruleWriteRegister EOF ;
    public final EObject entryRuleWriteRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteRegister = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2308:2: (iv_ruleWriteRegister= ruleWriteRegister EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2309:2: iv_ruleWriteRegister= ruleWriteRegister EOF
            {
             newCompositeNode(grammarAccess.getWriteRegisterRule()); 
            pushFollow(FOLLOW_ruleWriteRegister_in_entryRuleWriteRegister5295);
            iv_ruleWriteRegister=ruleWriteRegister();

            state._fsp--;

             current =iv_ruleWriteRegister; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWriteRegister5305); 

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
    // $ANTLR end "entryRuleWriteRegister"


    // $ANTLR start "ruleWriteRegister"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2316:1: ruleWriteRegister returns [EObject current=null] : (otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteRegister() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2319:28: ( (otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2320:1: (otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2320:1: (otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2320:3: otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleWriteRegister5342); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteRegisterAccess().getWraxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2324:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2325:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2325:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2326:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleWriteRegister5363);
            lv_arg1_1_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteRegisterRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleWriteRegister5375); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteRegisterAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2346:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2347:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2347:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2348:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegister5396);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteRegisterRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleWriteRegister"


    // $ANTLR start "entryRuleMaxx"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2372:1: entryRuleMaxx returns [EObject current=null] : iv_ruleMaxx= ruleMaxx EOF ;
    public final EObject entryRuleMaxx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxx = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2373:2: (iv_ruleMaxx= ruleMaxx EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2374:2: iv_ruleMaxx= ruleMaxx EOF
            {
             newCompositeNode(grammarAccess.getMaxxRule()); 
            pushFollow(FOLLOW_ruleMaxx_in_entryRuleMaxx5432);
            iv_ruleMaxx=ruleMaxx();

            state._fsp--;

             current =iv_ruleMaxx; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxx5442); 

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
    // $ANTLR end "entryRuleMaxx"


    // $ANTLR start "ruleMaxx"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2381:1: ruleMaxx returns [EObject current=null] : (otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleMaxx() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2384:28: ( (otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2385:1: (otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2385:1: (otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2385:3: otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleMaxx5479); 

                	newLeafNode(otherlv_0, grammarAccess.getMaxxAccess().getMaxxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2389:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2390:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2390:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2391:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getMaxxAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleMaxx5500);
            lv_arg1_1_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMaxxRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleMaxx5512); 

                	newLeafNode(otherlv_2, grammarAccess.getMaxxAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2411:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2412:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2412:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2413:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getMaxxAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleMaxx5533);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMaxxRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleMaxx"


    // $ANTLR start "entryRuleReadRegisterFilter"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2437:1: entryRuleReadRegisterFilter returns [EObject current=null] : iv_ruleReadRegisterFilter= ruleReadRegisterFilter EOF ;
    public final EObject entryRuleReadRegisterFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadRegisterFilter = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2438:2: (iv_ruleReadRegisterFilter= ruleReadRegisterFilter EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2439:2: iv_ruleReadRegisterFilter= ruleReadRegisterFilter EOF
            {
             newCompositeNode(grammarAccess.getReadRegisterFilterRule()); 
            pushFollow(FOLLOW_ruleReadRegisterFilter_in_entryRuleReadRegisterFilter5569);
            iv_ruleReadRegisterFilter=ruleReadRegisterFilter();

            state._fsp--;

             current =iv_ruleReadRegisterFilter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadRegisterFilter5579); 

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
    // $ANTLR end "entryRuleReadRegisterFilter"


    // $ANTLR start "ruleReadRegisterFilter"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2446:1: ruleReadRegisterFilter returns [EObject current=null] : (otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleReadRegisterFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2449:28: ( (otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2450:1: (otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2450:1: (otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2450:3: otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleReadRegisterFilter5616); 

                	newLeafNode(otherlv_0, grammarAccess.getReadRegisterFilterAccess().getRdfxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2454:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2455:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2455:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2456:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getReadRegisterFilterAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleReadRegisterFilter5637);
            lv_arg1_1_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReadRegisterFilterRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleReadRegisterFilter5649); 

                	newLeafNode(otherlv_2, grammarAccess.getReadRegisterFilterAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2476:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2477:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2477:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2478:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getReadRegisterFilterAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleReadRegisterFilter5670);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReadRegisterFilterRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleReadRegisterFilter"


    // $ANTLR start "entryRuleMulx"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2502:1: entryRuleMulx returns [EObject current=null] : iv_ruleMulx= ruleMulx EOF ;
    public final EObject entryRuleMulx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulx = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2503:2: (iv_ruleMulx= ruleMulx EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2504:2: iv_ruleMulx= ruleMulx EOF
            {
             newCompositeNode(grammarAccess.getMulxRule()); 
            pushFollow(FOLLOW_ruleMulx_in_entryRuleMulx5706);
            iv_ruleMulx=ruleMulx();

            state._fsp--;

             current =iv_ruleMulx; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulx5716); 

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
    // $ANTLR end "entryRuleMulx"


    // $ANTLR start "ruleMulx"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2511:1: ruleMulx returns [EObject current=null] : (otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMulx() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2514:28: ( (otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2515:1: (otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2515:1: (otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2515:3: otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleMulx5753); 

                	newLeafNode(otherlv_0, grammarAccess.getMulxAccess().getMulxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2519:1: ( (lv_arg1_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2520:1: (lv_arg1_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2520:1: (lv_arg1_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2521:3: lv_arg1_1_0= RULE_ID
            {
            lv_arg1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMulx5770); 

            			newLeafNode(lv_arg1_1_0, grammarAccess.getMulxAccess().getArg1IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMulxRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
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
    // $ANTLR end "ruleMulx"


    // $ANTLR start "entryRuleLdax"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2545:1: entryRuleLdax returns [EObject current=null] : iv_ruleLdax= ruleLdax EOF ;
    public final EObject entryRuleLdax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdax = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2546:2: (iv_ruleLdax= ruleLdax EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2547:2: iv_ruleLdax= ruleLdax EOF
            {
             newCompositeNode(grammarAccess.getLdaxRule()); 
            pushFollow(FOLLOW_ruleLdax_in_entryRuleLdax5811);
            iv_ruleLdax=ruleLdax();

            state._fsp--;

             current =iv_ruleLdax; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLdax5821); 

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
    // $ANTLR end "entryRuleLdax"


    // $ANTLR start "ruleLdax"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2554:1: ruleLdax returns [EObject current=null] : (otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLdax() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2557:28: ( (otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2558:1: (otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2558:1: (otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2558:3: otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleLdax5858); 

                	newLeafNode(otherlv_0, grammarAccess.getLdaxAccess().getLdaxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2562:1: ( (lv_arg1_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2563:1: (lv_arg1_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2563:1: (lv_arg1_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2564:3: lv_arg1_1_0= RULE_ID
            {
            lv_arg1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLdax5875); 

            			newLeafNode(lv_arg1_1_0, grammarAccess.getLdaxAccess().getArg1IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLdaxRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
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
    // $ANTLR end "ruleLdax"


    // $ANTLR start "entryRuleExp"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2588:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2589:2: (iv_ruleExp= ruleExp EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2590:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_ruleExp_in_entryRuleExp5916);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExp5926); 

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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2597:1: ruleExp returns [EObject current=null] : (otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2600:28: ( (otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2601:1: (otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2601:1: (otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2601:3: otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleExp5963); 

                	newLeafNode(otherlv_0, grammarAccess.getExpAccess().getExpKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2605:1: ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2606:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2606:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2607:3: lv_arg1_1_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getExpAccess().getArg1SPINDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleExp5984);
            lv_arg1_1_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleExp5996); 

                	newLeafNode(otherlv_2, grammarAccess.getExpAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2627:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2628:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2628:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2629:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getExpAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleExp6017);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleLog"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2653:1: entryRuleLog returns [EObject current=null] : iv_ruleLog= ruleLog EOF ;
    public final EObject entryRuleLog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLog = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2654:2: (iv_ruleLog= ruleLog EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2655:2: iv_ruleLog= ruleLog EOF
            {
             newCompositeNode(grammarAccess.getLogRule()); 
            pushFollow(FOLLOW_ruleLog_in_entryRuleLog6053);
            iv_ruleLog=ruleLog();

            state._fsp--;

             current =iv_ruleLog; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLog6063); 

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
    // $ANTLR end "entryRuleLog"


    // $ANTLR start "ruleLog"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2662:1: ruleLog returns [EObject current=null] : (otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleLog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2665:28: ( (otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2666:1: (otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2666:1: (otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2666:3: otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleLog6100); 

                	newLeafNode(otherlv_0, grammarAccess.getLogAccess().getLogKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2670:1: ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2671:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2671:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2672:3: lv_arg1_1_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLogAccess().getArg1SPINDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleLog6121);
            lv_arg1_1_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleLog6133); 

                	newLeafNode(otherlv_2, grammarAccess.getLogAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2692:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2693:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2693:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2694:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLogAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleLog6154);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleLog"


    // $ANTLR start "entryRuleScaleOffset"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2718:1: entryRuleScaleOffset returns [EObject current=null] : iv_ruleScaleOffset= ruleScaleOffset EOF ;
    public final EObject entryRuleScaleOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleOffset = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2719:2: (iv_ruleScaleOffset= ruleScaleOffset EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2720:2: iv_ruleScaleOffset= ruleScaleOffset EOF
            {
             newCompositeNode(grammarAccess.getScaleOffsetRule()); 
            pushFollow(FOLLOW_ruleScaleOffset_in_entryRuleScaleOffset6190);
            iv_ruleScaleOffset=ruleScaleOffset();

            state._fsp--;

             current =iv_ruleScaleOffset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleOffset6200); 

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
    // $ANTLR end "entryRuleScaleOffset"


    // $ANTLR start "ruleScaleOffset"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2727:1: ruleScaleOffset returns [EObject current=null] : (otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleScaleOffset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2730:28: ( (otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2731:1: (otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2731:1: (otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2731:3: otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleScaleOffset6237); 

                	newLeafNode(otherlv_0, grammarAccess.getScaleOffsetAccess().getSofKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2735:1: ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2736:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2736:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2737:3: lv_arg1_1_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getScaleOffsetAccess().getArg1SPINDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleScaleOffset6258);
            lv_arg1_1_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScaleOffsetRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleScaleOffset6270); 

                	newLeafNode(otherlv_2, grammarAccess.getScaleOffsetAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2757:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2758:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2758:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2759:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getScaleOffsetAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleScaleOffset6291);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScaleOffsetRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleScaleOffset"


    // $ANTLR start "entryRuleWriteDelay"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2783:1: entryRuleWriteDelay returns [EObject current=null] : iv_ruleWriteDelay= ruleWriteDelay EOF ;
    public final EObject entryRuleWriteDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteDelay = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2784:2: (iv_ruleWriteDelay= ruleWriteDelay EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2785:2: iv_ruleWriteDelay= ruleWriteDelay EOF
            {
             newCompositeNode(grammarAccess.getWriteDelayRule()); 
            pushFollow(FOLLOW_ruleWriteDelay_in_entryRuleWriteDelay6327);
            iv_ruleWriteDelay=ruleWriteDelay();

            state._fsp--;

             current =iv_ruleWriteDelay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWriteDelay6337); 

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
    // $ANTLR end "entryRuleWriteDelay"


    // $ANTLR start "ruleWriteDelay"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2792:1: ruleWriteDelay returns [EObject current=null] : (otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteDelay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2795:28: ( (otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2796:1: (otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2796:1: (otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2796:3: otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleWriteDelay6374); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteDelayAccess().getWraKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2800:1: ( (lv_arg1_1_0= ruleSPINMEM ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2801:1: (lv_arg1_1_0= ruleSPINMEM )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2801:1: (lv_arg1_1_0= ruleSPINMEM )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2802:3: lv_arg1_1_0= ruleSPINMEM
            {
             
            	        newCompositeNode(grammarAccess.getWriteDelayAccess().getArg1SPINMEMParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINMEM_in_ruleWriteDelay6395);
            lv_arg1_1_0=ruleSPINMEM();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteDelayRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"SPINMEM");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleWriteDelay6407); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteDelayAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2822:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2823:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2823:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2824:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteDelayAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleWriteDelay6428);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteDelayRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleWriteDelay"


    // $ANTLR start "entryRuleWriteAllpass"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2848:1: entryRuleWriteAllpass returns [EObject current=null] : iv_ruleWriteAllpass= ruleWriteAllpass EOF ;
    public final EObject entryRuleWriteAllpass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteAllpass = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2849:2: (iv_ruleWriteAllpass= ruleWriteAllpass EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2850:2: iv_ruleWriteAllpass= ruleWriteAllpass EOF
            {
             newCompositeNode(grammarAccess.getWriteAllpassRule()); 
            pushFollow(FOLLOW_ruleWriteAllpass_in_entryRuleWriteAllpass6464);
            iv_ruleWriteAllpass=ruleWriteAllpass();

            state._fsp--;

             current =iv_ruleWriteAllpass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWriteAllpass6474); 

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
    // $ANTLR end "entryRuleWriteAllpass"


    // $ANTLR start "ruleWriteAllpass"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2857:1: ruleWriteAllpass returns [EObject current=null] : (otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteAllpass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2860:28: ( (otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2861:1: (otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2861:1: (otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2861:3: otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleWriteAllpass6511); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteAllpassAccess().getWrapKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2865:1: ( (lv_arg1_1_0= ruleSPINMEM ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2866:1: (lv_arg1_1_0= ruleSPINMEM )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2866:1: (lv_arg1_1_0= ruleSPINMEM )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2867:3: lv_arg1_1_0= ruleSPINMEM
            {
             
            	        newCompositeNode(grammarAccess.getWriteAllpassAccess().getArg1SPINMEMParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINMEM_in_ruleWriteAllpass6532);
            lv_arg1_1_0=ruleSPINMEM();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteAllpassRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"SPINMEM");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleWriteAllpass6544); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteAllpassAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2887:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2888:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2888:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2889:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteAllpassAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleWriteAllpass6565);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteAllpassRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleWriteAllpass"


    // $ANTLR start "entryRuleReadDelay"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2913:1: entryRuleReadDelay returns [EObject current=null] : iv_ruleReadDelay= ruleReadDelay EOF ;
    public final EObject entryRuleReadDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadDelay = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2914:2: (iv_ruleReadDelay= ruleReadDelay EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2915:2: iv_ruleReadDelay= ruleReadDelay EOF
            {
             newCompositeNode(grammarAccess.getReadDelayRule()); 
            pushFollow(FOLLOW_ruleReadDelay_in_entryRuleReadDelay6601);
            iv_ruleReadDelay=ruleReadDelay();

            state._fsp--;

             current =iv_ruleReadDelay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadDelay6611); 

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
    // $ANTLR end "entryRuleReadDelay"


    // $ANTLR start "ruleReadDelay"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2922:1: ruleReadDelay returns [EObject current=null] : (otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleReadDelay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2925:28: ( (otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2926:1: (otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2926:1: (otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2926:3: otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleReadDelay6648); 

                	newLeafNode(otherlv_0, grammarAccess.getReadDelayAccess().getRdaKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2930:1: ( (lv_arg1_1_0= ruleSPINMEM ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2931:1: (lv_arg1_1_0= ruleSPINMEM )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2931:1: (lv_arg1_1_0= ruleSPINMEM )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2932:3: lv_arg1_1_0= ruleSPINMEM
            {
             
            	        newCompositeNode(grammarAccess.getReadDelayAccess().getArg1SPINMEMParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINMEM_in_ruleReadDelay6669);
            lv_arg1_1_0=ruleSPINMEM();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReadDelayRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"SPINMEM");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleReadDelay6681); 

                	newLeafNode(otherlv_2, grammarAccess.getReadDelayAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2952:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2953:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2953:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2954:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getReadDelayAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleReadDelay6702);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReadDelayRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleReadDelay"


    // $ANTLR start "entryRuleLoadSinLFO"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2978:1: entryRuleLoadSinLFO returns [EObject current=null] : iv_ruleLoadSinLFO= ruleLoadSinLFO EOF ;
    public final EObject entryRuleLoadSinLFO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadSinLFO = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2979:2: (iv_ruleLoadSinLFO= ruleLoadSinLFO EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2980:2: iv_ruleLoadSinLFO= ruleLoadSinLFO EOF
            {
             newCompositeNode(grammarAccess.getLoadSinLFORule()); 
            pushFollow(FOLLOW_ruleLoadSinLFO_in_entryRuleLoadSinLFO6738);
            iv_ruleLoadSinLFO=ruleLoadSinLFO();

            state._fsp--;

             current =iv_ruleLoadSinLFO; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoadSinLFO6748); 

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
    // $ANTLR end "entryRuleLoadSinLFO"


    // $ANTLR start "ruleLoadSinLFO"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2987:1: ruleLoadSinLFO returns [EObject current=null] : (otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) ) ;
    public final EObject ruleLoadSinLFO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_arg2_3_0=null;
        Token otherlv_4=null;
        Token lv_arg3_5_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2990:28: ( (otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2991:1: (otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2991:1: (otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2991:3: otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleLoadSinLFO6785); 

                	newLeafNode(otherlv_0, grammarAccess.getLoadSinLFOAccess().getWldsKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2995:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2996:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2996:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2997:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getLoadSinLFOAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleLoadSinLFO6806);
            lv_arg1_1_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoadSinLFORule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleLoadSinLFO6818); 

                	newLeafNode(otherlv_2, grammarAccess.getLoadSinLFOAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3017:1: ( (lv_arg2_3_0= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3018:1: (lv_arg2_3_0= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3018:1: (lv_arg2_3_0= RULE_INT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3019:3: lv_arg2_3_0= RULE_INT
            {
            lv_arg2_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoadSinLFO6835); 

            			newLeafNode(lv_arg2_3_0, grammarAccess.getLoadSinLFOAccess().getArg2INTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLoadSinLFORule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleLoadSinLFO6852); 

                	newLeafNode(otherlv_4, grammarAccess.getLoadSinLFOAccess().getCommaKeyword_4());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3039:1: ( (lv_arg3_5_0= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3040:1: (lv_arg3_5_0= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3040:1: (lv_arg3_5_0= RULE_INT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3041:3: lv_arg3_5_0= RULE_INT
            {
            lv_arg3_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoadSinLFO6869); 

            			newLeafNode(lv_arg3_5_0, grammarAccess.getLoadSinLFOAccess().getArg3INTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLoadSinLFORule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"arg3",
                    		lv_arg3_5_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleLoadSinLFO"


    // $ANTLR start "entryRuleLoadRampLFO"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3065:1: entryRuleLoadRampLFO returns [EObject current=null] : iv_ruleLoadRampLFO= ruleLoadRampLFO EOF ;
    public final EObject entryRuleLoadRampLFO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadRampLFO = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3066:2: (iv_ruleLoadRampLFO= ruleLoadRampLFO EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3067:2: iv_ruleLoadRampLFO= ruleLoadRampLFO EOF
            {
             newCompositeNode(grammarAccess.getLoadRampLFORule()); 
            pushFollow(FOLLOW_ruleLoadRampLFO_in_entryRuleLoadRampLFO6910);
            iv_ruleLoadRampLFO=ruleLoadRampLFO();

            state._fsp--;

             current =iv_ruleLoadRampLFO; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoadRampLFO6920); 

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
    // $ANTLR end "entryRuleLoadRampLFO"


    // $ANTLR start "ruleLoadRampLFO"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3074:1: ruleLoadRampLFO returns [EObject current=null] : (otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) ) ;
    public final EObject ruleLoadRampLFO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_arg2_3_0=null;
        Token otherlv_4=null;
        Token lv_arg3_5_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3077:28: ( (otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3078:1: (otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3078:1: (otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3078:3: otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleLoadRampLFO6957); 

                	newLeafNode(otherlv_0, grammarAccess.getLoadRampLFOAccess().getWldrKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3082:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3083:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3083:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3084:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getLoadRampLFOAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleLoadRampLFO6978);
            lv_arg1_1_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoadRampLFORule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleLoadRampLFO6990); 

                	newLeafNode(otherlv_2, grammarAccess.getLoadRampLFOAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3104:1: ( (lv_arg2_3_0= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3105:1: (lv_arg2_3_0= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3105:1: (lv_arg2_3_0= RULE_INT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3106:3: lv_arg2_3_0= RULE_INT
            {
            lv_arg2_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoadRampLFO7007); 

            			newLeafNode(lv_arg2_3_0, grammarAccess.getLoadRampLFOAccess().getArg2INTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLoadRampLFORule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleLoadRampLFO7024); 

                	newLeafNode(otherlv_4, grammarAccess.getLoadRampLFOAccess().getCommaKeyword_4());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3126:1: ( (lv_arg3_5_0= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3127:1: (lv_arg3_5_0= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3127:1: (lv_arg3_5_0= RULE_INT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3128:3: lv_arg3_5_0= RULE_INT
            {
            lv_arg3_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoadRampLFO7041); 

            			newLeafNode(lv_arg3_5_0, grammarAccess.getLoadRampLFOAccess().getArg3INTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLoadRampLFORule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"arg3",
                    		lv_arg3_5_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleLoadRampLFO"


    // $ANTLR start "entryRuleChorusReadDelay"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3152:1: entryRuleChorusReadDelay returns [EObject current=null] : iv_ruleChorusReadDelay= ruleChorusReadDelay EOF ;
    public final EObject entryRuleChorusReadDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChorusReadDelay = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3153:2: (iv_ruleChorusReadDelay= ruleChorusReadDelay EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3154:2: iv_ruleChorusReadDelay= ruleChorusReadDelay EOF
            {
             newCompositeNode(grammarAccess.getChorusReadDelayRule()); 
            pushFollow(FOLLOW_ruleChorusReadDelay_in_entryRuleChorusReadDelay7082);
            iv_ruleChorusReadDelay=ruleChorusReadDelay();

            state._fsp--;

             current =iv_ruleChorusReadDelay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChorusReadDelay7092); 

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
    // $ANTLR end "entryRuleChorusReadDelay"


    // $ANTLR start "ruleChorusReadDelay"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3161:1: ruleChorusReadDelay returns [EObject current=null] : (otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) ) ) ;
    public final EObject ruleChorusReadDelay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arg1_2_0 = null;

        AntlrDatatypeRuleToken lv_arg2_4_0 = null;

        EObject lv_arg3_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3164:28: ( (otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3165:1: (otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3165:1: (otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3165:3: otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleChorusReadDelay7129); 

                	newLeafNode(otherlv_0, grammarAccess.getChorusReadDelayAccess().getChoRdaKeyword_0());
                
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleChorusReadDelay7141); 

                	newLeafNode(otherlv_1, grammarAccess.getChorusReadDelayAccess().getCommaKeyword_1());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3173:1: ( (lv_arg1_2_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3174:1: (lv_arg1_2_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3174:1: (lv_arg1_2_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3175:3: lv_arg1_2_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getChorusReadDelayAccess().getArg1SPINREGISTERParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleChorusReadDelay7162);
            lv_arg1_2_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChorusReadDelayRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_2_0, 
                    		"SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleChorusReadDelay7174); 

                	newLeafNode(otherlv_3, grammarAccess.getChorusReadDelayAccess().getCommaKeyword_3());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3195:1: ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3196:1: (lv_arg2_4_0= ruleSPINCHOREGFLAGS )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3196:1: (lv_arg2_4_0= ruleSPINCHOREGFLAGS )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3197:3: lv_arg2_4_0= ruleSPINCHOREGFLAGS
            {
             
            	        newCompositeNode(grammarAccess.getChorusReadDelayAccess().getArg2SPINCHOREGFLAGSParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINCHOREGFLAGS_in_ruleChorusReadDelay7195);
            lv_arg2_4_0=ruleSPINCHOREGFLAGS();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChorusReadDelayRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_4_0, 
                    		"SPINCHOREGFLAGS");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleChorusReadDelay7207); 

                	newLeafNode(otherlv_5, grammarAccess.getChorusReadDelayAccess().getCommaKeyword_5());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3217:1: ( (lv_arg3_6_0= ruleSPINMEM ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3218:1: (lv_arg3_6_0= ruleSPINMEM )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3218:1: (lv_arg3_6_0= ruleSPINMEM )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3219:3: lv_arg3_6_0= ruleSPINMEM
            {
             
            	        newCompositeNode(grammarAccess.getChorusReadDelayAccess().getArg3SPINMEMParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINMEM_in_ruleChorusReadDelay7228);
            lv_arg3_6_0=ruleSPINMEM();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChorusReadDelayRule());
            	        }
                   		set(
                   			current, 
                   			"arg3",
                    		lv_arg3_6_0, 
                    		"SPINMEM");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleChorusReadDelay"


    // $ANTLR start "entryRuleChorusReadValue"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3243:1: entryRuleChorusReadValue returns [EObject current=null] : iv_ruleChorusReadValue= ruleChorusReadValue EOF ;
    public final EObject entryRuleChorusReadValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChorusReadValue = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3244:2: (iv_ruleChorusReadValue= ruleChorusReadValue EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3245:2: iv_ruleChorusReadValue= ruleChorusReadValue EOF
            {
             newCompositeNode(grammarAccess.getChorusReadValueRule()); 
            pushFollow(FOLLOW_ruleChorusReadValue_in_entryRuleChorusReadValue7264);
            iv_ruleChorusReadValue=ruleChorusReadValue();

            state._fsp--;

             current =iv_ruleChorusReadValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChorusReadValue7274); 

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
    // $ANTLR end "entryRuleChorusReadValue"


    // $ANTLR start "ruleChorusReadValue"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3252:1: ruleChorusReadValue returns [EObject current=null] : (otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) ) ;
    public final EObject ruleChorusReadValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_arg1_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3255:28: ( (otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3256:1: (otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3256:1: (otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3256:3: otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleChorusReadValue7311); 

                	newLeafNode(otherlv_0, grammarAccess.getChorusReadValueAccess().getChoRdalKeyword_0());
                
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleChorusReadValue7323); 

                	newLeafNode(otherlv_1, grammarAccess.getChorusReadValueAccess().getCommaKeyword_1());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3264:1: ( (lv_arg1_2_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3265:1: (lv_arg1_2_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3265:1: (lv_arg1_2_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3266:3: lv_arg1_2_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getChorusReadValueAccess().getArg1SPINREGISTERParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleChorusReadValue7344);
            lv_arg1_2_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChorusReadValueRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_2_0, 
                    		"SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleChorusReadValue"


    // $ANTLR start "entryRuleChorusScaleOffset"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3290:1: entryRuleChorusScaleOffset returns [EObject current=null] : iv_ruleChorusScaleOffset= ruleChorusScaleOffset EOF ;
    public final EObject entryRuleChorusScaleOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChorusScaleOffset = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3291:2: (iv_ruleChorusScaleOffset= ruleChorusScaleOffset EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3292:2: iv_ruleChorusScaleOffset= ruleChorusScaleOffset EOF
            {
             newCompositeNode(grammarAccess.getChorusScaleOffsetRule()); 
            pushFollow(FOLLOW_ruleChorusScaleOffset_in_entryRuleChorusScaleOffset7380);
            iv_ruleChorusScaleOffset=ruleChorusScaleOffset();

            state._fsp--;

             current =iv_ruleChorusScaleOffset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChorusScaleOffset7390); 

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
    // $ANTLR end "entryRuleChorusScaleOffset"


    // $ANTLR start "ruleChorusScaleOffset"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3299:1: ruleChorusScaleOffset returns [EObject current=null] : (otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleChorusScaleOffset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_arg1_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arg2_4_0 = null;

        AntlrDatatypeRuleToken lv_arg3_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3302:28: ( (otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3303:1: (otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3303:1: (otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3303:3: otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleChorusScaleOffset7427); 

                	newLeafNode(otherlv_0, grammarAccess.getChorusScaleOffsetAccess().getChoSofKeyword_0());
                
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleChorusScaleOffset7439); 

                	newLeafNode(otherlv_1, grammarAccess.getChorusScaleOffsetAccess().getCommaKeyword_1());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3311:1: ( (lv_arg1_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3312:1: (lv_arg1_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3312:1: (lv_arg1_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3313:3: lv_arg1_2_0= RULE_ID
            {
            lv_arg1_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChorusScaleOffset7456); 

            			newLeafNode(lv_arg1_2_0, grammarAccess.getChorusScaleOffsetAccess().getArg1IDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChorusScaleOffsetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"arg1",
                    		lv_arg1_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleChorusScaleOffset7473); 

                	newLeafNode(otherlv_3, grammarAccess.getChorusScaleOffsetAccess().getCommaKeyword_3());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3333:1: ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3334:1: (lv_arg2_4_0= ruleSPINCHOREGFLAGS )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3334:1: (lv_arg2_4_0= ruleSPINCHOREGFLAGS )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3335:3: lv_arg2_4_0= ruleSPINCHOREGFLAGS
            {
             
            	        newCompositeNode(grammarAccess.getChorusScaleOffsetAccess().getArg2SPINCHOREGFLAGSParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINCHOREGFLAGS_in_ruleChorusScaleOffset7494);
            lv_arg2_4_0=ruleSPINCHOREGFLAGS();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChorusScaleOffsetRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_4_0, 
                    		"SPINCHOREGFLAGS");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleChorusScaleOffset7506); 

                	newLeafNode(otherlv_5, grammarAccess.getChorusScaleOffsetAccess().getCommaKeyword_5());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3355:1: ( (lv_arg3_6_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3356:1: (lv_arg3_6_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3356:1: (lv_arg3_6_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3357:3: lv_arg3_6_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getChorusScaleOffsetAccess().getArg3SPINDOUBLEParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleChorusScaleOffset7527);
            lv_arg3_6_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChorusScaleOffsetRule());
            	        }
                   		set(
                   			current, 
                   			"arg3",
                    		lv_arg3_6_0, 
                    		"SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleChorusScaleOffset"


    // $ANTLR start "entryRuleReadDelayPointer"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3381:1: entryRuleReadDelayPointer returns [EObject current=null] : iv_ruleReadDelayPointer= ruleReadDelayPointer EOF ;
    public final EObject entryRuleReadDelayPointer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadDelayPointer = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3382:2: (iv_ruleReadDelayPointer= ruleReadDelayPointer EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3383:2: iv_ruleReadDelayPointer= ruleReadDelayPointer EOF
            {
             newCompositeNode(grammarAccess.getReadDelayPointerRule()); 
            pushFollow(FOLLOW_ruleReadDelayPointer_in_entryRuleReadDelayPointer7563);
            iv_ruleReadDelayPointer=ruleReadDelayPointer();

            state._fsp--;

             current =iv_ruleReadDelayPointer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadDelayPointer7573); 

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
    // $ANTLR end "entryRuleReadDelayPointer"


    // $ANTLR start "ruleReadDelayPointer"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3390:1: ruleReadDelayPointer returns [EObject current=null] : (otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleReadDelayPointer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3393:28: ( (otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3394:1: (otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3394:1: (otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3394:3: otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleReadDelayPointer7610); 

                	newLeafNode(otherlv_0, grammarAccess.getReadDelayPointerAccess().getRmpaKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3398:1: ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3399:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3399:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3400:3: lv_arg1_1_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getReadDelayPointerAccess().getArg1SPINDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleReadDelayPointer7631);
            lv_arg1_1_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReadDelayPointerRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleReadDelayPointer"


    // $ANTLR start "entryRuleAnd"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3424:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3425:2: (iv_ruleAnd= ruleAnd EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3426:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd7667);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd7677); 

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3433:1: ruleAnd returns [EObject current=null] : (otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3436:28: ( (otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3437:1: (otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3437:1: (otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3437:3: otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleAnd7714); 

                	newLeafNode(otherlv_0, grammarAccess.getAndAccess().getAndKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3441:1: ( (lv_arg1_1_0= ruleBINARY24 ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3442:1: (lv_arg1_1_0= ruleBINARY24 )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3442:1: (lv_arg1_1_0= ruleBINARY24 )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3443:3: lv_arg1_1_0= ruleBINARY24
            {
             
            	        newCompositeNode(grammarAccess.getAndAccess().getArg1BINARY24ParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBINARY24_in_ruleAnd7735);
            lv_arg1_1_0=ruleBINARY24();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAndRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"BINARY24");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3467:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3468:2: (iv_ruleOr= ruleOr EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3469:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr7771);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr7781); 

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3476:1: ruleOr returns [EObject current=null] : (otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3479:28: ( (otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3480:1: (otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3480:1: (otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3480:3: otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleOr7818); 

                	newLeafNode(otherlv_0, grammarAccess.getOrAccess().getOrKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3484:1: ( (lv_arg1_1_0= ruleBINARY24 ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3485:1: (lv_arg1_1_0= ruleBINARY24 )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3485:1: (lv_arg1_1_0= ruleBINARY24 )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3486:3: lv_arg1_1_0= ruleBINARY24
            {
             
            	        newCompositeNode(grammarAccess.getOrAccess().getArg1BINARY24ParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBINARY24_in_ruleOr7839);
            lv_arg1_1_0=ruleBINARY24();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"BINARY24");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleXor"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3510:1: entryRuleXor returns [EObject current=null] : iv_ruleXor= ruleXor EOF ;
    public final EObject entryRuleXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXor = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3511:2: (iv_ruleXor= ruleXor EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3512:2: iv_ruleXor= ruleXor EOF
            {
             newCompositeNode(grammarAccess.getXorRule()); 
            pushFollow(FOLLOW_ruleXor_in_entryRuleXor7875);
            iv_ruleXor=ruleXor();

            state._fsp--;

             current =iv_ruleXor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXor7885); 

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
    // $ANTLR end "entryRuleXor"


    // $ANTLR start "ruleXor"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3519:1: ruleXor returns [EObject current=null] : (otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) ;
    public final EObject ruleXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3522:28: ( (otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3523:1: (otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3523:1: (otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3523:3: otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleXor7922); 

                	newLeafNode(otherlv_0, grammarAccess.getXorAccess().getXorKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3527:1: ( (lv_arg1_1_0= ruleBINARY24 ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3528:1: (lv_arg1_1_0= ruleBINARY24 )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3528:1: (lv_arg1_1_0= ruleBINARY24 )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3529:3: lv_arg1_1_0= ruleBINARY24
            {
             
            	        newCompositeNode(grammarAccess.getXorAccess().getArg1BINARY24ParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBINARY24_in_ruleXor7943);
            lv_arg1_1_0=ruleBINARY24();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXorRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"BINARY24");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleXor"


    // $ANTLR start "entryRuleJam"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3553:1: entryRuleJam returns [EObject current=null] : iv_ruleJam= ruleJam EOF ;
    public final EObject entryRuleJam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJam = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3554:2: (iv_ruleJam= ruleJam EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3555:2: iv_ruleJam= ruleJam EOF
            {
             newCompositeNode(grammarAccess.getJamRule()); 
            pushFollow(FOLLOW_ruleJam_in_entryRuleJam7979);
            iv_ruleJam=ruleJam();

            state._fsp--;

             current =iv_ruleJam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJam7989); 

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
    // $ANTLR end "entryRuleJam"


    // $ANTLR start "ruleJam"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3562:1: ruleJam returns [EObject current=null] : (otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleJam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3565:28: ( (otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3566:1: (otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3566:1: (otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3566:3: otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleJam8026); 

                	newLeafNode(otherlv_0, grammarAccess.getJamAccess().getJamKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3570:1: ( (lv_arg1_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3571:1: (lv_arg1_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3571:1: (lv_arg1_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3572:3: lv_arg1_1_0= RULE_ID
            {
            lv_arg1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJam8043); 

            			newLeafNode(lv_arg1_1_0, grammarAccess.getJamAccess().getArg1IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJamRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
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
    // $ANTLR end "ruleJam"


    // $ANTLR start "entryRuleClr"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3596:1: entryRuleClr returns [EObject current=null] : iv_ruleClr= ruleClr EOF ;
    public final EObject entryRuleClr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClr = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3597:2: (iv_ruleClr= ruleClr EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3598:2: iv_ruleClr= ruleClr EOF
            {
             newCompositeNode(grammarAccess.getClrRule()); 
            pushFollow(FOLLOW_ruleClr_in_entryRuleClr8084);
            iv_ruleClr=ruleClr();

            state._fsp--;

             current =iv_ruleClr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClr8094); 

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
    // $ANTLR end "entryRuleClr"


    // $ANTLR start "ruleClr"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3605:1: ruleClr returns [EObject current=null] : ( () otherlv_1= 'clr' ) ;
    public final EObject ruleClr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3608:28: ( ( () otherlv_1= 'clr' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3609:1: ( () otherlv_1= 'clr' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3609:1: ( () otherlv_1= 'clr' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3609:2: () otherlv_1= 'clr'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3609:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3610:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClrAccess().getClrAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleClr8140); 

                	newLeafNode(otherlv_1, grammarAccess.getClrAccess().getClrKeyword_1());
                

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
    // $ANTLR end "ruleClr"


    // $ANTLR start "entryRuleNot"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3627:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3628:2: (iv_ruleNot= ruleNot EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3629:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_ruleNot_in_entryRuleNot8176);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNot8186); 

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
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3636:1: ruleNot returns [EObject current=null] : ( () otherlv_1= 'not' ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3639:28: ( ( () otherlv_1= 'not' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3640:1: ( () otherlv_1= 'not' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3640:1: ( () otherlv_1= 'not' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3640:2: () otherlv_1= 'not'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3640:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3641:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNotAccess().getNotAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleNot8232); 

                	newLeafNode(otherlv_1, grammarAccess.getNotAccess().getNotKeyword_1());
                

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
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleAbsa"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3658:1: entryRuleAbsa returns [EObject current=null] : iv_ruleAbsa= ruleAbsa EOF ;
    public final EObject entryRuleAbsa() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsa = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3659:2: (iv_ruleAbsa= ruleAbsa EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3660:2: iv_ruleAbsa= ruleAbsa EOF
            {
             newCompositeNode(grammarAccess.getAbsaRule()); 
            pushFollow(FOLLOW_ruleAbsa_in_entryRuleAbsa8268);
            iv_ruleAbsa=ruleAbsa();

            state._fsp--;

             current =iv_ruleAbsa; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsa8278); 

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
    // $ANTLR end "entryRuleAbsa"


    // $ANTLR start "ruleAbsa"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3667:1: ruleAbsa returns [EObject current=null] : ( () otherlv_1= 'absa' ) ;
    public final EObject ruleAbsa() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3670:28: ( ( () otherlv_1= 'absa' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3671:1: ( () otherlv_1= 'absa' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3671:1: ( () otherlv_1= 'absa' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3671:2: () otherlv_1= 'absa'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3671:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3672:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAbsaAccess().getAbsaAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleAbsa8324); 

                	newLeafNode(otherlv_1, grammarAccess.getAbsaAccess().getAbsaKeyword_1());
                

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
    // $ANTLR end "ruleAbsa"


    // $ANTLR start "entryRuleSkip"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3689:1: entryRuleSkip returns [EObject current=null] : iv_ruleSkip= ruleSkip EOF ;
    public final EObject entryRuleSkip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkip = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3690:2: (iv_ruleSkip= ruleSkip EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3691:2: iv_ruleSkip= ruleSkip EOF
            {
             newCompositeNode(grammarAccess.getSkipRule()); 
            pushFollow(FOLLOW_ruleSkip_in_entryRuleSkip8360);
            iv_ruleSkip=ruleSkip();

            state._fsp--;

             current =iv_ruleSkip; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkip8370); 

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
    // $ANTLR end "entryRuleSkip"


    // $ANTLR start "ruleSkip"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3698:1: ruleSkip returns [EObject current=null] : (otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleSkip() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_flags_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3701:28: ( (otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3702:1: (otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3702:1: (otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3702:3: otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleSkip8407); 

                	newLeafNode(otherlv_0, grammarAccess.getSkipAccess().getSkpKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3706:1: ( (lv_flags_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3707:1: (lv_flags_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3707:1: (lv_flags_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3708:3: lv_flags_1_0= RULE_ID
            {
            lv_flags_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSkip8424); 

            			newLeafNode(lv_flags_1_0, grammarAccess.getSkipAccess().getFlagsIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSkipRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"flags",
                    		lv_flags_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleSkip8441); 

                	newLeafNode(otherlv_2, grammarAccess.getSkipAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3728:1: ( (otherlv_3= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3729:1: (otherlv_3= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3729:1: (otherlv_3= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3730:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSkipRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSkip8461); 

            		newLeafNode(otherlv_3, grammarAccess.getSkipAccess().getLabelLabelCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleSkip"


    // $ANTLR start "entryRuleSPINDOUBLE"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3749:1: entryRuleSPINDOUBLE returns [String current=null] : iv_ruleSPINDOUBLE= ruleSPINDOUBLE EOF ;
    public final String entryRuleSPINDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPINDOUBLE = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3750:2: (iv_ruleSPINDOUBLE= ruleSPINDOUBLE EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3751:2: iv_ruleSPINDOUBLE= ruleSPINDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getSPINDOUBLERule()); 
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_entryRuleSPINDOUBLE8498);
            iv_ruleSPINDOUBLE=ruleSPINDOUBLE();

            state._fsp--;

             current =iv_ruleSPINDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPINDOUBLE8509); 

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
    // $ANTLR end "entryRuleSPINDOUBLE"


    // $ANTLR start "ruleSPINDOUBLE"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3758:1: ruleSPINDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) ) ;
    public final AntlrDatatypeRuleToken ruleSPINDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3761:28: ( ( (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3762:1: ( (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3762:1: ( (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3762:2: (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3762:2: (kw= '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==59) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3763:2: kw= '-'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleSPINDOUBLE8548); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINDOUBLEAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3768:3: (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_INT) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3768:8: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINDOUBLE8566); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getSPINDOUBLEAccess().getIDTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3776:6: (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3776:6: (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3776:11: this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )?
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSPINDOUBLE8593); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getSPINDOUBLEAccess().getINTTerminalRuleCall_1_1_0()); 
                        
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3783:1: (kw= '.' this_INT_4= RULE_INT )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==60) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3784:2: kw= '.' this_INT_4= RULE_INT
                            {
                            kw=(Token)match(input,60,FOLLOW_60_in_ruleSPINDOUBLE8612); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getSPINDOUBLEAccess().getFullStopKeyword_1_1_1_0()); 
                                
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSPINDOUBLE8627); 

                            		current.merge(this_INT_4);
                                
                             
                                newLeafNode(this_INT_4, grammarAccess.getSPINDOUBLEAccess().getINTTerminalRuleCall_1_1_1_1()); 
                                

                            }
                            break;

                    }


                    }


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
    // $ANTLR end "ruleSPINDOUBLE"


    // $ANTLR start "entryRuleSPINREGISTER"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3804:1: entryRuleSPINREGISTER returns [String current=null] : iv_ruleSPINREGISTER= ruleSPINREGISTER EOF ;
    public final String entryRuleSPINREGISTER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPINREGISTER = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3805:2: (iv_ruleSPINREGISTER= ruleSPINREGISTER EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3806:2: iv_ruleSPINREGISTER= ruleSPINREGISTER EOF
            {
             newCompositeNode(grammarAccess.getSPINREGISTERRule()); 
            pushFollow(FOLLOW_ruleSPINREGISTER_in_entryRuleSPINREGISTER8677);
            iv_ruleSPINREGISTER=ruleSPINREGISTER();

            state._fsp--;

             current =iv_ruleSPINREGISTER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPINREGISTER8688); 

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
    // $ANTLR end "entryRuleSPINREGISTER"


    // $ANTLR start "ruleSPINREGISTER"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3813:1: ruleSPINREGISTER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSPINREGISTER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3816:28: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3817:1: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3817:1: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_INT) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3817:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINREGISTER8728); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getSPINREGISTERAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3825:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSPINREGISTER8754); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getSPINREGISTERAccess().getINTTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleSPINREGISTER"


    // $ANTLR start "entryRuleSPINCHOREGFLAGS"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3840:1: entryRuleSPINCHOREGFLAGS returns [String current=null] : iv_ruleSPINCHOREGFLAGS= ruleSPINCHOREGFLAGS EOF ;
    public final String entryRuleSPINCHOREGFLAGS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPINCHOREGFLAGS = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3841:2: (iv_ruleSPINCHOREGFLAGS= ruleSPINCHOREGFLAGS EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3842:2: iv_ruleSPINCHOREGFLAGS= ruleSPINCHOREGFLAGS EOF
            {
             newCompositeNode(grammarAccess.getSPINCHOREGFLAGSRule()); 
            pushFollow(FOLLOW_ruleSPINCHOREGFLAGS_in_entryRuleSPINCHOREGFLAGS8800);
            iv_ruleSPINCHOREGFLAGS=ruleSPINCHOREGFLAGS();

            state._fsp--;

             current =iv_ruleSPINCHOREGFLAGS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPINCHOREGFLAGS8811); 

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
    // $ANTLR end "entryRuleSPINCHOREGFLAGS"


    // $ANTLR start "ruleSPINCHOREGFLAGS"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3849:1: ruleSPINCHOREGFLAGS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )? ) ;
    public final AntlrDatatypeRuleToken ruleSPINCHOREGFLAGS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;
        Token kw=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3852:28: ( (this_INT_0= RULE_INT | (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )? ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3853:1: (this_INT_0= RULE_INT | (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )? )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3853:1: (this_INT_0= RULE_INT | (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )? )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            else if ( (LA26_0==EOF||LA26_0==RULE_ID||LA26_0==31) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3853:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSPINCHOREGFLAGS8851); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getSPINCHOREGFLAGSAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3861:6: (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )?
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3861:6: (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ID) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3861:11: this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )*
                            {
                            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINCHOREGFLAGS8878); 

                            		current.merge(this_ID_1);
                                
                             
                                newLeafNode(this_ID_1, grammarAccess.getSPINCHOREGFLAGSAccess().getIDTerminalRuleCall_1_0()); 
                                
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3868:1: (kw= '|' this_ID_3= RULE_ID )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==61) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3869:2: kw= '|' this_ID_3= RULE_ID
                            	    {
                            	    kw=(Token)match(input,61,FOLLOW_61_in_ruleSPINCHOREGFLAGS8897); 

                            	            current.merge(kw);
                            	            newLeafNode(kw, grammarAccess.getSPINCHOREGFLAGSAccess().getVerticalLineKeyword_1_1_0()); 
                            	        
                            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINCHOREGFLAGS8912); 

                            	    		current.merge(this_ID_3);
                            	        
                            	     
                            	        newLeafNode(this_ID_3, grammarAccess.getSPINCHOREGFLAGSAccess().getIDTerminalRuleCall_1_1_1()); 
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);


                            }
                            break;

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
    // $ANTLR end "ruleSPINCHOREGFLAGS"


    // $ANTLR start "entryRuleSPINMEM"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3889:1: entryRuleSPINMEM returns [EObject current=null] : iv_ruleSPINMEM= ruleSPINMEM EOF ;
    public final EObject entryRuleSPINMEM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPINMEM = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3890:2: (iv_ruleSPINMEM= ruleSPINMEM EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3891:2: iv_ruleSPINMEM= ruleSPINMEM EOF
            {
             newCompositeNode(grammarAccess.getSPINMEMRule()); 
            pushFollow(FOLLOW_ruleSPINMEM_in_entryRuleSPINMEM8961);
            iv_ruleSPINMEM=ruleSPINMEM();

            state._fsp--;

             current =iv_ruleSPINMEM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPINMEM8971); 

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
    // $ANTLR end "entryRuleSPINMEM"


    // $ANTLR start "ruleSPINMEM"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3898:1: ruleSPINMEM returns [EObject current=null] : ( ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleSPINMEM() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_buffer_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3901:28: ( ( ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3902:1: ( ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3902:1: ( ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )? )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3902:2: ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )?
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3902:2: ( (lv_buffer_0_0= ruleSPINBUF ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3903:1: (lv_buffer_0_0= ruleSPINBUF )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3903:1: (lv_buffer_0_0= ruleSPINBUF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3904:3: lv_buffer_0_0= ruleSPINBUF
            {
             
            	        newCompositeNode(grammarAccess.getSPINMEMAccess().getBufferSPINBUFParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINBUF_in_ruleSPINMEM9017);
            lv_buffer_0_0=ruleSPINBUF();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSPINMEMRule());
            	        }
                   		set(
                   			current, 
                   			"buffer",
                    		lv_buffer_0_0, 
                    		"SPINBUF");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3920:2: ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ID) ) {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==EOF||LA27_2==RULE_ID||LA27_2==RULE_SC_COMMENT||(LA27_2>=17 && LA27_2<=20)||(LA27_2>=22 && LA27_2<=58)) ) {
                    alt27=2;
                }
            }
            switch (alt27) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3920:3: ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3920:3: ( (lv_value_1_0= RULE_INT ) )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3921:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3921:1: (lv_value_1_0= RULE_INT )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3922:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSPINMEM9035); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getSPINMEMAccess().getValueINTTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSPINMEMRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3939:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3939:6: ( (otherlv_2= RULE_ID ) )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3940:1: (otherlv_2= RULE_ID )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3940:1: (otherlv_2= RULE_ID )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3941:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSPINMEMRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINMEM9066); 

                    		newLeafNode(otherlv_2, grammarAccess.getSPINMEMAccess().getOffsetOffsetCrossReference_1_1_0()); 
                    	

                    }


                    }


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
    // $ANTLR end "ruleSPINMEM"


    // $ANTLR start "entryRuleSPINBUF"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3960:1: entryRuleSPINBUF returns [String current=null] : iv_ruleSPINBUF= ruleSPINBUF EOF ;
    public final String entryRuleSPINBUF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPINBUF = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3961:2: (iv_ruleSPINBUF= ruleSPINBUF EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3962:2: iv_ruleSPINBUF= ruleSPINBUF EOF
            {
             newCompositeNode(grammarAccess.getSPINBUFRule()); 
            pushFollow(FOLLOW_ruleSPINBUF_in_entryRuleSPINBUF9105);
            iv_ruleSPINBUF=ruleSPINBUF();

            state._fsp--;

             current =iv_ruleSPINBUF.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPINBUF9116); 

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
    // $ANTLR end "entryRuleSPINBUF"


    // $ANTLR start "ruleSPINBUF"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3969:1: ruleSPINBUF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )? ) ;
    public final AntlrDatatypeRuleToken ruleSPINBUF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3972:28: ( (this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )? ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3973:1: (this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )? )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3973:1: (this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )? )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3973:6: this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINBUF9156); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getSPINBUFAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3980:1: (kw= '#' | kw= '^' )?
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==62) ) {
                alt28=1;
            }
            else if ( (LA28_0==63) ) {
                alt28=2;
            }
            switch (alt28) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3981:2: kw= '#'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleSPINBUF9175); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINBUFAccess().getNumberSignKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3988:2: kw= '^'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleSPINBUF9194); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINBUFAccess().getCircumflexAccentKeyword_1_1()); 
                        

                    }
                    break;

            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3993:3: (kw= '+' | kw= '-' )?
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==64) ) {
                alt29=1;
            }
            else if ( (LA29_0==59) ) {
                alt29=2;
            }
            switch (alt29) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3994:2: kw= '+'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleSPINBUF9210); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINBUFAccess().getPlusSignKeyword_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4001:2: kw= '-'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleSPINBUF9229); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINBUFAccess().getHyphenMinusKeyword_2_1()); 
                        

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
    // $ANTLR end "ruleSPINBUF"


    // $ANTLR start "entryRuleBINARY24"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4014:1: entryRuleBINARY24 returns [String current=null] : iv_ruleBINARY24= ruleBINARY24 EOF ;
    public final String entryRuleBINARY24() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBINARY24 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4015:2: (iv_ruleBINARY24= ruleBINARY24 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4016:2: iv_ruleBINARY24= ruleBINARY24 EOF
            {
             newCompositeNode(grammarAccess.getBINARY24Rule()); 
            pushFollow(FOLLOW_ruleBINARY24_in_entryRuleBINARY249272);
            iv_ruleBINARY24=ruleBINARY24();

            state._fsp--;

             current =iv_ruleBINARY24.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBINARY249283); 

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
    // $ANTLR end "entryRuleBINARY24"


    // $ANTLR start "ruleBINARY24"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4023:1: ruleBINARY24 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* ) | (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* ) ) ;
    public final AntlrDatatypeRuleToken ruleBINARY24() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_ID_2=null;
        Token this_INT_4=null;
        Token this_ID_5=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4026:28: ( ( ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* ) | (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4027:1: ( ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* ) | (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4027:1: ( ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* ) | (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==65) ) {
                alt33=1;
            }
            else if ( (LA33_0==66) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4027:2: ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4027:2: ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4027:3: (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )*
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4027:3: (kw= '%' this_INT_1= RULE_INT )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4028:2: kw= '%' this_INT_1= RULE_INT
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleBINARY249323); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBINARY24Access().getPercentSignKeyword_0_0_0()); 
                        
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBINARY249338); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getBINARY24Access().getINTTerminalRuleCall_0_0_1()); 
                        

                    }

                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4040:2: (this_ID_2= RULE_ID )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_ID) ) {
                            int LA30_2 = input.LA(2);

                            if ( (LA30_2==EOF||LA30_2==RULE_ID||LA30_2==RULE_SC_COMMENT||(LA30_2>=17 && LA30_2<=20)||(LA30_2>=22 && LA30_2<=30)||(LA30_2>=32 && LA30_2<=58)) ) {
                                alt30=1;
                            }


                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4040:7: this_ID_2= RULE_ID
                    	    {
                    	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBINARY249360); 

                    	    		current.merge(this_ID_2);
                    	        
                    	     
                    	        newLeafNode(this_ID_2, grammarAccess.getBINARY24Access().getIDTerminalRuleCall_0_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4048:6: (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4048:6: (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4049:2: kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )*
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleBINARY249388); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBINARY24Access().getDollarSignKeyword_1_0()); 
                        
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4054:1: (this_INT_4= RULE_INT )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_INT) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4054:6: this_INT_4= RULE_INT
                    	    {
                    	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBINARY249404); 

                    	    		current.merge(this_INT_4);
                    	        
                    	     
                    	        newLeafNode(this_INT_4, grammarAccess.getBINARY24Access().getINTTerminalRuleCall_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4061:3: (this_ID_5= RULE_ID )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_ID) ) {
                            int LA32_2 = input.LA(2);

                            if ( (LA32_2==EOF||LA32_2==RULE_ID||LA32_2==RULE_SC_COMMENT||(LA32_2>=17 && LA32_2<=20)||(LA32_2>=22 && LA32_2<=30)||(LA32_2>=32 && LA32_2<=58)) ) {
                                alt32=1;
                            }


                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4061:8: this_ID_5= RULE_ID
                    	    {
                    	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBINARY249427); 

                    	    		current.merge(this_ID_5);
                    	        
                    	     
                    	        newLeafNode(this_ID_5, grammarAccess.getBINARY24Access().getIDTerminalRuleCall_1_2()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


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
    // $ANTLR end "ruleBINARY24"


    // $ANTLR start "entryRuleBOOLEAN"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4076:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4077:2: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4078:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
             newCompositeNode(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN9476);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;

             current =iv_ruleBOOLEAN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN9487); 

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
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4085:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4088:28: ( (kw= 'true' | kw= 'false' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4089:1: (kw= 'true' | kw= 'false' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4089:1: (kw= 'true' | kw= 'false' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==67) ) {
                alt34=1;
            }
            else if ( (LA34_0==68) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4090:2: kw= 'true'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleBOOLEAN9525); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4097:2: kw= 'false'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleBOOLEAN9544); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 
                        

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
    // $ANTLR end "ruleBOOLEAN"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleProgram122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProgram139 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_rulePin_in_ruleProgram165 = new BitSet(new long[]{0x07FFFFFF7FDFE050L});
    public static final BitSet FOLLOW_ruleSpinElement_in_ruleProgram187 = new BitSet(new long[]{0x07FFFFFF7FDE0052L});
    public static final BitSet FOLLOW_rulePin_in_entryRulePin224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePin234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputPin_in_rulePin281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputPin_in_rulePin308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputPin_in_entryRuleInputPin343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputPin353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAudioInput_in_ruleInputPin400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlInput_in_ruleInputPin427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputPin_in_entryRuleOutputPin462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputPin472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAudioOutput_in_ruleOutputPin519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlOutput_in_ruleOutputPin546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAudioInput_in_entryRuleAudioInput581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAudioInput591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleAudioInput628 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAudioInput645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAudioInput667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAudioOutput_in_entryRuleAudioOutput708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAudioOutput718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAudioOutput755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAudioOutput772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAudioOutput794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlInput_in_entryRuleControlInput835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControlInput845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleControlInput882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleControlInput899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleControlInput921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlOutput_in_entryRuleControlOutput962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControlOutput972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleControlOutput1009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleControlOutput1026 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleControlOutput1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpinElement_in_entryRuleSpinElement1089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpinElement1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquate_in_ruleSpinElement1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_ruleSpinElement1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMem_in_ruleSpinElement1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleSpinElement1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleSpinElement1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleSpinElement1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMacro_in_ruleSpinElement1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOffset_in_ruleSpinElement1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquate_in_entryRuleEquate1370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquate1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEquate1417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEquate1434 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleEquate1460 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEquate1478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEquate1500 = new BitSet(new long[]{0x0800000000000032L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleEquate1527 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleEquate1548 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleEquate1569 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEquate1586 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEquate1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMem_in_entryRuleMem1654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMem1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMem1701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMem1718 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleMem1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOffset_in_entryRuleOffset1780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOffset1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOffset1827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOffset1844 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleOffset1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_entryRuleBool1907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBool1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBool1954 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBool1971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleBool1997 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBool2015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBool2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment2080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SC_COMMENT_in_ruleComment2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel2171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel2223 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleLabel2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMacro_in_entryRuleMacro2276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMacro2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsPinConnected_in_ruleMacro2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsTrue_in_ruleMacro2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsElse_in_ruleMacro2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsEndif_in_ruleMacro2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetInputDefault_in_ruleMacro2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDelayScaleControl_in_ruleMacro2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetOutputPin_in_ruleMacro2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetBaseAddress_in_ruleMacro2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsPinConnected_in_entryRuleIsPinConnected2557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsPinConnected2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleIsPinConnected2604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIsPinConnected2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsTrue_in_entryRuleIsTrue2662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsTrue2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleIsTrue2709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIsTrue2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsElse_in_entryRuleIsElse2767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsElse2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleIsElse2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsEndif_in_entryRuleIsEndif2859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsEndif2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleIsEndif2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetInputDefault_in_entryRuleGetInputDefault2951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetInputDefault2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleGetInputDefault2998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetInputDefault3015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetInputDefault3037 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleGetInputDefault3063 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleGetInputDefault3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDelayScaleControl_in_entryRuleGetDelayScaleControl3120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetDelayScaleControl3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleGetDelayScaleControl3167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3228 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetBaseAddress_in_entryRuleGetBaseAddress3292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetBaseAddress3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleGetBaseAddress3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetOutputPin_in_entryRuleSetOutputPin3384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetOutputPin3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSetOutputPin3431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetOutputPin3448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetOutputPin3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction3511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B15_S1_9_in_ruleInstruction3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B6_S1_14_in_ruleInstruction3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_S1_14_S1_10_in_ruleInstruction3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B6_in_ruleInstruction3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B24_in_ruleInstruction3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_ruleInstruction3703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJam_in_ruleInstruction3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_X0_in_ruleInstruction3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadSinLFO_in_ruleInstruction3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadRampLFO_in_ruleInstruction3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusReadDelay_in_ruleInstruction3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusReadValue_in_ruleInstruction3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusScaleOffset_in_ruleInstruction3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLog_in_ruleInstruction3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadDelayPointer_in_ruleInstruction3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B6_S1_14_in_entryRuleInst_B6_S1_143981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_B6_S1_143991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadRegister_in_ruleInst_B6_S1_144038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegister_in_ruleInst_B6_S1_144065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadRegisterFilter_in_ruleInst_B6_S1_144092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxx_in_ruleInst_B6_S1_144119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegisterHighshelf_in_ruleInst_B6_S1_144146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegisterLowshelf_in_ruleInst_B6_S1_144173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B15_S1_9_in_entryRuleInst_B15_S1_94208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_B15_S1_94218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadDelay_in_ruleInst_B15_S1_94265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteDelay_in_ruleInst_B15_S1_94292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteAllpass_in_ruleInst_B15_S1_94319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B6_in_entryRuleInst_B64354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_B64364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulx_in_ruleInst_B64411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLdax_in_ruleInst_B64438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B24_in_entryRuleInst_B244473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_B244483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleInst_B244530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleInst_B244557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_ruleInst_B244584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_X0_in_entryRuleInst_X04619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_X04629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClr_in_ruleInst_X04676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_ruleInst_X04703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsa_in_ruleInst_X04730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_S1_14_S1_10_in_entryRuleInst_S1_14_S1_104765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_S1_14_S1_104775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp_in_ruleInst_S1_14_S1_104822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleOffset_in_ruleInst_S1_14_S1_104849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadRegister_in_entryRuleReadRegister4884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadRegister4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleReadRegister4931 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleReadRegister4952 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleReadRegister4964 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleReadRegister4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegisterLowshelf_in_entryRuleWriteRegisterLowshelf5021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWriteRegisterLowshelf5031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleWriteRegisterLowshelf5068 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleWriteRegisterLowshelf5089 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleWriteRegisterLowshelf5101 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegisterLowshelf5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegisterHighshelf_in_entryRuleWriteRegisterHighshelf5158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWriteRegisterHighshelf5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleWriteRegisterHighshelf5205 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleWriteRegisterHighshelf5226 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleWriteRegisterHighshelf5238 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegisterHighshelf5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegister_in_entryRuleWriteRegister5295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWriteRegister5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleWriteRegister5342 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleWriteRegister5363 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleWriteRegister5375 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegister5396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxx_in_entryRuleMaxx5432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxx5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleMaxx5479 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleMaxx5500 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMaxx5512 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleMaxx5533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadRegisterFilter_in_entryRuleReadRegisterFilter5569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadRegisterFilter5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleReadRegisterFilter5616 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleReadRegisterFilter5637 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleReadRegisterFilter5649 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleReadRegisterFilter5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulx_in_entryRuleMulx5706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulx5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleMulx5753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMulx5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLdax_in_entryRuleLdax5811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLdax5821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleLdax5858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLdax5875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp_in_entryRuleExp5916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp5926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleExp5963 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleExp5984 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleExp5996 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleExp6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLog_in_entryRuleLog6053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLog6063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleLog6100 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleLog6121 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleLog6133 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleLog6154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleOffset_in_entryRuleScaleOffset6190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleOffset6200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleScaleOffset6237 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleScaleOffset6258 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleScaleOffset6270 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleScaleOffset6291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteDelay_in_entryRuleWriteDelay6327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWriteDelay6337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleWriteDelay6374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSPINMEM_in_ruleWriteDelay6395 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleWriteDelay6407 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleWriteDelay6428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteAllpass_in_entryRuleWriteAllpass6464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWriteAllpass6474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleWriteAllpass6511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSPINMEM_in_ruleWriteAllpass6532 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleWriteAllpass6544 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleWriteAllpass6565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadDelay_in_entryRuleReadDelay6601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadDelay6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleReadDelay6648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSPINMEM_in_ruleReadDelay6669 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleReadDelay6681 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleReadDelay6702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadSinLFO_in_entryRuleLoadSinLFO6738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoadSinLFO6748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleLoadSinLFO6785 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleLoadSinLFO6806 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleLoadSinLFO6818 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoadSinLFO6835 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleLoadSinLFO6852 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoadSinLFO6869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadRampLFO_in_entryRuleLoadRampLFO6910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoadRampLFO6920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleLoadRampLFO6957 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleLoadRampLFO6978 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleLoadRampLFO6990 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoadRampLFO7007 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleLoadRampLFO7024 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoadRampLFO7041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusReadDelay_in_entryRuleChorusReadDelay7082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChorusReadDelay7092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleChorusReadDelay7129 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleChorusReadDelay7141 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleChorusReadDelay7162 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleChorusReadDelay7174 = new BitSet(new long[]{0x0000000080000030L});
    public static final BitSet FOLLOW_ruleSPINCHOREGFLAGS_in_ruleChorusReadDelay7195 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleChorusReadDelay7207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSPINMEM_in_ruleChorusReadDelay7228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusReadValue_in_entryRuleChorusReadValue7264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChorusReadValue7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleChorusReadValue7311 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleChorusReadValue7323 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleChorusReadValue7344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusScaleOffset_in_entryRuleChorusScaleOffset7380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChorusScaleOffset7390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleChorusScaleOffset7427 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleChorusScaleOffset7439 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChorusScaleOffset7456 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleChorusScaleOffset7473 = new BitSet(new long[]{0x0000000080000030L});
    public static final BitSet FOLLOW_ruleSPINCHOREGFLAGS_in_ruleChorusScaleOffset7494 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleChorusScaleOffset7506 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleChorusScaleOffset7527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadDelayPointer_in_entryRuleReadDelayPointer7563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadDelayPointer7573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleReadDelayPointer7610 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleReadDelayPointer7631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd7667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd7677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAnd7714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleBINARY24_in_ruleAnd7735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr7771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr7781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleOr7818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleBINARY24_in_ruleOr7839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_entryRuleXor7875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXor7885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXor7922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleBINARY24_in_ruleXor7943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJam_in_entryRuleJam7979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJam7989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleJam8026 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJam8043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClr_in_entryRuleClr8084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClr8094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleClr8140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_entryRuleNot8176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNot8186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleNot8232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsa_in_entryRuleAbsa8268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsa8278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleAbsa8324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_entryRuleSkip8360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkip8370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleSkip8407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSkip8424 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleSkip8441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSkip8461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_entryRuleSPINDOUBLE8498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPINDOUBLE8509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleSPINDOUBLE8548 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINDOUBLE8566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSPINDOUBLE8593 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleSPINDOUBLE8612 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSPINDOUBLE8627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_entryRuleSPINREGISTER8677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPINREGISTER8688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINREGISTER8728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSPINREGISTER8754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPINCHOREGFLAGS_in_entryRuleSPINCHOREGFLAGS8800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPINCHOREGFLAGS8811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSPINCHOREGFLAGS8851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINCHOREGFLAGS8878 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleSPINCHOREGFLAGS8897 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINCHOREGFLAGS8912 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleSPINMEM_in_entryRuleSPINMEM8961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPINMEM8971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPINBUF_in_ruleSPINMEM9017 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSPINMEM9035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINMEM9066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPINBUF_in_entryRuleSPINBUF9105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPINBUF9116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINBUF9156 = new BitSet(new long[]{0xC800000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_62_in_ruleSPINBUF9175 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_63_in_ruleSPINBUF9194 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleSPINBUF9210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleSPINBUF9229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARY24_in_entryRuleBINARY249272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBINARY249283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleBINARY249323 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBINARY249338 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBINARY249360 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_66_in_ruleBINARY249388 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBINARY249404 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBINARY249427 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN9476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN9487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleBOOLEAN9525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleBOOLEAN9544 = new BitSet(new long[]{0x0000000000000002L});

}