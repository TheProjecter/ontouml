package OntoUML.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class OntoUMLPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createOntoUMLClasses1Group());
		paletteRoot.add(createOntoUMLRelationships2Group());
		paletteRoot.add(createOntoUMLRules3Group());
	}

	/**
	 * Creates "OntoUML Classes" palette tool group
	 * @generated
	 */
	private PaletteContainer createOntoUMLClasses1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				OntoUML.diagram.part.Messages.OntoUMLClasses1Group_title);
		paletteContainer.add(createCategory1CreationTool());
		paletteContainer.add(createCollective2CreationTool());
		paletteContainer.add(createGeneralizationSet3CreationTool());
		paletteContainer.add(createKind4CreationTool());
		paletteContainer.add(createMixin5CreationTool());
		paletteContainer.add(createMode6CreationTool());
		paletteContainer.add(createPhase7CreationTool());
		paletteContainer.add(createQuantity8CreationTool());
		paletteContainer.add(createRelator9CreationTool());
		paletteContainer.add(createRole10CreationTool());
		paletteContainer.add(createRoleMixin11CreationTool());
		paletteContainer.add(createSimpleDatatype12CreationTool());
		paletteContainer.add(createStructuredDatatype13CreationTool());
		paletteContainer.add(createSubKind14CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "OntoUML Relationships" palette tool group
	 * @generated
	 */
	private PaletteContainer createOntoUMLRelationships2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				OntoUML.diagram.part.Messages.OntoUMLRelationships2Group_title);
		paletteContainer.add(createCharacterization1CreationTool());
		paletteContainer.add(createComponentOf2CreationTool());
		paletteContainer.add(createDatatypeRelationship3CreationTool());
		paletteContainer.add(createDerivation4CreationTool());
		paletteContainer.add(createFormal5CreationTool());
		paletteContainer.add(createGeneralization6CreationTool());
		paletteContainer.add(createMaterial7CreationTool());
		paletteContainer.add(createMediation8CreationTool());
		paletteContainer.add(createMemberOf9CreationTool());
		paletteContainer.add(createSubCollectionOf10CreationTool());
		paletteContainer.add(createSubQuantityOf11CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "OntoUML Rules" palette tool group
	 * @generated
	 */
	private PaletteContainer createOntoUMLRules3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				OntoUML.diagram.part.Messages.OntoUMLRules3Group_title);
		paletteContainer
				.setDescription(OntoUML.diagram.part.Messages.OntoUMLRules3Group_desc);
		paletteContainer.add(createCondition1CreationTool());
		paletteContainer.add(createDerivationRule2CreationTool());
		paletteContainer.add(createConclusion3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCategory1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OntoUML.diagram.providers.OntoUMLElementTypes.Category_2001);
		NodeToolEntry entry = new NodeToolEntry(
				OntoUML.diagram.part.Messages.Category1CreationTool_title,
				OntoUML.diagram.part.Messages.Category1CreationTool_desc, types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.Category_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCollective2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(OntoUML.diagram.providers.OntoUMLElementTypes.Collective_2002);
		NodeToolEntry entry = new NodeToolEntry(
				OntoUML.diagram.part.Messages.Collective2CreationTool_title,
				OntoUML.diagram.part.Messages.Collective2CreationTool_desc,
				types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.Collective_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralizationSet3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(OntoUML.diagram.providers.OntoUMLElementTypes.GeneralizationSet_2014);
		NodeToolEntry entry = new NodeToolEntry(
				OntoUML.diagram.part.Messages.GeneralizationSet3CreationTool_title,
				OntoUML.diagram.part.Messages.GeneralizationSet3CreationTool_desc,
				types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.GeneralizationSet_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createKind4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OntoUML.diagram.providers.OntoUMLElementTypes.Kind_2003);
		NodeToolEntry entry = new NodeToolEntry(
				OntoUML.diagram.part.Messages.Kind4CreationTool_title,
				OntoUML.diagram.part.Messages.Kind4CreationTool_desc, types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.Kind_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMixin5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OntoUML.diagram.providers.OntoUMLElementTypes.Mixin_2004);
		NodeToolEntry entry = new NodeToolEntry(
				OntoUML.diagram.part.Messages.Mixin5CreationTool_title,
				OntoUML.diagram.part.Messages.Mixin5CreationTool_desc, types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.Mixin_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMode6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OntoUML.diagram.providers.OntoUMLElementTypes.Mode_2005);
		NodeToolEntry entry = new NodeToolEntry(
				OntoUML.diagram.part.Messages.Mode6CreationTool_title,
				OntoUML.diagram.part.Messages.Mode6CreationTool_desc, types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.Mode_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPhase7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OntoUML.diagram.providers.OntoUMLElementTypes.Phase_2006);
		NodeToolEntry entry = new NodeToolEntry(
				OntoUML.diagram.part.Messages.Phase7CreationTool_title,
				OntoUML.diagram.part.Messages.Phase7CreationTool_desc, types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.Phase_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createQuantity8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OntoUML.diagram.providers.OntoUMLElementTypes.Quantity_2007);
		NodeToolEntry entry = new NodeToolEntry(
				OntoUML.diagram.part.Messages.Quantity8CreationTool_title,
				OntoUML.diagram.part.Messages.Quantity8CreationTool_desc, types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.Quantity_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelator9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OntoUML.diagram.providers.OntoUMLElementTypes.Relator_2008);
		NodeToolEntry entry = new NodeToolEntry(
				OntoUML.diagram.part.Messages.Relator9CreationTool_title,
				OntoUML.diagram.part.Messages.Relator9CreationTool_desc, types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.Relator_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OntoUML.diagram.providers.OntoUMLElementTypes.Role_2009);
		NodeToolEntry entry = new NodeToolEntry(
				OntoUML.diagram.part.Messages.Role10CreationTool_title,
				OntoUML.diagram.part.Messages.Role10CreationTool_desc, types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.Role_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoleMixin11CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OntoUML.diagram.providers.OntoUMLElementTypes.RoleMixin_2010);
		NodeToolEntry entry = new NodeToolEntry(
				OntoUML.diagram.part.Messages.RoleMixin11CreationTool_title,
				OntoUML.diagram.part.Messages.RoleMixin11CreationTool_desc,
				types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.RoleMixin_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSimpleDatatype12CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(OntoUML.diagram.providers.OntoUMLElementTypes.SimpleDatatype_2011);
		NodeToolEntry entry = new NodeToolEntry(
				OntoUML.diagram.part.Messages.SimpleDatatype12CreationTool_title,
				OntoUML.diagram.part.Messages.SimpleDatatype12CreationTool_desc,
				types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.SimpleDatatype_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredDatatype13CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(OntoUML.diagram.providers.OntoUMLElementTypes.StructuralDatatype_2012);
		NodeToolEntry entry = new NodeToolEntry(
				OntoUML.diagram.part.Messages.StructuredDatatype13CreationTool_title,
				OntoUML.diagram.part.Messages.StructuredDatatype13CreationTool_desc,
				types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.StructuralDatatype_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubKind14CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OntoUML.diagram.providers.OntoUMLElementTypes.SubKind_2013);
		NodeToolEntry entry = new NodeToolEntry(
				OntoUML.diagram.part.Messages.SubKind14CreationTool_title,
				OntoUML.diagram.part.Messages.SubKind14CreationTool_desc, types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.SubKind_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCharacterization1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(OntoUML.diagram.providers.OntoUMLElementTypes.Characterization_4001);
		LinkToolEntry entry = new LinkToolEntry(
				OntoUML.diagram.part.Messages.Characterization1CreationTool_title,
				OntoUML.diagram.part.Messages.Characterization1CreationTool_desc,
				types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.Characterization_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponentOf2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(OntoUML.diagram.providers.OntoUMLElementTypes.ComponentOf_4002);
		LinkToolEntry entry = new LinkToolEntry(
				OntoUML.diagram.part.Messages.ComponentOf2CreationTool_title,
				OntoUML.diagram.part.Messages.ComponentOf2CreationTool_desc,
				types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.ComponentOf_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDatatypeRelationship3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(OntoUML.diagram.providers.OntoUMLElementTypes.DatatypeRelationship_4019);
		LinkToolEntry entry = new LinkToolEntry(
				OntoUML.diagram.part.Messages.DatatypeRelationship3CreationTool_title,
				OntoUML.diagram.part.Messages.DatatypeRelationship3CreationTool_desc,
				types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.DatatypeRelationship_4019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDerivation4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(OntoUML.diagram.providers.OntoUMLElementTypes.Derivation_4004);
		LinkToolEntry entry = new LinkToolEntry(
				OntoUML.diagram.part.Messages.Derivation4CreationTool_title,
				OntoUML.diagram.part.Messages.Derivation4CreationTool_desc,
				types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.Derivation_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFormal5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(OntoUML.diagram.providers.OntoUMLElementTypes.FormalAssociation_4005);
		LinkToolEntry entry = new LinkToolEntry(
				OntoUML.diagram.part.Messages.Formal5CreationTool_title,
				OntoUML.diagram.part.Messages.Formal5CreationTool_desc, types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.FormalAssociation_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralization6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(OntoUML.diagram.providers.OntoUMLElementTypes.Generalization_4006);
		LinkToolEntry entry = new LinkToolEntry(
				OntoUML.diagram.part.Messages.Generalization6CreationTool_title,
				OntoUML.diagram.part.Messages.Generalization6CreationTool_desc,
				types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.Generalization_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMaterial7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(OntoUML.diagram.providers.OntoUMLElementTypes.MaterialAssociation_4007);
		LinkToolEntry entry = new LinkToolEntry(
				OntoUML.diagram.part.Messages.Material7CreationTool_title,
				OntoUML.diagram.part.Messages.Material7CreationTool_desc, types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.MaterialAssociation_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMediation8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OntoUML.diagram.providers.OntoUMLElementTypes.Mediation_4008);
		LinkToolEntry entry = new LinkToolEntry(
				OntoUML.diagram.part.Messages.Mediation8CreationTool_title,
				OntoUML.diagram.part.Messages.Mediation8CreationTool_desc,
				types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.Mediation_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMemberOf9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OntoUML.diagram.providers.OntoUMLElementTypes.MemberOf_4009);
		LinkToolEntry entry = new LinkToolEntry(
				OntoUML.diagram.part.Messages.MemberOf9CreationTool_title,
				OntoUML.diagram.part.Messages.MemberOf9CreationTool_desc, types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.MemberOf_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubCollectionOf10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(OntoUML.diagram.providers.OntoUMLElementTypes.SubCollectionOf_4010);
		LinkToolEntry entry = new LinkToolEntry(
				OntoUML.diagram.part.Messages.SubCollectionOf10CreationTool_title,
				OntoUML.diagram.part.Messages.SubCollectionOf10CreationTool_desc,
				types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.SubCollectionOf_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubQuantityOf11CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(OntoUML.diagram.providers.OntoUMLElementTypes.SubQuantityOf_4011);
		LinkToolEntry entry = new LinkToolEntry(
				OntoUML.diagram.part.Messages.SubQuantityOf11CreationTool_title,
				OntoUML.diagram.part.Messages.SubQuantityOf11CreationTool_desc,
				types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.SubQuantityOf_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCondition1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types
				.add(OntoUML.diagram.providers.OntoUMLElementTypes.BinaryAssociationAtom_4013);
		types
				.add(OntoUML.diagram.providers.OntoUMLElementTypes.ClassifierAtom_4017);
		LinkToolEntry entry = new LinkToolEntry(
				OntoUML.diagram.part.Messages.Condition1CreationTool_title,
				OntoUML.diagram.part.Messages.Condition1CreationTool_desc,
				types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.BinaryAssociationAtom_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDerivationRule2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(OntoUML.diagram.providers.OntoUMLElementTypes.DerivationRule_2015);
		NodeToolEntry entry = new NodeToolEntry(
				OntoUML.diagram.part.Messages.DerivationRule2CreationTool_title,
				OntoUML.diagram.part.Messages.DerivationRule2CreationTool_desc,
				types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.DerivationRule_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConclusion3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types
				.add(OntoUML.diagram.providers.OntoUMLElementTypes.BinaryAssociationAtom_4015);
		types
				.add(OntoUML.diagram.providers.OntoUMLElementTypes.ClassifierAtom_4018);
		LinkToolEntry entry = new LinkToolEntry(
				OntoUML.diagram.part.Messages.Conclusion3CreationTool_title,
				OntoUML.diagram.part.Messages.Conclusion3CreationTool_desc,
				types);
		entry
				.setSmallIcon(OntoUML.diagram.providers.OntoUMLElementTypes
						.getImageDescriptor(OntoUML.diagram.providers.OntoUMLElementTypes.BinaryAssociationAtom_4015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
