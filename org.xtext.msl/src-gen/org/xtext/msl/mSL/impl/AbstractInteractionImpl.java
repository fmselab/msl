/**
 * generated by Xtext 2.16.0
 */
package org.xtext.msl.mSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.msl.mSL.AbstractComponentName;
import org.xtext.msl.mSL.AbstractInteraction;
import org.xtext.msl.mSL.MSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.msl.mSL.impl.AbstractInteractionImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.impl.AbstractInteractionImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.impl.AbstractInteractionImpl#getLow <em>Low</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.impl.AbstractInteractionImpl#getHigh <em>High</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractInteractionImpl extends MinimalEObjectImpl.Container implements AbstractInteraction
{
  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected AbstractComponentName start;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected AbstractComponentName end;

  /**
   * The default value of the '{@link #getLow() <em>Low</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLow()
   * @generated
   * @ordered
   */
  protected static final String LOW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLow() <em>Low</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLow()
   * @generated
   * @ordered
   */
  protected String low = LOW_EDEFAULT;

  /**
   * The default value of the '{@link #getHigh() <em>High</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHigh()
   * @generated
   * @ordered
   */
  protected static final String HIGH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHigh() <em>High</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHigh()
   * @generated
   * @ordered
   */
  protected String high = HIGH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractInteractionImpl()
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
    return MSLPackage.Literals.ABSTRACT_INTERACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractComponentName getStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStart(AbstractComponentName newStart, NotificationChain msgs)
  {
    AbstractComponentName oldStart = start;
    start = newStart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MSLPackage.ABSTRACT_INTERACTION__START, oldStart, newStart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStart(AbstractComponentName newStart)
  {
    if (newStart != start)
    {
      NotificationChain msgs = null;
      if (start != null)
        msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MSLPackage.ABSTRACT_INTERACTION__START, null, msgs);
      if (newStart != null)
        msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MSLPackage.ABSTRACT_INTERACTION__START, null, msgs);
      msgs = basicSetStart(newStart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MSLPackage.ABSTRACT_INTERACTION__START, newStart, newStart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractComponentName getEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnd(AbstractComponentName newEnd, NotificationChain msgs)
  {
    AbstractComponentName oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MSLPackage.ABSTRACT_INTERACTION__END, oldEnd, newEnd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEnd(AbstractComponentName newEnd)
  {
    if (newEnd != end)
    {
      NotificationChain msgs = null;
      if (end != null)
        msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MSLPackage.ABSTRACT_INTERACTION__END, null, msgs);
      if (newEnd != null)
        msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MSLPackage.ABSTRACT_INTERACTION__END, null, msgs);
      msgs = basicSetEnd(newEnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MSLPackage.ABSTRACT_INTERACTION__END, newEnd, newEnd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLow()
  {
    return low;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLow(String newLow)
  {
    String oldLow = low;
    low = newLow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MSLPackage.ABSTRACT_INTERACTION__LOW, oldLow, low));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getHigh()
  {
    return high;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHigh(String newHigh)
  {
    String oldHigh = high;
    high = newHigh;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MSLPackage.ABSTRACT_INTERACTION__HIGH, oldHigh, high));
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
      case MSLPackage.ABSTRACT_INTERACTION__START:
        return basicSetStart(null, msgs);
      case MSLPackage.ABSTRACT_INTERACTION__END:
        return basicSetEnd(null, msgs);
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
      case MSLPackage.ABSTRACT_INTERACTION__START:
        return getStart();
      case MSLPackage.ABSTRACT_INTERACTION__END:
        return getEnd();
      case MSLPackage.ABSTRACT_INTERACTION__LOW:
        return getLow();
      case MSLPackage.ABSTRACT_INTERACTION__HIGH:
        return getHigh();
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
      case MSLPackage.ABSTRACT_INTERACTION__START:
        setStart((AbstractComponentName)newValue);
        return;
      case MSLPackage.ABSTRACT_INTERACTION__END:
        setEnd((AbstractComponentName)newValue);
        return;
      case MSLPackage.ABSTRACT_INTERACTION__LOW:
        setLow((String)newValue);
        return;
      case MSLPackage.ABSTRACT_INTERACTION__HIGH:
        setHigh((String)newValue);
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
      case MSLPackage.ABSTRACT_INTERACTION__START:
        setStart((AbstractComponentName)null);
        return;
      case MSLPackage.ABSTRACT_INTERACTION__END:
        setEnd((AbstractComponentName)null);
        return;
      case MSLPackage.ABSTRACT_INTERACTION__LOW:
        setLow(LOW_EDEFAULT);
        return;
      case MSLPackage.ABSTRACT_INTERACTION__HIGH:
        setHigh(HIGH_EDEFAULT);
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
      case MSLPackage.ABSTRACT_INTERACTION__START:
        return start != null;
      case MSLPackage.ABSTRACT_INTERACTION__END:
        return end != null;
      case MSLPackage.ABSTRACT_INTERACTION__LOW:
        return LOW_EDEFAULT == null ? low != null : !LOW_EDEFAULT.equals(low);
      case MSLPackage.ABSTRACT_INTERACTION__HIGH:
        return HIGH_EDEFAULT == null ? high != null : !HIGH_EDEFAULT.equals(high);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (low: ");
    result.append(low);
    result.append(", high: ");
    result.append(high);
    result.append(')');
    return result.toString();
  }

} //AbstractInteractionImpl
