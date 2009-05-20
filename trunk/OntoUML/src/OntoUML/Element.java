/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OntoUML.Element#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link OntoUML.Element#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see OntoUML.OntoUMLPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link OntoUML.Property}.
	 * It is bidirectional and its opposite is '{@link OntoUML.Property#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see #isSetAttribute()
	 * @see #unsetAttribute()
	 * @see OntoUML.OntoUMLPackage#getElement_Attribute()
	 * @see OntoUML.Property#getOwner
	 * @model opposite="owner" containment="true" unsettable="true"
	 * @generated
	 */
	EList<Property> getAttribute();

	/**
	 * Unsets the value of the '{@link OntoUML.Element#getAttribute <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttribute()
	 * @see #getAttribute()
	 * @generated
	 */
	void unsetAttribute();

	/**
	 * Returns whether the value of the '{@link OntoUML.Element#getAttribute <em>Attribute</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attribute</em>' containment reference list is set.
	 * @see #unsetAttribute()
	 * @see #getAttribute()
	 * @generated
	 */
	boolean isSetAttribute();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link OntoUML.Container#getInstanciarElement <em>Instanciar Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Container)
	 * @see OntoUML.OntoUMLPackage#getElement_Container()
	 * @see OntoUML.Container#getInstanciarElement
	 * @model opposite="InstanciarElement" transient="false"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link OntoUML.Element#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/ocl/examples/OCL body='if self.oclIsKindOf(Classifier) then (if self.oclAsType(Classifier).generalization->forAll(x | x.oclIsUndefined()) then Set{} else Set{self.oclAsType(Classifier).generalization->collect(x | x.general), self.oclAsType(Classifier).generalization->collect(x | if x.general.oclIsKindOf(Classifier) then x.general.allSuperTypes() else Set{} endif)}->flatten() endif) else Set{} endif'"
	 * @generated
	 */
	EList<Element> allSuperTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/ocl/examples/OCL body='if self.oclIsKindOf(Relationship) then if self.oclAsType(Relationship).relatedElement->forAll(y | y.oclIsUndefined()) then false else if self.oclAsType(Relationship).relatedElement->exists(z | if z.oclIsKindOf(Property) then (z.oclAsType(Property).endType = x) else false endif) then true else self.oclAsType(Relationship).relatedElement->exists(w | if w.oclIsKindOf(Property) then w.oclAsType(Property).endType.isConected(x) else false endif) endif endif else false endif'"
	 * @generated
	 */
	boolean isConected(Element x);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/ocl/examples/OCL body='self.allSuperTypes()->includes(x)'"
	 * @generated
	 */
	boolean subInstanceType(Element x);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/ocl/examples/OCL body='if self.oclIsKindOf(Kind) then true else self.allSuperTypes()->exists(x | x.oclIsKindOf(Kind)) endif'"
	 * @generated
	 */
	boolean subMetaTypeKind();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/ocl/examples/OCL body='if self.oclIsKindOf(Collective) then true else self.allSuperTypes()->exists(x | x.oclIsKindOf(Collective)) endif'"
	 * @generated
	 */
	boolean subMetaTypeCollective();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/ocl/examples/OCL body='if self.oclIsKindOf(Quantity) then true else self.allSuperTypes()->exists(x | x.oclIsKindOf(Quantity)) endif'"
	 * @generated
	 */
	boolean subMetaTypeQuantity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/ocl/examples/OCL body='if self.oclIsKindOf(SortalClass) then self.subMetaTypeKind() else if self.oclIsKindOf(MixinClass) then Element.allInstances()->forAll(x | x.subInstanceType(self) implies not (x.subMetaTypeQuantity() or x.subMetaTypeCollective())) else false endif endif'"
	 * @generated
	 */
	boolean hasFunctionalComplexesInstances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/ocl/examples/OCL body='if self.oclIsKindOf(SortalClass) then self.subMetaTypeCollective() else if self.oclIsKindOf(MixinClass) then Element.allInstances()->forAll(x | x.subInstanceType(self) implies not (x.subMetaTypeKind() or x.subMetaTypeQuantity())) else false endif endif'"
	 * @generated
	 */
	boolean hasCollectivesInstances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/ocl/examples/OCL body='if self.oclIsKindOf(SortalClass) then self.subMetaTypeQuantity() else if self.oclIsKindOf(MixinClass) then Element.allInstances()->forAll(x | x.subInstanceType(self) implies not (x.subMetaTypeKind() or x.subMetaTypeCollective())) else false endif endif'"
	 * @generated
	 */
	boolean hasQuantitiesInstances();

} // Element
