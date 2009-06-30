package OntoUML.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class OntoUMLNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7015;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof OntoUML.diagram.navigator.OntoUMLNavigatorItem) {
			OntoUML.diagram.navigator.OntoUMLNavigatorItem item = (OntoUML.diagram.navigator.OntoUMLNavigatorItem) element;
			return OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
