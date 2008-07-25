package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import OntoUML.subCollectionOf;
import org.eclipse.swt.graphics.*;

/**
* <!-- begin-user-doc -->
* Custom figure class.
* <!-- end-user-doc -->
* @generated NOT
*/	
public class SubCollectionOfCustomFigure extends PolylineDecoration {
	
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
		SubCollectionOfEditPart subcollectionofeditpart;
	
	/**
	* <!-- begin-user-doc -->
	* Default constructor.
	* <!-- end-user-doc -->
	* @generated NOT
	*/
	public SubCollectionOfCustomFigure(SubCollectionOfEditPart subcollectionofeditpart) {
		this.subcollectionofeditpart = subcollectionofeditpart; 	
	}
	
	/**
	* <!-- begin-user-doc -->
	* Associate the correct decoration, depending on the attribute isShareable.
	* <!-- end-user-doc -->
	* @generated NOT
	*/	
	protected boolean updateFace() {
		subCollectionOf s = (subCollectionOf)((View)subcollectionofeditpart.getModel()).getElement();
		if (s.isIsShareable() == false)
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
		FontData fd[];
		fd = graphics.getFont().getFontData();
		fd[0].setHeight(fd[0].getHeight()/2);
		Font fonte = new Font(null, fd);
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
		graphics.setFont(fonte);
		if(losango.getBounds().height > losango.getBounds().width)
			graphics.drawString("C", losango.getBounds().x + losango.getBounds().width/4, losango.getBounds().y + losango.getBounds().height*3/8);
		else
			graphics.drawString("C", losango.getBounds().x + losango.getBounds().width*3/8, losango.getBounds().y + losango.getBounds().height/4);
		graphics.popState();
	}
}