/**
 */
package com.holycityaudio.spincad.spinCAD.impl;

import com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9;
import com.holycityaudio.spincad.spinCAD.SPINMEM;
import com.holycityaudio.spincad.spinCAD.SpinCADPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inst B15 S1 9</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.Inst_B15_S1_9Impl#getArg1 <em>Arg1</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.Inst_B15_S1_9Impl#getArg2 <em>Arg2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Inst_B15_S1_9Impl extends InstructionImpl implements Inst_B15_S1_9
{
  /**
   * The cached value of the '{@link #getArg1() <em>Arg1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg1()
   * @generated
   * @ordered
   */
  protected SPINMEM arg1;

  /**
   * The default value of the '{@link #getArg2() <em>Arg2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg2()
   * @generated
   * @ordered
   */
  protected static final String ARG2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArg2() <em>Arg2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg2()
   * @generated
   * @ordered
   */
  protected String arg2 = ARG2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Inst_B15_S1_9Impl()
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
    return SpinCADPackage.Literals.INST_B15_S1_9;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPINMEM getArg1()
  {
    return arg1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArg1(SPINMEM newArg1, NotificationChain msgs)
  {
    SPINMEM oldArg1 = arg1;
    arg1 = newArg1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpinCADPackage.INST_B15_S1_9__ARG1, oldArg1, newArg1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg1(SPINMEM newArg1)
  {
    if (newArg1 != arg1)
    {
      NotificationChain msgs = null;
      if (arg1 != null)
        msgs = ((InternalEObject)arg1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpinCADPackage.INST_B15_S1_9__ARG1, null, msgs);
      if (newArg1 != null)
        msgs = ((InternalEObject)newArg1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpinCADPackage.INST_B15_S1_9__ARG1, null, msgs);
      msgs = basicSetArg1(newArg1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.INST_B15_S1_9__ARG1, newArg1, newArg1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArg2()
  {
    return arg2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg2(String newArg2)
  {
    String oldArg2 = arg2;
    arg2 = newArg2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.INST_B15_S1_9__ARG2, oldArg2, arg2));
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
      case SpinCADPackage.INST_B15_S1_9__ARG1:
        return basicSetArg1(null, msgs);
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
      case SpinCADPackage.INST_B15_S1_9__ARG1:
        return getArg1();
      case SpinCADPackage.INST_B15_S1_9__ARG2:
        return getArg2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpinCADPackage.INST_B15_S1_9__ARG1:
        setArg1((SPINMEM)newValue);
        return;
      case SpinCADPackage.INST_B15_S1_9__ARG2:
        setArg2((String)newValue);
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
      case SpinCADPackage.INST_B15_S1_9__ARG1:
        setArg1((SPINMEM)null);
        return;
      case SpinCADPackage.INST_B15_S1_9__ARG2:
        setArg2(ARG2_EDEFAULT);
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
      case SpinCADPackage.INST_B15_S1_9__ARG1:
        return arg1 != null;
      case SpinCADPackage.INST_B15_S1_9__ARG2:
        return ARG2_EDEFAULT == null ? arg2 != null : !ARG2_EDEFAULT.equals(arg2);
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
    result.append(" (arg2: ");
    result.append(arg2);
    result.append(')');
    return result.toString();
  }

} //Inst_B15_S1_9Impl
