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
 * A representation of the model object '<em><b>Conclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OntoUML.URML.Conclusion#getConclusionRule <em>Conclusion Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see OntoUML.URML.URMLPackage#getConclusion()
 * @model abstract="true"
 * @generated
 */
public interface Conclusion extends RelationalClassifier {
	/**
	 * Returns the value of the '<em><b>Conclusion Rule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link OntoUML.URML.DerivationRule#getConclusion <em>Conclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conclusion Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conclusion Rule</em>' reference.
	 * @see #setConclusionRule(DerivationRule)
	 * @see OntoUML.URML.URMLPackage#getConclusion_ConclusionRule()
	 * @see OntoUML.URML.DerivationRule#getConclusion
	 * @model opposite="conclusion"
	 * @generated
	 */
	DerivationRule getConclusionRule();

	/**
	 * Sets the value of the '{@link OntoUML.URML.Conclusion#getConclusionRule <em>Conclusion Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conclusion Rule</em>' reference.
	 * @see #getConclusionRule()
	 * @generated
	 */
	void setConclusionRule(DerivationRule value);

} // Conclusion
