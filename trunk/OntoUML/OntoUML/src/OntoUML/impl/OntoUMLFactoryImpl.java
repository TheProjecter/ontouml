/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.impl;

import OntoUML.AntiRigidMixinClass;
import OntoUML.AntiRigidSortalClass;
import OntoUML.Association;
import OntoUML.Category;
import OntoUML.Characterization;
import OntoUML.Classifier;
import OntoUML.Collective;
import OntoUML.Container;
import OntoUML.Datatype;
import OntoUML.DatatypeAssociation;
import OntoUML.DependencyRelationship;
import OntoUML.Derivation;
import OntoUML.DirectedBinaryRelationship;
import OntoUML.DirectedRelationship;
import OntoUML.Element;
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
import OntoUML.componentOf;
import OntoUML.memberOf;
import OntoUML.subCollectionOf;
import OntoUML.subQuantityOf;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OntoUMLFactoryImpl extends EFactoryImpl implements OntoUMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OntoUMLFactory init() {
		try {
			OntoUMLFactory theOntoUMLFactory = (OntoUMLFactory)EPackage.Registry.INSTANCE.getEFactory("OntoUML"); 
			if (theOntoUMLFactory != null) {
				return theOntoUMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OntoUMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OntoUMLPackage.ANTI_RIGID_MIXIN_CLASS: return createAntiRigidMixinClass();
			case OntoUMLPackage.ANTI_RIGID_SORTAL_CLASS: return createAntiRigidSortalClass();
			case OntoUMLPackage.ASSOCIATION: return createAssociation();
			case OntoUMLPackage.CATEGORY: return createCategory();
			case OntoUMLPackage.CHARACTERIZATION: return createCharacterization();
			case OntoUMLPackage.CLASS: return createClass();
			case OntoUMLPackage.CLASSIFIER: return createClassifier();
			case OntoUMLPackage.COLLECTIVE: return createCollective();
			case OntoUMLPackage.COMPONENT_OF: return createcomponentOf();
			case OntoUMLPackage.CONTAINER: return createContainer();
			case OntoUMLPackage.DATATYPE: return createDatatype();
			case OntoUMLPackage.DATATYPE_ASSOCIATION: return createDatatypeAssociation();
			case OntoUMLPackage.DEPENDENCY_RELATIONSHIP: return createDependencyRelationship();
			case OntoUMLPackage.DERIVATION: return createDerivation();
			case OntoUMLPackage.DIRECTED_BINARY_RELATIONSHIP: return createDirectedBinaryRelationship();
			case OntoUMLPackage.DIRECTED_RELATIONSHIP: return createDirectedRelationship();
			case OntoUMLPackage.ELEMENT: return createElement();
			case OntoUMLPackage.FORMAL_ASSOCIATION: return createFormalAssociation();
			case OntoUMLPackage.GENERALIZATION: return createGeneralization();
			case OntoUMLPackage.GENERALIZATION_SET: return createGeneralizationSet();
			case OntoUMLPackage.KIND: return createKind();
			case OntoUMLPackage.MATERIAL_ASSOCIATION: return createMaterialAssociation();
			case OntoUMLPackage.MEDIATION: return createMediation();
			case OntoUMLPackage.MEMBER_OF: return creatememberOf();
			case OntoUMLPackage.MERONYMIC: return createMeronymic();
			case OntoUMLPackage.MIXIN: return createMixin();
			case OntoUMLPackage.MIXIN_CLASS: return createMixinClass();
			case OntoUMLPackage.MODE: return createMode();
			case OntoUMLPackage.MOMENT_CLASS: return createMomentClass();
			case OntoUMLPackage.MULTIPLICITY_ELEMENT: return createMultiplicityElement();
			case OntoUMLPackage.NON_RIGID_MIXIN_CLASS: return createNonRigidMixinClass();
			case OntoUMLPackage.OBJECT_CLASS: return createObjectClass();
			case OntoUMLPackage.PHASE: return createPhase();
			case OntoUMLPackage.PROPERTY: return createProperty();
			case OntoUMLPackage.QUANTITY: return createQuantity();
			case OntoUMLPackage.RELATIONAL_CLASSIFIER: return createRelationalClassifier();
			case OntoUMLPackage.RELATIONSHIP: return createRelationship();
			case OntoUMLPackage.RELATOR: return createRelator();
			case OntoUMLPackage.RIGID_MIXIN_CLASS: return createRigidMixinClass();
			case OntoUMLPackage.RIGID_SORTAL_CLASS: return createRigidSortalClass();
			case OntoUMLPackage.ROLE: return createRole();
			case OntoUMLPackage.ROLE_MIXIN: return createRoleMixin();
			case OntoUMLPackage.SEMI_RIGID_MIXIN: return createSemiRigidMixin();
			case OntoUMLPackage.SIMPLE_DATATYPE: return createSimpleDatatype();
			case OntoUMLPackage.SORTAL_CLASS: return createSortalClass();
			case OntoUMLPackage.STRUCTURAL_DATATYPE: return createStructuralDatatype();
			case OntoUMLPackage.STRUCTURAL_FEATURE: return createStructuralFeature();
			case OntoUMLPackage.SUB_COLLECTION_OF: return createsubCollectionOf();
			case OntoUMLPackage.SUB_KIND: return createSubKind();
			case OntoUMLPackage.SUB_QUANTITY_OF: return createsubQuantityOf();
			case OntoUMLPackage.SUBSTANCE_SORTAL: return createSubstanceSortal();
			case OntoUMLPackage.TYPE: return createType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AntiRigidMixinClass createAntiRigidMixinClass() {
		AntiRigidMixinClassImpl antiRigidMixinClass = new AntiRigidMixinClassImpl();
		return antiRigidMixinClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AntiRigidSortalClass createAntiRigidSortalClass() {
		AntiRigidSortalClassImpl antiRigidSortalClass = new AntiRigidSortalClassImpl();
		return antiRigidSortalClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Characterization createCharacterization() {
		CharacterizationImpl characterization = new CharacterizationImpl();
		return characterization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUML.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier createClassifier() {
		ClassifierImpl classifier = new ClassifierImpl();
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collective createCollective() {
		CollectiveImpl collective = new CollectiveImpl();
		return collective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public componentOf createcomponentOf() {
		componentOfImpl componentOf = new componentOfImpl();
		return componentOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype createDatatype() {
		DatatypeImpl datatype = new DatatypeImpl();
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeAssociation createDatatypeAssociation() {
		DatatypeAssociationImpl datatypeAssociation = new DatatypeAssociationImpl();
		return datatypeAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyRelationship createDependencyRelationship() {
		DependencyRelationshipImpl dependencyRelationship = new DependencyRelationshipImpl();
		return dependencyRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Derivation createDerivation() {
		DerivationImpl derivation = new DerivationImpl();
		return derivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedBinaryRelationship createDirectedBinaryRelationship() {
		DirectedBinaryRelationshipImpl directedBinaryRelationship = new DirectedBinaryRelationshipImpl();
		return directedBinaryRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedRelationship createDirectedRelationship() {
		DirectedRelationshipImpl directedRelationship = new DirectedRelationshipImpl();
		return directedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalAssociation createFormalAssociation() {
		FormalAssociationImpl formalAssociation = new FormalAssociationImpl();
		return formalAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet createGeneralizationSet() {
		GeneralizationSetImpl generalizationSet = new GeneralizationSetImpl();
		return generalizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind createKind() {
		KindImpl kind = new KindImpl();
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialAssociation createMaterialAssociation() {
		MaterialAssociationImpl materialAssociation = new MaterialAssociationImpl();
		return materialAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mediation createMediation() {
		MediationImpl mediation = new MediationImpl();
		return mediation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public memberOf creatememberOf() {
		memberOfImpl memberOf = new memberOfImpl();
		return memberOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meronymic createMeronymic() {
		MeronymicImpl meronymic = new MeronymicImpl();
		return meronymic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mixin createMixin() {
		MixinImpl mixin = new MixinImpl();
		return mixin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixinClass createMixinClass() {
		MixinClassImpl mixinClass = new MixinClassImpl();
		return mixinClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createMode() {
		ModeImpl mode = new ModeImpl();
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MomentClass createMomentClass() {
		MomentClassImpl momentClass = new MomentClassImpl();
		return momentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityElement createMultiplicityElement() {
		MultiplicityElementImpl multiplicityElement = new MultiplicityElementImpl();
		return multiplicityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonRigidMixinClass createNonRigidMixinClass() {
		NonRigidMixinClassImpl nonRigidMixinClass = new NonRigidMixinClassImpl();
		return nonRigidMixinClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClass createObjectClass() {
		ObjectClassImpl objectClass = new ObjectClassImpl();
		return objectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phase createPhase() {
		PhaseImpl phase = new PhaseImpl();
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantity() {
		QuantityImpl quantity = new QuantityImpl();
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalClassifier createRelationalClassifier() {
		RelationalClassifierImpl relationalClassifier = new RelationalClassifierImpl();
		return relationalClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relator createRelator() {
		RelatorImpl relator = new RelatorImpl();
		return relator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RigidMixinClass createRigidMixinClass() {
		RigidMixinClassImpl rigidMixinClass = new RigidMixinClassImpl();
		return rigidMixinClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RigidSortalClass createRigidSortalClass() {
		RigidSortalClassImpl rigidSortalClass = new RigidSortalClassImpl();
		return rigidSortalClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleMixin createRoleMixin() {
		RoleMixinImpl roleMixin = new RoleMixinImpl();
		return roleMixin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemiRigidMixin createSemiRigidMixin() {
		SemiRigidMixinImpl semiRigidMixin = new SemiRigidMixinImpl();
		return semiRigidMixin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDatatype createSimpleDatatype() {
		SimpleDatatypeImpl simpleDatatype = new SimpleDatatypeImpl();
		return simpleDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortalClass createSortalClass() {
		SortalClassImpl sortalClass = new SortalClassImpl();
		return sortalClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralDatatype createStructuralDatatype() {
		StructuralDatatypeImpl structuralDatatype = new StructuralDatatypeImpl();
		return structuralDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature createStructuralFeature() {
		StructuralFeatureImpl structuralFeature = new StructuralFeatureImpl();
		return structuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public subCollectionOf createsubCollectionOf() {
		subCollectionOfImpl subCollectionOf = new subCollectionOfImpl();
		return subCollectionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubKind createSubKind() {
		SubKindImpl subKind = new SubKindImpl();
		return subKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public subQuantityOf createsubQuantityOf() {
		subQuantityOfImpl subQuantityOf = new subQuantityOfImpl();
		return subQuantityOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceSortal createSubstanceSortal() {
		SubstanceSortalImpl substanceSortal = new SubstanceSortalImpl();
		return substanceSortal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUMLPackage getOntoUMLPackage() {
		return (OntoUMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OntoUMLPackage getPackage() {
		return OntoUMLPackage.eINSTANCE;
	}

} //OntoUMLFactoryImpl
