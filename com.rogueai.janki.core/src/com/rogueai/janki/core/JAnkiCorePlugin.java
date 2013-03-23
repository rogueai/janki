package com.rogueai.janki.core;

import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.hibernate.Transaction;
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
		Transaction tx = HibernateUtil.getSesssionFactory().getCurrentSession().beginTransaction();
		DaoFactory instance = DaoFactory.instance(DaoFactory.HIBERNATE);
		List<Card> cards = instance.getCardDao().findAll();
		tx.commit(); 
		System.out.println();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		JAnkiCorePlugin.context = null;
	}

}
