/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.URML.impl;

import OntoUML.URML.Condition;
import OntoUML.URML.RoleTypeAtom;
import OntoUML.URML.Rule;
import OntoUML.URML.URMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Type Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OntoUML.URML.impl.RoleTypeAtomImpl#isNegative <em>Negative</em>}</li>
 *   <li>{@link OntoUML.URML.impl.RoleTypeAtomImpl#getConditionRule <em>Condition Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleTypeAtomImpl extends ConclusionImpl implements RoleTypeAtom {
	/**
	 * The default value of the '{@link #isNegative() <em>Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNegative() <em>Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegative()
	 * @generated
	 * @ordered
	 */
	protected boolean negative = NEGATIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditionRule() <em>Condition Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionRule()
	 * @generated
	 * @ordered
	 */
	protected Rule conditionRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleTypeAtomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URMLPackage.Literals.ROLE_TYPE_ATOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNegative() {
		return negative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegative(boolean newNegative) {
		boolean oldNegative = negative;
		negative = newNegative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URMLPackage.ROLE_TYPE_ATOM__NEGATIVE, oldNegative, negative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getConditionRule() {
		if (conditionRule != null && conditionRule.eIsProxy()) {
			InternalEObject oldConditionRule = (InternalEObject)conditionRule;
			conditionRule = (Rule)eResolveProxy(oldConditionRule);
			if (conditionRule != oldConditionRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, URMLPackage.ROLE_TYPE_ATOM__CONDITION_RULE, oldConditionRule, conditionRule));
			}
		}
		return conditionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule basicGetConditionRule() {
		return conditionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionRule(Rule newConditionRule, NotificationChain msgs) {
		Rule oldConditionRule = conditionRule;
		conditionRule = newConditionRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URMLPackage.ROLE_TYPE_ATOM__CONDITION_RULE, oldConditionRule, newConditionRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionRule(Rule newConditionRule) {
		if (newConditionRule != conditionRule) {
			NotificationChain msgs = null;
			if (conditionRule != null)
				msgs = ((InternalEObject)conditionRule).eInverseRemove(this, URMLPackage.RULE__CONDITION, Rule.class, msgs);
			if (newConditionRule != null)
				msgs = ((InternalEObject)newConditionRule).eInverseAdd(this, URMLPackage.RULE__CONDITION, Rule.class, msgs);
			msgs = basicSetConditionRule(newConditionRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URMLPackage.ROLE_TYPE_ATOM__CONDITION_RULE, newConditionRule, newConditionRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case URMLPackage.ROLE_TYPE_ATOM__CONDITION_RULE:
				if (conditionRule != null)
					msgs = ((InternalEObject)conditionRule).eInverseRemove(this, URMLPackage.RULE__CONDITION, Rule.class, msgs);
				return basicSetConditionRule((Rule)otherEnd, msgs);
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
			case URMLPackage.ROLE_TYPE_ATOM__CONDITION_RULE:
				return basicSetConditionRule(null, msgs);
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
			case URMLPackage.ROLE_TYPE_ATOM__NEGATIVE:
				return isNegative() ? Boolean.TRUE : Boolean.FALSE;
			case URMLPackage.ROLE_TYPE_ATOM__CONDITION_RULE:
				if (resolve) return getConditionRule();
				return basicGetConditionRule();
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
			case URMLPackage.ROLE_TYPE_ATOM__NEGATIVE:
				setNegative(((Boolean)newValue).booleanValue());
				return;
			case URMLPackage.ROLE_TYPE_ATOM__CONDITION_RULE:
				setConditionRule((Rule)newValue);
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
			case URMLPackage.ROLE_TYPE_ATOM__NEGATIVE:
				setNegative(NEGATIVE_EDEFAULT);
				return;
			case URMLPackage.ROLE_TYPE_ATOM__CONDITION_RULE:
				setConditionRule((Rule)null);
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
			case URMLPackage.ROLE_TYPE_ATOM__NEGATIVE:
				return negative != NEGATIVE_EDEFAULT;
			case URMLPackage.ROLE_TYPE_ATOM__CONDITION_RULE:
				return conditionRule != null;
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
		if (baseClass == Condition.class) {
			switch (derivedFeatureID) {
				case URMLPackage.ROLE_TYPE_ATOM__NEGATIVE: return URMLPackage.CONDITION__NEGATIVE;
				case URMLPackage.ROLE_TYPE_ATOM__CONDITION_RULE: return URMLPackage.CONDITION__CONDITION_RULE;
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
		if (baseClass == Condition.class) {
			switch (baseFeatureID) {
				case URMLPackage.CONDITION__NEGATIVE: return URMLPackage.ROLE_TYPE_ATOM__NEGATIVE;
				case URMLPackage.CONDITION__CONDITION_RULE: return URMLPackage.ROLE_TYPE_ATOM__CONDITION_RULE;
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
		result.append(" (negative: ");
		result.append(negative);
		result.append(')');
		return result.toString();
	}

} //RoleTypeAtomImpl
