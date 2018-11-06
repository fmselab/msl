/**
 * generated by Xtext 2.13.0
 */
package org.xtext.msl.mSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.msl.mSL.Configuration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.Configuration#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.Configuration#getConcreteSystems <em>Concrete Systems</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.Configuration#getConcreteGroups <em>Concrete Groups</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.Configuration#getConcreteInteractions <em>Concrete Interactions</em>}</li>
 * </ul>
 *
 * @see org.xtext.msl.mSL.MSLPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject
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
   * @see org.xtext.msl.mSL.MSLPackage#getConfiguration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.Configuration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' reference list.
   * The list contents are of type {@link org.xtext.msl.mSL.Pattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' reference list.
   * @see org.xtext.msl.mSL.MSLPackage#getConfiguration_Pattern()
   * @model
   * @generated
   */
  EList<Pattern> getPattern();

  /**
   * Returns the value of the '<em><b>Concrete Systems</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.msl.mSL.ConcreteSystem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concrete Systems</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concrete Systems</em>' containment reference list.
   * @see org.xtext.msl.mSL.MSLPackage#getConfiguration_ConcreteSystems()
   * @model containment="true"
   * @generated
   */
  EList<ConcreteSystem> getConcreteSystems();

  /**
   * Returns the value of the '<em><b>Concrete Groups</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.msl.mSL.ConcreteGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concrete Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concrete Groups</em>' containment reference list.
   * @see org.xtext.msl.mSL.MSLPackage#getConfiguration_ConcreteGroups()
   * @model containment="true"
   * @generated
   */
  EList<ConcreteGroup> getConcreteGroups();

  /**
   * Returns the value of the '<em><b>Concrete Interactions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.msl.mSL.Interaction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concrete Interactions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concrete Interactions</em>' containment reference list.
   * @see org.xtext.msl.mSL.MSLPackage#getConfiguration_ConcreteInteractions()
   * @model containment="true"
   * @generated
   */
  EList<Interaction> getConcreteInteractions();

} // Configuration
