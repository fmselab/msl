package org.xtext.msl.generator.openhabgenerator.ui;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
	 * initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = OpenHABGeneratorActivator.getDefault().getPreferenceStore();
		store.setDefault(OpenHABGeneratorPreferencePage.P_LOG_MODE, false);
		store.setDefault(OpenHABGeneratorPreferencePage.P_NUMBER_SIMULATIONS, 10);
	}
}
