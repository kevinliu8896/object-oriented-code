import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class ShapeTester {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        char choiceOfShape;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        boolean flag = true;

        while (flag) { // while true run through loop for input
            System.out.println("Enter a char: C for circle | T for triangle | Q for square | O for oval | E to terminate the program");
            choiceOfShape = in.next().toUpperCase().charAt(0);
            switch (choiceOfShape) { // create cases for traignle, circle, square, oval, or exit + default
                case 'T':
                    int base, height;
                    base = rand.nextInt(51) + 1;
                    height = rand.nextInt(51) + 1;
                    Triangle triangle = new Triangle(base, height);
                    shapes.add(triangle); // adds random triangle's base and height to array list
                    break;


                case 'C':
                    int radius;
                    radius = rand.nextInt(51) + 1;
                    Circle circle = new Circle(radius);
                    shapes.add(circle); // adds circle to array list with random radius
                    break;


                case 'Q':
                    int side;
                    side = rand.nextInt(51) + 1;
                    Square square = new Square(side);
                    shapes.add(square); // adds square to array list with random side
                    break;

                case 'E':
                    System.out.println("You have terminated the program.");
                    flag = false;
                    break;

                case 'O':
                    double radiusHeight, radiusVert;
                    radiusHeight = (rand.nextDouble() * 51 + 1);
                    radiusVert = (rand.nextDouble() * 51 + 1);
                    Oval oval = new Oval(radiusHeight, radiusVert);
                    shapes.add(oval);
                    break;

                default:
                    System.out.println("Invalid char input, please try again.");
                    continue;
            }

            for (Shape shape : shapes) { // for loop to print out info 
                if (shape instanceof Triangle) {
                    Triangle triangle = (Triangle) (shape);
                    System.out.println(triangle.getName() + " Base: " + triangle.getBase() + " Height: " + triangle.getHeight()+ " Area: " + triangle.area());
                } else if (shape instanceof Circle) {
                    Circle circle = (Circle)(shape);
                    System.out.println(circle.getName() + " Radius: " + circle.getRadius()+ " Area: " + circle.area());
                } else if(shape instanceof Square) {
                    Square square = (Square)(shape);
                    System.out.println(square.getName() + " Side: " + square.getSide() + " Area: " + square.area());
                }
                else if(shape instanceof Oval) {
                    Oval oval = (Oval)(shape);
                    System.out.println(oval.getName() + " Horizontal Radius: " + oval.getRadiusA() + " Vertical Radius: " + oval.getRadiusB() + " Area: " + oval.area());
                }
            }
        }
    }
}

