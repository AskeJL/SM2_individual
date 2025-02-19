/**
 * generated by Xtext 2.24.0
 */
package dsl.greenhouse.impl;

import dsl.greenhouse.Action;
import dsl.greenhouse.Controller;
import dsl.greenhouse.GreenhousePackage;
import dsl.greenhouse.RowActuator;
import dsl.greenhouse.SettingActuator;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsl.greenhouse.impl.RowActuatorImpl#getType <em>Type</em>}</li>
 *   <li>{@link dsl.greenhouse.impl.RowActuatorImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsl.greenhouse.impl.RowActuatorImpl#getController <em>Controller</em>}</li>
 *   <li>{@link dsl.greenhouse.impl.RowActuatorImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RowActuatorImpl extends RowElementImpl implements RowActuator
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected SettingActuator type;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getController() <em>Controller</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getController()
   * @generated
   * @ordered
   */
  protected Controller controller;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected EList<Action> action;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RowActuatorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GreenhousePackage.Literals.ROW_ACTUATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SettingActuator getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (SettingActuator)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GreenhousePackage.ROW_ACTUATOR__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SettingActuator basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(SettingActuator newType)
  {
    SettingActuator oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreenhousePackage.ROW_ACTUATOR__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreenhousePackage.ROW_ACTUATOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Controller getController()
  {
    if (controller != null && controller.eIsProxy())
    {
      InternalEObject oldController = (InternalEObject)controller;
      controller = (Controller)eResolveProxy(oldController);
      if (controller != oldController)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GreenhousePackage.ROW_ACTUATOR__CONTROLLER, oldController, controller));
      }
    }
    return controller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Controller basicGetController()
  {
    return controller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setController(Controller newController)
  {
    Controller oldController = controller;
    controller = newController;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreenhousePackage.ROW_ACTUATOR__CONTROLLER, oldController, controller));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Action> getAction()
  {
    if (action == null)
    {
      action = new EObjectContainmentEList<Action>(Action.class, this, GreenhousePackage.ROW_ACTUATOR__ACTION);
    }
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GreenhousePackage.ROW_ACTUATOR__ACTION:
        return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GreenhousePackage.ROW_ACTUATOR__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case GreenhousePackage.ROW_ACTUATOR__NAME:
        return getName();
      case GreenhousePackage.ROW_ACTUATOR__CONTROLLER:
        if (resolve) return getController();
        return basicGetController();
      case GreenhousePackage.ROW_ACTUATOR__ACTION:
        return getAction();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GreenhousePackage.ROW_ACTUATOR__TYPE:
        setType((SettingActuator)newValue);
        return;
      case GreenhousePackage.ROW_ACTUATOR__NAME:
        setName((String)newValue);
        return;
      case GreenhousePackage.ROW_ACTUATOR__CONTROLLER:
        setController((Controller)newValue);
        return;
      case GreenhousePackage.ROW_ACTUATOR__ACTION:
        getAction().clear();
        getAction().addAll((Collection<? extends Action>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GreenhousePackage.ROW_ACTUATOR__TYPE:
        setType((SettingActuator)null);
        return;
      case GreenhousePackage.ROW_ACTUATOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GreenhousePackage.ROW_ACTUATOR__CONTROLLER:
        setController((Controller)null);
        return;
      case GreenhousePackage.ROW_ACTUATOR__ACTION:
        getAction().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GreenhousePackage.ROW_ACTUATOR__TYPE:
        return type != null;
      case GreenhousePackage.ROW_ACTUATOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GreenhousePackage.ROW_ACTUATOR__CONTROLLER:
        return controller != null;
      case GreenhousePackage.ROW_ACTUATOR__ACTION:
        return action != null && !action.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RowActuatorImpl
