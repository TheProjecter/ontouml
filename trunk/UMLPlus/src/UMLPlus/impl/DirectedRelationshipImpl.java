/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package UMLPlus.impl;

import UMLPlus.DirectedRelationship;
import UMLPlus.Element;
import UMLPlus.UMLPlusPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link UMLPlus.impl.DirectedRelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link UMLPlus.impl.DirectedRelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link UMLPlus.impl.DirectedRelationshipImpl#getTargetAux1 <em>Target Aux1</em>}</li>
 *   <li>{@link UMLPlus.impl.DirectedRelationshipImpl#getSourceAux1 <em>Source Aux1</em>}</li>
 *   <li>{@link UMLPlus.impl.DirectedRelationshipImpl#getTargetAux2 <em>Target Aux2</em>}</li>
 *   <li>{@link UMLPlus.impl.DirectedRelationshipImpl#getSourceAux2 <em>Source Aux2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DirectedRelationshipImpl extends RelationshipImpl implements DirectedRelationship {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> source;

	/**
	 * The cached value of the '{@link #getTargetAux1() <em>Target Aux1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAux1()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> targetAux1;

	/**
	 * The cached value of the '{@link #getSourceAux1() <em>Source Aux1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAux1()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> sourceAux1;

	/**
	 * The cached value of the '{@link #getTargetAux2() <em>Target Aux2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAux2()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> targetAux2;

	/**
	 * The cached value of the '{@link #getSourceAux2() <em>Source Aux2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAux2()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> sourceAux2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectedRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPlusPackage.Literals.DIRECTED_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<Element>(Element.class, this, UMLPlusPackage.DIRECTED_RELATIONSHIP__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<Element>(Element.class, this, UMLPlusPackage.DIRECTED_RELATIONSHIP__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTargetAux1() {
		if (targetAux1 == null) {
			targetAux1 = new EObjectResolvingEList<Element>(Element.class, this, UMLPlusPackage.DIRECTED_RELATIONSHIP__TARGET_AUX1);
		}
		return targetAux1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getSourceAux1() {
		if (sourceAux1 == null) {
			sourceAux1 = new EObjectResolvingEList<Element>(Element.class, this, UMLPlusPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX1);
		}
		return sourceAux1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTargetAux2() {
		if (targetAux2 == null) {
			targetAux2 = new EObjectContainmentEList<Element>(Element.class, this, UMLPlusPackage.DIRECTED_RELATIONSHIP__TARGET_AUX2);
		}
		return targetAux2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getSourceAux2() {
		if (sourceAux2 == null) {
			sourceAux2 = new EObjectContainmentEList<Element>(Element.class, this, UMLPlusPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX2);
		}
		return sourceAux2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__TARGET_AUX2:
				return ((InternalEList<?>)getTargetAux2()).basicRemove(otherEnd, msgs);
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX2:
				return ((InternalEList<?>)getSourceAux2()).basicRemove(otherEnd, msgs);
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
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__TARGET:
				return getTarget();
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__SOURCE:
				return getSource();
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__TARGET_AUX1:
				return getTargetAux1();
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX1:
				return getSourceAux1();
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__TARGET_AUX2:
				return getTargetAux2();
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX2:
				return getSourceAux2();
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
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Element>)newValue);
				return;
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Element>)newValue);
				return;
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__TARGET_AUX1:
				getTargetAux1().clear();
				getTargetAux1().addAll((Collection<? extends Element>)newValue);
				return;
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX1:
				getSourceAux1().clear();
				getSourceAux1().addAll((Collection<? extends Element>)newValue);
				return;
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__TARGET_AUX2:
				getTargetAux2().clear();
				getTargetAux2().addAll((Collection<? extends Element>)newValue);
				return;
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX2:
				getSourceAux2().clear();
				getSourceAux2().addAll((Collection<? extends Element>)newValue);
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
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__TARGET:
				getTarget().clear();
				return;
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__SOURCE:
				getSource().clear();
				return;
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__TARGET_AUX1:
				getTargetAux1().clear();
				return;
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX1:
				getSourceAux1().clear();
				return;
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__TARGET_AUX2:
				getTargetAux2().clear();
				return;
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX2:
				getSourceAux2().clear();
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
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__TARGET:
				return target != null && !target.isEmpty();
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__SOURCE:
				return source != null && !source.isEmpty();
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__TARGET_AUX1:
				return targetAux1 != null && !targetAux1.isEmpty();
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX1:
				return sourceAux1 != null && !sourceAux1.isEmpty();
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__TARGET_AUX2:
				return targetAux2 != null && !targetAux2.isEmpty();
			case UMLPlusPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX2:
				return sourceAux2 != null && !sourceAux2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DirectedRelationshipImpl
