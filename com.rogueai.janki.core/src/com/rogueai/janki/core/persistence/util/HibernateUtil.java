package com.rogueai.janki.core.persistence.util;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.osgi.framework.Bundle;

import com.rogueai.janki.core.JAnkiCorePlugin;

/**
 * @author Massimo Zugno
 */
public class HibernateUtil {

	// private static final EntityManager _entityManager =
	// createEntityManager();

	private static final SessionFactory _sessionFactory = createSessionFactory();

	private static SessionFactory createSessionFactory() {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			Bundle bundle = JAnkiCorePlugin.getContext().getBundle();
			URL ankiDbUrl = bundle.getEntry("/collection.anki2");
			String connUrl = "jdbc:sqlite:" + FileLocator.toFileURL(ankiDbUrl).getFile();
			Map<String, Object> conf = new HashMap<String, Object>();
			conf.put("javax.persistence.jdbc.url", connUrl);

			// EntityManagerFactory emf =
			// Persistence.createEntityManagerFactory("janki-manager", conf);
			// return emf.createEntityManager();

			Configuration cfg = new AnnotationConfiguration();
			URL cfgUrl = bundle.getEntry("/hibernate.cfg.xml");
			cfg.configure(FileLocator.toFileURL(cfgUrl));
			cfg.setProperty("hibernate.connection.url", connUrl);
			SessionFactory sf = cfg.buildSessionFactory();
			return sf;
		} catch (Throwable e) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial EntityManagercreation failed." + e);
			throw new ExceptionInInitializerError(e);
		}
	}

	public static SessionFactory getSesssionFactory() {
		return _sessionFactory;
	}

}