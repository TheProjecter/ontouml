package OntoUML.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class StructuralDatatypeAttributeCompartmentCanonicalEditPolicy extends
		CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = OntoUML.diagram.part.OntoUMLDiagramUpdater
				.getStructuralDatatypeAttributeCompartment_7012SemanticChildren(
						viewObject).iterator(); it.hasNext();) {
			result.add(((OntoUML.diagram.part.OntoUMLNodeDescriptor) it.next())
					.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
				.getVisualID(view);
		switch (visualID) {
		case OntoUML.diagram.edit.parts.Property12EditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(OntoUML.OntoUMLPackage.eINSTANCE
					.getClassifier_Attribute());
		}
		return myFeaturesToSynchronize;
	}

}
