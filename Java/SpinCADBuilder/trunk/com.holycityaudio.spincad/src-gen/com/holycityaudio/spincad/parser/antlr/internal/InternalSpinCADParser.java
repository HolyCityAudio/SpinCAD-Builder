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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_SC_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@name'", "'@audioInput'", "'@audioOutput'", "'@controlInput'", "'@controlOutput'", "'@slider'", "'@checkbox'", "'@controlLabel'", "'equ'", "'mem'", "'offset'", "':'", "'@isPinConnected'", "'@else'", "'@endif'", "'@getInputDefault'", "'@getDelayScaleControl'", "'@getBaseAddress'", "'@setOutputPin'", "'rdax'", "','", "'wrlx'", "'wrhx'", "'wrax'", "'maxx'", "'rdfx'", "'mulx'", "'ldax'", "'exp'", "'log'", "'sof'", "'wra'", "'wrap'", "'rda'", "'wlds'", "'wldr'", "'cho rda'", "'cho rdal'", "'cho sof'", "'rmpa'", "'and'", "'or'", "'xor'", "'jam'", "'clr'", "'not'", "'absa'", "'skp'", "'-'", "'.'", "'|'", "'#'", "'^'", "'+'", "'%'", "'$'"
    };
    public static final int RULE_SC_COMMENT=6;
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:76:1: ruleProgram returns [EObject current=null] : (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) ( (lv_pins_2_0= rulePin ) )+ ( (lv_controls_3_0= ruleControl ) )* ( (lv_elements_4_0= ruleSpinElement ) )+ ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_pins_2_0 = null;

        EObject lv_controls_3_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:79:28: ( (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) ( (lv_pins_2_0= rulePin ) )+ ( (lv_controls_3_0= ruleControl ) )* ( (lv_elements_4_0= ruleSpinElement ) )+ ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:80:1: (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) ( (lv_pins_2_0= rulePin ) )+ ( (lv_controls_3_0= ruleControl ) )* ( (lv_elements_4_0= ruleSpinElement ) )+ )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:80:1: (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) ( (lv_pins_2_0= rulePin ) )+ ( (lv_controls_3_0= ruleControl ) )* ( (lv_elements_4_0= ruleSpinElement ) )+ )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:80:3: otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) ( (lv_pins_2_0= rulePin ) )+ ( (lv_controls_3_0= ruleControl ) )* ( (lv_elements_4_0= ruleSpinElement ) )+
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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:120:3: ( (lv_controls_3_0= ruleControl ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=17 && LA2_0<=19)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:121:1: (lv_controls_3_0= ruleControl )
            	    {
            	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:121:1: (lv_controls_3_0= ruleControl )
            	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:122:3: lv_controls_3_0= ruleControl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getControlsControlParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleControl_in_ruleProgram187);
            	    lv_controls_3_0=ruleControl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"controls",
            	            		lv_controls_3_0, 
            	            		"Control");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:138:3: ( (lv_elements_4_0= ruleSpinElement ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==RULE_SC_COMMENT||(LA3_0>=20 && LA3_0<=22)||(LA3_0>=24 && LA3_0<=31)||(LA3_0>=33 && LA3_0<=59)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:139:1: (lv_elements_4_0= ruleSpinElement )
            	    {
            	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:139:1: (lv_elements_4_0= ruleSpinElement )
            	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:140:3: lv_elements_4_0= ruleSpinElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getElementsSpinElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSpinElement_in_ruleProgram209);
            	    lv_elements_4_0=ruleSpinElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"SpinElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:164:1: entryRulePin returns [EObject current=null] : iv_rulePin= rulePin EOF ;
    public final EObject entryRulePin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePin = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:165:2: (iv_rulePin= rulePin EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:166:2: iv_rulePin= rulePin EOF
            {
             newCompositeNode(grammarAccess.getPinRule()); 
            pushFollow(FOLLOW_rulePin_in_entryRulePin246);
            iv_rulePin=rulePin();

            state._fsp--;

             current =iv_rulePin; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePin256); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:173:1: rulePin returns [EObject current=null] : (this_InputPin_0= ruleInputPin | this_OutputPin_1= ruleOutputPin ) ;
    public final EObject rulePin() throws RecognitionException {
        EObject current = null;

        EObject this_InputPin_0 = null;

        EObject this_OutputPin_1 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:176:28: ( (this_InputPin_0= ruleInputPin | this_OutputPin_1= ruleOutputPin ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:177:1: (this_InputPin_0= ruleInputPin | this_OutputPin_1= ruleOutputPin )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:177:1: (this_InputPin_0= ruleInputPin | this_OutputPin_1= ruleOutputPin )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13||LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==14||LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:178:5: this_InputPin_0= ruleInputPin
                    {
                     
                            newCompositeNode(grammarAccess.getPinAccess().getInputPinParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInputPin_in_rulePin303);
                    this_InputPin_0=ruleInputPin();

                    state._fsp--;

                     
                            current = this_InputPin_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:188:5: this_OutputPin_1= ruleOutputPin
                    {
                     
                            newCompositeNode(grammarAccess.getPinAccess().getOutputPinParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOutputPin_in_rulePin330);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:204:1: entryRuleInputPin returns [EObject current=null] : iv_ruleInputPin= ruleInputPin EOF ;
    public final EObject entryRuleInputPin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputPin = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:205:2: (iv_ruleInputPin= ruleInputPin EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:206:2: iv_ruleInputPin= ruleInputPin EOF
            {
             newCompositeNode(grammarAccess.getInputPinRule()); 
            pushFollow(FOLLOW_ruleInputPin_in_entryRuleInputPin365);
            iv_ruleInputPin=ruleInputPin();

            state._fsp--;

             current =iv_ruleInputPin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputPin375); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:213:1: ruleInputPin returns [EObject current=null] : (this_AudioInput_0= ruleAudioInput | this_ControlInput_1= ruleControlInput ) ;
    public final EObject ruleInputPin() throws RecognitionException {
        EObject current = null;

        EObject this_AudioInput_0 = null;

        EObject this_ControlInput_1 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:216:28: ( (this_AudioInput_0= ruleAudioInput | this_ControlInput_1= ruleControlInput ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:217:1: (this_AudioInput_0= ruleAudioInput | this_ControlInput_1= ruleControlInput )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:217:1: (this_AudioInput_0= ruleAudioInput | this_ControlInput_1= ruleControlInput )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:218:5: this_AudioInput_0= ruleAudioInput
                    {
                     
                            newCompositeNode(grammarAccess.getInputPinAccess().getAudioInputParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAudioInput_in_ruleInputPin422);
                    this_AudioInput_0=ruleAudioInput();

                    state._fsp--;

                     
                            current = this_AudioInput_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:228:5: this_ControlInput_1= ruleControlInput
                    {
                     
                            newCompositeNode(grammarAccess.getInputPinAccess().getControlInputParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleControlInput_in_ruleInputPin449);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:244:1: entryRuleOutputPin returns [EObject current=null] : iv_ruleOutputPin= ruleOutputPin EOF ;
    public final EObject entryRuleOutputPin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputPin = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:245:2: (iv_ruleOutputPin= ruleOutputPin EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:246:2: iv_ruleOutputPin= ruleOutputPin EOF
            {
             newCompositeNode(grammarAccess.getOutputPinRule()); 
            pushFollow(FOLLOW_ruleOutputPin_in_entryRuleOutputPin484);
            iv_ruleOutputPin=ruleOutputPin();

            state._fsp--;

             current =iv_ruleOutputPin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputPin494); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:253:1: ruleOutputPin returns [EObject current=null] : (this_AudioOutput_0= ruleAudioOutput | this_ControlOutput_1= ruleControlOutput ) ;
    public final EObject ruleOutputPin() throws RecognitionException {
        EObject current = null;

        EObject this_AudioOutput_0 = null;

        EObject this_ControlOutput_1 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:256:28: ( (this_AudioOutput_0= ruleAudioOutput | this_ControlOutput_1= ruleControlOutput ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:257:1: (this_AudioOutput_0= ruleAudioOutput | this_ControlOutput_1= ruleControlOutput )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:257:1: (this_AudioOutput_0= ruleAudioOutput | this_ControlOutput_1= ruleControlOutput )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:258:5: this_AudioOutput_0= ruleAudioOutput
                    {
                     
                            newCompositeNode(grammarAccess.getOutputPinAccess().getAudioOutputParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAudioOutput_in_ruleOutputPin541);
                    this_AudioOutput_0=ruleAudioOutput();

                    state._fsp--;

                     
                            current = this_AudioOutput_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:268:5: this_ControlOutput_1= ruleControlOutput
                    {
                     
                            newCompositeNode(grammarAccess.getOutputPinAccess().getControlOutputParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleControlOutput_in_ruleOutputPin568);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:284:1: entryRuleAudioInput returns [EObject current=null] : iv_ruleAudioInput= ruleAudioInput EOF ;
    public final EObject entryRuleAudioInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudioInput = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:285:2: (iv_ruleAudioInput= ruleAudioInput EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:286:2: iv_ruleAudioInput= ruleAudioInput EOF
            {
             newCompositeNode(grammarAccess.getAudioInputRule()); 
            pushFollow(FOLLOW_ruleAudioInput_in_entryRuleAudioInput603);
            iv_ruleAudioInput=ruleAudioInput();

            state._fsp--;

             current =iv_ruleAudioInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAudioInput613); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:293:1: ruleAudioInput returns [EObject current=null] : (otherlv_0= '@audioInput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAudioInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:296:28: ( (otherlv_0= '@audioInput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:297:1: (otherlv_0= '@audioInput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:297:1: (otherlv_0= '@audioInput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:297:3: otherlv_0= '@audioInput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleAudioInput650); 

                	newLeafNode(otherlv_0, grammarAccess.getAudioInputAccess().getAudioInputKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:301:1: ( (lv_varName_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:302:1: (lv_varName_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:302:1: (lv_varName_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:303:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAudioInput667); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:319:2: ( (lv_name_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:320:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:320:1: (lv_name_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:321:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAudioInput689); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:345:1: entryRuleAudioOutput returns [EObject current=null] : iv_ruleAudioOutput= ruleAudioOutput EOF ;
    public final EObject entryRuleAudioOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudioOutput = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:346:2: (iv_ruleAudioOutput= ruleAudioOutput EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:347:2: iv_ruleAudioOutput= ruleAudioOutput EOF
            {
             newCompositeNode(grammarAccess.getAudioOutputRule()); 
            pushFollow(FOLLOW_ruleAudioOutput_in_entryRuleAudioOutput730);
            iv_ruleAudioOutput=ruleAudioOutput();

            state._fsp--;

             current =iv_ruleAudioOutput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAudioOutput740); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:354:1: ruleAudioOutput returns [EObject current=null] : (otherlv_0= '@audioOutput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAudioOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:357:28: ( (otherlv_0= '@audioOutput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:358:1: (otherlv_0= '@audioOutput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:358:1: (otherlv_0= '@audioOutput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:358:3: otherlv_0= '@audioOutput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleAudioOutput777); 

                	newLeafNode(otherlv_0, grammarAccess.getAudioOutputAccess().getAudioOutputKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:362:1: ( (lv_varName_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:363:1: (lv_varName_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:363:1: (lv_varName_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:364:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAudioOutput794); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:380:2: ( (lv_name_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:381:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:381:1: (lv_name_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:382:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAudioOutput816); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:406:1: entryRuleControlInput returns [EObject current=null] : iv_ruleControlInput= ruleControlInput EOF ;
    public final EObject entryRuleControlInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlInput = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:407:2: (iv_ruleControlInput= ruleControlInput EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:408:2: iv_ruleControlInput= ruleControlInput EOF
            {
             newCompositeNode(grammarAccess.getControlInputRule()); 
            pushFollow(FOLLOW_ruleControlInput_in_entryRuleControlInput857);
            iv_ruleControlInput=ruleControlInput();

            state._fsp--;

             current =iv_ruleControlInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControlInput867); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:415:1: ruleControlInput returns [EObject current=null] : (otherlv_0= '@controlInput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleControlInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:418:28: ( (otherlv_0= '@controlInput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:419:1: (otherlv_0= '@controlInput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:419:1: (otherlv_0= '@controlInput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:419:3: otherlv_0= '@controlInput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleControlInput904); 

                	newLeafNode(otherlv_0, grammarAccess.getControlInputAccess().getControlInputKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:423:1: ( (lv_varName_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:424:1: (lv_varName_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:424:1: (lv_varName_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:425:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleControlInput921); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:441:2: ( (lv_name_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:442:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:442:1: (lv_name_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:443:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleControlInput943); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:467:1: entryRuleControlOutput returns [EObject current=null] : iv_ruleControlOutput= ruleControlOutput EOF ;
    public final EObject entryRuleControlOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlOutput = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:468:2: (iv_ruleControlOutput= ruleControlOutput EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:469:2: iv_ruleControlOutput= ruleControlOutput EOF
            {
             newCompositeNode(grammarAccess.getControlOutputRule()); 
            pushFollow(FOLLOW_ruleControlOutput_in_entryRuleControlOutput984);
            iv_ruleControlOutput=ruleControlOutput();

            state._fsp--;

             current =iv_ruleControlOutput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControlOutput994); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:476:1: ruleControlOutput returns [EObject current=null] : (otherlv_0= '@controlOutput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleControlOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:479:28: ( (otherlv_0= '@controlOutput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:480:1: (otherlv_0= '@controlOutput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:480:1: (otherlv_0= '@controlOutput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:480:3: otherlv_0= '@controlOutput' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleControlOutput1031); 

                	newLeafNode(otherlv_0, grammarAccess.getControlOutputAccess().getControlOutputKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:484:1: ( (lv_varName_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:485:1: (lv_varName_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:485:1: (lv_varName_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:486:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleControlOutput1048); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:502:2: ( (lv_name_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:503:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:503:1: (lv_name_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:504:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleControlOutput1070); 

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


    // $ANTLR start "entryRuleControl"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:528:1: entryRuleControl returns [EObject current=null] : iv_ruleControl= ruleControl EOF ;
    public final EObject entryRuleControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControl = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:529:2: (iv_ruleControl= ruleControl EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:530:2: iv_ruleControl= ruleControl EOF
            {
             newCompositeNode(grammarAccess.getControlRule()); 
            pushFollow(FOLLOW_ruleControl_in_entryRuleControl1111);
            iv_ruleControl=ruleControl();

            state._fsp--;

             current =iv_ruleControl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControl1121); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:537:1: ruleControl returns [EObject current=null] : (this_Slider_0= ruleSlider | this_CheckBox_1= ruleCheckBox | this_controlLabel_2= rulecontrolLabel ) ;
    public final EObject ruleControl() throws RecognitionException {
        EObject current = null;

        EObject this_Slider_0 = null;

        EObject this_CheckBox_1 = null;

        EObject this_controlLabel_2 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:540:28: ( (this_Slider_0= ruleSlider | this_CheckBox_1= ruleCheckBox | this_controlLabel_2= rulecontrolLabel ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:541:1: (this_Slider_0= ruleSlider | this_CheckBox_1= ruleCheckBox | this_controlLabel_2= rulecontrolLabel )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:541:1: (this_Slider_0= ruleSlider | this_CheckBox_1= ruleCheckBox | this_controlLabel_2= rulecontrolLabel )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:542:5: this_Slider_0= ruleSlider
                    {
                     
                            newCompositeNode(grammarAccess.getControlAccess().getSliderParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSlider_in_ruleControl1168);
                    this_Slider_0=ruleSlider();

                    state._fsp--;

                     
                            current = this_Slider_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:552:5: this_CheckBox_1= ruleCheckBox
                    {
                     
                            newCompositeNode(grammarAccess.getControlAccess().getCheckBoxParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCheckBox_in_ruleControl1195);
                    this_CheckBox_1=ruleCheckBox();

                    state._fsp--;

                     
                            current = this_CheckBox_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:562:5: this_controlLabel_2= rulecontrolLabel
                    {
                     
                            newCompositeNode(grammarAccess.getControlAccess().getControlLabelParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulecontrolLabel_in_ruleControl1222);
                    this_controlLabel_2=rulecontrolLabel();

                    state._fsp--;

                     
                            current = this_controlLabel_2; 
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


    // $ANTLR start "entryRuleSlider"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:578:1: entryRuleSlider returns [EObject current=null] : iv_ruleSlider= ruleSlider EOF ;
    public final EObject entryRuleSlider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlider = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:579:2: (iv_ruleSlider= ruleSlider EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:580:2: iv_ruleSlider= ruleSlider EOF
            {
             newCompositeNode(grammarAccess.getSliderRule()); 
            pushFollow(FOLLOW_ruleSlider_in_entryRuleSlider1257);
            iv_ruleSlider=ruleSlider();

            state._fsp--;

             current =iv_ruleSlider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSlider1267); 

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
    // $ANTLR end "entryRuleSlider"


    // $ANTLR start "ruleSlider"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:587:1: ruleSlider returns [EObject current=null] : (otherlv_0= '@slider' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSlider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token lv_label_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:590:28: ( (otherlv_0= '@slider' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:591:1: (otherlv_0= '@slider' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:591:1: (otherlv_0= '@slider' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:591:3: otherlv_0= '@slider' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleSlider1304); 

                	newLeafNode(otherlv_0, grammarAccess.getSliderAccess().getSliderKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:595:1: ( (lv_varName_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:596:1: (lv_varName_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:596:1: (lv_varName_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:597:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSlider1321); 

            			newLeafNode(lv_varName_1_0, grammarAccess.getSliderAccess().getVarNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSliderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:613:2: ( (lv_label_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:614:1: (lv_label_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:614:1: (lv_label_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:615:3: lv_label_2_0= RULE_ID
            {
            lv_label_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSlider1343); 

            			newLeafNode(lv_label_2_0, grammarAccess.getSliderAccess().getLabelIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSliderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_2_0, 
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
    // $ANTLR end "ruleSlider"


    // $ANTLR start "entryRuleCheckBox"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:639:1: entryRuleCheckBox returns [EObject current=null] : iv_ruleCheckBox= ruleCheckBox EOF ;
    public final EObject entryRuleCheckBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckBox = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:640:2: (iv_ruleCheckBox= ruleCheckBox EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:641:2: iv_ruleCheckBox= ruleCheckBox EOF
            {
             newCompositeNode(grammarAccess.getCheckBoxRule()); 
            pushFollow(FOLLOW_ruleCheckBox_in_entryRuleCheckBox1384);
            iv_ruleCheckBox=ruleCheckBox();

            state._fsp--;

             current =iv_ruleCheckBox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckBox1394); 

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
    // $ANTLR end "entryRuleCheckBox"


    // $ANTLR start "ruleCheckBox"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:648:1: ruleCheckBox returns [EObject current=null] : (otherlv_0= '@checkbox' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_ID ) ) ) ;
    public final EObject ruleCheckBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token lv_label_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:651:28: ( (otherlv_0= '@checkbox' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:652:1: (otherlv_0= '@checkbox' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:652:1: (otherlv_0= '@checkbox' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:652:3: otherlv_0= '@checkbox' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleCheckBox1431); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckBoxAccess().getCheckboxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:656:1: ( (lv_varName_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:657:1: (lv_varName_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:657:1: (lv_varName_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:658:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckBox1448); 

            			newLeafNode(lv_varName_1_0, grammarAccess.getCheckBoxAccess().getVarNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCheckBoxRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:674:2: ( (lv_label_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:675:1: (lv_label_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:675:1: (lv_label_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:676:3: lv_label_2_0= RULE_ID
            {
            lv_label_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckBox1470); 

            			newLeafNode(lv_label_2_0, grammarAccess.getCheckBoxAccess().getLabelIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCheckBoxRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_2_0, 
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
    // $ANTLR end "ruleCheckBox"


    // $ANTLR start "entryRulecontrolLabel"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:700:1: entryRulecontrolLabel returns [EObject current=null] : iv_rulecontrolLabel= rulecontrolLabel EOF ;
    public final EObject entryRulecontrolLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecontrolLabel = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:701:2: (iv_rulecontrolLabel= rulecontrolLabel EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:702:2: iv_rulecontrolLabel= rulecontrolLabel EOF
            {
             newCompositeNode(grammarAccess.getControlLabelRule()); 
            pushFollow(FOLLOW_rulecontrolLabel_in_entryRulecontrolLabel1511);
            iv_rulecontrolLabel=rulecontrolLabel();

            state._fsp--;

             current =iv_rulecontrolLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecontrolLabel1521); 

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
    // $ANTLR end "entryRulecontrolLabel"


    // $ANTLR start "rulecontrolLabel"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:709:1: rulecontrolLabel returns [EObject current=null] : (otherlv_0= '@controlLabel' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_ID ) ) ) ;
    public final EObject rulecontrolLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token lv_label_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:712:28: ( (otherlv_0= '@controlLabel' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:713:1: (otherlv_0= '@controlLabel' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:713:1: (otherlv_0= '@controlLabel' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:713:3: otherlv_0= '@controlLabel' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulecontrolLabel1558); 

                	newLeafNode(otherlv_0, grammarAccess.getControlLabelAccess().getControlLabelKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:717:1: ( (lv_varName_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:718:1: (lv_varName_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:718:1: (lv_varName_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:719:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulecontrolLabel1575); 

            			newLeafNode(lv_varName_1_0, grammarAccess.getControlLabelAccess().getVarNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getControlLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:735:2: ( (lv_label_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:736:1: (lv_label_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:736:1: (lv_label_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:737:3: lv_label_2_0= RULE_ID
            {
            lv_label_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulecontrolLabel1597); 

            			newLeafNode(lv_label_2_0, grammarAccess.getControlLabelAccess().getLabelIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getControlLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_2_0, 
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
    // $ANTLR end "rulecontrolLabel"


    // $ANTLR start "entryRuleSpinElement"
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:761:1: entryRuleSpinElement returns [EObject current=null] : iv_ruleSpinElement= ruleSpinElement EOF ;
    public final EObject entryRuleSpinElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinElement = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:762:2: (iv_ruleSpinElement= ruleSpinElement EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:763:2: iv_ruleSpinElement= ruleSpinElement EOF
            {
             newCompositeNode(grammarAccess.getSpinElementRule()); 
            pushFollow(FOLLOW_ruleSpinElement_in_entryRuleSpinElement1638);
            iv_ruleSpinElement=ruleSpinElement();

            state._fsp--;

             current =iv_ruleSpinElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpinElement1648); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:770:1: ruleSpinElement returns [EObject current=null] : (this_Equate_0= ruleEquate | this_Mem_1= ruleMem | this_Instruction_2= ruleInstruction | this_Label_3= ruleLabel | this_Comment_4= ruleComment | this_Macro_5= ruleMacro | this_Offset_6= ruleOffset ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:773:28: ( (this_Equate_0= ruleEquate | this_Mem_1= ruleMem | this_Instruction_2= ruleInstruction | this_Label_3= ruleLabel | this_Comment_4= ruleComment | this_Macro_5= ruleMacro | this_Offset_6= ruleOffset ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:774:1: (this_Equate_0= ruleEquate | this_Mem_1= ruleMem | this_Instruction_2= ruleInstruction | this_Label_3= ruleLabel | this_Comment_4= ruleComment | this_Macro_5= ruleMacro | this_Offset_6= ruleOffset )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:774:1: (this_Equate_0= ruleEquate | this_Mem_1= ruleMem | this_Instruction_2= ruleInstruction | this_Label_3= ruleLabel | this_Comment_4= ruleComment | this_Macro_5= ruleMacro | this_Offset_6= ruleOffset )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 31:
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
            case 59:
                {
                alt8=3;
                }
                break;
            case RULE_ID:
                {
                alt8=4;
                }
                break;
            case RULE_SC_COMMENT:
                {
                alt8=5;
                }
                break;
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt8=6;
                }
                break;
            case 22:
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
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:775:5: this_Equate_0= ruleEquate
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getEquateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEquate_in_ruleSpinElement1695);
                    this_Equate_0=ruleEquate();

                    state._fsp--;

                     
                            current = this_Equate_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:785:5: this_Mem_1= ruleMem
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getMemParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMem_in_ruleSpinElement1722);
                    this_Mem_1=ruleMem();

                    state._fsp--;

                     
                            current = this_Mem_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:795:5: this_Instruction_2= ruleInstruction
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getInstructionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInstruction_in_ruleSpinElement1749);
                    this_Instruction_2=ruleInstruction();

                    state._fsp--;

                     
                            current = this_Instruction_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:805:5: this_Label_3= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getLabelParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleSpinElement1776);
                    this_Label_3=ruleLabel();

                    state._fsp--;

                     
                            current = this_Label_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:815:5: this_Comment_4= ruleComment
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getCommentParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleComment_in_ruleSpinElement1803);
                    this_Comment_4=ruleComment();

                    state._fsp--;

                     
                            current = this_Comment_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:825:5: this_Macro_5= ruleMacro
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getMacroParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleMacro_in_ruleSpinElement1830);
                    this_Macro_5=ruleMacro();

                    state._fsp--;

                     
                            current = this_Macro_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:835:5: this_Offset_6= ruleOffset
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getOffsetParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleOffset_in_ruleSpinElement1857);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:851:1: entryRuleEquate returns [EObject current=null] : iv_ruleEquate= ruleEquate EOF ;
    public final EObject entryRuleEquate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquate = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:852:2: (iv_ruleEquate= ruleEquate EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:853:2: iv_ruleEquate= ruleEquate EOF
            {
             newCompositeNode(grammarAccess.getEquateRule()); 
            pushFollow(FOLLOW_ruleEquate_in_entryRuleEquate1892);
            iv_ruleEquate=ruleEquate();

            state._fsp--;

             current =iv_ruleEquate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquate1902); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:860:1: ruleEquate returns [EObject current=null] : (otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleEquate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ename_1_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:863:28: ( (otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:864:1: (otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:864:1: (otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:864:3: otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleEquate1939); 

                	newLeafNode(otherlv_0, grammarAccess.getEquateAccess().getEquKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:868:1: ( (lv_ename_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:869:1: (lv_ename_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:869:1: (lv_ename_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:870:3: lv_ename_1_0= RULE_ID
            {
            lv_ename_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEquate1956); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:886:2: ( (lv_value_2_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:887:1: (lv_value_2_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:887:1: (lv_value_2_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:888:3: lv_value_2_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getEquateAccess().getValueSPINDOUBLEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleEquate1982);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:912:1: entryRuleMem returns [EObject current=null] : iv_ruleMem= ruleMem EOF ;
    public final EObject entryRuleMem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMem = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:913:2: (iv_ruleMem= ruleMem EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:914:2: iv_ruleMem= ruleMem EOF
            {
             newCompositeNode(grammarAccess.getMemRule()); 
            pushFollow(FOLLOW_ruleMem_in_entryRuleMem2018);
            iv_ruleMem=ruleMem();

            state._fsp--;

             current =iv_ruleMem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMem2028); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:921:1: ruleMem returns [EObject current=null] : (otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) ) ) ;
    public final EObject ruleMem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_buffer_1_0=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:924:28: ( (otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:925:1: (otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:925:1: (otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:925:3: otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleMem2065); 

                	newLeafNode(otherlv_0, grammarAccess.getMemAccess().getMemKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:929:1: ( (lv_buffer_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:930:1: (lv_buffer_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:930:1: (lv_buffer_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:931:3: lv_buffer_1_0= RULE_ID
            {
            lv_buffer_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMem2082); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:947:2: ( (lv_length_2_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:948:1: (lv_length_2_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:948:1: (lv_length_2_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:949:3: lv_length_2_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getMemAccess().getLengthSPINREGISTERParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleMem2108);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:973:1: entryRuleOffset returns [EObject current=null] : iv_ruleOffset= ruleOffset EOF ;
    public final EObject entryRuleOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOffset = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:974:2: (iv_ruleOffset= ruleOffset EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:975:2: iv_ruleOffset= ruleOffset EOF
            {
             newCompositeNode(grammarAccess.getOffsetRule()); 
            pushFollow(FOLLOW_ruleOffset_in_entryRuleOffset2144);
            iv_ruleOffset=ruleOffset();

            state._fsp--;

             current =iv_ruleOffset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOffset2154); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:982:1: ruleOffset returns [EObject current=null] : (otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) ) ) ;
    public final EObject ruleOffset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_length_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:985:28: ( (otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:986:1: (otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:986:1: (otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:986:3: otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleOffset2191); 

                	newLeafNode(otherlv_0, grammarAccess.getOffsetAccess().getOffsetKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:990:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:991:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:991:1: (lv_name_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:992:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOffset2208); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1008:2: ( (lv_length_2_0= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1009:1: (lv_length_2_0= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1009:1: (lv_length_2_0= RULE_INT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1010:3: lv_length_2_0= RULE_INT
            {
            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleOffset2230); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1034:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1035:2: (iv_ruleComment= ruleComment EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1036:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment2271);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment2281); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1043:1: ruleComment returns [EObject current=null] : ( (lv_remark_0_0= RULE_SC_COMMENT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_remark_0_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1046:28: ( ( (lv_remark_0_0= RULE_SC_COMMENT ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1047:1: ( (lv_remark_0_0= RULE_SC_COMMENT ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1047:1: ( (lv_remark_0_0= RULE_SC_COMMENT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1048:1: (lv_remark_0_0= RULE_SC_COMMENT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1048:1: (lv_remark_0_0= RULE_SC_COMMENT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1049:3: lv_remark_0_0= RULE_SC_COMMENT
            {
            lv_remark_0_0=(Token)match(input,RULE_SC_COMMENT,FOLLOW_RULE_SC_COMMENT_in_ruleComment2322); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1073:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1074:2: (iv_ruleLabel= ruleLabel EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1075:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel2362);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel2372); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1082:1: ruleLabel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1085:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1086:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1086:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1086:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1086:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1087:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1087:1: (lv_name_0_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1088:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel2414); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleLabel2431); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1116:1: entryRuleMacro returns [EObject current=null] : iv_ruleMacro= ruleMacro EOF ;
    public final EObject entryRuleMacro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacro = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1117:2: (iv_ruleMacro= ruleMacro EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1118:2: iv_ruleMacro= ruleMacro EOF
            {
             newCompositeNode(grammarAccess.getMacroRule()); 
            pushFollow(FOLLOW_ruleMacro_in_entryRuleMacro2467);
            iv_ruleMacro=ruleMacro();

            state._fsp--;

             current =iv_ruleMacro; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMacro2477); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1125:1: ruleMacro returns [EObject current=null] : (this_IsPinConnected_0= ruleIsPinConnected | this_IsElse_1= ruleIsElse | this_IsEndif_2= ruleIsEndif | this_GetInputDefault_3= ruleGetInputDefault | this_GetDelayScaleControl_4= ruleGetDelayScaleControl | this_SetOutputPin_5= ruleSetOutputPin | this_GetBaseAddress_6= ruleGetBaseAddress ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1128:28: ( (this_IsPinConnected_0= ruleIsPinConnected | this_IsElse_1= ruleIsElse | this_IsEndif_2= ruleIsEndif | this_GetInputDefault_3= ruleGetInputDefault | this_GetDelayScaleControl_4= ruleGetDelayScaleControl | this_SetOutputPin_5= ruleSetOutputPin | this_GetBaseAddress_6= ruleGetBaseAddress ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1129:1: (this_IsPinConnected_0= ruleIsPinConnected | this_IsElse_1= ruleIsElse | this_IsEndif_2= ruleIsEndif | this_GetInputDefault_3= ruleGetInputDefault | this_GetDelayScaleControl_4= ruleGetDelayScaleControl | this_SetOutputPin_5= ruleSetOutputPin | this_GetBaseAddress_6= ruleGetBaseAddress )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1129:1: (this_IsPinConnected_0= ruleIsPinConnected | this_IsElse_1= ruleIsElse | this_IsEndif_2= ruleIsEndif | this_GetInputDefault_3= ruleGetInputDefault | this_GetDelayScaleControl_4= ruleGetDelayScaleControl | this_SetOutputPin_5= ruleSetOutputPin | this_GetBaseAddress_6= ruleGetBaseAddress )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            case 27:
                {
                alt9=4;
                }
                break;
            case 28:
                {
                alt9=5;
                }
                break;
            case 30:
                {
                alt9=6;
                }
                break;
            case 29:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1130:5: this_IsPinConnected_0= ruleIsPinConnected
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsPinConnectedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIsPinConnected_in_ruleMacro2524);
                    this_IsPinConnected_0=ruleIsPinConnected();

                    state._fsp--;

                     
                            current = this_IsPinConnected_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1140:5: this_IsElse_1= ruleIsElse
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsElseParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIsElse_in_ruleMacro2551);
                    this_IsElse_1=ruleIsElse();

                    state._fsp--;

                     
                            current = this_IsElse_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1150:5: this_IsEndif_2= ruleIsEndif
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsEndifParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIsEndif_in_ruleMacro2578);
                    this_IsEndif_2=ruleIsEndif();

                    state._fsp--;

                     
                            current = this_IsEndif_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1160:5: this_GetInputDefault_3= ruleGetInputDefault
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getGetInputDefaultParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleGetInputDefault_in_ruleMacro2605);
                    this_GetInputDefault_3=ruleGetInputDefault();

                    state._fsp--;

                     
                            current = this_GetInputDefault_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1170:5: this_GetDelayScaleControl_4= ruleGetDelayScaleControl
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getGetDelayScaleControlParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleGetDelayScaleControl_in_ruleMacro2632);
                    this_GetDelayScaleControl_4=ruleGetDelayScaleControl();

                    state._fsp--;

                     
                            current = this_GetDelayScaleControl_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1180:5: this_SetOutputPin_5= ruleSetOutputPin
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getSetOutputPinParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSetOutputPin_in_ruleMacro2659);
                    this_SetOutputPin_5=ruleSetOutputPin();

                    state._fsp--;

                     
                            current = this_SetOutputPin_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1190:5: this_GetBaseAddress_6= ruleGetBaseAddress
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getGetBaseAddressParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleGetBaseAddress_in_ruleMacro2686);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1206:1: entryRuleIsPinConnected returns [EObject current=null] : iv_ruleIsPinConnected= ruleIsPinConnected EOF ;
    public final EObject entryRuleIsPinConnected() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsPinConnected = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1207:2: (iv_ruleIsPinConnected= ruleIsPinConnected EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1208:2: iv_ruleIsPinConnected= ruleIsPinConnected EOF
            {
             newCompositeNode(grammarAccess.getIsPinConnectedRule()); 
            pushFollow(FOLLOW_ruleIsPinConnected_in_entryRuleIsPinConnected2721);
            iv_ruleIsPinConnected=ruleIsPinConnected();

            state._fsp--;

             current =iv_ruleIsPinConnected; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsPinConnected2731); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1215:1: ruleIsPinConnected returns [EObject current=null] : (otherlv_0= '@isPinConnected' ( (lv_arg1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIsPinConnected() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1218:28: ( (otherlv_0= '@isPinConnected' ( (lv_arg1_1_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1219:1: (otherlv_0= '@isPinConnected' ( (lv_arg1_1_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1219:1: (otherlv_0= '@isPinConnected' ( (lv_arg1_1_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1219:3: otherlv_0= '@isPinConnected' ( (lv_arg1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleIsPinConnected2768); 

                	newLeafNode(otherlv_0, grammarAccess.getIsPinConnectedAccess().getIsPinConnectedKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1223:1: ( (lv_arg1_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1224:1: (lv_arg1_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1224:1: (lv_arg1_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1225:3: lv_arg1_1_0= RULE_ID
            {
            lv_arg1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIsPinConnected2785); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1249:1: entryRuleIsElse returns [EObject current=null] : iv_ruleIsElse= ruleIsElse EOF ;
    public final EObject entryRuleIsElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsElse = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1250:2: (iv_ruleIsElse= ruleIsElse EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1251:2: iv_ruleIsElse= ruleIsElse EOF
            {
             newCompositeNode(grammarAccess.getIsElseRule()); 
            pushFollow(FOLLOW_ruleIsElse_in_entryRuleIsElse2826);
            iv_ruleIsElse=ruleIsElse();

            state._fsp--;

             current =iv_ruleIsElse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsElse2836); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1258:1: ruleIsElse returns [EObject current=null] : ( () otherlv_1= '@else' ) ;
    public final EObject ruleIsElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1261:28: ( ( () otherlv_1= '@else' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1262:1: ( () otherlv_1= '@else' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1262:1: ( () otherlv_1= '@else' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1262:2: () otherlv_1= '@else'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1262:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1263:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIsElseAccess().getIsElseAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleIsElse2882); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1280:1: entryRuleIsEndif returns [EObject current=null] : iv_ruleIsEndif= ruleIsEndif EOF ;
    public final EObject entryRuleIsEndif() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsEndif = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1281:2: (iv_ruleIsEndif= ruleIsEndif EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1282:2: iv_ruleIsEndif= ruleIsEndif EOF
            {
             newCompositeNode(grammarAccess.getIsEndifRule()); 
            pushFollow(FOLLOW_ruleIsEndif_in_entryRuleIsEndif2918);
            iv_ruleIsEndif=ruleIsEndif();

            state._fsp--;

             current =iv_ruleIsEndif; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsEndif2928); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1289:1: ruleIsEndif returns [EObject current=null] : ( () otherlv_1= '@endif' ) ;
    public final EObject ruleIsEndif() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1292:28: ( ( () otherlv_1= '@endif' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1293:1: ( () otherlv_1= '@endif' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1293:1: ( () otherlv_1= '@endif' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1293:2: () otherlv_1= '@endif'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1293:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1294:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIsEndifAccess().getIsEndifAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleIsEndif2974); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1311:1: entryRuleGetInputDefault returns [EObject current=null] : iv_ruleGetInputDefault= ruleGetInputDefault EOF ;
    public final EObject entryRuleGetInputDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetInputDefault = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1312:2: (iv_ruleGetInputDefault= ruleGetInputDefault EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1313:2: iv_ruleGetInputDefault= ruleGetInputDefault EOF
            {
             newCompositeNode(grammarAccess.getGetInputDefaultRule()); 
            pushFollow(FOLLOW_ruleGetInputDefault_in_entryRuleGetInputDefault3010);
            iv_ruleGetInputDefault=ruleGetInputDefault();

            state._fsp--;

             current =iv_ruleGetInputDefault; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetInputDefault3020); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1320:1: ruleGetInputDefault returns [EObject current=null] : (otherlv_0= '@getInputDefault' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleGetInputDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_variable_2_0=null;
        AntlrDatatypeRuleToken lv_scale_3_0 = null;

        AntlrDatatypeRuleToken lv_defaultVal_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1323:28: ( (otherlv_0= '@getInputDefault' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1324:1: (otherlv_0= '@getInputDefault' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1324:1: (otherlv_0= '@getInputDefault' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1324:3: otherlv_0= '@getInputDefault' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleGetInputDefault3057); 

                	newLeafNode(otherlv_0, grammarAccess.getGetInputDefaultAccess().getGetInputDefaultKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1328:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1329:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1329:1: (lv_name_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1330:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetInputDefault3074); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1346:2: ( (lv_variable_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1347:1: (lv_variable_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1347:1: (lv_variable_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1348:3: lv_variable_2_0= RULE_ID
            {
            lv_variable_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetInputDefault3096); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1364:2: ( (lv_scale_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1365:1: (lv_scale_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1365:1: (lv_scale_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1366:3: lv_scale_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getGetInputDefaultAccess().getScaleSPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleGetInputDefault3122);
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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1382:2: ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1383:1: (lv_defaultVal_4_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1383:1: (lv_defaultVal_4_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1384:3: lv_defaultVal_4_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getGetInputDefaultAccess().getDefaultValSPINDOUBLEParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleGetInputDefault3143);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1408:1: entryRuleGetDelayScaleControl returns [EObject current=null] : iv_ruleGetDelayScaleControl= ruleGetDelayScaleControl EOF ;
    public final EObject entryRuleGetDelayScaleControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetDelayScaleControl = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1409:2: (iv_ruleGetDelayScaleControl= ruleGetDelayScaleControl EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1410:2: iv_ruleGetDelayScaleControl= ruleGetDelayScaleControl EOF
            {
             newCompositeNode(grammarAccess.getGetDelayScaleControlRule()); 
            pushFollow(FOLLOW_ruleGetDelayScaleControl_in_entryRuleGetDelayScaleControl3179);
            iv_ruleGetDelayScaleControl=ruleGetDelayScaleControl();

            state._fsp--;

             current =iv_ruleGetDelayScaleControl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetDelayScaleControl3189); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1417:1: ruleGetDelayScaleControl returns [EObject current=null] : (otherlv_0= '@getDelayScaleControl' ( (lv_length_1_0= RULE_ID ) ) ( (lv_buffer_2_0= RULE_ID ) ) ( (lv_control_3_0= RULE_ID ) )? ) ;
    public final EObject ruleGetDelayScaleControl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_length_1_0=null;
        Token lv_buffer_2_0=null;
        Token lv_control_3_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1420:28: ( (otherlv_0= '@getDelayScaleControl' ( (lv_length_1_0= RULE_ID ) ) ( (lv_buffer_2_0= RULE_ID ) ) ( (lv_control_3_0= RULE_ID ) )? ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1421:1: (otherlv_0= '@getDelayScaleControl' ( (lv_length_1_0= RULE_ID ) ) ( (lv_buffer_2_0= RULE_ID ) ) ( (lv_control_3_0= RULE_ID ) )? )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1421:1: (otherlv_0= '@getDelayScaleControl' ( (lv_length_1_0= RULE_ID ) ) ( (lv_buffer_2_0= RULE_ID ) ) ( (lv_control_3_0= RULE_ID ) )? )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1421:3: otherlv_0= '@getDelayScaleControl' ( (lv_length_1_0= RULE_ID ) ) ( (lv_buffer_2_0= RULE_ID ) ) ( (lv_control_3_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleGetDelayScaleControl3226); 

                	newLeafNode(otherlv_0, grammarAccess.getGetDelayScaleControlAccess().getGetDelayScaleControlKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1425:1: ( (lv_length_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1426:1: (lv_length_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1426:1: (lv_length_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1427:3: lv_length_1_0= RULE_ID
            {
            lv_length_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3243); 

            			newLeafNode(lv_length_1_0, grammarAccess.getGetDelayScaleControlAccess().getLengthIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGetDelayScaleControlRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"length",
                    		lv_length_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1443:2: ( (lv_buffer_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1444:1: (lv_buffer_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1444:1: (lv_buffer_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1445:3: lv_buffer_2_0= RULE_ID
            {
            lv_buffer_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3265); 

            			newLeafNode(lv_buffer_2_0, grammarAccess.getGetDelayScaleControlAccess().getBufferIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGetDelayScaleControlRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"buffer",
                    		lv_buffer_2_0, 
                    		"ID");
            	    

            }


            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1461:2: ( (lv_control_3_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EOF||LA10_1==RULE_ID||LA10_1==RULE_SC_COMMENT||(LA10_1>=20 && LA10_1<=22)||(LA10_1>=24 && LA10_1<=31)||(LA10_1>=33 && LA10_1<=59)) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1462:1: (lv_control_3_0= RULE_ID )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1462:1: (lv_control_3_0= RULE_ID )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1463:3: lv_control_3_0= RULE_ID
                    {
                    lv_control_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3287); 

                    			newLeafNode(lv_control_3_0, grammarAccess.getGetDelayScaleControlAccess().getControlIDTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGetDelayScaleControlRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"control",
                            		lv_control_3_0, 
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1487:1: entryRuleGetBaseAddress returns [EObject current=null] : iv_ruleGetBaseAddress= ruleGetBaseAddress EOF ;
    public final EObject entryRuleGetBaseAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetBaseAddress = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1488:2: (iv_ruleGetBaseAddress= ruleGetBaseAddress EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1489:2: iv_ruleGetBaseAddress= ruleGetBaseAddress EOF
            {
             newCompositeNode(grammarAccess.getGetBaseAddressRule()); 
            pushFollow(FOLLOW_ruleGetBaseAddress_in_entryRuleGetBaseAddress3329);
            iv_ruleGetBaseAddress=ruleGetBaseAddress();

            state._fsp--;

             current =iv_ruleGetBaseAddress; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetBaseAddress3339); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1496:1: ruleGetBaseAddress returns [EObject current=null] : ( () otherlv_1= '@getBaseAddress' ) ;
    public final EObject ruleGetBaseAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1499:28: ( ( () otherlv_1= '@getBaseAddress' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1500:1: ( () otherlv_1= '@getBaseAddress' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1500:1: ( () otherlv_1= '@getBaseAddress' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1500:2: () otherlv_1= '@getBaseAddress'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1500:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1501:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGetBaseAddressAccess().getGetBaseAddressAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleGetBaseAddress3385); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1518:1: entryRuleSetOutputPin returns [EObject current=null] : iv_ruleSetOutputPin= ruleSetOutputPin EOF ;
    public final EObject entryRuleSetOutputPin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetOutputPin = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1519:2: (iv_ruleSetOutputPin= ruleSetOutputPin EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1520:2: iv_ruleSetOutputPin= ruleSetOutputPin EOF
            {
             newCompositeNode(grammarAccess.getSetOutputPinRule()); 
            pushFollow(FOLLOW_ruleSetOutputPin_in_entryRuleSetOutputPin3421);
            iv_ruleSetOutputPin=ruleSetOutputPin();

            state._fsp--;

             current =iv_ruleSetOutputPin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetOutputPin3431); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1527:1: ruleSetOutputPin returns [EObject current=null] : (otherlv_0= '@setOutputPin' ( (lv_pinName_1_0= RULE_ID ) ) ( (lv_varName_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSetOutputPin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_pinName_1_0=null;
        Token lv_varName_2_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1530:28: ( (otherlv_0= '@setOutputPin' ( (lv_pinName_1_0= RULE_ID ) ) ( (lv_varName_2_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1531:1: (otherlv_0= '@setOutputPin' ( (lv_pinName_1_0= RULE_ID ) ) ( (lv_varName_2_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1531:1: (otherlv_0= '@setOutputPin' ( (lv_pinName_1_0= RULE_ID ) ) ( (lv_varName_2_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1531:3: otherlv_0= '@setOutputPin' ( (lv_pinName_1_0= RULE_ID ) ) ( (lv_varName_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleSetOutputPin3468); 

                	newLeafNode(otherlv_0, grammarAccess.getSetOutputPinAccess().getSetOutputPinKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1535:1: ( (lv_pinName_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1536:1: (lv_pinName_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1536:1: (lv_pinName_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1537:3: lv_pinName_1_0= RULE_ID
            {
            lv_pinName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetOutputPin3485); 

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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1553:2: ( (lv_varName_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1554:1: (lv_varName_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1554:1: (lv_varName_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1555:3: lv_varName_2_0= RULE_ID
            {
            lv_varName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetOutputPin3507); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1579:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1580:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1581:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction3548);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction3558); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1588:1: ruleInstruction returns [EObject current=null] : (this_Inst_B15_S1_9_0= ruleInst_B15_S1_9 | this_Inst_B6_S1_14_1= ruleInst_B6_S1_14 | this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10 | this_Inst_B6_3= ruleInst_B6 | this_Inst_B24_4= ruleInst_B24 | this_Skip_5= ruleSkip | this_Jam_6= ruleJam | this_Inst_X0_7= ruleInst_X0 | this_LoadSinLFO_8= ruleLoadSinLFO | this_LoadRampLFO_9= ruleLoadRampLFO | this_ChorusReadDelay_10= ruleChorusReadDelay | this_ChorusReadValue_11= ruleChorusReadValue | this_ChorusScaleOffset_12= ruleChorusScaleOffset | this_Log_13= ruleLog | this_ReadDelayPointer_14= ruleReadDelayPointer ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1591:28: ( (this_Inst_B15_S1_9_0= ruleInst_B15_S1_9 | this_Inst_B6_S1_14_1= ruleInst_B6_S1_14 | this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10 | this_Inst_B6_3= ruleInst_B6 | this_Inst_B24_4= ruleInst_B24 | this_Skip_5= ruleSkip | this_Jam_6= ruleJam | this_Inst_X0_7= ruleInst_X0 | this_LoadSinLFO_8= ruleLoadSinLFO | this_LoadRampLFO_9= ruleLoadRampLFO | this_ChorusReadDelay_10= ruleChorusReadDelay | this_ChorusReadValue_11= ruleChorusReadValue | this_ChorusScaleOffset_12= ruleChorusScaleOffset | this_Log_13= ruleLog | this_ReadDelayPointer_14= ruleReadDelayPointer ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1592:1: (this_Inst_B15_S1_9_0= ruleInst_B15_S1_9 | this_Inst_B6_S1_14_1= ruleInst_B6_S1_14 | this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10 | this_Inst_B6_3= ruleInst_B6 | this_Inst_B24_4= ruleInst_B24 | this_Skip_5= ruleSkip | this_Jam_6= ruleJam | this_Inst_X0_7= ruleInst_X0 | this_LoadSinLFO_8= ruleLoadSinLFO | this_LoadRampLFO_9= ruleLoadRampLFO | this_ChorusReadDelay_10= ruleChorusReadDelay | this_ChorusReadValue_11= ruleChorusReadValue | this_ChorusScaleOffset_12= ruleChorusScaleOffset | this_Log_13= ruleLog | this_ReadDelayPointer_14= ruleReadDelayPointer )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1592:1: (this_Inst_B15_S1_9_0= ruleInst_B15_S1_9 | this_Inst_B6_S1_14_1= ruleInst_B6_S1_14 | this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10 | this_Inst_B6_3= ruleInst_B6 | this_Inst_B24_4= ruleInst_B24 | this_Skip_5= ruleSkip | this_Jam_6= ruleJam | this_Inst_X0_7= ruleInst_X0 | this_LoadSinLFO_8= ruleLoadSinLFO | this_LoadRampLFO_9= ruleLoadRampLFO | this_ChorusReadDelay_10= ruleChorusReadDelay | this_ChorusReadValue_11= ruleChorusReadValue | this_ChorusScaleOffset_12= ruleChorusScaleOffset | this_Log_13= ruleLog | this_ReadDelayPointer_14= ruleReadDelayPointer )
            int alt11=15;
            switch ( input.LA(1) ) {
            case 43:
            case 44:
            case 45:
                {
                alt11=1;
                }
                break;
            case 31:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                {
                alt11=2;
                }
                break;
            case 40:
            case 42:
                {
                alt11=3;
                }
                break;
            case 38:
            case 39:
                {
                alt11=4;
                }
                break;
            case 52:
            case 53:
            case 54:
                {
                alt11=5;
                }
                break;
            case 59:
                {
                alt11=6;
                }
                break;
            case 55:
                {
                alt11=7;
                }
                break;
            case 56:
            case 57:
            case 58:
                {
                alt11=8;
                }
                break;
            case 46:
                {
                alt11=9;
                }
                break;
            case 47:
                {
                alt11=10;
                }
                break;
            case 48:
                {
                alt11=11;
                }
                break;
            case 49:
                {
                alt11=12;
                }
                break;
            case 50:
                {
                alt11=13;
                }
                break;
            case 41:
                {
                alt11=14;
                }
                break;
            case 51:
                {
                alt11=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1593:5: this_Inst_B15_S1_9_0= ruleInst_B15_S1_9
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_B15_S1_9ParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInst_B15_S1_9_in_ruleInstruction3605);
                    this_Inst_B15_S1_9_0=ruleInst_B15_S1_9();

                    state._fsp--;

                     
                            current = this_Inst_B15_S1_9_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1603:5: this_Inst_B6_S1_14_1= ruleInst_B6_S1_14
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_B6_S1_14ParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInst_B6_S1_14_in_ruleInstruction3632);
                    this_Inst_B6_S1_14_1=ruleInst_B6_S1_14();

                    state._fsp--;

                     
                            current = this_Inst_B6_S1_14_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1613:5: this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_S1_14_S1_10ParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInst_S1_14_S1_10_in_ruleInstruction3659);
                    this_Inst_S1_14_S1_10_2=ruleInst_S1_14_S1_10();

                    state._fsp--;

                     
                            current = this_Inst_S1_14_S1_10_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1623:5: this_Inst_B6_3= ruleInst_B6
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_B6ParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleInst_B6_in_ruleInstruction3686);
                    this_Inst_B6_3=ruleInst_B6();

                    state._fsp--;

                     
                            current = this_Inst_B6_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1633:5: this_Inst_B24_4= ruleInst_B24
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_B24ParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleInst_B24_in_ruleInstruction3713);
                    this_Inst_B24_4=ruleInst_B24();

                    state._fsp--;

                     
                            current = this_Inst_B24_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1643:5: this_Skip_5= ruleSkip
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getSkipParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSkip_in_ruleInstruction3740);
                    this_Skip_5=ruleSkip();

                    state._fsp--;

                     
                            current = this_Skip_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1653:5: this_Jam_6= ruleJam
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getJamParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleJam_in_ruleInstruction3767);
                    this_Jam_6=ruleJam();

                    state._fsp--;

                     
                            current = this_Jam_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1663:5: this_Inst_X0_7= ruleInst_X0
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_X0ParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleInst_X0_in_ruleInstruction3794);
                    this_Inst_X0_7=ruleInst_X0();

                    state._fsp--;

                     
                            current = this_Inst_X0_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1673:5: this_LoadSinLFO_8= ruleLoadSinLFO
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLoadSinLFOParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleLoadSinLFO_in_ruleInstruction3821);
                    this_LoadSinLFO_8=ruleLoadSinLFO();

                    state._fsp--;

                     
                            current = this_LoadSinLFO_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1683:5: this_LoadRampLFO_9= ruleLoadRampLFO
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLoadRampLFOParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleLoadRampLFO_in_ruleInstruction3848);
                    this_LoadRampLFO_9=ruleLoadRampLFO();

                    state._fsp--;

                     
                            current = this_LoadRampLFO_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1693:5: this_ChorusReadDelay_10= ruleChorusReadDelay
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getChorusReadDelayParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleChorusReadDelay_in_ruleInstruction3875);
                    this_ChorusReadDelay_10=ruleChorusReadDelay();

                    state._fsp--;

                     
                            current = this_ChorusReadDelay_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1703:5: this_ChorusReadValue_11= ruleChorusReadValue
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getChorusReadValueParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleChorusReadValue_in_ruleInstruction3902);
                    this_ChorusReadValue_11=ruleChorusReadValue();

                    state._fsp--;

                     
                            current = this_ChorusReadValue_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1713:5: this_ChorusScaleOffset_12= ruleChorusScaleOffset
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getChorusScaleOffsetParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleChorusScaleOffset_in_ruleInstruction3929);
                    this_ChorusScaleOffset_12=ruleChorusScaleOffset();

                    state._fsp--;

                     
                            current = this_ChorusScaleOffset_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1723:5: this_Log_13= ruleLog
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLogParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleLog_in_ruleInstruction3956);
                    this_Log_13=ruleLog();

                    state._fsp--;

                     
                            current = this_Log_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1733:5: this_ReadDelayPointer_14= ruleReadDelayPointer
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getReadDelayPointerParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleReadDelayPointer_in_ruleInstruction3983);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1749:1: entryRuleInst_B6_S1_14 returns [EObject current=null] : iv_ruleInst_B6_S1_14= ruleInst_B6_S1_14 EOF ;
    public final EObject entryRuleInst_B6_S1_14() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_B6_S1_14 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1750:2: (iv_ruleInst_B6_S1_14= ruleInst_B6_S1_14 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1751:2: iv_ruleInst_B6_S1_14= ruleInst_B6_S1_14 EOF
            {
             newCompositeNode(grammarAccess.getInst_B6_S1_14Rule()); 
            pushFollow(FOLLOW_ruleInst_B6_S1_14_in_entryRuleInst_B6_S1_144018);
            iv_ruleInst_B6_S1_14=ruleInst_B6_S1_14();

            state._fsp--;

             current =iv_ruleInst_B6_S1_14; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_B6_S1_144028); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1758:1: ruleInst_B6_S1_14 returns [EObject current=null] : (this_ReadRegister_0= ruleReadRegister | this_WriteRegister_1= ruleWriteRegister | this_ReadRegisterFilter_2= ruleReadRegisterFilter | this_Maxx_3= ruleMaxx | this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf | this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1761:28: ( (this_ReadRegister_0= ruleReadRegister | this_WriteRegister_1= ruleWriteRegister | this_ReadRegisterFilter_2= ruleReadRegisterFilter | this_Maxx_3= ruleMaxx | this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf | this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1762:1: (this_ReadRegister_0= ruleReadRegister | this_WriteRegister_1= ruleWriteRegister | this_ReadRegisterFilter_2= ruleReadRegisterFilter | this_Maxx_3= ruleMaxx | this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf | this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1762:1: (this_ReadRegister_0= ruleReadRegister | this_WriteRegister_1= ruleWriteRegister | this_ReadRegisterFilter_2= ruleReadRegisterFilter | this_Maxx_3= ruleMaxx | this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf | this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt12=1;
                }
                break;
            case 35:
                {
                alt12=2;
                }
                break;
            case 37:
                {
                alt12=3;
                }
                break;
            case 36:
                {
                alt12=4;
                }
                break;
            case 34:
                {
                alt12=5;
                }
                break;
            case 33:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1763:5: this_ReadRegister_0= ruleReadRegister
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getReadRegisterParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleReadRegister_in_ruleInst_B6_S1_144075);
                    this_ReadRegister_0=ruleReadRegister();

                    state._fsp--;

                     
                            current = this_ReadRegister_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1773:5: this_WriteRegister_1= ruleWriteRegister
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getWriteRegisterParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWriteRegister_in_ruleInst_B6_S1_144102);
                    this_WriteRegister_1=ruleWriteRegister();

                    state._fsp--;

                     
                            current = this_WriteRegister_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1783:5: this_ReadRegisterFilter_2= ruleReadRegisterFilter
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getReadRegisterFilterParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleReadRegisterFilter_in_ruleInst_B6_S1_144129);
                    this_ReadRegisterFilter_2=ruleReadRegisterFilter();

                    state._fsp--;

                     
                            current = this_ReadRegisterFilter_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1793:5: this_Maxx_3= ruleMaxx
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getMaxxParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleMaxx_in_ruleInst_B6_S1_144156);
                    this_Maxx_3=ruleMaxx();

                    state._fsp--;

                     
                            current = this_Maxx_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1803:5: this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getWriteRegisterHighshelfParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleWriteRegisterHighshelf_in_ruleInst_B6_S1_144183);
                    this_WriteRegisterHighshelf_4=ruleWriteRegisterHighshelf();

                    state._fsp--;

                     
                            current = this_WriteRegisterHighshelf_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1813:5: this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getWriteRegisterLowshelfParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleWriteRegisterLowshelf_in_ruleInst_B6_S1_144210);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1829:1: entryRuleInst_B15_S1_9 returns [EObject current=null] : iv_ruleInst_B15_S1_9= ruleInst_B15_S1_9 EOF ;
    public final EObject entryRuleInst_B15_S1_9() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_B15_S1_9 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1830:2: (iv_ruleInst_B15_S1_9= ruleInst_B15_S1_9 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1831:2: iv_ruleInst_B15_S1_9= ruleInst_B15_S1_9 EOF
            {
             newCompositeNode(grammarAccess.getInst_B15_S1_9Rule()); 
            pushFollow(FOLLOW_ruleInst_B15_S1_9_in_entryRuleInst_B15_S1_94245);
            iv_ruleInst_B15_S1_9=ruleInst_B15_S1_9();

            state._fsp--;

             current =iv_ruleInst_B15_S1_9; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_B15_S1_94255); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1838:1: ruleInst_B15_S1_9 returns [EObject current=null] : (this_ReadDelay_0= ruleReadDelay | this_WriteDelay_1= ruleWriteDelay | this_WriteAllpass_2= ruleWriteAllpass ) ;
    public final EObject ruleInst_B15_S1_9() throws RecognitionException {
        EObject current = null;

        EObject this_ReadDelay_0 = null;

        EObject this_WriteDelay_1 = null;

        EObject this_WriteAllpass_2 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1841:28: ( (this_ReadDelay_0= ruleReadDelay | this_WriteDelay_1= ruleWriteDelay | this_WriteAllpass_2= ruleWriteAllpass ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1842:1: (this_ReadDelay_0= ruleReadDelay | this_WriteDelay_1= ruleWriteDelay | this_WriteAllpass_2= ruleWriteAllpass )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1842:1: (this_ReadDelay_0= ruleReadDelay | this_WriteDelay_1= ruleWriteDelay | this_WriteAllpass_2= ruleWriteAllpass )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt13=1;
                }
                break;
            case 43:
                {
                alt13=2;
                }
                break;
            case 44:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1843:5: this_ReadDelay_0= ruleReadDelay
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B15_S1_9Access().getReadDelayParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleReadDelay_in_ruleInst_B15_S1_94302);
                    this_ReadDelay_0=ruleReadDelay();

                    state._fsp--;

                     
                            current = this_ReadDelay_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1853:5: this_WriteDelay_1= ruleWriteDelay
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B15_S1_9Access().getWriteDelayParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWriteDelay_in_ruleInst_B15_S1_94329);
                    this_WriteDelay_1=ruleWriteDelay();

                    state._fsp--;

                     
                            current = this_WriteDelay_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1863:5: this_WriteAllpass_2= ruleWriteAllpass
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B15_S1_9Access().getWriteAllpassParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleWriteAllpass_in_ruleInst_B15_S1_94356);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1879:1: entryRuleInst_B6 returns [EObject current=null] : iv_ruleInst_B6= ruleInst_B6 EOF ;
    public final EObject entryRuleInst_B6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_B6 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1880:2: (iv_ruleInst_B6= ruleInst_B6 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1881:2: iv_ruleInst_B6= ruleInst_B6 EOF
            {
             newCompositeNode(grammarAccess.getInst_B6Rule()); 
            pushFollow(FOLLOW_ruleInst_B6_in_entryRuleInst_B64391);
            iv_ruleInst_B6=ruleInst_B6();

            state._fsp--;

             current =iv_ruleInst_B6; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_B64401); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1888:1: ruleInst_B6 returns [EObject current=null] : (this_Mulx_0= ruleMulx | this_Ldax_1= ruleLdax ) ;
    public final EObject ruleInst_B6() throws RecognitionException {
        EObject current = null;

        EObject this_Mulx_0 = null;

        EObject this_Ldax_1 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1891:28: ( (this_Mulx_0= ruleMulx | this_Ldax_1= ruleLdax ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1892:1: (this_Mulx_0= ruleMulx | this_Ldax_1= ruleLdax )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1892:1: (this_Mulx_0= ruleMulx | this_Ldax_1= ruleLdax )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            else if ( (LA14_0==39) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1893:5: this_Mulx_0= ruleMulx
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6Access().getMulxParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMulx_in_ruleInst_B64448);
                    this_Mulx_0=ruleMulx();

                    state._fsp--;

                     
                            current = this_Mulx_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1903:5: this_Ldax_1= ruleLdax
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6Access().getLdaxParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLdax_in_ruleInst_B64475);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1919:1: entryRuleInst_B24 returns [EObject current=null] : iv_ruleInst_B24= ruleInst_B24 EOF ;
    public final EObject entryRuleInst_B24() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_B24 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1920:2: (iv_ruleInst_B24= ruleInst_B24 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1921:2: iv_ruleInst_B24= ruleInst_B24 EOF
            {
             newCompositeNode(grammarAccess.getInst_B24Rule()); 
            pushFollow(FOLLOW_ruleInst_B24_in_entryRuleInst_B244510);
            iv_ruleInst_B24=ruleInst_B24();

            state._fsp--;

             current =iv_ruleInst_B24; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_B244520); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1928:1: ruleInst_B24 returns [EObject current=null] : (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor ) ;
    public final EObject ruleInst_B24() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        EObject this_Or_1 = null;

        EObject this_Xor_2 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1931:28: ( (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1932:1: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1932:1: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt15=1;
                }
                break;
            case 53:
                {
                alt15=2;
                }
                break;
            case 54:
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
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1933:5: this_And_0= ruleAnd
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B24Access().getAndParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAnd_in_ruleInst_B244567);
                    this_And_0=ruleAnd();

                    state._fsp--;

                     
                            current = this_And_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1943:5: this_Or_1= ruleOr
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B24Access().getOrParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOr_in_ruleInst_B244594);
                    this_Or_1=ruleOr();

                    state._fsp--;

                     
                            current = this_Or_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1953:5: this_Xor_2= ruleXor
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B24Access().getXorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleXor_in_ruleInst_B244621);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1969:1: entryRuleInst_X0 returns [EObject current=null] : iv_ruleInst_X0= ruleInst_X0 EOF ;
    public final EObject entryRuleInst_X0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_X0 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1970:2: (iv_ruleInst_X0= ruleInst_X0 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1971:2: iv_ruleInst_X0= ruleInst_X0 EOF
            {
             newCompositeNode(grammarAccess.getInst_X0Rule()); 
            pushFollow(FOLLOW_ruleInst_X0_in_entryRuleInst_X04656);
            iv_ruleInst_X0=ruleInst_X0();

            state._fsp--;

             current =iv_ruleInst_X0; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_X04666); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1978:1: ruleInst_X0 returns [EObject current=null] : (this_Clr_0= ruleClr | this_Not_1= ruleNot | this_Absa_2= ruleAbsa ) ;
    public final EObject ruleInst_X0() throws RecognitionException {
        EObject current = null;

        EObject this_Clr_0 = null;

        EObject this_Not_1 = null;

        EObject this_Absa_2 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1981:28: ( (this_Clr_0= ruleClr | this_Not_1= ruleNot | this_Absa_2= ruleAbsa ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1982:1: (this_Clr_0= ruleClr | this_Not_1= ruleNot | this_Absa_2= ruleAbsa )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1982:1: (this_Clr_0= ruleClr | this_Not_1= ruleNot | this_Absa_2= ruleAbsa )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt16=1;
                }
                break;
            case 57:
                {
                alt16=2;
                }
                break;
            case 58:
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
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1983:5: this_Clr_0= ruleClr
                    {
                     
                            newCompositeNode(grammarAccess.getInst_X0Access().getClrParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClr_in_ruleInst_X04713);
                    this_Clr_0=ruleClr();

                    state._fsp--;

                     
                            current = this_Clr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:1993:5: this_Not_1= ruleNot
                    {
                     
                            newCompositeNode(grammarAccess.getInst_X0Access().getNotParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNot_in_ruleInst_X04740);
                    this_Not_1=ruleNot();

                    state._fsp--;

                     
                            current = this_Not_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2003:5: this_Absa_2= ruleAbsa
                    {
                     
                            newCompositeNode(grammarAccess.getInst_X0Access().getAbsaParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAbsa_in_ruleInst_X04767);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2019:1: entryRuleInst_S1_14_S1_10 returns [EObject current=null] : iv_ruleInst_S1_14_S1_10= ruleInst_S1_14_S1_10 EOF ;
    public final EObject entryRuleInst_S1_14_S1_10() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_S1_14_S1_10 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2020:2: (iv_ruleInst_S1_14_S1_10= ruleInst_S1_14_S1_10 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2021:2: iv_ruleInst_S1_14_S1_10= ruleInst_S1_14_S1_10 EOF
            {
             newCompositeNode(grammarAccess.getInst_S1_14_S1_10Rule()); 
            pushFollow(FOLLOW_ruleInst_S1_14_S1_10_in_entryRuleInst_S1_14_S1_104802);
            iv_ruleInst_S1_14_S1_10=ruleInst_S1_14_S1_10();

            state._fsp--;

             current =iv_ruleInst_S1_14_S1_10; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInst_S1_14_S1_104812); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2028:1: ruleInst_S1_14_S1_10 returns [EObject current=null] : (this_Exp_0= ruleExp | this_ScaleOffset_1= ruleScaleOffset ) ;
    public final EObject ruleInst_S1_14_S1_10() throws RecognitionException {
        EObject current = null;

        EObject this_Exp_0 = null;

        EObject this_ScaleOffset_1 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2031:28: ( (this_Exp_0= ruleExp | this_ScaleOffset_1= ruleScaleOffset ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2032:1: (this_Exp_0= ruleExp | this_ScaleOffset_1= ruleScaleOffset )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2032:1: (this_Exp_0= ruleExp | this_ScaleOffset_1= ruleScaleOffset )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==40) ) {
                alt17=1;
            }
            else if ( (LA17_0==42) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2033:5: this_Exp_0= ruleExp
                    {
                     
                            newCompositeNode(grammarAccess.getInst_S1_14_S1_10Access().getExpParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExp_in_ruleInst_S1_14_S1_104859);
                    this_Exp_0=ruleExp();

                    state._fsp--;

                     
                            current = this_Exp_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2043:5: this_ScaleOffset_1= ruleScaleOffset
                    {
                     
                            newCompositeNode(grammarAccess.getInst_S1_14_S1_10Access().getScaleOffsetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleScaleOffset_in_ruleInst_S1_14_S1_104886);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2059:1: entryRuleReadRegister returns [EObject current=null] : iv_ruleReadRegister= ruleReadRegister EOF ;
    public final EObject entryRuleReadRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadRegister = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2060:2: (iv_ruleReadRegister= ruleReadRegister EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2061:2: iv_ruleReadRegister= ruleReadRegister EOF
            {
             newCompositeNode(grammarAccess.getReadRegisterRule()); 
            pushFollow(FOLLOW_ruleReadRegister_in_entryRuleReadRegister4921);
            iv_ruleReadRegister=ruleReadRegister();

            state._fsp--;

             current =iv_ruleReadRegister; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadRegister4931); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2068:1: ruleReadRegister returns [EObject current=null] : (otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleReadRegister() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2071:28: ( (otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2072:1: (otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2072:1: (otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2072:3: otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleReadRegister4968); 

                	newLeafNode(otherlv_0, grammarAccess.getReadRegisterAccess().getRdaxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2076:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2077:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2077:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2078:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getReadRegisterAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleReadRegister4989);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleReadRegister5001); 

                	newLeafNode(otherlv_2, grammarAccess.getReadRegisterAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2098:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2099:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2099:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2100:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getReadRegisterAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleReadRegister5022);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2124:1: entryRuleWriteRegisterLowshelf returns [EObject current=null] : iv_ruleWriteRegisterLowshelf= ruleWriteRegisterLowshelf EOF ;
    public final EObject entryRuleWriteRegisterLowshelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteRegisterLowshelf = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2125:2: (iv_ruleWriteRegisterLowshelf= ruleWriteRegisterLowshelf EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2126:2: iv_ruleWriteRegisterLowshelf= ruleWriteRegisterLowshelf EOF
            {
             newCompositeNode(grammarAccess.getWriteRegisterLowshelfRule()); 
            pushFollow(FOLLOW_ruleWriteRegisterLowshelf_in_entryRuleWriteRegisterLowshelf5058);
            iv_ruleWriteRegisterLowshelf=ruleWriteRegisterLowshelf();

            state._fsp--;

             current =iv_ruleWriteRegisterLowshelf; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWriteRegisterLowshelf5068); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2133:1: ruleWriteRegisterLowshelf returns [EObject current=null] : (otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteRegisterLowshelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2136:28: ( (otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2137:1: (otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2137:1: (otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2137:3: otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleWriteRegisterLowshelf5105); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteRegisterLowshelfAccess().getWrlxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2141:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2142:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2142:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2143:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterLowshelfAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleWriteRegisterLowshelf5126);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleWriteRegisterLowshelf5138); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteRegisterLowshelfAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2163:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2164:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2164:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2165:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterLowshelfAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegisterLowshelf5159);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2189:1: entryRuleWriteRegisterHighshelf returns [EObject current=null] : iv_ruleWriteRegisterHighshelf= ruleWriteRegisterHighshelf EOF ;
    public final EObject entryRuleWriteRegisterHighshelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteRegisterHighshelf = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2190:2: (iv_ruleWriteRegisterHighshelf= ruleWriteRegisterHighshelf EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2191:2: iv_ruleWriteRegisterHighshelf= ruleWriteRegisterHighshelf EOF
            {
             newCompositeNode(grammarAccess.getWriteRegisterHighshelfRule()); 
            pushFollow(FOLLOW_ruleWriteRegisterHighshelf_in_entryRuleWriteRegisterHighshelf5195);
            iv_ruleWriteRegisterHighshelf=ruleWriteRegisterHighshelf();

            state._fsp--;

             current =iv_ruleWriteRegisterHighshelf; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWriteRegisterHighshelf5205); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2198:1: ruleWriteRegisterHighshelf returns [EObject current=null] : (otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteRegisterHighshelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2201:28: ( (otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2202:1: (otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2202:1: (otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2202:3: otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleWriteRegisterHighshelf5242); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteRegisterHighshelfAccess().getWrhxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2206:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2207:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2207:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2208:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterHighshelfAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleWriteRegisterHighshelf5263);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleWriteRegisterHighshelf5275); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteRegisterHighshelfAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2228:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2229:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2229:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2230:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterHighshelfAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegisterHighshelf5296);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2254:1: entryRuleWriteRegister returns [EObject current=null] : iv_ruleWriteRegister= ruleWriteRegister EOF ;
    public final EObject entryRuleWriteRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteRegister = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2255:2: (iv_ruleWriteRegister= ruleWriteRegister EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2256:2: iv_ruleWriteRegister= ruleWriteRegister EOF
            {
             newCompositeNode(grammarAccess.getWriteRegisterRule()); 
            pushFollow(FOLLOW_ruleWriteRegister_in_entryRuleWriteRegister5332);
            iv_ruleWriteRegister=ruleWriteRegister();

            state._fsp--;

             current =iv_ruleWriteRegister; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWriteRegister5342); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2263:1: ruleWriteRegister returns [EObject current=null] : (otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteRegister() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2266:28: ( (otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2267:1: (otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2267:1: (otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2267:3: otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleWriteRegister5379); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteRegisterAccess().getWraxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2271:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2272:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2272:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2273:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleWriteRegister5400);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleWriteRegister5412); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteRegisterAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2293:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2294:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2294:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2295:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegister5433);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2319:1: entryRuleMaxx returns [EObject current=null] : iv_ruleMaxx= ruleMaxx EOF ;
    public final EObject entryRuleMaxx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxx = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2320:2: (iv_ruleMaxx= ruleMaxx EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2321:2: iv_ruleMaxx= ruleMaxx EOF
            {
             newCompositeNode(grammarAccess.getMaxxRule()); 
            pushFollow(FOLLOW_ruleMaxx_in_entryRuleMaxx5469);
            iv_ruleMaxx=ruleMaxx();

            state._fsp--;

             current =iv_ruleMaxx; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxx5479); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2328:1: ruleMaxx returns [EObject current=null] : (otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleMaxx() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2331:28: ( (otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2332:1: (otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2332:1: (otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2332:3: otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleMaxx5516); 

                	newLeafNode(otherlv_0, grammarAccess.getMaxxAccess().getMaxxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2336:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2337:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2337:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2338:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getMaxxAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleMaxx5537);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleMaxx5549); 

                	newLeafNode(otherlv_2, grammarAccess.getMaxxAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2358:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2359:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2359:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2360:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getMaxxAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleMaxx5570);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2384:1: entryRuleReadRegisterFilter returns [EObject current=null] : iv_ruleReadRegisterFilter= ruleReadRegisterFilter EOF ;
    public final EObject entryRuleReadRegisterFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadRegisterFilter = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2385:2: (iv_ruleReadRegisterFilter= ruleReadRegisterFilter EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2386:2: iv_ruleReadRegisterFilter= ruleReadRegisterFilter EOF
            {
             newCompositeNode(grammarAccess.getReadRegisterFilterRule()); 
            pushFollow(FOLLOW_ruleReadRegisterFilter_in_entryRuleReadRegisterFilter5606);
            iv_ruleReadRegisterFilter=ruleReadRegisterFilter();

            state._fsp--;

             current =iv_ruleReadRegisterFilter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadRegisterFilter5616); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2393:1: ruleReadRegisterFilter returns [EObject current=null] : (otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleReadRegisterFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2396:28: ( (otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2397:1: (otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2397:1: (otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2397:3: otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleReadRegisterFilter5653); 

                	newLeafNode(otherlv_0, grammarAccess.getReadRegisterFilterAccess().getRdfxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2401:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2402:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2402:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2403:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getReadRegisterFilterAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleReadRegisterFilter5674);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleReadRegisterFilter5686); 

                	newLeafNode(otherlv_2, grammarAccess.getReadRegisterFilterAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2423:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2424:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2424:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2425:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getReadRegisterFilterAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleReadRegisterFilter5707);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2449:1: entryRuleMulx returns [EObject current=null] : iv_ruleMulx= ruleMulx EOF ;
    public final EObject entryRuleMulx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulx = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2450:2: (iv_ruleMulx= ruleMulx EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2451:2: iv_ruleMulx= ruleMulx EOF
            {
             newCompositeNode(grammarAccess.getMulxRule()); 
            pushFollow(FOLLOW_ruleMulx_in_entryRuleMulx5743);
            iv_ruleMulx=ruleMulx();

            state._fsp--;

             current =iv_ruleMulx; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulx5753); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2458:1: ruleMulx returns [EObject current=null] : (otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMulx() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2461:28: ( (otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2462:1: (otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2462:1: (otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2462:3: otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleMulx5790); 

                	newLeafNode(otherlv_0, grammarAccess.getMulxAccess().getMulxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2466:1: ( (lv_arg1_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2467:1: (lv_arg1_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2467:1: (lv_arg1_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2468:3: lv_arg1_1_0= RULE_ID
            {
            lv_arg1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMulx5807); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2492:1: entryRuleLdax returns [EObject current=null] : iv_ruleLdax= ruleLdax EOF ;
    public final EObject entryRuleLdax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdax = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2493:2: (iv_ruleLdax= ruleLdax EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2494:2: iv_ruleLdax= ruleLdax EOF
            {
             newCompositeNode(grammarAccess.getLdaxRule()); 
            pushFollow(FOLLOW_ruleLdax_in_entryRuleLdax5848);
            iv_ruleLdax=ruleLdax();

            state._fsp--;

             current =iv_ruleLdax; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLdax5858); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2501:1: ruleLdax returns [EObject current=null] : (otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLdax() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2504:28: ( (otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2505:1: (otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2505:1: (otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2505:3: otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleLdax5895); 

                	newLeafNode(otherlv_0, grammarAccess.getLdaxAccess().getLdaxKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2509:1: ( (lv_arg1_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2510:1: (lv_arg1_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2510:1: (lv_arg1_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2511:3: lv_arg1_1_0= RULE_ID
            {
            lv_arg1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLdax5912); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2535:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2536:2: (iv_ruleExp= ruleExp EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2537:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_ruleExp_in_entryRuleExp5953);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExp5963); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2544:1: ruleExp returns [EObject current=null] : (otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2547:28: ( (otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2548:1: (otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2548:1: (otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2548:3: otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleExp6000); 

                	newLeafNode(otherlv_0, grammarAccess.getExpAccess().getExpKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2552:1: ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2553:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2553:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2554:3: lv_arg1_1_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getExpAccess().getArg1SPINDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleExp6021);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleExp6033); 

                	newLeafNode(otherlv_2, grammarAccess.getExpAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2574:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2575:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2575:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2576:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getExpAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleExp6054);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2600:1: entryRuleLog returns [EObject current=null] : iv_ruleLog= ruleLog EOF ;
    public final EObject entryRuleLog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLog = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2601:2: (iv_ruleLog= ruleLog EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2602:2: iv_ruleLog= ruleLog EOF
            {
             newCompositeNode(grammarAccess.getLogRule()); 
            pushFollow(FOLLOW_ruleLog_in_entryRuleLog6090);
            iv_ruleLog=ruleLog();

            state._fsp--;

             current =iv_ruleLog; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLog6100); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2609:1: ruleLog returns [EObject current=null] : (otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleLog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2612:28: ( (otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2613:1: (otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2613:1: (otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2613:3: otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleLog6137); 

                	newLeafNode(otherlv_0, grammarAccess.getLogAccess().getLogKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2617:1: ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2618:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2618:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2619:3: lv_arg1_1_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLogAccess().getArg1SPINDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleLog6158);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleLog6170); 

                	newLeafNode(otherlv_2, grammarAccess.getLogAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2639:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2640:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2640:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2641:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLogAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleLog6191);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2665:1: entryRuleScaleOffset returns [EObject current=null] : iv_ruleScaleOffset= ruleScaleOffset EOF ;
    public final EObject entryRuleScaleOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleOffset = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2666:2: (iv_ruleScaleOffset= ruleScaleOffset EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2667:2: iv_ruleScaleOffset= ruleScaleOffset EOF
            {
             newCompositeNode(grammarAccess.getScaleOffsetRule()); 
            pushFollow(FOLLOW_ruleScaleOffset_in_entryRuleScaleOffset6227);
            iv_ruleScaleOffset=ruleScaleOffset();

            state._fsp--;

             current =iv_ruleScaleOffset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleOffset6237); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2674:1: ruleScaleOffset returns [EObject current=null] : (otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleScaleOffset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2677:28: ( (otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2678:1: (otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2678:1: (otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2678:3: otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleScaleOffset6274); 

                	newLeafNode(otherlv_0, grammarAccess.getScaleOffsetAccess().getSofKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2682:1: ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2683:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2683:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2684:3: lv_arg1_1_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getScaleOffsetAccess().getArg1SPINDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleScaleOffset6295);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleScaleOffset6307); 

                	newLeafNode(otherlv_2, grammarAccess.getScaleOffsetAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2704:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2705:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2705:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2706:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getScaleOffsetAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleScaleOffset6328);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2730:1: entryRuleWriteDelay returns [EObject current=null] : iv_ruleWriteDelay= ruleWriteDelay EOF ;
    public final EObject entryRuleWriteDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteDelay = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2731:2: (iv_ruleWriteDelay= ruleWriteDelay EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2732:2: iv_ruleWriteDelay= ruleWriteDelay EOF
            {
             newCompositeNode(grammarAccess.getWriteDelayRule()); 
            pushFollow(FOLLOW_ruleWriteDelay_in_entryRuleWriteDelay6364);
            iv_ruleWriteDelay=ruleWriteDelay();

            state._fsp--;

             current =iv_ruleWriteDelay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWriteDelay6374); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2739:1: ruleWriteDelay returns [EObject current=null] : (otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteDelay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2742:28: ( (otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2743:1: (otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2743:1: (otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2743:3: otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleWriteDelay6411); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteDelayAccess().getWraKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2747:1: ( (lv_arg1_1_0= ruleSPINMEM ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2748:1: (lv_arg1_1_0= ruleSPINMEM )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2748:1: (lv_arg1_1_0= ruleSPINMEM )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2749:3: lv_arg1_1_0= ruleSPINMEM
            {
             
            	        newCompositeNode(grammarAccess.getWriteDelayAccess().getArg1SPINMEMParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINMEM_in_ruleWriteDelay6432);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleWriteDelay6444); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteDelayAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2769:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2770:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2770:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2771:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteDelayAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleWriteDelay6465);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2795:1: entryRuleWriteAllpass returns [EObject current=null] : iv_ruleWriteAllpass= ruleWriteAllpass EOF ;
    public final EObject entryRuleWriteAllpass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteAllpass = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2796:2: (iv_ruleWriteAllpass= ruleWriteAllpass EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2797:2: iv_ruleWriteAllpass= ruleWriteAllpass EOF
            {
             newCompositeNode(grammarAccess.getWriteAllpassRule()); 
            pushFollow(FOLLOW_ruleWriteAllpass_in_entryRuleWriteAllpass6501);
            iv_ruleWriteAllpass=ruleWriteAllpass();

            state._fsp--;

             current =iv_ruleWriteAllpass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWriteAllpass6511); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2804:1: ruleWriteAllpass returns [EObject current=null] : (otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteAllpass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2807:28: ( (otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2808:1: (otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2808:1: (otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2808:3: otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleWriteAllpass6548); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteAllpassAccess().getWrapKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2812:1: ( (lv_arg1_1_0= ruleSPINMEM ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2813:1: (lv_arg1_1_0= ruleSPINMEM )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2813:1: (lv_arg1_1_0= ruleSPINMEM )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2814:3: lv_arg1_1_0= ruleSPINMEM
            {
             
            	        newCompositeNode(grammarAccess.getWriteAllpassAccess().getArg1SPINMEMParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINMEM_in_ruleWriteAllpass6569);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleWriteAllpass6581); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteAllpassAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2834:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2835:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2835:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2836:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteAllpassAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleWriteAllpass6602);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2860:1: entryRuleReadDelay returns [EObject current=null] : iv_ruleReadDelay= ruleReadDelay EOF ;
    public final EObject entryRuleReadDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadDelay = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2861:2: (iv_ruleReadDelay= ruleReadDelay EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2862:2: iv_ruleReadDelay= ruleReadDelay EOF
            {
             newCompositeNode(grammarAccess.getReadDelayRule()); 
            pushFollow(FOLLOW_ruleReadDelay_in_entryRuleReadDelay6638);
            iv_ruleReadDelay=ruleReadDelay();

            state._fsp--;

             current =iv_ruleReadDelay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadDelay6648); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2869:1: ruleReadDelay returns [EObject current=null] : (otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleReadDelay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2872:28: ( (otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2873:1: (otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2873:1: (otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2873:3: otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleReadDelay6685); 

                	newLeafNode(otherlv_0, grammarAccess.getReadDelayAccess().getRdaKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2877:1: ( (lv_arg1_1_0= ruleSPINMEM ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2878:1: (lv_arg1_1_0= ruleSPINMEM )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2878:1: (lv_arg1_1_0= ruleSPINMEM )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2879:3: lv_arg1_1_0= ruleSPINMEM
            {
             
            	        newCompositeNode(grammarAccess.getReadDelayAccess().getArg1SPINMEMParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINMEM_in_ruleReadDelay6706);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleReadDelay6718); 

                	newLeafNode(otherlv_2, grammarAccess.getReadDelayAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2899:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2900:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2900:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2901:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getReadDelayAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleReadDelay6739);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2925:1: entryRuleLoadSinLFO returns [EObject current=null] : iv_ruleLoadSinLFO= ruleLoadSinLFO EOF ;
    public final EObject entryRuleLoadSinLFO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadSinLFO = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2926:2: (iv_ruleLoadSinLFO= ruleLoadSinLFO EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2927:2: iv_ruleLoadSinLFO= ruleLoadSinLFO EOF
            {
             newCompositeNode(grammarAccess.getLoadSinLFORule()); 
            pushFollow(FOLLOW_ruleLoadSinLFO_in_entryRuleLoadSinLFO6775);
            iv_ruleLoadSinLFO=ruleLoadSinLFO();

            state._fsp--;

             current =iv_ruleLoadSinLFO; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoadSinLFO6785); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2934:1: ruleLoadSinLFO returns [EObject current=null] : (otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2937:28: ( (otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2938:1: (otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2938:1: (otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2938:3: otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleLoadSinLFO6822); 

                	newLeafNode(otherlv_0, grammarAccess.getLoadSinLFOAccess().getWldsKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2942:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2943:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2943:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2944:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getLoadSinLFOAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleLoadSinLFO6843);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleLoadSinLFO6855); 

                	newLeafNode(otherlv_2, grammarAccess.getLoadSinLFOAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2964:1: ( (lv_arg2_3_0= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2965:1: (lv_arg2_3_0= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2965:1: (lv_arg2_3_0= RULE_INT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2966:3: lv_arg2_3_0= RULE_INT
            {
            lv_arg2_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoadSinLFO6872); 

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

            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleLoadSinLFO6889); 

                	newLeafNode(otherlv_4, grammarAccess.getLoadSinLFOAccess().getCommaKeyword_4());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2986:1: ( (lv_arg3_5_0= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2987:1: (lv_arg3_5_0= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2987:1: (lv_arg3_5_0= RULE_INT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:2988:3: lv_arg3_5_0= RULE_INT
            {
            lv_arg3_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoadSinLFO6906); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3012:1: entryRuleLoadRampLFO returns [EObject current=null] : iv_ruleLoadRampLFO= ruleLoadRampLFO EOF ;
    public final EObject entryRuleLoadRampLFO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadRampLFO = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3013:2: (iv_ruleLoadRampLFO= ruleLoadRampLFO EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3014:2: iv_ruleLoadRampLFO= ruleLoadRampLFO EOF
            {
             newCompositeNode(grammarAccess.getLoadRampLFORule()); 
            pushFollow(FOLLOW_ruleLoadRampLFO_in_entryRuleLoadRampLFO6947);
            iv_ruleLoadRampLFO=ruleLoadRampLFO();

            state._fsp--;

             current =iv_ruleLoadRampLFO; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoadRampLFO6957); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3021:1: ruleLoadRampLFO returns [EObject current=null] : (otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3024:28: ( (otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3025:1: (otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3025:1: (otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3025:3: otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_arg3_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleLoadRampLFO6994); 

                	newLeafNode(otherlv_0, grammarAccess.getLoadRampLFOAccess().getWldrKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3029:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3030:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3030:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3031:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getLoadRampLFOAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleLoadRampLFO7015);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleLoadRampLFO7027); 

                	newLeafNode(otherlv_2, grammarAccess.getLoadRampLFOAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3051:1: ( (lv_arg2_3_0= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3052:1: (lv_arg2_3_0= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3052:1: (lv_arg2_3_0= RULE_INT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3053:3: lv_arg2_3_0= RULE_INT
            {
            lv_arg2_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoadRampLFO7044); 

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

            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleLoadRampLFO7061); 

                	newLeafNode(otherlv_4, grammarAccess.getLoadRampLFOAccess().getCommaKeyword_4());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3073:1: ( (lv_arg3_5_0= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3074:1: (lv_arg3_5_0= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3074:1: (lv_arg3_5_0= RULE_INT )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3075:3: lv_arg3_5_0= RULE_INT
            {
            lv_arg3_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoadRampLFO7078); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3099:1: entryRuleChorusReadDelay returns [EObject current=null] : iv_ruleChorusReadDelay= ruleChorusReadDelay EOF ;
    public final EObject entryRuleChorusReadDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChorusReadDelay = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3100:2: (iv_ruleChorusReadDelay= ruleChorusReadDelay EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3101:2: iv_ruleChorusReadDelay= ruleChorusReadDelay EOF
            {
             newCompositeNode(grammarAccess.getChorusReadDelayRule()); 
            pushFollow(FOLLOW_ruleChorusReadDelay_in_entryRuleChorusReadDelay7119);
            iv_ruleChorusReadDelay=ruleChorusReadDelay();

            state._fsp--;

             current =iv_ruleChorusReadDelay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChorusReadDelay7129); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3108:1: ruleChorusReadDelay returns [EObject current=null] : (otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) ) ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3111:28: ( (otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3112:1: (otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3112:1: (otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3112:3: otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleChorusReadDelay7166); 

                	newLeafNode(otherlv_0, grammarAccess.getChorusReadDelayAccess().getChoRdaKeyword_0());
                
            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleChorusReadDelay7178); 

                	newLeafNode(otherlv_1, grammarAccess.getChorusReadDelayAccess().getCommaKeyword_1());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3120:1: ( (lv_arg1_2_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3121:1: (lv_arg1_2_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3121:1: (lv_arg1_2_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3122:3: lv_arg1_2_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getChorusReadDelayAccess().getArg1SPINREGISTERParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleChorusReadDelay7199);
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

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleChorusReadDelay7211); 

                	newLeafNode(otherlv_3, grammarAccess.getChorusReadDelayAccess().getCommaKeyword_3());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3142:1: ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3143:1: (lv_arg2_4_0= ruleSPINCHOREGFLAGS )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3143:1: (lv_arg2_4_0= ruleSPINCHOREGFLAGS )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3144:3: lv_arg2_4_0= ruleSPINCHOREGFLAGS
            {
             
            	        newCompositeNode(grammarAccess.getChorusReadDelayAccess().getArg2SPINCHOREGFLAGSParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINCHOREGFLAGS_in_ruleChorusReadDelay7232);
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

            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleChorusReadDelay7244); 

                	newLeafNode(otherlv_5, grammarAccess.getChorusReadDelayAccess().getCommaKeyword_5());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3164:1: ( (lv_arg3_6_0= ruleSPINMEM ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3165:1: (lv_arg3_6_0= ruleSPINMEM )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3165:1: (lv_arg3_6_0= ruleSPINMEM )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3166:3: lv_arg3_6_0= ruleSPINMEM
            {
             
            	        newCompositeNode(grammarAccess.getChorusReadDelayAccess().getArg3SPINMEMParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINMEM_in_ruleChorusReadDelay7265);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3190:1: entryRuleChorusReadValue returns [EObject current=null] : iv_ruleChorusReadValue= ruleChorusReadValue EOF ;
    public final EObject entryRuleChorusReadValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChorusReadValue = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3191:2: (iv_ruleChorusReadValue= ruleChorusReadValue EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3192:2: iv_ruleChorusReadValue= ruleChorusReadValue EOF
            {
             newCompositeNode(grammarAccess.getChorusReadValueRule()); 
            pushFollow(FOLLOW_ruleChorusReadValue_in_entryRuleChorusReadValue7301);
            iv_ruleChorusReadValue=ruleChorusReadValue();

            state._fsp--;

             current =iv_ruleChorusReadValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChorusReadValue7311); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3199:1: ruleChorusReadValue returns [EObject current=null] : (otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) ) ;
    public final EObject ruleChorusReadValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_arg1_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3202:28: ( (otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3203:1: (otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3203:1: (otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3203:3: otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleChorusReadValue7348); 

                	newLeafNode(otherlv_0, grammarAccess.getChorusReadValueAccess().getChoRdalKeyword_0());
                
            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleChorusReadValue7360); 

                	newLeafNode(otherlv_1, grammarAccess.getChorusReadValueAccess().getCommaKeyword_1());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3211:1: ( (lv_arg1_2_0= ruleSPINREGISTER ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3212:1: (lv_arg1_2_0= ruleSPINREGISTER )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3212:1: (lv_arg1_2_0= ruleSPINREGISTER )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3213:3: lv_arg1_2_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getChorusReadValueAccess().getArg1SPINREGISTERParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINREGISTER_in_ruleChorusReadValue7381);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3237:1: entryRuleChorusScaleOffset returns [EObject current=null] : iv_ruleChorusScaleOffset= ruleChorusScaleOffset EOF ;
    public final EObject entryRuleChorusScaleOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChorusScaleOffset = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3238:2: (iv_ruleChorusScaleOffset= ruleChorusScaleOffset EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3239:2: iv_ruleChorusScaleOffset= ruleChorusScaleOffset EOF
            {
             newCompositeNode(grammarAccess.getChorusScaleOffsetRule()); 
            pushFollow(FOLLOW_ruleChorusScaleOffset_in_entryRuleChorusScaleOffset7417);
            iv_ruleChorusScaleOffset=ruleChorusScaleOffset();

            state._fsp--;

             current =iv_ruleChorusScaleOffset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChorusScaleOffset7427); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3246:1: ruleChorusScaleOffset returns [EObject current=null] : (otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) ) ) ;
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
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3249:28: ( (otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3250:1: (otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3250:1: (otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3250:3: otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleChorusScaleOffset7464); 

                	newLeafNode(otherlv_0, grammarAccess.getChorusScaleOffsetAccess().getChoSofKeyword_0());
                
            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleChorusScaleOffset7476); 

                	newLeafNode(otherlv_1, grammarAccess.getChorusScaleOffsetAccess().getCommaKeyword_1());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3258:1: ( (lv_arg1_2_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3259:1: (lv_arg1_2_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3259:1: (lv_arg1_2_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3260:3: lv_arg1_2_0= RULE_ID
            {
            lv_arg1_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChorusScaleOffset7493); 

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

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleChorusScaleOffset7510); 

                	newLeafNode(otherlv_3, grammarAccess.getChorusScaleOffsetAccess().getCommaKeyword_3());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3280:1: ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3281:1: (lv_arg2_4_0= ruleSPINCHOREGFLAGS )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3281:1: (lv_arg2_4_0= ruleSPINCHOREGFLAGS )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3282:3: lv_arg2_4_0= ruleSPINCHOREGFLAGS
            {
             
            	        newCompositeNode(grammarAccess.getChorusScaleOffsetAccess().getArg2SPINCHOREGFLAGSParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINCHOREGFLAGS_in_ruleChorusScaleOffset7531);
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

            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleChorusScaleOffset7543); 

                	newLeafNode(otherlv_5, grammarAccess.getChorusScaleOffsetAccess().getCommaKeyword_5());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3302:1: ( (lv_arg3_6_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3303:1: (lv_arg3_6_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3303:1: (lv_arg3_6_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3304:3: lv_arg3_6_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getChorusScaleOffsetAccess().getArg3SPINDOUBLEParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleChorusScaleOffset7564);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3328:1: entryRuleReadDelayPointer returns [EObject current=null] : iv_ruleReadDelayPointer= ruleReadDelayPointer EOF ;
    public final EObject entryRuleReadDelayPointer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadDelayPointer = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3329:2: (iv_ruleReadDelayPointer= ruleReadDelayPointer EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3330:2: iv_ruleReadDelayPointer= ruleReadDelayPointer EOF
            {
             newCompositeNode(grammarAccess.getReadDelayPointerRule()); 
            pushFollow(FOLLOW_ruleReadDelayPointer_in_entryRuleReadDelayPointer7600);
            iv_ruleReadDelayPointer=ruleReadDelayPointer();

            state._fsp--;

             current =iv_ruleReadDelayPointer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadDelayPointer7610); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3337:1: ruleReadDelayPointer returns [EObject current=null] : (otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleReadDelayPointer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3340:28: ( (otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3341:1: (otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3341:1: (otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3341:3: otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleReadDelayPointer7647); 

                	newLeafNode(otherlv_0, grammarAccess.getReadDelayPointerAccess().getRmpaKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3345:1: ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3346:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3346:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3347:3: lv_arg1_1_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getReadDelayPointerAccess().getArg1SPINDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_ruleReadDelayPointer7668);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3371:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3372:2: (iv_ruleAnd= ruleAnd EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3373:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd7704);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd7714); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3380:1: ruleAnd returns [EObject current=null] : (otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3383:28: ( (otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3384:1: (otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3384:1: (otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3384:3: otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleAnd7751); 

                	newLeafNode(otherlv_0, grammarAccess.getAndAccess().getAndKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3388:1: ( (lv_arg1_1_0= ruleBINARY24 ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3389:1: (lv_arg1_1_0= ruleBINARY24 )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3389:1: (lv_arg1_1_0= ruleBINARY24 )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3390:3: lv_arg1_1_0= ruleBINARY24
            {
             
            	        newCompositeNode(grammarAccess.getAndAccess().getArg1BINARY24ParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBINARY24_in_ruleAnd7772);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3414:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3415:2: (iv_ruleOr= ruleOr EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3416:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr7808);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr7818); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3423:1: ruleOr returns [EObject current=null] : (otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3426:28: ( (otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3427:1: (otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3427:1: (otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3427:3: otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleOr7855); 

                	newLeafNode(otherlv_0, grammarAccess.getOrAccess().getOrKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3431:1: ( (lv_arg1_1_0= ruleBINARY24 ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3432:1: (lv_arg1_1_0= ruleBINARY24 )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3432:1: (lv_arg1_1_0= ruleBINARY24 )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3433:3: lv_arg1_1_0= ruleBINARY24
            {
             
            	        newCompositeNode(grammarAccess.getOrAccess().getArg1BINARY24ParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBINARY24_in_ruleOr7876);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3457:1: entryRuleXor returns [EObject current=null] : iv_ruleXor= ruleXor EOF ;
    public final EObject entryRuleXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXor = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3458:2: (iv_ruleXor= ruleXor EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3459:2: iv_ruleXor= ruleXor EOF
            {
             newCompositeNode(grammarAccess.getXorRule()); 
            pushFollow(FOLLOW_ruleXor_in_entryRuleXor7912);
            iv_ruleXor=ruleXor();

            state._fsp--;

             current =iv_ruleXor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXor7922); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3466:1: ruleXor returns [EObject current=null] : (otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) ;
    public final EObject ruleXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3469:28: ( (otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3470:1: (otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3470:1: (otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3470:3: otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleXor7959); 

                	newLeafNode(otherlv_0, grammarAccess.getXorAccess().getXorKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3474:1: ( (lv_arg1_1_0= ruleBINARY24 ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3475:1: (lv_arg1_1_0= ruleBINARY24 )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3475:1: (lv_arg1_1_0= ruleBINARY24 )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3476:3: lv_arg1_1_0= ruleBINARY24
            {
             
            	        newCompositeNode(grammarAccess.getXorAccess().getArg1BINARY24ParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBINARY24_in_ruleXor7980);
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3500:1: entryRuleJam returns [EObject current=null] : iv_ruleJam= ruleJam EOF ;
    public final EObject entryRuleJam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJam = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3501:2: (iv_ruleJam= ruleJam EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3502:2: iv_ruleJam= ruleJam EOF
            {
             newCompositeNode(grammarAccess.getJamRule()); 
            pushFollow(FOLLOW_ruleJam_in_entryRuleJam8016);
            iv_ruleJam=ruleJam();

            state._fsp--;

             current =iv_ruleJam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJam8026); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3509:1: ruleJam returns [EObject current=null] : (otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleJam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3512:28: ( (otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3513:1: (otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3513:1: (otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3513:3: otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleJam8063); 

                	newLeafNode(otherlv_0, grammarAccess.getJamAccess().getJamKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3517:1: ( (lv_arg1_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3518:1: (lv_arg1_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3518:1: (lv_arg1_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3519:3: lv_arg1_1_0= RULE_ID
            {
            lv_arg1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJam8080); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3543:1: entryRuleClr returns [EObject current=null] : iv_ruleClr= ruleClr EOF ;
    public final EObject entryRuleClr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClr = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3544:2: (iv_ruleClr= ruleClr EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3545:2: iv_ruleClr= ruleClr EOF
            {
             newCompositeNode(grammarAccess.getClrRule()); 
            pushFollow(FOLLOW_ruleClr_in_entryRuleClr8121);
            iv_ruleClr=ruleClr();

            state._fsp--;

             current =iv_ruleClr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClr8131); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3552:1: ruleClr returns [EObject current=null] : ( () otherlv_1= 'clr' ) ;
    public final EObject ruleClr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3555:28: ( ( () otherlv_1= 'clr' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3556:1: ( () otherlv_1= 'clr' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3556:1: ( () otherlv_1= 'clr' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3556:2: () otherlv_1= 'clr'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3556:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3557:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClrAccess().getClrAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleClr8177); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3574:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3575:2: (iv_ruleNot= ruleNot EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3576:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_ruleNot_in_entryRuleNot8213);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNot8223); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3583:1: ruleNot returns [EObject current=null] : ( () otherlv_1= 'not' ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3586:28: ( ( () otherlv_1= 'not' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3587:1: ( () otherlv_1= 'not' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3587:1: ( () otherlv_1= 'not' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3587:2: () otherlv_1= 'not'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3587:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3588:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNotAccess().getNotAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleNot8269); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3605:1: entryRuleAbsa returns [EObject current=null] : iv_ruleAbsa= ruleAbsa EOF ;
    public final EObject entryRuleAbsa() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsa = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3606:2: (iv_ruleAbsa= ruleAbsa EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3607:2: iv_ruleAbsa= ruleAbsa EOF
            {
             newCompositeNode(grammarAccess.getAbsaRule()); 
            pushFollow(FOLLOW_ruleAbsa_in_entryRuleAbsa8305);
            iv_ruleAbsa=ruleAbsa();

            state._fsp--;

             current =iv_ruleAbsa; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsa8315); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3614:1: ruleAbsa returns [EObject current=null] : ( () otherlv_1= 'absa' ) ;
    public final EObject ruleAbsa() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3617:28: ( ( () otherlv_1= 'absa' ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3618:1: ( () otherlv_1= 'absa' )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3618:1: ( () otherlv_1= 'absa' )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3618:2: () otherlv_1= 'absa'
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3618:2: ()
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3619:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAbsaAccess().getAbsaAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleAbsa8361); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3636:1: entryRuleSkip returns [EObject current=null] : iv_ruleSkip= ruleSkip EOF ;
    public final EObject entryRuleSkip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkip = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3637:2: (iv_ruleSkip= ruleSkip EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3638:2: iv_ruleSkip= ruleSkip EOF
            {
             newCompositeNode(grammarAccess.getSkipRule()); 
            pushFollow(FOLLOW_ruleSkip_in_entryRuleSkip8397);
            iv_ruleSkip=ruleSkip();

            state._fsp--;

             current =iv_ruleSkip; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkip8407); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3645:1: ruleSkip returns [EObject current=null] : (otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleSkip() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_flags_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3648:28: ( (otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3649:1: (otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3649:1: (otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3649:3: otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleSkip8444); 

                	newLeafNode(otherlv_0, grammarAccess.getSkipAccess().getSkpKeyword_0());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3653:1: ( (lv_flags_1_0= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3654:1: (lv_flags_1_0= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3654:1: (lv_flags_1_0= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3655:3: lv_flags_1_0= RULE_ID
            {
            lv_flags_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSkip8461); 

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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleSkip8478); 

                	newLeafNode(otherlv_2, grammarAccess.getSkipAccess().getCommaKeyword_2());
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3675:1: ( (otherlv_3= RULE_ID ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3676:1: (otherlv_3= RULE_ID )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3676:1: (otherlv_3= RULE_ID )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3677:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSkipRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSkip8498); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3696:1: entryRuleSPINDOUBLE returns [String current=null] : iv_ruleSPINDOUBLE= ruleSPINDOUBLE EOF ;
    public final String entryRuleSPINDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPINDOUBLE = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3697:2: (iv_ruleSPINDOUBLE= ruleSPINDOUBLE EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3698:2: iv_ruleSPINDOUBLE= ruleSPINDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getSPINDOUBLERule()); 
            pushFollow(FOLLOW_ruleSPINDOUBLE_in_entryRuleSPINDOUBLE8535);
            iv_ruleSPINDOUBLE=ruleSPINDOUBLE();

            state._fsp--;

             current =iv_ruleSPINDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPINDOUBLE8546); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3705:1: ruleSPINDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) ) ;
    public final AntlrDatatypeRuleToken ruleSPINDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3708:28: ( ( (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3709:1: ( (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3709:1: ( (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3709:2: (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3709:2: (kw= '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==60) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3710:2: kw= '-'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleSPINDOUBLE8585); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINDOUBLEAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3715:3: (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) )
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
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3715:8: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINDOUBLE8603); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getSPINDOUBLEAccess().getIDTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3723:6: (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3723:6: (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3723:11: this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )?
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSPINDOUBLE8630); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getSPINDOUBLEAccess().getINTTerminalRuleCall_1_1_0()); 
                        
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3730:1: (kw= '.' this_INT_4= RULE_INT )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==61) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3731:2: kw= '.' this_INT_4= RULE_INT
                            {
                            kw=(Token)match(input,61,FOLLOW_61_in_ruleSPINDOUBLE8649); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getSPINDOUBLEAccess().getFullStopKeyword_1_1_1_0()); 
                                
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSPINDOUBLE8664); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3751:1: entryRuleSPINREGISTER returns [String current=null] : iv_ruleSPINREGISTER= ruleSPINREGISTER EOF ;
    public final String entryRuleSPINREGISTER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPINREGISTER = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3752:2: (iv_ruleSPINREGISTER= ruleSPINREGISTER EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3753:2: iv_ruleSPINREGISTER= ruleSPINREGISTER EOF
            {
             newCompositeNode(grammarAccess.getSPINREGISTERRule()); 
            pushFollow(FOLLOW_ruleSPINREGISTER_in_entryRuleSPINREGISTER8714);
            iv_ruleSPINREGISTER=ruleSPINREGISTER();

            state._fsp--;

             current =iv_ruleSPINREGISTER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPINREGISTER8725); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3760:1: ruleSPINREGISTER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSPINREGISTER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3763:28: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3764:1: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3764:1: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
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
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3764:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINREGISTER8765); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getSPINREGISTERAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3772:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSPINREGISTER8791); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3787:1: entryRuleSPINCHOREGFLAGS returns [String current=null] : iv_ruleSPINCHOREGFLAGS= ruleSPINCHOREGFLAGS EOF ;
    public final String entryRuleSPINCHOREGFLAGS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPINCHOREGFLAGS = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3788:2: (iv_ruleSPINCHOREGFLAGS= ruleSPINCHOREGFLAGS EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3789:2: iv_ruleSPINCHOREGFLAGS= ruleSPINCHOREGFLAGS EOF
            {
             newCompositeNode(grammarAccess.getSPINCHOREGFLAGSRule()); 
            pushFollow(FOLLOW_ruleSPINCHOREGFLAGS_in_entryRuleSPINCHOREGFLAGS8837);
            iv_ruleSPINCHOREGFLAGS=ruleSPINCHOREGFLAGS();

            state._fsp--;

             current =iv_ruleSPINCHOREGFLAGS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPINCHOREGFLAGS8848); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3796:1: ruleSPINCHOREGFLAGS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )? ) ;
    public final AntlrDatatypeRuleToken ruleSPINCHOREGFLAGS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;
        Token kw=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3799:28: ( (this_INT_0= RULE_INT | (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )? ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3800:1: (this_INT_0= RULE_INT | (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )? )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3800:1: (this_INT_0= RULE_INT | (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )? )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            else if ( (LA24_0==EOF||LA24_0==RULE_ID||LA24_0==32) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3800:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSPINCHOREGFLAGS8888); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getSPINCHOREGFLAGSAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3808:6: (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )?
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3808:6: (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ID) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3808:11: this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )*
                            {
                            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINCHOREGFLAGS8915); 

                            		current.merge(this_ID_1);
                                
                             
                                newLeafNode(this_ID_1, grammarAccess.getSPINCHOREGFLAGSAccess().getIDTerminalRuleCall_1_0()); 
                                
                            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3815:1: (kw= '|' this_ID_3= RULE_ID )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==62) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3816:2: kw= '|' this_ID_3= RULE_ID
                            	    {
                            	    kw=(Token)match(input,62,FOLLOW_62_in_ruleSPINCHOREGFLAGS8934); 

                            	            current.merge(kw);
                            	            newLeafNode(kw, grammarAccess.getSPINCHOREGFLAGSAccess().getVerticalLineKeyword_1_1_0()); 
                            	        
                            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINCHOREGFLAGS8949); 

                            	    		current.merge(this_ID_3);
                            	        
                            	     
                            	        newLeafNode(this_ID_3, grammarAccess.getSPINCHOREGFLAGSAccess().getIDTerminalRuleCall_1_1_1()); 
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop22;
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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3836:1: entryRuleSPINMEM returns [EObject current=null] : iv_ruleSPINMEM= ruleSPINMEM EOF ;
    public final EObject entryRuleSPINMEM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPINMEM = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3837:2: (iv_ruleSPINMEM= ruleSPINMEM EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3838:2: iv_ruleSPINMEM= ruleSPINMEM EOF
            {
             newCompositeNode(grammarAccess.getSPINMEMRule()); 
            pushFollow(FOLLOW_ruleSPINMEM_in_entryRuleSPINMEM8998);
            iv_ruleSPINMEM=ruleSPINMEM();

            state._fsp--;

             current =iv_ruleSPINMEM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPINMEM9008); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3845:1: ruleSPINMEM returns [EObject current=null] : ( ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleSPINMEM() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_buffer_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3848:28: ( ( ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3849:1: ( ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3849:1: ( ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )? )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3849:2: ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )?
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3849:2: ( (lv_buffer_0_0= ruleSPINBUF ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3850:1: (lv_buffer_0_0= ruleSPINBUF )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3850:1: (lv_buffer_0_0= ruleSPINBUF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3851:3: lv_buffer_0_0= ruleSPINBUF
            {
             
            	        newCompositeNode(grammarAccess.getSPINMEMAccess().getBufferSPINBUFParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSPINBUF_in_ruleSPINMEM9054);
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

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3867:2: ( ( (lv_value_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )?
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==EOF||LA25_2==RULE_ID||LA25_2==RULE_SC_COMMENT||(LA25_2>=20 && LA25_2<=22)||(LA25_2>=24 && LA25_2<=59)) ) {
                    alt25=2;
                }
            }
            switch (alt25) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3867:3: ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3867:3: ( (lv_value_1_0= RULE_INT ) )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3868:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3868:1: (lv_value_1_0= RULE_INT )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3869:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSPINMEM9072); 

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
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3886:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3886:6: ( (otherlv_2= RULE_ID ) )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3887:1: (otherlv_2= RULE_ID )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3887:1: (otherlv_2= RULE_ID )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3888:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSPINMEMRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINMEM9103); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3907:1: entryRuleSPINBUF returns [String current=null] : iv_ruleSPINBUF= ruleSPINBUF EOF ;
    public final String entryRuleSPINBUF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPINBUF = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3908:2: (iv_ruleSPINBUF= ruleSPINBUF EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3909:2: iv_ruleSPINBUF= ruleSPINBUF EOF
            {
             newCompositeNode(grammarAccess.getSPINBUFRule()); 
            pushFollow(FOLLOW_ruleSPINBUF_in_entryRuleSPINBUF9142);
            iv_ruleSPINBUF=ruleSPINBUF();

            state._fsp--;

             current =iv_ruleSPINBUF.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPINBUF9153); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3916:1: ruleSPINBUF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )? ) ;
    public final AntlrDatatypeRuleToken ruleSPINBUF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3919:28: ( (this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )? ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3920:1: (this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )? )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3920:1: (this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )? )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3920:6: this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPINBUF9193); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getSPINBUFAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3927:1: (kw= '#' | kw= '^' )?
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==63) ) {
                alt26=1;
            }
            else if ( (LA26_0==64) ) {
                alt26=2;
            }
            switch (alt26) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3928:2: kw= '#'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleSPINBUF9212); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINBUFAccess().getNumberSignKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3935:2: kw= '^'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleSPINBUF9231); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINBUFAccess().getCircumflexAccentKeyword_1_1()); 
                        

                    }
                    break;

            }

            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3940:3: (kw= '+' | kw= '-' )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==65) ) {
                alt27=1;
            }
            else if ( (LA27_0==60) ) {
                alt27=2;
            }
            switch (alt27) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3941:2: kw= '+'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleSPINBUF9247); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINBUFAccess().getPlusSignKeyword_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3948:2: kw= '-'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleSPINBUF9266); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3961:1: entryRuleBINARY24 returns [String current=null] : iv_ruleBINARY24= ruleBINARY24 EOF ;
    public final String entryRuleBINARY24() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBINARY24 = null;


        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3962:2: (iv_ruleBINARY24= ruleBINARY24 EOF )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3963:2: iv_ruleBINARY24= ruleBINARY24 EOF
            {
             newCompositeNode(grammarAccess.getBINARY24Rule()); 
            pushFollow(FOLLOW_ruleBINARY24_in_entryRuleBINARY249309);
            iv_ruleBINARY24=ruleBINARY24();

            state._fsp--;

             current =iv_ruleBINARY24.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBINARY249320); 

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
    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3970:1: ruleBINARY24 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* ) | (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* ) ) ;
    public final AntlrDatatypeRuleToken ruleBINARY24() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_ID_2=null;
        Token this_INT_4=null;
        Token this_ID_5=null;

         enterRule(); 
            
        try {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3973:28: ( ( ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* ) | (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* ) ) )
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3974:1: ( ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* ) | (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* ) )
            {
            // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3974:1: ( ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* ) | (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==66) ) {
                alt31=1;
            }
            else if ( (LA31_0==67) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3974:2: ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3974:2: ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3974:3: (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )*
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3974:3: (kw= '%' this_INT_1= RULE_INT )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3975:2: kw= '%' this_INT_1= RULE_INT
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleBINARY249360); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBINARY24Access().getPercentSignKeyword_0_0_0()); 
                        
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBINARY249375); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getBINARY24Access().getINTTerminalRuleCall_0_0_1()); 
                        

                    }

                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3987:2: (this_ID_2= RULE_ID )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_ID) ) {
                            int LA28_2 = input.LA(2);

                            if ( (LA28_2==EOF||LA28_2==RULE_ID||LA28_2==RULE_SC_COMMENT||(LA28_2>=20 && LA28_2<=22)||(LA28_2>=24 && LA28_2<=31)||(LA28_2>=33 && LA28_2<=59)) ) {
                                alt28=1;
                            }


                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3987:7: this_ID_2= RULE_ID
                    	    {
                    	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBINARY249397); 

                    	    		current.merge(this_ID_2);
                    	        
                    	     
                    	        newLeafNode(this_ID_2, grammarAccess.getBINARY24Access().getIDTerminalRuleCall_0_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3995:6: (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* )
                    {
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3995:6: (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* )
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:3996:2: kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )*
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleBINARY249425); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBINARY24Access().getDollarSignKeyword_1_0()); 
                        
                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4001:1: (this_INT_4= RULE_INT )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_INT) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4001:6: this_INT_4= RULE_INT
                    	    {
                    	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBINARY249441); 

                    	    		current.merge(this_INT_4);
                    	        
                    	     
                    	        newLeafNode(this_INT_4, grammarAccess.getBINARY24Access().getINTTerminalRuleCall_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4008:3: (this_ID_5= RULE_ID )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_ID) ) {
                            int LA30_2 = input.LA(2);

                            if ( (LA30_2==EOF||LA30_2==RULE_ID||LA30_2==RULE_SC_COMMENT||(LA30_2>=20 && LA30_2<=22)||(LA30_2>=24 && LA30_2<=31)||(LA30_2>=33 && LA30_2<=59)) ) {
                                alt30=1;
                            }


                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../com.holycityaudio.spincad/src-gen/com/holycityaudio/spincad/parser/antlr/internal/InternalSpinCAD.g:4008:8: this_ID_5= RULE_ID
                    	    {
                    	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBINARY249464); 

                    	    		current.merge(this_ID_5);
                    	        
                    	     
                    	        newLeafNode(this_ID_5, grammarAccess.getBINARY24Access().getIDTerminalRuleCall_1_2()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
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
    public static final BitSet FOLLOW_rulePin_in_ruleProgram165 = new BitSet(new long[]{0x0FFFFFFEFF7FE050L});
    public static final BitSet FOLLOW_ruleControl_in_ruleProgram187 = new BitSet(new long[]{0x0FFFFFFEFF7E0050L});
    public static final BitSet FOLLOW_ruleSpinElement_in_ruleProgram209 = new BitSet(new long[]{0x0FFFFFFEFF7E0052L});
    public static final BitSet FOLLOW_rulePin_in_entryRulePin246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePin256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputPin_in_rulePin303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputPin_in_rulePin330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputPin_in_entryRuleInputPin365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputPin375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAudioInput_in_ruleInputPin422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlInput_in_ruleInputPin449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputPin_in_entryRuleOutputPin484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputPin494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAudioOutput_in_ruleOutputPin541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlOutput_in_ruleOutputPin568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAudioInput_in_entryRuleAudioInput603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAudioInput613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleAudioInput650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAudioInput667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAudioInput689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAudioOutput_in_entryRuleAudioOutput730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAudioOutput740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAudioOutput777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAudioOutput794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAudioOutput816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlInput_in_entryRuleControlInput857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControlInput867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleControlInput904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleControlInput921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleControlInput943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlOutput_in_entryRuleControlOutput984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControlOutput994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleControlOutput1031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleControlOutput1048 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleControlOutput1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControl_in_entryRuleControl1111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControl1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSlider_in_ruleControl1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_ruleControl1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecontrolLabel_in_ruleControl1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSlider_in_entryRuleSlider1257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSlider1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSlider1304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSlider1321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSlider1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_entryRuleCheckBox1384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckBox1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleCheckBox1431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckBox1448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckBox1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecontrolLabel_in_entryRulecontrolLabel1511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecontrolLabel1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulecontrolLabel1558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulecontrolLabel1575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulecontrolLabel1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpinElement_in_entryRuleSpinElement1638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpinElement1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquate_in_ruleSpinElement1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMem_in_ruleSpinElement1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleSpinElement1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleSpinElement1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleSpinElement1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMacro_in_ruleSpinElement1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOffset_in_ruleSpinElement1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquate_in_entryRuleEquate1892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquate1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEquate1939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEquate1956 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleEquate1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMem_in_entryRuleMem2018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMem2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleMem2065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMem2082 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleMem2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOffset_in_entryRuleOffset2144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOffset2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOffset2191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOffset2208 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleOffset2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment2271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SC_COMMENT_in_ruleComment2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel2362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel2414 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleLabel2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMacro_in_entryRuleMacro2467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMacro2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsPinConnected_in_ruleMacro2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsElse_in_ruleMacro2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsEndif_in_ruleMacro2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetInputDefault_in_ruleMacro2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDelayScaleControl_in_ruleMacro2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetOutputPin_in_ruleMacro2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetBaseAddress_in_ruleMacro2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsPinConnected_in_entryRuleIsPinConnected2721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsPinConnected2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleIsPinConnected2768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIsPinConnected2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsElse_in_entryRuleIsElse2826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsElse2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleIsElse2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsEndif_in_entryRuleIsEndif2918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsEndif2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleIsEndif2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetInputDefault_in_entryRuleGetInputDefault3010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetInputDefault3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleGetInputDefault3057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetInputDefault3074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetInputDefault3096 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleGetInputDefault3122 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleGetInputDefault3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDelayScaleControl_in_entryRuleGetDelayScaleControl3179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetDelayScaleControl3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleGetDelayScaleControl3226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3265 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetDelayScaleControl3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetBaseAddress_in_entryRuleGetBaseAddress3329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetBaseAddress3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleGetBaseAddress3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetOutputPin_in_entryRuleSetOutputPin3421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetOutputPin3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSetOutputPin3468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetOutputPin3485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetOutputPin3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction3548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B15_S1_9_in_ruleInstruction3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B6_S1_14_in_ruleInstruction3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_S1_14_S1_10_in_ruleInstruction3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B6_in_ruleInstruction3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B24_in_ruleInstruction3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_ruleInstruction3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJam_in_ruleInstruction3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_X0_in_ruleInstruction3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadSinLFO_in_ruleInstruction3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadRampLFO_in_ruleInstruction3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusReadDelay_in_ruleInstruction3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusReadValue_in_ruleInstruction3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusScaleOffset_in_ruleInstruction3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLog_in_ruleInstruction3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadDelayPointer_in_ruleInstruction3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B6_S1_14_in_entryRuleInst_B6_S1_144018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_B6_S1_144028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadRegister_in_ruleInst_B6_S1_144075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegister_in_ruleInst_B6_S1_144102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadRegisterFilter_in_ruleInst_B6_S1_144129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxx_in_ruleInst_B6_S1_144156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegisterHighshelf_in_ruleInst_B6_S1_144183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegisterLowshelf_in_ruleInst_B6_S1_144210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B15_S1_9_in_entryRuleInst_B15_S1_94245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_B15_S1_94255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadDelay_in_ruleInst_B15_S1_94302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteDelay_in_ruleInst_B15_S1_94329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteAllpass_in_ruleInst_B15_S1_94356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B6_in_entryRuleInst_B64391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_B64401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulx_in_ruleInst_B64448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLdax_in_ruleInst_B64475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_B24_in_entryRuleInst_B244510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_B244520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleInst_B244567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleInst_B244594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_ruleInst_B244621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_X0_in_entryRuleInst_X04656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_X04666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClr_in_ruleInst_X04713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_ruleInst_X04740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsa_in_ruleInst_X04767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInst_S1_14_S1_10_in_entryRuleInst_S1_14_S1_104802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInst_S1_14_S1_104812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp_in_ruleInst_S1_14_S1_104859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleOffset_in_ruleInst_S1_14_S1_104886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadRegister_in_entryRuleReadRegister4921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadRegister4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleReadRegister4968 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleReadRegister4989 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleReadRegister5001 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleReadRegister5022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegisterLowshelf_in_entryRuleWriteRegisterLowshelf5058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWriteRegisterLowshelf5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleWriteRegisterLowshelf5105 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleWriteRegisterLowshelf5126 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleWriteRegisterLowshelf5138 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegisterLowshelf5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegisterHighshelf_in_entryRuleWriteRegisterHighshelf5195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWriteRegisterHighshelf5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleWriteRegisterHighshelf5242 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleWriteRegisterHighshelf5263 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleWriteRegisterHighshelf5275 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegisterHighshelf5296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteRegister_in_entryRuleWriteRegister5332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWriteRegister5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleWriteRegister5379 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleWriteRegister5400 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleWriteRegister5412 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleWriteRegister5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxx_in_entryRuleMaxx5469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxx5479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleMaxx5516 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleMaxx5537 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleMaxx5549 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleMaxx5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadRegisterFilter_in_entryRuleReadRegisterFilter5606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadRegisterFilter5616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleReadRegisterFilter5653 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleReadRegisterFilter5674 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleReadRegisterFilter5686 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleReadRegisterFilter5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulx_in_entryRuleMulx5743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulx5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleMulx5790 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMulx5807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLdax_in_entryRuleLdax5848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLdax5858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleLdax5895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLdax5912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp_in_entryRuleExp5953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleExp6000 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleExp6021 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleExp6033 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleExp6054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLog_in_entryRuleLog6090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLog6100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleLog6137 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleLog6158 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleLog6170 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleLog6191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleOffset_in_entryRuleScaleOffset6227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleOffset6237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleScaleOffset6274 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleScaleOffset6295 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleScaleOffset6307 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleScaleOffset6328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteDelay_in_entryRuleWriteDelay6364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWriteDelay6374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleWriteDelay6411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSPINMEM_in_ruleWriteDelay6432 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleWriteDelay6444 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleWriteDelay6465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWriteAllpass_in_entryRuleWriteAllpass6501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWriteAllpass6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleWriteAllpass6548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSPINMEM_in_ruleWriteAllpass6569 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleWriteAllpass6581 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleWriteAllpass6602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadDelay_in_entryRuleReadDelay6638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadDelay6648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleReadDelay6685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSPINMEM_in_ruleReadDelay6706 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleReadDelay6718 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleReadDelay6739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadSinLFO_in_entryRuleLoadSinLFO6775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoadSinLFO6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleLoadSinLFO6822 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleLoadSinLFO6843 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleLoadSinLFO6855 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoadSinLFO6872 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleLoadSinLFO6889 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoadSinLFO6906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadRampLFO_in_entryRuleLoadRampLFO6947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoadRampLFO6957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleLoadRampLFO6994 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleLoadRampLFO7015 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleLoadRampLFO7027 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoadRampLFO7044 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleLoadRampLFO7061 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoadRampLFO7078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusReadDelay_in_entryRuleChorusReadDelay7119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChorusReadDelay7129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleChorusReadDelay7166 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleChorusReadDelay7178 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleChorusReadDelay7199 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleChorusReadDelay7211 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_ruleSPINCHOREGFLAGS_in_ruleChorusReadDelay7232 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleChorusReadDelay7244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSPINMEM_in_ruleChorusReadDelay7265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusReadValue_in_entryRuleChorusReadValue7301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChorusReadValue7311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleChorusReadValue7348 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleChorusReadValue7360 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_ruleChorusReadValue7381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChorusScaleOffset_in_entryRuleChorusScaleOffset7417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChorusScaleOffset7427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleChorusScaleOffset7464 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleChorusScaleOffset7476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChorusScaleOffset7493 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleChorusScaleOffset7510 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_ruleSPINCHOREGFLAGS_in_ruleChorusScaleOffset7531 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleChorusScaleOffset7543 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleChorusScaleOffset7564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadDelayPointer_in_entryRuleReadDelayPointer7600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadDelayPointer7610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleReadDelayPointer7647 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_ruleReadDelayPointer7668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd7704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd7714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAnd7751 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleBINARY24_in_ruleAnd7772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr7808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr7818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleOr7855 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleBINARY24_in_ruleOr7876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_entryRuleXor7912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXor7922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXor7959 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleBINARY24_in_ruleXor7980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJam_in_entryRuleJam8016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJam8026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleJam8063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJam8080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClr_in_entryRuleClr8121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClr8131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleClr8177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_entryRuleNot8213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNot8223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleNot8269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsa_in_entryRuleAbsa8305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsa8315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleAbsa8361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_entryRuleSkip8397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkip8407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleSkip8444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSkip8461 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSkip8478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSkip8498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPINDOUBLE_in_entryRuleSPINDOUBLE8535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPINDOUBLE8546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleSPINDOUBLE8585 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINDOUBLE8603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSPINDOUBLE8630 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleSPINDOUBLE8649 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSPINDOUBLE8664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPINREGISTER_in_entryRuleSPINREGISTER8714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPINREGISTER8725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINREGISTER8765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSPINREGISTER8791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPINCHOREGFLAGS_in_entryRuleSPINCHOREGFLAGS8837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPINCHOREGFLAGS8848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSPINCHOREGFLAGS8888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINCHOREGFLAGS8915 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleSPINCHOREGFLAGS8934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINCHOREGFLAGS8949 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleSPINMEM_in_entryRuleSPINMEM8998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPINMEM9008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPINBUF_in_ruleSPINMEM9054 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSPINMEM9072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINMEM9103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPINBUF_in_entryRuleSPINBUF9142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPINBUF9153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPINBUF9193 = new BitSet(new long[]{0x9000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_63_in_ruleSPINBUF9212 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleSPINBUF9231 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSPINBUF9247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleSPINBUF9266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARY24_in_entryRuleBINARY249309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBINARY249320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleBINARY249360 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBINARY249375 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBINARY249397 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_67_in_ruleBINARY249425 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBINARY249441 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBINARY249464 = new BitSet(new long[]{0x0000000000000012L});

}