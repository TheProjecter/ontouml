package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import OntoUML.Characterization;
import OntoUML.Property;

/**
 * @generated
 */
public class CharacterizationEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

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
		return new CharacterizationFigure(this);
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
		public CharacterizationFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureCharacterizationLabelFigure = new WrappingLabel();
			fFigureCharacterizationLabelFigure.setText("<<characterization>>");

			this.add(fFigureCharacterizationLabelFigure);

			fFigureCharacterizationNameLabelFigure = new WrappingLabel();
			fFigureCharacterizationNameLabelFigure.setText("Name");

			this.add(fFigureCharacterizationNameLabelFigure);

		}

		/**
		 * <!-- begin-user-doc -->
		 * Changed to receive CharacterizationEditPart.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public CharacterizationFigure(
				CharacterizationEditPart characterizationeditpart) {

			createContents(characterizationeditpart);
		}

		/**
		 * <!-- begin-user-doc -->
		 * Changed.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		private void createContents(
				CharacterizationEditPart characterizationeditpart) {

			fFigureCharacterizationLabelFigure = new WrappingLabel();
			fFigureCharacterizationLabelFigure.setText("<<characterization>>");

			this.add(fFigureCharacterizationLabelFigure);

			fFigureCharacterizationNameLabelFigure = new WrappingLabel();
			fFigureCharacterizationNameLabelFigure.setText("Name");

			this.add(fFigureCharacterizationNameLabelFigure);

			Characterization c = (Characterization) ((View) characterizationeditpart
					.getModel()).getElement();
			if (!c.getSource().isEmpty())
				((Property) c.getSource().get(0))
						.setContainer(c.getContainer());
			if (!c.getTarget().isEmpty())
				((Property) c.getTarget().get(0))
						.setContainer(c.getContainer());
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

	}

}
