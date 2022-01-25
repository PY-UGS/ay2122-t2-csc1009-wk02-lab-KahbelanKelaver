import java.util.Scanner;
public class Zodiac {
    public static void main(String arg[]) 
    { 
        int year;
        try (
        Scanner console = new Scanner(System.in)) {
            System.out.print("Enter a year: ");
            year = console.nextInt();
        }

        int sign = year % 12;

        if(sign == 0){
            System.out.println("monkey");
        } else if (sign == 1) {
            System.out.println("rooster");
        }else if (sign == 2) {
            System.out.println("dog");
        }else if (sign == 3) {
            System.out.println("pig");
        }else if (sign == 4) {
            System.out.println("rat");
        }else if (sign == 5) {
            System.out.println("ox");
        }else if (sign == 6) {
            System.out.println("tiger");
        }else if (sign == 7) {
            System.out.println("rabbit");
        }else if (sign == 8) {
            System.out.println("dragon");
        }else if (sign == 9) {
            System.out.println("snake");
        }else if (sign == 10) {
            System.out.println("horse");
        }else if (sign == 11) {
            System.out.println("sheep");
        }


    }
}