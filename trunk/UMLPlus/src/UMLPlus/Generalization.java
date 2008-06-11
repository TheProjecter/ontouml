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
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UMLPlus.Generalization#getSpecific <em>Specific</em>}</li>
 *   <li>{@link UMLPlus.Generalization#getGeneral <em>General</em>}</li>
 *   <li>{@link UMLPlus.Generalization#getSemnome <em>Semnome</em>}</li>
 * </ul>
 * </p>
 *
 * @see UMLPlus.UMLPlusPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Specific</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link UMLPlus.Classifier#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific</em>' container reference.
	 * @see #setSpecific(Classifier)
	 * @see UMLPlus.UMLPlusPackage#getGeneralization_Specific()
	 * @see UMLPlus.Classifier#getGeneralization
	 * @model opposite="generalization" required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/ocl/examples/OCL derive='self.target->any(x | x.oclIsKindOf(Classifier))'"
	 * @generated
	 */
	Classifier getSpecific();

	/**
	 * Sets the value of the '{@link UMLPlus.Generalization#getSpecific <em>Specific</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific</em>' container reference.
	 * @see #getSpecific()
	 * @generated
	 */
	void setSpecific(Classifier value);

	/**
	 * Returns the value of the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference.
	 * @see #setGeneral(Classifier)
	 * @see UMLPlus.UMLPlusPackage#getGeneralization_General()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/ocl/examples/OCL derive='self.source->any(x | x.oclIsKindOf(Classifier))'"
	 * @generated
	 */
	Classifier getGeneral();

	/**
	 * Sets the value of the '{@link UMLPlus.Generalization#getGeneral <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(Classifier value);

	/**
	 * Returns the value of the '<em><b>Semnome</b></em>' reference list.
	 * The list contents are of type {@link UMLPlus.GeneralizationSet}.
	 * It is bidirectional and its opposite is '{@link UMLPlus.GeneralizationSet#getSemnome <em>Semnome</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semnome</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semnome</em>' reference list.
	 * @see UMLPlus.UMLPlusPackage#getGeneralization_Semnome()
	 * @see UMLPlus.GeneralizationSet#getSemnome
	 * @model opposite="semnome"
	 * @generated
	 */
	EList<GeneralizationSet> getSemnome();

} // Generalization
