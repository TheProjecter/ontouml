package OntoUML.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ContainerItemSemanticEditPolicy extends
		OntoUML.diagram.edit.policies.OntoUMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (OntoUML.diagram.providers.OntoUMLElementTypes.Category_2001 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OntoUML.OntoUMLPackage.eINSTANCE
						.getContainer_InstanciarElement());
			}
			return getGEFWrapper(new OntoUML.diagram.edit.commands.CategoryCreateCommand(
					req));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.Collective_2002 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OntoUML.OntoUMLPackage.eINSTANCE
						.getContainer_InstanciarElement());
			}
			return getGEFWrapper(new OntoUML.diagram.edit.commands.CollectiveCreateCommand(
					req));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.Kind_2003 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OntoUML.OntoUMLPackage.eINSTANCE
						.getContainer_InstanciarElement());
			}
			return getGEFWrapper(new OntoUML.diagram.edit.commands.KindCreateCommand(
					req));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.Mixin_2004 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OntoUML.OntoUMLPackage.eINSTANCE
						.getContainer_InstanciarElement());
			}
			return getGEFWrapper(new OntoUML.diagram.edit.commands.MixinCreateCommand(
					req));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.Mode_2005 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OntoUML.OntoUMLPackage.eINSTANCE
						.getContainer_InstanciarElement());
			}
			return getGEFWrapper(new OntoUML.diagram.edit.commands.ModeCreateCommand(
					req));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.Phase_2006 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OntoUML.OntoUMLPackage.eINSTANCE
						.getContainer_InstanciarElement());
			}
			return getGEFWrapper(new OntoUML.diagram.edit.commands.PhaseCreateCommand(
					req));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.Quantity_2007 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OntoUML.OntoUMLPackage.eINSTANCE
						.getContainer_InstanciarElement());
			}
			return getGEFWrapper(new OntoUML.diagram.edit.commands.QuantityCreateCommand(
					req));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.Relator_2008 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OntoUML.OntoUMLPackage.eINSTANCE
						.getContainer_InstanciarElement());
			}
			return getGEFWrapper(new OntoUML.diagram.edit.commands.RelatorCreateCommand(
					req));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.Role_2009 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OntoUML.OntoUMLPackage.eINSTANCE
						.getContainer_InstanciarElement());
			}
			return getGEFWrapper(new OntoUML.diagram.edit.commands.RoleCreateCommand(
					req));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.RoleMixin_2010 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OntoUML.OntoUMLPackage.eINSTANCE
						.getContainer_InstanciarElement());
			}
			return getGEFWrapper(new OntoUML.diagram.edit.commands.RoleMixinCreateCommand(
					req));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.SimpleDatatype_2011 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OntoUML.OntoUMLPackage.eINSTANCE
						.getContainer_InstanciarElement());
			}
			return getGEFWrapper(new OntoUML.diagram.edit.commands.SimpleDatatypeCreateCommand(
					req));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.StructuralDatatype_2012 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OntoUML.OntoUMLPackage.eINSTANCE
						.getContainer_InstanciarElement());
			}
			return getGEFWrapper(new OntoUML.diagram.edit.commands.StructuralDatatypeCreateCommand(
					req));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.SubKind_2013 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OntoUML.OntoUMLPackage.eINSTANCE
						.getContainer_InstanciarElement());
			}
			return getGEFWrapper(new OntoUML.diagram.edit.commands.SubKindCreateCommand(
					req));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.GeneralizationSet_2014 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OntoUML.OntoUMLPackage.eINSTANCE
						.getContainer_InstanciarElement());
			}
			return getGEFWrapper(new OntoUML.diagram.edit.commands.GeneralizationSetCreateCommand(
					req));
		}
		if (OntoUML.diagram.providers.OntoUMLElementTypes.DerivationRule_2015 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OntoUML.OntoUMLPackage.eINSTANCE
						.getContainer_InstanciarElement());
			}
			return getGEFWrapper(new OntoUML.diagram.edit.commands.DerivationRuleCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
