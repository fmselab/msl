/**
 * generated by Xtext 2.13.0
 */
package org.xtext.msl.mSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.msl.mSL.AbstractPattern#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.AbstractPattern#getManagedSystems <em>Managed Systems</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.AbstractPattern#getAbstractGroups <em>Abstract Groups</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.AbstractPattern#getInteractions <em>Interactions</em>}</li>
 * </ul>
 *
 * @see org.xtext.msl.mSL.MSLPackage#getAbstractPattern()
 * @model
 * @generated
 */
public interface AbstractPattern extends EObject
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
   * @see org.xtext.msl.mSL.MSLPackage#getAbstractPattern_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.AbstractPattern#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Managed Systems</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.msl.mSL.AbstractSystem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Managed Systems</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Managed Systems</em>' containment reference list.
   * @see org.xtext.msl.mSL.MSLPackage#getAbstractPattern_ManagedSystems()
   * @model containment="true"
   * @generated
   */
  EList<AbstractSystem> getManagedSystems();

  /**
   * Returns the value of the '<em><b>Abstract Groups</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.msl.mSL.AbstractGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract Groups</em>' containment reference list.
   * @see org.xtext.msl.mSL.MSLPackage#getAbstractPattern_AbstractGroups()
   * @model containment="true"
   * @generated
   */
  EList<AbstractGroup> getAbstractGroups();

  /**
   * Returns the value of the '<em><b>Interactions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.msl.mSL.AbstractInteraction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interactions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interactions</em>' containment reference list.
   * @see org.xtext.msl.mSL.MSLPackage#getAbstractPattern_Interactions()
   * @model containment="true"
   * @generated
   */
  EList<AbstractInteraction> getInteractions();

} // AbstractPattern
