package OntoUML.diagram.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CategoryCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public CategoryCreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return OntoUML.OntoUMLPackage.eINSTANCE.getContainer();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		OntoUML.Category newElement = OntoUML.OntoUMLFactory.eINSTANCE
				.createCategory();

		OntoUML.Container owner = (OntoUML.Container) getElementToEdit();
		owner.getInstanciarElement().add(newElement);

		OntoUML.diagram.providers.OntoUMLElementTypes
				.init_Category_2001(newElement);
		return newElement;
	}

}
