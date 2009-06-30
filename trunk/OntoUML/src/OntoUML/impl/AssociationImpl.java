/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.impl;

import OntoUML.Association;
import OntoUML.Classifier;
import OntoUML.Generalization;
import OntoUML.NamedElement;
import OntoUML.OntoUMLPackage;
import OntoUML.Property;
import OntoUML.RelationalClassifier;
import OntoUML.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.expressions.OCLExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OntoUML.impl.AssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link OntoUML.impl.AssociationImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link OntoUML.impl.AssociationImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link OntoUML.impl.AssociationImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link OntoUML.impl.AssociationImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link OntoUML.impl.AssociationImpl#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link OntoUML.impl.AssociationImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link OntoUML.impl.AssociationImpl#getAssociationEndAux1 <em>Association End Aux1</em>}</li>
 *   <li>{@link OntoUML.impl.AssociationImpl#getAssociationEndAux2 <em>Association End Aux2</em>}</li>
 *   <li>{@link OntoUML.impl.AssociationImpl#getAssociationEnd3Aux <em>Association End3 Aux</em>}</li>
 *   <li>{@link OntoUML.impl.AssociationImpl#getAssociationEnd1PropertyNameLabelAux <em>Association End1 Property Name Label Aux</em>}</li>
 *   <li>{@link OntoUML.impl.AssociationImpl#getAssociationEnd2PropertyNameLabelAux <em>Association End2 Property Name Label Aux</em>}</li>
 *   <li>{@link OntoUML.impl.AssociationImpl#getAssociationEnd1PropertyCardinalitiesLabelAux <em>Association End1 Property Cardinalities Label Aux</em>}</li>
 *   <li>{@link OntoUML.impl.AssociationImpl#getAssociationEnd2PropertyCardinalitiesLabelAux <em>Association End2 Property Cardinalities Label Aux</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends RelationshipImpl implements Association {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssociationEnd() <em>Association End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> associationEnd;

	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssociationEndAux1() <em>Association End Aux1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEndAux1()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> associationEndAux1;

	/**
	 * The cached value of the '{@link #getAssociationEndAux2() <em>Association End Aux2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEndAux2()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> associationEndAux2;

	/**
	 * The cached value of the '{@link #getAssociationEnd3Aux() <em>Association End3 Aux</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEnd3Aux()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> associationEnd3Aux;

	/**
	 * The default value of the '{@link #getAssociationEnd1PropertyNameLabelAux() <em>Association End1 Property Name Label Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEnd1PropertyNameLabelAux()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATION_END1_PROPERTY_NAME_LABEL_AUX_EDEFAULT = "";

	/**
	 * The default value of the '{@link #getAssociationEnd2PropertyNameLabelAux() <em>Association End2 Property Name Label Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEnd2PropertyNameLabelAux()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATION_END2_PROPERTY_NAME_LABEL_AUX_EDEFAULT = "";

	/**
	 * The default value of the '{@link #getAssociationEnd1PropertyCardinalitiesLabelAux() <em>Association End1 Property Cardinalities Label Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEnd1PropertyCardinalitiesLabelAux()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATION_END1_PROPERTY_CARDINALITIES_LABEL_AUX_EDEFAULT = "";

	/**
	 * The default value of the '{@link #getAssociationEnd2PropertyCardinalitiesLabelAux() <em>Association End2 Property Cardinalities Label Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEnd2PropertyCardinalitiesLabelAux()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATION_END2_PROPERTY_CARDINALITIES_LABEL_AUX_EDEFAULT = "";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntoUMLPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Properly changed in order to add an "/" in the name if the association is derived.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
//		String text;
//		if (name != null) {
//			text = new String(name);
//			if (isDerived && (name.charAt(0) != '/'))
//				text = "/" + name;
//			else
//				if (!isDerived && (name.charAt(0) == '/'))
//					text = name.substring(1);
//			return text;
//		}
//		else
			return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.ASSOCIATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getAttribute() {
		EStructuralFeature eFeature = OntoUMLPackage.Literals.CLASSIFIER__ATTRIBUTE;
	
		if (attributeDeriveOCL == null) { 
			Helper helper = OCL_ENV.createOCLHelper();
			helper.setAttributeContext(OntoUMLPackage.Literals.CLASSIFIER, eFeature);
			
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				attributeDeriveOCL = helper.createQuery(derive);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(attributeDeriveOCL);
	
		@SuppressWarnings("unchecked")
		Collection<Property> result = (Collection<Property>) query.evaluate(this);
		return new EcoreEList.UnmodifiableEList<Property>(this, eFeature, result.size(), result.toArray());
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.ASSOCIATION__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getGeneral() {
		EStructuralFeature eFeature = OntoUMLPackage.Literals.CLASSIFIER__GENERAL;
	
		if (generalDeriveOCL == null) { 
			Helper helper = OCL_ENV.createOCLHelper();
			helper.setAttributeContext(OntoUMLPackage.Literals.CLASSIFIER, eFeature);
			
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				generalDeriveOCL = helper.createQuery(derive);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(generalDeriveOCL);
	
		@SuppressWarnings("unchecked")
		Collection<Classifier> result = (Collection<Classifier>) query.evaluate(this);
		return new EcoreEList.UnmodifiableEList<Classifier>(this, eFeature, result.size(), result.toArray());
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralization() {
		EStructuralFeature eFeature = OntoUMLPackage.Literals.CLASSIFIER__GENERALIZATION;
	
		if (generalizationDeriveOCL == null) { 
			Helper helper = OCL_ENV.createOCLHelper();
			helper.setAttributeContext(OntoUMLPackage.Literals.CLASSIFIER, eFeature);
			
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				generalizationDeriveOCL = helper.createQuery(derive);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(generalizationDeriveOCL);
	
		@SuppressWarnings("unchecked")
		Collection<Generalization> result = (Collection<Generalization>) query.evaluate(this);
		return new EcoreEList.UnmodifiableEList<Generalization>(this, eFeature, result.size(), result.toArray());
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getAssociationEnd() {
		if (associationEnd == null) {
			associationEnd = new EObjectWithInverseResolvingEList<Property>(Property.class, this, OntoUMLPackage.ASSOCIATION__ASSOCIATION_END, OntoUMLPackage.PROPERTY__ASSOCIATION_END);
		}
		return associationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.ASSOCIATION__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getAssociationEndAux1() {
		if (associationEndAux1 == null) {
			associationEndAux1 = new EObjectResolvingEList<Type>(Type.class, this, OntoUMLPackage.ASSOCIATION__ASSOCIATION_END_AUX1);
		}
		return associationEndAux1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getAssociationEndAux2() {
		if (associationEndAux2 == null) {
			associationEndAux2 = new EObjectResolvingEList<Type>(Type.class, this, OntoUMLPackage.ASSOCIATION__ASSOCIATION_END_AUX2);
		}
		return associationEndAux2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getAssociationEnd3Aux() {
		if (associationEnd3Aux == null) {
			associationEnd3Aux = new EObjectContainmentEList<Property>(Property.class, this, OntoUMLPackage.ASSOCIATION__ASSOCIATION_END3_AUX);
		}
		return associationEnd3Aux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Properly changed in order to build this string from the value of the name of the Property connected on associationEnd1.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getAssociationEnd1PropertyNameLabelAux() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		String text = new String("");
		for (int i = 0; i < getAssociationEnd().size(); ++i)
			if (getAssociationEnd().get(i) instanceof Property)
				if (((Property) getAssociationEnd().get(i)).getAssociationEndPositionAux() == 1)
					text = ((Property) getAssociationEnd().get(i)).getName();
		return text;						
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Properly changed in order to make a notification so the relationship can update its label associationEnd1PropertyNameLabelAux.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAssociationEnd1PropertyNameLabelAux(String newAssociationEnd1PropertyNameLabelAux) {
		// TODO: implement this method to set the 'Association End1 Property Name Label Aux' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.ASSOCIATION__ASSOCIATION_END1_PROPERTY_NAME_LABEL_AUX, getAssociationEnd1PropertyNameLabelAux(), newAssociationEnd1PropertyNameLabelAux));
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Properly changed in order to build this string from the value of the name of the Property connected on associationEnd2.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getAssociationEnd2PropertyNameLabelAux() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		String text = new String("");
		for (int i = 0; i < getAssociationEnd().size(); ++i)
			if (getAssociationEnd().get(i) instanceof Property)
				if (((Property) getAssociationEnd().get(i)).getAssociationEndPositionAux() == 2)
					text = ((Property) getAssociationEnd().get(i)).getName();
		return text;
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Properly changed in order to make a notification so the relationship can update its label associationEnd2PropertyNameLabelAux.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAssociationEnd2PropertyNameLabelAux(String newAssociationEnd2PropertyNameLabelAux) {
		// TODO: implement this method to set the 'Association End2 Property Name Label Aux' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.ASSOCIATION__ASSOCIATION_END2_PROPERTY_NAME_LABEL_AUX, getAssociationEnd2PropertyNameLabelAux(), newAssociationEnd2PropertyNameLabelAux));
			System.out.println("asd2");
			
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Properly changed in order to build this string from the value of the cardinalities of the Property connected on associationEnd1.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getAssociationEnd1PropertyCardinalitiesLabelAux() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		String text = new String("");
		Property p;
		
		if (getAssociationEnd().size() > 0)
			for (int i = 0; i < getAssociationEnd().size(); ++i)
				if (getAssociationEnd().get(i) instanceof Property)
					if (((Property) getAssociationEnd().get(i)).getAssociationEndPositionAux() == 1) {
						p = (Property) getAssociationEnd().get(i);
						if (p.getLower() == -1) {
							if (p.getUpper() == -1)
								text = "*..*";
							else
								text = "*.." + Integer.toString(p.getUpper());
						} else {
							if ((p.getLower() == 0) && (p.getUpper() == -1))
								text = "*";
							else {
								if (p.getLower() == p.getUpper())
									text = Integer.toString(p.getLower());
								else {
									if (p.getUpper() == -1)
										text = Integer.toString(p.getLower()) + "..*";
									else
										text = Integer.toString(p.getLower()) + ".." + Integer.toString(p.getUpper());
								}
							}
						}
					}
		return text;
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Properly changed in order to make a notification so the relationship can update its label associationEnd1PropertyCardinalitiesLabelAux.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAssociationEnd1PropertyCardinalitiesLabelAux(String newAssociationEnd1PropertyCardinalitiesLabelAux) {
		// TODO: implement this method to set the 'Association End1 Property Cardinalities Label Aux' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.ASSOCIATION__ASSOCIATION_END1_PROPERTY_CARDINALITIES_LABEL_AUX, getAssociationEnd1PropertyCardinalitiesLabelAux(), newAssociationEnd1PropertyCardinalitiesLabelAux));
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Properly changed in order to build this string from the value of the cardinalities of the Property connected on associationEnd2.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getAssociationEnd2PropertyCardinalitiesLabelAux() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		String text = new String("");
		Property p;
		
		if (getAssociationEnd().size() > 0)
			for (int i = 0; i < getAssociationEnd().size(); ++i)
				if (getAssociationEnd().get(i) instanceof Property)
					if (((Property) getAssociationEnd().get(i)).getAssociationEndPositionAux() == 2) {
						p = (Property) getAssociationEnd().get(i);
						if (p.getLower() == -1) {
							if (p.getUpper() == -1)
								text = "*..*";
							else
								text = "*.." + Integer.toString(p.getUpper());
						} else {
							if ((p.getLower() == 0) && (p.getUpper() == -1))
								text = "*";
							else {
								if (p.getLower() == p.getUpper())
									text = Integer.toString(p.getLower());
								else {
									if (p.getUpper() == -1)
										text = Integer.toString(p.getLower()) + "..*";
									else
										text = Integer.toString(p.getLower()) + ".." + Integer.toString(p.getUpper());
								}
							}
						}
					}
		return text;
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Properly changed in order to make a notification so the relationship can update its label associationEnd2PropertyCardinalitiesLabelAux.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAssociationEnd2PropertyCardinalitiesLabelAux(String newAssociationEnd2PropertyCardinalitiesLabelAux) {
		// TODO: implement this method to set the 'Association End2 Property Cardinalities Label Aux' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.ASSOCIATION__ASSOCIATION_END2_PROPERTY_CARDINALITIES_LABEL_AUX, getAssociationEnd2PropertyCardinalitiesLabelAux(), newAssociationEnd2PropertyCardinalitiesLabelAux));
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociationEnd()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntoUMLPackage.ASSOCIATION__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END:
				return ((InternalEList<?>)getAssociationEnd()).basicRemove(otherEnd, msgs);
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END3_AUX:
				return ((InternalEList<?>)getAssociationEnd3Aux()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntoUMLPackage.ASSOCIATION__NAME:
				return getName();
			case OntoUMLPackage.ASSOCIATION__ATTRIBUTE:
				return getAttribute();
			case OntoUMLPackage.ASSOCIATION__IS_ABSTRACT:
				return isIsAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case OntoUMLPackage.ASSOCIATION__GENERAL:
				return getGeneral();
			case OntoUMLPackage.ASSOCIATION__GENERALIZATION:
				return getGeneralization();
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END:
				return getAssociationEnd();
			case OntoUMLPackage.ASSOCIATION__IS_DERIVED:
				return isIsDerived() ? Boolean.TRUE : Boolean.FALSE;
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END_AUX1:
				return getAssociationEndAux1();
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END_AUX2:
				return getAssociationEndAux2();
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END3_AUX:
				return getAssociationEnd3Aux();
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END1_PROPERTY_NAME_LABEL_AUX:
				return getAssociationEnd1PropertyNameLabelAux();
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END2_PROPERTY_NAME_LABEL_AUX:
				return getAssociationEnd2PropertyNameLabelAux();
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END1_PROPERTY_CARDINALITIES_LABEL_AUX:
				return getAssociationEnd1PropertyCardinalitiesLabelAux();
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END2_PROPERTY_CARDINALITIES_LABEL_AUX:
				return getAssociationEnd2PropertyCardinalitiesLabelAux();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OntoUMLPackage.ASSOCIATION__NAME:
				setName((String)newValue);
				return;
			case OntoUMLPackage.ASSOCIATION__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case OntoUMLPackage.ASSOCIATION__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case OntoUMLPackage.ASSOCIATION__GENERAL:
				getGeneral().clear();
				getGeneral().addAll((Collection<? extends Classifier>)newValue);
				return;
			case OntoUMLPackage.ASSOCIATION__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END:
				getAssociationEnd().clear();
				getAssociationEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case OntoUMLPackage.ASSOCIATION__IS_DERIVED:
				setIsDerived(((Boolean)newValue).booleanValue());
				return;
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END_AUX1:
				getAssociationEndAux1().clear();
				getAssociationEndAux1().addAll((Collection<? extends Type>)newValue);
				return;
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END_AUX2:
				getAssociationEndAux2().clear();
				getAssociationEndAux2().addAll((Collection<? extends Type>)newValue);
				return;
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END3_AUX:
				getAssociationEnd3Aux().clear();
				getAssociationEnd3Aux().addAll((Collection<? extends Property>)newValue);
				return;
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END1_PROPERTY_NAME_LABEL_AUX:
				setAssociationEnd1PropertyNameLabelAux((String)newValue);
				return;
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END2_PROPERTY_NAME_LABEL_AUX:
				setAssociationEnd2PropertyNameLabelAux((String)newValue);
				return;
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END1_PROPERTY_CARDINALITIES_LABEL_AUX:
				setAssociationEnd1PropertyCardinalitiesLabelAux((String)newValue);
				return;
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END2_PROPERTY_CARDINALITIES_LABEL_AUX:
				setAssociationEnd2PropertyCardinalitiesLabelAux((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OntoUMLPackage.ASSOCIATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OntoUMLPackage.ASSOCIATION__ATTRIBUTE:
				getAttribute().clear();
				return;
			case OntoUMLPackage.ASSOCIATION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case OntoUMLPackage.ASSOCIATION__GENERAL:
				getGeneral().clear();
				return;
			case OntoUMLPackage.ASSOCIATION__GENERALIZATION:
				getGeneralization().clear();
				return;
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END:
				getAssociationEnd().clear();
				return;
			case OntoUMLPackage.ASSOCIATION__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END_AUX1:
				getAssociationEndAux1().clear();
				return;
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END_AUX2:
				getAssociationEndAux2().clear();
				return;
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END3_AUX:
				getAssociationEnd3Aux().clear();
				return;
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END1_PROPERTY_NAME_LABEL_AUX:
				setAssociationEnd1PropertyNameLabelAux(ASSOCIATION_END1_PROPERTY_NAME_LABEL_AUX_EDEFAULT);
				return;
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END2_PROPERTY_NAME_LABEL_AUX:
				setAssociationEnd2PropertyNameLabelAux(ASSOCIATION_END2_PROPERTY_NAME_LABEL_AUX_EDEFAULT);
				return;
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END1_PROPERTY_CARDINALITIES_LABEL_AUX:
				setAssociationEnd1PropertyCardinalitiesLabelAux(ASSOCIATION_END1_PROPERTY_CARDINALITIES_LABEL_AUX_EDEFAULT);
				return;
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END2_PROPERTY_CARDINALITIES_LABEL_AUX:
				setAssociationEnd2PropertyCardinalitiesLabelAux(ASSOCIATION_END2_PROPERTY_CARDINALITIES_LABEL_AUX_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OntoUMLPackage.ASSOCIATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OntoUMLPackage.ASSOCIATION__ATTRIBUTE:
				return !getAttribute().isEmpty();
			case OntoUMLPackage.ASSOCIATION__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case OntoUMLPackage.ASSOCIATION__GENERAL:
				return !getGeneral().isEmpty();
			case OntoUMLPackage.ASSOCIATION__GENERALIZATION:
				return !getGeneralization().isEmpty();
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END:
				return associationEnd != null && !associationEnd.isEmpty();
			case OntoUMLPackage.ASSOCIATION__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END_AUX1:
				return associationEndAux1 != null && !associationEndAux1.isEmpty();
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END_AUX2:
				return associationEndAux2 != null && !associationEndAux2.isEmpty();
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END3_AUX:
				return associationEnd3Aux != null && !associationEnd3Aux.isEmpty();
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END1_PROPERTY_NAME_LABEL_AUX:
				return ASSOCIATION_END1_PROPERTY_NAME_LABEL_AUX_EDEFAULT == null ? getAssociationEnd1PropertyNameLabelAux() != null : !ASSOCIATION_END1_PROPERTY_NAME_LABEL_AUX_EDEFAULT.equals(getAssociationEnd1PropertyNameLabelAux());
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END2_PROPERTY_NAME_LABEL_AUX:
				return ASSOCIATION_END2_PROPERTY_NAME_LABEL_AUX_EDEFAULT == null ? getAssociationEnd2PropertyNameLabelAux() != null : !ASSOCIATION_END2_PROPERTY_NAME_LABEL_AUX_EDEFAULT.equals(getAssociationEnd2PropertyNameLabelAux());
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END1_PROPERTY_CARDINALITIES_LABEL_AUX:
				return ASSOCIATION_END1_PROPERTY_CARDINALITIES_LABEL_AUX_EDEFAULT == null ? getAssociationEnd1PropertyCardinalitiesLabelAux() != null : !ASSOCIATION_END1_PROPERTY_CARDINALITIES_LABEL_AUX_EDEFAULT.equals(getAssociationEnd1PropertyCardinalitiesLabelAux());
			case OntoUMLPackage.ASSOCIATION__ASSOCIATION_END2_PROPERTY_CARDINALITIES_LABEL_AUX:
				return ASSOCIATION_END2_PROPERTY_CARDINALITIES_LABEL_AUX_EDEFAULT == null ? getAssociationEnd2PropertyCardinalitiesLabelAux() != null : !ASSOCIATION_END2_PROPERTY_CARDINALITIES_LABEL_AUX_EDEFAULT.equals(getAssociationEnd2PropertyCardinalitiesLabelAux());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case OntoUMLPackage.ASSOCIATION__NAME: return OntoUMLPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (derivedFeatureID) {
				case OntoUMLPackage.ASSOCIATION__ATTRIBUTE: return OntoUMLPackage.CLASSIFIER__ATTRIBUTE;
				case OntoUMLPackage.ASSOCIATION__IS_ABSTRACT: return OntoUMLPackage.CLASSIFIER__IS_ABSTRACT;
				case OntoUMLPackage.ASSOCIATION__GENERAL: return OntoUMLPackage.CLASSIFIER__GENERAL;
				case OntoUMLPackage.ASSOCIATION__GENERALIZATION: return OntoUMLPackage.CLASSIFIER__GENERALIZATION;
				default: return -1;
			}
		}
		if (baseClass == RelationalClassifier.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case OntoUMLPackage.NAMED_ELEMENT__NAME: return OntoUMLPackage.ASSOCIATION__NAME;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (baseFeatureID) {
				case OntoUMLPackage.CLASSIFIER__ATTRIBUTE: return OntoUMLPackage.ASSOCIATION__ATTRIBUTE;
				case OntoUMLPackage.CLASSIFIER__IS_ABSTRACT: return OntoUMLPackage.ASSOCIATION__IS_ABSTRACT;
				case OntoUMLPackage.CLASSIFIER__GENERAL: return OntoUMLPackage.ASSOCIATION__GENERAL;
				case OntoUMLPackage.CLASSIFIER__GENERALIZATION: return OntoUMLPackage.ASSOCIATION__GENERALIZATION;
				default: return -1;
			}
		}
		if (baseClass == RelationalClassifier.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(')');
		return result.toString();
	}

	/**
	 * The parsed OCL expression for the derivation of '{@link #getAttribute <em>Attribute</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute
	 * @generated
	 */
	private static OCLExpression<EClassifier> attributeDeriveOCL;

	/**
	 * The parsed OCL expression for the derivation of '{@link #getGeneral <em>General</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral
	 * @generated
	 */
	private static OCLExpression<EClassifier> generalDeriveOCL;

	/**
	 * The parsed OCL expression for the derivation of '{@link #getGeneralization <em>Generalization</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization
	 * @generated
	 */
	private static OCLExpression<EClassifier> generalizationDeriveOCL;

	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/ocl/examples/OCL";

	private static final OCL OCL_ENV = OCL.newInstance();

} //AssociationImpl
