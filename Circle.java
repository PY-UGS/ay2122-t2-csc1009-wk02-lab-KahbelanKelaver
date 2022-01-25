import java.util.Scanner;


public class Circle {
    private static final double PI=3.14159;
    public static void main(String arg[]) 
    { 
        double radius;
        try (// Create a Scanner object for keyboard input.
        Scanner console = new Scanner(System.in)) {
          System.out.print("Enter a number for radius: ");
          radius = console.nextDouble();
        }
        double area = radius * radius * PI;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
        
    }

}