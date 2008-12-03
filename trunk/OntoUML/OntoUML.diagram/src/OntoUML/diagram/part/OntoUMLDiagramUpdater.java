package OntoUML.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class OntoUMLDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (OntoUML.diagram.part.OntoUMLVisualIDRegistry.getVisualID(view)) {
		case OntoUML.diagram.edit.parts.CategoryAttributeCompartmentEditPart.VISUAL_ID:
			return getCategoryAttributeCompartment_7001SemanticChildren(view);
		case OntoUML.diagram.edit.parts.CollectiveAttributeCompartmentEditPart.VISUAL_ID:
			return getCollectiveAttributeCompartment_7002SemanticChildren(view);
		case OntoUML.diagram.edit.parts.KindAttributeCompartmentEditPart.VISUAL_ID:
			return getKindAttributeCompartment_7003SemanticChildren(view);
		case OntoUML.diagram.edit.parts.MixinAttributeCompartmentEditPart.VISUAL_ID:
			return getMixinAttributeCompartment_7004SemanticChildren(view);
		case OntoUML.diagram.edit.parts.ModeAttributeCompartmentEditPart.VISUAL_ID:
			return getModeAttributeCompartment_7005SemanticChildren(view);
		case OntoUML.diagram.edit.parts.PhaseAttributeCompartmentEditPart.VISUAL_ID:
			return getPhaseAttributeCompartment_7006SemanticChildren(view);
		case OntoUML.diagram.edit.parts.QuantityAttributeCompartmentEditPart.VISUAL_ID:
			return getQuantityAttributeCompartment_7007SemanticChildren(view);
		case OntoUML.diagram.edit.parts.RelatorAttributeCompartmentEditPart.VISUAL_ID:
			return getRelatorAttributeCompartment_7008SemanticChildren(view);
		case OntoUML.diagram.edit.parts.RoleAttributeCompartmentEditPart.VISUAL_ID:
			return getRoleAttributeCompartment_7009SemanticChildren(view);
		case OntoUML.diagram.edit.parts.RoleMixinAttributeCompartmentEditPart.VISUAL_ID:
			return getRoleMixinAttributeCompartment_7010SemanticChildren(view);
		case OntoUML.diagram.edit.parts.SimpleDatatypeAttributeCompartmentEditPart.VISUAL_ID:
			return getSimpleDatatypeAttributeCompartment_7011SemanticChildren(view);
		case OntoUML.diagram.edit.parts.StructuralDatatypeAttributeCompartmentEditPart.VISUAL_ID:
			return getStructuralDatatypeAttributeCompartment_7012SemanticChildren(view);
		case OntoUML.diagram.edit.parts.SubKindAttributeCompartmentEditPart.VISUAL_ID:
			return getSubKindAttributeCompartment_7013SemanticChildren(view);
		case OntoUML.diagram.edit.parts.GeneralizationSetAttributeCompartmentEditPart.VISUAL_ID:
			return getGeneralizationSetAttributeCompartment_7014SemanticChildren(view);
		case OntoUML.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
			return getContainer_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCategoryAttributeCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OntoUML.Category modelElement = (OntoUML.Category) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAttribute().iterator(); it.hasNext();) {
			OntoUML.Element childElement = (OntoUML.Element) it.next();
			int visualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == OntoUML.diagram.edit.parts.Property2EditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCollectiveAttributeCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OntoUML.Collective modelElement = (OntoUML.Collective) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAttribute().iterator(); it.hasNext();) {
			OntoUML.Element childElement = (OntoUML.Element) it.next();
			int visualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == OntoUML.diagram.edit.parts.Property3EditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getKindAttributeCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OntoUML.Kind modelElement = (OntoUML.Kind) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAttribute().iterator(); it.hasNext();) {
			OntoUML.Element childElement = (OntoUML.Element) it.next();
			int visualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == OntoUML.diagram.edit.parts.Property4EditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMixinAttributeCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OntoUML.Mixin modelElement = (OntoUML.Mixin) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAttribute().iterator(); it.hasNext();) {
			OntoUML.Element childElement = (OntoUML.Element) it.next();
			int visualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == OntoUML.diagram.edit.parts.Property5EditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getModeAttributeCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OntoUML.Mode modelElement = (OntoUML.Mode) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAttribute().iterator(); it.hasNext();) {
			OntoUML.Element childElement = (OntoUML.Element) it.next();
			int visualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == OntoUML.diagram.edit.parts.Property6EditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPhaseAttributeCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OntoUML.Phase modelElement = (OntoUML.Phase) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAttribute().iterator(); it.hasNext();) {
			OntoUML.Element childElement = (OntoUML.Element) it.next();
			int visualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == OntoUML.diagram.edit.parts.Property7EditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getQuantityAttributeCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OntoUML.Quantity modelElement = (OntoUML.Quantity) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAttribute().iterator(); it.hasNext();) {
			OntoUML.Element childElement = (OntoUML.Element) it.next();
			int visualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == OntoUML.diagram.edit.parts.Property8EditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRelatorAttributeCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OntoUML.Relator modelElement = (OntoUML.Relator) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAttribute().iterator(); it.hasNext();) {
			OntoUML.Element childElement = (OntoUML.Element) it.next();
			int visualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == OntoUML.diagram.edit.parts.Property9EditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRoleAttributeCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OntoUML.Role modelElement = (OntoUML.Role) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAttribute().iterator(); it.hasNext();) {
			OntoUML.Element childElement = (OntoUML.Element) it.next();
			int visualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == OntoUML.diagram.edit.parts.Property10EditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRoleMixinAttributeCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OntoUML.RoleMixin modelElement = (OntoUML.RoleMixin) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAttribute().iterator(); it.hasNext();) {
			OntoUML.Element childElement = (OntoUML.Element) it.next();
			int visualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == OntoUML.diagram.edit.parts.Property11EditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSimpleDatatypeAttributeCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OntoUML.SimpleDatatype modelElement = (OntoUML.SimpleDatatype) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAttribute().iterator(); it.hasNext();) {
			OntoUML.Element childElement = (OntoUML.Element) it.next();
			int visualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == OntoUML.diagram.edit.parts.Property12EditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStructuralDatatypeAttributeCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OntoUML.StructuralDatatype modelElement = (OntoUML.StructuralDatatype) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAttribute().iterator(); it.hasNext();) {
			OntoUML.Element childElement = (OntoUML.Element) it.next();
			int visualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == OntoUML.diagram.edit.parts.Property13EditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSubKindAttributeCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OntoUML.SubKind modelElement = (OntoUML.SubKind) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAttribute().iterator(); it.hasNext();) {
			OntoUML.Element childElement = (OntoUML.Element) it.next();
			int visualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == OntoUML.diagram.edit.parts.Property14EditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGeneralizationSetAttributeCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OntoUML.GeneralizationSet modelElement = (OntoUML.GeneralizationSet) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAttribute().iterator(); it.hasNext();) {
			OntoUML.Element childElement = (OntoUML.Element) it.next();
			int visualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == OntoUML.diagram.edit.parts.Property15EditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainer_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OntoUML.Container modelElement = (OntoUML.Container) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getInstanciarElement().iterator(); it
				.hasNext();) {
			OntoUML.Element childElement = (OntoUML.Element) it.next();
			int visualID = OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == OntoUML.diagram.edit.parts.CategoryEditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == OntoUML.diagram.edit.parts.CollectiveEditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == OntoUML.diagram.edit.parts.KindEditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == OntoUML.diagram.edit.parts.MixinEditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == OntoUML.diagram.edit.parts.ModeEditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == OntoUML.diagram.edit.parts.PhaseEditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == OntoUML.diagram.edit.parts.QuantityEditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == OntoUML.diagram.edit.parts.RelatorEditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == OntoUML.diagram.edit.parts.RoleEditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == OntoUML.diagram.edit.parts.RoleMixinEditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == OntoUML.diagram.edit.parts.SimpleDatatypeEditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == OntoUML.diagram.edit.parts.StructuralDatatypeEditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == OntoUML.diagram.edit.parts.SubKindEditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == OntoUML.diagram.edit.parts.GeneralizationSetEditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == OntoUML.diagram.edit.parts.DerivationRuleEditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == OntoUML.diagram.edit.parts.PropertyEditPart.VISUAL_ID) {
				result.add(new OntoUML.diagram.part.OntoUMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (OntoUML.diagram.part.OntoUMLVisualIDRegistry.getVisualID(view)) {
		case OntoUML.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
			return getContainer_1000ContainedLinks(view);
		case OntoUML.diagram.edit.parts.CategoryEditPart.VISUAL_ID:
			return getCategory_2001ContainedLinks(view);
		case OntoUML.diagram.edit.parts.CollectiveEditPart.VISUAL_ID:
			return getCollective_2002ContainedLinks(view);
		case OntoUML.diagram.edit.parts.KindEditPart.VISUAL_ID:
			return getKind_2003ContainedLinks(view);
		case OntoUML.diagram.edit.parts.MixinEditPart.VISUAL_ID:
			return getMixin_2004ContainedLinks(view);
		case OntoUML.diagram.edit.parts.ModeEditPart.VISUAL_ID:
			return getMode_2005ContainedLinks(view);
		case OntoUML.diagram.edit.parts.PhaseEditPart.VISUAL_ID:
			return getPhase_2006ContainedLinks(view);
		case OntoUML.diagram.edit.parts.QuantityEditPart.VISUAL_ID:
			return getQuantity_2007ContainedLinks(view);
		case OntoUML.diagram.edit.parts.RelatorEditPart.VISUAL_ID:
			return getRelator_2008ContainedLinks(view);
		case OntoUML.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_2009ContainedLinks(view);
		case OntoUML.diagram.edit.parts.RoleMixinEditPart.VISUAL_ID:
			return getRoleMixin_2010ContainedLinks(view);
		case OntoUML.diagram.edit.parts.SimpleDatatypeEditPart.VISUAL_ID:
			return getSimpleDatatype_2011ContainedLinks(view);
		case OntoUML.diagram.edit.parts.StructuralDatatypeEditPart.VISUAL_ID:
			return getStructuralDatatype_2012ContainedLinks(view);
		case OntoUML.diagram.edit.parts.SubKindEditPart.VISUAL_ID:
			return getSubKind_2013ContainedLinks(view);
		case OntoUML.diagram.edit.parts.GeneralizationSetEditPart.VISUAL_ID:
			return getGeneralizationSet_2014ContainedLinks(view);
		case OntoUML.diagram.edit.parts.DerivationRuleEditPart.VISUAL_ID:
			return getDerivationRule_2015ContainedLinks(view);
		case OntoUML.diagram.edit.parts.PropertyEditPart.VISUAL_ID:
			return getProperty_2016ContainedLinks(view);
		case OntoUML.diagram.edit.parts.Property2EditPart.VISUAL_ID:
			return getProperty_3001ContainedLinks(view);
		case OntoUML.diagram.edit.parts.Property3EditPart.VISUAL_ID:
			return getProperty_3002ContainedLinks(view);
		case OntoUML.diagram.edit.parts.Property4EditPart.VISUAL_ID:
			return getProperty_3003ContainedLinks(view);
		case OntoUML.diagram.edit.parts.Property5EditPart.VISUAL_ID:
			return getProperty_3004ContainedLinks(view);
		case OntoUML.diagram.edit.parts.Property6EditPart.VISUAL_ID:
			return getProperty_3005ContainedLinks(view);
		case OntoUML.diagram.edit.parts.Property7EditPart.VISUAL_ID:
			return getProperty_3006ContainedLinks(view);
		case OntoUML.diagram.edit.parts.Property8EditPart.VISUAL_ID:
			return getProperty_3007ContainedLinks(view);
		case OntoUML.diagram.edit.parts.Property9EditPart.VISUAL_ID:
			return getProperty_3008ContainedLinks(view);
		case OntoUML.diagram.edit.parts.Property10EditPart.VISUAL_ID:
			return getProperty_3009ContainedLinks(view);
		case OntoUML.diagram.edit.parts.Property11EditPart.VISUAL_ID:
			return getProperty_3010ContainedLinks(view);
		case OntoUML.diagram.edit.parts.Property12EditPart.VISUAL_ID:
			return getProperty_3011ContainedLinks(view);
		case OntoUML.diagram.edit.parts.Property13EditPart.VISUAL_ID:
			return getProperty_3012ContainedLinks(view);
		case OntoUML.diagram.edit.parts.Property14EditPart.VISUAL_ID:
			return getProperty_3013ContainedLinks(view);
		case OntoUML.diagram.edit.parts.Property15EditPart.VISUAL_ID:
			return getProperty_3014ContainedLinks(view);
		case OntoUML.diagram.edit.parts.CharacterizationEditPart.VISUAL_ID:
			return getCharacterization_4001ContainedLinks(view);
		case OntoUML.diagram.edit.parts.ComponentOfEditPart.VISUAL_ID:
			return getComponentOf_4002ContainedLinks(view);
		case OntoUML.diagram.edit.parts.DatatypeAssociationEditPart.VISUAL_ID:
			return getDatatypeAssociation_4003ContainedLinks(view);
		case OntoUML.diagram.edit.parts.DerivationEditPart.VISUAL_ID:
			return getDerivation_4004ContainedLinks(view);
		case OntoUML.diagram.edit.parts.FormalAssociationEditPart.VISUAL_ID:
			return getFormalAssociation_4005ContainedLinks(view);
		case OntoUML.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4006ContainedLinks(view);
		case OntoUML.diagram.edit.parts.MaterialAssociationEditPart.VISUAL_ID:
			return getMaterialAssociation_4007ContainedLinks(view);
		case OntoUML.diagram.edit.parts.MediationEditPart.VISUAL_ID:
			return getMediation_4008ContainedLinks(view);
		case OntoUML.diagram.edit.parts.MemberOfEditPart.VISUAL_ID:
			return getMemberOf_4009ContainedLinks(view);
		case OntoUML.diagram.edit.parts.SubCollectionOfEditPart.VISUAL_ID:
			return getSubCollectionOf_4010ContainedLinks(view);
		case OntoUML.diagram.edit.parts.SubQuantityOfEditPart.VISUAL_ID:
			return getSubQuantityOf_4011ContainedLinks(view);
		case OntoUML.diagram.edit.parts.Property16EditPart.VISUAL_ID:
			return getProperty_4012ContainedLinks(view);
		case OntoUML.diagram.edit.parts.BinaryAssociationAtomEditPart.VISUAL_ID:
			return getBinaryAssociationAtom_4013ContainedLinks(view);
		case OntoUML.diagram.edit.parts.BinaryAssociationAtom2EditPart.VISUAL_ID:
			return getBinaryAssociationAtom_4014ContainedLinks(view);
		case OntoUML.diagram.edit.parts.BinaryAssociationAtom3EditPart.VISUAL_ID:
			return getBinaryAssociationAtom_4015ContainedLinks(view);
		case OntoUML.diagram.edit.parts.ClassifierAtomEditPart.VISUAL_ID:
			return getClassifierAtom_4016ContainedLinks(view);
		case OntoUML.diagram.edit.parts.ClassifierAtom2EditPart.VISUAL_ID:
			return getClassifierAtom_4017ContainedLinks(view);
		case OntoUML.diagram.edit.parts.ClassifierAtom3EditPart.VISUAL_ID:
			return getClassifierAtom_4018ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (OntoUML.diagram.part.OntoUMLVisualIDRegistry.getVisualID(view)) {
		case OntoUML.diagram.edit.parts.CategoryEditPart.VISUAL_ID:
			return getCategory_2001IncomingLinks(view);
		case OntoUML.diagram.edit.parts.CollectiveEditPart.VISUAL_ID:
			return getCollective_2002IncomingLinks(view);
		case OntoUML.diagram.edit.parts.KindEditPart.VISUAL_ID:
			return getKind_2003IncomingLinks(view);
		case OntoUML.diagram.edit.parts.MixinEditPart.VISUAL_ID:
			return getMixin_2004IncomingLinks(view);
		case OntoUML.diagram.edit.parts.ModeEditPart.VISUAL_ID:
			return getMode_2005IncomingLinks(view);
		case OntoUML.diagram.edit.parts.PhaseEditPart.VISUAL_ID:
			return getPhase_2006IncomingLinks(view);
		case OntoUML.diagram.edit.parts.QuantityEditPart.VISUAL_ID:
			return getQuantity_2007IncomingLinks(view);
		case OntoUML.diagram.edit.parts.RelatorEditPart.VISUAL_ID:
			return getRelator_2008IncomingLinks(view);
		case OntoUML.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_2009IncomingLinks(view);
		case OntoUML.diagram.edit.parts.RoleMixinEditPart.VISUAL_ID:
			return getRoleMixin_2010IncomingLinks(view);
		case OntoUML.diagram.edit.parts.SimpleDatatypeEditPart.VISUAL_ID:
			return getSimpleDatatype_2011IncomingLinks(view);
		case OntoUML.diagram.edit.parts.StructuralDatatypeEditPart.VISUAL_ID:
			return getStructuralDatatype_2012IncomingLinks(view);
		case OntoUML.diagram.edit.parts.SubKindEditPart.VISUAL_ID:
			return getSubKind_2013IncomingLinks(view);
		case OntoUML.diagram.edit.parts.GeneralizationSetEditPart.VISUAL_ID:
			return getGeneralizationSet_2014IncomingLinks(view);
		case OntoUML.diagram.edit.parts.DerivationRuleEditPart.VISUAL_ID:
			return getDerivationRule_2015IncomingLinks(view);
		case OntoUML.diagram.edit.parts.PropertyEditPart.VISUAL_ID:
			return getProperty_2016IncomingLinks(view);
		case OntoUML.diagram.edit.parts.Property2EditPart.VISUAL_ID:
			return getProperty_3001IncomingLinks(view);
		case OntoUML.diagram.edit.parts.Property3EditPart.VISUAL_ID:
			return getProperty_3002IncomingLinks(view);
		case OntoUML.diagram.edit.parts.Property4EditPart.VISUAL_ID:
			return getProperty_3003IncomingLinks(view);
		case OntoUML.diagram.edit.parts.Property5EditPart.VISUAL_ID:
			return getProperty_3004IncomingLinks(view);
		case OntoUML.diagram.edit.parts.Property6EditPart.VISUAL_ID:
			return getProperty_3005IncomingLinks(view);
		case OntoUML.diagram.edit.parts.Property7EditPart.VISUAL_ID:
			return getProperty_3006IncomingLinks(view);
		case OntoUML.diagram.edit.parts.Property8EditPart.VISUAL_ID:
			return getProperty_3007IncomingLinks(view);
		case OntoUML.diagram.edit.parts.Property9EditPart.VISUAL_ID:
			return getProperty_3008IncomingLinks(view);
		case OntoUML.diagram.edit.parts.Property10EditPart.VISUAL_ID:
			return getProperty_3009IncomingLinks(view);
		case OntoUML.diagram.edit.parts.Property11EditPart.VISUAL_ID:
			return getProperty_3010IncomingLinks(view);
		case OntoUML.diagram.edit.parts.Property12EditPart.VISUAL_ID:
			return getProperty_3011IncomingLinks(view);
		case OntoUML.diagram.edit.parts.Property13EditPart.VISUAL_ID:
			return getProperty_3012IncomingLinks(view);
		case OntoUML.diagram.edit.parts.Property14EditPart.VISUAL_ID:
			return getProperty_3013IncomingLinks(view);
		case OntoUML.diagram.edit.parts.Property15EditPart.VISUAL_ID:
			return getProperty_3014IncomingLinks(view);
		case OntoUML.diagram.edit.parts.CharacterizationEditPart.VISUAL_ID:
			return getCharacterization_4001IncomingLinks(view);
		case OntoUML.diagram.edit.parts.ComponentOfEditPart.VISUAL_ID:
			return getComponentOf_4002IncomingLinks(view);
		case OntoUML.diagram.edit.parts.DatatypeAssociationEditPart.VISUAL_ID:
			return getDatatypeAssociation_4003IncomingLinks(view);
		case OntoUML.diagram.edit.parts.DerivationEditPart.VISUAL_ID:
			return getDerivation_4004IncomingLinks(view);
		case OntoUML.diagram.edit.parts.FormalAssociationEditPart.VISUAL_ID:
			return getFormalAssociation_4005IncomingLinks(view);
		case OntoUML.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4006IncomingLinks(view);
		case OntoUML.diagram.edit.parts.MaterialAssociationEditPart.VISUAL_ID:
			return getMaterialAssociation_4007IncomingLinks(view);
		case OntoUML.diagram.edit.parts.MediationEditPart.VISUAL_ID:
			return getMediation_4008IncomingLinks(view);
		case OntoUML.diagram.edit.parts.MemberOfEditPart.VISUAL_ID:
			return getMemberOf_4009IncomingLinks(view);
		case OntoUML.diagram.edit.parts.SubCollectionOfEditPart.VISUAL_ID:
			return getSubCollectionOf_4010IncomingLinks(view);
		case OntoUML.diagram.edit.parts.SubQuantityOfEditPart.VISUAL_ID:
			return getSubQuantityOf_4011IncomingLinks(view);
		case OntoUML.diagram.edit.parts.Property16EditPart.VISUAL_ID:
			return getProperty_4012IncomingLinks(view);
		case OntoUML.diagram.edit.parts.BinaryAssociationAtomEditPart.VISUAL_ID:
			return getBinaryAssociationAtom_4013IncomingLinks(view);
		case OntoUML.diagram.edit.parts.BinaryAssociationAtom2EditPart.VISUAL_ID:
			return getBinaryAssociationAtom_4014IncomingLinks(view);
		case OntoUML.diagram.edit.parts.BinaryAssociationAtom3EditPart.VISUAL_ID:
			return getBinaryAssociationAtom_4015IncomingLinks(view);
		case OntoUML.diagram.edit.parts.ClassifierAtomEditPart.VISUAL_ID:
			return getClassifierAtom_4016IncomingLinks(view);
		case OntoUML.diagram.edit.parts.ClassifierAtom2EditPart.VISUAL_ID:
			return getClassifierAtom_4017IncomingLinks(view);
		case OntoUML.diagram.edit.parts.ClassifierAtom3EditPart.VISUAL_ID:
			return getClassifierAtom_4018IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (OntoUML.diagram.part.OntoUMLVisualIDRegistry.getVisualID(view)) {
		case OntoUML.diagram.edit.parts.CategoryEditPart.VISUAL_ID:
			return getCategory_2001OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.CollectiveEditPart.VISUAL_ID:
			return getCollective_2002OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.KindEditPart.VISUAL_ID:
			return getKind_2003OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.MixinEditPart.VISUAL_ID:
			return getMixin_2004OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.ModeEditPart.VISUAL_ID:
			return getMode_2005OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.PhaseEditPart.VISUAL_ID:
			return getPhase_2006OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.QuantityEditPart.VISUAL_ID:
			return getQuantity_2007OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.RelatorEditPart.VISUAL_ID:
			return getRelator_2008OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_2009OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.RoleMixinEditPart.VISUAL_ID:
			return getRoleMixin_2010OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.SimpleDatatypeEditPart.VISUAL_ID:
			return getSimpleDatatype_2011OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.StructuralDatatypeEditPart.VISUAL_ID:
			return getStructuralDatatype_2012OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.SubKindEditPart.VISUAL_ID:
			return getSubKind_2013OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.GeneralizationSetEditPart.VISUAL_ID:
			return getGeneralizationSet_2014OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.DerivationRuleEditPart.VISUAL_ID:
			return getDerivationRule_2015OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.PropertyEditPart.VISUAL_ID:
			return getProperty_2016OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.Property2EditPart.VISUAL_ID:
			return getProperty_3001OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.Property3EditPart.VISUAL_ID:
			return getProperty_3002OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.Property4EditPart.VISUAL_ID:
			return getProperty_3003OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.Property5EditPart.VISUAL_ID:
			return getProperty_3004OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.Property6EditPart.VISUAL_ID:
			return getProperty_3005OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.Property7EditPart.VISUAL_ID:
			return getProperty_3006OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.Property8EditPart.VISUAL_ID:
			return getProperty_3007OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.Property9EditPart.VISUAL_ID:
			return getProperty_3008OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.Property10EditPart.VISUAL_ID:
			return getProperty_3009OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.Property11EditPart.VISUAL_ID:
			return getProperty_3010OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.Property12EditPart.VISUAL_ID:
			return getProperty_3011OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.Property13EditPart.VISUAL_ID:
			return getProperty_3012OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.Property14EditPart.VISUAL_ID:
			return getProperty_3013OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.Property15EditPart.VISUAL_ID:
			return getProperty_3014OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.CharacterizationEditPart.VISUAL_ID:
			return getCharacterization_4001OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.ComponentOfEditPart.VISUAL_ID:
			return getComponentOf_4002OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.DatatypeAssociationEditPart.VISUAL_ID:
			return getDatatypeAssociation_4003OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.DerivationEditPart.VISUAL_ID:
			return getDerivation_4004OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.FormalAssociationEditPart.VISUAL_ID:
			return getFormalAssociation_4005OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4006OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.MaterialAssociationEditPart.VISUAL_ID:
			return getMaterialAssociation_4007OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.MediationEditPart.VISUAL_ID:
			return getMediation_4008OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.MemberOfEditPart.VISUAL_ID:
			return getMemberOf_4009OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.SubCollectionOfEditPart.VISUAL_ID:
			return getSubCollectionOf_4010OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.SubQuantityOfEditPart.VISUAL_ID:
			return getSubQuantityOf_4011OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.Property16EditPart.VISUAL_ID:
			return getProperty_4012OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.BinaryAssociationAtomEditPart.VISUAL_ID:
			return getBinaryAssociationAtom_4013OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.BinaryAssociationAtom2EditPart.VISUAL_ID:
			return getBinaryAssociationAtom_4014OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.BinaryAssociationAtom3EditPart.VISUAL_ID:
			return getBinaryAssociationAtom_4015OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.ClassifierAtomEditPart.VISUAL_ID:
			return getClassifierAtom_4016OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.ClassifierAtom2EditPart.VISUAL_ID:
			return getClassifierAtom_4017OutgoingLinks(view);
		case OntoUML.diagram.edit.parts.ClassifierAtom3EditPart.VISUAL_ID:
			return getClassifierAtom_4018OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getContainer_1000ContainedLinks(View view) {
		OntoUML.Container modelElement = (OntoUML.Container) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Property_4012(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_BinaryAssociationAtom_4013(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_BinaryAssociationAtom_4014(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_BinaryAssociationAtom_4015(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_ClassifierAtom_4016(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_ClassifierAtom_4017(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_ClassifierAtom_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCategory_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCollective_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getKind_2003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMixin_2004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMode_2005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPhase_2006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getQuantity_2007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRelator_2008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRole_2009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRoleMixin_2010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSimpleDatatype_2011ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStructuralDatatype_2012ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSubKind_2013ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGeneralizationSet_2014ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDerivationRule_2015ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_2016ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3011ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3012ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3013ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3014ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCharacterization_4001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getComponentOf_4002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDatatypeAssociation_4003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDerivation_4004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFormalAssociation_4005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGeneralization_4006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMaterialAssociation_4007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMediation_4008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMemberOf_4009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSubCollectionOf_4010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSubQuantityOf_4011ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_4012ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBinaryAssociationAtom_4013ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBinaryAssociationAtom_4014ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBinaryAssociationAtom_4015ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getClassifierAtom_4016ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getClassifierAtom_4017ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getClassifierAtom_4018ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCategory_2001IncomingLinks(View view) {
		OntoUML.Category modelElement = (OntoUML.Category) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4016(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCollective_2002IncomingLinks(View view) {
		OntoUML.Collective modelElement = (OntoUML.Collective) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4016(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getKind_2003IncomingLinks(View view) {
		OntoUML.Kind modelElement = (OntoUML.Kind) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4016(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMixin_2004IncomingLinks(View view) {
		OntoUML.Mixin modelElement = (OntoUML.Mixin) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4016(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMode_2005IncomingLinks(View view) {
		OntoUML.Mode modelElement = (OntoUML.Mode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4016(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPhase_2006IncomingLinks(View view) {
		OntoUML.Phase modelElement = (OntoUML.Phase) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4016(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getQuantity_2007IncomingLinks(View view) {
		OntoUML.Quantity modelElement = (OntoUML.Quantity) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4016(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRelator_2008IncomingLinks(View view) {
		OntoUML.Relator modelElement = (OntoUML.Relator) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4016(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRole_2009IncomingLinks(View view) {
		OntoUML.Role modelElement = (OntoUML.Role) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4016(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRoleMixin_2010IncomingLinks(View view) {
		OntoUML.RoleMixin modelElement = (OntoUML.RoleMixin) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4016(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSimpleDatatype_2011IncomingLinks(View view) {
		OntoUML.SimpleDatatype modelElement = (OntoUML.SimpleDatatype) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStructuralDatatype_2012IncomingLinks(View view) {
		OntoUML.StructuralDatatype modelElement = (OntoUML.StructuralDatatype) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSubKind_2013IncomingLinks(View view) {
		OntoUML.SubKind modelElement = (OntoUML.SubKind) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4016(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ClassifierAtom_4018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGeneralizationSet_2014IncomingLinks(View view) {
		OntoUML.GeneralizationSet modelElement = (OntoUML.GeneralizationSet) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDerivationRule_2015IncomingLinks(View view) {
		OntoUML.URML.DerivationRule modelElement = (OntoUML.URML.DerivationRule) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_2016IncomingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3001IncomingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3002IncomingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3003IncomingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3004IncomingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3005IncomingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3006IncomingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3007IncomingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3008IncomingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3009IncomingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3010IncomingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3011IncomingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3012IncomingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3013IncomingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3014IncomingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCharacterization_4001IncomingLinks(View view) {
		OntoUML.Characterization modelElement = (OntoUML.Characterization) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getComponentOf_4002IncomingLinks(View view) {
		OntoUML.componentOf modelElement = (OntoUML.componentOf) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDatatypeAssociation_4003IncomingLinks(View view) {
		OntoUML.DatatypeAssociation modelElement = (OntoUML.DatatypeAssociation) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_BinaryAssociationAtom_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_BinaryAssociationAtom_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_BinaryAssociationAtom_4015(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDerivation_4004IncomingLinks(View view) {
		OntoUML.Derivation modelElement = (OntoUML.Derivation) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFormalAssociation_4005IncomingLinks(View view) {
		OntoUML.FormalAssociation modelElement = (OntoUML.FormalAssociation) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_BinaryAssociationAtom_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_BinaryAssociationAtom_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_BinaryAssociationAtom_4015(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGeneralization_4006IncomingLinks(View view) {
		OntoUML.Generalization modelElement = (OntoUML.Generalization) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMaterialAssociation_4007IncomingLinks(View view) {
		OntoUML.MaterialAssociation modelElement = (OntoUML.MaterialAssociation) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_BinaryAssociationAtom_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_BinaryAssociationAtom_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_BinaryAssociationAtom_4015(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMediation_4008IncomingLinks(View view) {
		OntoUML.Mediation modelElement = (OntoUML.Mediation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMemberOf_4009IncomingLinks(View view) {
		OntoUML.memberOf modelElement = (OntoUML.memberOf) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSubCollectionOf_4010IncomingLinks(View view) {
		OntoUML.subCollectionOf modelElement = (OntoUML.subCollectionOf) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSubQuantityOf_4011IncomingLinks(View view) {
		OntoUML.subQuantityOf modelElement = (OntoUML.subQuantityOf) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_4012IncomingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBinaryAssociationAtom_4013IncomingLinks(View view) {
		OntoUML.URML.BinaryAssociationAtom modelElement = (OntoUML.URML.BinaryAssociationAtom) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBinaryAssociationAtom_4014IncomingLinks(View view) {
		OntoUML.URML.BinaryAssociationAtom modelElement = (OntoUML.URML.BinaryAssociationAtom) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBinaryAssociationAtom_4015IncomingLinks(View view) {
		OntoUML.URML.BinaryAssociationAtom modelElement = (OntoUML.URML.BinaryAssociationAtom) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassifierAtom_4016IncomingLinks(View view) {
		OntoUML.URML.ClassifierAtom modelElement = (OntoUML.URML.ClassifierAtom) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassifierAtom_4017IncomingLinks(View view) {
		OntoUML.URML.ClassifierAtom modelElement = (OntoUML.URML.ClassifierAtom) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassifierAtom_4018IncomingLinks(View view) {
		OntoUML.URML.ClassifierAtom modelElement = (OntoUML.URML.ClassifierAtom) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_componentOf_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derivation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FormalAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mediation_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_memberOf_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subCollectionOf_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_subQuantityOf_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCategory_2001OutgoingLinks(View view) {
		OntoUML.Category modelElement = (OntoUML.Category) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCollective_2002OutgoingLinks(View view) {
		OntoUML.Collective modelElement = (OntoUML.Collective) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getKind_2003OutgoingLinks(View view) {
		OntoUML.Kind modelElement = (OntoUML.Kind) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMixin_2004OutgoingLinks(View view) {
		OntoUML.Mixin modelElement = (OntoUML.Mixin) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMode_2005OutgoingLinks(View view) {
		OntoUML.Mode modelElement = (OntoUML.Mode) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPhase_2006OutgoingLinks(View view) {
		OntoUML.Phase modelElement = (OntoUML.Phase) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getQuantity_2007OutgoingLinks(View view) {
		OntoUML.Quantity modelElement = (OntoUML.Quantity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRelator_2008OutgoingLinks(View view) {
		OntoUML.Relator modelElement = (OntoUML.Relator) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRole_2009OutgoingLinks(View view) {
		OntoUML.Role modelElement = (OntoUML.Role) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRoleMixin_2010OutgoingLinks(View view) {
		OntoUML.RoleMixin modelElement = (OntoUML.RoleMixin) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSimpleDatatype_2011OutgoingLinks(View view) {
		OntoUML.SimpleDatatype modelElement = (OntoUML.SimpleDatatype) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStructuralDatatype_2012OutgoingLinks(View view) {
		OntoUML.StructuralDatatype modelElement = (OntoUML.StructuralDatatype) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSubKind_2013OutgoingLinks(View view) {
		OntoUML.SubKind modelElement = (OntoUML.SubKind) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGeneralizationSet_2014OutgoingLinks(View view) {
		OntoUML.GeneralizationSet modelElement = (OntoUML.GeneralizationSet) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDerivationRule_2015OutgoingLinks(View view) {
		OntoUML.URML.DerivationRule modelElement = (OntoUML.URML.DerivationRule) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BinaryAssociationAtom_4013(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BinaryAssociationAtom_4014(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BinaryAssociationAtom_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_ClassifierAtom_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_ClassifierAtom_4017(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_ClassifierAtom_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_2016OutgoingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Property_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3001OutgoingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Property_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3002OutgoingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Property_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3003OutgoingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Property_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3004OutgoingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Property_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3005OutgoingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Property_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3006OutgoingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Property_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3007OutgoingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Property_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3008OutgoingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Property_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3009OutgoingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Property_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3010OutgoingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Property_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3011OutgoingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Property_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3012OutgoingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Property_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3013OutgoingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Property_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3014OutgoingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Property_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCharacterization_4001OutgoingLinks(View view) {
		OntoUML.Characterization modelElement = (OntoUML.Characterization) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getComponentOf_4002OutgoingLinks(View view) {
		OntoUML.componentOf modelElement = (OntoUML.componentOf) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDatatypeAssociation_4003OutgoingLinks(View view) {
		OntoUML.DatatypeAssociation modelElement = (OntoUML.DatatypeAssociation) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDerivation_4004OutgoingLinks(View view) {
		OntoUML.Derivation modelElement = (OntoUML.Derivation) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFormalAssociation_4005OutgoingLinks(View view) {
		OntoUML.FormalAssociation modelElement = (OntoUML.FormalAssociation) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGeneralization_4006OutgoingLinks(View view) {
		OntoUML.Generalization modelElement = (OntoUML.Generalization) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMaterialAssociation_4007OutgoingLinks(View view) {
		OntoUML.MaterialAssociation modelElement = (OntoUML.MaterialAssociation) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMediation_4008OutgoingLinks(View view) {
		OntoUML.Mediation modelElement = (OntoUML.Mediation) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMemberOf_4009OutgoingLinks(View view) {
		OntoUML.memberOf modelElement = (OntoUML.memberOf) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSubCollectionOf_4010OutgoingLinks(View view) {
		OntoUML.subCollectionOf modelElement = (OntoUML.subCollectionOf) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSubQuantityOf_4011OutgoingLinks(View view) {
		OntoUML.subQuantityOf modelElement = (OntoUML.subQuantityOf) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_4012OutgoingLinks(View view) {
		OntoUML.Property modelElement = (OntoUML.Property) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Property_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBinaryAssociationAtom_4013OutgoingLinks(View view) {
		OntoUML.URML.BinaryAssociationAtom modelElement = (OntoUML.URML.BinaryAssociationAtom) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBinaryAssociationAtom_4014OutgoingLinks(View view) {
		OntoUML.URML.BinaryAssociationAtom modelElement = (OntoUML.URML.BinaryAssociationAtom) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBinaryAssociationAtom_4015OutgoingLinks(View view) {
		OntoUML.URML.BinaryAssociationAtom modelElement = (OntoUML.URML.BinaryAssociationAtom) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassifierAtom_4016OutgoingLinks(View view) {
		OntoUML.URML.ClassifierAtom modelElement = (OntoUML.URML.ClassifierAtom) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassifierAtom_4017OutgoingLinks(View view) {
		OntoUML.URML.ClassifierAtom modelElement = (OntoUML.URML.ClassifierAtom) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassifierAtom_4018OutgoingLinks(View view) {
		OntoUML.URML.ClassifierAtom modelElement = (OntoUML.URML.ClassifierAtom) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Characterization_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_componentOf_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Derivation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_FormalAssociation_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Generalization_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Mediation_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_memberOf_4009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subCollectionOf_4010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_subQuantityOf_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Characterization_4001(
			OntoUML.Container container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.Characterization) {
				continue;
			}
			OntoUML.Characterization link = (OntoUML.Characterization) linkObject;
			if (OntoUML.diagram.edit.parts.CharacterizationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTargetAux1();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element dst = (OntoUML.Element) theTarget;
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.Characterization_4001,
							OntoUML.diagram.edit.parts.CharacterizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_componentOf_4002(
			OntoUML.Container container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.componentOf) {
				continue;
			}
			OntoUML.componentOf link = (OntoUML.componentOf) linkObject;
			if (OntoUML.diagram.edit.parts.ComponentOfEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTargetAux1();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element dst = (OntoUML.Element) theTarget;
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.ComponentOf_4002,
							OntoUML.diagram.edit.parts.ComponentOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_DatatypeAssociation_4003(
			OntoUML.Container container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.DatatypeAssociation) {
				continue;
			}
			OntoUML.DatatypeAssociation link = (OntoUML.DatatypeAssociation) linkObject;
			if (OntoUML.diagram.edit.parts.DatatypeAssociationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getAssociationEndAux2();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Type) {
				continue;
			}
			OntoUML.Type dst = (OntoUML.Type) theTarget;
			List sources = link.getAssociationEndAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Type) {
				continue;
			}
			OntoUML.Type src = (OntoUML.Type) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.DatatypeAssociation_4003,
							OntoUML.diagram.edit.parts.DatatypeAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Derivation_4004(
			OntoUML.Container container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.Derivation) {
				continue;
			}
			OntoUML.Derivation link = (OntoUML.Derivation) linkObject;
			if (OntoUML.diagram.edit.parts.DerivationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTargetAux1();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element dst = (OntoUML.Element) theTarget;
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.Derivation_4004,
							OntoUML.diagram.edit.parts.DerivationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_FormalAssociation_4005(
			OntoUML.Container container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.FormalAssociation) {
				continue;
			}
			OntoUML.FormalAssociation link = (OntoUML.FormalAssociation) linkObject;
			if (OntoUML.diagram.edit.parts.FormalAssociationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getAssociationEndAux2();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Type) {
				continue;
			}
			OntoUML.Type dst = (OntoUML.Type) theTarget;
			List sources = link.getAssociationEndAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Type) {
				continue;
			}
			OntoUML.Type src = (OntoUML.Type) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.FormalAssociation_4005,
							OntoUML.diagram.edit.parts.FormalAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Generalization_4006(
			OntoUML.Container container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.Generalization) {
				continue;
			}
			OntoUML.Generalization link = (OntoUML.Generalization) linkObject;
			if (OntoUML.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getSource();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element dst = (OntoUML.Element) theTarget;
			List sources = link.getTarget();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.Generalization_4006,
							OntoUML.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_MaterialAssociation_4007(
			OntoUML.Container container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.MaterialAssociation) {
				continue;
			}
			OntoUML.MaterialAssociation link = (OntoUML.MaterialAssociation) linkObject;
			if (OntoUML.diagram.edit.parts.MaterialAssociationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getAssociationEndAux2();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Type) {
				continue;
			}
			OntoUML.Type dst = (OntoUML.Type) theTarget;
			List sources = link.getAssociationEndAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Type) {
				continue;
			}
			OntoUML.Type src = (OntoUML.Type) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.MaterialAssociation_4007,
							OntoUML.diagram.edit.parts.MaterialAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Mediation_4008(
			OntoUML.Container container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.Mediation) {
				continue;
			}
			OntoUML.Mediation link = (OntoUML.Mediation) linkObject;
			if (OntoUML.diagram.edit.parts.MediationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTargetAux1();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element dst = (OntoUML.Element) theTarget;
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.Mediation_4008,
							OntoUML.diagram.edit.parts.MediationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_memberOf_4009(
			OntoUML.Container container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.memberOf) {
				continue;
			}
			OntoUML.memberOf link = (OntoUML.memberOf) linkObject;
			if (OntoUML.diagram.edit.parts.MemberOfEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTargetAux1();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element dst = (OntoUML.Element) theTarget;
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.MemberOf_4009,
							OntoUML.diagram.edit.parts.MemberOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_subCollectionOf_4010(
			OntoUML.Container container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.subCollectionOf) {
				continue;
			}
			OntoUML.subCollectionOf link = (OntoUML.subCollectionOf) linkObject;
			if (OntoUML.diagram.edit.parts.SubCollectionOfEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTargetAux1();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element dst = (OntoUML.Element) theTarget;
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.SubCollectionOf_4010,
							OntoUML.diagram.edit.parts.SubCollectionOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_subQuantityOf_4011(
			OntoUML.Container container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.subQuantityOf) {
				continue;
			}
			OntoUML.subQuantityOf link = (OntoUML.subQuantityOf) linkObject;
			if (OntoUML.diagram.edit.parts.SubQuantityOfEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTargetAux1();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element dst = (OntoUML.Element) theTarget;
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.SubQuantityOf_4011,
							OntoUML.diagram.edit.parts.SubQuantityOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Property_4012(
			OntoUML.Container container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.Property) {
				continue;
			}
			OntoUML.Property link = (OntoUML.Property) linkObject;
			if (OntoUML.diagram.edit.parts.Property16EditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.DirectedBinaryRelationship dst = link.getSource();
			OntoUML.Property src = link.getAux();
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.Property_4012,
							OntoUML.diagram.edit.parts.Property16EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_BinaryAssociationAtom_4013(
			OntoUML.Container container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.URML.BinaryAssociationAtom) {
				continue;
			}
			OntoUML.URML.BinaryAssociationAtom link = (OntoUML.URML.BinaryAssociationAtom) linkObject;
			if (OntoUML.diagram.edit.parts.BinaryAssociationAtomEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.Association dst = link.getAssociation();
			OntoUML.URML.Rule src = link.getConditionRule();
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.BinaryAssociationAtom_4013,
							OntoUML.diagram.edit.parts.BinaryAssociationAtomEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_BinaryAssociationAtom_4014(
			OntoUML.Container container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.URML.BinaryAssociationAtom) {
				continue;
			}
			OntoUML.URML.BinaryAssociationAtom link = (OntoUML.URML.BinaryAssociationAtom) linkObject;
			if (OntoUML.diagram.edit.parts.BinaryAssociationAtom2EditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.Association dst = link.getAssociation();
			OntoUML.URML.Rule src = link.getConditionRule();
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.BinaryAssociationAtom_4014,
							OntoUML.diagram.edit.parts.BinaryAssociationAtom2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_BinaryAssociationAtom_4015(
			OntoUML.Container container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.URML.BinaryAssociationAtom) {
				continue;
			}
			OntoUML.URML.BinaryAssociationAtom link = (OntoUML.URML.BinaryAssociationAtom) linkObject;
			if (OntoUML.diagram.edit.parts.BinaryAssociationAtom3EditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.Association dst = link.getAssociation();
			OntoUML.URML.DerivationRule src = link.getConclusionRule();
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.BinaryAssociationAtom_4015,
							OntoUML.diagram.edit.parts.BinaryAssociationAtom3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_ClassifierAtom_4016(
			OntoUML.Container container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.URML.ClassifierAtom) {
				continue;
			}
			OntoUML.URML.ClassifierAtom link = (OntoUML.URML.ClassifierAtom) linkObject;
			if (OntoUML.diagram.edit.parts.ClassifierAtomEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.Class dst = link.getClass_();
			OntoUML.URML.Rule src = link.getConditionRule();
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.ClassifierAtom_4016,
							OntoUML.diagram.edit.parts.ClassifierAtomEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_ClassifierAtom_4017(
			OntoUML.Container container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.URML.ClassifierAtom) {
				continue;
			}
			OntoUML.URML.ClassifierAtom link = (OntoUML.URML.ClassifierAtom) linkObject;
			if (OntoUML.diagram.edit.parts.ClassifierAtom2EditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.Class dst = link.getClass_();
			OntoUML.URML.Rule src = link.getConditionRule();
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.ClassifierAtom_4017,
							OntoUML.diagram.edit.parts.ClassifierAtom2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_ClassifierAtom_4018(
			OntoUML.Container container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.URML.ClassifierAtom) {
				continue;
			}
			OntoUML.URML.ClassifierAtom link = (OntoUML.URML.ClassifierAtom) linkObject;
			if (OntoUML.diagram.edit.parts.ClassifierAtom3EditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.Class dst = link.getClass_();
			OntoUML.URML.DerivationRule src = link.getConclusionRule();
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.ClassifierAtom_4018,
							OntoUML.diagram.edit.parts.ClassifierAtom3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Characterization_4001(
			OntoUML.Element target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OntoUML.OntoUMLPackage.eINSTANCE
					.getDirectedRelationship_TargetAux1()
					|| false == setting.getEObject() instanceof OntoUML.Characterization) {
				continue;
			}
			OntoUML.Characterization link = (OntoUML.Characterization) setting
					.getEObject();
			if (OntoUML.diagram.edit.parts.CharacterizationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							target,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.Characterization_4001,
							OntoUML.diagram.edit.parts.CharacterizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_componentOf_4002(
			OntoUML.Element target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OntoUML.OntoUMLPackage.eINSTANCE
					.getDirectedRelationship_TargetAux1()
					|| false == setting.getEObject() instanceof OntoUML.componentOf) {
				continue;
			}
			OntoUML.componentOf link = (OntoUML.componentOf) setting
					.getEObject();
			if (OntoUML.diagram.edit.parts.ComponentOfEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							target,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.ComponentOf_4002,
							OntoUML.diagram.edit.parts.ComponentOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_DatatypeAssociation_4003(
			OntoUML.Type target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OntoUML.OntoUMLPackage.eINSTANCE
					.getAssociation_AssociationEndAux2()
					|| false == setting.getEObject() instanceof OntoUML.DatatypeAssociation) {
				continue;
			}
			OntoUML.DatatypeAssociation link = (OntoUML.DatatypeAssociation) setting
					.getEObject();
			if (OntoUML.diagram.edit.parts.DatatypeAssociationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getAssociationEndAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Type) {
				continue;
			}
			OntoUML.Type src = (OntoUML.Type) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							target,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.DatatypeAssociation_4003,
							OntoUML.diagram.edit.parts.DatatypeAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Derivation_4004(
			OntoUML.Element target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OntoUML.OntoUMLPackage.eINSTANCE
					.getDirectedRelationship_TargetAux1()
					|| false == setting.getEObject() instanceof OntoUML.Derivation) {
				continue;
			}
			OntoUML.Derivation link = (OntoUML.Derivation) setting.getEObject();
			if (OntoUML.diagram.edit.parts.DerivationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							target,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.Derivation_4004,
							OntoUML.diagram.edit.parts.DerivationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_FormalAssociation_4005(
			OntoUML.Type target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OntoUML.OntoUMLPackage.eINSTANCE
					.getAssociation_AssociationEndAux2()
					|| false == setting.getEObject() instanceof OntoUML.FormalAssociation) {
				continue;
			}
			OntoUML.FormalAssociation link = (OntoUML.FormalAssociation) setting
					.getEObject();
			if (OntoUML.diagram.edit.parts.FormalAssociationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getAssociationEndAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Type) {
				continue;
			}
			OntoUML.Type src = (OntoUML.Type) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							target,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.FormalAssociation_4005,
							OntoUML.diagram.edit.parts.FormalAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Generalization_4006(
			OntoUML.Element target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OntoUML.OntoUMLPackage.eINSTANCE
					.getDirectedRelationship_Source()
					|| false == setting.getEObject() instanceof OntoUML.Generalization) {
				continue;
			}
			OntoUML.Generalization link = (OntoUML.Generalization) setting
					.getEObject();
			if (OntoUML.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getTarget();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							target,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.Generalization_4006,
							OntoUML.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_MaterialAssociation_4007(
			OntoUML.Type target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OntoUML.OntoUMLPackage.eINSTANCE
					.getAssociation_AssociationEndAux2()
					|| false == setting.getEObject() instanceof OntoUML.MaterialAssociation) {
				continue;
			}
			OntoUML.MaterialAssociation link = (OntoUML.MaterialAssociation) setting
					.getEObject();
			if (OntoUML.diagram.edit.parts.MaterialAssociationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getAssociationEndAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Type) {
				continue;
			}
			OntoUML.Type src = (OntoUML.Type) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							target,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.MaterialAssociation_4007,
							OntoUML.diagram.edit.parts.MaterialAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Mediation_4008(
			OntoUML.Element target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OntoUML.OntoUMLPackage.eINSTANCE
					.getDirectedRelationship_TargetAux1()
					|| false == setting.getEObject() instanceof OntoUML.Mediation) {
				continue;
			}
			OntoUML.Mediation link = (OntoUML.Mediation) setting.getEObject();
			if (OntoUML.diagram.edit.parts.MediationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							target,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.Mediation_4008,
							OntoUML.diagram.edit.parts.MediationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_memberOf_4009(
			OntoUML.Element target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OntoUML.OntoUMLPackage.eINSTANCE
					.getDirectedRelationship_TargetAux1()
					|| false == setting.getEObject() instanceof OntoUML.memberOf) {
				continue;
			}
			OntoUML.memberOf link = (OntoUML.memberOf) setting.getEObject();
			if (OntoUML.diagram.edit.parts.MemberOfEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							target,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.MemberOf_4009,
							OntoUML.diagram.edit.parts.MemberOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_subCollectionOf_4010(
			OntoUML.Element target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OntoUML.OntoUMLPackage.eINSTANCE
					.getDirectedRelationship_TargetAux1()
					|| false == setting.getEObject() instanceof OntoUML.subCollectionOf) {
				continue;
			}
			OntoUML.subCollectionOf link = (OntoUML.subCollectionOf) setting
					.getEObject();
			if (OntoUML.diagram.edit.parts.SubCollectionOfEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							target,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.SubCollectionOf_4010,
							OntoUML.diagram.edit.parts.SubCollectionOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_subQuantityOf_4011(
			OntoUML.Element target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OntoUML.OntoUMLPackage.eINSTANCE
					.getDirectedRelationship_TargetAux1()
					|| false == setting.getEObject() instanceof OntoUML.subQuantityOf) {
				continue;
			}
			OntoUML.subQuantityOf link = (OntoUML.subQuantityOf) setting
					.getEObject();
			if (OntoUML.diagram.edit.parts.SubQuantityOfEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							target,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.SubQuantityOf_4011,
							OntoUML.diagram.edit.parts.SubQuantityOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Property_4012(
			OntoUML.DirectedBinaryRelationship target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OntoUML.OntoUMLPackage.eINSTANCE
					.getProperty_Source()
					|| false == setting.getEObject() instanceof OntoUML.Property) {
				continue;
			}
			OntoUML.Property link = (OntoUML.Property) setting.getEObject();
			if (OntoUML.diagram.edit.parts.Property16EditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.Property src = link.getAux();
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							target,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.Property_4012,
							OntoUML.diagram.edit.parts.Property16EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_BinaryAssociationAtom_4013(
			OntoUML.Association target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OntoUML.URML.URMLPackage.eINSTANCE
					.getBinaryAssociationAtom_Association()
					|| false == setting.getEObject() instanceof OntoUML.URML.BinaryAssociationAtom) {
				continue;
			}
			OntoUML.URML.BinaryAssociationAtom link = (OntoUML.URML.BinaryAssociationAtom) setting
					.getEObject();
			if (OntoUML.diagram.edit.parts.BinaryAssociationAtomEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.URML.Rule src = link.getConditionRule();
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							target,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.BinaryAssociationAtom_4013,
							OntoUML.diagram.edit.parts.BinaryAssociationAtomEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_BinaryAssociationAtom_4014(
			OntoUML.Association target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OntoUML.URML.URMLPackage.eINSTANCE
					.getBinaryAssociationAtom_Association()
					|| false == setting.getEObject() instanceof OntoUML.URML.BinaryAssociationAtom) {
				continue;
			}
			OntoUML.URML.BinaryAssociationAtom link = (OntoUML.URML.BinaryAssociationAtom) setting
					.getEObject();
			if (OntoUML.diagram.edit.parts.BinaryAssociationAtom2EditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.URML.Rule src = link.getConditionRule();
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							target,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.BinaryAssociationAtom_4014,
							OntoUML.diagram.edit.parts.BinaryAssociationAtom2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_BinaryAssociationAtom_4015(
			OntoUML.Association target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OntoUML.URML.URMLPackage.eINSTANCE
					.getBinaryAssociationAtom_Association()
					|| false == setting.getEObject() instanceof OntoUML.URML.BinaryAssociationAtom) {
				continue;
			}
			OntoUML.URML.BinaryAssociationAtom link = (OntoUML.URML.BinaryAssociationAtom) setting
					.getEObject();
			if (OntoUML.diagram.edit.parts.BinaryAssociationAtom3EditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.URML.DerivationRule src = link.getConclusionRule();
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							target,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.BinaryAssociationAtom_4015,
							OntoUML.diagram.edit.parts.BinaryAssociationAtom3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_ClassifierAtom_4016(
			OntoUML.Class target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OntoUML.URML.URMLPackage.eINSTANCE
					.getClassifierAtom_Class()
					|| false == setting.getEObject() instanceof OntoUML.URML.ClassifierAtom) {
				continue;
			}
			OntoUML.URML.ClassifierAtom link = (OntoUML.URML.ClassifierAtom) setting
					.getEObject();
			if (OntoUML.diagram.edit.parts.ClassifierAtomEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.URML.Rule src = link.getConditionRule();
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							target,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.ClassifierAtom_4016,
							OntoUML.diagram.edit.parts.ClassifierAtomEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_ClassifierAtom_4017(
			OntoUML.Class target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OntoUML.URML.URMLPackage.eINSTANCE
					.getClassifierAtom_Class()
					|| false == setting.getEObject() instanceof OntoUML.URML.ClassifierAtom) {
				continue;
			}
			OntoUML.URML.ClassifierAtom link = (OntoUML.URML.ClassifierAtom) setting
					.getEObject();
			if (OntoUML.diagram.edit.parts.ClassifierAtom2EditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.URML.Rule src = link.getConditionRule();
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							target,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.ClassifierAtom_4017,
							OntoUML.diagram.edit.parts.ClassifierAtom2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_ClassifierAtom_4018(
			OntoUML.Class target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OntoUML.URML.URMLPackage.eINSTANCE
					.getClassifierAtom_Class()
					|| false == setting.getEObject() instanceof OntoUML.URML.ClassifierAtom) {
				continue;
			}
			OntoUML.URML.ClassifierAtom link = (OntoUML.URML.ClassifierAtom) setting
					.getEObject();
			if (OntoUML.diagram.edit.parts.ClassifierAtom3EditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.URML.DerivationRule src = link.getConclusionRule();
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							target,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.ClassifierAtom_4018,
							OntoUML.diagram.edit.parts.ClassifierAtom3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Characterization_4001(
			OntoUML.Element source) {
		OntoUML.Container container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OntoUML.Container) {
				container = (OntoUML.Container) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.Characterization) {
				continue;
			}
			OntoUML.Characterization link = (OntoUML.Characterization) linkObject;
			if (OntoUML.diagram.edit.parts.CharacterizationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTargetAux1();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element dst = (OntoUML.Element) theTarget;
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			if (src != source) {
				continue;
			}
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.Characterization_4001,
							OntoUML.diagram.edit.parts.CharacterizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_componentOf_4002(
			OntoUML.Element source) {
		OntoUML.Container container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OntoUML.Container) {
				container = (OntoUML.Container) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.componentOf) {
				continue;
			}
			OntoUML.componentOf link = (OntoUML.componentOf) linkObject;
			if (OntoUML.diagram.edit.parts.ComponentOfEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTargetAux1();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element dst = (OntoUML.Element) theTarget;
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			if (src != source) {
				continue;
			}
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.ComponentOf_4002,
							OntoUML.diagram.edit.parts.ComponentOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_DatatypeAssociation_4003(
			OntoUML.Type source) {
		OntoUML.Container container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OntoUML.Container) {
				container = (OntoUML.Container) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.DatatypeAssociation) {
				continue;
			}
			OntoUML.DatatypeAssociation link = (OntoUML.DatatypeAssociation) linkObject;
			if (OntoUML.diagram.edit.parts.DatatypeAssociationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getAssociationEndAux2();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Type) {
				continue;
			}
			OntoUML.Type dst = (OntoUML.Type) theTarget;
			List sources = link.getAssociationEndAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Type) {
				continue;
			}
			OntoUML.Type src = (OntoUML.Type) theSource;
			if (src != source) {
				continue;
			}
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.DatatypeAssociation_4003,
							OntoUML.diagram.edit.parts.DatatypeAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Derivation_4004(
			OntoUML.Element source) {
		OntoUML.Container container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OntoUML.Container) {
				container = (OntoUML.Container) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.Derivation) {
				continue;
			}
			OntoUML.Derivation link = (OntoUML.Derivation) linkObject;
			if (OntoUML.diagram.edit.parts.DerivationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTargetAux1();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element dst = (OntoUML.Element) theTarget;
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			if (src != source) {
				continue;
			}
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.Derivation_4004,
							OntoUML.diagram.edit.parts.DerivationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_FormalAssociation_4005(
			OntoUML.Type source) {
		OntoUML.Container container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OntoUML.Container) {
				container = (OntoUML.Container) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.FormalAssociation) {
				continue;
			}
			OntoUML.FormalAssociation link = (OntoUML.FormalAssociation) linkObject;
			if (OntoUML.diagram.edit.parts.FormalAssociationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getAssociationEndAux2();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Type) {
				continue;
			}
			OntoUML.Type dst = (OntoUML.Type) theTarget;
			List sources = link.getAssociationEndAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Type) {
				continue;
			}
			OntoUML.Type src = (OntoUML.Type) theSource;
			if (src != source) {
				continue;
			}
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.FormalAssociation_4005,
							OntoUML.diagram.edit.parts.FormalAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Generalization_4006(
			OntoUML.Element source) {
		OntoUML.Container container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OntoUML.Container) {
				container = (OntoUML.Container) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.Generalization) {
				continue;
			}
			OntoUML.Generalization link = (OntoUML.Generalization) linkObject;
			if (OntoUML.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getSource();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element dst = (OntoUML.Element) theTarget;
			List sources = link.getTarget();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			if (src != source) {
				continue;
			}
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.Generalization_4006,
							OntoUML.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_MaterialAssociation_4007(
			OntoUML.Type source) {
		OntoUML.Container container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OntoUML.Container) {
				container = (OntoUML.Container) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.MaterialAssociation) {
				continue;
			}
			OntoUML.MaterialAssociation link = (OntoUML.MaterialAssociation) linkObject;
			if (OntoUML.diagram.edit.parts.MaterialAssociationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getAssociationEndAux2();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Type) {
				continue;
			}
			OntoUML.Type dst = (OntoUML.Type) theTarget;
			List sources = link.getAssociationEndAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Type) {
				continue;
			}
			OntoUML.Type src = (OntoUML.Type) theSource;
			if (src != source) {
				continue;
			}
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.MaterialAssociation_4007,
							OntoUML.diagram.edit.parts.MaterialAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Mediation_4008(
			OntoUML.Element source) {
		OntoUML.Container container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OntoUML.Container) {
				container = (OntoUML.Container) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.Mediation) {
				continue;
			}
			OntoUML.Mediation link = (OntoUML.Mediation) linkObject;
			if (OntoUML.diagram.edit.parts.MediationEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTargetAux1();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element dst = (OntoUML.Element) theTarget;
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			if (src != source) {
				continue;
			}
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.Mediation_4008,
							OntoUML.diagram.edit.parts.MediationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_memberOf_4009(
			OntoUML.Element source) {
		OntoUML.Container container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OntoUML.Container) {
				container = (OntoUML.Container) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.memberOf) {
				continue;
			}
			OntoUML.memberOf link = (OntoUML.memberOf) linkObject;
			if (OntoUML.diagram.edit.parts.MemberOfEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTargetAux1();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element dst = (OntoUML.Element) theTarget;
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			if (src != source) {
				continue;
			}
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.MemberOf_4009,
							OntoUML.diagram.edit.parts.MemberOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_subCollectionOf_4010(
			OntoUML.Element source) {
		OntoUML.Container container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OntoUML.Container) {
				container = (OntoUML.Container) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.subCollectionOf) {
				continue;
			}
			OntoUML.subCollectionOf link = (OntoUML.subCollectionOf) linkObject;
			if (OntoUML.diagram.edit.parts.SubCollectionOfEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTargetAux1();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element dst = (OntoUML.Element) theTarget;
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			if (src != source) {
				continue;
			}
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.SubCollectionOf_4010,
							OntoUML.diagram.edit.parts.SubCollectionOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_subQuantityOf_4011(
			OntoUML.Element source) {
		OntoUML.Container container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OntoUML.Container) {
				container = (OntoUML.Container) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.subQuantityOf) {
				continue;
			}
			OntoUML.subQuantityOf link = (OntoUML.subQuantityOf) linkObject;
			if (OntoUML.diagram.edit.parts.SubQuantityOfEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTargetAux1();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element dst = (OntoUML.Element) theTarget;
			List sources = link.getSourceAux1();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof OntoUML.Element) {
				continue;
			}
			OntoUML.Element src = (OntoUML.Element) theSource;
			if (src != source) {
				continue;
			}
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.SubQuantityOf_4011,
							OntoUML.diagram.edit.parts.SubQuantityOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Property_4012(
			OntoUML.Property source) {
		OntoUML.Container container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OntoUML.Container) {
				container = (OntoUML.Container) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.Property) {
				continue;
			}
			OntoUML.Property link = (OntoUML.Property) linkObject;
			if (OntoUML.diagram.edit.parts.Property16EditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.DirectedBinaryRelationship dst = link.getSource();
			OntoUML.Property src = link.getAux();
			if (src != source) {
				continue;
			}
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.Property_4012,
							OntoUML.diagram.edit.parts.Property16EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_BinaryAssociationAtom_4013(
			OntoUML.URML.Rule source) {
		OntoUML.Container container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OntoUML.Container) {
				container = (OntoUML.Container) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.URML.BinaryAssociationAtom) {
				continue;
			}
			OntoUML.URML.BinaryAssociationAtom link = (OntoUML.URML.BinaryAssociationAtom) linkObject;
			if (OntoUML.diagram.edit.parts.BinaryAssociationAtomEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.Association dst = link.getAssociation();
			OntoUML.URML.Rule src = link.getConditionRule();
			if (src != source) {
				continue;
			}
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.BinaryAssociationAtom_4013,
							OntoUML.diagram.edit.parts.BinaryAssociationAtomEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_BinaryAssociationAtom_4014(
			OntoUML.URML.Rule source) {
		OntoUML.Container container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OntoUML.Container) {
				container = (OntoUML.Container) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.URML.BinaryAssociationAtom) {
				continue;
			}
			OntoUML.URML.BinaryAssociationAtom link = (OntoUML.URML.BinaryAssociationAtom) linkObject;
			if (OntoUML.diagram.edit.parts.BinaryAssociationAtom2EditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.Association dst = link.getAssociation();
			OntoUML.URML.Rule src = link.getConditionRule();
			if (src != source) {
				continue;
			}
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.BinaryAssociationAtom_4014,
							OntoUML.diagram.edit.parts.BinaryAssociationAtom2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_BinaryAssociationAtom_4015(
			OntoUML.URML.DerivationRule source) {
		OntoUML.Container container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OntoUML.Container) {
				container = (OntoUML.Container) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.URML.BinaryAssociationAtom) {
				continue;
			}
			OntoUML.URML.BinaryAssociationAtom link = (OntoUML.URML.BinaryAssociationAtom) linkObject;
			if (OntoUML.diagram.edit.parts.BinaryAssociationAtom3EditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.Association dst = link.getAssociation();
			OntoUML.URML.DerivationRule src = link.getConclusionRule();
			if (src != source) {
				continue;
			}
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.BinaryAssociationAtom_4015,
							OntoUML.diagram.edit.parts.BinaryAssociationAtom3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_ClassifierAtom_4016(
			OntoUML.URML.Rule source) {
		OntoUML.Container container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OntoUML.Container) {
				container = (OntoUML.Container) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.URML.ClassifierAtom) {
				continue;
			}
			OntoUML.URML.ClassifierAtom link = (OntoUML.URML.ClassifierAtom) linkObject;
			if (OntoUML.diagram.edit.parts.ClassifierAtomEditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.Class dst = link.getClass_();
			OntoUML.URML.Rule src = link.getConditionRule();
			if (src != source) {
				continue;
			}
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.ClassifierAtom_4016,
							OntoUML.diagram.edit.parts.ClassifierAtomEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_ClassifierAtom_4017(
			OntoUML.URML.Rule source) {
		OntoUML.Container container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OntoUML.Container) {
				container = (OntoUML.Container) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.URML.ClassifierAtom) {
				continue;
			}
			OntoUML.URML.ClassifierAtom link = (OntoUML.URML.ClassifierAtom) linkObject;
			if (OntoUML.diagram.edit.parts.ClassifierAtom2EditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.Class dst = link.getClass_();
			OntoUML.URML.Rule src = link.getConditionRule();
			if (src != source) {
				continue;
			}
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.ClassifierAtom_4017,
							OntoUML.diagram.edit.parts.ClassifierAtom2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_ClassifierAtom_4018(
			OntoUML.URML.DerivationRule source) {
		OntoUML.Container container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OntoUML.Container) {
				container = (OntoUML.Container) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getInstanciarElement().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OntoUML.URML.ClassifierAtom) {
				continue;
			}
			OntoUML.URML.ClassifierAtom link = (OntoUML.URML.ClassifierAtom) linkObject;
			if (OntoUML.diagram.edit.parts.ClassifierAtom3EditPart.VISUAL_ID != OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OntoUML.Class dst = link.getClass_();
			OntoUML.URML.DerivationRule src = link.getConclusionRule();
			if (src != source) {
				continue;
			}
			result
					.add(new OntoUML.diagram.part.OntoUMLLinkDescriptor(
							src,
							dst,
							link,
							OntoUML.diagram.providers.OntoUMLElementTypes.ClassifierAtom_4018,
							OntoUML.diagram.edit.parts.ClassifierAtom3EditPart.VISUAL_ID));
		}
		return result;
	}

}
