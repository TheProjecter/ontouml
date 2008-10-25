package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ClassifierAtom2EditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4016;

	/**
	 * @generated
	 */
	public ClassifierAtom2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new OntoUML.diagram.edit.policies.ClassifierAtom2ItemSemanticEditPolicy());
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
		return new ConditionFigure();
	}

	/**
	 * @generated
	 */
	public ConditionFigure getPrimaryShape() {
		return (ConditionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ConditionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFilterLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureConditionVar1LabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureConditionVar2LabelFigure;
		/**
		 * @generated
		 */
		private PolylineConnectionEx fFigureConditionFigure;

		/**
		 * @generated
		 */
		public ConditionFigure() {
			this.setForegroundColor(ColorConstants.blue);

			createContents();
			setSourceDecoration(createSourceDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureFilterLabel = new WrappingLabel();
			fFigureFilterLabel.setText("");

			this.add(fFigureFilterLabel);

			fFigureConditionVar2LabelFigure = new WrappingLabel();
			fFigureConditionVar2LabelFigure.setText("");

			this.add(fFigureConditionVar2LabelFigure);

			fFigureConditionVar1LabelFigure = new WrappingLabel();
			fFigureConditionVar1LabelFigure.setText("");

			this.add(fFigureConditionVar1LabelFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createSourceDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFilterLabel() {
			return fFigureFilterLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConditionVar1LabelFigure() {
			return fFigureConditionVar1LabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConditionVar2LabelFigure() {
			return fFigureConditionVar2LabelFigure;
		}

		/**
		 * @generated
		 */
		public PolylineConnectionEx getFigureConditionFigure() {
			return fFigureConditionFigure;
		}

	}

}
