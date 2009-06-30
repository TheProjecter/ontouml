/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import OntoUML.AntiRigidMixinClass;
import OntoUML.AntiRigidSortalClass;
import OntoUML.Association;
import OntoUML.Category;
import OntoUML.Characterization;
import OntoUML.Classifier;
import OntoUML.Collective;
import OntoUML.Container;
import OntoUML.Datatype;
import OntoUML.DatatypeRelationship;
import OntoUML.DependencyRelationship;
import OntoUML.Derivation;
import OntoUML.DirectedBinaryRelationship;
import OntoUML.DirectedRelationship;
import OntoUML.Element;
import OntoUML.Feature;
import OntoUML.FormalAssociation;
import OntoUML.Generalization;
import OntoUML.GeneralizationSet;
import OntoUML.Kind;
import OntoUML.MaterialAssociation;
import OntoUML.Mediation;
import OntoUML.Meronymic;
import OntoUML.Mixin;
import OntoUML.MixinClass;
import OntoUML.Mode;
import OntoUML.MomentClass;
import OntoUML.MultiplicityElement;
import OntoUML.NamedElement;
import OntoUML.NonRigidMixinClass;
import OntoUML.ObjectClass;
import OntoUML.OntoUMLFactory;
import OntoUML.OntoUMLPackage;
import OntoUML.Phase;
import OntoUML.Property;
import OntoUML.Quantity;
import OntoUML.RedefinableElement;
import OntoUML.RelationalClassifier;
import OntoUML.Relationship;
import OntoUML.Relator;
import OntoUML.RigidMixinClass;
import OntoUML.RigidSortalClass;
import OntoUML.Role;
import OntoUML.RoleMixin;
import OntoUML.SemiRigidMixin;
import OntoUML.SimpleDatatype;
import OntoUML.SortalClass;
import OntoUML.StructuralDatatype;
import OntoUML.StructuralFeature;
import OntoUML.SubKind;
import OntoUML.SubstanceSortal;
import OntoUML.Type;
import OntoUML.TypedElement;
import OntoUML.componentOf;
import OntoUML.memberOf;
import OntoUML.subCollectionOf;
import OntoUML.subQuantityOf;
import OntoUML.URML.URMLPackage;
import OntoUML.URML.impl.URMLPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OntoUMLPackageImpl extends EPackageImpl implements OntoUMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antiRigidMixinClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antiRigidSortalClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedBinaryRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meronymicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mixinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mixinClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass momentClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonRigidMixinClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rigidMixinClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rigidSortalClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleMixinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semiRigidMixinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortalClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subCollectionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subQuantityOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceSortalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

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
	 * @see OntoUML.OntoUMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OntoUMLPackageImpl() {
		super(eNS_URI, OntoUMLFactory.eINSTANCE);
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
	public static OntoUMLPackage init() {
		if (isInited) return (OntoUMLPackage)EPackage.Registry.INSTANCE.getEPackage(OntoUMLPackage.eNS_URI);

		// Obtain or create and register package
		OntoUMLPackageImpl theOntoUMLPackage = (OntoUMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof OntoUMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new OntoUMLPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		URMLPackageImpl theURMLPackage = (URMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(URMLPackage.eNS_URI) instanceof URMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(URMLPackage.eNS_URI) : URMLPackage.eINSTANCE);

		// Create package meta-data objects
		theOntoUMLPackage.createPackageContents();
		theURMLPackage.createPackageContents();

		// Initialize created meta-data
		theOntoUMLPackage.initializePackageContents();
		theURMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOntoUMLPackage.freeze();

		return theOntoUMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAntiRigidMixinClass() {
		return antiRigidMixinClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAntiRigidSortalClass() {
		return antiRigidSortalClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_AssociationEnd() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_IsDerived() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_AssociationEndAux1() {
		return (EReference)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_AssociationEndAux2() {
		return (EReference)associationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_AssociationEnd3Aux() {
		return (EReference)associationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_AssociationEnd1PropertyNameLabelAux() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_AssociationEnd2PropertyNameLabelAux() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_AssociationEnd1PropertyCardinalitiesLabelAux() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_AssociationEnd2PropertyCardinalitiesLabelAux() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterization() {
		return characterizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Attribute() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_IsAbstract() {
		return (EAttribute)classifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_General() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Generalization() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollective() {
		return collectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollective_IsExtensional() {
		return (EAttribute)collectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcomponentOf() {
		return componentOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_InstanciarElement() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatype() {
		return datatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeRelationship() {
		return datatypeRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependencyRelationship() {
		return dependencyRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivation() {
		return derivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedBinaryRelationship() {
		return directedBinaryRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedRelationship() {
		return directedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedRelationship_Target() {
		return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedRelationship_Source() {
		return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedRelationship_TargetAux1() {
		return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedRelationship_SourceAux1() {
		return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedRelationship_TargetAux2() {
		return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedRelationship_SourceAux2() {
		return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedRelationship_SourcePropertyNameLabelAux() {
		return (EAttribute)directedRelationshipEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedRelationship_TargetPropertyNameLabelAux() {
		return (EAttribute)directedRelationshipEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedRelationship_SourcePropertyCardinalitiesLabelAux() {
		return (EAttribute)directedRelationshipEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedRelationship_TargetPropertyCardinalitiesLabelAux() {
		return (EAttribute)directedRelationshipEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Container() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_IsStatic() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalAssociation() {
		return formalAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Specific() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_General() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_GeneralizationSet() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationSet() {
		return generalizationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsCovering() {
		return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsDisjoint() {
		return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationSet_Generalization() {
		return (EReference)generalizationSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKind() {
		return kindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterialAssociation() {
		return materialAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediation() {
		return mediationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmemberOf() {
		return memberOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeronymic() {
		return meronymicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeronymic_IsShareable() {
		return (EAttribute)meronymicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeronymic_IsEssential() {
		return (EAttribute)meronymicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeronymic_IsInseparable() {
		return (EAttribute)meronymicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeronymic_IsImmutablePart() {
		return (EAttribute)meronymicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeronymic_IsImmutableWhole() {
		return (EAttribute)meronymicEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMixin() {
		return mixinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMixinClass() {
		return mixinClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMode() {
		return modeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMomentClass() {
		return momentClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityElement() {
		return multiplicityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Upper() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Lower() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonRigidMixinClass() {
		return nonRigidMixinClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectClass() {
		return objectClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhase() {
		return phaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsDerived() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsNavigable() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_EndType() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_AssociationEnd() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Source() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Target() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_AssociationEndPositionAux() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantity() {
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinableElement() {
		return redefinableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedefinableElement_IsLeaf() {
		return (EAttribute)redefinableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalClassifier() {
		return relationalClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_RelatedElement() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelator() {
		return relatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRigidMixinClass() {
		return rigidMixinClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRigidSortalClass() {
		return rigidSortalClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleMixin() {
		return roleMixinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemiRigidMixin() {
		return semiRigidMixinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleDatatype() {
		return simpleDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortalClass() {
		return sortalClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralDatatype() {
		return structuralDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeature() {
		return structuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuralFeature_IsReadOnly() {
		return (EAttribute)structuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsubCollectionOf() {
		return subCollectionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubKind() {
		return subKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsubQuantityOf() {
		return subQuantityOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstanceSortal() {
		return substanceSortalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElement_Type() {
		return (EReference)typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUMLFactory getOntoUMLFactory() {
		return (OntoUMLFactory)getEFactoryInstance();
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
		antiRigidMixinClassEClass = createEClass(ANTI_RIGID_MIXIN_CLASS);

		antiRigidSortalClassEClass = createEClass(ANTI_RIGID_SORTAL_CLASS);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__ASSOCIATION_END);
		createEAttribute(associationEClass, ASSOCIATION__IS_DERIVED);
		createEReference(associationEClass, ASSOCIATION__ASSOCIATION_END_AUX1);
		createEReference(associationEClass, ASSOCIATION__ASSOCIATION_END_AUX2);
		createEReference(associationEClass, ASSOCIATION__ASSOCIATION_END3_AUX);
		createEAttribute(associationEClass, ASSOCIATION__ASSOCIATION_END1_PROPERTY_NAME_LABEL_AUX);
		createEAttribute(associationEClass, ASSOCIATION__ASSOCIATION_END2_PROPERTY_NAME_LABEL_AUX);
		createEAttribute(associationEClass, ASSOCIATION__ASSOCIATION_END1_PROPERTY_CARDINALITIES_LABEL_AUX);
		createEAttribute(associationEClass, ASSOCIATION__ASSOCIATION_END2_PROPERTY_CARDINALITIES_LABEL_AUX);

		categoryEClass = createEClass(CATEGORY);

		characterizationEClass = createEClass(CHARACTERIZATION);

		classEClass = createEClass(CLASS);

		classifierEClass = createEClass(CLASSIFIER);
		createEReference(classifierEClass, CLASSIFIER__ATTRIBUTE);
		createEAttribute(classifierEClass, CLASSIFIER__IS_ABSTRACT);
		createEReference(classifierEClass, CLASSIFIER__GENERAL);
		createEReference(classifierEClass, CLASSIFIER__GENERALIZATION);

		collectiveEClass = createEClass(COLLECTIVE);
		createEAttribute(collectiveEClass, COLLECTIVE__IS_EXTENSIONAL);

		componentOfEClass = createEClass(COMPONENT_OF);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__INSTANCIAR_ELEMENT);

		datatypeEClass = createEClass(DATATYPE);

		datatypeRelationshipEClass = createEClass(DATATYPE_RELATIONSHIP);

		dependencyRelationshipEClass = createEClass(DEPENDENCY_RELATIONSHIP);

		derivationEClass = createEClass(DERIVATION);

		directedBinaryRelationshipEClass = createEClass(DIRECTED_BINARY_RELATIONSHIP);

		directedRelationshipEClass = createEClass(DIRECTED_RELATIONSHIP);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__TARGET);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__SOURCE);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__TARGET_AUX1);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__SOURCE_AUX1);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__TARGET_AUX2);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__SOURCE_AUX2);
		createEAttribute(directedRelationshipEClass, DIRECTED_RELATIONSHIP__SOURCE_PROPERTY_NAME_LABEL_AUX);
		createEAttribute(directedRelationshipEClass, DIRECTED_RELATIONSHIP__TARGET_PROPERTY_NAME_LABEL_AUX);
		createEAttribute(directedRelationshipEClass, DIRECTED_RELATIONSHIP__SOURCE_PROPERTY_CARDINALITIES_LABEL_AUX);
		createEAttribute(directedRelationshipEClass, DIRECTED_RELATIONSHIP__TARGET_PROPERTY_CARDINALITIES_LABEL_AUX);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__CONTAINER);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__IS_STATIC);

		formalAssociationEClass = createEClass(FORMAL_ASSOCIATION);

		generalizationEClass = createEClass(GENERALIZATION);
		createEReference(generalizationEClass, GENERALIZATION__SPECIFIC);
		createEReference(generalizationEClass, GENERALIZATION__GENERAL);
		createEReference(generalizationEClass, GENERALIZATION__GENERALIZATION_SET);

		generalizationSetEClass = createEClass(GENERALIZATION_SET);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_COVERING);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_DISJOINT);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__GENERALIZATION);

		kindEClass = createEClass(KIND);

		materialAssociationEClass = createEClass(MATERIAL_ASSOCIATION);

		mediationEClass = createEClass(MEDIATION);

		memberOfEClass = createEClass(MEMBER_OF);

		meronymicEClass = createEClass(MERONYMIC);
		createEAttribute(meronymicEClass, MERONYMIC__IS_SHAREABLE);
		createEAttribute(meronymicEClass, MERONYMIC__IS_ESSENTIAL);
		createEAttribute(meronymicEClass, MERONYMIC__IS_INSEPARABLE);
		createEAttribute(meronymicEClass, MERONYMIC__IS_IMMUTABLE_PART);
		createEAttribute(meronymicEClass, MERONYMIC__IS_IMMUTABLE_WHOLE);

		mixinEClass = createEClass(MIXIN);

		mixinClassEClass = createEClass(MIXIN_CLASS);

		modeEClass = createEClass(MODE);

		momentClassEClass = createEClass(MOMENT_CLASS);

		multiplicityElementEClass = createEClass(MULTIPLICITY_ELEMENT);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__UPPER);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__LOWER);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		nonRigidMixinClassEClass = createEClass(NON_RIGID_MIXIN_CLASS);

		objectClassEClass = createEClass(OBJECT_CLASS);

		phaseEClass = createEClass(PHASE);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__IS_DERIVED);
		createEAttribute(propertyEClass, PROPERTY__IS_NAVIGABLE);
		createEReference(propertyEClass, PROPERTY__END_TYPE);
		createEReference(propertyEClass, PROPERTY__ASSOCIATION_END);
		createEReference(propertyEClass, PROPERTY__SOURCE);
		createEReference(propertyEClass, PROPERTY__TARGET);
		createEAttribute(propertyEClass, PROPERTY__ASSOCIATION_END_POSITION_AUX);

		quantityEClass = createEClass(QUANTITY);

		redefinableElementEClass = createEClass(REDEFINABLE_ELEMENT);
		createEAttribute(redefinableElementEClass, REDEFINABLE_ELEMENT__IS_LEAF);

		relationalClassifierEClass = createEClass(RELATIONAL_CLASSIFIER);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__RELATED_ELEMENT);

		relatorEClass = createEClass(RELATOR);

		rigidMixinClassEClass = createEClass(RIGID_MIXIN_CLASS);

		rigidSortalClassEClass = createEClass(RIGID_SORTAL_CLASS);

		roleEClass = createEClass(ROLE);

		roleMixinEClass = createEClass(ROLE_MIXIN);

		semiRigidMixinEClass = createEClass(SEMI_RIGID_MIXIN);

		simpleDatatypeEClass = createEClass(SIMPLE_DATATYPE);

		sortalClassEClass = createEClass(SORTAL_CLASS);

		structuralDatatypeEClass = createEClass(STRUCTURAL_DATATYPE);

		structuralFeatureEClass = createEClass(STRUCTURAL_FEATURE);
		createEAttribute(structuralFeatureEClass, STRUCTURAL_FEATURE__IS_READ_ONLY);

		subCollectionOfEClass = createEClass(SUB_COLLECTION_OF);

		subKindEClass = createEClass(SUB_KIND);

		subQuantityOfEClass = createEClass(SUB_QUANTITY_OF);

		substanceSortalEClass = createEClass(SUBSTANCE_SORTAL);

		typeEClass = createEClass(TYPE);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);
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
		URMLPackage theURMLPackage = (URMLPackage)EPackage.Registry.INSTANCE.getEPackage(URMLPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theURMLPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		antiRigidMixinClassEClass.getESuperTypes().add(this.getNonRigidMixinClass());
		antiRigidSortalClassEClass.getESuperTypes().add(this.getSortalClass());
		associationEClass.getESuperTypes().add(this.getRelationship());
		associationEClass.getESuperTypes().add(this.getRelationalClassifier());
		categoryEClass.getESuperTypes().add(this.getRigidMixinClass());
		characterizationEClass.getESuperTypes().add(this.getDependencyRelationship());
		classEClass.getESuperTypes().add(this.getClassifier());
		classifierEClass.getESuperTypes().add(this.getType());
		collectiveEClass.getESuperTypes().add(this.getSubstanceSortal());
		componentOfEClass.getESuperTypes().add(this.getMeronymic());
		datatypeEClass.getESuperTypes().add(this.getClassifier());
		datatypeRelationshipEClass.getESuperTypes().add(this.getDirectedBinaryRelationship());
		dependencyRelationshipEClass.getESuperTypes().add(this.getDirectedBinaryRelationship());
		derivationEClass.getESuperTypes().add(this.getDependencyRelationship());
		directedBinaryRelationshipEClass.getESuperTypes().add(this.getDirectedRelationship());
		directedBinaryRelationshipEClass.getESuperTypes().add(this.getRelationalClassifier());
		directedRelationshipEClass.getESuperTypes().add(this.getRelationship());
		featureEClass.getESuperTypes().add(this.getRedefinableElement());
		formalAssociationEClass.getESuperTypes().add(this.getAssociation());
		generalizationEClass.getESuperTypes().add(this.getDirectedRelationship());
		generalizationEClass.getESuperTypes().add(this.getNamedElement());
		generalizationSetEClass.getESuperTypes().add(this.getNamedElement());
		kindEClass.getESuperTypes().add(this.getSubstanceSortal());
		materialAssociationEClass.getESuperTypes().add(this.getAssociation());
		mediationEClass.getESuperTypes().add(this.getDependencyRelationship());
		memberOfEClass.getESuperTypes().add(this.getMeronymic());
		meronymicEClass.getESuperTypes().add(this.getDirectedBinaryRelationship());
		mixinEClass.getESuperTypes().add(this.getSemiRigidMixin());
		mixinClassEClass.getESuperTypes().add(this.getObjectClass());
		modeEClass.getESuperTypes().add(this.getMomentClass());
		momentClassEClass.getESuperTypes().add(this.getClass_());
		multiplicityElementEClass.getESuperTypes().add(this.getElement());
		namedElementEClass.getESuperTypes().add(this.getElement());
		nonRigidMixinClassEClass.getESuperTypes().add(this.getMixinClass());
		objectClassEClass.getESuperTypes().add(this.getClass_());
		phaseEClass.getESuperTypes().add(this.getAntiRigidSortalClass());
		propertyEClass.getESuperTypes().add(this.getStructuralFeature());
		quantityEClass.getESuperTypes().add(this.getSubstanceSortal());
		redefinableElementEClass.getESuperTypes().add(this.getNamedElement());
		relationalClassifierEClass.getESuperTypes().add(this.getClassifier());
		relationshipEClass.getESuperTypes().add(this.getElement());
		relatorEClass.getESuperTypes().add(this.getMomentClass());
		rigidMixinClassEClass.getESuperTypes().add(this.getMixinClass());
		rigidSortalClassEClass.getESuperTypes().add(this.getSortalClass());
		roleEClass.getESuperTypes().add(this.getAntiRigidSortalClass());
		roleMixinEClass.getESuperTypes().add(this.getAntiRigidMixinClass());
		semiRigidMixinEClass.getESuperTypes().add(this.getNonRigidMixinClass());
		simpleDatatypeEClass.getESuperTypes().add(this.getDatatype());
		sortalClassEClass.getESuperTypes().add(this.getObjectClass());
		structuralDatatypeEClass.getESuperTypes().add(this.getDatatype());
		structuralFeatureEClass.getESuperTypes().add(this.getMultiplicityElement());
		structuralFeatureEClass.getESuperTypes().add(this.getFeature());
		structuralFeatureEClass.getESuperTypes().add(this.getTypedElement());
		subCollectionOfEClass.getESuperTypes().add(this.getMeronymic());
		subKindEClass.getESuperTypes().add(this.getRigidSortalClass());
		subQuantityOfEClass.getESuperTypes().add(this.getMeronymic());
		substanceSortalEClass.getESuperTypes().add(this.getRigidSortalClass());
		typeEClass.getESuperTypes().add(this.getNamedElement());
		typeEClass.getESuperTypes().add(this.getElement());
		typedElementEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(antiRigidMixinClassEClass, AntiRigidMixinClass.class, "AntiRigidMixinClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(antiRigidSortalClassEClass, AntiRigidSortalClass.class, "AntiRigidSortalClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_AssociationEnd(), this.getProperty(), this.getProperty_AssociationEnd(), "associationEnd", null, 2, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_IsDerived(), ecorePackage.getEBoolean(), "isDerived", "false", 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_AssociationEndAux1(), this.getType(), null, "associationEndAux1", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_AssociationEndAux2(), this.getType(), null, "associationEndAux2", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_AssociationEnd3Aux(), this.getProperty(), null, "associationEnd3Aux", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_AssociationEnd1PropertyNameLabelAux(), ecorePackage.getEString(), "associationEnd1PropertyNameLabelAux", "", 0, 1, Association.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_AssociationEnd2PropertyNameLabelAux(), ecorePackage.getEString(), "associationEnd2PropertyNameLabelAux", "", 0, 1, Association.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_AssociationEnd1PropertyCardinalitiesLabelAux(), ecorePackage.getEString(), "associationEnd1PropertyCardinalitiesLabelAux", "", 0, 1, Association.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_AssociationEnd2PropertyCardinalitiesLabelAux(), ecorePackage.getEString(), "associationEnd2PropertyCardinalitiesLabelAux", "", 0, 1, Association.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(characterizationEClass, Characterization.class, "Characterization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classEClass, OntoUML.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classifierEClass, Classifier.class, "Classifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifier_Attribute(), this.getProperty(), null, "attribute", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassifier_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", "false", 1, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifier_General(), this.getClassifier(), null, "general", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClassifier_Generalization(), this.getGeneralization(), this.getGeneralization_Specific(), "generalization", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(collectiveEClass, Collective.class, "Collective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollective_IsExtensional(), ecorePackage.getEBoolean(), "isExtensional", "false", 1, 1, Collective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentOfEClass, componentOf.class, "componentOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerEClass, Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_InstanciarElement(), this.getElement(), this.getElement_Container(), "InstanciarElement", null, 0, -1, Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypeEClass, Datatype.class, "Datatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datatypeRelationshipEClass, DatatypeRelationship.class, "DatatypeRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependencyRelationshipEClass, DependencyRelationship.class, "DependencyRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(derivationEClass, Derivation.class, "Derivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(directedBinaryRelationshipEClass, DirectedBinaryRelationship.class, "DirectedBinaryRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(directedRelationshipEClass, DirectedRelationship.class, "DirectedRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectedRelationship_Target(), this.getElement(), null, "target", null, 1, -1, DirectedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDirectedRelationship_Source(), this.getElement(), null, "source", null, 1, -1, DirectedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDirectedRelationship_TargetAux1(), this.getElement(), null, "targetAux1", null, 0, -1, DirectedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDirectedRelationship_SourceAux1(), this.getElement(), null, "sourceAux1", null, 0, -1, DirectedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDirectedRelationship_TargetAux2(), this.getElement(), null, "targetAux2", null, 0, -1, DirectedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDirectedRelationship_SourceAux2(), this.getElement(), null, "sourceAux2", null, 0, -1, DirectedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirectedRelationship_SourcePropertyNameLabelAux(), ecorePackage.getEString(), "sourcePropertyNameLabelAux", "", 0, 1, DirectedRelationship.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirectedRelationship_TargetPropertyNameLabelAux(), ecorePackage.getEString(), "targetPropertyNameLabelAux", "", 0, 1, DirectedRelationship.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirectedRelationship_SourcePropertyCardinalitiesLabelAux(), ecorePackage.getEString(), "sourcePropertyCardinalitiesLabelAux", "", 0, 1, DirectedRelationship.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirectedRelationship_TargetPropertyCardinalitiesLabelAux(), ecorePackage.getEString(), "targetPropertyCardinalitiesLabelAux", "", 0, 1, DirectedRelationship.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Container(), this.getContainer(), this.getContainer_InstanciarElement(), "container", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(elementEClass, this.getElement(), "allSuperTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(elementEClass, this.getElement(), "allSubTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = addEOperation(elementEClass, ecorePackage.getEBoolean(), "isConected", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getElement(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(elementEClass, ecorePackage.getEBoolean(), "subInstanceType", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getElement(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(elementEClass, ecorePackage.getEBoolean(), "subMetaTypeKind", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(elementEClass, ecorePackage.getEBoolean(), "subMetaTypeCollective", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(elementEClass, ecorePackage.getEBoolean(), "subMetaTypeQuantity", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(elementEClass, ecorePackage.getEBoolean(), "hasFunctionalComplexesInstances", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(elementEClass, ecorePackage.getEBoolean(), "hasCollectivesInstances", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(elementEClass, ecorePackage.getEBoolean(), "hasQuantitiesInstances", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_IsStatic(), ecorePackage.getEBoolean(), "isStatic", "false", 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formalAssociationEClass, FormalAssociation.class, "FormalAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralization_Specific(), this.getClassifier(), this.getClassifier_Generalization(), "specific", null, 1, 1, Generalization.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralization_General(), this.getClassifier(), null, "general", null, 1, 1, Generalization.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralization_GeneralizationSet(), this.getGeneralizationSet(), this.getGeneralizationSet_Generalization(), "generalizationSet", null, 0, -1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(generalizationSetEClass, GeneralizationSet.class, "GeneralizationSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralizationSet_IsCovering(), ecorePackage.getEBoolean(), "isCovering", "false", 1, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizationSet_IsDisjoint(), ecorePackage.getEBoolean(), "isDisjoint", "true", 1, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralizationSet_Generalization(), this.getGeneralization(), this.getGeneralization_GeneralizationSet(), "generalization", null, 0, -1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(kindEClass, Kind.class, "Kind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(materialAssociationEClass, MaterialAssociation.class, "MaterialAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mediationEClass, Mediation.class, "Mediation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memberOfEClass, memberOf.class, "memberOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(meronymicEClass, Meronymic.class, "Meronymic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeronymic_IsShareable(), ecorePackage.getEBoolean(), "isShareable", "true", 0, 1, Meronymic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeronymic_IsEssential(), ecorePackage.getEBoolean(), "isEssential", "false", 0, 1, Meronymic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeronymic_IsInseparable(), ecorePackage.getEBoolean(), "isInseparable", "false", 0, 1, Meronymic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeronymic_IsImmutablePart(), ecorePackage.getEBoolean(), "isImmutablePart", "false", 0, 1, Meronymic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeronymic_IsImmutableWhole(), ecorePackage.getEBoolean(), "isImmutableWhole", "false", 0, 1, Meronymic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mixinEClass, Mixin.class, "Mixin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mixinClassEClass, MixinClass.class, "MixinClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modeEClass, Mode.class, "Mode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(momentClassEClass, MomentClass.class, "MomentClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplicityElementEClass, MultiplicityElement.class, "MultiplicityElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicityElement_Upper(), ecorePackage.getEInt(), "upper", "-1", 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityElement_Lower(), ecorePackage.getEInt(), "lower", "0", 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonRigidMixinClassEClass, NonRigidMixinClass.class, "NonRigidMixinClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectClassEClass, ObjectClass.class, "ObjectClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(phaseEClass, Phase.class, "Phase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_IsDerived(), ecorePackage.getEBoolean(), "isDerived", "false", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsNavigable(), ecorePackage.getEBoolean(), "isNavigable", "true", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_EndType(), this.getType(), null, "endType", null, 0, 1, Property.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_AssociationEnd(), this.getAssociation(), this.getAssociation_AssociationEnd(), "associationEnd", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Source(), this.getDirectedBinaryRelationship(), null, "source", null, 0, 1, Property.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Target(), this.getDirectedBinaryRelationship(), null, "target", null, 0, 1, Property.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_AssociationEndPositionAux(), ecorePackage.getEInt(), "associationEndPositionAux", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(propertyEClass, ecorePackage.getEInt(), "derivarLowerMaterialAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(propertyEClass, ecorePackage.getEInt(), "derivarUpperMaterialAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(propertyEClass, ecorePackage.getEInt(), "derivarLowerDerivation", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(propertyEClass, ecorePackage.getEInt(), "derivarUpperDerivation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(quantityEClass, Quantity.class, "Quantity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(redefinableElementEClass, RedefinableElement.class, "RedefinableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRedefinableElement_IsLeaf(), ecorePackage.getEBoolean(), "isLeaf", "false", 0, 1, RedefinableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalClassifierEClass, RelationalClassifier.class, "RelationalClassifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_RelatedElement(), this.getElement(), null, "relatedElement", null, 1, -1, Relationship.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(relatorEClass, Relator.class, "Relator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rigidMixinClassEClass, RigidMixinClass.class, "RigidMixinClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rigidSortalClassEClass, RigidSortalClass.class, "RigidSortalClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleMixinEClass, RoleMixin.class, "RoleMixin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(semiRigidMixinEClass, SemiRigidMixin.class, "SemiRigidMixin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleDatatypeEClass, SimpleDatatype.class, "SimpleDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sortalClassEClass, SortalClass.class, "SortalClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuralDatatypeEClass, StructuralDatatype.class, "StructuralDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuralFeatureEClass, StructuralFeature.class, "StructuralFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuralFeature_IsReadOnly(), ecorePackage.getEBoolean(), "isReadOnly", "false", 1, 1, StructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subCollectionOfEClass, subCollectionOf.class, "subCollectionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subKindEClass, SubKind.class, "SubKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subQuantityOfEClass, subQuantityOf.class, "subQuantityOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(substanceSortalEClass, SubstanceSortal.class, "SubstanceSortal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedElement_Type(), this.getType(), null, "type", null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/ocl/examples/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/ocl/examples/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/ocl/examples/OCL";		
		addAnnotation
		  (getClassifier_Attribute(), 
		   source, 
		   new String[] {
			 "derive", "DatatypeRelationship.allInstances()->select(x | if x.source->forAll(y | y.oclIsKindOf(Property)) then x.source->exists(y | y.oclAsType(Property).endType = self) else false endif)->collect(x | if x.target->forAll(y | y.oclIsKindOf(Property)) then x.target.oclAsType(Property) else null endif)"
		   });		
		addAnnotation
		  (getClassifier_General(), 
		   source, 
		   new String[] {
			 "derive", "self.allSuperTypes()"
		   });		
		addAnnotation
		  (getClassifier_Generalization(), 
		   source, 
		   new String[] {
			 "derive", "Generalization.allInstances()->select(x | x.specific = self)"
		   });		
		addAnnotation
		  (elementEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "if self.oclIsKindOf(Classifier) then (if self.oclAsType(Classifier).generalization->forAll(x | x.oclIsUndefined()) then Set{} else Set{self.oclAsType(Classifier).generalization->collect(x | x.general), self.oclAsType(Classifier).generalization->collect(x | if x.general.oclIsKindOf(Classifier) then x.general.allSuperTypes() else Set{} endif)}->flatten() endif) else Set{} endif"
		   });		
		addAnnotation
		  (elementEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "let generalizations : Set(Generalization) = Generalization.allInstances()->select(x | x.general = self) in (if self.oclIsKindOf(Classifier) then (if generalizations->forAll(y | y.oclIsUndefined()) then Set{} else Set{generalizations->collect(y | y.specific), generalizations->collect(y | if y.specific.oclIsKindOf(Classifier) then y.specific.allSubTypes() else Set{} endif)}->flatten() endif) else Set{} endif)"
		   });		
		addAnnotation
		  (elementEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "if self.oclIsKindOf(Relationship) then if self.oclAsType(Relationship).relatedElement->forAll(y | y.oclIsUndefined()) then false else if self.oclAsType(Relationship).relatedElement->exists(z | if z.oclIsKindOf(Property) then (z.oclAsType(Property).endType = x) else false endif) then true else self.oclAsType(Relationship).relatedElement->exists(w | if w.oclIsKindOf(Property) then w.oclAsType(Property).endType.isConected(x) else false endif) endif endif else false endif"
		   });		
		addAnnotation
		  (elementEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "self.allSuperTypes()->includes(x)"
		   });		
		addAnnotation
		  (elementEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "body", "if self.oclIsKindOf(Kind) then true else self.allSuperTypes()->exists(x | x.oclIsKindOf(Kind)) endif"
		   });		
		addAnnotation
		  (elementEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "body", "if self.oclIsKindOf(Collective) then true else self.allSuperTypes()->exists(x | x.oclIsKindOf(Collective)) endif"
		   });		
		addAnnotation
		  (elementEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
			 "body", "if self.oclIsKindOf(Quantity) then true else self.allSuperTypes()->exists(x | x.oclIsKindOf(Quantity)) endif"
		   });		
		addAnnotation
		  (elementEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
			 "body", "if self.oclIsKindOf(SortalClass) then self.subMetaTypeKind() else if self.oclIsKindOf(MixinClass) then Element.allInstances()->forAll(x | x.subInstanceType(self) implies not (x.subMetaTypeQuantity() or x.subMetaTypeCollective())) else false endif endif"
		   });		
		addAnnotation
		  (elementEClass.getEOperations().get(8), 
		   source, 
		   new String[] {
			 "body", "if self.oclIsKindOf(SortalClass) then self.subMetaTypeCollective() else if self.oclIsKindOf(MixinClass) then Element.allInstances()->forAll(x | x.subInstanceType(self) implies not (x.subMetaTypeKind() or x.subMetaTypeQuantity())) else false endif endif"
		   });		
		addAnnotation
		  (elementEClass.getEOperations().get(9), 
		   source, 
		   new String[] {
			 "body", "if self.oclIsKindOf(SortalClass) then self.subMetaTypeQuantity() else if self.oclIsKindOf(MixinClass) then Element.allInstances()->forAll(x | x.subInstanceType(self) implies not (x.subMetaTypeKind() or x.subMetaTypeCollective())) else false endif endif"
		   });		
		addAnnotation
		  (getGeneralization_Specific(), 
		   source, 
		   new String[] {
			 "derive", "self.target->any(x | x.oclIsKindOf(Classifier))"
		   });		
		addAnnotation
		  (getGeneralization_General(), 
		   source, 
		   new String[] {
			 "derive", "self.source->any(x | x.oclIsKindOf(Classifier))"
		   });		
		addAnnotation
		  (propertyEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "let A:Set(Mediation) = Mediation.allInstances()->select(x | x.target->exists(y | if y.oclIsKindOf(Property) then (y.oclAsType(Property).endType = self.endType) else false endif)), B:Set(MaterialAssociation) = MaterialAssociation.allInstances()->select(x | x.associationEnd->exists(y | y = self)) in let C:Set(Mediation) = Mediation.allInstances()->select(x | x.target->exists(y | if y.oclIsKindOf(Property) then (y.oclAsType(Property).endType = B->any(true).associationEnd->select(z | z <> self)->any(true).endType) else false endif)) in let D:Set(Mediation) = A->select(x | C->source.oclAsType(Property).endType->includesAll(x.source.oclAsType(Property).endType)), E:Set(Mediation) = C->select(x | A->source.oclAsType(Property).endType->includesAll(x.source.oclAsType(Property).endType)) in let F:Integer = D->collect(x | x.target->collect(y | if y.oclIsKindOf(Property) then y.oclAsType(Property).lower else 0 endif))->any(true), G:Integer = E->collect(z | z.source->collect(w | if w.oclIsKindOf(Property) then w.oclAsType(Property).lower else 0 endif))->any(true) in if ((F = -1) or (G = -1)) then (-1) else (F*G) endif"
		   });		
		addAnnotation
		  (propertyEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "let A:Set(Mediation) = Mediation.allInstances()->select(x | x.target->exists(y | if y.oclIsKindOf(Property) then (y.oclAsType(Property).endType = self.endType) else false endif)), B:Set(MaterialAssociation) = MaterialAssociation.allInstances()->select(x | x.associationEnd->exists(y | y = self)) in let C:Set(Mediation) = Mediation.allInstances()->select(x | x.target->exists(y | if y.oclIsKindOf(Property) then (y.oclAsType(Property).endType = B->any(true).associationEnd->select(z | z <> self)->any(true).endType) else false endif)) in let D:Set(Mediation) = A->select(x | C->source.oclAsType(Property).endType->includesAll(x.source.oclAsType(Property).endType)), E:Set(Mediation) = C->select(x | A->source.oclAsType(Property).endType->includesAll(x.source.oclAsType(Property).endType)) in let H:Integer =  D->collect(x | x.target->collect(y | if y.oclIsKindOf(Property) then y.oclAsType(Property).upper else 0 endif))->any(true), I:Integer = E->collect(z | z.source->collect(w | if w.oclIsKindOf(Property) then w.oclAsType(Property).upper else 0 endif))->any(true) in if ((H = -1) or (I = -1)) then (-1) else (H*I) endif"
		   });		
		addAnnotation
		  (propertyEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "let A:Set(Mediation) = Mediation.allInstances()->select(x | x.target->exists(y | if (y.oclIsKindOf(Property) and self.endType.oclIsKindOf(MaterialAssociation)) then self.endType.oclAsType(MaterialAssociation).associationEnd->exists(z | z.endType = y.oclAsType(Property).endType) else false endif)), B:Set(Derivation) = Derivation.allInstances()->select(x | x.source->exists(y | y = self)) in let C:Set(Mediation) = A->select(x | x.source->exists(y | if y.oclIsKindOf(Property) then (y.oclAsType(Property).endType = B->any(true).target->select(z | z.oclIsKindOf(Property))->any(true).oclAsType(Property).endType) else false endif)) in C->collect(x | x.target->collect(y | if y.oclIsKindOf(Property) then y.oclAsType(Property).lower else 0 endif))->iterate(z; a:Integer = 1 | if ((a = -1) or (z = -1)) then (-1) else (a*z) endif)"
		   });		
		addAnnotation
		  (propertyEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "let A:Set(Mediation) = Mediation.allInstances()->select(x | x.target->exists(y | if (y.oclIsKindOf(Property) and self.endType.oclIsKindOf(MaterialAssociation)) then self.endType.oclAsType(MaterialAssociation).associationEnd->exists(z | z.endType = y.oclAsType(Property).endType) else false endif)), B:Set(Derivation) = Derivation.allInstances()->select(x | x.source->exists(y | y = self)) in let C:Set(Mediation) = A->select(x | x.source->exists(y | if y.oclIsKindOf(Property) then (y.oclAsType(Property).endType = B->any(true).target->select(z | z.oclIsKindOf(Property))->any(true).oclAsType(Property).endType) else false endif)) in C->collect(x | x.target->collect(y | if y.oclIsKindOf(Property) then y.oclAsType(Property).upper else 0 endif))->iterate(z; a:Integer = 1 | if ((a = -1) or (z = -1)) then (-1) else (a*z) endif)"
		   });		
		addAnnotation
		  (getProperty_EndType(), 
		   source, 
		   new String[] {
			 "derive", "if self.source->notEmpty() then (if self.source.sourceAux1->forAll(x | x.oclIsKindOf(Type)) then self.source.sourceAux1.oclAsType(Type)->any(true) else null endif) else if self.target->notEmpty() then (if self.target.targetAux1->forAll(x | x.oclIsKindOf(Type)) then self.target.targetAux1.oclAsType(Type)->any(true) else null endif) else if (self.associationEndPositionAux = 1) then self.associationEnd.associationEndAux1->any(true) else if (self.associationEndPositionAux = 2) then self.associationEnd.associationEndAux2->any(true) else null endif endif endif endif"
		   });		
		addAnnotation
		  (getProperty_Source(), 
		   source, 
		   new String[] {
			 "derive", "DirectedBinaryRelationship.allInstances()->any(x | x.source->includes(self) or x.sourceAux2->includes(self))"
		   });		
		addAnnotation
		  (getProperty_Target(), 
		   source, 
		   new String[] {
			 "derive", "DirectedBinaryRelationship.allInstances()->any(x | x.target->includes(self) or x.targetAux2->includes(self))"
		   });		
		addAnnotation
		  (getRelationship_RelatedElement(), 
		   source, 
		   new String[] {
			 "derive", "if self.oclIsKindOf(Association) then self.oclAsType(Association).associationEnd else if self.oclIsKindOf(DirectedRelationship) then Set{self.oclAsType(DirectedRelationship).source, self.oclAsType(DirectedRelationship).target}->flatten() else null endif endif"
		   });
	}

} //OntoUMLPackageImpl
