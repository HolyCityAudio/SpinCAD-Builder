/**
 */
package com.holycityaudio.spincad.spinCAD;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage
 * @generated
 */
public interface SpinCADFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SpinCADFactory eINSTANCE = com.holycityaudio.spincad.spinCAD.impl.SpinCADFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  Program createProgram();

  /**
   * Returns a new object of class '<em>Pin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pin</em>'.
   * @generated
   */
  Pin createPin();

  /**
   * Returns a new object of class '<em>Input Pin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Pin</em>'.
   * @generated
   */
  InputPin createInputPin();

  /**
   * Returns a new object of class '<em>Output Pin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Pin</em>'.
   * @generated
   */
  OutputPin createOutputPin();

  /**
   * Returns a new object of class '<em>Audio Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Audio Input</em>'.
   * @generated
   */
  AudioInput createAudioInput();

  /**
   * Returns a new object of class '<em>Audio Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Audio Output</em>'.
   * @generated
   */
  AudioOutput createAudioOutput();

  /**
   * Returns a new object of class '<em>Control Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Control Input</em>'.
   * @generated
   */
  ControlInput createControlInput();

  /**
   * Returns a new object of class '<em>Control Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Control Output</em>'.
   * @generated
   */
  ControlOutput createControlOutput();

  /**
   * Returns a new object of class '<em>Control</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Control</em>'.
   * @generated
   */
  Control createControl();

  /**
   * Returns a new object of class '<em>Slider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slider</em>'.
   * @generated
   */
  Slider createSlider();

  /**
   * Returns a new object of class '<em>Check Box</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Check Box</em>'.
   * @generated
   */
  CheckBox createCheckBox();

  /**
   * Returns a new object of class '<em>control Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>control Label</em>'.
   * @generated
   */
  controlLabel createcontrolLabel();

  /**
   * Returns a new object of class '<em>Spin Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Spin Element</em>'.
   * @generated
   */
  SpinElement createSpinElement();

  /**
   * Returns a new object of class '<em>Equate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equate</em>'.
   * @generated
   */
  Equate createEquate();

  /**
   * Returns a new object of class '<em>Mem</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mem</em>'.
   * @generated
   */
  Mem createMem();

  /**
   * Returns a new object of class '<em>Offset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Offset</em>'.
   * @generated
   */
  Offset createOffset();

  /**
   * Returns a new object of class '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comment</em>'.
   * @generated
   */
  Comment createComment();

  /**
   * Returns a new object of class '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label</em>'.
   * @generated
   */
  Label createLabel();

  /**
   * Returns a new object of class '<em>Macro</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Macro</em>'.
   * @generated
   */
  Macro createMacro();

  /**
   * Returns a new object of class '<em>Is Pin Connected</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Is Pin Connected</em>'.
   * @generated
   */
  IsPinConnected createIsPinConnected();

  /**
   * Returns a new object of class '<em>Is Else</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Is Else</em>'.
   * @generated
   */
  IsElse createIsElse();

  /**
   * Returns a new object of class '<em>Is Endif</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Is Endif</em>'.
   * @generated
   */
  IsEndif createIsEndif();

  /**
   * Returns a new object of class '<em>Get Input Default</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Get Input Default</em>'.
   * @generated
   */
  GetInputDefault createGetInputDefault();

  /**
   * Returns a new object of class '<em>Get Delay Scale Control</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Get Delay Scale Control</em>'.
   * @generated
   */
  GetDelayScaleControl createGetDelayScaleControl();

  /**
   * Returns a new object of class '<em>Get Base Address</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Get Base Address</em>'.
   * @generated
   */
  GetBaseAddress createGetBaseAddress();

  /**
   * Returns a new object of class '<em>Set Output Pin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Output Pin</em>'.
   * @generated
   */
  SetOutputPin createSetOutputPin();

  /**
   * Returns a new object of class '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction</em>'.
   * @generated
   */
  Instruction createInstruction();

  /**
   * Returns a new object of class '<em>Inst B6 S1 14</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inst B6 S1 14</em>'.
   * @generated
   */
  Inst_B6_S1_14 createInst_B6_S1_14();

  /**
   * Returns a new object of class '<em>Inst B15 S1 9</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inst B15 S1 9</em>'.
   * @generated
   */
  Inst_B15_S1_9 createInst_B15_S1_9();

  /**
   * Returns a new object of class '<em>Inst B6</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inst B6</em>'.
   * @generated
   */
  Inst_B6 createInst_B6();

  /**
   * Returns a new object of class '<em>Inst B24</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inst B24</em>'.
   * @generated
   */
  Inst_B24 createInst_B24();

  /**
   * Returns a new object of class '<em>Inst X0</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inst X0</em>'.
   * @generated
   */
  Inst_X0 createInst_X0();

  /**
   * Returns a new object of class '<em>Inst S1 14 S1 10</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inst S1 14 S1 10</em>'.
   * @generated
   */
  Inst_S1_14_S1_10 createInst_S1_14_S1_10();

  /**
   * Returns a new object of class '<em>Read Register</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Read Register</em>'.
   * @generated
   */
  ReadRegister createReadRegister();

  /**
   * Returns a new object of class '<em>Write Register Lowshelf</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Write Register Lowshelf</em>'.
   * @generated
   */
  WriteRegisterLowshelf createWriteRegisterLowshelf();

  /**
   * Returns a new object of class '<em>Write Register Highshelf</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Write Register Highshelf</em>'.
   * @generated
   */
  WriteRegisterHighshelf createWriteRegisterHighshelf();

  /**
   * Returns a new object of class '<em>Write Register</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Write Register</em>'.
   * @generated
   */
  WriteRegister createWriteRegister();

  /**
   * Returns a new object of class '<em>Maxx</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Maxx</em>'.
   * @generated
   */
  Maxx createMaxx();

  /**
   * Returns a new object of class '<em>Read Register Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Read Register Filter</em>'.
   * @generated
   */
  ReadRegisterFilter createReadRegisterFilter();

  /**
   * Returns a new object of class '<em>Mulx</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mulx</em>'.
   * @generated
   */
  Mulx createMulx();

  /**
   * Returns a new object of class '<em>Ldax</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ldax</em>'.
   * @generated
   */
  Ldax createLdax();

  /**
   * Returns a new object of class '<em>Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exp</em>'.
   * @generated
   */
  Exp createExp();

  /**
   * Returns a new object of class '<em>Log</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Log</em>'.
   * @generated
   */
  Log createLog();

  /**
   * Returns a new object of class '<em>Scale Offset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scale Offset</em>'.
   * @generated
   */
  ScaleOffset createScaleOffset();

  /**
   * Returns a new object of class '<em>Write Delay</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Write Delay</em>'.
   * @generated
   */
  WriteDelay createWriteDelay();

  /**
   * Returns a new object of class '<em>Write Allpass</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Write Allpass</em>'.
   * @generated
   */
  WriteAllpass createWriteAllpass();

  /**
   * Returns a new object of class '<em>Read Delay</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Read Delay</em>'.
   * @generated
   */
  ReadDelay createReadDelay();

  /**
   * Returns a new object of class '<em>Load Sin LFO</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load Sin LFO</em>'.
   * @generated
   */
  LoadSinLFO createLoadSinLFO();

  /**
   * Returns a new object of class '<em>Load Ramp LFO</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load Ramp LFO</em>'.
   * @generated
   */
  LoadRampLFO createLoadRampLFO();

  /**
   * Returns a new object of class '<em>Chorus Read Delay</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chorus Read Delay</em>'.
   * @generated
   */
  ChorusReadDelay createChorusReadDelay();

  /**
   * Returns a new object of class '<em>Chorus Read Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chorus Read Value</em>'.
   * @generated
   */
  ChorusReadValue createChorusReadValue();

  /**
   * Returns a new object of class '<em>Chorus Scale Offset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chorus Scale Offset</em>'.
   * @generated
   */
  ChorusScaleOffset createChorusScaleOffset();

  /**
   * Returns a new object of class '<em>Read Delay Pointer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Read Delay Pointer</em>'.
   * @generated
   */
  ReadDelayPointer createReadDelayPointer();

  /**
   * Returns a new object of class '<em>And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And</em>'.
   * @generated
   */
  And createAnd();

  /**
   * Returns a new object of class '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or</em>'.
   * @generated
   */
  Or createOr();

  /**
   * Returns a new object of class '<em>Xor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Xor</em>'.
   * @generated
   */
  Xor createXor();

  /**
   * Returns a new object of class '<em>Jam</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jam</em>'.
   * @generated
   */
  Jam createJam();

  /**
   * Returns a new object of class '<em>Clr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Clr</em>'.
   * @generated
   */
  Clr createClr();

  /**
   * Returns a new object of class '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not</em>'.
   * @generated
   */
  Not createNot();

  /**
   * Returns a new object of class '<em>Absa</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Absa</em>'.
   * @generated
   */
  Absa createAbsa();

  /**
   * Returns a new object of class '<em>Skip</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Skip</em>'.
   * @generated
   */
  Skip createSkip();

  /**
   * Returns a new object of class '<em>SPINMEM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SPINMEM</em>'.
   * @generated
   */
  SPINMEM createSPINMEM();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SpinCADPackage getSpinCADPackage();

} //SpinCADFactory
