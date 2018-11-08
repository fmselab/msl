/**
 * generated by Xtext 2.12.0
 */
package org.xtext.msl.mSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.msl.mSL.MSLPackage
 * @generated
 */
public interface MSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MSLFactory eINSTANCE = org.xtext.msl.mSL.impl.MSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Specification</em>'.
   * @generated
   */
  Specification createSpecification();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Abstract Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Pattern</em>'.
   * @generated
   */
  AbstractPattern createAbstractPattern();

  /**
   * Returns a new object of class '<em>Abstract System</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract System</em>'.
   * @generated
   */
  AbstractSystem createAbstractSystem();

  /**
   * Returns a new object of class '<em>Abstract Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Component</em>'.
   * @generated
   */
  AbstractComponent createAbstractComponent();

  /**
   * Returns a new object of class '<em>Group Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group Def</em>'.
   * @generated
   */
  GroupDef createGroupDef();

  /**
   * Returns a new object of class '<em>Att Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Att Value</em>'.
   * @generated
   */
  AttValue createAttValue();

  /**
   * Returns a new object of class '<em>Abstract Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Group</em>'.
   * @generated
   */
  AbstractGroup createAbstractGroup();

  /**
   * Returns a new object of class '<em>Abstract Interaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Interaction</em>'.
   * @generated
   */
  AbstractInteraction createAbstractInteraction();

  /**
   * Returns a new object of class '<em>Abstract Component Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Component Name</em>'.
   * @generated
   */
  AbstractComponentName createAbstractComponentName();

  /**
   * Returns a new object of class '<em>System Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Binding</em>'.
   * @generated
   */
  SystemBinding createSystemBinding();

  /**
   * Returns a new object of class '<em>Group Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group Binding</em>'.
   * @generated
   */
  GroupBinding createGroupBinding();

  /**
   * Returns a new object of class '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern</em>'.
   * @generated
   */
  Pattern createPattern();

  /**
   * Returns a new object of class '<em>Configuration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Configuration</em>'.
   * @generated
   */
  Configuration createConfiguration();

  /**
   * Returns a new object of class '<em>Concrete System</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concrete System</em>'.
   * @generated
   */
  ConcreteSystem createConcreteSystem();

  /**
   * Returns a new object of class '<em>Concrete Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concrete Group</em>'.
   * @generated
   */
  ConcreteGroup createConcreteGroup();

  /**
   * Returns a new object of class '<em>Component Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Instance</em>'.
   * @generated
   */
  ComponentInstance createComponentInstance();

  /**
   * Returns a new object of class '<em>Interaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interaction</em>'.
   * @generated
   */
  Interaction createInteraction();

  /**
   * Returns a new object of class '<em>Component Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Name</em>'.
   * @generated
   */
  ComponentName createComponentName();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MSLPackage getMSLPackage();

} //MSLFactory
