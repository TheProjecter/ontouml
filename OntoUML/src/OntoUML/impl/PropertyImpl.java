/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.expressions.OCLExpression;

import OntoUML.Association;
import OntoUML.Container;
import OntoUML.Derivation;
import OntoUML.DirectedBinaryRelationship;
import OntoUML.Element;
import OntoUML.MaterialAssociation;
import OntoUML.Mediation;
import OntoUML.OntoUMLPackage;
import OntoUML.Property;
import OntoUML.Relator;
import OntoUML.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OntoUML.impl.PropertyImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link OntoUML.impl.PropertyImpl#isIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link OntoUML.impl.PropertyImpl#getEndType <em>End Type</em>}</li>
 *   <li>{@link OntoUML.impl.PropertyImpl#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link OntoUML.impl.PropertyImpl#getSource <em>Source</em>}</li>
 *   <li>{@link OntoUML.impl.PropertyImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link OntoUML.impl.PropertyImpl#getAssociationEndPositionAux <em>Association End Position Aux</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends StructuralFeatureImpl implements Property {
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
	 * The default value of the '{@link #isIsNavigable() <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NAVIGABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsNavigable() <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected boolean isNavigable = IS_NAVIGABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssociationEnd() <em>Association End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEnd()
	 * @generated
	 * @ordered
	 */
	protected Association associationEnd;

	/**
	 * The default value of the '{@link #getAssociationEndPositionAux() <em>Association End Position Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEndPositionAux()
	 * @generated
	 * @ordered
	 */
	protected static final int ASSOCIATION_END_POSITION_AUX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAssociationEndPositionAux() <em>Association End Position Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEndPositionAux()
	 * @generated
	 * @ordered
	 */
	protected int associationEndPositionAux = ASSOCIATION_END_POSITION_AUX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntoUMLPackage.Literals.PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.PROPERTY__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNavigable() {
		return isNavigable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNavigable(boolean newIsNavigable) {
		boolean oldIsNavigable = isNavigable;
		isNavigable = newIsNavigable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.PROPERTY__IS_NAVIGABLE, oldIsNavigable, isNavigable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getEndType() {
		Type endType = basicGetEndType();
		return endType != null && endType.eIsProxy() ? (Type)eResolveProxy((InternalEObject)endType) : endType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetEndType() {
		if (endTypeDeriveOCL == null) { 
			EStructuralFeature eFeature = (OntoUMLPackage.Literals.PROPERTY__END_TYPE);
			
			Helper helper = OCL_ENV.createOCLHelper();
			helper.setAttributeContext(OntoUMLPackage.Literals.PROPERTY, eFeature);
			
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				endTypeDeriveOCL = helper.createQuery(derive);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(endTypeDeriveOCL);
	
		return (Type) query.evaluate(this);
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndType(Type newEndType) {
		// TODO: implement this method to set the 'End Type' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getAssociationEnd() {
		if (associationEnd != null && associationEnd.eIsProxy()) {
			InternalEObject oldAssociationEnd = (InternalEObject)associationEnd;
			associationEnd = (Association)eResolveProxy(oldAssociationEnd);
			if (associationEnd != oldAssociationEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntoUMLPackage.PROPERTY__ASSOCIATION_END, oldAssociationEnd, associationEnd));
			}
		}
		return associationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetAssociationEnd() {
		return associationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociationEnd(Association newAssociationEnd, NotificationChain msgs) {
		Association oldAssociationEnd = associationEnd;
		associationEnd = newAssociationEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntoUMLPackage.PROPERTY__ASSOCIATION_END, oldAssociationEnd, newAssociationEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationEnd(Association newAssociationEnd) {
		if (newAssociationEnd != associationEnd) {
			NotificationChain msgs = null;
			if (associationEnd != null)
				msgs = ((InternalEObject)associationEnd).eInverseRemove(this, OntoUMLPackage.ASSOCIATION__ASSOCIATION_END, Association.class, msgs);
			if (newAssociationEnd != null)
				msgs = ((InternalEObject)newAssociationEnd).eInverseAdd(this, OntoUMLPackage.ASSOCIATION__ASSOCIATION_END, Association.class, msgs);
			msgs = basicSetAssociationEnd(newAssociationEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.PROPERTY__ASSOCIATION_END, newAssociationEnd, newAssociationEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedBinaryRelationship getSource() {
		DirectedBinaryRelationship source = basicGetSource();
		return source != null && source.eIsProxy() ? (DirectedBinaryRelationship)eResolveProxy((InternalEObject)source) : source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedBinaryRelationship basicGetSource() {
		if (sourceDeriveOCL == null) { 
			EStructuralFeature eFeature = (OntoUMLPackage.Literals.PROPERTY__SOURCE);
			
			Helper helper = OCL_ENV.createOCLHelper();
			helper.setAttributeContext(OntoUMLPackage.Literals.PROPERTY, eFeature);
			
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				sourceDeriveOCL = helper.createQuery(derive);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(sourceDeriveOCL);
	
		return (DirectedBinaryRelationship) query.evaluate(this);
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(DirectedBinaryRelationship newSource) {
		// TODO: implement this method to set the 'Source' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedBinaryRelationship getTarget() {
		DirectedBinaryRelationship target = basicGetTarget();
		return target != null && target.eIsProxy() ? (DirectedBinaryRelationship)eResolveProxy((InternalEObject)target) : target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedBinaryRelationship basicGetTarget() {
		if (targetDeriveOCL == null) { 
			EStructuralFeature eFeature = (OntoUMLPackage.Literals.PROPERTY__TARGET);
			
			Helper helper = OCL_ENV.createOCLHelper();
			helper.setAttributeContext(OntoUMLPackage.Literals.PROPERTY, eFeature);
			
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				targetDeriveOCL = helper.createQuery(derive);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(targetDeriveOCL);
	
		return (DirectedBinaryRelationship) query.evaluate(this);
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(DirectedBinaryRelationship newTarget) {
		// TODO: implement this method to set the 'Target' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAssociationEndPositionAux() {
		return associationEndPositionAux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationEndPositionAux(int newAssociationEndPositionAux) {
		int oldAssociationEndPositionAux = associationEndPositionAux;
		associationEndPositionAux = newAssociationEndPositionAux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.PROPERTY__ASSOCIATION_END_POSITION_AUX, oldAssociationEndPositionAux, associationEndPositionAux));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Properly changed in order to add an "/" in the name if the Property is derived.
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
	 * Properly changed in order to call setSourcePropertyNameLabelAux() or setTargetPropertyNameLabelAux() or setAssociationEnd1PropertyNameLabelAux or setAssociationEnd2PropertyNameLabelAux in the associated relationship, so this method can make a notification and the relationship can update its label sourcePropertyNameLabelAux or targetPropertyNameLabelAux or associationEnd1PropertyNameLabelAux or associationEnd2PropertyNameLabelAux.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setName(String newName) {
		if (getSource() != null) {
			getSource().setSourcePropertyNameLabelAux(newName);
		}
		else {
			if (getTarget() != null) {
				getTarget().setTargetPropertyNameLabelAux(newName);
			}
			else {
				if (getAssociationEnd() != null) {
					if (getAssociationEndPositionAux() == 1) {
						getAssociationEnd().setAssociationEnd1PropertyNameLabelAux(newName);
					}
					else {
						getAssociationEnd().setAssociationEnd2PropertyNameLabelAux(newName);
					}
				}
			}
		}
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.NAMED_ELEMENT__NAME, oldName, name));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Created in order to transform the new value of lower into an string representing the entire cardinality (also with the unchanged value of upper) so calls to setLower can send notifications with the right value of the cardinality string.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	public String newLower2cardinality(int newlower) {
		String text = new String("");
		if (newlower == -1) {
			if (getUpper() == -1)
				text = "*..*";
			else
				text = "*.." + Integer.toString(getUpper());
		} else {
			if ((newlower == 0) && (getUpper() == -1))
				text = "*";
			else {
				if (newlower == getUpper())
					text = Integer.toString(newlower);
				else {
					if (getUpper() == -1)
						text = Integer.toString(newlower) + "..*";
					else
						text = Integer.toString(newlower) + ".." + Integer.toString(getUpper());
				}
			}
		}
		return text;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Created in order to transform the new value of upper into an string representing the entire cardinality (also with the unchanged value of lower) so calls to setUpper can send notifications with the right value of the cardinality string.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	public String newUpper2cardinality(int newupper) {
		String text = new String("");
		if (getLower() == -1) {
			if (newupper == -1)
				text = "*..*";
			else
				text = "*.." + Integer.toString(newupper);
		} else {
			if ((getLower() == 0) && (newupper == -1))
				text = "*";
			else {
				if (getLower() == newupper)
					text = Integer.toString(getLower());
				else {
					if (newupper == -1)
						text = Integer.toString(getLower()) + "..*";
					else
						text = Integer.toString(getLower()) + ".." + Integer.toString(newupper);
				}
			}
		}
	return text;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Properly changed in order to call setSourcePropertyCardinalitiesLabelAux() or setTargetPropertyCardinalitiesLabelAux() or setAssociationEnd1PropertyCardinalitiesLabelAux or setAssociationEnd2PropertyCardinalitiesLabelAux in the associated relationship, so this method can make a notification and the relationship can update its label sourcePropertyCardinalitiesLabelAux or targetPropertyCardinalitiesLabelAux or associationEnd1PropertyCardinalitiesLabelAux or associationEnd2PropertyCardinalitiesLabelAux; also changed in order to update the cardinalities of MaterialAssociations and Derivations.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setUpper(int newUpper) {
		if (getSource() != null) {
			getSource().setSourcePropertyCardinalitiesLabelAux(newUpper2cardinality(newUpper));
		}
		else {
			if (getTarget() != null) {
				getTarget().setTargetPropertyCardinalitiesLabelAux(newUpper2cardinality(newUpper));
			}
			else {
				if (getAssociationEnd() != null) {
					if (getAssociationEndPositionAux() == 1) {
						getAssociationEnd().setAssociationEnd1PropertyCardinalitiesLabelAux(newUpper2cardinality(newUpper));
					}
					else {
						getAssociationEnd().setAssociationEnd2PropertyCardinalitiesLabelAux(newUpper2cardinality(newUpper));
					}
				}
			}
		}
		
		Mediation mediation = null;
		Container container = null;
		Relator relator = null;
		Element element = null;
		ArrayList<MaterialAssociation> materialassociationlist = new ArrayList<MaterialAssociation>();
		ArrayList<Derivation> derivationlist = new ArrayList<Derivation>();
		
		if (getSource() instanceof Mediation)
			mediation = (Mediation) getSource();
		else
			if (getTarget() instanceof Mediation)
				mediation = (Mediation) getTarget();
		
		if (mediation != null) {
			
			container = mediation.getContainer();
			
			if (mediation.getTarget().size() > 0)
				if (mediation.getSource().get(0) instanceof Property)
					relator = (Relator) ((Property) mediation.getSource().get(0)).getEndType();
					
			if (mediation.getTarget().size() > 0)
				if (mediation.getTarget().get(0) instanceof Property)
					element = ((Property) mediation.getTarget().get(0)).getEndType();
			
			if ((element != null) && (container != null))
				for (int i = 0; i < container.getInstanciarElement().size(); ++i)
					if (container.getInstanciarElement().get(i) instanceof MaterialAssociation)
						for (int j = 0; j < ((MaterialAssociation) container.getInstanciarElement().get(i)).getAssociationEnd().size(); ++j)
							if (((MaterialAssociation) container.getInstanciarElement().get(i)).getAssociationEnd().get(j).getEndType() == element)
								materialassociationlist.add((MaterialAssociation) container.getInstanciarElement().get(i));
			
			if ((materialassociationlist.size() > 0) && (relator != null) && (container != null))
				for (int i = 0; i < container.getInstanciarElement().size(); ++i)
					if (container.getInstanciarElement().get(i) instanceof Derivation)
						for (int j = 0; j < ((Derivation) container.getInstanciarElement().get(i)).getTarget().size(); ++j)
							if (((Derivation) container.getInstanciarElement().get(i)).getTarget().get(j) instanceof Property)
								if (((Property) ((Derivation) container.getInstanciarElement().get(i)).getTarget().get(j)).getEndType() == relator)
									derivationlist.add((Derivation) container.getInstanciarElement().get(i));				
				
			for (int i = 0; i < materialassociationlist.size(); ++i) {
				if (materialassociationlist.get(i).isIsAbstract()) {
					materialassociationlist.get(i).setIsAbstract(false);
					materialassociationlist.get(i).setIsAbstract(true);
				}
				else {
					materialassociationlist.get(i).setIsAbstract(true);
					materialassociationlist.get(i).setIsAbstract(false);					
				}
			}
			
			for (int i = 0; i < derivationlist.size(); ++i) {
				if (derivationlist.get(i).isIsAbstract()) {
					derivationlist.get(i).setIsAbstract(false);
					derivationlist.get(i).setIsAbstract(true);
				}
				else {
					derivationlist.get(i).setIsAbstract(true);
					derivationlist.get(i).setIsAbstract(false);					
				}
			}						
		}
		
		int oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.MULTIPLICITY_ELEMENT__UPPER, oldUpper, upper));		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Properly changed in order to call setSourcePropertyCardinalitiesLabelAux() or setTargetPropertyCardinalitiesLabelAux() or setAssociationEnd1PropertyCardinalitiesLabelAux or setAssociationEnd2PropertyCardinalitiesLabelAux in the associated relationship, so this method can make a notification and the relationship can update its label sourcePropertyCardinalitiesLabelAux or targetPropertyCardinalitiesLabelAux or associationEnd1PropertyCardinalitiesLabelAux or associationEnd2PropertyCardinalitiesLabelAux; also changed in order to update the cardinalities of MaterialAssociations and Derivations.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setLower(int newLower) {
		if (getSource() != null) {
			getSource().setSourcePropertyCardinalitiesLabelAux(newLower2cardinality(newLower));
		}
		else {
			if (getTarget() != null) {
				getTarget().setTargetPropertyCardinalitiesLabelAux(newLower2cardinality(newLower));
			}
			else {
				if (getAssociationEnd() != null) {
					if (getAssociationEndPositionAux() == 1) {
						getAssociationEnd().setAssociationEnd1PropertyCardinalitiesLabelAux(newLower2cardinality(newLower));
					}
					else {
						getAssociationEnd().setAssociationEnd2PropertyCardinalitiesLabelAux(newLower2cardinality(newLower));
					}
				}
			}
		}
		
		Mediation mediation = null;
		Container container = null;
		Relator relator = null;
		Element element = null;
		ArrayList<MaterialAssociation> materialassociationlist = new ArrayList<MaterialAssociation>();
		ArrayList<Derivation> derivationlist = new ArrayList<Derivation>();
		
		if (getSource() instanceof Mediation)
			mediation = (Mediation) getSource();
		else
			if (getTarget() instanceof Mediation)
				mediation = (Mediation) getTarget();
		
		if (mediation != null) {
			
			container = mediation.getContainer();
			
			if (mediation.getTarget().size() > 0)
				if (mediation.getSource().get(0) instanceof Property)
					relator = (Relator) ((Property) mediation.getSource().get(0)).getEndType();
					
			if (mediation.getTarget().size() > 0)
				if (mediation.getTarget().get(0) instanceof Property)
					element = ((Property) mediation.getTarget().get(0)).getEndType();
			
			if ((element != null) && (container != null))
				for (int i = 0; i < container.getInstanciarElement().size(); ++i)
					if (container.getInstanciarElement().get(i) instanceof MaterialAssociation)
						for (int j = 0; j < ((MaterialAssociation) container.getInstanciarElement().get(i)).getAssociationEnd().size(); ++j)
							if (((MaterialAssociation) container.getInstanciarElement().get(i)).getAssociationEnd().get(j).getEndType() == element)
								materialassociationlist.add((MaterialAssociation) container.getInstanciarElement().get(i));
			
			if ((materialassociationlist.size() > 0) && (relator != null) && (container != null))
				for (int i = 0; i < container.getInstanciarElement().size(); ++i)
					if (container.getInstanciarElement().get(i) instanceof Derivation)
						for (int j = 0; j < ((Derivation) container.getInstanciarElement().get(i)).getTarget().size(); ++j)
							if (((Derivation) container.getInstanciarElement().get(i)).getTarget().get(j) instanceof Property)
								if (((Property) ((Derivation) container.getInstanciarElement().get(i)).getTarget().get(j)).getEndType() == relator)
									derivationlist.add((Derivation) container.getInstanciarElement().get(i));				
				
			for (int i = 0; i < materialassociationlist.size(); ++i) {
				if (materialassociationlist.get(i).isIsAbstract()) {
					materialassociationlist.get(i).setIsAbstract(false);
					materialassociationlist.get(i).setIsAbstract(true);
				}
				else {
					materialassociationlist.get(i).setIsAbstract(true);
					materialassociationlist.get(i).setIsAbstract(false);					
				}
			}
			
			for (int i = 0; i < derivationlist.size(); ++i) {
				if (derivationlist.get(i).isIsAbstract()) {
					derivationlist.get(i).setIsAbstract(false);
					derivationlist.get(i).setIsAbstract(true);
				}
				else {
					derivationlist.get(i).setIsAbstract(true);
					derivationlist.get(i).setIsAbstract(false);					
				}
			}						
		}
		
		int oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.MULTIPLICITY_ELEMENT__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntoUMLPackage.PROPERTY__ASSOCIATION_END:
				if (associationEnd != null)
					msgs = ((InternalEObject)associationEnd).eInverseRemove(this, OntoUMLPackage.ASSOCIATION__ASSOCIATION_END, Association.class, msgs);
				return basicSetAssociationEnd((Association)otherEnd, msgs);
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
			case OntoUMLPackage.PROPERTY__ASSOCIATION_END:
				return basicSetAssociationEnd(null, msgs);
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
			case OntoUMLPackage.PROPERTY__IS_DERIVED:
				return isIsDerived() ? Boolean.TRUE : Boolean.FALSE;
			case OntoUMLPackage.PROPERTY__IS_NAVIGABLE:
				return isIsNavigable() ? Boolean.TRUE : Boolean.FALSE;
			case OntoUMLPackage.PROPERTY__END_TYPE:
				if (resolve) return getEndType();
				return basicGetEndType();
			case OntoUMLPackage.PROPERTY__ASSOCIATION_END:
				if (resolve) return getAssociationEnd();
				return basicGetAssociationEnd();
			case OntoUMLPackage.PROPERTY__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OntoUMLPackage.PROPERTY__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case OntoUMLPackage.PROPERTY__ASSOCIATION_END_POSITION_AUX:
				return new Integer(getAssociationEndPositionAux());
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OntoUMLPackage.PROPERTY__IS_DERIVED:
				setIsDerived(((Boolean)newValue).booleanValue());
				return;
			case OntoUMLPackage.PROPERTY__IS_NAVIGABLE:
				setIsNavigable(((Boolean)newValue).booleanValue());
				return;
			case OntoUMLPackage.PROPERTY__END_TYPE:
				setEndType((Type)newValue);
				return;
			case OntoUMLPackage.PROPERTY__ASSOCIATION_END:
				setAssociationEnd((Association)newValue);
				return;
			case OntoUMLPackage.PROPERTY__SOURCE:
				setSource((DirectedBinaryRelationship)newValue);
				return;
			case OntoUMLPackage.PROPERTY__TARGET:
				setTarget((DirectedBinaryRelationship)newValue);
				return;
			case OntoUMLPackage.PROPERTY__ASSOCIATION_END_POSITION_AUX:
				setAssociationEndPositionAux(((Integer)newValue).intValue());
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
			case OntoUMLPackage.PROPERTY__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case OntoUMLPackage.PROPERTY__IS_NAVIGABLE:
				setIsNavigable(IS_NAVIGABLE_EDEFAULT);
				return;
			case OntoUMLPackage.PROPERTY__END_TYPE:
				setEndType((Type)null);
				return;
			case OntoUMLPackage.PROPERTY__ASSOCIATION_END:
				setAssociationEnd((Association)null);
				return;
			case OntoUMLPackage.PROPERTY__SOURCE:
				setSource((DirectedBinaryRelationship)null);
				return;
			case OntoUMLPackage.PROPERTY__TARGET:
				setTarget((DirectedBinaryRelationship)null);
				return;
			case OntoUMLPackage.PROPERTY__ASSOCIATION_END_POSITION_AUX:
				setAssociationEndPositionAux(ASSOCIATION_END_POSITION_AUX_EDEFAULT);
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
			case OntoUMLPackage.PROPERTY__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case OntoUMLPackage.PROPERTY__IS_NAVIGABLE:
				return isNavigable != IS_NAVIGABLE_EDEFAULT;
			case OntoUMLPackage.PROPERTY__END_TYPE:
				return basicGetEndType() != null;
			case OntoUMLPackage.PROPERTY__ASSOCIATION_END:
				return associationEnd != null;
			case OntoUMLPackage.PROPERTY__SOURCE:
				return basicGetSource() != null;
			case OntoUMLPackage.PROPERTY__TARGET:
				return basicGetTarget() != null;
			case OntoUMLPackage.PROPERTY__ASSOCIATION_END_POSITION_AUX:
				return associationEndPositionAux != ASSOCIATION_END_POSITION_AUX_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (isDerived: ");
		result.append(isDerived);
		result.append(", isNavigable: ");
		result.append(isNavigable);
		result.append(", associationEndPositionAux: ");
		result.append(associationEndPositionAux);
		result.append(')');
		return result.toString();
	}

	/**
	 * The parsed OCL expression for the derivation of '{@link #getEndType <em>End Type</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndType
	 * @generated
	 */
	private static OCLExpression<EClassifier> endTypeDeriveOCL;

	/**
	 * The parsed OCL expression for the derivation of '{@link #getSource <em>Source</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource
	 * @generated
	 */
	private static OCLExpression<EClassifier> sourceDeriveOCL;

	/**
	 * The parsed OCL expression for the derivation of '{@link #getTarget <em>Target</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget
	 * @generated
	 */
	private static OCLExpression<EClassifier> targetDeriveOCL;

	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/ocl/examples/OCL";

	private static final OCL OCL_ENV = OCL.newInstance();

} //PropertyImpl
