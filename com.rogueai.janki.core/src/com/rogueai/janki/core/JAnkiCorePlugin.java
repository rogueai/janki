package com.rogueai.janki.core;

import java.util.List;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

import com.rogueai.janki.core.persistence.dao.factory.DaoFactory;
import com.rogueai.janki.core.persistence.entity.Collection;

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

		// TODO @matsu testdao factory
		DaoFactory instance = DaoFactory.instance(DaoFactory.ORM_LITE);
		List<Collection> collections = instance.getCollectionDao().queryForAll();
		System.out.println();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		JAnkiCorePlugin.context = null;
	}

}
