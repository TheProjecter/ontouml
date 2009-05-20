package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import OntoUML.subQuantityOf;
import OntoUML.Property;

/**
 * @generated
 */
public class SubQuantityOfEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4011;

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
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel21EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel21EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubQuantityOfMetaAttributesLabelFigure());
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
		return new SubQuantityOfFigure(this);
	}

	/**
	 * @generated
	 */
	public SubQuantityOfFigure getPrimaryShape() {
		return (SubQuantityOfFigure) getFigure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Created to update the exibition of the meta-attributes isEssential, isInseparable, isImmutablePart e isImmutableWhole.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
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
		public SubQuantityOfFigure() {

			createContents();
			setSourceDecoration(createSourceDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureSubQuantityOfNameLabelFigure = new WrappingLabel();
			fFigureSubQuantityOfNameLabelFigure.setText("Name");

			this.add(fFigureSubQuantityOfNameLabelFigure);

			fFigureSubQuantityOfMetaAttributesLabelFigure = new WrappingLabel();
			fFigureSubQuantityOfMetaAttributesLabelFigure.setText("{}");

			this.add(fFigureSubQuantityOfMetaAttributesLabelFigure);

		}

		/**
		 * <!-- begin-user-doc -->
		 * Changed to receive SubQuantityOfEditPart.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public SubQuantityOfFigure(SubQuantityOfEditPart subquantityofeditpart) {

			createContents(subquantityofeditpart);
			setSourceDecoration(createSourceDecoration());
		}

		/**
		 * <!-- begin-user-doc -->
		 * Associate the correct decoration, depending on the attribute isEssential.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected boolean updateFaceIsEssential(
				SubQuantityOfEditPart subquantityofeditpart) {
			subQuantityOf c = (subQuantityOf) ((View) subquantityofeditpart
					.getModel()).getElement();
			return c.isIsEssential();
		}

		/**
		 * <!-- begin-user-doc -->
		 * Associate the correct decoration, depending on the attribute isInseparable.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected boolean updateFaceIsInseparable(
				SubQuantityOfEditPart subquantityofeditpart) {
			subQuantityOf c = (subQuantityOf) ((View) subquantityofeditpart
					.getModel()).getElement();
			return c.isIsInseparable();
		}

		/**
		 * <!-- begin-user-doc -->
		 * Associate the correct decoration, depending on the attributes isEssential and isImmutablePart.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected boolean updateFaceIsImmutablePart(
				SubQuantityOfEditPart subquantityofeditpart) {
			subQuantityOf c = (subQuantityOf) ((View) subquantityofeditpart
					.getModel()).getElement();
			if (!c.isIsEssential() && c.isIsImmutablePart())
				return true;
			else
				return false;
		}

		/**
		 * <!-- begin-user-doc -->
		 * Associate the correct decoration, depending on the attributes isInseparable e isImmutableWhole.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected boolean updateFaceIsImmutableWhole(
				SubQuantityOfEditPart subquantityofeditpart) {
			subQuantityOf c = (subQuantityOf) ((View) subquantityofeditpart
					.getModel()).getElement();
			if (!c.isIsInseparable() && c.isIsImmutableWhole())
				return true;
			else
				return false;
		}

		/**
		 * <!-- begin-user-doc -->
		 * Finds the minimum cardinality of the Property that is in Source.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected Integer initialSourceLowerCardinality(
				SubQuantityOfEditPart subquantityofeditpart) {
			subQuantityOf c = (subQuantityOf) ((View) subquantityofeditpart
					.getModel()).getElement();
			if (!c.getSource().isEmpty()) {
				Property p = (Property) c.getSource().get(0);
				p.setAux(p);
				p.setContainer(c.getContainer());
				//p.setOwner(c);
				return (p.getLower());
			} else
				return 0;
		}

		/**
		 * <!-- begin-user-doc -->
		 * Finds the maximum cardinality of the Property that is in Source.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected Integer initialSourceUpperCardinality(
				SubQuantityOfEditPart subquantityofeditpart) {
			subQuantityOf c = (subQuantityOf) ((View) subquantityofeditpart
					.getModel()).getElement();
			if (!c.getSource().isEmpty())
				return (((Property) c.getSource().get(0)).getUpper());
			else
				return 0;
		}

		/**
		 * <!-- begin-user-doc -->
		 * Finds the minimum cardinality of the Property that is in Target.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected Integer initialTargetLowerCardinality(
				SubQuantityOfEditPart subquantityofeditpart) {
			subQuantityOf c = (subQuantityOf) ((View) subquantityofeditpart
					.getModel()).getElement();
			if (!c.getTarget().isEmpty()) {
				Property p = (Property) c.getTarget().get(0);
				p.setAux(p);
				p.setContainer(c.getContainer());
				//p.setOwner(c);
				return (p.getLower());
			} else
				return 0;
		}

		/**
		 * <!-- begin-user-doc -->
		 * Finds the maximum cardinality of the Property that is in Target.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected Integer initialTargetUpperCardinality(
				SubQuantityOfEditPart subquantityofeditpart) {
			subQuantityOf c = (subQuantityOf) ((View) subquantityofeditpart
					.getModel()).getElement();
			if (!c.getTarget().isEmpty())
				return (((Property) c.getTarget().get(0)).getUpper());
			else
				return 0;
		}

		/**
		 * <!-- begin-user-doc -->
		 * Updates the cardinalities of the Properties that are in Source and Target.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected void updatePropertyCardinality(
				SubQuantityOfEditPart subquantityofeditpart, int source_lower,
				int source_upper, int target_lower, int target_upper) {
			subQuantityOf c = (subQuantityOf) ((View) subquantityofeditpart
					.getModel()).getElement();
			if (!c.getSource().isEmpty()) {
				((Property) c.getSource().get(0)).setLower(source_lower);
				((Property) c.getSource().get(0)).setUpper(source_upper);
			}
			if (!c.getTarget().isEmpty()) {
				((Property) c.getTarget().get(0)).setLower(target_lower);
				((Property) c.getTarget().get(0)).setUpper(target_upper);
			}
		}

		/**
		 * <!-- begin-user-doc -->
		 * Changed.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		private void createContents(SubQuantityOfEditPart subquantityofeditpart) {

			String text = new String("{");
			Boolean virgula = new Boolean(false);

			fFigureSubQuantityOfNameLabelFigure = new WrappingLabel();
			fFigureSubQuantityOfNameLabelFigure.setText("Name");

			this.add(fFigureSubQuantityOfNameLabelFigure);

			fFigureSubQuantityOfMetaAttributesLabelFigure = new WrappingLabel();
			if (updateFaceIsEssential(subquantityofeditpart)) {
				text = text.concat("essential");
				virgula = true;
			}
			if (updateFaceIsInseparable(subquantityofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("inseparable");
				virgula = true;

			}
			if (updateFaceIsImmutablePart(subquantityofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("immutable part");
				virgula = true;
			}
			if (updateFaceIsImmutableWhole(subquantityofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("immutable whole");
			}
			if (text.equals("{"))
				text = "";
			else
				text = text.concat("}");
			fFigureSubQuantityOfMetaAttributesLabelFigure.setText(text);
			this.add(fFigureSubQuantityOfMetaAttributesLabelFigure);

			subQuantityOf c = (subQuantityOf) ((View) subquantityofeditpart
					.getModel()).getElement();
			if (!c.getSource().isEmpty())
				((Property) c.getSource().get(0))
						.setContainer(c.getContainer());
			if (!c.getTarget().isEmpty())
				((Property) c.getTarget().get(0))
						.setContainer(c.getContainer());
		}

		/**
		 * <!-- begin-user-doc -->
		 * Created to update the exibition of the meta-attributes isEssential, isInseparable, isImmutablePart e isImmutableWhole.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		private void updateContents(SubQuantityOfEditPart subquantityofeditpart) {

			String text = new String("{");
			Boolean virgula = new Boolean(false);

			if (updateFaceIsEssential(subquantityofeditpart)) {
				text = text.concat("essential");
				virgula = true;
			}
			if (updateFaceIsInseparable(subquantityofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("inseparable");
				virgula = true;

			}
			if (updateFaceIsImmutablePart(subquantityofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("immutable part");
				virgula = true;
			}
			if (updateFaceIsImmutableWhole(subquantityofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("immutable whole");
			}
			if (text.equals("{"))
				text = "";
			else
				text = text.concat("}");
			fFigureSubQuantityOfMetaAttributesLabelFigure.setText(text);
			this.add(fFigureSubQuantityOfMetaAttributesLabelFigure);
		}

		/**
		 * <!-- begin-user-doc -->
		 * Changed so that the meta-attribute isShareable set if the diamond will be empty or full.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		private RotatableDecoration createSourceDecoration() {
			OntoUML.diagram.edit.parts.SubQuantityOfCustomFigure df = new OntoUML.diagram.edit.parts.SubQuantityOfCustomFigure(
					SubQuantityOfEditPart.this);

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

	}

}
