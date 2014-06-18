package com.holycityaudio.spincad.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpinCADLexer extends Lexer {
    public static final int RULE_SC_COMMENT=6;
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
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
    public static final int T__32=32;
    public static final int RULE_STRING=7;
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

    public InternalSpinCADLexer() {;} 
    public InternalSpinCADLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSpinCADLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:11:7: ( '#' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:11:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:12:7: ( '^' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:12:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:13:7: ( '+' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:13:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:14:7: ( '-' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:14:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:15:7: ( '@name' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:15:9: '@name'
            {
            match("@name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:16:7: ( '@audioInput' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:16:9: '@audioInput'
            {
            match("@audioInput"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:17:7: ( '@audioOutput' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:17:9: '@audioOutput'
            {
            match("@audioOutput"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:18:7: ( '@controlInput' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:18:9: '@controlInput'
            {
            match("@controlInput"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:19:7: ( '@controlOutput' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:19:9: '@controlOutput'
            {
            match("@controlOutput"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:20:7: ( 'equ' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:20:9: 'equ'
            {
            match("equ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:21:7: ( 'mem' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:21:9: 'mem'
            {
            match("mem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:22:7: ( 'offset' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:22:9: 'offset'
            {
            match("offset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:23:7: ( ':' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:23:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:24:7: ( '@isPinConnected' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:24:9: '@isPinConnected'
            {
            match("@isPinConnected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:25:7: ( '@else' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:25:9: '@else'
            {
            match("@else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:26:7: ( '@endif' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:26:9: '@endif'
            {
            match("@endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:27:7: ( '@getInputDefault' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:27:9: '@getInputDefault'
            {
            match("@getInputDefault"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:28:7: ( '@getDelayScaleControl' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:28:9: '@getDelayScaleControl'
            {
            match("@getDelayScaleControl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:29:7: ( '@getBaseAddress' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:29:9: '@getBaseAddress'
            {
            match("@getBaseAddress"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:30:7: ( '@setOutputPin' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:30:9: '@setOutputPin'
            {
            match("@setOutputPin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:31:7: ( 'rdax' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:31:9: 'rdax'
            {
            match("rdax"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:32:7: ( ',' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:32:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:33:7: ( 'wrlx' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:33:9: 'wrlx'
            {
            match("wrlx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:34:7: ( 'wrhx' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:34:9: 'wrhx'
            {
            match("wrhx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:35:7: ( 'wrax' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:35:9: 'wrax'
            {
            match("wrax"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:36:7: ( 'maxx' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:36:9: 'maxx'
            {
            match("maxx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:37:7: ( 'rdfx' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:37:9: 'rdfx'
            {
            match("rdfx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:38:7: ( 'mulx' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:38:9: 'mulx'
            {
            match("mulx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:39:7: ( 'ldax' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:39:9: 'ldax'
            {
            match("ldax"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:40:7: ( 'exp' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:40:9: 'exp'
            {
            match("exp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:41:7: ( 'log' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:41:9: 'log'
            {
            match("log"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:42:7: ( 'sof' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:42:9: 'sof'
            {
            match("sof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:43:7: ( 'wra' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:43:9: 'wra'
            {
            match("wra"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:44:7: ( 'wrap' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:44:9: 'wrap'
            {
            match("wrap"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:45:7: ( 'rda' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:45:9: 'rda'
            {
            match("rda"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:46:7: ( 'wlds' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:46:9: 'wlds'
            {
            match("wlds"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:47:7: ( 'wldr' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:47:9: 'wldr'
            {
            match("wldr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:48:7: ( 'cho rda' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:48:9: 'cho rda'
            {
            match("cho rda"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:49:7: ( 'cho rdal' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:49:9: 'cho rdal'
            {
            match("cho rdal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:50:7: ( 'cho sof' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:50:9: 'cho sof'
            {
            match("cho sof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:51:7: ( 'rmpa' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:51:9: 'rmpa'
            {
            match("rmpa"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:52:7: ( 'and' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:52:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:53:7: ( 'or' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:53:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:54:7: ( 'xor' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:54:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:55:7: ( 'jam' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:55:9: 'jam'
            {
            match("jam"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:56:7: ( 'clr' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:56:9: 'clr'
            {
            match("clr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:57:7: ( 'not' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:57:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:58:7: ( 'absa' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:58:9: 'absa'
            {
            match("absa"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:59:7: ( 'skp' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:59:9: 'skp'
            {
            match("skp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:60:7: ( '.' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:60:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:61:7: ( '|' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:61:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:62:7: ( '%' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:62:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:63:7: ( '$' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:63:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "RULE_SC_COMMENT"
    public final void mRULE_SC_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SC_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9398:17: ( ';' (~ ( ( '\\n' | '\\r' ) ) )* ( '\\r' )? '\\n' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9398:19: ';' (~ ( ( '\\n' | '\\r' ) ) )* ( '\\r' )? '\\n'
            {
            match(';'); 
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9398:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9398:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop1;
                }
            } while (true);

            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9398:39: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9398:39: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SC_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9400:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9400:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9400:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9400:11: '^'
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

            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9400:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:
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
            	    break loop4;
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
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9402:10: ( ( '0' .. '9' )+ )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9402:12: ( '0' .. '9' )+
            {
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9402:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9402:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9404:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9404:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9404:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9404:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9404:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9404:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9404:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9404:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9404:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9404:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9404:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9406:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9406:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9406:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9406:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9408:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9408:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9408:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9408:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9408:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9408:41: ( '\\r' )? '\\n'
                    {
                    // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9408:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9408:41: '\\r'
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
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9410:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9410:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9410:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9412:16: ( . )
            // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:9412:18: .
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
        // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | RULE_SC_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=61;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:328: RULE_SC_COMMENT
                {
                mRULE_SC_COMMENT(); 

                }
                break;
            case 55 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:344: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 56 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:352: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 57 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:361: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 58 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:373: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 59 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:389: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 60 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:405: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 61 :
                // ../com.holycityaudio.spincad.ui/src-gen/com/holycityaudio/spincad/ui/contentassist/antlr/internal/InternalSpinCAD.g:1:413: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\2\uffff\1\41\2\uffff\1\37\3\42\1\uffff\1\42\1\uffff\10\42\4\uffff"+
        "\1\37\2\uffff\3\37\16\uffff\6\42\1\131\1\uffff\2\42\1\uffff\15\42"+
        "\17\uffff\1\157\1\160\1\161\3\42\1\uffff\1\166\4\42\1\175\2\42\1"+
        "\u0081\1\u0082\1\u0083\1\42\1\u0085\1\u0086\1\42\1\u0088\1\u0089"+
        "\1\u008a\6\uffff\1\u0090\1\u0091\1\42\1\u0093\1\uffff\1\u0094\1"+
        "\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\uffff\1\u009a\1\u009b\1"+
        "\u009c\6\uffff\1\u009f\12\uffff\1\42\17\uffff\1\u00a7\5\uffff\1"+
        "\u00ab\5\uffff";
    static final String DFA14_eofS =
        "\u00ae\uffff";
    static final String DFA14_minS =
        "\1\0\1\uffff\1\101\2\uffff\1\141\1\161\1\141\1\146\1\uffff\1\144"+
        "\1\uffff\1\154\1\144\1\153\1\150\1\142\1\157\1\141\1\157\4\uffff"+
        "\1\0\2\uffff\2\0\1\52\10\uffff\1\165\1\157\1\uffff\1\154\1\145\1"+
        "\uffff\1\165\1\160\1\155\1\170\1\154\1\146\1\60\1\uffff\1\141\1"+
        "\160\1\uffff\1\141\1\144\1\141\1\147\1\146\1\160\1\157\1\162\1\144"+
        "\1\163\1\162\1\155\1\164\12\uffff\1\144\1\156\2\uffff\1\164\3\60"+
        "\2\170\1\163\1\uffff\1\60\1\170\1\141\2\170\1\60\1\162\1\170\3\60"+
        "\1\40\2\60\1\141\3\60\1\151\1\164\1\102\3\uffff\2\60\1\145\1\60"+
        "\1\uffff\6\60\1\uffff\3\60\3\uffff\1\162\2\uffff\1\60\3\uffff\1"+
        "\157\1\162\5\uffff\1\164\12\uffff\1\144\2\uffff\1\111\1\157\1\60"+
        "\1\141\2\uffff\1\154\1\uffff\1\154\1\111\4\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\uffff\1\172\2\uffff\1\163\1\170\1\165\1\162\1\uffff\1"+
        "\155\1\uffff\1\162\2\157\1\154\1\156\1\157\1\141\1\157\4\uffff\1"+
        "\uffff\2\uffff\2\uffff\1\57\10\uffff\1\165\1\157\1\uffff\1\156\1"+
        "\145\1\uffff\1\165\1\160\1\155\1\170\1\154\1\146\1\172\1\uffff\1"+
        "\146\1\160\1\uffff\1\154\1\144\1\141\1\147\1\146\1\160\1\157\1\162"+
        "\1\144\1\163\1\162\1\155\1\164\12\uffff\1\144\1\156\2\uffff\1\164"+
        "\3\172\2\170\1\163\1\uffff\1\172\1\170\1\141\2\170\1\172\1\163\1"+
        "\170\3\172\1\40\2\172\1\141\3\172\1\151\1\164\1\111\3\uffff\2\172"+
        "\1\145\1\172\1\uffff\6\172\1\uffff\3\172\3\uffff\1\163\2\uffff\1"+
        "\172\3\uffff\1\157\1\162\5\uffff\1\164\12\uffff\1\144\2\uffff\1"+
        "\117\1\157\1\172\1\141\2\uffff\1\154\1\uffff\1\154\1\117\4\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\4\uffff\1\15\1\uffff\1\26\10\uffff"+
        "\1\62\1\63\1\64\1\65\1\uffff\1\67\1\70\3\uffff\1\74\1\75\1\1\1\2"+
        "\1\67\1\3\1\4\1\5\2\uffff\1\16\2\uffff\1\24\7\uffff\1\15\2\uffff"+
        "\1\26\15\uffff\1\62\1\63\1\64\1\65\1\66\1\70\1\71\1\72\1\73\1\74"+
        "\2\uffff\1\17\1\20\7\uffff\1\53\25\uffff\1\12\1\36\1\13\4\uffff"+
        "\1\43\6\uffff\1\41\3\uffff\1\37\1\40\1\61\1\uffff\1\56\1\52\1\uffff"+
        "\1\54\1\55\1\57\2\uffff\1\21\1\22\1\23\1\32\1\34\1\uffff\1\25\1"+
        "\33\1\51\1\27\1\30\1\31\1\42\1\44\1\45\1\35\1\uffff\1\50\1\60\4"+
        "\uffff\1\6\1\7\1\uffff\1\14\2\uffff\1\47\1\46\1\10\1\11";
    static final String DFA14_specialS =
        "\1\1\27\uffff\1\2\2\uffff\1\0\1\3\u0091\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\33\1\1\1\27\1\26\1\37"+
            "\1\34\3\37\1\3\1\13\1\4\1\24\1\35\12\32\1\11\1\30\4\37\1\5\32"+
            "\31\3\37\1\2\1\31\1\37\1\20\1\31\1\17\1\31\1\6\4\31\1\22\1\31"+
            "\1\15\1\7\1\23\1\10\2\31\1\12\1\16\3\31\1\14\1\21\2\31\1\37"+
            "\1\25\uff83\37",
            "",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\46\1\uffff\1\47\1\uffff\1\51\1\uffff\1\52\1\uffff\1\50\4"+
            "\uffff\1\45\4\uffff\1\53",
            "\1\54\6\uffff\1\55",
            "\1\57\3\uffff\1\56\17\uffff\1\60",
            "\1\61\13\uffff\1\62",
            "",
            "\1\64\10\uffff\1\65",
            "",
            "\1\70\5\uffff\1\67",
            "\1\71\12\uffff\1\72",
            "\1\74\3\uffff\1\73",
            "\1\75\3\uffff\1\76",
            "\1\100\13\uffff\1\77",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "",
            "",
            "",
            "\0\110",
            "",
            "",
            "\0\112",
            "\0\112",
            "\1\113\4\uffff\1\114",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\116",
            "\1\117",
            "",
            "\1\120\1\uffff\1\121",
            "\1\122",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\132\4\uffff\1\133",
            "\1\134",
            "",
            "\1\137\6\uffff\1\136\3\uffff\1\135",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
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
            "\1\154",
            "\1\155",
            "",
            "",
            "\1\156",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\27\42\1\165\2\42",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\17\42\1\174\7\42"+
            "\1\173\2\42",
            "\1\177\1\176",
            "\1\u0080",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0084",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0087",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u008b",
            "\1\u008c",
            "\1\u008f\1\uffff\1\u008e\4\uffff\1\u008d",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0092",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\1\u009d\1\u009e",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a2",
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
            "\1\u00a3",
            "",
            "",
            "\1\u00a4\5\uffff\1\u00a5",
            "\1\u00a6",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00a8",
            "",
            "",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "\1\u00ac\5\uffff\1\u00ad",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | RULE_SC_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_27 = input.LA(1);

                        s = -1;
                        if ( ((LA14_27>='\u0000' && LA14_27<='\uFFFF')) ) {s = 74;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='#') ) {s = 1;}

                        else if ( (LA14_0=='^') ) {s = 2;}

                        else if ( (LA14_0=='+') ) {s = 3;}

                        else if ( (LA14_0=='-') ) {s = 4;}

                        else if ( (LA14_0=='@') ) {s = 5;}

                        else if ( (LA14_0=='e') ) {s = 6;}

                        else if ( (LA14_0=='m') ) {s = 7;}

                        else if ( (LA14_0=='o') ) {s = 8;}

                        else if ( (LA14_0==':') ) {s = 9;}

                        else if ( (LA14_0=='r') ) {s = 10;}

                        else if ( (LA14_0==',') ) {s = 11;}

                        else if ( (LA14_0=='w') ) {s = 12;}

                        else if ( (LA14_0=='l') ) {s = 13;}

                        else if ( (LA14_0=='s') ) {s = 14;}

                        else if ( (LA14_0=='c') ) {s = 15;}

                        else if ( (LA14_0=='a') ) {s = 16;}

                        else if ( (LA14_0=='x') ) {s = 17;}

                        else if ( (LA14_0=='j') ) {s = 18;}

                        else if ( (LA14_0=='n') ) {s = 19;}

                        else if ( (LA14_0=='.') ) {s = 20;}

                        else if ( (LA14_0=='|') ) {s = 21;}

                        else if ( (LA14_0=='%') ) {s = 22;}

                        else if ( (LA14_0=='$') ) {s = 23;}

                        else if ( (LA14_0==';') ) {s = 24;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='b'||LA14_0=='d'||(LA14_0>='f' && LA14_0<='i')||LA14_0=='k'||(LA14_0>='p' && LA14_0<='q')||(LA14_0>='t' && LA14_0<='v')||(LA14_0>='y' && LA14_0<='z')) ) {s = 25;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 26;}

                        else if ( (LA14_0=='\"') ) {s = 27;}

                        else if ( (LA14_0=='\'') ) {s = 28;}

                        else if ( (LA14_0=='/') ) {s = 29;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 30;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||LA14_0=='&'||(LA14_0>='(' && LA14_0<='*')||(LA14_0>='<' && LA14_0<='?')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='{'||(LA14_0>='}' && LA14_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_24 = input.LA(1);

                        s = -1;
                        if ( ((LA14_24>='\u0000' && LA14_24<='\uFFFF')) ) {s = 72;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_28 = input.LA(1);

                        s = -1;
                        if ( ((LA14_28>='\u0000' && LA14_28<='\uFFFF')) ) {s = 74;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}