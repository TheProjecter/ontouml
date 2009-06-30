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
 *   <li>{@link OntoUML.Association#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link OntoUML.Association#getAssociationEndAux1 <em>Association End Aux1</em>}</li>
 *   <li>{@link OntoUML.Association#getAssociationEndAux2 <em>Association End Aux2</em>}</li>
 *   <li>{@link OntoUML.Association#getAssociationEnd3Aux <em>Association End3 Aux</em>}</li>
 *   <li>{@link OntoUML.Association#getAssociationEnd1PropertyNameLabelAux <em>Association End1 Property Name Label Aux</em>}</li>
 *   <li>{@link OntoUML.Association#getAssociationEnd2PropertyNameLabelAux <em>Association End2 Property Name Label Aux</em>}</li>
 *   <li>{@link OntoUML.Association#getAssociationEnd1PropertyCardinalitiesLabelAux <em>Association End1 Property Cardinalities Label Aux</em>}</li>
 *   <li>{@link OntoUML.Association#getAssociationEnd2PropertyCardinalitiesLabelAux <em>Association End2 Property Cardinalities Label Aux</em>}</li>
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
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see OntoUML.OntoUMLPackage#getAssociation_IsDerived()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link OntoUML.Association#isIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isIsDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

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

	/**
	 * Returns the value of the '<em><b>Association End3 Aux</b></em>' containment reference list.
	 * The list contents are of type {@link OntoUML.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association End3 Aux</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association End3 Aux</em>' containment reference list.
	 * @see OntoUML.OntoUMLPackage#getAssociation_AssociationEnd3Aux()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getAssociationEnd3Aux();

	/**
	 * Returns the value of the '<em><b>Association End1 Property Name Label Aux</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association End1 Property Name Label Aux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association End1 Property Name Label Aux</em>' attribute.
	 * @see #setAssociationEnd1PropertyNameLabelAux(String)
	 * @see OntoUML.OntoUMLPackage#getAssociation_AssociationEnd1PropertyNameLabelAux()
	 * @model default="" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getAssociationEnd1PropertyNameLabelAux();

	/**
	 * Sets the value of the '{@link OntoUML.Association#getAssociationEnd1PropertyNameLabelAux <em>Association End1 Property Name Label Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association End1 Property Name Label Aux</em>' attribute.
	 * @see #getAssociationEnd1PropertyNameLabelAux()
	 * @generated
	 */
	void setAssociationEnd1PropertyNameLabelAux(String value);

	/**
	 * Returns the value of the '<em><b>Association End2 Property Name Label Aux</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association End2 Property Name Label Aux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association End2 Property Name Label Aux</em>' attribute.
	 * @see #setAssociationEnd2PropertyNameLabelAux(String)
	 * @see OntoUML.OntoUMLPackage#getAssociation_AssociationEnd2PropertyNameLabelAux()
	 * @model default="" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getAssociationEnd2PropertyNameLabelAux();

	/**
	 * Sets the value of the '{@link OntoUML.Association#getAssociationEnd2PropertyNameLabelAux <em>Association End2 Property Name Label Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association End2 Property Name Label Aux</em>' attribute.
	 * @see #getAssociationEnd2PropertyNameLabelAux()
	 * @generated
	 */
	void setAssociationEnd2PropertyNameLabelAux(String value);

	/**
	 * Returns the value of the '<em><b>Association End1 Property Cardinalities Label Aux</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association End1 Property Cardinalities Label Aux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association End1 Property Cardinalities Label Aux</em>' attribute.
	 * @see #setAssociationEnd1PropertyCardinalitiesLabelAux(String)
	 * @see OntoUML.OntoUMLPackage#getAssociation_AssociationEnd1PropertyCardinalitiesLabelAux()
	 * @model default="" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getAssociationEnd1PropertyCardinalitiesLabelAux();

	/**
	 * Sets the value of the '{@link OntoUML.Association#getAssociationEnd1PropertyCardinalitiesLabelAux <em>Association End1 Property Cardinalities Label Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association End1 Property Cardinalities Label Aux</em>' attribute.
	 * @see #getAssociationEnd1PropertyCardinalitiesLabelAux()
	 * @generated
	 */
	void setAssociationEnd1PropertyCardinalitiesLabelAux(String value);

	/**
	 * Returns the value of the '<em><b>Association End2 Property Cardinalities Label Aux</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association End2 Property Cardinalities Label Aux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association End2 Property Cardinalities Label Aux</em>' attribute.
	 * @see #setAssociationEnd2PropertyCardinalitiesLabelAux(String)
	 * @see OntoUML.OntoUMLPackage#getAssociation_AssociationEnd2PropertyCardinalitiesLabelAux()
	 * @model default="" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getAssociationEnd2PropertyCardinalitiesLabelAux();

	/**
	 * Sets the value of the '{@link OntoUML.Association#getAssociationEnd2PropertyCardinalitiesLabelAux <em>Association End2 Property Cardinalities Label Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association End2 Property Cardinalities Label Aux</em>' attribute.
	 * @see #getAssociationEnd2PropertyCardinalitiesLabelAux()
	 * @generated
	 */
	void setAssociationEnd2PropertyCardinalitiesLabelAux(String value);

} // Association
