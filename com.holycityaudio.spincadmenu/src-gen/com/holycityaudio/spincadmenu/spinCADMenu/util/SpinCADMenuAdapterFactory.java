/**
 */
package com.holycityaudio.spincadmenu.spinCADMenu.util;

import com.holycityaudio.spincadmenu.spinCADMenu.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.holycityaudio.spincadmenu.spinCADMenu.SpinCADMenuPackage
 * @generated
 */
public class SpinCADMenuAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SpinCADMenuPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpinCADMenuAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SpinCADMenuPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpinCADMenuSwitch<Adapter> modelSwitch =
    new SpinCADMenuSwitch<Adapter>()
    {
      @Override
      public Adapter caseMenu(Menu object)
      {
        return createMenuAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseMENU_HEADER(MENU_HEADER object)
      {
        return createMENU_HEADERAdapter();
      }
      @Override
      public Adapter caseMENU_ITEM(MENU_ITEM object)
      {
        return createMENU_ITEMAdapter();
      }
      @Override
      public Adapter caseTEST_ITEM(TEST_ITEM object)
      {
        return createTEST_ITEMAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincadmenu.spinCADMenu.Menu <em>Menu</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincadmenu.spinCADMenu.Menu
   * @generated
   */
  public Adapter createMenuAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincadmenu.spinCADMenu.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincadmenu.spinCADMenu.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincadmenu.spinCADMenu.MENU_HEADER <em>MENU HEADER</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincadmenu.spinCADMenu.MENU_HEADER
   * @generated
   */
  public Adapter createMENU_HEADERAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincadmenu.spinCADMenu.MENU_ITEM <em>MENU ITEM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincadmenu.spinCADMenu.MENU_ITEM
   * @generated
   */
  public Adapter createMENU_ITEMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.holycityaudio.spincadmenu.spinCADMenu.TEST_ITEM <em>TEST ITEM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.holycityaudio.spincadmenu.spinCADMenu.TEST_ITEM
   * @generated
   */
  public Adapter createTEST_ITEMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SpinCADMenuAdapterFactory
