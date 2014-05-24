/**
 */
package com.holycityaudio.spincad.spinCAD;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.Skip#getFlags <em>Flags</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.Skip#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getSkip()
 * @model
 * @generated
 */
public interface Skip extends Instruction
{
  /**
   * Returns the value of the '<em><b>Flags</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flags</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flags</em>' attribute.
   * @see #setFlags(String)
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getSkip_Flags()
   * @model
   * @generated
   */
  String getFlags();

  /**
   * Sets the value of the '{@link com.holycityaudio.spincad.spinCAD.Skip#getFlags <em>Flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Flags</em>' attribute.
   * @see #getFlags()
   * @generated
   */
  void setFlags(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' reference.
   * @see #setLabel(Label)
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getSkip_Label()
   * @model
   * @generated
   */
  Label getLabel();

  /**
   * Sets the value of the '{@link com.holycityaudio.spincad.spinCAD.Skip#getLabel <em>Label</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(Label value);

} // Skip
