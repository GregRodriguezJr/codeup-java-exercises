import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Exercise 1 Basic Arithmetic
        // System.out.print("Enter first number: ");
        // Double userInput1 = scanner.nextDouble();
        // System.out.print("Enter second number: ");
        // Double userInput2 = scanner.nextDouble();

        // System.out.println("\nYour addition result: " + addition(userInput1, userInput2));
        // System.out.println("\nYour subtraction result: " + subtraction(userInput1, userInput2));
        // System.out.println("\nYour multiplication result: " + multiplication(userInput1, userInput2));
        // System.out.println("\nYour remainder result: " + modulus(userInput1, userInput2));

        // Exercise 2
        System.out.print("Enter a number between 1 - 10 : ");
        int userInput = scanner.nextInt();
        getInteger(userInput);

        scanner.close();
    }
    // Exercise 1 - Basic Arithmetic
    // public static double addition(double num1, double num2) {
    //     return num1 + num2;
    // }
    // public static double subtraction(double num1, double num2) {
    //     return num1 - num2;
    // }
    // public static double multiplication(double num1, double num2) {
    //     return num1 * num2;
    // }
    // public static double division(double num1, double num2) {
    //     return num1 / num2;
    // }
    // public static double modulus(double num1, double num2) {
    //     return num1 % num2;
    // }

    // Exercise 2
    public static void getInteger(int num) {
        Scanner scanner2 = new Scanner(System.in);

        if (num >= 1 & num <= 10) {
            System.out.println("Your number " + num + " is between 1 - 10!");
        } else {
            System.out.print("Enter a number between 1 - 10 : ");
            int userInput = scanner2.nextInt();
            getInteger(userInput);
            scanner2.close();
        }
    }
}
