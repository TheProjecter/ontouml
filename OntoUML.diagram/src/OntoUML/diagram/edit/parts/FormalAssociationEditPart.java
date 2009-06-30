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
public class FormalAssociationEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4005;

	/**
	 * @generated
	 */
	public FormalAssociationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new OntoUML.diagram.edit.policies.FormalAssociationItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel18EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel18EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFormalAssociationLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.FormalAssociationNameEditPart) {
			((OntoUML.diagram.edit.parts.FormalAssociationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFormalAssociationNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.FormalAssociationAssociationEnd1PropertyEditPart) {
			((OntoUML.diagram.edit.parts.FormalAssociationAssociationEnd1PropertyEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFormalAssociationAssociationEnd1PropertyNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.FormalAssociationAssociationEnd1Property2EditPart) {
			((OntoUML.diagram.edit.parts.FormalAssociationAssociationEnd1Property2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFormalAssociationAssociationEnd1PropertyCardinalitiesLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.FormalAssociationAssociationEnd2PropertyEditPart) {
			((OntoUML.diagram.edit.parts.FormalAssociationAssociationEnd2PropertyEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFormalAssociationAssociationEnd2PropertyNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.FormalAssociationAssociationEnd2Property2EditPart) {
			((OntoUML.diagram.edit.parts.FormalAssociationAssociationEnd2Property2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFormalAssociationAssociationEnd2PropertyCardinalitiesLabelFigure());
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
		return new FormalAssociationFigure();
	}

	/**
	 * @generated
	 */
	public FormalAssociationFigure getPrimaryShape() {
		return (FormalAssociationFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class FormalAssociationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFormalAssociationLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFormalAssociationNameLabelFigure;

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFormalAssociationAssociationEnd1PropertyNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFormalAssociationAssociationEnd1PropertyCardinalitiesLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFormalAssociationAssociationEnd2PropertyNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFormalAssociationAssociationEnd2PropertyCardinalitiesLabelFigure;

		/**
		 * @generated
		 */
		public FormalAssociationFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureFormalAssociationLabelFigure = new WrappingLabel();
			fFigureFormalAssociationLabelFigure.setText("«formal»");

			this.add(fFigureFormalAssociationLabelFigure);

			fFigureFormalAssociationNameLabelFigure = new WrappingLabel();
			fFigureFormalAssociationNameLabelFigure.setText("Name");

			this.add(fFigureFormalAssociationNameLabelFigure);

			fFigureFormalAssociationAssociationEnd1PropertyNameLabelFigure = new WrappingLabel();
			fFigureFormalAssociationAssociationEnd1PropertyNameLabelFigure
					.setText("");

			this
					.add(fFigureFormalAssociationAssociationEnd1PropertyNameLabelFigure);

			fFigureFormalAssociationAssociationEnd1PropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureFormalAssociationAssociationEnd1PropertyCardinalitiesLabelFigure
					.setText("");

			this
					.add(fFigureFormalAssociationAssociationEnd1PropertyCardinalitiesLabelFigure);

			fFigureFormalAssociationAssociationEnd2PropertyNameLabelFigure = new WrappingLabel();
			fFigureFormalAssociationAssociationEnd2PropertyNameLabelFigure
					.setText("");

			this
					.add(fFigureFormalAssociationAssociationEnd2PropertyNameLabelFigure);

			fFigureFormalAssociationAssociationEnd2PropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureFormalAssociationAssociationEnd2PropertyCardinalitiesLabelFigure
					.setText("");

			this
					.add(fFigureFormalAssociationAssociationEnd2PropertyCardinalitiesLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFormalAssociationLabelFigure() {
			return fFigureFormalAssociationLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFormalAssociationNameLabelFigure() {
			return fFigureFormalAssociationNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFormalAssociationAssociationEnd1PropertyNameLabelFigure() {
			return fFigureFormalAssociationAssociationEnd1PropertyNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFormalAssociationAssociationEnd1PropertyCardinalitiesLabelFigure() {
			return fFigureFormalAssociationAssociationEnd1PropertyCardinalitiesLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFormalAssociationAssociationEnd2PropertyNameLabelFigure() {
			return fFigureFormalAssociationAssociationEnd2PropertyNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFormalAssociationAssociationEnd2PropertyCardinalitiesLabelFigure() {
			return fFigureFormalAssociationAssociationEnd2PropertyCardinalitiesLabelFigure;
		}

	}

}
