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
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.EquateImpl#getControl <em>Control</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.EquateImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.EquateImpl#getMax <em>Max</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.EquateImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.EquateImpl#getFunc <em>Func</em>}</li>
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
   * The default value of the '{@link #getControl() <em>Control</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControl()
   * @generated
   * @ordered
   */
  protected static final String CONTROL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getControl() <em>Control</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControl()
   * @generated
   * @ordered
   */
  protected String control = CONTROL_EDEFAULT;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected static final String MAX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected String max = MAX_EDEFAULT;

  /**
   * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffset()
   * @generated
   * @ordered
   */
  protected static final String OFFSET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffset()
   * @generated
   * @ordered
   */
  protected String offset = OFFSET_EDEFAULT;

  /**
   * The default value of the '{@link #getFunc() <em>Func</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunc()
   * @generated
   * @ordered
   */
  protected static final String FUNC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFunc() <em>Func</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunc()
   * @generated
   * @ordered
   */
  protected String func = FUNC_EDEFAULT;

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
  public String getControl()
  {
    return control;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControl(String newControl)
  {
    String oldControl = control;
    control = newControl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.EQUATE__CONTROL, oldControl, control));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.EQUATE__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax(String newMax)
  {
    String oldMax = max;
    max = newMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.EQUATE__MAX, oldMax, max));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOffset()
  {
    return offset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOffset(String newOffset)
  {
    String oldOffset = offset;
    offset = newOffset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.EQUATE__OFFSET, oldOffset, offset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFunc()
  {
    return func;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunc(String newFunc)
  {
    String oldFunc = func;
    func = newFunc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.EQUATE__FUNC, oldFunc, func));
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
      case SpinCADPackage.EQUATE__CONTROL:
        return getControl();
      case SpinCADPackage.EQUATE__LABEL:
        return getLabel();
      case SpinCADPackage.EQUATE__MAX:
        return getMax();
      case SpinCADPackage.EQUATE__OFFSET:
        return getOffset();
      case SpinCADPackage.EQUATE__FUNC:
        return getFunc();
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
      case SpinCADPackage.EQUATE__CONTROL:
        setControl((String)newValue);
        return;
      case SpinCADPackage.EQUATE__LABEL:
        setLabel((String)newValue);
        return;
      case SpinCADPackage.EQUATE__MAX:
        setMax((String)newValue);
        return;
      case SpinCADPackage.EQUATE__OFFSET:
        setOffset((String)newValue);
        return;
      case SpinCADPackage.EQUATE__FUNC:
        setFunc((String)newValue);
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
      case SpinCADPackage.EQUATE__CONTROL:
        setControl(CONTROL_EDEFAULT);
        return;
      case SpinCADPackage.EQUATE__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case SpinCADPackage.EQUATE__MAX:
        setMax(MAX_EDEFAULT);
        return;
      case SpinCADPackage.EQUATE__OFFSET:
        setOffset(OFFSET_EDEFAULT);
        return;
      case SpinCADPackage.EQUATE__FUNC:
        setFunc(FUNC_EDEFAULT);
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
      case SpinCADPackage.EQUATE__CONTROL:
        return CONTROL_EDEFAULT == null ? control != null : !CONTROL_EDEFAULT.equals(control);
      case SpinCADPackage.EQUATE__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case SpinCADPackage.EQUATE__MAX:
        return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
      case SpinCADPackage.EQUATE__OFFSET:
        return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
      case SpinCADPackage.EQUATE__FUNC:
        return FUNC_EDEFAULT == null ? func != null : !FUNC_EDEFAULT.equals(func);
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
    result.append(", control: ");
    result.append(control);
    result.append(", label: ");
    result.append(label);
    result.append(", max: ");
    result.append(max);
    result.append(", Offset: ");
    result.append(offset);
    result.append(", Func: ");
    result.append(func);
    result.append(')');
    return result.toString();
  }

} //EquateImpl
