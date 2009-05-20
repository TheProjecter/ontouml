package OntoUML.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CategoryAttributeCompartmentItemSemanticEditPolicy extends
		OntoUML.diagram.edit.policies.OntoUMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (OntoUML.diagram.providers.OntoUMLElementTypes.Property_3001 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OntoUML.OntoUMLPackage.eINSTANCE
						.getElement_Attribute());
			}
			return getGEFWrapper(new OntoUML.diagram.edit.commands.Property2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
