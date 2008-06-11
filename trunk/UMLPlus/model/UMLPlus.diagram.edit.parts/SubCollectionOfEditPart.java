package UMLPlus.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.View;
import UMLPlus.subCollectionOf;
import UMLPlus.Property;
import UMLPlus.diagram.providers.UMLPlusEditPartProvider;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;

/**
 * @generated
 */
public class SubCollectionOfEditPart extends ConnectionNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3010;

	/**
	 * @generated
	 */
	public SubCollectionOfEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new UMLPlus.diagram.edit.policies.SubCollectionOfItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof UMLPlus.diagram.edit.parts.SubCollectionOfNameEditPart) {
			((UMLPlus.diagram.edit.parts.SubCollectionOfNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubCollectionOfNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof UMLPlus.diagram.edit.parts.WrapLabel24EditPart) {
			((UMLPlus.diagram.edit.parts.WrapLabel24EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubCollectionOfMetaAttributesLabelFigure());
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
		return new SubCollectionOfFigure(this);
	}

	/**
	 * @generated
	 */
	public SubCollectionOfFigure getPrimaryShape() {
		return (SubCollectionOfFigure) getFigure();
	}
	
	//Criei para atualizar a exibição dos meta-atributos isEssential, isInseparable, isImmutablePart e isImmutableWhole.
	protected void handleNotificationEvent(Notification event) {
		getPrimaryShape().updateContents(this);
		super.handleNotificationEvent(event);
	}

	/**
	 * @generated
	 */
	public class SubCollectionOfFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrapLabel fFigureSubCollectionOfNameLabelFigure;
		/**
		 * @generated
		 */
		private WrapLabel fFigureSubCollectionOfMetaAttributesLabelFigure;

		/**
		 * @generated
		 */
		// Modifiquei para receber o SubCollectionOfEditPart.
		public SubCollectionOfFigure(SubCollectionOfEditPart subcollectionofeditpart) {

			createContents(subcollectionofeditpart);
			setSourceDecoration(createSourceDecoration());
		}
		
		/** Associa a decoração correta, dependendo do atributo isEssential. */
		protected boolean updateFaceIsEssential(SubCollectionOfEditPart subcollectionofeditpart) {
			subCollectionOf s = (subCollectionOf)((View)subcollectionofeditpart.getModel()).getElement();
			return s.isIsEssential();
		}
		
		/** Associa a decoração correta, dependendo do atributo isInseparable. */
		protected boolean updateFaceIsInseparable(SubCollectionOfEditPart subcollectionofeditpart) {
			subCollectionOf s = (subCollectionOf)((View)subcollectionofeditpart.getModel()).getElement();
			return s.isIsInseparable();
		}
		
		/** Associa a decoração correta, dependendo dos atributos isEssential e isImmutablePart. */
		protected boolean updateFaceIsImmutablePart(SubCollectionOfEditPart subcollectionofeditpart) {
			subCollectionOf s = (subCollectionOf)((View)subcollectionofeditpart.getModel()).getElement();
			if(!s.isIsEssential() && s.isIsImmutablePart())
				return true;
			else
				return false;
		}
		
		/** Associa a decoração correta, dependendo dos atributos isInseparable e isImmutableWhole. */
		protected boolean updateFaceIsImmutableWhole(SubCollectionOfEditPart subcollectionofeditpart) {
			subCollectionOf s = (subCollectionOf)((View)subcollectionofeditpart.getModel()).getElement();
			if (!s.isIsInseparable() && s.isIsImmutableWhole())
				return true;
			else
				return false;
		}

		/**
		 * @generated
		 */
		// Alterei e adicionei as funções updateFaceIsEssential, updateFaceIsInseparable, updateFaceIsImmutablePart, updateFaceIsImmutableWhole.
		private void createContents(SubCollectionOfEditPart subcollectionofeditpart) {

			String text = new String("{");
			Boolean virgula = new Boolean(false);
			
			fFigureSubCollectionOfNameLabelFigure = new WrapLabel();
			fFigureSubCollectionOfNameLabelFigure.setText("Name");
			
			this.add(fFigureSubCollectionOfNameLabelFigure);

			fFigureSubCollectionOfMetaAttributesLabelFigure = new WrapLabel();
			if(updateFaceIsEssential(subcollectionofeditpart))
			{	
				text = text.concat("essential");
				virgula = true;
			}
			if(updateFaceIsInseparable(subcollectionofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("inseparable");
				virgula = true;
				
			}
			if(updateFaceIsImmutablePart(subcollectionofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("immutable part");
				virgula = true;
			}
			if(updateFaceIsImmutableWhole(subcollectionofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("immutable whole");				
			}
			if(text.equals("{"))
				text = "";
			else
				text = text.concat("}");
			fFigureSubCollectionOfMetaAttributesLabelFigure.setText(text);
			this.add(fFigureSubCollectionOfMetaAttributesLabelFigure);
		}
		
		//Criei para atualizar a exibição dos meta-atributos isEssential, isInseparable, isImmutablePart e isImmutableWhole.
		private void updateContents(SubCollectionOfEditPart subcollectionofeditpart) {

			String text = new String("{");
			Boolean virgula = new Boolean(false);
			
			if(updateFaceIsEssential(subcollectionofeditpart))
			{	
				text = text.concat("essential");
				virgula = true;
			}
			if(updateFaceIsInseparable(subcollectionofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("inseparable");
				virgula = true;
				
			}
			if(updateFaceIsImmutablePart(subcollectionofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("immutable part");
				virgula = true;
			}
			if(updateFaceIsImmutableWhole(subcollectionofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("immutable whole");				
			}
			if(text.equals("{"))
				text = "";
			else
				text = text.concat("}");
			fFigureSubCollectionOfMetaAttributesLabelFigure.setText(text);
			this.add(fFigureSubCollectionOfMetaAttributesLabelFigure);
		}

		/**
		 * @generated
		 */
		//Alterei para que o meta atributo isShareable defina se o diamante vai ser vazio ou cheio.
		private RotatableDecoration createSourceDecoration() {
			UMLPlus.diagram.edit.parts.SubCollectionOfCustomFigure df = new UMLPlus.diagram.edit.parts.SubCollectionOfCustomFigure(SubCollectionOfEditPart.this);

			return df;
		}

		/**
		 * @generated
		 */
		public WrapLabel getFigureSubCollectionOfNameLabelFigure() {
			return fFigureSubCollectionOfNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrapLabel getFigureSubCollectionOfMetaAttributesLabelFigure() {
			return fFigureSubCollectionOfMetaAttributesLabelFigure;
		}

	}

}
