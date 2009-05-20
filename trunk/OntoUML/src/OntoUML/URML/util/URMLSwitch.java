/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.URML.util;

import OntoUML.Classifier;
import OntoUML.Element;
import OntoUML.NamedElement;
import OntoUML.RelationalClassifier;
import OntoUML.Type;

import OntoUML.URML.*;

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
 * @see OntoUML.URML.URMLPackage
 * @generated
 */
public class URMLSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static URMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URMLSwitch() {
		if (modelPackage == null) {
			modelPackage = URMLPackage.eINSTANCE;
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
			case URMLPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = caseNamedElement(rule);
				if (result == null) result = caseElement(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URMLPackage.DERIVATION_RULE: {
				DerivationRule derivationRule = (DerivationRule)theEObject;
				T result = caseDerivationRule(derivationRule);
				if (result == null) result = caseRule(derivationRule);
				if (result == null) result = caseNamedElement(derivationRule);
				if (result == null) result = caseElement(derivationRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URMLPackage.CONCLUSION: {
				Conclusion conclusion = (Conclusion)theEObject;
				T result = caseConclusion(conclusion);
				if (result == null) result = caseRelationalClassifier(conclusion);
				if (result == null) result = caseClassifier(conclusion);
				if (result == null) result = caseType(conclusion);
				if (result == null) result = caseNamedElement(conclusion);
				if (result == null) result = caseElement(conclusion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URMLPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseRelationalClassifier(condition);
				if (result == null) result = caseClassifier(condition);
				if (result == null) result = caseType(condition);
				if (result == null) result = caseNamedElement(condition);
				if (result == null) result = caseElement(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URMLPackage.CLASSIFIER_ATOM: {
				ClassifierAtom classifierAtom = (ClassifierAtom)theEObject;
				T result = caseClassifierAtom(classifierAtom);
				if (result == null) result = caseCondition(classifierAtom);
				if (result == null) result = caseConclusion(classifierAtom);
				if (result == null) result = caseRelationalClassifier(classifierAtom);
				if (result == null) result = caseClassifier(classifierAtom);
				if (result == null) result = caseType(classifierAtom);
				if (result == null) result = caseNamedElement(classifierAtom);
				if (result == null) result = caseElement(classifierAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URMLPackage.ROLE_TYPE_ATOM: {
				RoleTypeAtom roleTypeAtom = (RoleTypeAtom)theEObject;
				T result = caseRoleTypeAtom(roleTypeAtom);
				if (result == null) result = caseConclusion(roleTypeAtom);
				if (result == null) result = caseCondition(roleTypeAtom);
				if (result == null) result = caseRelationalClassifier(roleTypeAtom);
				if (result == null) result = caseClassifier(roleTypeAtom);
				if (result == null) result = caseType(roleTypeAtom);
				if (result == null) result = caseNamedElement(roleTypeAtom);
				if (result == null) result = caseElement(roleTypeAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URMLPackage.BINARY_ASSOCIATION_ATOM: {
				BinaryAssociationAtom binaryAssociationAtom = (BinaryAssociationAtom)theEObject;
				T result = caseBinaryAssociationAtom(binaryAssociationAtom);
				if (result == null) result = caseCondition(binaryAssociationAtom);
				if (result == null) result = caseConclusion(binaryAssociationAtom);
				if (result == null) result = caseRelationalClassifier(binaryAssociationAtom);
				if (result == null) result = caseClassifier(binaryAssociationAtom);
				if (result == null) result = caseType(binaryAssociationAtom);
				if (result == null) result = caseNamedElement(binaryAssociationAtom);
				if (result == null) result = caseElement(binaryAssociationAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URMLPackage.OBJECT_VARIABLE: {
				ObjectVariable objectVariable = (ObjectVariable)theEObject;
				T result = caseObjectVariable(objectVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URMLPackage.ATTRIBUTION_ATOM: {
				AttributionAtom attributionAtom = (AttributionAtom)theEObject;
				T result = caseAttributionAtom(attributionAtom);
				if (result == null) result = caseConclusion(attributionAtom);
				if (result == null) result = caseRelationalClassifier(attributionAtom);
				if (result == null) result = caseClassifier(attributionAtom);
				if (result == null) result = caseType(attributionAtom);
				if (result == null) result = caseNamedElement(attributionAtom);
				if (result == null) result = caseElement(attributionAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derivation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derivation Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivationRule(DerivationRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conclusion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conclusion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConclusion(Conclusion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierAtom(ClassifierAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Type Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Type Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleTypeAtom(RoleTypeAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Association Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Association Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryAssociationAtom(BinaryAssociationAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectVariable(ObjectVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribution Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribution Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributionAtom(AttributionAtom object) {
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

} //URMLSwitch
