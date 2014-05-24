/**
 */
package com.holycityaudio.spincad.spinCAD.impl;

import com.holycityaudio.spincad.spinCAD.LoadRampLFO;
import com.holycityaudio.spincad.spinCAD.SpinCADPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Ramp LFO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.LoadRampLFOImpl#getArg1 <em>Arg1</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.LoadRampLFOImpl#getArg2 <em>Arg2</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.LoadRampLFOImpl#getArg3 <em>Arg3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadRampLFOImpl extends InstructionImpl implements LoadRampLFO
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
  protected static final int ARG2_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getArg2() <em>Arg2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg2()
   * @generated
   * @ordered
   */
  protected int arg2 = ARG2_EDEFAULT;

  /**
   * The default value of the '{@link #getArg3() <em>Arg3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg3()
   * @generated
   * @ordered
   */
  protected static final int ARG3_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getArg3() <em>Arg3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg3()
   * @generated
   * @ordered
   */
  protected int arg3 = ARG3_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LoadRampLFOImpl()
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
    return SpinCADPackage.Literals.LOAD_RAMP_LFO;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.LOAD_RAMP_LFO__ARG1, oldArg1, arg1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getArg2()
  {
    return arg2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg2(int newArg2)
  {
    int oldArg2 = arg2;
    arg2 = newArg2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.LOAD_RAMP_LFO__ARG2, oldArg2, arg2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getArg3()
  {
    return arg3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg3(int newArg3)
  {
    int oldArg3 = arg3;
    arg3 = newArg3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.LOAD_RAMP_LFO__ARG3, oldArg3, arg3));
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
      case SpinCADPackage.LOAD_RAMP_LFO__ARG1:
        return getArg1();
      case SpinCADPackage.LOAD_RAMP_LFO__ARG2:
        return getArg2();
      case SpinCADPackage.LOAD_RAMP_LFO__ARG3:
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
      case SpinCADPackage.LOAD_RAMP_LFO__ARG1:
        setArg1((String)newValue);
        return;
      case SpinCADPackage.LOAD_RAMP_LFO__ARG2:
        setArg2((Integer)newValue);
        return;
      case SpinCADPackage.LOAD_RAMP_LFO__ARG3:
        setArg3((Integer)newValue);
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
      case SpinCADPackage.LOAD_RAMP_LFO__ARG1:
        setArg1(ARG1_EDEFAULT);
        return;
      case SpinCADPackage.LOAD_RAMP_LFO__ARG2:
        setArg2(ARG2_EDEFAULT);
        return;
      case SpinCADPackage.LOAD_RAMP_LFO__ARG3:
        setArg3(ARG3_EDEFAULT);
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
      case SpinCADPackage.LOAD_RAMP_LFO__ARG1:
        return ARG1_EDEFAULT == null ? arg1 != null : !ARG1_EDEFAULT.equals(arg1);
      case SpinCADPackage.LOAD_RAMP_LFO__ARG2:
        return arg2 != ARG2_EDEFAULT;
      case SpinCADPackage.LOAD_RAMP_LFO__ARG3:
        return arg3 != ARG3_EDEFAULT;
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
    result.append(", arg3: ");
    result.append(arg3);
    result.append(')');
    return result.toString();
  }

} //LoadRampLFOImpl
