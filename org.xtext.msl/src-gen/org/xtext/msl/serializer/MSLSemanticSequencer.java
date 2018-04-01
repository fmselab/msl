/*
 * generated by Xtext 2.12.0
 */
package org.xtext.msl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.msl.mSL.AbstractComponent;
import org.xtext.msl.mSL.AbstractComponentName;
import org.xtext.msl.mSL.AbstractGroup;
import org.xtext.msl.mSL.AbstractInteraction;
import org.xtext.msl.mSL.AbstractPattern;
import org.xtext.msl.mSL.AbstractSystem;
import org.xtext.msl.mSL.ComponentInstance;
import org.xtext.msl.mSL.ComponentName;
import org.xtext.msl.mSL.ConcreteGroup;
import org.xtext.msl.mSL.ConcreteSystem;
import org.xtext.msl.mSL.Configuration;
import org.xtext.msl.mSL.GroupBinding;
import org.xtext.msl.mSL.GroupDef;
import org.xtext.msl.mSL.Import;
import org.xtext.msl.mSL.Interaction;
import org.xtext.msl.mSL.MSLPackage;
import org.xtext.msl.mSL.Pattern;
import org.xtext.msl.mSL.Specification;
import org.xtext.msl.mSL.SystemBinding;
import org.xtext.msl.services.MSLGrammarAccess;

