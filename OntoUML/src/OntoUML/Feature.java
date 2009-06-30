/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OntoUML.Feature#isIsStatic <em>Is Static</em>}</li>
 * </ul>
 * </p>
 *
 * @see OntoUML.OntoUMLPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see OntoUML.OntoUMLPackage#getFeature_IsStatic()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link OntoUML.Feature#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

} // Feature
