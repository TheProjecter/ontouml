/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.impl;

import OntoUML.Container;
import OntoUML.Element;
import OntoUML.OntoUMLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OntoUML.impl.ElementImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link OntoUML.impl.ElementImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link OntoUML.impl.ElementImpl#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementImpl extends EObjectImpl implements Element {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntoUMLPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentWithInverseEList<Element>(Element.class, this, OntoUMLPackage.ELEMENT__ATTRIBUTE, OntoUMLPackage.ELEMENT__OWNER);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		if (eContainerFeatureID != OntoUMLPackage.ELEMENT__OWNER) return null;
		return (Element)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Element newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, OntoUMLPackage.ELEMENT__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Element newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID != OntoUMLPackage.ELEMENT__OWNER && newOwner != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.ELEMENT__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container getContainer() {
		if (eContainerFeatureID != OntoUMLPackage.ELEMENT__CONTAINER) return null;
		return (Container)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(Container newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, OntoUMLPackage.ELEMENT__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(Container newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID != OntoUMLPackage.ELEMENT__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, OntoUMLPackage.CONTAINER__INSTANCIAR_ELEMENT, Container.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.ELEMENT__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> allSuperTypes() {
		if (allSuperTypesBodyOCL == null) {
			EOperation eOperation = OntoUMLPackage.Literals.ELEMENT.getEOperations().get(0);
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setOperationContext(OntoUMLPackage.Literals.ELEMENT, eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = ocl.getDetails().get("body");
			
			try {
				allSuperTypesBodyOCL = helper.createQuery(body);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(allSuperTypesBodyOCL);
	
		@SuppressWarnings("unchecked")
		Collection<Element> result = (Collection<Element>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<Element>(result.size(), result.toArray());
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConected(Element x) {
		if (isConectedBodyOCL == null) {
			EOperation eOperation = OntoUMLPackage.Literals.ELEMENT.getEOperations().get(1);
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setOperationContext(OntoUMLPackage.Literals.ELEMENT, eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = ocl.getDetails().get("body");
			
			try {
				isConectedBodyOCL = helper.createQuery(body);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(isConectedBodyOCL);
	 
		EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = query.getEvaluationEnvironment();
		
		evalEnv.add("x", x);
	  
		return ((Boolean) query.evaluate(this)).booleanValue();
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean subInstanceType(Element x) {
		if (subInstanceTypeBodyOCL == null) {
			EOperation eOperation = OntoUMLPackage.Literals.ELEMENT.getEOperations().get(2);
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setOperationContext(OntoUMLPackage.Literals.ELEMENT, eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = ocl.getDetails().get("body");
			
			try {
				subInstanceTypeBodyOCL = helper.createQuery(body);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(subInstanceTypeBodyOCL);
	 
		EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = query.getEvaluationEnvironment();
		
		evalEnv.add("x", x);
	  
		return ((Boolean) query.evaluate(this)).booleanValue();
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean subMetaTypeKind() {
		if (subMetaTypeKindBodyOCL == null) {
			EOperation eOperation = OntoUMLPackage.Literals.ELEMENT.getEOperations().get(3);
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setOperationContext(OntoUMLPackage.Literals.ELEMENT, eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = ocl.getDetails().get("body");
			
			try {
				subMetaTypeKindBodyOCL = helper.createQuery(body);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(subMetaTypeKindBodyOCL);
	
		return ((Boolean) query.evaluate(this)).booleanValue();
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean subMetaTypeCollective() {
		if (subMetaTypeCollectiveBodyOCL == null) {
			EOperation eOperation = OntoUMLPackage.Literals.ELEMENT.getEOperations().get(4);
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setOperationContext(OntoUMLPackage.Literals.ELEMENT, eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = ocl.getDetails().get("body");
			
			try {
				subMetaTypeCollectiveBodyOCL = helper.createQuery(body);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(subMetaTypeCollectiveBodyOCL);
	
		return ((Boolean) query.evaluate(this)).booleanValue();
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean subMetaTypeQuantity() {
		if (subMetaTypeQuantityBodyOCL == null) {
			EOperation eOperation = OntoUMLPackage.Literals.ELEMENT.getEOperations().get(5);
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setOperationContext(OntoUMLPackage.Literals.ELEMENT, eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = ocl.getDetails().get("body");
			
			try {
				subMetaTypeQuantityBodyOCL = helper.createQuery(body);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(subMetaTypeQuantityBodyOCL);
	
		return ((Boolean) query.evaluate(this)).booleanValue();
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasFunctionalComplexesInstances() {
		if (hasFunctionalComplexesInstancesBodyOCL == null) {
			EOperation eOperation = OntoUMLPackage.Literals.ELEMENT.getEOperations().get(6);
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setOperationContext(OntoUMLPackage.Literals.ELEMENT, eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = ocl.getDetails().get("body");
			
			try {
				hasFunctionalComplexesInstancesBodyOCL = helper.createQuery(body);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(hasFunctionalComplexesInstancesBodyOCL);
	
		return ((Boolean) query.evaluate(this)).booleanValue();
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasCollectivesInstances() {
		if (hasCollectivesInstancesBodyOCL == null) {
			EOperation eOperation = OntoUMLPackage.Literals.ELEMENT.getEOperations().get(7);
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setOperationContext(OntoUMLPackage.Literals.ELEMENT, eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = ocl.getDetails().get("body");
			
			try {
				hasCollectivesInstancesBodyOCL = helper.createQuery(body);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(hasCollectivesInstancesBodyOCL);
	
		return ((Boolean) query.evaluate(this)).booleanValue();
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasQuantitiesInstances() {
		if (hasQuantitiesInstancesBodyOCL == null) {
			EOperation eOperation = OntoUMLPackage.Literals.ELEMENT.getEOperations().get(8);
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setOperationContext(OntoUMLPackage.Literals.ELEMENT, eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = ocl.getDetails().get("body");
			
			try {
				hasQuantitiesInstancesBodyOCL = helper.createQuery(body);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(hasQuantitiesInstancesBodyOCL);
	
		return ((Boolean) query.evaluate(this)).booleanValue();
	
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
			case OntoUMLPackage.ELEMENT__ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttribute()).basicAdd(otherEnd, msgs);
			case OntoUMLPackage.ELEMENT__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((Element)otherEnd, msgs);
			case OntoUMLPackage.ELEMENT__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((Container)otherEnd, msgs);
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
			case OntoUMLPackage.ELEMENT__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case OntoUMLPackage.ELEMENT__OWNER:
				return basicSetOwner(null, msgs);
			case OntoUMLPackage.ELEMENT__CONTAINER:
				return basicSetContainer(null, msgs);
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
			case OntoUMLPackage.ELEMENT__OWNER:
				return eInternalContainer().eInverseRemove(this, OntoUMLPackage.ELEMENT__ATTRIBUTE, Element.class, msgs);
			case OntoUMLPackage.ELEMENT__CONTAINER:
				return eInternalContainer().eInverseRemove(this, OntoUMLPackage.CONTAINER__INSTANCIAR_ELEMENT, Container.class, msgs);
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
			case OntoUMLPackage.ELEMENT__ATTRIBUTE:
				return getAttribute();
			case OntoUMLPackage.ELEMENT__OWNER:
				return getOwner();
			case OntoUMLPackage.ELEMENT__CONTAINER:
				return getContainer();
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
			case OntoUMLPackage.ELEMENT__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Element>)newValue);
				return;
			case OntoUMLPackage.ELEMENT__OWNER:
				setOwner((Element)newValue);
				return;
			case OntoUMLPackage.ELEMENT__CONTAINER:
				setContainer((Container)newValue);
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
			case OntoUMLPackage.ELEMENT__ATTRIBUTE:
				getAttribute().clear();
				return;
			case OntoUMLPackage.ELEMENT__OWNER:
				setOwner((Element)null);
				return;
			case OntoUMLPackage.ELEMENT__CONTAINER:
				setContainer((Container)null);
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
			case OntoUMLPackage.ELEMENT__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case OntoUMLPackage.ELEMENT__OWNER:
				return getOwner() != null;
			case OntoUMLPackage.ELEMENT__CONTAINER:
				return getContainer() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * The parsed OCL expression for the body of the '{@link #allSuperTypes <em>All Super Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allSuperTypes
	 * @generated
	 */
	private static OCLExpression<EClassifier> allSuperTypesBodyOCL;
	/**
	 * The parsed OCL expression for the body of the '{@link #isConected <em>Is Conected</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConected
	 * @generated
	 */
	private static OCLExpression<EClassifier> isConectedBodyOCL;
	/**
	 * The parsed OCL expression for the body of the '{@link #subInstanceType <em>Sub Instance Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #subInstanceType
	 * @generated
	 */
	private static OCLExpression<EClassifier> subInstanceTypeBodyOCL;
	/**
	 * The parsed OCL expression for the body of the '{@link #subMetaTypeKind <em>Sub Meta Type Kind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #subMetaTypeKind
	 * @generated
	 */
	private static OCLExpression<EClassifier> subMetaTypeKindBodyOCL;
	/**
	 * The parsed OCL expression for the body of the '{@link #subMetaTypeCollective <em>Sub Meta Type Collective</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #subMetaTypeCollective
	 * @generated
	 */
	private static OCLExpression<EClassifier> subMetaTypeCollectiveBodyOCL;
	/**
	 * The parsed OCL expression for the body of the '{@link #subMetaTypeQuantity <em>Sub Meta Type Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #subMetaTypeQuantity
	 * @generated
	 */
	private static OCLExpression<EClassifier> subMetaTypeQuantityBodyOCL;
	/**
	 * The parsed OCL expression for the body of the '{@link #hasFunctionalComplexesInstances <em>Has Functional Complexes Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasFunctionalComplexesInstances
	 * @generated
	 */
	private static OCLExpression<EClassifier> hasFunctionalComplexesInstancesBodyOCL;
	/**
	 * The parsed OCL expression for the body of the '{@link #hasCollectivesInstances <em>Has Collectives Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasCollectivesInstances
	 * @generated
	 */
	private static OCLExpression<EClassifier> hasCollectivesInstancesBodyOCL;
	/**
	 * The parsed OCL expression for the body of the '{@link #hasQuantitiesInstances <em>Has Quantities Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasQuantitiesInstances
	 * @generated
	 */
	private static OCLExpression<EClassifier> hasQuantitiesInstancesBodyOCL;
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/ocl/examples/OCL";
	private static final OCL OCL_ENV = OCL.newInstance();

} //ElementImpl
