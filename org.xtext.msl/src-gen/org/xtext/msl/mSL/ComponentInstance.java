/**
 * generated by Xtext 2.12.0
 */
package org.xtext.msl.mSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.msl.mSL.ComponentInstance#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.ComponentInstance#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.msl.mSL.MSLPackage#getComponentInstance()
 * @model
 * @generated
 */
public interface ComponentInstance extends EObject
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
   * @see org.xtext.msl.mSL.MSLPackage#getComponentInstance_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.ComponentInstance#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.msl.mSL.MSLPackage#getComponentInstance_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.ComponentInstance#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // ComponentInstance
