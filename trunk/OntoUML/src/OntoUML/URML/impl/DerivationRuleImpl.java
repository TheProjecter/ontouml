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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derivation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OntoUML.URML.impl.DerivationRuleImpl#getConclusion <em>Conclusion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DerivationRuleImpl extends RuleImpl implements DerivationRule {
	/**
	 * The cached value of the '{@link #getConclusion() <em>Conclusion</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusion()
	 * @generated
	 * @ordered
	 */
	protected EList<Conclusion> conclusion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URMLPackage.Literals.DERIVATION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conclusion> getConclusion() {
		if (conclusion == null) {
			conclusion = new EObjectWithInverseResolvingEList<Conclusion>(Conclusion.class, this, URMLPackage.DERIVATION_RULE__CONCLUSION, URMLPackage.CONCLUSION__CONCLUSION_RULE);
		}
		return conclusion;
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
			case URMLPackage.DERIVATION_RULE__CONCLUSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConclusion()).basicAdd(otherEnd, msgs);
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
			case URMLPackage.DERIVATION_RULE__CONCLUSION:
				return ((InternalEList<?>)getConclusion()).basicRemove(otherEnd, msgs);
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
			case URMLPackage.DERIVATION_RULE__CONCLUSION:
				return getConclusion();
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
			case URMLPackage.DERIVATION_RULE__CONCLUSION:
				getConclusion().clear();
				getConclusion().addAll((Collection<? extends Conclusion>)newValue);
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
			case URMLPackage.DERIVATION_RULE__CONCLUSION:
				getConclusion().clear();
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
			case URMLPackage.DERIVATION_RULE__CONCLUSION:
				return conclusion != null && !conclusion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DerivationRuleImpl
