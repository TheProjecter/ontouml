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
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel16EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel16EditPart) childEditPart)
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
		public FormalAssociationFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureFormalAssociationLabelFigure = new WrappingLabel();
			fFigureFormalAssociationLabelFigure.setText("<<formal>>");

			this.add(fFigureFormalAssociationLabelFigure);

			fFigureFormalAssociationNameLabelFigure = new WrappingLabel();
			fFigureFormalAssociationNameLabelFigure.setText("Name");

			this.add(fFigureFormalAssociationNameLabelFigure);

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

	}

}
