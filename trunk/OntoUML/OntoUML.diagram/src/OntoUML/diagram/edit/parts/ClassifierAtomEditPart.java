package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
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
public class ClassifierAtomEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4016;

	/**
	 * @generated
	 */
	public ClassifierAtomEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new OntoUML.diagram.edit.policies.ClassifierAtomItemSemanticEditPolicy());
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
		return new NegatedConditionFigureDescriptor();
	}

	/**
	 * @generated
	 */
	public NegatedConditionFigureDescriptor getPrimaryShape() {
		return (NegatedConditionFigureDescriptor) getFigure();
	}

	/**
	 * @generated
	 */
	public class NegatedConditionFigureDescriptor extends PolylineConnectionEx {

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
		private PolylineConnectionEx fFigureNegatedConditionFigure;

		/**
		 * @generated
		 */
		public NegatedConditionFigureDescriptor() {
			this.setForegroundColor(ColorConstants.blue);

			createContents();
			setSourceDecoration(createSourceDecoration());
			setTargetDecoration(createTargetDecoration());
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
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			df.setLocation(new Point(getMapMode().DPtoLP(-2), getMapMode()
					.DPtoLP(0)));
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(-2));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(2));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
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
		public PolylineConnectionEx getFigureNegatedConditionFigure() {
			return fFigureNegatedConditionFigure;
		}

	}

}
