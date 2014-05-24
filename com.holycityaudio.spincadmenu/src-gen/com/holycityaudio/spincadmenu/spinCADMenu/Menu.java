/**
 */
package com.holycityaudio.spincadmenu.spinCADMenu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.holycityaudio.spincadmenu.spinCADMenu.Menu#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.holycityaudio.spincadmenu.spinCADMenu.SpinCADMenuPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link com.holycityaudio.spincadmenu.spinCADMenu.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see com.holycityaudio.spincadmenu.spinCADMenu.SpinCADMenuPackage#getMenu_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElements();

} // Menu
