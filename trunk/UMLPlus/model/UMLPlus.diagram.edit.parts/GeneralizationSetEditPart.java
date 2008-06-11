package UMLPlus.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import UMLPlus.GeneralizationSet;
import UMLPlus.DatatypeAssociation;
import UMLPlus.Property;

/**
 * @generated
 */
public class GeneralizationSetEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1014;

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
	public GeneralizationSetEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy() {
					public Command getCommand(Request request) {
						if (understandsRequest(request)) {
							if (request instanceof CreateViewAndElementRequest) {
								CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
										.getViewAndElementDescriptor()
										.getCreateElementRequestAdapter();
								IElementType type = (IElementType) adapter
										.getAdapter(IElementType.class);
								if (type == UMLPlus.diagram.providers.UMLPlusElementTypes.Property_2014) {
									EditPart compartmentEditPart = getChildBySemanticHint(UMLPlus.diagram.part.UMLPlusVisualIDRegistry
											.getType(UMLPlus.diagram.edit.parts.GeneralizationSetAttributeCompartmentEditPart.VISUAL_ID));
									return compartmentEditPart == null ? null
											: compartmentEditPart
													.getCommand(request);
								}
							}
							return super.getCommand(request);
						}
						return null;
					}
				});

		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new UMLPlus.diagram.edit.policies.GeneralizationSetItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		ConstrainedToolbarLayoutEditPolicy lep = new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
					if (child instanceof ITextAwareEditPart) {
						return new UMLPlus.diagram.edit.policies.UMLPlusTextSelectionEditPolicy();
					}
				}
				return super.createChildEditPolicy(child);
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	// Alterei, colocando "this".
	protected IFigure createNodeShape() {
		GeneralizationSetFigure figure = new GeneralizationSetFigure(this);
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public GeneralizationSetFigure getPrimaryShape() {
		return (GeneralizationSetFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof UMLPlus.diagram.edit.parts.GeneralizationSetNameEditPart) {
			((UMLPlus.diagram.edit.parts.GeneralizationSetNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureGeneralizationSetNameLabelFigure());
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
		return getChildBySemanticHint(UMLPlus.diagram.part.UMLPlusVisualIDRegistry
				.getType(UMLPlus.diagram.edit.parts.GeneralizationSetNameEditPart.VISUAL_ID));
	}
	
	//Criei para atualizar a exibição dos meta-atributos
	protected void handleNotificationEvent(Notification event) {
		getPrimaryShape().updateContents(this);
		super.handleNotificationEvent(event);
	}

	/**
	 * @generated
	 */
	public class GeneralizationSetFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrapLabel fFigureGeneralizationSetMetaAttributesLabelFigure;
		/**
		 * @generated
		 */
		private WrapLabel fFigureGeneralizationSetNameLabelFigure;

		/**
		 * @generated
		 */
		public GeneralizationSetFigure(GeneralizationSetEditPart generalizationseteditpart) {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutThis.setSpacing(0);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

			createContents(generalizationseteditpart);
		}
		
		/** Associa a decoração correta, dependendo do atributo isCovering. */
		protected boolean updateFaceIsCovering(GeneralizationSetEditPart generalizationseteditpart) {
			GeneralizationSet g = (GeneralizationSet)((View)generalizationseteditpart.getModel()).getElement();
			return g.isIsCovering();
		}
		
		/** Associa a decoração correta, dependendo do atributo isDisjoint. */
		protected boolean updateFaceIsDisjoint(GeneralizationSetEditPart generalizationseteditpart) {
			GeneralizationSet g = (GeneralizationSet)((View)generalizationseteditpart.getModel()).getElement();
			return g.isIsDisjoint();
		}

		/**
		 * @generated
		 */
		// Alterei e adicionei as funções updateFaceIsCovering e updateFaceIsDisjoint.
		private void createContents(GeneralizationSetEditPart generalizationseteditpart) {

			fFigureGeneralizationSetNameLabelFigure = new WrapLabel();
			fFigureGeneralizationSetNameLabelFigure.setText("Name");

			this.add(fFigureGeneralizationSetNameLabelFigure);
			
			fFigureGeneralizationSetMetaAttributesLabelFigure = new WrapLabel();
			if (updateFaceIsCovering(generalizationseteditpart) && !updateFaceIsDisjoint(generalizationseteditpart))
			{
				fFigureGeneralizationSetMetaAttributesLabelFigure.setText("{complete}");
			}						
			else if (updateFaceIsDisjoint(generalizationseteditpart) && !updateFaceIsCovering(generalizationseteditpart))
			{
				fFigureGeneralizationSetMetaAttributesLabelFigure.setText("{disjoint}");
			}		
			else if (updateFaceIsDisjoint(generalizationseteditpart) && updateFaceIsCovering(generalizationseteditpart))
			{
				fFigureGeneralizationSetMetaAttributesLabelFigure.setText("{disjoint,complete}");
			}
			else {
				fFigureGeneralizationSetMetaAttributesLabelFigure.setText("");
			}
			this.add(fFigureGeneralizationSetMetaAttributesLabelFigure);
		}
		
		//Criei para atualizar a exibição dos meta-atributos isCovering e isDisjoint.
		private void updateContents(GeneralizationSetEditPart generalizationseteditpart) {
			if (updateFaceIsCovering(generalizationseteditpart) && !updateFaceIsDisjoint(generalizationseteditpart))
			{
				fFigureGeneralizationSetMetaAttributesLabelFigure.setText("{complete}");
			}						
			else if (updateFaceIsDisjoint(generalizationseteditpart) && !updateFaceIsCovering(generalizationseteditpart))
			{
				fFigureGeneralizationSetMetaAttributesLabelFigure.setText("{disjoint}");
			}		
			else if (updateFaceIsDisjoint(generalizationseteditpart) && updateFaceIsCovering(generalizationseteditpart))
			{
				fFigureGeneralizationSetMetaAttributesLabelFigure.setText("{disjoint,complete}");
			}
			else {
				fFigureGeneralizationSetMetaAttributesLabelFigure.setText("");
			}
			this.add(fFigureGeneralizationSetMetaAttributesLabelFigure);
			
			GeneralizationSet s = (GeneralizationSet)((View)generalizationseteditpart.getModel()).getElement();
			for(int i=0; i < s.getAttribute().size(); i++)
			{
				Property p1 = (Property)s.getAttribute().get(i);
				if(p1.getAttribute().size() >= 2)
				{
					DatatypeAssociation d = (DatatypeAssociation)p1.getAttribute().get(0);
					Property p2 = (Property)p1.getAttribute().get(1);
					d.setOwner(null);
					d.setContainer(s.getContainer());
					d.setName("Name");
					p1.setAssociationEnd(d);
					p1.setName("Name");
					p2.setAssociationEnd(d);
					p2.setOwner(d);
					p2.setName("Name");
				}
			}
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
		public WrapLabel getFigureGeneralizationSetMetaAttributesLabelFigure() {
			return fFigureGeneralizationSetMetaAttributesLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrapLabel getFigureGeneralizationSetNameLabelFigure() {
			return fFigureGeneralizationSetNameLabelFigure;
		}

	}

}
