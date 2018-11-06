/**
 * generated by Xtext 2.12.0
 */
package org.xtext.msl.mSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.xtext.msl.mSL.AbstractGroup;
import org.xtext.msl.mSL.GroupDef;
import org.xtext.msl.mSL.MSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.msl.mSL.impl.GroupDefImpl#getGrp <em>Grp</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.impl.GroupDefImpl#getMult <em>Mult</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupDefImpl extends MinimalEObjectImpl.Container implements GroupDef
{
  /**
   * The cached value of the '{@link #getGrp() <em>Grp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGrp()
   * @generated
   * @ordered
   */
  protected AbstractGroup grp;

  /**
   * The default value of the '{@link #getMult() <em>Mult</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMult()
   * @generated
   * @ordered
   */
  protected static final String MULT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMult() <em>Mult</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMult()
   * @generated
   * @ordered
   */
  protected String mult = MULT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroupDefImpl()
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
    return MSLPackage.Literals.GROUP_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractGroup getGrp()
  {
    if (grp != null && grp.eIsProxy())
    {
      InternalEObject oldGrp = (InternalEObject)grp;
      grp = (AbstractGroup)eResolveProxy(oldGrp);
      if (grp != oldGrp)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MSLPackage.GROUP_DEF__GRP, oldGrp, grp));
      }
    }
    return grp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractGroup basicGetGrp()
  {
    return grp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGrp(AbstractGroup newGrp)
  {
    AbstractGroup oldGrp = grp;
    grp = newGrp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MSLPackage.GROUP_DEF__GRP, oldGrp, grp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMult()
  {
    return mult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMult(String newMult)
  {
    String oldMult = mult;
    mult = newMult;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MSLPackage.GROUP_DEF__MULT, oldMult, mult));
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
      case MSLPackage.GROUP_DEF__GRP:
        if (resolve) return getGrp();
        return basicGetGrp();
      case MSLPackage.GROUP_DEF__MULT:
        return getMult();
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
      case MSLPackage.GROUP_DEF__GRP:
        setGrp((AbstractGroup)newValue);
        return;
      case MSLPackage.GROUP_DEF__MULT:
        setMult((String)newValue);
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
      case MSLPackage.GROUP_DEF__GRP:
        setGrp((AbstractGroup)null);
        return;
      case MSLPackage.GROUP_DEF__MULT:
        setMult(MULT_EDEFAULT);
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
      case MSLPackage.GROUP_DEF__GRP:
        return grp != null;
      case MSLPackage.GROUP_DEF__MULT:
        return MULT_EDEFAULT == null ? mult != null : !MULT_EDEFAULT.equals(mult);
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
    result.append(" (mult: ");
    result.append(mult);
    result.append(')');
    return result.toString();
  }

} //GroupDefImpl
