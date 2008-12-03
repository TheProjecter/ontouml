package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import OntoUML.Generalization;

/**
* <!-- begin-user-doc -->
* Custom figure class.
* <!-- end-user-doc -->
* @generated NOT
*/	
public class GeneralizationCustomFigure extends PolylineDecoration {
	
	/**
	* <!-- begin-user-doc -->
	* A Rhombus template.
	* <!-- end-user-doc -->
	* @generated NOT
	*/	
	public static final PointList TRIANGLE_TIP = new PointList();
	
	static {
		TRIANGLE_TIP.addPoint(-1, 1);
		TRIANGLE_TIP.addPoint(0, 0);
		TRIANGLE_TIP.addPoint(-1, -1);
	}
	
	private PointList template = TRIANGLE_TIP;
	
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
		graphics.setBackgroundColor(new Color(null,255,255,255)); // RGB code of object color.
		graphics.fillPolygon(losango);
		graphics.popState();
	}
}
