/**
 * generated by Xtext 2.25.0
 */
package dsl.greenhouse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.greenhouse.Condition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see dsl.greenhouse.GreenhousePackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dsl.greenhouse.GreenhousePackage#getCondition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dsl.greenhouse.Condition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Condition