package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import OntoUML.MaterialAssociation;

/**
 * @generated
 */
public class MaterialAssociationEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4007;

	/**
	 * @generated
	 */
	public MaterialAssociationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new OntoUML.diagram.edit.policies.MaterialAssociationItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel19EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel19EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMaterialAssociationLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.MaterialAssociationNameEditPart) {
			((OntoUML.diagram.edit.parts.MaterialAssociationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMaterialAssociationNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.MaterialAssociationAssociationEnd1PropertyEditPart) {
			((OntoUML.diagram.edit.parts.MaterialAssociationAssociationEnd1PropertyEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMaterialAssociationAssociationEnd1PropertyNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.MaterialAssociationAssociationEnd1Property2EditPart) {
			((OntoUML.diagram.edit.parts.MaterialAssociationAssociationEnd1Property2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMaterialAssociationAssociationEnd1PropertyCardinalitiesLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.MaterialAssociationAssociationEnd2PropertyEditPart) {
			((OntoUML.diagram.edit.parts.MaterialAssociationAssociationEnd2PropertyEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMaterialAssociationAssociationEnd2PropertyNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.MaterialAssociationAssociationEnd2Property2EditPart) {
			((OntoUML.diagram.edit.parts.MaterialAssociationAssociationEnd2Property2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMaterialAssociationAssociationEnd2PropertyCardinalitiesLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	/**
	 * @generated
	 */
	protected Connection createConnectionFigure() {
		return new MaterialAssociationFigure();
	}

	/**
	 * @generated
	 */
	public MaterialAssociationFigure getPrimaryShape() {
		return (MaterialAssociationFigure) getFigure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Created to update the exhibition of the meta-attributes.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void handleNotificationEvent(Notification event) {
		getPrimaryShape().updateContents(this);
		super.handleNotificationEvent(event);
	}

	/**
	 * @generated
	 */
	public class MaterialAssociationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMaterialAssociationLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMaterialAssociationNameLabelFigure;

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMaterialAssociationAssociationEnd1PropertyNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMaterialAssociationAssociationEnd1PropertyCardinalitiesLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMaterialAssociationAssociationEnd2PropertyNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMaterialAssociationAssociationEnd2PropertyCardinalitiesLabelFigure;

		/**
		 * @generated
		 */
		public MaterialAssociationFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureMaterialAssociationLabelFigure = new WrappingLabel();
			fFigureMaterialAssociationLabelFigure.setText("«material»");

			this.add(fFigureMaterialAssociationLabelFigure);

			fFigureMaterialAssociationNameLabelFigure = new WrappingLabel();
			fFigureMaterialAssociationNameLabelFigure.setText("Name");

			this.add(fFigureMaterialAssociationNameLabelFigure);

			fFigureMaterialAssociationAssociationEnd1PropertyNameLabelFigure = new WrappingLabel();
			fFigureMaterialAssociationAssociationEnd1PropertyNameLabelFigure
					.setText("");

			this
					.add(fFigureMaterialAssociationAssociationEnd1PropertyNameLabelFigure);

			fFigureMaterialAssociationAssociationEnd1PropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureMaterialAssociationAssociationEnd1PropertyCardinalitiesLabelFigure
					.setText("");

			this
					.add(fFigureMaterialAssociationAssociationEnd1PropertyCardinalitiesLabelFigure);

			fFigureMaterialAssociationAssociationEnd2PropertyNameLabelFigure = new WrappingLabel();
			fFigureMaterialAssociationAssociationEnd2PropertyNameLabelFigure
					.setText("");

			this
					.add(fFigureMaterialAssociationAssociationEnd2PropertyNameLabelFigure);

			fFigureMaterialAssociationAssociationEnd2PropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureMaterialAssociationAssociationEnd2PropertyCardinalitiesLabelFigure
					.setText("");

			this
					.add(fFigureMaterialAssociationAssociationEnd2PropertyCardinalitiesLabelFigure);

		}

		/**
		 * <!-- begin-user-doc -->
		 * Created to update the exhibition of the meta-attributes.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		private void updateContents(
				MaterialAssociationEditPart materialassociationeditpart) {

			MaterialAssociation m = (MaterialAssociation) ((View) materialassociationeditpart
					.getModel()).getElement();

			/*			for (int i = 0; i < m.getAssociationEnd().size(); ++i) {
			 m.getAssociationEnd().get(i).setLower(
			 m.getAssociationEnd().get(i)
			 .derivarLowerMaterialAssociation());
			 m.getAssociationEnd().get(i).setUpper(
			 m.getAssociationEnd().get(i)
			 .derivarUpperMaterialAssociation());
			 }*/
			if (m.existsDerivationConnected()) {
				m.getAssociationEnd().get(0).setUpper(
						m.deriveUpperMaterialAssociationExt1());
				m.getAssociationEnd().get(1).setUpper(
						m.deriveUpperMaterialAssociationExt2());
			}
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMaterialAssociationLabelFigure() {
			return fFigureMaterialAssociationLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMaterialAssociationNameLabelFigure() {
			return fFigureMaterialAssociationNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMaterialAssociationAssociationEnd1PropertyNameLabelFigure() {
			return fFigureMaterialAssociationAssociationEnd1PropertyNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMaterialAssociationAssociationEnd1PropertyCardinalitiesLabelFigure() {
			return fFigureMaterialAssociationAssociationEnd1PropertyCardinalitiesLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMaterialAssociationAssociationEnd2PropertyNameLabelFigure() {
			return fFigureMaterialAssociationAssociationEnd2PropertyNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMaterialAssociationAssociationEnd2PropertyCardinalitiesLabelFigure() {
			return fFigureMaterialAssociationAssociationEnd2PropertyCardinalitiesLabelFigure;
		}

	}

}
