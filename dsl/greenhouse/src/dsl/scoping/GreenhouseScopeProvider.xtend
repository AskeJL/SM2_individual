/*
 * generated by Xtext 2.25.0
 */
package dsl.scoping

import dsl.greenhouse.Action
import dsl.greenhouse.Controller
import dsl.greenhouse.GreenhouseActuator
import dsl.greenhouse.GreenhouseRuleSet
import dsl.greenhouse.GreenhouseSensor
import dsl.greenhouse.RowActuator
import dsl.greenhouse.RowRuleSet
import dsl.greenhouse.RowSensor
import dsl.greenhouse.SettingAction
import dsl.greenhouse.SettingActuator
import dsl.greenhouse.SettingSensor
import dsl.greenhouse.SettingValue
import dsl.greenhouse.State
import dsl.greenhouse.Trigger
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.Scopes

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class GreenhouseScopeProvider extends AbstractGreenhouseScopeProvider {
	
	
	override getScope(EObject context, EReference reference) {
		return context.scopeForEObject(reference)
	}
	
	def dispatch scopeForEObject(EObject context, EReference reference) {
		return super.getScope(context.eContainer, reference)
	}
	
	def dispatch scopeForEObject(RowActuator context, EReference reference) {
		
		
		val root = EcoreUtil2.getRootContainer(context);
		val allControllers = EcoreUtil2.getAllContentsOfType(root, Controller)
		val allActuators = EcoreUtil2.getAllContentsOfType(root, SettingActuator)
		Scopes.scopeFor(#[context], Scopes.scopeFor(allActuators, Scopes.scopeFor(allControllers)))
	}
	
	def dispatch scopeForEObject(GreenhouseActuator context, EReference reference) {
		
		
		val root = EcoreUtil2.getRootContainer(context);
		
		val allActuators = EcoreUtil2.getAllContentsOfType(root, SettingActuator)
		val allControllers = EcoreUtil2.getAllContentsOfType(root, Controller)
		System.out.println(allActuators)
		Scopes.scopeFor(#[context], Scopes.scopeFor(allActuators, Scopes.scopeFor(allControllers)))
	}
	
	def dispatch scopeForEObject(RowSensor context, EReference reference) {
		
		
		val root = EcoreUtil2.getRootContainer(context);
		
		val allSensors = EcoreUtil2.getAllContentsOfType(root, SettingSensor)
		val allControllers = EcoreUtil2.getAllContentsOfType(root, Controller)
		System.out.println(allSensors)
		Scopes.scopeFor(#[context], Scopes.scopeFor(allSensors, Scopes.scopeFor(allControllers)))
	}
	
	def dispatch scopeForEObject(GreenhouseSensor context, EReference reference) {
		
		
		val root = EcoreUtil2.getRootContainer(context);
		
		val allSensors = EcoreUtil2.getAllContentsOfType(root, SettingSensor)
		val allControllers = EcoreUtil2.getAllContentsOfType(root, Controller)
		System.out.println(allSensors)
		Scopes.scopeFor(#[context], Scopes.scopeFor(allSensors, Scopes.scopeFor(allControllers)))
	}
	
	def dispatch scopeForEObject(Action context, EReference reference) {
		
		
		val root = EcoreUtil2.getRootContainer(context);
		
		val allValues = EcoreUtil2.getAllContentsOfType(root, SettingValue)
		
		System.out.println(allValues.filter[context.name == (it.eContainer as SettingAction).name])
		
		val filtered = allValues.filter[switch(context.eContainer){
			RowActuator: (context.eContainer as RowActuator).type == (it.eContainer.eContainer as SettingActuator) && 
				context.name == (it.eContainer as SettingAction).name
			GreenhouseActuator: (context.eContainer as GreenhouseActuator).type == (it.eContainer.eContainer as SettingActuator) && 
				context.name == (it.eContainer as SettingAction).name
			default: false
		}]
		Scopes.scopeFor(#[context], Scopes.scopeFor(filtered))
	}
	
	def dispatch scopeForEObject(RowRuleSet rule, EReference reference) {	
		
		System.out.println(rule.eContainer.eContents)
		val row = rule.eContainer
		val allTrigger = EcoreUtil2.getAllContentsOfType(row, Trigger)
		val allSensor = EcoreUtil2.getAllContentsOfType(row, RowSensor)
		val allStates = EcoreUtil2.getAllContentsOfType(row, State)
		val allActuators = EcoreUtil2.getAllContentsOfType(row, RowActuator)
		
		System.out.println(allTrigger)
		Scopes.scopeFor(
			allSensor, 
			Scopes.scopeFor(
				allActuators,
				Scopes.scopeFor(
					allTrigger, 
					Scopes.scopeFor(
						allStates
					)
				)
			)
		)
	}
	
	
	
	def dispatch scopeForEObject(GreenhouseRuleSet rule, EReference reference) {	
		
		System.out.println(rule.eContainer.eContents)
        val root = EcoreUtil2.getRootContainer(rule);
        val allAction = EcoreUtil2.getAllContentsOfType(root, Action)
        val allSettingValue = EcoreUtil2.getAllContentsOfType(root, SettingValue)
        val allSensor = EcoreUtil2.getAllContentsOfType(root, GreenhouseSensor)
        val allStates = EcoreUtil2.getAllContentsOfType(root, State)
        val allActuators = EcoreUtil2.getAllContentsOfType(root, GreenhouseActuator)

        System.out.println(allAction)
        Scopes.scopeFor(
            allSensor, 
            Scopes.scopeFor(
                allActuators,
                Scopes.scopeFor(
                    allAction,
                    Scopes.scopeFor(
                        allSettingValue,
                            Scopes.scopeFor(
                                allStates
                        )
                    )
                )
            )
        )
	}
	
		
	


}
