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

import org.xtext.msl.mSL.AbstractGroup;
import org.xtext.msl.mSL.AbstractInteraction;
import org.xtext.msl.mSL.AbstractPattern;
import org.xtext.msl.mSL.AbstractSystem;
import org.xtext.msl.mSL.MSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.msl.mSL.impl.AbstractPatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.impl.AbstractPatternImpl#getManagedSystems <em>Managed Systems</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.impl.AbstractPatternImpl#getAbstractGroups <em>Abstract Groups</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.impl.AbstractPatternImpl#getInteractions <em>Interactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractPatternImpl extends MinimalEObjectImpl.Container implements AbstractPattern
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
   * The cached value of the '{@link #getManagedSystems() <em>Managed Systems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManagedSystems()
   * @generated
   * @ordered
   */
  protected EList<AbstractSystem> managedSystems;

  /**
   * The cached value of the '{@link #getAbstractGroups() <em>Abstract Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstractGroups()
   * @generated
   * @ordered
   */
  protected EList<AbstractGroup> abstractGroups;

  /**
   * The cached value of the '{@link #getInteractions() <em>Interactions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractions()
   * @generated
   * @ordered
   */
  protected EList<AbstractInteraction> interactions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractPatternImpl()
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
    return MSLPackage.Literals.ABSTRACT_PATTERN;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MSLPackage.ABSTRACT_PATTERN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractSystem> getManagedSystems()
  {
    if (managedSystems == null)
    {
      managedSystems = new EObjectContainmentEList<AbstractSystem>(AbstractSystem.class, this, MSLPackage.ABSTRACT_PATTERN__MANAGED_SYSTEMS);
    }
    return managedSystems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractGroup> getAbstractGroups()
  {
    if (abstractGroups == null)
    {
      abstractGroups = new EObjectContainmentEList<AbstractGroup>(AbstractGroup.class, this, MSLPackage.ABSTRACT_PATTERN__ABSTRACT_GROUPS);
    }
    return abstractGroups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractInteraction> getInteractions()
  {
    if (interactions == null)
    {
      interactions = new EObjectContainmentEList<AbstractInteraction>(AbstractInteraction.class, this, MSLPackage.ABSTRACT_PATTERN__INTERACTIONS);
    }
    return interactions;
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
      case MSLPackage.ABSTRACT_PATTERN__MANAGED_SYSTEMS:
        return ((InternalEList<?>)getManagedSystems()).basicRemove(otherEnd, msgs);
      case MSLPackage.ABSTRACT_PATTERN__ABSTRACT_GROUPS:
        return ((InternalEList<?>)getAbstractGroups()).basicRemove(otherEnd, msgs);
      case MSLPackage.ABSTRACT_PATTERN__INTERACTIONS:
        return ((InternalEList<?>)getInteractions()).basicRemove(otherEnd, msgs);
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
      case MSLPackage.ABSTRACT_PATTERN__NAME:
        return getName();
      case MSLPackage.ABSTRACT_PATTERN__MANAGED_SYSTEMS:
        return getManagedSystems();
      case MSLPackage.ABSTRACT_PATTERN__ABSTRACT_GROUPS:
        return getAbstractGroups();
      case MSLPackage.ABSTRACT_PATTERN__INTERACTIONS:
        return getInteractions();
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
      case MSLPackage.ABSTRACT_PATTERN__NAME:
        setName((String)newValue);
        return;
      case MSLPackage.ABSTRACT_PATTERN__MANAGED_SYSTEMS:
        getManagedSystems().clear();
        getManagedSystems().addAll((Collection<? extends AbstractSystem>)newValue);
        return;
      case MSLPackage.ABSTRACT_PATTERN__ABSTRACT_GROUPS:
        getAbstractGroups().clear();
        getAbstractGroups().addAll((Collection<? extends AbstractGroup>)newValue);
        return;
      case MSLPackage.ABSTRACT_PATTERN__INTERACTIONS:
        getInteractions().clear();
        getInteractions().addAll((Collection<? extends AbstractInteraction>)newValue);
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
      case MSLPackage.ABSTRACT_PATTERN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MSLPackage.ABSTRACT_PATTERN__MANAGED_SYSTEMS:
        getManagedSystems().clear();
        return;
      case MSLPackage.ABSTRACT_PATTERN__ABSTRACT_GROUPS:
        getAbstractGroups().clear();
        return;
      case MSLPackage.ABSTRACT_PATTERN__INTERACTIONS:
        getInteractions().clear();
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
      case MSLPackage.ABSTRACT_PATTERN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MSLPackage.ABSTRACT_PATTERN__MANAGED_SYSTEMS:
        return managedSystems != null && !managedSystems.isEmpty();
      case MSLPackage.ABSTRACT_PATTERN__ABSTRACT_GROUPS:
        return abstractGroups != null && !abstractGroups.isEmpty();
      case MSLPackage.ABSTRACT_PATTERN__INTERACTIONS:
        return interactions != null && !interactions.isEmpty();
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

} //AbstractPatternImpl