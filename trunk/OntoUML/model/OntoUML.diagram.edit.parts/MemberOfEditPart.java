package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import OntoUML.memberOf;

/**
 * @generated
 */
public class MemberOfEditPart extends ConnectionNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3009;

	/**
	 * @generated
	 */
	public MemberOfEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new OntoUML.diagram.edit.policies.MemberOfItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OntoUML.diagram.edit.parts.MemberOfNameEditPart) {
			((OntoUML.diagram.edit.parts.MemberOfNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMemberOfNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel23EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel23EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMemberOfMetaAttributesLabelFigure());
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
		return new MemberOfFigure(this);
	}

	/**
	 * @generated
	 */
	public MemberOfFigure getPrimaryShape() {
		return (MemberOfFigure) getFigure();
	}
	
	//Criei para atualizar a exibição dos meta-atributos isEssential, isInseparable, isImmutablePart e isImmutableWhole.
	protected void handleNotificationEvent(Notification event) {
		getPrimaryShape().updateContents(this);
		super.handleNotificationEvent(event);
	}

	/**
	 * @generated
	 */
	public class MemberOfFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMemberOfNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMemberOfMetaAttributesLabelFigure;

		/**
		 * @generated
		 */
		// Modifiquei para receber o MemberOfEditPart.
		public MemberOfFigure(MemberOfEditPart memberofeditpart) {

			createContents(memberofeditpart);
			setSourceDecoration(createSourceDecoration());
		}
		
		/** Associa a decoração correta, dependendo do atributo isEssential. */
		protected boolean updateFaceIsEssential(MemberOfEditPart memberofeditpart) {
			memberOf m = (memberOf)((View)memberofeditpart.getModel()).getElement();
			return m.isIsEssential();
		}
		
		/** Associa a decoração correta, dependendo do atributo isInseparable. */
		protected boolean updateFaceIsInseparable(MemberOfEditPart memberofeditpart) {
			memberOf m = (memberOf)((View)memberofeditpart.getModel()).getElement();
			return m.isIsInseparable();
		}
		
		/** Associa a decoração correta, dependendo dos atributos isEssential e isImmutablePart. */
		protected boolean updateFaceIsImmutablePart(MemberOfEditPart memberofeditpart) {
			memberOf m = (memberOf)((View)memberofeditpart.getModel()).getElement();
			if(!m.isIsEssential() && m.isIsImmutablePart())
				return true;
			else
				return false;
		}
		
		/** Associa a decoração correta, dependendo dos atributos isInseparable e isImmutableWhole. */
		protected boolean updateFaceIsImmutableWhole(MemberOfEditPart memberofeditpart) {
			memberOf m = (memberOf)((View)memberofeditpart.getModel()).getElement();
			if (!m.isIsInseparable() && m.isIsImmutableWhole())
				return true;
			else
				return false;
		}

		/**
		 * @generated
		 */
		// Alterei e adicionei as funções updateFaceIsEssential, updateFaceIsInseparable, updateFaceIsImmutablePart, updateFaceIsImmutableWhole.
		private void createContents(MemberOfEditPart memberofeditpart) {

			String text = new String("{");
			Boolean virgula = new Boolean(false);
			
			fFigureMemberOfNameLabelFigure = new WrappingLabel();
			fFigureMemberOfNameLabelFigure.setText("Name");
			
			this.add(fFigureMemberOfNameLabelFigure);

			fFigureMemberOfMetaAttributesLabelFigure = new WrappingLabel();
			if(updateFaceIsEssential(memberofeditpart))
			{	
				text = text.concat("essential");
				virgula = true;
			}
			if(updateFaceIsInseparable(memberofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("inseparable");
				virgula = true;
				
			}
			if(updateFaceIsImmutablePart(memberofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("immutable part");
				virgula = true;
			}
			if(updateFaceIsImmutableWhole(memberofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("immutable whole");				
			}
			if(text.equals("{"))
				text = "";
			else
				text = text.concat("}");
			fFigureMemberOfMetaAttributesLabelFigure.setText(text);
			this.add(fFigureMemberOfMetaAttributesLabelFigure);
		}
		
		//Criei para atualizar a exibição dos meta-atributos isEssential, isInseparable, isImmutablePart e isImmutableWhole.
		private void updateContents(MemberOfEditPart memberofeditpart) {

			String text = new String("{");
			Boolean virgula = new Boolean(false);
			
			if(updateFaceIsEssential(memberofeditpart))
			{	
				text = text.concat("essential");
				virgula = true;
			}
			if(updateFaceIsInseparable(memberofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("inseparable");
				virgula = true;
				
			}
			if(updateFaceIsImmutablePart(memberofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("immutable part");
				virgula = true;
			}
			if(updateFaceIsImmutableWhole(memberofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("immutable whole");				
			}
			if(text.equals("{"))
				text = "";
			else
				text = text.concat("}");
			fFigureMemberOfMetaAttributesLabelFigure.setText(text);
			this.add(fFigureMemberOfMetaAttributesLabelFigure);
		}
		
		/**
		 * @generated
		 */
		//Alterei para que o meta atributo isShareable defina se o diamante vai ser vazio ou cheio.		
		private RotatableDecoration createSourceDecoration() {
			OntoUML.diagram.edit.parts.MemberOfCustomFigure df = new OntoUML.diagram.edit.parts.MemberOfCustomFigure(MemberOfEditPart.this);

			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMemberOfNameLabelFigure() {
			return fFigureMemberOfNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMemberOfMetaAttributesLabelFigure() {
			return fFigureMemberOfMetaAttributesLabelFigure;
		}

	}

}
