/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.validation;

import OntoUML.Classifier;
import OntoUML.Generalization;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link OntoUML.Classifier}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ClassifierValidator {
	boolean validate();

	boolean validateIsAbstract(boolean value);
	boolean validateGeneral(EList<Classifier> value);
	boolean validateGeneralization(EList<Generalization> value);
}