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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see UMLPlus.UMLPlusPackage
 * @generated
 */
public class UMLPlusSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UMLPlusPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLPlusSwitch() {
		if (modelPackage == null) {
			modelPackage = UMLPlusPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UMLPlusPackage.ANTI_RIGID_MIXIN_CLASS: {
				AntiRigidMixinClass antiRigidMixinClass = (AntiRigidMixinClass)theEObject;
				T result = caseAntiRigidMixinClass(antiRigidMixinClass);
				if (result == null) result = caseNonRigidMixinClass(antiRigidMixinClass);
				if (result == null) result = caseMixinClass(antiRigidMixinClass);
				if (result == null) result = caseObjectClass(antiRigidMixinClass);
				if (result == null) result = caseClass(antiRigidMixinClass);
				if (result == null) result = caseClassifier(antiRigidMixinClass);
				if (result == null) result = caseType(antiRigidMixinClass);
				if (result == null) result = caseNamedElement(antiRigidMixinClass);
				if (result == null) result = caseElement(antiRigidMixinClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.ANTI_RIGID_SORTAL_CLASS: {
				AntiRigidSortalClass antiRigidSortalClass = (AntiRigidSortalClass)theEObject;
				T result = caseAntiRigidSortalClass(antiRigidSortalClass);
				if (result == null) result = caseSortalClass(antiRigidSortalClass);
				if (result == null) result = caseObjectClass(antiRigidSortalClass);
				if (result == null) result = caseClass(antiRigidSortalClass);
				if (result == null) result = caseClassifier(antiRigidSortalClass);
				if (result == null) result = caseType(antiRigidSortalClass);
				if (result == null) result = caseNamedElement(antiRigidSortalClass);
				if (result == null) result = caseElement(antiRigidSortalClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseRelationship(association);
				if (result == null) result = caseRelationalClassifier(association);
				if (result == null) result = caseElement(association);
				if (result == null) result = caseClassifier(association);
				if (result == null) result = caseType(association);
				if (result == null) result = caseNamedElement(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.CATEGORY: {
				Category category = (Category)theEObject;
				T result = caseCategory(category);
				if (result == null) result = caseRigidMixinClass(category);
				if (result == null) result = caseMixinClass(category);
				if (result == null) result = caseObjectClass(category);
				if (result == null) result = caseClass(category);
				if (result == null) result = caseClassifier(category);
				if (result == null) result = caseType(category);
				if (result == null) result = caseNamedElement(category);
				if (result == null) result = caseElement(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.CHARACTERIZATION: {
				Characterization characterization = (Characterization)theEObject;
				T result = caseCharacterization(characterization);
				if (result == null) result = caseDependencyRelationship(characterization);
				if (result == null) result = caseDirectedBinaryRelationship(characterization);
				if (result == null) result = caseDirectedRelationship(characterization);
				if (result == null) result = caseRelationalClassifier(characterization);
				if (result == null) result = caseRelationship(characterization);
				if (result == null) result = caseClassifier(characterization);
				if (result == null) result = caseElement(characterization);
				if (result == null) result = caseType(characterization);
				if (result == null) result = caseNamedElement(characterization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.CLASS: {
				UMLPlus.Class class_ = (UMLPlus.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseClassifier(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = caseNamedElement(class_);
				if (result == null) result = caseElement(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T result = caseClassifier(classifier);
				if (result == null) result = caseType(classifier);
				if (result == null) result = caseNamedElement(classifier);
				if (result == null) result = caseElement(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.COLLECTIVE: {
				Collective collective = (Collective)theEObject;
				T result = caseCollective(collective);
				if (result == null) result = caseSubstanceSortal(collective);
				if (result == null) result = caseRigidSortalClass(collective);
				if (result == null) result = caseSortalClass(collective);
				if (result == null) result = caseObjectClass(collective);
				if (result == null) result = caseClass(collective);
				if (result == null) result = caseClassifier(collective);
				if (result == null) result = caseType(collective);
				if (result == null) result = caseNamedElement(collective);
				if (result == null) result = caseElement(collective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.COMPONENT_OF: {
				componentOf componentOf = (componentOf)theEObject;
				T result = casecomponentOf(componentOf);
				if (result == null) result = caseMeronymic(componentOf);
				if (result == null) result = caseDirectedBinaryRelationship(componentOf);
				if (result == null) result = caseDirectedRelationship(componentOf);
				if (result == null) result = caseRelationalClassifier(componentOf);
				if (result == null) result = caseRelationship(componentOf);
				if (result == null) result = caseClassifier(componentOf);
				if (result == null) result = caseElement(componentOf);
				if (result == null) result = caseType(componentOf);
				if (result == null) result = caseNamedElement(componentOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.DATATYPE: {
				Datatype datatype = (Datatype)theEObject;
				T result = caseDatatype(datatype);
				if (result == null) result = caseClassifier(datatype);
				if (result == null) result = caseType(datatype);
				if (result == null) result = caseNamedElement(datatype);
				if (result == null) result = caseElement(datatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.DATATYPE_ASSOCIATION: {
				DatatypeAssociation datatypeAssociation = (DatatypeAssociation)theEObject;
				T result = caseDatatypeAssociation(datatypeAssociation);
				if (result == null) result = caseAssociation(datatypeAssociation);
				if (result == null) result = caseRelationship(datatypeAssociation);
				if (result == null) result = caseRelationalClassifier(datatypeAssociation);
				if (result == null) result = caseElement(datatypeAssociation);
				if (result == null) result = caseClassifier(datatypeAssociation);
				if (result == null) result = caseType(datatypeAssociation);
				if (result == null) result = caseNamedElement(datatypeAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.DEPENDENCY_RELATIONSHIP: {
				DependencyRelationship dependencyRelationship = (DependencyRelationship)theEObject;
				T result = caseDependencyRelationship(dependencyRelationship);
				if (result == null) result = caseDirectedBinaryRelationship(dependencyRelationship);
				if (result == null) result = caseDirectedRelationship(dependencyRelationship);
				if (result == null) result = caseRelationalClassifier(dependencyRelationship);
				if (result == null) result = caseRelationship(dependencyRelationship);
				if (result == null) result = caseClassifier(dependencyRelationship);
				if (result == null) result = caseElement(dependencyRelationship);
				if (result == null) result = caseType(dependencyRelationship);
				if (result == null) result = caseNamedElement(dependencyRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.DERIVATION: {
				Derivation derivation = (Derivation)theEObject;
				T result = caseDerivation(derivation);
				if (result == null) result = caseDependencyRelationship(derivation);
				if (result == null) result = caseDirectedBinaryRelationship(derivation);
				if (result == null) result = caseDirectedRelationship(derivation);
				if (result == null) result = caseRelationalClassifier(derivation);
				if (result == null) result = caseRelationship(derivation);
				if (result == null) result = caseClassifier(derivation);
				if (result == null) result = caseElement(derivation);
				if (result == null) result = caseType(derivation);
				if (result == null) result = caseNamedElement(derivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.DIRECTED_BINARY_RELATIONSHIP: {
				DirectedBinaryRelationship directedBinaryRelationship = (DirectedBinaryRelationship)theEObject;
				T result = caseDirectedBinaryRelationship(directedBinaryRelationship);
				if (result == null) result = caseDirectedRelationship(directedBinaryRelationship);
				if (result == null) result = caseRelationalClassifier(directedBinaryRelationship);
				if (result == null) result = caseRelationship(directedBinaryRelationship);
				if (result == null) result = caseClassifier(directedBinaryRelationship);
				if (result == null) result = caseElement(directedBinaryRelationship);
				if (result == null) result = caseType(directedBinaryRelationship);
				if (result == null) result = caseNamedElement(directedBinaryRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.DIRECTED_RELATIONSHIP: {
				DirectedRelationship directedRelationship = (DirectedRelationship)theEObject;
				T result = caseDirectedRelationship(directedRelationship);
				if (result == null) result = caseRelationship(directedRelationship);
				if (result == null) result = caseElement(directedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.FORMAL_ASSOCIATION: {
				FormalAssociation formalAssociation = (FormalAssociation)theEObject;
				T result = caseFormalAssociation(formalAssociation);
				if (result == null) result = caseAssociation(formalAssociation);
				if (result == null) result = caseRelationship(formalAssociation);
				if (result == null) result = caseRelationalClassifier(formalAssociation);
				if (result == null) result = caseElement(formalAssociation);
				if (result == null) result = caseClassifier(formalAssociation);
				if (result == null) result = caseType(formalAssociation);
				if (result == null) result = caseNamedElement(formalAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.GENERALIZATION: {
				Generalization generalization = (Generalization)theEObject;
				T result = caseGeneralization(generalization);
				if (result == null) result = caseDirectedRelationship(generalization);
				if (result == null) result = caseRelationship(generalization);
				if (result == null) result = caseElement(generalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.GENERALIZATION_SET: {
				GeneralizationSet generalizationSet = (GeneralizationSet)theEObject;
				T result = caseGeneralizationSet(generalizationSet);
				if (result == null) result = caseNamedElement(generalizationSet);
				if (result == null) result = caseElement(generalizationSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.KIND: {
				Kind kind = (Kind)theEObject;
				T result = caseKind(kind);
				if (result == null) result = caseSubstanceSortal(kind);
				if (result == null) result = caseRigidSortalClass(kind);
				if (result == null) result = caseSortalClass(kind);
				if (result == null) result = caseObjectClass(kind);
				if (result == null) result = caseClass(kind);
				if (result == null) result = caseClassifier(kind);
				if (result == null) result = caseType(kind);
				if (result == null) result = caseNamedElement(kind);
				if (result == null) result = caseElement(kind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.MATERIAL_ASSOCIATION: {
				MaterialAssociation materialAssociation = (MaterialAssociation)theEObject;
				T result = caseMaterialAssociation(materialAssociation);
				if (result == null) result = caseAssociation(materialAssociation);
				if (result == null) result = caseRelationship(materialAssociation);
				if (result == null) result = caseRelationalClassifier(materialAssociation);
				if (result == null) result = caseElement(materialAssociation);
				if (result == null) result = caseClassifier(materialAssociation);
				if (result == null) result = caseType(materialAssociation);
				if (result == null) result = caseNamedElement(materialAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.MEDIATION: {
				Mediation mediation = (Mediation)theEObject;
				T result = caseMediation(mediation);
				if (result == null) result = caseDependencyRelationship(mediation);
				if (result == null) result = caseDirectedBinaryRelationship(mediation);
				if (result == null) result = caseDirectedRelationship(mediation);
				if (result == null) result = caseRelationalClassifier(mediation);
				if (result == null) result = caseRelationship(mediation);
				if (result == null) result = caseClassifier(mediation);
				if (result == null) result = caseElement(mediation);
				if (result == null) result = caseType(mediation);
				if (result == null) result = caseNamedElement(mediation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.MEMBER_OF: {
				memberOf memberOf = (memberOf)theEObject;
				T result = casememberOf(memberOf);
				if (result == null) result = caseMeronymic(memberOf);
				if (result == null) result = caseDirectedBinaryRelationship(memberOf);
				if (result == null) result = caseDirectedRelationship(memberOf);
				if (result == null) result = caseRelationalClassifier(memberOf);
				if (result == null) result = caseRelationship(memberOf);
				if (result == null) result = caseClassifier(memberOf);
				if (result == null) result = caseElement(memberOf);
				if (result == null) result = caseType(memberOf);
				if (result == null) result = caseNamedElement(memberOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.MERONYMIC: {
				Meronymic meronymic = (Meronymic)theEObject;
				T result = caseMeronymic(meronymic);
				if (result == null) result = caseDirectedBinaryRelationship(meronymic);
				if (result == null) result = caseDirectedRelationship(meronymic);
				if (result == null) result = caseRelationalClassifier(meronymic);
				if (result == null) result = caseRelationship(meronymic);
				if (result == null) result = caseClassifier(meronymic);
				if (result == null) result = caseElement(meronymic);
				if (result == null) result = caseType(meronymic);
				if (result == null) result = caseNamedElement(meronymic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.MIXIN: {
				Mixin mixin = (Mixin)theEObject;
				T result = caseMixin(mixin);
				if (result == null) result = caseSemiRigidMixin(mixin);
				if (result == null) result = caseNonRigidMixinClass(mixin);
				if (result == null) result = caseMixinClass(mixin);
				if (result == null) result = caseObjectClass(mixin);
				if (result == null) result = caseClass(mixin);
				if (result == null) result = caseClassifier(mixin);
				if (result == null) result = caseType(mixin);
				if (result == null) result = caseNamedElement(mixin);
				if (result == null) result = caseElement(mixin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.MIXIN_CLASS: {
				MixinClass mixinClass = (MixinClass)theEObject;
				T result = caseMixinClass(mixinClass);
				if (result == null) result = caseObjectClass(mixinClass);
				if (result == null) result = caseClass(mixinClass);
				if (result == null) result = caseClassifier(mixinClass);
				if (result == null) result = caseType(mixinClass);
				if (result == null) result = caseNamedElement(mixinClass);
				if (result == null) result = caseElement(mixinClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.MODE: {
				Mode mode = (Mode)theEObject;
				T result = caseMode(mode);
				if (result == null) result = caseMomentClass(mode);
				if (result == null) result = caseClass(mode);
				if (result == null) result = caseClassifier(mode);
				if (result == null) result = caseType(mode);
				if (result == null) result = caseNamedElement(mode);
				if (result == null) result = caseElement(mode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.MOMENT_CLASS: {
				MomentClass momentClass = (MomentClass)theEObject;
				T result = caseMomentClass(momentClass);
				if (result == null) result = caseClass(momentClass);
				if (result == null) result = caseClassifier(momentClass);
				if (result == null) result = caseType(momentClass);
				if (result == null) result = caseNamedElement(momentClass);
				if (result == null) result = caseElement(momentClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.MULTIPLICITY_ELEMENT: {
				MultiplicityElement multiplicityElement = (MultiplicityElement)theEObject;
				T result = caseMultiplicityElement(multiplicityElement);
				if (result == null) result = caseElement(multiplicityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.NON_RIGID_MIXIN_CLASS: {
				NonRigidMixinClass nonRigidMixinClass = (NonRigidMixinClass)theEObject;
				T result = caseNonRigidMixinClass(nonRigidMixinClass);
				if (result == null) result = caseMixinClass(nonRigidMixinClass);
				if (result == null) result = caseObjectClass(nonRigidMixinClass);
				if (result == null) result = caseClass(nonRigidMixinClass);
				if (result == null) result = caseClassifier(nonRigidMixinClass);
				if (result == null) result = caseType(nonRigidMixinClass);
				if (result == null) result = caseNamedElement(nonRigidMixinClass);
				if (result == null) result = caseElement(nonRigidMixinClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.OBJECT_CLASS: {
				ObjectClass objectClass = (ObjectClass)theEObject;
				T result = caseObjectClass(objectClass);
				if (result == null) result = caseClass(objectClass);
				if (result == null) result = caseClassifier(objectClass);
				if (result == null) result = caseType(objectClass);
				if (result == null) result = caseNamedElement(objectClass);
				if (result == null) result = caseElement(objectClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.PHASE: {
				Phase phase = (Phase)theEObject;
				T result = casePhase(phase);
				if (result == null) result = caseAntiRigidSortalClass(phase);
				if (result == null) result = caseSortalClass(phase);
				if (result == null) result = caseObjectClass(phase);
				if (result == null) result = caseClass(phase);
				if (result == null) result = caseClassifier(phase);
				if (result == null) result = caseType(phase);
				if (result == null) result = caseNamedElement(phase);
				if (result == null) result = caseElement(phase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseStructuralFeature(property);
				if (result == null) result = caseMultiplicityElement(property);
				if (result == null) result = caseNamedElement(property);
				if (result == null) result = caseElement(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.QUANTITY: {
				Quantity quantity = (Quantity)theEObject;
				T result = caseQuantity(quantity);
				if (result == null) result = caseSubstanceSortal(quantity);
				if (result == null) result = caseRigidSortalClass(quantity);
				if (result == null) result = caseSortalClass(quantity);
				if (result == null) result = caseObjectClass(quantity);
				if (result == null) result = caseClass(quantity);
				if (result == null) result = caseClassifier(quantity);
				if (result == null) result = caseType(quantity);
				if (result == null) result = caseNamedElement(quantity);
				if (result == null) result = caseElement(quantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.RELATIONAL_CLASSIFIER: {
				RelationalClassifier relationalClassifier = (RelationalClassifier)theEObject;
				T result = caseRelationalClassifier(relationalClassifier);
				if (result == null) result = caseClassifier(relationalClassifier);
				if (result == null) result = caseType(relationalClassifier);
				if (result == null) result = caseNamedElement(relationalClassifier);
				if (result == null) result = caseElement(relationalClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseElement(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.RELATOR: {
				Relator relator = (Relator)theEObject;
				T result = caseRelator(relator);
				if (result == null) result = caseMomentClass(relator);
				if (result == null) result = caseClass(relator);
				if (result == null) result = caseClassifier(relator);
				if (result == null) result = caseType(relator);
				if (result == null) result = caseNamedElement(relator);
				if (result == null) result = caseElement(relator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.RIGID_MIXIN_CLASS: {
				RigidMixinClass rigidMixinClass = (RigidMixinClass)theEObject;
				T result = caseRigidMixinClass(rigidMixinClass);
				if (result == null) result = caseMixinClass(rigidMixinClass);
				if (result == null) result = caseObjectClass(rigidMixinClass);
				if (result == null) result = caseClass(rigidMixinClass);
				if (result == null) result = caseClassifier(rigidMixinClass);
				if (result == null) result = caseType(rigidMixinClass);
				if (result == null) result = caseNamedElement(rigidMixinClass);
				if (result == null) result = caseElement(rigidMixinClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.RIGID_SORTAL_CLASS: {
				RigidSortalClass rigidSortalClass = (RigidSortalClass)theEObject;
				T result = caseRigidSortalClass(rigidSortalClass);
				if (result == null) result = caseSortalClass(rigidSortalClass);
				if (result == null) result = caseObjectClass(rigidSortalClass);
				if (result == null) result = caseClass(rigidSortalClass);
				if (result == null) result = caseClassifier(rigidSortalClass);
				if (result == null) result = caseType(rigidSortalClass);
				if (result == null) result = caseNamedElement(rigidSortalClass);
				if (result == null) result = caseElement(rigidSortalClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseAntiRigidSortalClass(role);
				if (result == null) result = caseSortalClass(role);
				if (result == null) result = caseObjectClass(role);
				if (result == null) result = caseClass(role);
				if (result == null) result = caseClassifier(role);
				if (result == null) result = caseType(role);
				if (result == null) result = caseNamedElement(role);
				if (result == null) result = caseElement(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.ROLE_MIXIN: {
				RoleMixin roleMixin = (RoleMixin)theEObject;
				T result = caseRoleMixin(roleMixin);
				if (result == null) result = caseAntiRigidMixinClass(roleMixin);
				if (result == null) result = caseNonRigidMixinClass(roleMixin);
				if (result == null) result = caseMixinClass(roleMixin);
				if (result == null) result = caseObjectClass(roleMixin);
				if (result == null) result = caseClass(roleMixin);
				if (result == null) result = caseClassifier(roleMixin);
				if (result == null) result = caseType(roleMixin);
				if (result == null) result = caseNamedElement(roleMixin);
				if (result == null) result = caseElement(roleMixin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.SEMI_RIGID_MIXIN: {
				SemiRigidMixin semiRigidMixin = (SemiRigidMixin)theEObject;
				T result = caseSemiRigidMixin(semiRigidMixin);
				if (result == null) result = caseNonRigidMixinClass(semiRigidMixin);
				if (result == null) result = caseMixinClass(semiRigidMixin);
				if (result == null) result = caseObjectClass(semiRigidMixin);
				if (result == null) result = caseClass(semiRigidMixin);
				if (result == null) result = caseClassifier(semiRigidMixin);
				if (result == null) result = caseType(semiRigidMixin);
				if (result == null) result = caseNamedElement(semiRigidMixin);
				if (result == null) result = caseElement(semiRigidMixin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.SIMPLE_DATATYPE: {
				SimpleDatatype simpleDatatype = (SimpleDatatype)theEObject;
				T result = caseSimpleDatatype(simpleDatatype);
				if (result == null) result = caseDatatype(simpleDatatype);
				if (result == null) result = caseClassifier(simpleDatatype);
				if (result == null) result = caseType(simpleDatatype);
				if (result == null) result = caseNamedElement(simpleDatatype);
				if (result == null) result = caseElement(simpleDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.SORTAL_CLASS: {
				SortalClass sortalClass = (SortalClass)theEObject;
				T result = caseSortalClass(sortalClass);
				if (result == null) result = caseObjectClass(sortalClass);
				if (result == null) result = caseClass(sortalClass);
				if (result == null) result = caseClassifier(sortalClass);
				if (result == null) result = caseType(sortalClass);
				if (result == null) result = caseNamedElement(sortalClass);
				if (result == null) result = caseElement(sortalClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.STRUCTURAL_DATATYPE: {
				StructuralDatatype structuralDatatype = (StructuralDatatype)theEObject;
				T result = caseStructuralDatatype(structuralDatatype);
				if (result == null) result = caseDatatype(structuralDatatype);
				if (result == null) result = caseClassifier(structuralDatatype);
				if (result == null) result = caseType(structuralDatatype);
				if (result == null) result = caseNamedElement(structuralDatatype);
				if (result == null) result = caseElement(structuralDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.STRUCTURAL_FEATURE: {
				StructuralFeature structuralFeature = (StructuralFeature)theEObject;
				T result = caseStructuralFeature(structuralFeature);
				if (result == null) result = caseMultiplicityElement(structuralFeature);
				if (result == null) result = caseNamedElement(structuralFeature);
				if (result == null) result = caseElement(structuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.SUB_COLLECTION_OF: {
				subCollectionOf subCollectionOf = (subCollectionOf)theEObject;
				T result = casesubCollectionOf(subCollectionOf);
				if (result == null) result = caseMeronymic(subCollectionOf);
				if (result == null) result = caseDirectedBinaryRelationship(subCollectionOf);
				if (result == null) result = caseDirectedRelationship(subCollectionOf);
				if (result == null) result = caseRelationalClassifier(subCollectionOf);
				if (result == null) result = caseRelationship(subCollectionOf);
				if (result == null) result = caseClassifier(subCollectionOf);
				if (result == null) result = caseElement(subCollectionOf);
				if (result == null) result = caseType(subCollectionOf);
				if (result == null) result = caseNamedElement(subCollectionOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.SUB_KIND: {
				SubKind subKind = (SubKind)theEObject;
				T result = caseSubKind(subKind);
				if (result == null) result = caseRigidSortalClass(subKind);
				if (result == null) result = caseSortalClass(subKind);
				if (result == null) result = caseObjectClass(subKind);
				if (result == null) result = caseClass(subKind);
				if (result == null) result = caseClassifier(subKind);
				if (result == null) result = caseType(subKind);
				if (result == null) result = caseNamedElement(subKind);
				if (result == null) result = caseElement(subKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.SUB_QUANTITY_OF: {
				subQuantityOf subQuantityOf = (subQuantityOf)theEObject;
				T result = casesubQuantityOf(subQuantityOf);
				if (result == null) result = caseMeronymic(subQuantityOf);
				if (result == null) result = caseDirectedBinaryRelationship(subQuantityOf);
				if (result == null) result = caseDirectedRelationship(subQuantityOf);
				if (result == null) result = caseRelationalClassifier(subQuantityOf);
				if (result == null) result = caseRelationship(subQuantityOf);
				if (result == null) result = caseClassifier(subQuantityOf);
				if (result == null) result = caseElement(subQuantityOf);
				if (result == null) result = caseType(subQuantityOf);
				if (result == null) result = caseNamedElement(subQuantityOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.SUBSTANCE_SORTAL: {
				SubstanceSortal substanceSortal = (SubstanceSortal)theEObject;
				T result = caseSubstanceSortal(substanceSortal);
				if (result == null) result = caseRigidSortalClass(substanceSortal);
				if (result == null) result = caseSortalClass(substanceSortal);
				if (result == null) result = caseObjectClass(substanceSortal);
				if (result == null) result = caseClass(substanceSortal);
				if (result == null) result = caseClassifier(substanceSortal);
				if (result == null) result = caseType(substanceSortal);
				if (result == null) result = caseNamedElement(substanceSortal);
				if (result == null) result = caseElement(substanceSortal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPlusPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseNamedElement(type);
				if (result == null) result = caseElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anti Rigid Mixin Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anti Rigid Mixin Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntiRigidMixinClass(AntiRigidMixinClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anti Rigid Sortal Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anti Rigid Sortal Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntiRigidSortalClass(AntiRigidSortalClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characterization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characterization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterization(Characterization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(UMLPlus.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollective(Collective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>component Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>component Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecomponentOf(componentOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatype(Datatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeAssociation(DatatypeAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyRelationship(DependencyRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivation(Derivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Binary Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Binary Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedBinaryRelationship(DirectedBinaryRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedRelationship(DirectedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalAssociation(FormalAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralization(Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizationSet(GeneralizationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKind(Kind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterialAssociation(MaterialAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mediation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mediation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediation(Mediation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>member Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>member Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casememberOf(memberOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meronymic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meronymic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeronymic(Meronymic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixin(Mixin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixin Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixin Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixinClass(MixinClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMode(Mode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moment Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moment Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMomentClass(MomentClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityElement(MultiplicityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Rigid Mixin Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Rigid Mixin Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonRigidMixinClass(NonRigidMixinClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectClass(ObjectClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhase(Phase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantity(Quantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalClassifier(RelationalClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelator(Relator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rigid Mixin Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rigid Mixin Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRigidMixinClass(RigidMixinClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rigid Sortal Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rigid Sortal Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRigidSortalClass(RigidSortalClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Mixin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleMixin(RoleMixin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semi Rigid Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semi Rigid Mixin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemiRigidMixin(SemiRigidMixin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleDatatype(SimpleDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sortal Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sortal Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortalClass(SortalClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralDatatype(StructuralDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeature(StructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sub Collection Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sub Collection Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesubCollectionOf(subCollectionOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubKind(SubKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sub Quantity Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sub Quantity Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesubQuantityOf(subQuantityOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Sortal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Sortal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSortal(SubstanceSortal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //UMLPlusSwitch
