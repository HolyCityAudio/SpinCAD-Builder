/**
 */
package com.holycityaudio.spincad.spinCAD.util;

import com.holycityaudio.spincad.spinCAD.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage
 * @generated
 */
public class SpinCADSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SpinCADPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpinCADSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SpinCADPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SpinCADPackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.PIN:
      {
        Pin pin = (Pin)theEObject;
        T result = casePin(pin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.INPUT_PIN:
      {
        InputPin inputPin = (InputPin)theEObject;
        T result = caseInputPin(inputPin);
        if (result == null) result = casePin(inputPin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.OUTPUT_PIN:
      {
        OutputPin outputPin = (OutputPin)theEObject;
        T result = caseOutputPin(outputPin);
        if (result == null) result = casePin(outputPin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.AUDIO_INPUT:
      {
        AudioInput audioInput = (AudioInput)theEObject;
        T result = caseAudioInput(audioInput);
        if (result == null) result = caseInputPin(audioInput);
        if (result == null) result = casePin(audioInput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.AUDIO_OUTPUT:
      {
        AudioOutput audioOutput = (AudioOutput)theEObject;
        T result = caseAudioOutput(audioOutput);
        if (result == null) result = caseOutputPin(audioOutput);
        if (result == null) result = casePin(audioOutput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.CONTROL_INPUT:
      {
        ControlInput controlInput = (ControlInput)theEObject;
        T result = caseControlInput(controlInput);
        if (result == null) result = caseInputPin(controlInput);
        if (result == null) result = casePin(controlInput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.CONTROL_OUTPUT:
      {
        ControlOutput controlOutput = (ControlOutput)theEObject;
        T result = caseControlOutput(controlOutput);
        if (result == null) result = caseOutputPin(controlOutput);
        if (result == null) result = casePin(controlOutput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.CONTROL:
      {
        Control control = (Control)theEObject;
        T result = caseControl(control);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.SLIDER:
      {
        Slider slider = (Slider)theEObject;
        T result = caseSlider(slider);
        if (result == null) result = caseControl(slider);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.CHECK_BOX:
      {
        CheckBox checkBox = (CheckBox)theEObject;
        T result = caseCheckBox(checkBox);
        if (result == null) result = caseControl(checkBox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.CONTROL_LABEL:
      {
        controlLabel controlLabel = (controlLabel)theEObject;
        T result = casecontrolLabel(controlLabel);
        if (result == null) result = caseControl(controlLabel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.SPIN_ELEMENT:
      {
        SpinElement spinElement = (SpinElement)theEObject;
        T result = caseSpinElement(spinElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.EQUATE:
      {
        Equate equate = (Equate)theEObject;
        T result = caseEquate(equate);
        if (result == null) result = caseSpinElement(equate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.MEM:
      {
        Mem mem = (Mem)theEObject;
        T result = caseMem(mem);
        if (result == null) result = caseSpinElement(mem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.OFFSET:
      {
        Offset offset = (Offset)theEObject;
        T result = caseOffset(offset);
        if (result == null) result = caseSpinElement(offset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.COMMENT:
      {
        Comment comment = (Comment)theEObject;
        T result = caseComment(comment);
        if (result == null) result = caseSpinElement(comment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.LABEL:
      {
        Label label = (Label)theEObject;
        T result = caseLabel(label);
        if (result == null) result = caseSpinElement(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.MACRO:
      {
        Macro macro = (Macro)theEObject;
        T result = caseMacro(macro);
        if (result == null) result = caseSpinElement(macro);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.IS_PIN_CONNECTED:
      {
        IsPinConnected isPinConnected = (IsPinConnected)theEObject;
        T result = caseIsPinConnected(isPinConnected);
        if (result == null) result = caseMacro(isPinConnected);
        if (result == null) result = caseSpinElement(isPinConnected);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.IS_ELSE:
      {
        IsElse isElse = (IsElse)theEObject;
        T result = caseIsElse(isElse);
        if (result == null) result = caseMacro(isElse);
        if (result == null) result = caseSpinElement(isElse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.IS_ENDIF:
      {
        IsEndif isEndif = (IsEndif)theEObject;
        T result = caseIsEndif(isEndif);
        if (result == null) result = caseMacro(isEndif);
        if (result == null) result = caseSpinElement(isEndif);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.GET_INPUT_DEFAULT:
      {
        GetInputDefault getInputDefault = (GetInputDefault)theEObject;
        T result = caseGetInputDefault(getInputDefault);
        if (result == null) result = caseMacro(getInputDefault);
        if (result == null) result = caseSpinElement(getInputDefault);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.INSTRUCTION:
      {
        Instruction instruction = (Instruction)theEObject;
        T result = caseInstruction(instruction);
        if (result == null) result = caseSpinElement(instruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.INST_B6_S1_14:
      {
        Inst_B6_S1_14 inst_B6_S1_14 = (Inst_B6_S1_14)theEObject;
        T result = caseInst_B6_S1_14(inst_B6_S1_14);
        if (result == null) result = caseInstruction(inst_B6_S1_14);
        if (result == null) result = caseSpinElement(inst_B6_S1_14);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.INST_B15_S1_9:
      {
        Inst_B15_S1_9 inst_B15_S1_9 = (Inst_B15_S1_9)theEObject;
        T result = caseInst_B15_S1_9(inst_B15_S1_9);
        if (result == null) result = caseInstruction(inst_B15_S1_9);
        if (result == null) result = caseSpinElement(inst_B15_S1_9);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.INST_B6:
      {
        Inst_B6 inst_B6 = (Inst_B6)theEObject;
        T result = caseInst_B6(inst_B6);
        if (result == null) result = caseInstruction(inst_B6);
        if (result == null) result = caseSpinElement(inst_B6);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.INST_B24:
      {
        Inst_B24 inst_B24 = (Inst_B24)theEObject;
        T result = caseInst_B24(inst_B24);
        if (result == null) result = caseInstruction(inst_B24);
        if (result == null) result = caseSpinElement(inst_B24);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.INST_X0:
      {
        Inst_X0 inst_X0 = (Inst_X0)theEObject;
        T result = caseInst_X0(inst_X0);
        if (result == null) result = caseInstruction(inst_X0);
        if (result == null) result = caseSpinElement(inst_X0);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.INST_S1_14_S1_10:
      {
        Inst_S1_14_S1_10 inst_S1_14_S1_10 = (Inst_S1_14_S1_10)theEObject;
        T result = caseInst_S1_14_S1_10(inst_S1_14_S1_10);
        if (result == null) result = caseInstruction(inst_S1_14_S1_10);
        if (result == null) result = caseSpinElement(inst_S1_14_S1_10);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.READ_REGISTER:
      {
        ReadRegister readRegister = (ReadRegister)theEObject;
        T result = caseReadRegister(readRegister);
        if (result == null) result = caseInst_B6_S1_14(readRegister);
        if (result == null) result = caseInstruction(readRegister);
        if (result == null) result = caseSpinElement(readRegister);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.WRITE_REGISTER_LOWSHELF:
      {
        WriteRegisterLowshelf writeRegisterLowshelf = (WriteRegisterLowshelf)theEObject;
        T result = caseWriteRegisterLowshelf(writeRegisterLowshelf);
        if (result == null) result = caseInst_B6_S1_14(writeRegisterLowshelf);
        if (result == null) result = caseInstruction(writeRegisterLowshelf);
        if (result == null) result = caseSpinElement(writeRegisterLowshelf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.WRITE_REGISTER_HIGHSHELF:
      {
        WriteRegisterHighshelf writeRegisterHighshelf = (WriteRegisterHighshelf)theEObject;
        T result = caseWriteRegisterHighshelf(writeRegisterHighshelf);
        if (result == null) result = caseInst_B6_S1_14(writeRegisterHighshelf);
        if (result == null) result = caseInstruction(writeRegisterHighshelf);
        if (result == null) result = caseSpinElement(writeRegisterHighshelf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.WRITE_REGISTER:
      {
        WriteRegister writeRegister = (WriteRegister)theEObject;
        T result = caseWriteRegister(writeRegister);
        if (result == null) result = caseInst_B6_S1_14(writeRegister);
        if (result == null) result = caseInstruction(writeRegister);
        if (result == null) result = caseSpinElement(writeRegister);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.MAXX:
      {
        Maxx maxx = (Maxx)theEObject;
        T result = caseMaxx(maxx);
        if (result == null) result = caseInst_B6_S1_14(maxx);
        if (result == null) result = caseInstruction(maxx);
        if (result == null) result = caseSpinElement(maxx);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.READ_REGISTER_FILTER:
      {
        ReadRegisterFilter readRegisterFilter = (ReadRegisterFilter)theEObject;
        T result = caseReadRegisterFilter(readRegisterFilter);
        if (result == null) result = caseInst_B6_S1_14(readRegisterFilter);
        if (result == null) result = caseInstruction(readRegisterFilter);
        if (result == null) result = caseSpinElement(readRegisterFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.MULX:
      {
        Mulx mulx = (Mulx)theEObject;
        T result = caseMulx(mulx);
        if (result == null) result = caseInst_B6(mulx);
        if (result == null) result = caseInstruction(mulx);
        if (result == null) result = caseSpinElement(mulx);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.LDAX:
      {
        Ldax ldax = (Ldax)theEObject;
        T result = caseLdax(ldax);
        if (result == null) result = caseInst_B6(ldax);
        if (result == null) result = caseInstruction(ldax);
        if (result == null) result = caseSpinElement(ldax);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.EXP:
      {
        Exp exp = (Exp)theEObject;
        T result = caseExp(exp);
        if (result == null) result = caseInst_S1_14_S1_10(exp);
        if (result == null) result = caseInstruction(exp);
        if (result == null) result = caseSpinElement(exp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.LOG:
      {
        Log log = (Log)theEObject;
        T result = caseLog(log);
        if (result == null) result = caseInstruction(log);
        if (result == null) result = caseSpinElement(log);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.SCALE_OFFSET:
      {
        ScaleOffset scaleOffset = (ScaleOffset)theEObject;
        T result = caseScaleOffset(scaleOffset);
        if (result == null) result = caseInst_S1_14_S1_10(scaleOffset);
        if (result == null) result = caseInstruction(scaleOffset);
        if (result == null) result = caseSpinElement(scaleOffset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.WRITE_DELAY:
      {
        WriteDelay writeDelay = (WriteDelay)theEObject;
        T result = caseWriteDelay(writeDelay);
        if (result == null) result = caseInst_B15_S1_9(writeDelay);
        if (result == null) result = caseInstruction(writeDelay);
        if (result == null) result = caseSpinElement(writeDelay);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.WRITE_ALLPASS:
      {
        WriteAllpass writeAllpass = (WriteAllpass)theEObject;
        T result = caseWriteAllpass(writeAllpass);
        if (result == null) result = caseInst_B15_S1_9(writeAllpass);
        if (result == null) result = caseInstruction(writeAllpass);
        if (result == null) result = caseSpinElement(writeAllpass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.READ_DELAY:
      {
        ReadDelay readDelay = (ReadDelay)theEObject;
        T result = caseReadDelay(readDelay);
        if (result == null) result = caseInst_B15_S1_9(readDelay);
        if (result == null) result = caseInstruction(readDelay);
        if (result == null) result = caseSpinElement(readDelay);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.LOAD_SIN_LFO:
      {
        LoadSinLFO loadSinLFO = (LoadSinLFO)theEObject;
        T result = caseLoadSinLFO(loadSinLFO);
        if (result == null) result = caseInstruction(loadSinLFO);
        if (result == null) result = caseSpinElement(loadSinLFO);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.LOAD_RAMP_LFO:
      {
        LoadRampLFO loadRampLFO = (LoadRampLFO)theEObject;
        T result = caseLoadRampLFO(loadRampLFO);
        if (result == null) result = caseInstruction(loadRampLFO);
        if (result == null) result = caseSpinElement(loadRampLFO);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.CHORUS_READ_DELAY:
      {
        ChorusReadDelay chorusReadDelay = (ChorusReadDelay)theEObject;
        T result = caseChorusReadDelay(chorusReadDelay);
        if (result == null) result = caseInstruction(chorusReadDelay);
        if (result == null) result = caseSpinElement(chorusReadDelay);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.CHORUS_READ_VALUE:
      {
        ChorusReadValue chorusReadValue = (ChorusReadValue)theEObject;
        T result = caseChorusReadValue(chorusReadValue);
        if (result == null) result = caseInstruction(chorusReadValue);
        if (result == null) result = caseSpinElement(chorusReadValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.CHORUS_SCALE_OFFSET:
      {
        ChorusScaleOffset chorusScaleOffset = (ChorusScaleOffset)theEObject;
        T result = caseChorusScaleOffset(chorusScaleOffset);
        if (result == null) result = caseInstruction(chorusScaleOffset);
        if (result == null) result = caseSpinElement(chorusScaleOffset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.READ_DELAY_POINTER:
      {
        ReadDelayPointer readDelayPointer = (ReadDelayPointer)theEObject;
        T result = caseReadDelayPointer(readDelayPointer);
        if (result == null) result = caseInstruction(readDelayPointer);
        if (result == null) result = caseSpinElement(readDelayPointer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.AND:
      {
        And and = (And)theEObject;
        T result = caseAnd(and);
        if (result == null) result = caseInst_B24(and);
        if (result == null) result = caseInstruction(and);
        if (result == null) result = caseSpinElement(and);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.OR:
      {
        Or or = (Or)theEObject;
        T result = caseOr(or);
        if (result == null) result = caseInst_B24(or);
        if (result == null) result = caseInstruction(or);
        if (result == null) result = caseSpinElement(or);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.XOR:
      {
        Xor xor = (Xor)theEObject;
        T result = caseXor(xor);
        if (result == null) result = caseInst_B24(xor);
        if (result == null) result = caseInstruction(xor);
        if (result == null) result = caseSpinElement(xor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.JAM:
      {
        Jam jam = (Jam)theEObject;
        T result = caseJam(jam);
        if (result == null) result = caseInstruction(jam);
        if (result == null) result = caseSpinElement(jam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.CLR:
      {
        Clr clr = (Clr)theEObject;
        T result = caseClr(clr);
        if (result == null) result = caseInst_X0(clr);
        if (result == null) result = caseInstruction(clr);
        if (result == null) result = caseSpinElement(clr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.NOT:
      {
        Not not = (Not)theEObject;
        T result = caseNot(not);
        if (result == null) result = caseInst_X0(not);
        if (result == null) result = caseInstruction(not);
        if (result == null) result = caseSpinElement(not);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.ABSA:
      {
        Absa absa = (Absa)theEObject;
        T result = caseAbsa(absa);
        if (result == null) result = caseInst_X0(absa);
        if (result == null) result = caseInstruction(absa);
        if (result == null) result = caseSpinElement(absa);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.SKIP:
      {
        Skip skip = (Skip)theEObject;
        T result = caseSkip(skip);
        if (result == null) result = caseInstruction(skip);
        if (result == null) result = caseSpinElement(skip);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpinCADPackage.SPINMEM:
      {
        SPINMEM spinmem = (SPINMEM)theEObject;
        T result = caseSPINMEM(spinmem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePin(Pin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Pin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Pin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputPin(InputPin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Pin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Pin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputPin(OutputPin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Audio Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Audio Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAudioInput(AudioInput object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Audio Output</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Audio Output</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAudioOutput(AudioOutput object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControlInput(ControlInput object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control Output</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Output</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControlOutput(ControlOutput object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControl(Control object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlider(Slider object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check Box</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check Box</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckBox(CheckBox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>control Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>control Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecontrolLabel(controlLabel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spin Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spin Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpinElement(SpinElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquate(Equate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mem</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mem</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMem(Mem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Offset</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Offset</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOffset(Offset object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComment(Comment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabel(Label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Macro</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Macro</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMacro(Macro object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Is Pin Connected</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Is Pin Connected</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIsPinConnected(IsPinConnected object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Is Else</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Is Else</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIsElse(IsElse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Is Endif</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Is Endif</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIsEndif(IsEndif object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get Input Default</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get Input Default</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGetInputDefault(GetInputDefault object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction(Instruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inst B6 S1 14</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inst B6 S1 14</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInst_B6_S1_14(Inst_B6_S1_14 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inst B15 S1 9</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inst B15 S1 9</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInst_B15_S1_9(Inst_B15_S1_9 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inst B6</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inst B6</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInst_B6(Inst_B6 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inst B24</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inst B24</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInst_B24(Inst_B24 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inst X0</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inst X0</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInst_X0(Inst_X0 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inst S1 14 S1 10</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inst S1 14 S1 10</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInst_S1_14_S1_10(Inst_S1_14_S1_10 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Read Register</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Read Register</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReadRegister(ReadRegister object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Write Register Lowshelf</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Write Register Lowshelf</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWriteRegisterLowshelf(WriteRegisterLowshelf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Write Register Highshelf</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Write Register Highshelf</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWriteRegisterHighshelf(WriteRegisterHighshelf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Write Register</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Write Register</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWriteRegister(WriteRegister object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Maxx</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Maxx</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaxx(Maxx object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Read Register Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Read Register Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReadRegisterFilter(ReadRegisterFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mulx</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mulx</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMulx(Mulx object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ldax</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ldax</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLdax(Ldax object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExp(Exp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Log</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Log</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLog(Log object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scale Offset</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scale Offset</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScaleOffset(ScaleOffset object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Write Delay</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Write Delay</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWriteDelay(WriteDelay object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Write Allpass</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Write Allpass</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWriteAllpass(WriteAllpass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Read Delay</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Read Delay</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReadDelay(ReadDelay object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Load Sin LFO</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Load Sin LFO</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoadSinLFO(LoadSinLFO object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Load Ramp LFO</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Load Ramp LFO</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoadRampLFO(LoadRampLFO object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chorus Read Delay</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chorus Read Delay</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChorusReadDelay(ChorusReadDelay object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chorus Read Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chorus Read Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChorusReadValue(ChorusReadValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chorus Scale Offset</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chorus Scale Offset</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChorusScaleOffset(ChorusScaleOffset object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Read Delay Pointer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Read Delay Pointer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReadDelayPointer(ReadDelayPointer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnd(And object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOr(Or object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXor(Xor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Jam</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Jam</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJam(Jam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClr(Clr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNot(Not object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Absa</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Absa</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbsa(Absa object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Skip</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Skip</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSkip(Skip object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SPINMEM</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SPINMEM</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSPINMEM(SPINMEM object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SpinCADSwitch
