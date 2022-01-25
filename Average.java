import java.util.Scanner;
public class Average {
    public static void main(String arg[]) 
    { 
        double avg,a,b,c;
        try (// Create a Scanner object for keyboard input.
        Scanner console = new Scanner(System.in)) {
          System.out.print("Enter three numbers: ");
          a = console.nextDouble();
          b = console.nextDouble();
          c = console.nextDouble();
        }
        avg = (a + b + c)/3;

        System.out.println("The average of " + a +" " + b +" " + c + " is " + avg);
    }
}
