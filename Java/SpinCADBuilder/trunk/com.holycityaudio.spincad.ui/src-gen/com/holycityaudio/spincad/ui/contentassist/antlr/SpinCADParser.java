/*
* generated by Xtext
*/
package com.holycityaudio.spincad.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.holycityaudio.spincad.services.SpinCADGrammarAccess;

public class SpinCADParser extends AbstractContentAssistParser {
	
	@Inject
	private SpinCADGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.holycityaudio.spincad.ui.contentassist.antlr.internal.InternalSpinCADParser createParser() {
		com.holycityaudio.spincad.ui.contentassist.antlr.internal.InternalSpinCADParser result = new com.holycityaudio.spincad.ui.contentassist.antlr.internal.InternalSpinCADParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPinAccess().getAlternatives(), "rule__Pin__Alternatives");
					put(grammarAccess.getInputPinAccess().getAlternatives(), "rule__InputPin__Alternatives");
					put(grammarAccess.getOutputPinAccess().getAlternatives(), "rule__OutputPin__Alternatives");
					put(grammarAccess.getSpinElementAccess().getAlternatives(), "rule__SpinElement__Alternatives");
					put(grammarAccess.getMacroAccess().getAlternatives(), "rule__Macro__Alternatives");
					put(grammarAccess.getInstructionAccess().getAlternatives(), "rule__Instruction__Alternatives");
					put(grammarAccess.getInst_B6_S1_14Access().getAlternatives(), "rule__Inst_B6_S1_14__Alternatives");
					put(grammarAccess.getInst_B15_S1_9Access().getAlternatives(), "rule__Inst_B15_S1_9__Alternatives");
					put(grammarAccess.getInst_B6Access().getAlternatives(), "rule__Inst_B6__Alternatives");
					put(grammarAccess.getInst_B24Access().getAlternatives(), "rule__Inst_B24__Alternatives");
					put(grammarAccess.getInst_X0Access().getAlternatives(), "rule__Inst_X0__Alternatives");
					put(grammarAccess.getInst_S1_14_S1_10Access().getAlternatives(), "rule__Inst_S1_14_S1_10__Alternatives");
					put(grammarAccess.getSPINDOUBLEAccess().getAlternatives_1(), "rule__SPINDOUBLE__Alternatives_1");
					put(grammarAccess.getSPINREGISTERAccess().getAlternatives(), "rule__SPINREGISTER__Alternatives");
					put(grammarAccess.getSPINCHOREGFLAGSAccess().getAlternatives(), "rule__SPINCHOREGFLAGS__Alternatives");
					put(grammarAccess.getSPINMEMAccess().getAlternatives_1(), "rule__SPINMEM__Alternatives_1");
					put(grammarAccess.getSPINBUFAccess().getAlternatives_1(), "rule__SPINBUF__Alternatives_1");
					put(grammarAccess.getSPINBUFAccess().getAlternatives_2(), "rule__SPINBUF__Alternatives_2");
					put(grammarAccess.getBINARY24Access().getAlternatives(), "rule__BINARY24__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getAudioInputAccess().getGroup(), "rule__AudioInput__Group__0");
					put(grammarAccess.getAudioOutputAccess().getGroup(), "rule__AudioOutput__Group__0");
					put(grammarAccess.getControlInputAccess().getGroup(), "rule__ControlInput__Group__0");
					put(grammarAccess.getControlOutputAccess().getGroup(), "rule__ControlOutput__Group__0");
					put(grammarAccess.getEquateAccess().getGroup(), "rule__Equate__Group__0");
					put(grammarAccess.getEquateAccess().getGroup_3(), "rule__Equate__Group_3__0");
					put(grammarAccess.getMemAccess().getGroup(), "rule__Mem__Group__0");
					put(grammarAccess.getOffsetAccess().getGroup(), "rule__Offset__Group__0");
					put(grammarAccess.getLabelAccess().getGroup(), "rule__Label__Group__0");
					put(grammarAccess.getIsPinConnectedAccess().getGroup(), "rule__IsPinConnected__Group__0");
					put(grammarAccess.getIsElseAccess().getGroup(), "rule__IsElse__Group__0");
					put(grammarAccess.getIsEndifAccess().getGroup(), "rule__IsEndif__Group__0");
					put(grammarAccess.getGetInputDefaultAccess().getGroup(), "rule__GetInputDefault__Group__0");
					put(grammarAccess.getGetDelayScaleControlAccess().getGroup(), "rule__GetDelayScaleControl__Group__0");
					put(grammarAccess.getGetBaseAddressAccess().getGroup(), "rule__GetBaseAddress__Group__0");
					put(grammarAccess.getSetOutputPinAccess().getGroup(), "rule__SetOutputPin__Group__0");
					put(grammarAccess.getReadRegisterAccess().getGroup(), "rule__ReadRegister__Group__0");
					put(grammarAccess.getWriteRegisterLowshelfAccess().getGroup(), "rule__WriteRegisterLowshelf__Group__0");
					put(grammarAccess.getWriteRegisterHighshelfAccess().getGroup(), "rule__WriteRegisterHighshelf__Group__0");
					put(grammarAccess.getWriteRegisterAccess().getGroup(), "rule__WriteRegister__Group__0");
					put(grammarAccess.getMaxxAccess().getGroup(), "rule__Maxx__Group__0");
					put(grammarAccess.getReadRegisterFilterAccess().getGroup(), "rule__ReadRegisterFilter__Group__0");
					put(grammarAccess.getMulxAccess().getGroup(), "rule__Mulx__Group__0");
					put(grammarAccess.getLdaxAccess().getGroup(), "rule__Ldax__Group__0");
					put(grammarAccess.getExpAccess().getGroup(), "rule__Exp__Group__0");
					put(grammarAccess.getLogAccess().getGroup(), "rule__Log__Group__0");
					put(grammarAccess.getScaleOffsetAccess().getGroup(), "rule__ScaleOffset__Group__0");
					put(grammarAccess.getWriteDelayAccess().getGroup(), "rule__WriteDelay__Group__0");
					put(grammarAccess.getWriteAllpassAccess().getGroup(), "rule__WriteAllpass__Group__0");
					put(grammarAccess.getReadDelayAccess().getGroup(), "rule__ReadDelay__Group__0");
					put(grammarAccess.getLoadSinLFOAccess().getGroup(), "rule__LoadSinLFO__Group__0");
					put(grammarAccess.getLoadRampLFOAccess().getGroup(), "rule__LoadRampLFO__Group__0");
					put(grammarAccess.getChorusReadDelayAccess().getGroup(), "rule__ChorusReadDelay__Group__0");
					put(grammarAccess.getChorusReadValueAccess().getGroup(), "rule__ChorusReadValue__Group__0");
					put(grammarAccess.getChorusScaleOffsetAccess().getGroup(), "rule__ChorusScaleOffset__Group__0");
					put(grammarAccess.getReadDelayPointerAccess().getGroup(), "rule__ReadDelayPointer__Group__0");
					put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
					put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
					put(grammarAccess.getXorAccess().getGroup(), "rule__Xor__Group__0");
					put(grammarAccess.getJamAccess().getGroup(), "rule__Jam__Group__0");
					put(grammarAccess.getClrAccess().getGroup(), "rule__Clr__Group__0");
					put(grammarAccess.getNotAccess().getGroup(), "rule__Not__Group__0");
					put(grammarAccess.getAbsaAccess().getGroup(), "rule__Absa__Group__0");
					put(grammarAccess.getSkipAccess().getGroup(), "rule__Skip__Group__0");
					put(grammarAccess.getSPINDOUBLEAccess().getGroup(), "rule__SPINDOUBLE__Group__0");
					put(grammarAccess.getSPINDOUBLEAccess().getGroup_1_1(), "rule__SPINDOUBLE__Group_1_1__0");
					put(grammarAccess.getSPINDOUBLEAccess().getGroup_1_1_1(), "rule__SPINDOUBLE__Group_1_1_1__0");
					put(grammarAccess.getSPINCHOREGFLAGSAccess().getGroup_1(), "rule__SPINCHOREGFLAGS__Group_1__0");
					put(grammarAccess.getSPINCHOREGFLAGSAccess().getGroup_1_1(), "rule__SPINCHOREGFLAGS__Group_1_1__0");
					put(grammarAccess.getSPINMEMAccess().getGroup(), "rule__SPINMEM__Group__0");
					put(grammarAccess.getSPINBUFAccess().getGroup(), "rule__SPINBUF__Group__0");
					put(grammarAccess.getBINARY24Access().getGroup_0(), "rule__BINARY24__Group_0__0");
					put(grammarAccess.getBINARY24Access().getGroup_0_0(), "rule__BINARY24__Group_0_0__0");
					put(grammarAccess.getBINARY24Access().getGroup_1(), "rule__BINARY24__Group_1__0");
					put(grammarAccess.getProgramAccess().getNameAssignment_1(), "rule__Program__NameAssignment_1");
					put(grammarAccess.getProgramAccess().getPinsAssignment_2(), "rule__Program__PinsAssignment_2");
					put(grammarAccess.getProgramAccess().getElementsAssignment_3(), "rule__Program__ElementsAssignment_3");
					put(grammarAccess.getAudioInputAccess().getVarNameAssignment_1(), "rule__AudioInput__VarNameAssignment_1");
					put(grammarAccess.getAudioInputAccess().getNameAssignment_2(), "rule__AudioInput__NameAssignment_2");
					put(grammarAccess.getAudioOutputAccess().getVarNameAssignment_1(), "rule__AudioOutput__VarNameAssignment_1");
					put(grammarAccess.getAudioOutputAccess().getNameAssignment_2(), "rule__AudioOutput__NameAssignment_2");
					put(grammarAccess.getControlInputAccess().getVarNameAssignment_1(), "rule__ControlInput__VarNameAssignment_1");
					put(grammarAccess.getControlInputAccess().getNameAssignment_2(), "rule__ControlInput__NameAssignment_2");
					put(grammarAccess.getControlOutputAccess().getVarNameAssignment_1(), "rule__ControlOutput__VarNameAssignment_1");
					put(grammarAccess.getControlOutputAccess().getNameAssignment_2(), "rule__ControlOutput__NameAssignment_2");
					put(grammarAccess.getEquateAccess().getEnameAssignment_1(), "rule__Equate__EnameAssignment_1");
					put(grammarAccess.getEquateAccess().getValueAssignment_2(), "rule__Equate__ValueAssignment_2");
					put(grammarAccess.getEquateAccess().getControlTypeAssignment_3_0(), "rule__Equate__ControlTypeAssignment_3_0");
					put(grammarAccess.getEquateAccess().getControlNameAssignment_3_1(), "rule__Equate__ControlNameAssignment_3_1");
					put(grammarAccess.getEquateAccess().getMinValAssignment_3_2(), "rule__Equate__MinValAssignment_3_2");
					put(grammarAccess.getEquateAccess().getMaxValAssignment_3_3(), "rule__Equate__MaxValAssignment_3_3");
					put(grammarAccess.getEquateAccess().getMultiplierAssignment_3_4(), "rule__Equate__MultiplierAssignment_3_4");
					put(grammarAccess.getEquateAccess().getPrecisionAssignment_3_5(), "rule__Equate__PrecisionAssignment_3_5");
					put(grammarAccess.getMemAccess().getBufferAssignment_1(), "rule__Mem__BufferAssignment_1");
					put(grammarAccess.getMemAccess().getLengthAssignment_2(), "rule__Mem__LengthAssignment_2");
					put(grammarAccess.getOffsetAccess().getNameAssignment_1(), "rule__Offset__NameAssignment_1");
					put(grammarAccess.getOffsetAccess().getLengthAssignment_2(), "rule__Offset__LengthAssignment_2");
					put(grammarAccess.getCommentAccess().getRemarkAssignment(), "rule__Comment__RemarkAssignment");
					put(grammarAccess.getLabelAccess().getNameAssignment_0(), "rule__Label__NameAssignment_0");
					put(grammarAccess.getIsPinConnectedAccess().getArg1Assignment_1(), "rule__IsPinConnected__Arg1Assignment_1");
					put(grammarAccess.getGetInputDefaultAccess().getNameAssignment_1(), "rule__GetInputDefault__NameAssignment_1");
					put(grammarAccess.getGetInputDefaultAccess().getVariableAssignment_2(), "rule__GetInputDefault__VariableAssignment_2");
					put(grammarAccess.getGetInputDefaultAccess().getScaleAssignment_3(), "rule__GetInputDefault__ScaleAssignment_3");
					put(grammarAccess.getGetInputDefaultAccess().getDefaultValAssignment_4(), "rule__GetInputDefault__DefaultValAssignment_4");
					put(grammarAccess.getGetDelayScaleControlAccess().getRatioAssignment_1(), "rule__GetDelayScaleControl__RatioAssignment_1");
					put(grammarAccess.getGetDelayScaleControlAccess().getLengthAssignment_2(), "rule__GetDelayScaleControl__LengthAssignment_2");
					put(grammarAccess.getGetDelayScaleControlAccess().getOffsetAssignment_3(), "rule__GetDelayScaleControl__OffsetAssignment_3");
					put(grammarAccess.getGetDelayScaleControlAccess().getControlAssignment_4(), "rule__GetDelayScaleControl__ControlAssignment_4");
					put(grammarAccess.getSetOutputPinAccess().getPinNameAssignment_1(), "rule__SetOutputPin__PinNameAssignment_1");
					put(grammarAccess.getSetOutputPinAccess().getVarNameAssignment_2(), "rule__SetOutputPin__VarNameAssignment_2");
					put(grammarAccess.getReadRegisterAccess().getArg1Assignment_1(), "rule__ReadRegister__Arg1Assignment_1");
					put(grammarAccess.getReadRegisterAccess().getArg2Assignment_3(), "rule__ReadRegister__Arg2Assignment_3");
					put(grammarAccess.getWriteRegisterLowshelfAccess().getArg1Assignment_1(), "rule__WriteRegisterLowshelf__Arg1Assignment_1");
					put(grammarAccess.getWriteRegisterLowshelfAccess().getArg2Assignment_3(), "rule__WriteRegisterLowshelf__Arg2Assignment_3");
					put(grammarAccess.getWriteRegisterHighshelfAccess().getArg1Assignment_1(), "rule__WriteRegisterHighshelf__Arg1Assignment_1");
					put(grammarAccess.getWriteRegisterHighshelfAccess().getArg2Assignment_3(), "rule__WriteRegisterHighshelf__Arg2Assignment_3");
					put(grammarAccess.getWriteRegisterAccess().getArg1Assignment_1(), "rule__WriteRegister__Arg1Assignment_1");
					put(grammarAccess.getWriteRegisterAccess().getArg2Assignment_3(), "rule__WriteRegister__Arg2Assignment_3");
					put(grammarAccess.getMaxxAccess().getArg1Assignment_1(), "rule__Maxx__Arg1Assignment_1");
					put(grammarAccess.getMaxxAccess().getArg2Assignment_3(), "rule__Maxx__Arg2Assignment_3");
					put(grammarAccess.getReadRegisterFilterAccess().getArg1Assignment_1(), "rule__ReadRegisterFilter__Arg1Assignment_1");
					put(grammarAccess.getReadRegisterFilterAccess().getArg2Assignment_3(), "rule__ReadRegisterFilter__Arg2Assignment_3");
					put(grammarAccess.getMulxAccess().getArg1Assignment_1(), "rule__Mulx__Arg1Assignment_1");
					put(grammarAccess.getLdaxAccess().getArg1Assignment_1(), "rule__Ldax__Arg1Assignment_1");
					put(grammarAccess.getExpAccess().getArg1Assignment_1(), "rule__Exp__Arg1Assignment_1");
					put(grammarAccess.getExpAccess().getArg2Assignment_3(), "rule__Exp__Arg2Assignment_3");
					put(grammarAccess.getLogAccess().getArg1Assignment_1(), "rule__Log__Arg1Assignment_1");
					put(grammarAccess.getLogAccess().getArg2Assignment_3(), "rule__Log__Arg2Assignment_3");
					put(grammarAccess.getScaleOffsetAccess().getArg1Assignment_1(), "rule__ScaleOffset__Arg1Assignment_1");
					put(grammarAccess.getScaleOffsetAccess().getArg2Assignment_3(), "rule__ScaleOffset__Arg2Assignment_3");
					put(grammarAccess.getWriteDelayAccess().getArg1Assignment_1(), "rule__WriteDelay__Arg1Assignment_1");
					put(grammarAccess.getWriteDelayAccess().getArg2Assignment_3(), "rule__WriteDelay__Arg2Assignment_3");
					put(grammarAccess.getWriteAllpassAccess().getArg1Assignment_1(), "rule__WriteAllpass__Arg1Assignment_1");
					put(grammarAccess.getWriteAllpassAccess().getArg2Assignment_3(), "rule__WriteAllpass__Arg2Assignment_3");
					put(grammarAccess.getReadDelayAccess().getArg1Assignment_1(), "rule__ReadDelay__Arg1Assignment_1");
					put(grammarAccess.getReadDelayAccess().getArg2Assignment_3(), "rule__ReadDelay__Arg2Assignment_3");
					put(grammarAccess.getLoadSinLFOAccess().getArg1Assignment_1(), "rule__LoadSinLFO__Arg1Assignment_1");
					put(grammarAccess.getLoadSinLFOAccess().getArg2Assignment_3(), "rule__LoadSinLFO__Arg2Assignment_3");
					put(grammarAccess.getLoadSinLFOAccess().getArg3Assignment_5(), "rule__LoadSinLFO__Arg3Assignment_5");
					put(grammarAccess.getLoadRampLFOAccess().getArg1Assignment_1(), "rule__LoadRampLFO__Arg1Assignment_1");
					put(grammarAccess.getLoadRampLFOAccess().getArg2Assignment_3(), "rule__LoadRampLFO__Arg2Assignment_3");
					put(grammarAccess.getLoadRampLFOAccess().getArg3Assignment_5(), "rule__LoadRampLFO__Arg3Assignment_5");
					put(grammarAccess.getChorusReadDelayAccess().getArg1Assignment_2(), "rule__ChorusReadDelay__Arg1Assignment_2");
					put(grammarAccess.getChorusReadDelayAccess().getArg2Assignment_4(), "rule__ChorusReadDelay__Arg2Assignment_4");
					put(grammarAccess.getChorusReadDelayAccess().getArg3Assignment_6(), "rule__ChorusReadDelay__Arg3Assignment_6");
					put(grammarAccess.getChorusReadValueAccess().getArg1Assignment_2(), "rule__ChorusReadValue__Arg1Assignment_2");
					put(grammarAccess.getChorusScaleOffsetAccess().getArg1Assignment_2(), "rule__ChorusScaleOffset__Arg1Assignment_2");
					put(grammarAccess.getChorusScaleOffsetAccess().getArg2Assignment_4(), "rule__ChorusScaleOffset__Arg2Assignment_4");
					put(grammarAccess.getChorusScaleOffsetAccess().getArg3Assignment_6(), "rule__ChorusScaleOffset__Arg3Assignment_6");
					put(grammarAccess.getReadDelayPointerAccess().getArg1Assignment_1(), "rule__ReadDelayPointer__Arg1Assignment_1");
					put(grammarAccess.getAndAccess().getArg1Assignment_1(), "rule__And__Arg1Assignment_1");
					put(grammarAccess.getOrAccess().getArg1Assignment_1(), "rule__Or__Arg1Assignment_1");
					put(grammarAccess.getXorAccess().getArg1Assignment_1(), "rule__Xor__Arg1Assignment_1");
					put(grammarAccess.getJamAccess().getArg1Assignment_1(), "rule__Jam__Arg1Assignment_1");
					put(grammarAccess.getSkipAccess().getFlagsAssignment_1(), "rule__Skip__FlagsAssignment_1");
					put(grammarAccess.getSkipAccess().getLabelAssignment_3(), "rule__Skip__LabelAssignment_3");
					put(grammarAccess.getSPINMEMAccess().getBufferAssignment_0(), "rule__SPINMEM__BufferAssignment_0");
					put(grammarAccess.getSPINMEMAccess().getValueAssignment_1_0(), "rule__SPINMEM__ValueAssignment_1_0");
					put(grammarAccess.getSPINMEMAccess().getOffsetAssignment_1_1(), "rule__SPINMEM__OffsetAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.holycityaudio.spincad.ui.contentassist.antlr.internal.InternalSpinCADParser typedParser = (com.holycityaudio.spincad.ui.contentassist.antlr.internal.InternalSpinCADParser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SpinCADGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SpinCADGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
