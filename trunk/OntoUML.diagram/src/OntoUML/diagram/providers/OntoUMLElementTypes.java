package OntoUML.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class OntoUMLElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private OntoUMLElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Container_1000 = getElementType("OntoUML.diagram.Container_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Category_2001 = getElementType("OntoUML.diagram.Category_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Collective_2002 = getElementType("OntoUML.diagram.Collective_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Kind_2003 = getElementType("OntoUML.diagram.Kind_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Mixin_2004 = getElementType("OntoUML.diagram.Mixin_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Mode_2005 = getElementType("OntoUML.diagram.Mode_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Phase_2006 = getElementType("OntoUML.diagram.Phase_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Quantity_2007 = getElementType("OntoUML.diagram.Quantity_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relator_2008 = getElementType("OntoUML.diagram.Relator_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Role_2009 = getElementType("OntoUML.diagram.Role_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RoleMixin_2010 = getElementType("OntoUML.diagram.RoleMixin_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SimpleDatatype_2011 = getElementType("OntoUML.diagram.SimpleDatatype_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StructuralDatatype_2012 = getElementType("OntoUML.diagram.StructuralDatatype_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SubKind_2013 = getElementType("OntoUML.diagram.SubKind_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GeneralizationSet_2014 = getElementType("OntoUML.diagram.GeneralizationSet_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DerivationRule_2015 = getElementType("OntoUML.diagram.DerivationRule_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Property_3028 = getElementType("OntoUML.diagram.Property_3028"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3029 = getElementType("OntoUML.diagram.Property_3029"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3030 = getElementType("OntoUML.diagram.Property_3030"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3031 = getElementType("OntoUML.diagram.Property_3031"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3032 = getElementType("OntoUML.diagram.Property_3032"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3033 = getElementType("OntoUML.diagram.Property_3033"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3034 = getElementType("OntoUML.diagram.Property_3034"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3035 = getElementType("OntoUML.diagram.Property_3035"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3036 = getElementType("OntoUML.diagram.Property_3036"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3037 = getElementType("OntoUML.diagram.Property_3037"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3038 = getElementType("OntoUML.diagram.Property_3038"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3039 = getElementType("OntoUML.diagram.Property_3039"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3040 = getElementType("OntoUML.diagram.Property_3040"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Characterization_4001 = getElementType("OntoUML.diagram.Characterization_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentOf_4002 = getElementType("OntoUML.diagram.ComponentOf_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DatatypeRelationship_4019 = getElementType("OntoUML.diagram.DatatypeRelationship_4019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Derivation_4004 = getElementType("OntoUML.diagram.Derivation_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FormalAssociation_4005 = getElementType("OntoUML.diagram.FormalAssociation_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Generalization_4006 = getElementType("OntoUML.diagram.Generalization_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MaterialAssociation_4007 = getElementType("OntoUML.diagram.MaterialAssociation_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Mediation_4008 = getElementType("OntoUML.diagram.Mediation_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MemberOf_4009 = getElementType("OntoUML.diagram.MemberOf_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SubCollectionOf_4010 = getElementType("OntoUML.diagram.SubCollectionOf_4010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SubQuantityOf_4011 = getElementType("OntoUML.diagram.SubQuantityOf_4011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BinaryAssociationAtom_4013 = getElementType("OntoUML.diagram.BinaryAssociationAtom_4013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BinaryAssociationAtom_4014 = getElementType("OntoUML.diagram.BinaryAssociationAtom_4014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BinaryAssociationAtom_4015 = getElementType("OntoUML.diagram.BinaryAssociationAtom_4015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClassifierAtom_4016 = getElementType("OntoUML.diagram.ClassifierAtom_4016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClassifierAtom_4017 = getElementType("OntoUML.diagram.ClassifierAtom_4017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClassifierAtom_4018 = getElementType("OntoUML.diagram.ClassifierAtom_4018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return OntoUML.diagram.part.OntoUMLDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(Container_1000, OntoUML.OntoUMLPackage.eINSTANCE
					.getContainer());

			elements.put(Category_2001, OntoUML.OntoUMLPackage.eINSTANCE
					.getCategory());

			elements.put(Collective_2002, OntoUML.OntoUMLPackage.eINSTANCE
					.getCollective());

			elements.put(Kind_2003, OntoUML.OntoUMLPackage.eINSTANCE.getKind());

			elements.put(Mixin_2004, OntoUML.OntoUMLPackage.eINSTANCE
					.getMixin());

			elements.put(Mode_2005, OntoUML.OntoUMLPackage.eINSTANCE.getMode());

			elements.put(Phase_2006, OntoUML.OntoUMLPackage.eINSTANCE
					.getPhase());

			elements.put(Quantity_2007, OntoUML.OntoUMLPackage.eINSTANCE
					.getQuantity());

			elements.put(Relator_2008, OntoUML.OntoUMLPackage.eINSTANCE
					.getRelator());

			elements.put(Role_2009, OntoUML.OntoUMLPackage.eINSTANCE.getRole());

			elements.put(RoleMixin_2010, OntoUML.OntoUMLPackage.eINSTANCE
					.getRoleMixin());

			elements.put(SimpleDatatype_2011, OntoUML.OntoUMLPackage.eINSTANCE
					.getSimpleDatatype());

			elements.put(StructuralDatatype_2012,
					OntoUML.OntoUMLPackage.eINSTANCE.getStructuralDatatype());

			elements.put(SubKind_2013, OntoUML.OntoUMLPackage.eINSTANCE
					.getSubKind());

			elements.put(GeneralizationSet_2014,
					OntoUML.OntoUMLPackage.eINSTANCE.getGeneralizationSet());

			elements.put(DerivationRule_2015,
					OntoUML.URML.URMLPackage.eINSTANCE.getDerivationRule());

			elements.put(Property_3028, OntoUML.OntoUMLPackage.eINSTANCE
					.getProperty());

			elements.put(Property_3029, OntoUML.OntoUMLPackage.eINSTANCE
					.getProperty());

			elements.put(Property_3030, OntoUML.OntoUMLPackage.eINSTANCE
					.getProperty());

			elements.put(Property_3031, OntoUML.OntoUMLPackage.eINSTANCE
					.getProperty());

			elements.put(Property_3032, OntoUML.OntoUMLPackage.eINSTANCE
					.getProperty());

			elements.put(Property_3033, OntoUML.OntoUMLPackage.eINSTANCE
					.getProperty());

			elements.put(Property_3034, OntoUML.OntoUMLPackage.eINSTANCE
					.getProperty());

			elements.put(Property_3035, OntoUML.OntoUMLPackage.eINSTANCE
					.getProperty());

			elements.put(Property_3036, OntoUML.OntoUMLPackage.eINSTANCE
					.getProperty());

			elements.put(Property_3037, OntoUML.OntoUMLPackage.eINSTANCE
					.getProperty());

			elements.put(Property_3038, OntoUML.OntoUMLPackage.eINSTANCE
					.getProperty());

			elements.put(Property_3039, OntoUML.OntoUMLPackage.eINSTANCE
					.getProperty());

			elements.put(Property_3040, OntoUML.OntoUMLPackage.eINSTANCE
					.getProperty());

			elements.put(Characterization_4001,
					OntoUML.OntoUMLPackage.eINSTANCE.getCharacterization());

			elements.put(ComponentOf_4002, OntoUML.OntoUMLPackage.eINSTANCE
					.getcomponentOf());

			elements.put(DatatypeRelationship_4019,
					OntoUML.OntoUMLPackage.eINSTANCE.getDatatypeRelationship());

			elements.put(Derivation_4004, OntoUML.OntoUMLPackage.eINSTANCE
					.getDerivation());

			elements.put(FormalAssociation_4005,
					OntoUML.OntoUMLPackage.eINSTANCE.getFormalAssociation());

			elements.put(Generalization_4006, OntoUML.OntoUMLPackage.eINSTANCE
					.getGeneralization());

			elements.put(MaterialAssociation_4007,
					OntoUML.OntoUMLPackage.eINSTANCE.getMaterialAssociation());

			elements.put(Mediation_4008, OntoUML.OntoUMLPackage.eINSTANCE
					.getMediation());

			elements.put(MemberOf_4009, OntoUML.OntoUMLPackage.eINSTANCE
					.getmemberOf());

			elements.put(SubCollectionOf_4010, OntoUML.OntoUMLPackage.eINSTANCE
					.getsubCollectionOf());

			elements.put(SubQuantityOf_4011, OntoUML.OntoUMLPackage.eINSTANCE
					.getsubQuantityOf());

			elements.put(BinaryAssociationAtom_4013,
					OntoUML.URML.URMLPackage.eINSTANCE
							.getBinaryAssociationAtom());

			elements.put(BinaryAssociationAtom_4014,
					OntoUML.URML.URMLPackage.eINSTANCE
							.getBinaryAssociationAtom());

			elements.put(BinaryAssociationAtom_4015,
					OntoUML.URML.URMLPackage.eINSTANCE
							.getBinaryAssociationAtom());

			elements.put(ClassifierAtom_4016,
					OntoUML.URML.URMLPackage.eINSTANCE.getClassifierAtom());

			elements.put(ClassifierAtom_4017,
					OntoUML.URML.URMLPackage.eINSTANCE.getClassifierAtom());

			elements.put(ClassifierAtom_4018,
					OntoUML.URML.URMLPackage.eINSTANCE.getClassifierAtom());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Container_1000);
			KNOWN_ELEMENT_TYPES.add(Category_2001);
			KNOWN_ELEMENT_TYPES.add(Collective_2002);
			KNOWN_ELEMENT_TYPES.add(Kind_2003);
			KNOWN_ELEMENT_TYPES.add(Mixin_2004);
			KNOWN_ELEMENT_TYPES.add(Mode_2005);
			KNOWN_ELEMENT_TYPES.add(Phase_2006);
			KNOWN_ELEMENT_TYPES.add(Quantity_2007);
			KNOWN_ELEMENT_TYPES.add(Relator_2008);
			KNOWN_ELEMENT_TYPES.add(Role_2009);
			KNOWN_ELEMENT_TYPES.add(RoleMixin_2010);
			KNOWN_ELEMENT_TYPES.add(SimpleDatatype_2011);
			KNOWN_ELEMENT_TYPES.add(StructuralDatatype_2012);
			KNOWN_ELEMENT_TYPES.add(SubKind_2013);
			KNOWN_ELEMENT_TYPES.add(GeneralizationSet_2014);
			KNOWN_ELEMENT_TYPES.add(DerivationRule_2015);
			KNOWN_ELEMENT_TYPES.add(Property_3028);
			KNOWN_ELEMENT_TYPES.add(Property_3029);
			KNOWN_ELEMENT_TYPES.add(Property_3030);
			KNOWN_ELEMENT_TYPES.add(Property_3031);
			KNOWN_ELEMENT_TYPES.add(Property_3032);
			KNOWN_ELEMENT_TYPES.add(Property_3033);
			KNOWN_ELEMENT_TYPES.add(Property_3034);
			KNOWN_ELEMENT_TYPES.add(Property_3035);
			KNOWN_ELEMENT_TYPES.add(Property_3036);
			KNOWN_ELEMENT_TYPES.add(Property_3037);
			KNOWN_ELEMENT_TYPES.add(Property_3038);
			KNOWN_ELEMENT_TYPES.add(Property_3039);
			KNOWN_ELEMENT_TYPES.add(Property_3040);
			KNOWN_ELEMENT_TYPES.add(Characterization_4001);
			KNOWN_ELEMENT_TYPES.add(ComponentOf_4002);
			KNOWN_ELEMENT_TYPES.add(DatatypeRelationship_4019);
			KNOWN_ELEMENT_TYPES.add(Derivation_4004);
			KNOWN_ELEMENT_TYPES.add(FormalAssociation_4005);
			KNOWN_ELEMENT_TYPES.add(Generalization_4006);
			KNOWN_ELEMENT_TYPES.add(MaterialAssociation_4007);
			KNOWN_ELEMENT_TYPES.add(Mediation_4008);
			KNOWN_ELEMENT_TYPES.add(MemberOf_4009);
			KNOWN_ELEMENT_TYPES.add(SubCollectionOf_4010);
			KNOWN_ELEMENT_TYPES.add(SubQuantityOf_4011);
			KNOWN_ELEMENT_TYPES.add(BinaryAssociationAtom_4013);
			KNOWN_ELEMENT_TYPES.add(BinaryAssociationAtom_4014);
			KNOWN_ELEMENT_TYPES.add(BinaryAssociationAtom_4015);
			KNOWN_ELEMENT_TYPES.add(ClassifierAtom_4016);
			KNOWN_ELEMENT_TYPES.add(ClassifierAtom_4017);
			KNOWN_ELEMENT_TYPES.add(ClassifierAtom_4018);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
