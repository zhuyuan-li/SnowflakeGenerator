package snowflakegenerator;

import java.awt.*;
import javax.swing.JFrame;

//Creating a separate class for line segments makes it easier to draw lots of them
public class LineSegment extends JFrame {
    double x1, y1, x2, y2;
    
    Color c;
    
    public LineSegment(double x1, double y1, double x2, double y2, Color c) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.c = c;
    }
    
    public void drawSeg(Graphics g) {
        g.setColor(c);
        g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
    }
    
    public double getLength() {
        double length = Math.sqrt((y2-y1)*(y2-y1) + (x2-x1)*(x2-x1));
        return length;
    }
}
 