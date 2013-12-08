/**
 */
package com.holycityaudio.spincadmenu.spinCADMenu.impl;

import com.holycityaudio.spincadmenu.spinCADMenu.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpinCADMenuFactoryImpl extends EFactoryImpl implements SpinCADMenuFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SpinCADMenuFactory init()
  {
    try
    {
      SpinCADMenuFactory theSpinCADMenuFactory = (SpinCADMenuFactory)EPackage.Registry.INSTANCE.getEFactory(SpinCADMenuPackage.eNS_URI);
      if (theSpinCADMenuFactory != null)
      {
        return theSpinCADMenuFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SpinCADMenuFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpinCADMenuFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SpinCADMenuPackage.MENU: return createMenu();
      case SpinCADMenuPackage.ELEMENT: return createElement();
      case SpinCADMenuPackage.MENU_HEADER: return createMENU_HEADER();
      case SpinCADMenuPackage.MENU_ITEM: return createMENU_ITEM();
      case SpinCADMenuPackage.TEST_ITEM: return createTEST_ITEM();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Menu createMenu()
  {
    MenuImpl menu = new MenuImpl();
    return menu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MENU_HEADER createMENU_HEADER()
  {
    MENU_HEADERImpl menU_HEADER = new MENU_HEADERImpl();
    return menU_HEADER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MENU_ITEM createMENU_ITEM()
  {
    MENU_ITEMImpl menU_ITEM = new MENU_ITEMImpl();
    return menU_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TEST_ITEM createTEST_ITEM()
  {
    TEST_ITEMImpl tesT_ITEM = new TEST_ITEMImpl();
    return tesT_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpinCADMenuPackage getSpinCADMenuPackage()
  {
    return (SpinCADMenuPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SpinCADMenuPackage getPackage()
  {
    return SpinCADMenuPackage.eINSTANCE;
  }

} //SpinCADMenuFactoryImpl
