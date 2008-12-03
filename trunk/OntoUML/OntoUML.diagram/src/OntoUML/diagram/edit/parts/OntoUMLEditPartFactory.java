package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class OntoUMLEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (OntoUML.diagram.part.OntoUMLVisualIDRegistry
					.getVisualID(view)) {

			case OntoUML.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.ContainerEditPart(view);

			case OntoUML.diagram.edit.parts.CategoryEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.CategoryEditPart(view);

			case OntoUML.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case OntoUML.diagram.edit.parts.CategoryNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.CategoryNameEditPart(view);

			case OntoUML.diagram.edit.parts.CollectiveEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.CollectiveEditPart(view);

			case OntoUML.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case OntoUML.diagram.edit.parts.CollectiveNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.CollectiveNameEditPart(
						view);

			case OntoUML.diagram.edit.parts.KindEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.KindEditPart(view);

			case OntoUML.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabel3EditPart(
						view);

			case OntoUML.diagram.edit.parts.KindNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.KindNameEditPart(view);

			case OntoUML.diagram.edit.parts.MixinEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.MixinEditPart(view);

			case OntoUML.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabel4EditPart(
						view);

			case OntoUML.diagram.edit.parts.MixinNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.MixinNameEditPart(view);

			case OntoUML.diagram.edit.parts.ModeEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.ModeEditPart(view);

			case OntoUML.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabel5EditPart(
						view);

			case OntoUML.diagram.edit.parts.ModeNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.ModeNameEditPart(view);

			case OntoUML.diagram.edit.parts.PhaseEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.PhaseEditPart(view);

			case OntoUML.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabel6EditPart(
						view);

			case OntoUML.diagram.edit.parts.PhaseNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.PhaseNameEditPart(view);

			case OntoUML.diagram.edit.parts.QuantityEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.QuantityEditPart(view);

			case OntoUML.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabel7EditPart(
						view);

			case OntoUML.diagram.edit.parts.QuantityNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.QuantityNameEditPart(view);

			case OntoUML.diagram.edit.parts.RelatorEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.RelatorEditPart(view);

			case OntoUML.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabel8EditPart(
						view);

			case OntoUML.diagram.edit.parts.RelatorNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.RelatorNameEditPart(view);

			case OntoUML.diagram.edit.parts.RoleEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.RoleEditPart(view);

			case OntoUML.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabel9EditPart(
						view);

			case OntoUML.diagram.edit.parts.RoleNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.RoleNameEditPart(view);

			case OntoUML.diagram.edit.parts.RoleMixinEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.RoleMixinEditPart(view);

			case OntoUML.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabel10EditPart(
						view);

			case OntoUML.diagram.edit.parts.RoleMixinNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.RoleMixinNameEditPart(
						view);

			case OntoUML.diagram.edit.parts.SimpleDatatypeEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.SimpleDatatypeEditPart(
						view);

			case OntoUML.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabel11EditPart(
						view);

			case OntoUML.diagram.edit.parts.SimpleDatatypeNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.SimpleDatatypeNameEditPart(
						view);

			case OntoUML.diagram.edit.parts.StructuralDatatypeEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.StructuralDatatypeEditPart(
						view);

			case OntoUML.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabel12EditPart(
						view);

			case OntoUML.diagram.edit.parts.StructuralDatatypeNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.StructuralDatatypeNameEditPart(
						view);

			case OntoUML.diagram.edit.parts.SubKindEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.SubKindEditPart(view);

			case OntoUML.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabel13EditPart(
						view);

			case OntoUML.diagram.edit.parts.SubKindNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.SubKindNameEditPart(view);

			case OntoUML.diagram.edit.parts.GeneralizationSetEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.GeneralizationSetEditPart(
						view);

			case OntoUML.diagram.edit.parts.GeneralizationSetNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.GeneralizationSetNameEditPart(
						view);

			case OntoUML.diagram.edit.parts.DerivationRuleEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.DerivationRuleEditPart(
						view);

			case OntoUML.diagram.edit.parts.DerivationRuleNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.DerivationRuleNameEditPart(
						view);

			case OntoUML.diagram.edit.parts.PropertyEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.PropertyEditPart(view);

			case OntoUML.diagram.edit.parts.PropertyNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.PropertyNameEditPart(view);

			case OntoUML.diagram.edit.parts.PropertyLowerUpperEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.PropertyLowerUpperEditPart(
						view);

			case OntoUML.diagram.edit.parts.Property2EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.Property2EditPart(view);

			case OntoUML.diagram.edit.parts.Property3EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.Property3EditPart(view);

			case OntoUML.diagram.edit.parts.Property4EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.Property4EditPart(view);

			case OntoUML.diagram.edit.parts.Property5EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.Property5EditPart(view);

			case OntoUML.diagram.edit.parts.Property6EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.Property6EditPart(view);

			case OntoUML.diagram.edit.parts.Property7EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.Property7EditPart(view);

			case OntoUML.diagram.edit.parts.Property8EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.Property8EditPart(view);

			case OntoUML.diagram.edit.parts.Property9EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.Property9EditPart(view);

			case OntoUML.diagram.edit.parts.Property10EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.Property10EditPart(view);

			case OntoUML.diagram.edit.parts.Property11EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.Property11EditPart(view);

			case OntoUML.diagram.edit.parts.Property12EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.Property12EditPart(view);

			case OntoUML.diagram.edit.parts.Property13EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.Property13EditPart(view);

			case OntoUML.diagram.edit.parts.Property14EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.Property14EditPart(view);

			case OntoUML.diagram.edit.parts.Property15EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.Property15EditPart(view);

			case OntoUML.diagram.edit.parts.CategoryAttributeCompartmentEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.CategoryAttributeCompartmentEditPart(
						view);

			case OntoUML.diagram.edit.parts.CollectiveAttributeCompartmentEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.CollectiveAttributeCompartmentEditPart(
						view);

			case OntoUML.diagram.edit.parts.KindAttributeCompartmentEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.KindAttributeCompartmentEditPart(
						view);

			case OntoUML.diagram.edit.parts.MixinAttributeCompartmentEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.MixinAttributeCompartmentEditPart(
						view);

			case OntoUML.diagram.edit.parts.ModeAttributeCompartmentEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.ModeAttributeCompartmentEditPart(
						view);

			case OntoUML.diagram.edit.parts.PhaseAttributeCompartmentEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.PhaseAttributeCompartmentEditPart(
						view);

			case OntoUML.diagram.edit.parts.QuantityAttributeCompartmentEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.QuantityAttributeCompartmentEditPart(
						view);

			case OntoUML.diagram.edit.parts.RelatorAttributeCompartmentEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.RelatorAttributeCompartmentEditPart(
						view);

			case OntoUML.diagram.edit.parts.RoleAttributeCompartmentEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.RoleAttributeCompartmentEditPart(
						view);

			case OntoUML.diagram.edit.parts.RoleMixinAttributeCompartmentEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.RoleMixinAttributeCompartmentEditPart(
						view);

			case OntoUML.diagram.edit.parts.SimpleDatatypeAttributeCompartmentEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.SimpleDatatypeAttributeCompartmentEditPart(
						view);

			case OntoUML.diagram.edit.parts.StructuralDatatypeAttributeCompartmentEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.StructuralDatatypeAttributeCompartmentEditPart(
						view);

			case OntoUML.diagram.edit.parts.SubKindAttributeCompartmentEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.SubKindAttributeCompartmentEditPart(
						view);

			case OntoUML.diagram.edit.parts.GeneralizationSetAttributeCompartmentEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.GeneralizationSetAttributeCompartmentEditPart(
						view);

			case OntoUML.diagram.edit.parts.CharacterizationEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.CharacterizationEditPart(
						view);

			case OntoUML.diagram.edit.parts.WrappingLabel14EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabel14EditPart(
						view);

			case OntoUML.diagram.edit.parts.CharacterizationNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.CharacterizationNameEditPart(
						view);

			case OntoUML.diagram.edit.parts.ComponentOfEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.ComponentOfEditPart(view);

			case OntoUML.diagram.edit.parts.ComponentOfNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.ComponentOfNameEditPart(
						view);

			case OntoUML.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabel15EditPart(
						view);

			case OntoUML.diagram.edit.parts.DatatypeAssociationEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.DatatypeAssociationEditPart(
						view);

			case OntoUML.diagram.edit.parts.DatatypeAssociationNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.DatatypeAssociationNameEditPart(
						view);

			case OntoUML.diagram.edit.parts.DerivationEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.DerivationEditPart(view);

			case OntoUML.diagram.edit.parts.DerivationNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.DerivationNameEditPart(
						view);

			case OntoUML.diagram.edit.parts.FormalAssociationEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.FormalAssociationEditPart(
						view);

			case OntoUML.diagram.edit.parts.WrappingLabel16EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabel16EditPart(
						view);

			case OntoUML.diagram.edit.parts.FormalAssociationNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.FormalAssociationNameEditPart(
						view);

			case OntoUML.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.GeneralizationEditPart(
						view);

			case OntoUML.diagram.edit.parts.MaterialAssociationEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.MaterialAssociationEditPart(
						view);

			case OntoUML.diagram.edit.parts.WrappingLabel17EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabel17EditPart(
						view);

			case OntoUML.diagram.edit.parts.MaterialAssociationNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.MaterialAssociationNameEditPart(
						view);

			case OntoUML.diagram.edit.parts.MediationEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.MediationEditPart(view);

			case OntoUML.diagram.edit.parts.WrappingLabel18EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabel18EditPart(
						view);

			case OntoUML.diagram.edit.parts.MediationNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.MediationNameEditPart(
						view);

			case OntoUML.diagram.edit.parts.MemberOfEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.MemberOfEditPart(view);

			case OntoUML.diagram.edit.parts.MemberOfNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.MemberOfNameEditPart(view);

			case OntoUML.diagram.edit.parts.WrappingLabel19EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabel19EditPart(
						view);

			case OntoUML.diagram.edit.parts.SubCollectionOfEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.SubCollectionOfEditPart(
						view);

			case OntoUML.diagram.edit.parts.SubCollectionOfNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.SubCollectionOfNameEditPart(
						view);

			case OntoUML.diagram.edit.parts.WrappingLabel20EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabel20EditPart(
						view);

			case OntoUML.diagram.edit.parts.SubQuantityOfEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.SubQuantityOfEditPart(
						view);

			case OntoUML.diagram.edit.parts.SubQuantityOfNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.SubQuantityOfNameEditPart(
						view);

			case OntoUML.diagram.edit.parts.WrappingLabel21EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.WrappingLabel21EditPart(
						view);

			case OntoUML.diagram.edit.parts.Property16EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.Property16EditPart(view);

			case OntoUML.diagram.edit.parts.BinaryAssociationAtomEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.BinaryAssociationAtomEditPart(
						view);

			case OntoUML.diagram.edit.parts.BinaryAssociationAtom2EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.BinaryAssociationAtom2EditPart(
						view);

			case OntoUML.diagram.edit.parts.BinaryAssociationAtom3EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.BinaryAssociationAtom3EditPart(
						view);

			case OntoUML.diagram.edit.parts.BinaryAssociationAtomNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.BinaryAssociationAtomNameEditPart(
						view);

			case OntoUML.diagram.edit.parts.BinaryAssociationAtomName2EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.BinaryAssociationAtomName2EditPart(
						view);

			case OntoUML.diagram.edit.parts.ClassifierAtomEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.ClassifierAtomEditPart(
						view);

			case OntoUML.diagram.edit.parts.ClassifierAtom2EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.ClassifierAtom2EditPart(
						view);

			case OntoUML.diagram.edit.parts.ClassifierAtom3EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.ClassifierAtom3EditPart(
						view);

			case OntoUML.diagram.edit.parts.ClassifierAtomNameEditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.ClassifierAtomNameEditPart(
						view);

			case OntoUML.diagram.edit.parts.ClassifierAtomName2EditPart.VISUAL_ID:
				return new OntoUML.diagram.edit.parts.ClassifierAtomName2EditPart(
						view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapOn()
					&& getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
