/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OntoUML.Property#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link OntoUML.Property#isIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link OntoUML.Property#getEndType <em>End Type</em>}</li>
 *   <li>{@link OntoUML.Property#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link OntoUML.Property#getSource <em>Source</em>}</li>
 *   <li>{@link OntoUML.Property#getTarget <em>Target</em>}</li>
 *   <li>{@link OntoUML.Property#getAssociationEndPositionAux <em>Association End Position Aux</em>}</li>
 * </ul>
 * </p>
 *
 * @see OntoUML.OntoUMLPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends StructuralFeature {
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
	 * @see OntoUML.OntoUMLPackage#getProperty_IsDerived()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link OntoUML.Property#isIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isIsDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Navigable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Navigable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Navigable</em>' attribute.
	 * @see #setIsNavigable(boolean)
	 * @see OntoUML.OntoUMLPackage#getProperty_IsNavigable()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsNavigable();

	/**
	 * Sets the value of the '{@link OntoUML.Property#isIsNavigable <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Navigable</em>' attribute.
	 * @see #isIsNavigable()
	 * @generated
	 */
	void setIsNavigable(boolean value);

	/**
	 * Returns the value of the '<em><b>End Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Type</em>' reference.
	 * @see #setEndType(Type)
	 * @see OntoUML.OntoUMLPackage#getProperty_EndType()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/ocl/examples/OCL derive='if self.source->notEmpty() then (if self.source.sourceAux1->forAll(x | x.oclIsKindOf(Type)) then self.source.sourceAux1.oclAsType(Type)->any(true) else null endif) else if self.target->notEmpty() then (if self.target.targetAux1->forAll(x | x.oclIsKindOf(Type)) then self.target.targetAux1.oclAsType(Type)->any(true) else null endif) else if (self.associationEndPositionAux = 1) then self.associationEnd.associationEndAux1->any(true) else if (self.associationEndPositionAux = 2) then self.associationEnd.associationEndAux2->any(true) else null endif endif endif endif'"
	 * @generated
	 */
	Type getEndType();

	/**
	 * Sets the value of the '{@link OntoUML.Property#getEndType <em>End Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Type</em>' reference.
	 * @see #getEndType()
	 * @generated
	 */
	void setEndType(Type value);

	/**
	 * Returns the value of the '<em><b>Association End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link OntoUML.Association#getAssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association End</em>' reference.
	 * @see #setAssociationEnd(Association)
	 * @see OntoUML.OntoUMLPackage#getProperty_AssociationEnd()
	 * @see OntoUML.Association#getAssociationEnd
	 * @model opposite="associationEnd"
	 * @generated
	 */
	Association getAssociationEnd();

	/**
	 * Sets the value of the '{@link OntoUML.Property#getAssociationEnd <em>Association End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association End</em>' reference.
	 * @see #getAssociationEnd()
	 * @generated
	 */
	void setAssociationEnd(Association value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(DirectedBinaryRelationship)
	 * @see OntoUML.OntoUMLPackage#getProperty_Source()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/ocl/examples/OCL derive='DirectedBinaryRelationship.allInstances()->any(x | x.source->includes(self) or x.sourceAux2->includes(self))'"
	 * @generated
	 */
	DirectedBinaryRelationship getSource();

	/**
	 * Sets the value of the '{@link OntoUML.Property#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DirectedBinaryRelationship value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DirectedBinaryRelationship)
	 * @see OntoUML.OntoUMLPackage#getProperty_Target()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/ocl/examples/OCL derive='DirectedBinaryRelationship.allInstances()->any(x | x.target->includes(self) or x.targetAux2->includes(self))'"
	 * @generated
	 */
	DirectedBinaryRelationship getTarget();

	/**
	 * Sets the value of the '{@link OntoUML.Property#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DirectedBinaryRelationship value);

	/**
	 * Returns the value of the '<em><b>Association End Position Aux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association End Position Aux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association End Position Aux</em>' attribute.
	 * @see #setAssociationEndPositionAux(int)
	 * @see OntoUML.OntoUMLPackage#getProperty_AssociationEndPositionAux()
	 * @model
	 * @generated
	 */
	int getAssociationEndPositionAux();

	/**
	 * Sets the value of the '{@link OntoUML.Property#getAssociationEndPositionAux <em>Association End Position Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association End Position Aux</em>' attribute.
	 * @see #getAssociationEndPositionAux()
	 * @generated
	 */
	void setAssociationEndPositionAux(int value);

} // Property
