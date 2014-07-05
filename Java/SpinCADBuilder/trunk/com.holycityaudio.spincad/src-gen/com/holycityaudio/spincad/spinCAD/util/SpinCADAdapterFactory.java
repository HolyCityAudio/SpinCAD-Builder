/**
 */
package com.holycityaudio.spincad.spinCAD.util;

import com.holycityaudio.spincad.spinCAD.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage
 * @generated
 */
public class SpinCADAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SpinCADPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpinCADAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SpinCADPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpinCADSwitch<Adapter> modelSwitch =
    new SpinCADSwitch<Adapter>()
    {
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter casePin(Pin object)
      {
        return createPinAdapter();
      }
      @Override
      public Adapter caseInputPin(InputPin object)
      {
        return createInputPinAdapter();
      }
      @Override
      public Adapter caseOutputPin(OutputPin object)
      {
        return createOutputPinAdapter();
      }
      @Override
      public Adapter caseAudioInput(AudioInput object)
      {
        return createAudioInputAdapter();
      }
      @Override
      public Adapter caseAudioOutput(AudioOutput object)
      {
        return createAudioOutputAdapter();
      }
      @Override
      public Adapter caseControlInput(ControlInput object)
      {
        return createControlInputAdapter();
      }
      @Override
      public Adapter caseControlOutput(ControlOutput object)
      {
        return createControlOutputAdapter();
      }
      @Override
      public Adapter caseSpinElement(SpinElement object)
      {
        return createSpinElementAdapter();
      }
      @Override
      public Adapter caseSpinEquate(SpinEquate object)
      {
        return createSpinEquateAdapter();
      }
      @Override
      public Adapter caseSpinInt(SpinInt object)
      {
        return createSpinIntAdapter();
      }
      @Override
      public Adapter caseMem(Mem object)
      {
        return createMemAdapter();
      }
      @Override
      public Adapter caseOffset(Offset object)
      {
        return createOffsetAdapter();
      }
      @Override
      public Adapter caseSpinBool(SpinBool object)
      {
        return createSpinBoolAdapter();
      }
      @Override
      public Adapter caseControl(Control object)
      {
        return createControlAdapter();
      }
      @Override
      public Adapter caseSpinSliderLabel(SpinSliderLabel object)
      {
        return createSpinSliderLabelAdapter();
      }
      @Override
      public Adapter caseSpinCheckBox(SpinCheckBox object)
      {
        return createSpinCheckBoxAdapter();
      }
      @Override
      public Adapter caseComment(Comment object)
      {
        return createCommentAdapter();
      }
      @Override
      public Adapter caseLabel(Label object)
      {
        return createLabelAdapter();
      }
      @Override
      public Adapter caseMacro(Macro object)
      {
        return createMacroAdapter();
      }
      @Override
      public Adapter caseIsPinConnected(IsPinConnected object)
      {
        return createIsPinConnectedAdapter();
      }
      @Override
      public Adapter caseIsTrue(IsTrue object)
      {
        return createIsTrueAdapter();
      }
      @Override
      public Adapter caseIsElse(IsElse object)
      {
        return createIsElseAdapter();
      }
      @Override
      public Adapter caseIsEndif(IsEndif object)
      {
        return createIsEndifAdapter();
      }
      @Override
      public Adapter caseGetInputDefault(GetInputDefault object)
      {
        return createGetInputDefaultAdapter();
      }
      @Override
      public Adapter caseGetDelayScaleControl(GetDelayScaleControl object)
      {
        return createGetDelayScaleControlAdapter();
      }
      @Override
      public Adapter caseGetSamplesFromRatio(GetSamplesFromRatio object)
      {
        return createGetSamplesFromRatioAdapter();
      }
      @Override
      public Adapter caseGetBaseAddress(GetBaseAddress object)
      {
        return createGetBaseAddressAdapter();
      }
      @Override
      public Adapter caseSetOutputPin(SetOutputPin object)
      {
        return createSetOutputPinAdapter();
      }
      @Override
      public Adapter caseInstruction(Instruction object)
      {
        return createInstructionAdapter();
      }
      @Override
      public Adapter caseInst_B6_S1_14(Inst_B6_S1_14 object)
      {
        return createInst_B6_S1_14Adapter();
      }
      @Override
      public Adapter caseInst_B15_S1_9(Inst_B15_S1_9 object)
      {
        return createInst_B15_S1_9Adapter();
      }
      @Override
      public Adapter caseInst_B6(Inst_B6 object)
      {
        return createInst_B6Adapter();
      }
      @Override
      public Adapter caseInst_B24(Inst_B24 object)
      {
        return createInst_B24Adapter();
      }
      @Override
      public Adapter caseInst_X0(Inst_X0 object)
      {
        return createInst_X0Adapter();
      }
      @Override
      public Adapter caseInst_S1_14_S1_10(Inst_S1_14_S1_10 object)
      {
        return createInst_S1_14_S1_10Adapter();
      }
      @Override
      public Adapter caseReadRegister(ReadRegister object)
      {
        return createReadRegisterAdapter();
      }
      @Override
      public Adapter caseWriteRegisterLowshelf(WriteRegisterLowshelf object)
      {
        return createWriteRegisterLowshelfAdapter();
      }
      @Override
      public Adapter caseWriteRegisterHighshelf(WriteRegisterHighshelf object)
      {
        return createWriteRegisterHighshelfAdapter();
      }
      @Override
      public Adapter caseWriteRegister(WriteRegister object)
      {
        return createWriteRegisterAdapter();
      }
      @Override
      public Adapter caseMaxx(Maxx object)
      {
        return createMaxxAdapter();
      }
      @Override
      public Adapter caseReadRegisterFilter(ReadRegisterFilter object)
      {
        return createReadRegisterFilterAdapter();
      }
      @Override
      public Adapter caseMulx(Mulx object)
      {
        return createMulxAdapter();
      }
      @Override
      public Adapter caseLdax(Ldax object)
      {
        return createLdaxAdapter();
      }
      @Override
      public Adapter caseExp(Exp object)
      {
        return createExpAdapter();
      }
      @Override
      public Adapter caseLog(Log object)
      {
        return createLogAdapter();
      }
      @Override
      public Adapter caseScaleOffset(ScaleOffset object)
      {
        return createScaleOffsetAdapter();
      }
      @Override
      public Adapter caseWriteDelay(WriteDelay object)
      {
        return createWriteDelayAdapter();
      }
      @Override
      public Adapter caseWriteAllpass(WriteAllpass object)
      {
        return createWriteAllpassAdapter();
      }
      @Override
      public Adapter caseReadDelay(ReadDelay object)
      {
        return createReadDelayAdapter();
      }
      @Override
      public Adapter caseLoadSinLFO(LoadSinLFO object)
      {
        return createLoadSinLFOAdapter();
      }
      @Override
      public Adapter caseLoadRampLFO(LoadRampLFO object)
      {
        return createLoadRampLFOAdapter();
      }
      @Override
      public Adapter caseChorusReadDelay(ChorusReadDelay object)
      {
        return createChorusReadDelayAdapter();
      }
      @Override
      public Adapter caseChorusReadValue(ChorusReadValue object)
      {
        return createChorusReadValueAdapter();
      }
      @Override
      public Adapter caseChorusScaleOffset(ChorusScaleOffset object)
      {
        return createChorusScaleOffsetAdapter();
      }
      @Override
      public Adapter caseReadDelayPointer(ReadDelayPointer object)
      {
        return createReadDelayPointerAdapter();
      }
      @Override
      public Adapter caseAnd(And object)
      {
        return createAndAdapter();
      }
      @Override
      public Adapter caseOr(Or object)
      {
        return createOrAdapter();
      }
      @Override
      public Adapter caseXor(Xor object)
      {
        return createXorAdapter();
      }
      @Override
      public Adapter caseJam(Jam object)
      {
        return createJamAdapter();
      }
      @Override
      public Adapter caseClr(Clr object)
      {
        return createClrAdapter();
      }
      @Override
      public Adapter caseNot(Not object)
      {
        return createNotAdapter();
      }
      @Override
      public Adapter caseAbsa(Absa object)
      {
        return createAbsaAdapter();
      }
      @Override
      public Adapter caseSkip(Skip object)
      {
        return createSkipAdapter();
      }
      @Override
      public Adapter caseSPINMEM(SPINMEM object)
      {
        return createSPINMEMAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Pin <em>Pin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Pin
   * @generated
   */
  public Adapter createPinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.InputPin <em>Input Pin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.InputPin
   * @generated
   */
  public Adapter createInputPinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.OutputPin <em>Output Pin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.OutputPin
   * @generated
   */
  public Adapter createOutputPinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.AudioInput <em>Audio Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.AudioInput
   * @generated
   */
  public Adapter createAudioInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.AudioOutput <em>Audio Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.AudioOutput
   * @generated
   */
  public Adapter createAudioOutputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.ControlInput <em>Control Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.ControlInput
   * @generated
   */
  public Adapter createControlInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.ControlOutput <em>Control Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.ControlOutput
   * @generated
   */
  public Adapter createControlOutputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.SpinElement <em>Spin Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.SpinElement
   * @generated
   */
  public Adapter createSpinElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.SpinEquate <em>Spin Equate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.SpinEquate
   * @generated
   */
  public Adapter createSpinEquateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.SpinInt <em>Spin Int</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.SpinInt
   * @generated
   */
  public Adapter createSpinIntAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Mem <em>Mem</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Mem
   * @generated
   */
  public Adapter createMemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Offset <em>Offset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Offset
   * @generated
   */
  public Adapter createOffsetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.SpinBool <em>Spin Bool</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.SpinBool
   * @generated
   */
  public Adapter createSpinBoolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Control <em>Control</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Control
   * @generated
   */
  public Adapter createControlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.SpinSliderLabel <em>Spin Slider Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.SpinSliderLabel
   * @generated
   */
  public Adapter createSpinSliderLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.SpinCheckBox <em>Spin Check Box</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.SpinCheckBox
   * @generated
   */
  public Adapter createSpinCheckBoxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Comment
   * @generated
   */
  public Adapter createCommentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Label
   * @generated
   */
  public Adapter createLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Macro <em>Macro</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Macro
   * @generated
   */
  public Adapter createMacroAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.IsPinConnected <em>Is Pin Connected</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.IsPinConnected
   * @generated
   */
  public Adapter createIsPinConnectedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.IsTrue <em>Is True</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.IsTrue
   * @generated
   */
  public Adapter createIsTrueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.IsElse <em>Is Else</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.IsElse
   * @generated
   */
  public Adapter createIsElseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.IsEndif <em>Is Endif</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.IsEndif
   * @generated
   */
  public Adapter createIsEndifAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.GetInputDefault <em>Get Input Default</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.GetInputDefault
   * @generated
   */
  public Adapter createGetInputDefaultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.GetDelayScaleControl <em>Get Delay Scale Control</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.GetDelayScaleControl
   * @generated
   */
  public Adapter createGetDelayScaleControlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.GetSamplesFromRatio <em>Get Samples From Ratio</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.GetSamplesFromRatio
   * @generated
   */
  public Adapter createGetSamplesFromRatioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.GetBaseAddress <em>Get Base Address</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.GetBaseAddress
   * @generated
   */
  public Adapter createGetBaseAddressAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.SetOutputPin <em>Set Output Pin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.SetOutputPin
   * @generated
   */
  public Adapter createSetOutputPinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Instruction
   * @generated
   */
  public Adapter createInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Inst_B6_S1_14 <em>Inst B6 S1 14</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B6_S1_14
   * @generated
   */
  public Adapter createInst_B6_S1_14Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9 <em>Inst B15 S1 9</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9
   * @generated
   */
  public Adapter createInst_B15_S1_9Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Inst_B6 <em>Inst B6</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B6
   * @generated
   */
  public Adapter createInst_B6Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Inst_B24 <em>Inst B24</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B24
   * @generated
   */
  public Adapter createInst_B24Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Inst_X0 <em>Inst X0</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Inst_X0
   * @generated
   */
  public Adapter createInst_X0Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Inst_S1_14_S1_10 <em>Inst S1 14 S1 10</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Inst_S1_14_S1_10
   * @generated
   */
  public Adapter createInst_S1_14_S1_10Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.ReadRegister <em>Read Register</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.ReadRegister
   * @generated
   */
  public Adapter createReadRegisterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.WriteRegisterLowshelf <em>Write Register Lowshelf</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.WriteRegisterLowshelf
   * @generated
   */
  public Adapter createWriteRegisterLowshelfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.WriteRegisterHighshelf <em>Write Register Highshelf</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.WriteRegisterHighshelf
   * @generated
   */
  public Adapter createWriteRegisterHighshelfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.WriteRegister <em>Write Register</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.WriteRegister
   * @generated
   */
  public Adapter createWriteRegisterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Maxx <em>Maxx</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Maxx
   * @generated
   */
  public Adapter createMaxxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.ReadRegisterFilter <em>Read Register Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.ReadRegisterFilter
   * @generated
   */
  public Adapter createReadRegisterFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Mulx <em>Mulx</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Mulx
   * @generated
   */
  public Adapter createMulxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Ldax <em>Ldax</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Ldax
   * @generated
   */
  public Adapter createLdaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Exp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Exp
   * @generated
   */
  public Adapter createExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Log <em>Log</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Log
   * @generated
   */
  public Adapter createLogAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.ScaleOffset <em>Scale Offset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.ScaleOffset
   * @generated
   */
  public Adapter createScaleOffsetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.WriteDelay <em>Write Delay</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.WriteDelay
   * @generated
   */
  public Adapter createWriteDelayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.WriteAllpass <em>Write Allpass</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.WriteAllpass
   * @generated
   */
  public Adapter createWriteAllpassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.ReadDelay <em>Read Delay</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.ReadDelay
   * @generated
   */
  public Adapter createReadDelayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.LoadSinLFO <em>Load Sin LFO</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.LoadSinLFO
   * @generated
   */
  public Adapter createLoadSinLFOAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.LoadRampLFO <em>Load Ramp LFO</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.LoadRampLFO
   * @generated
   */
  public Adapter createLoadRampLFOAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.ChorusReadDelay <em>Chorus Read Delay</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.ChorusReadDelay
   * @generated
   */
  public Adapter createChorusReadDelayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.ChorusReadValue <em>Chorus Read Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.ChorusReadValue
   * @generated
   */
  public Adapter createChorusReadValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.ChorusScaleOffset <em>Chorus Scale Offset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.ChorusScaleOffset
   * @generated
   */
  public Adapter createChorusScaleOffsetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.ReadDelayPointer <em>Read Delay Pointer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.ReadDelayPointer
   * @generated
   */
  public Adapter createReadDelayPointerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.And
   * @generated
   */
  public Adapter createAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Or
   * @generated
   */
  public Adapter createOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Xor <em>Xor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Xor
   * @generated
   */
  public Adapter createXorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Jam <em>Jam</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Jam
   * @generated
   */
  public Adapter createJamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Clr <em>Clr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Clr
   * @generated
   */
  public Adapter createClrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Not
   * @generated
   */
  public Adapter createNotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Absa <em>Absa</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Absa
   * @generated
   */
  public Adapter createAbsaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.Skip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.Skip
   * @generated
   */
  public Adapter createSkipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincad.spinCAD.SPINMEM <em>SPINMEM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincad.spinCAD.SPINMEM
   * @generated
   */
  public Adapter createSPINMEMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SpinCADAdapterFactory
