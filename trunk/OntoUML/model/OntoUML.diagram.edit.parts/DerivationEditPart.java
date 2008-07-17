package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import OntoUML.Derivation;
import OntoUML.Property;

/**
 * @generated
 */
public class DerivationEditPart extends ConnectionNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3004;

	/**
	 * @generated
	 */
	public DerivationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new OntoUML.diagram.edit.policies.DerivationItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OntoUML.diagram.edit.parts.DerivationNameEditPart) {
			((OntoUML.diagram.edit.parts.DerivationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDerivationNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel16EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel16EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDerivationSourceCardinalitiesLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel17EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel17EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDerivationTargetCardinalitiesLabelFigure());
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
		return new DerivationFigure(this);
	}

	/**
	 * @generated
	 */
	public DerivationFigure getPrimaryShape() {
		return (DerivationFigure) getFigure();
	}

	//Criei para atualizar a exibição dos meta-atributos
	protected void handleNotificationEvent(Notification event) {
		getPrimaryShape().updateContents(this);
		super.handleNotificationEvent(event);
	}
	
	/**
	 * @generated
	 */
	public class DerivationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDerivationNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDerivationSourceCardinalitiesLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDerivationTargetCardinalitiesLabelFigure;

		/**
		 * @generated
		 */
		public DerivationFigure(DerivationEditPart derivationeditpart) {
			this.setLineStyle(Graphics.LINE_DASH);

			createContents(derivationeditpart);
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents(DerivationEditPart derivationeditpart) {

			fFigureDerivationNameLabelFigure = new WrappingLabel();
			fFigureDerivationNameLabelFigure.setText("Name");

			this.add(fFigureDerivationNameLabelFigure);

			Derivation d = (Derivation)((View)derivationeditpart.getModel()).getElement();

			for(int i=0; i < d.getSource().size(); i++)
			{
				((Property)d.getSource().get(i)).setLower(((Property)d.getSource().get(i)).derivarLowerDerivation());
				((Property)d.getSource().get(i)).setUpper(((Property)d.getSource().get(i)).derivarUpperDerivation());
			}
						
			fFigureDerivationSourceCardinalitiesLabelFigure = new WrappingLabel();
			String text = new String("");
			if((((Property)d.getSource().get(0)).getLower() == 0) && (((Property)d.getSource().get(0)).getUpper() == -1))
				text = "*";
			else {
				text = text.concat(((Integer)(((Property)d.getSource().get(0)).getLower())).toString());
				if(((Property)d.getSource().get(0)).getUpper() != ((Property)d.getSource().get(0)).getLower()) {
					text = text.concat("..");
					if(((Property)d.getSource().get(0)).getUpper() == -1)
						text = text.concat("*");
					else
						text = text.concat(((Integer)(((Property)d.getSource().get(0)).getUpper())).toString());
				}
			}
			
			fFigureDerivationSourceCardinalitiesLabelFigure.setText(text);

			this.add(fFigureDerivationSourceCardinalitiesLabelFigure);
			
			fFigureDerivationTargetCardinalitiesLabelFigure = new WrappingLabel();
			text = "";
			if((((Property)d.getTarget().get(0)).getLower() == 0) && (((Property)d.getTarget().get(0)).getUpper() == -1))
				text = "*";
			else {
				text = text.concat(((Integer)(((Property)d.getTarget().get(0)).getLower())).toString());
				if(((Property)d.getTarget().get(0)).getUpper() != ((Property)d.getTarget().get(0)).getLower()) {
					text = text.concat("..");
					if(((Property)d.getTarget().get(0)).getUpper() == -1)
						text = text.concat("*");
					else
						text = text.concat(((Integer)(((Property)d.getTarget().get(0)).getUpper())).toString());
				}
			}
			
			fFigureDerivationTargetCardinalitiesLabelFigure.setText(text);

			this.add(fFigureDerivationTargetCardinalitiesLabelFigure);

		}

		//Criei para atualizar a exibição dos meta-atributos
		private void updateContents(DerivationEditPart derivationeditpart) {
			
			Derivation d = (Derivation)((View)derivationeditpart.getModel()).getElement();

			for(int i=0; i < d.getSource().size(); i++)
			{
				((Property)d.getSource().get(i)).setLower(((Property)d.getSource().get(i)).derivarLowerDerivation());
				((Property)d.getSource().get(i)).setUpper(((Property)d.getSource().get(i)).derivarUpperDerivation());
			}
						
			String text = new String("");
			if((((Property)d.getSource().get(0)).getLower() == 0) && (((Property)d.getSource().get(0)).getUpper() == -1))
				text = "*";
			else {
				text = text.concat(((Integer)(((Property)d.getSource().get(0)).getLower())).toString());
				if(((Property)d.getSource().get(0)).getUpper() != ((Property)d.getSource().get(0)).getLower()) {
					text = text.concat("..");
					if(((Property)d.getSource().get(0)).getUpper() == -1)
						text = text.concat("*");
					else
						text = text.concat(((Integer)(((Property)d.getSource().get(0)).getUpper())).toString());
				}
			}
			
			fFigureDerivationSourceCardinalitiesLabelFigure.setText(text);

			this.add(fFigureDerivationSourceCardinalitiesLabelFigure);
			
			text = "";
			if((((Property)d.getTarget().get(0)).getLower() == 0) && (((Property)d.getTarget().get(0)).getUpper() == -1))
				text = "*";
			else {
				text = text.concat(((Integer)(((Property)d.getTarget().get(0)).getLower())).toString());
				if(((Property)d.getTarget().get(0)).getUpper() != ((Property)d.getTarget().get(0)).getLower()) {
					text = text.concat("..");
					if(((Property)d.getTarget().get(0)).getUpper() == -1)
						text = text.concat("*");
					else
						text = text.concat(((Integer)(((Property)d.getTarget().get(0)).getUpper())).toString());
				}
			}
			
			fFigureDerivationTargetCardinalitiesLabelFigure.setText(text);

			this.add(fFigureDerivationTargetCardinalitiesLabelFigure);
			
		}
		
		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			OntoUML.diagram.edit.parts.DerivationCustomFigure df = new OntoUML.diagram.edit.parts.DerivationCustomFigure();

			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDerivationNameLabelFigure() {
			return fFigureDerivationNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDerivationSourceCardinalitiesLabelFigure() {
			return fFigureDerivationSourceCardinalitiesLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDerivationTargetCardinalitiesLabelFigure() {
			return fFigureDerivationTargetCardinalitiesLabelFigure;
		}

	}

}
