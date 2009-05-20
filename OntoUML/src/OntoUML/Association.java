/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OntoUML.Association#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link OntoUML.Association#getAssociationEndAux1 <em>Association End Aux1</em>}</li>
 *   <li>{@link OntoUML.Association#getAssociationEndAux2 <em>Association End Aux2</em>}</li>
 * </ul>
 * </p>
 *
 * @see OntoUML.OntoUMLPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Relationship, RelationalClassifier {
	/**
	 * Returns the value of the '<em><b>Association End</b></em>' reference list.
	 * The list contents are of type {@link OntoUML.Property}.
	 * It is bidirectional and its opposite is '{@link OntoUML.Property#getAssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association End</em>' reference list.
	 * @see OntoUML.OntoUMLPackage#getAssociation_AssociationEnd()
	 * @see OntoUML.Property#getAssociationEnd
	 * @model opposite="associationEnd" lower="2"
	 * @generated
	 */
	EList<Property> getAssociationEnd();

	/**
	 * Returns the value of the '<em><b>Association End Aux1</b></em>' reference list.
	 * The list contents are of type {@link OntoUML.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association End Aux1</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association End Aux1</em>' reference list.
	 * @see OntoUML.OntoUMLPackage#getAssociation_AssociationEndAux1()
	 * @model
	 * @generated
	 */
	EList<Type> getAssociationEndAux1();

	/**
	 * Returns the value of the '<em><b>Association End Aux2</b></em>' reference list.
	 * The list contents are of type {@link OntoUML.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association End Aux2</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association End Aux2</em>' reference list.
	 * @see OntoUML.OntoUMLPackage#getAssociation_AssociationEndAux2()
	 * @model
	 * @generated
	 */
	EList<Type> getAssociationEndAux2();

} // Association
