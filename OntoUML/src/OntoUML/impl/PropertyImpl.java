/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.impl;

import OntoUML.Association;
import OntoUML.DirectedBinaryRelationship;
import OntoUML.Element;
import OntoUML.OntoUMLPackage;
import OntoUML.Property;
import OntoUML.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
 *   <li>{@link OntoUML.impl.PropertyImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link OntoUML.impl.PropertyImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link OntoUML.impl.PropertyImpl#isIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link OntoUML.impl.PropertyImpl#getEndType <em>End Type</em>}</li>
 *   <li>{@link OntoUML.impl.PropertyImpl#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link OntoUML.impl.PropertyImpl#getSource <em>Source</em>}</li>
 *   <li>{@link OntoUML.impl.PropertyImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link OntoUML.impl.PropertyImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link OntoUML.impl.PropertyImpl#getAux <em>Aux</em>}</li>
 *   <li>{@link OntoUML.impl.PropertyImpl#getAssociationEndPositionAux <em>Association End Position Aux</em>}</li>
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
	 * The cached value of the '{@link #getAssociationEnd() <em>Association End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEnd()
	 * @generated
	 * @ordered
	 */
	protected Association associationEnd;

	/**
	 * The cached value of the '{@link #getAux() <em>Aux</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux()
	 * @generated
	 * @ordered
	 */
	protected Property aux;

	/**
	 * The default value of the '{@link #getAssociationEndPositionAux() <em>Association End Position Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEndPositionAux()
	 * @generated
	 * @ordered
	 */
	protected static final int ASSOCIATION_END_POSITION_AUX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAssociationEndPositionAux() <em>Association End Position Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEndPositionAux()
	 * @generated
	 * @ordered
	 */
	protected int associationEndPositionAux = ASSOCIATION_END_POSITION_AUX_EDEFAULT;

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
		return OntoUMLPackage.Literals.PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.PROPERTY__IS_DERIVED, oldIsDerived, isDerived));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.PROPERTY__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.PROPERTY__IS_NAVIGABLE, oldIsNavigable, isNavigable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getEndType() {
		Type endType = basicGetEndType();
		return endType != null && endType.eIsProxy() ? (Type)eResolveProxy((InternalEObject)endType) : endType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetEndType() {
		if (endTypeDeriveOCL == null) { 
			EStructuralFeature eFeature = (OntoUMLPackage.Literals.PROPERTY__END_TYPE);
			
			Helper helper = OCL_ENV.createOCLHelper();
			helper.setAttributeContext(OntoUMLPackage.Literals.PROPERTY, eFeature);
			
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				endTypeDeriveOCL = helper.createQuery(derive);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(endTypeDeriveOCL);
	
		return (Type) query.evaluate(this);
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndType(Type newEndType) {
		// TODO: implement this method to set the 'End Type' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntoUMLPackage.PROPERTY__ASSOCIATION_END, oldAssociationEnd, associationEnd));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntoUMLPackage.PROPERTY__ASSOCIATION_END, oldAssociationEnd, newAssociationEnd);
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
				msgs = ((InternalEObject)associationEnd).eInverseRemove(this, OntoUMLPackage.ASSOCIATION__ASSOCIATION_END, Association.class, msgs);
			if (newAssociationEnd != null)
				msgs = ((InternalEObject)newAssociationEnd).eInverseAdd(this, OntoUMLPackage.ASSOCIATION__ASSOCIATION_END, Association.class, msgs);
			msgs = basicSetAssociationEnd(newAssociationEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.PROPERTY__ASSOCIATION_END, newAssociationEnd, newAssociationEnd));
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
			EStructuralFeature eFeature = (OntoUMLPackage.Literals.PROPERTY__SOURCE);
			
			Helper helper = OCL_ENV.createOCLHelper();
			helper.setAttributeContext(OntoUMLPackage.Literals.PROPERTY, eFeature);
			
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
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
			EStructuralFeature eFeature = (OntoUMLPackage.Literals.PROPERTY__TARGET);
			
			Helper helper = OCL_ENV.createOCLHelper();
			helper.setAttributeContext(OntoUMLPackage.Literals.PROPERTY, eFeature);
			
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
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
	public Element getOwner() {
		if (eContainerFeatureID != OntoUMLPackage.PROPERTY__OWNER) return null;
		return (Element)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Element newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, OntoUMLPackage.PROPERTY__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Element newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID != OntoUMLPackage.PROPERTY__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, OntoUMLPackage.ELEMENT__ATTRIBUTE, Element.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.PROPERTY__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getAux() {
		if (aux != null && aux.eIsProxy()) {
			InternalEObject oldAux = (InternalEObject)aux;
			aux = (Property)eResolveProxy(oldAux);
			if (aux != oldAux) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntoUMLPackage.PROPERTY__AUX, oldAux, aux));
			}
		}
		return aux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetAux() {
		return aux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAux(Property newAux) {
		Property oldAux = aux;
		aux = newAux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.PROPERTY__AUX, oldAux, aux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAssociationEndPositionAux() {
		return associationEndPositionAux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationEndPositionAux(int newAssociationEndPositionAux) {
		int oldAssociationEndPositionAux = associationEndPositionAux;
		associationEndPositionAux = newAssociationEndPositionAux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.PROPERTY__ASSOCIATION_END_POSITION_AUX, oldAssociationEndPositionAux, associationEndPositionAux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int derivarLowerMaterialAssociation() {
		if (derivarLowerMaterialAssociationBodyOCL == null) {
			EOperation eOperation = OntoUMLPackage.Literals.PROPERTY.getEOperations().get(0);
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setOperationContext(OntoUMLPackage.Literals.PROPERTY, eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = ocl.getDetails().get("body");
			
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
			EOperation eOperation = OntoUMLPackage.Literals.PROPERTY.getEOperations().get(1);
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setOperationContext(OntoUMLPackage.Literals.PROPERTY, eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = ocl.getDetails().get("body");
			
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
			EOperation eOperation = OntoUMLPackage.Literals.PROPERTY.getEOperations().get(2);
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setOperationContext(OntoUMLPackage.Literals.PROPERTY, eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = ocl.getDetails().get("body");
			
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
			EOperation eOperation = OntoUMLPackage.Literals.PROPERTY.getEOperations().get(3);
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setOperationContext(OntoUMLPackage.Literals.PROPERTY, eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = ocl.getDetails().get("body");
			
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
			case OntoUMLPackage.PROPERTY__ASSOCIATION_END:
				if (associationEnd != null)
					msgs = ((InternalEObject)associationEnd).eInverseRemove(this, OntoUMLPackage.ASSOCIATION__ASSOCIATION_END, Association.class, msgs);
				return basicSetAssociationEnd((Association)otherEnd, msgs);
			case OntoUMLPackage.PROPERTY__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((Element)otherEnd, msgs);
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
			case OntoUMLPackage.PROPERTY__ASSOCIATION_END:
				return basicSetAssociationEnd(null, msgs);
			case OntoUMLPackage.PROPERTY__OWNER:
				return basicSetOwner(null, msgs);
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
			case OntoUMLPackage.PROPERTY__OWNER:
				return eInternalContainer().eInverseRemove(this, OntoUMLPackage.ELEMENT__ATTRIBUTE, Element.class, msgs);
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
			case OntoUMLPackage.PROPERTY__IS_DERIVED:
				return isIsDerived() ? Boolean.TRUE : Boolean.FALSE;
			case OntoUMLPackage.PROPERTY__IS_READ_ONLY:
				return isIsReadOnly() ? Boolean.TRUE : Boolean.FALSE;
			case OntoUMLPackage.PROPERTY__IS_NAVIGABLE:
				return isIsNavigable() ? Boolean.TRUE : Boolean.FALSE;
			case OntoUMLPackage.PROPERTY__END_TYPE:
				if (resolve) return getEndType();
				return basicGetEndType();
			case OntoUMLPackage.PROPERTY__ASSOCIATION_END:
				if (resolve) return getAssociationEnd();
				return basicGetAssociationEnd();
			case OntoUMLPackage.PROPERTY__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OntoUMLPackage.PROPERTY__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case OntoUMLPackage.PROPERTY__OWNER:
				return getOwner();
			case OntoUMLPackage.PROPERTY__AUX:
				if (resolve) return getAux();
				return basicGetAux();
			case OntoUMLPackage.PROPERTY__ASSOCIATION_END_POSITION_AUX:
				return new Integer(getAssociationEndPositionAux());
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
			case OntoUMLPackage.PROPERTY__IS_DERIVED:
				setIsDerived(((Boolean)newValue).booleanValue());
				return;
			case OntoUMLPackage.PROPERTY__IS_READ_ONLY:
				setIsReadOnly(((Boolean)newValue).booleanValue());
				return;
			case OntoUMLPackage.PROPERTY__IS_NAVIGABLE:
				setIsNavigable(((Boolean)newValue).booleanValue());
				return;
			case OntoUMLPackage.PROPERTY__END_TYPE:
				setEndType((Type)newValue);
				return;
			case OntoUMLPackage.PROPERTY__ASSOCIATION_END:
				setAssociationEnd((Association)newValue);
				return;
			case OntoUMLPackage.PROPERTY__SOURCE:
				setSource((DirectedBinaryRelationship)newValue);
				return;
			case OntoUMLPackage.PROPERTY__TARGET:
				setTarget((DirectedBinaryRelationship)newValue);
				return;
			case OntoUMLPackage.PROPERTY__OWNER:
				setOwner((Element)newValue);
				return;
			case OntoUMLPackage.PROPERTY__AUX:
				setAux((Property)newValue);
				return;
			case OntoUMLPackage.PROPERTY__ASSOCIATION_END_POSITION_AUX:
				setAssociationEndPositionAux(((Integer)newValue).intValue());
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
			case OntoUMLPackage.PROPERTY__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case OntoUMLPackage.PROPERTY__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case OntoUMLPackage.PROPERTY__IS_NAVIGABLE:
				setIsNavigable(IS_NAVIGABLE_EDEFAULT);
				return;
			case OntoUMLPackage.PROPERTY__END_TYPE:
				setEndType((Type)null);
				return;
			case OntoUMLPackage.PROPERTY__ASSOCIATION_END:
				setAssociationEnd((Association)null);
				return;
			case OntoUMLPackage.PROPERTY__SOURCE:
				setSource((DirectedBinaryRelationship)null);
				return;
			case OntoUMLPackage.PROPERTY__TARGET:
				setTarget((DirectedBinaryRelationship)null);
				return;
			case OntoUMLPackage.PROPERTY__OWNER:
				setOwner((Element)null);
				return;
			case OntoUMLPackage.PROPERTY__AUX:
				setAux((Property)null);
				return;
			case OntoUMLPackage.PROPERTY__ASSOCIATION_END_POSITION_AUX:
				setAssociationEndPositionAux(ASSOCIATION_END_POSITION_AUX_EDEFAULT);
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
			case OntoUMLPackage.PROPERTY__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case OntoUMLPackage.PROPERTY__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case OntoUMLPackage.PROPERTY__IS_NAVIGABLE:
				return isNavigable != IS_NAVIGABLE_EDEFAULT;
			case OntoUMLPackage.PROPERTY__END_TYPE:
				return basicGetEndType() != null;
			case OntoUMLPackage.PROPERTY__ASSOCIATION_END:
				return associationEnd != null;
			case OntoUMLPackage.PROPERTY__SOURCE:
				return basicGetSource() != null;
			case OntoUMLPackage.PROPERTY__TARGET:
				return basicGetTarget() != null;
			case OntoUMLPackage.PROPERTY__OWNER:
				return getOwner() != null;
			case OntoUMLPackage.PROPERTY__AUX:
				return aux != null;
			case OntoUMLPackage.PROPERTY__ASSOCIATION_END_POSITION_AUX:
				return associationEndPositionAux != ASSOCIATION_END_POSITION_AUX_EDEFAULT;
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
		result.append(" (isDerived: ");
		result.append(isDerived);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(", isNavigable: ");
		result.append(isNavigable);
		result.append(", associationEndPositionAux: ");
		result.append(associationEndPositionAux);
		result.append(')');
		return result.toString();
	}

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
	 * The parsed OCL expression for the derivation of '{@link #getEndType <em>End Type</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndType
	 * @generated
	 */
	private static OCLExpression<EClassifier> endTypeDeriveOCL;

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

	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/ocl/examples/OCL";

	private static final OCL OCL_ENV = OCL.newInstance();

} //PropertyImpl
