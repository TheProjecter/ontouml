package UMLPlus.diagram.edit.parts;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.Rectangle; 
import org.eclipse.swt.graphics.Color; 

public class DerivationCustomFigure extends PolylineDecoration {

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
graphics.pushState(); 
graphics.setBackgroundColor(new Color(null,0,0,0)); 
Rectangle rect = getBounds().getCopy();
graphics.fillOval(rect);
graphics.popState(); 
}
}
