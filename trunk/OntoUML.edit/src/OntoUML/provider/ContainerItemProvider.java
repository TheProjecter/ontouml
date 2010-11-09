/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.provider;


import OntoUML.Container;
import OntoUML.OntoUMLFactory;
import OntoUML.OntoUMLPackage;

import OntoUML.URML.URMLFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link OntoUML.Container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Container_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Container.class)) {
			case OntoUMLPackage.CONTAINER__INSTANCIAR_ELEMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createObjectClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createMixinClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createNonRigidMixinClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createAntiRigidMixinClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createSortalClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createAntiRigidSortalClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createRigidMixinClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createDirectedRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createDirectedBinaryRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createDependencyRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createCharacterization()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createRigidSortalClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createSubstanceSortal()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createCollective()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createMeronymic()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createcomponentOf()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createDatatype()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createDatatypeRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createDerivation()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createRedefinableElement()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createFormalAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createKind()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createMaterialAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createMediation()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.creatememberOf()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createSemiRigidMixin()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createMixin()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createMomentClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createMode()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createMultiplicityElement()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createPhase()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createStructuralFeature()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createQuantity()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createRelationalClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createRelator()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createRoleMixin()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createSimpleDatatype()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createStructuralDatatype()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createsubCollectionOf()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createSubKind()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createsubQuantityOf()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 OntoUMLFactory.eINSTANCE.createTypedElement()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 URMLFactory.eINSTANCE.createDerivationRule()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 URMLFactory.eINSTANCE.createClassifierAtom()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 URMLFactory.eINSTANCE.createRoleTypeAtom()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 URMLFactory.eINSTANCE.createBinaryAssociationAtom()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.CONTAINER__INSTANCIAR_ELEMENT,
				 URMLFactory.eINSTANCE.createAttributionAtom()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OntoUMLEditPlugin.INSTANCE;
	}

}
