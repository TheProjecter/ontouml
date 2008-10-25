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
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel17EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel17EditPart) childEditPart)
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
		return new MaterialAssociationFigure();
	}

	/**
	 * @generated
	 */
	public MaterialAssociationFigure getPrimaryShape() {
		return (MaterialAssociationFigure) getFigure();
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
		public MaterialAssociationFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureMaterialAssociationLabelFigure = new WrappingLabel();
			fFigureMaterialAssociationLabelFigure.setText("<<material>>");

			this.add(fFigureMaterialAssociationLabelFigure);

			fFigureMaterialAssociationNameLabelFigure = new WrappingLabel();
			fFigureMaterialAssociationNameLabelFigure.setText("Name");

			this.add(fFigureMaterialAssociationNameLabelFigure);

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

	}

}
