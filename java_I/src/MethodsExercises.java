import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        Double userInput1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        Double userInput2 = scanner.nextDouble();

        Double additionAnswer = addition(userInput1, userInput2);
        System.out.println("\nYour addition result: " + additionAnswer);
    }
    // Exercise 1a
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }
}
