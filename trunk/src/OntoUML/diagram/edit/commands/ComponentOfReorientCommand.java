package OntoUML.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ComponentOfReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ComponentOfReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof OntoUML.componentOf) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof OntoUML.Element && newEnd instanceof OntoUML.Element)) {
			return false;
		}
		if (getLink().getTargetAux1().size() != 1) {
			return false;
		}
		OntoUML.Element target = (OntoUML.Element) getLink().getTargetAux1()
				.get(0);
		if (!(getLink().eContainer() instanceof OntoUML.Container)) {
			return false;
		}
		OntoUML.Container container = (OntoUML.Container) getLink()
				.eContainer();
		return OntoUML.diagram.edit.policies.OntoUMLBaseItemSemanticEditPolicy.LinkConstraints
				.canExistComponentOf_4002(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof OntoUML.Element && newEnd instanceof OntoUML.Element)) {
			return false;
		}
		if (getLink().getSourceAux1().size() != 1) {
			return false;
		}
		OntoUML.Element source = (OntoUML.Element) getLink().getSourceAux1()
				.get(0);
		if (!(getLink().eContainer() instanceof OntoUML.Container)) {
			return false;
		}
		OntoUML.Container container = (OntoUML.Container) getLink()
				.eContainer();
		return OntoUML.diagram.edit.policies.OntoUMLBaseItemSemanticEditPolicy.LinkConstraints
				.canExistComponentOf_4002(container, source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().getSourceAux1().remove(getOldSource());
		getLink().getSourceAux1().add(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getTargetAux1().remove(getOldTarget());
		getLink().getTargetAux1().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected OntoUML.componentOf getLink() {
		return (OntoUML.componentOf) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected OntoUML.Element getOldSource() {
		return (OntoUML.Element) oldEnd;
	}

	/**
	 * @generated
	 */
	protected OntoUML.Element getNewSource() {
		return (OntoUML.Element) newEnd;
	}

	/**
	 * @generated
	 */
	protected OntoUML.Element getOldTarget() {
		return (OntoUML.Element) oldEnd;
	}

	/**
	 * @generated
	 */
	protected OntoUML.Element getNewTarget() {
		return (OntoUML.Element) newEnd;
	}
}
