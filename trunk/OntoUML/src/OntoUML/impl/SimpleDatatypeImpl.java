/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.impl;

import OntoUML.DatatypeRelationship;
import OntoUML.OntoUMLPackage;
import OntoUML.Property;
import OntoUML.SimpleDatatype;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Datatype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SimpleDatatypeImpl extends DatatypeImpl implements SimpleDatatype {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleDatatypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntoUMLPackage.Literals.SIMPLE_DATATYPE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Properly changed in order to notify the holders of attributes of the type of this SimpleDatatype when it changes its name.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setName(String newName) {
		super.setName(newName);
		
		if (getContainer() != null)
			for (int i = 0; i < getContainer().getInstanciarElement().size(); ++i)
				if (getContainer().getInstanciarElement().get(i) instanceof DatatypeRelationship) {
					DatatypeRelationship d = (DatatypeRelationship) getContainer().getInstanciarElement().get(i);
					for (int j = 0; j < d.getTarget().size(); ++j)
						if (d.getTarget().get(j) instanceof Property)
							if (((Property) d.getTarget().get(j)).getEndType() == this) {
								String name = ((Property) d.getTarget().get(j)).getName();
								((Property) d.getTarget().get(j)).setName(name + "aux");
								((Property) d.getTarget().get(j)).setName(name);
							}
				}
	}

} //SimpleDatatypeImpl
