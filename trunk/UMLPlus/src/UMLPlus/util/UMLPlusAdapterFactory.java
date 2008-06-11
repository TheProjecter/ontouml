/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package UMLPlus.util;

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
import UMLPlus.UMLPlusPackage;
import UMLPlus.componentOf;
import UMLPlus.memberOf;
import UMLPlus.subCollectionOf;
import UMLPlus.subQuantityOf;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see UMLPlus.UMLPlusPackage
 * @generated
 */
public class UMLPlusAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UMLPlusPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLPlusAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UMLPlusPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLPlusSwitch<Adapter> modelSwitch =
		new UMLPlusSwitch<Adapter>() {
			@Override
			public Adapter caseAntiRigidMixinClass(AntiRigidMixinClass object) {
				return createAntiRigidMixinClassAdapter();
			}
			@Override
			public Adapter caseAntiRigidSortalClass(AntiRigidSortalClass object) {
				return createAntiRigidSortalClassAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseCharacterization(Characterization object) {
				return createCharacterizationAdapter();
			}
			@Override
			public Adapter caseClass(UMLPlus.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter caseCollective(Collective object) {
				return createCollectiveAdapter();
			}
			@Override
			public Adapter casecomponentOf(componentOf object) {
				return createcomponentOfAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseDatatype(Datatype object) {
				return createDatatypeAdapter();
			}
			@Override
			public Adapter caseDatatypeAssociation(DatatypeAssociation object) {
				return createDatatypeAssociationAdapter();
			}
			@Override
			public Adapter caseDependencyRelationship(DependencyRelationship object) {
				return createDependencyRelationshipAdapter();
			}
			@Override
			public Adapter caseDerivation(Derivation object) {
				return createDerivationAdapter();
			}
			@Override
			public Adapter caseDirectedBinaryRelationship(DirectedBinaryRelationship object) {
				return createDirectedBinaryRelationshipAdapter();
			}
			@Override
			public Adapter caseDirectedRelationship(DirectedRelationship object) {
				return createDirectedRelationshipAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseFormalAssociation(FormalAssociation object) {
				return createFormalAssociationAdapter();
			}
			@Override
			public Adapter caseGeneralization(Generalization object) {
				return createGeneralizationAdapter();
			}
			@Override
			public Adapter caseGeneralizationSet(GeneralizationSet object) {
				return createGeneralizationSetAdapter();
			}
			@Override
			public Adapter caseKind(Kind object) {
				return createKindAdapter();
			}
			@Override
			public Adapter caseMaterialAssociation(MaterialAssociation object) {
				return createMaterialAssociationAdapter();
			}
			@Override
			public Adapter caseMediation(Mediation object) {
				return createMediationAdapter();
			}
			@Override
			public Adapter casememberOf(memberOf object) {
				return creatememberOfAdapter();
			}
			@Override
			public Adapter caseMeronymic(Meronymic object) {
				return createMeronymicAdapter();
			}
			@Override
			public Adapter caseMixin(Mixin object) {
				return createMixinAdapter();
			}
			@Override
			public Adapter caseMixinClass(MixinClass object) {
				return createMixinClassAdapter();
			}
			@Override
			public Adapter caseMode(Mode object) {
				return createModeAdapter();
			}
			@Override
			public Adapter caseMomentClass(MomentClass object) {
				return createMomentClassAdapter();
			}
			@Override
			public Adapter caseMultiplicityElement(MultiplicityElement object) {
				return createMultiplicityElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseNonRigidMixinClass(NonRigidMixinClass object) {
				return createNonRigidMixinClassAdapter();
			}
			@Override
			public Adapter caseObjectClass(ObjectClass object) {
				return createObjectClassAdapter();
			}
			@Override
			public Adapter casePhase(Phase object) {
				return createPhaseAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseQuantity(Quantity object) {
				return createQuantityAdapter();
			}
			@Override
			public Adapter caseRelationalClassifier(RelationalClassifier object) {
				return createRelationalClassifierAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseRelator(Relator object) {
				return createRelatorAdapter();
			}
			@Override
			public Adapter caseRigidMixinClass(RigidMixinClass object) {
				return createRigidMixinClassAdapter();
			}
			@Override
			public Adapter caseRigidSortalClass(RigidSortalClass object) {
				return createRigidSortalClassAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseRoleMixin(RoleMixin object) {
				return createRoleMixinAdapter();
			}
			@Override
			public Adapter caseSemiRigidMixin(SemiRigidMixin object) {
				return createSemiRigidMixinAdapter();
			}
			@Override
			public Adapter caseSimpleDatatype(SimpleDatatype object) {
				return createSimpleDatatypeAdapter();
			}
			@Override
			public Adapter caseSortalClass(SortalClass object) {
				return createSortalClassAdapter();
			}
			@Override
			public Adapter caseStructuralDatatype(StructuralDatatype object) {
				return createStructuralDatatypeAdapter();
			}
			@Override
			public Adapter caseStructuralFeature(StructuralFeature object) {
				return createStructuralFeatureAdapter();
			}
			@Override
			public Adapter casesubCollectionOf(subCollectionOf object) {
				return createsubCollectionOfAdapter();
			}
			@Override
			public Adapter caseSubKind(SubKind object) {
				return createSubKindAdapter();
			}
			@Override
			public Adapter casesubQuantityOf(subQuantityOf object) {
				return createsubQuantityOfAdapter();
			}
			@Override
			public Adapter caseSubstanceSortal(SubstanceSortal object) {
				return createSubstanceSortalAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.AntiRigidMixinClass <em>Anti Rigid Mixin Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.AntiRigidMixinClass
	 * @generated
	 */
	public Adapter createAntiRigidMixinClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.AntiRigidSortalClass <em>Anti Rigid Sortal Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.AntiRigidSortalClass
	 * @generated
	 */
	public Adapter createAntiRigidSortalClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Characterization <em>Characterization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Characterization
	 * @generated
	 */
	public Adapter createCharacterizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Collective <em>Collective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Collective
	 * @generated
	 */
	public Adapter createCollectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.componentOf <em>component Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.componentOf
	 * @generated
	 */
	public Adapter createcomponentOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Datatype
	 * @generated
	 */
	public Adapter createDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.DatatypeAssociation <em>Datatype Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.DatatypeAssociation
	 * @generated
	 */
	public Adapter createDatatypeAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.DependencyRelationship <em>Dependency Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.DependencyRelationship
	 * @generated
	 */
	public Adapter createDependencyRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Derivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Derivation
	 * @generated
	 */
	public Adapter createDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.DirectedBinaryRelationship <em>Directed Binary Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.DirectedBinaryRelationship
	 * @generated
	 */
	public Adapter createDirectedBinaryRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.DirectedRelationship <em>Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.DirectedRelationship
	 * @generated
	 */
	public Adapter createDirectedRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.FormalAssociation <em>Formal Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.FormalAssociation
	 * @generated
	 */
	public Adapter createFormalAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Generalization
	 * @generated
	 */
	public Adapter createGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.GeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.GeneralizationSet
	 * @generated
	 */
	public Adapter createGeneralizationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Kind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Kind
	 * @generated
	 */
	public Adapter createKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.MaterialAssociation <em>Material Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.MaterialAssociation
	 * @generated
	 */
	public Adapter createMaterialAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Mediation <em>Mediation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Mediation
	 * @generated
	 */
	public Adapter createMediationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.memberOf <em>member Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.memberOf
	 * @generated
	 */
	public Adapter creatememberOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Meronymic <em>Meronymic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Meronymic
	 * @generated
	 */
	public Adapter createMeronymicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Mixin <em>Mixin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Mixin
	 * @generated
	 */
	public Adapter createMixinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.MixinClass <em>Mixin Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.MixinClass
	 * @generated
	 */
	public Adapter createMixinClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Mode
	 * @generated
	 */
	public Adapter createModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.MomentClass <em>Moment Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.MomentClass
	 * @generated
	 */
	public Adapter createMomentClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.MultiplicityElement
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.NonRigidMixinClass <em>Non Rigid Mixin Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.NonRigidMixinClass
	 * @generated
	 */
	public Adapter createNonRigidMixinClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.ObjectClass <em>Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.ObjectClass
	 * @generated
	 */
	public Adapter createObjectClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Phase
	 * @generated
	 */
	public Adapter createPhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.RelationalClassifier <em>Relational Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.RelationalClassifier
	 * @generated
	 */
	public Adapter createRelationalClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Relator <em>Relator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Relator
	 * @generated
	 */
	public Adapter createRelatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.RigidMixinClass <em>Rigid Mixin Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.RigidMixinClass
	 * @generated
	 */
	public Adapter createRigidMixinClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.RigidSortalClass <em>Rigid Sortal Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.RigidSortalClass
	 * @generated
	 */
	public Adapter createRigidSortalClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.RoleMixin <em>Role Mixin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.RoleMixin
	 * @generated
	 */
	public Adapter createRoleMixinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.SemiRigidMixin <em>Semi Rigid Mixin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.SemiRigidMixin
	 * @generated
	 */
	public Adapter createSemiRigidMixinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.SimpleDatatype <em>Simple Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.SimpleDatatype
	 * @generated
	 */
	public Adapter createSimpleDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.SortalClass <em>Sortal Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.SortalClass
	 * @generated
	 */
	public Adapter createSortalClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.StructuralDatatype <em>Structural Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.StructuralDatatype
	 * @generated
	 */
	public Adapter createStructuralDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.StructuralFeature
	 * @generated
	 */
	public Adapter createStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.subCollectionOf <em>sub Collection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.subCollectionOf
	 * @generated
	 */
	public Adapter createsubCollectionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.SubKind <em>Sub Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.SubKind
	 * @generated
	 */
	public Adapter createSubKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.subQuantityOf <em>sub Quantity Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.subQuantityOf
	 * @generated
	 */
	public Adapter createsubQuantityOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.SubstanceSortal <em>Substance Sortal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.SubstanceSortal
	 * @generated
	 */
	public Adapter createSubstanceSortalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UMLPlus.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UMLPlus.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UMLPlusAdapterFactory
