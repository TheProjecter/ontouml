package OntoUML.diagram.sheet;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AdvancedPropertySection;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

import OntoUML.Association;
import OntoUML.DirectedRelationship;
import OntoUML.Property;
import OntoUML.diagram.edit.parts.CharacterizationSourcePropertyCardinaliEditPart;
import OntoUML.diagram.edit.parts.CharacterizationSourcePropertyNameLabelEditPart;
import OntoUML.diagram.edit.parts.CharacterizationTargetPropertyCardinaliEditPart;
import OntoUML.diagram.edit.parts.CharacterizationTargetPropertyNameLabelEditPart;
import OntoUML.diagram.edit.parts.ComponentOfSourcePropertyCardinaliEditPart;
import OntoUML.diagram.edit.parts.ComponentOfSourcePropertyNameLabelEditPart;
import OntoUML.diagram.edit.parts.ComponentOfTargetPropertyCardinaliEditPart;
import OntoUML.diagram.edit.parts.ComponentOfTargetPropertyNameLabelEditPart;
import OntoUML.diagram.edit.parts.DatatypeRelationshipSourcePropertyCardinaliEditPart;
import OntoUML.diagram.edit.parts.DatatypeRelationshipSourcePropertyNameLabelEditPart;
import OntoUML.diagram.edit.parts.DatatypeRelationshipTargetPropertyCardinaliEditPart;
import OntoUML.diagram.edit.parts.DatatypeRelationshipTargetPropertyNameLabelEditPart;
import OntoUML.diagram.edit.parts.DerivationSourcePropertyCardinaliEditPart;
import OntoUML.diagram.edit.parts.DerivationTargetPropertyCardinaliEditPart;
import OntoUML.diagram.edit.parts.FormalAssociationAssociationEnd1Property2EditPart;
import OntoUML.diagram.edit.parts.FormalAssociationAssociationEnd1PropertyEditPart;
import OntoUML.diagram.edit.parts.FormalAssociationAssociationEnd2Property2EditPart;
import OntoUML.diagram.edit.parts.FormalAssociationAssociationEnd2PropertyEditPart;
import OntoUML.diagram.edit.parts.MaterialAssociationAssociationEnd1Property2EditPart;
import OntoUML.diagram.edit.parts.MaterialAssociationAssociationEnd1PropertyEditPart;
import OntoUML.diagram.edit.parts.MaterialAssociationAssociationEnd2Property2EditPart;
import OntoUML.diagram.edit.parts.MaterialAssociationAssociationEnd2PropertyEditPart;
import OntoUML.diagram.edit.parts.MediationSourcePropertyCardinaliEditPart;
import OntoUML.diagram.edit.parts.MediationSourcePropertyNameLabelEditPart;
import OntoUML.diagram.edit.parts.MediationTargetPropertyCardinaliEditPart;
import OntoUML.diagram.edit.parts.MediationTargetPropertyNameLabelEditPart;
import OntoUML.diagram.edit.parts.MemberOfSourcePropertyCardinaliEditPart;
import OntoUML.diagram.edit.parts.MemberOfSourcePropertyNameLabelEditPart;
import OntoUML.diagram.edit.parts.MemberOfTargetPropertyCardinaliEditPart;
import OntoUML.diagram.edit.parts.MemberOfTargetPropertyNameLabelEditPart;
import OntoUML.diagram.edit.parts.SubCollectionOfSourcePropertyCardinaliEditPart;
import OntoUML.diagram.edit.parts.SubCollectionOfSourcePropertyNameLabelEditPart;
import OntoUML.diagram.edit.parts.SubCollectionOfTargetPropertyCardinaliEditPart;
import OntoUML.diagram.edit.parts.SubCollectionOfTargetPropertyNameLabelEditPart;
import OntoUML.diagram.edit.parts.SubQuantityOfSourcePropertyCardinaliEditPart;
import OntoUML.diagram.edit.parts.SubQuantityOfSourcePropertyNameLabelEditPart;
import OntoUML.diagram.edit.parts.SubQuantityOfTargetPropertyCardinaliEditPart;
import OntoUML.diagram.edit.parts.SubQuantityOfTargetPropertyNameLabelEditPart;

/**
 * @generated
 */
