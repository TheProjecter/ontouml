/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package UMLPlus;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see UMLPlus.UMLPlusFactory
 * @model kind="package"
 * @generated
 */
public interface UMLPlusPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UMLPlus"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "UMLPlus"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "UMLPlus"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UMLPlusPackage eINSTANCE = UMLPlus.impl.UMLPlusPackageImpl.init();

	/**
	 * The meta object id for the '{@link UMLPlus.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.ElementImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNER = 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CONTAINER = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.NamedElementImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 30;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ATTRIBUTE = ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__CONTAINER = ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.TypeImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 52;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ATTRIBUTE = NAMED_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNER = NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CONTAINER = NAMED_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.ClassifierImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 6;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__ATTRIBUTE = TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNER = TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__CONTAINER = TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IS_ABSTRACT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__GENERAL = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__GENERALIZATION = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.ClassImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTE = CLASSIFIER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNER = CLASSIFIER__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CONTAINER = CLASSIFIER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ABSTRACT = CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GENERAL = CLASSIFIER__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GENERALIZATION = CLASSIFIER__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.ObjectClassImpl <em>Object Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.ObjectClassImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getObjectClass()
	 * @generated
	 */
	int OBJECT_CLASS = 32;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS__ATTRIBUTE = CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS__OWNER = CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS__CONTAINER = CLASS__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS__IS_ABSTRACT = CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS__GENERAL = CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS__GENERALIZATION = CLASS__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Object Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.MixinClassImpl <em>Mixin Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.MixinClassImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getMixinClass()
	 * @generated
	 */
	int MIXIN_CLASS = 26;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_CLASS__ATTRIBUTE = OBJECT_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_CLASS__OWNER = OBJECT_CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_CLASS__CONTAINER = OBJECT_CLASS__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_CLASS__NAME = OBJECT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_CLASS__IS_ABSTRACT = OBJECT_CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_CLASS__GENERAL = OBJECT_CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_CLASS__GENERALIZATION = OBJECT_CLASS__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Mixin Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_CLASS_FEATURE_COUNT = OBJECT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.NonRigidMixinClassImpl <em>Non Rigid Mixin Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.NonRigidMixinClassImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getNonRigidMixinClass()
	 * @generated
	 */
	int NON_RIGID_MIXIN_CLASS = 31;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RIGID_MIXIN_CLASS__ATTRIBUTE = MIXIN_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RIGID_MIXIN_CLASS__OWNER = MIXIN_CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RIGID_MIXIN_CLASS__CONTAINER = MIXIN_CLASS__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RIGID_MIXIN_CLASS__NAME = MIXIN_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RIGID_MIXIN_CLASS__IS_ABSTRACT = MIXIN_CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RIGID_MIXIN_CLASS__GENERAL = MIXIN_CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RIGID_MIXIN_CLASS__GENERALIZATION = MIXIN_CLASS__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Non Rigid Mixin Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RIGID_MIXIN_CLASS_FEATURE_COUNT = MIXIN_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.AntiRigidMixinClassImpl <em>Anti Rigid Mixin Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.AntiRigidMixinClassImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getAntiRigidMixinClass()
	 * @generated
	 */
	int ANTI_RIGID_MIXIN_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_MIXIN_CLASS__ATTRIBUTE = NON_RIGID_MIXIN_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_MIXIN_CLASS__OWNER = NON_RIGID_MIXIN_CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_MIXIN_CLASS__CONTAINER = NON_RIGID_MIXIN_CLASS__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_MIXIN_CLASS__NAME = NON_RIGID_MIXIN_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_MIXIN_CLASS__IS_ABSTRACT = NON_RIGID_MIXIN_CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_MIXIN_CLASS__GENERAL = NON_RIGID_MIXIN_CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_MIXIN_CLASS__GENERALIZATION = NON_RIGID_MIXIN_CLASS__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Anti Rigid Mixin Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_MIXIN_CLASS_FEATURE_COUNT = NON_RIGID_MIXIN_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.SortalClassImpl <em>Sortal Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.SortalClassImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getSortalClass()
	 * @generated
	 */
	int SORTAL_CLASS = 45;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTAL_CLASS__ATTRIBUTE = OBJECT_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTAL_CLASS__OWNER = OBJECT_CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTAL_CLASS__CONTAINER = OBJECT_CLASS__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTAL_CLASS__NAME = OBJECT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTAL_CLASS__IS_ABSTRACT = OBJECT_CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTAL_CLASS__GENERAL = OBJECT_CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTAL_CLASS__GENERALIZATION = OBJECT_CLASS__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Sortal Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTAL_CLASS_FEATURE_COUNT = OBJECT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.AntiRigidSortalClassImpl <em>Anti Rigid Sortal Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.AntiRigidSortalClassImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getAntiRigidSortalClass()
	 * @generated
	 */
	int ANTI_RIGID_SORTAL_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_SORTAL_CLASS__ATTRIBUTE = SORTAL_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_SORTAL_CLASS__OWNER = SORTAL_CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_SORTAL_CLASS__CONTAINER = SORTAL_CLASS__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_SORTAL_CLASS__NAME = SORTAL_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_SORTAL_CLASS__IS_ABSTRACT = SORTAL_CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_SORTAL_CLASS__GENERAL = SORTAL_CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_SORTAL_CLASS__GENERALIZATION = SORTAL_CLASS__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Anti Rigid Sortal Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_SORTAL_CLASS_FEATURE_COUNT = SORTAL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.RelationshipImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 37;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ATTRIBUTE = ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__CONTAINER = ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATED_ELEMENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.AssociationImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ATTRIBUTE = RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNER = RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__CONTAINER = RELATIONSHIP__CONTAINER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__RELATED_ELEMENT = RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IS_ABSTRACT = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__GENERAL = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__GENERALIZATION = RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Association End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ASSOCIATION_END = RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Association End Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ASSOCIATION_END_AUX1 = RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Association End Aux2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ASSOCIATION_END_AUX2 = RELATIONSHIP_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.RigidMixinClassImpl <em>Rigid Mixin Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.RigidMixinClassImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getRigidMixinClass()
	 * @generated
	 */
	int RIGID_MIXIN_CLASS = 39;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_MIXIN_CLASS__ATTRIBUTE = MIXIN_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_MIXIN_CLASS__OWNER = MIXIN_CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_MIXIN_CLASS__CONTAINER = MIXIN_CLASS__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_MIXIN_CLASS__NAME = MIXIN_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_MIXIN_CLASS__IS_ABSTRACT = MIXIN_CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_MIXIN_CLASS__GENERAL = MIXIN_CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_MIXIN_CLASS__GENERALIZATION = MIXIN_CLASS__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Rigid Mixin Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_MIXIN_CLASS_FEATURE_COUNT = MIXIN_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.CategoryImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ATTRIBUTE = RIGID_MIXIN_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__OWNER = RIGID_MIXIN_CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CONTAINER = RIGID_MIXIN_CLASS__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = RIGID_MIXIN_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__IS_ABSTRACT = RIGID_MIXIN_CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__GENERAL = RIGID_MIXIN_CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__GENERALIZATION = RIGID_MIXIN_CLASS__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = RIGID_MIXIN_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.DirectedRelationshipImpl <em>Directed Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.DirectedRelationshipImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getDirectedRelationship()
	 * @generated
	 */
	int DIRECTED_RELATIONSHIP = 15;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__ATTRIBUTE = RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__OWNER = RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__CONTAINER = RELATIONSHIP__CONTAINER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__RELATED_ELEMENT = RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__TARGET = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__SOURCE = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__TARGET_AUX1 = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__SOURCE_AUX1 = RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__TARGET_AUX2 = RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__SOURCE_AUX2 = RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Directed Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.DirectedBinaryRelationshipImpl <em>Directed Binary Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.DirectedBinaryRelationshipImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getDirectedBinaryRelationship()
	 * @generated
	 */
	int DIRECTED_BINARY_RELATIONSHIP = 14;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_BINARY_RELATIONSHIP__ATTRIBUTE = DIRECTED_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_BINARY_RELATIONSHIP__OWNER = DIRECTED_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_BINARY_RELATIONSHIP__CONTAINER = DIRECTED_RELATIONSHIP__CONTAINER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_BINARY_RELATIONSHIP__RELATED_ELEMENT = DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_BINARY_RELATIONSHIP__TARGET = DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_BINARY_RELATIONSHIP__SOURCE = DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_BINARY_RELATIONSHIP__TARGET_AUX1 = DIRECTED_RELATIONSHIP__TARGET_AUX1;

	/**
	 * The feature id for the '<em><b>Source Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_BINARY_RELATIONSHIP__SOURCE_AUX1 = DIRECTED_RELATIONSHIP__SOURCE_AUX1;

	/**
	 * The feature id for the '<em><b>Target Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_BINARY_RELATIONSHIP__TARGET_AUX2 = DIRECTED_RELATIONSHIP__TARGET_AUX2;

	/**
	 * The feature id for the '<em><b>Source Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_BINARY_RELATIONSHIP__SOURCE_AUX2 = DIRECTED_RELATIONSHIP__SOURCE_AUX2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_BINARY_RELATIONSHIP__NAME = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_BINARY_RELATIONSHIP__IS_ABSTRACT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_BINARY_RELATIONSHIP__GENERAL = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_BINARY_RELATIONSHIP__GENERALIZATION = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Directed Binary Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_BINARY_RELATIONSHIP_FEATURE_COUNT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.DependencyRelationshipImpl <em>Dependency Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.DependencyRelationshipImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getDependencyRelationship()
	 * @generated
	 */
	int DEPENDENCY_RELATIONSHIP = 12;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__ATTRIBUTE = DIRECTED_BINARY_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__OWNER = DIRECTED_BINARY_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__CONTAINER = DIRECTED_BINARY_RELATIONSHIP__CONTAINER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__RELATED_ELEMENT = DIRECTED_BINARY_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__TARGET = DIRECTED_BINARY_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__SOURCE = DIRECTED_BINARY_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__TARGET_AUX1 = DIRECTED_BINARY_RELATIONSHIP__TARGET_AUX1;

	/**
	 * The feature id for the '<em><b>Source Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__SOURCE_AUX1 = DIRECTED_BINARY_RELATIONSHIP__SOURCE_AUX1;

	/**
	 * The feature id for the '<em><b>Target Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__TARGET_AUX2 = DIRECTED_BINARY_RELATIONSHIP__TARGET_AUX2;

	/**
	 * The feature id for the '<em><b>Source Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__SOURCE_AUX2 = DIRECTED_BINARY_RELATIONSHIP__SOURCE_AUX2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__NAME = DIRECTED_BINARY_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__IS_ABSTRACT = DIRECTED_BINARY_RELATIONSHIP__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__GENERAL = DIRECTED_BINARY_RELATIONSHIP__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__GENERALIZATION = DIRECTED_BINARY_RELATIONSHIP__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Dependency Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP_FEATURE_COUNT = DIRECTED_BINARY_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.CharacterizationImpl <em>Characterization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.CharacterizationImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getCharacterization()
	 * @generated
	 */
	int CHARACTERIZATION = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__ATTRIBUTE = DEPENDENCY_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__OWNER = DEPENDENCY_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__CONTAINER = DEPENDENCY_RELATIONSHIP__CONTAINER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__RELATED_ELEMENT = DEPENDENCY_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__TARGET = DEPENDENCY_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__SOURCE = DEPENDENCY_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__TARGET_AUX1 = DEPENDENCY_RELATIONSHIP__TARGET_AUX1;

	/**
	 * The feature id for the '<em><b>Source Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__SOURCE_AUX1 = DEPENDENCY_RELATIONSHIP__SOURCE_AUX1;

	/**
	 * The feature id for the '<em><b>Target Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__TARGET_AUX2 = DEPENDENCY_RELATIONSHIP__TARGET_AUX2;

	/**
	 * The feature id for the '<em><b>Source Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__SOURCE_AUX2 = DEPENDENCY_RELATIONSHIP__SOURCE_AUX2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__NAME = DEPENDENCY_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__IS_ABSTRACT = DEPENDENCY_RELATIONSHIP__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__GENERAL = DEPENDENCY_RELATIONSHIP__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__GENERALIZATION = DEPENDENCY_RELATIONSHIP__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Characterization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION_FEATURE_COUNT = DEPENDENCY_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.RigidSortalClassImpl <em>Rigid Sortal Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.RigidSortalClassImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getRigidSortalClass()
	 * @generated
	 */
	int RIGID_SORTAL_CLASS = 40;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_SORTAL_CLASS__ATTRIBUTE = SORTAL_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_SORTAL_CLASS__OWNER = SORTAL_CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_SORTAL_CLASS__CONTAINER = SORTAL_CLASS__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_SORTAL_CLASS__NAME = SORTAL_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_SORTAL_CLASS__IS_ABSTRACT = SORTAL_CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_SORTAL_CLASS__GENERAL = SORTAL_CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_SORTAL_CLASS__GENERALIZATION = SORTAL_CLASS__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Rigid Sortal Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_SORTAL_CLASS_FEATURE_COUNT = SORTAL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.SubstanceSortalImpl <em>Substance Sortal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.SubstanceSortalImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getSubstanceSortal()
	 * @generated
	 */
	int SUBSTANCE_SORTAL = 51;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_SORTAL__ATTRIBUTE = RIGID_SORTAL_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_SORTAL__OWNER = RIGID_SORTAL_CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_SORTAL__CONTAINER = RIGID_SORTAL_CLASS__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_SORTAL__NAME = RIGID_SORTAL_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_SORTAL__IS_ABSTRACT = RIGID_SORTAL_CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_SORTAL__GENERAL = RIGID_SORTAL_CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_SORTAL__GENERALIZATION = RIGID_SORTAL_CLASS__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Substance Sortal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_SORTAL_FEATURE_COUNT = RIGID_SORTAL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.CollectiveImpl <em>Collective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.CollectiveImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getCollective()
	 * @generated
	 */
	int COLLECTIVE = 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE__ATTRIBUTE = SUBSTANCE_SORTAL__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE__OWNER = SUBSTANCE_SORTAL__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE__CONTAINER = SUBSTANCE_SORTAL__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE__NAME = SUBSTANCE_SORTAL__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE__IS_ABSTRACT = SUBSTANCE_SORTAL__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE__GENERAL = SUBSTANCE_SORTAL__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE__GENERALIZATION = SUBSTANCE_SORTAL__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Is Extensional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE__IS_EXTENSIONAL = SUBSTANCE_SORTAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_FEATURE_COUNT = SUBSTANCE_SORTAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.MeronymicImpl <em>Meronymic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.MeronymicImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getMeronymic()
	 * @generated
	 */
	int MERONYMIC = 24;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERONYMIC__ATTRIBUTE = DIRECTED_BINARY_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERONYMIC__OWNER = DIRECTED_BINARY_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERONYMIC__CONTAINER = DIRECTED_BINARY_RELATIONSHIP__CONTAINER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERONYMIC__RELATED_ELEMENT = DIRECTED_BINARY_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERONYMIC__TARGET = DIRECTED_BINARY_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERONYMIC__SOURCE = DIRECTED_BINARY_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERONYMIC__TARGET_AUX1 = DIRECTED_BINARY_RELATIONSHIP__TARGET_AUX1;

	/**
	 * The feature id for the '<em><b>Source Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERONYMIC__SOURCE_AUX1 = DIRECTED_BINARY_RELATIONSHIP__SOURCE_AUX1;

	/**
	 * The feature id for the '<em><b>Target Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERONYMIC__TARGET_AUX2 = DIRECTED_BINARY_RELATIONSHIP__TARGET_AUX2;

	/**
	 * The feature id for the '<em><b>Source Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERONYMIC__SOURCE_AUX2 = DIRECTED_BINARY_RELATIONSHIP__SOURCE_AUX2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERONYMIC__NAME = DIRECTED_BINARY_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERONYMIC__IS_ABSTRACT = DIRECTED_BINARY_RELATIONSHIP__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERONYMIC__GENERAL = DIRECTED_BINARY_RELATIONSHIP__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERONYMIC__GENERALIZATION = DIRECTED_BINARY_RELATIONSHIP__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Is Shareable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERONYMIC__IS_SHAREABLE = DIRECTED_BINARY_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Essential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERONYMIC__IS_ESSENTIAL = DIRECTED_BINARY_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Inseparable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERONYMIC__IS_INSEPARABLE = DIRECTED_BINARY_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Immutable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERONYMIC__IS_IMMUTABLE_PART = DIRECTED_BINARY_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Immutable Whole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERONYMIC__IS_IMMUTABLE_WHOLE = DIRECTED_BINARY_RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Meronymic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERONYMIC_FEATURE_COUNT = DIRECTED_BINARY_RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.componentOfImpl <em>component Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.componentOfImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getcomponentOf()
	 * @generated
	 */
	int COMPONENT_OF = 8;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OF__ATTRIBUTE = MERONYMIC__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OF__OWNER = MERONYMIC__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OF__CONTAINER = MERONYMIC__CONTAINER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OF__RELATED_ELEMENT = MERONYMIC__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OF__TARGET = MERONYMIC__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OF__SOURCE = MERONYMIC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OF__TARGET_AUX1 = MERONYMIC__TARGET_AUX1;

	/**
	 * The feature id for the '<em><b>Source Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OF__SOURCE_AUX1 = MERONYMIC__SOURCE_AUX1;

	/**
	 * The feature id for the '<em><b>Target Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OF__TARGET_AUX2 = MERONYMIC__TARGET_AUX2;

	/**
	 * The feature id for the '<em><b>Source Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OF__SOURCE_AUX2 = MERONYMIC__SOURCE_AUX2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OF__NAME = MERONYMIC__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OF__IS_ABSTRACT = MERONYMIC__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OF__GENERAL = MERONYMIC__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OF__GENERALIZATION = MERONYMIC__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Is Shareable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OF__IS_SHAREABLE = MERONYMIC__IS_SHAREABLE;

	/**
	 * The feature id for the '<em><b>Is Essential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OF__IS_ESSENTIAL = MERONYMIC__IS_ESSENTIAL;

	/**
	 * The feature id for the '<em><b>Is Inseparable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OF__IS_INSEPARABLE = MERONYMIC__IS_INSEPARABLE;

	/**
	 * The feature id for the '<em><b>Is Immutable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OF__IS_IMMUTABLE_PART = MERONYMIC__IS_IMMUTABLE_PART;

	/**
	 * The feature id for the '<em><b>Is Immutable Whole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OF__IS_IMMUTABLE_WHOLE = MERONYMIC__IS_IMMUTABLE_WHOLE;

	/**
	 * The number of structural features of the '<em>component Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OF_FEATURE_COUNT = MERONYMIC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.ContainerImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 9;

	/**
	 * The feature id for the '<em><b>Instanciar Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__INSTANCIAR_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.DatatypeImpl <em>Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.DatatypeImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getDatatype()
	 * @generated
	 */
	int DATATYPE = 10;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__ATTRIBUTE = CLASSIFIER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OWNER = CLASSIFIER__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__CONTAINER = CLASSIFIER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__IS_ABSTRACT = CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__GENERAL = CLASSIFIER__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__GENERALIZATION = CLASSIFIER__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.DatatypeAssociationImpl <em>Datatype Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.DatatypeAssociationImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getDatatypeAssociation()
	 * @generated
	 */
	int DATATYPE_ASSOCIATION = 11;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_ASSOCIATION__ATTRIBUTE = ASSOCIATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_ASSOCIATION__OWNER = ASSOCIATION__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_ASSOCIATION__CONTAINER = ASSOCIATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_ASSOCIATION__RELATED_ELEMENT = ASSOCIATION__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_ASSOCIATION__NAME = ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_ASSOCIATION__IS_ABSTRACT = ASSOCIATION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_ASSOCIATION__GENERAL = ASSOCIATION__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_ASSOCIATION__GENERALIZATION = ASSOCIATION__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Association End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_ASSOCIATION__ASSOCIATION_END = ASSOCIATION__ASSOCIATION_END;

	/**
	 * The feature id for the '<em><b>Association End Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_ASSOCIATION__ASSOCIATION_END_AUX1 = ASSOCIATION__ASSOCIATION_END_AUX1;

	/**
	 * The feature id for the '<em><b>Association End Aux2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_ASSOCIATION__ASSOCIATION_END_AUX2 = ASSOCIATION__ASSOCIATION_END_AUX2;

	/**
	 * The number of structural features of the '<em>Datatype Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_ASSOCIATION_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.DerivationImpl <em>Derivation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.DerivationImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getDerivation()
	 * @generated
	 */
	int DERIVATION = 13;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__ATTRIBUTE = DEPENDENCY_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__OWNER = DEPENDENCY_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__CONTAINER = DEPENDENCY_RELATIONSHIP__CONTAINER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__RELATED_ELEMENT = DEPENDENCY_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__TARGET = DEPENDENCY_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__SOURCE = DEPENDENCY_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__TARGET_AUX1 = DEPENDENCY_RELATIONSHIP__TARGET_AUX1;

	/**
	 * The feature id for the '<em><b>Source Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__SOURCE_AUX1 = DEPENDENCY_RELATIONSHIP__SOURCE_AUX1;

	/**
	 * The feature id for the '<em><b>Target Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__TARGET_AUX2 = DEPENDENCY_RELATIONSHIP__TARGET_AUX2;

	/**
	 * The feature id for the '<em><b>Source Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__SOURCE_AUX2 = DEPENDENCY_RELATIONSHIP__SOURCE_AUX2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__NAME = DEPENDENCY_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__IS_ABSTRACT = DEPENDENCY_RELATIONSHIP__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__GENERAL = DEPENDENCY_RELATIONSHIP__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__GENERALIZATION = DEPENDENCY_RELATIONSHIP__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Derivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_FEATURE_COUNT = DEPENDENCY_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.FormalAssociationImpl <em>Formal Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.FormalAssociationImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getFormalAssociation()
	 * @generated
	 */
	int FORMAL_ASSOCIATION = 17;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSOCIATION__ATTRIBUTE = ASSOCIATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSOCIATION__OWNER = ASSOCIATION__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSOCIATION__CONTAINER = ASSOCIATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSOCIATION__RELATED_ELEMENT = ASSOCIATION__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSOCIATION__NAME = ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSOCIATION__IS_ABSTRACT = ASSOCIATION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSOCIATION__GENERAL = ASSOCIATION__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSOCIATION__GENERALIZATION = ASSOCIATION__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Association End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSOCIATION__ASSOCIATION_END = ASSOCIATION__ASSOCIATION_END;

	/**
	 * The feature id for the '<em><b>Association End Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSOCIATION__ASSOCIATION_END_AUX1 = ASSOCIATION__ASSOCIATION_END_AUX1;

	/**
	 * The feature id for the '<em><b>Association End Aux2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSOCIATION__ASSOCIATION_END_AUX2 = ASSOCIATION__ASSOCIATION_END_AUX2;

	/**
	 * The number of structural features of the '<em>Formal Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSOCIATION_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.GeneralizationImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 18;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__ATTRIBUTE = DIRECTED_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNER = DIRECTED_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__CONTAINER = DIRECTED_RELATIONSHIP__CONTAINER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__RELATED_ELEMENT = DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TARGET = DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SOURCE = DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TARGET_AUX1 = DIRECTED_RELATIONSHIP__TARGET_AUX1;

	/**
	 * The feature id for the '<em><b>Source Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SOURCE_AUX1 = DIRECTED_RELATIONSHIP__SOURCE_AUX1;

	/**
	 * The feature id for the '<em><b>Target Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TARGET_AUX2 = DIRECTED_RELATIONSHIP__TARGET_AUX2;

	/**
	 * The feature id for the '<em><b>Source Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SOURCE_AUX2 = DIRECTED_RELATIONSHIP__SOURCE_AUX2;

	/**
	 * The feature id for the '<em><b>Specific</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SPECIFIC = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERAL = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Semnome</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SEMNOME = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.GeneralizationSetImpl <em>Generalization Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.GeneralizationSetImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getGeneralizationSet()
	 * @generated
	 */
	int GENERALIZATION_SET = 19;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__ATTRIBUTE = NAMED_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__OWNER = NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__CONTAINER = NAMED_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Covering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__IS_COVERING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Disjoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__IS_DISJOINT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Semnome</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__SEMNOME = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generalization Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.KindImpl <em>Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.KindImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getKind()
	 * @generated
	 */
	int KIND = 20;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__ATTRIBUTE = SUBSTANCE_SORTAL__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__OWNER = SUBSTANCE_SORTAL__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__CONTAINER = SUBSTANCE_SORTAL__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__NAME = SUBSTANCE_SORTAL__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__IS_ABSTRACT = SUBSTANCE_SORTAL__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__GENERAL = SUBSTANCE_SORTAL__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__GENERALIZATION = SUBSTANCE_SORTAL__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_FEATURE_COUNT = SUBSTANCE_SORTAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.MaterialAssociationImpl <em>Material Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.MaterialAssociationImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getMaterialAssociation()
	 * @generated
	 */
	int MATERIAL_ASSOCIATION = 21;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ASSOCIATION__ATTRIBUTE = ASSOCIATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ASSOCIATION__OWNER = ASSOCIATION__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ASSOCIATION__CONTAINER = ASSOCIATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ASSOCIATION__RELATED_ELEMENT = ASSOCIATION__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ASSOCIATION__NAME = ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ASSOCIATION__IS_ABSTRACT = ASSOCIATION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ASSOCIATION__GENERAL = ASSOCIATION__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ASSOCIATION__GENERALIZATION = ASSOCIATION__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Association End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ASSOCIATION__ASSOCIATION_END = ASSOCIATION__ASSOCIATION_END;

	/**
	 * The feature id for the '<em><b>Association End Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ASSOCIATION__ASSOCIATION_END_AUX1 = ASSOCIATION__ASSOCIATION_END_AUX1;

	/**
	 * The feature id for the '<em><b>Association End Aux2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ASSOCIATION__ASSOCIATION_END_AUX2 = ASSOCIATION__ASSOCIATION_END_AUX2;

	/**
	 * The number of structural features of the '<em>Material Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ASSOCIATION_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.MediationImpl <em>Mediation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.MediationImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getMediation()
	 * @generated
	 */
	int MEDIATION = 22;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATION__ATTRIBUTE = DEPENDENCY_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATION__OWNER = DEPENDENCY_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATION__CONTAINER = DEPENDENCY_RELATIONSHIP__CONTAINER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATION__RELATED_ELEMENT = DEPENDENCY_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATION__TARGET = DEPENDENCY_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATION__SOURCE = DEPENDENCY_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATION__TARGET_AUX1 = DEPENDENCY_RELATIONSHIP__TARGET_AUX1;

	/**
	 * The feature id for the '<em><b>Source Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATION__SOURCE_AUX1 = DEPENDENCY_RELATIONSHIP__SOURCE_AUX1;

	/**
	 * The feature id for the '<em><b>Target Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATION__TARGET_AUX2 = DEPENDENCY_RELATIONSHIP__TARGET_AUX2;

	/**
	 * The feature id for the '<em><b>Source Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATION__SOURCE_AUX2 = DEPENDENCY_RELATIONSHIP__SOURCE_AUX2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATION__NAME = DEPENDENCY_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATION__IS_ABSTRACT = DEPENDENCY_RELATIONSHIP__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATION__GENERAL = DEPENDENCY_RELATIONSHIP__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATION__GENERALIZATION = DEPENDENCY_RELATIONSHIP__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Mediation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATION_FEATURE_COUNT = DEPENDENCY_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.memberOfImpl <em>member Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.memberOfImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getmemberOf()
	 * @generated
	 */
	int MEMBER_OF = 23;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF__ATTRIBUTE = MERONYMIC__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF__OWNER = MERONYMIC__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF__CONTAINER = MERONYMIC__CONTAINER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF__RELATED_ELEMENT = MERONYMIC__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF__TARGET = MERONYMIC__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF__SOURCE = MERONYMIC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF__TARGET_AUX1 = MERONYMIC__TARGET_AUX1;

	/**
	 * The feature id for the '<em><b>Source Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF__SOURCE_AUX1 = MERONYMIC__SOURCE_AUX1;

	/**
	 * The feature id for the '<em><b>Target Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF__TARGET_AUX2 = MERONYMIC__TARGET_AUX2;

	/**
	 * The feature id for the '<em><b>Source Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF__SOURCE_AUX2 = MERONYMIC__SOURCE_AUX2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF__NAME = MERONYMIC__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF__IS_ABSTRACT = MERONYMIC__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF__GENERAL = MERONYMIC__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF__GENERALIZATION = MERONYMIC__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Is Shareable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF__IS_SHAREABLE = MERONYMIC__IS_SHAREABLE;

	/**
	 * The feature id for the '<em><b>Is Essential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF__IS_ESSENTIAL = MERONYMIC__IS_ESSENTIAL;

	/**
	 * The feature id for the '<em><b>Is Inseparable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF__IS_INSEPARABLE = MERONYMIC__IS_INSEPARABLE;

	/**
	 * The feature id for the '<em><b>Is Immutable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF__IS_IMMUTABLE_PART = MERONYMIC__IS_IMMUTABLE_PART;

	/**
	 * The feature id for the '<em><b>Is Immutable Whole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF__IS_IMMUTABLE_WHOLE = MERONYMIC__IS_IMMUTABLE_WHOLE;

	/**
	 * The number of structural features of the '<em>member Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF_FEATURE_COUNT = MERONYMIC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.SemiRigidMixinImpl <em>Semi Rigid Mixin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.SemiRigidMixinImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getSemiRigidMixin()
	 * @generated
	 */
	int SEMI_RIGID_MIXIN = 43;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_RIGID_MIXIN__ATTRIBUTE = NON_RIGID_MIXIN_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_RIGID_MIXIN__OWNER = NON_RIGID_MIXIN_CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_RIGID_MIXIN__CONTAINER = NON_RIGID_MIXIN_CLASS__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_RIGID_MIXIN__NAME = NON_RIGID_MIXIN_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_RIGID_MIXIN__IS_ABSTRACT = NON_RIGID_MIXIN_CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_RIGID_MIXIN__GENERAL = NON_RIGID_MIXIN_CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_RIGID_MIXIN__GENERALIZATION = NON_RIGID_MIXIN_CLASS__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Semi Rigid Mixin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_RIGID_MIXIN_FEATURE_COUNT = NON_RIGID_MIXIN_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.MixinImpl <em>Mixin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.MixinImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getMixin()
	 * @generated
	 */
	int MIXIN = 25;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__ATTRIBUTE = SEMI_RIGID_MIXIN__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__OWNER = SEMI_RIGID_MIXIN__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__CONTAINER = SEMI_RIGID_MIXIN__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__NAME = SEMI_RIGID_MIXIN__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__IS_ABSTRACT = SEMI_RIGID_MIXIN__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__GENERAL = SEMI_RIGID_MIXIN__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__GENERALIZATION = SEMI_RIGID_MIXIN__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Mixin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_FEATURE_COUNT = SEMI_RIGID_MIXIN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.MomentClassImpl <em>Moment Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.MomentClassImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getMomentClass()
	 * @generated
	 */
	int MOMENT_CLASS = 28;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_CLASS__ATTRIBUTE = CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_CLASS__OWNER = CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_CLASS__CONTAINER = CLASS__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_CLASS__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_CLASS__IS_ABSTRACT = CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_CLASS__GENERAL = CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_CLASS__GENERALIZATION = CLASS__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Moment Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_CLASS_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.ModeImpl <em>Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.ModeImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 27;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__ATTRIBUTE = MOMENT_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__OWNER = MOMENT_CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__CONTAINER = MOMENT_CLASS__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__NAME = MOMENT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__IS_ABSTRACT = MOMENT_CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__GENERAL = MOMENT_CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__GENERALIZATION = MOMENT_CLASS__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_FEATURE_COUNT = MOMENT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.MultiplicityElementImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getMultiplicityElement()
	 * @generated
	 */
	int MULTIPLICITY_ELEMENT = 29;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__ATTRIBUTE = ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__CONTAINER = ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__UPPER = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__LOWER = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.PhaseImpl <em>Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.PhaseImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getPhase()
	 * @generated
	 */
	int PHASE = 33;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__ATTRIBUTE = ANTI_RIGID_SORTAL_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__OWNER = ANTI_RIGID_SORTAL_CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__CONTAINER = ANTI_RIGID_SORTAL_CLASS__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__NAME = ANTI_RIGID_SORTAL_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__IS_ABSTRACT = ANTI_RIGID_SORTAL_CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__GENERAL = ANTI_RIGID_SORTAL_CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__GENERALIZATION = ANTI_RIGID_SORTAL_CLASS__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_FEATURE_COUNT = ANTI_RIGID_SORTAL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.StructuralFeatureImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getStructuralFeature()
	 * @generated
	 */
	int STRUCTURAL_FEATURE = 47;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__ATTRIBUTE = MULTIPLICITY_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__OWNER = MULTIPLICITY_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__CONTAINER = MULTIPLICITY_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__UPPER = MULTIPLICITY_ELEMENT__UPPER;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__LOWER = MULTIPLICITY_ELEMENT__LOWER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__NAME = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_FEATURE_COUNT = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.PropertyImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 34;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ATTRIBUTE = STRUCTURAL_FEATURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWNER = STRUCTURAL_FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CONTAINER = STRUCTURAL_FEATURE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPPER = STRUCTURAL_FEATURE__UPPER;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOWER = STRUCTURAL_FEATURE__LOWER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = STRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_DERIVED = STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_READ_ONLY = STRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_NAVIGABLE = STRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__END_TYPE = STRUCTURAL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Association End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ASSOCIATION_END = STRUCTURAL_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SOURCE = STRUCTURAL_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TARGET = STRUCTURAL_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = STRUCTURAL_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.QuantityImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 35;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__ATTRIBUTE = SUBSTANCE_SORTAL__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__OWNER = SUBSTANCE_SORTAL__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__CONTAINER = SUBSTANCE_SORTAL__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__NAME = SUBSTANCE_SORTAL__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__IS_ABSTRACT = SUBSTANCE_SORTAL__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__GENERAL = SUBSTANCE_SORTAL__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__GENERALIZATION = SUBSTANCE_SORTAL__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = SUBSTANCE_SORTAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.RelationalClassifierImpl <em>Relational Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.RelationalClassifierImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getRelationalClassifier()
	 * @generated
	 */
	int RELATIONAL_CLASSIFIER = 36;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CLASSIFIER__ATTRIBUTE = CLASSIFIER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CLASSIFIER__OWNER = CLASSIFIER__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CLASSIFIER__CONTAINER = CLASSIFIER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CLASSIFIER__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CLASSIFIER__IS_ABSTRACT = CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CLASSIFIER__GENERAL = CLASSIFIER__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CLASSIFIER__GENERALIZATION = CLASSIFIER__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Relational Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CLASSIFIER_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.RelatorImpl <em>Relator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.RelatorImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getRelator()
	 * @generated
	 */
	int RELATOR = 38;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATOR__ATTRIBUTE = MOMENT_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATOR__OWNER = MOMENT_CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATOR__CONTAINER = MOMENT_CLASS__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATOR__NAME = MOMENT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATOR__IS_ABSTRACT = MOMENT_CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATOR__GENERAL = MOMENT_CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATOR__GENERALIZATION = MOMENT_CLASS__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Relator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATOR_FEATURE_COUNT = MOMENT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.RoleImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 41;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ATTRIBUTE = ANTI_RIGID_SORTAL_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OWNER = ANTI_RIGID_SORTAL_CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONTAINER = ANTI_RIGID_SORTAL_CLASS__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = ANTI_RIGID_SORTAL_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__IS_ABSTRACT = ANTI_RIGID_SORTAL_CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__GENERAL = ANTI_RIGID_SORTAL_CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__GENERALIZATION = ANTI_RIGID_SORTAL_CLASS__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = ANTI_RIGID_SORTAL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.RoleMixinImpl <em>Role Mixin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.RoleMixinImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getRoleMixin()
	 * @generated
	 */
	int ROLE_MIXIN = 42;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MIXIN__ATTRIBUTE = ANTI_RIGID_MIXIN_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MIXIN__OWNER = ANTI_RIGID_MIXIN_CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MIXIN__CONTAINER = ANTI_RIGID_MIXIN_CLASS__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MIXIN__NAME = ANTI_RIGID_MIXIN_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MIXIN__IS_ABSTRACT = ANTI_RIGID_MIXIN_CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MIXIN__GENERAL = ANTI_RIGID_MIXIN_CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MIXIN__GENERALIZATION = ANTI_RIGID_MIXIN_CLASS__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Role Mixin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MIXIN_FEATURE_COUNT = ANTI_RIGID_MIXIN_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.SimpleDatatypeImpl <em>Simple Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.SimpleDatatypeImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getSimpleDatatype()
	 * @generated
	 */
	int SIMPLE_DATATYPE = 44;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATATYPE__ATTRIBUTE = DATATYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATATYPE__OWNER = DATATYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATATYPE__CONTAINER = DATATYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATATYPE__NAME = DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATATYPE__IS_ABSTRACT = DATATYPE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATATYPE__GENERAL = DATATYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATATYPE__GENERALIZATION = DATATYPE__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Simple Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATATYPE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.StructuralDatatypeImpl <em>Structural Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.StructuralDatatypeImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getStructuralDatatype()
	 * @generated
	 */
	int STRUCTURAL_DATATYPE = 46;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DATATYPE__ATTRIBUTE = DATATYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DATATYPE__OWNER = DATATYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DATATYPE__CONTAINER = DATATYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DATATYPE__NAME = DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DATATYPE__IS_ABSTRACT = DATATYPE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DATATYPE__GENERAL = DATATYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DATATYPE__GENERALIZATION = DATATYPE__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Structural Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DATATYPE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.subCollectionOfImpl <em>sub Collection Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.subCollectionOfImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getsubCollectionOf()
	 * @generated
	 */
	int SUB_COLLECTION_OF = 48;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_OF__ATTRIBUTE = MERONYMIC__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_OF__OWNER = MERONYMIC__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_OF__CONTAINER = MERONYMIC__CONTAINER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_OF__RELATED_ELEMENT = MERONYMIC__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_OF__TARGET = MERONYMIC__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_OF__SOURCE = MERONYMIC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_OF__TARGET_AUX1 = MERONYMIC__TARGET_AUX1;

	/**
	 * The feature id for the '<em><b>Source Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_OF__SOURCE_AUX1 = MERONYMIC__SOURCE_AUX1;

	/**
	 * The feature id for the '<em><b>Target Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_OF__TARGET_AUX2 = MERONYMIC__TARGET_AUX2;

	/**
	 * The feature id for the '<em><b>Source Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_OF__SOURCE_AUX2 = MERONYMIC__SOURCE_AUX2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_OF__NAME = MERONYMIC__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_OF__IS_ABSTRACT = MERONYMIC__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_OF__GENERAL = MERONYMIC__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_OF__GENERALIZATION = MERONYMIC__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Is Shareable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_OF__IS_SHAREABLE = MERONYMIC__IS_SHAREABLE;

	/**
	 * The feature id for the '<em><b>Is Essential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_OF__IS_ESSENTIAL = MERONYMIC__IS_ESSENTIAL;

	/**
	 * The feature id for the '<em><b>Is Inseparable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_OF__IS_INSEPARABLE = MERONYMIC__IS_INSEPARABLE;

	/**
	 * The feature id for the '<em><b>Is Immutable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_OF__IS_IMMUTABLE_PART = MERONYMIC__IS_IMMUTABLE_PART;

	/**
	 * The feature id for the '<em><b>Is Immutable Whole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_OF__IS_IMMUTABLE_WHOLE = MERONYMIC__IS_IMMUTABLE_WHOLE;

	/**
	 * The number of structural features of the '<em>sub Collection Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_OF_FEATURE_COUNT = MERONYMIC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.SubKindImpl <em>Sub Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.SubKindImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getSubKind()
	 * @generated
	 */
	int SUB_KIND = 49;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_KIND__ATTRIBUTE = RIGID_SORTAL_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_KIND__OWNER = RIGID_SORTAL_CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_KIND__CONTAINER = RIGID_SORTAL_CLASS__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_KIND__NAME = RIGID_SORTAL_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_KIND__IS_ABSTRACT = RIGID_SORTAL_CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_KIND__GENERAL = RIGID_SORTAL_CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_KIND__GENERALIZATION = RIGID_SORTAL_CLASS__GENERALIZATION;

	/**
	 * The number of structural features of the '<em>Sub Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_KIND_FEATURE_COUNT = RIGID_SORTAL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMLPlus.impl.subQuantityOfImpl <em>sub Quantity Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMLPlus.impl.subQuantityOfImpl
	 * @see UMLPlus.impl.UMLPlusPackageImpl#getsubQuantityOf()
	 * @generated
	 */
	int SUB_QUANTITY_OF = 50;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_QUANTITY_OF__ATTRIBUTE = MERONYMIC__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_QUANTITY_OF__OWNER = MERONYMIC__OWNER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_QUANTITY_OF__CONTAINER = MERONYMIC__CONTAINER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_QUANTITY_OF__RELATED_ELEMENT = MERONYMIC__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_QUANTITY_OF__TARGET = MERONYMIC__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_QUANTITY_OF__SOURCE = MERONYMIC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_QUANTITY_OF__TARGET_AUX1 = MERONYMIC__TARGET_AUX1;

	/**
	 * The feature id for the '<em><b>Source Aux1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_QUANTITY_OF__SOURCE_AUX1 = MERONYMIC__SOURCE_AUX1;

	/**
	 * The feature id for the '<em><b>Target Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_QUANTITY_OF__TARGET_AUX2 = MERONYMIC__TARGET_AUX2;

	/**
	 * The feature id for the '<em><b>Source Aux2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_QUANTITY_OF__SOURCE_AUX2 = MERONYMIC__SOURCE_AUX2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_QUANTITY_OF__NAME = MERONYMIC__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_QUANTITY_OF__IS_ABSTRACT = MERONYMIC__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_QUANTITY_OF__GENERAL = MERONYMIC__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_QUANTITY_OF__GENERALIZATION = MERONYMIC__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Is Shareable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_QUANTITY_OF__IS_SHAREABLE = MERONYMIC__IS_SHAREABLE;

	/**
	 * The feature id for the '<em><b>Is Essential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_QUANTITY_OF__IS_ESSENTIAL = MERONYMIC__IS_ESSENTIAL;

	/**
	 * The feature id for the '<em><b>Is Inseparable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_QUANTITY_OF__IS_INSEPARABLE = MERONYMIC__IS_INSEPARABLE;

	/**
	 * The feature id for the '<em><b>Is Immutable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_QUANTITY_OF__IS_IMMUTABLE_PART = MERONYMIC__IS_IMMUTABLE_PART;

	/**
	 * The feature id for the '<em><b>Is Immutable Whole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_QUANTITY_OF__IS_IMMUTABLE_WHOLE = MERONYMIC__IS_IMMUTABLE_WHOLE;

	/**
	 * The number of structural features of the '<em>sub Quantity Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_QUANTITY_OF_FEATURE_COUNT = MERONYMIC_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link UMLPlus.AntiRigidMixinClass <em>Anti Rigid Mixin Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anti Rigid Mixin Class</em>'.
	 * @see UMLPlus.AntiRigidMixinClass
	 * @generated
	 */
	EClass getAntiRigidMixinClass();

	/**
	 * Returns the meta object for class '{@link UMLPlus.AntiRigidSortalClass <em>Anti Rigid Sortal Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anti Rigid Sortal Class</em>'.
	 * @see UMLPlus.AntiRigidSortalClass
	 * @generated
	 */
	EClass getAntiRigidSortalClass();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see UMLPlus.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference list '{@link UMLPlus.Association#getAssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association End</em>'.
	 * @see UMLPlus.Association#getAssociationEnd()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_AssociationEnd();

	/**
	 * Returns the meta object for the reference list '{@link UMLPlus.Association#getAssociationEndAux1 <em>Association End Aux1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association End Aux1</em>'.
	 * @see UMLPlus.Association#getAssociationEndAux1()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_AssociationEndAux1();

	/**
	 * Returns the meta object for the reference list '{@link UMLPlus.Association#getAssociationEndAux2 <em>Association End Aux2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association End Aux2</em>'.
	 * @see UMLPlus.Association#getAssociationEndAux2()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_AssociationEndAux2();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see UMLPlus.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Characterization <em>Characterization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characterization</em>'.
	 * @see UMLPlus.Characterization
	 * @generated
	 */
	EClass getCharacterization();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see UMLPlus.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see UMLPlus.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the attribute '{@link UMLPlus.Classifier#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see UMLPlus.Classifier#isIsAbstract()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_IsAbstract();

	/**
	 * Returns the meta object for the reference list '{@link UMLPlus.Classifier#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>General</em>'.
	 * @see UMLPlus.Classifier#getGeneral()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_General();

	/**
	 * Returns the meta object for the containment reference list '{@link UMLPlus.Classifier#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generalization</em>'.
	 * @see UMLPlus.Classifier#getGeneralization()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Generalization();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Collective <em>Collective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collective</em>'.
	 * @see UMLPlus.Collective
	 * @generated
	 */
	EClass getCollective();

	/**
	 * Returns the meta object for the attribute '{@link UMLPlus.Collective#isIsExtensional <em>Is Extensional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Extensional</em>'.
	 * @see UMLPlus.Collective#isIsExtensional()
	 * @see #getCollective()
	 * @generated
	 */
	EAttribute getCollective_IsExtensional();

	/**
	 * Returns the meta object for class '{@link UMLPlus.componentOf <em>component Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>component Of</em>'.
	 * @see UMLPlus.componentOf
	 * @generated
	 */
	EClass getcomponentOf();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see UMLPlus.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link UMLPlus.Container#getInstanciarElement <em>Instanciar Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instanciar Element</em>'.
	 * @see UMLPlus.Container#getInstanciarElement()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_InstanciarElement();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype</em>'.
	 * @see UMLPlus.Datatype
	 * @generated
	 */
	EClass getDatatype();

	/**
	 * Returns the meta object for class '{@link UMLPlus.DatatypeAssociation <em>Datatype Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Association</em>'.
	 * @see UMLPlus.DatatypeAssociation
	 * @generated
	 */
	EClass getDatatypeAssociation();

	/**
	 * Returns the meta object for class '{@link UMLPlus.DependencyRelationship <em>Dependency Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Relationship</em>'.
	 * @see UMLPlus.DependencyRelationship
	 * @generated
	 */
	EClass getDependencyRelationship();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Derivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derivation</em>'.
	 * @see UMLPlus.Derivation
	 * @generated
	 */
	EClass getDerivation();

	/**
	 * Returns the meta object for class '{@link UMLPlus.DirectedBinaryRelationship <em>Directed Binary Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Binary Relationship</em>'.
	 * @see UMLPlus.DirectedBinaryRelationship
	 * @generated
	 */
	EClass getDirectedBinaryRelationship();

	/**
	 * Returns the meta object for class '{@link UMLPlus.DirectedRelationship <em>Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Relationship</em>'.
	 * @see UMLPlus.DirectedRelationship
	 * @generated
	 */
	EClass getDirectedRelationship();

	/**
	 * Returns the meta object for the reference list '{@link UMLPlus.DirectedRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see UMLPlus.DirectedRelationship#getTarget()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_Target();

	/**
	 * Returns the meta object for the reference list '{@link UMLPlus.DirectedRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see UMLPlus.DirectedRelationship#getSource()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_Source();

	/**
	 * Returns the meta object for the reference list '{@link UMLPlus.DirectedRelationship#getTargetAux1 <em>Target Aux1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Aux1</em>'.
	 * @see UMLPlus.DirectedRelationship#getTargetAux1()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_TargetAux1();

	/**
	 * Returns the meta object for the reference list '{@link UMLPlus.DirectedRelationship#getSourceAux1 <em>Source Aux1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Aux1</em>'.
	 * @see UMLPlus.DirectedRelationship#getSourceAux1()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_SourceAux1();

	/**
	 * Returns the meta object for the containment reference list '{@link UMLPlus.DirectedRelationship#getTargetAux2 <em>Target Aux2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Aux2</em>'.
	 * @see UMLPlus.DirectedRelationship#getTargetAux2()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_TargetAux2();

	/**
	 * Returns the meta object for the containment reference list '{@link UMLPlus.DirectedRelationship#getSourceAux2 <em>Source Aux2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Aux2</em>'.
	 * @see UMLPlus.DirectedRelationship#getSourceAux2()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_SourceAux2();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see UMLPlus.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the containment reference list '{@link UMLPlus.Element#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see UMLPlus.Element#getAttribute()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Attribute();

	/**
	 * Returns the meta object for the container reference '{@link UMLPlus.Element#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see UMLPlus.Element#getOwner()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Owner();

	/**
	 * Returns the meta object for the container reference '{@link UMLPlus.Element#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see UMLPlus.Element#getContainer()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Container();

	/**
	 * Returns the meta object for class '{@link UMLPlus.FormalAssociation <em>Formal Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Association</em>'.
	 * @see UMLPlus.FormalAssociation
	 * @generated
	 */
	EClass getFormalAssociation();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see UMLPlus.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the container reference '{@link UMLPlus.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specific</em>'.
	 * @see UMLPlus.Generalization#getSpecific()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Specific();

	/**
	 * Returns the meta object for the reference '{@link UMLPlus.Generalization#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>General</em>'.
	 * @see UMLPlus.Generalization#getGeneral()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_General();

	/**
	 * Returns the meta object for the reference list '{@link UMLPlus.Generalization#getSemnome <em>Semnome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semnome</em>'.
	 * @see UMLPlus.Generalization#getSemnome()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Semnome();

	/**
	 * Returns the meta object for class '{@link UMLPlus.GeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization Set</em>'.
	 * @see UMLPlus.GeneralizationSet
	 * @generated
	 */
	EClass getGeneralizationSet();

	/**
	 * Returns the meta object for the attribute '{@link UMLPlus.GeneralizationSet#isIsCovering <em>Is Covering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Covering</em>'.
	 * @see UMLPlus.GeneralizationSet#isIsCovering()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EAttribute getGeneralizationSet_IsCovering();

	/**
	 * Returns the meta object for the attribute '{@link UMLPlus.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Disjoint</em>'.
	 * @see UMLPlus.GeneralizationSet#isIsDisjoint()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EAttribute getGeneralizationSet_IsDisjoint();

	/**
	 * Returns the meta object for the reference list '{@link UMLPlus.GeneralizationSet#getSemnome <em>Semnome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semnome</em>'.
	 * @see UMLPlus.GeneralizationSet#getSemnome()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EReference getGeneralizationSet_Semnome();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Kind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kind</em>'.
	 * @see UMLPlus.Kind
	 * @generated
	 */
	EClass getKind();

	/**
	 * Returns the meta object for class '{@link UMLPlus.MaterialAssociation <em>Material Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material Association</em>'.
	 * @see UMLPlus.MaterialAssociation
	 * @generated
	 */
	EClass getMaterialAssociation();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Mediation <em>Mediation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediation</em>'.
	 * @see UMLPlus.Mediation
	 * @generated
	 */
	EClass getMediation();

	/**
	 * Returns the meta object for class '{@link UMLPlus.memberOf <em>member Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>member Of</em>'.
	 * @see UMLPlus.memberOf
	 * @generated
	 */
	EClass getmemberOf();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Meronymic <em>Meronymic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meronymic</em>'.
	 * @see UMLPlus.Meronymic
	 * @generated
	 */
	EClass getMeronymic();

	/**
	 * Returns the meta object for the attribute '{@link UMLPlus.Meronymic#isIsShareable <em>Is Shareable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Shareable</em>'.
	 * @see UMLPlus.Meronymic#isIsShareable()
	 * @see #getMeronymic()
	 * @generated
	 */
	EAttribute getMeronymic_IsShareable();

	/**
	 * Returns the meta object for the attribute '{@link UMLPlus.Meronymic#isIsEssential <em>Is Essential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Essential</em>'.
	 * @see UMLPlus.Meronymic#isIsEssential()
	 * @see #getMeronymic()
	 * @generated
	 */
	EAttribute getMeronymic_IsEssential();

	/**
	 * Returns the meta object for the attribute '{@link UMLPlus.Meronymic#isIsInseparable <em>Is Inseparable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Inseparable</em>'.
	 * @see UMLPlus.Meronymic#isIsInseparable()
	 * @see #getMeronymic()
	 * @generated
	 */
	EAttribute getMeronymic_IsInseparable();

	/**
	 * Returns the meta object for the attribute '{@link UMLPlus.Meronymic#isIsImmutablePart <em>Is Immutable Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Immutable Part</em>'.
	 * @see UMLPlus.Meronymic#isIsImmutablePart()
	 * @see #getMeronymic()
	 * @generated
	 */
	EAttribute getMeronymic_IsImmutablePart();

	/**
	 * Returns the meta object for the attribute '{@link UMLPlus.Meronymic#isIsImmutableWhole <em>Is Immutable Whole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Immutable Whole</em>'.
	 * @see UMLPlus.Meronymic#isIsImmutableWhole()
	 * @see #getMeronymic()
	 * @generated
	 */
	EAttribute getMeronymic_IsImmutableWhole();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Mixin <em>Mixin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixin</em>'.
	 * @see UMLPlus.Mixin
	 * @generated
	 */
	EClass getMixin();

	/**
	 * Returns the meta object for class '{@link UMLPlus.MixinClass <em>Mixin Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixin Class</em>'.
	 * @see UMLPlus.MixinClass
	 * @generated
	 */
	EClass getMixinClass();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode</em>'.
	 * @see UMLPlus.Mode
	 * @generated
	 */
	EClass getMode();

	/**
	 * Returns the meta object for class '{@link UMLPlus.MomentClass <em>Moment Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moment Class</em>'.
	 * @see UMLPlus.MomentClass
	 * @generated
	 */
	EClass getMomentClass();

	/**
	 * Returns the meta object for class '{@link UMLPlus.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Element</em>'.
	 * @see UMLPlus.MultiplicityElement
	 * @generated
	 */
	EClass getMultiplicityElement();

	/**
	 * Returns the meta object for the attribute '{@link UMLPlus.MultiplicityElement#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see UMLPlus.MultiplicityElement#getUpper()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_Upper();

	/**
	 * Returns the meta object for the attribute '{@link UMLPlus.MultiplicityElement#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see UMLPlus.MultiplicityElement#getLower()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_Lower();

	/**
	 * Returns the meta object for class '{@link UMLPlus.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see UMLPlus.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link UMLPlus.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UMLPlus.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link UMLPlus.NonRigidMixinClass <em>Non Rigid Mixin Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Rigid Mixin Class</em>'.
	 * @see UMLPlus.NonRigidMixinClass
	 * @generated
	 */
	EClass getNonRigidMixinClass();

	/**
	 * Returns the meta object for class '{@link UMLPlus.ObjectClass <em>Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Class</em>'.
	 * @see UMLPlus.ObjectClass
	 * @generated
	 */
	EClass getObjectClass();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase</em>'.
	 * @see UMLPlus.Phase
	 * @generated
	 */
	EClass getPhase();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see UMLPlus.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link UMLPlus.Property#isIsDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see UMLPlus.Property#isIsDerived()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsDerived();

	/**
	 * Returns the meta object for the attribute '{@link UMLPlus.Property#isIsReadOnly <em>Is Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Read Only</em>'.
	 * @see UMLPlus.Property#isIsReadOnly()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link UMLPlus.Property#isIsNavigable <em>Is Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Navigable</em>'.
	 * @see UMLPlus.Property#isIsNavigable()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsNavigable();

	/**
	 * Returns the meta object for the reference '{@link UMLPlus.Property#getEndType <em>End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Type</em>'.
	 * @see UMLPlus.Property#getEndType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_EndType();

	/**
	 * Returns the meta object for the reference '{@link UMLPlus.Property#getAssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association End</em>'.
	 * @see UMLPlus.Property#getAssociationEnd()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_AssociationEnd();

	/**
	 * Returns the meta object for the reference '{@link UMLPlus.Property#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see UMLPlus.Property#getSource()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Source();

	/**
	 * Returns the meta object for the reference '{@link UMLPlus.Property#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see UMLPlus.Property#getTarget()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Target();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see UMLPlus.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for class '{@link UMLPlus.RelationalClassifier <em>Relational Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Classifier</em>'.
	 * @see UMLPlus.RelationalClassifier
	 * @generated
	 */
	EClass getRelationalClassifier();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see UMLPlus.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference list '{@link UMLPlus.Relationship#getRelatedElement <em>Related Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Element</em>'.
	 * @see UMLPlus.Relationship#getRelatedElement()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_RelatedElement();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Relator <em>Relator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relator</em>'.
	 * @see UMLPlus.Relator
	 * @generated
	 */
	EClass getRelator();

	/**
	 * Returns the meta object for class '{@link UMLPlus.RigidMixinClass <em>Rigid Mixin Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rigid Mixin Class</em>'.
	 * @see UMLPlus.RigidMixinClass
	 * @generated
	 */
	EClass getRigidMixinClass();

	/**
	 * Returns the meta object for class '{@link UMLPlus.RigidSortalClass <em>Rigid Sortal Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rigid Sortal Class</em>'.
	 * @see UMLPlus.RigidSortalClass
	 * @generated
	 */
	EClass getRigidSortalClass();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see UMLPlus.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link UMLPlus.RoleMixin <em>Role Mixin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Mixin</em>'.
	 * @see UMLPlus.RoleMixin
	 * @generated
	 */
	EClass getRoleMixin();

	/**
	 * Returns the meta object for class '{@link UMLPlus.SemiRigidMixin <em>Semi Rigid Mixin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semi Rigid Mixin</em>'.
	 * @see UMLPlus.SemiRigidMixin
	 * @generated
	 */
	EClass getSemiRigidMixin();

	/**
	 * Returns the meta object for class '{@link UMLPlus.SimpleDatatype <em>Simple Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Datatype</em>'.
	 * @see UMLPlus.SimpleDatatype
	 * @generated
	 */
	EClass getSimpleDatatype();

	/**
	 * Returns the meta object for class '{@link UMLPlus.SortalClass <em>Sortal Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sortal Class</em>'.
	 * @see UMLPlus.SortalClass
	 * @generated
	 */
	EClass getSortalClass();

	/**
	 * Returns the meta object for class '{@link UMLPlus.StructuralDatatype <em>Structural Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Datatype</em>'.
	 * @see UMLPlus.StructuralDatatype
	 * @generated
	 */
	EClass getStructuralDatatype();

	/**
	 * Returns the meta object for class '{@link UMLPlus.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Feature</em>'.
	 * @see UMLPlus.StructuralFeature
	 * @generated
	 */
	EClass getStructuralFeature();

	/**
	 * Returns the meta object for class '{@link UMLPlus.subCollectionOf <em>sub Collection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sub Collection Of</em>'.
	 * @see UMLPlus.subCollectionOf
	 * @generated
	 */
	EClass getsubCollectionOf();

	/**
	 * Returns the meta object for class '{@link UMLPlus.SubKind <em>Sub Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Kind</em>'.
	 * @see UMLPlus.SubKind
	 * @generated
	 */
	EClass getSubKind();

	/**
	 * Returns the meta object for class '{@link UMLPlus.subQuantityOf <em>sub Quantity Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sub Quantity Of</em>'.
	 * @see UMLPlus.subQuantityOf
	 * @generated
	 */
	EClass getsubQuantityOf();

	/**
	 * Returns the meta object for class '{@link UMLPlus.SubstanceSortal <em>Substance Sortal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substance Sortal</em>'.
	 * @see UMLPlus.SubstanceSortal
	 * @generated
	 */
	EClass getSubstanceSortal();

	/**
	 * Returns the meta object for class '{@link UMLPlus.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see UMLPlus.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UMLPlusFactory getUMLPlusFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link UMLPlus.impl.AntiRigidMixinClassImpl <em>Anti Rigid Mixin Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.AntiRigidMixinClassImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getAntiRigidMixinClass()
		 * @generated
		 */
		EClass ANTI_RIGID_MIXIN_CLASS = eINSTANCE.getAntiRigidMixinClass();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.AntiRigidSortalClassImpl <em>Anti Rigid Sortal Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.AntiRigidSortalClassImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getAntiRigidSortalClass()
		 * @generated
		 */
		EClass ANTI_RIGID_SORTAL_CLASS = eINSTANCE.getAntiRigidSortalClass();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.AssociationImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Association End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__ASSOCIATION_END = eINSTANCE.getAssociation_AssociationEnd();

		/**
		 * The meta object literal for the '<em><b>Association End Aux1</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__ASSOCIATION_END_AUX1 = eINSTANCE.getAssociation_AssociationEndAux1();

		/**
		 * The meta object literal for the '<em><b>Association End Aux2</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__ASSOCIATION_END_AUX2 = eINSTANCE.getAssociation_AssociationEndAux2();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.CategoryImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.CharacterizationImpl <em>Characterization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.CharacterizationImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getCharacterization()
		 * @generated
		 */
		EClass CHARACTERIZATION = eINSTANCE.getCharacterization();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.ClassImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.ClassifierImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__IS_ABSTRACT = eINSTANCE.getClassifier_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__GENERAL = eINSTANCE.getClassifier_General();

		/**
		 * The meta object literal for the '<em><b>Generalization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__GENERALIZATION = eINSTANCE.getClassifier_Generalization();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.CollectiveImpl <em>Collective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.CollectiveImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getCollective()
		 * @generated
		 */
		EClass COLLECTIVE = eINSTANCE.getCollective();

		/**
		 * The meta object literal for the '<em><b>Is Extensional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTIVE__IS_EXTENSIONAL = eINSTANCE.getCollective_IsExtensional();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.componentOfImpl <em>component Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.componentOfImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getcomponentOf()
		 * @generated
		 */
		EClass COMPONENT_OF = eINSTANCE.getcomponentOf();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.ContainerImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Instanciar Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__INSTANCIAR_ELEMENT = eINSTANCE.getContainer_InstanciarElement();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.DatatypeImpl <em>Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.DatatypeImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getDatatype()
		 * @generated
		 */
		EClass DATATYPE = eINSTANCE.getDatatype();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.DatatypeAssociationImpl <em>Datatype Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.DatatypeAssociationImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getDatatypeAssociation()
		 * @generated
		 */
		EClass DATATYPE_ASSOCIATION = eINSTANCE.getDatatypeAssociation();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.DependencyRelationshipImpl <em>Dependency Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.DependencyRelationshipImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getDependencyRelationship()
		 * @generated
		 */
		EClass DEPENDENCY_RELATIONSHIP = eINSTANCE.getDependencyRelationship();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.DerivationImpl <em>Derivation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.DerivationImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getDerivation()
		 * @generated
		 */
		EClass DERIVATION = eINSTANCE.getDerivation();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.DirectedBinaryRelationshipImpl <em>Directed Binary Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.DirectedBinaryRelationshipImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getDirectedBinaryRelationship()
		 * @generated
		 */
		EClass DIRECTED_BINARY_RELATIONSHIP = eINSTANCE.getDirectedBinaryRelationship();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.DirectedRelationshipImpl <em>Directed Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.DirectedRelationshipImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getDirectedRelationship()
		 * @generated
		 */
		EClass DIRECTED_RELATIONSHIP = eINSTANCE.getDirectedRelationship();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP__TARGET = eINSTANCE.getDirectedRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP__SOURCE = eINSTANCE.getDirectedRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target Aux1</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP__TARGET_AUX1 = eINSTANCE.getDirectedRelationship_TargetAux1();

		/**
		 * The meta object literal for the '<em><b>Source Aux1</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP__SOURCE_AUX1 = eINSTANCE.getDirectedRelationship_SourceAux1();

		/**
		 * The meta object literal for the '<em><b>Target Aux2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP__TARGET_AUX2 = eINSTANCE.getDirectedRelationship_TargetAux2();

		/**
		 * The meta object literal for the '<em><b>Source Aux2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP__SOURCE_AUX2 = eINSTANCE.getDirectedRelationship_SourceAux2();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.ElementImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ATTRIBUTE = eINSTANCE.getElement_Attribute();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__OWNER = eINSTANCE.getElement_Owner();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CONTAINER = eINSTANCE.getElement_Container();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.FormalAssociationImpl <em>Formal Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.FormalAssociationImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getFormalAssociation()
		 * @generated
		 */
		EClass FORMAL_ASSOCIATION = eINSTANCE.getFormalAssociation();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.GeneralizationImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>Specific</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__SPECIFIC = eINSTANCE.getGeneralization_Specific();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__GENERAL = eINSTANCE.getGeneralization_General();

		/**
		 * The meta object literal for the '<em><b>Semnome</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__SEMNOME = eINSTANCE.getGeneralization_Semnome();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.GeneralizationSetImpl <em>Generalization Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.GeneralizationSetImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getGeneralizationSet()
		 * @generated
		 */
		EClass GENERALIZATION_SET = eINSTANCE.getGeneralizationSet();

		/**
		 * The meta object literal for the '<em><b>Is Covering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_SET__IS_COVERING = eINSTANCE.getGeneralizationSet_IsCovering();

		/**
		 * The meta object literal for the '<em><b>Is Disjoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_SET__IS_DISJOINT = eINSTANCE.getGeneralizationSet_IsDisjoint();

		/**
		 * The meta object literal for the '<em><b>Semnome</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION_SET__SEMNOME = eINSTANCE.getGeneralizationSet_Semnome();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.KindImpl <em>Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.KindImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getKind()
		 * @generated
		 */
		EClass KIND = eINSTANCE.getKind();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.MaterialAssociationImpl <em>Material Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.MaterialAssociationImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getMaterialAssociation()
		 * @generated
		 */
		EClass MATERIAL_ASSOCIATION = eINSTANCE.getMaterialAssociation();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.MediationImpl <em>Mediation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.MediationImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getMediation()
		 * @generated
		 */
		EClass MEDIATION = eINSTANCE.getMediation();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.memberOfImpl <em>member Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.memberOfImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getmemberOf()
		 * @generated
		 */
		EClass MEMBER_OF = eINSTANCE.getmemberOf();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.MeronymicImpl <em>Meronymic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.MeronymicImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getMeronymic()
		 * @generated
		 */
		EClass MERONYMIC = eINSTANCE.getMeronymic();

		/**
		 * The meta object literal for the '<em><b>Is Shareable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERONYMIC__IS_SHAREABLE = eINSTANCE.getMeronymic_IsShareable();

		/**
		 * The meta object literal for the '<em><b>Is Essential</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERONYMIC__IS_ESSENTIAL = eINSTANCE.getMeronymic_IsEssential();

		/**
		 * The meta object literal for the '<em><b>Is Inseparable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERONYMIC__IS_INSEPARABLE = eINSTANCE.getMeronymic_IsInseparable();

		/**
		 * The meta object literal for the '<em><b>Is Immutable Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERONYMIC__IS_IMMUTABLE_PART = eINSTANCE.getMeronymic_IsImmutablePart();

		/**
		 * The meta object literal for the '<em><b>Is Immutable Whole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERONYMIC__IS_IMMUTABLE_WHOLE = eINSTANCE.getMeronymic_IsImmutableWhole();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.MixinImpl <em>Mixin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.MixinImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getMixin()
		 * @generated
		 */
		EClass MIXIN = eINSTANCE.getMixin();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.MixinClassImpl <em>Mixin Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.MixinClassImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getMixinClass()
		 * @generated
		 */
		EClass MIXIN_CLASS = eINSTANCE.getMixinClass();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.ModeImpl <em>Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.ModeImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getMode()
		 * @generated
		 */
		EClass MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.MomentClassImpl <em>Moment Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.MomentClassImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getMomentClass()
		 * @generated
		 */
		EClass MOMENT_CLASS = eINSTANCE.getMomentClass();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.MultiplicityElementImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getMultiplicityElement()
		 * @generated
		 */
		EClass MULTIPLICITY_ELEMENT = eINSTANCE.getMultiplicityElement();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__UPPER = eINSTANCE.getMultiplicityElement_Upper();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__LOWER = eINSTANCE.getMultiplicityElement_Lower();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.NamedElementImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.NonRigidMixinClassImpl <em>Non Rigid Mixin Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.NonRigidMixinClassImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getNonRigidMixinClass()
		 * @generated
		 */
		EClass NON_RIGID_MIXIN_CLASS = eINSTANCE.getNonRigidMixinClass();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.ObjectClassImpl <em>Object Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.ObjectClassImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getObjectClass()
		 * @generated
		 */
		EClass OBJECT_CLASS = eINSTANCE.getObjectClass();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.PhaseImpl <em>Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.PhaseImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getPhase()
		 * @generated
		 */
		EClass PHASE = eINSTANCE.getPhase();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.PropertyImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Is Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_DERIVED = eINSTANCE.getProperty_IsDerived();

		/**
		 * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_READ_ONLY = eINSTANCE.getProperty_IsReadOnly();

		/**
		 * The meta object literal for the '<em><b>Is Navigable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_NAVIGABLE = eINSTANCE.getProperty_IsNavigable();

		/**
		 * The meta object literal for the '<em><b>End Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__END_TYPE = eINSTANCE.getProperty_EndType();

		/**
		 * The meta object literal for the '<em><b>Association End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__ASSOCIATION_END = eINSTANCE.getProperty_AssociationEnd();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__SOURCE = eINSTANCE.getProperty_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__TARGET = eINSTANCE.getProperty_Target();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.QuantityImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.RelationalClassifierImpl <em>Relational Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.RelationalClassifierImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getRelationalClassifier()
		 * @generated
		 */
		EClass RELATIONAL_CLASSIFIER = eINSTANCE.getRelationalClassifier();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.RelationshipImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Related Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__RELATED_ELEMENT = eINSTANCE.getRelationship_RelatedElement();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.RelatorImpl <em>Relator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.RelatorImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getRelator()
		 * @generated
		 */
		EClass RELATOR = eINSTANCE.getRelator();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.RigidMixinClassImpl <em>Rigid Mixin Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.RigidMixinClassImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getRigidMixinClass()
		 * @generated
		 */
		EClass RIGID_MIXIN_CLASS = eINSTANCE.getRigidMixinClass();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.RigidSortalClassImpl <em>Rigid Sortal Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.RigidSortalClassImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getRigidSortalClass()
		 * @generated
		 */
		EClass RIGID_SORTAL_CLASS = eINSTANCE.getRigidSortalClass();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.RoleImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.RoleMixinImpl <em>Role Mixin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.RoleMixinImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getRoleMixin()
		 * @generated
		 */
		EClass ROLE_MIXIN = eINSTANCE.getRoleMixin();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.SemiRigidMixinImpl <em>Semi Rigid Mixin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.SemiRigidMixinImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getSemiRigidMixin()
		 * @generated
		 */
		EClass SEMI_RIGID_MIXIN = eINSTANCE.getSemiRigidMixin();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.SimpleDatatypeImpl <em>Simple Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.SimpleDatatypeImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getSimpleDatatype()
		 * @generated
		 */
		EClass SIMPLE_DATATYPE = eINSTANCE.getSimpleDatatype();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.SortalClassImpl <em>Sortal Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.SortalClassImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getSortalClass()
		 * @generated
		 */
		EClass SORTAL_CLASS = eINSTANCE.getSortalClass();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.StructuralDatatypeImpl <em>Structural Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.StructuralDatatypeImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getStructuralDatatype()
		 * @generated
		 */
		EClass STRUCTURAL_DATATYPE = eINSTANCE.getStructuralDatatype();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.StructuralFeatureImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getStructuralFeature()
		 * @generated
		 */
		EClass STRUCTURAL_FEATURE = eINSTANCE.getStructuralFeature();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.subCollectionOfImpl <em>sub Collection Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.subCollectionOfImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getsubCollectionOf()
		 * @generated
		 */
		EClass SUB_COLLECTION_OF = eINSTANCE.getsubCollectionOf();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.SubKindImpl <em>Sub Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.SubKindImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getSubKind()
		 * @generated
		 */
		EClass SUB_KIND = eINSTANCE.getSubKind();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.subQuantityOfImpl <em>sub Quantity Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.subQuantityOfImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getsubQuantityOf()
		 * @generated
		 */
		EClass SUB_QUANTITY_OF = eINSTANCE.getsubQuantityOf();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.SubstanceSortalImpl <em>Substance Sortal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.SubstanceSortalImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getSubstanceSortal()
		 * @generated
		 */
		EClass SUBSTANCE_SORTAL = eINSTANCE.getSubstanceSortal();

		/**
		 * The meta object literal for the '{@link UMLPlus.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMLPlus.impl.TypeImpl
		 * @see UMLPlus.impl.UMLPlusPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

	}

} //UMLPlusPackage
