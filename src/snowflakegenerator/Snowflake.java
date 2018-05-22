package snowflakegenerator;

import java.awt.*;
import java.util.Random;

public class Snowflake {
    
    double branchLength;
    double offAngle;
    
    int numBranches;
    int snowDepth;
    
    int numMainArms;
    
    //Constructor for snowflake class
    public Snowflake(double bL, double oA, int nB, int sD, int n) {
        this.branchLength = bL;
        this.offAngle = oA;
        
        this.numBranches = nB;
        this.snowDepth = sD;
        
        this.numMainArms = n;
    }
    
    //Most important method. Draws a single arm for a snowflake. Some parameters may seem redundant but altering field values alone wouldn't work with recursion
    public void drawSnowflakeArm(int recursionLevel, double x1, double y1, double drawLength, double currAngle, int currentShade, Graphics g) {
        
        //Graphics2D is required for changing line thickness. Line thickness is based on recursionLevel
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(recursionLevel));
        
        //Sets colour for current snowflake arm
        Color currentColor = new Color(currentShade, currentShade, currentShade);
        
        //Endpoint of branch to be drawn is calculated with trig and drawLength
        double x2 = x1 + drawLength*Math.cos(currAngle);
        double y2 = y1 - drawLength*Math.sin(currAngle);
        
        //Creates and draws line segment 
        LineSegment currentDraw = new LineSegment(x1, y1, x2, y2, currentColor);
        currentDraw.drawSeg(g2);
        
        //Base case is a snowflake with recursion level 1
        if (recursionLevel > 1) {
            
            recursionLevel--;
            
            //Divides a line segment into equal parts (For drawing branches)
            double branchLocation = drawLength/(numBranches+1);
            
            for (int i = 0; i < numBranches; i++) {
                
                //Calculates new x and y values based on branchLocation
                double xNew = x1 + (branchLocation*(i+1))*Math.cos(currAngle);
                double yNew = y1 - (branchLocation*(i+1))*Math.sin(currAngle);
                
                //Makes drawn lines grow smaller based on proximity to snowflake center
                LineSegment measuringTape = new LineSegment(x1, y1, xNew, yNew, Color.white);
                double gradualSubtraction = measuringTape.getLength();
                
                //Subtracts a certain amount from the length of the branch based on its distance from the center of the snowflake
                drawLength = drawLength - gradualSubtraction;
                
                //Draws a pair of snowflake arms with new parameters
                drawSnowflakeArm(recursionLevel, xNew, yNew, drawLength, currAngle + offAngle, currentShade - 50, g);
                drawSnowflakeArm(recursionLevel, xNew, yNew, drawLength, currAngle - offAngle, currentShade - 50, g);
                
                //Resets the draw length, since each pair of branches requires a unique subtraction value 
                drawLength = drawLength + gradualSubtraction;
                
            }
        }
    }
    
    //Reproduces a snowflake arm multiple times based on numMainArms. Angle of separation between the snowflake arms are made equal
    public void drawWholeSnowflake(int cCenter, int yCenter, Graphics g) {
        
        double currAngle = Math.PI/((double)this.numMainArms/2);
        double constAngle = currAngle;
        
        //"Randomizes" certain values before actually drawing the snowflake
        branchLength += Randomizer(branchLength);
        offAngle += Randomizer(offAngle)*3;
        
        for (int i = 0; i < this.numMainArms; i++) {
            
            drawSnowflakeArm(snowDepth, cCenter, yCenter, branchLength, currAngle, 255, g);
            currAngle = currAngle + constAngle;
            
        }
    }
    
    //Generates a slight deviation to a given value by up to 1/5th of its value
    public static double Randomizer(double baseValue) {
        
        Random r = new Random();
        double deviationValue;
        //Decides as to whether or not to change the values at all
        boolean doOrNot = r.nextBoolean();
        
        if (doOrNot == true) {
            
            //Deviation value is 1/10th to 1/5th the value of the original value
            double devFactor = r.nextInt(6) + 5;
            
            //Decides if the deviation value will be negative
            boolean negativeOrNot = r.nextBoolean();
            
            if (negativeOrNot == true) {
                deviationValue = -baseValue/devFactor;
            }
            else {
                deviationValue = baseValue/devFactor;
            }
        }
        
        else {
            deviationValue = 0;
        }
        
        return deviationValue;
    }
    
}