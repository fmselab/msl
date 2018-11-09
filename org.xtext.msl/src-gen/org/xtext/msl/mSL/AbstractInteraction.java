/**
 * generated by Xtext 2.14.0
 */
package org.xtext.msl.mSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.msl.mSL.AbstractInteraction#getStart <em>Start</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.AbstractInteraction#getEnd <em>End</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.AbstractInteraction#getLow <em>Low</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.AbstractInteraction#getHigh <em>High</em>}</li>
 * </ul>
 *
 * @see org.xtext.msl.mSL.MSLPackage#getAbstractInteraction()
 * @model
 * @generated
 */
public interface AbstractInteraction extends EObject
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
   * @see #setStart(AbstractComponentName)
   * @see org.xtext.msl.mSL.MSLPackage#getAbstractInteraction_Start()
   * @model containment="true"
   * @generated
   */
  AbstractComponentName getStart();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.AbstractInteraction#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(AbstractComponentName value);

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(AbstractComponentName)
   * @see org.xtext.msl.mSL.MSLPackage#getAbstractInteraction_End()
   * @model containment="true"
   * @generated
   */
  AbstractComponentName getEnd();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.AbstractInteraction#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(AbstractComponentName value);

  /**
   * Returns the value of the '<em><b>Low</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Low</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Low</em>' attribute.
   * @see #setLow(String)
   * @see org.xtext.msl.mSL.MSLPackage#getAbstractInteraction_Low()
   * @model
   * @generated
   */
  String getLow();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.AbstractInteraction#getLow <em>Low</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Low</em>' attribute.
   * @see #getLow()
   * @generated
   */
  void setLow(String value);

  /**
   * Returns the value of the '<em><b>High</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>High</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>High</em>' attribute.
   * @see #setHigh(String)
   * @see org.xtext.msl.mSL.MSLPackage#getAbstractInteraction_High()
   * @model
   * @generated
   */
  String getHigh();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.AbstractInteraction#getHigh <em>High</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>High</em>' attribute.
   * @see #getHigh()
   * @generated
   */
  void setHigh(String value);

} // AbstractInteraction
