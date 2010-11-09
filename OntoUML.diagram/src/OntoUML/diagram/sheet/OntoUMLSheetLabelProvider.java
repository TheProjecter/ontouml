package OntoUML.diagram.sheet;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Image;

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
public class OntoUMLSheetLabelProvider extends DecoratingLabelProvider {

	/**
	 * @generated
	 */
	public OntoUMLSheetLabelProvider() {
		super(new AdapterFactoryLabelProvider(
				OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory()), null);
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		Object selected = unwrap(element);
		return super.getText(selected);
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		return super.getImage(unwrap(element));
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
	 * @generated NOT
	 */
	private Object unwrap(Object element) {
		if (isSourceDirectedRelationshipEditPart(element)) {
			Object model = ((EditPart) element).getModel();
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
		if (isTargetDirectedRelationshipEditPart(element)) {
			Object model = ((EditPart) element).getModel();
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
		if (isAssociationEnd1AssociationEditPart(element)) {
			Object model = ((EditPart) element).getModel();
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
		if (isAssociationEnd2AssociationEditPart(element)) {
			Object model = ((EditPart) element).getModel();
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
		if (element instanceof IStructuredSelection) {
			return unwrap(((IStructuredSelection) element).getFirstElement());
		}
		if (element instanceof EditPart) {
			return unwrapEditPart((EditPart) element);
		}
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null) {
				return unwrapView(view);
			}
		}
		return element;
	}

	/**
	 * @generated
	 */
	private Object unwrapEditPart(EditPart p) {
		if (p.getModel() instanceof View) {
			return unwrapView((View) p.getModel());
		}
		return p.getModel();
	}

	/**
	 * @generated
	 */
	private Object unwrapView(View view) {
		return view.getElement() == null ? view : view.getElement();
	}

}
