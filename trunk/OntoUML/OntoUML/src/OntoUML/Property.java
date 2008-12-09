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
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/ocl/examples/OCL body='let A:Set(Mediation) = \r\nMediation.allInstances()->select(x | \r\n\t\tx.target->exists(y | \r\n\t\t\tif y.oclIsKindOf(Property) \r\n\t\t\tthen \r\n\t\t\t\t(y.oclAsType(Property).endType = self.endType) \r\n\t\t\telse \r\n\t\t\t\tfalse \r\n\t\t\tendif)\r\n), \r\n\r\nB:Set(MaterialAssociation) = \r\n\tMaterialAssociation.allInstances()->select(x | \r\n\tx.associationEnd->exists(y | \r\n\t\ty = self)\r\n\t) \r\n\r\nin let C:Set(Mediation) = \r\n\tMediation.allInstances()->select(x | \r\n\t\tx.target->exists(y | \r\n\t\t\tif y.oclIsKindOf(Property) \r\n\t\t\tthen \r\n\t\t\t\t(y.oclAsType(Property).endType = B->any(true).associationEnd->select(z | \r\n\t\t\t\t\tz <> self)->any(true).endType\r\n\t\t\t\t) \r\n\t\t\telse \r\n\t\t\t\tfalse \r\n\t\tendif)) \r\n\r\nin let D:Set(Mediation) = \r\n\tA->select(x | \r\n\t\tC->source.oclAsType(Property).endType->includesAll(\r\n\t\t\tx.source.oclAsType(Property).endType)\r\n\t\t), \r\n\r\n\r\nE:Set(Mediation) = \r\n\tC->select(x | \r\n\t\tA->source.oclAsType(Property).endType->includesAll(\r\n\t\t\tx.source.oclAsType(Property).endType)\r\n\t) \r\n\r\nin let lower:Integer = \r\nif ( D->isEmpty() or E->isEmpty()) then\r\n 0\r\nelse \r\n\tD->collect(x | \r\n\t\tx.target->collect(y | \r\n\t\t\tif \r\n\t\t\t\ty.oclIsKindOf(Property) \r\n\t\t\tthen \r\n\t\t\t\ty.oclAsType(Property).lower \r\n\t\t\telse \r\n\t\t\t\t0 \r\n\t\t\tendif)\r\n\t\t)->any(true)*E->collect(z | \r\n\t\tz.source->collect(w | \r\n\t\t\tif w.oclIsKindOf(Property) \r\n\t\t\tthen \r\n\t\t\t\tw.oclAsType(Property).lower \r\n\t\t\telse \r\n\t\t\t\t0 \r\n\t\t\tendif)\r\n\t\t)->any(true)\r\nendif,\r\n\t\t\r\n\t\t\r\nupper:Integer =  \r\nif (D->isEmpty() or E->isEmpty()) \r\nthen 0\r\nelse \r\n\tD->collect(x | x.target->collect(\r\n\t\ty | \r\n\t\tif y.oclIsKindOf(Property) \r\n\t\tthen y.oclAsType(Property).upper \r\n\t\telse 0 \r\n\t\tendif)\r\n\t)->any(true)*E->collect(z | \r\n\t\tz.source->collect(w | \r\n\t\tif w.oclIsKindOf(Property) \r\n\t\tthen w.oclAsType(Property).upper \r\n\t\telse 0 \r\n\t\tendif))->any(true) \r\nendif in lower'"
	 * @generated
	 */
	int derivarLowerMaterialAssociation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/ocl/examples/OCL body='let A:Set(Mediation) = \r\nMediation.allInstances()->select(x | \r\n\t\tx.target->exists(y | \r\n\t\t\tif y.oclIsKindOf(Property) \r\n\t\t\tthen \r\n\t\t\t\t(y.oclAsType(Property).endType = self.endType) \r\n\t\t\telse \r\n\t\t\t\tfalse \r\n\t\t\tendif)\r\n), \r\n\r\nB:Set(MaterialAssociation) = \r\n\tMaterialAssociation.allInstances()->select(x | \r\n\tx.associationEnd->exists(y | \r\n\t\ty = self)\r\n\t) \r\n\r\nin let C:Set(Mediation) = \r\n\tMediation.allInstances()->select(x | \r\n\t\tx.target->exists(y | \r\n\t\t\tif y.oclIsKindOf(Property) \r\n\t\t\tthen \r\n\t\t\t\t(y.oclAsType(Property).endType = B->any(true).associationEnd->select(z | \r\n\t\t\t\t\tz <> self)->any(true).endType\r\n\t\t\t\t) \r\n\t\t\telse \r\n\t\t\t\tfalse \r\n\t\tendif)) \r\n\r\nin let D:Set(Mediation) = \r\n\tA->select(x | \r\n\t\tC->source.oclAsType(Property).endType->includesAll(\r\n\t\t\tx.source.oclAsType(Property).endType)\r\n\t\t), \r\n\r\n\r\nE:Set(Mediation) = \r\n\tC->select(x | \r\n\t\tA->source.oclAsType(Property).endType->includesAll(\r\n\t\t\tx.source.oclAsType(Property).endType)\r\n\t) \r\n\r\nin let lower:Integer = \r\nif ( D->isEmpty() or E->isEmpty()) then\r\n 0\r\nelse \r\n\tD->collect(x | \r\n\t\tx.target->collect(y | \r\n\t\t\tif \r\n\t\t\t\ty.oclIsKindOf(Property) \r\n\t\t\tthen \r\n\t\t\t\ty.oclAsType(Property).lower \r\n\t\t\telse \r\n\t\t\t\t0 \r\n\t\t\tendif)\r\n\t\t)->any(true)*E->collect(z | \r\n\t\tz.source->collect(w | \r\n\t\t\tif w.oclIsKindOf(Property) \r\n\t\t\tthen \r\n\t\t\t\tw.oclAsType(Property).lower \r\n\t\t\telse \r\n\t\t\t\t0 \r\n\t\t\tendif)\r\n\t\t)->any(true)\r\nendif,\r\n\t\t\r\n\t\t\r\nupper:Integer =  \r\nif (D->isEmpty() or E->isEmpty()) \r\nthen 0\r\nelse \r\n\tD->collect(x | x.target->collect(\r\n\t\ty | \r\n\t\tif y.oclIsKindOf(Property) \r\n\t\tthen y.oclAsType(Property).upper \r\n\t\telse 0 \r\n\t\tendif)\r\n\t)->any(true)*E->collect(z | \r\n\t\tz.source->collect(w | \r\n\t\tif w.oclIsKindOf(Property) \r\n\t\tthen w.oclAsType(Property).upper \r\n\t\telse 0 \r\n\t\tendif))->any(true) \r\nendif in lower'"
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
