/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML;

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
 * @see OntoUML.OntoUMLFactory
 * @model kind="package"
 * @generated
 */
public interface OntoUMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "OntoUML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "OntoUML";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "OntoUML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OntoUMLPackage eINSTANCE = OntoUML.impl.OntoUMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link OntoUML.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.ElementImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getElement()
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
	 * The meta object id for the '{@link OntoUML.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.NamedElementImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getNamedElement()
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
	 * The meta object id for the '{@link OntoUML.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.TypeImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getType()
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
	 * The meta object id for the '{@link OntoUML.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.ClassifierImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getClassifier()
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
	 * The meta object id for the '{@link OntoUML.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.ClassImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getClass_()
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
	 * The meta object id for the '{@link OntoUML.impl.ObjectClassImpl <em>Object Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.ObjectClassImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getObjectClass()
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
	 * The meta object id for the '{@link OntoUML.impl.MixinClassImpl <em>Mixin Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.MixinClassImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getMixinClass()
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
	 * The meta object id for the '{@link OntoUML.impl.NonRigidMixinClassImpl <em>Non Rigid Mixin Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.NonRigidMixinClassImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getNonRigidMixinClass()
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
	 * The meta object id for the '{@link OntoUML.impl.AntiRigidMixinClassImpl <em>Anti Rigid Mixin Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.AntiRigidMixinClassImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getAntiRigidMixinClass()
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
	 * The meta object id for the '{@link OntoUML.impl.SortalClassImpl <em>Sortal Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.SortalClassImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getSortalClass()
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
	 * The meta object id for the '{@link OntoUML.impl.AntiRigidSortalClassImpl <em>Anti Rigid Sortal Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.AntiRigidSortalClassImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getAntiRigidSortalClass()
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
	 * The meta object id for the '{@link OntoUML.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.RelationshipImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getRelationship()
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
	 * The meta object id for the '{@link OntoUML.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.AssociationImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getAssociation()
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
	 * The meta object id for the '{@link OntoUML.impl.RigidMixinClassImpl <em>Rigid Mixin Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.RigidMixinClassImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getRigidMixinClass()
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
	 * The meta object id for the '{@link OntoUML.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.CategoryImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getCategory()
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
	 * The meta object id for the '{@link OntoUML.impl.DirectedRelationshipImpl <em>Directed Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.DirectedRelationshipImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getDirectedRelationship()
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
	 * The meta object id for the '{@link OntoUML.impl.DirectedBinaryRelationshipImpl <em>Directed Binary Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.DirectedBinaryRelationshipImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getDirectedBinaryRelationship()
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
	 * The meta object id for the '{@link OntoUML.impl.DependencyRelationshipImpl <em>Dependency Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.DependencyRelationshipImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getDependencyRelationship()
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
	 * The meta object id for the '{@link OntoUML.impl.CharacterizationImpl <em>Characterization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.CharacterizationImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getCharacterization()
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
	 * The meta object id for the '{@link OntoUML.impl.RigidSortalClassImpl <em>Rigid Sortal Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.RigidSortalClassImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getRigidSortalClass()
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
	 * The meta object id for the '{@link OntoUML.impl.SubstanceSortalImpl <em>Substance Sortal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.SubstanceSortalImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getSubstanceSortal()
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
	 * The meta object id for the '{@link OntoUML.impl.CollectiveImpl <em>Collective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.CollectiveImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getCollective()
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
	 * The meta object id for the '{@link OntoUML.impl.MeronymicImpl <em>Meronymic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.MeronymicImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getMeronymic()
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
	 * The meta object id for the '{@link OntoUML.impl.componentOfImpl <em>component Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.componentOfImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getcomponentOf()
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
	 * The meta object id for the '{@link OntoUML.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.ContainerImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getContainer()
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
	 * The meta object id for the '{@link OntoUML.impl.DatatypeImpl <em>Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.DatatypeImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getDatatype()
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
	 * The meta object id for the '{@link OntoUML.impl.DatatypeAssociationImpl <em>Datatype Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.DatatypeAssociationImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getDatatypeAssociation()
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
	 * The meta object id for the '{@link OntoUML.impl.DerivationImpl <em>Derivation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.DerivationImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getDerivation()
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
	 * The meta object id for the '{@link OntoUML.impl.FormalAssociationImpl <em>Formal Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.FormalAssociationImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getFormalAssociation()
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
	 * The meta object id for the '{@link OntoUML.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.GeneralizationImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getGeneralization()
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
	 * The meta object id for the '{@link OntoUML.impl.GeneralizationSetImpl <em>Generalization Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.GeneralizationSetImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getGeneralizationSet()
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
	 * The meta object id for the '{@link OntoUML.impl.KindImpl <em>Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.KindImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getKind()
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
	 * The meta object id for the '{@link OntoUML.impl.MaterialAssociationImpl <em>Material Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.MaterialAssociationImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getMaterialAssociation()
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
	 * The meta object id for the '{@link OntoUML.impl.MediationImpl <em>Mediation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.MediationImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getMediation()
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
	 * The meta object id for the '{@link OntoUML.impl.memberOfImpl <em>member Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.memberOfImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getmemberOf()
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
	 * The meta object id for the '{@link OntoUML.impl.SemiRigidMixinImpl <em>Semi Rigid Mixin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.SemiRigidMixinImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getSemiRigidMixin()
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
	 * The meta object id for the '{@link OntoUML.impl.MixinImpl <em>Mixin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.MixinImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getMixin()
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
	 * The meta object id for the '{@link OntoUML.impl.MomentClassImpl <em>Moment Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.MomentClassImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getMomentClass()
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
	 * The meta object id for the '{@link OntoUML.impl.ModeImpl <em>Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.ModeImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getMode()
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
	 * The meta object id for the '{@link OntoUML.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.MultiplicityElementImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getMultiplicityElement()
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
	 * The meta object id for the '{@link OntoUML.impl.PhaseImpl <em>Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.PhaseImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getPhase()
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
	 * The meta object id for the '{@link OntoUML.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.StructuralFeatureImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getStructuralFeature()
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
	 * The meta object id for the '{@link OntoUML.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.PropertyImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getProperty()
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
	 * The feature id for the '<em><b>Aux</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__AUX = STRUCTURAL_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = STRUCTURAL_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link OntoUML.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.QuantityImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getQuantity()
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
	 * The meta object id for the '{@link OntoUML.impl.RelationalClassifierImpl <em>Relational Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.RelationalClassifierImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getRelationalClassifier()
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
	 * The meta object id for the '{@link OntoUML.impl.RelatorImpl <em>Relator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.RelatorImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getRelator()
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
	 * The meta object id for the '{@link OntoUML.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.RoleImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getRole()
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
	 * The meta object id for the '{@link OntoUML.impl.RoleMixinImpl <em>Role Mixin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.RoleMixinImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getRoleMixin()
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
	 * The meta object id for the '{@link OntoUML.impl.SimpleDatatypeImpl <em>Simple Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.SimpleDatatypeImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getSimpleDatatype()
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
	 * The meta object id for the '{@link OntoUML.impl.StructuralDatatypeImpl <em>Structural Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.StructuralDatatypeImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getStructuralDatatype()
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
	 * The meta object id for the '{@link OntoUML.impl.subCollectionOfImpl <em>sub Collection Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.subCollectionOfImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getsubCollectionOf()
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
	 * The meta object id for the '{@link OntoUML.impl.SubKindImpl <em>Sub Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.SubKindImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getSubKind()
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
	 * The meta object id for the '{@link OntoUML.impl.subQuantityOfImpl <em>sub Quantity Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoUML.impl.subQuantityOfImpl
	 * @see OntoUML.impl.OntoUMLPackageImpl#getsubQuantityOf()
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
	 * Returns the meta object for class '{@link OntoUML.AntiRigidMixinClass <em>Anti Rigid Mixin Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anti Rigid Mixin Class</em>'.
	 * @see OntoUML.AntiRigidMixinClass
	 * @generated
	 */
	EClass getAntiRigidMixinClass();

	/**
	 * Returns the meta object for class '{@link OntoUML.AntiRigidSortalClass <em>Anti Rigid Sortal Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anti Rigid Sortal Class</em>'.
	 * @see OntoUML.AntiRigidSortalClass
	 * @generated
	 */
	EClass getAntiRigidSortalClass();

	/**
	 * Returns the meta object for class '{@link OntoUML.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see OntoUML.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference list '{@link OntoUML.Association#getAssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association End</em>'.
	 * @see OntoUML.Association#getAssociationEnd()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_AssociationEnd();

	/**
	 * Returns the meta object for the reference list '{@link OntoUML.Association#getAssociationEndAux1 <em>Association End Aux1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association End Aux1</em>'.
	 * @see OntoUML.Association#getAssociationEndAux1()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_AssociationEndAux1();

	/**
	 * Returns the meta object for the reference list '{@link OntoUML.Association#getAssociationEndAux2 <em>Association End Aux2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association End Aux2</em>'.
	 * @see OntoUML.Association#getAssociationEndAux2()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_AssociationEndAux2();

	/**
	 * Returns the meta object for class '{@link OntoUML.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see OntoUML.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for class '{@link OntoUML.Characterization <em>Characterization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characterization</em>'.
	 * @see OntoUML.Characterization
	 * @generated
	 */
	EClass getCharacterization();

	/**
	 * Returns the meta object for class '{@link OntoUML.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see OntoUML.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for class '{@link OntoUML.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see OntoUML.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the attribute '{@link OntoUML.Classifier#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see OntoUML.Classifier#isIsAbstract()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_IsAbstract();

	/**
	 * Returns the meta object for the reference list '{@link OntoUML.Classifier#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>General</em>'.
	 * @see OntoUML.Classifier#getGeneral()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_General();

	/**
	 * Returns the meta object for the containment reference list '{@link OntoUML.Classifier#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generalization</em>'.
	 * @see OntoUML.Classifier#getGeneralization()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Generalization();

	/**
	 * Returns the meta object for class '{@link OntoUML.Collective <em>Collective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collective</em>'.
	 * @see OntoUML.Collective
	 * @generated
	 */
	EClass getCollective();

	/**
	 * Returns the meta object for the attribute '{@link OntoUML.Collective#isIsExtensional <em>Is Extensional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Extensional</em>'.
	 * @see OntoUML.Collective#isIsExtensional()
	 * @see #getCollective()
	 * @generated
	 */
	EAttribute getCollective_IsExtensional();

	/**
	 * Returns the meta object for class '{@link OntoUML.componentOf <em>component Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>component Of</em>'.
	 * @see OntoUML.componentOf
	 * @generated
	 */
	EClass getcomponentOf();

	/**
	 * Returns the meta object for class '{@link OntoUML.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see OntoUML.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link OntoUML.Container#getInstanciarElement <em>Instanciar Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instanciar Element</em>'.
	 * @see OntoUML.Container#getInstanciarElement()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_InstanciarElement();

	/**
	 * Returns the meta object for class '{@link OntoUML.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype</em>'.
	 * @see OntoUML.Datatype
	 * @generated
	 */
	EClass getDatatype();

	/**
	 * Returns the meta object for class '{@link OntoUML.DatatypeAssociation <em>Datatype Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Association</em>'.
	 * @see OntoUML.DatatypeAssociation
	 * @generated
	 */
	EClass getDatatypeAssociation();

	/**
	 * Returns the meta object for class '{@link OntoUML.DependencyRelationship <em>Dependency Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Relationship</em>'.
	 * @see OntoUML.DependencyRelationship
	 * @generated
	 */
	EClass getDependencyRelationship();

	/**
	 * Returns the meta object for class '{@link OntoUML.Derivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derivation</em>'.
	 * @see OntoUML.Derivation
	 * @generated
	 */
	EClass getDerivation();

	/**
	 * Returns the meta object for class '{@link OntoUML.DirectedBinaryRelationship <em>Directed Binary Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Binary Relationship</em>'.
	 * @see OntoUML.DirectedBinaryRelationship
	 * @generated
	 */
	EClass getDirectedBinaryRelationship();

	/**
	 * Returns the meta object for class '{@link OntoUML.DirectedRelationship <em>Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Relationship</em>'.
	 * @see OntoUML.DirectedRelationship
	 * @generated
	 */
	EClass getDirectedRelationship();

	/**
	 * Returns the meta object for the reference list '{@link OntoUML.DirectedRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see OntoUML.DirectedRelationship#getTarget()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_Target();

	/**
	 * Returns the meta object for the reference list '{@link OntoUML.DirectedRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see OntoUML.DirectedRelationship#getSource()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_Source();

	/**
	 * Returns the meta object for the reference list '{@link OntoUML.DirectedRelationship#getTargetAux1 <em>Target Aux1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Aux1</em>'.
	 * @see OntoUML.DirectedRelationship#getTargetAux1()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_TargetAux1();

	/**
	 * Returns the meta object for the reference list '{@link OntoUML.DirectedRelationship#getSourceAux1 <em>Source Aux1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Aux1</em>'.
	 * @see OntoUML.DirectedRelationship#getSourceAux1()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_SourceAux1();

	/**
	 * Returns the meta object for the containment reference list '{@link OntoUML.DirectedRelationship#getTargetAux2 <em>Target Aux2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Aux2</em>'.
	 * @see OntoUML.DirectedRelationship#getTargetAux2()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_TargetAux2();

	/**
	 * Returns the meta object for the containment reference list '{@link OntoUML.DirectedRelationship#getSourceAux2 <em>Source Aux2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Aux2</em>'.
	 * @see OntoUML.DirectedRelationship#getSourceAux2()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_SourceAux2();

	/**
	 * Returns the meta object for class '{@link OntoUML.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see OntoUML.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the containment reference list '{@link OntoUML.Element#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see OntoUML.Element#getAttribute()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Attribute();

	/**
	 * Returns the meta object for the container reference '{@link OntoUML.Element#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see OntoUML.Element#getOwner()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Owner();

	/**
	 * Returns the meta object for the container reference '{@link OntoUML.Element#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see OntoUML.Element#getContainer()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Container();

	/**
	 * Returns the meta object for class '{@link OntoUML.FormalAssociation <em>Formal Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Association</em>'.
	 * @see OntoUML.FormalAssociation
	 * @generated
	 */
	EClass getFormalAssociation();

	/**
	 * Returns the meta object for class '{@link OntoUML.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see OntoUML.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the container reference '{@link OntoUML.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specific</em>'.
	 * @see OntoUML.Generalization#getSpecific()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Specific();

	/**
	 * Returns the meta object for the reference '{@link OntoUML.Generalization#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>General</em>'.
	 * @see OntoUML.Generalization#getGeneral()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_General();

	/**
	 * Returns the meta object for the reference list '{@link OntoUML.Generalization#getSemnome <em>Semnome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semnome</em>'.
	 * @see OntoUML.Generalization#getSemnome()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Semnome();

	/**
	 * Returns the meta object for class '{@link OntoUML.GeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization Set</em>'.
	 * @see OntoUML.GeneralizationSet
	 * @generated
	 */
	EClass getGeneralizationSet();

	/**
	 * Returns the meta object for the attribute '{@link OntoUML.GeneralizationSet#isIsCovering <em>Is Covering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Covering</em>'.
	 * @see OntoUML.GeneralizationSet#isIsCovering()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EAttribute getGeneralizationSet_IsCovering();

	/**
	 * Returns the meta object for the attribute '{@link OntoUML.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Disjoint</em>'.
	 * @see OntoUML.GeneralizationSet#isIsDisjoint()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EAttribute getGeneralizationSet_IsDisjoint();

	/**
	 * Returns the meta object for the reference list '{@link OntoUML.GeneralizationSet#getSemnome <em>Semnome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semnome</em>'.
	 * @see OntoUML.GeneralizationSet#getSemnome()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EReference getGeneralizationSet_Semnome();

	/**
	 * Returns the meta object for class '{@link OntoUML.Kind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kind</em>'.
	 * @see OntoUML.Kind
	 * @generated
	 */
	EClass getKind();

	/**
	 * Returns the meta object for class '{@link OntoUML.MaterialAssociation <em>Material Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material Association</em>'.
	 * @see OntoUML.MaterialAssociation
	 * @generated
	 */
	EClass getMaterialAssociation();

	/**
	 * Returns the meta object for class '{@link OntoUML.Mediation <em>Mediation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediation</em>'.
	 * @see OntoUML.Mediation
	 * @generated
	 */
	EClass getMediation();

	/**
	 * Returns the meta object for class '{@link OntoUML.memberOf <em>member Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>member Of</em>'.
	 * @see OntoUML.memberOf
	 * @generated
	 */
	EClass getmemberOf();

	/**
	 * Returns the meta object for class '{@link OntoUML.Meronymic <em>Meronymic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meronymic</em>'.
	 * @see OntoUML.Meronymic
	 * @generated
	 */
	EClass getMeronymic();

	/**
	 * Returns the meta object for the attribute '{@link OntoUML.Meronymic#isIsShareable <em>Is Shareable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Shareable</em>'.
	 * @see OntoUML.Meronymic#isIsShareable()
	 * @see #getMeronymic()
	 * @generated
	 */
	EAttribute getMeronymic_IsShareable();

	/**
	 * Returns the meta object for the attribute '{@link OntoUML.Meronymic#isIsEssential <em>Is Essential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Essential</em>'.
	 * @see OntoUML.Meronymic#isIsEssential()
	 * @see #getMeronymic()
	 * @generated
	 */
	EAttribute getMeronymic_IsEssential();

	/**
	 * Returns the meta object for the attribute '{@link OntoUML.Meronymic#isIsInseparable <em>Is Inseparable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Inseparable</em>'.
	 * @see OntoUML.Meronymic#isIsInseparable()
	 * @see #getMeronymic()
	 * @generated
	 */
	EAttribute getMeronymic_IsInseparable();

	/**
	 * Returns the meta object for the attribute '{@link OntoUML.Meronymic#isIsImmutablePart <em>Is Immutable Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Immutable Part</em>'.
	 * @see OntoUML.Meronymic#isIsImmutablePart()
	 * @see #getMeronymic()
	 * @generated
	 */
	EAttribute getMeronymic_IsImmutablePart();

	/**
	 * Returns the meta object for the attribute '{@link OntoUML.Meronymic#isIsImmutableWhole <em>Is Immutable Whole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Immutable Whole</em>'.
	 * @see OntoUML.Meronymic#isIsImmutableWhole()
	 * @see #getMeronymic()
	 * @generated
	 */
	EAttribute getMeronymic_IsImmutableWhole();

	/**
	 * Returns the meta object for class '{@link OntoUML.Mixin <em>Mixin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixin</em>'.
	 * @see OntoUML.Mixin
	 * @generated
	 */
	EClass getMixin();

	/**
	 * Returns the meta object for class '{@link OntoUML.MixinClass <em>Mixin Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixin Class</em>'.
	 * @see OntoUML.MixinClass
	 * @generated
	 */
	EClass getMixinClass();

	/**
	 * Returns the meta object for class '{@link OntoUML.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode</em>'.
	 * @see OntoUML.Mode
	 * @generated
	 */
	EClass getMode();

	/**
	 * Returns the meta object for class '{@link OntoUML.MomentClass <em>Moment Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moment Class</em>'.
	 * @see OntoUML.MomentClass
	 * @generated
	 */
	EClass getMomentClass();

	/**
	 * Returns the meta object for class '{@link OntoUML.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Element</em>'.
	 * @see OntoUML.MultiplicityElement
	 * @generated
	 */
	EClass getMultiplicityElement();

	/**
	 * Returns the meta object for the attribute '{@link OntoUML.MultiplicityElement#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see OntoUML.MultiplicityElement#getUpper()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_Upper();

	/**
	 * Returns the meta object for the attribute '{@link OntoUML.MultiplicityElement#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see OntoUML.MultiplicityElement#getLower()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_Lower();

	/**
	 * Returns the meta object for class '{@link OntoUML.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see OntoUML.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link OntoUML.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see OntoUML.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link OntoUML.NonRigidMixinClass <em>Non Rigid Mixin Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Rigid Mixin Class</em>'.
	 * @see OntoUML.NonRigidMixinClass
	 * @generated
	 */
	EClass getNonRigidMixinClass();

	/**
	 * Returns the meta object for class '{@link OntoUML.ObjectClass <em>Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Class</em>'.
	 * @see OntoUML.ObjectClass
	 * @generated
	 */
	EClass getObjectClass();

	/**
	 * Returns the meta object for class '{@link OntoUML.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase</em>'.
	 * @see OntoUML.Phase
	 * @generated
	 */
	EClass getPhase();

	/**
	 * Returns the meta object for class '{@link OntoUML.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see OntoUML.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link OntoUML.Property#isIsDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see OntoUML.Property#isIsDerived()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsDerived();

	/**
	 * Returns the meta object for the attribute '{@link OntoUML.Property#isIsReadOnly <em>Is Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Read Only</em>'.
	 * @see OntoUML.Property#isIsReadOnly()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link OntoUML.Property#isIsNavigable <em>Is Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Navigable</em>'.
	 * @see OntoUML.Property#isIsNavigable()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsNavigable();

	/**
	 * Returns the meta object for the reference '{@link OntoUML.Property#getEndType <em>End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Type</em>'.
	 * @see OntoUML.Property#getEndType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_EndType();

	/**
	 * Returns the meta object for the reference '{@link OntoUML.Property#getAssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association End</em>'.
	 * @see OntoUML.Property#getAssociationEnd()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_AssociationEnd();

	/**
	 * Returns the meta object for the reference '{@link OntoUML.Property#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see OntoUML.Property#getSource()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Source();

	/**
	 * Returns the meta object for the reference '{@link OntoUML.Property#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see OntoUML.Property#getTarget()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Target();

	/**
	 * Returns the meta object for the reference '{@link OntoUML.Property#getAux <em>Aux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aux</em>'.
	 * @see OntoUML.Property#getAux()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Aux();

	/**
	 * Returns the meta object for class '{@link OntoUML.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see OntoUML.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for class '{@link OntoUML.RelationalClassifier <em>Relational Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Classifier</em>'.
	 * @see OntoUML.RelationalClassifier
	 * @generated
	 */
	EClass getRelationalClassifier();

	/**
	 * Returns the meta object for class '{@link OntoUML.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see OntoUML.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference list '{@link OntoUML.Relationship#getRelatedElement <em>Related Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Element</em>'.
	 * @see OntoUML.Relationship#getRelatedElement()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_RelatedElement();

	/**
	 * Returns the meta object for class '{@link OntoUML.Relator <em>Relator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relator</em>'.
	 * @see OntoUML.Relator
	 * @generated
	 */
	EClass getRelator();

	/**
	 * Returns the meta object for class '{@link OntoUML.RigidMixinClass <em>Rigid Mixin Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rigid Mixin Class</em>'.
	 * @see OntoUML.RigidMixinClass
	 * @generated
	 */
	EClass getRigidMixinClass();

	/**
	 * Returns the meta object for class '{@link OntoUML.RigidSortalClass <em>Rigid Sortal Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rigid Sortal Class</em>'.
	 * @see OntoUML.RigidSortalClass
	 * @generated
	 */
	EClass getRigidSortalClass();

	/**
	 * Returns the meta object for class '{@link OntoUML.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see OntoUML.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link OntoUML.RoleMixin <em>Role Mixin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Mixin</em>'.
	 * @see OntoUML.RoleMixin
	 * @generated
	 */
	EClass getRoleMixin();

	/**
	 * Returns the meta object for class '{@link OntoUML.SemiRigidMixin <em>Semi Rigid Mixin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semi Rigid Mixin</em>'.
	 * @see OntoUML.SemiRigidMixin
	 * @generated
	 */
	EClass getSemiRigidMixin();

	/**
	 * Returns the meta object for class '{@link OntoUML.SimpleDatatype <em>Simple Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Datatype</em>'.
	 * @see OntoUML.SimpleDatatype
	 * @generated
	 */
	EClass getSimpleDatatype();

	/**
	 * Returns the meta object for class '{@link OntoUML.SortalClass <em>Sortal Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sortal Class</em>'.
	 * @see OntoUML.SortalClass
	 * @generated
	 */
	EClass getSortalClass();

	/**
	 * Returns the meta object for class '{@link OntoUML.StructuralDatatype <em>Structural Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Datatype</em>'.
	 * @see OntoUML.StructuralDatatype
	 * @generated
	 */
	EClass getStructuralDatatype();

	/**
	 * Returns the meta object for class '{@link OntoUML.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Feature</em>'.
	 * @see OntoUML.StructuralFeature
	 * @generated
	 */
	EClass getStructuralFeature();

	/**
	 * Returns the meta object for class '{@link OntoUML.subCollectionOf <em>sub Collection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sub Collection Of</em>'.
	 * @see OntoUML.subCollectionOf
	 * @generated
	 */
	EClass getsubCollectionOf();

	/**
	 * Returns the meta object for class '{@link OntoUML.SubKind <em>Sub Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Kind</em>'.
	 * @see OntoUML.SubKind
	 * @generated
	 */
	EClass getSubKind();

	/**
	 * Returns the meta object for class '{@link OntoUML.subQuantityOf <em>sub Quantity Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sub Quantity Of</em>'.
	 * @see OntoUML.subQuantityOf
	 * @generated
	 */
	EClass getsubQuantityOf();

	/**
	 * Returns the meta object for class '{@link OntoUML.SubstanceSortal <em>Substance Sortal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substance Sortal</em>'.
	 * @see OntoUML.SubstanceSortal
	 * @generated
	 */
	EClass getSubstanceSortal();

	/**
	 * Returns the meta object for class '{@link OntoUML.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see OntoUML.Type
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
	OntoUMLFactory getOntoUMLFactory();

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
		 * The meta object literal for the '{@link OntoUML.impl.AntiRigidMixinClassImpl <em>Anti Rigid Mixin Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.AntiRigidMixinClassImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getAntiRigidMixinClass()
		 * @generated
		 */
		EClass ANTI_RIGID_MIXIN_CLASS = eINSTANCE.getAntiRigidMixinClass();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.AntiRigidSortalClassImpl <em>Anti Rigid Sortal Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.AntiRigidSortalClassImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getAntiRigidSortalClass()
		 * @generated
		 */
		EClass ANTI_RIGID_SORTAL_CLASS = eINSTANCE.getAntiRigidSortalClass();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.AssociationImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getAssociation()
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
		 * The meta object literal for the '{@link OntoUML.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.CategoryImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.CharacterizationImpl <em>Characterization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.CharacterizationImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getCharacterization()
		 * @generated
		 */
		EClass CHARACTERIZATION = eINSTANCE.getCharacterization();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.ClassImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.ClassifierImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getClassifier()
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
		 * The meta object literal for the '{@link OntoUML.impl.CollectiveImpl <em>Collective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.CollectiveImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getCollective()
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
		 * The meta object literal for the '{@link OntoUML.impl.componentOfImpl <em>component Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.componentOfImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getcomponentOf()
		 * @generated
		 */
		EClass COMPONENT_OF = eINSTANCE.getcomponentOf();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.ContainerImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getContainer()
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
		 * The meta object literal for the '{@link OntoUML.impl.DatatypeImpl <em>Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.DatatypeImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getDatatype()
		 * @generated
		 */
		EClass DATATYPE = eINSTANCE.getDatatype();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.DatatypeAssociationImpl <em>Datatype Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.DatatypeAssociationImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getDatatypeAssociation()
		 * @generated
		 */
		EClass DATATYPE_ASSOCIATION = eINSTANCE.getDatatypeAssociation();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.DependencyRelationshipImpl <em>Dependency Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.DependencyRelationshipImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getDependencyRelationship()
		 * @generated
		 */
		EClass DEPENDENCY_RELATIONSHIP = eINSTANCE.getDependencyRelationship();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.DerivationImpl <em>Derivation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.DerivationImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getDerivation()
		 * @generated
		 */
		EClass DERIVATION = eINSTANCE.getDerivation();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.DirectedBinaryRelationshipImpl <em>Directed Binary Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.DirectedBinaryRelationshipImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getDirectedBinaryRelationship()
		 * @generated
		 */
		EClass DIRECTED_BINARY_RELATIONSHIP = eINSTANCE.getDirectedBinaryRelationship();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.DirectedRelationshipImpl <em>Directed Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.DirectedRelationshipImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getDirectedRelationship()
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
		 * The meta object literal for the '{@link OntoUML.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.ElementImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getElement()
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
		 * The meta object literal for the '{@link OntoUML.impl.FormalAssociationImpl <em>Formal Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.FormalAssociationImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getFormalAssociation()
		 * @generated
		 */
		EClass FORMAL_ASSOCIATION = eINSTANCE.getFormalAssociation();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.GeneralizationImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getGeneralization()
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
		 * The meta object literal for the '{@link OntoUML.impl.GeneralizationSetImpl <em>Generalization Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.GeneralizationSetImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getGeneralizationSet()
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
		 * The meta object literal for the '{@link OntoUML.impl.KindImpl <em>Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.KindImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getKind()
		 * @generated
		 */
		EClass KIND = eINSTANCE.getKind();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.MaterialAssociationImpl <em>Material Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.MaterialAssociationImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getMaterialAssociation()
		 * @generated
		 */
		EClass MATERIAL_ASSOCIATION = eINSTANCE.getMaterialAssociation();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.MediationImpl <em>Mediation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.MediationImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getMediation()
		 * @generated
		 */
		EClass MEDIATION = eINSTANCE.getMediation();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.memberOfImpl <em>member Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.memberOfImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getmemberOf()
		 * @generated
		 */
		EClass MEMBER_OF = eINSTANCE.getmemberOf();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.MeronymicImpl <em>Meronymic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.MeronymicImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getMeronymic()
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
		 * The meta object literal for the '{@link OntoUML.impl.MixinImpl <em>Mixin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.MixinImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getMixin()
		 * @generated
		 */
		EClass MIXIN = eINSTANCE.getMixin();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.MixinClassImpl <em>Mixin Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.MixinClassImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getMixinClass()
		 * @generated
		 */
		EClass MIXIN_CLASS = eINSTANCE.getMixinClass();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.ModeImpl <em>Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.ModeImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getMode()
		 * @generated
		 */
		EClass MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.MomentClassImpl <em>Moment Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.MomentClassImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getMomentClass()
		 * @generated
		 */
		EClass MOMENT_CLASS = eINSTANCE.getMomentClass();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.MultiplicityElementImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getMultiplicityElement()
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
		 * The meta object literal for the '{@link OntoUML.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.NamedElementImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link OntoUML.impl.NonRigidMixinClassImpl <em>Non Rigid Mixin Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.NonRigidMixinClassImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getNonRigidMixinClass()
		 * @generated
		 */
		EClass NON_RIGID_MIXIN_CLASS = eINSTANCE.getNonRigidMixinClass();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.ObjectClassImpl <em>Object Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.ObjectClassImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getObjectClass()
		 * @generated
		 */
		EClass OBJECT_CLASS = eINSTANCE.getObjectClass();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.PhaseImpl <em>Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.PhaseImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getPhase()
		 * @generated
		 */
		EClass PHASE = eINSTANCE.getPhase();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.PropertyImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getProperty()
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
		 * The meta object literal for the '<em><b>Aux</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__AUX = eINSTANCE.getProperty_Aux();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.QuantityImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.RelationalClassifierImpl <em>Relational Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.RelationalClassifierImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getRelationalClassifier()
		 * @generated
		 */
		EClass RELATIONAL_CLASSIFIER = eINSTANCE.getRelationalClassifier();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.RelationshipImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getRelationship()
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
		 * The meta object literal for the '{@link OntoUML.impl.RelatorImpl <em>Relator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.RelatorImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getRelator()
		 * @generated
		 */
		EClass RELATOR = eINSTANCE.getRelator();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.RigidMixinClassImpl <em>Rigid Mixin Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.RigidMixinClassImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getRigidMixinClass()
		 * @generated
		 */
		EClass RIGID_MIXIN_CLASS = eINSTANCE.getRigidMixinClass();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.RigidSortalClassImpl <em>Rigid Sortal Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.RigidSortalClassImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getRigidSortalClass()
		 * @generated
		 */
		EClass RIGID_SORTAL_CLASS = eINSTANCE.getRigidSortalClass();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.RoleImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.RoleMixinImpl <em>Role Mixin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.RoleMixinImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getRoleMixin()
		 * @generated
		 */
		EClass ROLE_MIXIN = eINSTANCE.getRoleMixin();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.SemiRigidMixinImpl <em>Semi Rigid Mixin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.SemiRigidMixinImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getSemiRigidMixin()
		 * @generated
		 */
		EClass SEMI_RIGID_MIXIN = eINSTANCE.getSemiRigidMixin();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.SimpleDatatypeImpl <em>Simple Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.SimpleDatatypeImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getSimpleDatatype()
		 * @generated
		 */
		EClass SIMPLE_DATATYPE = eINSTANCE.getSimpleDatatype();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.SortalClassImpl <em>Sortal Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.SortalClassImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getSortalClass()
		 * @generated
		 */
		EClass SORTAL_CLASS = eINSTANCE.getSortalClass();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.StructuralDatatypeImpl <em>Structural Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.StructuralDatatypeImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getStructuralDatatype()
		 * @generated
		 */
		EClass STRUCTURAL_DATATYPE = eINSTANCE.getStructuralDatatype();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.StructuralFeatureImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getStructuralFeature()
		 * @generated
		 */
		EClass STRUCTURAL_FEATURE = eINSTANCE.getStructuralFeature();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.subCollectionOfImpl <em>sub Collection Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.subCollectionOfImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getsubCollectionOf()
		 * @generated
		 */
		EClass SUB_COLLECTION_OF = eINSTANCE.getsubCollectionOf();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.SubKindImpl <em>Sub Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.SubKindImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getSubKind()
		 * @generated
		 */
		EClass SUB_KIND = eINSTANCE.getSubKind();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.subQuantityOfImpl <em>sub Quantity Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.subQuantityOfImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getsubQuantityOf()
		 * @generated
		 */
		EClass SUB_QUANTITY_OF = eINSTANCE.getsubQuantityOf();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.SubstanceSortalImpl <em>Substance Sortal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.SubstanceSortalImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getSubstanceSortal()
		 * @generated
		 */
		EClass SUBSTANCE_SORTAL = eINSTANCE.getSubstanceSortal();

		/**
		 * The meta object literal for the '{@link OntoUML.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoUML.impl.TypeImpl
		 * @see OntoUML.impl.OntoUMLPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

	}

} //OntoUMLPackage
