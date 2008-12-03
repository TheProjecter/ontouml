package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import OntoUML.Mediation;
import OntoUML.Property;

/**
 * @generated
 */
public class MediationEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4008;

	/**
	 * @generated
	 */
	public MediationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new OntoUML.diagram.edit.policies.MediationItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel18EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel18EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureMediationLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.MediationNameEditPart) {
			((OntoUML.diagram.edit.parts.MediationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMediationNameLabelFigure());
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
		return new MediationFigure(this);
	}

	/**
	 * @generated
	 */
	public MediationFigure getPrimaryShape() {
		return (MediationFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class MediationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMediationLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMediationNameLabelFigure;

		/**
		 * @generated
		 */
		public MediationFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureMediationLabelFigure = new WrappingLabel();
			fFigureMediationLabelFigure.setText("<<mediation>>");

			this.add(fFigureMediationLabelFigure);

			fFigureMediationNameLabelFigure = new WrappingLabel();
			fFigureMediationNameLabelFigure.setText("Name");

			this.add(fFigureMediationNameLabelFigure);

		}

		/**
		 * <!-- begin-user-doc -->
		 * Changed to receive MediationEditPart.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public MediationFigure(MediationEditPart mediationfeditpart) {

			createContents(mediationfeditpart);
		}

		/**
		 * <!-- begin-user-doc -->
		 * Changed.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		private void createContents(MediationEditPart mediationfeditpart) {

			fFigureMediationLabelFigure = new WrappingLabel();
			fFigureMediationLabelFigure.setText("<<mediation>>");

			this.add(fFigureMediationLabelFigure);

			fFigureMediationNameLabelFigure = new WrappingLabel();
			fFigureMediationNameLabelFigure.setText("Name");

			this.add(fFigureMediationNameLabelFigure);

			Mediation m = (Mediation) ((View) mediationfeditpart.getModel())
					.getElement();
			if (!m.getSource().isEmpty())
				((Property) m.getSource().get(0))
						.setContainer(m.getContainer());
			if (!m.getTarget().isEmpty())
				((Property) m.getTarget().get(0))
						.setContainer(m.getContainer());
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMediationLabelFigure() {
			return fFigureMediationLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMediationNameLabelFigure() {
			return fFigureMediationNameLabelFigure;
		}

	}

}
