import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        Double userInput1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        Double userInput2 = scanner.nextDouble();

        // System.out.println("\nYour addition result: " + addition(userInput1, userInput2));
        // System.out.println("\nYour subtraction result: " + subtraction(userInput1, userInput2));
        // System.out.println("\nYour multiplication result: " + multiplication(userInput1, userInput2));
        System.out.println("\nYour remainder result: " + modulus(userInput1, userInput2));
        scanner.close();
    }
    // Exercise 1 - Basic Arithmetic
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }
    public static double division(double num1, double num2) {
        return num1 / num2;
    }
    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }
}
