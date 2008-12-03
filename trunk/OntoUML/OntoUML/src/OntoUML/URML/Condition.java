/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.URML;

import OntoUML.RelationalClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OntoUML.URML.Condition#isNegative <em>Negative</em>}</li>
 *   <li>{@link OntoUML.URML.Condition#getConditionRule <em>Condition Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see OntoUML.URML.URMLPackage#getCondition()
 * @model abstract="true"
 * @generated
 */
public interface Condition extends RelationalClassifier {
	/**
	 * Returns the value of the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative</em>' attribute.
	 * @see #setNegative(boolean)
	 * @see OntoUML.URML.URMLPackage#getCondition_Negative()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isNegative();

	/**
	 * Sets the value of the '{@link OntoUML.URML.Condition#isNegative <em>Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative</em>' attribute.
	 * @see #isNegative()
	 * @generated
	 */
	void setNegative(boolean value);

	/**
	 * Returns the value of the '<em><b>Condition Rule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link OntoUML.URML.Rule#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Rule</em>' reference.
	 * @see #setConditionRule(Rule)
	 * @see OntoUML.URML.URMLPackage#getCondition_ConditionRule()
	 * @see OntoUML.URML.Rule#getCondition
	 * @model opposite="condition" required="true" ordered="false"
	 * @generated
	 */
	Rule getConditionRule();

	/**
	 * Sets the value of the '{@link OntoUML.URML.Condition#getConditionRule <em>Condition Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Rule</em>' reference.
	 * @see #getConditionRule()
	 * @generated
	 */
	void setConditionRule(Rule value);

} // Condition
