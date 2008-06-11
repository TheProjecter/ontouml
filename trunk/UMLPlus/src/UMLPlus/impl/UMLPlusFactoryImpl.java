/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package UMLPlus.impl;

import UMLPlus.AntiRigidMixinClass;
import UMLPlus.AntiRigidSortalClass;
import UMLPlus.Association;
import UMLPlus.Category;
import UMLPlus.Characterization;
import UMLPlus.Classifier;
import UMLPlus.Collective;
import UMLPlus.Container;
import UMLPlus.Datatype;
import UMLPlus.DatatypeAssociation;
import UMLPlus.DependencyRelationship;
import UMLPlus.Derivation;
import UMLPlus.DirectedBinaryRelationship;
import UMLPlus.DirectedRelationship;
import UMLPlus.Element;
import UMLPlus.FormalAssociation;
import UMLPlus.Generalization;
import UMLPlus.GeneralizationSet;
import UMLPlus.Kind;
import UMLPlus.MaterialAssociation;
import UMLPlus.Mediation;
import UMLPlus.Meronymic;
import UMLPlus.Mixin;
import UMLPlus.MixinClass;
import UMLPlus.Mode;
import UMLPlus.MomentClass;
import UMLPlus.MultiplicityElement;
import UMLPlus.NamedElement;
import UMLPlus.NonRigidMixinClass;
import UMLPlus.ObjectClass;
import UMLPlus.Phase;
import UMLPlus.Property;
import UMLPlus.Quantity;
import UMLPlus.RelationalClassifier;
import UMLPlus.Relationship;
import UMLPlus.Relator;
import UMLPlus.RigidMixinClass;
import UMLPlus.RigidSortalClass;
import UMLPlus.Role;
import UMLPlus.RoleMixin;
import UMLPlus.SemiRigidMixin;
import UMLPlus.SimpleDatatype;
import UMLPlus.SortalClass;
import UMLPlus.StructuralDatatype;
import UMLPlus.StructuralFeature;
import UMLPlus.SubKind;
import UMLPlus.SubstanceSortal;
import UMLPlus.Type;
import UMLPlus.UMLPlusFactory;
import UMLPlus.UMLPlusPackage;
import UMLPlus.componentOf;
import UMLPlus.memberOf;
import UMLPlus.subCollectionOf;
import UMLPlus.subQuantityOf;

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
public class UMLPlusFactoryImpl extends EFactoryImpl implements UMLPlusFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UMLPlusFactory init() {
		try {
			UMLPlusFactory theUMLPlusFactory = (UMLPlusFactory)EPackage.Registry.INSTANCE.getEFactory("UMLPlus"); //$NON-NLS-1$ 
			if (theUMLPlusFactory != null) {
				return theUMLPlusFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UMLPlusFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLPlusFactoryImpl() {
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
			case UMLPlusPackage.ANTI_RIGID_MIXIN_CLASS: return createAntiRigidMixinClass();
			case UMLPlusPackage.ANTI_RIGID_SORTAL_CLASS: return createAntiRigidSortalClass();
			case UMLPlusPackage.ASSOCIATION: return createAssociation();
			case UMLPlusPackage.CATEGORY: return createCategory();
			case UMLPlusPackage.CHARACTERIZATION: return createCharacterization();
			case UMLPlusPackage.CLASS: return createClass();
			case UMLPlusPackage.CLASSIFIER: return createClassifier();
			case UMLPlusPackage.COLLECTIVE: return createCollective();
			case UMLPlusPackage.COMPONENT_OF: return createcomponentOf();
			case UMLPlusPackage.CONTAINER: return createContainer();
			case UMLPlusPackage.DATATYPE: return createDatatype();
			case UMLPlusPackage.DATATYPE_ASSOCIATION: return createDatatypeAssociation();
			case UMLPlusPackage.DEPENDENCY_RELATIONSHIP: return createDependencyRelationship();
			case UMLPlusPackage.DERIVATION: return createDerivation();
			case UMLPlusPackage.DIRECTED_BINARY_RELATIONSHIP: return createDirectedBinaryRelationship();
			case UMLPlusPackage.DIRECTED_RELATIONSHIP: return createDirectedRelationship();
			case UMLPlusPackage.ELEMENT: return createElement();
			case UMLPlusPackage.FORMAL_ASSOCIATION: return createFormalAssociation();
			case UMLPlusPackage.GENERALIZATION: return createGeneralization();
			case UMLPlusPackage.GENERALIZATION_SET: return createGeneralizationSet();
			case UMLPlusPackage.KIND: return createKind();
			case UMLPlusPackage.MATERIAL_ASSOCIATION: return createMaterialAssociation();
			case UMLPlusPackage.MEDIATION: return createMediation();
			case UMLPlusPackage.MEMBER_OF: return creatememberOf();
			case UMLPlusPackage.MERONYMIC: return createMeronymic();
			case UMLPlusPackage.MIXIN: return createMixin();
			case UMLPlusPackage.MIXIN_CLASS: return createMixinClass();
			case UMLPlusPackage.MODE: return createMode();
			case UMLPlusPackage.MOMENT_CLASS: return createMomentClass();
			case UMLPlusPackage.MULTIPLICITY_ELEMENT: return createMultiplicityElement();
			case UMLPlusPackage.NAMED_ELEMENT: return createNamedElement();
			case UMLPlusPackage.NON_RIGID_MIXIN_CLASS: return createNonRigidMixinClass();
			case UMLPlusPackage.OBJECT_CLASS: return createObjectClass();
			case UMLPlusPackage.PHASE: return createPhase();
			case UMLPlusPackage.PROPERTY: return createProperty();
			case UMLPlusPackage.QUANTITY: return createQuantity();
			case UMLPlusPackage.RELATIONAL_CLASSIFIER: return createRelationalClassifier();
			case UMLPlusPackage.RELATIONSHIP: return createRelationship();
			case UMLPlusPackage.RELATOR: return createRelator();
			case UMLPlusPackage.RIGID_MIXIN_CLASS: return createRigidMixinClass();
			case UMLPlusPackage.RIGID_SORTAL_CLASS: return createRigidSortalClass();
			case UMLPlusPackage.ROLE: return createRole();
			case UMLPlusPackage.ROLE_MIXIN: return createRoleMixin();
			case UMLPlusPackage.SEMI_RIGID_MIXIN: return createSemiRigidMixin();
			case UMLPlusPackage.SIMPLE_DATATYPE: return createSimpleDatatype();
			case UMLPlusPackage.SORTAL_CLASS: return createSortalClass();
			case UMLPlusPackage.STRUCTURAL_DATATYPE: return createStructuralDatatype();
			case UMLPlusPackage.STRUCTURAL_FEATURE: return createStructuralFeature();
			case UMLPlusPackage.SUB_COLLECTION_OF: return createsubCollectionOf();
			case UMLPlusPackage.SUB_KIND: return createSubKind();
			case UMLPlusPackage.SUB_QUANTITY_OF: return createsubQuantityOf();
			case UMLPlusPackage.SUBSTANCE_SORTAL: return createSubstanceSortal();
			case UMLPlusPackage.TYPE: return createType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
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
	public UMLPlus.Class createClass() {
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
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
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
	public UMLPlusPackage getUMLPlusPackage() {
		return (UMLPlusPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UMLPlusPackage getPackage() {
		return UMLPlusPackage.eINSTANCE;
	}

} //UMLPlusFactoryImpl
