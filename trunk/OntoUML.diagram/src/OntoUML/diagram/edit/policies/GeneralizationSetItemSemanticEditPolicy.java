package OntoUML.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GeneralizationSetItemSemanticEditPolicy extends
		OntoUML.diagram.edit.policies.OntoUMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyChildNodesCommand(cc);
		addDestroyShortcutsCommand(cc);
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			req.setElementToDestroy(view);
		}
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated
	 */
	protected void addDestroyChildNodesCommand(CompoundCommand cmd) {
		View view = (View) getHost().getModel();
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation != null) {
			return;
		}
		for (Iterator it = view.getChildren().iterator(); it.hasNext();) {
			Node node = (Node) it.next();
			switch (OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getVisualID(node)) {
			case OntoUML.diagram.edit.parts.GeneralizationSetAttributeCompartmentEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(cnode)) {
					case OntoUML.diagram.edit.parts.Property15EditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (OntoUML.diagram.providers.OntoUMLElementTypes.Characterization_4001 == req
				.getElementType()) {
			return getGEFWrapper(new OntoUML.diagram.edit.commands.CharacterizationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.ComponentOf_4002 == req
				.getElementType()) {
			return getGEFWrapper(new OntoUML.diagram.edit.commands.ComponentOfCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.Derivation_4004 == req
				.getElementType()) {
			return getGEFWrapper(new OntoUML.diagram.edit.commands.DerivationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.Generalization_4006 == req
				.getElementType()) {
			return getGEFWrapper(new OntoUML.diagram.edit.commands.GeneralizationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.Mediation_4008 == req
				.getElementType()) {
			return getGEFWrapper(new OntoUML.diagram.edit.commands.MediationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.MemberOf_4009 == req
				.getElementType()) {
			return getGEFWrapper(new OntoUML.diagram.edit.commands.MemberOfCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.SubCollectionOf_4010 == req
				.getElementType()) {
			return getGEFWrapper(new OntoUML.diagram.edit.commands.SubCollectionOfCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.SubQuantityOf_4011 == req
				.getElementType()) {
			return getGEFWrapper(new OntoUML.diagram.edit.commands.SubQuantityOfCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (OntoUML.diagram.providers.OntoUMLElementTypes.Characterization_4001 == req
				.getElementType()) {
			return getGEFWrapper(new OntoUML.diagram.edit.commands.CharacterizationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.ComponentOf_4002 == req
				.getElementType()) {
			return getGEFWrapper(new OntoUML.diagram.edit.commands.ComponentOfCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.Derivation_4004 == req
				.getElementType()) {
			return getGEFWrapper(new OntoUML.diagram.edit.commands.DerivationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.Generalization_4006 == req
				.getElementType()) {
			return getGEFWrapper(new OntoUML.diagram.edit.commands.GeneralizationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.Mediation_4008 == req
				.getElementType()) {
			return getGEFWrapper(new OntoUML.diagram.edit.commands.MediationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.MemberOf_4009 == req
				.getElementType()) {
			return getGEFWrapper(new OntoUML.diagram.edit.commands.MemberOfCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.SubCollectionOf_4010 == req
				.getElementType()) {
			return getGEFWrapper(new OntoUML.diagram.edit.commands.SubCollectionOfCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.SubQuantityOf_4011 == req
				.getElementType()) {
			return getGEFWrapper(new OntoUML.diagram.edit.commands.SubQuantityOfCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case OntoUML.diagram.edit.parts.CharacterizationEditPart.VISUAL_ID:
			return getGEFWrapper(new OntoUML.diagram.edit.commands.CharacterizationReorientCommand(
					req));
		case OntoUML.diagram.edit.parts.ComponentOfEditPart.VISUAL_ID:
			return getGEFWrapper(new OntoUML.diagram.edit.commands.ComponentOfReorientCommand(
					req));
		case OntoUML.diagram.edit.parts.DerivationEditPart.VISUAL_ID:
			return getGEFWrapper(new OntoUML.diagram.edit.commands.DerivationReorientCommand(
					req));
		case OntoUML.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID:
			return getGEFWrapper(new OntoUML.diagram.edit.commands.GeneralizationReorientCommand(
					req));
		case OntoUML.diagram.edit.parts.MediationEditPart.VISUAL_ID:
			return getGEFWrapper(new OntoUML.diagram.edit.commands.MediationReorientCommand(
					req));
		case OntoUML.diagram.edit.parts.MemberOfEditPart.VISUAL_ID:
			return getGEFWrapper(new OntoUML.diagram.edit.commands.MemberOfReorientCommand(
					req));
		case OntoUML.diagram.edit.parts.SubCollectionOfEditPart.VISUAL_ID:
			return getGEFWrapper(new OntoUML.diagram.edit.commands.SubCollectionOfReorientCommand(
					req));
		case OntoUML.diagram.edit.parts.SubQuantityOfEditPart.VISUAL_ID:
			return getGEFWrapper(new OntoUML.diagram.edit.commands.SubQuantityOfReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
