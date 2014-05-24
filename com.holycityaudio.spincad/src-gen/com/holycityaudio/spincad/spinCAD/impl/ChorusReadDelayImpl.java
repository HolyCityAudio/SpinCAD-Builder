/**
 */
package com.holycityaudio.spincad.spinCAD.impl;

import com.holycityaudio.spincad.spinCAD.ChorusReadDelay;
import com.holycityaudio.spincad.spinCAD.SPINMEM;
import com.holycityaudio.spincad.spinCAD.SpinCADPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chorus Read Delay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.ChorusReadDelayImpl#getArg1 <em>Arg1</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.ChorusReadDelayImpl#getArg2 <em>Arg2</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.ChorusReadDelayImpl#getArg3 <em>Arg3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChorusReadDelayImpl extends InstructionImpl implements ChorusReadDelay
{
  /**
   * The default value of the '{@link #getArg1() <em>Arg1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg1()
   * @generated
   * @ordered
   */
  protected static final String ARG1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArg1() <em>Arg1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg1()
   * @generated
   * @ordered
   */
  protected String arg1 = ARG1_EDEFAULT;

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
   * The cached value of the '{@link #getArg3() <em>Arg3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg3()
   * @generated
   * @ordered
   */
  protected SPINMEM arg3;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChorusReadDelayImpl()
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
    return SpinCADPackage.Literals.CHORUS_READ_DELAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArg1()
  {
    return arg1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg1(String newArg1)
  {
    String oldArg1 = arg1;
    arg1 = newArg1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.CHORUS_READ_DELAY__ARG1, oldArg1, arg1));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.CHORUS_READ_DELAY__ARG2, oldArg2, arg2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPINMEM getArg3()
  {
    return arg3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArg3(SPINMEM newArg3, NotificationChain msgs)
  {
    SPINMEM oldArg3 = arg3;
    arg3 = newArg3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpinCADPackage.CHORUS_READ_DELAY__ARG3, oldArg3, newArg3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg3(SPINMEM newArg3)
  {
    if (newArg3 != arg3)
    {
      NotificationChain msgs = null;
      if (arg3 != null)
        msgs = ((InternalEObject)arg3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpinCADPackage.CHORUS_READ_DELAY__ARG3, null, msgs);
      if (newArg3 != null)
        msgs = ((InternalEObject)newArg3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpinCADPackage.CHORUS_READ_DELAY__ARG3, null, msgs);
      msgs = basicSetArg3(newArg3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.CHORUS_READ_DELAY__ARG3, newArg3, newArg3));
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
      case SpinCADPackage.CHORUS_READ_DELAY__ARG3:
        return basicSetArg3(null, msgs);
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
      case SpinCADPackage.CHORUS_READ_DELAY__ARG1:
        return getArg1();
      case SpinCADPackage.CHORUS_READ_DELAY__ARG2:
        return getArg2();
      case SpinCADPackage.CHORUS_READ_DELAY__ARG3:
        return getArg3();
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
      case SpinCADPackage.CHORUS_READ_DELAY__ARG1:
        setArg1((String)newValue);
        return;
      case SpinCADPackage.CHORUS_READ_DELAY__ARG2:
        setArg2((String)newValue);
        return;
      case SpinCADPackage.CHORUS_READ_DELAY__ARG3:
        setArg3((SPINMEM)newValue);
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
      case SpinCADPackage.CHORUS_READ_DELAY__ARG1:
        setArg1(ARG1_EDEFAULT);
        return;
      case SpinCADPackage.CHORUS_READ_DELAY__ARG2:
        setArg2(ARG2_EDEFAULT);
        return;
      case SpinCADPackage.CHORUS_READ_DELAY__ARG3:
        setArg3((SPINMEM)null);
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
      case SpinCADPackage.CHORUS_READ_DELAY__ARG1:
        return ARG1_EDEFAULT == null ? arg1 != null : !ARG1_EDEFAULT.equals(arg1);
      case SpinCADPackage.CHORUS_READ_DELAY__ARG2:
        return ARG2_EDEFAULT == null ? arg2 != null : !ARG2_EDEFAULT.equals(arg2);
      case SpinCADPackage.CHORUS_READ_DELAY__ARG3:
        return arg3 != null;
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
    result.append(" (arg1: ");
    result.append(arg1);
    result.append(", arg2: ");
    result.append(arg2);
    result.append(')');
    return result.toString();
  }

} //ChorusReadDelayImpl
