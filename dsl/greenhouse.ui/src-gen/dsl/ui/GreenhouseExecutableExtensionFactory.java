/*
 * generated by Xtext 2.24.0
 */
package dsl.ui;

import com.google.inject.Injector;
import greenhouse.ui.internal.GreenhouseActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GreenhouseExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(GreenhouseActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		GreenhouseActivator activator = GreenhouseActivator.getInstance();
		return activator != null ? activator.getInjector(GreenhouseActivator.DSL_GREENHOUSE) : null;
	}

}
