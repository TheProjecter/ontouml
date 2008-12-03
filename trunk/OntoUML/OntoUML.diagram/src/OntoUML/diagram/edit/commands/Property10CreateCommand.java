package OntoUML.diagram.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Property10CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public Property10CreateCommand(CreateElementRequest req) {
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
		return OntoUML.OntoUMLPackage.eINSTANCE.getElement();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		OntoUML.Property newElement = OntoUML.OntoUMLFactory.eINSTANCE
				.createProperty();

		OntoUML.Element owner = (OntoUML.Element) getElementToEdit();
		owner.getAttribute().add(newElement);

		OntoUML.diagram.providers.OntoUMLElementTypes
				.init_Property_3009(newElement);
		return newElement;
	}

}
