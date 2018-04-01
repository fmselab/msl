/**
 * generated by Xtext 2.12.0
 */
package org.xtext.msl.mSL.impl;

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

import org.xtext.msl.mSL.AbstractPattern;
import org.xtext.msl.mSL.GroupBinding;
import org.xtext.msl.mSL.MSLPackage;
import org.xtext.msl.mSL.Pattern;
import org.xtext.msl.mSL.SystemBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.msl.mSL.impl.PatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.impl.PatternImpl#getAbsPattern <em>Abs Pattern</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.impl.PatternImpl#getManagedSystems <em>Managed Systems</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.impl.PatternImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternImpl extends MinimalEObjectImpl.Container implements Pattern
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
   * The cached value of the '{@link #getAbsPattern() <em>Abs Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbsPattern()
   * @generated
   * @ordered
   */
  protected AbstractPattern absPattern;

  /**
   * The cached value of the '{@link #getManagedSystems() <em>Managed Systems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManagedSystems()
   * @generated
   * @ordered
   */
  protected EList<SystemBinding> managedSystems;

  /**
   * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroups()
   * @generated
   * @ordered
   */
  protected EList<GroupBinding> groups;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PatternImpl()
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
    return MSLPackage.Literals.PATTERN;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MSLPackage.PATTERN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractPattern getAbsPattern()
  {
    if (absPattern != null && absPattern.eIsProxy())
    {
      InternalEObject oldAbsPattern = (InternalEObject)absPattern;
      absPattern = (AbstractPattern)eResolveProxy(oldAbsPattern);
      if (absPattern != oldAbsPattern)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MSLPackage.PATTERN__ABS_PATTERN, oldAbsPattern, absPattern));
      }
    }
    return absPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractPattern basicGetAbsPattern()
  {
    return absPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbsPattern(AbstractPattern newAbsPattern)
  {
    AbstractPattern oldAbsPattern = absPattern;
    absPattern = newAbsPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MSLPackage.PATTERN__ABS_PATTERN, oldAbsPattern, absPattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SystemBinding> getManagedSystems()
  {
    if (managedSystems == null)
    {
      managedSystems = new EObjectContainmentEList<SystemBinding>(SystemBinding.class, this, MSLPackage.PATTERN__MANAGED_SYSTEMS);
    }
    return managedSystems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupBinding> getGroups()
  {
    if (groups == null)
    {
      groups = new EObjectContainmentEList<GroupBinding>(GroupBinding.class, this, MSLPackage.PATTERN__GROUPS);
    }
    return groups;
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
      case MSLPackage.PATTERN__MANAGED_SYSTEMS:
        return ((InternalEList<?>)getManagedSystems()).basicRemove(otherEnd, msgs);
      case MSLPackage.PATTERN__GROUPS:
        return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
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
      case MSLPackage.PATTERN__NAME:
        return getName();
      case MSLPackage.PATTERN__ABS_PATTERN:
        if (resolve) return getAbsPattern();
        return basicGetAbsPattern();
      case MSLPackage.PATTERN__MANAGED_SYSTEMS:
        return getManagedSystems();
      case MSLPackage.PATTERN__GROUPS:
        return getGroups();
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
      case MSLPackage.PATTERN__NAME:
        setName((String)newValue);
        return;
      case MSLPackage.PATTERN__ABS_PATTERN:
        setAbsPattern((AbstractPattern)newValue);
        return;
      case MSLPackage.PATTERN__MANAGED_SYSTEMS:
        getManagedSystems().clear();
        getManagedSystems().addAll((Collection<? extends SystemBinding>)newValue);
        return;
      case MSLPackage.PATTERN__GROUPS:
        getGroups().clear();
        getGroups().addAll((Collection<? extends GroupBinding>)newValue);
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
      case MSLPackage.PATTERN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MSLPackage.PATTERN__ABS_PATTERN:
        setAbsPattern((AbstractPattern)null);
        return;
      case MSLPackage.PATTERN__MANAGED_SYSTEMS:
        getManagedSystems().clear();
        return;
      case MSLPackage.PATTERN__GROUPS:
        getGroups().clear();
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
      case MSLPackage.PATTERN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MSLPackage.PATTERN__ABS_PATTERN:
        return absPattern != null;
      case MSLPackage.PATTERN__MANAGED_SYSTEMS:
        return managedSystems != null && !managedSystems.isEmpty();
      case MSLPackage.PATTERN__GROUPS:
        return groups != null && !groups.isEmpty();
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

} //PatternImpl