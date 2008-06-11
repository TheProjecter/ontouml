package UMLPlus.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.View;
import UMLPlus.MaterialAssociation;
import UMLPlus.Property;

import org.eclipse.emf.common.notify.Notification;

/**
 * @generated
 */
public class MaterialAssociationEditPart extends ConnectionNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3007;

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
				new UMLPlus.diagram.edit.policies.MaterialAssociationItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof UMLPlus.diagram.edit.parts.WrapLabel19EditPart) {
			((UMLPlus.diagram.edit.parts.WrapLabel19EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMaterialAssociationLabelFigure());
			return true;
		}
		if (childEditPart instanceof UMLPlus.diagram.edit.parts.MaterialAssociationNameEditPart) {
			((UMLPlus.diagram.edit.parts.MaterialAssociationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMaterialAssociationNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof UMLPlus.diagram.edit.parts.WrapLabel20EditPart) {
			((UMLPlus.diagram.edit.parts.WrapLabel20EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMaterialAssociationAssociationEnd1CardinalitiesLabelFigure());
			return true;
		}
		if (childEditPart instanceof UMLPlus.diagram.edit.parts.WrapLabel21EditPart) {
			((UMLPlus.diagram.edit.parts.WrapLabel21EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMaterialAssociationAssociationEnd2CardinalitiesLabelFigure());
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
		return new MaterialAssociationFigure(this);
	}

	/**
	 * @generated
	 */
	public MaterialAssociationFigure getPrimaryShape() {
		return (MaterialAssociationFigure) getFigure();
	}
	
	//Criei para atualizar a exibição dos meta-atributos
	protected void handleNotificationEvent(Notification event) {
		getPrimaryShape().updateContents(this);
		super.handleNotificationEvent(event);
	}	
	
	/**
	 * @generated
	 */
	public class MaterialAssociationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrapLabel fFigureMaterialAssociationLabelFigure;
		/**
		 * @generated
		 */
		private WrapLabel fFigureMaterialAssociationNameLabelFigure;
		/**
		 * @generated
		 */
		private WrapLabel fFigureMaterialAssociationAssociationEnd1CardinalitiesLabelFigure;
		/**
		 * @generated
		 */
		private WrapLabel fFigureMaterialAssociationAssociationEnd2CardinalitiesLabelFigure;

		/**
		 * @generated
		 */
		public MaterialAssociationFigure(MaterialAssociationEditPart materialassociationeditpart) {

			createContents(materialassociationeditpart);
		}

		/**
		 * @generated
		 */
		//Alterei para atualizar a exibição dos meta-atributos
		private void createContents(MaterialAssociationEditPart materialassociationeditpart) {

			fFigureMaterialAssociationLabelFigure = new WrapLabel();
			fFigureMaterialAssociationLabelFigure.setText("<<material>>");

			this.add(fFigureMaterialAssociationLabelFigure);

			fFigureMaterialAssociationNameLabelFigure = new WrapLabel();
			fFigureMaterialAssociationNameLabelFigure.setText("Name");

			this.add(fFigureMaterialAssociationNameLabelFigure);
			
			MaterialAssociation m = (MaterialAssociation)((View)materialassociationeditpart.getModel()).getElement();

			for(int i=0; i < m.getAssociationEnd().size(); i++)
			{
				m.getAssociationEnd().get(i).setLower(m.getAssociationEnd().get(i).derivarLowerMaterialAssociation());
				m.getAssociationEnd().get(i).setUpper(m.getAssociationEnd().get(i).derivarUpperMaterialAssociation());
			}
						
			fFigureMaterialAssociationAssociationEnd1CardinalitiesLabelFigure = new WrapLabel();
			String text = new String("");
			if((m.getAssociationEnd().get(0).getLower() == 0) && (m.getAssociationEnd().get(0).getUpper() == -1))
				text = "*";
			else {
				text = text.concat(((Integer)(m.getAssociationEnd().get(0).getLower())).toString());
				if(m.getAssociationEnd().get(0).getUpper() != m.getAssociationEnd().get(0).getLower()) {
					text = text.concat("..");
					if(m.getAssociationEnd().get(0).getUpper() == -1)
						text = text.concat("*");
					else
						text = text.concat(((Integer)(m.getAssociationEnd().get(0).getUpper())).toString());
				}
			}
			
			fFigureMaterialAssociationAssociationEnd1CardinalitiesLabelFigure.setText(text);

			this.add(fFigureMaterialAssociationAssociationEnd1CardinalitiesLabelFigure);

			fFigureMaterialAssociationAssociationEnd2CardinalitiesLabelFigure = new WrapLabel();
			text = "";
			if((m.getAssociationEnd().get(1).getLower() == 0) && (m.getAssociationEnd().get(1).getUpper() == -1))
				text = "*";
			else {
				text = text.concat(((Integer)(m.getAssociationEnd().get(1).getLower())).toString());
				if(m.getAssociationEnd().get(1).getUpper() != m.getAssociationEnd().get(1).getLower()) {
					text = text.concat("..");
					if(m.getAssociationEnd().get(1).getUpper() == -1)
						text = text.concat("*");
					else
						text = text.concat(((Integer)(m.getAssociationEnd().get(1).getUpper())).toString());
				}
			}
			
			fFigureMaterialAssociationAssociationEnd2CardinalitiesLabelFigure.setText(text);

			this.add(fFigureMaterialAssociationAssociationEnd2CardinalitiesLabelFigure);
			
		}

		//Criei para atualizar a exibição dos meta-atributos
		private void updateContents(MaterialAssociationEditPart materialassociationeditpart) {
			
			MaterialAssociation m = (MaterialAssociation)((View)materialassociationeditpart.getModel()).getElement();
			
			for(int i=0; i < m.getAssociationEnd().size(); i++)
			{
				m.getAssociationEnd().get(i).setLower(m.getAssociationEnd().get(i).derivarLowerMaterialAssociation());
				m.getAssociationEnd().get(i).setUpper(m.getAssociationEnd().get(i).derivarUpperMaterialAssociation());
			}
			
			String text = new String("");
			if((m.getAssociationEnd().get(0).getLower() == 0) && (m.getAssociationEnd().get(0).getUpper() == -1))
				text = "*";
			else {
				text = text.concat(((Integer)(m.getAssociationEnd().get(0).getLower())).toString());
				if(m.getAssociationEnd().get(0).getUpper() != m.getAssociationEnd().get(0).getLower()) {
					text = text.concat("..");
					if(m.getAssociationEnd().get(0).getUpper() == -1)
						text = text.concat("*");
					else
						text = text.concat(((Integer)(m.getAssociationEnd().get(0).getUpper())).toString());
				}
			}
			
			fFigureMaterialAssociationAssociationEnd1CardinalitiesLabelFigure.setText(text);

			this.add(fFigureMaterialAssociationAssociationEnd1CardinalitiesLabelFigure);

			text = "";
			if((m.getAssociationEnd().get(1).getLower() == 0) && (m.getAssociationEnd().get(1).getUpper() == -1))
				text = "*";
			else {
				text = text.concat(((Integer)(m.getAssociationEnd().get(1).getLower())).toString());
				if(m.getAssociationEnd().get(1).getUpper() != m.getAssociationEnd().get(1).getLower()) {
					text = text.concat("..");
					if(m.getAssociationEnd().get(1).getUpper() == -1)
						text = text.concat("*");
					else
						text = text.concat(((Integer)(m.getAssociationEnd().get(1).getUpper())).toString());
				}
			}
			
			fFigureMaterialAssociationAssociationEnd2CardinalitiesLabelFigure.setText(text);

			this.add(fFigureMaterialAssociationAssociationEnd2CardinalitiesLabelFigure);		

		}		
		
		/**
		 * @generated
		 */
		public WrapLabel getFigureMaterialAssociationLabelFigure() {
			return fFigureMaterialAssociationLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrapLabel getFigureMaterialAssociationNameLabelFigure() {
			return fFigureMaterialAssociationNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrapLabel getFigureMaterialAssociationAssociationEnd1CardinalitiesLabelFigure() {
			return fFigureMaterialAssociationAssociationEnd1CardinalitiesLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrapLabel getFigureMaterialAssociationAssociationEnd2CardinalitiesLabelFigure() {
			return fFigureMaterialAssociationAssociationEnd2CardinalitiesLabelFigure;
		}

	}

}
