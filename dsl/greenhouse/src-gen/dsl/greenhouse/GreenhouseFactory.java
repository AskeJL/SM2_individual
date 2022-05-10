/**
 * generated by Xtext 2.25.0
 */
package dsl.greenhouse;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dsl.greenhouse.GreenhousePackage
 * @generated
 */
public interface GreenhouseFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GreenhouseFactory eINSTANCE = dsl.greenhouse.impl.GreenhouseFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Hardware Setup</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hardware Setup</em>'.
   * @generated
   */
  HardwareSetup createHardwareSetup();

  /**
   * Returns a new object of class '<em>Hardware</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hardware</em>'.
   * @generated
   */
  Hardware createHardware();

  /**
   * Returns a new object of class '<em>Setting Actuator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Setting Actuator</em>'.
   * @generated
   */
  SettingActuator createSettingActuator();

  /**
   * Returns a new object of class '<em>Setting Sensor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Setting Sensor</em>'.
   * @generated
   */
  SettingSensor createSettingSensor();

  /**
   * Returns a new object of class '<em>Reducer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reducer</em>'.
   * @generated
   */
  Reducer createReducer();

  /**
   * Returns a new object of class '<em>Frequency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Frequency</em>'.
   * @generated
   */
  Frequency createFrequency();

  /**
   * Returns a new object of class '<em>Topic</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Topic</em>'.
   * @generated
   */
  Topic createTopic();

  /**
   * Returns a new object of class '<em>Setting Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Setting Action</em>'.
   * @generated
   */
  SettingAction createSettingAction();

  /**
   * Returns a new object of class '<em>Setting Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Setting Value</em>'.
   * @generated
   */
  SettingValue createSettingValue();

  /**
   * Returns a new object of class '<em>Greenhouse</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Greenhouse</em>'.
   * @generated
   */
  Greenhouse createGreenhouse();

  /**
   * Returns a new object of class '<em>Row</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Row</em>'.
   * @generated
   */
  Row createRow();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  GreenhouseElement createGreenhouseElement();

  /**
   * Returns a new object of class '<em>Row Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Row Element</em>'.
   * @generated
   */
  RowElement createRowElement();

  /**
   * Returns a new object of class '<em>Actuator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actuator</em>'.
   * @generated
   */
  GreenhouseActuator createGreenhouseActuator();

  /**
   * Returns a new object of class '<em>Row Actuator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Row Actuator</em>'.
   * @generated
   */
  RowActuator createRowActuator();

  /**
   * Returns a new object of class '<em>Sensor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sensor</em>'.
   * @generated
   */
  GreenhouseSensor createGreenhouseSensor();

  /**
   * Returns a new object of class '<em>Row Sensor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Row Sensor</em>'.
   * @generated
   */
  RowSensor createRowSensor();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trigger</em>'.
   * @generated
   */
  Trigger createTrigger();

  /**
   * Returns a new object of class '<em>Row Rule Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Row Rule Set</em>'.
   * @generated
   */
  RowRuleSet createRowRuleSet();

  /**
   * Returns a new object of class '<em>Rule Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule Set</em>'.
   * @generated
   */
  GreenhouseRuleSet createGreenhouseRuleSet();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Setting</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Setting</em>'.
   * @generated
   */
  Setting createSetting();

  /**
   * Returns a new object of class '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus</em>'.
   * @generated
   */
  Plus createPlus();

  /**
   * Returns a new object of class '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Minus</em>'.
   * @generated
   */
  Minus createMinus();

  /**
   * Returns a new object of class '<em>Mult</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mult</em>'.
   * @generated
   */
  Mult createMult();

  /**
   * Returns a new object of class '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Div</em>'.
   * @generated
   */
  Div createDiv();

  /**
   * Returns a new object of class '<em>Math Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Math Number</em>'.
   * @generated
   */
  MathNumber createMathNumber();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GreenhousePackage getGreenhousePackage();

} //GreenhouseFactory
