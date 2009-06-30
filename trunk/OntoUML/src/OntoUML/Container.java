/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML;

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
 *   <li>{@link OntoUML.Container#getInstanciarElement <em>Instanciar Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see OntoUML.OntoUMLPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Instanciar Element</b></em>' containment reference list.
	 * The list contents are of type {@link OntoUML.Element}.
	 * It is bidirectional and its opposite is '{@link OntoUML.Element#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instanciar Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instanciar Element</em>' containment reference list.
	 * @see OntoUML.OntoUMLPackage#getContainer_InstanciarElement()
	 * @see OntoUML.Element#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Element> getInstanciarElement();

} // Container
