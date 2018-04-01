/**
 * generated by Xtext 2.12.0
 */
package org.xtext.msl.mSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.msl.mSL.AbstractGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.AbstractGroup#getManSys <em>Man Sys</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.AbstractGroup#getManGrp <em>Man Grp</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.AbstractGroup#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see org.xtext.msl.mSL.MSLPackage#getAbstractGroup()
 * @model
 * @generated
 */
public interface AbstractGroup extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.msl.mSL.MSLPackage#getAbstractGroup_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.AbstractGroup#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Man Sys</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Man Sys</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Man Sys</em>' reference.
   * @see #setManSys(AbstractSystem)
   * @see org.xtext.msl.mSL.MSLPackage#getAbstractGroup_ManSys()
   * @model
   * @generated
   */
  AbstractSystem getManSys();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.AbstractGroup#getManSys <em>Man Sys</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Man Sys</em>' reference.
   * @see #getManSys()
   * @generated
   */
  void setManSys(AbstractSystem value);

  /**
   * Returns the value of the '<em><b>Man Grp</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.msl.mSL.GroupDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Man Grp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Man Grp</em>' containment reference list.
   * @see org.xtext.msl.mSL.MSLPackage#getAbstractGroup_ManGrp()
   * @model containment="true"
   * @generated
   */
  EList<GroupDef> getManGrp();

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.msl.mSL.AbstractComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see org.xtext.msl.mSL.MSLPackage#getAbstractGroup_Components()
   * @model containment="true"
   * @generated
   */
  EList<AbstractComponent> getComponents();

} // AbstractGroup
