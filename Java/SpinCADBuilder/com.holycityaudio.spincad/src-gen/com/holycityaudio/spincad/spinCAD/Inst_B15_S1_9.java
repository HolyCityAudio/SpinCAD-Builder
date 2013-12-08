/**
 */
package com.holycityaudio.spincad.spinCAD;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inst B15 S1 9</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9#getArg1 <em>Arg1</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9#getArg2 <em>Arg2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getInst_B15_S1_9()
 * @model
 * @generated
 */
public interface Inst_B15_S1_9 extends Instruction
{
  /**
   * Returns the value of the '<em><b>Arg1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg1</em>' containment reference.
   * @see #setArg1(SPINMEM)
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getInst_B15_S1_9_Arg1()
   * @model containment="true"
   * @generated
   */
  SPINMEM getArg1();

  /**
   * Sets the value of the '{@link com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9#getArg1 <em>Arg1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg1</em>' containment reference.
   * @see #getArg1()
   * @generated
   */
  void setArg1(SPINMEM value);

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
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getInst_B15_S1_9_Arg2()
   * @model
   * @generated
   */
  String getArg2();

  /**
   * Sets the value of the '{@link com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9#getArg2 <em>Arg2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg2</em>' attribute.
   * @see #getArg2()
   * @generated
   */
  void setArg2(String value);

} // Inst_B15_S1_9
