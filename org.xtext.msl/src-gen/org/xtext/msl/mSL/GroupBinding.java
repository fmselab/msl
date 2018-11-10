/**
 * generated by Xtext 2.15.0
 */
package org.xtext.msl.mSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.msl.mSL.GroupBinding#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.GroupBinding#getAbsGroup <em>Abs Group</em>}</li>
 * </ul>
 *
 * @see org.xtext.msl.mSL.MSLPackage#getGroupBinding()
 * @model
 * @generated
 */
public interface GroupBinding extends EObject
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
   * @see org.xtext.msl.mSL.MSLPackage#getGroupBinding_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.GroupBinding#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Abs Group</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abs Group</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abs Group</em>' reference.
   * @see #setAbsGroup(AbstractGroup)
   * @see org.xtext.msl.mSL.MSLPackage#getGroupBinding_AbsGroup()
   * @model
   * @generated
   */
  AbstractGroup getAbsGroup();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.GroupBinding#getAbsGroup <em>Abs Group</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abs Group</em>' reference.
   * @see #getAbsGroup()
   * @generated
   */
  void setAbsGroup(AbstractGroup value);

} // GroupBinding
