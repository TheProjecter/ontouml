package OntoUML.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class OntoUMLModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof OntoUML.diagram.edit.parts.CategoryEditPart) {
			List types = new ArrayList();
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.Property_3028);
			return types;
		}
		if (editPart instanceof OntoUML.diagram.edit.parts.CollectiveEditPart) {
			List types = new ArrayList();
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.Property_3029);
			return types;
		}
		if (editPart instanceof OntoUML.diagram.edit.parts.KindEditPart) {
			List types = new ArrayList();
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.Property_3030);
			return types;
		}
		if (editPart instanceof OntoUML.diagram.edit.parts.MixinEditPart) {
			List types = new ArrayList();
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.Property_3031);
			return types;
		}
		if (editPart instanceof OntoUML.diagram.edit.parts.ModeEditPart) {
			List types = new ArrayList();
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.Property_3032);
			return types;
		}
		if (editPart instanceof OntoUML.diagram.edit.parts.PhaseEditPart) {
			List types = new ArrayList();
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.Property_3033);
			return types;
		}
		if (editPart instanceof OntoUML.diagram.edit.parts.QuantityEditPart) {
			List types = new ArrayList();
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.Property_3034);
			return types;
		}
		if (editPart instanceof OntoUML.diagram.edit.parts.RelatorEditPart) {
			List types = new ArrayList();
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.Property_3035);
			return types;
		}
		if (editPart instanceof OntoUML.diagram.edit.parts.RoleEditPart) {
			List types = new ArrayList();
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.Property_3036);
			return types;
		}
		if (editPart instanceof OntoUML.diagram.edit.parts.RoleMixinEditPart) {
			List types = new ArrayList();
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.Property_3037);
			return types;
		}
		if (editPart instanceof OntoUML.diagram.edit.parts.SimpleDatatypeEditPart) {
			List types = new ArrayList();
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.Property_3038);
			return types;
		}
		if (editPart instanceof OntoUML.diagram.edit.parts.StructuralDatatypeEditPart) {
			List types = new ArrayList();
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.Property_3039);
			return types;
		}
		if (editPart instanceof OntoUML.diagram.edit.parts.SubKindEditPart) {
			List types = new ArrayList();
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.Property_3040);
			return types;
		}
		if (editPart instanceof OntoUML.diagram.edit.parts.ContainerEditPart) {
			List types = new ArrayList();
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.Category_2001);
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.Collective_2002);
			types.add(OntoUML.diagram.providers.OntoUMLElementTypes.Kind_2003);
			types.add(OntoUML.diagram.providers.OntoUMLElementTypes.Mixin_2004);
			types.add(OntoUML.diagram.providers.OntoUMLElementTypes.Mode_2005);
			types.add(OntoUML.diagram.providers.OntoUMLElementTypes.Phase_2006);
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.Quantity_2007);
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.Relator_2008);
			types.add(OntoUML.diagram.providers.OntoUMLElementTypes.Role_2009);
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.RoleMixin_2010);
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.SimpleDatatype_2011);
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.StructuralDatatype_2012);
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.SubKind_2013);
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.GeneralizationSet_2014);
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.DerivationRule_2015);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof OntoUML.diagram.edit.parts.DerivationRuleEditPart) {
			List types = new ArrayList();
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.BinaryAssociationAtom_4015);
			types
					.add(OntoUML.diagram.providers.OntoUMLElementTypes.ClassifierAtom_4018);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof OntoUML.diagram.edit.parts.DerivationRuleEditPart) {
			List types = new ArrayList();
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof OntoUML.diagram.edit.parts.DerivationRuleEditPart) {
			List types = new ArrayList();
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog
				.setMessage(OntoUML.diagram.part.Messages.OntoUMLModelingAssistantProviderMessage);
		dialog
				.setTitle(OntoUML.diagram.part.Messages.OntoUMLModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
