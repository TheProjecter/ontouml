/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.ENamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OntoUML.Generalization#getSpecific <em>Specific</em>}</li>
 *   <li>{@link OntoUML.Generalization#getGeneral <em>General</em>}</li>
 *   <li>{@link OntoUML.Generalization#getGeneralizationSet <em>Generalization Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see OntoUML.OntoUMLPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends DirectedRelationship, NamedElement {
	/**
	 * Returns the value of the '<em><b>Specific</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link OntoUML.Classifier#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific</em>' container reference.
	 * @see #setSpecific(Classifier)
	 * @see OntoUML.OntoUMLPackage#getGeneralization_Specific()
	 * @see OntoUML.Classifier#getGeneralization
	 * @model opposite="generalization" required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/ocl/examples/OCL derive='self.target->any(x | x.oclIsKindOf(Classifier))'"
	 * @generated
	 */
	Classifier getSpecific();

	/**
	 * Sets the value of the '{@link OntoUML.Generalization#getSpecific <em>Specific</em>}' container reference.
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
	 * @see OntoUML.OntoUMLPackage#getGeneralization_General()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/ocl/examples/OCL derive='self.source->any(x | x.oclIsKindOf(Classifier))'"
	 * @generated
	 */
	Classifier getGeneral();

	/**
	 * Sets the value of the '{@link OntoUML.Generalization#getGeneral <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(Classifier value);

	/**
	 * Returns the value of the '<em><b>Generalization Set</b></em>' reference list.
	 * The list contents are of type {@link OntoUML.GeneralizationSet}.
	 * It is bidirectional and its opposite is '{@link OntoUML.GeneralizationSet#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization Set</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization Set</em>' reference list.
	 * @see OntoUML.OntoUMLPackage#getGeneralization_GeneralizationSet()
	 * @see OntoUML.GeneralizationSet#getGeneralization
	 * @model opposite="generalization" ordered="false"
	 * @generated
	 */
	EList<GeneralizationSet> getGeneralizationSet();

} // Generalization
