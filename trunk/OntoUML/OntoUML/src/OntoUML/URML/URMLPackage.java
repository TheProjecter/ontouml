/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.URML;

import OntoUML.OntoUMLPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see OntoUML.URML.URMLFactory
 * @model kind="package"
 * @generated
 */
public interface URMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "URML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "OntoUML.URML";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "OntoUML.URML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	URMLPackage eINSTANCE = OntoUML.URML.impl.URMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link OntoUML.URML.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.URML.impl.RuleImpl
	 * @see OntoUML.URML.impl.URMLPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ATTRIBUTE = OntoUMLPackage.NAMED_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__OWNER = OntoUMLPackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONTAINER = OntoUMLPackage.NAMED_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = OntoUMLPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONDITION = OntoUMLPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = OntoUMLPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link OntoUML.URML.impl.DerivationRuleImpl <em>Derivation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.URML.impl.DerivationRuleImpl
	 * @see OntoUML.URML.impl.URMLPackageImpl#getDerivationRule()
	 * @generated
	 */
	int DERIVATION_RULE = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_RULE__ATTRIBUTE = RULE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_RULE__OWNER = RULE__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_RULE__CONTAINER = RULE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_RULE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_RULE__CONDITION = RULE__CONDITION;

	/**
	 * The feature id for the '<em><b>Conclusion</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_RULE__CONCLUSION = RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derivation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link OntoUML.URML.impl.ConclusionImpl <em>Conclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.URML.impl.ConclusionImpl
	 * @see OntoUML.URML.impl.URMLPackageImpl#getConclusion()
	 * @generated
	 */
	int CONCLUSION = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION__ATTRIBUTE = OntoUMLPackage.RELATIONAL_CLASSIFIER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION__OWNER = OntoUMLPackage.RELATIONAL_CLASSIFIER__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION__CONTAINER = OntoUMLPackage.RELATIONAL_CLASSIFIER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION__NAME = OntoUMLPackage.RELATIONAL_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION__IS_ABSTRACT = OntoUMLPackage.RELATIONAL_CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION__GENERAL = OntoUMLPackage.RELATIONAL_CLASSIFIER__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION__GENERALIZATION = OntoUMLPackage.RELATIONAL_CLASSIFIER__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Conclusion Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION__CONCLUSION_RULE = OntoUMLPackage.RELATIONAL_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION_FEATURE_COUNT = OntoUMLPackage.RELATIONAL_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link OntoUML.URML.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.URML.impl.ConditionImpl
	 * @see OntoUML.URML.impl.URMLPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ATTRIBUTE = OntoUMLPackage.RELATIONAL_CLASSIFIER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OWNER = OntoUMLPackage.RELATIONAL_CLASSIFIER__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONTAINER = OntoUMLPackage.RELATIONAL_CLASSIFIER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = OntoUMLPackage.RELATIONAL_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__IS_ABSTRACT = OntoUMLPackage.RELATIONAL_CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__GENERAL = OntoUMLPackage.RELATIONAL_CLASSIFIER__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__GENERALIZATION = OntoUMLPackage.RELATIONAL_CLASSIFIER__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NEGATIVE = OntoUMLPackage.RELATIONAL_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION_RULE = OntoUMLPackage.RELATIONAL_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = OntoUMLPackage.RELATIONAL_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link OntoUML.URML.impl.ClassifierAtomImpl <em>Classifier Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.URML.impl.ClassifierAtomImpl
	 * @see OntoUML.URML.impl.URMLPackageImpl#getClassifierAtom()
	 * @generated
	 */
	int CLASSIFIER_ATOM = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ATOM__ATTRIBUTE = CONDITION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ATOM__OWNER = CONDITION__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ATOM__CONTAINER = CONDITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ATOM__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ATOM__IS_ABSTRACT = CONDITION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ATOM__GENERAL = CONDITION__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ATOM__GENERALIZATION = CONDITION__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ATOM__NEGATIVE = CONDITION__NEGATIVE;

	/**
	 * The feature id for the '<em><b>Condition Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ATOM__CONDITION_RULE = CONDITION__CONDITION_RULE;

	/**
	 * The feature id for the '<em><b>Conclusion Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ATOM__CONCLUSION_RULE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ATOM__CLASS = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ATOM__CLASS_VARIABLE = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Classifier Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ATOM_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link OntoUML.URML.impl.RoleTypeAtomImpl <em>Role Type Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.URML.impl.RoleTypeAtomImpl
	 * @see OntoUML.URML.impl.URMLPackageImpl#getRoleTypeAtom()
	 * @generated
	 */
	int ROLE_TYPE_ATOM = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATOM__ATTRIBUTE = CONCLUSION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATOM__OWNER = CONCLUSION__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATOM__CONTAINER = CONCLUSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATOM__NAME = CONCLUSION__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATOM__IS_ABSTRACT = CONCLUSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATOM__GENERAL = CONCLUSION__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATOM__GENERALIZATION = CONCLUSION__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Conclusion Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATOM__CONCLUSION_RULE = CONCLUSION__CONCLUSION_RULE;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATOM__NEGATIVE = CONCLUSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATOM__CONDITION_RULE = CONCLUSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Type Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATOM_FEATURE_COUNT = CONCLUSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link OntoUML.URML.impl.BinaryAssociationAtomImpl <em>Binary Association Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.URML.impl.BinaryAssociationAtomImpl
	 * @see OntoUML.URML.impl.URMLPackageImpl#getBinaryAssociationAtom()
	 * @generated
	 */
	int BINARY_ASSOCIATION_ATOM = 6;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ASSOCIATION_ATOM__ATTRIBUTE = CONDITION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ASSOCIATION_ATOM__OWNER = CONDITION__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ASSOCIATION_ATOM__CONTAINER = CONDITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ASSOCIATION_ATOM__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ASSOCIATION_ATOM__IS_ABSTRACT = CONDITION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ASSOCIATION_ATOM__GENERAL = CONDITION__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ASSOCIATION_ATOM__GENERALIZATION = CONDITION__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ASSOCIATION_ATOM__NEGATIVE = CONDITION__NEGATIVE;

	/**
	 * The feature id for the '<em><b>Condition Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ASSOCIATION_ATOM__CONDITION_RULE = CONDITION__CONDITION_RULE;

	/**
	 * The feature id for the '<em><b>Conclusion Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ASSOCIATION_ATOM__CONCLUSION_RULE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ASSOCIATION_ATOM__ASSOCIATION = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ASSOCIATION_ATOM__SOURCE_VARIABLE = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ASSOCIATION_ATOM__TARGET_VARIABLE = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Binary Association Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ASSOCIATION_ATOM_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link OntoUML.URML.impl.ObjectVariableImpl <em>Object Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.URML.impl.ObjectVariableImpl
	 * @see OntoUML.URML.impl.URMLPackageImpl#getObjectVariable()
	 * @generated
	 */
	int OBJECT_VARIABLE = 7;

	/**
	 * The number of structural features of the '<em>Object Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link OntoUML.URML.impl.AttributionAtomImpl <em>Attribution Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.URML.impl.AttributionAtomImpl
	 * @see OntoUML.URML.impl.URMLPackageImpl#getAttributionAtom()
	 * @generated
	 */
	int ATTRIBUTION_ATOM = 8;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_ATOM__ATTRIBUTE = CONCLUSION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_ATOM__OWNER = CONCLUSION__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_ATOM__CONTAINER = CONCLUSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_ATOM__NAME = CONCLUSION__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_ATOM__IS_ABSTRACT = CONCLUSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_ATOM__GENERAL = CONCLUSION__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_ATOM__GENERALIZATION = CONCLUSION__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Conclusion Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_ATOM__CONCLUSION_RULE = CONCLUSION__CONCLUSION_RULE;

	/**
	 * The number of structural features of the '<em>Attribution Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_ATOM_FEATURE_COUNT = CONCLUSION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link OntoUML.URML.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see OntoUML.URML.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the reference list '{@link OntoUML.URML.Rule#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Condition</em>'.
	 * @see OntoUML.URML.Rule#getCondition()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Condition();

	/**
	 * Returns the meta object for class '{@link OntoUML.URML.DerivationRule <em>Derivation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derivation Rule</em>'.
	 * @see OntoUML.URML.DerivationRule
	 * @generated
	 */
	EClass getDerivationRule();

	/**
	 * Returns the meta object for the reference list '{@link OntoUML.URML.DerivationRule#getConclusion <em>Conclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conclusion</em>'.
	 * @see OntoUML.URML.DerivationRule#getConclusion()
	 * @see #getDerivationRule()
	 * @generated
	 */
	EReference getDerivationRule_Conclusion();

	/**
	 * Returns the meta object for class '{@link OntoUML.URML.Conclusion <em>Conclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conclusion</em>'.
	 * @see OntoUML.URML.Conclusion
	 * @generated
	 */
	EClass getConclusion();

	/**
	 * Returns the meta object for the reference '{@link OntoUML.URML.Conclusion#getConclusionRule <em>Conclusion Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conclusion Rule</em>'.
	 * @see OntoUML.URML.Conclusion#getConclusionRule()
	 * @see #getConclusion()
	 * @generated
	 */
	EReference getConclusion_ConclusionRule();

	/**
	 * Returns the meta object for class '{@link OntoUML.URML.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see OntoUML.URML.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link OntoUML.URML.Condition#isNegative <em>Negative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negative</em>'.
	 * @see OntoUML.URML.Condition#isNegative()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Negative();

	/**
	 * Returns the meta object for the reference '{@link OntoUML.URML.Condition#getConditionRule <em>Condition Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition Rule</em>'.
	 * @see OntoUML.URML.Condition#getConditionRule()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_ConditionRule();

	/**
	 * Returns the meta object for class '{@link OntoUML.URML.ClassifierAtom <em>Classifier Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Atom</em>'.
	 * @see OntoUML.URML.ClassifierAtom
	 * @generated
	 */
	EClass getClassifierAtom();

	/**
	 * Returns the meta object for the reference '{@link OntoUML.URML.ClassifierAtom#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see OntoUML.URML.ClassifierAtom#getClass_()
	 * @see #getClassifierAtom()
	 * @generated
	 */
	EReference getClassifierAtom_Class();

	/**
	 * Returns the meta object for the attribute '{@link OntoUML.URML.ClassifierAtom#getClassVariable <em>Class Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Variable</em>'.
	 * @see OntoUML.URML.ClassifierAtom#getClassVariable()
	 * @see #getClassifierAtom()
	 * @generated
	 */
	EAttribute getClassifierAtom_ClassVariable();

	/**
	 * Returns the meta object for class '{@link OntoUML.URML.RoleTypeAtom <em>Role Type Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Type Atom</em>'.
	 * @see OntoUML.URML.RoleTypeAtom
	 * @generated
	 */
	EClass getRoleTypeAtom();

	/**
	 * Returns the meta object for class '{@link OntoUML.URML.BinaryAssociationAtom <em>Binary Association Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Association Atom</em>'.
	 * @see OntoUML.URML.BinaryAssociationAtom
	 * @generated
	 */
	EClass getBinaryAssociationAtom();

	/**
	 * Returns the meta object for the reference '{@link OntoUML.URML.BinaryAssociationAtom#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association</em>'.
	 * @see OntoUML.URML.BinaryAssociationAtom#getAssociation()
	 * @see #getBinaryAssociationAtom()
	 * @generated
	 */
	EReference getBinaryAssociationAtom_Association();

	/**
	 * Returns the meta object for the attribute '{@link OntoUML.URML.BinaryAssociationAtom#getSourceVariable <em>Source Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Variable</em>'.
	 * @see OntoUML.URML.BinaryAssociationAtom#getSourceVariable()
	 * @see #getBinaryAssociationAtom()
	 * @generated
	 */
	EAttribute getBinaryAssociationAtom_SourceVariable();

	/**
	 * Returns the meta object for the attribute '{@link OntoUML.URML.BinaryAssociationAtom#getTargetVariable <em>Target Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Variable</em>'.
	 * @see OntoUML.URML.BinaryAssociationAtom#getTargetVariable()
	 * @see #getBinaryAssociationAtom()
	 * @generated
	 */
	EAttribute getBinaryAssociationAtom_TargetVariable();

	/**
	 * Returns the meta object for class '{@link OntoUML.URML.ObjectVariable <em>Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Variable</em>'.
	 * @see OntoUML.URML.ObjectVariable
	 * @generated
	 */
	EClass getObjectVariable();

	/**
	 * Returns the meta object for class '{@link OntoUML.URML.AttributionAtom <em>Attribution Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribution Atom</em>'.
	 * @see OntoUML.URML.AttributionAtom
	 * @generated
	 */
	EClass getAttributionAtom();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	URMLFactory getURMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link OntoUML.URML.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.URML.impl.RuleImpl
		 * @see OntoUML.URML.impl.URMLPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__CONDITION = eINSTANCE.getRule_Condition();

		/**
		 * The meta object literal for the '{@link OntoUML.URML.impl.DerivationRuleImpl <em>Derivation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.URML.impl.DerivationRuleImpl
		 * @see OntoUML.URML.impl.URMLPackageImpl#getDerivationRule()
		 * @generated
		 */
		EClass DERIVATION_RULE = eINSTANCE.getDerivationRule();

		/**
		 * The meta object literal for the '<em><b>Conclusion</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVATION_RULE__CONCLUSION = eINSTANCE.getDerivationRule_Conclusion();

		/**
		 * The meta object literal for the '{@link OntoUML.URML.impl.ConclusionImpl <em>Conclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.URML.impl.ConclusionImpl
		 * @see OntoUML.URML.impl.URMLPackageImpl#getConclusion()
		 * @generated
		 */
		EClass CONCLUSION = eINSTANCE.getConclusion();

		/**
		 * The meta object literal for the '<em><b>Conclusion Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCLUSION__CONCLUSION_RULE = eINSTANCE.getConclusion_ConclusionRule();

		/**
		 * The meta object literal for the '{@link OntoUML.URML.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.URML.impl.ConditionImpl
		 * @see OntoUML.URML.impl.URMLPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Negative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NEGATIVE = eINSTANCE.getCondition_Negative();

		/**
		 * The meta object literal for the '<em><b>Condition Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__CONDITION_RULE = eINSTANCE.getCondition_ConditionRule();

		/**
		 * The meta object literal for the '{@link OntoUML.URML.impl.ClassifierAtomImpl <em>Classifier Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.URML.impl.ClassifierAtomImpl
		 * @see OntoUML.URML.impl.URMLPackageImpl#getClassifierAtom()
		 * @generated
		 */
		EClass CLASSIFIER_ATOM = eINSTANCE.getClassifierAtom();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_ATOM__CLASS = eINSTANCE.getClassifierAtom_Class();

		/**
		 * The meta object literal for the '<em><b>Class Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER_ATOM__CLASS_VARIABLE = eINSTANCE.getClassifierAtom_ClassVariable();

		/**
		 * The meta object literal for the '{@link OntoUML.URML.impl.RoleTypeAtomImpl <em>Role Type Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.URML.impl.RoleTypeAtomImpl
		 * @see OntoUML.URML.impl.URMLPackageImpl#getRoleTypeAtom()
		 * @generated
		 */
		EClass ROLE_TYPE_ATOM = eINSTANCE.getRoleTypeAtom();

		/**
		 * The meta object literal for the '{@link OntoUML.URML.impl.BinaryAssociationAtomImpl <em>Binary Association Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.URML.impl.BinaryAssociationAtomImpl
		 * @see OntoUML.URML.impl.URMLPackageImpl#getBinaryAssociationAtom()
		 * @generated
		 */
		EClass BINARY_ASSOCIATION_ATOM = eINSTANCE.getBinaryAssociationAtom();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_ASSOCIATION_ATOM__ASSOCIATION = eINSTANCE.getBinaryAssociationAtom_Association();

		/**
		 * The meta object literal for the '<em><b>Source Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_ASSOCIATION_ATOM__SOURCE_VARIABLE = eINSTANCE.getBinaryAssociationAtom_SourceVariable();

		/**
		 * The meta object literal for the '<em><b>Target Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_ASSOCIATION_ATOM__TARGET_VARIABLE = eINSTANCE.getBinaryAssociationAtom_TargetVariable();

		/**
		 * The meta object literal for the '{@link OntoUML.URML.impl.ObjectVariableImpl <em>Object Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.URML.impl.ObjectVariableImpl
		 * @see OntoUML.URML.impl.URMLPackageImpl#getObjectVariable()
		 * @generated
		 */
		EClass OBJECT_VARIABLE = eINSTANCE.getObjectVariable();

		/**
		 * The meta object literal for the '{@link OntoUML.URML.impl.AttributionAtomImpl <em>Attribution Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.URML.impl.AttributionAtomImpl
		 * @see OntoUML.URML.impl.URMLPackageImpl#getAttributionAtom()
		 * @generated
		 */
		EClass ATTRIBUTION_ATOM = eINSTANCE.getAttributionAtom();

	}

} //URMLPackage
