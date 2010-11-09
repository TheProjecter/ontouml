/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.validation;

import OntoUML.Classifier;
import OntoUML.GeneralizationSet;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link OntoUML.Generalization}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GeneralizationValidator {
	boolean validate();

	boolean validateSpecific(Classifier value);
	boolean validateGeneral(Classifier value);
	boolean validateSemnome(EList<GeneralizationSet> value);
}