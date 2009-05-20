package OntoUML.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class SimpleDatatypeAttributeCompartmentItemSemanticEditPolicy extends
		OntoUML.diagram.edit.policies.OntoUMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (OntoUML.diagram.providers.OntoUMLElementTypes.Property_3011 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OntoUML.OntoUMLPackage.eINSTANCE
						.getElement_Attribute());
			}
			return getGEFWrapper(new OntoUML.diagram.edit.commands.Property12CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
