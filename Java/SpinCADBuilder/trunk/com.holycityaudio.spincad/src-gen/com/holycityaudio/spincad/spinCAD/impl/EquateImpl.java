/**
 */
package com.holycityaudio.spincad.spinCAD.impl;

import com.holycityaudio.spincad.spinCAD.Equate;
import com.holycityaudio.spincad.spinCAD.SpinCADPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.EquateImpl#getEname <em>Ename</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.EquateImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.EquateImpl#getControlType <em>Control Type</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.EquateImpl#getControlName <em>Control Name</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.EquateImpl#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.EquateImpl#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.EquateImpl#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.EquateImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.EquateImpl#getOption <em>Option</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EquateImpl extends SpinElementImpl implements Equate
{
  /**
   * The default value of the '{@link #getEname() <em>Ename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEname()
   * @generated
   * @ordered
   */
  protected static final String ENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEname() <em>Ename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEname()
   * @generated
   * @ordered
   */
  protected String ename = ENAME_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getControlType() <em>Control Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlType()
   * @generated
   * @ordered
   */
  protected static final String CONTROL_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getControlType() <em>Control Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlType()
   * @generated
   * @ordered
   */
  protected String controlType = CONTROL_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getControlName() <em>Control Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlName()
   * @generated
   * @ordered
   */
  protected static final String CONTROL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getControlName() <em>Control Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlName()
   * @generated
   * @ordered
   */
  protected String controlName = CONTROL_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getMinVal() <em>Min Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinVal()
   * @generated
   * @ordered
   */
  protected static final String MIN_VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMinVal() <em>Min Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinVal()
   * @generated
   * @ordered
   */
  protected String minVal = MIN_VAL_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxVal() <em>Max Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxVal()
   * @generated
   * @ordered
   */
  protected static final String MAX_VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMaxVal() <em>Max Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxVal()
   * @generated
   * @ordered
   */
  protected String maxVal = MAX_VAL_EDEFAULT;

  /**
   * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplier()
   * @generated
   * @ordered
   */
  protected static final String MULTIPLIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplier()
   * @generated
   * @ordered
   */
  protected String multiplier = MULTIPLIER_EDEFAULT;

  /**
   * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecision()
   * @generated
   * @ordered
   */
  protected static final int PRECISION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecision()
   * @generated
   * @ordered
   */
  protected int precision = PRECISION_EDEFAULT;

  /**
   * The default value of the '{@link #getOption() <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOption()
   * @generated
   * @ordered
   */
  protected static final String OPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOption() <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOption()
   * @generated
   * @ordered
   */
  protected String option = OPTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EquateImpl()
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
    return SpinCADPackage.Literals.EQUATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEname()
  {
    return ename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEname(String newEname)
  {
    String oldEname = ename;
    ename = newEname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.EQUATE__ENAME, oldEname, ename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.EQUATE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getControlType()
  {
    return controlType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControlType(String newControlType)
  {
    String oldControlType = controlType;
    controlType = newControlType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.EQUATE__CONTROL_TYPE, oldControlType, controlType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getControlName()
  {
    return controlName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControlName(String newControlName)
  {
    String oldControlName = controlName;
    controlName = newControlName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.EQUATE__CONTROL_NAME, oldControlName, controlName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMinVal()
  {
    return minVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinVal(String newMinVal)
  {
    String oldMinVal = minVal;
    minVal = newMinVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.EQUATE__MIN_VAL, oldMinVal, minVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMaxVal()
  {
    return maxVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxVal(String newMaxVal)
  {
    String oldMaxVal = maxVal;
    maxVal = newMaxVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.EQUATE__MAX_VAL, oldMaxVal, maxVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMultiplier()
  {
    return multiplier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiplier(String newMultiplier)
  {
    String oldMultiplier = multiplier;
    multiplier = newMultiplier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.EQUATE__MULTIPLIER, oldMultiplier, multiplier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPrecision()
  {
    return precision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrecision(int newPrecision)
  {
    int oldPrecision = precision;
    precision = newPrecision;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.EQUATE__PRECISION, oldPrecision, precision));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOption()
  {
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOption(String newOption)
  {
    String oldOption = option;
    option = newOption;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.EQUATE__OPTION, oldOption, option));
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
      case SpinCADPackage.EQUATE__ENAME:
        return getEname();
      case SpinCADPackage.EQUATE__VALUE:
        return getValue();
      case SpinCADPackage.EQUATE__CONTROL_TYPE:
        return getControlType();
      case SpinCADPackage.EQUATE__CONTROL_NAME:
        return getControlName();
      case SpinCADPackage.EQUATE__MIN_VAL:
        return getMinVal();
      case SpinCADPackage.EQUATE__MAX_VAL:
        return getMaxVal();
      case SpinCADPackage.EQUATE__MULTIPLIER:
        return getMultiplier();
      case SpinCADPackage.EQUATE__PRECISION:
        return getPrecision();
      case SpinCADPackage.EQUATE__OPTION:
        return getOption();
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
      case SpinCADPackage.EQUATE__ENAME:
        setEname((String)newValue);
        return;
      case SpinCADPackage.EQUATE__VALUE:
        setValue((String)newValue);
        return;
      case SpinCADPackage.EQUATE__CONTROL_TYPE:
        setControlType((String)newValue);
        return;
      case SpinCADPackage.EQUATE__CONTROL_NAME:
        setControlName((String)newValue);
        return;
      case SpinCADPackage.EQUATE__MIN_VAL:
        setMinVal((String)newValue);
        return;
      case SpinCADPackage.EQUATE__MAX_VAL:
        setMaxVal((String)newValue);
        return;
      case SpinCADPackage.EQUATE__MULTIPLIER:
        setMultiplier((String)newValue);
        return;
      case SpinCADPackage.EQUATE__PRECISION:
        setPrecision((Integer)newValue);
        return;
      case SpinCADPackage.EQUATE__OPTION:
        setOption((String)newValue);
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
      case SpinCADPackage.EQUATE__ENAME:
        setEname(ENAME_EDEFAULT);
        return;
      case SpinCADPackage.EQUATE__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case SpinCADPackage.EQUATE__CONTROL_TYPE:
        setControlType(CONTROL_TYPE_EDEFAULT);
        return;
      case SpinCADPackage.EQUATE__CONTROL_NAME:
        setControlName(CONTROL_NAME_EDEFAULT);
        return;
      case SpinCADPackage.EQUATE__MIN_VAL:
        setMinVal(MIN_VAL_EDEFAULT);
        return;
      case SpinCADPackage.EQUATE__MAX_VAL:
        setMaxVal(MAX_VAL_EDEFAULT);
        return;
      case SpinCADPackage.EQUATE__MULTIPLIER:
        setMultiplier(MULTIPLIER_EDEFAULT);
        return;
      case SpinCADPackage.EQUATE__PRECISION:
        setPrecision(PRECISION_EDEFAULT);
        return;
      case SpinCADPackage.EQUATE__OPTION:
        setOption(OPTION_EDEFAULT);
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
      case SpinCADPackage.EQUATE__ENAME:
        return ENAME_EDEFAULT == null ? ename != null : !ENAME_EDEFAULT.equals(ename);
      case SpinCADPackage.EQUATE__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case SpinCADPackage.EQUATE__CONTROL_TYPE:
        return CONTROL_TYPE_EDEFAULT == null ? controlType != null : !CONTROL_TYPE_EDEFAULT.equals(controlType);
      case SpinCADPackage.EQUATE__CONTROL_NAME:
        return CONTROL_NAME_EDEFAULT == null ? controlName != null : !CONTROL_NAME_EDEFAULT.equals(controlName);
      case SpinCADPackage.EQUATE__MIN_VAL:
        return MIN_VAL_EDEFAULT == null ? minVal != null : !MIN_VAL_EDEFAULT.equals(minVal);
      case SpinCADPackage.EQUATE__MAX_VAL:
        return MAX_VAL_EDEFAULT == null ? maxVal != null : !MAX_VAL_EDEFAULT.equals(maxVal);
      case SpinCADPackage.EQUATE__MULTIPLIER:
        return MULTIPLIER_EDEFAULT == null ? multiplier != null : !MULTIPLIER_EDEFAULT.equals(multiplier);
      case SpinCADPackage.EQUATE__PRECISION:
        return precision != PRECISION_EDEFAULT;
      case SpinCADPackage.EQUATE__OPTION:
        return OPTION_EDEFAULT == null ? option != null : !OPTION_EDEFAULT.equals(option);
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
    result.append(" (ename: ");
    result.append(ename);
    result.append(", value: ");
    result.append(value);
    result.append(", controlType: ");
    result.append(controlType);
    result.append(", controlName: ");
    result.append(controlName);
    result.append(", minVal: ");
    result.append(minVal);
    result.append(", maxVal: ");
    result.append(maxVal);
    result.append(", multiplier: ");
    result.append(multiplier);
    result.append(", precision: ");
    result.append(precision);
    result.append(", option: ");
    result.append(option);
    result.append(')');
    return result.toString();
  }

} //EquateImpl