public class OntoUMLPropertySection extends AdvancedPropertySection implements
		IPropertySourceProvider {

	/**
	 * @generated
	 */
	public IPropertySource getPropertySource(Object object) {
		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		}
		AdapterFactory af = getAdapterFactory(object);
		if (af != null) {
			IItemPropertySource ips = (IItemPropertySource) af.adapt(object,
					IItemPropertySource.class);
			if (ips != null) {
				return new PropertySource(object, ips);
			}
		}
		if (object instanceof IAdaptable) {
			return (IPropertySource) ((IAdaptable) object)
					.getAdapter(IPropertySource.class);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected IPropertySourceProvider getPropertySourceProvider() {
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Verifies if the EditPart represents a source of a relationship.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected boolean isSourceDirectedRelationshipEditPart(Object selected) {
		if ((selected instanceof CharacterizationSourcePropertyNameLabelEditPart)
				|| (selected instanceof CharacterizationSourcePropertyCardinaliEditPart)
				|| (selected instanceof DatatypeRelationshipSourcePropertyNameLabelEditPart)
				|| (selected instanceof DatatypeRelationshipSourcePropertyCardinaliEditPart)
				|| (selected instanceof DerivationSourcePropertyCardinaliEditPart)
				|| (selected instanceof MediationSourcePropertyNameLabelEditPart)
				|| (selected instanceof MediationSourcePropertyCardinaliEditPart)
				|| (selected instanceof ComponentOfSourcePropertyNameLabelEditPart)
				|| (selected instanceof ComponentOfSourcePropertyCardinaliEditPart)
				|| (selected instanceof MemberOfSourcePropertyNameLabelEditPart)
				|| (selected instanceof MemberOfSourcePropertyCardinaliEditPart)
				|| (selected instanceof SubCollectionOfSourcePropertyNameLabelEditPart)
				|| (selected instanceof SubCollectionOfSourcePropertyCardinaliEditPart)
				|| (selected instanceof SubQuantityOfSourcePropertyNameLabelEditPart)
				|| (selected instanceof SubQuantityOfSourcePropertyCardinaliEditPart))
			return true;
		else
			return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Verifies if the EditPart represents a target of a relationship.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected boolean isTargetDirectedRelationshipEditPart(Object selected) {
		if ((selected instanceof CharacterizationTargetPropertyNameLabelEditPart)
				|| (selected instanceof CharacterizationTargetPropertyCardinaliEditPart)
				|| (selected instanceof DatatypeRelationshipTargetPropertyNameLabelEditPart)
				|| (selected instanceof DatatypeRelationshipTargetPropertyCardinaliEditPart)
				|| (selected instanceof DerivationTargetPropertyCardinaliEditPart)
				|| (selected instanceof MediationTargetPropertyNameLabelEditPart)
				|| (selected instanceof MediationTargetPropertyCardinaliEditPart)
				|| (selected instanceof ComponentOfTargetPropertyNameLabelEditPart)
				|| (selected instanceof ComponentOfTargetPropertyCardinaliEditPart)
				|| (selected instanceof MemberOfTargetPropertyNameLabelEditPart)
				|| (selected instanceof MemberOfTargetPropertyCardinaliEditPart)
				|| (selected instanceof SubCollectionOfTargetPropertyNameLabelEditPart)
				|| (selected instanceof SubCollectionOfTargetPropertyCardinaliEditPart)
				|| (selected instanceof SubQuantityOfTargetPropertyNameLabelEditPart)
				|| (selected instanceof SubQuantityOfTargetPropertyCardinaliEditPart))
			return true;
		else
			return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Verifies if the EditPart represents an associationEnd1 of an association.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected boolean isAssociationEnd1AssociationEditPart(Object selected) {
		if ((selected instanceof MaterialAssociationAssociationEnd1PropertyEditPart)
				|| (selected instanceof MaterialAssociationAssociationEnd1Property2EditPart)
				|| (selected instanceof FormalAssociationAssociationEnd1PropertyEditPart)
				|| (selected instanceof FormalAssociationAssociationEnd1Property2EditPart))
			return true;
		else
			return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Verifies if the EditPart represents an associationEnd2 of an association.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected boolean isAssociationEnd2AssociationEditPart(Object selected) {
		if ((selected instanceof MaterialAssociationAssociationEnd2PropertyEditPart)
				|| (selected instanceof MaterialAssociationAssociationEnd2Property2EditPart)
				|| (selected instanceof FormalAssociationAssociationEnd2PropertyEditPart)
				|| (selected instanceof FormalAssociationAssociationEnd2Property2EditPart))
			return true;
		else
			return false;
	}

	/**
	 * Modify/unwrap selection.
	 * @generated NOT
	 */
	protected Object transformSelection(Object selected) {

		if (isSourceDirectedRelationshipEditPart(selected)) {
			Object model = ((EditPart) selected).getModel();
			if (model instanceof View) {
				EObject modelElement = ((View) model).getElement();
				if (modelElement instanceof DirectedRelationship) {
					if (((DirectedRelationship) modelElement).getSource()
							.size() > 0)
						return ((DirectedRelationship) modelElement)
								.getSource().get(0);
				}
			}
		}
		if (isTargetDirectedRelationshipEditPart(selected)) {
			Object model = ((EditPart) selected).getModel();
			if (model instanceof View) {
				EObject modelElement = ((View) model).getElement();
				if (modelElement instanceof DirectedRelationship) {
					if (((DirectedRelationship) modelElement).getTarget()
							.size() > 0)
						return ((DirectedRelationship) modelElement)
								.getTarget().get(0);
				}
			}
		}
		if (isAssociationEnd1AssociationEditPart(selected)) {
			Object model = ((EditPart) selected).getModel();
			if (model instanceof View) {
				EObject modelElement = ((View) model).getElement();
				if (modelElement instanceof Association) {
					if (((Association) modelElement).getAssociationEnd().size() > 0)
						for (int i = 0; i < ((Association) modelElement)
								.getAssociationEnd().size(); ++i)
							if (((Association) modelElement)
									.getAssociationEnd().get(i) instanceof Property)
								if (((Property) ((Association) modelElement)
										.getAssociationEnd().get(i))
										.getAssociationEndPositionAux() == 1)
									return ((Association) modelElement)
											.getAssociationEnd().get(i);
				}
			}
		}
		if (isAssociationEnd2AssociationEditPart(selected)) {
			Object model = ((EditPart) selected).getModel();
			if (model instanceof View) {
				EObject modelElement = ((View) model).getElement();
				if (modelElement instanceof Association) {
					if (((Association) modelElement).getAssociationEnd().size() > 0)
						for (int i = 0; i < ((Association) modelElement)
								.getAssociationEnd().size(); ++i)
							if (((Association) modelElement)
									.getAssociationEnd().get(i) instanceof Property)
								if (((Property) ((Association) modelElement)
										.getAssociationEnd().get(i))
										.getAssociationEndPositionAux() == 2)
									return ((Association) modelElement)
											.getAssociationEnd().get(i);
				}
			}
		}
		if (selected instanceof EditPart) {
			Object model = ((EditPart) selected).getModel();
			return model instanceof View ? ((View) model).getElement() : null;
		}
		if (selected instanceof View) {
			return ((View) selected).getElement();
		}
		if (selected instanceof IAdaptable) {
			View view = (View) ((IAdaptable) selected).getAdapter(View.class);
			if (view != null) {
				return view.getElement();
			}
		}
		return selected;
	}

	/**
	 * @generated
	 */
	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (selection.isEmpty()
				|| false == selection instanceof StructuredSelection) {
			super.setInput(part, selection);
			return;
		}
		final StructuredSelection structuredSelection = ((StructuredSelection) selection);
		ArrayList transformedSelection = new ArrayList(structuredSelection
				.size());
		for (Iterator it = structuredSelection.iterator(); it.hasNext();) {
			Object r = transformSelection(it.next());
			if (r != null) {
				transformedSelection.add(r);
			}
		}
		super.setInput(part, new StructuredSelection(transformedSelection));
	}

	/**
	 * @generated
	 */
	protected AdapterFactory getAdapterFactory(Object object) {
		if (getEditingDomain() instanceof AdapterFactoryEditingDomain) {
			return ((AdapterFactoryEditingDomain) getEditingDomain())
					.getAdapterFactory();
		}
		TransactionalEditingDomain editingDomain = TransactionUtil
				.getEditingDomain(object);
		if (editingDomain != null) {
			return ((AdapterFactoryEditingDomain) editingDomain)
					.getAdapterFactory();
		}
		return null;
	}

}
