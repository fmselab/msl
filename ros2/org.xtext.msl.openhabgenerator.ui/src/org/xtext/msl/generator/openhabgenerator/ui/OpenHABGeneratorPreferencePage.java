package org.xtext.msl.generator.openhabgenerator.ui;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class OpenHABGeneratorPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {
	public static final String P_NUMBER_SIMULATIONS = "P_NUMBER_SIMULATIONS";
	public static final String P_LOG_MODE = "P_LOG_MODE";

	public OpenHABGeneratorPreferencePage() {
		super(GRID);
		setPreferenceStore(OpenHABGeneratorActivator.getDefault().getPreferenceStore());
		setDescription("Preferences for OpenHAB generator");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common GUI
	 * blocks needed to manipulate various types of preferences. Each field editor
	 * knows how to save and restore itself.
	 */
	@Override
	public void createFieldEditors() {
		Composite fieldEditorParent = getFieldEditorParent();
		addField(new IntegerFieldEditor(P_NUMBER_SIMULATIONS, "number of simulations. 0 or negative means no restriction", fieldEditorParent));
		addField(new BooleanFieldEditor(P_LOG_MODE, "log mode", fieldEditorParent));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	@Override
	public void init(IWorkbench workbench) {
		
	}
}
