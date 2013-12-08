/**
 */
package com.holycityaudio.spincad.spinCAD;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chorus Read Delay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.ChorusReadDelay#getArg1 <em>Arg1</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.ChorusReadDelay#getArg2 <em>Arg2</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.ChorusReadDelay#getArg3 <em>Arg3</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getChorusReadDelay()
 * @model
 * @generated
 */
public interface ChorusReadDelay extends Instruction
{
  /**
   * Returns the value of the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg1</em>' attribute.
   * @see #setArg1(String)
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getChorusReadDelay_Arg1()
   * @model
   * @generated
   */
  String getArg1();

  /**
   * Sets the value of the '{@link com.holycityaudio.spincad.spinCAD.ChorusReadDelay#getArg1 <em>Arg1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg1</em>' attribute.
   * @see #getArg1()
   * @generated
   */
  void setArg1(String value);

  /**
   * Returns the value of the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg2</em>' attribute.
   * @see #setArg2(String)
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getChorusReadDelay_Arg2()
   * @model
   * @generated
   */
  String getArg2();

  /**
   * Sets the value of the '{@link com.holycityaudio.spincad.spinCAD.ChorusReadDelay#getArg2 <em>Arg2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg2</em>' attribute.
   * @see #getArg2()
   * @generated
   */
  void setArg2(String value);

  /**
   * Returns the value of the '<em><b>Arg3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg3</em>' containment reference.
   * @see #setArg3(SPINMEM)
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getChorusReadDelay_Arg3()
   * @model containment="true"
   * @generated
   */
  SPINMEM getArg3();

  /**
   * Sets the value of the '{@link com.holycityaudio.spincad.spinCAD.ChorusReadDelay#getArg3 <em>Arg3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg3</em>' containment reference.
   * @see #getArg3()
   * @generated
   */
  void setArg3(SPINMEM value);

} // ChorusReadDelay
