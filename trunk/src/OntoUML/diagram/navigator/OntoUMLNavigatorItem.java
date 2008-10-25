package OntoUML.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class OntoUMLNavigatorItem extends
		OntoUML.diagram.navigator.OntoUMLAbstractNavigatorItem {

	/**
	 * @generated
	 */
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

			public Object getAdapter(Object adaptableObject, Class adapterType) {
				if (adaptableObject instanceof OntoUML.diagram.navigator.OntoUMLNavigatorItem
						&& (adapterType == View.class || adapterType == EObject.class)) {
					return ((OntoUML.diagram.navigator.OntoUMLNavigatorItem) adaptableObject)
							.getView();
				}
				return null;
			}

			public Class[] getAdapterList() {
				return supportedTypes;
			}
		}, OntoUML.diagram.navigator.OntoUMLNavigatorItem.class);
	}

	/**
	 * @generated
	 */
	private View myView;

	/**
	 * @generated
	 */
	private boolean myLeaf = false;

	/**
	 * @generated
	 */
	public OntoUMLNavigatorItem(View view, Object parent, boolean isLeaf) {
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	 * @generated
	 */
	public View getView() {
		return myView;
	}

	/**
	 * @generated
	 */
	public boolean isLeaf() {
		return myLeaf;
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (obj instanceof OntoUML.diagram.navigator.OntoUMLNavigatorItem) {
			return EcoreUtil
					.getURI(getView())
					.equals(
							EcoreUtil
									.getURI(((OntoUML.diagram.navigator.OntoUMLNavigatorItem) obj)
											.getView()));
		}
		return super.equals(obj);
	}

	/**
	 * @generated
	 */
	public int hashCode() {
		return EcoreUtil.getURI(getView()).hashCode();
	}

}
