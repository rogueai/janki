package com.rogueai.janki.core.persistence.jpa.scanner;

import java.lang.annotation.Annotation;
import java.net.URL;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.hibernate.ejb.packaging.NamedInputStream;
import org.hibernate.ejb.packaging.NativeScanner;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.wiring.BundleWiring;

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
		Bundle bundle = FrameworkUtil.getBundle(getClass());
		// JAnkiCorePlugin.getContext().getBundles())
		if (bundle != null) {
			BundleWiring bundleWiring = bundle.adapt(BundleWiring.class);
			Collection<URL> res = bundleWiring.findEntries("/", "*.class", BundleWiring.LISTRESOURCES_LOCAL | BundleWiring.LISTRESOURCES_RECURSE);
			for (URL url : res) {
				try {
					IPath path = new Path(url.getPath());
					if (path.segment(0).equals("bin")) {
						path = path.removeFirstSegments(1);
						String name = path.removeFileExtension().toString().replaceAll("\\/", ".");
						Class<?> clazz = bundleWiring.getClassLoader().loadClass(name);
						for (Annotation ann : clazz.getAnnotations()) {
							if (annotationsToLookFor.contains(ann.annotationType())) {
								classesInJar.add(clazz);
								break;
							}
						}
					}
					System.out.println();
				} catch (ClassNotFoundException e) {
				} catch (NoClassDefFoundError e) {
				}
			}
		}
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
