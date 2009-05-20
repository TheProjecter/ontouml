/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.URML.impl;

import OntoUML.OntoUMLPackage;

import OntoUML.URML.AttributionAtom;
import OntoUML.URML.BinaryAssociationAtom;
import OntoUML.URML.ClassifierAtom;
import OntoUML.URML.Conclusion;
import OntoUML.URML.Condition;
import OntoUML.URML.DerivationRule;
import OntoUML.URML.ObjectVariable;
import OntoUML.URML.RoleTypeAtom;
import OntoUML.URML.Rule;
import OntoUML.URML.URMLFactory;
import OntoUML.URML.URMLPackage;

import OntoUML.impl.OntoUMLPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class URMLPackageImpl extends EPackageImpl implements URMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conclusionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleTypeAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryAssociationAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributionAtomEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see OntoUML.URML.URMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private URMLPackageImpl() {
		super(eNS_URI, URMLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static URMLPackage init() {
		if (isInited) return (URMLPackage)EPackage.Registry.INSTANCE.getEPackage(URMLPackage.eNS_URI);

		// Obtain or create and register package
		URMLPackageImpl theURMLPackage = (URMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof URMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new URMLPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		OntoUMLPackageImpl theOntoUMLPackage = (OntoUMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OntoUMLPackage.eNS_URI) instanceof OntoUMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OntoUMLPackage.eNS_URI) : OntoUMLPackage.eINSTANCE);

		// Create package meta-data objects
		theURMLPackage.createPackageContents();
		theOntoUMLPackage.createPackageContents();

		// Initialize created meta-data
		theURMLPackage.initializePackageContents();
		theOntoUMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theURMLPackage.freeze();

		return theURMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Condition() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivationRule() {
		return derivationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivationRule_Conclusion() {
		return (EReference)derivationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConclusion() {
		return conclusionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConclusion_ConclusionRule() {
		return (EReference)conclusionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Negative() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_ConditionRule() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierAtom() {
		return classifierAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierAtom_Class() {
		return (EReference)classifierAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifierAtom_ClassVariable() {
		return (EAttribute)classifierAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleTypeAtom() {
		return roleTypeAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryAssociationAtom() {
		return binaryAssociationAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryAssociationAtom_Association() {
		return (EReference)binaryAssociationAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryAssociationAtom_SourceVariable() {
		return (EAttribute)binaryAssociationAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryAssociationAtom_TargetVariable() {
		return (EAttribute)binaryAssociationAtomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectVariable() {
		return objectVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributionAtom() {
		return attributionAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URMLFactory getURMLFactory() {
		return (URMLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ruleEClass = createEClass(RULE);
		createEReference(ruleEClass, RULE__CONDITION);

		derivationRuleEClass = createEClass(DERIVATION_RULE);
		createEReference(derivationRuleEClass, DERIVATION_RULE__CONCLUSION);

		conclusionEClass = createEClass(CONCLUSION);
		createEReference(conclusionEClass, CONCLUSION__CONCLUSION_RULE);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__NEGATIVE);
		createEReference(conditionEClass, CONDITION__CONDITION_RULE);

		classifierAtomEClass = createEClass(CLASSIFIER_ATOM);
		createEReference(classifierAtomEClass, CLASSIFIER_ATOM__CLASS);
		createEAttribute(classifierAtomEClass, CLASSIFIER_ATOM__CLASS_VARIABLE);

		roleTypeAtomEClass = createEClass(ROLE_TYPE_ATOM);

		binaryAssociationAtomEClass = createEClass(BINARY_ASSOCIATION_ATOM);
		createEReference(binaryAssociationAtomEClass, BINARY_ASSOCIATION_ATOM__ASSOCIATION);
		createEAttribute(binaryAssociationAtomEClass, BINARY_ASSOCIATION_ATOM__SOURCE_VARIABLE);
		createEAttribute(binaryAssociationAtomEClass, BINARY_ASSOCIATION_ATOM__TARGET_VARIABLE);

		objectVariableEClass = createEClass(OBJECT_VARIABLE);

		attributionAtomEClass = createEClass(ATTRIBUTION_ATOM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OntoUMLPackage theOntoUMLPackage = (OntoUMLPackage)EPackage.Registry.INSTANCE.getEPackage(OntoUMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ruleEClass.getESuperTypes().add(theOntoUMLPackage.getNamedElement());
		derivationRuleEClass.getESuperTypes().add(this.getRule());
		conclusionEClass.getESuperTypes().add(theOntoUMLPackage.getRelationalClassifier());
		conditionEClass.getESuperTypes().add(theOntoUMLPackage.getRelationalClassifier());
		classifierAtomEClass.getESuperTypes().add(this.getCondition());
		classifierAtomEClass.getESuperTypes().add(this.getConclusion());
		roleTypeAtomEClass.getESuperTypes().add(this.getConclusion());
		roleTypeAtomEClass.getESuperTypes().add(this.getCondition());
		binaryAssociationAtomEClass.getESuperTypes().add(this.getCondition());
		binaryAssociationAtomEClass.getESuperTypes().add(this.getConclusion());
		attributionAtomEClass.getESuperTypes().add(this.getConclusion());

		// Initialize classes and features; add operations and parameters
		initEClass(ruleEClass, Rule.class, "Rule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRule_Condition(), this.getCondition(), this.getCondition_ConditionRule(), "condition", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivationRuleEClass, DerivationRule.class, "DerivationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivationRule_Conclusion(), this.getConclusion(), this.getConclusion_ConclusionRule(), "conclusion", null, 0, -1, DerivationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conclusionEClass, Conclusion.class, "Conclusion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConclusion_ConclusionRule(), this.getDerivationRule(), this.getDerivationRule_Conclusion(), "conclusionRule", null, 0, 1, Conclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Negative(), ecorePackage.getEBoolean(), "negative", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCondition_ConditionRule(), this.getRule(), this.getRule_Condition(), "conditionRule", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(classifierAtomEClass, ClassifierAtom.class, "ClassifierAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifierAtom_Class(), theOntoUMLPackage.getClass_(), null, "class", null, 1, 1, ClassifierAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassifierAtom_ClassVariable(), ecorePackage.getEString(), "classVariable", null, 0, 1, ClassifierAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleTypeAtomEClass, RoleTypeAtom.class, "RoleTypeAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryAssociationAtomEClass, BinaryAssociationAtom.class, "BinaryAssociationAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryAssociationAtom_Association(), theOntoUMLPackage.getRelationship(), null, "association", null, 1, 1, BinaryAssociationAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryAssociationAtom_SourceVariable(), ecorePackage.getEString(), "sourceVariable", null, 0, 1, BinaryAssociationAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryAssociationAtom_TargetVariable(), ecorePackage.getEString(), "targetVariable", null, 0, 1, BinaryAssociationAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectVariableEClass, ObjectVariable.class, "ObjectVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributionAtomEClass, AttributionAtom.class, "AttributionAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //URMLPackageImpl
