package com.holycityaudio.spincadmenu.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.holycityaudio.spincadmenu.services.SpinCADMenuGrammarAccess;
import com.holycityaudio.spincadmenu.spinCADMenu.MENU_HEADER;
import com.holycityaudio.spincadmenu.spinCADMenu.MENU_ITEM;
import com.holycityaudio.spincadmenu.spinCADMenu.Menu;
import com.holycityaudio.spincadmenu.spinCADMenu.SpinCADMenuPackage;
import com.holycityaudio.spincadmenu.spinCADMenu.TEST_ITEM;
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
public class SpinCADMenuSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SpinCADMenuGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SpinCADMenuPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SpinCADMenuPackage.MENU_HEADER:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getMENU_HEADERRule()) {
					sequence_MENU_HEADER(context, (MENU_HEADER) semanticObject); 
					return; 
				}
				else break;
			case SpinCADMenuPackage.MENU_ITEM:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getMENU_ITEMRule()) {
					sequence_MENU_ITEM(context, (MENU_ITEM) semanticObject); 
					return; 
				}
				else break;
			case SpinCADMenuPackage.MENU:
				if(context == grammarAccess.getMenuRule()) {
					sequence_Menu(context, (Menu) semanticObject); 
					return; 
				}
				else break;
			case SpinCADMenuPackage.TEST_ITEM:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getTEST_ITEMRule()) {
					sequence_TEST_ITEM(context, (TEST_ITEM) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_MENU_HEADER(EObject context, MENU_HEADER semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADMenuPackage.Literals.MENU_HEADER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADMenuPackage.Literals.MENU_HEADER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMENU_HEADERAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING className=ID)
	 */
	protected void sequence_MENU_ITEM(EObject context, MENU_ITEM semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADMenuPackage.Literals.MENU_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADMenuPackage.Literals.MENU_ITEM__NAME));
			if(transientValues.isValueTransient(semanticObject, SpinCADMenuPackage.Literals.MENU_ITEM__CLASS_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADMenuPackage.Literals.MENU_ITEM__CLASS_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMENU_ITEMAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMENU_ITEMAccess().getClassNameIDTerminalRuleCall_2_0(), semanticObject.getClassName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     elements+=Element*
	 */
	protected void sequence_Menu(EObject context, Menu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     className=ID
	 */
	protected void sequence_TEST_ITEM(EObject context, TEST_ITEM semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpinCADMenuPackage.Literals.TEST_ITEM__CLASS_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpinCADMenuPackage.Literals.TEST_ITEM__CLASS_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTEST_ITEMAccess().getClassNameIDTerminalRuleCall_1_0(), semanticObject.getClassName());
		feeder.finish();
	}
}
