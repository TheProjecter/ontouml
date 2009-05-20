/******************************************************************************
 * Copyright (c) 2006, 2007 Borland Software Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Richard Gronback (Borland) - initial API and implementation 
 *    Cherie Revells (IBM)
 ****************************************************************************/
package OntoUML.diagram.part;

import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import OntoUML.diagram.edit.parts.KindEditPart;
import OntoUML.diagram.edit.parts.ComponentOfEditPart;
import OntoUML.diagram.providers.OntoUMLElementTypes;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class OntoUMLCreateKindAction implements IObjectActionDelegate {

	public final static String ID = "org.eclipse.gmf.examples.mindmap.popup.MindmapCreateSubtopicActionID";

	private KindEditPart selectedElement;

	public void run(IAction action) {
		CompoundCommand cc = new CompoundCommand("Create Kind");

		// Create the new topic for the other end.
		CreateViewRequest kindRequest = CreateViewRequestFactory.getCreateShapeRequest(OntoUMLElementTypes.Kind_2003, selectedElement.getDiagramPreferencesHint());

		Point p = selectedElement.getFigure().getBounds().getTopRight().getCopy();
		selectedElement.getFigure().translateToAbsolute(p);
		int edgeCount = selectedElement.getNotationView().getSourceEdges().size();
		// A quick hack to get subtopics to layout to the right, from top to bottom
		int offset = (edgeCount * 50) - 100;
		kindRequest.setLocation(p.translate(100, offset));

		ComponentOfEditPart componentOfEditPart = (ComponentOfEditPart) selectedElement.getParent();
		Command createKindCmd = componentOfEditPart.getCommand(kindRequest);
		IAdaptable topicViewAdapter = (IAdaptable) ((List) kindRequest.getNewObject()).get(0);

		cc.add(createKindCmd);

		// create the subtopics link command
		ICommand createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(OntoUMLElementTypes.ComponentOf_4002,
				((IHintedType) OntoUMLElementTypes.ComponentOf_4002).getSemanticHint(), selectedElement.getDiagramPreferencesHint()), new EObjectAdapter((EObject) selectedElement.getModel()),
				topicViewAdapter, selectedElement.getViewer());

		cc.add(new ICommandProxy(createSubTopicsCmd));

		selectedElement.getDiagramEditDomain().getDiagramCommandStack().execute(cc);

		// put the new topic in edit mode
		final EditPartViewer viewer = selectedElement.getViewer();
		final EditPart elementPart = (EditPart) viewer.getEditPartRegistry().get(topicViewAdapter.getAdapter(View.class));
		if (elementPart != null) {
			Display.getCurrent().asyncExec(new Runnable() {

				public void run() {
					viewer.setSelection(new StructuredSelection(elementPart));
					Request der = new Request(RequestConstants.REQ_DIRECT_EDIT);
					elementPart.performRequest(der);
				}
			});
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		selectedElement = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof KindEditPart) {
				selectedElement = (KindEditPart) structuredSelection.getFirstElement();
			}
		}
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

}
