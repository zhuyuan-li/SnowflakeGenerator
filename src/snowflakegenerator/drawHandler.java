package snowflakegenerator;

import java.awt.*;
import java.util.Random;
import javax.swing.JPanel;

//Class that takes care of drawing snowflake (And non-snowflake graphics)
public class drawHandler {
    
    JPanel j;
    
    public drawHandler(JPanel j) {
        this.j = j;
    }
    
    //Draws a snowflake at the given x and y coordinates
    public void drawSnow(int xVal, int yVal, Snowflake s) {
        Graphics g = j.getGraphics();
        s.drawWholeSnowflake(xVal, yVal, g);
    }
    
    //Method that chooses one of two backgrounds to draw
    public void drawBG(int BGType) {
        Graphics g = j.getGraphics();
        
        if (BGType == 1) {
            drawBackgroundC(g);
        }
        
        else {
            drawBackgroundV(g);
        }
    }
    
    //Purely aesthetic. Draws a fading background from the center
    public void drawBackgroundC(Graphics g) {
        for (int i = 1; i < 501; i++) {
            for (int k = 1; k < 501; k++) {
                int BGDist = (int) Math.sqrt((k-250)*(k-250) + (i-250)*(i-250))/2;
                Color BGColor = new Color(BGDist, BGDist, BGDist);
                g.setColor(BGColor);
                g.drawLine(i, k, i, k);
            }
        }
    }
    
    //Same as the above method, except it draws the fade effect vertically (From center to top/bottom edges)
    public void drawBackgroundV(Graphics g) {
        //Draws top half of the background screen
        for (int k = 1; k < 251; k++) {
            Color BGColor = new Color(255 - k, 255 - k, 255 - k);
            g.setColor(BGColor);
            for (int i = 1; i < 501; i++) {
                g.drawLine(i, k, i, k);
            }
        }
        //Draws other half of the background screen
        for (int k = 250; k < 501; k++) {
            Color BGColor = new Color(k - 245, k - 245, k - 245);
            g.setColor(BGColor);
            for (int i = 1; i < 501; i++) {
                g.drawLine(i, k, i, k);
            }
        }
    }
}