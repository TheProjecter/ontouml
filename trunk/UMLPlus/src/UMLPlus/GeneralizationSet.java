/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package UMLPlus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UMLPlus.GeneralizationSet#isIsCovering <em>Is Covering</em>}</li>
 *   <li>{@link UMLPlus.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}</li>
 *   <li>{@link UMLPlus.GeneralizationSet#getSemnome <em>Semnome</em>}</li>
 * </ul>
 * </p>
 *
 * @see UMLPlus.UMLPlusPackage#getGeneralizationSet()
 * @model
 * @generated
 */
public interface GeneralizationSet extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is Covering</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Covering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Covering</em>' attribute.
	 * @see #setIsCovering(boolean)
	 * @see UMLPlus.UMLPlusPackage#getGeneralizationSet_IsCovering()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsCovering();

	/**
	 * Sets the value of the '{@link UMLPlus.GeneralizationSet#isIsCovering <em>Is Covering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Covering</em>' attribute.
	 * @see #isIsCovering()
	 * @generated
	 */
	void setIsCovering(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Disjoint</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Disjoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Disjoint</em>' attribute.
	 * @see #setIsDisjoint(boolean)
	 * @see UMLPlus.UMLPlusPackage#getGeneralizationSet_IsDisjoint()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsDisjoint();

	/**
	 * Sets the value of the '{@link UMLPlus.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Disjoint</em>' attribute.
	 * @see #isIsDisjoint()
	 * @generated
	 */
	void setIsDisjoint(boolean value);

	/**
	 * Returns the value of the '<em><b>Semnome</b></em>' reference list.
	 * The list contents are of type {@link UMLPlus.Generalization}.
	 * It is bidirectional and its opposite is '{@link UMLPlus.Generalization#getSemnome <em>Semnome</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semnome</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semnome</em>' reference list.
	 * @see UMLPlus.UMLPlusPackage#getGeneralizationSet_Semnome()
	 * @see UMLPlus.Generalization#getSemnome
	 * @model opposite="semnome"
	 * @generated
	 */
	EList<Generalization> getSemnome();

} // GeneralizationSet
