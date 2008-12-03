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

import OntoUML.Property;
import OntoUML.componentOf;

/**
 * @generated
 */
public class ComponentOfEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;

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
				new OntoUML.diagram.edit.policies.ComponentOfItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OntoUML.diagram.edit.parts.ComponentOfNameEditPart) {
			((OntoUML.diagram.edit.parts.ComponentOfNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureComponentOfNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel15EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel15EditPart) childEditPart)
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

	/**
	 * <!-- begin-user-doc -->
	 * Changed.
	 * <!-- end-user-doc -->
	 * @generated NOT
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
	public class ComponentOfFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureComponentOfNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureComponentOfMetaAttributesLabelFigure;

		/**
		 * @generated
		 */
		public ComponentOfFigure() {

			createContents();
			setSourceDecoration(createSourceDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureComponentOfNameLabelFigure = new WrappingLabel();
			fFigureComponentOfNameLabelFigure.setText("Name");

			this.add(fFigureComponentOfNameLabelFigure);

			fFigureComponentOfMetaAttributesLabelFigure = new WrappingLabel();
			fFigureComponentOfMetaAttributesLabelFigure.setText("{}");

			this.add(fFigureComponentOfMetaAttributesLabelFigure);

		}

		/**
		 * <!-- begin-user-doc -->
		 * Changed to receive ComponentOfEditPart.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public ComponentOfFigure(ComponentOfEditPart componentofeditpart) {

			createContents(componentofeditpart);
			setSourceDecoration(createSourceDecoration());
		}

		/**
		 * <!-- begin-user-doc -->
		 * Associate the correct decoration, depending on the attribute isEssential.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected boolean updateFaceIsEssential(
				ComponentOfEditPart componentofeditpart) {
			componentOf c = (componentOf) ((View) componentofeditpart
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
				ComponentOfEditPart componentofeditpart) {
			componentOf c = (componentOf) ((View) componentofeditpart
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
				ComponentOfEditPart componentofeditpart) {
			componentOf c = (componentOf) ((View) componentofeditpart
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
				ComponentOfEditPart componentofeditpart) {
			componentOf c = (componentOf) ((View) componentofeditpart
					.getModel()).getElement();
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
		private void createContents(ComponentOfEditPart componentofeditpart) {

			String text = new String("{");
			Boolean virgula = new Boolean(false);

			fFigureComponentOfNameLabelFigure = new WrappingLabel();
			fFigureComponentOfNameLabelFigure.setText("Name");

			this.add(fFigureComponentOfNameLabelFigure);

			fFigureComponentOfMetaAttributesLabelFigure = new WrappingLabel();
			if (updateFaceIsEssential(componentofeditpart)) {
				text = text.concat("essential");
				virgula = true;
			}
			if (updateFaceIsInseparable(componentofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("inseparable");
				virgula = true;

			}
			if (updateFaceIsImmutablePart(componentofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("immutable part");
				virgula = true;
			}
			if (updateFaceIsImmutableWhole(componentofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("immutable whole");
			}
			if (text.equals("{"))
				text = "";
			else
				text = text.concat("}");
			fFigureComponentOfMetaAttributesLabelFigure.setText(text);
			this.add(fFigureComponentOfMetaAttributesLabelFigure);

			componentOf c = (componentOf) ((View) componentofeditpart
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
		private void updateContents(ComponentOfEditPart componentofeditpart) {

			String text = new String("{");
			Boolean virgula = new Boolean(false);

			if (updateFaceIsEssential(componentofeditpart)) {
				text = text.concat("essential");
				virgula = true;
			}
			if (updateFaceIsInseparable(componentofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("inseparable");
				virgula = true;

			}
			if (updateFaceIsImmutablePart(componentofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("immutable part");
				virgula = true;
			}
			if (updateFaceIsImmutableWhole(componentofeditpart)) {
				if (virgula)
					text = text.concat(",");
				text = text.concat("immutable whole");
			}
			if (text.equals("{"))
				text = "";
			else
				text = text.concat("}");
			fFigureComponentOfMetaAttributesLabelFigure.setText(text);
			this.add(fFigureComponentOfMetaAttributesLabelFigure);
		}

		/**
		 * <!-- begin-user-doc -->
		 * Changed so that the meta-attribute isShareable set if the diamond will be empty or full.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		private RotatableDecoration createSourceDecoration() {
			OntoUML.diagram.edit.parts.ComponentOfCustomFigure df = new OntoUML.diagram.edit.parts.ComponentOfCustomFigure(
					ComponentOfEditPart.this);

			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureComponentOfNameLabelFigure() {
			return fFigureComponentOfNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureComponentOfMetaAttributesLabelFigure() {
			return fFigureComponentOfMetaAttributesLabelFigure;
		}

	}

}
