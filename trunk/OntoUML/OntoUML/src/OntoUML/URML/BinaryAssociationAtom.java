/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.URML;

import OntoUML.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Association Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OntoUML.URML.BinaryAssociationAtom#getAssociation <em>Association</em>}</li>
 *   <li>{@link OntoUML.URML.BinaryAssociationAtom#getSourceVariable <em>Source Variable</em>}</li>
 *   <li>{@link OntoUML.URML.BinaryAssociationAtom#getTargetVariable <em>Target Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see OntoUML.URML.URMLPackage#getBinaryAssociationAtom()
 * @model
 * @generated
 */
public interface BinaryAssociationAtom extends Condition, Conclusion {
	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see OntoUML.URML.URMLPackage#getBinaryAssociationAtom_Association()
	 * @model required="true"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link OntoUML.URML.BinaryAssociationAtom#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Source Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Variable</em>' attribute.
	 * @see #setSourceVariable(String)
	 * @see OntoUML.URML.URMLPackage#getBinaryAssociationAtom_SourceVariable()
	 * @model
	 * @generated
	 */
	String getSourceVariable();

	/**
	 * Sets the value of the '{@link OntoUML.URML.BinaryAssociationAtom#getSourceVariable <em>Source Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Variable</em>' attribute.
	 * @see #getSourceVariable()
	 * @generated
	 */
	void setSourceVariable(String value);

	/**
	 * Returns the value of the '<em><b>Target Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Variable</em>' attribute.
	 * @see #setTargetVariable(String)
	 * @see OntoUML.URML.URMLPackage#getBinaryAssociationAtom_TargetVariable()
	 * @model
	 * @generated
	 */
	String getTargetVariable();

	/**
	 * Sets the value of the '{@link OntoUML.URML.BinaryAssociationAtom#getTargetVariable <em>Target Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Variable</em>' attribute.
	 * @see #getTargetVariable()
	 * @generated
	 */
	void setTargetVariable(String value);

} // BinaryAssociationAtom