@SuppressWarnings("all")
public class MSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MSLPackage.ABSTRACT_COMPONENT:
				sequence_AbstractComponent(context, (AbstractComponent) semanticObject); 
				return; 
			case MSLPackage.ABSTRACT_COMPONENT_NAME:
				sequence_AbstractComponentName(context, (AbstractComponentName) semanticObject); 
				return; 
			case MSLPackage.ABSTRACT_GROUP:
				sequence_AbstractGroup(context, (AbstractGroup) semanticObject); 
				return; 
			case MSLPackage.ABSTRACT_INTERACTION:
				sequence_AbstractInteraction(context, (AbstractInteraction) semanticObject); 
				return; 
			case MSLPackage.ABSTRACT_PATTERN:
				sequence_AbstractPattern(context, (AbstractPattern) semanticObject); 
				return; 
			case MSLPackage.ABSTRACT_SYSTEM:
				sequence_AbstractSystem(context, (AbstractSystem) semanticObject); 
				return; 
			case MSLPackage.COMPONENT_INSTANCE:
				sequence_ComponentInstance(context, (ComponentInstance) semanticObject); 
				return; 
			case MSLPackage.COMPONENT_NAME:
				sequence_ComponentName(context, (ComponentName) semanticObject); 
				return; 
			case MSLPackage.CONCRETE_GROUP:
				sequence_ConcreteGroup(context, (ConcreteGroup) semanticObject); 
				return; 
			case MSLPackage.CONCRETE_SYSTEM:
				sequence_ConcreteSystem(context, (ConcreteSystem) semanticObject); 
				return; 
			case MSLPackage.CONFIGURATION:
				sequence_Configuration(context, (Configuration) semanticObject); 
				return; 
			case MSLPackage.GROUP_BINDING:
				sequence_GroupBinding(context, (GroupBinding) semanticObject); 
				return; 
			case MSLPackage.GROUP_DEF:
				sequence_GroupDef(context, (GroupDef) semanticObject); 
				return; 
			case MSLPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case MSLPackage.INTERACTION:
				sequence_Interaction(context, (Interaction) semanticObject); 
				return; 
			case MSLPackage.PATTERN:
				sequence_Pattern(context, (Pattern) semanticObject); 
				return; 
			case MSLPackage.SPECIFICATION:
				sequence_Specification(context, (Specification) semanticObject); 
				return; 
			case MSLPackage.SYSTEM_BINDING:
				sequence_SystemBinding(context, (SystemBinding) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractComponentName returns AbstractComponentName
	 *
	 * Constraint:
	 *     type=[AbstractComponent|FQN_COMPONENT]
	 */
	protected void sequence_AbstractComponentName(ISerializationContext context, AbstractComponentName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MSLPackage.Literals.ABSTRACT_COMPONENT_NAME__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSLPackage.Literals.ABSTRACT_COMPONENT_NAME__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAbstractComponentNameAccess().getTypeAbstractComponentFQN_COMPONENTTerminalRuleCall_0_1(), semanticObject.eGet(MSLPackage.Literals.ABSTRACT_COMPONENT_NAME__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponent returns AbstractComponent
	 *
	 * Constraint:
	 *     name=COMPONENT_TYPE
	 */
	protected void sequence_AbstractComponent(ISerializationContext context, AbstractComponent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MSLPackage.Literals.ABSTRACT_COMPONENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSLPackage.Literals.ABSTRACT_COMPONENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAbstractComponentAccess().getNameCOMPONENT_TYPETerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractGroup returns AbstractGroup
	 *
	 * Constraint:
	 *     (
	 *         name=PATTERN_ID 
	 *         manSys=[AbstractSystem|PATTERN_ID]? 
	 *         (manGrp+=GroupDef manGrp+=GroupDef*)? 
	 *         components+=AbstractComponent 
	 *         components+=AbstractComponent*
	 *     )
	 */
	protected void sequence_AbstractGroup(ISerializationContext context, AbstractGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractInteraction returns AbstractInteraction
	 *
	 * Constraint:
	 *     (start=AbstractComponentName end=AbstractComponentName (low=MULTIPLICITY high=MULTIPLICITY)?)
	 */
	protected void sequence_AbstractInteraction(ISerializationContext context, AbstractInteraction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractPattern returns AbstractPattern
	 *
	 * Constraint:
	 *     (name=PATTERN_ID managedSystems+=AbstractSystem* abstractGroups+=AbstractGroup* interactions+=AbstractInteraction*)
	 */
	protected void sequence_AbstractPattern(ISerializationContext context, AbstractPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractSystem returns AbstractSystem
	 *
	 * Constraint:
	 *     name=PATTERN_ID
	 */
	protected void sequence_AbstractSystem(ISerializationContext context, AbstractSystem semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MSLPackage.Literals.ABSTRACT_SYSTEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSLPackage.Literals.ABSTRACT_SYSTEM__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAbstractSystemAccess().getNamePATTERN_IDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentInstance returns ComponentInstance
	 *
	 * Constraint:
	 *     (name=INSTANCE_ID type=COMPONENT_TYPE)
	 */
	protected void sequence_ComponentInstance(ISerializationContext context, ComponentInstance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MSLPackage.Literals.COMPONENT_INSTANCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSLPackage.Literals.COMPONENT_INSTANCE__NAME));
			if (transientValues.isValueTransient(semanticObject, MSLPackage.Literals.COMPONENT_INSTANCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSLPackage.Literals.COMPONENT_INSTANCE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComponentInstanceAccess().getNameINSTANCE_IDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getComponentInstanceAccess().getTypeCOMPONENT_TYPETerminalRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentName returns ComponentName
	 *
	 * Constraint:
	 *     component=[ComponentInstance|FQN_INSTANCE_ID]
	 */
	protected void sequence_ComponentName(ISerializationContext context, ComponentName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MSLPackage.Literals.COMPONENT_NAME__COMPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSLPackage.Literals.COMPONENT_NAME__COMPONENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComponentNameAccess().getComponentComponentInstanceFQN_INSTANCE_IDTerminalRuleCall_0_1(), semanticObject.eGet(MSLPackage.Literals.COMPONENT_NAME__COMPONENT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConcreteGroup returns ConcreteGroup
	 *
	 * Constraint:
	 *     (
	 *         name=INSTANCE_ID 
	 *         abstractGroups+=[GroupBinding|FQN_PATTERN_ID] 
	 *         abstractGroups+=[GroupBinding|FQN_PATTERN_ID]* 
	 *         manSys=[ConcreteSystem|INSTANCE_ID]? 
	 *         (manGrp+=[ConcreteGroup|INSTANCE_ID] manGrp+=[ConcreteGroup|INSTANCE_ID]*)? 
	 *         components+=ComponentInstance 
	 *         components+=ComponentInstance*
	 *     )
	 */
	protected void sequence_ConcreteGroup(ISerializationContext context, ConcreteGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConcreteSystem returns ConcreteSystem
	 *
	 * Constraint:
	 *     (name=INSTANCE_ID bindings+=[SystemBinding|FQN_PATTERN_ID] bindings+=[SystemBinding|FQN_PATTERN_ID]*)
	 */
	protected void sequence_ConcreteSystem(ISerializationContext context, ConcreteSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Configuration returns Configuration
	 *
	 * Constraint:
	 *     (
	 *         name=PATTERN_ID 
	 *         pattern+=[Pattern|PATTERN_ID] 
	 *         pattern+=[Pattern|PATTERN_ID]* 
	 *         concreteSystems+=ConcreteSystem* 
	 *         concreteGroups+=ConcreteGroup* 
	 *         concreteInteractions+=Interaction*
	 *     )
	 */
	protected void sequence_Configuration(ISerializationContext context, Configuration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GroupBinding returns GroupBinding
	 *
	 * Constraint:
	 *     (name=PATTERN_ID absGroup=[AbstractGroup|FQN_PATTERN_ID])
	 */
	protected void sequence_GroupBinding(ISerializationContext context, GroupBinding semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MSLPackage.Literals.GROUP_BINDING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSLPackage.Literals.GROUP_BINDING__NAME));
			if (transientValues.isValueTransient(semanticObject, MSLPackage.Literals.GROUP_BINDING__ABS_GROUP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSLPackage.Literals.GROUP_BINDING__ABS_GROUP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGroupBindingAccess().getNamePATTERN_IDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGroupBindingAccess().getAbsGroupAbstractGroupFQN_PATTERN_IDTerminalRuleCall_3_0_1(), semanticObject.eGet(MSLPackage.Literals.GROUP_BINDING__ABS_GROUP, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GroupDef returns GroupDef
	 *
	 * Constraint:
	 *     (grp=[AbstractGroup|PATTERN_ID] mult=MULTIPLICITY?)
	 */
	protected void sequence_GroupDef(ISerializationContext context, GroupDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importedNamespace=[AbstractPattern|PATTERN_ID]
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MSLPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSLPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceAbstractPatternPATTERN_IDTerminalRuleCall_1_0_1(), semanticObject.eGet(MSLPackage.Literals.IMPORT__IMPORTED_NAMESPACE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Interaction returns Interaction
	 *
	 * Constraint:
	 *     (start=ComponentName end=ComponentName)
	 */
	protected void sequence_Interaction(ISerializationContext context, Interaction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MSLPackage.Literals.INTERACTION__START) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSLPackage.Literals.INTERACTION__START));
			if (transientValues.isValueTransient(semanticObject, MSLPackage.Literals.INTERACTION__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSLPackage.Literals.INTERACTION__END));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInteractionAccess().getStartComponentNameParserRuleCall_0_0(), semanticObject.getStart());
		feeder.accept(grammarAccess.getInteractionAccess().getEndComponentNameParserRuleCall_2_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Pattern returns Pattern
	 *
	 * Constraint:
	 *     (name=PATTERN_ID absPattern=[AbstractPattern|PATTERN_ID] managedSystems+=SystemBinding* groups+=GroupBinding*)
	 */
	protected void sequence_Pattern(ISerializationContext context, Pattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Specification returns Specification
	 *
	 * Constraint:
	 *     (
	 *         (imports+=Import+ ((absPattern=AbstractPattern configuration=Configuration) | configuration=Configuration)) | 
	 *         (((imports+=Import+ absPattern=AbstractPattern) | absPattern=AbstractPattern)? pattern+=Pattern+ configuration=Configuration) | 
	 *         (absPattern=AbstractPattern configuration=Configuration) | 
	 *         configuration=Configuration
	 *     )?
	 */
	protected void sequence_Specification(ISerializationContext context, Specification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SystemBinding returns SystemBinding
	 *
	 * Constraint:
	 *     (name=PATTERN_ID absSys=[AbstractSystem|FQN_PATTERN_ID])
	 */
	protected void sequence_SystemBinding(ISerializationContext context, SystemBinding semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MSLPackage.Literals.SYSTEM_BINDING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSLPackage.Literals.SYSTEM_BINDING__NAME));
			if (transientValues.isValueTransient(semanticObject, MSLPackage.Literals.SYSTEM_BINDING__ABS_SYS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSLPackage.Literals.SYSTEM_BINDING__ABS_SYS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSystemBindingAccess().getNamePATTERN_IDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSystemBindingAccess().getAbsSysAbstractSystemFQN_PATTERN_IDTerminalRuleCall_3_0_1(), semanticObject.eGet(MSLPackage.Literals.SYSTEM_BINDING__ABS_SYS, false));
		feeder.finish();
	}
	
	
}