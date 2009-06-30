package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
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
public class BinaryAssociationAtom3EditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4015;

	/**
	 * @generated
	 */
	public BinaryAssociationAtom3EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new OntoUML.diagram.edit.policies.BinaryAssociationAtom3ItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OntoUML.diagram.edit.parts.BinaryAssociationAtomNameEditPart) {
			((OntoUML.diagram.edit.parts.BinaryAssociationAtomNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureConclusionVar1LabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.BinaryAssociationAtomName2EditPart) {
			((OntoUML.diagram.edit.parts.BinaryAssociationAtomName2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureConclusionVar2LabelFigure());
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
		return new ConclusionFigure();
	}

	/**
	 * @generated
	 */
	public ConclusionFigure getPrimaryShape() {
		return (ConclusionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ConclusionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureConclusionVar1LabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureConclusionVar2LabelFigure;
		/**
		 * @generated
		 */
		private PolylineConnectionEx fFigureConclusionFigure;

		/**
		 * @generated
		 */
		public ConclusionFigure() {
			this.setForegroundColor(ColorConstants.red);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureConclusionVar1LabelFigure = new WrappingLabel();
			fFigureConclusionVar1LabelFigure.setText("");

			this.add(fFigureConclusionVar1LabelFigure);

			fFigureConclusionVar2LabelFigure = new WrappingLabel();
			fFigureConclusionVar2LabelFigure.setText("");

			this.add(fFigureConclusionVar2LabelFigure);

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
		public WrappingLabel getFigureConclusionVar1LabelFigure() {
			return fFigureConclusionVar1LabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConclusionVar2LabelFigure() {
			return fFigureConclusionVar2LabelFigure;
		}

		/**
		 * @generated
		 */
		public PolylineConnectionEx getFigureConclusionFigure() {
			return fFigureConclusionFigure;
		}

	}

}
