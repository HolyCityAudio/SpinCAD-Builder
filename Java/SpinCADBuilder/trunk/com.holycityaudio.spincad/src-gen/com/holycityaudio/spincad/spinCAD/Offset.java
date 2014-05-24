/**
 */
package com.holycityaudio.spincad.spinCAD;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.Offset#getName <em>Name</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.Offset#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getOffset()
 * @model
 * @generated
 */
public interface Offset extends SpinElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getOffset_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.holycityaudio.spincad.spinCAD.Offset#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' attribute.
   * @see #setLength(int)
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getOffset_Length()
   * @model
   * @generated
   */
  int getLength();

  /**
   * Sets the value of the '{@link com.holycityaudio.spincad.spinCAD.Offset#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' attribute.
   * @see #getLength()
   * @generated
   */
  void setLength(int value);

} // Offset
