/*
 * generated by Xtext 2.25.0
 */
package dsl.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.EcoreUtil2
import dsl.greenhouse.Action
import dsl.greenhouse.State
import dsl.greenhouse.RowSensor
import dsl.greenhouse.RowActuator
import dsl.greenhouse.RowRuleSet
import dsl.greenhouse.SettingSensor
import dsl.greenhouse.SettingActuator
import dsl.greenhouse.Trigger
import dsl.greenhouse.SettingValue
import dsl.greenhouse.SettingAction
import dsl.greenhouse.GreenhouseActuator
import dsl.greenhouse.GreenhouseSensor
import dsl.greenhouse.Actuator

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
		
		val allActuators = EcoreUtil2.getAllContentsOfType(root, SettingActuator)
		val filtered = allActuators.filter[context.type.name == it.name]
		Scopes.scopeFor(#[context], Scopes.scopeFor(allActuators))
	}
	
	def dispatch scopeForEObject(GreenhouseActuator context, EReference reference) {
		
		
		val root = EcoreUtil2.getRootContainer(context);
		
		val allActuators = EcoreUtil2.getAllContentsOfType(root, SettingActuator)
		
		System.out.println(allActuators)
		Scopes.scopeFor(#[context], Scopes.scopeFor(allActuators))
	}
	
	def dispatch scopeForEObject(RowSensor context, EReference reference) {
		
		
		val root = EcoreUtil2.getRootContainer(context);
		
		val allSensors = EcoreUtil2.getAllContentsOfType(root, SettingSensor)
		
		System.out.println(allSensors)
		Scopes.scopeFor(#[context], Scopes.scopeFor(allSensors))
	}
	
	def dispatch scopeForEObject(GreenhouseSensor context, EReference reference) {
		
		
		val root = EcoreUtil2.getRootContainer(context);
		
		val allSensors = EcoreUtil2.getAllContentsOfType(root, SettingSensor)
		
		System.out.println(allSensors)
		Scopes.scopeFor(#[context], Scopes.scopeFor(allSensors))
	}
	
	def dispatch scopeForEObject(Action context, EReference reference) {
		
		
		val root = EcoreUtil2.getRootContainer(context);
		
		val allValues = EcoreUtil2.getAllContentsOfType(root, SettingValue)
		
		System.out.println(allValues.filter[context.name == (it.eContainer as SettingAction).name])
		//val filtered = allValues.filter[(context.eContainer as Actuator).type == (it.eContainer.eContainer as SettingActuator)]
		
		val filtered = allValues.filter[switch(context.eContainer){
			RowActuator: (context.eContainer as RowActuator).type == (it.eContainer.eContainer as SettingActuator) && 
				context.name == (it.eContainer as SettingAction).name
			GreenhouseActuator: (context.eContainer as GreenhouseActuator).type == (it.eContainer.eContainer as SettingActuator) && 
				context.name == (it.eContainer as SettingAction).name
			default: false
		}]
		Scopes.scopeFor(#[context], Scopes.scopeFor(filtered))
	}
	
//	def dispatch scopeForEObject(RowSensor sensor, EReference reference) {
//		System.out.println(sensor.eContainer.eContents)
//		val root = EcoreUtil2.getRootContainer(sensor)
//		
//		//Scopes.scopeFor(#[row], Scopes.scopeFor(row.eContents))
//		val allActions = EcoreUtil2.getAllContentsOfType(root, SettingSensor)
//		
//		System.out.println(allActions)
//		Scopes.scopeFor(#[sensor], Scopes.scopeFor(allActions))
//	}
	
	def dispatch scopeForEObject(RowRuleSet rule, EReference reference) {	
		
		System.out.println(rule.eContainer.eContents)
		val row = rule.eContainer
		//Scopes.scopeFor(#[row], Scopes.scopeFor(row.eContents))
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
	
		
	


}
