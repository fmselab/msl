/**
 * generated by Xtext 2.14.0
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.msl.mSL.ConcreteGroup;
import org.xtext.msl.mSL.ConcreteSystem;
import org.xtext.msl.mSL.Configuration;
import org.xtext.msl.mSL.Interaction;
import org.xtext.msl.mSL.MSLPackage;
import org.xtext.msl.mSL.Pattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.msl.mSL.impl.ConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.impl.ConfigurationImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.impl.ConfigurationImpl#getConcreteSystems <em>Concrete Systems</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.impl.ConfigurationImpl#getConcreteGroups <em>Concrete Groups</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.impl.ConfigurationImpl#getConcreteInteractions <em>Concrete Interactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends MinimalEObjectImpl.Container implements Configuration
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
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected EList<Pattern> pattern;

  /**
   * The cached value of the '{@link #getConcreteSystems() <em>Concrete Systems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcreteSystems()
   * @generated
   * @ordered
   */
  protected EList<ConcreteSystem> concreteSystems;

  /**
   * The cached value of the '{@link #getConcreteGroups() <em>Concrete Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcreteGroups()
   * @generated
   * @ordered
   */
  protected EList<ConcreteGroup> concreteGroups;

  /**
   * The cached value of the '{@link #getConcreteInteractions() <em>Concrete Interactions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcreteInteractions()
   * @generated
   * @ordered
   */
  protected EList<Interaction> concreteInteractions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConfigurationImpl()
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
    return MSLPackage.Literals.CONFIGURATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MSLPackage.CONFIGURATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Pattern> getPattern()
  {
    if (pattern == null)
    {
      pattern = new EObjectResolvingEList<Pattern>(Pattern.class, this, MSLPackage.CONFIGURATION__PATTERN);
    }
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConcreteSystem> getConcreteSystems()
  {
    if (concreteSystems == null)
    {
      concreteSystems = new EObjectContainmentEList<ConcreteSystem>(ConcreteSystem.class, this, MSLPackage.CONFIGURATION__CONCRETE_SYSTEMS);
    }
    return concreteSystems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConcreteGroup> getConcreteGroups()
  {
    if (concreteGroups == null)
    {
      concreteGroups = new EObjectContainmentEList<ConcreteGroup>(ConcreteGroup.class, this, MSLPackage.CONFIGURATION__CONCRETE_GROUPS);
    }
    return concreteGroups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interaction> getConcreteInteractions()
  {
    if (concreteInteractions == null)
    {
      concreteInteractions = new EObjectContainmentEList<Interaction>(Interaction.class, this, MSLPackage.CONFIGURATION__CONCRETE_INTERACTIONS);
    }
    return concreteInteractions;
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
      case MSLPackage.CONFIGURATION__CONCRETE_SYSTEMS:
        return ((InternalEList<?>)getConcreteSystems()).basicRemove(otherEnd, msgs);
      case MSLPackage.CONFIGURATION__CONCRETE_GROUPS:
        return ((InternalEList<?>)getConcreteGroups()).basicRemove(otherEnd, msgs);
      case MSLPackage.CONFIGURATION__CONCRETE_INTERACTIONS:
        return ((InternalEList<?>)getConcreteInteractions()).basicRemove(otherEnd, msgs);
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
      case MSLPackage.CONFIGURATION__NAME:
        return getName();
      case MSLPackage.CONFIGURATION__PATTERN:
        return getPattern();
      case MSLPackage.CONFIGURATION__CONCRETE_SYSTEMS:
        return getConcreteSystems();
      case MSLPackage.CONFIGURATION__CONCRETE_GROUPS:
        return getConcreteGroups();
      case MSLPackage.CONFIGURATION__CONCRETE_INTERACTIONS:
        return getConcreteInteractions();
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
      case MSLPackage.CONFIGURATION__NAME:
        setName((String)newValue);
        return;
      case MSLPackage.CONFIGURATION__PATTERN:
        getPattern().clear();
        getPattern().addAll((Collection<? extends Pattern>)newValue);
        return;
      case MSLPackage.CONFIGURATION__CONCRETE_SYSTEMS:
        getConcreteSystems().clear();
        getConcreteSystems().addAll((Collection<? extends ConcreteSystem>)newValue);
        return;
      case MSLPackage.CONFIGURATION__CONCRETE_GROUPS:
        getConcreteGroups().clear();
        getConcreteGroups().addAll((Collection<? extends ConcreteGroup>)newValue);
        return;
      case MSLPackage.CONFIGURATION__CONCRETE_INTERACTIONS:
        getConcreteInteractions().clear();
        getConcreteInteractions().addAll((Collection<? extends Interaction>)newValue);
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
      case MSLPackage.CONFIGURATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MSLPackage.CONFIGURATION__PATTERN:
        getPattern().clear();
        return;
      case MSLPackage.CONFIGURATION__CONCRETE_SYSTEMS:
        getConcreteSystems().clear();
        return;
      case MSLPackage.CONFIGURATION__CONCRETE_GROUPS:
        getConcreteGroups().clear();
        return;
      case MSLPackage.CONFIGURATION__CONCRETE_INTERACTIONS:
        getConcreteInteractions().clear();
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
      case MSLPackage.CONFIGURATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MSLPackage.CONFIGURATION__PATTERN:
        return pattern != null && !pattern.isEmpty();
      case MSLPackage.CONFIGURATION__CONCRETE_SYSTEMS:
        return concreteSystems != null && !concreteSystems.isEmpty();
      case MSLPackage.CONFIGURATION__CONCRETE_GROUPS:
        return concreteGroups != null && !concreteGroups.isEmpty();
      case MSLPackage.CONFIGURATION__CONCRETE_INTERACTIONS:
        return concreteInteractions != null && !concreteInteractions.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ConfigurationImpl
