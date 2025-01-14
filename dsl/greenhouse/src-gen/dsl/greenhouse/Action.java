/**
 * generated by Xtext 2.24.0
 */
package dsl.greenhouse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.greenhouse.Action#getName <em>Name</em>}</li>
 *   <li>{@link dsl.greenhouse.Action#getValue <em>Value</em>}</li>
 *   <li>{@link dsl.greenhouse.Action#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see dsl.greenhouse.GreenhousePackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dsl.greenhouse.GreenhousePackage#getAction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dsl.greenhouse.Action#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(SettingValue)
   * @see dsl.greenhouse.GreenhousePackage#getAction_Value()
   * @model
   * @generated
   */
  SettingValue getValue();

  /**
   * Sets the value of the '{@link dsl.greenhouse.Action#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(SettingValue value);

  /**
   * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' containment reference.
   * @see #setTrigger(Trigger)
   * @see dsl.greenhouse.GreenhousePackage#getAction_Trigger()
   * @model containment="true"
   * @generated
   */
  Trigger getTrigger();

  /**
   * Sets the value of the '{@link dsl.greenhouse.Action#getTrigger <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger</em>' containment reference.
   * @see #getTrigger()
   * @generated
   */
  void setTrigger(Trigger value);

} // Action
