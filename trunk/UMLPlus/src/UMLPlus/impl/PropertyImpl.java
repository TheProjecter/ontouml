/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package UMLPlus.impl;

import UMLPlus.Association;
import UMLPlus.DirectedBinaryRelationship;
import UMLPlus.Property;
import UMLPlus.Type;
import UMLPlus.UMLPlusPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.ecore.OCL.Helper;

import org.eclipse.ocl.expressions.OCLExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link UMLPlus.impl.PropertyImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link UMLPlus.impl.PropertyImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link UMLPlus.impl.PropertyImpl#isIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link UMLPlus.impl.PropertyImpl#getEndType <em>End Type</em>}</li>
 *   <li>{@link UMLPlus.impl.PropertyImpl#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link UMLPlus.impl.PropertyImpl#getSource <em>Source</em>}</li>
 *   <li>{@link UMLPlus.impl.PropertyImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends StructuralFeatureImpl implements Property {
	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNavigable() <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NAVIGABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNavigable() <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected boolean isNavigable = IS_NAVIGABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndType() <em>End Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndType()
	 * @generated
	 * @ordered
	 */
	protected Type endType;

	/**
	 * The cached value of the '{@link #getAssociationEnd() <em>Association End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEnd()
	 * @generated
	 * @ordered
	 */
	protected Association associationEnd;

	/**
	 * The parsed OCL expression for the body of the '{@link #derivarLowerMaterialAssociation <em>Derivar Lower Material Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #derivarLowerMaterialAssociation
	 * @generated
	 */
	private static OCLExpression<EClassifier> derivarLowerMaterialAssociationBodyOCL;
	
	/**
	 * The parsed OCL expression for the body of the '{@link #derivarUpperMaterialAssociation <em>Derivar Upper Material Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #derivarUpperMaterialAssociation
	 * @generated
	 */
	private static OCLExpression<EClassifier> derivarUpperMaterialAssociationBodyOCL;
	
	/**
	 * The parsed OCL expression for the body of the '{@link #derivarLowerDerivation <em>Derivar Lower Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #derivarLowerDerivation
	 * @generated
	 */
	private static OCLExpression<EClassifier> derivarLowerDerivationBodyOCL;
	
	/**
	 * The parsed OCL expression for the body of the '{@link #derivarUpperDerivation <em>Derivar Upper Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #derivarUpperDerivation
	 * @generated
	 */
	private static OCLExpression<EClassifier> derivarUpperDerivationBodyOCL;
	
	/**
	 * The parsed OCL expression for the derivation of '{@link #getSource <em>Source</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource
	 * @generated
	 */
	private static OCLExpression<EClassifier> sourceDeriveOCL;
	
	/**
	 * The parsed OCL expression for the derivation of '{@link #getTarget <em>Target</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget
	 * @generated
	 */
	private static OCLExpression<EClassifier> targetDeriveOCL;
	
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/ocl/examples/OCL"; //$NON-NLS-1$
	
	private static final OCL OCL_ENV = OCL.newInstance();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPlusPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPlusPackage.PROPERTY__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(boolean newIsReadOnly) {
		boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPlusPackage.PROPERTY__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNavigable() {
		return isNavigable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNavigable(boolean newIsNavigable) {
		boolean oldIsNavigable = isNavigable;
		isNavigable = newIsNavigable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPlusPackage.PROPERTY__IS_NAVIGABLE, oldIsNavigable, isNavigable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getEndType() {
		if (endType != null && endType.eIsProxy()) {
			InternalEObject oldEndType = (InternalEObject)endType;
			endType = (Type)eResolveProxy(oldEndType);
			if (endType != oldEndType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPlusPackage.PROPERTY__END_TYPE, oldEndType, endType));
			}
		}
		return endType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetEndType() {
		return endType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndType(Type newEndType) {
		Type oldEndType = endType;
		endType = newEndType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPlusPackage.PROPERTY__END_TYPE, oldEndType, endType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getAssociationEnd() {
		if (associationEnd != null && associationEnd.eIsProxy()) {
			InternalEObject oldAssociationEnd = (InternalEObject)associationEnd;
			associationEnd = (Association)eResolveProxy(oldAssociationEnd);
			if (associationEnd != oldAssociationEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPlusPackage.PROPERTY__ASSOCIATION_END, oldAssociationEnd, associationEnd));
			}
		}
		return associationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetAssociationEnd() {
		return associationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociationEnd(Association newAssociationEnd, NotificationChain msgs) {
		Association oldAssociationEnd = associationEnd;
		associationEnd = newAssociationEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLPlusPackage.PROPERTY__ASSOCIATION_END, oldAssociationEnd, newAssociationEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationEnd(Association newAssociationEnd) {
		if (newAssociationEnd != associationEnd) {
			NotificationChain msgs = null;
			if (associationEnd != null)
				msgs = ((InternalEObject)associationEnd).eInverseRemove(this, UMLPlusPackage.ASSOCIATION__ASSOCIATION_END, Association.class, msgs);
			if (newAssociationEnd != null)
				msgs = ((InternalEObject)newAssociationEnd).eInverseAdd(this, UMLPlusPackage.ASSOCIATION__ASSOCIATION_END, Association.class, msgs);
			msgs = basicSetAssociationEnd(newAssociationEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPlusPackage.PROPERTY__ASSOCIATION_END, newAssociationEnd, newAssociationEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedBinaryRelationship getSource() {
		DirectedBinaryRelationship source = basicGetSource();
		return source != null && source.eIsProxy() ? (DirectedBinaryRelationship)eResolveProxy((InternalEObject)source) : source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedBinaryRelationship basicGetSource() {
		if (sourceDeriveOCL == null) { 
			EStructuralFeature eFeature = (UMLPlusPackage.Literals.PROPERTY__SOURCE);
			
			Helper helper = OCL_ENV.createOCLHelper();
			helper.setAttributeContext(UMLPlusPackage.Literals.PROPERTY, eFeature);
			
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive"); //$NON-NLS-1$
			
			try {
				sourceDeriveOCL = helper.createQuery(derive);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(sourceDeriveOCL);
	
		return (DirectedBinaryRelationship) query.evaluate(this);
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(DirectedBinaryRelationship newSource) {
		// TODO: implement this method to set the 'Source' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedBinaryRelationship getTarget() {
		DirectedBinaryRelationship target = basicGetTarget();
		return target != null && target.eIsProxy() ? (DirectedBinaryRelationship)eResolveProxy((InternalEObject)target) : target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedBinaryRelationship basicGetTarget() {
		if (targetDeriveOCL == null) { 
			EStructuralFeature eFeature = (UMLPlusPackage.Literals.PROPERTY__TARGET);
			
			Helper helper = OCL_ENV.createOCLHelper();
			helper.setAttributeContext(UMLPlusPackage.Literals.PROPERTY, eFeature);
			
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive"); //$NON-NLS-1$
			
			try {
				targetDeriveOCL = helper.createQuery(derive);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(targetDeriveOCL);
	
		return (DirectedBinaryRelationship) query.evaluate(this);
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(DirectedBinaryRelationship newTarget) {
		// TODO: implement this method to set the 'Target' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int derivarLowerMaterialAssociation() {
		if (derivarLowerMaterialAssociationBodyOCL == null) {
			EOperation eOperation = UMLPlusPackage.Literals.PROPERTY.getEOperations().get(0);
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setOperationContext(UMLPlusPackage.Literals.PROPERTY, eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = ocl.getDetails().get("body"); //$NON-NLS-1$
			
			try {
				derivarLowerMaterialAssociationBodyOCL = helper.createQuery(body);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(derivarLowerMaterialAssociationBodyOCL);
	
		return ((Integer) query.evaluate(this)).intValue();
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int derivarUpperMaterialAssociation() {
		if (derivarUpperMaterialAssociationBodyOCL == null) {
			EOperation eOperation = UMLPlusPackage.Literals.PROPERTY.getEOperations().get(1);
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setOperationContext(UMLPlusPackage.Literals.PROPERTY, eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = ocl.getDetails().get("body"); //$NON-NLS-1$
			
			try {
				derivarUpperMaterialAssociationBodyOCL = helper.createQuery(body);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(derivarUpperMaterialAssociationBodyOCL);
	
		return ((Integer) query.evaluate(this)).intValue();
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int derivarLowerDerivation() {
		if (derivarLowerDerivationBodyOCL == null) {
			EOperation eOperation = UMLPlusPackage.Literals.PROPERTY.getEOperations().get(2);
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setOperationContext(UMLPlusPackage.Literals.PROPERTY, eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = ocl.getDetails().get("body"); //$NON-NLS-1$
			
			try {
				derivarLowerDerivationBodyOCL = helper.createQuery(body);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(derivarLowerDerivationBodyOCL);
	
		return ((Integer) query.evaluate(this)).intValue();
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int derivarUpperDerivation() {
		if (derivarUpperDerivationBodyOCL == null) {
			EOperation eOperation = UMLPlusPackage.Literals.PROPERTY.getEOperations().get(3);
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setOperationContext(UMLPlusPackage.Literals.PROPERTY, eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = ocl.getDetails().get("body"); //$NON-NLS-1$
			
			try {
				derivarUpperDerivationBodyOCL = helper.createQuery(body);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(derivarUpperDerivationBodyOCL);
	
		return ((Integer) query.evaluate(this)).intValue();
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPlusPackage.PROPERTY__ASSOCIATION_END:
				if (associationEnd != null)
					msgs = ((InternalEObject)associationEnd).eInverseRemove(this, UMLPlusPackage.ASSOCIATION__ASSOCIATION_END, Association.class, msgs);
				return basicSetAssociationEnd((Association)otherEnd, msgs);
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
			case UMLPlusPackage.PROPERTY__ASSOCIATION_END:
				return basicSetAssociationEnd(null, msgs);
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
			case UMLPlusPackage.PROPERTY__IS_DERIVED:
				return isIsDerived() ? Boolean.TRUE : Boolean.FALSE;
			case UMLPlusPackage.PROPERTY__IS_READ_ONLY:
				return isIsReadOnly() ? Boolean.TRUE : Boolean.FALSE;
			case UMLPlusPackage.PROPERTY__IS_NAVIGABLE:
				return isIsNavigable() ? Boolean.TRUE : Boolean.FALSE;
			case UMLPlusPackage.PROPERTY__END_TYPE:
				if (resolve) return getEndType();
				return basicGetEndType();
			case UMLPlusPackage.PROPERTY__ASSOCIATION_END:
				if (resolve) return getAssociationEnd();
				return basicGetAssociationEnd();
			case UMLPlusPackage.PROPERTY__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case UMLPlusPackage.PROPERTY__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPlusPackage.PROPERTY__IS_DERIVED:
				setIsDerived(((Boolean)newValue).booleanValue());
				return;
			case UMLPlusPackage.PROPERTY__IS_READ_ONLY:
				setIsReadOnly(((Boolean)newValue).booleanValue());
				return;
			case UMLPlusPackage.PROPERTY__IS_NAVIGABLE:
				setIsNavigable(((Boolean)newValue).booleanValue());
				return;
			case UMLPlusPackage.PROPERTY__END_TYPE:
				setEndType((Type)newValue);
				return;
			case UMLPlusPackage.PROPERTY__ASSOCIATION_END:
				setAssociationEnd((Association)newValue);
				return;
			case UMLPlusPackage.PROPERTY__SOURCE:
				setSource((DirectedBinaryRelationship)newValue);
				return;
			case UMLPlusPackage.PROPERTY__TARGET:
				setTarget((DirectedBinaryRelationship)newValue);
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
			case UMLPlusPackage.PROPERTY__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case UMLPlusPackage.PROPERTY__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case UMLPlusPackage.PROPERTY__IS_NAVIGABLE:
				setIsNavigable(IS_NAVIGABLE_EDEFAULT);
				return;
			case UMLPlusPackage.PROPERTY__END_TYPE:
				setEndType((Type)null);
				return;
			case UMLPlusPackage.PROPERTY__ASSOCIATION_END:
				setAssociationEnd((Association)null);
				return;
			case UMLPlusPackage.PROPERTY__SOURCE:
				setSource((DirectedBinaryRelationship)null);
				return;
			case UMLPlusPackage.PROPERTY__TARGET:
				setTarget((DirectedBinaryRelationship)null);
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
			case UMLPlusPackage.PROPERTY__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case UMLPlusPackage.PROPERTY__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case UMLPlusPackage.PROPERTY__IS_NAVIGABLE:
				return isNavigable != IS_NAVIGABLE_EDEFAULT;
			case UMLPlusPackage.PROPERTY__END_TYPE:
				return endType != null;
			case UMLPlusPackage.PROPERTY__ASSOCIATION_END:
				return associationEnd != null;
			case UMLPlusPackage.PROPERTY__SOURCE:
				return basicGetSource() != null;
			case UMLPlusPackage.PROPERTY__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (isDerived: "); //$NON-NLS-1$
		result.append(isDerived);
		result.append(", isReadOnly: "); //$NON-NLS-1$
		result.append(isReadOnly);
		result.append(", isNavigable: "); //$NON-NLS-1$
		result.append(isNavigable);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
