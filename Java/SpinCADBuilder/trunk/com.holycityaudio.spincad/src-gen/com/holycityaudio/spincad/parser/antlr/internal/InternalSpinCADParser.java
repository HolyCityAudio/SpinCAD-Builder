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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_SC_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@name'", "'@audioInput'", "'@audioOutput'", "'@controlInput'", "'@controlOutput'", "'equ'", "'mem'", "'offset'", "'bool'", "'@sliderLabel'", "'@checkbox'", "':'", "'@isPinConnected'", "'@isTrue'", "'@else'", "'@endif'", "'@getInputDefault'", "'@getDelayScaleControl'", "'@getBaseAddress'", "'@setOutputPin'", "'rdax'", "','", "'wrlx'", "'wrhx'", "'wrax'", "'maxx'", "'rdfx'", "'mulx'", "'ldax'", "'exp'", "'log'", "'sof'", "'wra'", "'wrap'", "'rda'", "'wlds'", "'wldr'", "'cho rda'", "'cho rdal'", "'cho sof'", "'rmpa'", "'and'", "'or'", "'xor'", "'jam'", "'clr'", "'not'", "'absa'", "'skp'", "'-'", "'.'", "'|'", "'#'", "'^'", "'+'", "'%'", "'$'", "'true'", "'false'"
    };
    public static final int RULE_SC_COMMENT=6;
    public static final int T__68=68;
    public static final int T__69=69;
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
    public static final int T__70=70;
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

                if ( (LA2_0==RULE_ID||LA2_0==RULE_SC_COMMENT||(LA2_0>=17 && LA2_0<=22)||(LA2_0>=24 && LA2_0<=32)||(LA2_0>=34 && LA2_0<=60)) ) {
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:519:1: ruleSpinElement returns [EObject current=null] : (this_Control_0= ruleControl | this_SpinEquate_1= ruleSpinEquate | this_SpinBool_2= ruleSpinBool | this_Mem_3= ruleMem | this_Instruction_4= ruleInstruction | this_Label_5= ruleLabel | this_Comment_6= ruleComment | this_Macro_7= ruleMacro | this_Offset_8= ruleOffset ) ;
    public final EObject ruleSpinElement() throws RecognitionException {
        EObject current = null;

        EObject this_Control_0 = null;

        EObject this_SpinEquate_1 = null;

        EObject this_SpinBool_2 = null;

        EObject this_Mem_3 = null;

        EObject this_Instruction_4 = null;

        EObject this_Label_5 = null;

        EObject this_Comment_6 = null;

        EObject this_Macro_7 = null;

        EObject this_Offset_8 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:522:28: ( (this_Control_0= ruleControl | this_SpinEquate_1= ruleSpinEquate | this_SpinBool_2= ruleSpinBool | this_Mem_3= ruleMem | this_Instruction_4= ruleInstruction | this_Label_5= ruleLabel | this_Comment_6= ruleComment | this_Macro_7= ruleMacro | this_Offset_8= ruleOffset ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:523:1: (this_Control_0= ruleControl | this_SpinEquate_1= ruleSpinEquate | this_SpinBool_2= ruleSpinBool | this_Mem_3= ruleMem | this_Instruction_4= ruleInstruction | this_Label_5= ruleLabel | this_Comment_6= ruleComment | this_Macro_7= ruleMacro | this_Offset_8= ruleOffset )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:523:1: (this_Control_0= ruleControl | this_SpinEquate_1= ruleSpinEquate | this_SpinBool_2= ruleSpinBool | this_Mem_3= ruleMem | this_Instruction_4= ruleInstruction | this_Label_5= ruleLabel | this_Comment_6= ruleComment | this_Macro_7= ruleMacro | this_Offset_8= ruleOffset )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 18:
                {
                alt6=4;
                }
                break;
            case 32:
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
            case 59:
            case 60:
                {
                alt6=5;
                }
                break;
            case RULE_ID:
                {
                alt6=6;
                }
                break;
            case RULE_SC_COMMENT:
                {
                alt6=7;
                }
                break;
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                {
                alt6=8;
                }
                break;
            case 19:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:524:5: this_Control_0= ruleControl
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getControlParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleControl_in_ruleSpinElement1146);
                    this_Control_0=ruleControl();

                    state._fsp--;

                     
                            current = this_Control_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:534:5: this_SpinEquate_1= ruleSpinEquate
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getSpinEquateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSpinEquate_in_ruleSpinElement1173);
                    this_SpinEquate_1=ruleSpinEquate();

                    state._fsp--;

                     
                            current = this_SpinEquate_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:544:5: this_SpinBool_2= ruleSpinBool
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getSpinBoolParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSpinBool_in_ruleSpinElement1200);
                    this_SpinBool_2=ruleSpinBool();

                    state._fsp--;

                     
                            current = this_SpinBool_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:554:5: this_Mem_3= ruleMem
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getMemParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleMem_in_ruleSpinElement1227);
                    this_Mem_3=ruleMem();

                    state._fsp--;

                     
                            current = this_Mem_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:564:5: this_Instruction_4= ruleInstruction
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getInstructionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleInstruction_in_ruleSpinElement1254);
                    this_Instruction_4=ruleInstruction();

                    state._fsp--;

                     
                            current = this_Instruction_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:574:5: this_Label_5= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getLabelParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleSpinElement1281);
                    this_Label_5=ruleLabel();

                    state._fsp--;

                     
                            current = this_Label_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:584:5: this_Comment_6= ruleComment
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getCommentParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleComment_in_ruleSpinElement1308);
                    this_Comment_6=ruleComment();

                    state._fsp--;

                     
                            current = this_Comment_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:594:5: this_Macro_7= ruleMacro
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getMacroParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleMacro_in_ruleSpinElement1335);
                    this_Macro_7=ruleMacro();

                    state._fsp--;

                     
                            current = this_Macro_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:604:5: this_Offset_8= ruleOffset
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getOffsetParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleOffset_in_ruleSpinElement1362);
                    this_Offset_8=ruleOffset();

                    state._fsp--;

                     
                            current = this_Offset_8; 
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


    // $ANTLR start "entryRuleSpinEquate"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:620:1: entryRuleSpinEquate returns [EObject current=null] : iv_ruleSpinEquate= ruleSpinEquate EOF ;
    public final EObject entryRuleSpinEquate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinEquate = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:621:2: (iv_ruleSpinEquate= ruleSpinEquate EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:622:2: iv_ruleSpinEquate= ruleSpinEquate EOF
            {
             newCompositeNode(grammarAccess.getSpinEquateRule()); 
            pushFollow(FOLLOW_ruleSpinEquate_in_entryRuleSpinEquate1397);
            iv_ruleSpinEquate=ruleSpinEquate();

            state._fsp--;

             current =iv_ruleSpinEquate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpinEquate1407); 

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
    // $ANTLR end "entryRuleSpinEquate"


    // $ANTLR start "ruleSpinEquate"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:629:1: ruleSpinEquate returns [EObject current=null] : (otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleSpinEquate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ename_1_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:632:28: ( (otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:633:1: (otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:633:1: (otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:633:3: otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleSpinEquate1444); 

                	newLeafNode(otherlv_0, grammarAccess.getSpinEquateAccess().getEquKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:637:1: ( (lv_ename_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:638:1: (lv_ename_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:638:1: (lv_ename_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:639:3: lv_ename_1_0= RULE_ID
            {
            lv_ename_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpinEquate1461); 

            			newLeafNode(lv_ename_1_0, grammarAccess.getSpinEquateAccess().getEnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpinEquateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ename",
                    		lv_ename_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:655:2: ( (lv_value_2_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:656:1: (lv_value_2_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:656:1: (lv_value_2_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:657:3: lv_value_2_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getSpinEquateAccess().getValueSPINDOUBLEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleSpinEquate1487);
            lv_value_2_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSpinEquateRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
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
    // $ANTLR end "ruleSpinEquate"


    // $ANTLR start "entryRuleMem"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:681:1: entryRuleMem returns [EObject current=null] : iv_ruleMem= ruleMem EOF ;
    public final EObject entryRuleMem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMem = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:682:2: (iv_ruleMem= ruleMem EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:683:2: iv_ruleMem= ruleMem EOF
            {
             newCompositeNode(grammarAccess.getMemRule()); 
            pushFollow(FOLLOW_ruleMem_in_entryRuleMem1523);
            iv_ruleMem=ruleMem();

            state._fsp--;

             current =iv_ruleMem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMem1533); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:690:1: ruleMem returns [EObject current=null] : (otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) ) ) ;
    public final EObject ruleMem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_buffer_1_0=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:693:28: ( (otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:694:1: (otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:694:1: (otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:694:3: otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleMem1570); 

                	newLeafNode(otherlv_0, grammarAccess.getMemAccess().getMemKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:698:1: ( (lv_buffer_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:699:1: (lv_buffer_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:699:1: (lv_buffer_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:700:3: lv_buffer_1_0= RULE_ID
            {
            lv_buffer_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMem1587); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:716:2: ( (lv_length_2_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:717:1: (lv_length_2_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:717:1: (lv_length_2_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:718:3: lv_length_2_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getMemAccess().getLengthSPINREGISTERParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleMem1613);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:742:1: entryRuleOffset returns [EObject current=null] : iv_ruleOffset= ruleOffset EOF ;
    public final EObject entryRuleOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOffset = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:743:2: (iv_ruleOffset= ruleOffset EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:744:2: iv_ruleOffset= ruleOffset EOF
            {
             newCompositeNode(grammarAccess.getOffsetRule()); 
            pushFollow(FOLLOW_ruleOffset_in_entryRuleOffset1649);
            iv_ruleOffset=ruleOffset();

            state._fsp--;

             current =iv_ruleOffset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOffset1659); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:751:1: ruleOffset returns [EObject current=null] : (otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) ) ) ;
    public final EObject ruleOffset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_length_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:754:28: ( (otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:755:1: (otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:755:1: (otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:755:3: otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleOffset1696); 

                	newLeafNode(otherlv_0, grammarAccess.getOffsetAccess().getOffsetKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:759:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:760:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:760:1: (lv_name_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:761:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOffset1713); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:777:2: ( (lv_length_2_0= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:778:1: (lv_length_2_0= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:778:1: (lv_length_2_0= RULE_INT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:779:3: lv_length_2_0= RULE_INT
            {
            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleOffset1735); 

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


    // $ANTLR start "entryRuleSpinBool"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:803:1: entryRuleSpinBool returns [EObject current=null] : iv_ruleSpinBool= ruleSpinBool EOF ;
    public final EObject entryRuleSpinBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinBool = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:804:2: (iv_ruleSpinBool= ruleSpinBool EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:805:2: iv_ruleSpinBool= ruleSpinBool EOF
            {
             newCompositeNode(grammarAccess.getSpinBoolRule()); 
            pushFollow(FOLLOW_ruleSpinBool_in_entryRuleSpinBool1776);
            iv_ruleSpinBool=ruleSpinBool();

            state._fsp--;

             current =iv_ruleSpinBool; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpinBool1786); 

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
    // $ANTLR end "entryRuleSpinBool"


    // $ANTLR start "ruleSpinBool"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:812:1: ruleSpinBool returns [EObject current=null] : (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleBOOLEAN ) ) ) ;
    public final EObject ruleSpinBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:815:28: ( (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleBOOLEAN ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:816:1: (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleBOOLEAN ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:816:1: (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleBOOLEAN ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:816:3: otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleBOOLEAN ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleSpinBool1823); 

                	newLeafNode(otherlv_0, grammarAccess.getSpinBoolAccess().getBoolKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:820:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:821:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:821:1: (lv_name_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:822:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpinBool1840); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSpinBoolAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpinBoolRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:838:2: ( (lv_value_2_0= ruleBOOLEAN ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:839:1: (lv_value_2_0= ruleBOOLEAN )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:839:1: (lv_value_2_0= ruleBOOLEAN )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:840:3: lv_value_2_0= ruleBOOLEAN
            {
             
            	        newCompositeNode(grammarAccess.getSpinBoolAccess().getValueBOOLEANParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBOOLEAN_in_ruleSpinBool1866);
            lv_value_2_0=ruleBOOLEAN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSpinBoolRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"BOOLEAN");
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
    // $ANTLR end "ruleSpinBool"


    // $ANTLR start "entryRuleControl"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:864:1: entryRuleControl returns [EObject current=null] : iv_ruleControl= ruleControl EOF ;
    public final EObject entryRuleControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControl = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:865:2: (iv_ruleControl= ruleControl EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:866:2: iv_ruleControl= ruleControl EOF
            {
             newCompositeNode(grammarAccess.getControlRule()); 
            pushFollow(FOLLOW_ruleControl_in_entryRuleControl1902);
            iv_ruleControl=ruleControl();

            state._fsp--;

             current =iv_ruleControl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControl1912); 

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
    // $ANTLR end "entryRuleControl"


    // $ANTLR start "ruleControl"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:873:1: ruleControl returns [EObject current=null] : (this_SpinSliderLabel_0= ruleSpinSliderLabel | this_SpinCheckBox_1= ruleSpinCheckBox ) ;
    public final EObject ruleControl() throws RecognitionException {
        EObject current = null;

        EObject this_SpinSliderLabel_0 = null;

        EObject this_SpinCheckBox_1 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:876:28: ( (this_SpinSliderLabel_0= ruleSpinSliderLabel | this_SpinCheckBox_1= ruleSpinCheckBox ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:877:1: (this_SpinSliderLabel_0= ruleSpinSliderLabel | this_SpinCheckBox_1= ruleSpinCheckBox )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:877:1: (this_SpinSliderLabel_0= ruleSpinSliderLabel | this_SpinCheckBox_1= ruleSpinCheckBox )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:878:5: this_SpinSliderLabel_0= ruleSpinSliderLabel
                    {
                     
                            newCompositeNode(grammarAccess.getControlAccess().getSpinSliderLabelParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSpinSliderLabel_in_ruleControl1959);
                    this_SpinSliderLabel_0=ruleSpinSliderLabel();

                    state._fsp--;

                     
                            current = this_SpinSliderLabel_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:888:5: this_SpinCheckBox_1= ruleSpinCheckBox
                    {
                     
                            newCompositeNode(grammarAccess.getControlAccess().getSpinCheckBoxParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSpinCheckBox_in_ruleControl1986);
                    this_SpinCheckBox_1=ruleSpinCheckBox();

                    state._fsp--;

                     
                            current = this_SpinCheckBox_1; 
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
    // $ANTLR end "ruleControl"


    // $ANTLR start "entryRuleSpinSliderLabel"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:904:1: entryRuleSpinSliderLabel returns [EObject current=null] : iv_ruleSpinSliderLabel= ruleSpinSliderLabel EOF ;
    public final EObject entryRuleSpinSliderLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinSliderLabel = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:905:2: (iv_ruleSpinSliderLabel= ruleSpinSliderLabel EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:906:2: iv_ruleSpinSliderLabel= ruleSpinSliderLabel EOF
            {
             newCompositeNode(grammarAccess.getSpinSliderLabelRule()); 
            pushFollow(FOLLOW_ruleSpinSliderLabel_in_entryRuleSpinSliderLabel2021);
            iv_ruleSpinSliderLabel=ruleSpinSliderLabel();

            state._fsp--;

             current =iv_ruleSpinSliderLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpinSliderLabel2031); 

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
    // $ANTLR end "entryRuleSpinSliderLabel"


    // $ANTLR start "ruleSpinSliderLabel"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:913:1: ruleSpinSliderLabel returns [EObject current=null] : (otherlv_0= '@sliderLabel' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_controlName_2_0= RULE_ID ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_5_0= ruleSPINDOUBLE ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_option_7_0= RULE_ID ) )? )? ) ;
    public final EObject ruleSpinSliderLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ename_1_0=null;
        Token lv_controlName_2_0=null;
        Token lv_precision_6_0=null;
        Token lv_option_7_0=null;
        AntlrDatatypeRuleToken lv_minVal_3_0 = null;

        AntlrDatatypeRuleToken lv_maxVal_4_0 = null;

        AntlrDatatypeRuleToken lv_multiplier_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:916:28: ( (otherlv_0= '@sliderLabel' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_controlName_2_0= RULE_ID ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_5_0= ruleSPINDOUBLE ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_option_7_0= RULE_ID ) )? )? ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:917:1: (otherlv_0= '@sliderLabel' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_controlName_2_0= RULE_ID ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_5_0= ruleSPINDOUBLE ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_option_7_0= RULE_ID ) )? )? )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:917:1: (otherlv_0= '@sliderLabel' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_controlName_2_0= RULE_ID ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_5_0= ruleSPINDOUBLE ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_option_7_0= RULE_ID ) )? )? )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:917:3: otherlv_0= '@sliderLabel' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_controlName_2_0= RULE_ID ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_5_0= ruleSPINDOUBLE ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_option_7_0= RULE_ID ) )? )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleSpinSliderLabel2068); 

                	newLeafNode(otherlv_0, grammarAccess.getSpinSliderLabelAccess().getSliderLabelKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:921:1: ( (lv_ename_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:922:1: (lv_ename_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:922:1: (lv_ename_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:923:3: lv_ename_1_0= RULE_ID
            {
            lv_ename_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpinSliderLabel2085); 

            			newLeafNode(lv_ename_1_0, grammarAccess.getSpinSliderLabelAccess().getEnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpinSliderLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ename",
                    		lv_ename_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:939:2: ( (lv_controlName_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:940:1: (lv_controlName_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:940:1: (lv_controlName_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:941:3: lv_controlName_2_0= RULE_ID
            {
            lv_controlName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpinSliderLabel2107); 

            			newLeafNode(lv_controlName_2_0, grammarAccess.getSpinSliderLabelAccess().getControlNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpinSliderLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"controlName",
                    		lv_controlName_2_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:957:2: ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_5_0= ruleSPINDOUBLE ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_option_7_0= RULE_ID ) )? )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||LA9_0==61) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                int LA9_2 = input.LA(2);

                if ( ((LA9_2>=RULE_ID && LA9_2<=RULE_INT)||LA9_2==61) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:957:3: ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_5_0= ruleSPINDOUBLE ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_option_7_0= RULE_ID ) )?
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:957:3: ( (lv_minVal_3_0= ruleSPINDOUBLE ) )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:958:1: (lv_minVal_3_0= ruleSPINDOUBLE )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:958:1: (lv_minVal_3_0= ruleSPINDOUBLE )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:959:3: lv_minVal_3_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSpinSliderLabelAccess().getMinValSPINDOUBLEParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleSpinSliderLabel2134);
                    lv_minVal_3_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSpinSliderLabelRule());
                    	        }
                           		set(
                           			current, 
                           			"minVal",
                            		lv_minVal_3_0, 
                            		"SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:975:2: ( (lv_maxVal_4_0= ruleSPINDOUBLE ) )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:976:1: (lv_maxVal_4_0= ruleSPINDOUBLE )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:976:1: (lv_maxVal_4_0= ruleSPINDOUBLE )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:977:3: lv_maxVal_4_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSpinSliderLabelAccess().getMaxValSPINDOUBLEParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleSpinSliderLabel2155);
                    lv_maxVal_4_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSpinSliderLabelRule());
                    	        }
                           		set(
                           			current, 
                           			"maxVal",
                            		lv_maxVal_4_0, 
                            		"SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:993:2: ( (lv_multiplier_5_0= ruleSPINDOUBLE ) )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:994:1: (lv_multiplier_5_0= ruleSPINDOUBLE )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:994:1: (lv_multiplier_5_0= ruleSPINDOUBLE )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:995:3: lv_multiplier_5_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSpinSliderLabelAccess().getMultiplierSPINDOUBLEParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleSpinSliderLabel2176);
                    lv_multiplier_5_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSpinSliderLabelRule());
                    	        }
                           		set(
                           			current, 
                           			"multiplier",
                            		lv_multiplier_5_0, 
                            		"SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1011:2: ( (lv_precision_6_0= RULE_INT ) )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1012:1: (lv_precision_6_0= RULE_INT )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1012:1: (lv_precision_6_0= RULE_INT )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1013:3: lv_precision_6_0= RULE_INT
                    {
                    lv_precision_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSpinSliderLabel2193); 

                    			newLeafNode(lv_precision_6_0, grammarAccess.getSpinSliderLabelAccess().getPrecisionINTTerminalRuleCall_3_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpinSliderLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"precision",
                            		lv_precision_6_0, 
                            		"INT");
                    	    

                    }


                    }

                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1029:2: ( (lv_option_7_0= RULE_ID ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID) ) {
                        int LA8_1 = input.LA(2);

                        if ( (LA8_1==EOF||LA8_1==RULE_ID||LA8_1==RULE_SC_COMMENT||(LA8_1>=17 && LA8_1<=22)||(LA8_1>=24 && LA8_1<=32)||(LA8_1>=34 && LA8_1<=60)) ) {
                            alt8=1;
                        }
                    }
                    switch (alt8) {
                        case 1 :
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1030:1: (lv_option_7_0= RULE_ID )
                            {
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1030:1: (lv_option_7_0= RULE_ID )
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1031:3: lv_option_7_0= RULE_ID
                            {
                            lv_option_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpinSliderLabel2215); 

                            			newLeafNode(lv_option_7_0, grammarAccess.getSpinSliderLabelAccess().getOptionIDTerminalRuleCall_3_4_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSpinSliderLabelRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"option",
                                    		lv_option_7_0, 
                                    		"ID");
                            	    

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
    // $ANTLR end "ruleSpinSliderLabel"


    // $ANTLR start "entryRuleSpinCheckBox"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1055:1: entryRuleSpinCheckBox returns [EObject current=null] : iv_ruleSpinCheckBox= ruleSpinCheckBox EOF ;
    public final EObject entryRuleSpinCheckBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinCheckBox = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1056:2: (iv_ruleSpinCheckBox= ruleSpinCheckBox EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1057:2: iv_ruleSpinCheckBox= ruleSpinCheckBox EOF
            {
             newCompositeNode(grammarAccess.getSpinCheckBoxRule()); 
            pushFollow(FOLLOW_ruleSpinCheckBox_in_entryRuleSpinCheckBox2259);
            iv_ruleSpinCheckBox=ruleSpinCheckBox();

            state._fsp--;

             current =iv_ruleSpinCheckBox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpinCheckBox2269); 

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
    // $ANTLR end "entryRuleSpinCheckBox"


    // $ANTLR start "ruleSpinCheckBox"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1064:1: ruleSpinCheckBox returns [EObject current=null] : (otherlv_0= '@checkbox' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_controlName_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSpinCheckBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ename_1_0=null;
        Token lv_controlName_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1067:28: ( (otherlv_0= '@checkbox' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_controlName_2_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1068:1: (otherlv_0= '@checkbox' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_controlName_2_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1068:1: (otherlv_0= '@checkbox' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_controlName_2_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1068:3: otherlv_0= '@checkbox' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_controlName_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleSpinCheckBox2306); 

                	newLeafNode(otherlv_0, grammarAccess.getSpinCheckBoxAccess().getCheckboxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1072:1: ( (lv_ename_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1073:1: (lv_ename_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1073:1: (lv_ename_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1074:3: lv_ename_1_0= RULE_ID
            {
            lv_ename_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpinCheckBox2323); 

            			newLeafNode(lv_ename_1_0, grammarAccess.getSpinCheckBoxAccess().getEnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpinCheckBoxRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ename",
                    		lv_ename_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1090:2: ( (lv_controlName_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1091:1: (lv_controlName_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1091:1: (lv_controlName_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1092:3: lv_controlName_2_0= RULE_ID
            {
            lv_controlName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpinCheckBox2345); 

            			newLeafNode(lv_controlName_2_0, grammarAccess.getSpinCheckBoxAccess().getControlNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpinCheckBoxRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"controlName",
                    		lv_controlName_2_0, 
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
    // $ANTLR end "ruleSpinCheckBox"


    // $ANTLR start "entryRuleComment"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1116:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1117:2: (iv_ruleComment= ruleComment EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1118:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment2386);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment2396); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1125:1: ruleComment returns [EObject current=null] : ( (lv_remark_0_0= RULE_SC_COMMENT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_remark_0_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1128:28: ( ( (lv_remark_0_0= RULE_SC_COMMENT ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1129:1: ( (lv_remark_0_0= RULE_SC_COMMENT ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1129:1: ( (lv_remark_0_0= RULE_SC_COMMENT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1130:1: (lv_remark_0_0= RULE_SC_COMMENT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1130:1: (lv_remark_0_0= RULE_SC_COMMENT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1131:3: lv_remark_0_0= RULE_SC_COMMENT
            {
            lv_remark_0_0=(Token)match(input,RULE_SC_COMMENT,FOLLOW_RULE_SC_COMMENT_in_ruleComment2437); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1155:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1156:2: (iv_ruleLabel= ruleLabel EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1157:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel2477);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel2487); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1164:1: ruleLabel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1167:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1168:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1168:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1168:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1168:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1169:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1169:1: (lv_name_0_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1170:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel2529); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleLabel2546); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1198:1: entryRuleMacro returns [EObject current=null] : iv_ruleMacro= ruleMacro EOF ;
    public final EObject entryRuleMacro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacro = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1199:2: (iv_ruleMacro= ruleMacro EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1200:2: iv_ruleMacro= ruleMacro EOF
            {
             newCompositeNode(grammarAccess.getMacroRule()); 
            pushFollow(FOLLOW_ruleMacro_in_entryRuleMacro2582);
            iv_ruleMacro=ruleMacro();

            state._fsp--;

             current =iv_ruleMacro; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMacro2592); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1207:1: ruleMacro returns [EObject current=null] : (this_IsPinConnected_0= ruleIsPinConnected | this_IsTrue_1= ruleIsTrue | this_IsElse_2= ruleIsElse | this_IsEndif_3= ruleIsEndif | this_GetInputDefault_4= ruleGetInputDefault | this_GetDelayScaleControl_5= ruleGetDelayScaleControl | this_SetOutputPin_6= ruleSetOutputPin | this_GetBaseAddress_7= ruleGetBaseAddress ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1210:28: ( (this_IsPinConnected_0= ruleIsPinConnected | this_IsTrue_1= ruleIsTrue | this_IsElse_2= ruleIsElse | this_IsEndif_3= ruleIsEndif | this_GetInputDefault_4= ruleGetInputDefault | this_GetDelayScaleControl_5= ruleGetDelayScaleControl | this_SetOutputPin_6= ruleSetOutputPin | this_GetBaseAddress_7= ruleGetBaseAddress ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1211:1: (this_IsPinConnected_0= ruleIsPinConnected | this_IsTrue_1= ruleIsTrue | this_IsElse_2= ruleIsElse | this_IsEndif_3= ruleIsEndif | this_GetInputDefault_4= ruleGetInputDefault | this_GetDelayScaleControl_5= ruleGetDelayScaleControl | this_SetOutputPin_6= ruleSetOutputPin | this_GetBaseAddress_7= ruleGetBaseAddress )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1211:1: (this_IsPinConnected_0= ruleIsPinConnected | this_IsTrue_1= ruleIsTrue | this_IsElse_2= ruleIsElse | this_IsEndif_3= ruleIsEndif | this_GetInputDefault_4= ruleGetInputDefault | this_GetDelayScaleControl_5= ruleGetDelayScaleControl | this_SetOutputPin_6= ruleSetOutputPin | this_GetBaseAddress_7= ruleGetBaseAddress )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt10=1;
                }
                break;
            case 25:
                {
                alt10=2;
                }
                break;
            case 26:
                {
                alt10=3;
                }
                break;
            case 27:
                {
                alt10=4;
                }
                break;
            case 28:
                {
                alt10=5;
                }
                break;
            case 29:
                {
                alt10=6;
                }
                break;
            case 31:
                {
                alt10=7;
                }
                break;
            case 30:
                {
                alt10=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1212:5: this_IsPinConnected_0= ruleIsPinConnected
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsPinConnectedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIsPinConnected_in_ruleMacro2639);
                    this_IsPinConnected_0=ruleIsPinConnected();

                    state._fsp--;

                     
                            current = this_IsPinConnected_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1222:5: this_IsTrue_1= ruleIsTrue
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsTrueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIsTrue_in_ruleMacro2666);
                    this_IsTrue_1=ruleIsTrue();

                    state._fsp--;

                     
                            current = this_IsTrue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1232:5: this_IsElse_2= ruleIsElse
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsElseParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIsElse_in_ruleMacro2693);
                    this_IsElse_2=ruleIsElse();

                    state._fsp--;

                     
                            current = this_IsElse_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1242:5: this_IsEndif_3= ruleIsEndif
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsEndifParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleIsEndif_in_ruleMacro2720);
                    this_IsEndif_3=ruleIsEndif();

                    state._fsp--;

                     
                            current = this_IsEndif_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1252:5: this_GetInputDefault_4= ruleGetInputDefault
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getGetInputDefaultParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleGetInputDefault_in_ruleMacro2747);
                    this_GetInputDefault_4=ruleGetInputDefault();

                    state._fsp--;

                     
                            current = this_GetInputDefault_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1262:5: this_GetDelayScaleControl_5= ruleGetDelayScaleControl
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getGetDelayScaleControlParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleGetDelayScaleControl_in_ruleMacro2774);
                    this_GetDelayScaleControl_5=ruleGetDelayScaleControl();

                    state._fsp--;

                     
                            current = this_GetDelayScaleControl_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1272:5: this_SetOutputPin_6= ruleSetOutputPin
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getSetOutputPinParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleSetOutputPin_in_ruleMacro2801);
                    this_SetOutputPin_6=ruleSetOutputPin();

                    state._fsp--;

                     
                            current = this_SetOutputPin_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1282:5: this_GetBaseAddress_7= ruleGetBaseAddress
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getGetBaseAddressParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleGetBaseAddress_in_ruleMacro2828);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1298:1: entryRuleIsPinConnected returns [EObject current=null] : iv_ruleIsPinConnected= ruleIsPinConnected EOF ;
    public final EObject entryRuleIsPinConnected() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsPinConnected = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1299:2: (iv_ruleIsPinConnected= ruleIsPinConnected EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1300:2: iv_ruleIsPinConnected= ruleIsPinConnected EOF
            {
             newCompositeNode(grammarAccess.getIsPinConnectedRule()); 
            pushFollow(FOLLOW_ruleIsPinConnected_in_entryRuleIsPinConnected2863);
            iv_ruleIsPinConnected=ruleIsPinConnected();

            state._fsp--;

             current =iv_ruleIsPinConnected; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsPinConnected2873); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1307:1: ruleIsPinConnected returns [EObject current=null] : (otherlv_0= '@isPinConnected' ( (lv_arg1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIsPinConnected() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1310:28: ( (otherlv_0= '@isPinConnected' ( (lv_arg1_1_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1311:1: (otherlv_0= '@isPinConnected' ( (lv_arg1_1_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1311:1: (otherlv_0= '@isPinConnected' ( (lv_arg1_1_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1311:3: otherlv_0= '@isPinConnected' ( (lv_arg1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleIsPinConnected2910); 

                	newLeafNode(otherlv_0, grammarAccess.getIsPinConnectedAccess().getIsPinConnectedKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1315:1: ( (lv_arg1_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1316:1: (lv_arg1_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1316:1: (lv_arg1_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1317:3: lv_arg1_1_0= RULE_ID
            {
            lv_arg1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIsPinConnected2927); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1341:1: entryRuleIsTrue returns [EObject current=null] : iv_ruleIsTrue= ruleIsTrue EOF ;
    public final EObject entryRuleIsTrue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsTrue = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1342:2: (iv_ruleIsTrue= ruleIsTrue EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1343:2: iv_ruleIsTrue= ruleIsTrue EOF
            {
             newCompositeNode(grammarAccess.getIsTrueRule()); 
            pushFollow(FOLLOW_ruleIsTrue_in_entryRuleIsTrue2968);
            iv_ruleIsTrue=ruleIsTrue();

            state._fsp--;

             current =iv_ruleIsTrue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsTrue2978); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1350:1: ruleIsTrue returns [EObject current=null] : (otherlv_0= '@isTrue' ( (lv_variable_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIsTrue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1353:28: ( (otherlv_0= '@isTrue' ( (lv_variable_1_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1354:1: (otherlv_0= '@isTrue' ( (lv_variable_1_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1354:1: (otherlv_0= '@isTrue' ( (lv_variable_1_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1354:3: otherlv_0= '@isTrue' ( (lv_variable_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleIsTrue3015); 

                	newLeafNode(otherlv_0, grammarAccess.getIsTrueAccess().getIsTrueKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1358:1: ( (lv_variable_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1359:1: (lv_variable_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1359:1: (lv_variable_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1360:3: lv_variable_1_0= RULE_ID
            {
            lv_variable_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIsTrue3032); 

            			newLeafNode(lv_variable_1_0, grammarAccess.getIsTrueAccess().getVariableIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIsTrueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1384:1: entryRuleIsElse returns [EObject current=null] : iv_ruleIsElse= ruleIsElse EOF ;
    public final EObject entryRuleIsElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsElse = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1385:2: (iv_ruleIsElse= ruleIsElse EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1386:2: iv_ruleIsElse= ruleIsElse EOF
            {
             newCompositeNode(grammarAccess.getIsElseRule()); 
            pushFollow(FOLLOW_ruleIsElse_in_entryRuleIsElse3073);
            iv_ruleIsElse=ruleIsElse();

            state._fsp--;

             current =iv_ruleIsElse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsElse3083); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1393:1: ruleIsElse returns [EObject current=null] : ( () otherlv_1= '@else' ) ;
    public final EObject ruleIsElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1396:28: ( ( () otherlv_1= '@else' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1397:1: ( () otherlv_1= '@else' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1397:1: ( () otherlv_1= '@else' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1397:2: () otherlv_1= '@else'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1397:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1398:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIsElseAccess().getIsElseAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleIsElse3129); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1415:1: entryRuleIsEndif returns [EObject current=null] : iv_ruleIsEndif= ruleIsEndif EOF ;
    public final EObject entryRuleIsEndif() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsEndif = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1416:2: (iv_ruleIsEndif= ruleIsEndif EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1417:2: iv_ruleIsEndif= ruleIsEndif EOF
            {
             newCompositeNode(grammarAccess.getIsEndifRule()); 
            pushFollow(FOLLOW_ruleIsEndif_in_entryRuleIsEndif3165);
            iv_ruleIsEndif=ruleIsEndif();

            state._fsp--;

             current =iv_ruleIsEndif; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsEndif3175); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1424:1: ruleIsEndif returns [EObject current=null] : ( () otherlv_1= '@endif' ) ;
    public final EObject ruleIsEndif() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1427:28: ( ( () otherlv_1= '@endif' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1428:1: ( () otherlv_1= '@endif' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1428:1: ( () otherlv_1= '@endif' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1428:2: () otherlv_1= '@endif'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1428:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1429:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIsEndifAccess().getIsEndifAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleIsEndif3221); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1446:1: entryRuleGetInputDefault returns [EObject current=null] : iv_ruleGetInputDefault= ruleGetInputDefault EOF ;
    public final EObject entryRuleGetInputDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetInputDefault = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1447:2: (iv_ruleGetInputDefault= ruleGetInputDefault EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1448:2: iv_ruleGetInputDefault= ruleGetInputDefault EOF
            {
             newCompositeNode(grammarAccess.getGetInputDefaultRule()); 
            pushFollow(FOLLOW_ruleGetInputDefault_in_entryRuleGetInputDefault3257);
            iv_ruleGetInputDefault=ruleGetInputDefault();

            state._fsp--;

             current =iv_ruleGetInputDefault; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetInputDefault3267); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1455:1: ruleGetInputDefault returns [EObject current=null] : (otherlv_0= '@getInputDefault' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleGetInputDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_variable_2_0=null;
        AntlrDatatypeRuleToken lv_scale_3_0 = null;

        AntlrDatatypeRuleToken lv_defaultVal_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1458:28: ( (otherlv_0= '@getInputDefault' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1459:1: (otherlv_0= '@getInputDefault' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1459:1: (otherlv_0= '@getInputDefault' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1459:3: otherlv_0= '@getInputDefault' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleGetInputDefault3304); 

                	newLeafNode(otherlv_0, grammarAccess.getGetInputDefaultAccess().getGetInputDefaultKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1463:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1464:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1464:1: (lv_name_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1465:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetInputDefault3321); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1481:2: ( (lv_variable_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1482:1: (lv_variable_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1482:1: (lv_variable_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1483:3: lv_variable_2_0= RULE_ID
            {
            lv_variable_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetInputDefault3343); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1499:2: ( (lv_scale_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1500:1: (lv_scale_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1500:1: (lv_scale_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1501:3: lv_scale_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getGetInputDefaultAccess().getScaleSPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleGetInputDefault3369);
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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1517:2: ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1518:1: (lv_defaultVal_4_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1518:1: (lv_defaultVal_4_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1519:3: lv_defaultVal_4_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getGetInputDefaultAccess().getDefaultValSPINDOUBLEParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleGetInputDefault3390);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1543:1: entryRuleGetDelayScaleControl returns [EObject current=null] : iv_ruleGetDelayScaleControl= ruleGetDelayScaleControl EOF ;
    public final EObject entryRuleGetDelayScaleControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetDelayScaleControl = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1544:2: (iv_ruleGetDelayScaleControl= ruleGetDelayScaleControl EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1545:2: iv_ruleGetDelayScaleControl= ruleGetDelayScaleControl EOF
            {
             newCompositeNode(grammarAccess.getGetDelayScaleControlRule()); 
            pushFollow(FOLLOW_ruleGetDelayScaleControl_in_entryRuleGetDelayScaleControl3426);
            iv_ruleGetDelayScaleControl=ruleGetDelayScaleControl();

            state._fsp--;

             current =iv_ruleGetDelayScaleControl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetDelayScaleControl3436); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1552:1: ruleGetDelayScaleControl returns [EObject current=null] : (otherlv_0= '@getDelayScaleControl' ( (lv_ratio_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_offset_3_0= RULE_ID ) ) ( (lv_control_4_0= RULE_ID ) )? ) ;
    public final EObject ruleGetDelayScaleControl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ratio_1_0=null;
        Token lv_length_2_0=null;
        Token lv_offset_3_0=null;
        Token lv_control_4_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1555:28: ( (otherlv_0= '@getDelayScaleControl' ( (lv_ratio_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_offset_3_0= RULE_ID ) ) ( (lv_control_4_0= RULE_ID ) )? ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1556:1: (otherlv_0= '@getDelayScaleControl' ( (lv_ratio_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_offset_3_0= RULE_ID ) ) ( (lv_control_4_0= RULE_ID ) )? )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1556:1: (otherlv_0= '@getDelayScaleControl' ( (lv_ratio_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_offset_3_0= RULE_ID ) ) ( (lv_control_4_0= RULE_ID ) )? )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1556:3: otherlv_0= '@getDelayScaleControl' ( (lv_ratio_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_offset_3_0= RULE_ID ) ) ( (lv_control_4_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleGetDelayScaleControl3473); 

                	newLeafNode(otherlv_0, grammarAccess.getGetDelayScaleControlAccess().getGetDelayScaleControlKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1560:1: ( (lv_ratio_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1561:1: (lv_ratio_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1561:1: (lv_ratio_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1562:3: lv_ratio_1_0= RULE_ID
            {
            lv_ratio_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3490); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1578:2: ( (lv_length_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1579:1: (lv_length_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1579:1: (lv_length_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1580:3: lv_length_2_0= RULE_ID
            {
            lv_length_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3512); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1596:2: ( (lv_offset_3_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1597:1: (lv_offset_3_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1597:1: (lv_offset_3_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1598:3: lv_offset_3_0= RULE_ID
            {
            lv_offset_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3534); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1614:2: ( (lv_control_4_0= RULE_ID ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||LA11_1==RULE_ID||LA11_1==RULE_SC_COMMENT||(LA11_1>=17 && LA11_1<=22)||(LA11_1>=24 && LA11_1<=32)||(LA11_1>=34 && LA11_1<=60)) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1615:1: (lv_control_4_0= RULE_ID )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1615:1: (lv_control_4_0= RULE_ID )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1616:3: lv_control_4_0= RULE_ID
                    {
                    lv_control_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3556); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1640:1: entryRuleGetBaseAddress returns [EObject current=null] : iv_ruleGetBaseAddress= ruleGetBaseAddress EOF ;
    public final EObject entryRuleGetBaseAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetBaseAddress = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1641:2: (iv_ruleGetBaseAddress= ruleGetBaseAddress EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1642:2: iv_ruleGetBaseAddress= ruleGetBaseAddress EOF
            {
             newCompositeNode(grammarAccess.getGetBaseAddressRule()); 
            pushFollow(FOLLOW_ruleGetBaseAddress_in_entryRuleGetBaseAddress3598);
            iv_ruleGetBaseAddress=ruleGetBaseAddress();

            state._fsp--;

             current =iv_ruleGetBaseAddress; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetBaseAddress3608); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1649:1: ruleGetBaseAddress returns [EObject current=null] : ( () otherlv_1= '@getBaseAddress' ) ;
    public final EObject ruleGetBaseAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1652:28: ( ( () otherlv_1= '@getBaseAddress' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1653:1: ( () otherlv_1= '@getBaseAddress' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1653:1: ( () otherlv_1= '@getBaseAddress' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1653:2: () otherlv_1= '@getBaseAddress'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1653:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1654:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGetBaseAddressAccess().getGetBaseAddressAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleGetBaseAddress3654); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1671:1: entryRuleSetOutputPin returns [EObject current=null] : iv_ruleSetOutputPin= ruleSetOutputPin EOF ;
    public final EObject entryRuleSetOutputPin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetOutputPin = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1672:2: (iv_ruleSetOutputPin= ruleSetOutputPin EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1673:2: iv_ruleSetOutputPin= ruleSetOutputPin EOF
            {
             newCompositeNode(grammarAccess.getSetOutputPinRule()); 
            pushFollow(FOLLOW_ruleSetOutputPin_in_entryRuleSetOutputPin3690);
            iv_ruleSetOutputPin=ruleSetOutputPin();

            state._fsp--;

             current =iv_ruleSetOutputPin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetOutputPin3700); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1680:1: ruleSetOutputPin returns [EObject current=null] : (otherlv_0= '@setOutputPin' ( (lv_pinName_1_0= RULE_ID ) ) ( (lv_varName_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSetOutputPin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_pinName_1_0=null;
        Token lv_varName_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1683:28: ( (otherlv_0= '@setOutputPin' ( (lv_pinName_1_0= RULE_ID ) ) ( (lv_varName_2_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1684:1: (otherlv_0= '@setOutputPin' ( (lv_pinName_1_0= RULE_ID ) ) ( (lv_varName_2_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1684:1: (otherlv_0= '@setOutputPin' ( (lv_pinName_1_0= RULE_ID ) ) ( (lv_varName_2_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1684:3: otherlv_0= '@setOutputPin' ( (lv_pinName_1_0= RULE_ID ) ) ( (lv_varName_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleSetOutputPin3737); 

                	newLeafNode(otherlv_0, grammarAccess.getSetOutputPinAccess().getSetOutputPinKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1688:1: ( (lv_pinName_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1689:1: (lv_pinName_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1689:1: (lv_pinName_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1690:3: lv_pinName_1_0= RULE_ID
            {
            lv_pinName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetOutputPin3754); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1706:2: ( (lv_varName_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1707:1: (lv_varName_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1707:1: (lv_varName_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1708:3: lv_varName_2_0= RULE_ID
            {
            lv_varName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetOutputPin3776); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1732:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1733:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1734:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction3817);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction3827); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1741:1: ruleInstruction returns [EObject current=null] : (this_Inst_B15_S1_9_0= ruleInst_B15_S1_9 | this_Inst_B6_S1_14_1= ruleInst_B6_S1_14 | this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10 | this_Inst_B6_3= ruleInst_B6 | this_Inst_B24_4= ruleInst_B24 | this_Skip_5= ruleSkip | this_Jam_6= ruleJam | this_Inst_X0_7= ruleInst_X0 | this_LoadSinLFO_8= ruleLoadSinLFO | this_LoadRampLFO_9= ruleLoadRampLFO | this_ChorusReadDelay_10= ruleChorusReadDelay | this_ChorusReadValue_11= ruleChorusReadValue | this_ChorusScaleOffset_12= ruleChorusScaleOffset | this_Log_13= ruleLog | this_ReadDelayPointer_14= ruleReadDelayPointer ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1744:28: ( (this_Inst_B15_S1_9_0= ruleInst_B15_S1_9 | this_Inst_B6_S1_14_1= ruleInst_B6_S1_14 | this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10 | this_Inst_B6_3= ruleInst_B6 | this_Inst_B24_4= ruleInst_B24 | this_Skip_5= ruleSkip | this_Jam_6= ruleJam | this_Inst_X0_7= ruleInst_X0 | this_LoadSinLFO_8= ruleLoadSinLFO | this_LoadRampLFO_9= ruleLoadRampLFO | this_ChorusReadDelay_10= ruleChorusReadDelay | this_ChorusReadValue_11= ruleChorusReadValue | this_ChorusScaleOffset_12= ruleChorusScaleOffset | this_Log_13= ruleLog | this_ReadDelayPointer_14= ruleReadDelayPointer ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1745:1: (this_Inst_B15_S1_9_0= ruleInst_B15_S1_9 | this_Inst_B6_S1_14_1= ruleInst_B6_S1_14 | this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10 | this_Inst_B6_3= ruleInst_B6 | this_Inst_B24_4= ruleInst_B24 | this_Skip_5= ruleSkip | this_Jam_6= ruleJam | this_Inst_X0_7= ruleInst_X0 | this_LoadSinLFO_8= ruleLoadSinLFO | this_LoadRampLFO_9= ruleLoadRampLFO | this_ChorusReadDelay_10= ruleChorusReadDelay | this_ChorusReadValue_11= ruleChorusReadValue | this_ChorusScaleOffset_12= ruleChorusScaleOffset | this_Log_13= ruleLog | this_ReadDelayPointer_14= ruleReadDelayPointer )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1745:1: (this_Inst_B15_S1_9_0= ruleInst_B15_S1_9 | this_Inst_B6_S1_14_1= ruleInst_B6_S1_14 | this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10 | this_Inst_B6_3= ruleInst_B6 | this_Inst_B24_4= ruleInst_B24 | this_Skip_5= ruleSkip | this_Jam_6= ruleJam | this_Inst_X0_7= ruleInst_X0 | this_LoadSinLFO_8= ruleLoadSinLFO | this_LoadRampLFO_9= ruleLoadRampLFO | this_ChorusReadDelay_10= ruleChorusReadDelay | this_ChorusReadValue_11= ruleChorusReadValue | this_ChorusScaleOffset_12= ruleChorusScaleOffset | this_Log_13= ruleLog | this_ReadDelayPointer_14= ruleReadDelayPointer )
            int alt12=15;
            switch ( input.LA(1) ) {
            case 44:
            case 45:
            case 46:
                {
                alt12=1;
                }
                break;
            case 32:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt12=2;
                }
                break;
            case 41:
            case 43:
                {
                alt12=3;
                }
                break;
            case 39:
            case 40:
                {
                alt12=4;
                }
                break;
            case 53:
            case 54:
            case 55:
                {
                alt12=5;
                }
                break;
            case 60:
                {
                alt12=6;
                }
                break;
            case 56:
                {
                alt12=7;
                }
                break;
            case 57:
            case 58:
            case 59:
                {
                alt12=8;
                }
                break;
            case 47:
                {
                alt12=9;
                }
                break;
            case 48:
                {
                alt12=10;
                }
                break;
            case 49:
                {
                alt12=11;
                }
                break;
            case 50:
                {
                alt12=12;
                }
                break;
            case 51:
                {
                alt12=13;
                }
                break;
            case 42:
                {
                alt12=14;
                }
                break;
            case 52:
                {
                alt12=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1746:5: this_Inst_B15_S1_9_0= ruleInst_B15_S1_9
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_B15_S1_9ParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInst_B15_S1_9_in_ruleInstruction3874);
                    this_Inst_B15_S1_9_0=ruleInst_B15_S1_9();

                    state._fsp--;

                     
                            current = this_Inst_B15_S1_9_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1756:5: this_Inst_B6_S1_14_1= ruleInst_B6_S1_14
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_B6_S1_14ParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInst_B6_S1_14_in_ruleInstruction3901);
                    this_Inst_B6_S1_14_1=ruleInst_B6_S1_14();

                    state._fsp--;

                     
                            current = this_Inst_B6_S1_14_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1766:5: this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_S1_14_S1_10ParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInst_S1_14_S1_10_in_ruleInstruction3928);
                    this_Inst_S1_14_S1_10_2=ruleInst_S1_14_S1_10();

                    state._fsp--;

                     
                            current = this_Inst_S1_14_S1_10_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1776:5: this_Inst_B6_3= ruleInst_B6
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_B6ParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleInst_B6_in_ruleInstruction3955);
                    this_Inst_B6_3=ruleInst_B6();

                    state._fsp--;

                     
                            current = this_Inst_B6_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1786:5: this_Inst_B24_4= ruleInst_B24
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_B24ParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleInst_B24_in_ruleInstruction3982);
                    this_Inst_B24_4=ruleInst_B24();

                    state._fsp--;

                     
                            current = this_Inst_B24_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1796:5: this_Skip_5= ruleSkip
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getSkipParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSkip_in_ruleInstruction4009);
                    this_Skip_5=ruleSkip();

                    state._fsp--;

                     
                            current = this_Skip_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1806:5: this_Jam_6= ruleJam
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getJamParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleJam_in_ruleInstruction4036);
                    this_Jam_6=ruleJam();

                    state._fsp--;

                     
                            current = this_Jam_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1816:5: this_Inst_X0_7= ruleInst_X0
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_X0ParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleInst_X0_in_ruleInstruction4063);
                    this_Inst_X0_7=ruleInst_X0();

                    state._fsp--;

                     
                            current = this_Inst_X0_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1826:5: this_LoadSinLFO_8= ruleLoadSinLFO
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLoadSinLFOParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleLoadSinLFO_in_ruleInstruction4090);
                    this_LoadSinLFO_8=ruleLoadSinLFO();

                    state._fsp--;

                     
                            current = this_LoadSinLFO_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1836:5: this_LoadRampLFO_9= ruleLoadRampLFO
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLoadRampLFOParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleLoadRampLFO_in_ruleInstruction4117);
                    this_LoadRampLFO_9=ruleLoadRampLFO();

                    state._fsp--;

                     
                            current = this_LoadRampLFO_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1846:5: this_ChorusReadDelay_10= ruleChorusReadDelay
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getChorusReadDelayParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleChorusReadDelay_in_ruleInstruction4144);
                    this_ChorusReadDelay_10=ruleChorusReadDelay();

                    state._fsp--;

                     
                            current = this_ChorusReadDelay_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1856:5: this_ChorusReadValue_11= ruleChorusReadValue
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getChorusReadValueParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleChorusReadValue_in_ruleInstruction4171);
                    this_ChorusReadValue_11=ruleChorusReadValue();

                    state._fsp--;

                     
                            current = this_ChorusReadValue_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1866:5: this_ChorusScaleOffset_12= ruleChorusScaleOffset
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getChorusScaleOffsetParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleChorusScaleOffset_in_ruleInstruction4198);
                    this_ChorusScaleOffset_12=ruleChorusScaleOffset();

                    state._fsp--;

                     
                            current = this_ChorusScaleOffset_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1876:5: this_Log_13= ruleLog
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLogParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleLog_in_ruleInstruction4225);
                    this_Log_13=ruleLog();

                    state._fsp--;

                     
                            current = this_Log_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1886:5: this_ReadDelayPointer_14= ruleReadDelayPointer
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getReadDelayPointerParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleReadDelayPointer_in_ruleInstruction4252);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1902:1: entryRuleInst_B6_S1_14 returns [EObject current=null] : iv_ruleInst_B6_S1_14= ruleInst_B6_S1_14 EOF ;
    public final EObject entryRuleInst_B6_S1_14() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_B6_S1_14 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1903:2: (iv_ruleInst_B6_S1_14= ruleInst_B6_S1_14 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1904:2: iv_ruleInst_B6_S1_14= ruleInst_B6_S1_14 EOF
            {
             newCompositeNode(grammarAccess.getInst_B6_S1_14Rule()); 
            pushFollow(FOLLOW_ruleInst_B6_S1_14_in_entryRuleInst_B6_S1_144287);
            iv_ruleInst_B6_S1_14=ruleInst_B6_S1_14();

            state._fsp--;

             current =iv_ruleInst_B6_S1_14; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_B6_S1_144297); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1911:1: ruleInst_B6_S1_14 returns [EObject current=null] : (this_ReadRegister_0= ruleReadRegister | this_WriteRegister_1= ruleWriteRegister | this_ReadRegisterFilter_2= ruleReadRegisterFilter | this_Maxx_3= ruleMaxx | this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf | this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1914:28: ( (this_ReadRegister_0= ruleReadRegister | this_WriteRegister_1= ruleWriteRegister | this_ReadRegisterFilter_2= ruleReadRegisterFilter | this_Maxx_3= ruleMaxx | this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf | this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1915:1: (this_ReadRegister_0= ruleReadRegister | this_WriteRegister_1= ruleWriteRegister | this_ReadRegisterFilter_2= ruleReadRegisterFilter | this_Maxx_3= ruleMaxx | this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf | this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1915:1: (this_ReadRegister_0= ruleReadRegister | this_WriteRegister_1= ruleWriteRegister | this_ReadRegisterFilter_2= ruleReadRegisterFilter | this_Maxx_3= ruleMaxx | this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf | this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt13=1;
                }
                break;
            case 36:
                {
                alt13=2;
                }
                break;
            case 38:
                {
                alt13=3;
                }
                break;
            case 37:
                {
                alt13=4;
                }
                break;
            case 35:
                {
                alt13=5;
                }
                break;
            case 34:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1916:5: this_ReadRegister_0= ruleReadRegister
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getReadRegisterParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleReadRegister_in_ruleInst_B6_S1_144344);
                    this_ReadRegister_0=ruleReadRegister();

                    state._fsp--;

                     
                            current = this_ReadRegister_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1926:5: this_WriteRegister_1= ruleWriteRegister
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getWriteRegisterParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWriteRegister_in_ruleInst_B6_S1_144371);
                    this_WriteRegister_1=ruleWriteRegister();

                    state._fsp--;

                     
                            current = this_WriteRegister_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1936:5: this_ReadRegisterFilter_2= ruleReadRegisterFilter
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getReadRegisterFilterParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleReadRegisterFilter_in_ruleInst_B6_S1_144398);
                    this_ReadRegisterFilter_2=ruleReadRegisterFilter();

                    state._fsp--;

                     
                            current = this_ReadRegisterFilter_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1946:5: this_Maxx_3= ruleMaxx
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getMaxxParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleMaxx_in_ruleInst_B6_S1_144425);
                    this_Maxx_3=ruleMaxx();

                    state._fsp--;

                     
                            current = this_Maxx_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1956:5: this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getWriteRegisterHighshelfParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleWriteRegisterHighshelf_in_ruleInst_B6_S1_144452);
                    this_WriteRegisterHighshelf_4=ruleWriteRegisterHighshelf();

                    state._fsp--;

                     
                            current = this_WriteRegisterHighshelf_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1966:5: this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getWriteRegisterLowshelfParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleWriteRegisterLowshelf_in_ruleInst_B6_S1_144479);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1982:1: entryRuleInst_B15_S1_9 returns [EObject current=null] : iv_ruleInst_B15_S1_9= ruleInst_B15_S1_9 EOF ;
    public final EObject entryRuleInst_B15_S1_9() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_B15_S1_9 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1983:2: (iv_ruleInst_B15_S1_9= ruleInst_B15_S1_9 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1984:2: iv_ruleInst_B15_S1_9= ruleInst_B15_S1_9 EOF
            {
             newCompositeNode(grammarAccess.getInst_B15_S1_9Rule()); 
            pushFollow(FOLLOW_ruleInst_B15_S1_9_in_entryRuleInst_B15_S1_94514);
            iv_ruleInst_B15_S1_9=ruleInst_B15_S1_9();

            state._fsp--;

             current =iv_ruleInst_B15_S1_9; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_B15_S1_94524); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1991:1: ruleInst_B15_S1_9 returns [EObject current=null] : (this_ReadDelay_0= ruleReadDelay | this_WriteDelay_1= ruleWriteDelay | this_WriteAllpass_2= ruleWriteAllpass ) ;
    public final EObject ruleInst_B15_S1_9() throws RecognitionException {
        EObject current = null;

        EObject this_ReadDelay_0 = null;

        EObject this_WriteDelay_1 = null;

        EObject this_WriteAllpass_2 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1994:28: ( (this_ReadDelay_0= ruleReadDelay | this_WriteDelay_1= ruleWriteDelay | this_WriteAllpass_2= ruleWriteAllpass ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1995:1: (this_ReadDelay_0= ruleReadDelay | this_WriteDelay_1= ruleWriteDelay | this_WriteAllpass_2= ruleWriteAllpass )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1995:1: (this_ReadDelay_0= ruleReadDelay | this_WriteDelay_1= ruleWriteDelay | this_WriteAllpass_2= ruleWriteAllpass )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt14=1;
                }
                break;
            case 44:
                {
                alt14=2;
                }
                break;
            case 45:
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
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1996:5: this_ReadDelay_0= ruleReadDelay
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B15_S1_9Access().getReadDelayParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleReadDelay_in_ruleInst_B15_S1_94571);
                    this_ReadDelay_0=ruleReadDelay();

                    state._fsp--;

                     
                            current = this_ReadDelay_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2006:5: this_WriteDelay_1= ruleWriteDelay
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B15_S1_9Access().getWriteDelayParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWriteDelay_in_ruleInst_B15_S1_94598);
                    this_WriteDelay_1=ruleWriteDelay();

                    state._fsp--;

                     
                            current = this_WriteDelay_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2016:5: this_WriteAllpass_2= ruleWriteAllpass
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B15_S1_9Access().getWriteAllpassParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleWriteAllpass_in_ruleInst_B15_S1_94625);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2032:1: entryRuleInst_B6 returns [EObject current=null] : iv_ruleInst_B6= ruleInst_B6 EOF ;
    public final EObject entryRuleInst_B6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_B6 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2033:2: (iv_ruleInst_B6= ruleInst_B6 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2034:2: iv_ruleInst_B6= ruleInst_B6 EOF
            {
             newCompositeNode(grammarAccess.getInst_B6Rule()); 
            pushFollow(FOLLOW_ruleInst_B6_in_entryRuleInst_B64660);
            iv_ruleInst_B6=ruleInst_B6();

            state._fsp--;

             current =iv_ruleInst_B6; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_B64670); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2041:1: ruleInst_B6 returns [EObject current=null] : (this_Mulx_0= ruleMulx | this_Ldax_1= ruleLdax ) ;
    public final EObject ruleInst_B6() throws RecognitionException {
        EObject current = null;

        EObject this_Mulx_0 = null;

        EObject this_Ldax_1 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2044:28: ( (this_Mulx_0= ruleMulx | this_Ldax_1= ruleLdax ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2045:1: (this_Mulx_0= ruleMulx | this_Ldax_1= ruleLdax )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2045:1: (this_Mulx_0= ruleMulx | this_Ldax_1= ruleLdax )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            else if ( (LA15_0==40) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2046:5: this_Mulx_0= ruleMulx
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6Access().getMulxParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMulx_in_ruleInst_B64717);
                    this_Mulx_0=ruleMulx();

                    state._fsp--;

                     
                            current = this_Mulx_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2056:5: this_Ldax_1= ruleLdax
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6Access().getLdaxParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLdax_in_ruleInst_B64744);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2072:1: entryRuleInst_B24 returns [EObject current=null] : iv_ruleInst_B24= ruleInst_B24 EOF ;
    public final EObject entryRuleInst_B24() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_B24 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2073:2: (iv_ruleInst_B24= ruleInst_B24 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2074:2: iv_ruleInst_B24= ruleInst_B24 EOF
            {
             newCompositeNode(grammarAccess.getInst_B24Rule()); 
            pushFollow(FOLLOW_ruleInst_B24_in_entryRuleInst_B244779);
            iv_ruleInst_B24=ruleInst_B24();

            state._fsp--;

             current =iv_ruleInst_B24; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_B244789); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2081:1: ruleInst_B24 returns [EObject current=null] : (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor ) ;
    public final EObject ruleInst_B24() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        EObject this_Or_1 = null;

        EObject this_Xor_2 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2084:28: ( (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2085:1: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2085:1: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt16=1;
                }
                break;
            case 54:
                {
                alt16=2;
                }
                break;
            case 55:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2086:5: this_And_0= ruleAnd
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B24Access().getAndParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAnd_in_ruleInst_B244836);
                    this_And_0=ruleAnd();

                    state._fsp--;

                     
                            current = this_And_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2096:5: this_Or_1= ruleOr
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B24Access().getOrParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOr_in_ruleInst_B244863);
                    this_Or_1=ruleOr();

                    state._fsp--;

                     
                            current = this_Or_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2106:5: this_Xor_2= ruleXor
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B24Access().getXorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleXor_in_ruleInst_B244890);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2122:1: entryRuleInst_X0 returns [EObject current=null] : iv_ruleInst_X0= ruleInst_X0 EOF ;
    public final EObject entryRuleInst_X0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_X0 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2123:2: (iv_ruleInst_X0= ruleInst_X0 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2124:2: iv_ruleInst_X0= ruleInst_X0 EOF
            {
             newCompositeNode(grammarAccess.getInst_X0Rule()); 
            pushFollow(FOLLOW_ruleInst_X0_in_entryRuleInst_X04925);
            iv_ruleInst_X0=ruleInst_X0();

            state._fsp--;

             current =iv_ruleInst_X0; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_X04935); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2131:1: ruleInst_X0 returns [EObject current=null] : (this_Clr_0= ruleClr | this_Not_1= ruleNot | this_Absa_2= ruleAbsa ) ;
    public final EObject ruleInst_X0() throws RecognitionException {
        EObject current = null;

        EObject this_Clr_0 = null;

        EObject this_Not_1 = null;

        EObject this_Absa_2 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2134:28: ( (this_Clr_0= ruleClr | this_Not_1= ruleNot | this_Absa_2= ruleAbsa ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2135:1: (this_Clr_0= ruleClr | this_Not_1= ruleNot | this_Absa_2= ruleAbsa )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2135:1: (this_Clr_0= ruleClr | this_Not_1= ruleNot | this_Absa_2= ruleAbsa )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt17=1;
                }
                break;
            case 58:
                {
                alt17=2;
                }
                break;
            case 59:
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
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2136:5: this_Clr_0= ruleClr
                    {
                     
                            newCompositeNode(grammarAccess.getInst_X0Access().getClrParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClr_in_ruleInst_X04982);
                    this_Clr_0=ruleClr();

                    state._fsp--;

                     
                            current = this_Clr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2146:5: this_Not_1= ruleNot
                    {
                     
                            newCompositeNode(grammarAccess.getInst_X0Access().getNotParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNot_in_ruleInst_X05009);
                    this_Not_1=ruleNot();

                    state._fsp--;

                     
                            current = this_Not_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2156:5: this_Absa_2= ruleAbsa
                    {
                     
                            newCompositeNode(grammarAccess.getInst_X0Access().getAbsaParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAbsa_in_ruleInst_X05036);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2172:1: entryRuleInst_S1_14_S1_10 returns [EObject current=null] : iv_ruleInst_S1_14_S1_10= ruleInst_S1_14_S1_10 EOF ;
    public final EObject entryRuleInst_S1_14_S1_10() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_S1_14_S1_10 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2173:2: (iv_ruleInst_S1_14_S1_10= ruleInst_S1_14_S1_10 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2174:2: iv_ruleInst_S1_14_S1_10= ruleInst_S1_14_S1_10 EOF
            {
             newCompositeNode(grammarAccess.getInst_S1_14_S1_10Rule()); 
            pushFollow(FOLLOW_ruleInst_S1_14_S1_10_in_entryRuleInst_S1_14_S1_105071);
            iv_ruleInst_S1_14_S1_10=ruleInst_S1_14_S1_10();

            state._fsp--;

             current =iv_ruleInst_S1_14_S1_10; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_S1_14_S1_105081); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2181:1: ruleInst_S1_14_S1_10 returns [EObject current=null] : (this_Exp_0= ruleExp | this_ScaleOffset_1= ruleScaleOffset ) ;
    public final EObject ruleInst_S1_14_S1_10() throws RecognitionException {
        EObject current = null;

        EObject this_Exp_0 = null;

        EObject this_ScaleOffset_1 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2184:28: ( (this_Exp_0= ruleExp | this_ScaleOffset_1= ruleScaleOffset ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2185:1: (this_Exp_0= ruleExp | this_ScaleOffset_1= ruleScaleOffset )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2185:1: (this_Exp_0= ruleExp | this_ScaleOffset_1= ruleScaleOffset )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41) ) {
                alt18=1;
            }
            else if ( (LA18_0==43) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2186:5: this_Exp_0= ruleExp
                    {
                     
                            newCompositeNode(grammarAccess.getInst_S1_14_S1_10Access().getExpParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExp_in_ruleInst_S1_14_S1_105128);
                    this_Exp_0=ruleExp();

                    state._fsp--;

                     
                            current = this_Exp_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2196:5: this_ScaleOffset_1= ruleScaleOffset
                    {
                     
                            newCompositeNode(grammarAccess.getInst_S1_14_S1_10Access().getScaleOffsetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleScaleOffset_in_ruleInst_S1_14_S1_105155);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2212:1: entryRuleReadRegister returns [EObject current=null] : iv_ruleReadRegister= ruleReadRegister EOF ;
    public final EObject entryRuleReadRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadRegister = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2213:2: (iv_ruleReadRegister= ruleReadRegister EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2214:2: iv_ruleReadRegister= ruleReadRegister EOF
            {
             newCompositeNode(grammarAccess.getReadRegisterRule()); 
            pushFollow(FOLLOW_ruleReadRegister_in_entryRuleReadRegister5190);
            iv_ruleReadRegister=ruleReadRegister();

            state._fsp--;

             current =iv_ruleReadRegister; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadRegister5200); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2221:1: ruleReadRegister returns [EObject current=null] : (otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleReadRegister() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2224:28: ( (otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2225:1: (otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2225:1: (otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2225:3: otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleReadRegister5237); 

                	newLeafNode(otherlv_0, grammarAccess.getReadRegisterAccess().getRdaxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2229:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2230:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2230:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2231:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getReadRegisterAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleReadRegister5258);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleReadRegister5270); 

                	newLeafNode(otherlv_2, grammarAccess.getReadRegisterAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2251:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2252:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2252:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2253:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getReadRegisterAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleReadRegister5291);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2277:1: entryRuleWriteRegisterLowshelf returns [EObject current=null] : iv_ruleWriteRegisterLowshelf= ruleWriteRegisterLowshelf EOF ;
    public final EObject entryRuleWriteRegisterLowshelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteRegisterLowshelf = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2278:2: (iv_ruleWriteRegisterLowshelf= ruleWriteRegisterLowshelf EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2279:2: iv_ruleWriteRegisterLowshelf= ruleWriteRegisterLowshelf EOF
            {
             newCompositeNode(grammarAccess.getWriteRegisterLowshelfRule()); 
            pushFollow(FOLLOW_ruleWriteRegisterLowshelf_in_entryRuleWriteRegisterLowshelf5327);
            iv_ruleWriteRegisterLowshelf=ruleWriteRegisterLowshelf();

            state._fsp--;

             current =iv_ruleWriteRegisterLowshelf; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWriteRegisterLowshelf5337); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2286:1: ruleWriteRegisterLowshelf returns [EObject current=null] : (otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteRegisterLowshelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2289:28: ( (otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2290:1: (otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2290:1: (otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2290:3: otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleWriteRegisterLowshelf5374); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteRegisterLowshelfAccess().getWrlxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2294:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2295:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2295:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2296:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterLowshelfAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleWriteRegisterLowshelf5395);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleWriteRegisterLowshelf5407); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteRegisterLowshelfAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2316:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2317:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2317:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2318:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterLowshelfAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegisterLowshelf5428);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2342:1: entryRuleWriteRegisterHighshelf returns [EObject current=null] : iv_ruleWriteRegisterHighshelf= ruleWriteRegisterHighshelf EOF ;
    public final EObject entryRuleWriteRegisterHighshelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteRegisterHighshelf = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2343:2: (iv_ruleWriteRegisterHighshelf= ruleWriteRegisterHighshelf EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2344:2: iv_ruleWriteRegisterHighshelf= ruleWriteRegisterHighshelf EOF
            {
             newCompositeNode(grammarAccess.getWriteRegisterHighshelfRule()); 
            pushFollow(FOLLOW_ruleWriteRegisterHighshelf_in_entryRuleWriteRegisterHighshelf5464);
            iv_ruleWriteRegisterHighshelf=ruleWriteRegisterHighshelf();

            state._fsp--;

             current =iv_ruleWriteRegisterHighshelf; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWriteRegisterHighshelf5474); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2351:1: ruleWriteRegisterHighshelf returns [EObject current=null] : (otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteRegisterHighshelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2354:28: ( (otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2355:1: (otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2355:1: (otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2355:3: otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleWriteRegisterHighshelf5511); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteRegisterHighshelfAccess().getWrhxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2359:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2360:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2360:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2361:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterHighshelfAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleWriteRegisterHighshelf5532);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleWriteRegisterHighshelf5544); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteRegisterHighshelfAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2381:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2382:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2382:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2383:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterHighshelfAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegisterHighshelf5565);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2407:1: entryRuleWriteRegister returns [EObject current=null] : iv_ruleWriteRegister= ruleWriteRegister EOF ;
    public final EObject entryRuleWriteRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteRegister = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2408:2: (iv_ruleWriteRegister= ruleWriteRegister EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2409:2: iv_ruleWriteRegister= ruleWriteRegister EOF
            {
             newCompositeNode(grammarAccess.getWriteRegisterRule()); 
            pushFollow(FOLLOW_ruleWriteRegister_in_entryRuleWriteRegister5601);
            iv_ruleWriteRegister=ruleWriteRegister();

            state._fsp--;

             current =iv_ruleWriteRegister; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWriteRegister5611); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2416:1: ruleWriteRegister returns [EObject current=null] : (otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteRegister() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2419:28: ( (otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2420:1: (otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2420:1: (otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2420:3: otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleWriteRegister5648); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteRegisterAccess().getWraxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2424:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2425:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2425:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2426:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleWriteRegister5669);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleWriteRegister5681); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteRegisterAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2446:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2447:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2447:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2448:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegister5702);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2472:1: entryRuleMaxx returns [EObject current=null] : iv_ruleMaxx= ruleMaxx EOF ;
    public final EObject entryRuleMaxx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxx = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2473:2: (iv_ruleMaxx= ruleMaxx EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2474:2: iv_ruleMaxx= ruleMaxx EOF
            {
             newCompositeNode(grammarAccess.getMaxxRule()); 
            pushFollow(FOLLOW_ruleMaxx_in_entryRuleMaxx5738);
            iv_ruleMaxx=ruleMaxx();

            state._fsp--;

             current =iv_ruleMaxx; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxx5748); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2481:1: ruleMaxx returns [EObject current=null] : (otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleMaxx() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2484:28: ( (otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2485:1: (otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2485:1: (otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2485:3: otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleMaxx5785); 

                	newLeafNode(otherlv_0, grammarAccess.getMaxxAccess().getMaxxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2489:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2490:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2490:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2491:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getMaxxAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleMaxx5806);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleMaxx5818); 

                	newLeafNode(otherlv_2, grammarAccess.getMaxxAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2511:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2512:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2512:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2513:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getMaxxAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleMaxx5839);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2537:1: entryRuleReadRegisterFilter returns [EObject current=null] : iv_ruleReadRegisterFilter= ruleReadRegisterFilter EOF ;
    public final EObject entryRuleReadRegisterFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadRegisterFilter = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2538:2: (iv_ruleReadRegisterFilter= ruleReadRegisterFilter EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2539:2: iv_ruleReadRegisterFilter= ruleReadRegisterFilter EOF
            {
             newCompositeNode(grammarAccess.getReadRegisterFilterRule()); 
            pushFollow(FOLLOW_ruleReadRegisterFilter_in_entryRuleReadRegisterFilter5875);
            iv_ruleReadRegisterFilter=ruleReadRegisterFilter();

            state._fsp--;

             current =iv_ruleReadRegisterFilter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadRegisterFilter5885); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2546:1: ruleReadRegisterFilter returns [EObject current=null] : (otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleReadRegisterFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2549:28: ( (otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2550:1: (otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2550:1: (otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2550:3: otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleReadRegisterFilter5922); 

                	newLeafNode(otherlv_0, grammarAccess.getReadRegisterFilterAccess().getRdfxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2554:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2555:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2555:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2556:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getReadRegisterFilterAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleReadRegisterFilter5943);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleReadRegisterFilter5955); 

                	newLeafNode(otherlv_2, grammarAccess.getReadRegisterFilterAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2576:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2577:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2577:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2578:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getReadRegisterFilterAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleReadRegisterFilter5976);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2602:1: entryRuleMulx returns [EObject current=null] : iv_ruleMulx= ruleMulx EOF ;
    public final EObject entryRuleMulx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulx = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2603:2: (iv_ruleMulx= ruleMulx EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2604:2: iv_ruleMulx= ruleMulx EOF
            {
             newCompositeNode(grammarAccess.getMulxRule()); 
            pushFollow(FOLLOW_ruleMulx_in_entryRuleMulx6012);
            iv_ruleMulx=ruleMulx();

            state._fsp--;

             current =iv_ruleMulx; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulx6022); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2611:1: ruleMulx returns [EObject current=null] : (otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMulx() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2614:28: ( (otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2615:1: (otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2615:1: (otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2615:3: otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleMulx6059); 

                	newLeafNode(otherlv_0, grammarAccess.getMulxAccess().getMulxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2619:1: ( (lv_arg1_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2620:1: (lv_arg1_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2620:1: (lv_arg1_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2621:3: lv_arg1_1_0= RULE_ID
            {
            lv_arg1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMulx6076); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2645:1: entryRuleLdax returns [EObject current=null] : iv_ruleLdax= ruleLdax EOF ;
    public final EObject entryRuleLdax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdax = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2646:2: (iv_ruleLdax= ruleLdax EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2647:2: iv_ruleLdax= ruleLdax EOF
            {
             newCompositeNode(grammarAccess.getLdaxRule()); 
            pushFollow(FOLLOW_ruleLdax_in_entryRuleLdax6117);
            iv_ruleLdax=ruleLdax();

            state._fsp--;

             current =iv_ruleLdax; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLdax6127); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2654:1: ruleLdax returns [EObject current=null] : (otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLdax() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2657:28: ( (otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2658:1: (otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2658:1: (otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2658:3: otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleLdax6164); 

                	newLeafNode(otherlv_0, grammarAccess.getLdaxAccess().getLdaxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2662:1: ( (lv_arg1_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2663:1: (lv_arg1_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2663:1: (lv_arg1_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2664:3: lv_arg1_1_0= RULE_ID
            {
            lv_arg1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLdax6181); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2688:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2689:2: (iv_ruleExp= ruleExp EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2690:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_ruleExp_in_entryRuleExp6222);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExp6232); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2697:1: ruleExp returns [EObject current=null] : (otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2700:28: ( (otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2701:1: (otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2701:1: (otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2701:3: otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleExp6269); 

                	newLeafNode(otherlv_0, grammarAccess.getExpAccess().getExpKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2705:1: ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2706:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2706:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2707:3: lv_arg1_1_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getExpAccess().getArg1SPINDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleExp6290);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleExp6302); 

                	newLeafNode(otherlv_2, grammarAccess.getExpAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2727:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2728:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2728:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2729:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getExpAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleExp6323);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2753:1: entryRuleLog returns [EObject current=null] : iv_ruleLog= ruleLog EOF ;
    public final EObject entryRuleLog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLog = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2754:2: (iv_ruleLog= ruleLog EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2755:2: iv_ruleLog= ruleLog EOF
            {
             newCompositeNode(grammarAccess.getLogRule()); 
            pushFollow(FOLLOW_ruleLog_in_entryRuleLog6359);
            iv_ruleLog=ruleLog();

            state._fsp--;

             current =iv_ruleLog; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLog6369); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2762:1: ruleLog returns [EObject current=null] : (otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleLog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2765:28: ( (otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2766:1: (otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2766:1: (otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2766:3: otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleLog6406); 

                	newLeafNode(otherlv_0, grammarAccess.getLogAccess().getLogKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2770:1: ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2771:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2771:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2772:3: lv_arg1_1_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLogAccess().getArg1SPINDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleLog6427);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleLog6439); 

                	newLeafNode(otherlv_2, grammarAccess.getLogAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2792:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2793:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2793:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2794:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLogAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleLog6460);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2818:1: entryRuleScaleOffset returns [EObject current=null] : iv_ruleScaleOffset= ruleScaleOffset EOF ;
    public final EObject entryRuleScaleOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleOffset = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2819:2: (iv_ruleScaleOffset= ruleScaleOffset EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2820:2: iv_ruleScaleOffset= ruleScaleOffset EOF
            {
             newCompositeNode(grammarAccess.getScaleOffsetRule()); 
            pushFollow(FOLLOW_ruleScaleOffset_in_entryRuleScaleOffset6496);
            iv_ruleScaleOffset=ruleScaleOffset();

            state._fsp--;

             current =iv_ruleScaleOffset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleOffset6506); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2827:1: ruleScaleOffset returns [EObject current=null] : (otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleScaleOffset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2830:28: ( (otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2831:1: (otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2831:1: (otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2831:3: otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleScaleOffset6543); 

                	newLeafNode(otherlv_0, grammarAccess.getScaleOffsetAccess().getSofKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2835:1: ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2836:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2836:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2837:3: lv_arg1_1_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getScaleOffsetAccess().getArg1SPINDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleScaleOffset6564);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleScaleOffset6576); 

                	newLeafNode(otherlv_2, grammarAccess.getScaleOffsetAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2857:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2858:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2858:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2859:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getScaleOffsetAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleScaleOffset6597);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2883:1: entryRuleWriteDelay returns [EObject current=null] : iv_ruleWriteDelay= ruleWriteDelay EOF ;
    public final EObject entryRuleWriteDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteDelay = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2884:2: (iv_ruleWriteDelay= ruleWriteDelay EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2885:2: iv_ruleWriteDelay= ruleWriteDelay EOF
            {
             newCompositeNode(grammarAccess.getWriteDelayRule()); 
            pushFollow(FOLLOW_ruleWriteDelay_in_entryRuleWriteDelay6633);
            iv_ruleWriteDelay=ruleWriteDelay();

            state._fsp--;

             current =iv_ruleWriteDelay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWriteDelay6643); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2892:1: ruleWriteDelay returns [EObject current=null] : (otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteDelay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2895:28: ( (otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2896:1: (otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2896:1: (otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2896:3: otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleWriteDelay6680); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteDelayAccess().getWraKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2900:1: ( (lv_arg1_1_0= ruleSPINMEM ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2901:1: (lv_arg1_1_0= ruleSPINMEM )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2901:1: (lv_arg1_1_0= ruleSPINMEM )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2902:3: lv_arg1_1_0= ruleSPINMEM
            {
             
            	        newCompositeNode(grammarAccess.getWriteDelayAccess().getArg1SPINMEMParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINMEM_in_ruleWriteDelay6701);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleWriteDelay6713); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteDelayAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2922:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2923:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2923:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2924:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteDelayAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleWriteDelay6734);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2948:1: entryRuleWriteAllpass returns [EObject current=null] : iv_ruleWriteAllpass= ruleWriteAllpass EOF ;
    public final EObject entryRuleWriteAllpass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteAllpass = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2949:2: (iv_ruleWriteAllpass= ruleWriteAllpass EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2950:2: iv_ruleWriteAllpass= ruleWriteAllpass EOF
            {
             newCompositeNode(grammarAccess.getWriteAllpassRule()); 
            pushFollow(FOLLOW_ruleWriteAllpass_in_entryRuleWriteAllpass6770);
            iv_ruleWriteAllpass=ruleWriteAllpass();

            state._fsp--;

             current =iv_ruleWriteAllpass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWriteAllpass6780); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2957:1: ruleWriteAllpass returns [EObject current=null] : (otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteAllpass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2960:28: ( (otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2961:1: (otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2961:1: (otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2961:3: otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleWriteAllpass6817); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteAllpassAccess().getWrapKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2965:1: ( (lv_arg1_1_0= ruleSPINMEM ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2966:1: (lv_arg1_1_0= ruleSPINMEM )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2966:1: (lv_arg1_1_0= ruleSPINMEM )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2967:3: lv_arg1_1_0= ruleSPINMEM
            {
             
            	        newCompositeNode(grammarAccess.getWriteAllpassAccess().getArg1SPINMEMParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINMEM_in_ruleWriteAllpass6838);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleWriteAllpass6850); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteAllpassAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2987:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2988:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2988:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2989:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteAllpassAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleWriteAllpass6871);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3013:1: entryRuleReadDelay returns [EObject current=null] : iv_ruleReadDelay= ruleReadDelay EOF ;
    public final EObject entryRuleReadDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadDelay = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3014:2: (iv_ruleReadDelay= ruleReadDelay EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3015:2: iv_ruleReadDelay= ruleReadDelay EOF
            {
             newCompositeNode(grammarAccess.getReadDelayRule()); 
            pushFollow(FOLLOW_ruleReadDelay_in_entryRuleReadDelay6907);
            iv_ruleReadDelay=ruleReadDelay();

            state._fsp--;

             current =iv_ruleReadDelay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadDelay6917); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3022:1: ruleReadDelay returns [EObject current=null] : (otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleReadDelay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3025:28: ( (otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3026:1: (otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3026:1: (otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3026:3: otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleReadDelay6954); 

                	newLeafNode(otherlv_0, grammarAccess.getReadDelayAccess().getRdaKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3030:1: ( (lv_arg1_1_0= ruleSPINMEM ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3031:1: (lv_arg1_1_0= ruleSPINMEM )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3031:1: (lv_arg1_1_0= ruleSPINMEM )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3032:3: lv_arg1_1_0= ruleSPINMEM
            {
             
            	        newCompositeNode(grammarAccess.getReadDelayAccess().getArg1SPINMEMParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINMEM_in_ruleReadDelay6975);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleReadDelay6987); 

                	newLeafNode(otherlv_2, grammarAccess.getReadDelayAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3052:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3053:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3053:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3054:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getReadDelayAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleReadDelay7008);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3078:1: entryRuleLoadSinLFO returns [EObject current=null] : iv_ruleLoadSinLFO= ruleLoadSinLFO EOF ;
    public final EObject entryRuleLoadSinLFO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadSinLFO = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3079:2: (iv_ruleLoadSinLFO= ruleLoadSinLFO EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3080:2: iv_ruleLoadSinLFO= ruleLoadSinLFO EOF
            {
             newCompositeNode(grammarAccess.getLoadSinLFORule()); 
            pushFollow(FOLLOW_ruleLoadSinLFO_in_entryRuleLoadSinLFO7044);
            iv_ruleLoadSinLFO=ruleLoadSinLFO();

            state._fsp--;

             current =iv_ruleLoadSinLFO; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoadSinLFO7054); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3087:1: ruleLoadSinLFO returns [EObject current=null] : (otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3090:28: ( (otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3091:1: (otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3091:1: (otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3091:3: otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleLoadSinLFO7091); 

                	newLeafNode(otherlv_0, grammarAccess.getLoadSinLFOAccess().getWldsKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3095:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3096:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3096:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3097:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getLoadSinLFOAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleLoadSinLFO7112);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleLoadSinLFO7124); 

                	newLeafNode(otherlv_2, grammarAccess.getLoadSinLFOAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3117:1: ( (lv_arg2_3_0= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3118:1: (lv_arg2_3_0= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3118:1: (lv_arg2_3_0= RULE_INT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3119:3: lv_arg2_3_0= RULE_INT
            {
            lv_arg2_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoadSinLFO7141); 

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

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleLoadSinLFO7158); 

                	newLeafNode(otherlv_4, grammarAccess.getLoadSinLFOAccess().getCommaKeyword_4());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3139:1: ( (lv_arg3_5_0= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3140:1: (lv_arg3_5_0= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3140:1: (lv_arg3_5_0= RULE_INT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3141:3: lv_arg3_5_0= RULE_INT
            {
            lv_arg3_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoadSinLFO7175); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3165:1: entryRuleLoadRampLFO returns [EObject current=null] : iv_ruleLoadRampLFO= ruleLoadRampLFO EOF ;
    public final EObject entryRuleLoadRampLFO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadRampLFO = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3166:2: (iv_ruleLoadRampLFO= ruleLoadRampLFO EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3167:2: iv_ruleLoadRampLFO= ruleLoadRampLFO EOF
            {
             newCompositeNode(grammarAccess.getLoadRampLFORule()); 
            pushFollow(FOLLOW_ruleLoadRampLFO_in_entryRuleLoadRampLFO7216);
            iv_ruleLoadRampLFO=ruleLoadRampLFO();

            state._fsp--;

             current =iv_ruleLoadRampLFO; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoadRampLFO7226); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3174:1: ruleLoadRampLFO returns [EObject current=null] : (otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3177:28: ( (otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3178:1: (otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3178:1: (otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3178:3: otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleLoadRampLFO7263); 

                	newLeafNode(otherlv_0, grammarAccess.getLoadRampLFOAccess().getWldrKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3182:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3183:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3183:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3184:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getLoadRampLFOAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleLoadRampLFO7284);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleLoadRampLFO7296); 

                	newLeafNode(otherlv_2, grammarAccess.getLoadRampLFOAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3204:1: ( (lv_arg2_3_0= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3205:1: (lv_arg2_3_0= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3205:1: (lv_arg2_3_0= RULE_INT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3206:3: lv_arg2_3_0= RULE_INT
            {
            lv_arg2_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoadRampLFO7313); 

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

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleLoadRampLFO7330); 

                	newLeafNode(otherlv_4, grammarAccess.getLoadRampLFOAccess().getCommaKeyword_4());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3226:1: ( (lv_arg3_5_0= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3227:1: (lv_arg3_5_0= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3227:1: (lv_arg3_5_0= RULE_INT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3228:3: lv_arg3_5_0= RULE_INT
            {
            lv_arg3_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoadRampLFO7347); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3252:1: entryRuleChorusReadDelay returns [EObject current=null] : iv_ruleChorusReadDelay= ruleChorusReadDelay EOF ;
    public final EObject entryRuleChorusReadDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChorusReadDelay = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3253:2: (iv_ruleChorusReadDelay= ruleChorusReadDelay EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3254:2: iv_ruleChorusReadDelay= ruleChorusReadDelay EOF
            {
             newCompositeNode(grammarAccess.getChorusReadDelayRule()); 
            pushFollow(FOLLOW_ruleChorusReadDelay_in_entryRuleChorusReadDelay7388);
            iv_ruleChorusReadDelay=ruleChorusReadDelay();

            state._fsp--;

             current =iv_ruleChorusReadDelay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChorusReadDelay7398); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3261:1: ruleChorusReadDelay returns [EObject current=null] : (otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) ) ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3264:28: ( (otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3265:1: (otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3265:1: (otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3265:3: otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleChorusReadDelay7435); 

                	newLeafNode(otherlv_0, grammarAccess.getChorusReadDelayAccess().getChoRdaKeyword_0());
                
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleChorusReadDelay7447); 

                	newLeafNode(otherlv_1, grammarAccess.getChorusReadDelayAccess().getCommaKeyword_1());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3273:1: ( (lv_arg1_2_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3274:1: (lv_arg1_2_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3274:1: (lv_arg1_2_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3275:3: lv_arg1_2_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getChorusReadDelayAccess().getArg1SPINREGISTERParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleChorusReadDelay7468);
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

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleChorusReadDelay7480); 

                	newLeafNode(otherlv_3, grammarAccess.getChorusReadDelayAccess().getCommaKeyword_3());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3295:1: ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3296:1: (lv_arg2_4_0= ruleSPINCHOREGFLAGS )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3296:1: (lv_arg2_4_0= ruleSPINCHOREGFLAGS )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3297:3: lv_arg2_4_0= ruleSPINCHOREGFLAGS
            {
             
            	        newCompositeNode(grammarAccess.getChorusReadDelayAccess().getArg2SPINCHOREGFLAGSParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINCHOREGFLAGS_in_ruleChorusReadDelay7501);
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

            otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleChorusReadDelay7513); 

                	newLeafNode(otherlv_5, grammarAccess.getChorusReadDelayAccess().getCommaKeyword_5());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3317:1: ( (lv_arg3_6_0= ruleSPINMEM ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3318:1: (lv_arg3_6_0= ruleSPINMEM )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3318:1: (lv_arg3_6_0= ruleSPINMEM )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3319:3: lv_arg3_6_0= ruleSPINMEM
            {
             
            	        newCompositeNode(grammarAccess.getChorusReadDelayAccess().getArg3SPINMEMParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINMEM_in_ruleChorusReadDelay7534);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3343:1: entryRuleChorusReadValue returns [EObject current=null] : iv_ruleChorusReadValue= ruleChorusReadValue EOF ;
    public final EObject entryRuleChorusReadValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChorusReadValue = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3344:2: (iv_ruleChorusReadValue= ruleChorusReadValue EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3345:2: iv_ruleChorusReadValue= ruleChorusReadValue EOF
            {
             newCompositeNode(grammarAccess.getChorusReadValueRule()); 
            pushFollow(FOLLOW_ruleChorusReadValue_in_entryRuleChorusReadValue7570);
            iv_ruleChorusReadValue=ruleChorusReadValue();

            state._fsp--;

             current =iv_ruleChorusReadValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChorusReadValue7580); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3352:1: ruleChorusReadValue returns [EObject current=null] : (otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) ) ;
    public final EObject ruleChorusReadValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_arg1_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3355:28: ( (otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3356:1: (otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3356:1: (otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3356:3: otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleChorusReadValue7617); 

                	newLeafNode(otherlv_0, grammarAccess.getChorusReadValueAccess().getChoRdalKeyword_0());
                
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleChorusReadValue7629); 

                	newLeafNode(otherlv_1, grammarAccess.getChorusReadValueAccess().getCommaKeyword_1());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3364:1: ( (lv_arg1_2_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3365:1: (lv_arg1_2_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3365:1: (lv_arg1_2_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3366:3: lv_arg1_2_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getChorusReadValueAccess().getArg1SPINREGISTERParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleChorusReadValue7650);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3390:1: entryRuleChorusScaleOffset returns [EObject current=null] : iv_ruleChorusScaleOffset= ruleChorusScaleOffset EOF ;
    public final EObject entryRuleChorusScaleOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChorusScaleOffset = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3391:2: (iv_ruleChorusScaleOffset= ruleChorusScaleOffset EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3392:2: iv_ruleChorusScaleOffset= ruleChorusScaleOffset EOF
            {
             newCompositeNode(grammarAccess.getChorusScaleOffsetRule()); 
            pushFollow(FOLLOW_ruleChorusScaleOffset_in_entryRuleChorusScaleOffset7686);
            iv_ruleChorusScaleOffset=ruleChorusScaleOffset();

            state._fsp--;

             current =iv_ruleChorusScaleOffset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChorusScaleOffset7696); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3399:1: ruleChorusScaleOffset returns [EObject current=null] : (otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) ) ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3402:28: ( (otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3403:1: (otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3403:1: (otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3403:3: otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleChorusScaleOffset7733); 

                	newLeafNode(otherlv_0, grammarAccess.getChorusScaleOffsetAccess().getChoSofKeyword_0());
                
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleChorusScaleOffset7745); 

                	newLeafNode(otherlv_1, grammarAccess.getChorusScaleOffsetAccess().getCommaKeyword_1());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3411:1: ( (lv_arg1_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3412:1: (lv_arg1_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3412:1: (lv_arg1_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3413:3: lv_arg1_2_0= RULE_ID
            {
            lv_arg1_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChorusScaleOffset7762); 

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

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleChorusScaleOffset7779); 

                	newLeafNode(otherlv_3, grammarAccess.getChorusScaleOffsetAccess().getCommaKeyword_3());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3433:1: ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3434:1: (lv_arg2_4_0= ruleSPINCHOREGFLAGS )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3434:1: (lv_arg2_4_0= ruleSPINCHOREGFLAGS )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3435:3: lv_arg2_4_0= ruleSPINCHOREGFLAGS
            {
             
            	        newCompositeNode(grammarAccess.getChorusScaleOffsetAccess().getArg2SPINCHOREGFLAGSParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINCHOREGFLAGS_in_ruleChorusScaleOffset7800);
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

            otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleChorusScaleOffset7812); 

                	newLeafNode(otherlv_5, grammarAccess.getChorusScaleOffsetAccess().getCommaKeyword_5());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3455:1: ( (lv_arg3_6_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3456:1: (lv_arg3_6_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3456:1: (lv_arg3_6_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3457:3: lv_arg3_6_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getChorusScaleOffsetAccess().getArg3SPINDOUBLEParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleChorusScaleOffset7833);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3481:1: entryRuleReadDelayPointer returns [EObject current=null] : iv_ruleReadDelayPointer= ruleReadDelayPointer EOF ;
    public final EObject entryRuleReadDelayPointer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadDelayPointer = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3482:2: (iv_ruleReadDelayPointer= ruleReadDelayPointer EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3483:2: iv_ruleReadDelayPointer= ruleReadDelayPointer EOF
            {
             newCompositeNode(grammarAccess.getReadDelayPointerRule()); 
            pushFollow(FOLLOW_ruleReadDelayPointer_in_entryRuleReadDelayPointer7869);
            iv_ruleReadDelayPointer=ruleReadDelayPointer();

            state._fsp--;

             current =iv_ruleReadDelayPointer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadDelayPointer7879); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3490:1: ruleReadDelayPointer returns [EObject current=null] : (otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleReadDelayPointer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3493:28: ( (otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3494:1: (otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3494:1: (otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3494:3: otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleReadDelayPointer7916); 

                	newLeafNode(otherlv_0, grammarAccess.getReadDelayPointerAccess().getRmpaKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3498:1: ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3499:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3499:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3500:3: lv_arg1_1_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getReadDelayPointerAccess().getArg1SPINDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleReadDelayPointer7937);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3524:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3525:2: (iv_ruleAnd= ruleAnd EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3526:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd7973);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd7983); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3533:1: ruleAnd returns [EObject current=null] : (otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3536:28: ( (otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3537:1: (otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3537:1: (otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3537:3: otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleAnd8020); 

                	newLeafNode(otherlv_0, grammarAccess.getAndAccess().getAndKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3541:1: ( (lv_arg1_1_0= ruleBINARY24 ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3542:1: (lv_arg1_1_0= ruleBINARY24 )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3542:1: (lv_arg1_1_0= ruleBINARY24 )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3543:3: lv_arg1_1_0= ruleBINARY24
            {
             
            	        newCompositeNode(grammarAccess.getAndAccess().getArg1BINARY24ParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBINARY24_in_ruleAnd8041);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3567:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3568:2: (iv_ruleOr= ruleOr EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3569:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr8077);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr8087); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3576:1: ruleOr returns [EObject current=null] : (otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3579:28: ( (otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3580:1: (otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3580:1: (otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3580:3: otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleOr8124); 

                	newLeafNode(otherlv_0, grammarAccess.getOrAccess().getOrKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3584:1: ( (lv_arg1_1_0= ruleBINARY24 ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3585:1: (lv_arg1_1_0= ruleBINARY24 )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3585:1: (lv_arg1_1_0= ruleBINARY24 )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3586:3: lv_arg1_1_0= ruleBINARY24
            {
             
            	        newCompositeNode(grammarAccess.getOrAccess().getArg1BINARY24ParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBINARY24_in_ruleOr8145);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3610:1: entryRuleXor returns [EObject current=null] : iv_ruleXor= ruleXor EOF ;
    public final EObject entryRuleXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXor = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3611:2: (iv_ruleXor= ruleXor EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3612:2: iv_ruleXor= ruleXor EOF
            {
             newCompositeNode(grammarAccess.getXorRule()); 
            pushFollow(FOLLOW_ruleXor_in_entryRuleXor8181);
            iv_ruleXor=ruleXor();

            state._fsp--;

             current =iv_ruleXor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXor8191); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3619:1: ruleXor returns [EObject current=null] : (otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) ;
    public final EObject ruleXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3622:28: ( (otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3623:1: (otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3623:1: (otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3623:3: otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleXor8228); 

                	newLeafNode(otherlv_0, grammarAccess.getXorAccess().getXorKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3627:1: ( (lv_arg1_1_0= ruleBINARY24 ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3628:1: (lv_arg1_1_0= ruleBINARY24 )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3628:1: (lv_arg1_1_0= ruleBINARY24 )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3629:3: lv_arg1_1_0= ruleBINARY24
            {
             
            	        newCompositeNode(grammarAccess.getXorAccess().getArg1BINARY24ParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBINARY24_in_ruleXor8249);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3653:1: entryRuleJam returns [EObject current=null] : iv_ruleJam= ruleJam EOF ;
    public final EObject entryRuleJam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJam = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3654:2: (iv_ruleJam= ruleJam EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3655:2: iv_ruleJam= ruleJam EOF
            {
             newCompositeNode(grammarAccess.getJamRule()); 
            pushFollow(FOLLOW_ruleJam_in_entryRuleJam8285);
            iv_ruleJam=ruleJam();

            state._fsp--;

             current =iv_ruleJam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJam8295); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3662:1: ruleJam returns [EObject current=null] : (otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleJam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3665:28: ( (otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3666:1: (otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3666:1: (otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3666:3: otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleJam8332); 

                	newLeafNode(otherlv_0, grammarAccess.getJamAccess().getJamKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3670:1: ( (lv_arg1_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3671:1: (lv_arg1_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3671:1: (lv_arg1_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3672:3: lv_arg1_1_0= RULE_ID
            {
            lv_arg1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJam8349); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3696:1: entryRuleClr returns [EObject current=null] : iv_ruleClr= ruleClr EOF ;
    public final EObject entryRuleClr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClr = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3697:2: (iv_ruleClr= ruleClr EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3698:2: iv_ruleClr= ruleClr EOF
            {
             newCompositeNode(grammarAccess.getClrRule()); 
            pushFollow(FOLLOW_ruleClr_in_entryRuleClr8390);
            iv_ruleClr=ruleClr();

            state._fsp--;

             current =iv_ruleClr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClr8400); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3705:1: ruleClr returns [EObject current=null] : ( () otherlv_1= 'clr' ) ;
    public final EObject ruleClr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3708:28: ( ( () otherlv_1= 'clr' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3709:1: ( () otherlv_1= 'clr' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3709:1: ( () otherlv_1= 'clr' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3709:2: () otherlv_1= 'clr'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3709:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3710:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClrAccess().getClrAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleClr8446); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3727:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3728:2: (iv_ruleNot= ruleNot EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3729:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_ruleNot_in_entryRuleNot8482);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNot8492); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3736:1: ruleNot returns [EObject current=null] : ( () otherlv_1= 'not' ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3739:28: ( ( () otherlv_1= 'not' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3740:1: ( () otherlv_1= 'not' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3740:1: ( () otherlv_1= 'not' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3740:2: () otherlv_1= 'not'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3740:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3741:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNotAccess().getNotAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleNot8538); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3758:1: entryRuleAbsa returns [EObject current=null] : iv_ruleAbsa= ruleAbsa EOF ;
    public final EObject entryRuleAbsa() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsa = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3759:2: (iv_ruleAbsa= ruleAbsa EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3760:2: iv_ruleAbsa= ruleAbsa EOF
            {
             newCompositeNode(grammarAccess.getAbsaRule()); 
            pushFollow(FOLLOW_ruleAbsa_in_entryRuleAbsa8574);
            iv_ruleAbsa=ruleAbsa();

            state._fsp--;

             current =iv_ruleAbsa; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsa8584); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3767:1: ruleAbsa returns [EObject current=null] : ( () otherlv_1= 'absa' ) ;
    public final EObject ruleAbsa() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3770:28: ( ( () otherlv_1= 'absa' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3771:1: ( () otherlv_1= 'absa' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3771:1: ( () otherlv_1= 'absa' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3771:2: () otherlv_1= 'absa'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3771:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3772:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAbsaAccess().getAbsaAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleAbsa8630); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3789:1: entryRuleSkip returns [EObject current=null] : iv_ruleSkip= ruleSkip EOF ;
    public final EObject entryRuleSkip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkip = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3790:2: (iv_ruleSkip= ruleSkip EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3791:2: iv_ruleSkip= ruleSkip EOF
            {
             newCompositeNode(grammarAccess.getSkipRule()); 
            pushFollow(FOLLOW_ruleSkip_in_entryRuleSkip8666);
            iv_ruleSkip=ruleSkip();

            state._fsp--;

             current =iv_ruleSkip; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkip8676); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3798:1: ruleSkip returns [EObject current=null] : (otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleSkip() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_flags_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3801:28: ( (otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3802:1: (otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3802:1: (otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3802:3: otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleSkip8713); 

                	newLeafNode(otherlv_0, grammarAccess.getSkipAccess().getSkpKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3806:1: ( (lv_flags_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3807:1: (lv_flags_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3807:1: (lv_flags_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3808:3: lv_flags_1_0= RULE_ID
            {
            lv_flags_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSkip8730); 

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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleSkip8747); 

                	newLeafNode(otherlv_2, grammarAccess.getSkipAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3828:1: ( (otherlv_3= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3829:1: (otherlv_3= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3829:1: (otherlv_3= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3830:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSkipRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSkip8767); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3849:1: entryRuleSPINDOUBLE returns [String current=null] : iv_ruleSPINDOUBLE= ruleSPINDOUBLE EOF ;
    public final String entryRuleSPINDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPINDOUBLE = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3850:2: (iv_ruleSPINDOUBLE= ruleSPINDOUBLE EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3851:2: iv_ruleSPINDOUBLE= ruleSPINDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getSPINDOUBLERule()); 
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_entryRuleSPINDOUBLE8804);
            iv_ruleSPINDOUBLE=ruleSPINDOUBLE();

            state._fsp--;

             current =iv_ruleSPINDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPINDOUBLE8815); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3858:1: ruleSPINDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) ) ;
    public final AntlrDatatypeRuleToken ruleSPINDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3861:28: ( ( (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3862:1: ( (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3862:1: ( (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3862:2: (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3862:2: (kw= '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==61) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3863:2: kw= '-'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleSPINDOUBLE8854); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINDOUBLEAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3868:3: (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_INT) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3868:8: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINDOUBLE8872); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getSPINDOUBLEAccess().getIDTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3876:6: (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3876:6: (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3876:11: this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )?
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSPINDOUBLE8899); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getSPINDOUBLEAccess().getINTTerminalRuleCall_1_1_0()); 
                        
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3883:1: (kw= '.' this_INT_4= RULE_INT )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==62) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3884:2: kw= '.' this_INT_4= RULE_INT
                            {
                            kw=(Token)match(input,62,FOLLOW_62_in_ruleSPINDOUBLE8918); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getSPINDOUBLEAccess().getFullStopKeyword_1_1_1_0()); 
                                
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSPINDOUBLE8933); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3904:1: entryRuleSPINREGISTER returns [String current=null] : iv_ruleSPINREGISTER= ruleSPINREGISTER EOF ;
    public final String entryRuleSPINREGISTER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPINREGISTER = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3905:2: (iv_ruleSPINREGISTER= ruleSPINREGISTER EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3906:2: iv_ruleSPINREGISTER= ruleSPINREGISTER EOF
            {
             newCompositeNode(grammarAccess.getSPINREGISTERRule()); 
            pushFollow(FOLLOW_ruleSPINREGISTER_in_entryRuleSPINREGISTER8983);
            iv_ruleSPINREGISTER=ruleSPINREGISTER();

            state._fsp--;

             current =iv_ruleSPINREGISTER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPINREGISTER8994); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3913:1: ruleSPINREGISTER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSPINREGISTER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3916:28: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3917:1: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3917:1: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
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
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3917:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINREGISTER9034); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getSPINREGISTERAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3925:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSPINREGISTER9060); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3940:1: entryRuleSPINCHOREGFLAGS returns [String current=null] : iv_ruleSPINCHOREGFLAGS= ruleSPINCHOREGFLAGS EOF ;
    public final String entryRuleSPINCHOREGFLAGS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPINCHOREGFLAGS = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3941:2: (iv_ruleSPINCHOREGFLAGS= ruleSPINCHOREGFLAGS EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3942:2: iv_ruleSPINCHOREGFLAGS= ruleSPINCHOREGFLAGS EOF
            {
             newCompositeNode(grammarAccess.getSPINCHOREGFLAGSRule()); 
            pushFollow(FOLLOW_ruleSPINCHOREGFLAGS_in_entryRuleSPINCHOREGFLAGS9106);
            iv_ruleSPINCHOREGFLAGS=ruleSPINCHOREGFLAGS();

            state._fsp--;

             current =iv_ruleSPINCHOREGFLAGS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPINCHOREGFLAGS9117); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3949:1: ruleSPINCHOREGFLAGS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )? ) ;
    public final AntlrDatatypeRuleToken ruleSPINCHOREGFLAGS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;
        Token kw=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3952:28: ( (this_INT_0= RULE_INT | (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )? ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3953:1: (this_INT_0= RULE_INT | (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )? )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3953:1: (this_INT_0= RULE_INT | (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )? )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                alt25=1;
            }
            else if ( (LA25_0==EOF||LA25_0==RULE_ID||LA25_0==33) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3953:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSPINCHOREGFLAGS9157); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getSPINCHOREGFLAGSAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3961:6: (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )?
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3961:6: (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_ID) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3961:11: this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )*
                            {
                            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINCHOREGFLAGS9184); 

                            		current.merge(this_ID_1);
                                
                             
                                newLeafNode(this_ID_1, grammarAccess.getSPINCHOREGFLAGSAccess().getIDTerminalRuleCall_1_0()); 
                                
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3968:1: (kw= '|' this_ID_3= RULE_ID )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==63) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3969:2: kw= '|' this_ID_3= RULE_ID
                            	    {
                            	    kw=(Token)match(input,63,FOLLOW_63_in_ruleSPINCHOREGFLAGS9203); 

                            	            current.merge(kw);
                            	            newLeafNode(kw, grammarAccess.getSPINCHOREGFLAGSAccess().getVerticalLineKeyword_1_1_0()); 
                            	        
                            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINCHOREGFLAGS9218); 

                            	    		current.merge(this_ID_3);
                            	        
                            	     
                            	        newLeafNode(this_ID_3, grammarAccess.getSPINCHOREGFLAGSAccess().getIDTerminalRuleCall_1_1_1()); 
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop23;
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3989:1: entryRuleSPINMEM returns [EObject current=null] : iv_ruleSPINMEM= ruleSPINMEM EOF ;
    public final EObject entryRuleSPINMEM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPINMEM = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3990:2: (iv_ruleSPINMEM= ruleSPINMEM EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3991:2: iv_ruleSPINMEM= ruleSPINMEM EOF
            {
             newCompositeNode(grammarAccess.getSPINMEMRule()); 
            pushFollow(FOLLOW_ruleSPINMEM_in_entryRuleSPINMEM9267);
            iv_ruleSPINMEM=ruleSPINMEM();

            state._fsp--;

             current =iv_ruleSPINMEM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPINMEM9277); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3998:1: ruleSPINMEM returns [EObject current=null] : ( ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleSPINMEM() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_buffer_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4001:28: ( ( ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4002:1: ( ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4002:1: ( ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )? )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4002:2: ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )?
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4002:2: ( (lv_buffer_0_0= ruleSPINBUF ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4003:1: (lv_buffer_0_0= ruleSPINBUF )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4003:1: (lv_buffer_0_0= ruleSPINBUF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4004:3: lv_buffer_0_0= ruleSPINBUF
            {
             
            	        newCompositeNode(grammarAccess.getSPINMEMAccess().getBufferSPINBUFParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINBUF_in_ruleSPINMEM9323);
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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4020:2: ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )?
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==EOF||LA26_2==RULE_ID||LA26_2==RULE_SC_COMMENT||(LA26_2>=17 && LA26_2<=22)||(LA26_2>=24 && LA26_2<=60)) ) {
                    alt26=2;
                }
            }
            switch (alt26) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4020:3: ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4020:3: ( (lv_value_1_0= RULE_INT ) )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4021:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4021:1: (lv_value_1_0= RULE_INT )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4022:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSPINMEM9341); 

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
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4039:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4039:6: ( (otherlv_2= RULE_ID ) )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4040:1: (otherlv_2= RULE_ID )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4040:1: (otherlv_2= RULE_ID )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4041:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSPINMEMRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINMEM9372); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4060:1: entryRuleSPINBUF returns [String current=null] : iv_ruleSPINBUF= ruleSPINBUF EOF ;
    public final String entryRuleSPINBUF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPINBUF = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4061:2: (iv_ruleSPINBUF= ruleSPINBUF EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4062:2: iv_ruleSPINBUF= ruleSPINBUF EOF
            {
             newCompositeNode(grammarAccess.getSPINBUFRule()); 
            pushFollow(FOLLOW_ruleSPINBUF_in_entryRuleSPINBUF9411);
            iv_ruleSPINBUF=ruleSPINBUF();

            state._fsp--;

             current =iv_ruleSPINBUF.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPINBUF9422); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4069:1: ruleSPINBUF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )? ) ;
    public final AntlrDatatypeRuleToken ruleSPINBUF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4072:28: ( (this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )? ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4073:1: (this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )? )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4073:1: (this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )? )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4073:6: this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINBUF9462); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getSPINBUFAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4080:1: (kw= '#' | kw= '^' )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==64) ) {
                alt27=1;
            }
            else if ( (LA27_0==65) ) {
                alt27=2;
            }
            switch (alt27) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4081:2: kw= '#'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleSPINBUF9481); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINBUFAccess().getNumberSignKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4088:2: kw= '^'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleSPINBUF9500); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINBUFAccess().getCircumflexAccentKeyword_1_1()); 
                        

                    }
                    break;

            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4093:3: (kw= '+' | kw= '-' )?
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==66) ) {
                alt28=1;
            }
            else if ( (LA28_0==61) ) {
                alt28=2;
            }
            switch (alt28) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4094:2: kw= '+'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleSPINBUF9516); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINBUFAccess().getPlusSignKeyword_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4101:2: kw= '-'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleSPINBUF9535); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4114:1: entryRuleBINARY24 returns [String current=null] : iv_ruleBINARY24= ruleBINARY24 EOF ;
    public final String entryRuleBINARY24() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBINARY24 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4115:2: (iv_ruleBINARY24= ruleBINARY24 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4116:2: iv_ruleBINARY24= ruleBINARY24 EOF
            {
             newCompositeNode(grammarAccess.getBINARY24Rule()); 
            pushFollow(FOLLOW_ruleBINARY24_in_entryRuleBINARY249578);
            iv_ruleBINARY24=ruleBINARY24();

            state._fsp--;

             current =iv_ruleBINARY24.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBINARY249589); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4123:1: ruleBINARY24 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* ) | (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* ) ) ;
    public final AntlrDatatypeRuleToken ruleBINARY24() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_ID_2=null;
        Token this_INT_4=null;
        Token this_ID_5=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4126:28: ( ( ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* ) | (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4127:1: ( ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* ) | (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4127:1: ( ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* ) | (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==67) ) {
                alt32=1;
            }
            else if ( (LA32_0==68) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4127:2: ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4127:2: ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4127:3: (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )*
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4127:3: (kw= '%' this_INT_1= RULE_INT )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4128:2: kw= '%' this_INT_1= RULE_INT
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleBINARY249629); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBINARY24Access().getPercentSignKeyword_0_0_0()); 
                        
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBINARY249644); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getBINARY24Access().getINTTerminalRuleCall_0_0_1()); 
                        

                    }

                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4140:2: (this_ID_2= RULE_ID )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID) ) {
                            int LA29_2 = input.LA(2);

                            if ( (LA29_2==EOF||LA29_2==RULE_ID||LA29_2==RULE_SC_COMMENT||(LA29_2>=17 && LA29_2<=22)||(LA29_2>=24 && LA29_2<=32)||(LA29_2>=34 && LA29_2<=60)) ) {
                                alt29=1;
                            }


                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4140:7: this_ID_2= RULE_ID
                    	    {
                    	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBINARY249666); 

                    	    		current.merge(this_ID_2);
                    	        
                    	     
                    	        newLeafNode(this_ID_2, grammarAccess.getBINARY24Access().getIDTerminalRuleCall_0_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4148:6: (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4148:6: (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4149:2: kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )*
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleBINARY249694); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBINARY24Access().getDollarSignKeyword_1_0()); 
                        
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4154:1: (this_INT_4= RULE_INT )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_INT) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4154:6: this_INT_4= RULE_INT
                    	    {
                    	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBINARY249710); 

                    	    		current.merge(this_INT_4);
                    	        
                    	     
                    	        newLeafNode(this_INT_4, grammarAccess.getBINARY24Access().getINTTerminalRuleCall_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4161:3: (this_ID_5= RULE_ID )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ID) ) {
                            int LA31_2 = input.LA(2);

                            if ( (LA31_2==EOF||LA31_2==RULE_ID||LA31_2==RULE_SC_COMMENT||(LA31_2>=17 && LA31_2<=22)||(LA31_2>=24 && LA31_2<=32)||(LA31_2>=34 && LA31_2<=60)) ) {
                                alt31=1;
                            }


                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4161:8: this_ID_5= RULE_ID
                    	    {
                    	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBINARY249733); 

                    	    		current.merge(this_ID_5);
                    	        
                    	     
                    	        newLeafNode(this_ID_5, grammarAccess.getBINARY24Access().getIDTerminalRuleCall_1_2()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4176:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4177:2: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4178:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
             newCompositeNode(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN9782);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;

             current =iv_ruleBOOLEAN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN9793); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4185:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4188:28: ( (kw= 'true' | kw= 'false' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4189:1: (kw= 'true' | kw= 'false' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4189:1: (kw= 'true' | kw= 'false' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==69) ) {
                alt33=1;
            }
            else if ( (LA33_0==70) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4190:2: kw= 'true'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleBOOLEAN9831); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4197:2: kw= 'false'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleBOOLEAN9850); 

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
    public static final BitSet FOLLOW_rulePin_in_ruleProgram165 = new BitSet(new long[]{0x1FFFFFFDFF7FE050L});
    public static final BitSet FOLLOW_ruleSpinElement_in_ruleProgram187 = new BitSet(new long[]{0x1FFFFFFDFF7E0052L});
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
    public static final BitSet FOLLOW_ruleControl_in_ruleSpinElement1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpinEquate_in_ruleSpinElement1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpinBool_in_ruleSpinElement1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMem_in_ruleSpinElement1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleSpinElement1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleSpinElement1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleSpinElement1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMacro_in_ruleSpinElement1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOffset_in_ruleSpinElement1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpinEquate_in_entryRuleSpinEquate1397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpinEquate1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSpinEquate1444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpinEquate1461 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleSpinEquate1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMem_in_entryRuleMem1523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMem1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMem1570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMem1587 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleMem1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOffset_in_entryRuleOffset1649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOffset1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOffset1696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOffset1713 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleOffset1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpinBool_in_entryRuleSpinBool1776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpinBool1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSpinBool1823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpinBool1840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleSpinBool1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControl_in_entryRuleControl1902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControl1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpinSliderLabel_in_ruleControl1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpinCheckBox_in_ruleControl1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpinSliderLabel_in_entryRuleSpinSliderLabel2021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpinSliderLabel2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSpinSliderLabel2068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpinSliderLabel2085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpinSliderLabel2107 = new BitSet(new long[]{0x2000000000000032L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleSpinSliderLabel2134 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleSpinSliderLabel2155 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleSpinSliderLabel2176 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSpinSliderLabel2193 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpinSliderLabel2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpinCheckBox_in_entryRuleSpinCheckBox2259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpinCheckBox2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSpinCheckBox2306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpinCheckBox2323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpinCheckBox2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment2386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SC_COMMENT_in_ruleComment2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel2477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel2529 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleLabel2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMacro_in_entryRuleMacro2582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMacro2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsPinConnected_in_ruleMacro2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsTrue_in_ruleMacro2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsElse_in_ruleMacro2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsEndif_in_ruleMacro2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetInputDefault_in_ruleMacro2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDelayScaleControl_in_ruleMacro2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetOutputPin_in_ruleMacro2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetBaseAddress_in_ruleMacro2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsPinConnected_in_entryRuleIsPinConnected2863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsPinConnected2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleIsPinConnected2910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIsPinConnected2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsTrue_in_entryRuleIsTrue2968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsTrue2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleIsTrue3015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIsTrue3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsElse_in_entryRuleIsElse3073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsElse3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleIsElse3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsEndif_in_entryRuleIsEndif3165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsEndif3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleIsEndif3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetInputDefault_in_entryRuleGetInputDefault3257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetInputDefault3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleGetInputDefault3304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetInputDefault3321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetInputDefault3343 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleGetInputDefault3369 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleGetInputDefault3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDelayScaleControl_in_entryRuleGetDelayScaleControl3426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetDelayScaleControl3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleGetDelayScaleControl3473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3534 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetBaseAddress_in_entryRuleGetBaseAddress3598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetBaseAddress3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleGetBaseAddress3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetOutputPin_in_entryRuleSetOutputPin3690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetOutputPin3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleSetOutputPin3737 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetOutputPin3754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetOutputPin3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction3817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B15_S1_9_in_ruleInstruction3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B6_S1_14_in_ruleInstruction3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_S1_14_S1_10_in_ruleInstruction3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B6_in_ruleInstruction3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B24_in_ruleInstruction3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_ruleInstruction4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJam_in_ruleInstruction4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_X0_in_ruleInstruction4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadSinLFO_in_ruleInstruction4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadRampLFO_in_ruleInstruction4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusReadDelay_in_ruleInstruction4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusReadValue_in_ruleInstruction4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusScaleOffset_in_ruleInstruction4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLog_in_ruleInstruction4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadDelayPointer_in_ruleInstruction4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B6_S1_14_in_entryRuleInst_B6_S1_144287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_B6_S1_144297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadRegister_in_ruleInst_B6_S1_144344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegister_in_ruleInst_B6_S1_144371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadRegisterFilter_in_ruleInst_B6_S1_144398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxx_in_ruleInst_B6_S1_144425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegisterHighshelf_in_ruleInst_B6_S1_144452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegisterLowshelf_in_ruleInst_B6_S1_144479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B15_S1_9_in_entryRuleInst_B15_S1_94514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_B15_S1_94524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadDelay_in_ruleInst_B15_S1_94571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteDelay_in_ruleInst_B15_S1_94598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteAllpass_in_ruleInst_B15_S1_94625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B6_in_entryRuleInst_B64660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_B64670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulx_in_ruleInst_B64717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLdax_in_ruleInst_B64744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B24_in_entryRuleInst_B244779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_B244789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleInst_B244836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleInst_B244863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_ruleInst_B244890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_X0_in_entryRuleInst_X04925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_X04935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClr_in_ruleInst_X04982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_ruleInst_X05009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsa_in_ruleInst_X05036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_S1_14_S1_10_in_entryRuleInst_S1_14_S1_105071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_S1_14_S1_105081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp_in_ruleInst_S1_14_S1_105128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleOffset_in_ruleInst_S1_14_S1_105155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadRegister_in_entryRuleReadRegister5190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadRegister5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleReadRegister5237 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleReadRegister5258 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleReadRegister5270 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleReadRegister5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegisterLowshelf_in_entryRuleWriteRegisterLowshelf5327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWriteRegisterLowshelf5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleWriteRegisterLowshelf5374 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleWriteRegisterLowshelf5395 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleWriteRegisterLowshelf5407 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegisterLowshelf5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegisterHighshelf_in_entryRuleWriteRegisterHighshelf5464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWriteRegisterHighshelf5474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleWriteRegisterHighshelf5511 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleWriteRegisterHighshelf5532 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleWriteRegisterHighshelf5544 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegisterHighshelf5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegister_in_entryRuleWriteRegister5601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWriteRegister5611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleWriteRegister5648 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleWriteRegister5669 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleWriteRegister5681 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegister5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxx_in_entryRuleMaxx5738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxx5748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleMaxx5785 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleMaxx5806 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMaxx5818 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleMaxx5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadRegisterFilter_in_entryRuleReadRegisterFilter5875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadRegisterFilter5885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleReadRegisterFilter5922 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleReadRegisterFilter5943 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleReadRegisterFilter5955 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleReadRegisterFilter5976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulx_in_entryRuleMulx6012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulx6022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleMulx6059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMulx6076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLdax_in_entryRuleLdax6117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLdax6127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleLdax6164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLdax6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp_in_entryRuleExp6222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleExp6269 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleExp6290 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleExp6302 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleExp6323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLog_in_entryRuleLog6359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLog6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleLog6406 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleLog6427 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleLog6439 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleLog6460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleOffset_in_entryRuleScaleOffset6496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleOffset6506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleScaleOffset6543 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleScaleOffset6564 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleScaleOffset6576 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleScaleOffset6597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteDelay_in_entryRuleWriteDelay6633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWriteDelay6643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleWriteDelay6680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSPINMEM_in_ruleWriteDelay6701 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleWriteDelay6713 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleWriteDelay6734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteAllpass_in_entryRuleWriteAllpass6770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWriteAllpass6780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleWriteAllpass6817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSPINMEM_in_ruleWriteAllpass6838 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleWriteAllpass6850 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleWriteAllpass6871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadDelay_in_entryRuleReadDelay6907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadDelay6917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleReadDelay6954 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSPINMEM_in_ruleReadDelay6975 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleReadDelay6987 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleReadDelay7008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadSinLFO_in_entryRuleLoadSinLFO7044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoadSinLFO7054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleLoadSinLFO7091 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleLoadSinLFO7112 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleLoadSinLFO7124 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoadSinLFO7141 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleLoadSinLFO7158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoadSinLFO7175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadRampLFO_in_entryRuleLoadRampLFO7216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoadRampLFO7226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLoadRampLFO7263 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleLoadRampLFO7284 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleLoadRampLFO7296 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoadRampLFO7313 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleLoadRampLFO7330 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoadRampLFO7347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusReadDelay_in_entryRuleChorusReadDelay7388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChorusReadDelay7398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleChorusReadDelay7435 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleChorusReadDelay7447 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleChorusReadDelay7468 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleChorusReadDelay7480 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_ruleSPINCHOREGFLAGS_in_ruleChorusReadDelay7501 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleChorusReadDelay7513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSPINMEM_in_ruleChorusReadDelay7534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusReadValue_in_entryRuleChorusReadValue7570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChorusReadValue7580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleChorusReadValue7617 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleChorusReadValue7629 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleChorusReadValue7650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusScaleOffset_in_entryRuleChorusScaleOffset7686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChorusScaleOffset7696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleChorusScaleOffset7733 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleChorusScaleOffset7745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChorusScaleOffset7762 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleChorusScaleOffset7779 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_ruleSPINCHOREGFLAGS_in_ruleChorusScaleOffset7800 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleChorusScaleOffset7812 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleChorusScaleOffset7833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadDelayPointer_in_entryRuleReadDelayPointer7869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadDelayPointer7879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleReadDelayPointer7916 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleReadDelayPointer7937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd7973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd7983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAnd8020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleBINARY24_in_ruleAnd8041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr8077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr8087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleOr8124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleBINARY24_in_ruleOr8145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_entryRuleXor8181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXor8191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXor8228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleBINARY24_in_ruleXor8249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJam_in_entryRuleJam8285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJam8295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleJam8332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJam8349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClr_in_entryRuleClr8390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClr8400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleClr8446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_entryRuleNot8482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNot8492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleNot8538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsa_in_entryRuleAbsa8574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsa8584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleAbsa8630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_entryRuleSkip8666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkip8676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleSkip8713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSkip8730 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleSkip8747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSkip8767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_entryRuleSPINDOUBLE8804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPINDOUBLE8815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleSPINDOUBLE8854 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINDOUBLE8872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSPINDOUBLE8899 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleSPINDOUBLE8918 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSPINDOUBLE8933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_entryRuleSPINREGISTER8983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPINREGISTER8994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINREGISTER9034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSPINREGISTER9060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPINCHOREGFLAGS_in_entryRuleSPINCHOREGFLAGS9106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPINCHOREGFLAGS9117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSPINCHOREGFLAGS9157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINCHOREGFLAGS9184 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleSPINCHOREGFLAGS9203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINCHOREGFLAGS9218 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleSPINMEM_in_entryRuleSPINMEM9267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPINMEM9277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPINBUF_in_ruleSPINMEM9323 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSPINMEM9341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINMEM9372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPINBUF_in_entryRuleSPINBUF9411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPINBUF9422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINBUF9462 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_64_in_ruleSPINBUF9481 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_65_in_ruleSPINBUF9500 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleSPINBUF9516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleSPINBUF9535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARY24_in_entryRuleBINARY249578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBINARY249589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleBINARY249629 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBINARY249644 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBINARY249666 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_68_in_ruleBINARY249694 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBINARY249710 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBINARY249733 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN9782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN9793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleBOOLEAN9831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleBOOLEAN9850 = new BitSet(new long[]{0x0000000000000002L});

}