package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import OntoUML.DatatypeAssociation;
import OntoUML.Property;
import org.eclipse.emf.common.util.EList;

/**
 * @generated
 */
public class DatatypeAssociationEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3003;

	/**
	 * @generated
	 */
	public DatatypeAssociationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new OntoUML.diagram.edit.policies.DatatypeAssociationItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OntoUML.diagram.edit.parts.DatatypeAssociationNameEditPart) {
			((OntoUML.diagram.edit.parts.DatatypeAssociationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDatatypeAssociationNameLabelFigure());
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
	 * <!-- begin-user-doc -->
	 * Changed.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected Connection createConnectionFigure() {
		return new DatatypeAssociationFigure(this);
	}

	/**
	 * @generated
	 */
	public DatatypeAssociationFigure getPrimaryShape() {
		return (DatatypeAssociationFigure) getFigure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Created to update the exibition of the meta-attributes.
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
	public class DatatypeAssociationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDatatypeAssociationNameLabelFigure;

		/**
		 * @generated
		 */
		public DatatypeAssociationFigure() {

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureDatatypeAssociationNameLabelFigure = new WrappingLabel();
			fFigureDatatypeAssociationNameLabelFigure.setText("Name");

			this.add(fFigureDatatypeAssociationNameLabelFigure);

		}

		/**
		 * <!-- begin-user-doc -->
		 * Changed to receive DatatypeAssociationEditPart.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public DatatypeAssociationFigure(
				DatatypeAssociationEditPart datatypeassociationeditpart) {

			createContents(datatypeassociationeditpart);
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * <!-- begin-user-doc -->
		 * Changed.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		private void createContents(
				DatatypeAssociationEditPart datatypeassociationeditpart) {

			fFigureDatatypeAssociationNameLabelFigure = new WrappingLabel();
			fFigureDatatypeAssociationNameLabelFigure.setText("Name");

			this.add(fFigureDatatypeAssociationNameLabelFigure);

			DatatypeAssociation d = (DatatypeAssociation) ((View) datatypeassociationeditpart
					.getModel()).getElement();
			d.setName("d1");
			((Property) d.getOwner()).setAssociationEnd(d);
			((Property) d.getOwner()).setName("p1");
			for (int i = 0; i < d.getAttribute().size(); i++) {
				((Property) d.getOwner().getAttribute().get(i))
						.setAssociationEnd(d);
				((Property) d.getOwner().getAttribute().get(i)).setName("p2");
			}

			for (int i = 0; i < d.getAssociationEnd().size(); ++i) {
				((Property) d.getAssociationEnd().get(i)).setContainer(d
						.getContainer());
			}
		}

		/**
		 * <!-- begin-user-doc -->
		 * Created to update the exibition of the meta-attributes.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		private void updateContents(
				DatatypeAssociationEditPart datatypeassociationeditpart) {

			DatatypeAssociation d = (DatatypeAssociation) ((View) datatypeassociationeditpart
					.getModel()).getElement();
			d.setName("d1");
			((Property) d.getOwner()).setAssociationEnd(d);
			((Property) d.getOwner()).setName("p1");
			for (int i = 0; i < d.getAttribute().size(); i++) {
				((Property) d.getOwner().getAttribute().get(i))
						.setAssociationEnd(d);
				((Property) d.getOwner().getAttribute().get(i)).setName("p2");
			}
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDatatypeAssociationNameLabelFigure() {
			return fFigureDatatypeAssociationNameLabelFigure;
		}

	}

}
