/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.URML.impl;

import OntoUML.URML.*;

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
public class URMLFactoryImpl extends EFactoryImpl implements URMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static URMLFactory init() {
		try {
			URMLFactory theURMLFactory = (URMLFactory)EPackage.Registry.INSTANCE.getEFactory("OntoUML.URML"); 
			if (theURMLFactory != null) {
				return theURMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new URMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URMLFactoryImpl() {
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
			case URMLPackage.DERIVATION_RULE: return createDerivationRule();
			case URMLPackage.CLASSIFIER_ATOM: return createClassifierAtom();
			case URMLPackage.ROLE_TYPE_ATOM: return createRoleTypeAtom();
			case URMLPackage.BINARY_ASSOCIATION_ATOM: return createBinaryAssociationAtom();
			case URMLPackage.OBJECT_VARIABLE: return createObjectVariable();
			case URMLPackage.ATTRIBUTION_ATOM: return createAttributionAtom();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationRule createDerivationRule() {
		DerivationRuleImpl derivationRule = new DerivationRuleImpl();
		return derivationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierAtom createClassifierAtom() {
		ClassifierAtomImpl classifierAtom = new ClassifierAtomImpl();
		return classifierAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTypeAtom createRoleTypeAtom() {
		RoleTypeAtomImpl roleTypeAtom = new RoleTypeAtomImpl();
		return roleTypeAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryAssociationAtom createBinaryAssociationAtom() {
		BinaryAssociationAtomImpl binaryAssociationAtom = new BinaryAssociationAtomImpl();
		return binaryAssociationAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectVariable createObjectVariable() {
		ObjectVariableImpl objectVariable = new ObjectVariableImpl();
		return objectVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributionAtom createAttributionAtom() {
		AttributionAtomImpl attributionAtom = new AttributionAtomImpl();
		return attributionAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URMLPackage getURMLPackage() {
		return (URMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static URMLPackage getPackage() {
		return URMLPackage.eINSTANCE;
	}

} //URMLFactoryImpl
