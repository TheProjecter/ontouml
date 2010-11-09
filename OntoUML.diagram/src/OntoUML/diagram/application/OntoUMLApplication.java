package OntoUML.diagram.application;

import org.eclipse.core.runtime.IPlatformRunnable;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

/**
 * @generated
 */
public class OntoUMLApplication implements IPlatformRunnable {

	/**
	 * @generated
	 */
	public Object run(Object args) throws Exception {
		Display display = PlatformUI.createDisplay();
		try {
			int returnCode = PlatformUI
					.createAndRunWorkbench(
							display,
							new OntoUML.diagram.application.DiagramEditorWorkbenchAdvisor());
			if (returnCode == PlatformUI.RETURN_RESTART) {
				return IPlatformRunnable.EXIT_RESTART;
			}
			return IPlatformRunnable.EXIT_OK;
		} finally {
			display.dispose();
		}
	}
}
