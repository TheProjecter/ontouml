/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import OntoUML.DirectedRelationship;
import OntoUML.Element;
import OntoUML.OntoUMLPackage;
import OntoUML.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OntoUML.impl.DirectedRelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link OntoUML.impl.DirectedRelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link OntoUML.impl.DirectedRelationshipImpl#getTargetAux1 <em>Target Aux1</em>}</li>
 *   <li>{@link OntoUML.impl.DirectedRelationshipImpl#getSourceAux1 <em>Source Aux1</em>}</li>
 *   <li>{@link OntoUML.impl.DirectedRelationshipImpl#getTargetAux2 <em>Target Aux2</em>}</li>
 *   <li>{@link OntoUML.impl.DirectedRelationshipImpl#getSourceAux2 <em>Source Aux2</em>}</li>
 *   <li>{@link OntoUML.impl.DirectedRelationshipImpl#getSourcePropertyNameLabelAux <em>Source Property Name Label Aux</em>}</li>
 *   <li>{@link OntoUML.impl.DirectedRelationshipImpl#getTargetPropertyNameLabelAux <em>Target Property Name Label Aux</em>}</li>
 *   <li>{@link OntoUML.impl.DirectedRelationshipImpl#getSourcePropertyCardinalitiesLabelAux <em>Source Property Cardinalities Label Aux</em>}</li>
 *   <li>{@link OntoUML.impl.DirectedRelationshipImpl#getTargetPropertyCardinalitiesLabelAux <em>Target Property Cardinalities Label Aux</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DirectedRelationshipImpl extends RelationshipImpl implements DirectedRelationship {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> source;

	/**
	 * The cached value of the '{@link #getTargetAux1() <em>Target Aux1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAux1()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> targetAux1;

	/**
	 * The cached value of the '{@link #getSourceAux1() <em>Source Aux1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAux1()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> sourceAux1;

	/**
	 * The cached value of the '{@link #getTargetAux2() <em>Target Aux2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAux2()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> targetAux2;

	/**
	 * The cached value of the '{@link #getSourceAux2() <em>Source Aux2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAux2()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> sourceAux2;

	/**
	 * The default value of the '{@link #getSourcePropertyNameLabelAux() <em>Source Property Name Label Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePropertyNameLabelAux()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_PROPERTY_NAME_LABEL_AUX_EDEFAULT = "";

	/**
	 * The default value of the '{@link #getTargetPropertyNameLabelAux() <em>Target Property Name Label Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPropertyNameLabelAux()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_PROPERTY_NAME_LABEL_AUX_EDEFAULT = "";

	/**
	 * The default value of the '{@link #getSourcePropertyCardinalitiesLabelAux() <em>Source Property Cardinalities Label Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePropertyCardinalitiesLabelAux()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_PROPERTY_CARDINALITIES_LABEL_AUX_EDEFAULT = "";

	/**
	 * The default value of the '{@link #getTargetPropertyCardinalitiesLabelAux() <em>Target Property Cardinalities Label Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPropertyCardinalitiesLabelAux()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_PROPERTY_CARDINALITIES_LABEL_AUX_EDEFAULT = "";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectedRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntoUMLPackage.Literals.DIRECTED_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<Element>(Element.class, this, OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<Element>(Element.class, this, OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTargetAux1() {
		if (targetAux1 == null) {
			targetAux1 = new EObjectResolvingEList<Element>(Element.class, this, OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_AUX1);
		}
		return targetAux1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getSourceAux1() {
		if (sourceAux1 == null) {
			sourceAux1 = new EObjectResolvingEList<Element>(Element.class, this, OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX1);
		}
		return sourceAux1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTargetAux2() {
		if (targetAux2 == null) {
			targetAux2 = new EObjectContainmentEList<Element>(Element.class, this, OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_AUX2);
		}
		return targetAux2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getSourceAux2() {
		if (sourceAux2 == null) {
			sourceAux2 = new EObjectContainmentEList<Element>(Element.class, this, OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX2);
		}
		return sourceAux2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Properly changed in order to build this string from the value of the name of the source Property.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getSourcePropertyNameLabelAux() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		if (getSource().size() > 0) {
			if (getSource().get(0) instanceof Property)
				return ((Property) getSource().get(0)).getName();
			else
				return "";
		}
		else
			return "";
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Properly changed in order to make a notification so the relationship can update its label sourcePropertyNameLabelAux.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setSourcePropertyNameLabelAux(String newSourcePropertyNameLabelAux) {
		// TODO: implement this method to set the 'Source Property Name Label Aux' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_PROPERTY_NAME_LABEL_AUX, getSourcePropertyNameLabelAux(), newSourcePropertyNameLabelAux));

		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Properly changed in order to build this string from the value of the name of the target Property.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getTargetPropertyNameLabelAux() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		if (getTarget().size() > 0) {
			if (getTarget().get(0) instanceof Property)
				return ((Property) getTarget().get(0)).getName();
			else
				return "";
		}
		else
			return "";
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Properly changed in order to make a notification so the relationship can update its label sourcePropertyNameLabelAux or targetPropertyNameLabelAux or associationEnd1PropertyNameLabelAux or associationEnd2PropertyNameLabelAux.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setTargetPropertyNameLabelAux(String newTargetPropertyNameLabelAux) {
		// TODO: implement this method to set the 'Target Property Name Label Aux' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_PROPERTY_NAME_LABEL_AUX, getTargetPropertyNameLabelAux(), newTargetPropertyNameLabelAux));
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Properly changed in order to build this string from the value of the cardinalities of the source Property.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getSourcePropertyCardinalitiesLabelAux() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		String text = new String("");
		Property p;
		
		if (getSource().size() > 0)
			if (getSource().get(0) instanceof Property) {
				p = (Property) getSource().get(0);
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
	 * Properly changed in order to make a notification so the relationship can update its label sourcePropertyCardinalitiesLabelAux.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setSourcePropertyCardinalitiesLabelAux(String newSourcePropertyCardinalitiesLabelAux) {
		// TODO: implement this method to set the 'Source Property Cardinalities Label Aux' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_PROPERTY_CARDINALITIES_LABEL_AUX, getSourcePropertyCardinalitiesLabelAux(), newSourcePropertyCardinalitiesLabelAux));
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Properly changed in order to build this string from the value of the cardinalities of the target Property.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getTargetPropertyCardinalitiesLabelAux() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		String text = new String("");
		Property p;
		
		if (getTarget().size() > 0)
			if (getTarget().get(0) instanceof Property) {
				p = (Property) getTarget().get(0);
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
	 * Properly changed in order to make a notification so the relationship can update its label targetPropertyCardinalitiesLabelAux.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setTargetPropertyCardinalitiesLabelAux(String newTargetPropertyCardinalitiesLabelAux) {
		// TODO: implement this method to set the 'Target Property Cardinalities Label Aux' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_PROPERTY_CARDINALITIES_LABEL_AUX, getTargetPropertyCardinalitiesLabelAux(), newTargetPropertyCardinalitiesLabelAux));
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_AUX2:
				return ((InternalEList<?>)getTargetAux2()).basicRemove(otherEnd, msgs);
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX2:
				return ((InternalEList<?>)getSourceAux2()).basicRemove(otherEnd, msgs);
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
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET:
				return getTarget();
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE:
				return getSource();
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_AUX1:
				return getTargetAux1();
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX1:
				return getSourceAux1();
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_AUX2:
				return getTargetAux2();
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX2:
				return getSourceAux2();
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_PROPERTY_NAME_LABEL_AUX:
				return getSourcePropertyNameLabelAux();
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_PROPERTY_NAME_LABEL_AUX:
				return getTargetPropertyNameLabelAux();
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_PROPERTY_CARDINALITIES_LABEL_AUX:
				return getSourcePropertyCardinalitiesLabelAux();
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_PROPERTY_CARDINALITIES_LABEL_AUX:
				return getTargetPropertyCardinalitiesLabelAux();
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
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Element>)newValue);
				return;
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Element>)newValue);
				return;
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_AUX1:
				getTargetAux1().clear();
				getTargetAux1().addAll((Collection<? extends Element>)newValue);
				return;
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX1:
				getSourceAux1().clear();
				getSourceAux1().addAll((Collection<? extends Element>)newValue);
				return;
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_AUX2:
				getTargetAux2().clear();
				getTargetAux2().addAll((Collection<? extends Element>)newValue);
				return;
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX2:
				getSourceAux2().clear();
				getSourceAux2().addAll((Collection<? extends Element>)newValue);
				return;
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_PROPERTY_NAME_LABEL_AUX:
				setSourcePropertyNameLabelAux((String)newValue);
				return;
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_PROPERTY_NAME_LABEL_AUX:
				setTargetPropertyNameLabelAux((String)newValue);
				return;
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_PROPERTY_CARDINALITIES_LABEL_AUX:
				setSourcePropertyCardinalitiesLabelAux((String)newValue);
				return;
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_PROPERTY_CARDINALITIES_LABEL_AUX:
				setTargetPropertyCardinalitiesLabelAux((String)newValue);
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
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET:
				getTarget().clear();
				return;
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE:
				getSource().clear();
				return;
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_AUX1:
				getTargetAux1().clear();
				return;
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX1:
				getSourceAux1().clear();
				return;
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_AUX2:
				getTargetAux2().clear();
				return;
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX2:
				getSourceAux2().clear();
				return;
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_PROPERTY_NAME_LABEL_AUX:
				setSourcePropertyNameLabelAux(SOURCE_PROPERTY_NAME_LABEL_AUX_EDEFAULT);
				return;
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_PROPERTY_NAME_LABEL_AUX:
				setTargetPropertyNameLabelAux(TARGET_PROPERTY_NAME_LABEL_AUX_EDEFAULT);
				return;
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_PROPERTY_CARDINALITIES_LABEL_AUX:
				setSourcePropertyCardinalitiesLabelAux(SOURCE_PROPERTY_CARDINALITIES_LABEL_AUX_EDEFAULT);
				return;
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_PROPERTY_CARDINALITIES_LABEL_AUX:
				setTargetPropertyCardinalitiesLabelAux(TARGET_PROPERTY_CARDINALITIES_LABEL_AUX_EDEFAULT);
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
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET:
				return target != null && !target.isEmpty();
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE:
				return source != null && !source.isEmpty();
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_AUX1:
				return targetAux1 != null && !targetAux1.isEmpty();
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX1:
				return sourceAux1 != null && !sourceAux1.isEmpty();
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_AUX2:
				return targetAux2 != null && !targetAux2.isEmpty();
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_AUX2:
				return sourceAux2 != null && !sourceAux2.isEmpty();
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_PROPERTY_NAME_LABEL_AUX:
				return SOURCE_PROPERTY_NAME_LABEL_AUX_EDEFAULT == null ? getSourcePropertyNameLabelAux() != null : !SOURCE_PROPERTY_NAME_LABEL_AUX_EDEFAULT.equals(getSourcePropertyNameLabelAux());
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_PROPERTY_NAME_LABEL_AUX:
				return TARGET_PROPERTY_NAME_LABEL_AUX_EDEFAULT == null ? getTargetPropertyNameLabelAux() != null : !TARGET_PROPERTY_NAME_LABEL_AUX_EDEFAULT.equals(getTargetPropertyNameLabelAux());
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__SOURCE_PROPERTY_CARDINALITIES_LABEL_AUX:
				return SOURCE_PROPERTY_CARDINALITIES_LABEL_AUX_EDEFAULT == null ? getSourcePropertyCardinalitiesLabelAux() != null : !SOURCE_PROPERTY_CARDINALITIES_LABEL_AUX_EDEFAULT.equals(getSourcePropertyCardinalitiesLabelAux());
			case OntoUMLPackage.DIRECTED_RELATIONSHIP__TARGET_PROPERTY_CARDINALITIES_LABEL_AUX:
				return TARGET_PROPERTY_CARDINALITIES_LABEL_AUX_EDEFAULT == null ? getTargetPropertyCardinalitiesLabelAux() != null : !TARGET_PROPERTY_CARDINALITIES_LABEL_AUX_EDEFAULT.equals(getTargetPropertyCardinalitiesLabelAux());
		}
		return super.eIsSet(featureID);
	}

} //DirectedRelationshipImpl
