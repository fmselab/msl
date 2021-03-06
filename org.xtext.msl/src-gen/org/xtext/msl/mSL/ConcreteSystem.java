/**
 * generated by Xtext 2.16.0
 */
package org.xtext.msl.mSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.msl.mSL.ConcreteSystem#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.ConcreteSystem#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @see org.xtext.msl.mSL.MSLPackage#getConcreteSystem()
 * @model
 * @generated
 */
public interface ConcreteSystem extends EObject
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
   * @see org.xtext.msl.mSL.MSLPackage#getConcreteSystem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.ConcreteSystem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Bindings</b></em>' reference list.
   * The list contents are of type {@link org.xtext.msl.mSL.SystemBinding}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bindings</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bindings</em>' reference list.
   * @see org.xtext.msl.mSL.MSLPackage#getConcreteSystem_Bindings()
   * @model
   * @generated
   */
  EList<SystemBinding> getBindings();

} // ConcreteSystem
