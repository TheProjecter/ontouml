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
import OntoUML.subQuantityOf;
import OntoUML.Property;

/**
 * @generated
 */
public class SubQuantityOfEditPart extends ConnectionNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3011;

	/**
	 * @generated
	 */
	public SubQuantityOfEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new OntoUML.diagram.edit.policies.SubQuantityOfItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OntoUML.diagram.edit.parts.SubQuantityOfNameEditPart) {
			((OntoUML.diagram.edit.parts.SubQuantityOfNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubQuantityOfNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel25EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel25EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubQuantityOfMetaAttributesLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel26EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel26EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubQuantityOfSourceCardinalityLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel27EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel27EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubQuantityOfTargetCardinalityLabelFigure());
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
		return new SubQuantityOfFigure(this);
	}

	/**
	 * @generated
	 */
	public SubQuantityOfFigure getPrimaryShape() {
		return (SubQuantityOfFigure) getFigure();
	}
	
	//Criei para atualizar a exibição dos meta-atributos isEssential, isInseparable, isImmutablePart e isImmutableWhole.
	protected void handleNotificationEvent(Notification event) {
		getPrimaryShape().updateContents(this);
		super.handleNotificationEvent(event);
	}

	/**
	 * @generated
	 */
	public class SubQuantityOfFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubQuantityOfNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubQuantityOfMetaAttributesLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubQuantityOfSourceCardinalityLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubQuantityOfTargetCardinalityLabelFigure;
		
		/**
		 * @generated
		 */
		// Modifiquei para receber o SubQuantityOfEditPart.
		public SubQuantityOfFigure(SubQuantityOfEditPart subquantityofeditpart) {

			createContents(subquantityofeditpart);
			setSourceDecoration(createSourceDecoration());
		}

		/** Associa a decoração correta, dependendo do atributo isEssential. */
		protected boolean updateFaceIsEssential(SubQuantityOfEditPart subquantityofeditpart) {
			subQuantityOf c = (subQuantityOf)((View)subquantityofeditpart.getModel()).getElement();
			return c.isIsEssential();
		}
		
		/** Associa a decoração correta, dependendo do atributo isInseparable. */
		protected boolean updateFaceIsInseparable(SubQuantityOfEditPart subquantityofeditpart) {
			subQuantityOf c = (subQuantityOf)((View)subquantityofeditpart.getModel()).getElement();
			return c.isIsInseparable();
		}
		
		/** Associa a decoração correta, dependendo dos atributos isEssential e isImmutablePart. */
		protected boolean updateFaceIsImmutablePart(SubQuantityOfEditPart subquantityofeditpart) {
			subQuantityOf c = (subQuantityOf)((View)subquantityofeditpart.getModel()).getElement();
			if(!c.isIsEssential() && c.isIsImmutablePart())
				return true;
			else
				return false;
		}
		
		/** Associa a decoração correta, dependendo dos atributos isInseparable e isImmutableWhole. */
		protected boolean updateFaceIsImmutableWhole(SubQuantityOfEditPart subquantityofeditpart) {
			subQuantityOf c = (subQuantityOf)((View)subquantityofeditpart.getModel()).getElement();
			if (!c.isIsInseparable() && c.isIsImmutableWhole())
				return true;
			else
				return false;
		}
		
		/** Acha a cardinalidade mínima do Property que está em source. */
		protected Integer initialSourceLowerCardinality(SubQuantityOfEditPart subquantityofeditpart) {
			subQuantityOf c = (subQuantityOf)((View)subquantityofeditpart.getModel()).getElement();
			if (!c.getSource().isEmpty()) {
				Property p = (Property)c.getSource().get(0);
				p.setAux(p);
				p.setContainer(c.getContainer());
				//p.setOwner(c);
				return (p.getLower());
			}
			else
				return 0;
		}
		
		/** Acha a cardinalidade máxima do Property que está em source. */
		protected Integer initialSourceUpperCardinality(SubQuantityOfEditPart subquantityofeditpart) {
			subQuantityOf c = (subQuantityOf)((View)subquantityofeditpart.getModel()).getElement();
			if (!c.getSource().isEmpty())
				return (((Property)c.getSource().get(0)).getUpper());
			else
				return 0;
		}
		
		/** Acha a cardinalidade mínima do Property que está em target. */
		protected Integer initialTargetLowerCardinality(SubQuantityOfEditPart subquantityofeditpart) {
			subQuantityOf c = (subQuantityOf)((View)subquantityofeditpart.getModel()).getElement();
			if (!c.getTarget().isEmpty()) {
				Property p = (Property)c.getTarget().get(0);
				p.setAux(p);
				p.setContainer(c.getContainer());
				//p.setOwner(c);
				return (p.getLower());
			}
			else
				return 0;
		}
		
		/** Acha a cardinalidade máxima do Property que está em target. */
		protected Integer initialTargetUpperCardinality(SubQuantityOfEditPart subquantityofeditpart) {
			subQuantityOf c = (subQuantityOf)((View)subquantityofeditpart.getModel()).getElement();
			if (!c.getTarget().isEmpty())
				return (((Property)c.getTarget().get(0)).getUpper());
			else
				return 0;
		}
		
		/** Atualiza as cardinalidades dos Properties em source e target. */
		protected void updatePropertyCardinality(SubQuantityOfEditPart subquantityofeditpart, int source_lower, int source_upper, int target_lower, int target_upper) {
			subQuantityOf c = (subQuantityOf)((View)subquantityofeditpart.getModel()).getElement();
			if (!c.getSource().isEmpty()) {
				((Property)c.getSource().get(0)).setLower(source_lower);
				((Property)c.getSource().get(0)).setUpper(source_upper);
			}
			if (!c.getTarget().isEmpty()) {
				((Property)c.getTarget().get(0)).setLower(target_lower);
				((Property)c.getTarget().get(0)).setUpper(target_upper);
			}
		}
		
		/**
		 * @generated
		 */
		// Alterei e adicionei as funções updateFaceIsEssential, updateFaceIsInseparable, updateFaceIsImmutablePart, updateFaceIsImmutableWhole.
		private void createContents(SubQuantityOfEditPart subquantityofeditpart) {

			String text = new String("{");
			Boolean virgula = new Boolean(false);
			
			fFigureSubQuantityOfNameLabelFigure = new WrappingLabel();
			fFigureSubQuantityOfNameLabelFigure.setText("Name");
			
			this.add(fFigureSubQuantityOfNameLabelFigure);

			fFigureSubQuantityOfMetaAttributesLabelFigure = new WrappingLabel();
			if(updateFaceIsEssential(subquantityofeditpart))
			{	
				text = text.concat("essential");
				virgula = true;
			}
			if(updateFaceIsInseparable(subquantityofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("inseparable");
				virgula = true;
				
			}
			if(updateFaceIsImmutablePart(subquantityofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("immutable part");
				virgula = true;
			}
			if(updateFaceIsImmutableWhole(subquantityofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("immutable whole");				
			}
			if(text.equals("{"))
				text = "";
			else
				text = text.concat("}");
			fFigureSubQuantityOfMetaAttributesLabelFigure.setText(text);
			this.add(fFigureSubQuantityOfMetaAttributesLabelFigure);
			
			fFigureSubQuantityOfSourceCardinalityLabelFigure = new WrappingLabel();
			text = "";
			text = initialSourceLowerCardinality(subquantityofeditpart).toString();
			text = text.concat("..");
			text = text.concat(initialSourceUpperCardinality(subquantityofeditpart).toString());
			fFigureSubQuantityOfSourceCardinalityLabelFigure.setText("11..22");

			this.add(fFigureSubQuantityOfSourceCardinalityLabelFigure);
			
			fFigureSubQuantityOfTargetCardinalityLabelFigure = new WrappingLabel();
			text = "";
			text = initialTargetLowerCardinality(subquantityofeditpart).toString();
			text = text.concat("..");
			text = text.concat(initialTargetUpperCardinality(subquantityofeditpart).toString());			
			fFigureSubQuantityOfTargetCardinalityLabelFigure.setText("33..44");

			this.add(fFigureSubQuantityOfTargetCardinalityLabelFigure);
		}
		
		//Criei para atualizar a exibição dos meta-atributos isEssential, isInseparable, isImmutablePart e isImmutableWhole.
		private void updateContents(SubQuantityOfEditPart subquantityofeditpart) {

			String text = new String("{");
			Boolean virgula = new Boolean(false);
			
			if(updateFaceIsEssential(subquantityofeditpart))
			{	
				text = text.concat("essential");
				virgula = true;
			}
			if(updateFaceIsInseparable(subquantityofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("inseparable");
				virgula = true;
				
			}
			if(updateFaceIsImmutablePart(subquantityofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("immutable part");
				virgula = true;
			}
			if(updateFaceIsImmutableWhole(subquantityofeditpart))
			{
				if(virgula)
					text = text.concat(",");
				text = text.concat("immutable whole");				
			}
			if(text.equals("{"))
				text = "";
			else
				text = text.concat("}");
			fFigureSubQuantityOfMetaAttributesLabelFigure.setText(text);
			this.add(fFigureSubQuantityOfMetaAttributesLabelFigure);
			
			updatePropertyCardinality(subquantityofeditpart,11,22,33,44);			
			
		}
		
		/**
		 * @generated
		 */
		//Alterei para que o meta atributo isShareable defina se o diamante vai ser vazio ou cheio.
		private RotatableDecoration createSourceDecoration() {
			OntoUML.diagram.edit.parts.SubQuantityOfCustomFigure df = new OntoUML.diagram.edit.parts.SubQuantityOfCustomFigure(SubQuantityOfEditPart.this);

			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubQuantityOfNameLabelFigure() {
			return fFigureSubQuantityOfNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubQuantityOfMetaAttributesLabelFigure() {
			return fFigureSubQuantityOfMetaAttributesLabelFigure;
		}
		
		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubQuantityOfSourceCardinalityLabelFigure() {
			return fFigureSubQuantityOfSourceCardinalityLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubQuantityOfTargetCardinalityLabelFigure() {
			return fFigureSubQuantityOfTargetCardinalityLabelFigure;
		}

	}

}
