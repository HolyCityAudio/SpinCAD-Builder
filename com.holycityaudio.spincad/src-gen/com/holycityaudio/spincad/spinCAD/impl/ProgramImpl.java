/**
 */
package com.holycityaudio.spincad.spinCAD.impl;

import com.holycityaudio.spincad.spinCAD.Control;
import com.holycityaudio.spincad.spinCAD.Pin;
import com.holycityaudio.spincad.spinCAD.Program;
import com.holycityaudio.spincad.spinCAD.SpinCADPackage;
import com.holycityaudio.spincad.spinCAD.SpinElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.ProgramImpl#getPins <em>Pins</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.ProgramImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.ProgramImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPins() <em>Pins</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPins()
   * @generated
   * @ordered
   */
  protected EList<Pin> pins;

  /**
   * The cached value of the '{@link #getControls() <em>Controls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControls()
   * @generated
   * @ordered
   */
  protected EList<Control> controls;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<SpinElement> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SpinCADPackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.PROGRAM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Pin> getPins()
  {
    if (pins == null)
    {
      pins = new EObjectContainmentEList<Pin>(Pin.class, this, SpinCADPackage.PROGRAM__PINS);
    }
    return pins;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Control> getControls()
  {
    if (controls == null)
    {
      controls = new EObjectContainmentEList<Control>(Control.class, this, SpinCADPackage.PROGRAM__CONTROLS);
    }
    return controls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SpinElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<SpinElement>(SpinElement.class, this, SpinCADPackage.PROGRAM__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SpinCADPackage.PROGRAM__PINS:
        return ((InternalEList<?>)getPins()).basicRemove(otherEnd, msgs);
      case SpinCADPackage.PROGRAM__CONTROLS:
        return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
      case SpinCADPackage.PROGRAM__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SpinCADPackage.PROGRAM__NAME:
        return getName();
      case SpinCADPackage.PROGRAM__PINS:
        return getPins();
      case SpinCADPackage.PROGRAM__CONTROLS:
        return getControls();
      case SpinCADPackage.PROGRAM__ELEMENTS:
        return getElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpinCADPackage.PROGRAM__NAME:
        setName((String)newValue);
        return;
      case SpinCADPackage.PROGRAM__PINS:
        getPins().clear();
        getPins().addAll((Collection<? extends Pin>)newValue);
        return;
      case SpinCADPackage.PROGRAM__CONTROLS:
        getControls().clear();
        getControls().addAll((Collection<? extends Control>)newValue);
        return;
      case SpinCADPackage.PROGRAM__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends SpinElement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SpinCADPackage.PROGRAM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SpinCADPackage.PROGRAM__PINS:
        getPins().clear();
        return;
      case SpinCADPackage.PROGRAM__CONTROLS:
        getControls().clear();
        return;
      case SpinCADPackage.PROGRAM__ELEMENTS:
        getElements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SpinCADPackage.PROGRAM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SpinCADPackage.PROGRAM__PINS:
        return pins != null && !pins.isEmpty();
      case SpinCADPackage.PROGRAM__CONTROLS:
        return controls != null && !controls.isEmpty();
      case SpinCADPackage.PROGRAM__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ProgramImpl
