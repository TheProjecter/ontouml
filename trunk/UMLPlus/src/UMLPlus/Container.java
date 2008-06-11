/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package UMLPlus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UMLPlus.Container#getInstanciarElement <em>Instanciar Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see UMLPlus.UMLPlusPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Instanciar Element</b></em>' containment reference list.
	 * The list contents are of type {@link UMLPlus.Element}.
	 * It is bidirectional and its opposite is '{@link UMLPlus.Element#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instanciar Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instanciar Element</em>' containment reference list.
	 * @see UMLPlus.UMLPlusPackage#getContainer_InstanciarElement()
	 * @see UMLPlus.Element#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Element> getInstanciarElement();

} // Container
