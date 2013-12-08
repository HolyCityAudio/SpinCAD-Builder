/**
 */
package com.holycityaudio.spincad.spinCAD.impl;

import com.holycityaudio.spincad.spinCAD.Inst_B6_S1_14;
import com.holycityaudio.spincad.spinCAD.SpinCADPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inst B6 S1 14</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.Inst_B6_S1_14Impl#getArg1 <em>Arg1</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.Inst_B6_S1_14Impl#getArg2 <em>Arg2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Inst_B6_S1_14Impl extends InstructionImpl implements Inst_B6_S1_14
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Inst_B6_S1_14Impl()
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
    return SpinCADPackage.Literals.INST_B6_S1_14;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.INST_B6_S1_14__ARG1, oldArg1, arg1));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.INST_B6_S1_14__ARG2, oldArg2, arg2));
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
      case SpinCADPackage.INST_B6_S1_14__ARG1:
        return getArg1();
      case SpinCADPackage.INST_B6_S1_14__ARG2:
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
      case SpinCADPackage.INST_B6_S1_14__ARG1:
        setArg1((String)newValue);
        return;
      case SpinCADPackage.INST_B6_S1_14__ARG2:
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
      case SpinCADPackage.INST_B6_S1_14__ARG1:
        setArg1(ARG1_EDEFAULT);
        return;
      case SpinCADPackage.INST_B6_S1_14__ARG2:
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
      case SpinCADPackage.INST_B6_S1_14__ARG1:
        return ARG1_EDEFAULT == null ? arg1 != null : !ARG1_EDEFAULT.equals(arg1);
      case SpinCADPackage.INST_B6_S1_14__ARG2:
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
    result.append(" (arg1: ");
    result.append(arg1);
    result.append(", arg2: ");
    result.append(arg2);
    result.append(')');
    return result.toString();
  }

} //Inst_B6_S1_14Impl
