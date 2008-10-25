package OntoUML.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		OntoUML.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		OntoUML.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		OntoUML.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		OntoUML.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		OntoUML.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);
	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
				.getPreferenceStore();
	}
}
