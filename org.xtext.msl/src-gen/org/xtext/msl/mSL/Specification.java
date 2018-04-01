/**
 * generated by Xtext 2.12.0
 */
package org.xtext.msl.mSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.msl.mSL.Specification#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.Specification#getAbsPattern <em>Abs Pattern</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.Specification#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.Specification#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see org.xtext.msl.mSL.MSLPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.msl.mSL.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.xtext.msl.mSL.MSLPackage#getSpecification_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Abs Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abs Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abs Pattern</em>' containment reference.
   * @see #setAbsPattern(AbstractPattern)
   * @see org.xtext.msl.mSL.MSLPackage#getSpecification_AbsPattern()
   * @model containment="true"
   * @generated
   */
  AbstractPattern getAbsPattern();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.Specification#getAbsPattern <em>Abs Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abs Pattern</em>' containment reference.
   * @see #getAbsPattern()
   * @generated
   */
  void setAbsPattern(AbstractPattern value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.msl.mSL.Pattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference list.
   * @see org.xtext.msl.mSL.MSLPackage#getSpecification_Pattern()
   * @model containment="true"
   * @generated
   */
  EList<Pattern> getPattern();

  /**
   * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configuration</em>' containment reference.
   * @see #setConfiguration(Configuration)
   * @see org.xtext.msl.mSL.MSLPackage#getSpecification_Configuration()
   * @model containment="true"
   * @generated
   */
  Configuration getConfiguration();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.Specification#getConfiguration <em>Configuration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Configuration</em>' containment reference.
   * @see #getConfiguration()
   * @generated
   */
  void setConfiguration(Configuration value);

} // Specification