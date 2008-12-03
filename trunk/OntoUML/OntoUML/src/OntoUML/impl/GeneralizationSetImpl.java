/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.impl;

import OntoUML.Generalization;
import OntoUML.GeneralizationSet;
import OntoUML.OntoUMLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OntoUML.impl.GeneralizationSetImpl#isIsCovering <em>Is Covering</em>}</li>
 *   <li>{@link OntoUML.impl.GeneralizationSetImpl#isIsDisjoint <em>Is Disjoint</em>}</li>
 *   <li>{@link OntoUML.impl.GeneralizationSetImpl#getSemnome <em>Semnome</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationSetImpl extends NamedElementImpl implements GeneralizationSet {
	/**
	 * The default value of the '{@link #isIsCovering() <em>Is Covering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCovering()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COVERING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCovering() <em>Is Covering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCovering()
	 * @generated
	 * @ordered
	 */
	protected boolean isCovering = IS_COVERING_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDisjoint() <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisjoint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DISJOINT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsDisjoint() <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisjoint()
	 * @generated
	 * @ordered
	 */
	protected boolean isDisjoint = IS_DISJOINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemnome() <em>Semnome</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemnome()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> semnome;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntoUMLPackage.Literals.GENERALIZATION_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCovering() {
		return isCovering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCovering(boolean newIsCovering) {
		boolean oldIsCovering = isCovering;
		isCovering = newIsCovering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.GENERALIZATION_SET__IS_COVERING, oldIsCovering, isCovering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDisjoint() {
		return isDisjoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisjoint(boolean newIsDisjoint) {
		boolean oldIsDisjoint = isDisjoint;
		isDisjoint = newIsDisjoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.GENERALIZATION_SET__IS_DISJOINT, oldIsDisjoint, isDisjoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getSemnome() {
		if (semnome == null) {
			semnome = new EObjectWithInverseResolvingEList.ManyInverse<Generalization>(Generalization.class, this, OntoUMLPackage.GENERALIZATION_SET__SEMNOME, OntoUMLPackage.GENERALIZATION__SEMNOME);
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
			case OntoUMLPackage.GENERALIZATION_SET__SEMNOME:
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
			case OntoUMLPackage.GENERALIZATION_SET__SEMNOME:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntoUMLPackage.GENERALIZATION_SET__IS_COVERING:
				return isIsCovering() ? Boolean.TRUE : Boolean.FALSE;
			case OntoUMLPackage.GENERALIZATION_SET__IS_DISJOINT:
				return isIsDisjoint() ? Boolean.TRUE : Boolean.FALSE;
			case OntoUMLPackage.GENERALIZATION_SET__SEMNOME:
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
			case OntoUMLPackage.GENERALIZATION_SET__IS_COVERING:
				setIsCovering(((Boolean)newValue).booleanValue());
				return;
			case OntoUMLPackage.GENERALIZATION_SET__IS_DISJOINT:
				setIsDisjoint(((Boolean)newValue).booleanValue());
				return;
			case OntoUMLPackage.GENERALIZATION_SET__SEMNOME:
				getSemnome().clear();
				getSemnome().addAll((Collection<? extends Generalization>)newValue);
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
			case OntoUMLPackage.GENERALIZATION_SET__IS_COVERING:
				setIsCovering(IS_COVERING_EDEFAULT);
				return;
			case OntoUMLPackage.GENERALIZATION_SET__IS_DISJOINT:
				setIsDisjoint(IS_DISJOINT_EDEFAULT);
				return;
			case OntoUMLPackage.GENERALIZATION_SET__SEMNOME:
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
			case OntoUMLPackage.GENERALIZATION_SET__IS_COVERING:
				return isCovering != IS_COVERING_EDEFAULT;
			case OntoUMLPackage.GENERALIZATION_SET__IS_DISJOINT:
				return isDisjoint != IS_DISJOINT_EDEFAULT;
			case OntoUMLPackage.GENERALIZATION_SET__SEMNOME:
				return semnome != null && !semnome.isEmpty();
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
		result.append(" (isCovering: ");
		result.append(isCovering);
		result.append(", isDisjoint: ");
		result.append(isDisjoint);
		result.append(')');
		return result.toString();
	}

} //GeneralizationSetImpl
