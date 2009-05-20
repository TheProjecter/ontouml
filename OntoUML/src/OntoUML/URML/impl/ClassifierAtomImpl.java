/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.URML.impl;

import OntoUML.URML.ClassifierAtom;
import OntoUML.URML.Conclusion;
import OntoUML.URML.DerivationRule;
import OntoUML.URML.URMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OntoUML.URML.impl.ClassifierAtomImpl#getConclusionRule <em>Conclusion Rule</em>}</li>
 *   <li>{@link OntoUML.URML.impl.ClassifierAtomImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link OntoUML.URML.impl.ClassifierAtomImpl#getClassVariable <em>Class Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifierAtomImpl extends ConditionImpl implements ClassifierAtom {
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
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected OntoUML.Class class_;

	/**
	 * The default value of the '{@link #getClassVariable() <em>Class Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_VARIABLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getClassVariable() <em>Class Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassVariable()
	 * @generated
	 * @ordered
	 */
	protected String classVariable = CLASS_VARIABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierAtomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URMLPackage.Literals.CLASSIFIER_ATOM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, URMLPackage.CLASSIFIER_ATOM__CONCLUSION_RULE, oldConclusionRule, conclusionRule));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URMLPackage.CLASSIFIER_ATOM__CONCLUSION_RULE, oldConclusionRule, newConclusionRule);
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
			eNotify(new ENotificationImpl(this, Notification.SET, URMLPackage.CLASSIFIER_ATOM__CONCLUSION_RULE, newConclusionRule, newConclusionRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUML.Class getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject)class_;
			class_ = (OntoUML.Class)eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, URMLPackage.CLASSIFIER_ATOM__CLASS, oldClass, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUML.Class basicGetClass() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(OntoUML.Class newClass) {
		OntoUML.Class oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URMLPackage.CLASSIFIER_ATOM__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassVariable() {
		return classVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassVariable(String newClassVariable) {
		String oldClassVariable = classVariable;
		classVariable = newClassVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URMLPackage.CLASSIFIER_ATOM__CLASS_VARIABLE, oldClassVariable, classVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case URMLPackage.CLASSIFIER_ATOM__CONCLUSION_RULE:
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
			case URMLPackage.CLASSIFIER_ATOM__CONCLUSION_RULE:
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
			case URMLPackage.CLASSIFIER_ATOM__CONCLUSION_RULE:
				if (resolve) return getConclusionRule();
				return basicGetConclusionRule();
			case URMLPackage.CLASSIFIER_ATOM__CLASS:
				if (resolve) return getClass_();
				return basicGetClass();
			case URMLPackage.CLASSIFIER_ATOM__CLASS_VARIABLE:
				return getClassVariable();
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
			case URMLPackage.CLASSIFIER_ATOM__CONCLUSION_RULE:
				setConclusionRule((DerivationRule)newValue);
				return;
			case URMLPackage.CLASSIFIER_ATOM__CLASS:
				setClass((OntoUML.Class)newValue);
				return;
			case URMLPackage.CLASSIFIER_ATOM__CLASS_VARIABLE:
				setClassVariable((String)newValue);
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
			case URMLPackage.CLASSIFIER_ATOM__CONCLUSION_RULE:
				setConclusionRule((DerivationRule)null);
				return;
			case URMLPackage.CLASSIFIER_ATOM__CLASS:
				setClass((OntoUML.Class)null);
				return;
			case URMLPackage.CLASSIFIER_ATOM__CLASS_VARIABLE:
				setClassVariable(CLASS_VARIABLE_EDEFAULT);
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
			case URMLPackage.CLASSIFIER_ATOM__CONCLUSION_RULE:
				return conclusionRule != null;
			case URMLPackage.CLASSIFIER_ATOM__CLASS:
				return class_ != null;
			case URMLPackage.CLASSIFIER_ATOM__CLASS_VARIABLE:
				return CLASS_VARIABLE_EDEFAULT == null ? classVariable != null : !CLASS_VARIABLE_EDEFAULT.equals(classVariable);
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
				case URMLPackage.CLASSIFIER_ATOM__CONCLUSION_RULE: return URMLPackage.CONCLUSION__CONCLUSION_RULE;
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
				case URMLPackage.CONCLUSION__CONCLUSION_RULE: return URMLPackage.CLASSIFIER_ATOM__CONCLUSION_RULE;
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
		result.append(" (classVariable: ");
		result.append(classVariable);
		result.append(')');
		return result.toString();
	}

} //ClassifierAtomImpl
