/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derivation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see OntoUML.OntoUMLPackage#getDerivation()
 * @model
 * @generated
 */
public interface Derivation extends DependencyRelationship {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/ocl/examples/OCL body='let mat:MaterialAssociation = self.source->any(true).oclAsType(Property).endType.oclAsType(MaterialAssociation), rel:Relator = self.target->any(true).oclAsType(Property).endType.oclAsType(Relator) in (let matext1:Type = mat.associationEnd->at(1).oclAsType(Property).endType.oclAsType(Type), matext2:Type = mat.associationEnd->at(2).oclAsType(Property).endType.oclAsType(Type) in (let med1:Set(Mediation) = Mediation.allInstances()->select(x | x.source->exists(y | y.oclAsType(Property).endType = rel) and x.target->exists(y | y.oclAsType(Property).endType = matext1)), med2:Set(Mediation) = Mediation.allInstances()->select(x | x.source->exists(y | y.oclAsType(Property).endType = rel) and x.target->exists(y | y.oclAsType(Property).endType = matext2)) in (let med1targetlower: Integer = med1.target->any(true).oclAsType(Property).lower, med2targetlower: Integer = med2.target->any(true).oclAsType(Property).lower in (if ((med1targetlower = -1) or (med2targetlower = -1)) then (-1) else (med1targetlower*med2targetlower) endif))))'"
	 * @generated
	 */
	int deriveLowerDerivation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/ocl/examples/OCL body='let mat:MaterialAssociation = self.source->any(true).oclAsType(Property).endType.oclAsType(MaterialAssociation), rel:Relator = self.target->any(true).oclAsType(Property).endType.oclAsType(Relator) in (let matext1:Type = mat.associationEnd->at(1).oclAsType(Property).endType.oclAsType(Type), matext2:Type = mat.associationEnd->at(2).oclAsType(Property).endType.oclAsType(Type) in (let med1:Set(Mediation) = Mediation.allInstances()->select(x | x.source->exists(y | y.oclAsType(Property).endType = rel) and x.target->exists(y | y.oclAsType(Property).endType = matext1)), med2:Set(Mediation) = Mediation.allInstances()->select(x | x.source->exists(y | y.oclAsType(Property).endType = rel) and x.target->exists(y | y.oclAsType(Property).endType = matext2)) in (let med1targetupper: Integer = med1.target->any(true).oclAsType(Property).upper, med2targetupper: Integer = med2.target->any(true).oclAsType(Property).upper in (if ((med1targetupper = -1) or (med2targetupper = -1)) then (-1) else (med1targetupper*med2targetupper) endif))))'"
	 * @generated
	 */
	int deriveUpperDerivation();
} // Derivation
