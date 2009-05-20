/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.URML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see OntoUML.URML.URMLPackage
 * @generated
 */
public interface URMLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	URMLFactory eINSTANCE = OntoUML.URML.impl.URMLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Derivation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derivation Rule</em>'.
	 * @generated
	 */
	DerivationRule createDerivationRule();

	/**
	 * Returns a new object of class '<em>Classifier Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classifier Atom</em>'.
	 * @generated
	 */
	ClassifierAtom createClassifierAtom();

	/**
	 * Returns a new object of class '<em>Role Type Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Type Atom</em>'.
	 * @generated
	 */
	RoleTypeAtom createRoleTypeAtom();

	/**
	 * Returns a new object of class '<em>Binary Association Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Association Atom</em>'.
	 * @generated
	 */
	BinaryAssociationAtom createBinaryAssociationAtom();

	/**
	 * Returns a new object of class '<em>Object Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Variable</em>'.
	 * @generated
	 */
	ObjectVariable createObjectVariable();

	/**
	 * Returns a new object of class '<em>Attribution Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribution Atom</em>'.
	 * @generated
	 */
	AttributionAtom createAttributionAtom();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	URMLPackage getURMLPackage();

} //URMLFactory
