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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_SC_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@name'", "'@audioInput'", "'@audioOutput'", "'@controlInput'", "'@controlOutput'", "'equ'", "'mem'", "'offset'", "':'", "'@isPinConnected'", "'@else'", "'@endif'", "'@getInputDefault'", "'@getDelayScaleControl'", "'@getBaseAddress'", "'@setOutputPin'", "'rdax'", "','", "'wrlx'", "'wrhx'", "'wrax'", "'maxx'", "'rdfx'", "'mulx'", "'ldax'", "'exp'", "'log'", "'sof'", "'wra'", "'wrap'", "'rda'", "'wlds'", "'wldr'", "'cho rda'", "'cho rdal'", "'cho sof'", "'rmpa'", "'and'", "'or'", "'xor'", "'jam'", "'clr'", "'not'", "'absa'", "'skp'", "'-'", "'.'", "'|'", "'#'", "'^'", "'+'", "'%'", "'$'"
    };
    public static final int RULE_SC_COMMENT=6;
    public static final int RULE_ID=4;
    public static final int T__64=64;
    public static final int T__29=29;
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

                if ( (LA2_0==RULE_ID||LA2_0==RULE_SC_COMMENT||(LA2_0>=17 && LA2_0<=19)||(LA2_0>=21 && LA2_0<=28)||(LA2_0>=30 && LA2_0<=56)) ) {
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:519:1: ruleSpinElement returns [EObject current=null] : (this_Equate_0= ruleEquate | this_Mem_1= ruleMem | this_Instruction_2= ruleInstruction | this_Label_3= ruleLabel | this_Comment_4= ruleComment | this_Macro_5= ruleMacro | this_Offset_6= ruleOffset ) ;
    public final EObject ruleSpinElement() throws RecognitionException {
        EObject current = null;

        EObject this_Equate_0 = null;

        EObject this_Mem_1 = null;

        EObject this_Instruction_2 = null;

        EObject this_Label_3 = null;

        EObject this_Comment_4 = null;

        EObject this_Macro_5 = null;

        EObject this_Offset_6 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:522:28: ( (this_Equate_0= ruleEquate | this_Mem_1= ruleMem | this_Instruction_2= ruleInstruction | this_Label_3= ruleLabel | this_Comment_4= ruleComment | this_Macro_5= ruleMacro | this_Offset_6= ruleOffset ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:523:1: (this_Equate_0= ruleEquate | this_Mem_1= ruleMem | this_Instruction_2= ruleInstruction | this_Label_3= ruleLabel | this_Comment_4= ruleComment | this_Macro_5= ruleMacro | this_Offset_6= ruleOffset )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:523:1: (this_Equate_0= ruleEquate | this_Mem_1= ruleMem | this_Instruction_2= ruleInstruction | this_Label_3= ruleLabel | this_Comment_4= ruleComment | this_Macro_5= ruleMacro | this_Offset_6= ruleOffset )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 28:
            case 30:
            case 31:
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
                {
                alt6=3;
                }
                break;
            case RULE_ID:
                {
                alt6=4;
                }
                break;
            case RULE_SC_COMMENT:
                {
                alt6=5;
                }
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt6=6;
                }
                break;
            case 19:
                {
                alt6=7;
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
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:534:5: this_Mem_1= ruleMem
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getMemParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMem_in_ruleSpinElement1173);
                    this_Mem_1=ruleMem();

                    state._fsp--;

                     
                            current = this_Mem_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:544:5: this_Instruction_2= ruleInstruction
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getInstructionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInstruction_in_ruleSpinElement1200);
                    this_Instruction_2=ruleInstruction();

                    state._fsp--;

                     
                            current = this_Instruction_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:554:5: this_Label_3= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getLabelParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleSpinElement1227);
                    this_Label_3=ruleLabel();

                    state._fsp--;

                     
                            current = this_Label_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:564:5: this_Comment_4= ruleComment
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getCommentParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleComment_in_ruleSpinElement1254);
                    this_Comment_4=ruleComment();

                    state._fsp--;

                     
                            current = this_Comment_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:574:5: this_Macro_5= ruleMacro
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getMacroParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleMacro_in_ruleSpinElement1281);
                    this_Macro_5=ruleMacro();

                    state._fsp--;

                     
                            current = this_Macro_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:584:5: this_Offset_6= ruleOffset
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getOffsetParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleOffset_in_ruleSpinElement1308);
                    this_Offset_6=ruleOffset();

                    state._fsp--;

                     
                            current = this_Offset_6; 
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:600:1: entryRuleEquate returns [EObject current=null] : iv_ruleEquate= ruleEquate EOF ;
    public final EObject entryRuleEquate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquate = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:601:2: (iv_ruleEquate= ruleEquate EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:602:2: iv_ruleEquate= ruleEquate EOF
            {
             newCompositeNode(grammarAccess.getEquateRule()); 
            pushFollow(FOLLOW_ruleEquate_in_entryRuleEquate1343);
            iv_ruleEquate=ruleEquate();

            state._fsp--;

             current =iv_ruleEquate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquate1353); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:609:1: ruleEquate returns [EObject current=null] : (otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) ( ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) ) ( (lv_max_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) )? ) ;
    public final EObject ruleEquate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ename_1_0=null;
        Token lv_controlType_3_0=null;
        Token lv_controlName_4_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_max_5_0 = null;

        AntlrDatatypeRuleToken lv_multiplier_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:612:28: ( (otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) ( ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) ) ( (lv_max_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) )? ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:613:1: (otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) ( ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) ) ( (lv_max_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) )? )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:613:1: (otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) ( ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) ) ( (lv_max_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) )? )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:613:3: otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) ( ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) ) ( (lv_max_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleEquate1390); 

                	newLeafNode(otherlv_0, grammarAccess.getEquateAccess().getEquKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:617:1: ( (lv_ename_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:618:1: (lv_ename_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:618:1: (lv_ename_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:619:3: lv_ename_1_0= RULE_ID
            {
            lv_ename_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEquate1407); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:635:2: ( (lv_value_2_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:636:1: (lv_value_2_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:636:1: (lv_value_2_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:637:3: lv_value_2_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getEquateAccess().getValueSPINDOUBLEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleEquate1433);
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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:653:2: ( ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) ) ( (lv_max_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:653:3: ( (lv_controlType_3_0= RULE_ID ) ) ( (lv_controlName_4_0= RULE_ID ) ) ( (lv_max_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:653:3: ( (lv_controlType_3_0= RULE_ID ) )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:654:1: (lv_controlType_3_0= RULE_ID )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:654:1: (lv_controlType_3_0= RULE_ID )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:655:3: lv_controlType_3_0= RULE_ID
                    {
                    lv_controlType_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEquate1451); 

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

                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:671:2: ( (lv_controlName_4_0= RULE_ID ) )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:672:1: (lv_controlName_4_0= RULE_ID )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:672:1: (lv_controlName_4_0= RULE_ID )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:673:3: lv_controlName_4_0= RULE_ID
                    {
                    lv_controlName_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEquate1473); 

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

                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:689:2: ( (lv_max_5_0= ruleSPINDOUBLE ) )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:690:1: (lv_max_5_0= ruleSPINDOUBLE )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:690:1: (lv_max_5_0= ruleSPINDOUBLE )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:691:3: lv_max_5_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getEquateAccess().getMaxSPINDOUBLEParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleEquate1499);
                    lv_max_5_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEquateRule());
                    	        }
                           		set(
                           			current, 
                           			"max",
                            		lv_max_5_0, 
                            		"SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:707:2: ( (lv_multiplier_6_0= ruleSPINDOUBLE ) )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:708:1: (lv_multiplier_6_0= ruleSPINDOUBLE )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:708:1: (lv_multiplier_6_0= ruleSPINDOUBLE )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:709:3: lv_multiplier_6_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getEquateAccess().getMultiplierSPINDOUBLEParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleEquate1520);
                    lv_multiplier_6_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEquateRule());
                    	        }
                           		set(
                           			current, 
                           			"multiplier",
                            		lv_multiplier_6_0, 
                            		"SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleEquate"


    // $ANTLR start "entryRuleMem"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:733:1: entryRuleMem returns [EObject current=null] : iv_ruleMem= ruleMem EOF ;
    public final EObject entryRuleMem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMem = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:734:2: (iv_ruleMem= ruleMem EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:735:2: iv_ruleMem= ruleMem EOF
            {
             newCompositeNode(grammarAccess.getMemRule()); 
            pushFollow(FOLLOW_ruleMem_in_entryRuleMem1558);
            iv_ruleMem=ruleMem();

            state._fsp--;

             current =iv_ruleMem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMem1568); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:742:1: ruleMem returns [EObject current=null] : (otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) ) ) ;
    public final EObject ruleMem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_buffer_1_0=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:745:28: ( (otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:746:1: (otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:746:1: (otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:746:3: otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleMem1605); 

                	newLeafNode(otherlv_0, grammarAccess.getMemAccess().getMemKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:750:1: ( (lv_buffer_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:751:1: (lv_buffer_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:751:1: (lv_buffer_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:752:3: lv_buffer_1_0= RULE_ID
            {
            lv_buffer_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMem1622); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:768:2: ( (lv_length_2_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:769:1: (lv_length_2_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:769:1: (lv_length_2_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:770:3: lv_length_2_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getMemAccess().getLengthSPINREGISTERParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleMem1648);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:794:1: entryRuleOffset returns [EObject current=null] : iv_ruleOffset= ruleOffset EOF ;
    public final EObject entryRuleOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOffset = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:795:2: (iv_ruleOffset= ruleOffset EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:796:2: iv_ruleOffset= ruleOffset EOF
            {
             newCompositeNode(grammarAccess.getOffsetRule()); 
            pushFollow(FOLLOW_ruleOffset_in_entryRuleOffset1684);
            iv_ruleOffset=ruleOffset();

            state._fsp--;

             current =iv_ruleOffset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOffset1694); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:803:1: ruleOffset returns [EObject current=null] : (otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) ) ) ;
    public final EObject ruleOffset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_length_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:806:28: ( (otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:807:1: (otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:807:1: (otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:807:3: otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleOffset1731); 

                	newLeafNode(otherlv_0, grammarAccess.getOffsetAccess().getOffsetKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:811:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:812:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:812:1: (lv_name_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:813:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOffset1748); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:829:2: ( (lv_length_2_0= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:830:1: (lv_length_2_0= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:830:1: (lv_length_2_0= RULE_INT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:831:3: lv_length_2_0= RULE_INT
            {
            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleOffset1770); 

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


    // $ANTLR start "entryRuleComment"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:855:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:856:2: (iv_ruleComment= ruleComment EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:857:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment1811);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment1821); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:864:1: ruleComment returns [EObject current=null] : ( (lv_remark_0_0= RULE_SC_COMMENT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_remark_0_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:867:28: ( ( (lv_remark_0_0= RULE_SC_COMMENT ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:868:1: ( (lv_remark_0_0= RULE_SC_COMMENT ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:868:1: ( (lv_remark_0_0= RULE_SC_COMMENT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:869:1: (lv_remark_0_0= RULE_SC_COMMENT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:869:1: (lv_remark_0_0= RULE_SC_COMMENT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:870:3: lv_remark_0_0= RULE_SC_COMMENT
            {
            lv_remark_0_0=(Token)match(input,RULE_SC_COMMENT,FOLLOW_RULE_SC_COMMENT_in_ruleComment1862); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:894:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:895:2: (iv_ruleLabel= ruleLabel EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:896:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel1902);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel1912); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:903:1: ruleLabel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:906:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:907:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:907:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:907:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:907:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:908:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:908:1: (lv_name_0_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:909:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel1954); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleLabel1971); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:937:1: entryRuleMacro returns [EObject current=null] : iv_ruleMacro= ruleMacro EOF ;
    public final EObject entryRuleMacro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacro = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:938:2: (iv_ruleMacro= ruleMacro EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:939:2: iv_ruleMacro= ruleMacro EOF
            {
             newCompositeNode(grammarAccess.getMacroRule()); 
            pushFollow(FOLLOW_ruleMacro_in_entryRuleMacro2007);
            iv_ruleMacro=ruleMacro();

            state._fsp--;

             current =iv_ruleMacro; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMacro2017); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:946:1: ruleMacro returns [EObject current=null] : (this_IsPinConnected_0= ruleIsPinConnected | this_IsElse_1= ruleIsElse | this_IsEndif_2= ruleIsEndif | this_GetInputDefault_3= ruleGetInputDefault | this_GetDelayScaleControl_4= ruleGetDelayScaleControl | this_SetOutputPin_5= ruleSetOutputPin | this_GetBaseAddress_6= ruleGetBaseAddress ) ;
    public final EObject ruleMacro() throws RecognitionException {
        EObject current = null;

        EObject this_IsPinConnected_0 = null;

        EObject this_IsElse_1 = null;

        EObject this_IsEndif_2 = null;

        EObject this_GetInputDefault_3 = null;

        EObject this_GetDelayScaleControl_4 = null;

        EObject this_SetOutputPin_5 = null;

        EObject this_GetBaseAddress_6 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:949:28: ( (this_IsPinConnected_0= ruleIsPinConnected | this_IsElse_1= ruleIsElse | this_IsEndif_2= ruleIsEndif | this_GetInputDefault_3= ruleGetInputDefault | this_GetDelayScaleControl_4= ruleGetDelayScaleControl | this_SetOutputPin_5= ruleSetOutputPin | this_GetBaseAddress_6= ruleGetBaseAddress ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:950:1: (this_IsPinConnected_0= ruleIsPinConnected | this_IsElse_1= ruleIsElse | this_IsEndif_2= ruleIsEndif | this_GetInputDefault_3= ruleGetInputDefault | this_GetDelayScaleControl_4= ruleGetDelayScaleControl | this_SetOutputPin_5= ruleSetOutputPin | this_GetBaseAddress_6= ruleGetBaseAddress )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:950:1: (this_IsPinConnected_0= ruleIsPinConnected | this_IsElse_1= ruleIsElse | this_IsEndif_2= ruleIsEndif | this_GetInputDefault_3= ruleGetInputDefault | this_GetDelayScaleControl_4= ruleGetDelayScaleControl | this_SetOutputPin_5= ruleSetOutputPin | this_GetBaseAddress_6= ruleGetBaseAddress )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
                {
                alt8=4;
                }
                break;
            case 25:
                {
                alt8=5;
                }
                break;
            case 27:
                {
                alt8=6;
                }
                break;
            case 26:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:951:5: this_IsPinConnected_0= ruleIsPinConnected
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsPinConnectedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIsPinConnected_in_ruleMacro2064);
                    this_IsPinConnected_0=ruleIsPinConnected();

                    state._fsp--;

                     
                            current = this_IsPinConnected_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:961:5: this_IsElse_1= ruleIsElse
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsElseParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIsElse_in_ruleMacro2091);
                    this_IsElse_1=ruleIsElse();

                    state._fsp--;

                     
                            current = this_IsElse_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:971:5: this_IsEndif_2= ruleIsEndif
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsEndifParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIsEndif_in_ruleMacro2118);
                    this_IsEndif_2=ruleIsEndif();

                    state._fsp--;

                     
                            current = this_IsEndif_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:981:5: this_GetInputDefault_3= ruleGetInputDefault
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getGetInputDefaultParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleGetInputDefault_in_ruleMacro2145);
                    this_GetInputDefault_3=ruleGetInputDefault();

                    state._fsp--;

                     
                            current = this_GetInputDefault_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:991:5: this_GetDelayScaleControl_4= ruleGetDelayScaleControl
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getGetDelayScaleControlParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleGetDelayScaleControl_in_ruleMacro2172);
                    this_GetDelayScaleControl_4=ruleGetDelayScaleControl();

                    state._fsp--;

                     
                            current = this_GetDelayScaleControl_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1001:5: this_SetOutputPin_5= ruleSetOutputPin
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getSetOutputPinParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSetOutputPin_in_ruleMacro2199);
                    this_SetOutputPin_5=ruleSetOutputPin();

                    state._fsp--;

                     
                            current = this_SetOutputPin_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1011:5: this_GetBaseAddress_6= ruleGetBaseAddress
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getGetBaseAddressParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleGetBaseAddress_in_ruleMacro2226);
                    this_GetBaseAddress_6=ruleGetBaseAddress();

                    state._fsp--;

                     
                            current = this_GetBaseAddress_6; 
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1027:1: entryRuleIsPinConnected returns [EObject current=null] : iv_ruleIsPinConnected= ruleIsPinConnected EOF ;
    public final EObject entryRuleIsPinConnected() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsPinConnected = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1028:2: (iv_ruleIsPinConnected= ruleIsPinConnected EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1029:2: iv_ruleIsPinConnected= ruleIsPinConnected EOF
            {
             newCompositeNode(grammarAccess.getIsPinConnectedRule()); 
            pushFollow(FOLLOW_ruleIsPinConnected_in_entryRuleIsPinConnected2261);
            iv_ruleIsPinConnected=ruleIsPinConnected();

            state._fsp--;

             current =iv_ruleIsPinConnected; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsPinConnected2271); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1036:1: ruleIsPinConnected returns [EObject current=null] : (otherlv_0= '@isPinConnected' ( (lv_arg1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIsPinConnected() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1039:28: ( (otherlv_0= '@isPinConnected' ( (lv_arg1_1_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1040:1: (otherlv_0= '@isPinConnected' ( (lv_arg1_1_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1040:1: (otherlv_0= '@isPinConnected' ( (lv_arg1_1_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1040:3: otherlv_0= '@isPinConnected' ( (lv_arg1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleIsPinConnected2308); 

                	newLeafNode(otherlv_0, grammarAccess.getIsPinConnectedAccess().getIsPinConnectedKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1044:1: ( (lv_arg1_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1045:1: (lv_arg1_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1045:1: (lv_arg1_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1046:3: lv_arg1_1_0= RULE_ID
            {
            lv_arg1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIsPinConnected2325); 

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


    // $ANTLR start "entryRuleIsElse"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1070:1: entryRuleIsElse returns [EObject current=null] : iv_ruleIsElse= ruleIsElse EOF ;
    public final EObject entryRuleIsElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsElse = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1071:2: (iv_ruleIsElse= ruleIsElse EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1072:2: iv_ruleIsElse= ruleIsElse EOF
            {
             newCompositeNode(grammarAccess.getIsElseRule()); 
            pushFollow(FOLLOW_ruleIsElse_in_entryRuleIsElse2366);
            iv_ruleIsElse=ruleIsElse();

            state._fsp--;

             current =iv_ruleIsElse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsElse2376); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1079:1: ruleIsElse returns [EObject current=null] : ( () otherlv_1= '@else' ) ;
    public final EObject ruleIsElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1082:28: ( ( () otherlv_1= '@else' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1083:1: ( () otherlv_1= '@else' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1083:1: ( () otherlv_1= '@else' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1083:2: () otherlv_1= '@else'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1083:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1084:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIsElseAccess().getIsElseAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleIsElse2422); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1101:1: entryRuleIsEndif returns [EObject current=null] : iv_ruleIsEndif= ruleIsEndif EOF ;
    public final EObject entryRuleIsEndif() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsEndif = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1102:2: (iv_ruleIsEndif= ruleIsEndif EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1103:2: iv_ruleIsEndif= ruleIsEndif EOF
            {
             newCompositeNode(grammarAccess.getIsEndifRule()); 
            pushFollow(FOLLOW_ruleIsEndif_in_entryRuleIsEndif2458);
            iv_ruleIsEndif=ruleIsEndif();

            state._fsp--;

             current =iv_ruleIsEndif; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsEndif2468); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1110:1: ruleIsEndif returns [EObject current=null] : ( () otherlv_1= '@endif' ) ;
    public final EObject ruleIsEndif() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1113:28: ( ( () otherlv_1= '@endif' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1114:1: ( () otherlv_1= '@endif' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1114:1: ( () otherlv_1= '@endif' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1114:2: () otherlv_1= '@endif'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1114:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1115:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIsEndifAccess().getIsEndifAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleIsEndif2514); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1132:1: entryRuleGetInputDefault returns [EObject current=null] : iv_ruleGetInputDefault= ruleGetInputDefault EOF ;
    public final EObject entryRuleGetInputDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetInputDefault = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1133:2: (iv_ruleGetInputDefault= ruleGetInputDefault EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1134:2: iv_ruleGetInputDefault= ruleGetInputDefault EOF
            {
             newCompositeNode(grammarAccess.getGetInputDefaultRule()); 
            pushFollow(FOLLOW_ruleGetInputDefault_in_entryRuleGetInputDefault2550);
            iv_ruleGetInputDefault=ruleGetInputDefault();

            state._fsp--;

             current =iv_ruleGetInputDefault; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetInputDefault2560); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1141:1: ruleGetInputDefault returns [EObject current=null] : (otherlv_0= '@getInputDefault' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleGetInputDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_variable_2_0=null;
        AntlrDatatypeRuleToken lv_scale_3_0 = null;

        AntlrDatatypeRuleToken lv_defaultVal_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1144:28: ( (otherlv_0= '@getInputDefault' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1145:1: (otherlv_0= '@getInputDefault' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1145:1: (otherlv_0= '@getInputDefault' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1145:3: otherlv_0= '@getInputDefault' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleGetInputDefault2597); 

                	newLeafNode(otherlv_0, grammarAccess.getGetInputDefaultAccess().getGetInputDefaultKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1149:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1150:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1150:1: (lv_name_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1151:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetInputDefault2614); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1167:2: ( (lv_variable_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1168:1: (lv_variable_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1168:1: (lv_variable_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1169:3: lv_variable_2_0= RULE_ID
            {
            lv_variable_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetInputDefault2636); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1185:2: ( (lv_scale_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1186:1: (lv_scale_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1186:1: (lv_scale_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1187:3: lv_scale_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getGetInputDefaultAccess().getScaleSPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleGetInputDefault2662);
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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1203:2: ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1204:1: (lv_defaultVal_4_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1204:1: (lv_defaultVal_4_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1205:3: lv_defaultVal_4_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getGetInputDefaultAccess().getDefaultValSPINDOUBLEParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleGetInputDefault2683);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1229:1: entryRuleGetDelayScaleControl returns [EObject current=null] : iv_ruleGetDelayScaleControl= ruleGetDelayScaleControl EOF ;
    public final EObject entryRuleGetDelayScaleControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetDelayScaleControl = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1230:2: (iv_ruleGetDelayScaleControl= ruleGetDelayScaleControl EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1231:2: iv_ruleGetDelayScaleControl= ruleGetDelayScaleControl EOF
            {
             newCompositeNode(grammarAccess.getGetDelayScaleControlRule()); 
            pushFollow(FOLLOW_ruleGetDelayScaleControl_in_entryRuleGetDelayScaleControl2719);
            iv_ruleGetDelayScaleControl=ruleGetDelayScaleControl();

            state._fsp--;

             current =iv_ruleGetDelayScaleControl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetDelayScaleControl2729); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1238:1: ruleGetDelayScaleControl returns [EObject current=null] : (otherlv_0= '@getDelayScaleControl' ( (lv_ratio_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_offset_3_0= RULE_ID ) ) ( (lv_control_4_0= RULE_ID ) )? ) ;
    public final EObject ruleGetDelayScaleControl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ratio_1_0=null;
        Token lv_length_2_0=null;
        Token lv_offset_3_0=null;
        Token lv_control_4_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1241:28: ( (otherlv_0= '@getDelayScaleControl' ( (lv_ratio_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_offset_3_0= RULE_ID ) ) ( (lv_control_4_0= RULE_ID ) )? ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1242:1: (otherlv_0= '@getDelayScaleControl' ( (lv_ratio_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_offset_3_0= RULE_ID ) ) ( (lv_control_4_0= RULE_ID ) )? )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1242:1: (otherlv_0= '@getDelayScaleControl' ( (lv_ratio_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_offset_3_0= RULE_ID ) ) ( (lv_control_4_0= RULE_ID ) )? )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1242:3: otherlv_0= '@getDelayScaleControl' ( (lv_ratio_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_offset_3_0= RULE_ID ) ) ( (lv_control_4_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleGetDelayScaleControl2766); 

                	newLeafNode(otherlv_0, grammarAccess.getGetDelayScaleControlAccess().getGetDelayScaleControlKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1246:1: ( (lv_ratio_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1247:1: (lv_ratio_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1247:1: (lv_ratio_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1248:3: lv_ratio_1_0= RULE_ID
            {
            lv_ratio_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetDelayScaleControl2783); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1264:2: ( (lv_length_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1265:1: (lv_length_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1265:1: (lv_length_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1266:3: lv_length_2_0= RULE_ID
            {
            lv_length_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetDelayScaleControl2805); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1282:2: ( (lv_offset_3_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1283:1: (lv_offset_3_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1283:1: (lv_offset_3_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1284:3: lv_offset_3_0= RULE_ID
            {
            lv_offset_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetDelayScaleControl2827); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1300:2: ( (lv_control_4_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||LA9_1==RULE_ID||LA9_1==RULE_SC_COMMENT||(LA9_1>=17 && LA9_1<=19)||(LA9_1>=21 && LA9_1<=28)||(LA9_1>=30 && LA9_1<=56)) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1301:1: (lv_control_4_0= RULE_ID )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1301:1: (lv_control_4_0= RULE_ID )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1302:3: lv_control_4_0= RULE_ID
                    {
                    lv_control_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetDelayScaleControl2849); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1326:1: entryRuleGetBaseAddress returns [EObject current=null] : iv_ruleGetBaseAddress= ruleGetBaseAddress EOF ;
    public final EObject entryRuleGetBaseAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetBaseAddress = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1327:2: (iv_ruleGetBaseAddress= ruleGetBaseAddress EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1328:2: iv_ruleGetBaseAddress= ruleGetBaseAddress EOF
            {
             newCompositeNode(grammarAccess.getGetBaseAddressRule()); 
            pushFollow(FOLLOW_ruleGetBaseAddress_in_entryRuleGetBaseAddress2891);
            iv_ruleGetBaseAddress=ruleGetBaseAddress();

            state._fsp--;

             current =iv_ruleGetBaseAddress; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetBaseAddress2901); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1335:1: ruleGetBaseAddress returns [EObject current=null] : ( () otherlv_1= '@getBaseAddress' ) ;
    public final EObject ruleGetBaseAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1338:28: ( ( () otherlv_1= '@getBaseAddress' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1339:1: ( () otherlv_1= '@getBaseAddress' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1339:1: ( () otherlv_1= '@getBaseAddress' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1339:2: () otherlv_1= '@getBaseAddress'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1339:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1340:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGetBaseAddressAccess().getGetBaseAddressAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleGetBaseAddress2947); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1357:1: entryRuleSetOutputPin returns [EObject current=null] : iv_ruleSetOutputPin= ruleSetOutputPin EOF ;
    public final EObject entryRuleSetOutputPin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetOutputPin = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1358:2: (iv_ruleSetOutputPin= ruleSetOutputPin EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1359:2: iv_ruleSetOutputPin= ruleSetOutputPin EOF
            {
             newCompositeNode(grammarAccess.getSetOutputPinRule()); 
            pushFollow(FOLLOW_ruleSetOutputPin_in_entryRuleSetOutputPin2983);
            iv_ruleSetOutputPin=ruleSetOutputPin();

            state._fsp--;

             current =iv_ruleSetOutputPin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetOutputPin2993); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1366:1: ruleSetOutputPin returns [EObject current=null] : (otherlv_0= '@setOutputPin' ( (lv_pinName_1_0= RULE_ID ) ) ( (lv_varName_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSetOutputPin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_pinName_1_0=null;
        Token lv_varName_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1369:28: ( (otherlv_0= '@setOutputPin' ( (lv_pinName_1_0= RULE_ID ) ) ( (lv_varName_2_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1370:1: (otherlv_0= '@setOutputPin' ( (lv_pinName_1_0= RULE_ID ) ) ( (lv_varName_2_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1370:1: (otherlv_0= '@setOutputPin' ( (lv_pinName_1_0= RULE_ID ) ) ( (lv_varName_2_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1370:3: otherlv_0= '@setOutputPin' ( (lv_pinName_1_0= RULE_ID ) ) ( (lv_varName_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleSetOutputPin3030); 

                	newLeafNode(otherlv_0, grammarAccess.getSetOutputPinAccess().getSetOutputPinKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1374:1: ( (lv_pinName_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1375:1: (lv_pinName_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1375:1: (lv_pinName_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1376:3: lv_pinName_1_0= RULE_ID
            {
            lv_pinName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetOutputPin3047); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1392:2: ( (lv_varName_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1393:1: (lv_varName_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1393:1: (lv_varName_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1394:3: lv_varName_2_0= RULE_ID
            {
            lv_varName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetOutputPin3069); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1418:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1419:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1420:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction3110);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction3120); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1427:1: ruleInstruction returns [EObject current=null] : (this_Inst_B15_S1_9_0= ruleInst_B15_S1_9 | this_Inst_B6_S1_14_1= ruleInst_B6_S1_14 | this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10 | this_Inst_B6_3= ruleInst_B6 | this_Inst_B24_4= ruleInst_B24 | this_Skip_5= ruleSkip | this_Jam_6= ruleJam | this_Inst_X0_7= ruleInst_X0 | this_LoadSinLFO_8= ruleLoadSinLFO | this_LoadRampLFO_9= ruleLoadRampLFO | this_ChorusReadDelay_10= ruleChorusReadDelay | this_ChorusReadValue_11= ruleChorusReadValue | this_ChorusScaleOffset_12= ruleChorusScaleOffset | this_Log_13= ruleLog | this_ReadDelayPointer_14= ruleReadDelayPointer ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1430:28: ( (this_Inst_B15_S1_9_0= ruleInst_B15_S1_9 | this_Inst_B6_S1_14_1= ruleInst_B6_S1_14 | this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10 | this_Inst_B6_3= ruleInst_B6 | this_Inst_B24_4= ruleInst_B24 | this_Skip_5= ruleSkip | this_Jam_6= ruleJam | this_Inst_X0_7= ruleInst_X0 | this_LoadSinLFO_8= ruleLoadSinLFO | this_LoadRampLFO_9= ruleLoadRampLFO | this_ChorusReadDelay_10= ruleChorusReadDelay | this_ChorusReadValue_11= ruleChorusReadValue | this_ChorusScaleOffset_12= ruleChorusScaleOffset | this_Log_13= ruleLog | this_ReadDelayPointer_14= ruleReadDelayPointer ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1431:1: (this_Inst_B15_S1_9_0= ruleInst_B15_S1_9 | this_Inst_B6_S1_14_1= ruleInst_B6_S1_14 | this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10 | this_Inst_B6_3= ruleInst_B6 | this_Inst_B24_4= ruleInst_B24 | this_Skip_5= ruleSkip | this_Jam_6= ruleJam | this_Inst_X0_7= ruleInst_X0 | this_LoadSinLFO_8= ruleLoadSinLFO | this_LoadRampLFO_9= ruleLoadRampLFO | this_ChorusReadDelay_10= ruleChorusReadDelay | this_ChorusReadValue_11= ruleChorusReadValue | this_ChorusScaleOffset_12= ruleChorusScaleOffset | this_Log_13= ruleLog | this_ReadDelayPointer_14= ruleReadDelayPointer )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1431:1: (this_Inst_B15_S1_9_0= ruleInst_B15_S1_9 | this_Inst_B6_S1_14_1= ruleInst_B6_S1_14 | this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10 | this_Inst_B6_3= ruleInst_B6 | this_Inst_B24_4= ruleInst_B24 | this_Skip_5= ruleSkip | this_Jam_6= ruleJam | this_Inst_X0_7= ruleInst_X0 | this_LoadSinLFO_8= ruleLoadSinLFO | this_LoadRampLFO_9= ruleLoadRampLFO | this_ChorusReadDelay_10= ruleChorusReadDelay | this_ChorusReadValue_11= ruleChorusReadValue | this_ChorusScaleOffset_12= ruleChorusScaleOffset | this_Log_13= ruleLog | this_ReadDelayPointer_14= ruleReadDelayPointer )
            int alt10=15;
            switch ( input.LA(1) ) {
            case 40:
            case 41:
            case 42:
                {
                alt10=1;
                }
                break;
            case 28:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt10=2;
                }
                break;
            case 37:
            case 39:
                {
                alt10=3;
                }
                break;
            case 35:
            case 36:
                {
                alt10=4;
                }
                break;
            case 49:
            case 50:
            case 51:
                {
                alt10=5;
                }
                break;
            case 56:
                {
                alt10=6;
                }
                break;
            case 52:
                {
                alt10=7;
                }
                break;
            case 53:
            case 54:
            case 55:
                {
                alt10=8;
                }
                break;
            case 43:
                {
                alt10=9;
                }
                break;
            case 44:
                {
                alt10=10;
                }
                break;
            case 45:
                {
                alt10=11;
                }
                break;
            case 46:
                {
                alt10=12;
                }
                break;
            case 47:
                {
                alt10=13;
                }
                break;
            case 38:
                {
                alt10=14;
                }
                break;
            case 48:
                {
                alt10=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1432:5: this_Inst_B15_S1_9_0= ruleInst_B15_S1_9
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_B15_S1_9ParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInst_B15_S1_9_in_ruleInstruction3167);
                    this_Inst_B15_S1_9_0=ruleInst_B15_S1_9();

                    state._fsp--;

                     
                            current = this_Inst_B15_S1_9_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1442:5: this_Inst_B6_S1_14_1= ruleInst_B6_S1_14
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_B6_S1_14ParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInst_B6_S1_14_in_ruleInstruction3194);
                    this_Inst_B6_S1_14_1=ruleInst_B6_S1_14();

                    state._fsp--;

                     
                            current = this_Inst_B6_S1_14_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1452:5: this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_S1_14_S1_10ParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInst_S1_14_S1_10_in_ruleInstruction3221);
                    this_Inst_S1_14_S1_10_2=ruleInst_S1_14_S1_10();

                    state._fsp--;

                     
                            current = this_Inst_S1_14_S1_10_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1462:5: this_Inst_B6_3= ruleInst_B6
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_B6ParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleInst_B6_in_ruleInstruction3248);
                    this_Inst_B6_3=ruleInst_B6();

                    state._fsp--;

                     
                            current = this_Inst_B6_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1472:5: this_Inst_B24_4= ruleInst_B24
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_B24ParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleInst_B24_in_ruleInstruction3275);
                    this_Inst_B24_4=ruleInst_B24();

                    state._fsp--;

                     
                            current = this_Inst_B24_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1482:5: this_Skip_5= ruleSkip
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getSkipParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSkip_in_ruleInstruction3302);
                    this_Skip_5=ruleSkip();

                    state._fsp--;

                     
                            current = this_Skip_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1492:5: this_Jam_6= ruleJam
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getJamParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleJam_in_ruleInstruction3329);
                    this_Jam_6=ruleJam();

                    state._fsp--;

                     
                            current = this_Jam_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1502:5: this_Inst_X0_7= ruleInst_X0
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_X0ParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleInst_X0_in_ruleInstruction3356);
                    this_Inst_X0_7=ruleInst_X0();

                    state._fsp--;

                     
                            current = this_Inst_X0_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1512:5: this_LoadSinLFO_8= ruleLoadSinLFO
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLoadSinLFOParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleLoadSinLFO_in_ruleInstruction3383);
                    this_LoadSinLFO_8=ruleLoadSinLFO();

                    state._fsp--;

                     
                            current = this_LoadSinLFO_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1522:5: this_LoadRampLFO_9= ruleLoadRampLFO
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLoadRampLFOParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleLoadRampLFO_in_ruleInstruction3410);
                    this_LoadRampLFO_9=ruleLoadRampLFO();

                    state._fsp--;

                     
                            current = this_LoadRampLFO_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1532:5: this_ChorusReadDelay_10= ruleChorusReadDelay
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getChorusReadDelayParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleChorusReadDelay_in_ruleInstruction3437);
                    this_ChorusReadDelay_10=ruleChorusReadDelay();

                    state._fsp--;

                     
                            current = this_ChorusReadDelay_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1542:5: this_ChorusReadValue_11= ruleChorusReadValue
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getChorusReadValueParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleChorusReadValue_in_ruleInstruction3464);
                    this_ChorusReadValue_11=ruleChorusReadValue();

                    state._fsp--;

                     
                            current = this_ChorusReadValue_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1552:5: this_ChorusScaleOffset_12= ruleChorusScaleOffset
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getChorusScaleOffsetParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleChorusScaleOffset_in_ruleInstruction3491);
                    this_ChorusScaleOffset_12=ruleChorusScaleOffset();

                    state._fsp--;

                     
                            current = this_ChorusScaleOffset_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1562:5: this_Log_13= ruleLog
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLogParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleLog_in_ruleInstruction3518);
                    this_Log_13=ruleLog();

                    state._fsp--;

                     
                            current = this_Log_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1572:5: this_ReadDelayPointer_14= ruleReadDelayPointer
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getReadDelayPointerParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleReadDelayPointer_in_ruleInstruction3545);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1588:1: entryRuleInst_B6_S1_14 returns [EObject current=null] : iv_ruleInst_B6_S1_14= ruleInst_B6_S1_14 EOF ;
    public final EObject entryRuleInst_B6_S1_14() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_B6_S1_14 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1589:2: (iv_ruleInst_B6_S1_14= ruleInst_B6_S1_14 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1590:2: iv_ruleInst_B6_S1_14= ruleInst_B6_S1_14 EOF
            {
             newCompositeNode(grammarAccess.getInst_B6_S1_14Rule()); 
            pushFollow(FOLLOW_ruleInst_B6_S1_14_in_entryRuleInst_B6_S1_143580);
            iv_ruleInst_B6_S1_14=ruleInst_B6_S1_14();

            state._fsp--;

             current =iv_ruleInst_B6_S1_14; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_B6_S1_143590); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1597:1: ruleInst_B6_S1_14 returns [EObject current=null] : (this_ReadRegister_0= ruleReadRegister | this_WriteRegister_1= ruleWriteRegister | this_ReadRegisterFilter_2= ruleReadRegisterFilter | this_Maxx_3= ruleMaxx | this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf | this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1600:28: ( (this_ReadRegister_0= ruleReadRegister | this_WriteRegister_1= ruleWriteRegister | this_ReadRegisterFilter_2= ruleReadRegisterFilter | this_Maxx_3= ruleMaxx | this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf | this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1601:1: (this_ReadRegister_0= ruleReadRegister | this_WriteRegister_1= ruleWriteRegister | this_ReadRegisterFilter_2= ruleReadRegisterFilter | this_Maxx_3= ruleMaxx | this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf | this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1601:1: (this_ReadRegister_0= ruleReadRegister | this_WriteRegister_1= ruleWriteRegister | this_ReadRegisterFilter_2= ruleReadRegisterFilter | this_Maxx_3= ruleMaxx | this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf | this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt11=1;
                }
                break;
            case 32:
                {
                alt11=2;
                }
                break;
            case 34:
                {
                alt11=3;
                }
                break;
            case 33:
                {
                alt11=4;
                }
                break;
            case 31:
                {
                alt11=5;
                }
                break;
            case 30:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1602:5: this_ReadRegister_0= ruleReadRegister
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getReadRegisterParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleReadRegister_in_ruleInst_B6_S1_143637);
                    this_ReadRegister_0=ruleReadRegister();

                    state._fsp--;

                     
                            current = this_ReadRegister_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1612:5: this_WriteRegister_1= ruleWriteRegister
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getWriteRegisterParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWriteRegister_in_ruleInst_B6_S1_143664);
                    this_WriteRegister_1=ruleWriteRegister();

                    state._fsp--;

                     
                            current = this_WriteRegister_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1622:5: this_ReadRegisterFilter_2= ruleReadRegisterFilter
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getReadRegisterFilterParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleReadRegisterFilter_in_ruleInst_B6_S1_143691);
                    this_ReadRegisterFilter_2=ruleReadRegisterFilter();

                    state._fsp--;

                     
                            current = this_ReadRegisterFilter_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1632:5: this_Maxx_3= ruleMaxx
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getMaxxParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleMaxx_in_ruleInst_B6_S1_143718);
                    this_Maxx_3=ruleMaxx();

                    state._fsp--;

                     
                            current = this_Maxx_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1642:5: this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getWriteRegisterHighshelfParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleWriteRegisterHighshelf_in_ruleInst_B6_S1_143745);
                    this_WriteRegisterHighshelf_4=ruleWriteRegisterHighshelf();

                    state._fsp--;

                     
                            current = this_WriteRegisterHighshelf_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1652:5: this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getWriteRegisterLowshelfParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleWriteRegisterLowshelf_in_ruleInst_B6_S1_143772);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1668:1: entryRuleInst_B15_S1_9 returns [EObject current=null] : iv_ruleInst_B15_S1_9= ruleInst_B15_S1_9 EOF ;
    public final EObject entryRuleInst_B15_S1_9() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_B15_S1_9 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1669:2: (iv_ruleInst_B15_S1_9= ruleInst_B15_S1_9 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1670:2: iv_ruleInst_B15_S1_9= ruleInst_B15_S1_9 EOF
            {
             newCompositeNode(grammarAccess.getInst_B15_S1_9Rule()); 
            pushFollow(FOLLOW_ruleInst_B15_S1_9_in_entryRuleInst_B15_S1_93807);
            iv_ruleInst_B15_S1_9=ruleInst_B15_S1_9();

            state._fsp--;

             current =iv_ruleInst_B15_S1_9; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_B15_S1_93817); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1677:1: ruleInst_B15_S1_9 returns [EObject current=null] : (this_ReadDelay_0= ruleReadDelay | this_WriteDelay_1= ruleWriteDelay | this_WriteAllpass_2= ruleWriteAllpass ) ;
    public final EObject ruleInst_B15_S1_9() throws RecognitionException {
        EObject current = null;

        EObject this_ReadDelay_0 = null;

        EObject this_WriteDelay_1 = null;

        EObject this_WriteAllpass_2 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1680:28: ( (this_ReadDelay_0= ruleReadDelay | this_WriteDelay_1= ruleWriteDelay | this_WriteAllpass_2= ruleWriteAllpass ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1681:1: (this_ReadDelay_0= ruleReadDelay | this_WriteDelay_1= ruleWriteDelay | this_WriteAllpass_2= ruleWriteAllpass )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1681:1: (this_ReadDelay_0= ruleReadDelay | this_WriteDelay_1= ruleWriteDelay | this_WriteAllpass_2= ruleWriteAllpass )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt12=1;
                }
                break;
            case 40:
                {
                alt12=2;
                }
                break;
            case 41:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1682:5: this_ReadDelay_0= ruleReadDelay
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B15_S1_9Access().getReadDelayParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleReadDelay_in_ruleInst_B15_S1_93864);
                    this_ReadDelay_0=ruleReadDelay();

                    state._fsp--;

                     
                            current = this_ReadDelay_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1692:5: this_WriteDelay_1= ruleWriteDelay
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B15_S1_9Access().getWriteDelayParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWriteDelay_in_ruleInst_B15_S1_93891);
                    this_WriteDelay_1=ruleWriteDelay();

                    state._fsp--;

                     
                            current = this_WriteDelay_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1702:5: this_WriteAllpass_2= ruleWriteAllpass
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B15_S1_9Access().getWriteAllpassParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleWriteAllpass_in_ruleInst_B15_S1_93918);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1718:1: entryRuleInst_B6 returns [EObject current=null] : iv_ruleInst_B6= ruleInst_B6 EOF ;
    public final EObject entryRuleInst_B6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_B6 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1719:2: (iv_ruleInst_B6= ruleInst_B6 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1720:2: iv_ruleInst_B6= ruleInst_B6 EOF
            {
             newCompositeNode(grammarAccess.getInst_B6Rule()); 
            pushFollow(FOLLOW_ruleInst_B6_in_entryRuleInst_B63953);
            iv_ruleInst_B6=ruleInst_B6();

            state._fsp--;

             current =iv_ruleInst_B6; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_B63963); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1727:1: ruleInst_B6 returns [EObject current=null] : (this_Mulx_0= ruleMulx | this_Ldax_1= ruleLdax ) ;
    public final EObject ruleInst_B6() throws RecognitionException {
        EObject current = null;

        EObject this_Mulx_0 = null;

        EObject this_Ldax_1 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1730:28: ( (this_Mulx_0= ruleMulx | this_Ldax_1= ruleLdax ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1731:1: (this_Mulx_0= ruleMulx | this_Ldax_1= ruleLdax )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1731:1: (this_Mulx_0= ruleMulx | this_Ldax_1= ruleLdax )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            else if ( (LA13_0==36) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1732:5: this_Mulx_0= ruleMulx
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6Access().getMulxParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMulx_in_ruleInst_B64010);
                    this_Mulx_0=ruleMulx();

                    state._fsp--;

                     
                            current = this_Mulx_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1742:5: this_Ldax_1= ruleLdax
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6Access().getLdaxParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLdax_in_ruleInst_B64037);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1758:1: entryRuleInst_B24 returns [EObject current=null] : iv_ruleInst_B24= ruleInst_B24 EOF ;
    public final EObject entryRuleInst_B24() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_B24 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1759:2: (iv_ruleInst_B24= ruleInst_B24 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1760:2: iv_ruleInst_B24= ruleInst_B24 EOF
            {
             newCompositeNode(grammarAccess.getInst_B24Rule()); 
            pushFollow(FOLLOW_ruleInst_B24_in_entryRuleInst_B244072);
            iv_ruleInst_B24=ruleInst_B24();

            state._fsp--;

             current =iv_ruleInst_B24; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_B244082); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1767:1: ruleInst_B24 returns [EObject current=null] : (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor ) ;
    public final EObject ruleInst_B24() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        EObject this_Or_1 = null;

        EObject this_Xor_2 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1770:28: ( (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1771:1: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1771:1: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt14=1;
                }
                break;
            case 50:
                {
                alt14=2;
                }
                break;
            case 51:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1772:5: this_And_0= ruleAnd
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B24Access().getAndParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAnd_in_ruleInst_B244129);
                    this_And_0=ruleAnd();

                    state._fsp--;

                     
                            current = this_And_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1782:5: this_Or_1= ruleOr
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B24Access().getOrParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOr_in_ruleInst_B244156);
                    this_Or_1=ruleOr();

                    state._fsp--;

                     
                            current = this_Or_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1792:5: this_Xor_2= ruleXor
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B24Access().getXorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleXor_in_ruleInst_B244183);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1808:1: entryRuleInst_X0 returns [EObject current=null] : iv_ruleInst_X0= ruleInst_X0 EOF ;
    public final EObject entryRuleInst_X0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_X0 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1809:2: (iv_ruleInst_X0= ruleInst_X0 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1810:2: iv_ruleInst_X0= ruleInst_X0 EOF
            {
             newCompositeNode(grammarAccess.getInst_X0Rule()); 
            pushFollow(FOLLOW_ruleInst_X0_in_entryRuleInst_X04218);
            iv_ruleInst_X0=ruleInst_X0();

            state._fsp--;

             current =iv_ruleInst_X0; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_X04228); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1817:1: ruleInst_X0 returns [EObject current=null] : (this_Clr_0= ruleClr | this_Not_1= ruleNot | this_Absa_2= ruleAbsa ) ;
    public final EObject ruleInst_X0() throws RecognitionException {
        EObject current = null;

        EObject this_Clr_0 = null;

        EObject this_Not_1 = null;

        EObject this_Absa_2 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1820:28: ( (this_Clr_0= ruleClr | this_Not_1= ruleNot | this_Absa_2= ruleAbsa ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1821:1: (this_Clr_0= ruleClr | this_Not_1= ruleNot | this_Absa_2= ruleAbsa )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1821:1: (this_Clr_0= ruleClr | this_Not_1= ruleNot | this_Absa_2= ruleAbsa )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt15=1;
                }
                break;
            case 54:
                {
                alt15=2;
                }
                break;
            case 55:
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
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1822:5: this_Clr_0= ruleClr
                    {
                     
                            newCompositeNode(grammarAccess.getInst_X0Access().getClrParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClr_in_ruleInst_X04275);
                    this_Clr_0=ruleClr();

                    state._fsp--;

                     
                            current = this_Clr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1832:5: this_Not_1= ruleNot
                    {
                     
                            newCompositeNode(grammarAccess.getInst_X0Access().getNotParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNot_in_ruleInst_X04302);
                    this_Not_1=ruleNot();

                    state._fsp--;

                     
                            current = this_Not_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1842:5: this_Absa_2= ruleAbsa
                    {
                     
                            newCompositeNode(grammarAccess.getInst_X0Access().getAbsaParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAbsa_in_ruleInst_X04329);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1858:1: entryRuleInst_S1_14_S1_10 returns [EObject current=null] : iv_ruleInst_S1_14_S1_10= ruleInst_S1_14_S1_10 EOF ;
    public final EObject entryRuleInst_S1_14_S1_10() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_S1_14_S1_10 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1859:2: (iv_ruleInst_S1_14_S1_10= ruleInst_S1_14_S1_10 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1860:2: iv_ruleInst_S1_14_S1_10= ruleInst_S1_14_S1_10 EOF
            {
             newCompositeNode(grammarAccess.getInst_S1_14_S1_10Rule()); 
            pushFollow(FOLLOW_ruleInst_S1_14_S1_10_in_entryRuleInst_S1_14_S1_104364);
            iv_ruleInst_S1_14_S1_10=ruleInst_S1_14_S1_10();

            state._fsp--;

             current =iv_ruleInst_S1_14_S1_10; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_S1_14_S1_104374); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1867:1: ruleInst_S1_14_S1_10 returns [EObject current=null] : (this_Exp_0= ruleExp | this_ScaleOffset_1= ruleScaleOffset ) ;
    public final EObject ruleInst_S1_14_S1_10() throws RecognitionException {
        EObject current = null;

        EObject this_Exp_0 = null;

        EObject this_ScaleOffset_1 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1870:28: ( (this_Exp_0= ruleExp | this_ScaleOffset_1= ruleScaleOffset ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1871:1: (this_Exp_0= ruleExp | this_ScaleOffset_1= ruleScaleOffset )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1871:1: (this_Exp_0= ruleExp | this_ScaleOffset_1= ruleScaleOffset )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            else if ( (LA16_0==39) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1872:5: this_Exp_0= ruleExp
                    {
                     
                            newCompositeNode(grammarAccess.getInst_S1_14_S1_10Access().getExpParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExp_in_ruleInst_S1_14_S1_104421);
                    this_Exp_0=ruleExp();

                    state._fsp--;

                     
                            current = this_Exp_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1882:5: this_ScaleOffset_1= ruleScaleOffset
                    {
                     
                            newCompositeNode(grammarAccess.getInst_S1_14_S1_10Access().getScaleOffsetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleScaleOffset_in_ruleInst_S1_14_S1_104448);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1898:1: entryRuleReadRegister returns [EObject current=null] : iv_ruleReadRegister= ruleReadRegister EOF ;
    public final EObject entryRuleReadRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadRegister = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1899:2: (iv_ruleReadRegister= ruleReadRegister EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1900:2: iv_ruleReadRegister= ruleReadRegister EOF
            {
             newCompositeNode(grammarAccess.getReadRegisterRule()); 
            pushFollow(FOLLOW_ruleReadRegister_in_entryRuleReadRegister4483);
            iv_ruleReadRegister=ruleReadRegister();

            state._fsp--;

             current =iv_ruleReadRegister; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadRegister4493); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1907:1: ruleReadRegister returns [EObject current=null] : (otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleReadRegister() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1910:28: ( (otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1911:1: (otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1911:1: (otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1911:3: otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleReadRegister4530); 

                	newLeafNode(otherlv_0, grammarAccess.getReadRegisterAccess().getRdaxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1915:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1916:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1916:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1917:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getReadRegisterAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleReadRegister4551);
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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleReadRegister4563); 

                	newLeafNode(otherlv_2, grammarAccess.getReadRegisterAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1937:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1938:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1938:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1939:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getReadRegisterAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleReadRegister4584);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1963:1: entryRuleWriteRegisterLowshelf returns [EObject current=null] : iv_ruleWriteRegisterLowshelf= ruleWriteRegisterLowshelf EOF ;
    public final EObject entryRuleWriteRegisterLowshelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteRegisterLowshelf = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1964:2: (iv_ruleWriteRegisterLowshelf= ruleWriteRegisterLowshelf EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1965:2: iv_ruleWriteRegisterLowshelf= ruleWriteRegisterLowshelf EOF
            {
             newCompositeNode(grammarAccess.getWriteRegisterLowshelfRule()); 
            pushFollow(FOLLOW_ruleWriteRegisterLowshelf_in_entryRuleWriteRegisterLowshelf4620);
            iv_ruleWriteRegisterLowshelf=ruleWriteRegisterLowshelf();

            state._fsp--;

             current =iv_ruleWriteRegisterLowshelf; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWriteRegisterLowshelf4630); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1972:1: ruleWriteRegisterLowshelf returns [EObject current=null] : (otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteRegisterLowshelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1975:28: ( (otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1976:1: (otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1976:1: (otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1976:3: otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleWriteRegisterLowshelf4667); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteRegisterLowshelfAccess().getWrlxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1980:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1981:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1981:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1982:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterLowshelfAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleWriteRegisterLowshelf4688);
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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleWriteRegisterLowshelf4700); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteRegisterLowshelfAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2002:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2003:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2003:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2004:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterLowshelfAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegisterLowshelf4721);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2028:1: entryRuleWriteRegisterHighshelf returns [EObject current=null] : iv_ruleWriteRegisterHighshelf= ruleWriteRegisterHighshelf EOF ;
    public final EObject entryRuleWriteRegisterHighshelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteRegisterHighshelf = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2029:2: (iv_ruleWriteRegisterHighshelf= ruleWriteRegisterHighshelf EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2030:2: iv_ruleWriteRegisterHighshelf= ruleWriteRegisterHighshelf EOF
            {
             newCompositeNode(grammarAccess.getWriteRegisterHighshelfRule()); 
            pushFollow(FOLLOW_ruleWriteRegisterHighshelf_in_entryRuleWriteRegisterHighshelf4757);
            iv_ruleWriteRegisterHighshelf=ruleWriteRegisterHighshelf();

            state._fsp--;

             current =iv_ruleWriteRegisterHighshelf; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWriteRegisterHighshelf4767); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2037:1: ruleWriteRegisterHighshelf returns [EObject current=null] : (otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteRegisterHighshelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2040:28: ( (otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2041:1: (otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2041:1: (otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2041:3: otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleWriteRegisterHighshelf4804); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteRegisterHighshelfAccess().getWrhxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2045:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2046:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2046:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2047:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterHighshelfAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleWriteRegisterHighshelf4825);
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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleWriteRegisterHighshelf4837); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteRegisterHighshelfAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2067:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2068:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2068:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2069:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterHighshelfAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegisterHighshelf4858);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2093:1: entryRuleWriteRegister returns [EObject current=null] : iv_ruleWriteRegister= ruleWriteRegister EOF ;
    public final EObject entryRuleWriteRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteRegister = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2094:2: (iv_ruleWriteRegister= ruleWriteRegister EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2095:2: iv_ruleWriteRegister= ruleWriteRegister EOF
            {
             newCompositeNode(grammarAccess.getWriteRegisterRule()); 
            pushFollow(FOLLOW_ruleWriteRegister_in_entryRuleWriteRegister4894);
            iv_ruleWriteRegister=ruleWriteRegister();

            state._fsp--;

             current =iv_ruleWriteRegister; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWriteRegister4904); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2102:1: ruleWriteRegister returns [EObject current=null] : (otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteRegister() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2105:28: ( (otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2106:1: (otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2106:1: (otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2106:3: otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleWriteRegister4941); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteRegisterAccess().getWraxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2110:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2111:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2111:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2112:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleWriteRegister4962);
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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleWriteRegister4974); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteRegisterAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2132:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2133:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2133:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2134:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegister4995);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2158:1: entryRuleMaxx returns [EObject current=null] : iv_ruleMaxx= ruleMaxx EOF ;
    public final EObject entryRuleMaxx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxx = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2159:2: (iv_ruleMaxx= ruleMaxx EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2160:2: iv_ruleMaxx= ruleMaxx EOF
            {
             newCompositeNode(grammarAccess.getMaxxRule()); 
            pushFollow(FOLLOW_ruleMaxx_in_entryRuleMaxx5031);
            iv_ruleMaxx=ruleMaxx();

            state._fsp--;

             current =iv_ruleMaxx; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxx5041); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2167:1: ruleMaxx returns [EObject current=null] : (otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleMaxx() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2170:28: ( (otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2171:1: (otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2171:1: (otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2171:3: otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleMaxx5078); 

                	newLeafNode(otherlv_0, grammarAccess.getMaxxAccess().getMaxxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2175:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2176:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2176:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2177:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getMaxxAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleMaxx5099);
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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleMaxx5111); 

                	newLeafNode(otherlv_2, grammarAccess.getMaxxAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2197:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2198:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2198:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2199:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getMaxxAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleMaxx5132);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2223:1: entryRuleReadRegisterFilter returns [EObject current=null] : iv_ruleReadRegisterFilter= ruleReadRegisterFilter EOF ;
    public final EObject entryRuleReadRegisterFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadRegisterFilter = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2224:2: (iv_ruleReadRegisterFilter= ruleReadRegisterFilter EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2225:2: iv_ruleReadRegisterFilter= ruleReadRegisterFilter EOF
            {
             newCompositeNode(grammarAccess.getReadRegisterFilterRule()); 
            pushFollow(FOLLOW_ruleReadRegisterFilter_in_entryRuleReadRegisterFilter5168);
            iv_ruleReadRegisterFilter=ruleReadRegisterFilter();

            state._fsp--;

             current =iv_ruleReadRegisterFilter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadRegisterFilter5178); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2232:1: ruleReadRegisterFilter returns [EObject current=null] : (otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleReadRegisterFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2235:28: ( (otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2236:1: (otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2236:1: (otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2236:3: otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleReadRegisterFilter5215); 

                	newLeafNode(otherlv_0, grammarAccess.getReadRegisterFilterAccess().getRdfxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2240:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2241:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2241:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2242:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getReadRegisterFilterAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleReadRegisterFilter5236);
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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleReadRegisterFilter5248); 

                	newLeafNode(otherlv_2, grammarAccess.getReadRegisterFilterAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2262:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2263:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2263:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2264:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getReadRegisterFilterAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleReadRegisterFilter5269);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2288:1: entryRuleMulx returns [EObject current=null] : iv_ruleMulx= ruleMulx EOF ;
    public final EObject entryRuleMulx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulx = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2289:2: (iv_ruleMulx= ruleMulx EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2290:2: iv_ruleMulx= ruleMulx EOF
            {
             newCompositeNode(grammarAccess.getMulxRule()); 
            pushFollow(FOLLOW_ruleMulx_in_entryRuleMulx5305);
            iv_ruleMulx=ruleMulx();

            state._fsp--;

             current =iv_ruleMulx; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulx5315); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2297:1: ruleMulx returns [EObject current=null] : (otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMulx() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2300:28: ( (otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2301:1: (otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2301:1: (otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2301:3: otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleMulx5352); 

                	newLeafNode(otherlv_0, grammarAccess.getMulxAccess().getMulxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2305:1: ( (lv_arg1_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2306:1: (lv_arg1_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2306:1: (lv_arg1_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2307:3: lv_arg1_1_0= RULE_ID
            {
            lv_arg1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMulx5369); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2331:1: entryRuleLdax returns [EObject current=null] : iv_ruleLdax= ruleLdax EOF ;
    public final EObject entryRuleLdax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdax = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2332:2: (iv_ruleLdax= ruleLdax EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2333:2: iv_ruleLdax= ruleLdax EOF
            {
             newCompositeNode(grammarAccess.getLdaxRule()); 
            pushFollow(FOLLOW_ruleLdax_in_entryRuleLdax5410);
            iv_ruleLdax=ruleLdax();

            state._fsp--;

             current =iv_ruleLdax; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLdax5420); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2340:1: ruleLdax returns [EObject current=null] : (otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLdax() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2343:28: ( (otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2344:1: (otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2344:1: (otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2344:3: otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleLdax5457); 

                	newLeafNode(otherlv_0, grammarAccess.getLdaxAccess().getLdaxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2348:1: ( (lv_arg1_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2349:1: (lv_arg1_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2349:1: (lv_arg1_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2350:3: lv_arg1_1_0= RULE_ID
            {
            lv_arg1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLdax5474); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2374:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2375:2: (iv_ruleExp= ruleExp EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2376:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_ruleExp_in_entryRuleExp5515);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExp5525); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2383:1: ruleExp returns [EObject current=null] : (otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2386:28: ( (otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2387:1: (otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2387:1: (otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2387:3: otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleExp5562); 

                	newLeafNode(otherlv_0, grammarAccess.getExpAccess().getExpKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2391:1: ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2392:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2392:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2393:3: lv_arg1_1_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getExpAccess().getArg1SPINDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleExp5583);
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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleExp5595); 

                	newLeafNode(otherlv_2, grammarAccess.getExpAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2413:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2414:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2414:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2415:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getExpAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleExp5616);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2439:1: entryRuleLog returns [EObject current=null] : iv_ruleLog= ruleLog EOF ;
    public final EObject entryRuleLog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLog = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2440:2: (iv_ruleLog= ruleLog EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2441:2: iv_ruleLog= ruleLog EOF
            {
             newCompositeNode(grammarAccess.getLogRule()); 
            pushFollow(FOLLOW_ruleLog_in_entryRuleLog5652);
            iv_ruleLog=ruleLog();

            state._fsp--;

             current =iv_ruleLog; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLog5662); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2448:1: ruleLog returns [EObject current=null] : (otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleLog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2451:28: ( (otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2452:1: (otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2452:1: (otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2452:3: otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleLog5699); 

                	newLeafNode(otherlv_0, grammarAccess.getLogAccess().getLogKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2456:1: ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2457:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2457:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2458:3: lv_arg1_1_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLogAccess().getArg1SPINDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleLog5720);
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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleLog5732); 

                	newLeafNode(otherlv_2, grammarAccess.getLogAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2478:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2479:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2479:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2480:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLogAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleLog5753);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2504:1: entryRuleScaleOffset returns [EObject current=null] : iv_ruleScaleOffset= ruleScaleOffset EOF ;
    public final EObject entryRuleScaleOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleOffset = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2505:2: (iv_ruleScaleOffset= ruleScaleOffset EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2506:2: iv_ruleScaleOffset= ruleScaleOffset EOF
            {
             newCompositeNode(grammarAccess.getScaleOffsetRule()); 
            pushFollow(FOLLOW_ruleScaleOffset_in_entryRuleScaleOffset5789);
            iv_ruleScaleOffset=ruleScaleOffset();

            state._fsp--;

             current =iv_ruleScaleOffset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleOffset5799); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2513:1: ruleScaleOffset returns [EObject current=null] : (otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleScaleOffset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2516:28: ( (otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2517:1: (otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2517:1: (otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2517:3: otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleScaleOffset5836); 

                	newLeafNode(otherlv_0, grammarAccess.getScaleOffsetAccess().getSofKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2521:1: ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2522:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2522:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2523:3: lv_arg1_1_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getScaleOffsetAccess().getArg1SPINDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleScaleOffset5857);
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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleScaleOffset5869); 

                	newLeafNode(otherlv_2, grammarAccess.getScaleOffsetAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2543:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2544:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2544:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2545:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getScaleOffsetAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleScaleOffset5890);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2569:1: entryRuleWriteDelay returns [EObject current=null] : iv_ruleWriteDelay= ruleWriteDelay EOF ;
    public final EObject entryRuleWriteDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteDelay = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2570:2: (iv_ruleWriteDelay= ruleWriteDelay EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2571:2: iv_ruleWriteDelay= ruleWriteDelay EOF
            {
             newCompositeNode(grammarAccess.getWriteDelayRule()); 
            pushFollow(FOLLOW_ruleWriteDelay_in_entryRuleWriteDelay5926);
            iv_ruleWriteDelay=ruleWriteDelay();

            state._fsp--;

             current =iv_ruleWriteDelay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWriteDelay5936); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2578:1: ruleWriteDelay returns [EObject current=null] : (otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteDelay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2581:28: ( (otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2582:1: (otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2582:1: (otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2582:3: otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleWriteDelay5973); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteDelayAccess().getWraKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2586:1: ( (lv_arg1_1_0= ruleSPINMEM ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2587:1: (lv_arg1_1_0= ruleSPINMEM )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2587:1: (lv_arg1_1_0= ruleSPINMEM )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2588:3: lv_arg1_1_0= ruleSPINMEM
            {
             
            	        newCompositeNode(grammarAccess.getWriteDelayAccess().getArg1SPINMEMParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINMEM_in_ruleWriteDelay5994);
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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleWriteDelay6006); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteDelayAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2608:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2609:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2609:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2610:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteDelayAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleWriteDelay6027);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2634:1: entryRuleWriteAllpass returns [EObject current=null] : iv_ruleWriteAllpass= ruleWriteAllpass EOF ;
    public final EObject entryRuleWriteAllpass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteAllpass = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2635:2: (iv_ruleWriteAllpass= ruleWriteAllpass EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2636:2: iv_ruleWriteAllpass= ruleWriteAllpass EOF
            {
             newCompositeNode(grammarAccess.getWriteAllpassRule()); 
            pushFollow(FOLLOW_ruleWriteAllpass_in_entryRuleWriteAllpass6063);
            iv_ruleWriteAllpass=ruleWriteAllpass();

            state._fsp--;

             current =iv_ruleWriteAllpass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWriteAllpass6073); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2643:1: ruleWriteAllpass returns [EObject current=null] : (otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteAllpass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2646:28: ( (otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2647:1: (otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2647:1: (otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2647:3: otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleWriteAllpass6110); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteAllpassAccess().getWrapKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2651:1: ( (lv_arg1_1_0= ruleSPINMEM ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2652:1: (lv_arg1_1_0= ruleSPINMEM )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2652:1: (lv_arg1_1_0= ruleSPINMEM )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2653:3: lv_arg1_1_0= ruleSPINMEM
            {
             
            	        newCompositeNode(grammarAccess.getWriteAllpassAccess().getArg1SPINMEMParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINMEM_in_ruleWriteAllpass6131);
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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleWriteAllpass6143); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteAllpassAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2673:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2674:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2674:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2675:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteAllpassAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleWriteAllpass6164);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2699:1: entryRuleReadDelay returns [EObject current=null] : iv_ruleReadDelay= ruleReadDelay EOF ;
    public final EObject entryRuleReadDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadDelay = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2700:2: (iv_ruleReadDelay= ruleReadDelay EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2701:2: iv_ruleReadDelay= ruleReadDelay EOF
            {
             newCompositeNode(grammarAccess.getReadDelayRule()); 
            pushFollow(FOLLOW_ruleReadDelay_in_entryRuleReadDelay6200);
            iv_ruleReadDelay=ruleReadDelay();

            state._fsp--;

             current =iv_ruleReadDelay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadDelay6210); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2708:1: ruleReadDelay returns [EObject current=null] : (otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleReadDelay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2711:28: ( (otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2712:1: (otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2712:1: (otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2712:3: otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleReadDelay6247); 

                	newLeafNode(otherlv_0, grammarAccess.getReadDelayAccess().getRdaKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2716:1: ( (lv_arg1_1_0= ruleSPINMEM ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2717:1: (lv_arg1_1_0= ruleSPINMEM )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2717:1: (lv_arg1_1_0= ruleSPINMEM )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2718:3: lv_arg1_1_0= ruleSPINMEM
            {
             
            	        newCompositeNode(grammarAccess.getReadDelayAccess().getArg1SPINMEMParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINMEM_in_ruleReadDelay6268);
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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleReadDelay6280); 

                	newLeafNode(otherlv_2, grammarAccess.getReadDelayAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2738:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2739:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2739:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2740:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getReadDelayAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleReadDelay6301);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2764:1: entryRuleLoadSinLFO returns [EObject current=null] : iv_ruleLoadSinLFO= ruleLoadSinLFO EOF ;
    public final EObject entryRuleLoadSinLFO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadSinLFO = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2765:2: (iv_ruleLoadSinLFO= ruleLoadSinLFO EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2766:2: iv_ruleLoadSinLFO= ruleLoadSinLFO EOF
            {
             newCompositeNode(grammarAccess.getLoadSinLFORule()); 
            pushFollow(FOLLOW_ruleLoadSinLFO_in_entryRuleLoadSinLFO6337);
            iv_ruleLoadSinLFO=ruleLoadSinLFO();

            state._fsp--;

             current =iv_ruleLoadSinLFO; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoadSinLFO6347); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2773:1: ruleLoadSinLFO returns [EObject current=null] : (otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2776:28: ( (otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2777:1: (otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2777:1: (otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2777:3: otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleLoadSinLFO6384); 

                	newLeafNode(otherlv_0, grammarAccess.getLoadSinLFOAccess().getWldsKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2781:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2782:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2782:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2783:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getLoadSinLFOAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleLoadSinLFO6405);
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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleLoadSinLFO6417); 

                	newLeafNode(otherlv_2, grammarAccess.getLoadSinLFOAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2803:1: ( (lv_arg2_3_0= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2804:1: (lv_arg2_3_0= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2804:1: (lv_arg2_3_0= RULE_INT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2805:3: lv_arg2_3_0= RULE_INT
            {
            lv_arg2_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoadSinLFO6434); 

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

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleLoadSinLFO6451); 

                	newLeafNode(otherlv_4, grammarAccess.getLoadSinLFOAccess().getCommaKeyword_4());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2825:1: ( (lv_arg3_5_0= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2826:1: (lv_arg3_5_0= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2826:1: (lv_arg3_5_0= RULE_INT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2827:3: lv_arg3_5_0= RULE_INT
            {
            lv_arg3_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoadSinLFO6468); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2851:1: entryRuleLoadRampLFO returns [EObject current=null] : iv_ruleLoadRampLFO= ruleLoadRampLFO EOF ;
    public final EObject entryRuleLoadRampLFO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadRampLFO = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2852:2: (iv_ruleLoadRampLFO= ruleLoadRampLFO EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2853:2: iv_ruleLoadRampLFO= ruleLoadRampLFO EOF
            {
             newCompositeNode(grammarAccess.getLoadRampLFORule()); 
            pushFollow(FOLLOW_ruleLoadRampLFO_in_entryRuleLoadRampLFO6509);
            iv_ruleLoadRampLFO=ruleLoadRampLFO();

            state._fsp--;

             current =iv_ruleLoadRampLFO; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoadRampLFO6519); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2860:1: ruleLoadRampLFO returns [EObject current=null] : (otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2863:28: ( (otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2864:1: (otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2864:1: (otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2864:3: otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleLoadRampLFO6556); 

                	newLeafNode(otherlv_0, grammarAccess.getLoadRampLFOAccess().getWldrKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2868:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2869:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2869:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2870:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getLoadRampLFOAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleLoadRampLFO6577);
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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleLoadRampLFO6589); 

                	newLeafNode(otherlv_2, grammarAccess.getLoadRampLFOAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2890:1: ( (lv_arg2_3_0= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2891:1: (lv_arg2_3_0= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2891:1: (lv_arg2_3_0= RULE_INT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2892:3: lv_arg2_3_0= RULE_INT
            {
            lv_arg2_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoadRampLFO6606); 

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

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleLoadRampLFO6623); 

                	newLeafNode(otherlv_4, grammarAccess.getLoadRampLFOAccess().getCommaKeyword_4());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2912:1: ( (lv_arg3_5_0= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2913:1: (lv_arg3_5_0= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2913:1: (lv_arg3_5_0= RULE_INT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2914:3: lv_arg3_5_0= RULE_INT
            {
            lv_arg3_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoadRampLFO6640); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2938:1: entryRuleChorusReadDelay returns [EObject current=null] : iv_ruleChorusReadDelay= ruleChorusReadDelay EOF ;
    public final EObject entryRuleChorusReadDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChorusReadDelay = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2939:2: (iv_ruleChorusReadDelay= ruleChorusReadDelay EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2940:2: iv_ruleChorusReadDelay= ruleChorusReadDelay EOF
            {
             newCompositeNode(grammarAccess.getChorusReadDelayRule()); 
            pushFollow(FOLLOW_ruleChorusReadDelay_in_entryRuleChorusReadDelay6681);
            iv_ruleChorusReadDelay=ruleChorusReadDelay();

            state._fsp--;

             current =iv_ruleChorusReadDelay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChorusReadDelay6691); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2947:1: ruleChorusReadDelay returns [EObject current=null] : (otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) ) ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2950:28: ( (otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2951:1: (otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2951:1: (otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2951:3: otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleChorusReadDelay6728); 

                	newLeafNode(otherlv_0, grammarAccess.getChorusReadDelayAccess().getChoRdaKeyword_0());
                
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleChorusReadDelay6740); 

                	newLeafNode(otherlv_1, grammarAccess.getChorusReadDelayAccess().getCommaKeyword_1());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2959:1: ( (lv_arg1_2_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2960:1: (lv_arg1_2_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2960:1: (lv_arg1_2_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2961:3: lv_arg1_2_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getChorusReadDelayAccess().getArg1SPINREGISTERParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleChorusReadDelay6761);
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

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleChorusReadDelay6773); 

                	newLeafNode(otherlv_3, grammarAccess.getChorusReadDelayAccess().getCommaKeyword_3());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2981:1: ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2982:1: (lv_arg2_4_0= ruleSPINCHOREGFLAGS )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2982:1: (lv_arg2_4_0= ruleSPINCHOREGFLAGS )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2983:3: lv_arg2_4_0= ruleSPINCHOREGFLAGS
            {
             
            	        newCompositeNode(grammarAccess.getChorusReadDelayAccess().getArg2SPINCHOREGFLAGSParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINCHOREGFLAGS_in_ruleChorusReadDelay6794);
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

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleChorusReadDelay6806); 

                	newLeafNode(otherlv_5, grammarAccess.getChorusReadDelayAccess().getCommaKeyword_5());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3003:1: ( (lv_arg3_6_0= ruleSPINMEM ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3004:1: (lv_arg3_6_0= ruleSPINMEM )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3004:1: (lv_arg3_6_0= ruleSPINMEM )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3005:3: lv_arg3_6_0= ruleSPINMEM
            {
             
            	        newCompositeNode(grammarAccess.getChorusReadDelayAccess().getArg3SPINMEMParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINMEM_in_ruleChorusReadDelay6827);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3029:1: entryRuleChorusReadValue returns [EObject current=null] : iv_ruleChorusReadValue= ruleChorusReadValue EOF ;
    public final EObject entryRuleChorusReadValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChorusReadValue = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3030:2: (iv_ruleChorusReadValue= ruleChorusReadValue EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3031:2: iv_ruleChorusReadValue= ruleChorusReadValue EOF
            {
             newCompositeNode(grammarAccess.getChorusReadValueRule()); 
            pushFollow(FOLLOW_ruleChorusReadValue_in_entryRuleChorusReadValue6863);
            iv_ruleChorusReadValue=ruleChorusReadValue();

            state._fsp--;

             current =iv_ruleChorusReadValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChorusReadValue6873); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3038:1: ruleChorusReadValue returns [EObject current=null] : (otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) ) ;
    public final EObject ruleChorusReadValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_arg1_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3041:28: ( (otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3042:1: (otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3042:1: (otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3042:3: otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleChorusReadValue6910); 

                	newLeafNode(otherlv_0, grammarAccess.getChorusReadValueAccess().getChoRdalKeyword_0());
                
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleChorusReadValue6922); 

                	newLeafNode(otherlv_1, grammarAccess.getChorusReadValueAccess().getCommaKeyword_1());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3050:1: ( (lv_arg1_2_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3051:1: (lv_arg1_2_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3051:1: (lv_arg1_2_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3052:3: lv_arg1_2_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getChorusReadValueAccess().getArg1SPINREGISTERParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleChorusReadValue6943);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3076:1: entryRuleChorusScaleOffset returns [EObject current=null] : iv_ruleChorusScaleOffset= ruleChorusScaleOffset EOF ;
    public final EObject entryRuleChorusScaleOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChorusScaleOffset = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3077:2: (iv_ruleChorusScaleOffset= ruleChorusScaleOffset EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3078:2: iv_ruleChorusScaleOffset= ruleChorusScaleOffset EOF
            {
             newCompositeNode(grammarAccess.getChorusScaleOffsetRule()); 
            pushFollow(FOLLOW_ruleChorusScaleOffset_in_entryRuleChorusScaleOffset6979);
            iv_ruleChorusScaleOffset=ruleChorusScaleOffset();

            state._fsp--;

             current =iv_ruleChorusScaleOffset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChorusScaleOffset6989); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3085:1: ruleChorusScaleOffset returns [EObject current=null] : (otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) ) ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3088:28: ( (otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3089:1: (otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3089:1: (otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3089:3: otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleChorusScaleOffset7026); 

                	newLeafNode(otherlv_0, grammarAccess.getChorusScaleOffsetAccess().getChoSofKeyword_0());
                
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleChorusScaleOffset7038); 

                	newLeafNode(otherlv_1, grammarAccess.getChorusScaleOffsetAccess().getCommaKeyword_1());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3097:1: ( (lv_arg1_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3098:1: (lv_arg1_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3098:1: (lv_arg1_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3099:3: lv_arg1_2_0= RULE_ID
            {
            lv_arg1_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChorusScaleOffset7055); 

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

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleChorusScaleOffset7072); 

                	newLeafNode(otherlv_3, grammarAccess.getChorusScaleOffsetAccess().getCommaKeyword_3());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3119:1: ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3120:1: (lv_arg2_4_0= ruleSPINCHOREGFLAGS )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3120:1: (lv_arg2_4_0= ruleSPINCHOREGFLAGS )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3121:3: lv_arg2_4_0= ruleSPINCHOREGFLAGS
            {
             
            	        newCompositeNode(grammarAccess.getChorusScaleOffsetAccess().getArg2SPINCHOREGFLAGSParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINCHOREGFLAGS_in_ruleChorusScaleOffset7093);
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

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleChorusScaleOffset7105); 

                	newLeafNode(otherlv_5, grammarAccess.getChorusScaleOffsetAccess().getCommaKeyword_5());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3141:1: ( (lv_arg3_6_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3142:1: (lv_arg3_6_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3142:1: (lv_arg3_6_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3143:3: lv_arg3_6_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getChorusScaleOffsetAccess().getArg3SPINDOUBLEParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleChorusScaleOffset7126);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3167:1: entryRuleReadDelayPointer returns [EObject current=null] : iv_ruleReadDelayPointer= ruleReadDelayPointer EOF ;
    public final EObject entryRuleReadDelayPointer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadDelayPointer = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3168:2: (iv_ruleReadDelayPointer= ruleReadDelayPointer EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3169:2: iv_ruleReadDelayPointer= ruleReadDelayPointer EOF
            {
             newCompositeNode(grammarAccess.getReadDelayPointerRule()); 
            pushFollow(FOLLOW_ruleReadDelayPointer_in_entryRuleReadDelayPointer7162);
            iv_ruleReadDelayPointer=ruleReadDelayPointer();

            state._fsp--;

             current =iv_ruleReadDelayPointer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadDelayPointer7172); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3176:1: ruleReadDelayPointer returns [EObject current=null] : (otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleReadDelayPointer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3179:28: ( (otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3180:1: (otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3180:1: (otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3180:3: otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleReadDelayPointer7209); 

                	newLeafNode(otherlv_0, grammarAccess.getReadDelayPointerAccess().getRmpaKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3184:1: ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3185:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3185:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3186:3: lv_arg1_1_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getReadDelayPointerAccess().getArg1SPINDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleReadDelayPointer7230);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3210:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3211:2: (iv_ruleAnd= ruleAnd EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3212:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd7266);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd7276); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3219:1: ruleAnd returns [EObject current=null] : (otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3222:28: ( (otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3223:1: (otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3223:1: (otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3223:3: otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleAnd7313); 

                	newLeafNode(otherlv_0, grammarAccess.getAndAccess().getAndKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3227:1: ( (lv_arg1_1_0= ruleBINARY24 ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3228:1: (lv_arg1_1_0= ruleBINARY24 )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3228:1: (lv_arg1_1_0= ruleBINARY24 )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3229:3: lv_arg1_1_0= ruleBINARY24
            {
             
            	        newCompositeNode(grammarAccess.getAndAccess().getArg1BINARY24ParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBINARY24_in_ruleAnd7334);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3253:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3254:2: (iv_ruleOr= ruleOr EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3255:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr7370);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr7380); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3262:1: ruleOr returns [EObject current=null] : (otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3265:28: ( (otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3266:1: (otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3266:1: (otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3266:3: otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleOr7417); 

                	newLeafNode(otherlv_0, grammarAccess.getOrAccess().getOrKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3270:1: ( (lv_arg1_1_0= ruleBINARY24 ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3271:1: (lv_arg1_1_0= ruleBINARY24 )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3271:1: (lv_arg1_1_0= ruleBINARY24 )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3272:3: lv_arg1_1_0= ruleBINARY24
            {
             
            	        newCompositeNode(grammarAccess.getOrAccess().getArg1BINARY24ParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBINARY24_in_ruleOr7438);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3296:1: entryRuleXor returns [EObject current=null] : iv_ruleXor= ruleXor EOF ;
    public final EObject entryRuleXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXor = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3297:2: (iv_ruleXor= ruleXor EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3298:2: iv_ruleXor= ruleXor EOF
            {
             newCompositeNode(grammarAccess.getXorRule()); 
            pushFollow(FOLLOW_ruleXor_in_entryRuleXor7474);
            iv_ruleXor=ruleXor();

            state._fsp--;

             current =iv_ruleXor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXor7484); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3305:1: ruleXor returns [EObject current=null] : (otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) ;
    public final EObject ruleXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3308:28: ( (otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3309:1: (otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3309:1: (otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3309:3: otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleXor7521); 

                	newLeafNode(otherlv_0, grammarAccess.getXorAccess().getXorKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3313:1: ( (lv_arg1_1_0= ruleBINARY24 ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3314:1: (lv_arg1_1_0= ruleBINARY24 )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3314:1: (lv_arg1_1_0= ruleBINARY24 )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3315:3: lv_arg1_1_0= ruleBINARY24
            {
             
            	        newCompositeNode(grammarAccess.getXorAccess().getArg1BINARY24ParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBINARY24_in_ruleXor7542);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3339:1: entryRuleJam returns [EObject current=null] : iv_ruleJam= ruleJam EOF ;
    public final EObject entryRuleJam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJam = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3340:2: (iv_ruleJam= ruleJam EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3341:2: iv_ruleJam= ruleJam EOF
            {
             newCompositeNode(grammarAccess.getJamRule()); 
            pushFollow(FOLLOW_ruleJam_in_entryRuleJam7578);
            iv_ruleJam=ruleJam();

            state._fsp--;

             current =iv_ruleJam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJam7588); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3348:1: ruleJam returns [EObject current=null] : (otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleJam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3351:28: ( (otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3352:1: (otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3352:1: (otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3352:3: otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleJam7625); 

                	newLeafNode(otherlv_0, grammarAccess.getJamAccess().getJamKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3356:1: ( (lv_arg1_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3357:1: (lv_arg1_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3357:1: (lv_arg1_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3358:3: lv_arg1_1_0= RULE_ID
            {
            lv_arg1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJam7642); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3382:1: entryRuleClr returns [EObject current=null] : iv_ruleClr= ruleClr EOF ;
    public final EObject entryRuleClr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClr = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3383:2: (iv_ruleClr= ruleClr EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3384:2: iv_ruleClr= ruleClr EOF
            {
             newCompositeNode(grammarAccess.getClrRule()); 
            pushFollow(FOLLOW_ruleClr_in_entryRuleClr7683);
            iv_ruleClr=ruleClr();

            state._fsp--;

             current =iv_ruleClr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClr7693); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3391:1: ruleClr returns [EObject current=null] : ( () otherlv_1= 'clr' ) ;
    public final EObject ruleClr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3394:28: ( ( () otherlv_1= 'clr' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3395:1: ( () otherlv_1= 'clr' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3395:1: ( () otherlv_1= 'clr' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3395:2: () otherlv_1= 'clr'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3395:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3396:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClrAccess().getClrAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleClr7739); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3413:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3414:2: (iv_ruleNot= ruleNot EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3415:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_ruleNot_in_entryRuleNot7775);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNot7785); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3422:1: ruleNot returns [EObject current=null] : ( () otherlv_1= 'not' ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3425:28: ( ( () otherlv_1= 'not' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3426:1: ( () otherlv_1= 'not' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3426:1: ( () otherlv_1= 'not' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3426:2: () otherlv_1= 'not'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3426:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3427:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNotAccess().getNotAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleNot7831); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3444:1: entryRuleAbsa returns [EObject current=null] : iv_ruleAbsa= ruleAbsa EOF ;
    public final EObject entryRuleAbsa() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsa = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3445:2: (iv_ruleAbsa= ruleAbsa EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3446:2: iv_ruleAbsa= ruleAbsa EOF
            {
             newCompositeNode(grammarAccess.getAbsaRule()); 
            pushFollow(FOLLOW_ruleAbsa_in_entryRuleAbsa7867);
            iv_ruleAbsa=ruleAbsa();

            state._fsp--;

             current =iv_ruleAbsa; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsa7877); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3453:1: ruleAbsa returns [EObject current=null] : ( () otherlv_1= 'absa' ) ;
    public final EObject ruleAbsa() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3456:28: ( ( () otherlv_1= 'absa' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3457:1: ( () otherlv_1= 'absa' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3457:1: ( () otherlv_1= 'absa' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3457:2: () otherlv_1= 'absa'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3457:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3458:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAbsaAccess().getAbsaAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleAbsa7923); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3475:1: entryRuleSkip returns [EObject current=null] : iv_ruleSkip= ruleSkip EOF ;
    public final EObject entryRuleSkip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkip = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3476:2: (iv_ruleSkip= ruleSkip EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3477:2: iv_ruleSkip= ruleSkip EOF
            {
             newCompositeNode(grammarAccess.getSkipRule()); 
            pushFollow(FOLLOW_ruleSkip_in_entryRuleSkip7959);
            iv_ruleSkip=ruleSkip();

            state._fsp--;

             current =iv_ruleSkip; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkip7969); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3484:1: ruleSkip returns [EObject current=null] : (otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleSkip() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_flags_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3487:28: ( (otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3488:1: (otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3488:1: (otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3488:3: otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleSkip8006); 

                	newLeafNode(otherlv_0, grammarAccess.getSkipAccess().getSkpKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3492:1: ( (lv_flags_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3493:1: (lv_flags_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3493:1: (lv_flags_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3494:3: lv_flags_1_0= RULE_ID
            {
            lv_flags_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSkip8023); 

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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleSkip8040); 

                	newLeafNode(otherlv_2, grammarAccess.getSkipAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3514:1: ( (otherlv_3= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3515:1: (otherlv_3= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3515:1: (otherlv_3= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3516:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSkipRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSkip8060); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3535:1: entryRuleSPINDOUBLE returns [String current=null] : iv_ruleSPINDOUBLE= ruleSPINDOUBLE EOF ;
    public final String entryRuleSPINDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPINDOUBLE = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3536:2: (iv_ruleSPINDOUBLE= ruleSPINDOUBLE EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3537:2: iv_ruleSPINDOUBLE= ruleSPINDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getSPINDOUBLERule()); 
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_entryRuleSPINDOUBLE8097);
            iv_ruleSPINDOUBLE=ruleSPINDOUBLE();

            state._fsp--;

             current =iv_ruleSPINDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPINDOUBLE8108); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3544:1: ruleSPINDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) ) ;
    public final AntlrDatatypeRuleToken ruleSPINDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3547:28: ( ( (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3548:1: ( (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3548:1: ( (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3548:2: (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3548:2: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==57) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3549:2: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleSPINDOUBLE8147); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINDOUBLEAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3554:3: (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_INT) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3554:8: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINDOUBLE8165); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getSPINDOUBLEAccess().getIDTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3562:6: (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3562:6: (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3562:11: this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )?
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSPINDOUBLE8192); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getSPINDOUBLEAccess().getINTTerminalRuleCall_1_1_0()); 
                        
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3569:1: (kw= '.' this_INT_4= RULE_INT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==58) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3570:2: kw= '.' this_INT_4= RULE_INT
                            {
                            kw=(Token)match(input,58,FOLLOW_58_in_ruleSPINDOUBLE8211); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getSPINDOUBLEAccess().getFullStopKeyword_1_1_1_0()); 
                                
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSPINDOUBLE8226); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3590:1: entryRuleSPINREGISTER returns [String current=null] : iv_ruleSPINREGISTER= ruleSPINREGISTER EOF ;
    public final String entryRuleSPINREGISTER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPINREGISTER = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3591:2: (iv_ruleSPINREGISTER= ruleSPINREGISTER EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3592:2: iv_ruleSPINREGISTER= ruleSPINREGISTER EOF
            {
             newCompositeNode(grammarAccess.getSPINREGISTERRule()); 
            pushFollow(FOLLOW_ruleSPINREGISTER_in_entryRuleSPINREGISTER8276);
            iv_ruleSPINREGISTER=ruleSPINREGISTER();

            state._fsp--;

             current =iv_ruleSPINREGISTER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPINREGISTER8287); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3599:1: ruleSPINREGISTER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSPINREGISTER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3602:28: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3603:1: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3603:1: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_INT) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3603:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINREGISTER8327); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getSPINREGISTERAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3611:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSPINREGISTER8353); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3626:1: entryRuleSPINCHOREGFLAGS returns [String current=null] : iv_ruleSPINCHOREGFLAGS= ruleSPINCHOREGFLAGS EOF ;
    public final String entryRuleSPINCHOREGFLAGS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPINCHOREGFLAGS = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3627:2: (iv_ruleSPINCHOREGFLAGS= ruleSPINCHOREGFLAGS EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3628:2: iv_ruleSPINCHOREGFLAGS= ruleSPINCHOREGFLAGS EOF
            {
             newCompositeNode(grammarAccess.getSPINCHOREGFLAGSRule()); 
            pushFollow(FOLLOW_ruleSPINCHOREGFLAGS_in_entryRuleSPINCHOREGFLAGS8399);
            iv_ruleSPINCHOREGFLAGS=ruleSPINCHOREGFLAGS();

            state._fsp--;

             current =iv_ruleSPINCHOREGFLAGS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPINCHOREGFLAGS8410); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3635:1: ruleSPINCHOREGFLAGS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )? ) ;
    public final AntlrDatatypeRuleToken ruleSPINCHOREGFLAGS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;
        Token kw=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3638:28: ( (this_INT_0= RULE_INT | (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )? ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3639:1: (this_INT_0= RULE_INT | (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )? )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3639:1: (this_INT_0= RULE_INT | (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )? )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            else if ( (LA23_0==EOF||LA23_0==RULE_ID||LA23_0==29) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3639:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSPINCHOREGFLAGS8450); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getSPINCHOREGFLAGSAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3647:6: (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )?
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3647:6: (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_ID) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3647:11: this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )*
                            {
                            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINCHOREGFLAGS8477); 

                            		current.merge(this_ID_1);
                                
                             
                                newLeafNode(this_ID_1, grammarAccess.getSPINCHOREGFLAGSAccess().getIDTerminalRuleCall_1_0()); 
                                
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3654:1: (kw= '|' this_ID_3= RULE_ID )*
                            loop21:
                            do {
                                int alt21=2;
                                int LA21_0 = input.LA(1);

                                if ( (LA21_0==59) ) {
                                    alt21=1;
                                }


                                switch (alt21) {
                            	case 1 :
                            	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3655:2: kw= '|' this_ID_3= RULE_ID
                            	    {
                            	    kw=(Token)match(input,59,FOLLOW_59_in_ruleSPINCHOREGFLAGS8496); 

                            	            current.merge(kw);
                            	            newLeafNode(kw, grammarAccess.getSPINCHOREGFLAGSAccess().getVerticalLineKeyword_1_1_0()); 
                            	        
                            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINCHOREGFLAGS8511); 

                            	    		current.merge(this_ID_3);
                            	        
                            	     
                            	        newLeafNode(this_ID_3, grammarAccess.getSPINCHOREGFLAGSAccess().getIDTerminalRuleCall_1_1_1()); 
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop21;
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3675:1: entryRuleSPINMEM returns [EObject current=null] : iv_ruleSPINMEM= ruleSPINMEM EOF ;
    public final EObject entryRuleSPINMEM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPINMEM = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3676:2: (iv_ruleSPINMEM= ruleSPINMEM EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3677:2: iv_ruleSPINMEM= ruleSPINMEM EOF
            {
             newCompositeNode(grammarAccess.getSPINMEMRule()); 
            pushFollow(FOLLOW_ruleSPINMEM_in_entryRuleSPINMEM8560);
            iv_ruleSPINMEM=ruleSPINMEM();

            state._fsp--;

             current =iv_ruleSPINMEM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPINMEM8570); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3684:1: ruleSPINMEM returns [EObject current=null] : ( ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleSPINMEM() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_buffer_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3687:28: ( ( ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3688:1: ( ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3688:1: ( ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )? )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3688:2: ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )?
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3688:2: ( (lv_buffer_0_0= ruleSPINBUF ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3689:1: (lv_buffer_0_0= ruleSPINBUF )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3689:1: (lv_buffer_0_0= ruleSPINBUF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3690:3: lv_buffer_0_0= ruleSPINBUF
            {
             
            	        newCompositeNode(grammarAccess.getSPINMEMAccess().getBufferSPINBUFParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINBUF_in_ruleSPINMEM8616);
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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3706:2: ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )?
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID) ) {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==EOF||LA24_2==RULE_ID||LA24_2==RULE_SC_COMMENT||(LA24_2>=17 && LA24_2<=19)||(LA24_2>=21 && LA24_2<=56)) ) {
                    alt24=2;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3706:3: ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3706:3: ( (lv_value_1_0= RULE_INT ) )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3707:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3707:1: (lv_value_1_0= RULE_INT )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3708:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSPINMEM8634); 

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
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3725:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3725:6: ( (otherlv_2= RULE_ID ) )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3726:1: (otherlv_2= RULE_ID )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3726:1: (otherlv_2= RULE_ID )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3727:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSPINMEMRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINMEM8665); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3746:1: entryRuleSPINBUF returns [String current=null] : iv_ruleSPINBUF= ruleSPINBUF EOF ;
    public final String entryRuleSPINBUF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPINBUF = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3747:2: (iv_ruleSPINBUF= ruleSPINBUF EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3748:2: iv_ruleSPINBUF= ruleSPINBUF EOF
            {
             newCompositeNode(grammarAccess.getSPINBUFRule()); 
            pushFollow(FOLLOW_ruleSPINBUF_in_entryRuleSPINBUF8704);
            iv_ruleSPINBUF=ruleSPINBUF();

            state._fsp--;

             current =iv_ruleSPINBUF.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPINBUF8715); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3755:1: ruleSPINBUF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )? ) ;
    public final AntlrDatatypeRuleToken ruleSPINBUF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3758:28: ( (this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )? ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3759:1: (this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )? )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3759:1: (this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )? )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3759:6: this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINBUF8755); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getSPINBUFAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3766:1: (kw= '#' | kw= '^' )?
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==60) ) {
                alt25=1;
            }
            else if ( (LA25_0==61) ) {
                alt25=2;
            }
            switch (alt25) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3767:2: kw= '#'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleSPINBUF8774); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINBUFAccess().getNumberSignKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3774:2: kw= '^'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleSPINBUF8793); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINBUFAccess().getCircumflexAccentKeyword_1_1()); 
                        

                    }
                    break;

            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3779:3: (kw= '+' | kw= '-' )?
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==62) ) {
                alt26=1;
            }
            else if ( (LA26_0==57) ) {
                alt26=2;
            }
            switch (alt26) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3780:2: kw= '+'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleSPINBUF8809); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINBUFAccess().getPlusSignKeyword_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3787:2: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleSPINBUF8828); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3800:1: entryRuleBINARY24 returns [String current=null] : iv_ruleBINARY24= ruleBINARY24 EOF ;
    public final String entryRuleBINARY24() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBINARY24 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3801:2: (iv_ruleBINARY24= ruleBINARY24 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3802:2: iv_ruleBINARY24= ruleBINARY24 EOF
            {
             newCompositeNode(grammarAccess.getBINARY24Rule()); 
            pushFollow(FOLLOW_ruleBINARY24_in_entryRuleBINARY248871);
            iv_ruleBINARY24=ruleBINARY24();

            state._fsp--;

             current =iv_ruleBINARY24.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBINARY248882); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3809:1: ruleBINARY24 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* ) | (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* ) ) ;
    public final AntlrDatatypeRuleToken ruleBINARY24() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_ID_2=null;
        Token this_INT_4=null;
        Token this_ID_5=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3812:28: ( ( ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* ) | (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3813:1: ( ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* ) | (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3813:1: ( ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* ) | (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==63) ) {
                alt30=1;
            }
            else if ( (LA30_0==64) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3813:2: ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3813:2: ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3813:3: (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )*
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3813:3: (kw= '%' this_INT_1= RULE_INT )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3814:2: kw= '%' this_INT_1= RULE_INT
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleBINARY248922); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBINARY24Access().getPercentSignKeyword_0_0_0()); 
                        
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBINARY248937); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getBINARY24Access().getINTTerminalRuleCall_0_0_1()); 
                        

                    }

                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3826:2: (this_ID_2= RULE_ID )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_ID) ) {
                            int LA27_2 = input.LA(2);

                            if ( (LA27_2==EOF||LA27_2==RULE_ID||LA27_2==RULE_SC_COMMENT||(LA27_2>=17 && LA27_2<=19)||(LA27_2>=21 && LA27_2<=28)||(LA27_2>=30 && LA27_2<=56)) ) {
                                alt27=1;
                            }


                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3826:7: this_ID_2= RULE_ID
                    	    {
                    	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBINARY248959); 

                    	    		current.merge(this_ID_2);
                    	        
                    	     
                    	        newLeafNode(this_ID_2, grammarAccess.getBINARY24Access().getIDTerminalRuleCall_0_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3834:6: (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3834:6: (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3835:2: kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )*
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleBINARY248987); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBINARY24Access().getDollarSignKeyword_1_0()); 
                        
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3840:1: (this_INT_4= RULE_INT )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_INT) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3840:6: this_INT_4= RULE_INT
                    	    {
                    	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBINARY249003); 

                    	    		current.merge(this_INT_4);
                    	        
                    	     
                    	        newLeafNode(this_INT_4, grammarAccess.getBINARY24Access().getINTTerminalRuleCall_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3847:3: (this_ID_5= RULE_ID )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID) ) {
                            int LA29_2 = input.LA(2);

                            if ( (LA29_2==EOF||LA29_2==RULE_ID||LA29_2==RULE_SC_COMMENT||(LA29_2>=17 && LA29_2<=19)||(LA29_2>=21 && LA29_2<=28)||(LA29_2>=30 && LA29_2<=56)) ) {
                                alt29=1;
                            }


                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3847:8: this_ID_5= RULE_ID
                    	    {
                    	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBINARY249026); 

                    	    		current.merge(this_ID_5);
                    	        
                    	     
                    	        newLeafNode(this_ID_5, grammarAccess.getBINARY24Access().getIDTerminalRuleCall_1_2()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleProgram122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProgram139 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_rulePin_in_ruleProgram165 = new BitSet(new long[]{0x01FFFFFFDFEFE050L});
    public static final BitSet FOLLOW_ruleSpinElement_in_ruleProgram187 = new BitSet(new long[]{0x01FFFFFFDFEE0052L});
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
    public static final BitSet FOLLOW_ruleMem_in_ruleSpinElement1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleSpinElement1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleSpinElement1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleSpinElement1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMacro_in_ruleSpinElement1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOffset_in_ruleSpinElement1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquate_in_entryRuleEquate1343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquate1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEquate1390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEquate1407 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleEquate1433 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEquate1451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEquate1473 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleEquate1499 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleEquate1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMem_in_entryRuleMem1558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMem1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMem1605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMem1622 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleMem1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOffset_in_entryRuleOffset1684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOffset1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOffset1731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOffset1748 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleOffset1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment1811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SC_COMMENT_in_ruleComment1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel1902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel1954 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLabel1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMacro_in_entryRuleMacro2007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMacro2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsPinConnected_in_ruleMacro2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsElse_in_ruleMacro2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsEndif_in_ruleMacro2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetInputDefault_in_ruleMacro2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDelayScaleControl_in_ruleMacro2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetOutputPin_in_ruleMacro2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetBaseAddress_in_ruleMacro2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsPinConnected_in_entryRuleIsPinConnected2261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsPinConnected2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleIsPinConnected2308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIsPinConnected2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsElse_in_entryRuleIsElse2366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsElse2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleIsElse2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsEndif_in_entryRuleIsEndif2458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsEndif2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleIsEndif2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetInputDefault_in_entryRuleGetInputDefault2550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetInputDefault2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleGetInputDefault2597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetInputDefault2614 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetInputDefault2636 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleGetInputDefault2662 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleGetInputDefault2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDelayScaleControl_in_entryRuleGetDelayScaleControl2719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetDelayScaleControl2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleGetDelayScaleControl2766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetDelayScaleControl2783 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetDelayScaleControl2805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetDelayScaleControl2827 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetDelayScaleControl2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetBaseAddress_in_entryRuleGetBaseAddress2891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetBaseAddress2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleGetBaseAddress2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetOutputPin_in_entryRuleSetOutputPin2983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetOutputPin2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSetOutputPin3030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetOutputPin3047 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetOutputPin3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction3110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B15_S1_9_in_ruleInstruction3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B6_S1_14_in_ruleInstruction3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_S1_14_S1_10_in_ruleInstruction3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B6_in_ruleInstruction3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B24_in_ruleInstruction3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_ruleInstruction3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJam_in_ruleInstruction3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_X0_in_ruleInstruction3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadSinLFO_in_ruleInstruction3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadRampLFO_in_ruleInstruction3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusReadDelay_in_ruleInstruction3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusReadValue_in_ruleInstruction3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusScaleOffset_in_ruleInstruction3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLog_in_ruleInstruction3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadDelayPointer_in_ruleInstruction3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B6_S1_14_in_entryRuleInst_B6_S1_143580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_B6_S1_143590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadRegister_in_ruleInst_B6_S1_143637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegister_in_ruleInst_B6_S1_143664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadRegisterFilter_in_ruleInst_B6_S1_143691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxx_in_ruleInst_B6_S1_143718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegisterHighshelf_in_ruleInst_B6_S1_143745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegisterLowshelf_in_ruleInst_B6_S1_143772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B15_S1_9_in_entryRuleInst_B15_S1_93807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_B15_S1_93817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadDelay_in_ruleInst_B15_S1_93864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteDelay_in_ruleInst_B15_S1_93891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteAllpass_in_ruleInst_B15_S1_93918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B6_in_entryRuleInst_B63953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_B63963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulx_in_ruleInst_B64010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLdax_in_ruleInst_B64037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B24_in_entryRuleInst_B244072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_B244082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleInst_B244129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleInst_B244156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_ruleInst_B244183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_X0_in_entryRuleInst_X04218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_X04228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClr_in_ruleInst_X04275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_ruleInst_X04302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsa_in_ruleInst_X04329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_S1_14_S1_10_in_entryRuleInst_S1_14_S1_104364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_S1_14_S1_104374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp_in_ruleInst_S1_14_S1_104421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleOffset_in_ruleInst_S1_14_S1_104448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadRegister_in_entryRuleReadRegister4483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadRegister4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleReadRegister4530 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleReadRegister4551 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleReadRegister4563 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleReadRegister4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegisterLowshelf_in_entryRuleWriteRegisterLowshelf4620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWriteRegisterLowshelf4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleWriteRegisterLowshelf4667 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleWriteRegisterLowshelf4688 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleWriteRegisterLowshelf4700 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegisterLowshelf4721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegisterHighshelf_in_entryRuleWriteRegisterHighshelf4757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWriteRegisterHighshelf4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleWriteRegisterHighshelf4804 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleWriteRegisterHighshelf4825 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleWriteRegisterHighshelf4837 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegisterHighshelf4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegister_in_entryRuleWriteRegister4894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWriteRegister4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleWriteRegister4941 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleWriteRegister4962 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleWriteRegister4974 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegister4995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxx_in_entryRuleMaxx5031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxx5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleMaxx5078 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleMaxx5099 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMaxx5111 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleMaxx5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadRegisterFilter_in_entryRuleReadRegisterFilter5168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadRegisterFilter5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleReadRegisterFilter5215 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleReadRegisterFilter5236 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleReadRegisterFilter5248 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleReadRegisterFilter5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulx_in_entryRuleMulx5305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulx5315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleMulx5352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMulx5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLdax_in_entryRuleLdax5410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLdax5420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleLdax5457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLdax5474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp_in_entryRuleExp5515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleExp5562 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleExp5583 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleExp5595 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleExp5616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLog_in_entryRuleLog5652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLog5662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleLog5699 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleLog5720 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleLog5732 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleLog5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleOffset_in_entryRuleScaleOffset5789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleOffset5799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleScaleOffset5836 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleScaleOffset5857 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleScaleOffset5869 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleScaleOffset5890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteDelay_in_entryRuleWriteDelay5926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWriteDelay5936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleWriteDelay5973 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSPINMEM_in_ruleWriteDelay5994 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleWriteDelay6006 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleWriteDelay6027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteAllpass_in_entryRuleWriteAllpass6063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWriteAllpass6073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleWriteAllpass6110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSPINMEM_in_ruleWriteAllpass6131 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleWriteAllpass6143 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleWriteAllpass6164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadDelay_in_entryRuleReadDelay6200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadDelay6210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleReadDelay6247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSPINMEM_in_ruleReadDelay6268 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleReadDelay6280 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleReadDelay6301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadSinLFO_in_entryRuleLoadSinLFO6337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoadSinLFO6347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleLoadSinLFO6384 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleLoadSinLFO6405 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleLoadSinLFO6417 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoadSinLFO6434 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleLoadSinLFO6451 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoadSinLFO6468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadRampLFO_in_entryRuleLoadRampLFO6509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoadRampLFO6519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleLoadRampLFO6556 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleLoadRampLFO6577 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleLoadRampLFO6589 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoadRampLFO6606 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleLoadRampLFO6623 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoadRampLFO6640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusReadDelay_in_entryRuleChorusReadDelay6681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChorusReadDelay6691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleChorusReadDelay6728 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleChorusReadDelay6740 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleChorusReadDelay6761 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleChorusReadDelay6773 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_ruleSPINCHOREGFLAGS_in_ruleChorusReadDelay6794 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleChorusReadDelay6806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSPINMEM_in_ruleChorusReadDelay6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusReadValue_in_entryRuleChorusReadValue6863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChorusReadValue6873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleChorusReadValue6910 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleChorusReadValue6922 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleChorusReadValue6943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusScaleOffset_in_entryRuleChorusScaleOffset6979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChorusScaleOffset6989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleChorusScaleOffset7026 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleChorusScaleOffset7038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChorusScaleOffset7055 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleChorusScaleOffset7072 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_ruleSPINCHOREGFLAGS_in_ruleChorusScaleOffset7093 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleChorusScaleOffset7105 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleChorusScaleOffset7126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadDelayPointer_in_entryRuleReadDelayPointer7162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadDelayPointer7172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleReadDelayPointer7209 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleReadDelayPointer7230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd7266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd7276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAnd7313 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleBINARY24_in_ruleAnd7334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr7370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOr7417 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleBINARY24_in_ruleOr7438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_entryRuleXor7474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXor7484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXor7521 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleBINARY24_in_ruleXor7542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJam_in_entryRuleJam7578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJam7588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleJam7625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJam7642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClr_in_entryRuleClr7683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClr7693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleClr7739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_entryRuleNot7775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNot7785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleNot7831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsa_in_entryRuleAbsa7867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsa7877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleAbsa7923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_entryRuleSkip7959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkip7969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleSkip8006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSkip8023 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSkip8040 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSkip8060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_entryRuleSPINDOUBLE8097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPINDOUBLE8108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleSPINDOUBLE8147 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINDOUBLE8165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSPINDOUBLE8192 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleSPINDOUBLE8211 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSPINDOUBLE8226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_entryRuleSPINREGISTER8276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPINREGISTER8287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINREGISTER8327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSPINREGISTER8353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPINCHOREGFLAGS_in_entryRuleSPINCHOREGFLAGS8399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPINCHOREGFLAGS8410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSPINCHOREGFLAGS8450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINCHOREGFLAGS8477 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleSPINCHOREGFLAGS8496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINCHOREGFLAGS8511 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ruleSPINMEM_in_entryRuleSPINMEM8560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPINMEM8570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPINBUF_in_ruleSPINMEM8616 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSPINMEM8634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINMEM8665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPINBUF_in_entryRuleSPINBUF8704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPINBUF8715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINBUF8755 = new BitSet(new long[]{0x7200000000000002L});
    public static final BitSet FOLLOW_60_in_ruleSPINBUF8774 = new BitSet(new long[]{0x4200000000000002L});
    public static final BitSet FOLLOW_61_in_ruleSPINBUF8793 = new BitSet(new long[]{0x4200000000000002L});
    public static final BitSet FOLLOW_62_in_ruleSPINBUF8809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleSPINBUF8828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARY24_in_entryRuleBINARY248871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBINARY248882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleBINARY248922 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBINARY248937 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBINARY248959 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_64_in_ruleBINARY248987 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBINARY249003 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBINARY249026 = new BitSet(new long[]{0x0000000000000012L});

}