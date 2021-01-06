// ASSIGNMENT 1 Problem3
// Kevin Liu
// 105191861

import java.awt.geom.Ellipse2D; // import libraries for ellipse and lines
import java.awt.geom.Line2D;

public class Problem3 {

    public static void main(String[] args) {
        Line2D line = new Line2D.Double(3,12,17,31); // create line at x1:3 y1: 12 x2: 17 y2:31
        System.out.printf("Created 2D Line at: x:%.0f, y:%.0f, x2:%.0f, y2:%.0f\n", line.getX1(), line.getY1(), line.getX2(), line.getY2()); //display where line was created
        System.out.println("Expected 2D Line at: x:3, y:12, x2:17, y2:31"); // display expected line

        line.setLine(line.getX1(), line.getY1(), 19, 13); // set line
        System.out.println("After changing end point to (19, 13)"); // display after changing
        System.out.printf("Created 2D Line at: x:%.0f, y:%.0f, x2:%.0f, y2:%.0f", line.getX1(), line.getY1(), line.getX2(), line.getY2()); // display line that was created
        System.out.println("\nExpected 2D Line at: x:3, y:12, x2:19, y2:13"); // display expected line

        Ellipse2D ellipse = new Ellipse2D.Double(4, 13, 60, 25); // create an ellipse with x:4 y:13 width:60 height:25
        System.out.printf("Created Ellipse: x:%.0f, y:%.0f, width:%.0f, height:%.0f\n", ellipse.getX(), ellipse.getY(), ellipse.getWidth(), ellipse.getHeight()); // create ellipse
        System.out.println("Expected Ellipse: x:4, y:13, width:60, height:25"); // display expected ellipse

    }

}