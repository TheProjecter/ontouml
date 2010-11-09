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
import OntoUML.subCollectionOf;
import OntoUML.Property;

/**
 * @generated
 */
public class SubCollectionOfEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4010;

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
				new OntoUML.diagram.edit.policies.SubCollectionOfItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel23EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel23EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubCollectionOfLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.SubCollectionOfNameEditPart) {
			((OntoUML.diagram.edit.parts.SubCollectionOfNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubCollectionOfNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel24EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel24EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubCollectionOfMetaAttributesLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.SubCollectionOfSourcePropertyNameLabelEditPart) {
			((OntoUML.diagram.edit.parts.SubCollectionOfSourcePropertyNameLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubCollectionOfSourcePropertyNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.SubCollectionOfSourcePropertyCardinaliEditPart) {
			((OntoUML.diagram.edit.parts.SubCollectionOfSourcePropertyCardinaliEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubCollectionOfSourcePropertyCardinalitiesLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.SubCollectionOfTargetPropertyNameLabelEditPart) {
			((OntoUML.diagram.edit.parts.SubCollectionOfTargetPropertyNameLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubCollectionOfTargetPropertyNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.SubCollectionOfTargetPropertyCardinaliEditPart) {
			((OntoUML.diagram.edit.parts.SubCollectionOfTargetPropertyCardinaliEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubCollectionOfTargetPropertyCardinalitiesLabelFigure());
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
		return new SubCollectionOfFigure(this);
	}

	/**
	 * @generated
	 */
	public SubCollectionOfFigure getPrimaryShape() {
		return (SubCollectionOfFigure) getFigure();
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
	public class SubCollectionOfFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubCollectionOfLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubCollectionOfNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubCollectionOfMetaAttributesLabelFigure;

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubCollectionOfSourcePropertyNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubCollectionOfSourcePropertyCardinalitiesLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubCollectionOfTargetPropertyNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubCollectionOfTargetPropertyCardinalitiesLabelFigure;

		/**
		 * @generated
		 */
		public SubCollectionOfFigure() {

			createContents();
			setSourceDecoration(createSourceDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureSubCollectionOfLabelFigure = new WrappingLabel();
			fFigureSubCollectionOfLabelFigure.setText("«subCollectionOf»");

			this.add(fFigureSubCollectionOfLabelFigure);

			fFigureSubCollectionOfNameLabelFigure = new WrappingLabel();
			fFigureSubCollectionOfNameLabelFigure.setText("Name");

			this.add(fFigureSubCollectionOfNameLabelFigure);

			fFigureSubCollectionOfMetaAttributesLabelFigure = new WrappingLabel();
			fFigureSubCollectionOfMetaAttributesLabelFigure.setText("{}");

			this.add(fFigureSubCollectionOfMetaAttributesLabelFigure);

			fFigureSubCollectionOfSourcePropertyNameLabelFigure = new WrappingLabel();
			fFigureSubCollectionOfSourcePropertyNameLabelFigure.setText("");

			this.add(fFigureSubCollectionOfSourcePropertyNameLabelFigure);

			fFigureSubCollectionOfSourcePropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureSubCollectionOfSourcePropertyCardinalitiesLabelFigure
					.setText("");

			this
					.add(fFigureSubCollectionOfSourcePropertyCardinalitiesLabelFigure);

			fFigureSubCollectionOfTargetPropertyNameLabelFigure = new WrappingLabel();
			fFigureSubCollectionOfTargetPropertyNameLabelFigure.setText("");

			this.add(fFigureSubCollectionOfTargetPropertyNameLabelFigure);

			fFigureSubCollectionOfTargetPropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureSubCollectionOfTargetPropertyCardinalitiesLabelFigure
					.setText("");

			this
					.add(fFigureSubCollectionOfTargetPropertyCardinalitiesLabelFigure);

		}

		/**
		 * <!-- begin-user-doc -->
		 * Changed to receive SubCollectionOfEditPart.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public SubCollectionOfFigure(
				SubCollectionOfEditPart subcollectionofeditpart) {

			createContents(subcollectionofeditpart);
			setSourceDecoration(createSourceDecoration());
		}

		/**
		 * <!-- begin-user-doc -->
		 * Associate the correct decoration, depending on the attribute isEssential.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected boolean updateFaceIsEssential(
				SubCollectionOfEditPart subcollectionofeditpart) {
			subCollectionOf s = (subCollectionOf) ((View) subcollectionofeditpart
					.getModel()).getElement();
			if (s.isIsEssential() && !s.isIsImmutablePart())
				s.setIsImmutablePart(true);
			return s.isIsEssential();
		}

		/**
		 * <!-- begin-user-doc -->
		 * Associate the correct decoration, depending on the attribute isInseparable.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected boolean updateFaceIsInseparable(
				SubCollectionOfEditPart subcollectionofeditpart) {
			subCollectionOf s = (subCollectionOf) ((View) subcollectionofeditpart
					.getModel()).getElement();
			if (s.isIsInseparable() && !s.isIsImmutableWhole())
				s.setIsImmutableWhole(true);
			return s.isIsInseparable();
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
				SubCollectionOfEditPart subcollectionofeditpart) {
			subCollectionOf s = (subCollectionOf) ((View) subcollectionofeditpart
					.getModel()).getElement();
			if (s.isIsImmutablePart() && !testReadOnly(s.getTarget()))
				setReadOnlyTrue(s.getTarget());
			if (!s.isIsEssential() && s.isIsImmutablePart())
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
				SubCollectionOfEditPart subcollectionofeditpart) {
			subCollectionOf s = (subCollectionOf) ((View) subcollectionofeditpart
					.getModel()).getElement();
			if (s.isIsImmutableWhole() && !testReadOnly(s.getSource()))
				setReadOnlyTrue(s.getSource());
			if (!s.isIsInseparable() && s.isIsImmutableWhole())
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
		private void createContents(
				SubCollectionOfEditPart subcollectionofeditpart) {

			String text = new String("{");
			Boolean virgula = new Boolean(false);

			fFigureSubCollectionOfLabelFigure = new WrappingLabel();
			fFigureSubCollectionOfLabelFigure.setText("«subCollectionOf»");

			this.add(fFigureSubCollectionOfLabelFigure);

			fFigureSubCollectionOfNameLabelFigure = new WrappingLabel();
			fFigureSubCollectionOfNameLabelFigure.setText("Name");

			this.add(fFigureSubCollectionOfNameLabelFigure);

			fFigureSubCollectionOfMetaAttributesLabelFigure = new WrappingLabel();
			if (updateFaceIsEssential(subcollectionofeditpart)) {
				text = text.concat("essential");
				virgula = true;
			}
			if (updateFaceIsInseparable(subcollectionofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("inseparable");
				virgula = true;

			}
			if (updateFaceIsImmutablePart(subcollectionofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("immutable part");
				virgula = true;
			}
			if (updateFaceIsImmutableWhole(subcollectionofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("immutable whole");
			}
			if (text.equals("{"))
				text = "";
			else
				text = text.concat("}");
			fFigureSubCollectionOfMetaAttributesLabelFigure.setText(text);
			this.add(fFigureSubCollectionOfMetaAttributesLabelFigure);

			fFigureSubCollectionOfSourcePropertyNameLabelFigure = new WrappingLabel();
			fFigureSubCollectionOfSourcePropertyNameLabelFigure.setText("");

			this.add(fFigureSubCollectionOfSourcePropertyNameLabelFigure);

			fFigureSubCollectionOfSourcePropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureSubCollectionOfSourcePropertyCardinalitiesLabelFigure
					.setText("");

			this
					.add(fFigureSubCollectionOfSourcePropertyCardinalitiesLabelFigure);

			fFigureSubCollectionOfTargetPropertyNameLabelFigure = new WrappingLabel();
			fFigureSubCollectionOfTargetPropertyNameLabelFigure.setText("");

			this.add(fFigureSubCollectionOfTargetPropertyNameLabelFigure);

			fFigureSubCollectionOfTargetPropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureSubCollectionOfTargetPropertyCardinalitiesLabelFigure
					.setText("");

			this
					.add(fFigureSubCollectionOfTargetPropertyCardinalitiesLabelFigure);

		}

		/**
		 * <!-- begin-user-doc -->
		 * Created to update the exhibition of the meta-attributes isEssential, isInseparable, isImmutablePart e isImmutableWhole.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		private void updateContents(
				SubCollectionOfEditPart subcollectionofeditpart) {

			String text = new String("{");
			Boolean virgula = new Boolean(false);

			if (updateFaceIsEssential(subcollectionofeditpart)) {
				text = text.concat("essential");
				virgula = true;
			}
			if (updateFaceIsInseparable(subcollectionofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("inseparable");
				virgula = true;

			}
			if (updateFaceIsImmutablePart(subcollectionofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("immutable part");
				virgula = true;
			}
			if (updateFaceIsImmutableWhole(subcollectionofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("immutable whole");
			}
			if (text.equals("{"))
				text = "";
			else
				text = text.concat("}");
			fFigureSubCollectionOfMetaAttributesLabelFigure.setText(text);
			this.add(fFigureSubCollectionOfMetaAttributesLabelFigure);
		}

		/**
		 * <!-- begin-user-doc -->
		 * Changed so that the meta-attribute isShareable set if the diamond will be empty or full.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		private RotatableDecoration createSourceDecoration() {
			OntoUML.diagram.edit.parts.SubCollectionOfCustomFigure df = new OntoUML.diagram.edit.parts.SubCollectionOfCustomFigure(
					SubCollectionOfEditPart.this);

			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubCollectionOfLabelFigure() {
			return fFigureSubCollectionOfLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubCollectionOfNameLabelFigure() {
			return fFigureSubCollectionOfNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubCollectionOfMetaAttributesLabelFigure() {
			return fFigureSubCollectionOfMetaAttributesLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubCollectionOfSourcePropertyNameLabelFigure() {
			return fFigureSubCollectionOfSourcePropertyNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubCollectionOfSourcePropertyCardinalitiesLabelFigure() {
			return fFigureSubCollectionOfSourcePropertyCardinalitiesLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubCollectionOfTargetPropertyNameLabelFigure() {
			return fFigureSubCollectionOfTargetPropertyNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubCollectionOfTargetPropertyCardinalitiesLabelFigure() {
			return fFigureSubCollectionOfTargetPropertyCardinalitiesLabelFigure;
		}

	}

}
