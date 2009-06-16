package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import OntoUML.Property;

/**
 * @generated
 */
public class PropertyEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2016;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public PropertyEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new OntoUML.diagram.edit.policies.PropertyItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Changed.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected IFigure createNodeShape() {
		PropertyEndFigure figure = new PropertyEndFigure(this);
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public PropertyEndFigure getPrimaryShape() {
		return (PropertyEndFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OntoUML.diagram.edit.parts.PropertyNameEditPart) {
			((OntoUML.diagram.edit.parts.PropertyNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigurePropertyEndNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.PropertyLowerUpperEditPart) {
			((OntoUML.diagram.edit.parts.PropertyLowerUpperEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigurePropertyEndCardinalitiesLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

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
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {

		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode()
				.DPtoLP(40), getMapMode().DPtoLP(40));
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(getMapMode().DPtoLP(5));
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(OntoUML.diagram.part.OntoUMLVisualIDRegistry
				.getType(OntoUML.diagram.edit.parts.PropertyNameEditPart.VISUAL_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Created to update the cardinalities of Property.
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
	public class PropertyEndFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePropertyEndCardinalitiesLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePropertyEndNameLabelFigure;

		/**
		 * @generated
		 */
		public PropertyEndFigure() {
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigurePropertyEndCardinalitiesLabelFigure = new WrappingLabel();
			fFigurePropertyEndCardinalitiesLabelFigure.setText("end");

			this.add(fFigurePropertyEndCardinalitiesLabelFigure);

			fFigurePropertyEndNameLabelFigure = new WrappingLabel();
			fFigurePropertyEndNameLabelFigure.setText("");

			this.add(fFigurePropertyEndNameLabelFigure);

		}

		/**
		 * <!-- begin-user-doc -->
		 * Changed to receive PropertyEditPart.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public PropertyEndFigure(PropertyEditPart propertyeditpart) {
			this.setOutline(false);
			createContents(propertyeditpart);
		}

		/**
		 * <!-- begin-user-doc -->
		 * Changed.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		private void createContents(PropertyEditPart propertyeditpart) {

			String text = new String("");

			Property p = (Property) ((View) propertyeditpart.getModel())
					.getElement();

			fFigurePropertyEndNameLabelFigure = new WrappingLabel();
			fFigurePropertyEndNameLabelFigure.setText("");

			this.add(fFigurePropertyEndNameLabelFigure);

			fFigurePropertyEndCardinalitiesLabelFigure = new WrappingLabel();

			if (p.getLower() == -1) {
				if (p.getUpper() == -1)
					text = "*..*";
				else
					text = "*.." + Integer.toString(p.getUpper());
			} else {
				if ((p.getLower() == 0) && (p.getUpper() == -1))
					text = "*";
				else {
					if (p.getLower() == p.getUpper())
						text = Integer.toString(p.getLower());
					else {
						if (p.getUpper() == -1)
							text = Integer.toString(p.getLower()) + "..*";
						else
							text = Integer.toString(p.getLower()) + ".."
									+ Integer.toString(p.getUpper());
					}
				}
			}

			fFigurePropertyEndCardinalitiesLabelFigure.setText(text);
			this.add(fFigurePropertyEndCardinalitiesLabelFigure);

		}

		/**
		 * <!-- begin-user-doc -->
		 * Created to update the exhibition of the cardinalities of Property.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		private void updateContents(PropertyEditPart propertyeditpart) {

			String text = new String("");

			Property p = (Property) ((View) propertyeditpart.getModel())
					.getElement();

			if (p.getLower() == -1) {
				if (p.getUpper() == -1)
					text = "*..*";
				else
					text = "*.." + Integer.toString(p.getUpper());
			} else {
				if ((p.getLower() == 0) && (p.getUpper() == -1))
					text = "*";
				else {
					if (p.getLower() == p.getUpper())
						text = Integer.toString(p.getLower());
					else {
						if (p.getUpper() == -1)
							text = Integer.toString(p.getLower()) + "..*";
						else
							text = Integer.toString(p.getLower()) + ".."
									+ Integer.toString(p.getUpper());
					}
				}
			}

			fFigurePropertyEndCardinalitiesLabelFigure.setText(text);
			this.add(fFigurePropertyEndCardinalitiesLabelFigure);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePropertyEndCardinalitiesLabelFigure() {
			return fFigurePropertyEndCardinalitiesLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePropertyEndNameLabelFigure() {
			return fFigurePropertyEndNameLabelFigure;
		}

	}

}