/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.provider;


import OntoUML.DirectedRelationship;
import OntoUML.OntoUMLFactory;
import OntoUML.OntoUMLPackage;

import OntoUML.URML.URMLFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link OntoUML.DirectedRelationship} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DirectedRelationshipItemProvider
	extends RelationshipItemProvider
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
	public DirectedRelationshipItemProvider(AdapterFactory adapterFactory) {
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

			addTargetPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DirectedRelationship_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DirectedRelationship_target_feature", "_UI_DirectedRelationship_type"),
				 OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DirectedRelationship_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DirectedRelationship_source_feature", "_UI_DirectedRelationship_type"),
				 OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2);
			childrenFeatures.add(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2);
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
	 * This returns DirectedRelationship.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DirectedRelationship"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DirectedRelationship_type");
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

		switch (notification.getFeatureID(DirectedRelationship.class)) {
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET:
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE:
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_AUX1:
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX1:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_AUX2:
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX2:
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
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createObjectClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createMixinClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createNonRigidMixinClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createAntiRigidMixinClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createSortalClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createAntiRigidSortalClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createRigidMixinClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createDirectedRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createDirectedBinaryRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createDependencyRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createCharacterization()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createRigidSortalClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createSubstanceSortal()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createCollective()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createMeronymic()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createcomponentOf()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createDatatype()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createDatatypeAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createDerivation()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createFormalAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createKind()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createMaterialAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createMediation()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.creatememberOf()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createSemiRigidMixin()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createMixin()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createMomentClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createMode()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createMultiplicityElement()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createPhase()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createStructuralFeature()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createQuantity()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createRelationalClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createRelator()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createRoleMixin()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createSimpleDatatype()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createStructuralDatatype()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createsubCollectionOf()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createSubKind()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 OntoUMLFactory.eINSTANCE.createsubQuantityOf()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 URMLFactory.eINSTANCE.createDerivationRule()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 URMLFactory.eINSTANCE.createClassifierAtom()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 URMLFactory.eINSTANCE.createRoleTypeAtom()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 URMLFactory.eINSTANCE.createBinaryAssociationAtom()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2,
				 URMLFactory.eINSTANCE.createAttributionAtom()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createObjectClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createMixinClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createNonRigidMixinClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createAntiRigidMixinClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createSortalClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createAntiRigidSortalClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createRigidMixinClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createDirectedRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createDirectedBinaryRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createDependencyRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createCharacterization()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createRigidSortalClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createSubstanceSortal()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createCollective()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createMeronymic()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createcomponentOf()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createDatatype()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createDatatypeAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createDerivation()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createFormalAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createKind()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createMaterialAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createMediation()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.creatememberOf()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createSemiRigidMixin()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createMixin()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createMomentClass()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createMode()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createMultiplicityElement()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createPhase()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createStructuralFeature()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createQuantity()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createRelationalClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createRelator()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createRoleMixin()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createSimpleDatatype()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createStructuralDatatype()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createsubCollectionOf()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createSubKind()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 OntoUMLFactory.eINSTANCE.createsubQuantityOf()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 URMLFactory.eINSTANCE.createDerivationRule()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 URMLFactory.eINSTANCE.createClassifierAtom()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 URMLFactory.eINSTANCE.createRoleTypeAtom()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 URMLFactory.eINSTANCE.createBinaryAssociationAtom()));

		newChildDescriptors.add
			(createChildParameter
				(OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2,
				 URMLFactory.eINSTANCE.createAttributionAtom()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == OntoUMLPackage.Literals.ELEMENT__ATTRIBUTE ||
			childFeature == OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET_AUX2 ||
			childFeature == OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE_AUX2;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
