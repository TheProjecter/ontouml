package OntoUML.diagram.providers;

import java.util.Collection;

import org.eclipse.emf.ecore.EcorePackage;

/**
 * @generated
 */
public class ElementInitializers {
	/**
	 * @generated
	 */
	public static void init_Category_2001(OntoUML.Category instance) {
		try {
			Object value_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("true",
							OntoUML.OntoUMLPackage.eINSTANCE.getCategory())
					.evaluate(instance);
			instance.setIsAbstract(((Boolean) value_0).booleanValue());
		} catch (RuntimeException e) {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Mixin_2004(OntoUML.Mixin instance) {
		try {
			Object value_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("true",
							OntoUML.OntoUMLPackage.eINSTANCE.getMixin())
					.evaluate(instance);
			instance.setIsAbstract(((Boolean) value_0).booleanValue());
		} catch (RuntimeException e) {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_RoleMixin_2010(OntoUML.RoleMixin instance) {
		try {
			Object value_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("true",
							OntoUML.OntoUMLPackage.eINSTANCE.getRoleMixin())
					.evaluate(instance);
			instance.setIsAbstract(((Boolean) value_0).booleanValue());
		} catch (RuntimeException e) {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_DerivationRule_2015(
			OntoUML.URML.DerivationRule instance) {
		try {
			Object value_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"\'RuleID\'",
							OntoUML.URML.URMLPackage.eINSTANCE
									.getDerivationRule()).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Characterization_4001(
			OntoUML.Characterization instance) {
		try {
			OntoUML.Property newInstance_0_0 = OntoUML.OntoUMLFactory.eINSTANCE
					.createProperty();

			instance.getSourceAux2().add(newInstance_0_0);
			Object value_0_0_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"null -- I used this Feature Value Spec to be able to create the new Property instance.",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_0);
			newInstance_0_0
					.setAssociationEnd((OntoUML.Association) value_0_0_0);

			OntoUML.Property newInstance_1_0 = OntoUML.OntoUMLFactory.eINSTANCE
					.createProperty();

			instance.getTargetAux2().add(newInstance_1_0);
			Object value_1_0_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"null -- I used this Feature Value Spec to be able to create the new Property instance.",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_1_0);
			newInstance_1_0
					.setAssociationEnd((OntoUML.Association) value_1_0_0);

			Object value_2 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"sourceAux2",
							OntoUML.OntoUMLPackage.eINSTANCE
									.getCharacterization()).evaluate(instance);
			if (value_2 instanceof Collection) {
				instance.getSource().clear();
				instance.getSource().addAll(((Collection) value_2));
			} else {
				instance.getSource().add((OntoUML.Element) value_2);
			}
			Object value_3 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"targetAux2",
							OntoUML.OntoUMLPackage.eINSTANCE
									.getCharacterization()).evaluate(instance);
			if (value_3 instanceof Collection) {
				instance.getTarget().clear();
				instance.getTarget().addAll(((Collection) value_3));
			} else {
				instance.getTarget().add((OntoUML.Element) value_3);
			}
		} catch (RuntimeException e) {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_ComponentOf_4002(OntoUML.componentOf instance) {
		try {
			OntoUML.Property newInstance_0_0 = OntoUML.OntoUMLFactory.eINSTANCE
					.createProperty();

			instance.getSourceAux2().add(newInstance_0_0);
			Object value_0_0_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"null -- I used this Feature Value Spec to be able to create the new Property instance.",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_0);
			newInstance_0_0
					.setAssociationEnd((OntoUML.Association) value_0_0_0);

			OntoUML.Property newInstance_1_0 = OntoUML.OntoUMLFactory.eINSTANCE
					.createProperty();

			instance.getTargetAux2().add(newInstance_1_0);
			Object value_1_0_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"null -- I used this Feature Value Spec to be able to create the new Property instance.",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_1_0);
			newInstance_1_0
					.setAssociationEnd((OntoUML.Association) value_1_0_0);

			Object value_2 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("sourceAux2",
							OntoUML.OntoUMLPackage.eINSTANCE.getcomponentOf())
					.evaluate(instance);
			if (value_2 instanceof Collection) {
				instance.getSource().clear();
				instance.getSource().addAll(((Collection) value_2));
			} else {
				instance.getSource().add((OntoUML.Element) value_2);
			}
			Object value_3 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("targetAux2",
							OntoUML.OntoUMLPackage.eINSTANCE.getcomponentOf())
					.evaluate(instance);
			if (value_3 instanceof Collection) {
				instance.getTarget().clear();
				instance.getTarget().addAll(((Collection) value_3));
			} else {
				instance.getTarget().add((OntoUML.Element) value_3);
			}
		} catch (RuntimeException e) {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_DatatypeAssociation_4003(
			OntoUML.DatatypeAssociation instance) {
		try {
			OntoUML.Property newInstance_0_0 = OntoUML.OntoUMLFactory.eINSTANCE
					.createProperty();

			instance.getAttribute().add(newInstance_0_0);
			Object value_0_0_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"if self.owner.oclIsKindOf(Association) then self.owner.oclAsType(Association) else null endif",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_0);
			newInstance_0_0
					.setAssociationEnd((OntoUML.Association) value_0_0_0);
			Object value_0_0_1 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("0",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_0);

			value_0_0_1 = OntoUML.diagram.expressions.OntoUMLAbstractExpression
					.performCast(value_0_0_1, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_0.setLower(((Integer) value_0_0_1).intValue());
			Object value_0_0_2 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("-1",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_0);

			value_0_0_2 = OntoUML.diagram.expressions.OntoUMLAbstractExpression
					.performCast(value_0_0_2, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_0.setUpper(((Integer) value_0_0_2).intValue());
			Object value_0_0_3 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("1",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_0);

			value_0_0_3 = OntoUML.diagram.expressions.OntoUMLAbstractExpression
					.performCast(value_0_0_3, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_0
					.setAssociationEndPositionAux(((Integer) value_0_0_3)
							.intValue());

			OntoUML.Property newInstance_0_1 = OntoUML.OntoUMLFactory.eINSTANCE
					.createProperty();

			instance.getAttribute().add(newInstance_0_1);
			Object value_0_1_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"if self.owner.oclIsKindOf(Association) then self.owner.oclAsType(Association) else null endif",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_1);
			newInstance_0_1
					.setAssociationEnd((OntoUML.Association) value_0_1_0);
			Object value_0_1_1 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("1",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_1);

			value_0_1_1 = OntoUML.diagram.expressions.OntoUMLAbstractExpression
					.performCast(value_0_1_1, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_1.setLower(((Integer) value_0_1_1).intValue());
			Object value_0_1_2 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("1",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_1);

			value_0_1_2 = OntoUML.diagram.expressions.OntoUMLAbstractExpression
					.performCast(value_0_1_2, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_1.setUpper(((Integer) value_0_1_2).intValue());
			Object value_0_1_3 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("true",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_1);
			newInstance_0_1.setIsNavigable(((Boolean) value_0_1_3)
					.booleanValue());
			Object value_0_1_4 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("2",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_1);

			value_0_1_4 = OntoUML.diagram.expressions.OntoUMLAbstractExpression
					.performCast(value_0_1_4, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_1
					.setAssociationEndPositionAux(((Integer) value_0_1_4)
							.intValue());

		} catch (RuntimeException e) {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Derivation_4004(OntoUML.Derivation instance) {
		try {
			OntoUML.Property newInstance_0_0 = OntoUML.OntoUMLFactory.eINSTANCE
					.createProperty();

			instance.getSourceAux2().add(newInstance_0_0);
			Object value_0_0_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"null -- I used this Feature Value Spec to be able to create the new Property instance.",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_0);
			newInstance_0_0
					.setAssociationEnd((OntoUML.Association) value_0_0_0);

			OntoUML.Property newInstance_1_0 = OntoUML.OntoUMLFactory.eINSTANCE
					.createProperty();

			instance.getTargetAux2().add(newInstance_1_0);
			Object value_1_0_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("1",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_1_0);

			value_1_0_0 = OntoUML.diagram.expressions.OntoUMLAbstractExpression
					.performCast(value_1_0_0, EcorePackage.eINSTANCE.getEInt());
			newInstance_1_0.setLower(((Integer) value_1_0_0).intValue());
			Object value_1_0_1 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("1",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_1_0);

			value_1_0_1 = OntoUML.diagram.expressions.OntoUMLAbstractExpression
					.performCast(value_1_0_1, EcorePackage.eINSTANCE.getEInt());
			newInstance_1_0.setUpper(((Integer) value_1_0_1).intValue());
			Object value_1_0_2 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("true",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_1_0);
			newInstance_1_0.setIsReadOnly(((Boolean) value_1_0_2)
					.booleanValue());

			Object value_2 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("sourceAux2",
							OntoUML.OntoUMLPackage.eINSTANCE.getDerivation())
					.evaluate(instance);
			if (value_2 instanceof Collection) {
				instance.getSource().clear();
				instance.getSource().addAll(((Collection) value_2));
			} else {
				instance.getSource().add((OntoUML.Element) value_2);
			}
			Object value_3 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("targetAux2",
							OntoUML.OntoUMLPackage.eINSTANCE.getDerivation())
					.evaluate(instance);
			if (value_3 instanceof Collection) {
				instance.getTarget().clear();
				instance.getTarget().addAll(((Collection) value_3));
			} else {
				instance.getTarget().add((OntoUML.Element) value_3);
			}
		} catch (RuntimeException e) {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_FormalAssociation_4005(
			OntoUML.FormalAssociation instance) {
		try {
			OntoUML.Property newInstance_0_0 = OntoUML.OntoUMLFactory.eINSTANCE
					.createProperty();

			instance.getAttribute().add(newInstance_0_0);
			Object value_0_0_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"if self.owner.oclIsKindOf(Association) then self.owner.oclAsType(Association) else null endif",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_0);
			newInstance_0_0
					.setAssociationEnd((OntoUML.Association) value_0_0_0);
			Object value_0_0_1 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("1",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_0);

			value_0_0_1 = OntoUML.diagram.expressions.OntoUMLAbstractExpression
					.performCast(value_0_0_1, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_0
					.setAssociationEndPositionAux(((Integer) value_0_0_1)
							.intValue());

			OntoUML.Property newInstance_0_1 = OntoUML.OntoUMLFactory.eINSTANCE
					.createProperty();

			instance.getAttribute().add(newInstance_0_1);
			Object value_0_1_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"if self.owner.oclIsKindOf(Association) then self.owner.oclAsType(Association) else null endif",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_1);
			newInstance_0_1
					.setAssociationEnd((OntoUML.Association) value_0_1_0);
			Object value_0_1_1 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("2",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_1);

			value_0_1_1 = OntoUML.diagram.expressions.OntoUMLAbstractExpression
					.performCast(value_0_1_1, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_1
					.setAssociationEndPositionAux(((Integer) value_0_1_1)
							.intValue());

		} catch (RuntimeException e) {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_MaterialAssociation_4007(
			OntoUML.MaterialAssociation instance) {
		try {
			OntoUML.Property newInstance_0_0 = OntoUML.OntoUMLFactory.eINSTANCE
					.createProperty();

			instance.getAttribute().add(newInstance_0_0);
			Object value_0_0_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"if self.owner.oclIsKindOf(Association) then self.owner.oclAsType(Association) else null endif",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_0);
			newInstance_0_0
					.setAssociationEnd((OntoUML.Association) value_0_0_0);
			Object value_0_0_1 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("true",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_0);
			newInstance_0_0
					.setIsDerived(((Boolean) value_0_0_1).booleanValue());
			Object value_0_0_2 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("1",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_0);

			value_0_0_2 = OntoUML.diagram.expressions.OntoUMLAbstractExpression
					.performCast(value_0_0_2, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_0
					.setAssociationEndPositionAux(((Integer) value_0_0_2)
							.intValue());

			OntoUML.Property newInstance_0_1 = OntoUML.OntoUMLFactory.eINSTANCE
					.createProperty();

			instance.getAttribute().add(newInstance_0_1);
			Object value_0_1_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"if self.owner.oclIsKindOf(Association) then self.owner.oclAsType(Association) else null endif",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_1);
			newInstance_0_1
					.setAssociationEnd((OntoUML.Association) value_0_1_0);
			Object value_0_1_1 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("true",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_1);
			newInstance_0_1
					.setIsDerived(((Boolean) value_0_1_1).booleanValue());
			Object value_0_1_2 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("2",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_1);

			value_0_1_2 = OntoUML.diagram.expressions.OntoUMLAbstractExpression
					.performCast(value_0_1_2, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_1
					.setAssociationEndPositionAux(((Integer) value_0_1_2)
							.intValue());

		} catch (RuntimeException e) {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Mediation_4008(OntoUML.Mediation instance) {
		try {
			OntoUML.Property newInstance_0_0 = OntoUML.OntoUMLFactory.eINSTANCE
					.createProperty();

			instance.getSourceAux2().add(newInstance_0_0);
			Object value_0_0_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("1",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_0);

			value_0_0_0 = OntoUML.diagram.expressions.OntoUMLAbstractExpression
					.performCast(value_0_0_0, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_0.setLower(((Integer) value_0_0_0).intValue());
			Object value_0_0_1 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("1",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_0);

			value_0_0_1 = OntoUML.diagram.expressions.OntoUMLAbstractExpression
					.performCast(value_0_0_1, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_0.setUpper(((Integer) value_0_0_1).intValue());

			OntoUML.Property newInstance_1_0 = OntoUML.OntoUMLFactory.eINSTANCE
					.createProperty();

			instance.getTargetAux2().add(newInstance_1_0);
			Object value_1_0_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("true",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_1_0);
			newInstance_1_0.setIsReadOnly(((Boolean) value_1_0_0)
					.booleanValue());
			Object value_1_0_1 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("1",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_1_0);

			value_1_0_1 = OntoUML.diagram.expressions.OntoUMLAbstractExpression
					.performCast(value_1_0_1, EcorePackage.eINSTANCE.getEInt());
			newInstance_1_0.setLower(((Integer) value_1_0_1).intValue());
			Object value_1_0_2 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("1",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_1_0);

			value_1_0_2 = OntoUML.diagram.expressions.OntoUMLAbstractExpression
					.performCast(value_1_0_2, EcorePackage.eINSTANCE.getEInt());
			newInstance_1_0.setUpper(((Integer) value_1_0_2).intValue());

			Object value_2 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("sourceAux2",
							OntoUML.OntoUMLPackage.eINSTANCE.getMediation())
					.evaluate(instance);
			if (value_2 instanceof Collection) {
				instance.getSource().clear();
				instance.getSource().addAll(((Collection) value_2));
			} else {
				instance.getSource().add((OntoUML.Element) value_2);
			}
			Object value_3 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("targetAux2",
							OntoUML.OntoUMLPackage.eINSTANCE.getMediation())
					.evaluate(instance);
			if (value_3 instanceof Collection) {
				instance.getTarget().clear();
				instance.getTarget().addAll(((Collection) value_3));
			} else {
				instance.getTarget().add((OntoUML.Element) value_3);
			}
		} catch (RuntimeException e) {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_MemberOf_4009(OntoUML.memberOf instance) {
		try {
			OntoUML.Property newInstance_0_0 = OntoUML.OntoUMLFactory.eINSTANCE
					.createProperty();

			instance.getSourceAux2().add(newInstance_0_0);
			Object value_0_0_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"null -- I used this Feature Value Spec to be able to create the new Property instance.",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_0);
			newInstance_0_0
					.setAssociationEnd((OntoUML.Association) value_0_0_0);

			OntoUML.Property newInstance_1_0 = OntoUML.OntoUMLFactory.eINSTANCE
					.createProperty();

			instance.getTargetAux2().add(newInstance_1_0);
			Object value_1_0_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"null -- I used this Feature Value Spec to be able to create the new Property instance.",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_1_0);
			newInstance_1_0
					.setAssociationEnd((OntoUML.Association) value_1_0_0);

			Object value_2 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("sourceAux2",
							OntoUML.OntoUMLPackage.eINSTANCE.getmemberOf())
					.evaluate(instance);
			if (value_2 instanceof Collection) {
				instance.getSource().clear();
				instance.getSource().addAll(((Collection) value_2));
			} else {
				instance.getSource().add((OntoUML.Element) value_2);
			}
			Object value_3 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("targetAux2",
							OntoUML.OntoUMLPackage.eINSTANCE.getmemberOf())
					.evaluate(instance);
			if (value_3 instanceof Collection) {
				instance.getTarget().clear();
				instance.getTarget().addAll(((Collection) value_3));
			} else {
				instance.getTarget().add((OntoUML.Element) value_3);
			}
		} catch (RuntimeException e) {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_SubCollectionOf_4010(
			OntoUML.subCollectionOf instance) {
		try {
			OntoUML.Property newInstance_0_0 = OntoUML.OntoUMLFactory.eINSTANCE
					.createProperty();

			instance.getSourceAux2().add(newInstance_0_0);
			Object value_0_0_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"null -- I used this Feature Value Spec to be able to create the new Property instance.",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_0);
			newInstance_0_0
					.setAssociationEnd((OntoUML.Association) value_0_0_0);

			OntoUML.Property newInstance_1_0 = OntoUML.OntoUMLFactory.eINSTANCE
					.createProperty();

			instance.getTargetAux2().add(newInstance_1_0);
			Object value_1_0_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("1",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_1_0);

			value_1_0_0 = OntoUML.diagram.expressions.OntoUMLAbstractExpression
					.performCast(value_1_0_0, EcorePackage.eINSTANCE.getEInt());
			newInstance_1_0.setUpper(((Integer) value_1_0_0).intValue());

			Object value_2 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"sourceAux2",
							OntoUML.OntoUMLPackage.eINSTANCE
									.getsubCollectionOf()).evaluate(instance);
			if (value_2 instanceof Collection) {
				instance.getSource().clear();
				instance.getSource().addAll(((Collection) value_2));
			} else {
				instance.getSource().add((OntoUML.Element) value_2);
			}
			Object value_3 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"targetAux2",
							OntoUML.OntoUMLPackage.eINSTANCE
									.getsubCollectionOf()).evaluate(instance);
			if (value_3 instanceof Collection) {
				instance.getTarget().clear();
				instance.getTarget().addAll(((Collection) value_3));
			} else {
				instance.getTarget().add((OntoUML.Element) value_3);
			}
		} catch (RuntimeException e) {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_SubQuantityOf_4011(OntoUML.subQuantityOf instance) {
		try {
			OntoUML.Property newInstance_0_0 = OntoUML.OntoUMLFactory.eINSTANCE
					.createProperty();

			instance.getSourceAux2().add(newInstance_0_0);
			Object value_0_0_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression(
							"null -- I used this Feature Value Spec to be able to create the new Property instance.",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_0_0);
			newInstance_0_0
					.setAssociationEnd((OntoUML.Association) value_0_0_0);

			OntoUML.Property newInstance_1_0 = OntoUML.OntoUMLFactory.eINSTANCE
					.createProperty();

			instance.getTargetAux2().add(newInstance_1_0);
			Object value_1_0_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("1",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(newInstance_1_0);

			value_1_0_0 = OntoUML.diagram.expressions.OntoUMLAbstractExpression
					.performCast(value_1_0_0, EcorePackage.eINSTANCE.getEInt());
			newInstance_1_0.setUpper(((Integer) value_1_0_0).intValue());

			Object value_2 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("sourceAux2",
							OntoUML.OntoUMLPackage.eINSTANCE.getsubQuantityOf())
					.evaluate(instance);
			if (value_2 instanceof Collection) {
				instance.getSource().clear();
				instance.getSource().addAll(((Collection) value_2));
			} else {
				instance.getSource().add((OntoUML.Element) value_2);
			}
			Object value_3 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("targetAux2",
							OntoUML.OntoUMLPackage.eINSTANCE.getsubQuantityOf())
					.evaluate(instance);
			if (value_3 instanceof Collection) {
				instance.getTarget().clear();
				instance.getTarget().addAll(((Collection) value_3));
			} else {
				instance.getTarget().add((OntoUML.Element) value_3);
			}
			Object value_4 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("false",
							OntoUML.OntoUMLPackage.eINSTANCE.getsubQuantityOf())
					.evaluate(instance);
			instance.setIsShareable(((Boolean) value_4).booleanValue());
			Object value_5 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("true",
							OntoUML.OntoUMLPackage.eINSTANCE.getsubQuantityOf())
					.evaluate(instance);
			instance.setIsEssential(((Boolean) value_5).booleanValue());
		} catch (RuntimeException e) {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Property_4012(OntoUML.Property instance) {
		try {
			Object value_0 = OntoUML.diagram.expressions.OntoUMLOCLFactory
					.getExpression("self",
							OntoUML.OntoUMLPackage.eINSTANCE.getProperty())
					.evaluate(instance);
			instance.setAux((OntoUML.Property) value_0);
		} catch (RuntimeException e) {
			OntoUML.diagram.part.OntoUMLDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

}
