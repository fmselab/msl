/**
 * generated by Xtext 2.13.0
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
import org.xtext.msl.mSL.Configuration;
import org.xtext.msl.mSL.Import;
import org.xtext.msl.mSL.MSLPackage;
import org.xtext.msl.mSL.Pattern;
import org.xtext.msl.mSL.Specification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.msl.mSL.impl.SpecificationImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.impl.SpecificationImpl#getAbsPattern <em>Abs Pattern</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.impl.SpecificationImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.impl.SpecificationImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificationImpl extends MinimalEObjectImpl.Container implements Specification
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getAbsPattern() <em>Abs Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbsPattern()
   * @generated
   * @ordered
   */
  protected AbstractPattern absPattern;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected EList<Pattern> pattern;

  /**
   * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfiguration()
   * @generated
   * @ordered
   */
  protected Configuration configuration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpecificationImpl()
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
    return MSLPackage.Literals.SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, MSLPackage.SPECIFICATION__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractPattern getAbsPattern()
  {
    return absPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbsPattern(AbstractPattern newAbsPattern, NotificationChain msgs)
  {
    AbstractPattern oldAbsPattern = absPattern;
    absPattern = newAbsPattern;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MSLPackage.SPECIFICATION__ABS_PATTERN, oldAbsPattern, newAbsPattern);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbsPattern(AbstractPattern newAbsPattern)
  {
    if (newAbsPattern != absPattern)
    {
      NotificationChain msgs = null;
      if (absPattern != null)
        msgs = ((InternalEObject)absPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MSLPackage.SPECIFICATION__ABS_PATTERN, null, msgs);
      if (newAbsPattern != null)
        msgs = ((InternalEObject)newAbsPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MSLPackage.SPECIFICATION__ABS_PATTERN, null, msgs);
      msgs = basicSetAbsPattern(newAbsPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MSLPackage.SPECIFICATION__ABS_PATTERN, newAbsPattern, newAbsPattern));
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
      pattern = new EObjectContainmentEList<Pattern>(Pattern.class, this, MSLPackage.SPECIFICATION__PATTERN);
    }
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configuration getConfiguration()
  {
    return configuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConfiguration(Configuration newConfiguration, NotificationChain msgs)
  {
    Configuration oldConfiguration = configuration;
    configuration = newConfiguration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MSLPackage.SPECIFICATION__CONFIGURATION, oldConfiguration, newConfiguration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConfiguration(Configuration newConfiguration)
  {
    if (newConfiguration != configuration)
    {
      NotificationChain msgs = null;
      if (configuration != null)
        msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MSLPackage.SPECIFICATION__CONFIGURATION, null, msgs);
      if (newConfiguration != null)
        msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MSLPackage.SPECIFICATION__CONFIGURATION, null, msgs);
      msgs = basicSetConfiguration(newConfiguration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MSLPackage.SPECIFICATION__CONFIGURATION, newConfiguration, newConfiguration));
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
      case MSLPackage.SPECIFICATION__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case MSLPackage.SPECIFICATION__ABS_PATTERN:
        return basicSetAbsPattern(null, msgs);
      case MSLPackage.SPECIFICATION__PATTERN:
        return ((InternalEList<?>)getPattern()).basicRemove(otherEnd, msgs);
      case MSLPackage.SPECIFICATION__CONFIGURATION:
        return basicSetConfiguration(null, msgs);
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
      case MSLPackage.SPECIFICATION__IMPORTS:
        return getImports();
      case MSLPackage.SPECIFICATION__ABS_PATTERN:
        return getAbsPattern();
      case MSLPackage.SPECIFICATION__PATTERN:
        return getPattern();
      case MSLPackage.SPECIFICATION__CONFIGURATION:
        return getConfiguration();
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
      case MSLPackage.SPECIFICATION__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case MSLPackage.SPECIFICATION__ABS_PATTERN:
        setAbsPattern((AbstractPattern)newValue);
        return;
      case MSLPackage.SPECIFICATION__PATTERN:
        getPattern().clear();
        getPattern().addAll((Collection<? extends Pattern>)newValue);
        return;
      case MSLPackage.SPECIFICATION__CONFIGURATION:
        setConfiguration((Configuration)newValue);
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
      case MSLPackage.SPECIFICATION__IMPORTS:
        getImports().clear();
        return;
      case MSLPackage.SPECIFICATION__ABS_PATTERN:
        setAbsPattern((AbstractPattern)null);
        return;
      case MSLPackage.SPECIFICATION__PATTERN:
        getPattern().clear();
        return;
      case MSLPackage.SPECIFICATION__CONFIGURATION:
        setConfiguration((Configuration)null);
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
      case MSLPackage.SPECIFICATION__IMPORTS:
        return imports != null && !imports.isEmpty();
      case MSLPackage.SPECIFICATION__ABS_PATTERN:
        return absPattern != null;
      case MSLPackage.SPECIFICATION__PATTERN:
        return pattern != null && !pattern.isEmpty();
      case MSLPackage.SPECIFICATION__CONFIGURATION:
        return configuration != null;
    }
    return super.eIsSet(featureID);
  }

} //SpecificationImpl
