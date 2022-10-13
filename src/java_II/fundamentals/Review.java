package java_II.fundamentals;

import java.util.Scanner;

public class Review {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number to get the radius: ");
        double userInput = scanner.nextDouble();
        System.out.print("The radius of " + userInput + " is: " );
        System.out.format("%.2f\n", Review.radius(20));
    }

    public static double radius(double radius) {
        double pi = 3.14;
        double cir = 2 * pi * radius;
        return cir;
    }
    
    public static double radius(int radius) {
        double pi = 3.14;
        double cir = 2 * pi * radius;
        return cir;
    }
}
