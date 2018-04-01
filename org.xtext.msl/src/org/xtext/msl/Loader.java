package org.xtext.msl;
import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.serializer.ISerializer;
import org.xtext.msl.mSL.Specification;

import com.google.inject.Injector;

public class Loader {
	private static ISerializer SERIALIZER;

	public static Specification loadSpec(String path) {
		return loadSpec(new File(path));
	}

	public static Specification loadSpec(File f) {
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("./");
		Injector injector = new MSLStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		// resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		URI uri = URI.createURI("file:///" + f.getAbsolutePath());
		assert uri != null;
		Resource resource = resourceSet.getResource(uri, true);
		SERIALIZER = injector.getInstance(ISerializer.class);
		assert injector != null;
		return (Specification) resource.getContents().get(0);
	}
}
