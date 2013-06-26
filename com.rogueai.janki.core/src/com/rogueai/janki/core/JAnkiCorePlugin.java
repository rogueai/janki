package com.rogueai.janki.core;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * 
 * @author matsuleode
 *
 */
public class JAnkiCorePlugin extends Plugin {

	private static BundleContext context;

	public static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		JAnkiCorePlugin.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		JAnkiCorePlugin.context = null;
	}

}
