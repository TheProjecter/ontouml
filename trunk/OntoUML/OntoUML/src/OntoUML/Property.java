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
 *   <li>{@link OntoUML.Property#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link OntoUML.Property#isIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link OntoUML.Property#getEndType <em>End Type</em>}</li>
 *   <li>{@link OntoUML.Property#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link OntoUML.Property#getSource <em>Source</em>}</li>
 *   <li>{@link OntoUML.Property#getTarget <em>Target</em>}</li>
 *   <li>{@link OntoUML.Property#getAux <em>Aux</em>}</li>
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
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(boolean)
	 * @see OntoUML.OntoUMLPackage#getProperty_IsReadOnly()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsReadOnly();

	/**
	 * Sets the value of the '{@link OntoUML.Property#isIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #isIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Navigable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Navigable</em>' attribute.
	 * @see #setIsNavigable(boolean)
	 * @see OntoUML.OntoUMLPackage#getProperty_IsNavigable()
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Aux</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux</em>' reference.
	 * @see #setAux(Property)
	 * @see OntoUML.OntoUMLPackage#getProperty_Aux()
	 * @model
	 * @generated
	 */
	Property getAux();

	/**
	 * Sets the value of the '{@link OntoUML.Property#getAux <em>Aux</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux</em>' reference.
	 * @see #getAux()
	 * @generated
	 */
	void setAux(Property value);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/ocl/examples/OCL body='let A:Set(Mediation) = Mediation.allInstances()->select(x | x.target->exists(y | if y.oclIsKindOf(Property) then (y.oclAsType(Property).endType = self.endType) else false endif)), B:Set(MaterialAssociation) = MaterialAssociation.allInstances()->select(x | x.associationEnd->exists(y | y = self)) in let C:Set(Mediation) = Mediation.allInstances()->select(x | x.target->exists(y | if y.oclIsKindOf(Property) then (y.oclAsType(Property).endType = B->any(true).associationEnd->select(z | z <> self)->any(true).endType) else false endif)) in let D:Set(Mediation) = A->select(x | C->source.oclAsType(Property).endType->includesAll(x.source.oclAsType(Property).endType)), E:Set(Mediation) = C->select(x | A->source.oclAsType(Property).endType->includesAll(x.source.oclAsType(Property).endType)) in let lower:Integer = D->collect(x | x.target->collect(y | if y.oclIsKindOf(Property) then y.oclAsType(Property).lower else 0 endif))->any(true)*E->collect(z | z.source->collect(w | if w.oclIsKindOf(Property) then w.oclAsType(Property).lower else 0 endif))->any(true), upper:Integer =  D->collect(x | x.target->collect(y | if y.oclIsKindOf(Property) then y.oclAsType(Property).upper else 0 endif))->any(true)*E->collect(z | z.source->collect(w | if w.oclIsKindOf(Property) then w.oclAsType(Property).upper else 0 endif))->any(true) in lower'"
	 * @generated
	 */
	int derivarLowerMaterialAssociation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/ocl/examples/OCL body='let A:Set(Mediation) = Mediation.allInstances()->select(x | x.target->exists(y | if y.oclIsKindOf(Property) then (y.oclAsType(Property).endType = self.endType) else false endif)), B:Set(MaterialAssociation) = MaterialAssociation.allInstances()->select(x | x.associationEnd->exists(y | y = self)) in let C:Set(Mediation) = Mediation.allInstances()->select(x | x.target->exists(y | if y.oclIsKindOf(Property) then (y.oclAsType(Property).endType = B->any(true).associationEnd->select(z | z <> self)->any(true).endType) else false endif)) in let D:Set(Mediation) = A->select(x | C->source.oclAsType(Property).endType->includesAll(x.source.oclAsType(Property).endType)), E:Set(Mediation) = C->select(x | A->source.oclAsType(Property).endType->includesAll(x.source.oclAsType(Property).endType)) in let lower:Integer = D->collect(x | x.target->collect(y | if y.oclIsKindOf(Property) then y.oclAsType(Property).lower else 0 endif))->any(true)*E->collect(z | z.source->collect(w | if w.oclIsKindOf(Property) then w.oclAsType(Property).lower else 0 endif))->any(true), upper:Integer =  D->collect(x | x.target->collect(y | if y.oclIsKindOf(Property) then y.oclAsType(Property).upper else 0 endif))->any(true)*E->collect(z | z.source->collect(w | if w.oclIsKindOf(Property) then w.oclAsType(Property).upper else 0 endif))->any(true) in upper'"
	 * @generated
	 */
	int derivarUpperMaterialAssociation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/ocl/examples/OCL body='let A:Set(Mediation) = Mediation.allInstances()->select(x | x.target->exists(y | if (y.oclIsKindOf(Property) and self.endType.oclIsKindOf(MaterialAssociation)) then self.endType.oclAsType(MaterialAssociation).associationEnd->exists(z | z.endType = y.oclAsType(Property).endType) else false endif)), B:Set(Derivation) = Derivation.allInstances()->select(x | x.source->exists(y | y = self)) in let C:Set(Mediation) = A->select(x | x.source->exists(y | if y.oclIsKindOf(Property) then (y.oclAsType(Property).endType = B->any(true).target->select(z | z.oclIsKindOf(Property))->any(true).oclAsType(Property).endType) else false endif)) in let lower:Integer = C->collect(x | x.target->collect(y | if y.oclIsKindOf(Property) then y.oclAsType(Property).lower else 0 endif))->iterate(z; a:Integer = 1 | a*z), upper:Integer = C->collect(x | x.target->collect(y | if y.oclIsKindOf(Property) then y.oclAsType(Property).upper else 0 endif))->iterate(z; a:Integer = 1 | a*z) in lower'"
	 * @generated
	 */
	int derivarLowerDerivation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/ocl/examples/OCL body='let A:Set(Mediation) = Mediation.allInstances()->select(x | x.target->exists(y | if (y.oclIsKindOf(Property) and self.endType.oclIsKindOf(MaterialAssociation)) then self.endType.oclAsType(MaterialAssociation).associationEnd->exists(z | z.endType = y.oclAsType(Property).endType) else false endif)), B:Set(Derivation) = Derivation.allInstances()->select(x | x.source->exists(y | y = self)) in let C:Set(Mediation) = A->select(x | x.source->exists(y | if y.oclIsKindOf(Property) then (y.oclAsType(Property).endType = B->any(true).target->select(z | z.oclIsKindOf(Property))->any(true).oclAsType(Property).endType) else false endif)) in let lower:Integer = C->collect(x | x.target->collect(y | if y.oclIsKindOf(Property) then y.oclAsType(Property).lower else 0 endif))->iterate(z; a:Integer = 1 | a*z), upper:Integer = C->collect(x | x.target->collect(y | if y.oclIsKindOf(Property) then y.oclAsType(Property).upper else 0 endif))->iterate(z; a:Integer = 1 | a*z) in upper'"
	 * @generated
	 */
	int derivarUpperDerivation();

} // Property
