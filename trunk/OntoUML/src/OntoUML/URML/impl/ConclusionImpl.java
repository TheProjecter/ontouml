/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.URML.impl;

import OntoUML.URML.Conclusion;
import OntoUML.URML.DerivationRule;
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
 * An implementation of the model object '<em><b>Conclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OntoUML.URML.impl.ConclusionImpl#getConclusionRule <em>Conclusion Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConclusionImpl extends RelationalClassifierImpl implements Conclusion {
	/**
	 * The cached value of the '{@link #getConclusionRule() <em>Conclusion Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusionRule()
	 * @generated
	 * @ordered
	 */
	protected DerivationRule conclusionRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConclusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URMLPackage.Literals.CONCLUSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationRule getConclusionRule() {
		if (conclusionRule != null && conclusionRule.eIsProxy()) {
			InternalEObject oldConclusionRule = (InternalEObject)conclusionRule;
			conclusionRule = (DerivationRule)eResolveProxy(oldConclusionRule);
			if (conclusionRule != oldConclusionRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, URMLPackage.CONCLUSION__CONCLUSION_RULE, oldConclusionRule, conclusionRule));
			}
		}
		return conclusionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationRule basicGetConclusionRule() {
		return conclusionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConclusionRule(DerivationRule newConclusionRule, NotificationChain msgs) {
		DerivationRule oldConclusionRule = conclusionRule;
		conclusionRule = newConclusionRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URMLPackage.CONCLUSION__CONCLUSION_RULE, oldConclusionRule, newConclusionRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConclusionRule(DerivationRule newConclusionRule) {
		if (newConclusionRule != conclusionRule) {
			NotificationChain msgs = null;
			if (conclusionRule != null)
				msgs = ((InternalEObject)conclusionRule).eInverseRemove(this, URMLPackage.DERIVATION_RULE__CONCLUSION, DerivationRule.class, msgs);
			if (newConclusionRule != null)
				msgs = ((InternalEObject)newConclusionRule).eInverseAdd(this, URMLPackage.DERIVATION_RULE__CONCLUSION, DerivationRule.class, msgs);
			msgs = basicSetConclusionRule(newConclusionRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URMLPackage.CONCLUSION__CONCLUSION_RULE, newConclusionRule, newConclusionRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case URMLPackage.CONCLUSION__CONCLUSION_RULE:
				if (conclusionRule != null)
					msgs = ((InternalEObject)conclusionRule).eInverseRemove(this, URMLPackage.DERIVATION_RULE__CONCLUSION, DerivationRule.class, msgs);
				return basicSetConclusionRule((DerivationRule)otherEnd, msgs);
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
			case URMLPackage.CONCLUSION__CONCLUSION_RULE:
				return basicSetConclusionRule(null, msgs);
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
			case URMLPackage.CONCLUSION__CONCLUSION_RULE:
				if (resolve) return getConclusionRule();
				return basicGetConclusionRule();
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
			case URMLPackage.CONCLUSION__CONCLUSION_RULE:
				setConclusionRule((DerivationRule)newValue);
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
			case URMLPackage.CONCLUSION__CONCLUSION_RULE:
				setConclusionRule((DerivationRule)null);
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
			case URMLPackage.CONCLUSION__CONCLUSION_RULE:
				return conclusionRule != null;
		}
		return super.eIsSet(featureID);
	}

} //ConclusionImpl
