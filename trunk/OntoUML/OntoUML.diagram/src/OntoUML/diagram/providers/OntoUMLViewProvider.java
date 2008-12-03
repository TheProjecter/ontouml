package OntoUML.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class OntoUMLViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (OntoUML.diagram.edit.parts.ContainerEditPart.MODEL_ID
				.equals(diagramKind)
				&& OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getDiagramVisualID(semanticElement) != -1) {
			return OntoUML.diagram.view.factories.ContainerViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		EObject domainElement = getSemanticElement(semanticAdapter);
		int visualID;
		if (semanticHint == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!OntoUML.diagram.providers.OntoUMLElementTypes
						.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
								.getNodeVisualID(containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!OntoUML.diagram.edit.parts.ContainerEditPart.MODEL_ID
						.equals(OntoUML.diagram.part.OntoUMLVisualIDRegistry
								.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case OntoUML.diagram.edit.parts.CategoryEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.CollectiveEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.KindEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.MixinEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.ModeEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.PhaseEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.QuantityEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.RelatorEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.RoleEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.RoleMixinEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.SimpleDatatypeEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.StructuralDatatypeEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.SubKindEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.GeneralizationSetEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.DerivationRuleEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.Property2EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.PropertyEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.Property3EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.Property4EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.Property5EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.Property6EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.Property7EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.Property8EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.Property9EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.Property10EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.Property11EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.Property12EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.Property13EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.Property14EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.Property15EditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
									.getNodeVisualID(containerView,
											domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case OntoUML.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.CategoryNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.CategoryAttributeCompartmentEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.CategoryEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.CollectiveNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.CollectiveAttributeCompartmentEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.CollectiveEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.KindNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.KindAttributeCompartmentEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.KindEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.MixinNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.MixinAttributeCompartmentEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.MixinEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.ModeNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.ModeAttributeCompartmentEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.ModeEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.PhaseNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.PhaseAttributeCompartmentEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.PhaseEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.QuantityNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.QuantityAttributeCompartmentEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.QuantityEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.RelatorNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.RelatorAttributeCompartmentEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.RelatorEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.RoleNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.RoleAttributeCompartmentEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.RoleEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.RoleMixinNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.RoleMixinAttributeCompartmentEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.RoleMixinEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.SimpleDatatypeNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.SimpleDatatypeAttributeCompartmentEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.SimpleDatatypeEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.StructuralDatatypeNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.StructuralDatatypeAttributeCompartmentEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.StructuralDatatypeEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.SubKindNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.SubKindAttributeCompartmentEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.SubKindEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.GeneralizationSetNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.GeneralizationSetAttributeCompartmentEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.GeneralizationSetEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.DerivationRuleNameEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.DerivationRuleEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.PropertyNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.PropertyLowerUpperEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.PropertyEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.WrappingLabel14EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.CharacterizationNameEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.CharacterizationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.ComponentOfNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.ComponentOfEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.DatatypeAssociationNameEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.DatatypeAssociationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.DerivationNameEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.DerivationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.WrappingLabel16EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.FormalAssociationNameEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.FormalAssociationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.WrappingLabel17EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.MaterialAssociationNameEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.MaterialAssociationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.WrappingLabel18EditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.MediationNameEditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.MediationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.MemberOfNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.WrappingLabel19EditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.MemberOfEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.SubCollectionOfNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.WrappingLabel20EditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.SubCollectionOfEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.SubQuantityOfNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.WrappingLabel21EditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.SubQuantityOfEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.BinaryAssociationAtomNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.BinaryAssociationAtomName2EditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.BinaryAssociationAtom3EditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OntoUML.diagram.edit.parts.ClassifierAtomNameEditPart.VISUAL_ID:
				case OntoUML.diagram.edit.parts.ClassifierAtomName2EditPart.VISUAL_ID:
					if (OntoUML.diagram.edit.parts.ClassifierAtom3EditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null
				|| !OntoUML.diagram.part.OntoUMLVisualIDRegistry.canCreateNode(
						containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case OntoUML.diagram.edit.parts.CategoryEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.CategoryViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabelViewFactory.class;
		case OntoUML.diagram.edit.parts.CategoryNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.CategoryNameViewFactory.class;
		case OntoUML.diagram.edit.parts.CollectiveEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.CollectiveViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabel2ViewFactory.class;
		case OntoUML.diagram.edit.parts.CollectiveNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.CollectiveNameViewFactory.class;
		case OntoUML.diagram.edit.parts.KindEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.KindViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabel3ViewFactory.class;
		case OntoUML.diagram.edit.parts.KindNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.KindNameViewFactory.class;
		case OntoUML.diagram.edit.parts.MixinEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.MixinViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabel4ViewFactory.class;
		case OntoUML.diagram.edit.parts.MixinNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.MixinNameViewFactory.class;
		case OntoUML.diagram.edit.parts.ModeEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.ModeViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabel5ViewFactory.class;
		case OntoUML.diagram.edit.parts.ModeNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.ModeNameViewFactory.class;
		case OntoUML.diagram.edit.parts.PhaseEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.PhaseViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabel6ViewFactory.class;
		case OntoUML.diagram.edit.parts.PhaseNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.PhaseNameViewFactory.class;
		case OntoUML.diagram.edit.parts.QuantityEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.QuantityViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabel7ViewFactory.class;
		case OntoUML.diagram.edit.parts.QuantityNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.QuantityNameViewFactory.class;
		case OntoUML.diagram.edit.parts.RelatorEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.RelatorViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabel8ViewFactory.class;
		case OntoUML.diagram.edit.parts.RelatorNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.RelatorNameViewFactory.class;
		case OntoUML.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.RoleViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabel9ViewFactory.class;
		case OntoUML.diagram.edit.parts.RoleNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.RoleNameViewFactory.class;
		case OntoUML.diagram.edit.parts.RoleMixinEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.RoleMixinViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabel10ViewFactory.class;
		case OntoUML.diagram.edit.parts.RoleMixinNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.RoleMixinNameViewFactory.class;
		case OntoUML.diagram.edit.parts.SimpleDatatypeEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.SimpleDatatypeViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabel11ViewFactory.class;
		case OntoUML.diagram.edit.parts.SimpleDatatypeNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.SimpleDatatypeNameViewFactory.class;
		case OntoUML.diagram.edit.parts.StructuralDatatypeEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.StructuralDatatypeViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabel12ViewFactory.class;
		case OntoUML.diagram.edit.parts.StructuralDatatypeNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.StructuralDatatypeNameViewFactory.class;
		case OntoUML.diagram.edit.parts.SubKindEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.SubKindViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabel13ViewFactory.class;
		case OntoUML.diagram.edit.parts.SubKindNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.SubKindNameViewFactory.class;
		case OntoUML.diagram.edit.parts.GeneralizationSetEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.GeneralizationSetViewFactory.class;
		case OntoUML.diagram.edit.parts.GeneralizationSetNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.GeneralizationSetNameViewFactory.class;
		case OntoUML.diagram.edit.parts.DerivationRuleEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.DerivationRuleViewFactory.class;
		case OntoUML.diagram.edit.parts.DerivationRuleNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.DerivationRuleNameViewFactory.class;
		case OntoUML.diagram.edit.parts.PropertyEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.PropertyViewFactory.class;
		case OntoUML.diagram.edit.parts.PropertyNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.PropertyNameViewFactory.class;
		case OntoUML.diagram.edit.parts.PropertyLowerUpperEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.PropertyLowerUpperViewFactory.class;
		case OntoUML.diagram.edit.parts.Property2EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.Property2ViewFactory.class;
		case OntoUML.diagram.edit.parts.Property3EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.Property3ViewFactory.class;
		case OntoUML.diagram.edit.parts.Property4EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.Property4ViewFactory.class;
		case OntoUML.diagram.edit.parts.Property5EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.Property5ViewFactory.class;
		case OntoUML.diagram.edit.parts.Property6EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.Property6ViewFactory.class;
		case OntoUML.diagram.edit.parts.Property7EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.Property7ViewFactory.class;
		case OntoUML.diagram.edit.parts.Property8EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.Property8ViewFactory.class;
		case OntoUML.diagram.edit.parts.Property9EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.Property9ViewFactory.class;
		case OntoUML.diagram.edit.parts.Property10EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.Property10ViewFactory.class;
		case OntoUML.diagram.edit.parts.Property11EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.Property11ViewFactory.class;
		case OntoUML.diagram.edit.parts.Property12EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.Property12ViewFactory.class;
		case OntoUML.diagram.edit.parts.Property13EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.Property13ViewFactory.class;
		case OntoUML.diagram.edit.parts.Property14EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.Property14ViewFactory.class;
		case OntoUML.diagram.edit.parts.Property15EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.Property15ViewFactory.class;
		case OntoUML.diagram.edit.parts.CategoryAttributeCompartmentEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.CategoryAttributeCompartmentViewFactory.class;
		case OntoUML.diagram.edit.parts.CollectiveAttributeCompartmentEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.CollectiveAttributeCompartmentViewFactory.class;
		case OntoUML.diagram.edit.parts.KindAttributeCompartmentEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.KindAttributeCompartmentViewFactory.class;
		case OntoUML.diagram.edit.parts.MixinAttributeCompartmentEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.MixinAttributeCompartmentViewFactory.class;
		case OntoUML.diagram.edit.parts.ModeAttributeCompartmentEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.ModeAttributeCompartmentViewFactory.class;
		case OntoUML.diagram.edit.parts.PhaseAttributeCompartmentEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.PhaseAttributeCompartmentViewFactory.class;
		case OntoUML.diagram.edit.parts.QuantityAttributeCompartmentEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.QuantityAttributeCompartmentViewFactory.class;
		case OntoUML.diagram.edit.parts.RelatorAttributeCompartmentEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.RelatorAttributeCompartmentViewFactory.class;
		case OntoUML.diagram.edit.parts.RoleAttributeCompartmentEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.RoleAttributeCompartmentViewFactory.class;
		case OntoUML.diagram.edit.parts.RoleMixinAttributeCompartmentEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.RoleMixinAttributeCompartmentViewFactory.class;
		case OntoUML.diagram.edit.parts.SimpleDatatypeAttributeCompartmentEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.SimpleDatatypeAttributeCompartmentViewFactory.class;
		case OntoUML.diagram.edit.parts.StructuralDatatypeAttributeCompartmentEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.StructuralDatatypeAttributeCompartmentViewFactory.class;
		case OntoUML.diagram.edit.parts.SubKindAttributeCompartmentEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.SubKindAttributeCompartmentViewFactory.class;
		case OntoUML.diagram.edit.parts.GeneralizationSetAttributeCompartmentEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.GeneralizationSetAttributeCompartmentViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabel14EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabel14ViewFactory.class;
		case OntoUML.diagram.edit.parts.CharacterizationNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.CharacterizationNameViewFactory.class;
		case OntoUML.diagram.edit.parts.ComponentOfNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.ComponentOfNameViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabel15ViewFactory.class;
		case OntoUML.diagram.edit.parts.DatatypeAssociationNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.DatatypeAssociationNameViewFactory.class;
		case OntoUML.diagram.edit.parts.DerivationNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.DerivationNameViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabel16EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabel16ViewFactory.class;
		case OntoUML.diagram.edit.parts.FormalAssociationNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.FormalAssociationNameViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabel17EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabel17ViewFactory.class;
		case OntoUML.diagram.edit.parts.MaterialAssociationNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.MaterialAssociationNameViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabel18EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabel18ViewFactory.class;
		case OntoUML.diagram.edit.parts.MediationNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.MediationNameViewFactory.class;
		case OntoUML.diagram.edit.parts.MemberOfNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.MemberOfNameViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabel19EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabel19ViewFactory.class;
		case OntoUML.diagram.edit.parts.SubCollectionOfNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.SubCollectionOfNameViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabel20EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabel20ViewFactory.class;
		case OntoUML.diagram.edit.parts.SubQuantityOfNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.SubQuantityOfNameViewFactory.class;
		case OntoUML.diagram.edit.parts.WrappingLabel21EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.WrappingLabel21ViewFactory.class;
		case OntoUML.diagram.edit.parts.BinaryAssociationAtomNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.BinaryAssociationAtomNameViewFactory.class;
		case OntoUML.diagram.edit.parts.BinaryAssociationAtomName2EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.BinaryAssociationAtomName2ViewFactory.class;
		case OntoUML.diagram.edit.parts.ClassifierAtomNameEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.ClassifierAtomNameViewFactory.class;
		case OntoUML.diagram.edit.parts.ClassifierAtomName2EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.ClassifierAtomName2ViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!OntoUML.diagram.providers.OntoUMLElementTypes
				.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
				.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		case OntoUML.diagram.edit.parts.CharacterizationEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.CharacterizationViewFactory.class;
		case OntoUML.diagram.edit.parts.ComponentOfEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.ComponentOfViewFactory.class;
		case OntoUML.diagram.edit.parts.DatatypeAssociationEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.DatatypeAssociationViewFactory.class;
		case OntoUML.diagram.edit.parts.DerivationEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.DerivationViewFactory.class;
		case OntoUML.diagram.edit.parts.FormalAssociationEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.FormalAssociationViewFactory.class;
		case OntoUML.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.GeneralizationViewFactory.class;
		case OntoUML.diagram.edit.parts.MaterialAssociationEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.MaterialAssociationViewFactory.class;
		case OntoUML.diagram.edit.parts.MediationEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.MediationViewFactory.class;
		case OntoUML.diagram.edit.parts.MemberOfEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.MemberOfViewFactory.class;
		case OntoUML.diagram.edit.parts.SubCollectionOfEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.SubCollectionOfViewFactory.class;
		case OntoUML.diagram.edit.parts.SubQuantityOfEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.SubQuantityOfViewFactory.class;
		case OntoUML.diagram.edit.parts.Property16EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.Property16ViewFactory.class;
		case OntoUML.diagram.edit.parts.BinaryAssociationAtomEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.BinaryAssociationAtomViewFactory.class;
		case OntoUML.diagram.edit.parts.BinaryAssociationAtom2EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.BinaryAssociationAtom2ViewFactory.class;
		case OntoUML.diagram.edit.parts.BinaryAssociationAtom3EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.BinaryAssociationAtom3ViewFactory.class;
		case OntoUML.diagram.edit.parts.ClassifierAtomEditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.ClassifierAtomViewFactory.class;
		case OntoUML.diagram.edit.parts.ClassifierAtom2EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.ClassifierAtom2ViewFactory.class;
		case OntoUML.diagram.edit.parts.ClassifierAtom3EditPart.VISUAL_ID:
			return OntoUML.diagram.view.factories.ClassifierAtom3ViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
