/**
 * 
 */
package OntoUML.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * @author Alessander Botti Benevides
 * @generated NOT
 */
public class OntoUMLResourceFactory extends XMIResourceFactoryImpl {

    public OntoUMLResourceFactory() {
        super();
    }

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl#createResource(org.eclipse.emf.common.util.URI)
	 */
	public Resource createResource(URI uri) {
	        return new OntoUMLResource(uri);
	}
}
