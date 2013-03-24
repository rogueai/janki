package com.rogueai.janki.core;

import java.util.List;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

import com.rogueai.janki.core.persistence.jpa.dao.factory.DaoFactory;
import com.rogueai.janki.core.persistence.jpa.entity.Card;
import com.rogueai.janki.core.persistence.util.HibernateUtil;

public class JAnkiCorePlugin extends Plugin {

	private static BundleContext context;

	public static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		JAnkiCorePlugin.context = bundleContext;
		// initialize hibernate session
		HibernateUtil.getEntityManager().getTransaction().begin();
		DaoFactory instance = DaoFactory.instance(DaoFactory.HIBERNATE);
		List<Card> cards = instance.getCardDao().findAll();
		HibernateUtil.getEntityManager().getTransaction().commit();
		System.out.println();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		JAnkiCorePlugin.context = null;
	}

}
