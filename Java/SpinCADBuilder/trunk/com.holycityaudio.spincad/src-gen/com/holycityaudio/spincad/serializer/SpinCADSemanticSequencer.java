package com.holycityaudio.spincad.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.holycityaudio.spincad.services.SpinCADGrammarAccess;
import com.holycityaudio.spincad.spinCAD.Absa;
import com.holycityaudio.spincad.spinCAD.And;
import com.holycityaudio.spincad.spinCAD.AudioInput;
import com.holycityaudio.spincad.spinCAD.AudioOutput;
import com.holycityaudio.spincad.spinCAD.CheckBox;
import com.holycityaudio.spincad.spinCAD.ChorusReadDelay;
import com.holycityaudio.spincad.spinCAD.ChorusReadValue;
import com.holycityaudio.spincad.spinCAD.ChorusScaleOffset;
import com.holycityaudio.spincad.spinCAD.Clr;
import com.holycityaudio.spincad.spinCAD.Comment;
import com.holycityaudio.spincad.spinCAD.ControlInput;
import com.holycityaudio.spincad.spinCAD.ControlOutput;
import com.holycityaudio.spincad.spinCAD.Equate;
import com.holycityaudio.spincad.spinCAD.Exp;
import com.holycityaudio.spincad.spinCAD.GetDelayScale;
import com.holycityaudio.spincad.spinCAD.GetInputDefault;
import com.holycityaudio.spincad.spinCAD.IsElse;
import com.holycityaudio.spincad.spinCAD.IsEndif;
import com.holycityaudio.spincad.spinCAD.IsPinConnected;
import com.holycityaudio.spincad.spinCAD.Jam;
import com.holycityaudio.spincad.spinCAD.Label;
import com.holycityaudio.spincad.spinCAD.Ldax;
import com.holycityaudio.spincad.spinCAD.LoadRampLFO;
import com.holycityaudio.spincad.spinCAD.LoadSinLFO;
import com.holycityaudio.spincad.spinCAD.Log;
import com.holycityaudio.spincad.spinCAD.Maxx;
import com.holycityaudio.spincad.spinCAD.Mem;
import com.holycityaudio.spincad.spinCAD.Mulx;
import com.holycityaudio.spincad.spinCAD.Not;
import com.holycityaudio.spincad.spinCAD.Offset;
import com.holycityaudio.spincad.spinCAD.Or;
import com.holycityaudio.spincad.spinCAD.Program;
import com.holycityaudio.spincad.spinCAD.ReadDelay;
import com.holycityaudio.spincad.spinCAD.ReadDelayPointer;
import com.holycityaudio.spincad.spinCAD.ReadRegister;
import com.holycityaudio.spincad.spinCAD.ReadRegisterFilter;
import com.holycityaudio.spincad.spinCAD.SPINMEM;
import com.holycityaudio.spincad.spinCAD.ScaleOffset;
import com.holycityaudio.spincad.spinCAD.SetOutputPin;
import com.holycityaudio.spincad.spinCAD.Skip;
import com.holycityaudio.spincad.spinCAD.Slider;
import com.holycityaudio.spincad.spinCAD.SpinCADPackage;
import com.holycityaudio.spincad.spinCAD.WriteAllpass;
import com.holycityaudio.spincad.spinCAD.WriteDelay;
import com.holycityaudio.spincad.spinCAD.WriteRegister;
import com.holycityaudio.spincad.spinCAD.WriteRegisterHighshelf;
import com.holycityaudio.spincad.spinCAD.WriteRegisterLowshelf;
import com.holycityaudio.spincad.spinCAD.Xor;
import com.holycityaudio.spincad.spinCAD.controlLabel;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SpinCADSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SpinCADGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SpinCADPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SpinCADPackage.ABSA:
				if(context == grammarAccess.getAbsaRule() ||
				   context == grammarAccess.getInst_X0Rule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_Absa(context, (Absa) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.AND:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getInst_B24Rule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_And(context, (And) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.AUDIO_INPUT:
				if(context == grammarAccess.getAudioInputRule() ||
				   context == grammarAccess.getInputPinRule() ||
				   context == grammarAccess.getPinRule()) {
					sequence_AudioInput(context, (AudioInput) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.AUDIO_OUTPUT:
				if(context == grammarAccess.getAudioOutputRule() ||
				   context == grammarAccess.getOutputPinRule() ||
				   context == grammarAccess.getPinRule()) {
					sequence_AudioOutput(context, (AudioOutput) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.CHECK_BOX:
				if(context == grammarAccess.getCheckBoxRule() ||
				   context == grammarAccess.getControlRule()) {
					sequence_CheckBox(context, (CheckBox) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.CHORUS_READ_DELAY:
				if(context == grammarAccess.getChorusReadDelayRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_ChorusReadDelay(context, (ChorusReadDelay) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.CHORUS_READ_VALUE:
				if(context == grammarAccess.getChorusReadValueRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_ChorusReadValue(context, (ChorusReadValue) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.CHORUS_SCALE_OFFSET:
				if(context == grammarAccess.getChorusScaleOffsetRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_ChorusScaleOffset(context, (ChorusScaleOffset) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.CLR:
				if(context == grammarAccess.getClrRule() ||
				   context == grammarAccess.getInst_X0Rule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_Clr(context, (Clr) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.COMMENT:
				if(context == grammarAccess.getCommentRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_Comment(context, (Comment) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.CONTROL_INPUT:
				if(context == grammarAccess.getControlInputRule() ||
				   context == grammarAccess.getInputPinRule() ||
				   context == grammarAccess.getPinRule()) {
					sequence_ControlInput(context, (ControlInput) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.CONTROL_OUTPUT:
				if(context == grammarAccess.getControlOutputRule() ||
				   context == grammarAccess.getOutputPinRule() ||
				   context == grammarAccess.getPinRule()) {
					sequence_ControlOutput(context, (ControlOutput) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.EQUATE:
				if(context == grammarAccess.getEquateRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_Equate(context, (Equate) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.EXP:
				if(context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getInst_S1_14_S1_10Rule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_Exp(context, (Exp) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.GET_DELAY_SCALE:
				if(context == grammarAccess.getGetDelayScaleRule() ||
				   context == grammarAccess.getMacroRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_GetDelayScale(context, (GetDelayScale) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.GET_INPUT_DEFAULT:
				if(context == grammarAccess.getGetInputDefaultRule() ||
				   context == grammarAccess.getMacroRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_GetInputDefault(context, (GetInputDefault) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.IS_ELSE:
				if(context == grammarAccess.getIsElseRule() ||
				   context == grammarAccess.getMacroRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_IsElse(context, (IsElse) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.IS_ENDIF:
				if(context == grammarAccess.getIsEndifRule() ||
				   context == grammarAccess.getMacroRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_IsEndif(context, (IsEndif) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.IS_PIN_CONNECTED:
				if(context == grammarAccess.getIsPinConnectedRule() ||
				   context == grammarAccess.getMacroRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_IsPinConnected(context, (IsPinConnected) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.JAM:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getJamRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_Jam(context, (Jam) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.LABEL:
				if(context == grammarAccess.getLabelRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_Label(context, (Label) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.LDAX:
				if(context == grammarAccess.getInst_B6Rule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLdaxRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_Ldax(context, (Ldax) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.LOAD_RAMP_LFO:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLoadRampLFORule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_LoadRampLFO(context, (LoadRampLFO) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.LOAD_SIN_LFO:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLoadSinLFORule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_LoadSinLFO(context, (LoadSinLFO) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.LOG:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLogRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_Log(context, (Log) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.MAXX:
				if(context == grammarAccess.getInst_B6_S1_14Rule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getMaxxRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_Maxx(context, (Maxx) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.MEM:
				if(context == grammarAccess.getMemRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_Mem(context, (Mem) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.MULX:
				if(context == grammarAccess.getInst_B6Rule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getMulxRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_Mulx(context, (Mulx) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.NOT:
				if(context == grammarAccess.getInst_X0Rule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getNotRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_Not(context, (Not) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.OFFSET:
				if(context == grammarAccess.getOffsetRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_Offset(context, (Offset) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.OR:
				if(context == grammarAccess.getInst_B24Rule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_Or(context, (Or) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.READ_DELAY:
				if(context == grammarAccess.getInst_B15_S1_9Rule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getReadDelayRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_ReadDelay(context, (ReadDelay) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.READ_DELAY_POINTER:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getReadDelayPointerRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_ReadDelayPointer(context, (ReadDelayPointer) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.READ_REGISTER:
				if(context == grammarAccess.getInst_B6_S1_14Rule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getReadRegisterRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_ReadRegister(context, (ReadRegister) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.READ_REGISTER_FILTER:
				if(context == grammarAccess.getInst_B6_S1_14Rule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getReadRegisterFilterRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_ReadRegisterFilter(context, (ReadRegisterFilter) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.SPINMEM:
				if(context == grammarAccess.getSPINMEMRule()) {
					sequence_SPINMEM(context, (SPINMEM) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.SCALE_OFFSET:
				if(context == grammarAccess.getInst_S1_14_S1_10Rule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getScaleOffsetRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_ScaleOffset(context, (ScaleOffset) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.SET_OUTPUT_PIN:
				if(context == grammarAccess.getMacroRule() ||
				   context == grammarAccess.getSetOutputPinRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_SetOutputPin(context, (SetOutputPin) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.SKIP:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getSkipRule() ||
				   context == grammarAccess.getSpinElementRule()) {
					sequence_Skip(context, (Skip) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.SLIDER:
				if(context == grammarAccess.getControlRule() ||
				   context == grammarAccess.getSliderRule()) {
					sequence_Slider(context, (Slider) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.WRITE_ALLPASS:
				if(context == grammarAccess.getInst_B15_S1_9Rule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getSpinElementRule() ||
				   context == grammarAccess.getWriteAllpassRule()) {
					sequence_WriteAllpass(context, (WriteAllpass) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.WRITE_DELAY:
				if(context == grammarAccess.getInst_B15_S1_9Rule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getSpinElementRule() ||
				   context == grammarAccess.getWriteDelayRule()) {
					sequence_WriteDelay(context, (WriteDelay) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.WRITE_REGISTER:
				if(context == grammarAccess.getInst_B6_S1_14Rule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getSpinElementRule() ||
				   context == grammarAccess.getWriteRegisterRule()) {
					sequence_WriteRegister(context, (WriteRegister) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.WRITE_REGISTER_HIGHSHELF:
				if(context == grammarAccess.getInst_B6_S1_14Rule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getSpinElementRule() ||
				   context == grammarAccess.getWriteRegisterHighshelfRule()) {
					sequence_WriteRegisterHighshelf(context, (WriteRegisterHighshelf) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.WRITE_REGISTER_LOWSHELF:
				if(context == grammarAccess.getInst_B6_S1_14Rule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getSpinElementRule() ||
				   context == grammarAccess.getWriteRegisterLowshelfRule()) {
					sequence_WriteRegisterLowshelf(context, (WriteRegisterLowshelf) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.XOR:
				if(context == grammarAccess.getInst_B24Rule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getSpinElementRule() ||
				   context == grammarAccess.getXorRule()) {
					sequence_Xor(context, (Xor) semanticObject); 
					return; 
				}
				else break;
			case SpinCADPackage.CONTROL_LABEL:
				if(context == grammarAccess.getControlRule() ||
				   context == grammarAccess.getControlLabelRule()) {
					sequence_controlLabel(context, (controlLabel) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     {Absa}
	 */
	protected void sequence_Absa(EObject context, Absa semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     arg1=BINARY24
	 */
	protected void sequence_And(EObject context, And semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B24__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B24__ARG1));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAndAccess().getArg1BINARY24ParserRuleCall_1_0(), semanticObject.getArg1());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (varName=ID name=ID)
	 */
	protected void sequence_AudioInput(EObject context, AudioInput semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.PIN__VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.PIN__VAR_NAME));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.PIN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.PIN__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAudioInputAccess().getVarNameIDTerminalRuleCall_1_0(), semanticObject.getVarName());
		feeder.accept(grammarAccess.getAudioInputAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (varName=ID name=ID)
	 */
	protected void sequence_AudioOutput(EObject context, AudioOutput semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.PIN__VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.PIN__VAR_NAME));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.PIN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.PIN__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAudioOutputAccess().getVarNameIDTerminalRuleCall_1_0(), semanticObject.getVarName());
		feeder.accept(grammarAccess.getAudioOutputAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (varName=ID label=ID)
	 */
	protected void sequence_CheckBox(EObject context, CheckBox semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.CONTROL__VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.CONTROL__VAR_NAME));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.CONTROL__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.CONTROL__LABEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCheckBoxAccess().getVarNameIDTerminalRuleCall_1_0(), semanticObject.getVarName());
		feeder.accept(grammarAccess.getCheckBoxAccess().getLabelIDTerminalRuleCall_2_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (arg1=SPINREGISTER arg2=SPINCHOREGFLAGS arg3=SPINMEM)
	 */
	protected void sequence_ChorusReadDelay(EObject context, ChorusReadDelay semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.CHORUS_READ_DELAY__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.CHORUS_READ_DELAY__ARG1));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.CHORUS_READ_DELAY__ARG2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.CHORUS_READ_DELAY__ARG2));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.CHORUS_READ_DELAY__ARG3) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.CHORUS_READ_DELAY__ARG3));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getChorusReadDelayAccess().getArg1SPINREGISTERParserRuleCall_2_0(), semanticObject.getArg1());
		feeder.accept(grammarAccess.getChorusReadDelayAccess().getArg2SPINCHOREGFLAGSParserRuleCall_4_0(), semanticObject.getArg2());
		feeder.accept(grammarAccess.getChorusReadDelayAccess().getArg3SPINMEMParserRuleCall_6_0(), semanticObject.getArg3());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     arg1=SPINREGISTER
	 */
	protected void sequence_ChorusReadValue(EObject context, ChorusReadValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.CHORUS_READ_VALUE__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.CHORUS_READ_VALUE__ARG1));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getChorusReadValueAccess().getArg1SPINREGISTERParserRuleCall_2_0(), semanticObject.getArg1());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (arg1=ID arg2=SPINCHOREGFLAGS arg3=SPINDOUBLE)
	 */
	protected void sequence_ChorusScaleOffset(EObject context, ChorusScaleOffset semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.CHORUS_SCALE_OFFSET__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.CHORUS_SCALE_OFFSET__ARG1));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.CHORUS_SCALE_OFFSET__ARG2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.CHORUS_SCALE_OFFSET__ARG2));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.CHORUS_SCALE_OFFSET__ARG3) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.CHORUS_SCALE_OFFSET__ARG3));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getChorusScaleOffsetAccess().getArg1IDTerminalRuleCall_2_0(), semanticObject.getArg1());
		feeder.accept(grammarAccess.getChorusScaleOffsetAccess().getArg2SPINCHOREGFLAGSParserRuleCall_4_0(), semanticObject.getArg2());
		feeder.accept(grammarAccess.getChorusScaleOffsetAccess().getArg3SPINDOUBLEParserRuleCall_6_0(), semanticObject.getArg3());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {Clr}
	 */
	protected void sequence_Clr(EObject context, Clr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     remark=SC_COMMENT
	 */
	protected void sequence_Comment(EObject context, Comment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.COMMENT__REMARK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.COMMENT__REMARK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCommentAccess().getRemarkSC_COMMENTTerminalRuleCall_0(), semanticObject.getRemark());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (varName=ID name=ID)
	 */
	protected void sequence_ControlInput(EObject context, ControlInput semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.PIN__VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.PIN__VAR_NAME));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.PIN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.PIN__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getControlInputAccess().getVarNameIDTerminalRuleCall_1_0(), semanticObject.getVarName());
		feeder.accept(grammarAccess.getControlInputAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (varName=ID name=ID)
	 */
	protected void sequence_ControlOutput(EObject context, ControlOutput semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.PIN__VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.PIN__VAR_NAME));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.PIN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.PIN__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getControlOutputAccess().getVarNameIDTerminalRuleCall_1_0(), semanticObject.getVarName());
		feeder.accept(grammarAccess.getControlOutputAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ename=ID value=SPINDOUBLE)
	 */
	protected void sequence_Equate(EObject context, Equate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.EQUATE__ENAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.EQUATE__ENAME));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.EQUATE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.EQUATE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEquateAccess().getEnameIDTerminalRuleCall_1_0(), semanticObject.getEname());
		feeder.accept(grammarAccess.getEquateAccess().getValueSPINDOUBLEParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (arg1=SPINDOUBLE arg2=SPINDOUBLE)
	 */
	protected void sequence_Exp(EObject context, Exp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_S1_14_S1_10__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_S1_14_S1_10__ARG1));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_S1_14_S1_10__ARG2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_S1_14_S1_10__ARG2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpAccess().getArg1SPINDOUBLEParserRuleCall_1_0(), semanticObject.getArg1());
		feeder.accept(grammarAccess.getExpAccess().getArg2SPINDOUBLEParserRuleCall_3_0(), semanticObject.getArg2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (buffer=ID length=ID control=ID)
	 */
	protected void sequence_GetDelayScale(EObject context, GetDelayScale semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.GET_DELAY_SCALE__BUFFER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.GET_DELAY_SCALE__BUFFER));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.GET_DELAY_SCALE__LENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.GET_DELAY_SCALE__LENGTH));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.GET_DELAY_SCALE__CONTROL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.GET_DELAY_SCALE__CONTROL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGetDelayScaleAccess().getBufferIDTerminalRuleCall_1_0(), semanticObject.getBuffer());
		feeder.accept(grammarAccess.getGetDelayScaleAccess().getLengthIDTerminalRuleCall_2_0(), semanticObject.getLength());
		feeder.accept(grammarAccess.getGetDelayScaleAccess().getControlIDTerminalRuleCall_3_0(), semanticObject.getControl());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID variable=ID scale=SPINDOUBLE defaultVal=SPINDOUBLE)
	 */
	protected void sequence_GetInputDefault(EObject context, GetInputDefault semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.GET_INPUT_DEFAULT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.GET_INPUT_DEFAULT__NAME));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.GET_INPUT_DEFAULT__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.GET_INPUT_DEFAULT__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.GET_INPUT_DEFAULT__SCALE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.GET_INPUT_DEFAULT__SCALE));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.GET_INPUT_DEFAULT__DEFAULT_VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.GET_INPUT_DEFAULT__DEFAULT_VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGetInputDefaultAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGetInputDefaultAccess().getVariableIDTerminalRuleCall_2_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getGetInputDefaultAccess().getScaleSPINDOUBLEParserRuleCall_3_0(), semanticObject.getScale());
		feeder.accept(grammarAccess.getGetInputDefaultAccess().getDefaultValSPINDOUBLEParserRuleCall_4_0(), semanticObject.getDefaultVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {IsElse}
	 */
	protected void sequence_IsElse(EObject context, IsElse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {IsEndif}
	 */
	protected void sequence_IsEndif(EObject context, IsEndif semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     arg1=ID
	 */
	protected void sequence_IsPinConnected(EObject context, IsPinConnected semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.IS_PIN_CONNECTED__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.IS_PIN_CONNECTED__ARG1));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIsPinConnectedAccess().getArg1IDTerminalRuleCall_1_0(), semanticObject.getArg1());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     arg1=ID
	 */
	protected void sequence_Jam(EObject context, Jam semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.JAM__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.JAM__ARG1));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJamAccess().getArg1IDTerminalRuleCall_1_0(), semanticObject.getArg1());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Label(EObject context, Label semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.LABEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.LABEL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     arg1=ID
	 */
	protected void sequence_Ldax(EObject context, Ldax semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B6__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B6__ARG1));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLdaxAccess().getArg1IDTerminalRuleCall_1_0(), semanticObject.getArg1());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (arg1=SPINREGISTER arg2=INT arg3=INT)
	 */
	protected void sequence_LoadRampLFO(EObject context, LoadRampLFO semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.LOAD_RAMP_LFO__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.LOAD_RAMP_LFO__ARG1));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.LOAD_RAMP_LFO__ARG2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.LOAD_RAMP_LFO__ARG2));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.LOAD_RAMP_LFO__ARG3) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.LOAD_RAMP_LFO__ARG3));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLoadRampLFOAccess().getArg1SPINREGISTERParserRuleCall_1_0(), semanticObject.getArg1());
		feeder.accept(grammarAccess.getLoadRampLFOAccess().getArg2INTTerminalRuleCall_3_0(), semanticObject.getArg2());
		feeder.accept(grammarAccess.getLoadRampLFOAccess().getArg3INTTerminalRuleCall_5_0(), semanticObject.getArg3());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (arg1=SPINREGISTER arg2=INT arg3=INT)
	 */
	protected void sequence_LoadSinLFO(EObject context, LoadSinLFO semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.LOAD_SIN_LFO__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.LOAD_SIN_LFO__ARG1));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.LOAD_SIN_LFO__ARG2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.LOAD_SIN_LFO__ARG2));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.LOAD_SIN_LFO__ARG3) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.LOAD_SIN_LFO__ARG3));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLoadSinLFOAccess().getArg1SPINREGISTERParserRuleCall_1_0(), semanticObject.getArg1());
		feeder.accept(grammarAccess.getLoadSinLFOAccess().getArg2INTTerminalRuleCall_3_0(), semanticObject.getArg2());
		feeder.accept(grammarAccess.getLoadSinLFOAccess().getArg3INTTerminalRuleCall_5_0(), semanticObject.getArg3());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (arg1=SPINDOUBLE arg2=SPINDOUBLE)
	 */
	protected void sequence_Log(EObject context, Log semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.LOG__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.LOG__ARG1));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.LOG__ARG2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.LOG__ARG2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLogAccess().getArg1SPINDOUBLEParserRuleCall_1_0(), semanticObject.getArg1());
		feeder.accept(grammarAccess.getLogAccess().getArg2SPINDOUBLEParserRuleCall_3_0(), semanticObject.getArg2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (arg1=SPINREGISTER arg2=SPINDOUBLE)
	 */
	protected void sequence_Maxx(EObject context, Maxx semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG1));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMaxxAccess().getArg1SPINREGISTERParserRuleCall_1_0(), semanticObject.getArg1());
		feeder.accept(grammarAccess.getMaxxAccess().getArg2SPINDOUBLEParserRuleCall_3_0(), semanticObject.getArg2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (buffer=ID length=SPINREGISTER)
	 */
	protected void sequence_Mem(EObject context, Mem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.MEM__BUFFER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.MEM__BUFFER));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.MEM__LENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.MEM__LENGTH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMemAccess().getBufferIDTerminalRuleCall_1_0(), semanticObject.getBuffer());
		feeder.accept(grammarAccess.getMemAccess().getLengthSPINREGISTERParserRuleCall_2_0(), semanticObject.getLength());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     arg1=ID
	 */
	protected void sequence_Mulx(EObject context, Mulx semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B6__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B6__ARG1));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMulxAccess().getArg1IDTerminalRuleCall_1_0(), semanticObject.getArg1());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {Not}
	 */
	protected void sequence_Not(EObject context, Not semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID length=INT)
	 */
	protected void sequence_Offset(EObject context, Offset semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.OFFSET__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.OFFSET__NAME));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.OFFSET__LENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.OFFSET__LENGTH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOffsetAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getOffsetAccess().getLengthINTTerminalRuleCall_2_0(), semanticObject.getLength());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     arg1=BINARY24
	 */
	protected void sequence_Or(EObject context, Or semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B24__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B24__ARG1));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrAccess().getArg1BINARY24ParserRuleCall_1_0(), semanticObject.getArg1());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID pins+=Pin+ controls+=Control* elements+=SpinElement+)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     arg1=SPINDOUBLE
	 */
	protected void sequence_ReadDelayPointer(EObject context, ReadDelayPointer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.READ_DELAY_POINTER__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.READ_DELAY_POINTER__ARG1));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReadDelayPointerAccess().getArg1SPINDOUBLEParserRuleCall_1_0(), semanticObject.getArg1());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (arg1=SPINMEM arg2=SPINDOUBLE)
	 */
	protected void sequence_ReadDelay(EObject context, ReadDelay semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B15_S1_9__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B15_S1_9__ARG1));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B15_S1_9__ARG2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B15_S1_9__ARG2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReadDelayAccess().getArg1SPINMEMParserRuleCall_1_0(), semanticObject.getArg1());
		feeder.accept(grammarAccess.getReadDelayAccess().getArg2SPINDOUBLEParserRuleCall_3_0(), semanticObject.getArg2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (arg1=SPINREGISTER arg2=SPINDOUBLE)
	 */
	protected void sequence_ReadRegisterFilter(EObject context, ReadRegisterFilter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG1));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReadRegisterFilterAccess().getArg1SPINREGISTERParserRuleCall_1_0(), semanticObject.getArg1());
		feeder.accept(grammarAccess.getReadRegisterFilterAccess().getArg2SPINDOUBLEParserRuleCall_3_0(), semanticObject.getArg2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (arg1=SPINREGISTER arg2=SPINDOUBLE)
	 */
	protected void sequence_ReadRegister(EObject context, ReadRegister semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG1));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReadRegisterAccess().getArg1SPINREGISTERParserRuleCall_1_0(), semanticObject.getArg1());
		feeder.accept(grammarAccess.getReadRegisterAccess().getArg2SPINDOUBLEParserRuleCall_3_0(), semanticObject.getArg2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (buffer=SPINBUF (value=INT | offset=[Offset|ID])?)
	 */
	protected void sequence_SPINMEM(EObject context, SPINMEM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg1=SPINDOUBLE arg2=SPINDOUBLE)
	 */
	protected void sequence_ScaleOffset(EObject context, ScaleOffset semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_S1_14_S1_10__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_S1_14_S1_10__ARG1));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_S1_14_S1_10__ARG2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_S1_14_S1_10__ARG2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScaleOffsetAccess().getArg1SPINDOUBLEParserRuleCall_1_0(), semanticObject.getArg1());
		feeder.accept(grammarAccess.getScaleOffsetAccess().getArg2SPINDOUBLEParserRuleCall_3_0(), semanticObject.getArg2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (pinName=ID varName=ID)
	 */
	protected void sequence_SetOutputPin(EObject context, SetOutputPin semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.SET_OUTPUT_PIN__PIN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.SET_OUTPUT_PIN__PIN_NAME));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.SET_OUTPUT_PIN__VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.SET_OUTPUT_PIN__VAR_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSetOutputPinAccess().getPinNameIDTerminalRuleCall_1_0(), semanticObject.getPinName());
		feeder.accept(grammarAccess.getSetOutputPinAccess().getVarNameIDTerminalRuleCall_2_0(), semanticObject.getVarName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (flags=ID label=[Label|ID])
	 */
	protected void sequence_Skip(EObject context, Skip semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.SKIP__FLAGS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.SKIP__FLAGS));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.SKIP__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.SKIP__LABEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSkipAccess().getFlagsIDTerminalRuleCall_1_0(), semanticObject.getFlags());
		feeder.accept(grammarAccess.getSkipAccess().getLabelLabelIDTerminalRuleCall_3_0_1(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (varName=ID label=ID)
	 */
	protected void sequence_Slider(EObject context, Slider semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.CONTROL__VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.CONTROL__VAR_NAME));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.CONTROL__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.CONTROL__LABEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSliderAccess().getVarNameIDTerminalRuleCall_1_0(), semanticObject.getVarName());
		feeder.accept(grammarAccess.getSliderAccess().getLabelIDTerminalRuleCall_2_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (arg1=SPINMEM arg2=SPINDOUBLE)
	 */
	protected void sequence_WriteAllpass(EObject context, WriteAllpass semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B15_S1_9__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B15_S1_9__ARG1));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B15_S1_9__ARG2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B15_S1_9__ARG2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWriteAllpassAccess().getArg1SPINMEMParserRuleCall_1_0(), semanticObject.getArg1());
		feeder.accept(grammarAccess.getWriteAllpassAccess().getArg2SPINDOUBLEParserRuleCall_3_0(), semanticObject.getArg2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (arg1=SPINMEM arg2=SPINDOUBLE)
	 */
	protected void sequence_WriteDelay(EObject context, WriteDelay semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B15_S1_9__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B15_S1_9__ARG1));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B15_S1_9__ARG2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B15_S1_9__ARG2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWriteDelayAccess().getArg1SPINMEMParserRuleCall_1_0(), semanticObject.getArg1());
		feeder.accept(grammarAccess.getWriteDelayAccess().getArg2SPINDOUBLEParserRuleCall_3_0(), semanticObject.getArg2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (arg1=SPINREGISTER arg2=SPINDOUBLE)
	 */
	protected void sequence_WriteRegisterHighshelf(EObject context, WriteRegisterHighshelf semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG1));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWriteRegisterHighshelfAccess().getArg1SPINREGISTERParserRuleCall_1_0(), semanticObject.getArg1());
		feeder.accept(grammarAccess.getWriteRegisterHighshelfAccess().getArg2SPINDOUBLEParserRuleCall_3_0(), semanticObject.getArg2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (arg1=SPINREGISTER arg2=SPINDOUBLE)
	 */
	protected void sequence_WriteRegisterLowshelf(EObject context, WriteRegisterLowshelf semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG1));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWriteRegisterLowshelfAccess().getArg1SPINREGISTERParserRuleCall_1_0(), semanticObject.getArg1());
		feeder.accept(grammarAccess.getWriteRegisterLowshelfAccess().getArg2SPINDOUBLEParserRuleCall_3_0(), semanticObject.getArg2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (arg1=SPINREGISTER arg2=SPINDOUBLE)
	 */
	protected void sequence_WriteRegister(EObject context, WriteRegister semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG1));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B6_S1_14__ARG2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWriteRegisterAccess().getArg1SPINREGISTERParserRuleCall_1_0(), semanticObject.getArg1());
		feeder.accept(grammarAccess.getWriteRegisterAccess().getArg2SPINDOUBLEParserRuleCall_3_0(), semanticObject.getArg2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     arg1=BINARY24
	 */
	protected void sequence_Xor(EObject context, Xor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.INST_B24__ARG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.INST_B24__ARG1));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXorAccess().getArg1BINARY24ParserRuleCall_1_0(), semanticObject.getArg1());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (varName=ID label=ID)
	 */
	protected void sequence_controlLabel(EObject context, controlLabel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.CONTROL__VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.CONTROL__VAR_NAME));
			if(transientValues.isValueTransient(semanticObject, SpinCADPackage.Literals.CONTROL__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADPackage.Literals.CONTROL__LABEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getControlLabelAccess().getVarNameIDTerminalRuleCall_1_0(), semanticObject.getVarName());
		feeder.accept(grammarAccess.getControlLabelAccess().getLabelIDTerminalRuleCall_2_0(), semanticObject.getLabel());
		feeder.finish();
	}
}
