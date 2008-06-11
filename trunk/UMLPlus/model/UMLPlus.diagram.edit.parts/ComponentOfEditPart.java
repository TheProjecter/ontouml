package UMLPlus.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.View;
import UMLPlus.componentOf;

/**
 * @generated
 */
public class ComponentOfEditPart extends ConnectionNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3002;

	/**
	 * @generated
	 */
	public ComponentOfEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new UMLPlus.diagram.edit.policies.ComponentOfItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof UMLPlus.diagram.edit.parts.ComponentOfNameEditPart) {
			((UMLPlus.diagram.edit.parts.ComponentOfNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureComponentOfNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof UMLPlus.diagram.edit.parts.WrapLabel15EditPart) {
			((UMLPlus.diagram.edit.parts.WrapLabel15EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureComponentOfMetaAttributesLabelFigure());
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
		return new ComponentOfFigure(this);
	}

	/**
	 * @generated
	 */
	public ComponentOfFigure getPrimaryShape() {
		return (ComponentOfFigure) getFigure();
	}
	
	//Criei para atualizar a exibição dos meta-atributos isEssential, isInseparable, isImmutablePart e isImmutableWhole.
	protected void handleNotificationEvent(Notification event) {
		getPrimaryShape().updateContents(this);
		super.handleNotificationEvent(event);
	}

	/**
	 * @generated
	 */
	public class ComponentOfFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrapLabel fFigureComponentOfNameLabelFigure;
		/**
		 * @generated
		 */
		private WrapLabel fFigureComponentOfMetaAttributesLabelFigure;

		/**
		 * @generated
		 */
		// Modifiquei para receber o ComponentOfEditPart.
		public ComponentOfFigure(ComponentOfEditPart componentofeditpart) {

			createContents(componentofeditpart);
			setSourceDecoration(createSourceDecoration());
		}
		
		/** Associa a decoração correta, dependendo do atributo isEssential. */
		protected boolean updateFaceIsEssential(ComponentOfEditPart componentofeditpart) {
			componentOf c = (componentOf)((View)componentofeditpart.getModel()).getElement();
			return c.isIsEssential();
		}
		
		/** Associa a decoração correta, dependendo do atributo isInseparable. */
		protected boolean updateFaceIsInseparable(ComponentOfEditPart componentofeditpart) {
			componentOf c = (componentOf)((View)componentofeditpart.getModel()).getElement();
			return c.isIsInseparable();
		}
		
		/** Associa a decoração correta, dependendo dos atributos isEssential e isImmutablePart. */
		protected boolean updateFaceIsImmutablePart(ComponentOfEditPart componentofeditpart) {
			componentOf c = (componentOf)((View)componentofeditpart.getModel()).getElement();
			if(!c.isIsEssential() && c.isIsImmutablePart())
				return true;
			else
				return false;
		}
		
		/** Associa a decoração correta, dependendo dos atributos isInseparable e isImmutableWhole. */
		protected boolean updateFaceIsImmutableWhole(ComponentOfEditPart componentofeditpart) {
			componentOf c = (componentOf)((View)componentofeditpart.getModel()).getElement();
			if (!c.isIsInseparable() && c.isIsImmutableWhole())
				return true;
			else
				return false;
		}

		/**
		 * @generated
		 */
		// Alterei e adicionei as funções updateFaceIsEssential, updateFaceIsInseparable, updateFaceIsImmutablePart, updateFaceIsImmutableWhole.
		private void createContents(ComponentOfEditPart componentofeditpart) {

			String text = new String("{");
			Boolean virgula = new Boolean(false);
			
			fFigureComponentOfNameLabelFigure = new WrapLabel();
			fFigureComponentOfNameLabelFigure.setText("Name");
			
			this.add(fFigureComponentOfNameLabelFigure);

			fFigureComponentOfMetaAttributesLabelFigure = new WrapLabel();
			if(updateFaceIsEssential(componentofeditpart))
			{	
				text = text.concat("essential");
				virgula = true;
			}
			if(updateFaceIsInseparable(componentofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("inseparable");
				virgula = true;
				
			}
			if(updateFaceIsImmutablePart(componentofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("immutable part");
				virgula = true;
			}
			if(updateFaceIsImmutableWhole(componentofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("immutable whole");				
			}
			if(text.equals("{"))
				text = "";
			else
				text = text.concat("}");
			fFigureComponentOfMetaAttributesLabelFigure.setText(text);
			this.add(fFigureComponentOfMetaAttributesLabelFigure);
		}
		
		//Criei para atualizar a exibição dos meta-atributos isEssential, isInseparable, isImmutablePart e isImmutableWhole.
		private void updateContents(ComponentOfEditPart componentofeditpart) {

			String text = new String("{");
			Boolean virgula = new Boolean(false);
			
			if(updateFaceIsEssential(componentofeditpart))
			{	
				text = text.concat("essential");
				virgula = true;
			}
			if(updateFaceIsInseparable(componentofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("inseparable");
				virgula = true;
				
			}
			if(updateFaceIsImmutablePart(componentofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("immutable part");
				virgula = true;
			}
			if(updateFaceIsImmutableWhole(componentofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("immutable whole");				
			}
			if(text.equals("{"))
				text = "";
			else
				text = text.concat("}");
			fFigureComponentOfMetaAttributesLabelFigure.setText(text);
			this.add(fFigureComponentOfMetaAttributesLabelFigure);
		}

		/**
		 * @generated
		 */
		//Alterei para que o meta atributo isShareable defina se o diamante vai ser vazio ou cheio.	
		private RotatableDecoration createSourceDecoration() {
			UMLPlus.diagram.edit.parts.ComponentOfCustomFigure df = new UMLPlus.diagram.edit.parts.ComponentOfCustomFigure(ComponentOfEditPart.this);

			return df;
		}

		/**
		 * @generated
		 */
		public WrapLabel getFigureComponentOfNameLabelFigure() {
			return fFigureComponentOfNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrapLabel getFigureComponentOfMetaAttributesLabelFigure() {
			return fFigureComponentOfMetaAttributesLabelFigure;
		}

	}

}
