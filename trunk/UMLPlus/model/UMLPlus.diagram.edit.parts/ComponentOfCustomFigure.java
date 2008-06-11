package UMLPlus.diagram.edit.parts;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import UMLPlus.componentOf;

public class ComponentOfCustomFigure extends PolylineDecoration {

/** Um template de losango */
public static final PointList RHOMBUS_TIP = new PointList();

static {
	RHOMBUS_TIP.addPoint(-2, 0);
	RHOMBUS_TIP.addPoint(-1, 1);
	RHOMBUS_TIP.addPoint(0, 0);
	RHOMBUS_TIP.addPoint(-1, -1);
}

private PointList template = RHOMBUS_TIP;
ComponentOfEditPart componentofeditpart;

public ComponentOfCustomFigure(ComponentOfEditPart componentofeditpart) {
this.componentofeditpart = componentofeditpart; 	
}

/** Associa a decoração correta, dependendo do atributo isShareable. */
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

public void paintFigure(Graphics graphics) {
PointList losango = new PointList();
graphics.pushState(); 
setTemplate(template);
losango = getPoints();
graphics.drawPolygon(losango);
if (updateFace()) {
	graphics.setBackgroundColor(new Color(null,0,0,0)); // Código RGB da cor do objeto.
	graphics.fillPolygon(losango);
}
else {
	graphics.setBackgroundColor(new Color(null,255,255,255)); // Código RGB da cor do objeto.
	graphics.fillPolygon(losango);
}
graphics.popState();
}
}