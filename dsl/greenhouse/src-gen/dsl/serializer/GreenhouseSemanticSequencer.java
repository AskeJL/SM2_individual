/*
 * generated by Xtext 2.24.0
 */
package dsl.serializer;

import com.google.inject.Inject;
import dsl.greenhouse.Button;
import dsl.greenhouse.Controller;
import dsl.greenhouse.ControllerType;
import dsl.greenhouse.Div;
import dsl.greenhouse.Frequency;
import dsl.greenhouse.Greenhouse;
import dsl.greenhouse.GreenhouseActuator;
import dsl.greenhouse.GreenhouseButton;
import dsl.greenhouse.GreenhousePackage;
import dsl.greenhouse.GreenhouseRuleSet;
import dsl.greenhouse.GreenhouseSensor;
import dsl.greenhouse.HardwareSetup;
import dsl.greenhouse.MathNumber;
import dsl.greenhouse.Minus;
import dsl.greenhouse.Model;
import dsl.greenhouse.Mult;
import dsl.greenhouse.Plus;
import dsl.greenhouse.Reducer;
import dsl.greenhouse.Row;
import dsl.greenhouse.RowActuator;
import dsl.greenhouse.RowButton;
import dsl.greenhouse.RowRuleSet;
import dsl.greenhouse.RowSensor;
import dsl.greenhouse.SettingAction;
import dsl.greenhouse.SettingActuator;
import dsl.greenhouse.SettingSensor;
import dsl.greenhouse.SettingValue;
import dsl.greenhouse.State;
import dsl.greenhouse.Topic;
import dsl.greenhouse.Trigger;
import dsl.greenhouse.Variable;
import dsl.services.GreenhouseGrammarAccess;
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

