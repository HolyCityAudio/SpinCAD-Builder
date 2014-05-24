/**
 */
package com.holycityaudio.spincadmenu.spinCADMenu;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.holycityaudio.spincadmenu.spinCADMenu.SpinCADMenuPackage
 * @generated
 */
public interface SpinCADMenuFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SpinCADMenuFactory eINSTANCE = com.holycityaudio.spincadmenu.spinCADMenu.impl.SpinCADMenuFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Menu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Menu</em>'.
   * @generated
   */
  Menu createMenu();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>MENU HEADER</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MENU HEADER</em>'.
   * @generated
   */
  MENU_HEADER createMENU_HEADER();

  /**
   * Returns a new object of class '<em>MENU ITEM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MENU ITEM</em>'.
   * @generated
   */
  MENU_ITEM createMENU_ITEM();

  /**
   * Returns a new object of class '<em>TEST ITEM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>TEST ITEM</em>'.
   * @generated
   */
  TEST_ITEM createTEST_ITEM();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SpinCADMenuPackage getSpinCADMenuPackage();

} //SpinCADMenuFactory
