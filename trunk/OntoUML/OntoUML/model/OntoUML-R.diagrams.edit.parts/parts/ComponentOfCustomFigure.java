package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import OntoUML.componentOf;

/**
* <!-- begin-user-doc -->
* Custom figure class.
* <!-- end-user-doc -->
* @generated NOT
*/	
public class ComponentOfCustomFigure extends PolylineDecoration {

	/**
	* <!-- begin-user-doc -->
	* A Rhombus template.
	* <!-- end-user-doc -->
	* @generated NOT
	*/	
	public static final PointList RHOMBUS_TIP = new PointList();

	static {
		RHOMBUS_TIP.addPoint(-2, 0);
		RHOMBUS_TIP.addPoint(-1, 1);
		RHOMBUS_TIP.addPoint(0, 0);
		RHOMBUS_TIP.addPoint(-1, -1);
	}
	
	/**
	* <!-- begin-user-doc -->
	* Attributes.
	* <!-- end-user-doc -->
	* @generated NOT
	*/
	private PointList template = RHOMBUS_TIP;
	ComponentOfEditPart componentofeditpart;
	
	/**
	* <!-- begin-user-doc -->
	* Default constructor.
	* <!-- end-user-doc -->
	* @generated NOT
	*/
	public ComponentOfCustomFigure(ComponentOfEditPart componentofeditpart) {
		this.componentofeditpart = componentofeditpart; 	
	}
	
	/**
	* <!-- begin-user-doc -->
	* Associate the correct decoration, depending on the attribute isShareable.
	* <!-- end-user-doc -->
	* @generated NOT
	*/	
	protected boolean updateFace() {
		componentOf c = (componentOf)((View)componentofeditpart.getModel()).getElement();
		if (c.isIsShareable() == false)
			return true;
		else
			return false;
	}
	
	/** 
	* Fills the ellipse. 
	* @xxxxxxxxxxx org.eclipse.draw2d.Shape#fillShape(org.eclipse.draw2d.Graphics) 
	*/ 
	protected void fillShape(Graphics graphics) { 
		graphics.pushState(); 
		graphics.setBackgroundColor(new Color(null,255,255,255)); 
		graphics.fillOval(getBounds()); 
		graphics.popState(); 
	}
	
	/**
	* <!-- begin-user-doc -->
	* Paints the figure.
	* <!-- end-user-doc -->
	* @generated NOT
	*/	
	public void paintFigure(Graphics graphics) {
		PointList losango = new PointList();
		graphics.pushState(); 
		setTemplate(template);
		losango = getPoints();
		graphics.drawPolygon(losango);
		if (updateFace()) {
			graphics.setBackgroundColor(new Color(null,0,0,0)); // RGB code of object color.
			graphics.fillPolygon(losango);
		}
		else {
			graphics.setBackgroundColor(new Color(null,255,255,255)); // RGB code of object color.
			graphics.fillPolygon(losango);
		}
		graphics.popState();
	}
}