@SuppressWarnings("all")
public class GreenhouseSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GreenhouseGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GreenhousePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GreenhousePackage.ACTION:
				sequence_Action(context, (dsl.greenhouse.Action) semanticObject); 
				return; 
			case GreenhousePackage.BUTTON:
				sequence_Button(context, (Button) semanticObject); 
				return; 
			case GreenhousePackage.CONTROLLER:
				sequence_Controller(context, (Controller) semanticObject); 
				return; 
			case GreenhousePackage.CONTROLLER_TYPE:
				sequence_ControllerType(context, (ControllerType) semanticObject); 
				return; 
			case GreenhousePackage.DIV:
				sequence_Factor(context, (Div) semanticObject); 
				return; 
			case GreenhousePackage.FREQUENCY:
				sequence_Frequency(context, (Frequency) semanticObject); 
				return; 
			case GreenhousePackage.GREENHOUSE:
				sequence_Greenhouse(context, (Greenhouse) semanticObject); 
				return; 
			case GreenhousePackage.GREENHOUSE_ACTUATOR:
				sequence_GreenhouseActuator(context, (GreenhouseActuator) semanticObject); 
				return; 
			case GreenhousePackage.GREENHOUSE_BUTTON:
				sequence_GreenhouseButton(context, (GreenhouseButton) semanticObject); 
				return; 
			case GreenhousePackage.GREENHOUSE_RULE_SET:
				sequence_GreenhouseRuleSet(context, (GreenhouseRuleSet) semanticObject); 
				return; 
			case GreenhousePackage.GREENHOUSE_SENSOR:
				sequence_GreenhouseSensor(context, (GreenhouseSensor) semanticObject); 
				return; 
			case GreenhousePackage.HARDWARE_SETUP:
				sequence_HardwareSetup(context, (HardwareSetup) semanticObject); 
				return; 
			case GreenhousePackage.MATH_NUMBER:
				sequence_Primary(context, (MathNumber) semanticObject); 
				return; 
			case GreenhousePackage.MINUS:
				sequence_Exp(context, (Minus) semanticObject); 
				return; 
			case GreenhousePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case GreenhousePackage.MULT:
				sequence_Factor(context, (Mult) semanticObject); 
				return; 
			case GreenhousePackage.PLUS:
				sequence_Exp(context, (Plus) semanticObject); 
				return; 
			case GreenhousePackage.REDUCER:
				sequence_Reducer(context, (Reducer) semanticObject); 
				return; 
			case GreenhousePackage.ROW:
				sequence_Row(context, (Row) semanticObject); 
				return; 
			case GreenhousePackage.ROW_ACTUATOR:
				sequence_RowActuator(context, (RowActuator) semanticObject); 
				return; 
			case GreenhousePackage.ROW_BUTTON:
				sequence_RowButton(context, (RowButton) semanticObject); 
				return; 
			case GreenhousePackage.ROW_RULE_SET:
				sequence_RowRuleSet(context, (RowRuleSet) semanticObject); 
				return; 
			case GreenhousePackage.ROW_SENSOR:
				sequence_RowSensor(context, (RowSensor) semanticObject); 
				return; 
			case GreenhousePackage.SETTING_ACTION:
				sequence_SettingAction(context, (SettingAction) semanticObject); 
				return; 
			case GreenhousePackage.SETTING_ACTUATOR:
				sequence_SettingActuator(context, (SettingActuator) semanticObject); 
				return; 
			case GreenhousePackage.SETTING_SENSOR:
				sequence_SettingSensor(context, (SettingSensor) semanticObject); 
				return; 
			case GreenhousePackage.SETTING_VALUE:
				sequence_SettingValue(context, (SettingValue) semanticObject); 
				return; 
			case GreenhousePackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case GreenhousePackage.TOPIC:
				sequence_Topic(context, (Topic) semanticObject); 
				return; 
			case GreenhousePackage.TRIGGER:
				sequence_Trigger(context, (Trigger) semanticObject); 
				return; 
			case GreenhousePackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (name=ID value=[SettingValue|ID] trigger=Trigger)
	 */
	protected void sequence_Action(ISerializationContext context, dsl.greenhouse.Action semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.ACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.ACTION__NAME));
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.ACTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.ACTION__VALUE));
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.ACTION__TRIGGER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.ACTION__TRIGGER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getActionAccess().getValueSettingValueIDTerminalRuleCall_1_0_1(), semanticObject.eGet(GreenhousePackage.Literals.ACTION__VALUE, false));
		feeder.accept(grammarAccess.getActionAccess().getTriggerTriggerParserRuleCall_4_0(), semanticObject.getTrigger());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Hardware returns Button
	 *     Button returns Button
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Button(ISerializationContext context, Button semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.HARDWARE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.HARDWARE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ControllerType returns ControllerType
	 *
	 * Constraint:
	 *     (name='ESP32' | name='ESP8266')
	 */
	protected void sequence_ControllerType(ISerializationContext context, ControllerType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Controller returns Controller
	 *
	 * Constraint:
	 *     (name=ID type=ControllerType)
	 */
	protected void sequence_Controller(ISerializationContext context, Controller semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.CONTROLLER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.CONTROLLER__NAME));
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.CONTROLLER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.CONTROLLER__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getControllerAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getControllerAccess().getTypeControllerTypeParserRuleCall_4_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Minus
	 *     Exp.Plus_1_0_0_0 returns Minus
	 *     Exp.Minus_1_0_1_0 returns Minus
	 *     Factor returns Minus
	 *     Factor.Mult_1_0_0_0 returns Minus
	 *     Factor.Div_1_0_1_0 returns Minus
	 *     Primary returns Minus
	 *
	 * Constraint:
	 *     (left=Exp_Minus_1_0_1_0 right=Factor)
	 */
	protected void sequence_Exp(ISerializationContext context, Minus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.MINUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.MINUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Plus
	 *     Exp.Plus_1_0_0_0 returns Plus
	 *     Exp.Minus_1_0_1_0 returns Plus
	 *     Factor returns Plus
	 *     Factor.Mult_1_0_0_0 returns Plus
	 *     Factor.Div_1_0_1_0 returns Plus
	 *     Primary returns Plus
	 *
	 * Constraint:
	 *     (left=Exp_Plus_1_0_0_0 right=Factor)
	 */
	protected void sequence_Exp(ISerializationContext context, Plus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.PLUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.PLUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Div
	 *     Exp.Plus_1_0_0_0 returns Div
	 *     Exp.Minus_1_0_1_0 returns Div
	 *     Factor returns Div
	 *     Factor.Mult_1_0_0_0 returns Div
	 *     Factor.Div_1_0_1_0 returns Div
	 *     Primary returns Div
	 *
	 * Constraint:
	 *     (left=Factor_Div_1_0_1_0 right=Primary)
	 */
	protected void sequence_Factor(ISerializationContext context, Div semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.DIV__LEFT));
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.DIV__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Mult
	 *     Exp.Plus_1_0_0_0 returns Mult
	 *     Exp.Minus_1_0_1_0 returns Mult
	 *     Factor returns Mult
	 *     Factor.Mult_1_0_0_0 returns Mult
	 *     Factor.Div_1_0_1_0 returns Mult
	 *     Primary returns Mult
	 *
	 * Constraint:
	 *     (left=Factor_Mult_1_0_0_0 right=Primary)
	 */
	protected void sequence_Factor(ISerializationContext context, Mult semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.MULT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.MULT__LEFT));
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.MULT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.MULT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Frequency returns Frequency
	 *
	 * Constraint:
	 *     freq=Exp
	 */
	protected void sequence_Frequency(ISerializationContext context, Frequency semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.FREQUENCY__FREQ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.FREQUENCY__FREQ));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFrequencyAccess().getFreqExpParserRuleCall_0_0(), semanticObject.getFreq());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GreenhouseElement returns GreenhouseActuator
	 *     GreenhouseActuator returns GreenhouseActuator
	 *
	 * Constraint:
	 *     (type=[SettingActuator|ID] name=ID controller=[Controller|ID] action+=Action? action+=Action*)
	 */
	protected void sequence_GreenhouseActuator(ISerializationContext context, GreenhouseActuator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GreenhouseElement returns GreenhouseButton
	 *     GreenhouseButton returns GreenhouseButton
	 *
	 * Constraint:
	 *     (type=[Button|ID] name=ID controller=[Controller|ID])
	 */
	protected void sequence_GreenhouseButton(ISerializationContext context, GreenhouseButton semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.GREENHOUSE_BUTTON__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.GREENHOUSE_BUTTON__TYPE));
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.GREENHOUSE_BUTTON__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.GREENHOUSE_BUTTON__NAME));
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.GREENHOUSE_BUTTON__CONTROLLER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.GREENHOUSE_BUTTON__CONTROLLER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGreenhouseButtonAccess().getTypeButtonIDTerminalRuleCall_0_0_1(), semanticObject.eGet(GreenhousePackage.Literals.GREENHOUSE_BUTTON__TYPE, false));
		feeder.accept(grammarAccess.getGreenhouseButtonAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGreenhouseButtonAccess().getControllerControllerIDTerminalRuleCall_5_0_1(), semanticObject.eGet(GreenhousePackage.Literals.GREENHOUSE_BUTTON__CONTROLLER, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GreenhouseElement returns GreenhouseRuleSet
	 *     GreenhouseRuleSet returns GreenhouseRuleSet
	 *
	 * Constraint:
	 *     (actuator=[GreenhouseActuator|ID] action=[Action|ID] settingvalue=[SettingValue|ID] sensor=[GreenhouseSensor|ID] state=[State|ID])
	 */
	protected void sequence_GreenhouseRuleSet(ISerializationContext context, GreenhouseRuleSet semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.GREENHOUSE_RULE_SET__ACTUATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.GREENHOUSE_RULE_SET__ACTUATOR));
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.GREENHOUSE_RULE_SET__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.GREENHOUSE_RULE_SET__ACTION));
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.GREENHOUSE_RULE_SET__SETTINGVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.GREENHOUSE_RULE_SET__SETTINGVALUE));
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.GREENHOUSE_RULE_SET__SENSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.GREENHOUSE_RULE_SET__SENSOR));
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.GREENHOUSE_RULE_SET__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.GREENHOUSE_RULE_SET__STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGreenhouseRuleSetAccess().getActuatorGreenhouseActuatorIDTerminalRuleCall_2_0_1(), semanticObject.eGet(GreenhousePackage.Literals.GREENHOUSE_RULE_SET__ACTUATOR, false));
		feeder.accept(grammarAccess.getGreenhouseRuleSetAccess().getActionActionIDTerminalRuleCall_4_0_1(), semanticObject.eGet(GreenhousePackage.Literals.GREENHOUSE_RULE_SET__ACTION, false));
		feeder.accept(grammarAccess.getGreenhouseRuleSetAccess().getSettingvalueSettingValueIDTerminalRuleCall_5_0_1(), semanticObject.eGet(GreenhousePackage.Literals.GREENHOUSE_RULE_SET__SETTINGVALUE, false));
		feeder.accept(grammarAccess.getGreenhouseRuleSetAccess().getSensorGreenhouseSensorIDTerminalRuleCall_7_0_1(), semanticObject.eGet(GreenhousePackage.Literals.GREENHOUSE_RULE_SET__SENSOR, false));
		feeder.accept(grammarAccess.getGreenhouseRuleSetAccess().getStateStateIDTerminalRuleCall_9_0_1(), semanticObject.eGet(GreenhousePackage.Literals.GREENHOUSE_RULE_SET__STATE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GreenhouseElement returns GreenhouseSensor
	 *     GreenhouseSensor returns GreenhouseSensor
	 *
	 * Constraint:
	 *     (
	 *         type=[SettingSensor|ID] 
	 *         name=ID 
	 *         controller=[Controller|ID] 
	 *         variable=Variable 
	 *         states+=State 
	 *         states+=State*
	 *     )
	 */
	protected void sequence_GreenhouseSensor(ISerializationContext context, GreenhouseSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Greenhouse returns Greenhouse
	 *
	 * Constraint:
	 *     (name=ID row+=Row* elements+=GreenhouseElement*)
	 */
	protected void sequence_Greenhouse(ISerializationContext context, Greenhouse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     HardwareSetup returns HardwareSetup
	 *
	 * Constraint:
	 *     (hardware+=Hardware* controllers+=Controller+)
	 */
	protected void sequence_HardwareSetup(ISerializationContext context, HardwareSetup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (name=ID hardwareSetup+=HardwareSetup? greenhouses+=Greenhouse*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns MathNumber
	 *     Exp.Plus_1_0_0_0 returns MathNumber
	 *     Exp.Minus_1_0_1_0 returns MathNumber
	 *     Factor returns MathNumber
	 *     Factor.Mult_1_0_0_0 returns MathNumber
	 *     Factor.Div_1_0_1_0 returns MathNumber
	 *     Primary returns MathNumber
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Primary(ISerializationContext context, MathNumber semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.MATH_NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.MATH_NUMBER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Reducer returns Reducer
	 *
	 * Constraint:
	 *     (name='average' | name='median')
	 */
	protected void sequence_Reducer(ISerializationContext context, Reducer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RowElement returns RowActuator
	 *     RowActuator returns RowActuator
	 *
	 * Constraint:
	 *     (type=[SettingActuator|ID] name=ID controller=[Controller|ID] action+=Action? action+=Action*)
	 */
	protected void sequence_RowActuator(ISerializationContext context, RowActuator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RowElement returns RowButton
	 *     RowButton returns RowButton
	 *
	 * Constraint:
	 *     (type=[Button|ID] name=ID controller=[Controller|ID] number=Exp)
	 */
	protected void sequence_RowButton(ISerializationContext context, RowButton semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.ROW_BUTTON__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.ROW_BUTTON__TYPE));
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.ROW_BUTTON__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.ROW_BUTTON__NAME));
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.ROW_BUTTON__CONTROLLER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.ROW_BUTTON__CONTROLLER));
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.ROW_BUTTON__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.ROW_BUTTON__NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRowButtonAccess().getTypeButtonIDTerminalRuleCall_0_0_1(), semanticObject.eGet(GreenhousePackage.Literals.ROW_BUTTON__TYPE, false));
		feeder.accept(grammarAccess.getRowButtonAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRowButtonAccess().getControllerControllerIDTerminalRuleCall_5_0_1(), semanticObject.eGet(GreenhousePackage.Literals.ROW_BUTTON__CONTROLLER, false));
		feeder.accept(grammarAccess.getRowButtonAccess().getNumberExpParserRuleCall_8_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RowElement returns RowRuleSet
	 *     RowRuleSet returns RowRuleSet
	 *
	 * Constraint:
	 *     (trigger=[Trigger|ID] Actuator=[RowActuator|ID] sensor=[RowSensor|ID] state=[State|ID])
	 */
	protected void sequence_RowRuleSet(ISerializationContext context, RowRuleSet semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.ROW_RULE_SET__TRIGGER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.ROW_RULE_SET__TRIGGER));
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.ROW_RULE_SET__ACTUATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.ROW_RULE_SET__ACTUATOR));
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.ROW_RULE_SET__SENSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.ROW_RULE_SET__SENSOR));
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.ROW_RULE_SET__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.ROW_RULE_SET__STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRowRuleSetAccess().getTriggerTriggerIDTerminalRuleCall_2_0_1(), semanticObject.eGet(GreenhousePackage.Literals.ROW_RULE_SET__TRIGGER, false));
		feeder.accept(grammarAccess.getRowRuleSetAccess().getActuatorRowActuatorIDTerminalRuleCall_4_0_1(), semanticObject.eGet(GreenhousePackage.Literals.ROW_RULE_SET__ACTUATOR, false));
		feeder.accept(grammarAccess.getRowRuleSetAccess().getSensorRowSensorIDTerminalRuleCall_6_0_1(), semanticObject.eGet(GreenhousePackage.Literals.ROW_RULE_SET__SENSOR, false));
		feeder.accept(grammarAccess.getRowRuleSetAccess().getStateStateIDTerminalRuleCall_8_0_1(), semanticObject.eGet(GreenhousePackage.Literals.ROW_RULE_SET__STATE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RowElement returns RowSensor
	 *     RowSensor returns RowSensor
	 *
	 * Constraint:
	 *     (
	 *         type=[SettingSensor|ID] 
	 *         name=ID 
	 *         controller=[Controller|ID] 
	 *         variable=Variable 
	 *         states+=State 
	 *         states+=State*
	 *     )
	 */
	protected void sequence_RowSensor(ISerializationContext context, RowSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Row returns Row
	 *
	 * Constraint:
	 *     (name=ID elements+=RowElement*)
	 */
	protected void sequence_Row(ISerializationContext context, Row semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SettingAction returns SettingAction
	 *
	 * Constraint:
	 *     (name=ID settingValue+=SettingValue settingValue+=SettingValue*)
	 */
	protected void sequence_SettingAction(ISerializationContext context, SettingAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Hardware returns SettingActuator
	 *     SettingActuator returns SettingActuator
	 *
	 * Constraint:
	 *     (name=ID settingAction+=SettingAction settingAction+=SettingAction*)
	 */
	protected void sequence_SettingActuator(ISerializationContext context, SettingActuator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Hardware returns SettingSensor
	 *     SettingSensor returns SettingSensor
	 *
	 * Constraint:
	 *     (name=ID reducer=Reducer? frequency=Frequency)
	 */
	protected void sequence_SettingSensor(ISerializationContext context, SettingSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SettingValue returns SettingValue
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_SettingValue(ISerializationContext context, SettingValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.SETTING_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.SETTING_VALUE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSettingValueAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (name=ID variable=[Variable|ID] (op='<' | op='>' | op='=') threshold=Exp)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Topic returns Topic
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Topic(ISerializationContext context, Topic semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.TOPIC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.TOPIC__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Trigger returns Trigger
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Trigger(ISerializationContext context, Trigger semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.TRIGGER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.TRIGGER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTriggerAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GreenhousePackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreenhousePackage.Literals.VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
