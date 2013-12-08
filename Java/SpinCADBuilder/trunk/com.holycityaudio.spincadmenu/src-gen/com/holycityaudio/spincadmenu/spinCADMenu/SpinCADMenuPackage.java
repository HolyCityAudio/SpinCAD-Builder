/**
 */
package com.holycityaudio.spincadmenu.spinCADMenu;

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
 * @see com.holycityaudio.spincadmenu.spinCADMenu.SpinCADMenuFactory
 * @model kind="package"
 * @generated
 */
public interface SpinCADMenuPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "spinCADMenu";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.holycityaudio.com/spincadmenu/SpinCADMenu";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "spinCADMenu";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SpinCADMenuPackage eINSTANCE = com.holycityaudio.spincadmenu.spinCADMenu.impl.SpinCADMenuPackageImpl.init();

  /**
   * The meta object id for the '{@link com.holycityaudio.spincadmenu.spinCADMenu.impl.MenuImpl <em>Menu</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincadmenu.spinCADMenu.impl.MenuImpl
   * @see com.holycityaudio.spincadmenu.spinCADMenu.impl.SpinCADMenuPackageImpl#getMenu()
   * @generated
   */
  int MENU = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Menu</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincadmenu.spinCADMenu.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincadmenu.spinCADMenu.impl.ElementImpl
   * @see com.holycityaudio.spincadmenu.spinCADMenu.impl.SpinCADMenuPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincadmenu.spinCADMenu.impl.MENU_HEADERImpl <em>MENU HEADER</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincadmenu.spinCADMenu.impl.MENU_HEADERImpl
   * @see com.holycityaudio.spincadmenu.spinCADMenu.impl.SpinCADMenuPackageImpl#getMENU_HEADER()
   * @generated
   */
  int MENU_HEADER = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_HEADER__NAME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>MENU HEADER</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_HEADER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincadmenu.spinCADMenu.impl.MENU_ITEMImpl <em>MENU ITEM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincadmenu.spinCADMenu.impl.MENU_ITEMImpl
   * @see com.holycityaudio.spincadmenu.spinCADMenu.impl.SpinCADMenuPackageImpl#getMENU_ITEM()
   * @generated
   */
  int MENU_ITEM = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_ITEM__NAME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_ITEM__CLASS_NAME = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>MENU ITEM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_ITEM_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincadmenu.spinCADMenu.impl.TEST_ITEMImpl <em>TEST ITEM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincadmenu.spinCADMenu.impl.TEST_ITEMImpl
   * @see com.holycityaudio.spincadmenu.spinCADMenu.impl.SpinCADMenuPackageImpl#getTEST_ITEM()
   * @generated
   */
  int TEST_ITEM = 4;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_ITEM__CLASS_NAME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>TEST ITEM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_ITEM_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincadmenu.spinCADMenu.Menu <em>Menu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Menu</em>'.
   * @see com.holycityaudio.spincadmenu.spinCADMenu.Menu
   * @generated
   */
  EClass getMenu();

  /**
   * Returns the meta object for the containment reference list '{@link com.holycityaudio.spincadmenu.spinCADMenu.Menu#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.holycityaudio.spincadmenu.spinCADMenu.Menu#getElements()
   * @see #getMenu()
   * @generated
   */
  EReference getMenu_Elements();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincadmenu.spinCADMenu.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see com.holycityaudio.spincadmenu.spinCADMenu.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincadmenu.spinCADMenu.MENU_HEADER <em>MENU HEADER</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MENU HEADER</em>'.
   * @see com.holycityaudio.spincadmenu.spinCADMenu.MENU_HEADER
   * @generated
   */
  EClass getMENU_HEADER();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincadmenu.spinCADMenu.MENU_HEADER#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.holycityaudio.spincadmenu.spinCADMenu.MENU_HEADER#getName()
   * @see #getMENU_HEADER()
   * @generated
   */
  EAttribute getMENU_HEADER_Name();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincadmenu.spinCADMenu.MENU_ITEM <em>MENU ITEM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MENU ITEM</em>'.
   * @see com.holycityaudio.spincadmenu.spinCADMenu.MENU_ITEM
   * @generated
   */
  EClass getMENU_ITEM();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincadmenu.spinCADMenu.MENU_ITEM#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.holycityaudio.spincadmenu.spinCADMenu.MENU_ITEM#getName()
   * @see #getMENU_ITEM()
   * @generated
   */
  EAttribute getMENU_ITEM_Name();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincadmenu.spinCADMenu.MENU_ITEM#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see com.holycityaudio.spincadmenu.spinCADMenu.MENU_ITEM#getClassName()
   * @see #getMENU_ITEM()
   * @generated
   */
  EAttribute getMENU_ITEM_ClassName();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincadmenu.spinCADMenu.TEST_ITEM <em>TEST ITEM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TEST ITEM</em>'.
   * @see com.holycityaudio.spincadmenu.spinCADMenu.TEST_ITEM
   * @generated
   */
  EClass getTEST_ITEM();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincadmenu.spinCADMenu.TEST_ITEM#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see com.holycityaudio.spincadmenu.spinCADMenu.TEST_ITEM#getClassName()
   * @see #getTEST_ITEM()
   * @generated
   */
  EAttribute getTEST_ITEM_ClassName();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SpinCADMenuFactory getSpinCADMenuFactory();

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
     * The meta object literal for the '{@link com.holycityaudio.spincadmenu.spinCADMenu.impl.MenuImpl <em>Menu</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincadmenu.spinCADMenu.impl.MenuImpl
     * @see com.holycityaudio.spincadmenu.spinCADMenu.impl.SpinCADMenuPackageImpl#getMenu()
     * @generated
     */
    EClass MENU = eINSTANCE.getMenu();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MENU__ELEMENTS = eINSTANCE.getMenu_Elements();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincadmenu.spinCADMenu.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincadmenu.spinCADMenu.impl.ElementImpl
     * @see com.holycityaudio.spincadmenu.spinCADMenu.impl.SpinCADMenuPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincadmenu.spinCADMenu.impl.MENU_HEADERImpl <em>MENU HEADER</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincadmenu.spinCADMenu.impl.MENU_HEADERImpl
     * @see com.holycityaudio.spincadmenu.spinCADMenu.impl.SpinCADMenuPackageImpl#getMENU_HEADER()
     * @generated
     */
    EClass MENU_HEADER = eINSTANCE.getMENU_HEADER();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MENU_HEADER__NAME = eINSTANCE.getMENU_HEADER_Name();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincadmenu.spinCADMenu.impl.MENU_ITEMImpl <em>MENU ITEM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincadmenu.spinCADMenu.impl.MENU_ITEMImpl
     * @see com.holycityaudio.spincadmenu.spinCADMenu.impl.SpinCADMenuPackageImpl#getMENU_ITEM()
     * @generated
     */
    EClass MENU_ITEM = eINSTANCE.getMENU_ITEM();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MENU_ITEM__NAME = eINSTANCE.getMENU_ITEM_Name();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MENU_ITEM__CLASS_NAME = eINSTANCE.getMENU_ITEM_ClassName();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincadmenu.spinCADMenu.impl.TEST_ITEMImpl <em>TEST ITEM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincadmenu.spinCADMenu.impl.TEST_ITEMImpl
     * @see com.holycityaudio.spincadmenu.spinCADMenu.impl.SpinCADMenuPackageImpl#getTEST_ITEM()
     * @generated
     */
    EClass TEST_ITEM = eINSTANCE.getTEST_ITEM();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_ITEM__CLASS_NAME = eINSTANCE.getTEST_ITEM_ClassName();

  }

} //SpinCADMenuPackage
