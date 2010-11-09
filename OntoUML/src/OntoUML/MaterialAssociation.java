/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material Association</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see OntoUML.OntoUMLPackage#getMaterialAssociation()
 * @model
 * @generated
 */
public interface MaterialAssociation extends Association {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/ocl/examples/OCL body='let der:Derivation = Derivation.allInstances()->select(x | x.source->any(true).oclAsType(Property).endType = self)->any(true), matext1:Type = self.associationEnd->at(1).oclAsType(Property).endType.oclAsType(Type), matext2:Type = self.associationEnd->at(2).oclAsType(Property).endType.oclAsType(Type) in (let rel:Relator = der.target->any(true).oclAsType(Property).endType.oclAsType(Relator) in (let med1:Set(Mediation) = Mediation.allInstances()->select(x | x.source->exists(y | y.oclAsType(Property).endType = rel) and x.target->exists(y | y.oclAsType(Property).endType = matext1)), med2:Set(Mediation) = Mediation.allInstances()->select(x | x.source->exists(y | y.oclAsType(Property).endType = rel) and x.target->exists(y | y.oclAsType(Property).endType = matext2)) in (let med1targetupper: Integer = med1.target->any(true).oclAsType(Property).upper, med2sourceupper: Integer = med2.source->any(true).oclAsType(Property).upper in (if ((med2sourceupper = -1) or (med1targetupper = -1)) then (-1) else (med2sourceupper*med1targetupper) endif))))'"
	 * @generated
	 */
	int deriveUpperMaterialAssociationExt1();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/ocl/examples/OCL body='let der:Derivation = Derivation.allInstances()->select(x | x.source->any(true).oclAsType(Property).endType = self)->any(true), matext1:Type = self.associationEnd->at(1).oclAsType(Property).endType.oclAsType(Type), matext2:Type = self.associationEnd->at(2).oclAsType(Property).endType.oclAsType(Type) in (let rel:Relator = der.target->any(true).oclAsType(Property).endType.oclAsType(Relator) in (let med1:Set(Mediation) = Mediation.allInstances()->select(x | x.source->exists(y | y.oclAsType(Property).endType = rel) and x.target->exists(y | y.oclAsType(Property).endType = matext1)), med2:Set(Mediation) = Mediation.allInstances()->select(x | x.source->exists(y | y.oclAsType(Property).endType = rel) and x.target->exists(y | y.oclAsType(Property).endType = matext2)) in (let med1sourceupper: Integer = med1.source->any(true).oclAsType(Property).upper, med2targetupper: Integer = med2.target->any(true).oclAsType(Property).upper in (if ((med1sourceupper = -1) or (med2targetupper = -1)) then (-1) else (med1sourceupper*med2targetupper) endif))))\n'"
	 * @generated
	 */
	int deriveUpperMaterialAssociationExt2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/ocl/examples/OCL body='not Derivation.allInstances()->select(x | x.source->any(true).oclAsType(Property).endType = self)->isEmpty()'"
	 * @generated
	 */
	boolean existsDerivationConnected();
} // MaterialAssociation
