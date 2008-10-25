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
public class PropertyReorientCommand extends EditElementCommand {

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
	public PropertyReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof OntoUML.Property) {
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
		if (!(oldEnd instanceof OntoUML.Property && newEnd instanceof OntoUML.Property)) {
			return false;
		}
		OntoUML.DirectedBinaryRelationship target = getLink().getSource();
		if (!(getLink().eContainer() instanceof OntoUML.Container)) {
			return false;
		}
		OntoUML.Container container = (OntoUML.Container) getLink()
				.eContainer();
		return OntoUML.diagram.edit.policies.OntoUMLBaseItemSemanticEditPolicy.LinkConstraints
				.canExistProperty_4012(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof OntoUML.DirectedBinaryRelationship && newEnd instanceof OntoUML.DirectedBinaryRelationship)) {
			return false;
		}
		OntoUML.Property source = getLink().getAux();
		if (!(getLink().eContainer() instanceof OntoUML.Container)) {
			return false;
		}
		OntoUML.Container container = (OntoUML.Container) getLink()
				.eContainer();
		return OntoUML.diagram.edit.policies.OntoUMLBaseItemSemanticEditPolicy.LinkConstraints
				.canExistProperty_4012(container, source, getNewTarget());
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
		getLink().setAux(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setSource(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected OntoUML.Property getLink() {
		return (OntoUML.Property) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected OntoUML.Property getOldSource() {
		return (OntoUML.Property) oldEnd;
	}

	/**
	 * @generated
	 */
	protected OntoUML.Property getNewSource() {
		return (OntoUML.Property) newEnd;
	}

	/**
	 * @generated
	 */
	protected OntoUML.DirectedBinaryRelationship getOldTarget() {
		return (OntoUML.DirectedBinaryRelationship) oldEnd;
	}

	/**
	 * @generated
	 */
	protected OntoUML.DirectedBinaryRelationship getNewTarget() {
		return (OntoUML.DirectedBinaryRelationship) newEnd;
	}
}
