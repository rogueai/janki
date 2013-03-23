package com.rogueai.janki.core.persistence.jpa.scanner;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.FileLocator;
import org.hibernate.ejb.packaging.NamedInputStream;
import org.hibernate.ejb.packaging.NativeScanner;
import org.osgi.framework.Bundle;
import org.osgi.framework.wiring.BundleWiring;

import com.rogueai.janki.core.JAnkiCorePlugin;

/**
 * 
 * @author Massimo Zugno
 */
public class OsgiResourceScanner extends NativeScanner {

	@Override
	public Set<Package> getPackagesInJar(URL jarToScan, Set<Class<? extends Annotation>> annotationsToLookFor) {
		// Set<Package> packagesInJar = super.getPackagesInJar(jarToScan,
		// annotationsToLookFor);
		return new HashSet<Package>();
	}

	@Override
	public Set<Class<?>> getClassesInJar(URL jarToScan, Set<Class<? extends Annotation>> annotationsToLookFor) {
		Set<Class<?>> classesInJar = new HashSet<Class<?>>();
		Bundle jarBundle = null;
		for (Bundle bundle : JAnkiCorePlugin.getContext().getBundles()) {
			try {
				String bundleUrl = FileLocator.getBundleFile(bundle).toURI().toString();
				String jarUrl = FileLocator.toFileURL(jarToScan).toString();
				if (bundleUrl.equals(jarUrl)) {
					jarBundle = bundle;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (jarBundle != null) {
			BundleWiring bundleWiring = jarBundle.adapt(BundleWiring.class);
			Collection<String> res = bundleWiring
					.listResources("/", "*.class", BundleWiring.LISTRESOURCES_LOCAL | BundleWiring.LISTRESOURCES_RECURSE);
			for (String name : res) {
				try {
					name = name.replaceAll("\\/", ".");
					if (name.startsWith("bin.")) {
						name = name.substring("bin.".length());
					}
					if (name.endsWith(".class")) {
						name = name.substring(0, name.lastIndexOf(".class"));
					}
					Class<?> clazz = bundleWiring.getClassLoader().loadClass(name);
					for (Annotation ann : clazz.getAnnotations()) {
						if (annotationsToLookFor.contains(ann.annotationType())) {
							classesInJar.add(clazz);
							break;
						}
					}
					System.out.println();
				} catch (ClassNotFoundException e) {
				} catch (NoClassDefFoundError e) {
				}
			}
		}
		// Set<Class<?>> classesInJar = super.getClassesInJar(jarToScan,
		// annotationsToLookFor);
		return classesInJar;
	}

	@Override
	public Set<NamedInputStream> getFilesInJar(URL jarToScan, Set<String> filePatterns) {
		// Set<NamedInputStream> filesInJar = super.getFilesInJar(jarToScan,
		// filePatterns);
		return new HashSet<NamedInputStream>();
	}

	@Override
	public Set<NamedInputStream> getFilesInClasspath(Set<String> filePatterns) {
		// Set<NamedInputStream> filesInClasspath =
		// super.getFilesInClasspath(filePatterns);
		return new HashSet<NamedInputStream>();
	}

	@Override
	public String getUnqualifiedJarName(URL jarToScan) {
		String unqualifiedJarName = super.getUnqualifiedJarName(jarToScan);
		return unqualifiedJarName;
	}

}
