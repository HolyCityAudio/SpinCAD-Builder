/**
 */
package com.holycityaudio.spincad.spinCAD;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.holycityaudio.spincad.spinCAD.SpinCADFactory
 * @model kind="package"
 * @generated
 */
public interface SpinCADPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "spinCAD";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.holycityaudio.com/spincad/SpinCAD";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "spinCAD";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SpinCADPackage eINSTANCE = com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl.init();

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ProgramImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Pins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PINS = 1;

  /**
   * The feature id for the '<em><b>Controls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__CONTROLS = 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__ELEMENTS = 3;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.PinImpl <em>Pin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.PinImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getPin()
   * @generated
   */
  int PIN = 1;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIN__VAR_NAME = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIN__NAME = 1;

  /**
   * The number of structural features of the '<em>Pin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.InputPinImpl <em>Input Pin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.InputPinImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInputPin()
   * @generated
   */
  int INPUT_PIN = 2;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PIN__VAR_NAME = PIN__VAR_NAME;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PIN__NAME = PIN__NAME;

  /**
   * The number of structural features of the '<em>Input Pin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.OutputPinImpl <em>Output Pin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.OutputPinImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getOutputPin()
   * @generated
   */
  int OUTPUT_PIN = 3;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PIN__VAR_NAME = PIN__VAR_NAME;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PIN__NAME = PIN__NAME;

  /**
   * The number of structural features of the '<em>Output Pin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.AudioInputImpl <em>Audio Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.AudioInputImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getAudioInput()
   * @generated
   */
  int AUDIO_INPUT = 4;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO_INPUT__VAR_NAME = INPUT_PIN__VAR_NAME;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO_INPUT__NAME = INPUT_PIN__NAME;

  /**
   * The number of structural features of the '<em>Audio Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO_INPUT_FEATURE_COUNT = INPUT_PIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.AudioOutputImpl <em>Audio Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.AudioOutputImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getAudioOutput()
   * @generated
   */
  int AUDIO_OUTPUT = 5;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO_OUTPUT__VAR_NAME = OUTPUT_PIN__VAR_NAME;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO_OUTPUT__NAME = OUTPUT_PIN__NAME;

  /**
   * The number of structural features of the '<em>Audio Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO_OUTPUT_FEATURE_COUNT = OUTPUT_PIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ControlInputImpl <em>Control Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ControlInputImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getControlInput()
   * @generated
   */
  int CONTROL_INPUT = 6;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_INPUT__VAR_NAME = INPUT_PIN__VAR_NAME;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_INPUT__NAME = INPUT_PIN__NAME;

  /**
   * The number of structural features of the '<em>Control Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_INPUT_FEATURE_COUNT = INPUT_PIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ControlOutputImpl <em>Control Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ControlOutputImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getControlOutput()
   * @generated
   */
  int CONTROL_OUTPUT = 7;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_OUTPUT__VAR_NAME = OUTPUT_PIN__VAR_NAME;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_OUTPUT__NAME = OUTPUT_PIN__NAME;

  /**
   * The number of structural features of the '<em>Control Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_OUTPUT_FEATURE_COUNT = OUTPUT_PIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ControlImpl <em>Control</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ControlImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getControl()
   * @generated
   */
  int CONTROL = 8;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL__VAR_NAME = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL__LABEL = 1;

  /**
   * The number of structural features of the '<em>Control</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.SliderImpl <em>Slider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.SliderImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSlider()
   * @generated
   */
  int SLIDER = 9;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER__VAR_NAME = CONTROL__VAR_NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER__LABEL = CONTROL__LABEL;

  /**
   * The number of structural features of the '<em>Slider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.CheckBoxImpl <em>Check Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.CheckBoxImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getCheckBox()
   * @generated
   */
  int CHECK_BOX = 10;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__VAR_NAME = CONTROL__VAR_NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__LABEL = CONTROL__LABEL;

  /**
   * The number of structural features of the '<em>Check Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.controlLabelImpl <em>control Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.controlLabelImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getcontrolLabel()
   * @generated
   */
  int CONTROL_LABEL = 11;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_LABEL__VAR_NAME = CONTROL__VAR_NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_LABEL__LABEL = CONTROL__LABEL;

  /**
   * The number of structural features of the '<em>control Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_LABEL_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.SpinElementImpl <em>Spin Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinElementImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSpinElement()
   * @generated
   */
  int SPIN_ELEMENT = 12;

  /**
   * The number of structural features of the '<em>Spin Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.EquateImpl <em>Equate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.EquateImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getEquate()
   * @generated
   */
  int EQUATE = 13;

  /**
   * The feature id for the '<em><b>Ename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUATE__ENAME = SPIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUATE__VALUE = SPIN_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Equate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUATE_FEATURE_COUNT = SPIN_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.MemImpl <em>Mem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.MemImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getMem()
   * @generated
   */
  int MEM = 14;

  /**
   * The feature id for the '<em><b>Buffer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEM__BUFFER = SPIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEM__LENGTH = SPIN_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEM_FEATURE_COUNT = SPIN_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.OffsetImpl <em>Offset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.OffsetImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getOffset()
   * @generated
   */
  int OFFSET = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OFFSET__NAME = SPIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OFFSET__LENGTH = SPIN_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Offset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OFFSET_FEATURE_COUNT = SPIN_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.CommentImpl <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.CommentImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getComment()
   * @generated
   */
  int COMMENT = 16;

  /**
   * The feature id for the '<em><b>Remark</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__REMARK = SPIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_FEATURE_COUNT = SPIN_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.LabelImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__NAME = SPIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = SPIN_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.MacroImpl <em>Macro</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.MacroImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getMacro()
   * @generated
   */
  int MACRO = 18;

  /**
   * The number of structural features of the '<em>Macro</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACRO_FEATURE_COUNT = SPIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsPinConnectedImpl <em>Is Pin Connected</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.IsPinConnectedImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsPinConnected()
   * @generated
   */
  int IS_PIN_CONNECTED = 19;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_PIN_CONNECTED__ARG1 = MACRO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Is Pin Connected</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_PIN_CONNECTED_FEATURE_COUNT = MACRO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsElseImpl <em>Is Else</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.IsElseImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsElse()
   * @generated
   */
  int IS_ELSE = 20;

  /**
   * The number of structural features of the '<em>Is Else</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_ELSE_FEATURE_COUNT = MACRO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsEndifImpl <em>Is Endif</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.IsEndifImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsEndif()
   * @generated
   */
  int IS_ENDIF = 21;

  /**
   * The number of structural features of the '<em>Is Endif</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_ENDIF_FEATURE_COUNT = MACRO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.GetInputDefaultImpl <em>Get Input Default</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.GetInputDefaultImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getGetInputDefault()
   * @generated
   */
  int GET_INPUT_DEFAULT = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_INPUT_DEFAULT__NAME = MACRO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_INPUT_DEFAULT__VARIABLE = MACRO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Scale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_INPUT_DEFAULT__SCALE = MACRO_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Default Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_INPUT_DEFAULT__DEFAULT_VAL = MACRO_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Get Input Default</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_INPUT_DEFAULT_FEATURE_COUNT = MACRO_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.GetDelayScaleControlImpl <em>Get Delay Scale Control</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.GetDelayScaleControlImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getGetDelayScaleControl()
   * @generated
   */
  int GET_DELAY_SCALE_CONTROL = 23;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DELAY_SCALE_CONTROL__LENGTH = MACRO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Buffer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DELAY_SCALE_CONTROL__BUFFER = MACRO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Control</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DELAY_SCALE_CONTROL__CONTROL = MACRO_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Get Delay Scale Control</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DELAY_SCALE_CONTROL_FEATURE_COUNT = MACRO_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.GetBaseAddressImpl <em>Get Base Address</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.GetBaseAddressImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getGetBaseAddress()
   * @generated
   */
  int GET_BASE_ADDRESS = 24;

  /**
   * The number of structural features of the '<em>Get Base Address</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_BASE_ADDRESS_FEATURE_COUNT = MACRO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.SetOutputPinImpl <em>Set Output Pin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.SetOutputPinImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSetOutputPin()
   * @generated
   */
  int SET_OUTPUT_PIN = 25;

  /**
   * The feature id for the '<em><b>Pin Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_OUTPUT_PIN__PIN_NAME = MACRO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_OUTPUT_PIN__VAR_NAME = MACRO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Set Output Pin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_OUTPUT_PIN_FEATURE_COUNT = MACRO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.InstructionImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 26;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = SPIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_B6_S1_14Impl <em>Inst B6 S1 14</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.Inst_B6_S1_14Impl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_B6_S1_14()
   * @generated
   */
  int INST_B6_S1_14 = 27;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_B6_S1_14__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_B6_S1_14__ARG2 = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Inst B6 S1 14</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_B6_S1_14_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_B15_S1_9Impl <em>Inst B15 S1 9</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.Inst_B15_S1_9Impl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_B15_S1_9()
   * @generated
   */
  int INST_B15_S1_9 = 28;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_B15_S1_9__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_B15_S1_9__ARG2 = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Inst B15 S1 9</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_B15_S1_9_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_B6Impl <em>Inst B6</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.Inst_B6Impl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_B6()
   * @generated
   */
  int INST_B6 = 29;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_B6__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Inst B6</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_B6_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_B24Impl <em>Inst B24</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.Inst_B24Impl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_B24()
   * @generated
   */
  int INST_B24 = 30;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_B24__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Inst B24</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_B24_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_X0Impl <em>Inst X0</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.Inst_X0Impl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_X0()
   * @generated
   */
  int INST_X0 = 31;

  /**
   * The number of structural features of the '<em>Inst X0</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_X0_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_S1_14_S1_10Impl <em>Inst S1 14 S1 10</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.Inst_S1_14_S1_10Impl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_S1_14_S1_10()
   * @generated
   */
  int INST_S1_14_S1_10 = 32;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_S1_14_S1_10__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_S1_14_S1_10__ARG2 = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Inst S1 14 S1 10</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_S1_14_S1_10_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ReadRegisterImpl <em>Read Register</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ReadRegisterImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getReadRegister()
   * @generated
   */
  int READ_REGISTER = 33;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_REGISTER__ARG1 = INST_B6_S1_14__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_REGISTER__ARG2 = INST_B6_S1_14__ARG2;

  /**
   * The number of structural features of the '<em>Read Register</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_REGISTER_FEATURE_COUNT = INST_B6_S1_14_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.WriteRegisterLowshelfImpl <em>Write Register Lowshelf</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.WriteRegisterLowshelfImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getWriteRegisterLowshelf()
   * @generated
   */
  int WRITE_REGISTER_LOWSHELF = 34;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_REGISTER_LOWSHELF__ARG1 = INST_B6_S1_14__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_REGISTER_LOWSHELF__ARG2 = INST_B6_S1_14__ARG2;

  /**
   * The number of structural features of the '<em>Write Register Lowshelf</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_REGISTER_LOWSHELF_FEATURE_COUNT = INST_B6_S1_14_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.WriteRegisterHighshelfImpl <em>Write Register Highshelf</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.WriteRegisterHighshelfImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getWriteRegisterHighshelf()
   * @generated
   */
  int WRITE_REGISTER_HIGHSHELF = 35;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_REGISTER_HIGHSHELF__ARG1 = INST_B6_S1_14__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_REGISTER_HIGHSHELF__ARG2 = INST_B6_S1_14__ARG2;

  /**
   * The number of structural features of the '<em>Write Register Highshelf</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_REGISTER_HIGHSHELF_FEATURE_COUNT = INST_B6_S1_14_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.WriteRegisterImpl <em>Write Register</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.WriteRegisterImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getWriteRegister()
   * @generated
   */
  int WRITE_REGISTER = 36;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_REGISTER__ARG1 = INST_B6_S1_14__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_REGISTER__ARG2 = INST_B6_S1_14__ARG2;

  /**
   * The number of structural features of the '<em>Write Register</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_REGISTER_FEATURE_COUNT = INST_B6_S1_14_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.MaxxImpl <em>Maxx</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.MaxxImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getMaxx()
   * @generated
   */
  int MAXX = 37;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAXX__ARG1 = INST_B6_S1_14__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAXX__ARG2 = INST_B6_S1_14__ARG2;

  /**
   * The number of structural features of the '<em>Maxx</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAXX_FEATURE_COUNT = INST_B6_S1_14_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ReadRegisterFilterImpl <em>Read Register Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ReadRegisterFilterImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getReadRegisterFilter()
   * @generated
   */
  int READ_REGISTER_FILTER = 38;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_REGISTER_FILTER__ARG1 = INST_B6_S1_14__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_REGISTER_FILTER__ARG2 = INST_B6_S1_14__ARG2;

  /**
   * The number of structural features of the '<em>Read Register Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_REGISTER_FILTER_FEATURE_COUNT = INST_B6_S1_14_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.MulxImpl <em>Mulx</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.MulxImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getMulx()
   * @generated
   */
  int MULX = 39;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULX__ARG1 = INST_B6__ARG1;

  /**
   * The number of structural features of the '<em>Mulx</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULX_FEATURE_COUNT = INST_B6_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.LdaxImpl <em>Ldax</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.LdaxImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLdax()
   * @generated
   */
  int LDAX = 40;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAX__ARG1 = INST_B6__ARG1;

  /**
   * The number of structural features of the '<em>Ldax</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAX_FEATURE_COUNT = INST_B6_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ExpImpl <em>Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ExpImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getExp()
   * @generated
   */
  int EXP = 41;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__ARG1 = INST_S1_14_S1_10__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__ARG2 = INST_S1_14_S1_10__ARG2;

  /**
   * The number of structural features of the '<em>Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_FEATURE_COUNT = INST_S1_14_S1_10_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.LogImpl <em>Log</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.LogImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLog()
   * @generated
   */
  int LOG = 42;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG__ARG2 = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Log</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ScaleOffsetImpl <em>Scale Offset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ScaleOffsetImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getScaleOffset()
   * @generated
   */
  int SCALE_OFFSET = 43;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_OFFSET__ARG1 = INST_S1_14_S1_10__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_OFFSET__ARG2 = INST_S1_14_S1_10__ARG2;

  /**
   * The number of structural features of the '<em>Scale Offset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_OFFSET_FEATURE_COUNT = INST_S1_14_S1_10_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.WriteDelayImpl <em>Write Delay</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.WriteDelayImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getWriteDelay()
   * @generated
   */
  int WRITE_DELAY = 44;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_DELAY__ARG1 = INST_B15_S1_9__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_DELAY__ARG2 = INST_B15_S1_9__ARG2;

  /**
   * The number of structural features of the '<em>Write Delay</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_DELAY_FEATURE_COUNT = INST_B15_S1_9_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.WriteAllpassImpl <em>Write Allpass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.WriteAllpassImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getWriteAllpass()
   * @generated
   */
  int WRITE_ALLPASS = 45;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_ALLPASS__ARG1 = INST_B15_S1_9__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_ALLPASS__ARG2 = INST_B15_S1_9__ARG2;

  /**
   * The number of structural features of the '<em>Write Allpass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_ALLPASS_FEATURE_COUNT = INST_B15_S1_9_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ReadDelayImpl <em>Read Delay</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ReadDelayImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getReadDelay()
   * @generated
   */
  int READ_DELAY = 46;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_DELAY__ARG1 = INST_B15_S1_9__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_DELAY__ARG2 = INST_B15_S1_9__ARG2;

  /**
   * The number of structural features of the '<em>Read Delay</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_DELAY_FEATURE_COUNT = INST_B15_S1_9_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.LoadSinLFOImpl <em>Load Sin LFO</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.LoadSinLFOImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLoadSinLFO()
   * @generated
   */
  int LOAD_SIN_LFO = 47;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_SIN_LFO__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_SIN_LFO__ARG2 = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arg3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_SIN_LFO__ARG3 = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Load Sin LFO</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_SIN_LFO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.LoadRampLFOImpl <em>Load Ramp LFO</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.LoadRampLFOImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLoadRampLFO()
   * @generated
   */
  int LOAD_RAMP_LFO = 48;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RAMP_LFO__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RAMP_LFO__ARG2 = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arg3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RAMP_LFO__ARG3 = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Load Ramp LFO</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RAMP_LFO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ChorusReadDelayImpl <em>Chorus Read Delay</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ChorusReadDelayImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getChorusReadDelay()
   * @generated
   */
  int CHORUS_READ_DELAY = 49;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORUS_READ_DELAY__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORUS_READ_DELAY__ARG2 = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arg3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORUS_READ_DELAY__ARG3 = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Chorus Read Delay</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORUS_READ_DELAY_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ChorusReadValueImpl <em>Chorus Read Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ChorusReadValueImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getChorusReadValue()
   * @generated
   */
  int CHORUS_READ_VALUE = 50;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORUS_READ_VALUE__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Chorus Read Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORUS_READ_VALUE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ChorusScaleOffsetImpl <em>Chorus Scale Offset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ChorusScaleOffsetImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getChorusScaleOffset()
   * @generated
   */
  int CHORUS_SCALE_OFFSET = 51;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORUS_SCALE_OFFSET__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORUS_SCALE_OFFSET__ARG2 = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arg3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORUS_SCALE_OFFSET__ARG3 = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Chorus Scale Offset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORUS_SCALE_OFFSET_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ReadDelayPointerImpl <em>Read Delay Pointer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ReadDelayPointerImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getReadDelayPointer()
   * @generated
   */
  int READ_DELAY_POINTER = 52;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_DELAY_POINTER__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Read Delay Pointer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_DELAY_POINTER_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.AndImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getAnd()
   * @generated
   */
  int AND = 53;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__ARG1 = INST_B24__ARG1;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = INST_B24_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.OrImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getOr()
   * @generated
   */
  int OR = 54;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__ARG1 = INST_B24__ARG1;

  /**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = INST_B24_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.XorImpl <em>Xor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.XorImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getXor()
   * @generated
   */
  int XOR = 55;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR__ARG1 = INST_B24__ARG1;

  /**
   * The number of structural features of the '<em>Xor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_FEATURE_COUNT = INST_B24_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.JamImpl <em>Jam</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.JamImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getJam()
   * @generated
   */
  int JAM = 56;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAM__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Jam</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAM_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ClrImpl <em>Clr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ClrImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getClr()
   * @generated
   */
  int CLR = 57;

  /**
   * The number of structural features of the '<em>Clr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLR_FEATURE_COUNT = INST_X0_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.NotImpl <em>Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.NotImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getNot()
   * @generated
   */
  int NOT = 58;

  /**
   * The number of structural features of the '<em>Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_FEATURE_COUNT = INST_X0_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.AbsaImpl <em>Absa</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.AbsaImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getAbsa()
   * @generated
   */
  int ABSA = 59;

  /**
   * The number of structural features of the '<em>Absa</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSA_FEATURE_COUNT = INST_X0_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.SkipImpl <em>Skip</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.SkipImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSkip()
   * @generated
   */
  int SKIP = 60;

  /**
   * The feature id for the '<em><b>Flags</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKIP__FLAGS = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKIP__LABEL = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Skip</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKIP_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.SPINMEMImpl <em>SPINMEM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.SPINMEMImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSPINMEM()
   * @generated
   */
  int SPINMEM = 61;

  /**
   * The feature id for the '<em><b>Buffer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINMEM__BUFFER = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINMEM__VALUE = 1;

  /**
   * The feature id for the '<em><b>Offset</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINMEM__OFFSET = 2;

  /**
   * The number of structural features of the '<em>SPINMEM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINMEM_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Program#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Program#getName()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.holycityaudio.spincad.spinCAD.Program#getPins <em>Pins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pins</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Program#getPins()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Pins();

  /**
   * Returns the meta object for the containment reference list '{@link com.holycityaudio.spincad.spinCAD.Program#getControls <em>Controls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Controls</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Program#getControls()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Controls();

  /**
   * Returns the meta object for the containment reference list '{@link com.holycityaudio.spincad.spinCAD.Program#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Program#getElements()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Elements();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Pin <em>Pin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pin</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Pin
   * @generated
   */
  EClass getPin();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Pin#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Pin#getVarName()
   * @see #getPin()
   * @generated
   */
  EAttribute getPin_VarName();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Pin#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Pin#getName()
   * @see #getPin()
   * @generated
   */
  EAttribute getPin_Name();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.InputPin <em>Input Pin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Pin</em>'.
   * @see com.holycityaudio.spincad.spinCAD.InputPin
   * @generated
   */
  EClass getInputPin();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.OutputPin <em>Output Pin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Pin</em>'.
   * @see com.holycityaudio.spincad.spinCAD.OutputPin
   * @generated
   */
  EClass getOutputPin();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.AudioInput <em>Audio Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Audio Input</em>'.
   * @see com.holycityaudio.spincad.spinCAD.AudioInput
   * @generated
   */
  EClass getAudioInput();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.AudioOutput <em>Audio Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Audio Output</em>'.
   * @see com.holycityaudio.spincad.spinCAD.AudioOutput
   * @generated
   */
  EClass getAudioOutput();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ControlInput <em>Control Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Input</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ControlInput
   * @generated
   */
  EClass getControlInput();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ControlOutput <em>Control Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Output</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ControlOutput
   * @generated
   */
  EClass getControlOutput();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Control <em>Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Control
   * @generated
   */
  EClass getControl();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Control#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Control#getVarName()
   * @see #getControl()
   * @generated
   */
  EAttribute getControl_VarName();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Control#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Control#getLabel()
   * @see #getControl()
   * @generated
   */
  EAttribute getControl_Label();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Slider <em>Slider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slider</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Slider
   * @generated
   */
  EClass getSlider();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.CheckBox <em>Check Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check Box</em>'.
   * @see com.holycityaudio.spincad.spinCAD.CheckBox
   * @generated
   */
  EClass getCheckBox();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.controlLabel <em>control Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>control Label</em>'.
   * @see com.holycityaudio.spincad.spinCAD.controlLabel
   * @generated
   */
  EClass getcontrolLabel();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.SpinElement <em>Spin Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spin Element</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinElement
   * @generated
   */
  EClass getSpinElement();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Equate <em>Equate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equate</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Equate
   * @generated
   */
  EClass getEquate();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Equate#getEname <em>Ename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ename</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Equate#getEname()
   * @see #getEquate()
   * @generated
   */
  EAttribute getEquate_Ename();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Equate#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Equate#getValue()
   * @see #getEquate()
   * @generated
   */
  EAttribute getEquate_Value();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Mem <em>Mem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mem</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Mem
   * @generated
   */
  EClass getMem();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Mem#getBuffer <em>Buffer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Buffer</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Mem#getBuffer()
   * @see #getMem()
   * @generated
   */
  EAttribute getMem_Buffer();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Mem#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Mem#getLength()
   * @see #getMem()
   * @generated
   */
  EAttribute getMem_Length();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Offset <em>Offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Offset</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Offset
   * @generated
   */
  EClass getOffset();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Offset#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Offset#getName()
   * @see #getOffset()
   * @generated
   */
  EAttribute getOffset_Name();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Offset#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Offset#getLength()
   * @see #getOffset()
   * @generated
   */
  EAttribute getOffset_Length();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Comment
   * @generated
   */
  EClass getComment();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Comment#getRemark <em>Remark</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Remark</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Comment#getRemark()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_Remark();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Label#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Label#getName()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Name();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Macro <em>Macro</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Macro</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Macro
   * @generated
   */
  EClass getMacro();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.IsPinConnected <em>Is Pin Connected</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is Pin Connected</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsPinConnected
   * @generated
   */
  EClass getIsPinConnected();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.IsPinConnected#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsPinConnected#getArg1()
   * @see #getIsPinConnected()
   * @generated
   */
  EAttribute getIsPinConnected_Arg1();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.IsElse <em>Is Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is Else</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsElse
   * @generated
   */
  EClass getIsElse();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.IsEndif <em>Is Endif</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is Endif</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsEndif
   * @generated
   */
  EClass getIsEndif();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.GetInputDefault <em>Get Input Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Input Default</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetInputDefault
   * @generated
   */
  EClass getGetInputDefault();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.GetInputDefault#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetInputDefault#getName()
   * @see #getGetInputDefault()
   * @generated
   */
  EAttribute getGetInputDefault_Name();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.GetInputDefault#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetInputDefault#getVariable()
   * @see #getGetInputDefault()
   * @generated
   */
  EAttribute getGetInputDefault_Variable();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.GetInputDefault#getScale <em>Scale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scale</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetInputDefault#getScale()
   * @see #getGetInputDefault()
   * @generated
   */
  EAttribute getGetInputDefault_Scale();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.GetInputDefault#getDefaultVal <em>Default Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Val</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetInputDefault#getDefaultVal()
   * @see #getGetInputDefault()
   * @generated
   */
  EAttribute getGetInputDefault_DefaultVal();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.GetDelayScaleControl <em>Get Delay Scale Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Delay Scale Control</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetDelayScaleControl
   * @generated
   */
  EClass getGetDelayScaleControl();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.GetDelayScaleControl#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetDelayScaleControl#getLength()
   * @see #getGetDelayScaleControl()
   * @generated
   */
  EAttribute getGetDelayScaleControl_Length();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.GetDelayScaleControl#getBuffer <em>Buffer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Buffer</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetDelayScaleControl#getBuffer()
   * @see #getGetDelayScaleControl()
   * @generated
   */
  EAttribute getGetDelayScaleControl_Buffer();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.GetDelayScaleControl#getControl <em>Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Control</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetDelayScaleControl#getControl()
   * @see #getGetDelayScaleControl()
   * @generated
   */
  EAttribute getGetDelayScaleControl_Control();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.GetBaseAddress <em>Get Base Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Base Address</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetBaseAddress
   * @generated
   */
  EClass getGetBaseAddress();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.SetOutputPin <em>Set Output Pin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Output Pin</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SetOutputPin
   * @generated
   */
  EClass getSetOutputPin();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SetOutputPin#getPinName <em>Pin Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pin Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SetOutputPin#getPinName()
   * @see #getSetOutputPin()
   * @generated
   */
  EAttribute getSetOutputPin_PinName();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SetOutputPin#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SetOutputPin#getVarName()
   * @see #getSetOutputPin()
   * @generated
   */
  EAttribute getSetOutputPin_VarName();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Inst_B6_S1_14 <em>Inst B6 S1 14</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inst B6 S1 14</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B6_S1_14
   * @generated
   */
  EClass getInst_B6_S1_14();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Inst_B6_S1_14#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B6_S1_14#getArg1()
   * @see #getInst_B6_S1_14()
   * @generated
   */
  EAttribute getInst_B6_S1_14_Arg1();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Inst_B6_S1_14#getArg2 <em>Arg2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg2</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B6_S1_14#getArg2()
   * @see #getInst_B6_S1_14()
   * @generated
   */
  EAttribute getInst_B6_S1_14_Arg2();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9 <em>Inst B15 S1 9</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inst B15 S1 9</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9
   * @generated
   */
  EClass getInst_B15_S1_9();

  /**
   * Returns the meta object for the containment reference '{@link com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9#getArg1()
   * @see #getInst_B15_S1_9()
   * @generated
   */
  EReference getInst_B15_S1_9_Arg1();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9#getArg2 <em>Arg2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg2</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9#getArg2()
   * @see #getInst_B15_S1_9()
   * @generated
   */
  EAttribute getInst_B15_S1_9_Arg2();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Inst_B6 <em>Inst B6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inst B6</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B6
   * @generated
   */
  EClass getInst_B6();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Inst_B6#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B6#getArg1()
   * @see #getInst_B6()
   * @generated
   */
  EAttribute getInst_B6_Arg1();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Inst_B24 <em>Inst B24</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inst B24</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B24
   * @generated
   */
  EClass getInst_B24();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Inst_B24#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B24#getArg1()
   * @see #getInst_B24()
   * @generated
   */
  EAttribute getInst_B24_Arg1();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Inst_X0 <em>Inst X0</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inst X0</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_X0
   * @generated
   */
  EClass getInst_X0();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Inst_S1_14_S1_10 <em>Inst S1 14 S1 10</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inst S1 14 S1 10</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_S1_14_S1_10
   * @generated
   */
  EClass getInst_S1_14_S1_10();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Inst_S1_14_S1_10#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_S1_14_S1_10#getArg1()
   * @see #getInst_S1_14_S1_10()
   * @generated
   */
  EAttribute getInst_S1_14_S1_10_Arg1();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Inst_S1_14_S1_10#getArg2 <em>Arg2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg2</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_S1_14_S1_10#getArg2()
   * @see #getInst_S1_14_S1_10()
   * @generated
   */
  EAttribute getInst_S1_14_S1_10_Arg2();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ReadRegister <em>Read Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Read Register</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ReadRegister
   * @generated
   */
  EClass getReadRegister();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.WriteRegisterLowshelf <em>Write Register Lowshelf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Write Register Lowshelf</em>'.
   * @see com.holycityaudio.spincad.spinCAD.WriteRegisterLowshelf
   * @generated
   */
  EClass getWriteRegisterLowshelf();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.WriteRegisterHighshelf <em>Write Register Highshelf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Write Register Highshelf</em>'.
   * @see com.holycityaudio.spincad.spinCAD.WriteRegisterHighshelf
   * @generated
   */
  EClass getWriteRegisterHighshelf();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.WriteRegister <em>Write Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Write Register</em>'.
   * @see com.holycityaudio.spincad.spinCAD.WriteRegister
   * @generated
   */
  EClass getWriteRegister();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Maxx <em>Maxx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Maxx</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Maxx
   * @generated
   */
  EClass getMaxx();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ReadRegisterFilter <em>Read Register Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Read Register Filter</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ReadRegisterFilter
   * @generated
   */
  EClass getReadRegisterFilter();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Mulx <em>Mulx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mulx</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Mulx
   * @generated
   */
  EClass getMulx();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Ldax <em>Ldax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ldax</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Ldax
   * @generated
   */
  EClass getLdax();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Exp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Exp
   * @generated
   */
  EClass getExp();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Log <em>Log</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Log</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Log
   * @generated
   */
  EClass getLog();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Log#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Log#getArg1()
   * @see #getLog()
   * @generated
   */
  EAttribute getLog_Arg1();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Log#getArg2 <em>Arg2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg2</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Log#getArg2()
   * @see #getLog()
   * @generated
   */
  EAttribute getLog_Arg2();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ScaleOffset <em>Scale Offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scale Offset</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ScaleOffset
   * @generated
   */
  EClass getScaleOffset();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.WriteDelay <em>Write Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Write Delay</em>'.
   * @see com.holycityaudio.spincad.spinCAD.WriteDelay
   * @generated
   */
  EClass getWriteDelay();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.WriteAllpass <em>Write Allpass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Write Allpass</em>'.
   * @see com.holycityaudio.spincad.spinCAD.WriteAllpass
   * @generated
   */
  EClass getWriteAllpass();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ReadDelay <em>Read Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Read Delay</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ReadDelay
   * @generated
   */
  EClass getReadDelay();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.LoadSinLFO <em>Load Sin LFO</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Load Sin LFO</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LoadSinLFO
   * @generated
   */
  EClass getLoadSinLFO();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LoadSinLFO#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LoadSinLFO#getArg1()
   * @see #getLoadSinLFO()
   * @generated
   */
  EAttribute getLoadSinLFO_Arg1();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LoadSinLFO#getArg2 <em>Arg2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg2</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LoadSinLFO#getArg2()
   * @see #getLoadSinLFO()
   * @generated
   */
  EAttribute getLoadSinLFO_Arg2();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LoadSinLFO#getArg3 <em>Arg3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg3</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LoadSinLFO#getArg3()
   * @see #getLoadSinLFO()
   * @generated
   */
  EAttribute getLoadSinLFO_Arg3();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.LoadRampLFO <em>Load Ramp LFO</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Load Ramp LFO</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LoadRampLFO
   * @generated
   */
  EClass getLoadRampLFO();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LoadRampLFO#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LoadRampLFO#getArg1()
   * @see #getLoadRampLFO()
   * @generated
   */
  EAttribute getLoadRampLFO_Arg1();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LoadRampLFO#getArg2 <em>Arg2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg2</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LoadRampLFO#getArg2()
   * @see #getLoadRampLFO()
   * @generated
   */
  EAttribute getLoadRampLFO_Arg2();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LoadRampLFO#getArg3 <em>Arg3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg3</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LoadRampLFO#getArg3()
   * @see #getLoadRampLFO()
   * @generated
   */
  EAttribute getLoadRampLFO_Arg3();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ChorusReadDelay <em>Chorus Read Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chorus Read Delay</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ChorusReadDelay
   * @generated
   */
  EClass getChorusReadDelay();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.ChorusReadDelay#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ChorusReadDelay#getArg1()
   * @see #getChorusReadDelay()
   * @generated
   */
  EAttribute getChorusReadDelay_Arg1();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.ChorusReadDelay#getArg2 <em>Arg2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg2</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ChorusReadDelay#getArg2()
   * @see #getChorusReadDelay()
   * @generated
   */
  EAttribute getChorusReadDelay_Arg2();

  /**
   * Returns the meta object for the containment reference '{@link com.holycityaudio.spincad.spinCAD.ChorusReadDelay#getArg3 <em>Arg3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg3</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ChorusReadDelay#getArg3()
   * @see #getChorusReadDelay()
   * @generated
   */
  EReference getChorusReadDelay_Arg3();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ChorusReadValue <em>Chorus Read Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chorus Read Value</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ChorusReadValue
   * @generated
   */
  EClass getChorusReadValue();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.ChorusReadValue#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ChorusReadValue#getArg1()
   * @see #getChorusReadValue()
   * @generated
   */
  EAttribute getChorusReadValue_Arg1();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ChorusScaleOffset <em>Chorus Scale Offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chorus Scale Offset</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ChorusScaleOffset
   * @generated
   */
  EClass getChorusScaleOffset();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.ChorusScaleOffset#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ChorusScaleOffset#getArg1()
   * @see #getChorusScaleOffset()
   * @generated
   */
  EAttribute getChorusScaleOffset_Arg1();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.ChorusScaleOffset#getArg2 <em>Arg2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg2</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ChorusScaleOffset#getArg2()
   * @see #getChorusScaleOffset()
   * @generated
   */
  EAttribute getChorusScaleOffset_Arg2();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.ChorusScaleOffset#getArg3 <em>Arg3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg3</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ChorusScaleOffset#getArg3()
   * @see #getChorusScaleOffset()
   * @generated
   */
  EAttribute getChorusScaleOffset_Arg3();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ReadDelayPointer <em>Read Delay Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Read Delay Pointer</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ReadDelayPointer
   * @generated
   */
  EClass getReadDelayPointer();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.ReadDelayPointer#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ReadDelayPointer#getArg1()
   * @see #getReadDelayPointer()
   * @generated
   */
  EAttribute getReadDelayPointer_Arg1();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see com.holycityaudio.spincad.spinCAD.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Or
   * @generated
   */
  EClass getOr();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Xor <em>Xor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Xor</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Xor
   * @generated
   */
  EClass getXor();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Jam <em>Jam</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jam</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Jam
   * @generated
   */
  EClass getJam();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Jam#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Jam#getArg1()
   * @see #getJam()
   * @generated
   */
  EAttribute getJam_Arg1();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Clr <em>Clr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clr</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Clr
   * @generated
   */
  EClass getClr();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Not
   * @generated
   */
  EClass getNot();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Absa <em>Absa</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Absa</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Absa
   * @generated
   */
  EClass getAbsa();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Skip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Skip</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Skip
   * @generated
   */
  EClass getSkip();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Skip#getFlags <em>Flags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flags</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Skip#getFlags()
   * @see #getSkip()
   * @generated
   */
  EAttribute getSkip_Flags();

  /**
   * Returns the meta object for the reference '{@link com.holycityaudio.spincad.spinCAD.Skip#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Label</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Skip#getLabel()
   * @see #getSkip()
   * @generated
   */
  EReference getSkip_Label();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.SPINMEM <em>SPINMEM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SPINMEM</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SPINMEM
   * @generated
   */
  EClass getSPINMEM();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SPINMEM#getBuffer <em>Buffer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Buffer</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SPINMEM#getBuffer()
   * @see #getSPINMEM()
   * @generated
   */
  EAttribute getSPINMEM_Buffer();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SPINMEM#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SPINMEM#getValue()
   * @see #getSPINMEM()
   * @generated
   */
  EAttribute getSPINMEM_Value();

  /**
   * Returns the meta object for the reference '{@link com.holycityaudio.spincad.spinCAD.SPINMEM#getOffset <em>Offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Offset</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SPINMEM#getOffset()
   * @see #getSPINMEM()
   * @generated
   */
  EReference getSPINMEM_Offset();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SpinCADFactory getSpinCADFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ProgramImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

    /**
     * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__PINS = eINSTANCE.getProgram_Pins();

    /**
     * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__CONTROLS = eINSTANCE.getProgram_Controls();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__ELEMENTS = eINSTANCE.getProgram_Elements();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.PinImpl <em>Pin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.PinImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getPin()
     * @generated
     */
    EClass PIN = eINSTANCE.getPin();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PIN__VAR_NAME = eINSTANCE.getPin_VarName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PIN__NAME = eINSTANCE.getPin_Name();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.InputPinImpl <em>Input Pin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.InputPinImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInputPin()
     * @generated
     */
    EClass INPUT_PIN = eINSTANCE.getInputPin();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.OutputPinImpl <em>Output Pin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.OutputPinImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getOutputPin()
     * @generated
     */
    EClass OUTPUT_PIN = eINSTANCE.getOutputPin();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.AudioInputImpl <em>Audio Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.AudioInputImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getAudioInput()
     * @generated
     */
    EClass AUDIO_INPUT = eINSTANCE.getAudioInput();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.AudioOutputImpl <em>Audio Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.AudioOutputImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getAudioOutput()
     * @generated
     */
    EClass AUDIO_OUTPUT = eINSTANCE.getAudioOutput();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ControlInputImpl <em>Control Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ControlInputImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getControlInput()
     * @generated
     */
    EClass CONTROL_INPUT = eINSTANCE.getControlInput();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ControlOutputImpl <em>Control Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ControlOutputImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getControlOutput()
     * @generated
     */
    EClass CONTROL_OUTPUT = eINSTANCE.getControlOutput();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ControlImpl <em>Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ControlImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getControl()
     * @generated
     */
    EClass CONTROL = eINSTANCE.getControl();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL__VAR_NAME = eINSTANCE.getControl_VarName();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL__LABEL = eINSTANCE.getControl_Label();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.SliderImpl <em>Slider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.SliderImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSlider()
     * @generated
     */
    EClass SLIDER = eINSTANCE.getSlider();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.CheckBoxImpl <em>Check Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.CheckBoxImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getCheckBox()
     * @generated
     */
    EClass CHECK_BOX = eINSTANCE.getCheckBox();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.controlLabelImpl <em>control Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.controlLabelImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getcontrolLabel()
     * @generated
     */
    EClass CONTROL_LABEL = eINSTANCE.getcontrolLabel();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.SpinElementImpl <em>Spin Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinElementImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSpinElement()
     * @generated
     */
    EClass SPIN_ELEMENT = eINSTANCE.getSpinElement();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.EquateImpl <em>Equate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.EquateImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getEquate()
     * @generated
     */
    EClass EQUATE = eINSTANCE.getEquate();

    /**
     * The meta object literal for the '<em><b>Ename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUATE__ENAME = eINSTANCE.getEquate_Ename();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUATE__VALUE = eINSTANCE.getEquate_Value();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.MemImpl <em>Mem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.MemImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getMem()
     * @generated
     */
    EClass MEM = eINSTANCE.getMem();

    /**
     * The meta object literal for the '<em><b>Buffer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEM__BUFFER = eINSTANCE.getMem_Buffer();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEM__LENGTH = eINSTANCE.getMem_Length();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.OffsetImpl <em>Offset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.OffsetImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getOffset()
     * @generated
     */
    EClass OFFSET = eINSTANCE.getOffset();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OFFSET__NAME = eINSTANCE.getOffset_Name();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OFFSET__LENGTH = eINSTANCE.getOffset_Length();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.CommentImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getComment()
     * @generated
     */
    EClass COMMENT = eINSTANCE.getComment();

    /**
     * The meta object literal for the '<em><b>Remark</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__REMARK = eINSTANCE.getComment_Remark();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.LabelImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__NAME = eINSTANCE.getLabel_Name();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.MacroImpl <em>Macro</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.MacroImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getMacro()
     * @generated
     */
    EClass MACRO = eINSTANCE.getMacro();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsPinConnectedImpl <em>Is Pin Connected</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.IsPinConnectedImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsPinConnected()
     * @generated
     */
    EClass IS_PIN_CONNECTED = eINSTANCE.getIsPinConnected();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_PIN_CONNECTED__ARG1 = eINSTANCE.getIsPinConnected_Arg1();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsElseImpl <em>Is Else</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.IsElseImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsElse()
     * @generated
     */
    EClass IS_ELSE = eINSTANCE.getIsElse();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsEndifImpl <em>Is Endif</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.IsEndifImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsEndif()
     * @generated
     */
    EClass IS_ENDIF = eINSTANCE.getIsEndif();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.GetInputDefaultImpl <em>Get Input Default</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.GetInputDefaultImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getGetInputDefault()
     * @generated
     */
    EClass GET_INPUT_DEFAULT = eINSTANCE.getGetInputDefault();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_INPUT_DEFAULT__NAME = eINSTANCE.getGetInputDefault_Name();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_INPUT_DEFAULT__VARIABLE = eINSTANCE.getGetInputDefault_Variable();

    /**
     * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_INPUT_DEFAULT__SCALE = eINSTANCE.getGetInputDefault_Scale();

    /**
     * The meta object literal for the '<em><b>Default Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_INPUT_DEFAULT__DEFAULT_VAL = eINSTANCE.getGetInputDefault_DefaultVal();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.GetDelayScaleControlImpl <em>Get Delay Scale Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.GetDelayScaleControlImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getGetDelayScaleControl()
     * @generated
     */
    EClass GET_DELAY_SCALE_CONTROL = eINSTANCE.getGetDelayScaleControl();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_DELAY_SCALE_CONTROL__LENGTH = eINSTANCE.getGetDelayScaleControl_Length();

    /**
     * The meta object literal for the '<em><b>Buffer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_DELAY_SCALE_CONTROL__BUFFER = eINSTANCE.getGetDelayScaleControl_Buffer();

    /**
     * The meta object literal for the '<em><b>Control</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_DELAY_SCALE_CONTROL__CONTROL = eINSTANCE.getGetDelayScaleControl_Control();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.GetBaseAddressImpl <em>Get Base Address</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.GetBaseAddressImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getGetBaseAddress()
     * @generated
     */
    EClass GET_BASE_ADDRESS = eINSTANCE.getGetBaseAddress();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.SetOutputPinImpl <em>Set Output Pin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.SetOutputPinImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSetOutputPin()
     * @generated
     */
    EClass SET_OUTPUT_PIN = eINSTANCE.getSetOutputPin();

    /**
     * The meta object literal for the '<em><b>Pin Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_OUTPUT_PIN__PIN_NAME = eINSTANCE.getSetOutputPin_PinName();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_OUTPUT_PIN__VAR_NAME = eINSTANCE.getSetOutputPin_VarName();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.InstructionImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_B6_S1_14Impl <em>Inst B6 S1 14</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.Inst_B6_S1_14Impl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_B6_S1_14()
     * @generated
     */
    EClass INST_B6_S1_14 = eINSTANCE.getInst_B6_S1_14();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INST_B6_S1_14__ARG1 = eINSTANCE.getInst_B6_S1_14_Arg1();

    /**
     * The meta object literal for the '<em><b>Arg2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INST_B6_S1_14__ARG2 = eINSTANCE.getInst_B6_S1_14_Arg2();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_B15_S1_9Impl <em>Inst B15 S1 9</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.Inst_B15_S1_9Impl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_B15_S1_9()
     * @generated
     */
    EClass INST_B15_S1_9 = eINSTANCE.getInst_B15_S1_9();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INST_B15_S1_9__ARG1 = eINSTANCE.getInst_B15_S1_9_Arg1();

    /**
     * The meta object literal for the '<em><b>Arg2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INST_B15_S1_9__ARG2 = eINSTANCE.getInst_B15_S1_9_Arg2();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_B6Impl <em>Inst B6</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.Inst_B6Impl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_B6()
     * @generated
     */
    EClass INST_B6 = eINSTANCE.getInst_B6();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INST_B6__ARG1 = eINSTANCE.getInst_B6_Arg1();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_B24Impl <em>Inst B24</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.Inst_B24Impl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_B24()
     * @generated
     */
    EClass INST_B24 = eINSTANCE.getInst_B24();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INST_B24__ARG1 = eINSTANCE.getInst_B24_Arg1();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_X0Impl <em>Inst X0</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.Inst_X0Impl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_X0()
     * @generated
     */
    EClass INST_X0 = eINSTANCE.getInst_X0();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_S1_14_S1_10Impl <em>Inst S1 14 S1 10</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.Inst_S1_14_S1_10Impl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_S1_14_S1_10()
     * @generated
     */
    EClass INST_S1_14_S1_10 = eINSTANCE.getInst_S1_14_S1_10();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INST_S1_14_S1_10__ARG1 = eINSTANCE.getInst_S1_14_S1_10_Arg1();

    /**
     * The meta object literal for the '<em><b>Arg2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INST_S1_14_S1_10__ARG2 = eINSTANCE.getInst_S1_14_S1_10_Arg2();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ReadRegisterImpl <em>Read Register</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ReadRegisterImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getReadRegister()
     * @generated
     */
    EClass READ_REGISTER = eINSTANCE.getReadRegister();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.WriteRegisterLowshelfImpl <em>Write Register Lowshelf</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.WriteRegisterLowshelfImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getWriteRegisterLowshelf()
     * @generated
     */
    EClass WRITE_REGISTER_LOWSHELF = eINSTANCE.getWriteRegisterLowshelf();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.WriteRegisterHighshelfImpl <em>Write Register Highshelf</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.WriteRegisterHighshelfImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getWriteRegisterHighshelf()
     * @generated
     */
    EClass WRITE_REGISTER_HIGHSHELF = eINSTANCE.getWriteRegisterHighshelf();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.WriteRegisterImpl <em>Write Register</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.WriteRegisterImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getWriteRegister()
     * @generated
     */
    EClass WRITE_REGISTER = eINSTANCE.getWriteRegister();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.MaxxImpl <em>Maxx</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.MaxxImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getMaxx()
     * @generated
     */
    EClass MAXX = eINSTANCE.getMaxx();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ReadRegisterFilterImpl <em>Read Register Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ReadRegisterFilterImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getReadRegisterFilter()
     * @generated
     */
    EClass READ_REGISTER_FILTER = eINSTANCE.getReadRegisterFilter();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.MulxImpl <em>Mulx</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.MulxImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getMulx()
     * @generated
     */
    EClass MULX = eINSTANCE.getMulx();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.LdaxImpl <em>Ldax</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.LdaxImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLdax()
     * @generated
     */
    EClass LDAX = eINSTANCE.getLdax();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ExpImpl <em>Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ExpImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getExp()
     * @generated
     */
    EClass EXP = eINSTANCE.getExp();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.LogImpl <em>Log</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.LogImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLog()
     * @generated
     */
    EClass LOG = eINSTANCE.getLog();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG__ARG1 = eINSTANCE.getLog_Arg1();

    /**
     * The meta object literal for the '<em><b>Arg2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG__ARG2 = eINSTANCE.getLog_Arg2();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ScaleOffsetImpl <em>Scale Offset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ScaleOffsetImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getScaleOffset()
     * @generated
     */
    EClass SCALE_OFFSET = eINSTANCE.getScaleOffset();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.WriteDelayImpl <em>Write Delay</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.WriteDelayImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getWriteDelay()
     * @generated
     */
    EClass WRITE_DELAY = eINSTANCE.getWriteDelay();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.WriteAllpassImpl <em>Write Allpass</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.WriteAllpassImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getWriteAllpass()
     * @generated
     */
    EClass WRITE_ALLPASS = eINSTANCE.getWriteAllpass();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ReadDelayImpl <em>Read Delay</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ReadDelayImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getReadDelay()
     * @generated
     */
    EClass READ_DELAY = eINSTANCE.getReadDelay();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.LoadSinLFOImpl <em>Load Sin LFO</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.LoadSinLFOImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLoadSinLFO()
     * @generated
     */
    EClass LOAD_SIN_LFO = eINSTANCE.getLoadSinLFO();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_SIN_LFO__ARG1 = eINSTANCE.getLoadSinLFO_Arg1();

    /**
     * The meta object literal for the '<em><b>Arg2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_SIN_LFO__ARG2 = eINSTANCE.getLoadSinLFO_Arg2();

    /**
     * The meta object literal for the '<em><b>Arg3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_SIN_LFO__ARG3 = eINSTANCE.getLoadSinLFO_Arg3();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.LoadRampLFOImpl <em>Load Ramp LFO</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.LoadRampLFOImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLoadRampLFO()
     * @generated
     */
    EClass LOAD_RAMP_LFO = eINSTANCE.getLoadRampLFO();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_RAMP_LFO__ARG1 = eINSTANCE.getLoadRampLFO_Arg1();

    /**
     * The meta object literal for the '<em><b>Arg2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_RAMP_LFO__ARG2 = eINSTANCE.getLoadRampLFO_Arg2();

    /**
     * The meta object literal for the '<em><b>Arg3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_RAMP_LFO__ARG3 = eINSTANCE.getLoadRampLFO_Arg3();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ChorusReadDelayImpl <em>Chorus Read Delay</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ChorusReadDelayImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getChorusReadDelay()
     * @generated
     */
    EClass CHORUS_READ_DELAY = eINSTANCE.getChorusReadDelay();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHORUS_READ_DELAY__ARG1 = eINSTANCE.getChorusReadDelay_Arg1();

    /**
     * The meta object literal for the '<em><b>Arg2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHORUS_READ_DELAY__ARG2 = eINSTANCE.getChorusReadDelay_Arg2();

    /**
     * The meta object literal for the '<em><b>Arg3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHORUS_READ_DELAY__ARG3 = eINSTANCE.getChorusReadDelay_Arg3();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ChorusReadValueImpl <em>Chorus Read Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ChorusReadValueImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getChorusReadValue()
     * @generated
     */
    EClass CHORUS_READ_VALUE = eINSTANCE.getChorusReadValue();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHORUS_READ_VALUE__ARG1 = eINSTANCE.getChorusReadValue_Arg1();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ChorusScaleOffsetImpl <em>Chorus Scale Offset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ChorusScaleOffsetImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getChorusScaleOffset()
     * @generated
     */
    EClass CHORUS_SCALE_OFFSET = eINSTANCE.getChorusScaleOffset();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHORUS_SCALE_OFFSET__ARG1 = eINSTANCE.getChorusScaleOffset_Arg1();

    /**
     * The meta object literal for the '<em><b>Arg2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHORUS_SCALE_OFFSET__ARG2 = eINSTANCE.getChorusScaleOffset_Arg2();

    /**
     * The meta object literal for the '<em><b>Arg3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHORUS_SCALE_OFFSET__ARG3 = eINSTANCE.getChorusScaleOffset_Arg3();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ReadDelayPointerImpl <em>Read Delay Pointer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ReadDelayPointerImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getReadDelayPointer()
     * @generated
     */
    EClass READ_DELAY_POINTER = eINSTANCE.getReadDelayPointer();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READ_DELAY_POINTER__ARG1 = eINSTANCE.getReadDelayPointer_Arg1();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.AndImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getAnd()
     * @generated
     */
    EClass AND = eINSTANCE.getAnd();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.OrImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getOr()
     * @generated
     */
    EClass OR = eINSTANCE.getOr();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.XorImpl <em>Xor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.XorImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getXor()
     * @generated
     */
    EClass XOR = eINSTANCE.getXor();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.JamImpl <em>Jam</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.JamImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getJam()
     * @generated
     */
    EClass JAM = eINSTANCE.getJam();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAM__ARG1 = eINSTANCE.getJam_Arg1();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ClrImpl <em>Clr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ClrImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getClr()
     * @generated
     */
    EClass CLR = eINSTANCE.getClr();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.NotImpl <em>Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.NotImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getNot()
     * @generated
     */
    EClass NOT = eINSTANCE.getNot();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.AbsaImpl <em>Absa</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.AbsaImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getAbsa()
     * @generated
     */
    EClass ABSA = eINSTANCE.getAbsa();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.SkipImpl <em>Skip</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.SkipImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSkip()
     * @generated
     */
    EClass SKIP = eINSTANCE.getSkip();

    /**
     * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SKIP__FLAGS = eINSTANCE.getSkip_Flags();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SKIP__LABEL = eINSTANCE.getSkip_Label();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.SPINMEMImpl <em>SPINMEM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.SPINMEMImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSPINMEM()
     * @generated
     */
    EClass SPINMEM = eINSTANCE.getSPINMEM();

    /**
     * The meta object literal for the '<em><b>Buffer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPINMEM__BUFFER = eINSTANCE.getSPINMEM_Buffer();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPINMEM__VALUE = eINSTANCE.getSPINMEM_Value();

    /**
     * The meta object literal for the '<em><b>Offset</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPINMEM__OFFSET = eINSTANCE.getSPINMEM_Offset();

  }

} //SpinCADPackage
