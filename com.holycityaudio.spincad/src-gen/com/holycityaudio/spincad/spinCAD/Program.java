/**
 */
package com.holycityaudio.spincad.spinCAD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.Program#getName <em>Name</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.Program#getPins <em>Pins</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.Program#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
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
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getProgram_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.holycityaudio.spincad.spinCAD.Program#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Pins</b></em>' containment reference list.
   * The list contents are of type {@link com.holycityaudio.spincad.spinCAD.Pin}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pins</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pins</em>' containment reference list.
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getProgram_Pins()
   * @model containment="true"
   * @generated
   */
  EList<Pin> getPins();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link com.holycityaudio.spincad.spinCAD.SpinElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getProgram_Elements()
   * @model containment="true"
   * @generated
   */
  EList<SpinElement> getElements();

} // Program
