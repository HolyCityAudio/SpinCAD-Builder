/**
 */
package com.holycityaudio.spincad.spinCAD.impl;

import com.holycityaudio.spincad.spinCAD.Offset;
import com.holycityaudio.spincad.spinCAD.SPINMEM;
import com.holycityaudio.spincad.spinCAD.SpinCADPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPINMEM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SPINMEMImpl#getBuffer <em>Buffer</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SPINMEMImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SPINMEMImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SPINMEMImpl extends MinimalEObjectImpl.Container implements SPINMEM
{
  /**
   * The default value of the '{@link #getBuffer() <em>Buffer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuffer()
   * @generated
   * @ordered
   */
  protected static final String BUFFER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBuffer() <em>Buffer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuffer()
   * @generated
   * @ordered
   */
  protected String buffer = BUFFER_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getOffset() <em>Offset</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffset()
   * @generated
   * @ordered
   */
  protected Offset offset;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SPINMEMImpl()
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
    return SpinCADPackage.Literals.SPINMEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBuffer()
  {
    return buffer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuffer(String newBuffer)
  {
    String oldBuffer = buffer;
    buffer = newBuffer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SPINMEM__BUFFER, oldBuffer, buffer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SPINMEM__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Offset getOffset()
  {
    if (offset != null && offset.eIsProxy())
    {
      InternalEObject oldOffset = (InternalEObject)offset;
      offset = (Offset)eResolveProxy(oldOffset);
      if (offset != oldOffset)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpinCADPackage.SPINMEM__OFFSET, oldOffset, offset));
      }
    }
    return offset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Offset basicGetOffset()
  {
    return offset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOffset(Offset newOffset)
  {
    Offset oldOffset = offset;
    offset = newOffset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SPINMEM__OFFSET, oldOffset, offset));
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
      case SpinCADPackage.SPINMEM__BUFFER:
        return getBuffer();
      case SpinCADPackage.SPINMEM__VALUE:
        return getValue();
      case SpinCADPackage.SPINMEM__OFFSET:
        if (resolve) return getOffset();
        return basicGetOffset();
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
      case SpinCADPackage.SPINMEM__BUFFER:
        setBuffer((String)newValue);
        return;
      case SpinCADPackage.SPINMEM__VALUE:
        setValue((Integer)newValue);
        return;
      case SpinCADPackage.SPINMEM__OFFSET:
        setOffset((Offset)newValue);
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
      case SpinCADPackage.SPINMEM__BUFFER:
        setBuffer(BUFFER_EDEFAULT);
        return;
      case SpinCADPackage.SPINMEM__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case SpinCADPackage.SPINMEM__OFFSET:
        setOffset((Offset)null);
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
      case SpinCADPackage.SPINMEM__BUFFER:
        return BUFFER_EDEFAULT == null ? buffer != null : !BUFFER_EDEFAULT.equals(buffer);
      case SpinCADPackage.SPINMEM__VALUE:
        return value != VALUE_EDEFAULT;
      case SpinCADPackage.SPINMEM__OFFSET:
        return offset != null;
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
    result.append(" (buffer: ");
    result.append(buffer);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //SPINMEMImpl
