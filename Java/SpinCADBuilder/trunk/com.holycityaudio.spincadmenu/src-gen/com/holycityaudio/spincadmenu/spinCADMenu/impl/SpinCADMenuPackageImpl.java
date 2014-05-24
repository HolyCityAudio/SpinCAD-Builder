/**
 */
package com.holycityaudio.spincadmenu.spinCADMenu.impl;

import com.holycityaudio.spincadmenu.spinCADMenu.Element;
import com.holycityaudio.spincadmenu.spinCADMenu.Menu;
import com.holycityaudio.spincadmenu.spinCADMenu.SpinCADMenuFactory;
import com.holycityaudio.spincadmenu.spinCADMenu.SpinCADMenuPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpinCADMenuPackageImpl extends EPackageImpl implements SpinCADMenuPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass menuEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass menU_HEADEREClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass menU_ITEMEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tesT_ITEMEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.holycityaudio.spincadmenu.spinCADMenu.SpinCADMenuPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SpinCADMenuPackageImpl()
  {
    super(eNS_URI, SpinCADMenuFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SpinCADMenuPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SpinCADMenuPackage init()
  {
    if (isInited) return (SpinCADMenuPackage)EPackage.Registry.INSTANCE.getEPackage(SpinCADMenuPackage.eNS_URI);

    // Obtain or create and register package
    SpinCADMenuPackageImpl theSpinCADMenuPackage = (SpinCADMenuPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpinCADMenuPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpinCADMenuPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSpinCADMenuPackage.createPackageContents();

    // Initialize created meta-data
    theSpinCADMenuPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSpinCADMenuPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SpinCADMenuPackage.eNS_URI, theSpinCADMenuPackage);
    return theSpinCADMenuPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMenu()
  {
    return menuEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMenu_Elements()
  {
    return (EReference)menuEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMENU_HEADER()
  {
    return menU_HEADEREClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMENU_HEADER_Name()
  {
    return (EAttribute)menU_HEADEREClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMENU_ITEM()
  {
    return menU_ITEMEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMENU_ITEM_Name()
  {
    return (EAttribute)menU_ITEMEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMENU_ITEM_ClassName()
  {
    return (EAttribute)menU_ITEMEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTEST_ITEM()
  {
    return tesT_ITEMEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTEST_ITEM_ClassName()
  {
    return (EAttribute)tesT_ITEMEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpinCADMenuFactory getSpinCADMenuFactory()
  {
    return (SpinCADMenuFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    menuEClass = createEClass(MENU);
    createEReference(menuEClass, MENU__ELEMENTS);

    elementEClass = createEClass(ELEMENT);

    menU_HEADEREClass = createEClass(MENU_HEADER);
    createEAttribute(menU_HEADEREClass, MENU_HEADER__NAME);

    menU_ITEMEClass = createEClass(MENU_ITEM);
    createEAttribute(menU_ITEMEClass, MENU_ITEM__NAME);
    createEAttribute(menU_ITEMEClass, MENU_ITEM__CLASS_NAME);

    tesT_ITEMEClass = createEClass(TEST_ITEM);
    createEAttribute(tesT_ITEMEClass, TEST_ITEM__CLASS_NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    menU_HEADEREClass.getESuperTypes().add(this.getElement());
    menU_ITEMEClass.getESuperTypes().add(this.getElement());
    tesT_ITEMEClass.getESuperTypes().add(this.getElement());

    // Initialize classes and features; add operations and parameters
    initEClass(menuEClass, Menu.class, "Menu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMenu_Elements(), this.getElement(), null, "elements", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(menU_HEADEREClass, com.holycityaudio.spincadmenu.spinCADMenu.MENU_HEADER.class, "MENU_HEADER", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMENU_HEADER_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.holycityaudio.spincadmenu.spinCADMenu.MENU_HEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(menU_ITEMEClass, com.holycityaudio.spincadmenu.spinCADMenu.MENU_ITEM.class, "MENU_ITEM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMENU_ITEM_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.holycityaudio.spincadmenu.spinCADMenu.MENU_ITEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMENU_ITEM_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, com.holycityaudio.spincadmenu.spinCADMenu.MENU_ITEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tesT_ITEMEClass, com.holycityaudio.spincadmenu.spinCADMenu.TEST_ITEM.class, "TEST_ITEM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTEST_ITEM_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, com.holycityaudio.spincadmenu.spinCADMenu.TEST_ITEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SpinCADMenuPackageImpl
