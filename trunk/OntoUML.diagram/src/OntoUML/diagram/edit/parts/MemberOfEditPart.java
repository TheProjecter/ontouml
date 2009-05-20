package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import OntoUML.Property;
import OntoUML.memberOf;

/**
 * @generated
 */
public class MemberOfEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4009;

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
					.setLabel(getPrimaryShape().getFigureMemberOfLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel19EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel19EditPart) childEditPart)
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

	/**
	 * <!-- begin-user-doc -->
	 * Changed.
	 * <!-- end-user-doc -->
	 * @generated NOT
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
	public class MemberOfFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMemberOfLabelFigure;
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
		public MemberOfFigure() {

			createContents();
			setSourceDecoration(createSourceDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureMemberOfLabelFigure = new WrappingLabel();
			fFigureMemberOfLabelFigure.setText("«memberOf»");

			this.add(fFigureMemberOfLabelFigure);

			fFigureMemberOfNameLabelFigure = new WrappingLabel();
			fFigureMemberOfNameLabelFigure.setText("Name");

			this.add(fFigureMemberOfNameLabelFigure);

			fFigureMemberOfMetaAttributesLabelFigure = new WrappingLabel();
			fFigureMemberOfMetaAttributesLabelFigure.setText("{}");

			this.add(fFigureMemberOfMetaAttributesLabelFigure);

		}

		/**
		 * <!-- begin-user-doc -->
		 * Changed to receive MemberOfEditPart.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public MemberOfFigure(MemberOfEditPart memberofeditpart) {

			createContents(memberofeditpart);
			setSourceDecoration(createSourceDecoration());
		}

		/**
		 * <!-- begin-user-doc -->
		 * Associate the correct decoration, depending on the attribute isEssential.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected boolean updateFaceIsEssential(
				MemberOfEditPart memberofeditpart) {
			memberOf m = (memberOf) ((View) memberofeditpart.getModel())
					.getElement();
			return m.isIsEssential();
		}

		/**
		 * <!-- begin-user-doc -->
		 * Associate the correct decoration, depending on the attribute isInseparable.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected boolean updateFaceIsInseparable(
				MemberOfEditPart memberofeditpart) {
			memberOf m = (memberOf) ((View) memberofeditpart.getModel())
					.getElement();
			return m.isIsInseparable();
		}

		/**
		 * <!-- begin-user-doc -->
		 * Associate the correct decoration, depending on the attributes isEssential and isImmutablePart.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected boolean updateFaceIsImmutablePart(
				MemberOfEditPart memberofeditpart) {
			memberOf m = (memberOf) ((View) memberofeditpart.getModel())
					.getElement();
			if (!m.isIsEssential() && m.isIsImmutablePart())
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
				MemberOfEditPart memberofeditpart) {
			memberOf m = (memberOf) ((View) memberofeditpart.getModel())
					.getElement();
			if (!m.isIsInseparable() && m.isIsImmutableWhole())
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
		private void createContents(MemberOfEditPart memberofeditpart) {

			String text = new String("{");
			Boolean virgula = new Boolean(false);

			fFigureMemberOfLabelFigure = new WrappingLabel();
			fFigureMemberOfLabelFigure.setText("«memberOf»");

			this.add(fFigureMemberOfLabelFigure);

			fFigureMemberOfNameLabelFigure = new WrappingLabel();
			fFigureMemberOfNameLabelFigure.setText("Name");

			this.add(fFigureMemberOfNameLabelFigure);

			fFigureMemberOfMetaAttributesLabelFigure = new WrappingLabel();
			if (updateFaceIsEssential(memberofeditpart)) {
				text = text.concat("essential");
				virgula = true;
			}
			if (updateFaceIsInseparable(memberofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("inseparable");
				virgula = true;

			}
			if (updateFaceIsImmutablePart(memberofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("immutable part");
				virgula = true;
			}
			if (updateFaceIsImmutableWhole(memberofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("immutable whole");
			}
			if (text.equals("{"))
				text = "";
			else
				text = text.concat("}");
			fFigureMemberOfMetaAttributesLabelFigure.setText(text);
			this.add(fFigureMemberOfMetaAttributesLabelFigure);

			memberOf m = (memberOf) ((View) memberofeditpart.getModel())
					.getElement();
			if (!m.getSource().isEmpty())
				((Property) m.getSource().get(0))
						.setContainer(m.getContainer());
			if (!m.getTarget().isEmpty())
				((Property) m.getTarget().get(0))
						.setContainer(m.getContainer());
		}

		/**
		 * <!-- begin-user-doc -->
		 * Created to update the exhibition of the meta-attributes isEssential, isInseparable, isImmutablePart e isImmutableWhole.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		private void updateContents(MemberOfEditPart memberofeditpart) {

			String text = new String("{");
			Boolean virgula = new Boolean(false);

			if (updateFaceIsEssential(memberofeditpart)) {
				text = text.concat("essential");
				virgula = true;
			}
			if (updateFaceIsInseparable(memberofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("inseparable");
				virgula = true;

			}
			if (updateFaceIsImmutablePart(memberofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("immutable part");
				virgula = true;
			}
			if (updateFaceIsImmutableWhole(memberofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("immutable whole");
			}
			if (text.equals("{"))
				text = "";
			else
				text = text.concat("}");
			fFigureMemberOfMetaAttributesLabelFigure.setText(text);
			this.add(fFigureMemberOfMetaAttributesLabelFigure);
		}

		/**
		 * <!-- begin-user-doc -->
		 * Changed so that the meta-attribute isShareable set if the diamond will be empty or full.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		private RotatableDecoration createSourceDecoration() {
			OntoUML.diagram.edit.parts.MemberOfCustomFigure df = new OntoUML.diagram.edit.parts.MemberOfCustomFigure(
					MemberOfEditPart.this);

			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMemberOfLabelFigure() {
			return fFigureMemberOfLabelFigure;
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
