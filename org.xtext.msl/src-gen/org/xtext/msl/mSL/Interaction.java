/**
 * generated by Xtext 2.14.0
 */
package org.xtext.msl.mSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.msl.mSL.Interaction#getStart <em>Start</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.Interaction#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.xtext.msl.mSL.MSLPackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends EObject
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(ComponentName)
   * @see org.xtext.msl.mSL.MSLPackage#getInteraction_Start()
   * @model containment="true"
   * @generated
   */
  ComponentName getStart();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.Interaction#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(ComponentName value);

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(ComponentName)
   * @see org.xtext.msl.mSL.MSLPackage#getInteraction_End()
   * @model containment="true"
   * @generated
   */
  ComponentName getEnd();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.Interaction#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(ComponentName value);

} // Interaction
