/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.impl;

import OntoUML.MaterialAssociation;
import OntoUML.OntoUMLPackage;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MaterialAssociationImpl extends AssociationImpl implements MaterialAssociation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntoUMLPackage.Literals.MATERIAL_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int deriveUpperMaterialAssociationExt1() {
		if (deriveUpperMaterialAssociationExt1BodyOCL == null) {
			EOperation eOperation = OntoUMLPackage.Literals.MATERIAL_ASSOCIATION.getEOperations().get(0);
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setOperationContext(OntoUMLPackage.Literals.MATERIAL_ASSOCIATION, eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = ocl.getDetails().get("body");
			
			try {
				deriveUpperMaterialAssociationExt1BodyOCL = helper.createQuery(body);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(deriveUpperMaterialAssociationExt1BodyOCL);
	
		return ((Integer) query.evaluate(this)).intValue();
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int deriveUpperMaterialAssociationExt2() {
		if (deriveUpperMaterialAssociationExt2BodyOCL == null) {
			EOperation eOperation = OntoUMLPackage.Literals.MATERIAL_ASSOCIATION.getEOperations().get(1);
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setOperationContext(OntoUMLPackage.Literals.MATERIAL_ASSOCIATION, eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = ocl.getDetails().get("body");
			
			try {
				deriveUpperMaterialAssociationExt2BodyOCL = helper.createQuery(body);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(deriveUpperMaterialAssociationExt2BodyOCL);
	
		return ((Integer) query.evaluate(this)).intValue();
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean existsDerivationConnected() {
		if (existsDerivationConnectedBodyOCL == null) {
			EOperation eOperation = OntoUMLPackage.Literals.MATERIAL_ASSOCIATION.getEOperations().get(2);
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setOperationContext(OntoUMLPackage.Literals.MATERIAL_ASSOCIATION, eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = ocl.getDetails().get("body");
			
			try {
				existsDerivationConnectedBodyOCL = helper.createQuery(body);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(existsDerivationConnectedBodyOCL);
	
		return ((Boolean) query.evaluate(this)).booleanValue();
	
	}

	/**
	 * The parsed OCL expression for the body of the '{@link #deriveUpperMaterialAssociationExt1 <em>Derive Upper Material Association Ext1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deriveUpperMaterialAssociationExt1
	 * @generated
	 */
	private static OCLExpression<EClassifier> deriveUpperMaterialAssociationExt1BodyOCL;
	/**
	 * The parsed OCL expression for the body of the '{@link #deriveUpperMaterialAssociationExt2 <em>Derive Upper Material Association Ext2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deriveUpperMaterialAssociationExt2
	 * @generated
	 */
	private static OCLExpression<EClassifier> deriveUpperMaterialAssociationExt2BodyOCL;
	/**
	 * The parsed OCL expression for the body of the '{@link #existsDerivationConnected <em>Exists Derivation Connected</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #existsDerivationConnected
	 * @generated
	 */
	private static OCLExpression<EClassifier> existsDerivationConnectedBodyOCL;
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/ocl/examples/OCL";
	private static final OCL OCL_ENV = OCL.newInstance();

} //MaterialAssociationImpl
