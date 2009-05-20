/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.URML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OntoUML.URML.ClassifierAtom#getClass_ <em>Class</em>}</li>
 *   <li>{@link OntoUML.URML.ClassifierAtom#getClassVariable <em>Class Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see OntoUML.URML.URMLPackage#getClassifierAtom()
 * @model
 * @generated
 */
public interface ClassifierAtom extends Condition, Conclusion {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(OntoUML.Class)
	 * @see OntoUML.URML.URMLPackage#getClassifierAtom_Class()
	 * @model required="true"
	 * @generated
	 */
	OntoUML.Class getClass_();

	/**
	 * Sets the value of the '{@link OntoUML.URML.ClassifierAtom#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(OntoUML.Class value);

	/**
	 * Returns the value of the '<em><b>Class Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Variable</em>' attribute.
	 * @see #setClassVariable(String)
	 * @see OntoUML.URML.URMLPackage#getClassifierAtom_ClassVariable()
	 * @model
	 * @generated
	 */
	String getClassVariable();

	/**
	 * Sets the value of the '{@link OntoUML.URML.ClassifierAtom#getClassVariable <em>Class Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Variable</em>' attribute.
	 * @see #getClassVariable()
	 * @generated
	 */
	void setClassVariable(String value);

} // ClassifierAtom
