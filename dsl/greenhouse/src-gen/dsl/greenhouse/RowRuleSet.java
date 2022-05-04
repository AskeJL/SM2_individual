/**
 * generated by Xtext 2.25.0
 */
package dsl.greenhouse;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row Rule Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.greenhouse.RowRuleSet#getActuator <em>Actuator</em>}</li>
 *   <li>{@link dsl.greenhouse.RowRuleSet#getAction <em>Action</em>}</li>
 *   <li>{@link dsl.greenhouse.RowRuleSet#getSensor <em>Sensor</em>}</li>
 *   <li>{@link dsl.greenhouse.RowRuleSet#getState <em>State</em>}</li>
 * </ul>
 *
 * @see dsl.greenhouse.GreenhousePackage#getRowRuleSet()
 * @model
 * @generated
 */
public interface RowRuleSet extends RowElement
{
  /**
   * Returns the value of the '<em><b>Actuator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actuator</em>' reference.
   * @see #setActuator(RowActuator)
   * @see dsl.greenhouse.GreenhousePackage#getRowRuleSet_Actuator()
   * @model
   * @generated
   */
  RowActuator getActuator();

  /**
   * Sets the value of the '{@link dsl.greenhouse.RowRuleSet#getActuator <em>Actuator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actuator</em>' reference.
   * @see #getActuator()
   * @generated
   */
  void setActuator(RowActuator value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' reference.
   * @see #setAction(Action)
   * @see dsl.greenhouse.GreenhousePackage#getRowRuleSet_Action()
   * @model
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link dsl.greenhouse.RowRuleSet#getAction <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

  /**
   * Returns the value of the '<em><b>Sensor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensor</em>' reference.
   * @see #setSensor(RowSensor)
   * @see dsl.greenhouse.GreenhousePackage#getRowRuleSet_Sensor()
   * @model
   * @generated
   */
  RowSensor getSensor();

  /**
   * Sets the value of the '{@link dsl.greenhouse.RowRuleSet#getSensor <em>Sensor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sensor</em>' reference.
   * @see #getSensor()
   * @generated
   */
  void setSensor(RowSensor value);

  /**
   * Returns the value of the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' reference.
   * @see #setState(State)
   * @see dsl.greenhouse.GreenhousePackage#getRowRuleSet_State()
   * @model
   * @generated
   */
  State getState();

  /**
   * Sets the value of the '{@link dsl.greenhouse.RowRuleSet#getState <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' reference.
   * @see #getState()
   * @generated
   */
  void setState(State value);

} // RowRuleSet