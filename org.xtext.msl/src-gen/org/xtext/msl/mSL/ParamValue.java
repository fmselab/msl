/**
 * generated by Xtext 2.14.0
 */
package org.xtext.msl.mSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.msl.mSL.ParamValue#getNameParam <em>Name Param</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.ParamValue#getValParam <em>Val Param</em>}</li>
 *   <li>{@link org.xtext.msl.mSL.ParamValue#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.xtext.msl.mSL.MSLPackage#getParamValue()
 * @model
 * @generated
 */
public interface ParamValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Name Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Param</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Param</em>' attribute.
   * @see #setNameParam(String)
   * @see org.xtext.msl.mSL.MSLPackage#getParamValue_NameParam()
   * @model
   * @generated
   */
  String getNameParam();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.ParamValue#getNameParam <em>Name Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Param</em>' attribute.
   * @see #getNameParam()
   * @generated
   */
  void setNameParam(String value);

  /**
   * Returns the value of the '<em><b>Val Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val Param</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val Param</em>' attribute.
   * @see #setValParam(String)
   * @see org.xtext.msl.mSL.MSLPackage#getParamValue_ValParam()
   * @model
   * @generated
   */
  String getValParam();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.ParamValue#getValParam <em>Val Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val Param</em>' attribute.
   * @see #getValParam()
   * @generated
   */
  void setValParam(String value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.msl.mSL.TimeUnitKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see org.xtext.msl.mSL.TimeUnitKind
   * @see #setUnit(TimeUnitKind)
   * @see org.xtext.msl.mSL.MSLPackage#getParamValue_Unit()
   * @model
   * @generated
   */
  TimeUnitKind getUnit();

  /**
   * Sets the value of the '{@link org.xtext.msl.mSL.ParamValue#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see org.xtext.msl.mSL.TimeUnitKind
   * @see #getUnit()
   * @generated
   */
  void setUnit(TimeUnitKind value);

} // ParamValue
