/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.URML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derivation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OntoUML.URML.DerivationRule#getConclusion <em>Conclusion</em>}</li>
 * </ul>
 * </p>
 *
 * @see OntoUML.URML.URMLPackage#getDerivationRule()
 * @model
 * @generated
 */
public interface DerivationRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Conclusion</b></em>' reference list.
	 * The list contents are of type {@link OntoUML.URML.Conclusion}.
	 * It is bidirectional and its opposite is '{@link OntoUML.URML.Conclusion#getConclusionRule <em>Conclusion Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conclusion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conclusion</em>' reference list.
	 * @see OntoUML.URML.URMLPackage#getDerivationRule_Conclusion()
	 * @see OntoUML.URML.Conclusion#getConclusionRule
	 * @model opposite="conclusionRule"
	 * @generated
	 */
	EList<Conclusion> getConclusion();

} // DerivationRule
