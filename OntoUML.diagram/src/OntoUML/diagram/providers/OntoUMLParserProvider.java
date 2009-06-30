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
	private IParser property_3028Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3028Parser() {
		if (property_3028Parser == null) {
			property_3028Parser = createProperty_3028Parser();
		}
		return property_3028Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3028Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3029Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3029Parser() {
		if (property_3029Parser == null) {
			property_3029Parser = createProperty_3029Parser();
		}
		return property_3029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3029Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3030Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3030Parser() {
		if (property_3030Parser == null) {
			property_3030Parser = createProperty_3030Parser();
		}
		return property_3030Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3030Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3031Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3031Parser() {
		if (property_3031Parser == null) {
			property_3031Parser = createProperty_3031Parser();
		}
		return property_3031Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3031Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3032Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3032Parser() {
		if (property_3032Parser == null) {
			property_3032Parser = createProperty_3032Parser();
		}
		return property_3032Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3032Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3033Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3033Parser() {
		if (property_3033Parser == null) {
			property_3033Parser = createProperty_3033Parser();
		}
		return property_3033Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3033Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3034Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3034Parser() {
		if (property_3034Parser == null) {
			property_3034Parser = createProperty_3034Parser();
		}
		return property_3034Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3034Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3035Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3035Parser() {
		if (property_3035Parser == null) {
			property_3035Parser = createProperty_3035Parser();
		}
		return property_3035Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3035Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3036Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3036Parser() {
		if (property_3036Parser == null) {
			property_3036Parser = createProperty_3036Parser();
		}
		return property_3036Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3036Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3037Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3037Parser() {
		if (property_3037Parser == null) {
			property_3037Parser = createProperty_3037Parser();
		}
		return property_3037Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3037Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3038Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3038Parser() {
		if (property_3038Parser == null) {
			property_3038Parser = createProperty_3038Parser();
		}
		return property_3038Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3038Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3039Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3039Parser() {
		if (property_3039Parser == null) {
			property_3039Parser = createProperty_3039Parser();
		}
		return property_3039Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3039Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3040Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3040Parser() {
		if (property_3040Parser == null) {
			property_3040Parser = createProperty_3040Parser();
		}
		return property_3040Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProperty_3040Parser() {
		EAttribute[] features = new EAttribute[] {
				OntoUML.OntoUMLPackage.eINSTANCE.getNamedElement_Name(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Lower(),
				OntoUML.OntoUMLPackage.eINSTANCE.getMultiplicityElement_Upper(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
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
	private IParser characterizationSourcePropertyNameLabelAux_6032Parser;

	/**
	 * @generated
	 */
	private IParser getCharacterizationSourcePropertyNameLabelAux_6032Parser() {
		if (characterizationSourcePropertyNameLabelAux_6032Parser == null) {
			characterizationSourcePropertyNameLabelAux_6032Parser = createCharacterizationSourcePropertyNameLabelAux_6032Parser();
		}
		return characterizationSourcePropertyNameLabelAux_6032Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCharacterizationSourcePropertyNameLabelAux_6032Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_SourcePropertyNameLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser characterizationSourcePropertyCardinalitiesLabelAux_6033Parser;

	/**
	 * @generated
	 */
	private IParser getCharacterizationSourcePropertyCardinalitiesLabelAux_6033Parser() {
		if (characterizationSourcePropertyCardinalitiesLabelAux_6033Parser == null) {
			characterizationSourcePropertyCardinalitiesLabelAux_6033Parser = createCharacterizationSourcePropertyCardinalitiesLabelAux_6033Parser();
		}
		return characterizationSourcePropertyCardinalitiesLabelAux_6033Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCharacterizationSourcePropertyCardinalitiesLabelAux_6033Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_SourcePropertyCardinalitiesLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser characterizationTargetPropertyNameLabelAux_6034Parser;

	/**
	 * @generated
	 */
	private IParser getCharacterizationTargetPropertyNameLabelAux_6034Parser() {
		if (characterizationTargetPropertyNameLabelAux_6034Parser == null) {
			characterizationTargetPropertyNameLabelAux_6034Parser = createCharacterizationTargetPropertyNameLabelAux_6034Parser();
		}
		return characterizationTargetPropertyNameLabelAux_6034Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCharacterizationTargetPropertyNameLabelAux_6034Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_TargetPropertyNameLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser characterizationTargetPropertyCardinalitiesLabelAux_6035Parser;

	/**
	 * @generated
	 */
	private IParser getCharacterizationTargetPropertyCardinalitiesLabelAux_6035Parser() {
		if (characterizationTargetPropertyCardinalitiesLabelAux_6035Parser == null) {
			characterizationTargetPropertyCardinalitiesLabelAux_6035Parser = createCharacterizationTargetPropertyCardinalitiesLabelAux_6035Parser();
		}
		return characterizationTargetPropertyCardinalitiesLabelAux_6035Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCharacterizationTargetPropertyCardinalitiesLabelAux_6035Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_TargetPropertyCardinalitiesLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser componentOfName_6004Parser;

	/**
	 * @generated
	 */
	private IParser getComponentOfName_6004Parser() {
		if (componentOfName_6004Parser == null) {
			componentOfName_6004Parser = createComponentOfName_6004Parser();
		}
		return componentOfName_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createComponentOfName_6004Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser componentOfSourcePropertyNameLabelAux_6028Parser;

	/**
	 * @generated
	 */
	private IParser getComponentOfSourcePropertyNameLabelAux_6028Parser() {
		if (componentOfSourcePropertyNameLabelAux_6028Parser == null) {
			componentOfSourcePropertyNameLabelAux_6028Parser = createComponentOfSourcePropertyNameLabelAux_6028Parser();
		}
		return componentOfSourcePropertyNameLabelAux_6028Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createComponentOfSourcePropertyNameLabelAux_6028Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_SourcePropertyNameLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser componentOfSourcePropertyCardinalitiesLabelAux_6029Parser;

	/**
	 * @generated
	 */
	private IParser getComponentOfSourcePropertyCardinalitiesLabelAux_6029Parser() {
		if (componentOfSourcePropertyCardinalitiesLabelAux_6029Parser == null) {
			componentOfSourcePropertyCardinalitiesLabelAux_6029Parser = createComponentOfSourcePropertyCardinalitiesLabelAux_6029Parser();
		}
		return componentOfSourcePropertyCardinalitiesLabelAux_6029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createComponentOfSourcePropertyCardinalitiesLabelAux_6029Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_SourcePropertyCardinalitiesLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser componentOfTargetPropertyNameLabelAux_6030Parser;

	/**
	 * @generated
	 */
	private IParser getComponentOfTargetPropertyNameLabelAux_6030Parser() {
		if (componentOfTargetPropertyNameLabelAux_6030Parser == null) {
			componentOfTargetPropertyNameLabelAux_6030Parser = createComponentOfTargetPropertyNameLabelAux_6030Parser();
		}
		return componentOfTargetPropertyNameLabelAux_6030Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createComponentOfTargetPropertyNameLabelAux_6030Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_TargetPropertyNameLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser componentOfTargetPropertyCardinalitiesLabelAux_6031Parser;

	/**
	 * @generated
	 */
	private IParser getComponentOfTargetPropertyCardinalitiesLabelAux_6031Parser() {
		if (componentOfTargetPropertyCardinalitiesLabelAux_6031Parser == null) {
			componentOfTargetPropertyCardinalitiesLabelAux_6031Parser = createComponentOfTargetPropertyCardinalitiesLabelAux_6031Parser();
		}
		return componentOfTargetPropertyCardinalitiesLabelAux_6031Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createComponentOfTargetPropertyCardinalitiesLabelAux_6031Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_TargetPropertyCardinalitiesLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser datatypeRelationshipName_6067Parser;

	/**
	 * @generated
	 */
	private IParser getDatatypeRelationshipName_6067Parser() {
		if (datatypeRelationshipName_6067Parser == null) {
			datatypeRelationshipName_6067Parser = createDatatypeRelationshipName_6067Parser();
		}
		return datatypeRelationshipName_6067Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDatatypeRelationshipName_6067Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser datatypeRelationshipSourcePropertyNameLabelAux_6068Parser;

	/**
	 * @generated
	 */
	private IParser getDatatypeRelationshipSourcePropertyNameLabelAux_6068Parser() {
		if (datatypeRelationshipSourcePropertyNameLabelAux_6068Parser == null) {
			datatypeRelationshipSourcePropertyNameLabelAux_6068Parser = createDatatypeRelationshipSourcePropertyNameLabelAux_6068Parser();
		}
		return datatypeRelationshipSourcePropertyNameLabelAux_6068Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDatatypeRelationshipSourcePropertyNameLabelAux_6068Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_SourcePropertyNameLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser datatypeRelationshipSourcePropertyCardinalitiesLabelAux_6069Parser;

	/**
	 * @generated
	 */
	private IParser getDatatypeRelationshipSourcePropertyCardinalitiesLabelAux_6069Parser() {
		if (datatypeRelationshipSourcePropertyCardinalitiesLabelAux_6069Parser == null) {
			datatypeRelationshipSourcePropertyCardinalitiesLabelAux_6069Parser = createDatatypeRelationshipSourcePropertyCardinalitiesLabelAux_6069Parser();
		}
		return datatypeRelationshipSourcePropertyCardinalitiesLabelAux_6069Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDatatypeRelationshipSourcePropertyCardinalitiesLabelAux_6069Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_SourcePropertyCardinalitiesLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser datatypeRelationshipTargetPropertyNameLabelAux_6070Parser;

	/**
	 * @generated
	 */
	private IParser getDatatypeRelationshipTargetPropertyNameLabelAux_6070Parser() {
		if (datatypeRelationshipTargetPropertyNameLabelAux_6070Parser == null) {
			datatypeRelationshipTargetPropertyNameLabelAux_6070Parser = createDatatypeRelationshipTargetPropertyNameLabelAux_6070Parser();
		}
		return datatypeRelationshipTargetPropertyNameLabelAux_6070Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDatatypeRelationshipTargetPropertyNameLabelAux_6070Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_TargetPropertyNameLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser datatypeRelationshipTargetPropertyCardinalitiesLabelAux_6071Parser;

	/**
	 * @generated
	 */
	private IParser getDatatypeRelationshipTargetPropertyCardinalitiesLabelAux_6071Parser() {
		if (datatypeRelationshipTargetPropertyCardinalitiesLabelAux_6071Parser == null) {
			datatypeRelationshipTargetPropertyCardinalitiesLabelAux_6071Parser = createDatatypeRelationshipTargetPropertyCardinalitiesLabelAux_6071Parser();
		}
		return datatypeRelationshipTargetPropertyCardinalitiesLabelAux_6071Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDatatypeRelationshipTargetPropertyCardinalitiesLabelAux_6071Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_TargetPropertyCardinalitiesLabelAux(), };
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
	private IParser derivationSourcePropertyCardinalitiesLabelAux_6036Parser;

	/**
	 * @generated
	 */
	private IParser getDerivationSourcePropertyCardinalitiesLabelAux_6036Parser() {
		if (derivationSourcePropertyCardinalitiesLabelAux_6036Parser == null) {
			derivationSourcePropertyCardinalitiesLabelAux_6036Parser = createDerivationSourcePropertyCardinalitiesLabelAux_6036Parser();
		}
		return derivationSourcePropertyCardinalitiesLabelAux_6036Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDerivationSourcePropertyCardinalitiesLabelAux_6036Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_SourcePropertyCardinalitiesLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser derivationTargetPropertyCardinalitiesLabelAux_6037Parser;

	/**
	 * @generated
	 */
	private IParser getDerivationTargetPropertyCardinalitiesLabelAux_6037Parser() {
		if (derivationTargetPropertyCardinalitiesLabelAux_6037Parser == null) {
			derivationTargetPropertyCardinalitiesLabelAux_6037Parser = createDerivationTargetPropertyCardinalitiesLabelAux_6037Parser();
		}
		return derivationTargetPropertyCardinalitiesLabelAux_6037Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDerivationTargetPropertyCardinalitiesLabelAux_6037Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_TargetPropertyCardinalitiesLabelAux(), };
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
	private IParser formalAssociationAssociationEnd1PropertyNameLabelAux_6058Parser;

	/**
	 * @generated
	 */
	private IParser getFormalAssociationAssociationEnd1PropertyNameLabelAux_6058Parser() {
		if (formalAssociationAssociationEnd1PropertyNameLabelAux_6058Parser == null) {
			formalAssociationAssociationEnd1PropertyNameLabelAux_6058Parser = createFormalAssociationAssociationEnd1PropertyNameLabelAux_6058Parser();
		}
		return formalAssociationAssociationEnd1PropertyNameLabelAux_6058Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFormalAssociationAssociationEnd1PropertyNameLabelAux_6058Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getAssociation_AssociationEnd1PropertyNameLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser formalAssociationAssociationEnd1PropertyCardinalitiesLabelAux_6059Parser;

	/**
	 * @generated
	 */
	private IParser getFormalAssociationAssociationEnd1PropertyCardinalitiesLabelAux_6059Parser() {
		if (formalAssociationAssociationEnd1PropertyCardinalitiesLabelAux_6059Parser == null) {
			formalAssociationAssociationEnd1PropertyCardinalitiesLabelAux_6059Parser = createFormalAssociationAssociationEnd1PropertyCardinalitiesLabelAux_6059Parser();
		}
		return formalAssociationAssociationEnd1PropertyCardinalitiesLabelAux_6059Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFormalAssociationAssociationEnd1PropertyCardinalitiesLabelAux_6059Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getAssociation_AssociationEnd1PropertyCardinalitiesLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser formalAssociationAssociationEnd2PropertyNameLabelAux_6060Parser;

	/**
	 * @generated
	 */
	private IParser getFormalAssociationAssociationEnd2PropertyNameLabelAux_6060Parser() {
		if (formalAssociationAssociationEnd2PropertyNameLabelAux_6060Parser == null) {
			formalAssociationAssociationEnd2PropertyNameLabelAux_6060Parser = createFormalAssociationAssociationEnd2PropertyNameLabelAux_6060Parser();
		}
		return formalAssociationAssociationEnd2PropertyNameLabelAux_6060Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFormalAssociationAssociationEnd2PropertyNameLabelAux_6060Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getAssociation_AssociationEnd2PropertyNameLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser formalAssociationAssociationEnd2PropertyCardinalitiesLabelAux_6061Parser;

	/**
	 * @generated
	 */
	private IParser getFormalAssociationAssociationEnd2PropertyCardinalitiesLabelAux_6061Parser() {
		if (formalAssociationAssociationEnd2PropertyCardinalitiesLabelAux_6061Parser == null) {
			formalAssociationAssociationEnd2PropertyCardinalitiesLabelAux_6061Parser = createFormalAssociationAssociationEnd2PropertyCardinalitiesLabelAux_6061Parser();
		}
		return formalAssociationAssociationEnd2PropertyCardinalitiesLabelAux_6061Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFormalAssociationAssociationEnd2PropertyCardinalitiesLabelAux_6061Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getAssociation_AssociationEnd2PropertyCardinalitiesLabelAux(), };
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
	private IParser materialAssociationAssociationEnd1PropertyNameLabelAux_6062Parser;

	/**
	 * @generated
	 */
	private IParser getMaterialAssociationAssociationEnd1PropertyNameLabelAux_6062Parser() {
		if (materialAssociationAssociationEnd1PropertyNameLabelAux_6062Parser == null) {
			materialAssociationAssociationEnd1PropertyNameLabelAux_6062Parser = createMaterialAssociationAssociationEnd1PropertyNameLabelAux_6062Parser();
		}
		return materialAssociationAssociationEnd1PropertyNameLabelAux_6062Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMaterialAssociationAssociationEnd1PropertyNameLabelAux_6062Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getAssociation_AssociationEnd1PropertyNameLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser materialAssociationAssociationEnd1PropertyCardinalitiesLabelAux_6063Parser;

	/**
	 * @generated
	 */
	private IParser getMaterialAssociationAssociationEnd1PropertyCardinalitiesLabelAux_6063Parser() {
		if (materialAssociationAssociationEnd1PropertyCardinalitiesLabelAux_6063Parser == null) {
			materialAssociationAssociationEnd1PropertyCardinalitiesLabelAux_6063Parser = createMaterialAssociationAssociationEnd1PropertyCardinalitiesLabelAux_6063Parser();
		}
		return materialAssociationAssociationEnd1PropertyCardinalitiesLabelAux_6063Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMaterialAssociationAssociationEnd1PropertyCardinalitiesLabelAux_6063Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getAssociation_AssociationEnd1PropertyCardinalitiesLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser materialAssociationAssociationEnd2PropertyNameLabelAux_6064Parser;

	/**
	 * @generated
	 */
	private IParser getMaterialAssociationAssociationEnd2PropertyNameLabelAux_6064Parser() {
		if (materialAssociationAssociationEnd2PropertyNameLabelAux_6064Parser == null) {
			materialAssociationAssociationEnd2PropertyNameLabelAux_6064Parser = createMaterialAssociationAssociationEnd2PropertyNameLabelAux_6064Parser();
		}
		return materialAssociationAssociationEnd2PropertyNameLabelAux_6064Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMaterialAssociationAssociationEnd2PropertyNameLabelAux_6064Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getAssociation_AssociationEnd2PropertyNameLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser materialAssociationAssociationEnd2PropertyCardinalitiesLabelAux_6065Parser;

	/**
	 * @generated
	 */
	private IParser getMaterialAssociationAssociationEnd2PropertyCardinalitiesLabelAux_6065Parser() {
		if (materialAssociationAssociationEnd2PropertyCardinalitiesLabelAux_6065Parser == null) {
			materialAssociationAssociationEnd2PropertyCardinalitiesLabelAux_6065Parser = createMaterialAssociationAssociationEnd2PropertyCardinalitiesLabelAux_6065Parser();
		}
		return materialAssociationAssociationEnd2PropertyCardinalitiesLabelAux_6065Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMaterialAssociationAssociationEnd2PropertyCardinalitiesLabelAux_6065Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getAssociation_AssociationEnd2PropertyCardinalitiesLabelAux(), };
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
	private IParser mediationSourcePropertyNameLabelAux_6038Parser;

	/**
	 * @generated
	 */
	private IParser getMediationSourcePropertyNameLabelAux_6038Parser() {
		if (mediationSourcePropertyNameLabelAux_6038Parser == null) {
			mediationSourcePropertyNameLabelAux_6038Parser = createMediationSourcePropertyNameLabelAux_6038Parser();
		}
		return mediationSourcePropertyNameLabelAux_6038Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMediationSourcePropertyNameLabelAux_6038Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_SourcePropertyNameLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser mediationSourcePropertyCardinalitiesLabelAux_6039Parser;

	/**
	 * @generated
	 */
	private IParser getMediationSourcePropertyCardinalitiesLabelAux_6039Parser() {
		if (mediationSourcePropertyCardinalitiesLabelAux_6039Parser == null) {
			mediationSourcePropertyCardinalitiesLabelAux_6039Parser = createMediationSourcePropertyCardinalitiesLabelAux_6039Parser();
		}
		return mediationSourcePropertyCardinalitiesLabelAux_6039Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMediationSourcePropertyCardinalitiesLabelAux_6039Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_SourcePropertyCardinalitiesLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser mediationTargetPropertyNameLabelAux_6040Parser;

	/**
	 * @generated
	 */
	private IParser getMediationTargetPropertyNameLabelAux_6040Parser() {
		if (mediationTargetPropertyNameLabelAux_6040Parser == null) {
			mediationTargetPropertyNameLabelAux_6040Parser = createMediationTargetPropertyNameLabelAux_6040Parser();
		}
		return mediationTargetPropertyNameLabelAux_6040Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMediationTargetPropertyNameLabelAux_6040Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_TargetPropertyNameLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser mediationTargetPropertyCardinalitiesLabelAux_6041Parser;

	/**
	 * @generated
	 */
	private IParser getMediationTargetPropertyCardinalitiesLabelAux_6041Parser() {
		if (mediationTargetPropertyCardinalitiesLabelAux_6041Parser == null) {
			mediationTargetPropertyCardinalitiesLabelAux_6041Parser = createMediationTargetPropertyCardinalitiesLabelAux_6041Parser();
		}
		return mediationTargetPropertyCardinalitiesLabelAux_6041Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMediationTargetPropertyCardinalitiesLabelAux_6041Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_TargetPropertyCardinalitiesLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser memberOfName_6014Parser;

	/**
	 * @generated
	 */
	private IParser getMemberOfName_6014Parser() {
		if (memberOfName_6014Parser == null) {
			memberOfName_6014Parser = createMemberOfName_6014Parser();
		}
		return memberOfName_6014Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMemberOfName_6014Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser memberOfSourcePropertyNameLabelAux_6042Parser;

	/**
	 * @generated
	 */
	private IParser getMemberOfSourcePropertyNameLabelAux_6042Parser() {
		if (memberOfSourcePropertyNameLabelAux_6042Parser == null) {
			memberOfSourcePropertyNameLabelAux_6042Parser = createMemberOfSourcePropertyNameLabelAux_6042Parser();
		}
		return memberOfSourcePropertyNameLabelAux_6042Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMemberOfSourcePropertyNameLabelAux_6042Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_SourcePropertyNameLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser memberOfSourcePropertyCardinalitiesLabelAux_6043Parser;

	/**
	 * @generated
	 */
	private IParser getMemberOfSourcePropertyCardinalitiesLabelAux_6043Parser() {
		if (memberOfSourcePropertyCardinalitiesLabelAux_6043Parser == null) {
			memberOfSourcePropertyCardinalitiesLabelAux_6043Parser = createMemberOfSourcePropertyCardinalitiesLabelAux_6043Parser();
		}
		return memberOfSourcePropertyCardinalitiesLabelAux_6043Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMemberOfSourcePropertyCardinalitiesLabelAux_6043Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_SourcePropertyCardinalitiesLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser memberOfTargetPropertyNameLabelAux_6044Parser;

	/**
	 * @generated
	 */
	private IParser getMemberOfTargetPropertyNameLabelAux_6044Parser() {
		if (memberOfTargetPropertyNameLabelAux_6044Parser == null) {
			memberOfTargetPropertyNameLabelAux_6044Parser = createMemberOfTargetPropertyNameLabelAux_6044Parser();
		}
		return memberOfTargetPropertyNameLabelAux_6044Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMemberOfTargetPropertyNameLabelAux_6044Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_TargetPropertyNameLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser memberOfTargetPropertyCardinalitiesLabelAux_6045Parser;

	/**
	 * @generated
	 */
	private IParser getMemberOfTargetPropertyCardinalitiesLabelAux_6045Parser() {
		if (memberOfTargetPropertyCardinalitiesLabelAux_6045Parser == null) {
			memberOfTargetPropertyCardinalitiesLabelAux_6045Parser = createMemberOfTargetPropertyCardinalitiesLabelAux_6045Parser();
		}
		return memberOfTargetPropertyCardinalitiesLabelAux_6045Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMemberOfTargetPropertyCardinalitiesLabelAux_6045Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_TargetPropertyCardinalitiesLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser subCollectionOfName_6016Parser;

	/**
	 * @generated
	 */
	private IParser getSubCollectionOfName_6016Parser() {
		if (subCollectionOfName_6016Parser == null) {
			subCollectionOfName_6016Parser = createSubCollectionOfName_6016Parser();
		}
		return subCollectionOfName_6016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSubCollectionOfName_6016Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser subCollectionOfSourcePropertyNameLabelAux_6046Parser;

	/**
	 * @generated
	 */
	private IParser getSubCollectionOfSourcePropertyNameLabelAux_6046Parser() {
		if (subCollectionOfSourcePropertyNameLabelAux_6046Parser == null) {
			subCollectionOfSourcePropertyNameLabelAux_6046Parser = createSubCollectionOfSourcePropertyNameLabelAux_6046Parser();
		}
		return subCollectionOfSourcePropertyNameLabelAux_6046Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSubCollectionOfSourcePropertyNameLabelAux_6046Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_SourcePropertyNameLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser subCollectionOfSourcePropertyCardinalitiesLabelAux_6047Parser;

	/**
	 * @generated
	 */
	private IParser getSubCollectionOfSourcePropertyCardinalitiesLabelAux_6047Parser() {
		if (subCollectionOfSourcePropertyCardinalitiesLabelAux_6047Parser == null) {
			subCollectionOfSourcePropertyCardinalitiesLabelAux_6047Parser = createSubCollectionOfSourcePropertyCardinalitiesLabelAux_6047Parser();
		}
		return subCollectionOfSourcePropertyCardinalitiesLabelAux_6047Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSubCollectionOfSourcePropertyCardinalitiesLabelAux_6047Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_SourcePropertyCardinalitiesLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser subCollectionOfTargetPropertyNameLabelAux_6048Parser;

	/**
	 * @generated
	 */
	private IParser getSubCollectionOfTargetPropertyNameLabelAux_6048Parser() {
		if (subCollectionOfTargetPropertyNameLabelAux_6048Parser == null) {
			subCollectionOfTargetPropertyNameLabelAux_6048Parser = createSubCollectionOfTargetPropertyNameLabelAux_6048Parser();
		}
		return subCollectionOfTargetPropertyNameLabelAux_6048Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSubCollectionOfTargetPropertyNameLabelAux_6048Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_TargetPropertyNameLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser subCollectionOfTargetPropertyCardinalitiesLabelAux_6049Parser;

	/**
	 * @generated
	 */
	private IParser getSubCollectionOfTargetPropertyCardinalitiesLabelAux_6049Parser() {
		if (subCollectionOfTargetPropertyCardinalitiesLabelAux_6049Parser == null) {
			subCollectionOfTargetPropertyCardinalitiesLabelAux_6049Parser = createSubCollectionOfTargetPropertyCardinalitiesLabelAux_6049Parser();
		}
		return subCollectionOfTargetPropertyCardinalitiesLabelAux_6049Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSubCollectionOfTargetPropertyCardinalitiesLabelAux_6049Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_TargetPropertyCardinalitiesLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser subQuantityOfName_6018Parser;

	/**
	 * @generated
	 */
	private IParser getSubQuantityOfName_6018Parser() {
		if (subQuantityOfName_6018Parser == null) {
			subQuantityOfName_6018Parser = createSubQuantityOfName_6018Parser();
		}
		return subQuantityOfName_6018Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSubQuantityOfName_6018Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getNamedElement_Name(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser subQuantityOfSourcePropertyNameLabelAux_6050Parser;

	/**
	 * @generated
	 */
	private IParser getSubQuantityOfSourcePropertyNameLabelAux_6050Parser() {
		if (subQuantityOfSourcePropertyNameLabelAux_6050Parser == null) {
			subQuantityOfSourcePropertyNameLabelAux_6050Parser = createSubQuantityOfSourcePropertyNameLabelAux_6050Parser();
		}
		return subQuantityOfSourcePropertyNameLabelAux_6050Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSubQuantityOfSourcePropertyNameLabelAux_6050Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_SourcePropertyNameLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser subQuantityOfSourcePropertyCardinalitiesLabelAux_6051Parser;

	/**
	 * @generated
	 */
	private IParser getSubQuantityOfSourcePropertyCardinalitiesLabelAux_6051Parser() {
		if (subQuantityOfSourcePropertyCardinalitiesLabelAux_6051Parser == null) {
			subQuantityOfSourcePropertyCardinalitiesLabelAux_6051Parser = createSubQuantityOfSourcePropertyCardinalitiesLabelAux_6051Parser();
		}
		return subQuantityOfSourcePropertyCardinalitiesLabelAux_6051Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSubQuantityOfSourcePropertyCardinalitiesLabelAux_6051Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_SourcePropertyCardinalitiesLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser subQuantityOfTargetPropertyNameLabelAux_6052Parser;

	/**
	 * @generated
	 */
	private IParser getSubQuantityOfTargetPropertyNameLabelAux_6052Parser() {
		if (subQuantityOfTargetPropertyNameLabelAux_6052Parser == null) {
			subQuantityOfTargetPropertyNameLabelAux_6052Parser = createSubQuantityOfTargetPropertyNameLabelAux_6052Parser();
		}
		return subQuantityOfTargetPropertyNameLabelAux_6052Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSubQuantityOfTargetPropertyNameLabelAux_6052Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_TargetPropertyNameLabelAux(), };
		OntoUML.diagram.parsers.MessageFormatParser parser = new OntoUML.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser subQuantityOfTargetPropertyCardinalitiesLabelAux_6053Parser;

	/**
	 * @generated
	 */
	private IParser getSubQuantityOfTargetPropertyCardinalitiesLabelAux_6053Parser() {
		if (subQuantityOfTargetPropertyCardinalitiesLabelAux_6053Parser == null) {
			subQuantityOfTargetPropertyCardinalitiesLabelAux_6053Parser = createSubQuantityOfTargetPropertyCardinalitiesLabelAux_6053Parser();
		}
		return subQuantityOfTargetPropertyCardinalitiesLabelAux_6053Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSubQuantityOfTargetPropertyCardinalitiesLabelAux_6053Parser() {
		EAttribute[] features = new EAttribute[] { OntoUML.OntoUMLPackage.eINSTANCE
				.getDirectedRelationship_TargetPropertyCardinalitiesLabelAux(), };
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
		case OntoUML.diagram.edit.parts.PropertyEditPart.VISUAL_ID:
			return getProperty_3028Parser();
		case OntoUML.diagram.edit.parts.Property2EditPart.VISUAL_ID:
			return getProperty_3029Parser();
		case OntoUML.diagram.edit.parts.Property3EditPart.VISUAL_ID:
			return getProperty_3030Parser();
		case OntoUML.diagram.edit.parts.Property4EditPart.VISUAL_ID:
			return getProperty_3031Parser();
		case OntoUML.diagram.edit.parts.Property5EditPart.VISUAL_ID:
			return getProperty_3032Parser();
		case OntoUML.diagram.edit.parts.Property6EditPart.VISUAL_ID:
			return getProperty_3033Parser();
		case OntoUML.diagram.edit.parts.Property7EditPart.VISUAL_ID:
			return getProperty_3034Parser();
		case OntoUML.diagram.edit.parts.Property8EditPart.VISUAL_ID:
			return getProperty_3035Parser();
		case OntoUML.diagram.edit.parts.Property9EditPart.VISUAL_ID:
			return getProperty_3036Parser();
		case OntoUML.diagram.edit.parts.Property10EditPart.VISUAL_ID:
			return getProperty_3037Parser();
		case OntoUML.diagram.edit.parts.Property11EditPart.VISUAL_ID:
			return getProperty_3038Parser();
		case OntoUML.diagram.edit.parts.Property12EditPart.VISUAL_ID:
			return getProperty_3039Parser();
		case OntoUML.diagram.edit.parts.Property13EditPart.VISUAL_ID:
			return getProperty_3040Parser();
		case OntoUML.diagram.edit.parts.CharacterizationNameEditPart.VISUAL_ID:
			return getCharacterizationName_6002Parser();
		case OntoUML.diagram.edit.parts.CharacterizationSourcePropertyNameLabelEditPart.VISUAL_ID:
			return getCharacterizationSourcePropertyNameLabelAux_6032Parser();
		case OntoUML.diagram.edit.parts.CharacterizationSourcePropertyCardinaliEditPart.VISUAL_ID:
			return getCharacterizationSourcePropertyCardinalitiesLabelAux_6033Parser();
		case OntoUML.diagram.edit.parts.CharacterizationTargetPropertyNameLabelEditPart.VISUAL_ID:
			return getCharacterizationTargetPropertyNameLabelAux_6034Parser();
		case OntoUML.diagram.edit.parts.CharacterizationTargetPropertyCardinaliEditPart.VISUAL_ID:
			return getCharacterizationTargetPropertyCardinalitiesLabelAux_6035Parser();
		case OntoUML.diagram.edit.parts.ComponentOfNameEditPart.VISUAL_ID:
			return getComponentOfName_6004Parser();
		case OntoUML.diagram.edit.parts.ComponentOfSourcePropertyNameLabelEditPart.VISUAL_ID:
			return getComponentOfSourcePropertyNameLabelAux_6028Parser();
		case OntoUML.diagram.edit.parts.ComponentOfSourcePropertyCardinaliEditPart.VISUAL_ID:
			return getComponentOfSourcePropertyCardinalitiesLabelAux_6029Parser();
		case OntoUML.diagram.edit.parts.ComponentOfTargetPropertyNameLabelEditPart.VISUAL_ID:
			return getComponentOfTargetPropertyNameLabelAux_6030Parser();
		case OntoUML.diagram.edit.parts.ComponentOfTargetPropertyCardinaliEditPart.VISUAL_ID:
			return getComponentOfTargetPropertyCardinalitiesLabelAux_6031Parser();
		case OntoUML.diagram.edit.parts.DatatypeRelationshipNameEditPart.VISUAL_ID:
			return getDatatypeRelationshipName_6067Parser();
		case OntoUML.diagram.edit.parts.DatatypeRelationshipSourcePropertyNameLabelEditPart.VISUAL_ID:
			return getDatatypeRelationshipSourcePropertyNameLabelAux_6068Parser();
		case OntoUML.diagram.edit.parts.DatatypeRelationshipSourcePropertyCardinaliEditPart.VISUAL_ID:
			return getDatatypeRelationshipSourcePropertyCardinalitiesLabelAux_6069Parser();
		case OntoUML.diagram.edit.parts.DatatypeRelationshipTargetPropertyNameLabelEditPart.VISUAL_ID:
			return getDatatypeRelationshipTargetPropertyNameLabelAux_6070Parser();
		case OntoUML.diagram.edit.parts.DatatypeRelationshipTargetPropertyCardinaliEditPart.VISUAL_ID:
			return getDatatypeRelationshipTargetPropertyCardinalitiesLabelAux_6071Parser();
		case OntoUML.diagram.edit.parts.DerivationNameEditPart.VISUAL_ID:
			return getDerivationName_6006Parser();
		case OntoUML.diagram.edit.parts.DerivationSourcePropertyCardinaliEditPart.VISUAL_ID:
			return getDerivationSourcePropertyCardinalitiesLabelAux_6036Parser();
		case OntoUML.diagram.edit.parts.DerivationTargetPropertyCardinaliEditPart.VISUAL_ID:
			return getDerivationTargetPropertyCardinalitiesLabelAux_6037Parser();
		case OntoUML.diagram.edit.parts.FormalAssociationNameEditPart.VISUAL_ID:
			return getFormalAssociationName_6008Parser();
		case OntoUML.diagram.edit.parts.FormalAssociationAssociationEnd1PropertyEditPart.VISUAL_ID:
			return getFormalAssociationAssociationEnd1PropertyNameLabelAux_6058Parser();
		case OntoUML.diagram.edit.parts.FormalAssociationAssociationEnd1Property2EditPart.VISUAL_ID:
			return getFormalAssociationAssociationEnd1PropertyCardinalitiesLabelAux_6059Parser();
		case OntoUML.diagram.edit.parts.FormalAssociationAssociationEnd2PropertyEditPart.VISUAL_ID:
			return getFormalAssociationAssociationEnd2PropertyNameLabelAux_6060Parser();
		case OntoUML.diagram.edit.parts.FormalAssociationAssociationEnd2Property2EditPart.VISUAL_ID:
			return getFormalAssociationAssociationEnd2PropertyCardinalitiesLabelAux_6061Parser();
		case OntoUML.diagram.edit.parts.MaterialAssociationNameEditPart.VISUAL_ID:
			return getMaterialAssociationName_6010Parser();
		case OntoUML.diagram.edit.parts.MaterialAssociationAssociationEnd1PropertyEditPart.VISUAL_ID:
			return getMaterialAssociationAssociationEnd1PropertyNameLabelAux_6062Parser();
		case OntoUML.diagram.edit.parts.MaterialAssociationAssociationEnd1Property2EditPart.VISUAL_ID:
			return getMaterialAssociationAssociationEnd1PropertyCardinalitiesLabelAux_6063Parser();
		case OntoUML.diagram.edit.parts.MaterialAssociationAssociationEnd2PropertyEditPart.VISUAL_ID:
			return getMaterialAssociationAssociationEnd2PropertyNameLabelAux_6064Parser();
		case OntoUML.diagram.edit.parts.MaterialAssociationAssociationEnd2Property2EditPart.VISUAL_ID:
			return getMaterialAssociationAssociationEnd2PropertyCardinalitiesLabelAux_6065Parser();
		case OntoUML.diagram.edit.parts.MediationNameEditPart.VISUAL_ID:
			return getMediationName_6012Parser();
		case OntoUML.diagram.edit.parts.MediationSourcePropertyNameLabelEditPart.VISUAL_ID:
			return getMediationSourcePropertyNameLabelAux_6038Parser();
		case OntoUML.diagram.edit.parts.MediationSourcePropertyCardinaliEditPart.VISUAL_ID:
			return getMediationSourcePropertyCardinalitiesLabelAux_6039Parser();
		case OntoUML.diagram.edit.parts.MediationTargetPropertyNameLabelEditPart.VISUAL_ID:
			return getMediationTargetPropertyNameLabelAux_6040Parser();
		case OntoUML.diagram.edit.parts.MediationTargetPropertyCardinaliEditPart.VISUAL_ID:
			return getMediationTargetPropertyCardinalitiesLabelAux_6041Parser();
		case OntoUML.diagram.edit.parts.MemberOfNameEditPart.VISUAL_ID:
			return getMemberOfName_6014Parser();
		case OntoUML.diagram.edit.parts.MemberOfSourcePropertyNameLabelEditPart.VISUAL_ID:
			return getMemberOfSourcePropertyNameLabelAux_6042Parser();
		case OntoUML.diagram.edit.parts.MemberOfSourcePropertyCardinaliEditPart.VISUAL_ID:
			return getMemberOfSourcePropertyCardinalitiesLabelAux_6043Parser();
		case OntoUML.diagram.edit.parts.MemberOfTargetPropertyNameLabelEditPart.VISUAL_ID:
			return getMemberOfTargetPropertyNameLabelAux_6044Parser();
		case OntoUML.diagram.edit.parts.MemberOfTargetPropertyCardinaliEditPart.VISUAL_ID:
			return getMemberOfTargetPropertyCardinalitiesLabelAux_6045Parser();
		case OntoUML.diagram.edit.parts.SubCollectionOfNameEditPart.VISUAL_ID:
			return getSubCollectionOfName_6016Parser();
		case OntoUML.diagram.edit.parts.SubCollectionOfSourcePropertyNameLabelEditPart.VISUAL_ID:
			return getSubCollectionOfSourcePropertyNameLabelAux_6046Parser();
		case OntoUML.diagram.edit.parts.SubCollectionOfSourcePropertyCardinaliEditPart.VISUAL_ID:
			return getSubCollectionOfSourcePropertyCardinalitiesLabelAux_6047Parser();
		case OntoUML.diagram.edit.parts.SubCollectionOfTargetPropertyNameLabelEditPart.VISUAL_ID:
			return getSubCollectionOfTargetPropertyNameLabelAux_6048Parser();
		case OntoUML.diagram.edit.parts.SubCollectionOfTargetPropertyCardinaliEditPart.VISUAL_ID:
			return getSubCollectionOfTargetPropertyCardinalitiesLabelAux_6049Parser();
		case OntoUML.diagram.edit.parts.SubQuantityOfNameEditPart.VISUAL_ID:
			return getSubQuantityOfName_6018Parser();
		case OntoUML.diagram.edit.parts.SubQuantityOfSourcePropertyNameLabelEditPart.VISUAL_ID:
			return getSubQuantityOfSourcePropertyNameLabelAux_6050Parser();
		case OntoUML.diagram.edit.parts.SubQuantityOfSourcePropertyCardinaliEditPart.VISUAL_ID:
			return getSubQuantityOfSourcePropertyCardinalitiesLabelAux_6051Parser();
		case OntoUML.diagram.edit.parts.SubQuantityOfTargetPropertyNameLabelEditPart.VISUAL_ID:
			return getSubQuantityOfTargetPropertyNameLabelAux_6052Parser();
		case OntoUML.diagram.edit.parts.SubQuantityOfTargetPropertyCardinaliEditPart.VISUAL_ID:
			return getSubQuantityOfTargetPropertyCardinalitiesLabelAux_6053Parser();
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
