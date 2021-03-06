/**
 * generated by Xtext 2.16.0
 */
package org.xtext.msl.mSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.msl.mSL.GroupDef#getGrp <em>Grp</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.GroupDef#getMult <em>Mult</em>}</li>
 * </ul>
 *
 * @see org.xtext.msl.mSL.MSLPackage#getGroupDef()
 * @model
 * @generated
 */
public interface GroupDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Grp</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Grp</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Grp</em>' reference.
   * @see #setGrp(AbstractGroup)
   * @see org.xtext.msl.mSL.MSLPackage#getGroupDef_Grp()
   * @model
   * @generated
   */
  AbstractGroup getGrp();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.GroupDef#getGrp <em>Grp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Grp</em>' reference.
   * @see #getGrp()
   * @generated
   */
  void setGrp(AbstractGroup value);

  /**
   * Returns the value of the '<em><b>Mult</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mult</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mult</em>' attribute.
   * @see #setMult(String)
   * @see org.xtext.msl.mSL.MSLPackage#getGroupDef_Mult()
   * @model
   * @generated
   */
  String getMult();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.GroupDef#getMult <em>Mult</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mult</em>' attribute.
   * @see #getMult()
   * @generated
   */
  void setMult(String value);

} // GroupDef
