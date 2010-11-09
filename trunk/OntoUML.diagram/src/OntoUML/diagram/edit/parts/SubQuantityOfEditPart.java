package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import OntoUML.Element;
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
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel25EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel25EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubQuantityOfLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.SubQuantityOfNameEditPart) {
			((OntoUML.diagram.edit.parts.SubQuantityOfNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubQuantityOfNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel26EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel26EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubQuantityOfMetaAttributesLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.SubQuantityOfSourcePropertyNameLabelEditPart) {
			((OntoUML.diagram.edit.parts.SubQuantityOfSourcePropertyNameLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubQuantitySourcePropertyNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.SubQuantityOfSourcePropertyCardinaliEditPart) {
			((OntoUML.diagram.edit.parts.SubQuantityOfSourcePropertyCardinaliEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubQuantitySourcePropertyCardinalitiesLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.SubQuantityOfTargetPropertyNameLabelEditPart) {
			((OntoUML.diagram.edit.parts.SubQuantityOfTargetPropertyNameLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubQuantityTargetPropertyNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.SubQuantityOfTargetPropertyCardinaliEditPart) {
			((OntoUML.diagram.edit.parts.SubQuantityOfTargetPropertyCardinaliEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubQuantityTargetPropertyCardinalitiesLabelFigure());
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
	 * Created to update the exhibition of the meta-attributes isEssential, isInseparable, isImmutablePart e isImmutableWhole.
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
		private WrappingLabel fFigureSubQuantityOfLabelFigure;
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
		private WrappingLabel fFigureSubQuantitySourcePropertyNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubQuantitySourcePropertyCardinalitiesLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubQuantityTargetPropertyNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubQuantityTargetPropertyCardinalitiesLabelFigure;

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

			fFigureSubQuantityOfLabelFigure = new WrappingLabel();
			fFigureSubQuantityOfLabelFigure.setText("«subQuantityOf»");

			this.add(fFigureSubQuantityOfLabelFigure);

			fFigureSubQuantityOfNameLabelFigure = new WrappingLabel();
			fFigureSubQuantityOfNameLabelFigure.setText("Name");

			this.add(fFigureSubQuantityOfNameLabelFigure);

			fFigureSubQuantityOfMetaAttributesLabelFigure = new WrappingLabel();
			fFigureSubQuantityOfMetaAttributesLabelFigure.setText("{}");

			this.add(fFigureSubQuantityOfMetaAttributesLabelFigure);

			fFigureSubQuantitySourcePropertyNameLabelFigure = new WrappingLabel();
			fFigureSubQuantitySourcePropertyNameLabelFigure.setText("");

			this.add(fFigureSubQuantitySourcePropertyNameLabelFigure);

			fFigureSubQuantitySourcePropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureSubQuantitySourcePropertyCardinalitiesLabelFigure
					.setText("");

			this.add(fFigureSubQuantitySourcePropertyCardinalitiesLabelFigure);

			fFigureSubQuantityTargetPropertyNameLabelFigure = new WrappingLabel();
			fFigureSubQuantityTargetPropertyNameLabelFigure.setText("");

			this.add(fFigureSubQuantityTargetPropertyNameLabelFigure);

			fFigureSubQuantityTargetPropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureSubQuantityTargetPropertyCardinalitiesLabelFigure
					.setText("");

			this.add(fFigureSubQuantityTargetPropertyCardinalitiesLabelFigure);

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
			if (c.isIsEssential() && !c.isIsImmutablePart())
				c.setIsImmutablePart(true);
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
			if (c.isIsInseparable() && !c.isIsImmutableWhole())
				c.setIsImmutableWhole(true);
			return c.isIsInseparable();
		}

		/**
		 * <!-- begin-user-doc -->
		 * Tests if all the Properties are readOnly.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected boolean testReadOnly(EList<Element> e) {
			for (int i = 0; i < e.size(); ++i)
				if (!((Property) e.get(i)).isIsReadOnly())
					return false;
			return true;
		}

		/**
		 * <!-- begin-user-doc -->
		 * Set all Properties isReadOnly attribute to true.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected void setReadOnlyTrue(EList<Element> e) {
			for (int i = 0; i < e.size(); ++i) {
				((Property) e.get(i)).setIsReadOnly(true);
			}
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
			if (c.isIsImmutablePart() && !testReadOnly(c.getTarget()))
				setReadOnlyTrue(c.getTarget());
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
			if (c.isIsImmutableWhole() && !testReadOnly(c.getSource()))
				setReadOnlyTrue(c.getSource());
			if (!c.isIsInseparable() && c.isIsImmutableWhole())
				return true;
			else
				return false;
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

			fFigureSubQuantityOfLabelFigure = new WrappingLabel();
			fFigureSubQuantityOfLabelFigure.setText("«subQuantityOf»");

			this.add(fFigureSubQuantityOfLabelFigure);

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

			fFigureSubQuantitySourcePropertyNameLabelFigure = new WrappingLabel();
			fFigureSubQuantitySourcePropertyNameLabelFigure.setText("");

			this.add(fFigureSubQuantitySourcePropertyNameLabelFigure);

			fFigureSubQuantitySourcePropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureSubQuantitySourcePropertyCardinalitiesLabelFigure
					.setText("");

			this.add(fFigureSubQuantitySourcePropertyCardinalitiesLabelFigure);

			fFigureSubQuantityTargetPropertyNameLabelFigure = new WrappingLabel();
			fFigureSubQuantityTargetPropertyNameLabelFigure.setText("");

			this.add(fFigureSubQuantityTargetPropertyNameLabelFigure);

			fFigureSubQuantityTargetPropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureSubQuantityTargetPropertyCardinalitiesLabelFigure
					.setText("");

			this.add(fFigureSubQuantityTargetPropertyCardinalitiesLabelFigure);

		}

		/**
		 * <!-- begin-user-doc -->
		 * Created to update the exhibition of the meta-attributes isEssential, isInseparable, isImmutablePart e isImmutableWhole.
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
		public WrappingLabel getFigureSubQuantityOfLabelFigure() {
			return fFigureSubQuantityOfLabelFigure;
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
		public WrappingLabel getFigureSubQuantitySourcePropertyNameLabelFigure() {
			return fFigureSubQuantitySourcePropertyNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubQuantitySourcePropertyCardinalitiesLabelFigure() {
			return fFigureSubQuantitySourcePropertyCardinalitiesLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubQuantityTargetPropertyNameLabelFigure() {
			return fFigureSubQuantityTargetPropertyNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubQuantityTargetPropertyCardinalitiesLabelFigure() {
			return fFigureSubQuantityTargetPropertyCardinalitiesLabelFigure;
		}

	}

}
