// ASSIGNMENT 1 PROBLEM 1
// Kevin Liu
// 105191861
import java.lang.Math; // import math library
public class Problem1 { // define class called Problem 1
    public static void main (String[] args) {
        final double pi = 3.14159265359;
        double s0 = 13;
        double v0 = 15;
        double g = 25;
        double t = 10;
        double a = 1;
        double p = 0.3;
        double m1 = 72;
        double m2 = 3;
        //CALCULATING s and G
        double s = s0 * v0 - (0.5*g*Math.pow(t, 3)); //using math.pow from  java.langMath and other calculations
        System.out.println("Equation s = " +s); //display equation s
        double G = 0.75*Math.pow(pi, 2) * ((Math.pow(a, 3))/(Math.pow(p, 0.5)*(m1-m2))); //using math.pow from  java.langMath and other calculations
        System.out.println("Equation G = " +G); // display equation g

    }
}
