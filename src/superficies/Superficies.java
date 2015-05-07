package superficies;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author damian editado por dpazolopez ;)
 */
public class Superficies {

    private static Scanner sc;
    
    
    public static void main(String[] args) {

    }

    public void calcAreaSquare(String shapeType, float sideLength, float squareArea, float sideHeight, float rectangleArea, float baseLength, float height) {

        sc = new Scanner(System.in);

        JOptionPane.showInputDialog("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        shapeType = sc.nextLine();
        JOptionPane.showMessageDialog(null,"You said: " + shapeType);
        //add area calculations for square
        JOptionPane.showInputDialog("what is the side length?");
        sideLength = sc.nextFloat();
        squareArea = sideLength * sideLength;
        JOptionPane.showMessageDialog(null,"The area for your square: " + squareArea);
        

    }

    public void calcAreaRectangle(String shapeType, float sideLength, float sideHeight, float rectangleArea) {

        
        
            //add area calculations for rectangle here
            JOptionPane.showInputDialog("what is the rectangles width?");
            sideLength = sc.nextFloat();
            JOptionPane.showInputDialog("What is the rectangles height?");
            sideHeight = sc.nextFloat();
            rectangleArea = sideLength * sideHeight;
            JOptionPane.showMessageDialog(null,"The area for your rectangle is: " + rectangleArea);

        
    }

    public void calcAreaTriangle(String shapeType, float baseLength, float height) {
        
            //add area calculations for triangle here

            float triangleArea;

            JOptionPane.showInputDialog("What is the base length of the triangle?");
            baseLength = sc.nextFloat();
            JOptionPane.showInputDialog("What is the height of the triangle?");
            height = sc.nextFloat();
            triangleArea = (float) (0.5 * baseLength * height);
            JOptionPane.showMessageDialog(null,"Your triangles area is: " + triangleArea);

    }

    public void calcAreaCircle(String shapeType,float radius,float circleArea) {
       
            //add area calculations for a circle here
            
            JOptionPane.showInputDialog("What is the radius of the circle?");
            radius = sc.nextFloat();
            circleArea = radius * radius;
            circleArea = (float) (3.14159265 * circleArea);
            JOptionPane.showMessageDialog(null,"Your Circles area is " + circleArea);

        

    }

}
