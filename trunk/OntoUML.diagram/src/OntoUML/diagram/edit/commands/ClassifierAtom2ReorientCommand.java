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
public class ClassifierAtom2ReorientCommand extends EditElementCommand {

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
	public ClassifierAtom2ReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof OntoUML.URML.ClassifierAtom) {
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
		if (!(oldEnd instanceof OntoUML.URML.Rule && newEnd instanceof OntoUML.URML.Rule)) {
			return false;
		}
		OntoUML.Class target = getLink().getClass_();
		if (!(getLink().eContainer() instanceof OntoUML.Container)) {
			return false;
		}
		OntoUML.Container container = (OntoUML.Container) getLink()
				.eContainer();
		return OntoUML.diagram.edit.policies.OntoUMLBaseItemSemanticEditPolicy.LinkConstraints
				.canExistClassifierAtom_4017(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof OntoUML.Class && newEnd instanceof OntoUML.Class)) {
			return false;
		}
		OntoUML.URML.Rule source = getLink().getConditionRule();
		if (!(getLink().eContainer() instanceof OntoUML.Container)) {
			return false;
		}
		OntoUML.Container container = (OntoUML.Container) getLink()
				.eContainer();
		return OntoUML.diagram.edit.policies.OntoUMLBaseItemSemanticEditPolicy.LinkConstraints
				.canExistClassifierAtom_4017(container, source, getNewTarget());
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
		getLink().setConditionRule(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setClass(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected OntoUML.URML.ClassifierAtom getLink() {
		return (OntoUML.URML.ClassifierAtom) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected OntoUML.URML.Rule getOldSource() {
		return (OntoUML.URML.Rule) oldEnd;
	}

	/**
	 * @generated
	 */
	protected OntoUML.URML.Rule getNewSource() {
		return (OntoUML.URML.Rule) newEnd;
	}

	/**
	 * @generated
	 */
	protected OntoUML.Class getOldTarget() {
		return (OntoUML.Class) oldEnd;
	}

	/**
	 * @generated
	 */
	protected OntoUML.Class getNewTarget() {
		return (OntoUML.Class) newEnd;
	}
}
