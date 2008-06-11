/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package UMLPlus.impl;

import UMLPlus.Classifier;
import UMLPlus.Generalization;
import UMLPlus.GeneralizationSet;
import UMLPlus.UMLPlusPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.ecore.OCL.Helper;

import org.eclipse.ocl.expressions.OCLExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link UMLPlus.impl.GeneralizationImpl#getSpecific <em>Specific</em>}</li>
 *   <li>{@link UMLPlus.impl.GeneralizationImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link UMLPlus.impl.GeneralizationImpl#getSemnome <em>Semnome</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationImpl extends DirectedRelationshipImpl implements Generalization {
	/**
	 * The cached value of the '{@link #getSemnome() <em>Semnome</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemnome()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralizationSet> semnome;

	/**
	 * The parsed OCL expression for the derivation of '{@link #getSpecific <em>Specific</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecific
	 * @generated
	 */
	private static OCLExpression<EClassifier> specificDeriveOCL;
	
	/**
	 * The parsed OCL expression for the derivation of '{@link #getGeneral <em>General</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral
	 * @generated
	 */
	private static OCLExpression<EClassifier> generalDeriveOCL;
	
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/ocl/examples/OCL"; //$NON-NLS-1$
	
	private static final OCL OCL_ENV = OCL.newInstance();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPlusPackage.Literals.GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getSpecific() {
		if (specificDeriveOCL == null) { 
			EStructuralFeature eFeature = (UMLPlusPackage.Literals.GENERALIZATION__SPECIFIC);
			
			Helper helper = OCL_ENV.createOCLHelper();
			helper.setAttributeContext(UMLPlusPackage.Literals.GENERALIZATION, eFeature);
			
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive"); //$NON-NLS-1$
			
			try {
				specificDeriveOCL = helper.createQuery(derive);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(specificDeriveOCL);
	
		return (Classifier) query.evaluate(this);
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecific(Classifier newSpecific) {
		// TODO: implement this method to set the 'Specific' container reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getGeneral() {
		Classifier general = basicGetGeneral();
		return general != null && general.eIsProxy() ? (Classifier)eResolveProxy((InternalEObject)general) : general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetGeneral() {
		if (generalDeriveOCL == null) { 
			EStructuralFeature eFeature = (UMLPlusPackage.Literals.GENERALIZATION__GENERAL);
			
			Helper helper = OCL_ENV.createOCLHelper();
			helper.setAttributeContext(UMLPlusPackage.Literals.GENERALIZATION, eFeature);
			
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive"); //$NON-NLS-1$
			
			try {
				generalDeriveOCL = helper.createQuery(derive);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(generalDeriveOCL);
	
		return (Classifier) query.evaluate(this);
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(Classifier newGeneral) {
		// TODO: implement this method to set the 'General' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralizationSet> getSemnome() {
		if (semnome == null) {
			semnome = new EObjectWithInverseResolvingEList.ManyInverse<GeneralizationSet>(GeneralizationSet.class, this, UMLPlusPackage.GENERALIZATION__SEMNOME, UMLPlusPackage.GENERALIZATION_SET__SEMNOME);
		}
		return semnome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPlusPackage.GENERALIZATION__SEMNOME:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemnome()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPlusPackage.GENERALIZATION__SEMNOME:
				return ((InternalEList<?>)getSemnome()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UMLPlusPackage.GENERALIZATION__SPECIFIC:
				return eInternalContainer().eInverseRemove(this, UMLPlusPackage.CLASSIFIER__GENERALIZATION, Classifier.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPlusPackage.GENERALIZATION__SPECIFIC:
				return getSpecific();
			case UMLPlusPackage.GENERALIZATION__GENERAL:
				if (resolve) return getGeneral();
				return basicGetGeneral();
			case UMLPlusPackage.GENERALIZATION__SEMNOME:
				return getSemnome();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPlusPackage.GENERALIZATION__SPECIFIC:
				setSpecific((Classifier)newValue);
				return;
			case UMLPlusPackage.GENERALIZATION__GENERAL:
				setGeneral((Classifier)newValue);
				return;
			case UMLPlusPackage.GENERALIZATION__SEMNOME:
				getSemnome().clear();
				getSemnome().addAll((Collection<? extends GeneralizationSet>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPlusPackage.GENERALIZATION__SPECIFIC:
				setSpecific((Classifier)null);
				return;
			case UMLPlusPackage.GENERALIZATION__GENERAL:
				setGeneral((Classifier)null);
				return;
			case UMLPlusPackage.GENERALIZATION__SEMNOME:
				getSemnome().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPlusPackage.GENERALIZATION__SPECIFIC:
				return getSpecific() != null;
			case UMLPlusPackage.GENERALIZATION__GENERAL:
				return basicGetGeneral() != null;
			case UMLPlusPackage.GENERALIZATION__SEMNOME:
				return semnome != null && !semnome.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GeneralizationImpl
