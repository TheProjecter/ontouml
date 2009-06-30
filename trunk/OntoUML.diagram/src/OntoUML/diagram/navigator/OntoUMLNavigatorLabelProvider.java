package OntoUML.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class OntoUMLNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		OntoUML.diagram.part.OntoUMLDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		OntoUML.diagram.part.OntoUMLDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof OntoUML.diagram.navigator.OntoUMLNavigatorItem
				&& !isOwnView(((OntoUML.diagram.navigator.OntoUMLNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof OntoUML.diagram.navigator.OntoUMLNavigatorGroup) {
			OntoUML.diagram.navigator.OntoUMLNavigatorGroup group = (OntoUML.diagram.navigator.OntoUMLNavigatorGroup) element;
			return OntoUML.diagram.part.OntoUMLDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof OntoUML.diagram.navigator.OntoUMLNavigatorItem) {
			OntoUML.diagram.navigator.OntoUMLNavigatorItem navigatorItem = (OntoUML.diagram.navigator.OntoUMLNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (OntoUML.diagram.part.OntoUMLVisualIDRegistry.getVisualID(view)) {
		case OntoUML.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?OntoUML?Container", OntoUML.diagram.providers.OntoUMLElementTypes.Container_1000); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.CategoryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?OntoUML?Category", OntoUML.diagram.providers.OntoUMLElementTypes.Category_2001); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.CollectiveEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?OntoUML?Collective", OntoUML.diagram.providers.OntoUMLElementTypes.Collective_2002); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.KindEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?OntoUML?Kind", OntoUML.diagram.providers.OntoUMLElementTypes.Kind_2003); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.MixinEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?OntoUML?Mixin", OntoUML.diagram.providers.OntoUMLElementTypes.Mixin_2004); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.ModeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?OntoUML?Mode", OntoUML.diagram.providers.OntoUMLElementTypes.Mode_2005); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.PhaseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?OntoUML?Phase", OntoUML.diagram.providers.OntoUMLElementTypes.Phase_2006); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.QuantityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?OntoUML?Quantity", OntoUML.diagram.providers.OntoUMLElementTypes.Quantity_2007); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.RelatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?OntoUML?Relator", OntoUML.diagram.providers.OntoUMLElementTypes.Relator_2008); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?OntoUML?Role", OntoUML.diagram.providers.OntoUMLElementTypes.Role_2009); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.RoleMixinEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?OntoUML?RoleMixin", OntoUML.diagram.providers.OntoUMLElementTypes.RoleMixin_2010); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.SimpleDatatypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?OntoUML?SimpleDatatype", OntoUML.diagram.providers.OntoUMLElementTypes.SimpleDatatype_2011); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.StructuralDatatypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?OntoUML?StructuralDatatype", OntoUML.diagram.providers.OntoUMLElementTypes.StructuralDatatype_2012); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.SubKindEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?OntoUML?SubKind", OntoUML.diagram.providers.OntoUMLElementTypes.SubKind_2013); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.GeneralizationSetEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?OntoUML?GeneralizationSet", OntoUML.diagram.providers.OntoUMLElementTypes.GeneralizationSet_2014); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.DerivationRuleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?OntoUML.URML?DerivationRule", OntoUML.diagram.providers.OntoUMLElementTypes.DerivationRule_2015); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.PropertyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?OntoUML?Property", OntoUML.diagram.providers.OntoUMLElementTypes.Property_3028); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.Property2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?OntoUML?Property", OntoUML.diagram.providers.OntoUMLElementTypes.Property_3029); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.Property3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?OntoUML?Property", OntoUML.diagram.providers.OntoUMLElementTypes.Property_3030); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.Property4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?OntoUML?Property", OntoUML.diagram.providers.OntoUMLElementTypes.Property_3031); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.Property5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?OntoUML?Property", OntoUML.diagram.providers.OntoUMLElementTypes.Property_3032); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.Property6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?OntoUML?Property", OntoUML.diagram.providers.OntoUMLElementTypes.Property_3033); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.Property7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?OntoUML?Property", OntoUML.diagram.providers.OntoUMLElementTypes.Property_3034); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.Property8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?OntoUML?Property", OntoUML.diagram.providers.OntoUMLElementTypes.Property_3035); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.Property9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?OntoUML?Property", OntoUML.diagram.providers.OntoUMLElementTypes.Property_3036); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.Property10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?OntoUML?Property", OntoUML.diagram.providers.OntoUMLElementTypes.Property_3037); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.Property11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?OntoUML?Property", OntoUML.diagram.providers.OntoUMLElementTypes.Property_3038); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.Property12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?OntoUML?Property", OntoUML.diagram.providers.OntoUMLElementTypes.Property_3039); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.Property13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?OntoUML?Property", OntoUML.diagram.providers.OntoUMLElementTypes.Property_3040); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.CharacterizationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?OntoUML?Characterization", OntoUML.diagram.providers.OntoUMLElementTypes.Characterization_4001); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.ComponentOfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?OntoUML?componentOf", OntoUML.diagram.providers.OntoUMLElementTypes.ComponentOf_4002); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.DatatypeRelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?OntoUML?DatatypeRelationship", OntoUML.diagram.providers.OntoUMLElementTypes.DatatypeRelationship_4019); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.DerivationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?OntoUML?Derivation", OntoUML.diagram.providers.OntoUMLElementTypes.Derivation_4004); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.FormalAssociationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?OntoUML?FormalAssociation", OntoUML.diagram.providers.OntoUMLElementTypes.FormalAssociation_4005); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?OntoUML?Generalization", OntoUML.diagram.providers.OntoUMLElementTypes.Generalization_4006); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.MaterialAssociationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?OntoUML?MaterialAssociation", OntoUML.diagram.providers.OntoUMLElementTypes.MaterialAssociation_4007); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.MediationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?OntoUML?Mediation", OntoUML.diagram.providers.OntoUMLElementTypes.Mediation_4008); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.MemberOfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?OntoUML?memberOf", OntoUML.diagram.providers.OntoUMLElementTypes.MemberOf_4009); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.SubCollectionOfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?OntoUML?subCollectionOf", OntoUML.diagram.providers.OntoUMLElementTypes.SubCollectionOf_4010); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.SubQuantityOfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?OntoUML?subQuantityOf", OntoUML.diagram.providers.OntoUMLElementTypes.SubQuantityOf_4011); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.BinaryAssociationAtomEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?OntoUML.URML?BinaryAssociationAtom", OntoUML.diagram.providers.OntoUMLElementTypes.BinaryAssociationAtom_4013); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.BinaryAssociationAtom2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?OntoUML.URML?BinaryAssociationAtom", OntoUML.diagram.providers.OntoUMLElementTypes.BinaryAssociationAtom_4014); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.BinaryAssociationAtom3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?OntoUML.URML?BinaryAssociationAtom", OntoUML.diagram.providers.OntoUMLElementTypes.BinaryAssociationAtom_4015); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.ClassifierAtomEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?OntoUML.URML?ClassifierAtom", OntoUML.diagram.providers.OntoUMLElementTypes.ClassifierAtom_4016); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.ClassifierAtom2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?OntoUML.URML?ClassifierAtom", OntoUML.diagram.providers.OntoUMLElementTypes.ClassifierAtom_4017); //$NON-NLS-1$
		case OntoUML.diagram.edit.parts.ClassifierAtom3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?OntoUML.URML?ClassifierAtom", OntoUML.diagram.providers.OntoUMLElementTypes.ClassifierAtom_4018); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = OntoUML.diagram.part.OntoUMLDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& OntoUML.diagram.providers.OntoUMLElementTypes
						.isKnownElementType(elementType)) {
			image = OntoUML.diagram.providers.OntoUMLElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof OntoUML.diagram.navigator.OntoUMLNavigatorGroup) {
			OntoUML.diagram.navigator.OntoUMLNavigatorGroup group = (OntoUML.diagram.navigator.OntoUMLNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof OntoUML.diagram.navigator.OntoUMLNavigatorItem) {
			OntoUML.diagram.navigator.OntoUMLNavigatorItem navigatorItem = (OntoUML.diagram.navigator.OntoUMLNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (OntoUML.diagram.part.OntoUMLVisualIDRegistry.getVisualID(view)) {
		case OntoUML.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
			return getContainer_1000Text(view);
		case OntoUML.diagram.edit.parts.CategoryEditPart.VISUAL_ID:
			return getCategory_2001Text(view);
		case OntoUML.diagram.edit.parts.CollectiveEditPart.VISUAL_ID:
			return getCollective_2002Text(view);
		case OntoUML.diagram.edit.parts.KindEditPart.VISUAL_ID:
			return getKind_2003Text(view);
		case OntoUML.diagram.edit.parts.MixinEditPart.VISUAL_ID:
			return getMixin_2004Text(view);
		case OntoUML.diagram.edit.parts.ModeEditPart.VISUAL_ID:
			return getMode_2005Text(view);
		case OntoUML.diagram.edit.parts.PhaseEditPart.VISUAL_ID:
			return getPhase_2006Text(view);
		case OntoUML.diagram.edit.parts.QuantityEditPart.VISUAL_ID:
			return getQuantity_2007Text(view);
		case OntoUML.diagram.edit.parts.RelatorEditPart.VISUAL_ID:
			return getRelator_2008Text(view);
		case OntoUML.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_2009Text(view);
		case OntoUML.diagram.edit.parts.RoleMixinEditPart.VISUAL_ID:
			return getRoleMixin_2010Text(view);
		case OntoUML.diagram.edit.parts.SimpleDatatypeEditPart.VISUAL_ID:
			return getSimpleDatatype_2011Text(view);
		case OntoUML.diagram.edit.parts.StructuralDatatypeEditPart.VISUAL_ID:
			return getStructuralDatatype_2012Text(view);
		case OntoUML.diagram.edit.parts.SubKindEditPart.VISUAL_ID:
			return getSubKind_2013Text(view);
		case OntoUML.diagram.edit.parts.GeneralizationSetEditPart.VISUAL_ID:
			return getGeneralizationSet_2014Text(view);
		case OntoUML.diagram.edit.parts.DerivationRuleEditPart.VISUAL_ID:
			return getDerivationRule_2015Text(view);
		case OntoUML.diagram.edit.parts.PropertyEditPart.VISUAL_ID:
			return getProperty_3028Text(view);
		case OntoUML.diagram.edit.parts.Property2EditPart.VISUAL_ID:
			return getProperty_3029Text(view);
		case OntoUML.diagram.edit.parts.Property3EditPart.VISUAL_ID:
			return getProperty_3030Text(view);
		case OntoUML.diagram.edit.parts.Property4EditPart.VISUAL_ID:
			return getProperty_3031Text(view);
		case OntoUML.diagram.edit.parts.Property5EditPart.VISUAL_ID:
			return getProperty_3032Text(view);
		case OntoUML.diagram.edit.parts.Property6EditPart.VISUAL_ID:
			return getProperty_3033Text(view);
		case OntoUML.diagram.edit.parts.Property7EditPart.VISUAL_ID:
			return getProperty_3034Text(view);
		case OntoUML.diagram.edit.parts.Property8EditPart.VISUAL_ID:
			return getProperty_3035Text(view);
		case OntoUML.diagram.edit.parts.Property9EditPart.VISUAL_ID:
			return getProperty_3036Text(view);
		case OntoUML.diagram.edit.parts.Property10EditPart.VISUAL_ID:
			return getProperty_3037Text(view);
		case OntoUML.diagram.edit.parts.Property11EditPart.VISUAL_ID:
			return getProperty_3038Text(view);
		case OntoUML.diagram.edit.parts.Property12EditPart.VISUAL_ID:
			return getProperty_3039Text(view);
		case OntoUML.diagram.edit.parts.Property13EditPart.VISUAL_ID:
			return getProperty_3040Text(view);
		case OntoUML.diagram.edit.parts.CharacterizationEditPart.VISUAL_ID:
			return getCharacterization_4001Text(view);
		case OntoUML.diagram.edit.parts.ComponentOfEditPart.VISUAL_ID:
			return getComponentOf_4002Text(view);
		case OntoUML.diagram.edit.parts.DatatypeRelationshipEditPart.VISUAL_ID:
			return getDatatypeRelationship_4019Text(view);
		case OntoUML.diagram.edit.parts.DerivationEditPart.VISUAL_ID:
			return getDerivation_4004Text(view);
		case OntoUML.diagram.edit.parts.FormalAssociationEditPart.VISUAL_ID:
			return getFormalAssociation_4005Text(view);
		case OntoUML.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4006Text(view);
		case OntoUML.diagram.edit.parts.MaterialAssociationEditPart.VISUAL_ID:
			return getMaterialAssociation_4007Text(view);
		case OntoUML.diagram.edit.parts.MediationEditPart.VISUAL_ID:
			return getMediation_4008Text(view);
		case OntoUML.diagram.edit.parts.MemberOfEditPart.VISUAL_ID:
			return getMemberOf_4009Text(view);
		case OntoUML.diagram.edit.parts.SubCollectionOfEditPart.VISUAL_ID:
			return getSubCollectionOf_4010Text(view);
		case OntoUML.diagram.edit.parts.SubQuantityOfEditPart.VISUAL_ID:
			return getSubQuantityOf_4011Text(view);
		case OntoUML.diagram.edit.parts.BinaryAssociationAtomEditPart.VISUAL_ID:
			return getBinaryAssociationAtom_4013Text(view);
		case OntoUML.diagram.edit.parts.BinaryAssociationAtom2EditPart.VISUAL_ID:
			return getBinaryAssociationAtom_4014Text(view);
		case OntoUML.diagram.edit.parts.BinaryAssociationAtom3EditPart.VISUAL_ID:
			return getBinaryAssociationAtom_4015Text(view);
		case OntoUML.diagram.edit.parts.ClassifierAtomEditPart.VISUAL_ID:
			return getClassifierAtom_4016Text(view);
		case OntoUML.diagram.edit.parts.ClassifierAtom2EditPart.VISUAL_ID:
			return getClassifierAtom_4017Text(view);
		case OntoUML.diagram.edit.parts.ClassifierAtom3EditPart.VISUAL_ID:
			return getClassifierAtom_4018Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getContainer_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCategory_2001Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Category_2001,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getCollective_2002Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Collective_2002,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getKind_2003Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Kind_2003,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getMixin_2004Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Mixin_2004,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getMode_2005Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Mode_2005,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getPhase_2006Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Phase_2006,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getQuantity_2007Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Quantity_2007,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getRelator_2008Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Relator_2008,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getRole_2009Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Role_2009,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getRoleMixin_2010Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.RoleMixin_2010,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSimpleDatatype_2011Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.SimpleDatatype_2011,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getStructuralDatatype_2012Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.StructuralDatatype_2012,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSubKind_2013Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.SubKind_2013,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getGeneralizationSet_2014Text(View view) {
		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.GeneralizationSet_2014,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.GeneralizationSetNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getDerivationRule_2015Text(View view) {
		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.DerivationRule_2015,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.DerivationRuleNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getProperty_3028Text(View view) {
		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Property_3028,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.PropertyEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3029Text(View view) {
		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Property_3029,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.Property2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3030Text(View view) {
		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Property_3030,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.Property3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3031Text(View view) {
		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Property_3031,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.Property4EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3032Text(View view) {
		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Property_3032,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.Property5EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3033Text(View view) {
		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Property_3033,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.Property6EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3034Text(View view) {
		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Property_3034,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.Property7EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3035Text(View view) {
		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Property_3035,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.Property8EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3036Text(View view) {
		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Property_3036,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.Property9EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3037Text(View view) {
		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Property_3037,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.Property10EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3038Text(View view) {
		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Property_3038,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.Property11EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3039Text(View view) {
		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Property_3039,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.Property12EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3040Text(View view) {
		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Property_3040,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.Property13EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCharacterization_4001Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Characterization_4001,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel14EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getComponentOf_4002Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.ComponentOf_4002,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getDatatypeRelationship_4019Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.DatatypeRelationship_4019,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel17EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getDerivation_4004Text(View view) {
		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Derivation_4004,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.DerivationNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getFormalAssociation_4005Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.FormalAssociation_4005,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel18EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getGeneralization_4006Text(View view) {
		OntoUML.Generalization domainModelElement = (OntoUML.Generalization) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMaterialAssociation_4007Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.MaterialAssociation_4007,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel19EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getMediation_4008Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.Mediation_4008,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel20EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getMemberOf_4009Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.MemberOf_4009,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel21EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSubCollectionOf_4010Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.SubCollectionOf_4010,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel23EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSubQuantityOf_4011Text(View view) {

		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.SubQuantityOf_4011,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.WrappingLabel25EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getBinaryAssociationAtom_4013Text(View view) {
		OntoUML.URML.BinaryAssociationAtom domainModelElement = (OntoUML.URML.BinaryAssociationAtom) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBinaryAssociationAtom_4014Text(View view) {
		OntoUML.URML.BinaryAssociationAtom domainModelElement = (OntoUML.URML.BinaryAssociationAtom) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBinaryAssociationAtom_4015Text(View view) {
		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.BinaryAssociationAtom_4015,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.BinaryAssociationAtomNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getClassifierAtom_4016Text(View view) {
		OntoUML.URML.ClassifierAtom domainModelElement = (OntoUML.URML.ClassifierAtom) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClassifierAtom_4017Text(View view) {
		OntoUML.URML.ClassifierAtom domainModelElement = (OntoUML.URML.ClassifierAtom) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClassifierAtom_4018Text(View view) {
		IAdaptable hintAdapter = new OntoUML.diagram.providers.OntoUMLParserProvider.HintAdapter(
				OntoUML.diagram.providers.OntoUMLElementTypes.ClassifierAtom_4018,
				(view.getElement() != null ? view.getElement() : view),
				OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getType(OntoUML.diagram.edit.parts.ClassifierAtomNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return OntoUML.diagram.edit.parts.ContainerEditPart.MODEL_ID
				.equals(OntoUML.diagram.part.OntoUMLVisualIDRegistry
						.getModelID(view));
	}

}
