/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.URML.impl;

import OntoUML.Relationship;
import OntoUML.Association;

import OntoUML.URML.BinaryAssociationAtom;
import OntoUML.URML.Conclusion;
import OntoUML.URML.DerivationRule;
import OntoUML.URML.ObjectVariable;
import OntoUML.URML.URMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Association Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OntoUML.URML.impl.BinaryAssociationAtomImpl#getConclusionRule <em>Conclusion Rule</em>}</li>
 *   <li>{@link OntoUML.URML.impl.BinaryAssociationAtomImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link OntoUML.URML.impl.BinaryAssociationAtomImpl#getSourceVariable <em>Source Variable</em>}</li>
 *   <li>{@link OntoUML.URML.impl.BinaryAssociationAtomImpl#getTargetVariable <em>Target Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryAssociationAtomImpl extends ConditionImpl implements BinaryAssociationAtom {
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
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected Relationship association;

	/**
	 * The default value of the '{@link #getSourceVariable() <em>Source Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceVariable() <em>Source Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceVariable()
	 * @generated
	 * @ordered
	 */
	protected String sourceVariable = SOURCE_VARIABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetVariable() <em>Target Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetVariable() <em>Target Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVariable()
	 * @generated
	 * @ordered
	 */
	protected String targetVariable = TARGET_VARIABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryAssociationAtomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URMLPackage.Literals.BINARY_ASSOCIATION_ATOM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, URMLPackage.BINARY_ASSOCIATION_ATOM__CONCLUSION_RULE, oldConclusionRule, conclusionRule));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URMLPackage.BINARY_ASSOCIATION_ATOM__CONCLUSION_RULE, oldConclusionRule, newConclusionRule);
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
			eNotify(new ENotificationImpl(this, Notification.SET, URMLPackage.BINARY_ASSOCIATION_ATOM__CONCLUSION_RULE, newConclusionRule, newConclusionRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship getAssociation() {
		if (association != null && association.eIsProxy()) {
			InternalEObject oldAssociation = (InternalEObject)association;
			association = (Relationship)eResolveProxy(oldAssociation);
			if (association != oldAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, URMLPackage.BINARY_ASSOCIATION_ATOM__ASSOCIATION, oldAssociation, association));
			}
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship basicGetAssociation() {
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(Relationship newAssociation) {
		Relationship oldAssociation = association;
		association = newAssociation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URMLPackage.BINARY_ASSOCIATION_ATOM__ASSOCIATION, oldAssociation, association));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceVariable() {
		return sourceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceVariable(String newSourceVariable) {
		String oldSourceVariable = sourceVariable;
		sourceVariable = newSourceVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URMLPackage.BINARY_ASSOCIATION_ATOM__SOURCE_VARIABLE, oldSourceVariable, sourceVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetVariable() {
		return targetVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetVariable(String newTargetVariable) {
		String oldTargetVariable = targetVariable;
		targetVariable = newTargetVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URMLPackage.BINARY_ASSOCIATION_ATOM__TARGET_VARIABLE, oldTargetVariable, targetVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case URMLPackage.BINARY_ASSOCIATION_ATOM__CONCLUSION_RULE:
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
			case URMLPackage.BINARY_ASSOCIATION_ATOM__CONCLUSION_RULE:
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
			case URMLPackage.BINARY_ASSOCIATION_ATOM__CONCLUSION_RULE:
				if (resolve) return getConclusionRule();
				return basicGetConclusionRule();
			case URMLPackage.BINARY_ASSOCIATION_ATOM__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case URMLPackage.BINARY_ASSOCIATION_ATOM__SOURCE_VARIABLE:
				return getSourceVariable();
			case URMLPackage.BINARY_ASSOCIATION_ATOM__TARGET_VARIABLE:
				return getTargetVariable();
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
			case URMLPackage.BINARY_ASSOCIATION_ATOM__CONCLUSION_RULE:
				setConclusionRule((DerivationRule)newValue);
				return;
			case URMLPackage.BINARY_ASSOCIATION_ATOM__ASSOCIATION:
				setAssociation((Relationship)newValue);
				return;
			case URMLPackage.BINARY_ASSOCIATION_ATOM__SOURCE_VARIABLE:
				setSourceVariable((String)newValue);
				return;
			case URMLPackage.BINARY_ASSOCIATION_ATOM__TARGET_VARIABLE:
				setTargetVariable((String)newValue);
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
			case URMLPackage.BINARY_ASSOCIATION_ATOM__CONCLUSION_RULE:
				setConclusionRule((DerivationRule)null);
				return;
			case URMLPackage.BINARY_ASSOCIATION_ATOM__ASSOCIATION:
				setAssociation((Relationship)null);
				return;
			case URMLPackage.BINARY_ASSOCIATION_ATOM__SOURCE_VARIABLE:
				setSourceVariable(SOURCE_VARIABLE_EDEFAULT);
				return;
			case URMLPackage.BINARY_ASSOCIATION_ATOM__TARGET_VARIABLE:
				setTargetVariable(TARGET_VARIABLE_EDEFAULT);
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
			case URMLPackage.BINARY_ASSOCIATION_ATOM__CONCLUSION_RULE:
				return conclusionRule != null;
			case URMLPackage.BINARY_ASSOCIATION_ATOM__ASSOCIATION:
				return association != null;
			case URMLPackage.BINARY_ASSOCIATION_ATOM__SOURCE_VARIABLE:
				return SOURCE_VARIABLE_EDEFAULT == null ? sourceVariable != null : !SOURCE_VARIABLE_EDEFAULT.equals(sourceVariable);
			case URMLPackage.BINARY_ASSOCIATION_ATOM__TARGET_VARIABLE:
				return TARGET_VARIABLE_EDEFAULT == null ? targetVariable != null : !TARGET_VARIABLE_EDEFAULT.equals(targetVariable);
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
		if (baseClass == Conclusion.class) {
			switch (derivedFeatureID) {
				case URMLPackage.BINARY_ASSOCIATION_ATOM__CONCLUSION_RULE: return URMLPackage.CONCLUSION__CONCLUSION_RULE;
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
		if (baseClass == Conclusion.class) {
			switch (baseFeatureID) {
				case URMLPackage.CONCLUSION__CONCLUSION_RULE: return URMLPackage.BINARY_ASSOCIATION_ATOM__CONCLUSION_RULE;
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
		result.append(" (sourceVariable: ");
		result.append(sourceVariable);
		result.append(", targetVariable: ");
		result.append(targetVariable);
		result.append(')');
		return result.toString();
	}

} //BinaryAssociationAtomImpl
