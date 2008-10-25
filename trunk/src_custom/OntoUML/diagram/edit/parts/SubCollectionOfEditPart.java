package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import OntoUML.subCollectionOf;
import OntoUML.Property;
import OntoUML.diagram.providers.OntoUMLEditPartProvider;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;

/**
 * @generated NOT
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
		if (childEditPart instanceof OntoUML.diagram.edit.parts.SubCollectionOfNameEditPart) {
			((OntoUML.diagram.edit.parts.SubCollectionOfNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubCollectionOfNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel20EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel20EditPart) childEditPart)
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
	public class SubCollectionOfFigure extends PolylineConnectionEx {

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
		public SubCollectionOfFigure() {

			createContents();
			setSourceDecoration(createSourceDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureSubCollectionOfNameLabelFigure = new WrappingLabel();
			fFigureSubCollectionOfNameLabelFigure.setText("Name");

			this.add(fFigureSubCollectionOfNameLabelFigure);

			fFigureSubCollectionOfMetaAttributesLabelFigure = new WrappingLabel();
			fFigureSubCollectionOfMetaAttributesLabelFigure.setText("{}");

			this.add(fFigureSubCollectionOfMetaAttributesLabelFigure);

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
			return s.isIsInseparable();
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

			subCollectionOf s = (subCollectionOf) ((View) subcollectionofeditpart
					.getModel()).getElement();
			if (!s.getSource().isEmpty())
				((Property) s.getSource().get(0))
						.setContainer(s.getContainer());
			if (!s.getTarget().isEmpty())
				((Property) s.getTarget().get(0))
						.setContainer(s.getContainer());
		}

		/**
		 * <!-- begin-user-doc -->
		 * Created to update the exibition of the meta-attributes isEssential, isInseparable, isImmutablePart e isImmutableWhole.
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
		public WrappingLabel getFigureSubCollectionOfNameLabelFigure() {
			return fFigureSubCollectionOfNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubCollectionOfMetaAttributesLabelFigure() {
			return fFigureSubCollectionOfMetaAttributesLabelFigure;
		}

	}

}
