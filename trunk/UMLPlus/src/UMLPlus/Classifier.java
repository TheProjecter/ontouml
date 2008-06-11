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
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UMLPlus.Classifier#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link UMLPlus.Classifier#getGeneral <em>General</em>}</li>
 *   <li>{@link UMLPlus.Classifier#getGeneralization <em>Generalization</em>}</li>
 * </ul>
 * </p>
 *
 * @see UMLPlus.UMLPlusPackage#getClassifier()
 * @model
 * @generated
 */
public interface Classifier extends Type {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see UMLPlus.UMLPlusPackage#getClassifier_IsAbstract()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link UMLPlus.Classifier#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>General</b></em>' reference list.
	 * The list contents are of type {@link UMLPlus.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference list.
	 * @see UMLPlus.UMLPlusPackage#getClassifier_General()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/ocl/examples/OCL derive='self.allSuperTypes()'"
	 * @generated
	 */
	EList<Classifier> getGeneral();

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' containment reference list.
	 * The list contents are of type {@link UMLPlus.Generalization}.
	 * It is bidirectional and its opposite is '{@link UMLPlus.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization</em>' containment reference list.
	 * @see UMLPlus.UMLPlusPackage#getClassifier_Generalization()
	 * @see UMLPlus.Generalization#getSpecific
	 * @model opposite="specific" containment="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/ocl/examples/OCL derive='Generalization.allInstances()->select(x | x.specific = self)'"
	 * @generated
	 */
	EList<Generalization> getGeneralization();

} // Classifier
