package OntoUML.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

/**
 * @generated
 */
public class MemberOfCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	/**
	 * @generated
	 */
	private OntoUML.Container container;

	/**
	 * @generated
	 */
	public MemberOfCreateCommand(CreateRelationshipRequest request,
			EObject source, EObject target) {
		super(request);
		this.source = source;
		this.target = target;
		if (request.getContainmentFeature() == null) {
			setContainmentFeature(OntoUML.OntoUMLPackage.eINSTANCE
					.getContainer_InstanciarElement());
		}

		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null; element = element
				.eContainer()) {
			if (element instanceof OntoUML.Container) {
				container = (OntoUML.Container) element;
				super.setElementToEdit(container);
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof OntoUML.Element) {
			return false;
		}
		if (target != null && false == target instanceof OntoUML.Element) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		if (getContainer() == null) {
			return false;
		}
		return OntoUML.diagram.edit.policies.OntoUMLBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateMemberOf_4009(getContainer(), getSource(),
						getTarget());
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		OntoUML.memberOf newElement = OntoUML.OntoUMLFactory.eINSTANCE
				.creatememberOf();
		getContainer().getInstanciarElement().add(newElement);
		newElement.getSourceAux1().add(getSource());
		newElement.getTargetAux1().add(getTarget());
		OntoUML.diagram.providers.OntoUMLElementTypes
				.init_MemberOf_4009(newElement);
		return newElement;
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
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in create link command"); //$NON-NLS-1$
		}
		return super.doExecuteWithResult(monitor, info);
	}

	/**
	 * @generated
	 */
	protected ConfigureRequest createConfigureRequest() {
		ConfigureRequest request = super.createConfigureRequest();
		request.setParameter(CreateRelationshipRequest.SOURCE, getSource());
		request.setParameter(CreateRelationshipRequest.TARGET, getTarget());
		return request;
	}

	/**
	 * @generated
	 */
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected OntoUML.Element getSource() {
		return (OntoUML.Element) source;
	}

	/**
	 * @generated
	 */
	protected OntoUML.Element getTarget() {
		return (OntoUML.Element) target;
	}

	/**
	 * @generated
	 */
	public OntoUML.Container getContainer() {
		return container;
	}
}
