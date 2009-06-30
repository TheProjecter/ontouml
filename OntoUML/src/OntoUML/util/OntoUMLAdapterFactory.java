/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

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

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see OntoUML.OntoUMLPackage
 * @generated
 */
public class OntoUMLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OntoUMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUMLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OntoUMLPackage.eINSTANCE;
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
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntoUMLSwitch<Adapter> modelSwitch =
		new OntoUMLSwitch<Adapter>() {
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
			public Adapter caseClass(OntoUML.Class object) {
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
			public Adapter caseDatatypeRelationship(DatatypeRelationship object) {
				return createDatatypeRelationshipAdapter();
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
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
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
			public Adapter caseRedefinableElement(RedefinableElement object) {
				return createRedefinableElementAdapter();
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
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link OntoUML.AntiRigidMixinClass <em>Anti Rigid Mixin Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.AntiRigidMixinClass
	 * @generated
	 */
	public Adapter createAntiRigidMixinClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.AntiRigidSortalClass <em>Anti Rigid Sortal Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.AntiRigidSortalClass
	 * @generated
	 */
	public Adapter createAntiRigidSortalClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Characterization <em>Characterization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Characterization
	 * @generated
	 */
	public Adapter createCharacterizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Collective <em>Collective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Collective
	 * @generated
	 */
	public Adapter createCollectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.componentOf <em>component Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.componentOf
	 * @generated
	 */
	public Adapter createcomponentOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Datatype
	 * @generated
	 */
	public Adapter createDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.DatatypeRelationship <em>Datatype Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.DatatypeRelationship
	 * @generated
	 */
	public Adapter createDatatypeRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.DependencyRelationship <em>Dependency Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.DependencyRelationship
	 * @generated
	 */
	public Adapter createDependencyRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Derivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Derivation
	 * @generated
	 */
	public Adapter createDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.DirectedBinaryRelationship <em>Directed Binary Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.DirectedBinaryRelationship
	 * @generated
	 */
	public Adapter createDirectedBinaryRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.DirectedRelationship <em>Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.DirectedRelationship
	 * @generated
	 */
	public Adapter createDirectedRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.FormalAssociation <em>Formal Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.FormalAssociation
	 * @generated
	 */
	public Adapter createFormalAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Generalization
	 * @generated
	 */
	public Adapter createGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.GeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.GeneralizationSet
	 * @generated
	 */
	public Adapter createGeneralizationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Kind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Kind
	 * @generated
	 */
	public Adapter createKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.MaterialAssociation <em>Material Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.MaterialAssociation
	 * @generated
	 */
	public Adapter createMaterialAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Mediation <em>Mediation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Mediation
	 * @generated
	 */
	public Adapter createMediationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.memberOf <em>member Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.memberOf
	 * @generated
	 */
	public Adapter creatememberOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Meronymic <em>Meronymic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Meronymic
	 * @generated
	 */
	public Adapter createMeronymicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Mixin <em>Mixin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Mixin
	 * @generated
	 */
	public Adapter createMixinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.MixinClass <em>Mixin Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.MixinClass
	 * @generated
	 */
	public Adapter createMixinClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Mode
	 * @generated
	 */
	public Adapter createModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.MomentClass <em>Moment Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.MomentClass
	 * @generated
	 */
	public Adapter createMomentClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.MultiplicityElement
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.NonRigidMixinClass <em>Non Rigid Mixin Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.NonRigidMixinClass
	 * @generated
	 */
	public Adapter createNonRigidMixinClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.ObjectClass <em>Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.ObjectClass
	 * @generated
	 */
	public Adapter createObjectClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Phase
	 * @generated
	 */
	public Adapter createPhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.RedefinableElement <em>Redefinable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.RedefinableElement
	 * @generated
	 */
	public Adapter createRedefinableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.RelationalClassifier <em>Relational Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.RelationalClassifier
	 * @generated
	 */
	public Adapter createRelationalClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Relator <em>Relator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Relator
	 * @generated
	 */
	public Adapter createRelatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.RigidMixinClass <em>Rigid Mixin Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.RigidMixinClass
	 * @generated
	 */
	public Adapter createRigidMixinClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.RigidSortalClass <em>Rigid Sortal Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.RigidSortalClass
	 * @generated
	 */
	public Adapter createRigidSortalClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.RoleMixin <em>Role Mixin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.RoleMixin
	 * @generated
	 */
	public Adapter createRoleMixinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.SemiRigidMixin <em>Semi Rigid Mixin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.SemiRigidMixin
	 * @generated
	 */
	public Adapter createSemiRigidMixinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.SimpleDatatype <em>Simple Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.SimpleDatatype
	 * @generated
	 */
	public Adapter createSimpleDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.SortalClass <em>Sortal Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.SortalClass
	 * @generated
	 */
	public Adapter createSortalClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.StructuralDatatype <em>Structural Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.StructuralDatatype
	 * @generated
	 */
	public Adapter createStructuralDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.StructuralFeature
	 * @generated
	 */
	public Adapter createStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.subCollectionOf <em>sub Collection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.subCollectionOf
	 * @generated
	 */
	public Adapter createsubCollectionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.SubKind <em>Sub Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.SubKind
	 * @generated
	 */
	public Adapter createSubKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.subQuantityOf <em>sub Quantity Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.subQuantityOf
	 * @generated
	 */
	public Adapter createsubQuantityOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.SubstanceSortal <em>Substance Sortal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.SubstanceSortal
	 * @generated
	 */
	public Adapter createSubstanceSortalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OntoUML.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OntoUML.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
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

} //OntoUMLAdapterFactory
