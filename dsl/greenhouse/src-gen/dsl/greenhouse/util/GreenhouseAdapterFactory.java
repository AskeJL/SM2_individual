/**
 * generated by Xtext 2.24.0
 */
package dsl.greenhouse.util;

import dsl.greenhouse.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dsl.greenhouse.GreenhousePackage
 * @generated
 */
public class GreenhouseAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GreenhousePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreenhouseAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GreenhousePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GreenhouseSwitch<Adapter> modelSwitch =
    new GreenhouseSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseHardwareSetup(HardwareSetup object)
      {
        return createHardwareSetupAdapter();
      }
      @Override
      public Adapter caseHardware(Hardware object)
      {
        return createHardwareAdapter();
      }
      @Override
      public Adapter caseSettingActuator(SettingActuator object)
      {
        return createSettingActuatorAdapter();
      }
      @Override
      public Adapter caseSettingSensor(SettingSensor object)
      {
        return createSettingSensorAdapter();
      }
      @Override
      public Adapter caseController(Controller object)
      {
        return createControllerAdapter();
      }
      @Override
      public Adapter caseControllerType(ControllerType object)
      {
        return createControllerTypeAdapter();
      }
      @Override
      public Adapter caseReducer(Reducer object)
      {
        return createReducerAdapter();
      }
      @Override
      public Adapter caseFrequency(Frequency object)
      {
        return createFrequencyAdapter();
      }
      @Override
      public Adapter caseTopic(Topic object)
      {
        return createTopicAdapter();
      }
      @Override
      public Adapter caseButton(Button object)
      {
        return createButtonAdapter();
      }
      @Override
      public Adapter caseSettingAction(SettingAction object)
      {
        return createSettingActionAdapter();
      }
      @Override
      public Adapter caseSettingValue(SettingValue object)
      {
        return createSettingValueAdapter();
      }
      @Override
      public Adapter caseGreenhouse(Greenhouse object)
      {
        return createGreenhouseAdapter();
      }
      @Override
      public Adapter caseRow(Row object)
      {
        return createRowAdapter();
      }
      @Override
      public Adapter caseGreenhouseElement(GreenhouseElement object)
      {
        return createGreenhouseElementAdapter();
      }
      @Override
      public Adapter caseGreenhouseButton(GreenhouseButton object)
      {
        return createGreenhouseButtonAdapter();
      }
      @Override
      public Adapter caseRowElement(RowElement object)
      {
        return createRowElementAdapter();
      }
      @Override
      public Adapter caseRowButton(RowButton object)
      {
        return createRowButtonAdapter();
      }
      @Override
      public Adapter caseGreenhouseActuator(GreenhouseActuator object)
      {
        return createGreenhouseActuatorAdapter();
      }
      @Override
      public Adapter caseRowActuator(RowActuator object)
      {
        return createRowActuatorAdapter();
      }
      @Override
      public Adapter caseGreenhouseSensor(GreenhouseSensor object)
      {
        return createGreenhouseSensorAdapter();
      }
      @Override
      public Adapter caseRowSensor(RowSensor object)
      {
        return createRowSensorAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseTrigger(Trigger object)
      {
        return createTriggerAdapter();
      }
      @Override
      public Adapter caseRowRuleSet(RowRuleSet object)
      {
        return createRowRuleSetAdapter();
      }
      @Override
      public Adapter caseGreenhouseRuleSet(GreenhouseRuleSet object)
      {
        return createGreenhouseRuleSetAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter casePlus(Plus object)
      {
        return createPlusAdapter();
      }
      @Override
      public Adapter caseMinus(Minus object)
      {
        return createMinusAdapter();
      }
      @Override
      public Adapter caseMult(Mult object)
      {
        return createMultAdapter();
      }
      @Override
      public Adapter caseDiv(Div object)
      {
        return createDivAdapter();
      }
      @Override
      public Adapter caseMathNumber(MathNumber object)
      {
        return createMathNumberAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.HardwareSetup <em>Hardware Setup</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.HardwareSetup
   * @generated
   */
  public Adapter createHardwareSetupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.Hardware <em>Hardware</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.Hardware
   * @generated
   */
  public Adapter createHardwareAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.SettingActuator <em>Setting Actuator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.SettingActuator
   * @generated
   */
  public Adapter createSettingActuatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.SettingSensor <em>Setting Sensor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.SettingSensor
   * @generated
   */
  public Adapter createSettingSensorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.Controller <em>Controller</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.Controller
   * @generated
   */
  public Adapter createControllerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.ControllerType <em>Controller Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.ControllerType
   * @generated
   */
  public Adapter createControllerTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.Reducer <em>Reducer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.Reducer
   * @generated
   */
  public Adapter createReducerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.Frequency <em>Frequency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.Frequency
   * @generated
   */
  public Adapter createFrequencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.Topic <em>Topic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.Topic
   * @generated
   */
  public Adapter createTopicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.Button
   * @generated
   */
  public Adapter createButtonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.SettingAction <em>Setting Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.SettingAction
   * @generated
   */
  public Adapter createSettingActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.SettingValue <em>Setting Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.SettingValue
   * @generated
   */
  public Adapter createSettingValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.Greenhouse <em>Greenhouse</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.Greenhouse
   * @generated
   */
  public Adapter createGreenhouseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.Row <em>Row</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.Row
   * @generated
   */
  public Adapter createRowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.GreenhouseElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.GreenhouseElement
   * @generated
   */
  public Adapter createGreenhouseElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.GreenhouseButton <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.GreenhouseButton
   * @generated
   */
  public Adapter createGreenhouseButtonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.RowElement <em>Row Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.RowElement
   * @generated
   */
  public Adapter createRowElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.RowButton <em>Row Button</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.RowButton
   * @generated
   */
  public Adapter createRowButtonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.GreenhouseActuator <em>Actuator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.GreenhouseActuator
   * @generated
   */
  public Adapter createGreenhouseActuatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.RowActuator <em>Row Actuator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.RowActuator
   * @generated
   */
  public Adapter createRowActuatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.GreenhouseSensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.GreenhouseSensor
   * @generated
   */
  public Adapter createGreenhouseSensorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.RowSensor <em>Row Sensor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.RowSensor
   * @generated
   */
  public Adapter createRowSensorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.Trigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.Trigger
   * @generated
   */
  public Adapter createTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.RowRuleSet <em>Row Rule Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.RowRuleSet
   * @generated
   */
  public Adapter createRowRuleSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.GreenhouseRuleSet <em>Rule Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.GreenhouseRuleSet
   * @generated
   */
  public Adapter createGreenhouseRuleSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.Plus
   * @generated
   */
  public Adapter createPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.Minus
   * @generated
   */
  public Adapter createMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.Mult <em>Mult</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.Mult
   * @generated
   */
  public Adapter createMultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.Div
   * @generated
   */
  public Adapter createDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsl.greenhouse.MathNumber <em>Math Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsl.greenhouse.MathNumber
   * @generated
   */
  public Adapter createMathNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GreenhouseAdapterFactory
