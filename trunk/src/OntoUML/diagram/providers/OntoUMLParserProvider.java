package OntoUML.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class OntoUMLParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser categoryName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getCategoryName_5002Parser() {
		if (categoryName_5002Parser == null) {
			categoryName_5002Parser = createCategoryName_5002Parser();
		}
		return categoryName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCategoryName_5002Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser collectiveName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getCollectiveName_5004Parser() {
		if (collectiveName_5004Parser == null) {
			collectiveName_5004Parser = createCollectiveName_5004Parser();
		}
		return collectiveName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCollectiveName_5004Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser kindName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getKindName_5006Parser() {
		if (kindName_5006Parser == null) {
			kindName_5006Parser = createKindName_5006Parser();
		}
		return kindName_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createKindName_5006Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser mixinName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getMixinName_5008Parser() {
		if (mixinName_5008Parser == null) {
			mixinName_5008Parser = createMixinName_5008Parser();
		}
		return mixinName_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMixinName_5008Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser modeName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getModeName_5010Parser() {
		if (modeName_5010Parser == null) {
			modeName_5010Parser = createModeName_5010Parser();
		}
		return modeName_5010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createModeName_5010Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser phaseName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getPhaseName_5012Parser() {
		if (phaseName_5012Parser == null) {
			phaseName_5012Parser = createPhaseName_5012Parser();
		}
		return phaseName_5012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPhaseName_5012Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser quantityName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getQuantityName_5014Parser() {
		if (quantityName_5014Parser == null) {
			quantityName_5014Parser = createQuantityName_5014Parser();
		}
		return quantityName_5014Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createQuantityName_5014Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser relatorName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getRelatorName_5016Parser() {
		if (relatorName_5016Parser == null) {
			relatorName_5016Parser = createRelatorName_5016Parser();
		}
		return relatorName_5016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRelatorName_5016Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser roleName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getRoleName_5018Parser() {
		if (roleName_5018Parser == null) {
			roleName_5018Parser = createRoleName_5018Parser();
		}
		return roleName_5018Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRoleName_5018Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser roleMixinName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getRoleMixinName_5020Parser() {
		if (roleMixinName_5020Parser == null) {
			roleMixinName_5020Parser = createRoleMixinName_5020Parser();
		}
		return roleMixinName_5020Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRoleMixinName_5020Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser simpleDatatypeName_5022Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleDatatypeName_5022Parser() {
		if (simpleDatatypeName_5022Parser == null) {
			simpleDatatypeName_5022Parser = createSimpleDatatypeName_5022Parser();
		}
		return simpleDatatypeName_5022Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSimpleDatatypeName_5022Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser structuralDatatypeName_5024Parser;

	/**
	 * @generated
	 */
	private IParser getStructuralDatatypeName_5024Parser() {
		if (structuralDatatypeName_5024Parser == null) {
			structuralDatatypeName_5024Parser = createStructuralDatatypeName_5024Parser();
		}
		return structuralDatatypeName_5024Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createStructuralDatatypeName_5024Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser subKindName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getSubKindName_5026Parser() {
		if (subKindName_5026Parser == null) {
			subKindName_5026Parser = createSubKindName_5026Parser();
		}
		return subKindName_5026Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSubKindName_5026Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser generalizationSetName_5027Parser;

	/**
	 * @generated
	 */
	private IParser getGeneralizationSetName_5027Parser() {
		if (generalizationSetName_5027Parser == null) {
			generalizationSetName_5027Parser = createGeneralizationSetName_5027Parser();
		}
		return generalizationSetName_5027Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGeneralizationSetName_5027Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser derivationRuleName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getDerivationRuleName_5028Parser() {
		if (derivationRuleName_5028Parser == null) {
			derivationRuleName_5028Parser = createDerivationRuleName_5028Parser();
		}
		return derivationRuleName_5028Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDerivationRuleName_5028Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyName_5029Parser() {
		if (propertyName_5029Parser == null) {
			propertyName_5029Parser = createPropertyName_5029Parser();
		}
		return propertyName_5029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPropertyName_5029Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyLowerUpper_5030Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyLowerUpper_5030Parser() {
		if (propertyLowerUpper_5030Parser == null) {
			propertyLowerUpper_5030Parser = createPropertyLowerUpper_5030Parser();
		}
		return propertyLowerUpper_5030Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPropertyLowerUpper_5030Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("{0}..{1,choice,-1#*|-1<{1}}");
		parser.setEditorPattern("{0}..{1,choice,-1#*|-1<{1}}");
		parser.setEditPattern("{0}..{1}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3001Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3001Parser() {
		if (property_3001Parser == null) {
			property_3001Parser = createProperty_3001Parser();
		}
		return property_3001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3001Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditorPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditPattern("{0} [{1}..{2}]");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3002Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3002Parser() {
		if (property_3002Parser == null) {
			property_3002Parser = createProperty_3002Parser();
		}
		return property_3002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3002Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditorPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditPattern("{0} [{1}..{2}]");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3003Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3003Parser() {
		if (property_3003Parser == null) {
			property_3003Parser = createProperty_3003Parser();
		}
		return property_3003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3003Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditorPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditPattern("{0} [{1}..{2}]");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3004Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3004Parser() {
		if (property_3004Parser == null) {
			property_3004Parser = createProperty_3004Parser();
		}
		return property_3004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3004Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditorPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditPattern("{0} [{1}..{2}]");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3005Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3005Parser() {
		if (property_3005Parser == null) {
			property_3005Parser = createProperty_3005Parser();
		}
		return property_3005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3005Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditorPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditPattern("{0} [{1}..{2}]");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3006Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3006Parser() {
		if (property_3006Parser == null) {
			property_3006Parser = createProperty_3006Parser();
		}
		return property_3006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3006Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditorPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditPattern("{0} [{1}..{2}]");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3007Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3007Parser() {
		if (property_3007Parser == null) {
			property_3007Parser = createProperty_3007Parser();
		}
		return property_3007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3007Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditorPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditPattern("{0} [{1}..{2}]");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3008Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3008Parser() {
		if (property_3008Parser == null) {
			property_3008Parser = createProperty_3008Parser();
		}
		return property_3008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3008Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditorPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditPattern("{0} [{1}..{2}]");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3009Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3009Parser() {
		if (property_3009Parser == null) {
			property_3009Parser = createProperty_3009Parser();
		}
		return property_3009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3009Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditorPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditPattern("{0} [{1}..{2}]");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3010Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3010Parser() {
		if (property_3010Parser == null) {
			property_3010Parser = createProperty_3010Parser();
		}
		return property_3010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3010Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditorPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditPattern("{0} [{1}..{2}]");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3011Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3011Parser() {
		if (property_3011Parser == null) {
			property_3011Parser = createProperty_3011Parser();
		}
		return property_3011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3011Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditorPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditPattern("{0} [{1}..{2}]");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3012Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3012Parser() {
		if (property_3012Parser == null) {
			property_3012Parser = createProperty_3012Parser();
		}
		return property_3012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3012Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditorPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditPattern("{0} [{1}..{2}]");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3013Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3013Parser() {
		if (property_3013Parser == null) {
			property_3013Parser = createProperty_3013Parser();
		}
		return property_3013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3013Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditorPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditPattern("{0} [{1}..{2}]");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3014Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3014Parser() {
		if (property_3014Parser == null) {
			property_3014Parser = createProperty_3014Parser();
		}
		return property_3014Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3014Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditorPattern("{0} [{1}..{2,choice,-1#*|-1<{2}}]");
		parser.setEditPattern("{0} [{1}..{2}]");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser characterizationName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getCharacterizationName_6002Parser() {
		if (characterizationName_6002Parser == null) {
			characterizationName_6002Parser = createCharacterizationName_6002Parser();
		}
		return characterizationName_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCharacterizationName_6002Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser componentOfName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getComponentOfName_6003Parser() {
		if (componentOfName_6003Parser == null) {
			componentOfName_6003Parser = createComponentOfName_6003Parser();
		}
		return componentOfName_6003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createComponentOfName_6003Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser datatypeAssociationName_6005Parser;

	/**
	 * @generated
	 */
	private IParser getDatatypeAssociationName_6005Parser() {
		if (datatypeAssociationName_6005Parser == null) {
			datatypeAssociationName_6005Parser = createDatatypeAssociationName_6005Parser();
		}
		return datatypeAssociationName_6005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDatatypeAssociationName_6005Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser derivationName_6006Parser;

	/**
	 * @generated
	 */
	private IParser getDerivationName_6006Parser() {
		if (derivationName_6006Parser == null) {
			derivationName_6006Parser = createDerivationName_6006Parser();
		}
		return derivationName_6006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDerivationName_6006Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser formalAssociationName_6008Parser;

	/**
	 * @generated
	 */
	private IParser getFormalAssociationName_6008Parser() {
		if (formalAssociationName_6008Parser == null) {
			formalAssociationName_6008Parser = createFormalAssociationName_6008Parser();
		}
		return formalAssociationName_6008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFormalAssociationName_6008Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser materialAssociationName_6010Parser;

	/**
	 * @generated
	 */
	private IParser getMaterialAssociationName_6010Parser() {
		if (materialAssociationName_6010Parser == null) {
			materialAssociationName_6010Parser = createMaterialAssociationName_6010Parser();
		}
		return materialAssociationName_6010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMaterialAssociationName_6010Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser mediationName_6012Parser;

	/**
	 * @generated
	 */
	private IParser getMediationName_6012Parser() {
		if (mediationName_6012Parser == null) {
			mediationName_6012Parser = createMediationName_6012Parser();
		}
		return mediationName_6012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMediationName_6012Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser memberOfName_6013Parser;

	/**
	 * @generated
	 */
	private IParser getMemberOfName_6013Parser() {
		if (memberOfName_6013Parser == null) {
			memberOfName_6013Parser = createMemberOfName_6013Parser();
		}
		return memberOfName_6013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMemberOfName_6013Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser subCollectionOfName_6015Parser;

	/**
	 * @generated
	 */
	private IParser getSubCollectionOfName_6015Parser() {
		if (subCollectionOfName_6015Parser == null) {
			subCollectionOfName_6015Parser = createSubCollectionOfName_6015Parser();
		}
		return subCollectionOfName_6015Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSubCollectionOfName_6015Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser subQuantityOfName_6017Parser;

	/**
	 * @generated
	 */
	private IParser getSubQuantityOfName_6017Parser() {
		if (subQuantityOfName_6017Parser == null) {
			subQuantityOfName_6017Parser = createSubQuantityOfName_6017Parser();
		}
		return subQuantityOfName_6017Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSubQuantityOfName_6017Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser binaryAssociationAtomName_6019Parser;

	/**
	 * @generated
	 */
	private IParser getBinaryAssociationAtomName_6019Parser() {
		if (binaryAssociationAtomName_6019Parser == null) {
			binaryAssociationAtomName_6019Parser = createBinaryAssociationAtomName_6019Parser();
		}
		return binaryAssociationAtomName_6019Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBinaryAssociationAtomName_6019Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser binaryAssociationAtomName_6020Parser;

	/**
	 * @generated
	 */
	private IParser getBinaryAssociationAtomName_6020Parser() {
		if (binaryAssociationAtomName_6020Parser == null) {
			binaryAssociationAtomName_6020Parser = createBinaryAssociationAtomName_6020Parser();
		}
		return binaryAssociationAtomName_6020Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBinaryAssociationAtomName_6020Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser classifierAtomName_6021Parser;

	/**
	 * @generated
	 */
	private IParser getClassifierAtomName_6021Parser() {
		if (classifierAtomName_6021Parser == null) {
			classifierAtomName_6021Parser = createClassifierAtomName_6021Parser();
		}
		return classifierAtomName_6021Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createClassifierAtomName_6021Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser classifierAtomName_6022Parser;

	/**
	 * @generated
	 */
	private IParser getClassifierAtomName_6022Parser() {
		if (classifierAtomName_6022Parser == null) {
			classifierAtomName_6022Parser = createClassifierAtomName_6022Parser();
		}
		return classifierAtomName_6022Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createClassifierAtomName_6022Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case OntoUML.diagram.edit.parts.CategoryNameEditPart.VISUAL_ID:
			return getCategoryName_5002Parser();
		case OntoUML.diagram.edit.parts.CollectiveNameEditPart.VISUAL_ID:
			return getCollectiveName_5004Parser();
		case OntoUML.diagram.edit.parts.KindNameEditPart.VISUAL_ID:
			return getKindName_5006Parser();
		case OntoUML.diagram.edit.parts.MixinNameEditPart.VISUAL_ID:
			return getMixinName_5008Parser();
		case OntoUML.diagram.edit.parts.ModeNameEditPart.VISUAL_ID:
			return getModeName_5010Parser();
		case OntoUML.diagram.edit.parts.PhaseNameEditPart.VISUAL_ID:
			return getPhaseName_5012Parser();
		case OntoUML.diagram.edit.parts.QuantityNameEditPart.VISUAL_ID:
			return getQuantityName_5014Parser();
		case OntoUML.diagram.edit.parts.RelatorNameEditPart.VISUAL_ID:
			return getRelatorName_5016Parser();
		case OntoUML.diagram.edit.parts.RoleNameEditPart.VISUAL_ID:
			return getRoleName_5018Parser();
		case OntoUML.diagram.edit.parts.RoleMixinNameEditPart.VISUAL_ID:
			return getRoleMixinName_5020Parser();
		case OntoUML.diagram.edit.parts.SimpleDatatypeNameEditPart.VISUAL_ID:
			return getSimpleDatatypeName_5022Parser();
		case OntoUML.diagram.edit.parts.StructuralDatatypeNameEditPart.VISUAL_ID:
			return getStructuralDatatypeName_5024Parser();
		case OntoUML.diagram.edit.parts.SubKindNameEditPart.VISUAL_ID:
			return getSubKindName_5026Parser();
		case OntoUML.diagram.edit.parts.GeneralizationSetNameEditPart.VISUAL_ID:
			return getGeneralizationSetName_5027Parser();
		case OntoUML.diagram.edit.parts.DerivationRuleNameEditPart.VISUAL_ID:
			return getDerivationRuleName_5028Parser();
		case OntoUML.diagram.edit.parts.PropertyLowerUpperEditPart.VISUAL_ID:
			return getPropertyName_5029Parser();
		case OntoUML.diagram.edit.parts.PropertyLowerUpper2EditPart.VISUAL_ID:
			return getPropertyLowerUpper_5030Parser();
		case OntoUML.diagram.edit.parts.Property2EditPart.VISUAL_ID:
			return getProperty_3001Parser();
		case OntoUML.diagram.edit.parts.Property3EditPart.VISUAL_ID:
			return getProperty_3002Parser();
		case OntoUML.diagram.edit.parts.Property4EditPart.VISUAL_ID:
			return getProperty_3003Parser();
		case OntoUML.diagram.edit.parts.Property5EditPart.VISUAL_ID:
			return getProperty_3004Parser();
		case OntoUML.diagram.edit.parts.Property6EditPart.VISUAL_ID:
			return getProperty_3005Parser();
		case OntoUML.diagram.edit.parts.Property7EditPart.VISUAL_ID:
			return getProperty_3006Parser();
		case OntoUML.diagram.edit.parts.Property8EditPart.VISUAL_ID:
			return getProperty_3007Parser();
		case OntoUML.diagram.edit.parts.Property9EditPart.VISUAL_ID:
			return getProperty_3008Parser();
		case OntoUML.diagram.edit.parts.Property10EditPart.VISUAL_ID:
			return getProperty_3009Parser();
		case OntoUML.diagram.edit.parts.Property11EditPart.VISUAL_ID:
			return getProperty_3010Parser();
		case OntoUML.diagram.edit.parts.Property12EditPart.VISUAL_ID:
			return getProperty_3011Parser();
		case OntoUML.diagram.edit.parts.Property13EditPart.VISUAL_ID:
			return getProperty_3012Parser();
		case OntoUML.diagram.edit.parts.Property14EditPart.VISUAL_ID:
			return getProperty_3013Parser();
		case OntoUML.diagram.edit.parts.Property15EditPart.VISUAL_ID:
			return getProperty_3014Parser();
		case OntoUML.diagram.edit.parts.CharacterizationNameEditPart.VISUAL_ID:
			return getCharacterizationName_6002Parser();
		case OntoUML.diagram.edit.parts.ComponentOfNameEditPart.VISUAL_ID:
			return getComponentOfName_6003Parser();
		case OntoUML.diagram.edit.parts.DatatypeAssociationNameEditPart.VISUAL_ID:
			return getDatatypeAssociationName_6005Parser();
		case OntoUML.diagram.edit.parts.DerivationNameEditPart.VISUAL_ID:
			return getDerivationName_6006Parser();
		case OntoUML.diagram.edit.parts.FormalAssociationNameEditPart.VISUAL_ID:
			return getFormalAssociationName_6008Parser();
		case OntoUML.diagram.edit.parts.MaterialAssociationNameEditPart.VISUAL_ID:
			return getMaterialAssociationName_6010Parser();
		case OntoUML.diagram.edit.parts.MediationNameEditPart.VISUAL_ID:
			return getMediationName_6012Parser();
		case OntoUML.diagram.edit.parts.MemberOfNameEditPart.VISUAL_ID:
			return getMemberOfName_6013Parser();
		case OntoUML.diagram.edit.parts.SubCollectionOfNameEditPart.VISUAL_ID:
			return getSubCollectionOfName_6015Parser();
		case OntoUML.diagram.edit.parts.SubQuantityOfNameEditPart.VISUAL_ID:
			return getSubQuantityOfName_6017Parser();
		case OntoUML.diagram.edit.parts.BinaryAssociationAtomNameEditPart.VISUAL_ID:
			return getBinaryAssociationAtomName_6019Parser();
		case OntoUML.diagram.edit.parts.BinaryAssociationAtomName2EditPart.VISUAL_ID:
			return getBinaryAssociationAtomName_6020Parser();
		case OntoUML.diagram.edit.parts.ClassifierAtomNameEditPart.VISUAL_ID:
			return getClassifierAtomName_6021Parser();
		case OntoUML.diagram.edit.parts.ClassifierAtomName2EditPart.VISUAL_ID:
			return getClassifierAtomName_6022Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (OntoUML.diagram.providers.OntoUMLElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
