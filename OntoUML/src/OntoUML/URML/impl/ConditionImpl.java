/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.URML.impl;

import OntoUML.URML.Condition;
import OntoUML.URML.Rule;
import OntoUML.URML.URMLPackage;

import OntoUML.impl.RelationalClassifierImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OntoUML.URML.impl.ConditionImpl#isNegative <em>Negative</em>}</li>
 *   <li>{@link OntoUML.URML.impl.ConditionImpl#getConditionRule <em>Condition Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConditionImpl extends RelationalClassifierImpl implements Condition {
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
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URMLPackage.Literals.CONDITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, URMLPackage.CONDITION__NEGATIVE, oldNegative, negative));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, URMLPackage.CONDITION__CONDITION_RULE, oldConditionRule, conditionRule));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URMLPackage.CONDITION__CONDITION_RULE, oldConditionRule, newConditionRule);
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
			eNotify(new ENotificationImpl(this, Notification.SET, URMLPackage.CONDITION__CONDITION_RULE, newConditionRule, newConditionRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case URMLPackage.CONDITION__CONDITION_RULE:
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
			case URMLPackage.CONDITION__CONDITION_RULE:
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
			case URMLPackage.CONDITION__NEGATIVE:
				return isNegative() ? Boolean.TRUE : Boolean.FALSE;
			case URMLPackage.CONDITION__CONDITION_RULE:
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
			case URMLPackage.CONDITION__NEGATIVE:
				setNegative(((Boolean)newValue).booleanValue());
				return;
			case URMLPackage.CONDITION__CONDITION_RULE:
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
			case URMLPackage.CONDITION__NEGATIVE:
				setNegative(NEGATIVE_EDEFAULT);
				return;
			case URMLPackage.CONDITION__CONDITION_RULE:
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
			case URMLPackage.CONDITION__NEGATIVE:
				return negative != NEGATIVE_EDEFAULT;
			case URMLPackage.CONDITION__CONDITION_RULE:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (negative: ");
		result.append(negative);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
