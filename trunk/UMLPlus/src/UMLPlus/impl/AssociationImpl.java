/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package UMLPlus.impl;

import UMLPlus.Association;
import UMLPlus.Classifier;
import UMLPlus.Generalization;
import UMLPlus.NamedElement;
import UMLPlus.Property;
import UMLPlus.RelationalClassifier;
import UMLPlus.Type;
import UMLPlus.UMLPlusPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.ecore.OCL.Helper;

import org.eclipse.ocl.expressions.OCLExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link UMLPlus.impl.AssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link UMLPlus.impl.AssociationImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link UMLPlus.impl.AssociationImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link UMLPlus.impl.AssociationImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link UMLPlus.impl.AssociationImpl#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link UMLPlus.impl.AssociationImpl#getAssociationEndAux1 <em>Association End Aux1</em>}</li>
 *   <li>{@link UMLPlus.impl.AssociationImpl#getAssociationEndAux2 <em>Association End Aux2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends RelationshipImpl implements Association {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssociationEnd() <em>Association End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> associationEnd;

	/**
	 * The cached value of the '{@link #getAssociationEndAux1() <em>Association End Aux1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEndAux1()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> associationEndAux1;

	/**
	 * The cached value of the '{@link #getAssociationEndAux2() <em>Association End Aux2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEndAux2()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> associationEndAux2;

	/**
	 * The parsed OCL expression for the derivation of '{@link #getGeneral <em>General</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral
	 * @generated
	 */
	private static OCLExpression<EClassifier> generalDeriveOCL;
	
	/**
	 * The parsed OCL expression for the derivation of '{@link #getGeneralization <em>Generalization</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization
	 * @generated
	 */
	private static OCLExpression<EClassifier> generalizationDeriveOCL;
	
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/ocl/examples/OCL"; //$NON-NLS-1$
	
	private static final OCL OCL_ENV = OCL.newInstance();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPlusPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPlusPackage.ASSOCIATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPlusPackage.ASSOCIATION__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getGeneral() {
		EStructuralFeature eFeature = UMLPlusPackage.Literals.CLASSIFIER__GENERAL;
	
		if (generalDeriveOCL == null) { 
			Helper helper = OCL_ENV.createOCLHelper();
			helper.setAttributeContext(UMLPlusPackage.Literals.CLASSIFIER, eFeature);
			
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive"); //$NON-NLS-1$
			
			try {
				generalDeriveOCL = helper.createQuery(derive);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(generalDeriveOCL);
	
		@SuppressWarnings("unchecked")
		Collection<Classifier> result = (Collection<Classifier>) query.evaluate(this);
		return new EcoreEList.UnmodifiableEList<Classifier>(this, eFeature, result.size(), result.toArray());
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralization() {
		EStructuralFeature eFeature = UMLPlusPackage.Literals.CLASSIFIER__GENERALIZATION;
	
		if (generalizationDeriveOCL == null) { 
			Helper helper = OCL_ENV.createOCLHelper();
			helper.setAttributeContext(UMLPlusPackage.Literals.CLASSIFIER, eFeature);
			
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive"); //$NON-NLS-1$
			
			try {
				generalizationDeriveOCL = helper.createQuery(derive);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(generalizationDeriveOCL);
	
		@SuppressWarnings("unchecked")
		Collection<Generalization> result = (Collection<Generalization>) query.evaluate(this);
		return new EcoreEList.UnmodifiableEList<Generalization>(this, eFeature, result.size(), result.toArray());
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getAssociationEnd() {
		if (associationEnd == null) {
			associationEnd = new EObjectWithInverseResolvingEList<Property>(Property.class, this, UMLPlusPackage.ASSOCIATION__ASSOCIATION_END, UMLPlusPackage.PROPERTY__ASSOCIATION_END);
		}
		return associationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getAssociationEndAux1() {
		if (associationEndAux1 == null) {
			associationEndAux1 = new EObjectResolvingEList<Type>(Type.class, this, UMLPlusPackage.ASSOCIATION__ASSOCIATION_END_AUX1);
		}
		return associationEndAux1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getAssociationEndAux2() {
		if (associationEndAux2 == null) {
			associationEndAux2 = new EObjectResolvingEList<Type>(Type.class, this, UMLPlusPackage.ASSOCIATION__ASSOCIATION_END_AUX2);
		}
		return associationEndAux2;
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
			case UMLPlusPackage.ASSOCIATION__ASSOCIATION_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociationEnd()).basicAdd(otherEnd, msgs);
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
			case UMLPlusPackage.ASSOCIATION__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
			case UMLPlusPackage.ASSOCIATION__ASSOCIATION_END:
				return ((InternalEList<?>)getAssociationEnd()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPlusPackage.ASSOCIATION__NAME:
				return getName();
			case UMLPlusPackage.ASSOCIATION__IS_ABSTRACT:
				return isIsAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UMLPlusPackage.ASSOCIATION__GENERAL:
				return getGeneral();
			case UMLPlusPackage.ASSOCIATION__GENERALIZATION:
				return getGeneralization();
			case UMLPlusPackage.ASSOCIATION__ASSOCIATION_END:
				return getAssociationEnd();
			case UMLPlusPackage.ASSOCIATION__ASSOCIATION_END_AUX1:
				return getAssociationEndAux1();
			case UMLPlusPackage.ASSOCIATION__ASSOCIATION_END_AUX2:
				return getAssociationEndAux2();
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
			case UMLPlusPackage.ASSOCIATION__NAME:
				setName((String)newValue);
				return;
			case UMLPlusPackage.ASSOCIATION__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UMLPlusPackage.ASSOCIATION__GENERAL:
				getGeneral().clear();
				getGeneral().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UMLPlusPackage.ASSOCIATION__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case UMLPlusPackage.ASSOCIATION__ASSOCIATION_END:
				getAssociationEnd().clear();
				getAssociationEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case UMLPlusPackage.ASSOCIATION__ASSOCIATION_END_AUX1:
				getAssociationEndAux1().clear();
				getAssociationEndAux1().addAll((Collection<? extends Type>)newValue);
				return;
			case UMLPlusPackage.ASSOCIATION__ASSOCIATION_END_AUX2:
				getAssociationEndAux2().clear();
				getAssociationEndAux2().addAll((Collection<? extends Type>)newValue);
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
			case UMLPlusPackage.ASSOCIATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UMLPlusPackage.ASSOCIATION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPlusPackage.ASSOCIATION__GENERAL:
				getGeneral().clear();
				return;
			case UMLPlusPackage.ASSOCIATION__GENERALIZATION:
				getGeneralization().clear();
				return;
			case UMLPlusPackage.ASSOCIATION__ASSOCIATION_END:
				getAssociationEnd().clear();
				return;
			case UMLPlusPackage.ASSOCIATION__ASSOCIATION_END_AUX1:
				getAssociationEndAux1().clear();
				return;
			case UMLPlusPackage.ASSOCIATION__ASSOCIATION_END_AUX2:
				getAssociationEndAux2().clear();
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
			case UMLPlusPackage.ASSOCIATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UMLPlusPackage.ASSOCIATION__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case UMLPlusPackage.ASSOCIATION__GENERAL:
				return !getGeneral().isEmpty();
			case UMLPlusPackage.ASSOCIATION__GENERALIZATION:
				return !getGeneralization().isEmpty();
			case UMLPlusPackage.ASSOCIATION__ASSOCIATION_END:
				return associationEnd != null && !associationEnd.isEmpty();
			case UMLPlusPackage.ASSOCIATION__ASSOCIATION_END_AUX1:
				return associationEndAux1 != null && !associationEndAux1.isEmpty();
			case UMLPlusPackage.ASSOCIATION__ASSOCIATION_END_AUX2:
				return associationEndAux2 != null && !associationEndAux2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case UMLPlusPackage.ASSOCIATION__NAME: return UMLPlusPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (derivedFeatureID) {
				case UMLPlusPackage.ASSOCIATION__IS_ABSTRACT: return UMLPlusPackage.CLASSIFIER__IS_ABSTRACT;
				case UMLPlusPackage.ASSOCIATION__GENERAL: return UMLPlusPackage.CLASSIFIER__GENERAL;
				case UMLPlusPackage.ASSOCIATION__GENERALIZATION: return UMLPlusPackage.CLASSIFIER__GENERALIZATION;
				default: return -1;
			}
		}
		if (baseClass == RelationalClassifier.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case UMLPlusPackage.NAMED_ELEMENT__NAME: return UMLPlusPackage.ASSOCIATION__NAME;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (baseFeatureID) {
				case UMLPlusPackage.CLASSIFIER__IS_ABSTRACT: return UMLPlusPackage.ASSOCIATION__IS_ABSTRACT;
				case UMLPlusPackage.CLASSIFIER__GENERAL: return UMLPlusPackage.ASSOCIATION__GENERAL;
				case UMLPlusPackage.CLASSIFIER__GENERALIZATION: return UMLPlusPackage.ASSOCIATION__GENERALIZATION;
				default: return -1;
			}
		}
		if (baseClass == RelationalClassifier.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", isAbstract: "); //$NON-NLS-1$
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
