package OntoUML.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class OntoUMLVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "OntoUML.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static OntoUML.diagram.expressions.OntoUMLAbstractExpression BinaryAssociationAtom_4013_Constraint;

	/**
	 * @generated
	 */
	private static OntoUML.diagram.expressions.OntoUMLAbstractExpression BinaryAssociationAtom_4014_Constraint;

	/**
	 * @generated
	 */
	private static OntoUML.diagram.expressions.OntoUMLAbstractExpression BinaryAssociationAtom_4015_Constraint;

	/**
	 * @generated
	 */
	private static OntoUML.diagram.expressions.OntoUMLAbstractExpression ClassifierAtom_4016_Constraint;

	/**
	 * @generated
	 */
	private static OntoUML.diagram.expressions.OntoUMLAbstractExpression ClassifierAtom_4017_Constraint;

	/**
	 * @generated
	 */
	private static OntoUML.diagram.expressions.OntoUMLAbstractExpression ClassifierAtom_4018_Constraint;

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (OntoUML.diagram.edit.parts.ContainerEditPart.MODEL_ID
					.equals(view.getType())) {
				return OntoUML.diagram.edit.parts.ContainerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return OntoUML.diagram.part.OntoUMLVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
						.logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (OntoUML.OntoUMLPackage.eINSTANCE.getContainer().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((OntoUML.Container) domainElement)) {
			return OntoUML.diagram.edit.parts.ContainerEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
				.getModelID(containerView);
		if (!OntoUML.diagram.edit.parts.ContainerEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (OntoUML.diagram.edit.parts.ContainerEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = OntoUML.diagram.edit.parts.ContainerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case OntoUML.diagram.edit.parts.CategoryAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.OntoUMLPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.Property2EditPart.VISUAL_ID;
			}
			break;
		case OntoUML.diagram.edit.parts.CollectiveAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.OntoUMLPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.Property3EditPart.VISUAL_ID;
			}
			break;
		case OntoUML.diagram.edit.parts.KindAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.OntoUMLPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.Property4EditPart.VISUAL_ID;
			}
			break;
		case OntoUML.diagram.edit.parts.MixinAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.OntoUMLPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.Property5EditPart.VISUAL_ID;
			}
			break;
		case OntoUML.diagram.edit.parts.ModeAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.OntoUMLPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.Property6EditPart.VISUAL_ID;
			}
			break;
		case OntoUML.diagram.edit.parts.PhaseAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.OntoUMLPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.Property7EditPart.VISUAL_ID;
			}
			break;
		case OntoUML.diagram.edit.parts.QuantityAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.OntoUMLPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.Property8EditPart.VISUAL_ID;
			}
			break;
		case OntoUML.diagram.edit.parts.RelatorAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.OntoUMLPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.Property9EditPart.VISUAL_ID;
			}
			break;
		case OntoUML.diagram.edit.parts.RoleAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.OntoUMLPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.Property10EditPart.VISUAL_ID;
			}
			break;
		case OntoUML.diagram.edit.parts.RoleMixinAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.OntoUMLPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.Property11EditPart.VISUAL_ID;
			}
			break;
		case OntoUML.diagram.edit.parts.SimpleDatatypeAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.OntoUMLPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.Property12EditPart.VISUAL_ID;
			}
			break;
		case OntoUML.diagram.edit.parts.StructuralDatatypeAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.OntoUMLPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.Property13EditPart.VISUAL_ID;
			}
			break;
		case OntoUML.diagram.edit.parts.SubKindAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.OntoUMLPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.Property14EditPart.VISUAL_ID;
			}
			break;
		case OntoUML.diagram.edit.parts.GeneralizationSetAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.OntoUMLPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.Property15EditPart.VISUAL_ID;
			}
			break;
		case OntoUML.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
			if (OntoUML.OntoUMLPackage.eINSTANCE.getCategory().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.CategoryEditPart.VISUAL_ID;
			}
			if (OntoUML.OntoUMLPackage.eINSTANCE.getCollective().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.CollectiveEditPart.VISUAL_ID;
			}
			if (OntoUML.OntoUMLPackage.eINSTANCE.getKind().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.KindEditPart.VISUAL_ID;
			}
			if (OntoUML.OntoUMLPackage.eINSTANCE.getMixin().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.MixinEditPart.VISUAL_ID;
			}
			if (OntoUML.OntoUMLPackage.eINSTANCE.getMode().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.ModeEditPart.VISUAL_ID;
			}
			if (OntoUML.OntoUMLPackage.eINSTANCE.getPhase().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.PhaseEditPart.VISUAL_ID;
			}
			if (OntoUML.OntoUMLPackage.eINSTANCE.getQuantity().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.QuantityEditPart.VISUAL_ID;
			}
			if (OntoUML.OntoUMLPackage.eINSTANCE.getRelator().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.RelatorEditPart.VISUAL_ID;
			}
			if (OntoUML.OntoUMLPackage.eINSTANCE.getRole().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.RoleEditPart.VISUAL_ID;
			}
			if (OntoUML.OntoUMLPackage.eINSTANCE.getRoleMixin().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.RoleMixinEditPart.VISUAL_ID;
			}
			if (OntoUML.OntoUMLPackage.eINSTANCE.getSimpleDatatype()
					.isSuperTypeOf(domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.SimpleDatatypeEditPart.VISUAL_ID;
			}
			if (OntoUML.OntoUMLPackage.eINSTANCE.getStructuralDatatype()
					.isSuperTypeOf(domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.StructuralDatatypeEditPart.VISUAL_ID;
			}
			if (OntoUML.OntoUMLPackage.eINSTANCE.getSubKind().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.SubKindEditPart.VISUAL_ID;
			}
			if (OntoUML.OntoUMLPackage.eINSTANCE.getGeneralizationSet()
					.isSuperTypeOf(domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.GeneralizationSetEditPart.VISUAL_ID;
			}
			if (OntoUML.URML.URMLPackage.eINSTANCE.getDerivationRule()
					.isSuperTypeOf(domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.DerivationRuleEditPart.VISUAL_ID;
			}
			if (OntoUML.OntoUMLPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return OntoUML.diagram.edit.parts.PropertyEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
				.getModelID(containerView);
		if (!OntoUML.diagram.edit.parts.ContainerEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (OntoUML.diagram.edit.parts.ContainerEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = OntoUML.diagram.edit.parts.ContainerEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case OntoUML.diagram.edit.parts.CategoryEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.CategoryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.CategoryAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.CollectiveEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.CollectiveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.CollectiveAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.KindEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.KindNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.KindAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.MixinEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.MixinNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.MixinAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.ModeEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.ModeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.ModeAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.PhaseEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.PhaseNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.PhaseAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.QuantityEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.QuantityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.QuantityAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.RelatorEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.RelatorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.RelatorAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.RoleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.RoleAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.RoleMixinEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.RoleMixinNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.RoleMixinAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.SimpleDatatypeEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.SimpleDatatypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.SimpleDatatypeAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.StructuralDatatypeEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.StructuralDatatypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.StructuralDatatypeAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.SubKindEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.SubKindNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.SubKindAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.GeneralizationSetEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.GeneralizationSetNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.GeneralizationSetAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.DerivationRuleEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.DerivationRuleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.PropertyEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.PropertyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.PropertyLowerUpperEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.CategoryAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.Property2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.CollectiveAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.Property3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.KindAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.Property4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.MixinAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.Property5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.ModeAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.Property6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.PhaseAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.Property7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.QuantityAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.Property8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.RelatorAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.Property9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.RoleAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.Property10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.RoleMixinAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.Property11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.SimpleDatatypeAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.Property12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.StructuralDatatypeAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.Property13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.SubKindAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.Property14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.GeneralizationSetAttributeCompartmentEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.Property15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.CategoryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.CollectiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.KindEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.MixinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.ModeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.PhaseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.QuantityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.RelatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.RoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.RoleMixinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.SimpleDatatypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.StructuralDatatypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.SubKindEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.GeneralizationSetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.DerivationRuleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.PropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.CharacterizationEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.WrappingLabel14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.CharacterizationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.ComponentOfEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.ComponentOfNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.WrappingLabel22EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.DatatypeAssociationEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.DatatypeAssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.DatatypeAssociationName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.DerivationEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.DerivationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.FormalAssociationEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.WrappingLabel16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.FormalAssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.MaterialAssociationEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.WrappingLabel17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.MaterialAssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.MediationEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.WrappingLabel18EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.MediationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.MemberOfEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.MemberOfNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.WrappingLabel19EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.WrappingLabel23EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.SubCollectionOfEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.SubCollectionOfNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.WrappingLabel20EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.WrappingLabel24EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.SubQuantityOfEditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.SubQuantityOfNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.WrappingLabel21EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.WrappingLabel25EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.BinaryAssociationAtom3EditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.BinaryAssociationAtomNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.BinaryAssociationAtomName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntoUML.diagram.edit.parts.ClassifierAtom3EditPart.VISUAL_ID:
			if (OntoUML.diagram.edit.parts.ClassifierAtomNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntoUML.diagram.edit.parts.ClassifierAtomName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (OntoUML.OntoUMLPackage.eINSTANCE.getCharacterization()
				.isSuperTypeOf(domainElement.eClass())) {
			return OntoUML.diagram.edit.parts.CharacterizationEditPart.VISUAL_ID;
		}
		if (OntoUML.OntoUMLPackage.eINSTANCE.getcomponentOf().isSuperTypeOf(
				domainElement.eClass())) {
			return OntoUML.diagram.edit.parts.ComponentOfEditPart.VISUAL_ID;
		}
		if (OntoUML.OntoUMLPackage.eINSTANCE.getDatatypeAssociation()
				.isSuperTypeOf(domainElement.eClass())) {
			return OntoUML.diagram.edit.parts.DatatypeAssociationEditPart.VISUAL_ID;
		}
		if (OntoUML.OntoUMLPackage.eINSTANCE.getDerivation().isSuperTypeOf(
				domainElement.eClass())) {
			return OntoUML.diagram.edit.parts.DerivationEditPart.VISUAL_ID;
		}
		if (OntoUML.OntoUMLPackage.eINSTANCE.getFormalAssociation()
				.isSuperTypeOf(domainElement.eClass())) {
			return OntoUML.diagram.edit.parts.FormalAssociationEditPart.VISUAL_ID;
		}
		if (OntoUML.OntoUMLPackage.eINSTANCE.getGeneralization().isSuperTypeOf(
				domainElement.eClass())) {
			return OntoUML.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID;
		}
		if (OntoUML.OntoUMLPackage.eINSTANCE.getMaterialAssociation()
				.isSuperTypeOf(domainElement.eClass())) {
			return OntoUML.diagram.edit.parts.MaterialAssociationEditPart.VISUAL_ID;
		}
		if (OntoUML.OntoUMLPackage.eINSTANCE.getMediation().isSuperTypeOf(
				domainElement.eClass())) {
			return OntoUML.diagram.edit.parts.MediationEditPart.VISUAL_ID;
		}
		if (OntoUML.OntoUMLPackage.eINSTANCE.getmemberOf().isSuperTypeOf(
				domainElement.eClass())) {
			return OntoUML.diagram.edit.parts.MemberOfEditPart.VISUAL_ID;
		}
		if (OntoUML.OntoUMLPackage.eINSTANCE.getsubCollectionOf()
				.isSuperTypeOf(domainElement.eClass())) {
			return OntoUML.diagram.edit.parts.SubCollectionOfEditPart.VISUAL_ID;
		}
		if (OntoUML.OntoUMLPackage.eINSTANCE.getsubQuantityOf().isSuperTypeOf(
				domainElement.eClass())) {
			return OntoUML.diagram.edit.parts.SubQuantityOfEditPart.VISUAL_ID;
		}
		if (OntoUML.OntoUMLPackage.eINSTANCE.getProperty().isSuperTypeOf(
				domainElement.eClass())) {
			return OntoUML.diagram.edit.parts.Property16EditPart.VISUAL_ID;
		}
		if (OntoUML.URML.URMLPackage.eINSTANCE.getBinaryAssociationAtom()
				.isSuperTypeOf(domainElement.eClass())
				&& isBinaryAssociationAtom_4013((OntoUML.URML.BinaryAssociationAtom) domainElement)) {
			return OntoUML.diagram.edit.parts.BinaryAssociationAtomEditPart.VISUAL_ID;
		}
		if (OntoUML.URML.URMLPackage.eINSTANCE.getBinaryAssociationAtom()
				.isSuperTypeOf(domainElement.eClass())
				&& isBinaryAssociationAtom_4014((OntoUML.URML.BinaryAssociationAtom) domainElement)) {
			return OntoUML.diagram.edit.parts.BinaryAssociationAtom2EditPart.VISUAL_ID;
		}
		if (OntoUML.URML.URMLPackage.eINSTANCE.getBinaryAssociationAtom()
				.isSuperTypeOf(domainElement.eClass())
				&& isBinaryAssociationAtom_4015((OntoUML.URML.BinaryAssociationAtom) domainElement)) {
			return OntoUML.diagram.edit.parts.BinaryAssociationAtom3EditPart.VISUAL_ID;
		}
		if (OntoUML.URML.URMLPackage.eINSTANCE.getClassifierAtom()
				.isSuperTypeOf(domainElement.eClass())
				&& isClassifierAtom_4016((OntoUML.URML.ClassifierAtom) domainElement)) {
			return OntoUML.diagram.edit.parts.ClassifierAtomEditPart.VISUAL_ID;
		}
		if (OntoUML.URML.URMLPackage.eINSTANCE.getClassifierAtom()
				.isSuperTypeOf(domainElement.eClass())
				&& isClassifierAtom_4017((OntoUML.URML.ClassifierAtom) domainElement)) {
			return OntoUML.diagram.edit.parts.ClassifierAtom2EditPart.VISUAL_ID;
		}
		if (OntoUML.URML.URMLPackage.eINSTANCE.getClassifierAtom()
				.isSuperTypeOf(domainElement.eClass())
				&& isClassifierAtom_4018((OntoUML.URML.ClassifierAtom) domainElement)) {
			return OntoUML.diagram.edit.parts.ClassifierAtom3EditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(OntoUML.Container element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isBinaryAssociationAtom_4013(
			OntoUML.URML.BinaryAssociationAtom domainElement) {
		if (BinaryAssociationAtom_4013_Constraint == null) { // lazy initialization
			BinaryAssociationAtom_4013_Constraint = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"oclIsKindOf(Condition)  and negative=false and conclusionRule=null", OntoUML.URML.URMLPackage.eINSTANCE.getBinaryAssociationAtom()); //$NON-NLS-1$
		}
		Object result = BinaryAssociationAtom_4013_Constraint
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isBinaryAssociationAtom_4014(
			OntoUML.URML.BinaryAssociationAtom domainElement) {
		if (BinaryAssociationAtom_4014_Constraint == null) { // lazy initialization
			BinaryAssociationAtom_4014_Constraint = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"oclIsKindOf(Condition) and negative=true and conclusionRule=null", OntoUML.URML.URMLPackage.eINSTANCE.getBinaryAssociationAtom()); //$NON-NLS-1$
		}
		Object result = BinaryAssociationAtom_4014_Constraint
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isBinaryAssociationAtom_4015(
			OntoUML.URML.BinaryAssociationAtom domainElement) {
		if (BinaryAssociationAtom_4015_Constraint == null) { // lazy initialization
			BinaryAssociationAtom_4015_Constraint = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"oclIsKindOf(Conclusion) and conditionRule=null", OntoUML.URML.URMLPackage.eINSTANCE.getBinaryAssociationAtom()); //$NON-NLS-1$
		}
		Object result = BinaryAssociationAtom_4015_Constraint
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isClassifierAtom_4016(
			OntoUML.URML.ClassifierAtom domainElement) {
		if (ClassifierAtom_4016_Constraint == null) { // lazy initialization
			ClassifierAtom_4016_Constraint = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"oclIsKindOf(Condition) and (negative = true and conclusionRule = null)", OntoUML.URML.URMLPackage.eINSTANCE.getClassifierAtom()); //$NON-NLS-1$
		}
		Object result = ClassifierAtom_4016_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isClassifierAtom_4017(
			OntoUML.URML.ClassifierAtom domainElement) {
		if (ClassifierAtom_4017_Constraint == null) { // lazy initialization
			ClassifierAtom_4017_Constraint = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"oclIsKindOf(Condition) and (negative = false and conclusionRule = null)", OntoUML.URML.URMLPackage.eINSTANCE.getClassifierAtom()); //$NON-NLS-1$
		}
		Object result = ClassifierAtom_4017_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isClassifierAtom_4018(
			OntoUML.URML.ClassifierAtom domainElement) {
		if (ClassifierAtom_4018_Constraint == null) { // lazy initialization
			ClassifierAtom_4018_Constraint = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"oclIsKindOf(Conclusion) and conditionRule=null", OntoUML.URML.URMLPackage.eINSTANCE.getClassifierAtom()); //$NON-NLS-1$
		}
		Object result = ClassifierAtom_4018_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

}
