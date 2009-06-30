/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.URML;

import OntoUML.NamedElement;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OntoUML.URML.Rule#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see OntoUML.URML.URMLPackage#getRule()
 * @model abstract="true"
 * @generated
 */
public interface Rule extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference list.
	 * The list contents are of type {@link OntoUML.URML.Condition}.
	 * It is bidirectional and its opposite is '{@link OntoUML.URML.Condition#getConditionRule <em>Condition Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference list.
	 * @see OntoUML.URML.URMLPackage#getRule_Condition()
	 * @see OntoUML.URML.Condition#getConditionRule
	 * @model opposite="conditionRule"
	 * @generated
	 */
	EList<Condition> getCondition();

} // Rule
