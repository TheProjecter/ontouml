/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see OntoUML.OntoUMLPackage
 * @generated
 */
public interface OntoUMLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OntoUMLFactory eINSTANCE = OntoUML.impl.OntoUMLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Anti Rigid Mixin Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anti Rigid Mixin Class</em>'.
	 * @generated
	 */
	AntiRigidMixinClass createAntiRigidMixinClass();

	/**
	 * Returns a new object of class '<em>Anti Rigid Sortal Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anti Rigid Sortal Class</em>'.
	 * @generated
	 */
	AntiRigidSortalClass createAntiRigidSortalClass();

	/**
	 * Returns a new object of class '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association</em>'.
	 * @generated
	 */
	Association createAssociation();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Characterization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Characterization</em>'.
	 * @generated
	 */
	Characterization createCharacterization();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	OntoUML.Class createClass();

	/**
	 * Returns a new object of class '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classifier</em>'.
	 * @generated
	 */
	Classifier createClassifier();

	/**
	 * Returns a new object of class '<em>Collective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collective</em>'.
	 * @generated
	 */
	Collective createCollective();

	/**
	 * Returns a new object of class '<em>component Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>component Of</em>'.
	 * @generated
	 */
	componentOf createcomponentOf();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype</em>'.
	 * @generated
	 */
	Datatype createDatatype();

	/**
	 * Returns a new object of class '<em>Datatype Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Relationship</em>'.
	 * @generated
	 */
	DatatypeRelationship createDatatypeRelationship();

	/**
	 * Returns a new object of class '<em>Dependency Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency Relationship</em>'.
	 * @generated
	 */
	DependencyRelationship createDependencyRelationship();

	/**
	 * Returns a new object of class '<em>Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derivation</em>'.
	 * @generated
	 */
	Derivation createDerivation();

	/**
	 * Returns a new object of class '<em>Directed Binary Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directed Binary Relationship</em>'.
	 * @generated
	 */
	DirectedBinaryRelationship createDirectedBinaryRelationship();

	/**
	 * Returns a new object of class '<em>Directed Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directed Relationship</em>'.
	 * @generated
	 */
	DirectedRelationship createDirectedRelationship();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns a new object of class '<em>Formal Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formal Association</em>'.
	 * @generated
	 */
	FormalAssociation createFormalAssociation();

	/**
	 * Returns a new object of class '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalization</em>'.
	 * @generated
	 */
	Generalization createGeneralization();

	/**
	 * Returns a new object of class '<em>Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalization Set</em>'.
	 * @generated
	 */
	GeneralizationSet createGeneralizationSet();

	/**
	 * Returns a new object of class '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kind</em>'.
	 * @generated
	 */
	Kind createKind();

	/**
	 * Returns a new object of class '<em>Material Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Material Association</em>'.
	 * @generated
	 */
	MaterialAssociation createMaterialAssociation();

	/**
	 * Returns a new object of class '<em>Mediation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mediation</em>'.
	 * @generated
	 */
	Mediation createMediation();

	/**
	 * Returns a new object of class '<em>member Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>member Of</em>'.
	 * @generated
	 */
	memberOf creatememberOf();

	/**
	 * Returns a new object of class '<em>Meronymic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meronymic</em>'.
	 * @generated
	 */
	Meronymic createMeronymic();

	/**
	 * Returns a new object of class '<em>Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mixin</em>'.
	 * @generated
	 */
	Mixin createMixin();

	/**
	 * Returns a new object of class '<em>Mixin Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mixin Class</em>'.
	 * @generated
	 */
	MixinClass createMixinClass();

	/**
	 * Returns a new object of class '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode</em>'.
	 * @generated
	 */
	Mode createMode();

	/**
	 * Returns a new object of class '<em>Moment Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Moment Class</em>'.
	 * @generated
	 */
	MomentClass createMomentClass();

	/**
	 * Returns a new object of class '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicity Element</em>'.
	 * @generated
	 */
	MultiplicityElement createMultiplicityElement();

	/**
	 * Returns a new object of class '<em>Non Rigid Mixin Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Rigid Mixin Class</em>'.
	 * @generated
	 */
	NonRigidMixinClass createNonRigidMixinClass();

	/**
	 * Returns a new object of class '<em>Object Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Class</em>'.
	 * @generated
	 */
	ObjectClass createObjectClass();

	/**
	 * Returns a new object of class '<em>Phase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phase</em>'.
	 * @generated
	 */
	Phase createPhase();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantity</em>'.
	 * @generated
	 */
	Quantity createQuantity();

	/**
	 * Returns a new object of class '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redefinable Element</em>'.
	 * @generated
	 */
	RedefinableElement createRedefinableElement();

	/**
	 * Returns a new object of class '<em>Relational Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Classifier</em>'.
	 * @generated
	 */
	RelationalClassifier createRelationalClassifier();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	Relationship createRelationship();

	/**
	 * Returns a new object of class '<em>Relator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relator</em>'.
	 * @generated
	 */
	Relator createRelator();

	/**
	 * Returns a new object of class '<em>Rigid Mixin Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rigid Mixin Class</em>'.
	 * @generated
	 */
	RigidMixinClass createRigidMixinClass();

	/**
	 * Returns a new object of class '<em>Rigid Sortal Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rigid Sortal Class</em>'.
	 * @generated
	 */
	RigidSortalClass createRigidSortalClass();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Role Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Mixin</em>'.
	 * @generated
	 */
	RoleMixin createRoleMixin();

	/**
	 * Returns a new object of class '<em>Semi Rigid Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semi Rigid Mixin</em>'.
	 * @generated
	 */
	SemiRigidMixin createSemiRigidMixin();

	/**
	 * Returns a new object of class '<em>Simple Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Datatype</em>'.
	 * @generated
	 */
	SimpleDatatype createSimpleDatatype();

	/**
	 * Returns a new object of class '<em>Sortal Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sortal Class</em>'.
	 * @generated
	 */
	SortalClass createSortalClass();

	/**
	 * Returns a new object of class '<em>Structural Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structural Datatype</em>'.
	 * @generated
	 */
	StructuralDatatype createStructuralDatatype();

	/**
	 * Returns a new object of class '<em>Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structural Feature</em>'.
	 * @generated
	 */
	StructuralFeature createStructuralFeature();

	/**
	 * Returns a new object of class '<em>sub Collection Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>sub Collection Of</em>'.
	 * @generated
	 */
	subCollectionOf createsubCollectionOf();

	/**
	 * Returns a new object of class '<em>Sub Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Kind</em>'.
	 * @generated
	 */
	SubKind createSubKind();

	/**
	 * Returns a new object of class '<em>sub Quantity Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>sub Quantity Of</em>'.
	 * @generated
	 */
	subQuantityOf createsubQuantityOf();

	/**
	 * Returns a new object of class '<em>Substance Sortal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Sortal</em>'.
	 * @generated
	 */
	SubstanceSortal createSubstanceSortal();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Element</em>'.
	 * @generated
	 */
	TypedElement createTypedElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OntoUMLPackage getOntoUMLPackage();

} //OntoUMLFactory
