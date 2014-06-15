/**
 */
package com.holycityaudio.spincad.spinCAD.impl;

import com.holycityaudio.spincad.spinCAD.Absa;
import com.holycityaudio.spincad.spinCAD.And;
import com.holycityaudio.spincad.spinCAD.AudioInput;
import com.holycityaudio.spincad.spinCAD.AudioOutput;
import com.holycityaudio.spincad.spinCAD.ChorusReadDelay;
import com.holycityaudio.spincad.spinCAD.ChorusReadValue;
import com.holycityaudio.spincad.spinCAD.ChorusScaleOffset;
import com.holycityaudio.spincad.spinCAD.Clr;
import com.holycityaudio.spincad.spinCAD.Comment;
import com.holycityaudio.spincad.spinCAD.ControlInput;
import com.holycityaudio.spincad.spinCAD.ControlOutput;
import com.holycityaudio.spincad.spinCAD.Equate;
import com.holycityaudio.spincad.spinCAD.Exp;
import com.holycityaudio.spincad.spinCAD.GetBaseAddress;
import com.holycityaudio.spincad.spinCAD.GetDelayScaleControl;
import com.holycityaudio.spincad.spinCAD.GetInputDefault;
import com.holycityaudio.spincad.spinCAD.InputPin;
import com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9;
import com.holycityaudio.spincad.spinCAD.Inst_B24;
import com.holycityaudio.spincad.spinCAD.Inst_B6;
import com.holycityaudio.spincad.spinCAD.Inst_B6_S1_14;
import com.holycityaudio.spincad.spinCAD.Inst_S1_14_S1_10;
import com.holycityaudio.spincad.spinCAD.Inst_X0;
import com.holycityaudio.spincad.spinCAD.Instruction;
import com.holycityaudio.spincad.spinCAD.IsElse;
import com.holycityaudio.spincad.spinCAD.IsEndif;
import com.holycityaudio.spincad.spinCAD.IsPinConnected;
import com.holycityaudio.spincad.spinCAD.Jam;
import com.holycityaudio.spincad.spinCAD.Label;
import com.holycityaudio.spincad.spinCAD.Ldax;
import com.holycityaudio.spincad.spinCAD.LoadRampLFO;
import com.holycityaudio.spincad.spinCAD.LoadSinLFO;
import com.holycityaudio.spincad.spinCAD.Log;
import com.holycityaudio.spincad.spinCAD.Macro;
import com.holycityaudio.spincad.spinCAD.Maxx;
import com.holycityaudio.spincad.spinCAD.Mem;
import com.holycityaudio.spincad.spinCAD.Mulx;
import com.holycityaudio.spincad.spinCAD.Not;
import com.holycityaudio.spincad.spinCAD.Offset;
import com.holycityaudio.spincad.spinCAD.Or;
import com.holycityaudio.spincad.spinCAD.OutputPin;
import com.holycityaudio.spincad.spinCAD.Pin;
import com.holycityaudio.spincad.spinCAD.Program;
import com.holycityaudio.spincad.spinCAD.ReadDelay;
import com.holycityaudio.spincad.spinCAD.ReadDelayPointer;
import com.holycityaudio.spincad.spinCAD.ReadRegister;
import com.holycityaudio.spincad.spinCAD.ReadRegisterFilter;
import com.holycityaudio.spincad.spinCAD.ScaleOffset;
import com.holycityaudio.spincad.spinCAD.SetOutputPin;
import com.holycityaudio.spincad.spinCAD.Skip;
import com.holycityaudio.spincad.spinCAD.SpinCADFactory;
import com.holycityaudio.spincad.spinCAD.SpinCADPackage;
import com.holycityaudio.spincad.spinCAD.SpinElement;
import com.holycityaudio.spincad.spinCAD.WriteAllpass;
import com.holycityaudio.spincad.spinCAD.WriteDelay;
import com.holycityaudio.spincad.spinCAD.WriteRegister;
import com.holycityaudio.spincad.spinCAD.WriteRegisterHighshelf;
import com.holycityaudio.spincad.spinCAD.WriteRegisterLowshelf;
import com.holycityaudio.spincad.spinCAD.Xor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpinCADPackageImpl extends EPackageImpl implements SpinCADPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputPinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputPinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass audioInputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass audioOutputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controlInputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controlOutputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spinElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass offsetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass macroEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isPinConnectedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isElseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isEndifEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getInputDefaultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getDelayScaleControlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getBaseAddressEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setOutputPinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inst_B6_S1_14EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inst_B15_S1_9EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inst_B6EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inst_B24EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inst_X0EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inst_S1_14_S1_10EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass readRegisterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass writeRegisterLowshelfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass writeRegisterHighshelfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass writeRegisterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maxxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass readRegisterFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mulxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ldaxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scaleOffsetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass writeDelayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass writeAllpassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass readDelayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loadSinLFOEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loadRampLFOEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chorusReadDelayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chorusReadValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chorusScaleOffsetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass readDelayPointerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass absaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass skipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spinmemEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SpinCADPackageImpl()
  {
    super(eNS_URI, SpinCADFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SpinCADPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SpinCADPackage init()
  {
    if (isInited) return (SpinCADPackage)EPackage.Registry.INSTANCE.getEPackage(SpinCADPackage.eNS_URI);

    // Obtain or create and register package
    SpinCADPackageImpl theSpinCADPackage = (SpinCADPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpinCADPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpinCADPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSpinCADPackage.createPackageContents();

    // Initialize created meta-data
    theSpinCADPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSpinCADPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SpinCADPackage.eNS_URI, theSpinCADPackage);
    return theSpinCADPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProgram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProgram_Name()
  {
    return (EAttribute)programEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Pins()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Elements()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPin()
  {
    return pinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPin_VarName()
  {
    return (EAttribute)pinEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPin_Name()
  {
    return (EAttribute)pinEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputPin()
  {
    return inputPinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputPin()
  {
    return outputPinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAudioInput()
  {
    return audioInputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAudioOutput()
  {
    return audioOutputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getControlInput()
  {
    return controlInputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getControlOutput()
  {
    return controlOutputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpinElement()
  {
    return spinElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEquate()
  {
    return equateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEquate_Ename()
  {
    return (EAttribute)equateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEquate_Value()
  {
    return (EAttribute)equateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEquate_Control()
  {
    return (EAttribute)equateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEquate_Label()
  {
    return (EAttribute)equateEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEquate_Max()
  {
    return (EAttribute)equateEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEquate_Offset()
  {
    return (EAttribute)equateEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEquate_Func()
  {
    return (EAttribute)equateEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMem()
  {
    return memEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMem_Buffer()
  {
    return (EAttribute)memEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMem_Length()
  {
    return (EAttribute)memEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOffset()
  {
    return offsetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOffset_Name()
  {
    return (EAttribute)offsetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOffset_Length()
  {
    return (EAttribute)offsetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComment()
  {
    return commentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComment_Remark()
  {
    return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabel()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Name()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMacro()
  {
    return macroEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIsPinConnected()
  {
    return isPinConnectedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIsPinConnected_Arg1()
  {
    return (EAttribute)isPinConnectedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIsElse()
  {
    return isElseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIsEndif()
  {
    return isEndifEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGetInputDefault()
  {
    return getInputDefaultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGetInputDefault_Name()
  {
    return (EAttribute)getInputDefaultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGetInputDefault_Variable()
  {
    return (EAttribute)getInputDefaultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGetInputDefault_Scale()
  {
    return (EAttribute)getInputDefaultEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGetInputDefault_DefaultVal()
  {
    return (EAttribute)getInputDefaultEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGetDelayScaleControl()
  {
    return getDelayScaleControlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGetDelayScaleControl_Length()
  {
    return (EAttribute)getDelayScaleControlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGetDelayScaleControl_Buffer()
  {
    return (EAttribute)getDelayScaleControlEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGetDelayScaleControl_Control()
  {
    return (EAttribute)getDelayScaleControlEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGetBaseAddress()
  {
    return getBaseAddressEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetOutputPin()
  {
    return setOutputPinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetOutputPin_PinName()
  {
    return (EAttribute)setOutputPinEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetOutputPin_VarName()
  {
    return (EAttribute)setOutputPinEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction()
  {
    return instructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInst_B6_S1_14()
  {
    return inst_B6_S1_14EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInst_B6_S1_14_Arg1()
  {
    return (EAttribute)inst_B6_S1_14EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInst_B6_S1_14_Arg2()
  {
    return (EAttribute)inst_B6_S1_14EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInst_B15_S1_9()
  {
    return inst_B15_S1_9EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInst_B15_S1_9_Arg1()
  {
    return (EReference)inst_B15_S1_9EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInst_B15_S1_9_Arg2()
  {
    return (EAttribute)inst_B15_S1_9EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInst_B6()
  {
    return inst_B6EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInst_B6_Arg1()
  {
    return (EAttribute)inst_B6EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInst_B24()
  {
    return inst_B24EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInst_B24_Arg1()
  {
    return (EAttribute)inst_B24EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInst_X0()
  {
    return inst_X0EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInst_S1_14_S1_10()
  {
    return inst_S1_14_S1_10EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInst_S1_14_S1_10_Arg1()
  {
    return (EAttribute)inst_S1_14_S1_10EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInst_S1_14_S1_10_Arg2()
  {
    return (EAttribute)inst_S1_14_S1_10EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReadRegister()
  {
    return readRegisterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWriteRegisterLowshelf()
  {
    return writeRegisterLowshelfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWriteRegisterHighshelf()
  {
    return writeRegisterHighshelfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWriteRegister()
  {
    return writeRegisterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMaxx()
  {
    return maxxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReadRegisterFilter()
  {
    return readRegisterFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMulx()
  {
    return mulxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLdax()
  {
    return ldaxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExp()
  {
    return expEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLog()
  {
    return logEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLog_Arg1()
  {
    return (EAttribute)logEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLog_Arg2()
  {
    return (EAttribute)logEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScaleOffset()
  {
    return scaleOffsetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWriteDelay()
  {
    return writeDelayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWriteAllpass()
  {
    return writeAllpassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReadDelay()
  {
    return readDelayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoadSinLFO()
  {
    return loadSinLFOEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadSinLFO_Arg1()
  {
    return (EAttribute)loadSinLFOEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadSinLFO_Arg2()
  {
    return (EAttribute)loadSinLFOEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadSinLFO_Arg3()
  {
    return (EAttribute)loadSinLFOEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoadRampLFO()
  {
    return loadRampLFOEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadRampLFO_Arg1()
  {
    return (EAttribute)loadRampLFOEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadRampLFO_Arg2()
  {
    return (EAttribute)loadRampLFOEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadRampLFO_Arg3()
  {
    return (EAttribute)loadRampLFOEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChorusReadDelay()
  {
    return chorusReadDelayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChorusReadDelay_Arg1()
  {
    return (EAttribute)chorusReadDelayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChorusReadDelay_Arg2()
  {
    return (EAttribute)chorusReadDelayEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChorusReadDelay_Arg3()
  {
    return (EReference)chorusReadDelayEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChorusReadValue()
  {
    return chorusReadValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChorusReadValue_Arg1()
  {
    return (EAttribute)chorusReadValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChorusScaleOffset()
  {
    return chorusScaleOffsetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChorusScaleOffset_Arg1()
  {
    return (EAttribute)chorusScaleOffsetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChorusScaleOffset_Arg2()
  {
    return (EAttribute)chorusScaleOffsetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChorusScaleOffset_Arg3()
  {
    return (EAttribute)chorusScaleOffsetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReadDelayPointer()
  {
    return readDelayPointerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReadDelayPointer_Arg1()
  {
    return (EAttribute)readDelayPointerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnd()
  {
    return andEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOr()
  {
    return orEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXor()
  {
    return xorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJam()
  {
    return jamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJam_Arg1()
  {
    return (EAttribute)jamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClr()
  {
    return clrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNot()
  {
    return notEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbsa()
  {
    return absaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSkip()
  {
    return skipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSkip_Flags()
  {
    return (EAttribute)skipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSkip_Label()
  {
    return (EReference)skipEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSPINMEM()
  {
    return spinmemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSPINMEM_Buffer()
  {
    return (EAttribute)spinmemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSPINMEM_Value()
  {
    return (EAttribute)spinmemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSPINMEM_Offset()
  {
    return (EReference)spinmemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpinCADFactory getSpinCADFactory()
  {
    return (SpinCADFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    programEClass = createEClass(PROGRAM);
    createEAttribute(programEClass, PROGRAM__NAME);
    createEReference(programEClass, PROGRAM__PINS);
    createEReference(programEClass, PROGRAM__ELEMENTS);

    pinEClass = createEClass(PIN);
    createEAttribute(pinEClass, PIN__VAR_NAME);
    createEAttribute(pinEClass, PIN__NAME);

    inputPinEClass = createEClass(INPUT_PIN);

    outputPinEClass = createEClass(OUTPUT_PIN);

    audioInputEClass = createEClass(AUDIO_INPUT);

    audioOutputEClass = createEClass(AUDIO_OUTPUT);

    controlInputEClass = createEClass(CONTROL_INPUT);

    controlOutputEClass = createEClass(CONTROL_OUTPUT);

    spinElementEClass = createEClass(SPIN_ELEMENT);

    equateEClass = createEClass(EQUATE);
    createEAttribute(equateEClass, EQUATE__ENAME);
    createEAttribute(equateEClass, EQUATE__VALUE);
    createEAttribute(equateEClass, EQUATE__CONTROL);
    createEAttribute(equateEClass, EQUATE__LABEL);
    createEAttribute(equateEClass, EQUATE__MAX);
    createEAttribute(equateEClass, EQUATE__OFFSET);
    createEAttribute(equateEClass, EQUATE__FUNC);

    memEClass = createEClass(MEM);
    createEAttribute(memEClass, MEM__BUFFER);
    createEAttribute(memEClass, MEM__LENGTH);

    offsetEClass = createEClass(OFFSET);
    createEAttribute(offsetEClass, OFFSET__NAME);
    createEAttribute(offsetEClass, OFFSET__LENGTH);

    commentEClass = createEClass(COMMENT);
    createEAttribute(commentEClass, COMMENT__REMARK);

    labelEClass = createEClass(LABEL);
    createEAttribute(labelEClass, LABEL__NAME);

    macroEClass = createEClass(MACRO);

    isPinConnectedEClass = createEClass(IS_PIN_CONNECTED);
    createEAttribute(isPinConnectedEClass, IS_PIN_CONNECTED__ARG1);

    isElseEClass = createEClass(IS_ELSE);

    isEndifEClass = createEClass(IS_ENDIF);

    getInputDefaultEClass = createEClass(GET_INPUT_DEFAULT);
    createEAttribute(getInputDefaultEClass, GET_INPUT_DEFAULT__NAME);
    createEAttribute(getInputDefaultEClass, GET_INPUT_DEFAULT__VARIABLE);
    createEAttribute(getInputDefaultEClass, GET_INPUT_DEFAULT__SCALE);
    createEAttribute(getInputDefaultEClass, GET_INPUT_DEFAULT__DEFAULT_VAL);

    getDelayScaleControlEClass = createEClass(GET_DELAY_SCALE_CONTROL);
    createEAttribute(getDelayScaleControlEClass, GET_DELAY_SCALE_CONTROL__LENGTH);
    createEAttribute(getDelayScaleControlEClass, GET_DELAY_SCALE_CONTROL__BUFFER);
    createEAttribute(getDelayScaleControlEClass, GET_DELAY_SCALE_CONTROL__CONTROL);

    getBaseAddressEClass = createEClass(GET_BASE_ADDRESS);

    setOutputPinEClass = createEClass(SET_OUTPUT_PIN);
    createEAttribute(setOutputPinEClass, SET_OUTPUT_PIN__PIN_NAME);
    createEAttribute(setOutputPinEClass, SET_OUTPUT_PIN__VAR_NAME);

    instructionEClass = createEClass(INSTRUCTION);

    inst_B6_S1_14EClass = createEClass(INST_B6_S1_14);
    createEAttribute(inst_B6_S1_14EClass, INST_B6_S1_14__ARG1);
    createEAttribute(inst_B6_S1_14EClass, INST_B6_S1_14__ARG2);

    inst_B15_S1_9EClass = createEClass(INST_B15_S1_9);
    createEReference(inst_B15_S1_9EClass, INST_B15_S1_9__ARG1);
    createEAttribute(inst_B15_S1_9EClass, INST_B15_S1_9__ARG2);

    inst_B6EClass = createEClass(INST_B6);
    createEAttribute(inst_B6EClass, INST_B6__ARG1);

    inst_B24EClass = createEClass(INST_B24);
    createEAttribute(inst_B24EClass, INST_B24__ARG1);

    inst_X0EClass = createEClass(INST_X0);

    inst_S1_14_S1_10EClass = createEClass(INST_S1_14_S1_10);
    createEAttribute(inst_S1_14_S1_10EClass, INST_S1_14_S1_10__ARG1);
    createEAttribute(inst_S1_14_S1_10EClass, INST_S1_14_S1_10__ARG2);

    readRegisterEClass = createEClass(READ_REGISTER);

    writeRegisterLowshelfEClass = createEClass(WRITE_REGISTER_LOWSHELF);

    writeRegisterHighshelfEClass = createEClass(WRITE_REGISTER_HIGHSHELF);

    writeRegisterEClass = createEClass(WRITE_REGISTER);

    maxxEClass = createEClass(MAXX);

    readRegisterFilterEClass = createEClass(READ_REGISTER_FILTER);

    mulxEClass = createEClass(MULX);

    ldaxEClass = createEClass(LDAX);

    expEClass = createEClass(EXP);

    logEClass = createEClass(LOG);
    createEAttribute(logEClass, LOG__ARG1);
    createEAttribute(logEClass, LOG__ARG2);

    scaleOffsetEClass = createEClass(SCALE_OFFSET);

    writeDelayEClass = createEClass(WRITE_DELAY);

    writeAllpassEClass = createEClass(WRITE_ALLPASS);

    readDelayEClass = createEClass(READ_DELAY);

    loadSinLFOEClass = createEClass(LOAD_SIN_LFO);
    createEAttribute(loadSinLFOEClass, LOAD_SIN_LFO__ARG1);
    createEAttribute(loadSinLFOEClass, LOAD_SIN_LFO__ARG2);
    createEAttribute(loadSinLFOEClass, LOAD_SIN_LFO__ARG3);

    loadRampLFOEClass = createEClass(LOAD_RAMP_LFO);
    createEAttribute(loadRampLFOEClass, LOAD_RAMP_LFO__ARG1);
    createEAttribute(loadRampLFOEClass, LOAD_RAMP_LFO__ARG2);
    createEAttribute(loadRampLFOEClass, LOAD_RAMP_LFO__ARG3);

    chorusReadDelayEClass = createEClass(CHORUS_READ_DELAY);
    createEAttribute(chorusReadDelayEClass, CHORUS_READ_DELAY__ARG1);
    createEAttribute(chorusReadDelayEClass, CHORUS_READ_DELAY__ARG2);
    createEReference(chorusReadDelayEClass, CHORUS_READ_DELAY__ARG3);

    chorusReadValueEClass = createEClass(CHORUS_READ_VALUE);
    createEAttribute(chorusReadValueEClass, CHORUS_READ_VALUE__ARG1);

    chorusScaleOffsetEClass = createEClass(CHORUS_SCALE_OFFSET);
    createEAttribute(chorusScaleOffsetEClass, CHORUS_SCALE_OFFSET__ARG1);
    createEAttribute(chorusScaleOffsetEClass, CHORUS_SCALE_OFFSET__ARG2);
    createEAttribute(chorusScaleOffsetEClass, CHORUS_SCALE_OFFSET__ARG3);

    readDelayPointerEClass = createEClass(READ_DELAY_POINTER);
    createEAttribute(readDelayPointerEClass, READ_DELAY_POINTER__ARG1);

    andEClass = createEClass(AND);

    orEClass = createEClass(OR);

    xorEClass = createEClass(XOR);

    jamEClass = createEClass(JAM);
    createEAttribute(jamEClass, JAM__ARG1);

    clrEClass = createEClass(CLR);

    notEClass = createEClass(NOT);

    absaEClass = createEClass(ABSA);

    skipEClass = createEClass(SKIP);
    createEAttribute(skipEClass, SKIP__FLAGS);
    createEReference(skipEClass, SKIP__LABEL);

    spinmemEClass = createEClass(SPINMEM);
    createEAttribute(spinmemEClass, SPINMEM__BUFFER);
    createEAttribute(spinmemEClass, SPINMEM__VALUE);
    createEReference(spinmemEClass, SPINMEM__OFFSET);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    inputPinEClass.getESuperTypes().add(this.getPin());
    outputPinEClass.getESuperTypes().add(this.getPin());
    audioInputEClass.getESuperTypes().add(this.getInputPin());
    audioOutputEClass.getESuperTypes().add(this.getOutputPin());
    controlInputEClass.getESuperTypes().add(this.getInputPin());
    controlOutputEClass.getESuperTypes().add(this.getOutputPin());
    equateEClass.getESuperTypes().add(this.getSpinElement());
    memEClass.getESuperTypes().add(this.getSpinElement());
    offsetEClass.getESuperTypes().add(this.getSpinElement());
    commentEClass.getESuperTypes().add(this.getSpinElement());
    labelEClass.getESuperTypes().add(this.getSpinElement());
    macroEClass.getESuperTypes().add(this.getSpinElement());
    isPinConnectedEClass.getESuperTypes().add(this.getMacro());
    isElseEClass.getESuperTypes().add(this.getMacro());
    isEndifEClass.getESuperTypes().add(this.getMacro());
    getInputDefaultEClass.getESuperTypes().add(this.getMacro());
    getDelayScaleControlEClass.getESuperTypes().add(this.getMacro());
    getBaseAddressEClass.getESuperTypes().add(this.getMacro());
    setOutputPinEClass.getESuperTypes().add(this.getMacro());
    instructionEClass.getESuperTypes().add(this.getSpinElement());
    inst_B6_S1_14EClass.getESuperTypes().add(this.getInstruction());
    inst_B15_S1_9EClass.getESuperTypes().add(this.getInstruction());
    inst_B6EClass.getESuperTypes().add(this.getInstruction());
    inst_B24EClass.getESuperTypes().add(this.getInstruction());
    inst_X0EClass.getESuperTypes().add(this.getInstruction());
    inst_S1_14_S1_10EClass.getESuperTypes().add(this.getInstruction());
    readRegisterEClass.getESuperTypes().add(this.getInst_B6_S1_14());
    writeRegisterLowshelfEClass.getESuperTypes().add(this.getInst_B6_S1_14());
    writeRegisterHighshelfEClass.getESuperTypes().add(this.getInst_B6_S1_14());
    writeRegisterEClass.getESuperTypes().add(this.getInst_B6_S1_14());
    maxxEClass.getESuperTypes().add(this.getInst_B6_S1_14());
    readRegisterFilterEClass.getESuperTypes().add(this.getInst_B6_S1_14());
    mulxEClass.getESuperTypes().add(this.getInst_B6());
    ldaxEClass.getESuperTypes().add(this.getInst_B6());
    expEClass.getESuperTypes().add(this.getInst_S1_14_S1_10());
    logEClass.getESuperTypes().add(this.getInstruction());
    scaleOffsetEClass.getESuperTypes().add(this.getInst_S1_14_S1_10());
    writeDelayEClass.getESuperTypes().add(this.getInst_B15_S1_9());
    writeAllpassEClass.getESuperTypes().add(this.getInst_B15_S1_9());
    readDelayEClass.getESuperTypes().add(this.getInst_B15_S1_9());
    loadSinLFOEClass.getESuperTypes().add(this.getInstruction());
    loadRampLFOEClass.getESuperTypes().add(this.getInstruction());
    chorusReadDelayEClass.getESuperTypes().add(this.getInstruction());
    chorusReadValueEClass.getESuperTypes().add(this.getInstruction());
    chorusScaleOffsetEClass.getESuperTypes().add(this.getInstruction());
    readDelayPointerEClass.getESuperTypes().add(this.getInstruction());
    andEClass.getESuperTypes().add(this.getInst_B24());
    orEClass.getESuperTypes().add(this.getInst_B24());
    xorEClass.getESuperTypes().add(this.getInst_B24());
    jamEClass.getESuperTypes().add(this.getInstruction());
    clrEClass.getESuperTypes().add(this.getInst_X0());
    notEClass.getESuperTypes().add(this.getInst_X0());
    absaEClass.getESuperTypes().add(this.getInst_X0());
    skipEClass.getESuperTypes().add(this.getInstruction());

    // Initialize classes and features; add operations and parameters
    initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProgram_Name(), ecorePackage.getEString(), "name", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Pins(), this.getPin(), null, "pins", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Elements(), this.getSpinElement(), null, "elements", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pinEClass, Pin.class, "Pin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPin_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPin_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputPinEClass, InputPin.class, "InputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(outputPinEClass, OutputPin.class, "OutputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(audioInputEClass, AudioInput.class, "AudioInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(audioOutputEClass, AudioOutput.class, "AudioOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(controlInputEClass, ControlInput.class, "ControlInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(controlOutputEClass, ControlOutput.class, "ControlOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(spinElementEClass, SpinElement.class, "SpinElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(equateEClass, Equate.class, "Equate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEquate_Ename(), ecorePackage.getEString(), "ename", null, 0, 1, Equate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEquate_Value(), ecorePackage.getEString(), "value", null, 0, 1, Equate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEquate_Control(), ecorePackage.getEString(), "control", null, 0, 1, Equate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEquate_Label(), ecorePackage.getEString(), "label", null, 0, 1, Equate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEquate_Max(), ecorePackage.getEString(), "max", null, 0, 1, Equate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEquate_Offset(), ecorePackage.getEString(), "Offset", null, 0, 1, Equate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEquate_Func(), ecorePackage.getEString(), "Func", null, 0, 1, Equate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(memEClass, Mem.class, "Mem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMem_Buffer(), ecorePackage.getEString(), "buffer", null, 0, 1, Mem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMem_Length(), ecorePackage.getEString(), "length", null, 0, 1, Mem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(offsetEClass, Offset.class, "Offset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOffset_Name(), ecorePackage.getEString(), "name", null, 0, 1, Offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOffset_Length(), ecorePackage.getEInt(), "length", null, 0, 1, Offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComment_Remark(), ecorePackage.getEString(), "remark", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLabel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(macroEClass, Macro.class, "Macro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(isPinConnectedEClass, IsPinConnected.class, "IsPinConnected", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIsPinConnected_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, IsPinConnected.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(isElseEClass, IsElse.class, "IsElse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(isEndifEClass, IsEndif.class, "IsEndif", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(getInputDefaultEClass, GetInputDefault.class, "GetInputDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGetInputDefault_Name(), ecorePackage.getEString(), "name", null, 0, 1, GetInputDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetInputDefault_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, GetInputDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetInputDefault_Scale(), ecorePackage.getEString(), "scale", null, 0, 1, GetInputDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetInputDefault_DefaultVal(), ecorePackage.getEString(), "defaultVal", null, 0, 1, GetInputDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(getDelayScaleControlEClass, GetDelayScaleControl.class, "GetDelayScaleControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGetDelayScaleControl_Length(), ecorePackage.getEString(), "length", null, 0, 1, GetDelayScaleControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetDelayScaleControl_Buffer(), ecorePackage.getEString(), "buffer", null, 0, 1, GetDelayScaleControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetDelayScaleControl_Control(), ecorePackage.getEString(), "control", null, 0, 1, GetDelayScaleControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(getBaseAddressEClass, GetBaseAddress.class, "GetBaseAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(setOutputPinEClass, SetOutputPin.class, "SetOutputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSetOutputPin_PinName(), ecorePackage.getEString(), "pinName", null, 0, 1, SetOutputPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSetOutputPin_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, SetOutputPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inst_B6_S1_14EClass, Inst_B6_S1_14.class, "Inst_B6_S1_14", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInst_B6_S1_14_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, Inst_B6_S1_14.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInst_B6_S1_14_Arg2(), ecorePackage.getEString(), "arg2", null, 0, 1, Inst_B6_S1_14.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inst_B15_S1_9EClass, Inst_B15_S1_9.class, "Inst_B15_S1_9", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInst_B15_S1_9_Arg1(), this.getSPINMEM(), null, "arg1", null, 0, 1, Inst_B15_S1_9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInst_B15_S1_9_Arg2(), ecorePackage.getEString(), "arg2", null, 0, 1, Inst_B15_S1_9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inst_B6EClass, Inst_B6.class, "Inst_B6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInst_B6_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, Inst_B6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inst_B24EClass, Inst_B24.class, "Inst_B24", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInst_B24_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, Inst_B24.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inst_X0EClass, Inst_X0.class, "Inst_X0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inst_S1_14_S1_10EClass, Inst_S1_14_S1_10.class, "Inst_S1_14_S1_10", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInst_S1_14_S1_10_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, Inst_S1_14_S1_10.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInst_S1_14_S1_10_Arg2(), ecorePackage.getEString(), "arg2", null, 0, 1, Inst_S1_14_S1_10.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(readRegisterEClass, ReadRegister.class, "ReadRegister", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(writeRegisterLowshelfEClass, WriteRegisterLowshelf.class, "WriteRegisterLowshelf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(writeRegisterHighshelfEClass, WriteRegisterHighshelf.class, "WriteRegisterHighshelf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(writeRegisterEClass, WriteRegister.class, "WriteRegister", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(maxxEClass, Maxx.class, "Maxx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(readRegisterFilterEClass, ReadRegisterFilter.class, "ReadRegisterFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mulxEClass, Mulx.class, "Mulx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ldaxEClass, Ldax.class, "Ldax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expEClass, Exp.class, "Exp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(logEClass, Log.class, "Log", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLog_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLog_Arg2(), ecorePackage.getEString(), "arg2", null, 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scaleOffsetEClass, ScaleOffset.class, "ScaleOffset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(writeDelayEClass, WriteDelay.class, "WriteDelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(writeAllpassEClass, WriteAllpass.class, "WriteAllpass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(readDelayEClass, ReadDelay.class, "ReadDelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(loadSinLFOEClass, LoadSinLFO.class, "LoadSinLFO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLoadSinLFO_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, LoadSinLFO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadSinLFO_Arg2(), ecorePackage.getEInt(), "arg2", null, 0, 1, LoadSinLFO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadSinLFO_Arg3(), ecorePackage.getEInt(), "arg3", null, 0, 1, LoadSinLFO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loadRampLFOEClass, LoadRampLFO.class, "LoadRampLFO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLoadRampLFO_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, LoadRampLFO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadRampLFO_Arg2(), ecorePackage.getEInt(), "arg2", null, 0, 1, LoadRampLFO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadRampLFO_Arg3(), ecorePackage.getEInt(), "arg3", null, 0, 1, LoadRampLFO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chorusReadDelayEClass, ChorusReadDelay.class, "ChorusReadDelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChorusReadDelay_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, ChorusReadDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChorusReadDelay_Arg2(), ecorePackage.getEString(), "arg2", null, 0, 1, ChorusReadDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChorusReadDelay_Arg3(), this.getSPINMEM(), null, "arg3", null, 0, 1, ChorusReadDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chorusReadValueEClass, ChorusReadValue.class, "ChorusReadValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChorusReadValue_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, ChorusReadValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chorusScaleOffsetEClass, ChorusScaleOffset.class, "ChorusScaleOffset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChorusScaleOffset_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, ChorusScaleOffset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChorusScaleOffset_Arg2(), ecorePackage.getEString(), "arg2", null, 0, 1, ChorusScaleOffset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChorusScaleOffset_Arg3(), ecorePackage.getEString(), "arg3", null, 0, 1, ChorusScaleOffset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(readDelayPointerEClass, ReadDelayPointer.class, "ReadDelayPointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReadDelayPointer_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, ReadDelayPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xorEClass, Xor.class, "Xor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(jamEClass, Jam.class, "Jam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJam_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, Jam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(clrEClass, Clr.class, "Clr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(absaEClass, Absa.class, "Absa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(skipEClass, Skip.class, "Skip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSkip_Flags(), ecorePackage.getEString(), "flags", null, 0, 1, Skip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSkip_Label(), this.getLabel(), null, "label", null, 0, 1, Skip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spinmemEClass, com.holycityaudio.spincad.spinCAD.SPINMEM.class, "SPINMEM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSPINMEM_Buffer(), ecorePackage.getEString(), "buffer", null, 0, 1, com.holycityaudio.spincad.spinCAD.SPINMEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSPINMEM_Value(), ecorePackage.getEInt(), "value", null, 0, 1, com.holycityaudio.spincad.spinCAD.SPINMEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSPINMEM_Offset(), this.getOffset(), null, "offset", null, 0, 1, com.holycityaudio.spincad.spinCAD.SPINMEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SpinCADPackageImpl
