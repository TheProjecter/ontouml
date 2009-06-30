package OntoUML.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MixinAttributeCompartmentItemSemanticEditPolicy extends
		OntoUML.diagram.edit.policies.OntoUMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (OntoUML.diagram.providers.OntoUMLElementTypes.Property_3031 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OntoUML.OntoUMLPackage.eINSTANCE
						.getClassifier_Attribute());
			}
			return getGEFWrapper(new OntoUML.diagram.edit.commands.Property4CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
