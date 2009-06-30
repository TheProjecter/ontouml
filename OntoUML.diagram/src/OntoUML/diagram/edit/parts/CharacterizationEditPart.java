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
public class CharacterizationEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public CharacterizationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new OntoUML.diagram.edit.policies.CharacterizationItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel14EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel14EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureCharacterizationLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.CharacterizationNameEditPart) {
			((OntoUML.diagram.edit.parts.CharacterizationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureCharacterizationNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.CharacterizationSourcePropertyNameLabelEditPart) {
			((OntoUML.diagram.edit.parts.CharacterizationSourcePropertyNameLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureCharacterizationSourcePropertyNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.CharacterizationSourcePropertyCardinaliEditPart) {
			((OntoUML.diagram.edit.parts.CharacterizationSourcePropertyCardinaliEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureCharacterizationSourcePropertyCardinalitiesLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.CharacterizationTargetPropertyNameLabelEditPart) {
			((OntoUML.diagram.edit.parts.CharacterizationTargetPropertyNameLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureCharacterizationTargetPropertyNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.CharacterizationTargetPropertyCardinaliEditPart) {
			((OntoUML.diagram.edit.parts.CharacterizationTargetPropertyCardinaliEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureCharacterizationTargetPropertyCardinalitiesLabelFigure());
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
		return new CharacterizationFigure();
	}

	/**
	 * @generated
	 */
	public CharacterizationFigure getPrimaryShape() {
		return (CharacterizationFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class CharacterizationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureCharacterizationLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCharacterizationNameLabelFigure;

		/**
		 * @generated
		 */
		private WrappingLabel fFigureCharacterizationSourcePropertyNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCharacterizationSourcePropertyCardinalitiesLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCharacterizationTargetPropertyNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCharacterizationTargetPropertyCardinalitiesLabelFigure;

		/**
		 * @generated
		 */
		public CharacterizationFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureCharacterizationLabelFigure = new WrappingLabel();
			fFigureCharacterizationLabelFigure.setText("«characterization»");

			this.add(fFigureCharacterizationLabelFigure);

			fFigureCharacterizationNameLabelFigure = new WrappingLabel();
			fFigureCharacterizationNameLabelFigure.setText("Name");

			this.add(fFigureCharacterizationNameLabelFigure);

			fFigureCharacterizationSourcePropertyNameLabelFigure = new WrappingLabel();
			fFigureCharacterizationSourcePropertyNameLabelFigure.setText("");

			this.add(fFigureCharacterizationSourcePropertyNameLabelFigure);

			fFigureCharacterizationSourcePropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureCharacterizationSourcePropertyCardinalitiesLabelFigure
					.setText("");

			this
					.add(fFigureCharacterizationSourcePropertyCardinalitiesLabelFigure);

			fFigureCharacterizationTargetPropertyNameLabelFigure = new WrappingLabel();
			fFigureCharacterizationTargetPropertyNameLabelFigure.setText("");

			this.add(fFigureCharacterizationTargetPropertyNameLabelFigure);

			fFigureCharacterizationTargetPropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureCharacterizationTargetPropertyCardinalitiesLabelFigure
					.setText("");

			this
					.add(fFigureCharacterizationTargetPropertyCardinalitiesLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCharacterizationLabelFigure() {
			return fFigureCharacterizationLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCharacterizationNameLabelFigure() {
			return fFigureCharacterizationNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCharacterizationSourcePropertyNameLabelFigure() {
			return fFigureCharacterizationSourcePropertyNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCharacterizationSourcePropertyCardinalitiesLabelFigure() {
			return fFigureCharacterizationSourcePropertyCardinalitiesLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCharacterizationTargetPropertyNameLabelFigure() {
			return fFigureCharacterizationTargetPropertyNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCharacterizationTargetPropertyCardinalitiesLabelFigure() {
			return fFigureCharacterizationTargetPropertyCardinalitiesLabelFigure;
		}

	}

}
