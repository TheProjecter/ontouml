/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package UMLPlus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UMLPlus.Collective#isIsExtensional <em>Is Extensional</em>}</li>
 * </ul>
 * </p>
 *
 * @see UMLPlus.UMLPlusPackage#getCollective()
 * @model
 * @generated
 */
public interface Collective extends SubstanceSortal {
	/**
	 * Returns the value of the '<em><b>Is Extensional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Extensional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Extensional</em>' attribute.
	 * @see #setIsExtensional(boolean)
	 * @see UMLPlus.UMLPlusPackage#getCollective_IsExtensional()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsExtensional();

	/**
	 * Sets the value of the '{@link UMLPlus.Collective#isIsExtensional <em>Is Extensional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Extensional</em>' attribute.
	 * @see #isIsExtensional()
	 * @generated
	 */
	void setIsExtensional(boolean value);

} // Collective
