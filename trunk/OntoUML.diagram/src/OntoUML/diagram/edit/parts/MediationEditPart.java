package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

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
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel20EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel20EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureMediationLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.MediationNameEditPart) {
			((OntoUML.diagram.edit.parts.MediationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMediationNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.MediationSourcePropertyNameLabelEditPart) {
			((OntoUML.diagram.edit.parts.MediationSourcePropertyNameLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMediationSourcePropertyNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.MediationSourcePropertyCardinaliEditPart) {
			((OntoUML.diagram.edit.parts.MediationSourcePropertyCardinaliEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMediationSourcePropertyCardinalitiesLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.MediationTargetPropertyNameLabelEditPart) {
			((OntoUML.diagram.edit.parts.MediationTargetPropertyNameLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMediationTargetPropertyNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.MediationTargetPropertyCardinaliEditPart) {
			((OntoUML.diagram.edit.parts.MediationTargetPropertyCardinaliEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMediationTargetPropertyCardinalitiesLabelFigure());
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
		return new MediationFigure();
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
		private WrappingLabel fFigureMediationSourcePropertyNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMediationSourcePropertyCardinalitiesLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMediationTargetPropertyNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMediationTargetPropertyCardinalitiesLabelFigure;

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
			fFigureMediationLabelFigure.setText("«mediation»");

			this.add(fFigureMediationLabelFigure);

			fFigureMediationNameLabelFigure = new WrappingLabel();
			fFigureMediationNameLabelFigure.setText("");

			this.add(fFigureMediationNameLabelFigure);

			fFigureMediationSourcePropertyNameLabelFigure = new WrappingLabel();
			fFigureMediationSourcePropertyNameLabelFigure.setText("");

			this.add(fFigureMediationSourcePropertyNameLabelFigure);

			fFigureMediationSourcePropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureMediationSourcePropertyCardinalitiesLabelFigure.setText("");

			this.add(fFigureMediationSourcePropertyCardinalitiesLabelFigure);

			fFigureMediationTargetPropertyNameLabelFigure = new WrappingLabel();
			fFigureMediationTargetPropertyNameLabelFigure.setText("");

			this.add(fFigureMediationTargetPropertyNameLabelFigure);

			fFigureMediationTargetPropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureMediationTargetPropertyCardinalitiesLabelFigure.setText("");

			this.add(fFigureMediationTargetPropertyCardinalitiesLabelFigure);

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

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMediationSourcePropertyNameLabelFigure() {
			return fFigureMediationSourcePropertyNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMediationSourcePropertyCardinalitiesLabelFigure() {
			return fFigureMediationSourcePropertyCardinalitiesLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMediationTargetPropertyNameLabelFigure() {
			return fFigureMediationTargetPropertyNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMediationTargetPropertyCardinalitiesLabelFigure() {
			return fFigureMediationTargetPropertyCardinalitiesLabelFigure;
		}

	}

}
