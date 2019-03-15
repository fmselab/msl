/**
 * generated by Xtext 2.16.0
 */
package org.xtext.msl.mSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.msl.mSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MSLFactoryImpl extends EFactoryImpl implements MSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MSLFactory init()
  {
    try
    {
      MSLFactory theMSLFactory = (MSLFactory)EPackage.Registry.INSTANCE.getEFactory(MSLPackage.eNS_URI);
      if (theMSLFactory != null)
      {
        return theMSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MSLPackage.SPECIFICATION: return createSpecification();
      case MSLPackage.IMPORT: return createImport();
      case MSLPackage.ABSTRACT_PATTERN: return createAbstractPattern();
      case MSLPackage.ABSTRACT_SYSTEM: return createAbstractSystem();
      case MSLPackage.ABSTRACT_COMPONENT: return createAbstractComponent();
      case MSLPackage.GROUP_DEF: return createGroupDef();
      case MSLPackage.ABSTRACT_GROUP: return createAbstractGroup();
      case MSLPackage.ABSTRACT_INTERACTION: return createAbstractInteraction();
      case MSLPackage.ABSTRACT_COMPONENT_NAME: return createAbstractComponentName();
      case MSLPackage.SYSTEM_BINDING: return createSystemBinding();
      case MSLPackage.GROUP_BINDING: return createGroupBinding();
      case MSLPackage.PATTERN: return createPattern();
      case MSLPackage.CONFIGURATION: return createConfiguration();
      case MSLPackage.CONCRETE_SYSTEM: return createConcreteSystem();
      case MSLPackage.CONCRETE_GROUP: return createConcreteGroup();
      case MSLPackage.PARAM_VALUE: return createParamValue();
      case MSLPackage.COMPONENT_INSTANCE: return createComponentInstance();
      case MSLPackage.INTERACTION: return createInteraction();
      case MSLPackage.COMPONENT_NAME: return createComponentName();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MSLPackage.TIME_UNIT_KIND:
        return createTimeUnitKindFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MSLPackage.TIME_UNIT_KIND:
        return convertTimeUnitKindToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Specification createSpecification()
  {
    SpecificationImpl specification = new SpecificationImpl();
    return specification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractPattern createAbstractPattern()
  {
    AbstractPatternImpl abstractPattern = new AbstractPatternImpl();
    return abstractPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractSystem createAbstractSystem()
  {
    AbstractSystemImpl abstractSystem = new AbstractSystemImpl();
    return abstractSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractComponent createAbstractComponent()
  {
    AbstractComponentImpl abstractComponent = new AbstractComponentImpl();
    return abstractComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GroupDef createGroupDef()
  {
    GroupDefImpl groupDef = new GroupDefImpl();
    return groupDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractGroup createAbstractGroup()
  {
    AbstractGroupImpl abstractGroup = new AbstractGroupImpl();
    return abstractGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractInteraction createAbstractInteraction()
  {
    AbstractInteractionImpl abstractInteraction = new AbstractInteractionImpl();
    return abstractInteraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractComponentName createAbstractComponentName()
  {
    AbstractComponentNameImpl abstractComponentName = new AbstractComponentNameImpl();
    return abstractComponentName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SystemBinding createSystemBinding()
  {
    SystemBindingImpl systemBinding = new SystemBindingImpl();
    return systemBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GroupBinding createGroupBinding()
  {
    GroupBindingImpl groupBinding = new GroupBindingImpl();
    return groupBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pattern createPattern()
  {
    PatternImpl pattern = new PatternImpl();
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Configuration createConfiguration()
  {
    ConfigurationImpl configuration = new ConfigurationImpl();
    return configuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConcreteSystem createConcreteSystem()
  {
    ConcreteSystemImpl concreteSystem = new ConcreteSystemImpl();
    return concreteSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConcreteGroup createConcreteGroup()
  {
    ConcreteGroupImpl concreteGroup = new ConcreteGroupImpl();
    return concreteGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParamValue createParamValue()
  {
    ParamValueImpl paramValue = new ParamValueImpl();
    return paramValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComponentInstance createComponentInstance()
  {
    ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
    return componentInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Interaction createInteraction()
  {
    InteractionImpl interaction = new InteractionImpl();
    return interaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComponentName createComponentName()
  {
    ComponentNameImpl componentName = new ComponentNameImpl();
    return componentName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeUnitKind createTimeUnitKindFromString(EDataType eDataType, String initialValue)
  {
    TimeUnitKind result = TimeUnitKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTimeUnitKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MSLPackage getMSLPackage()
  {
    return (MSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MSLPackage getPackage()
  {
    return MSLPackage.eINSTANCE;
  }

} //MSLFactoryImpl
