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
        // System.out.print("Enter a number between 1 - 10 : ");
        // int userInput = scanner.nextInt();
        // getInteger(userInput);

        // Exercise 3
        boolean keepGoing = false;
        boolean numValid;
    
        do {
            System.out.print("Enter a number between 1 - 10: ");
            long userInput = scanner.nextLong();

            if (userInput >= 1 & userInput <= 10) {
                numValid = true;
                System.out.println("The factorial for " + userInput + " is " + getFactorial(userInput));

                scanner.nextLine();
                System.out.print("Would you like to continue? [y/n] ");
                String answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
                    keepGoing = true;
                } else {
                    keepGoing = false;
                }
            } else {
                numValid = false;
            }

        } while (!numValid || keepGoing);
 
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
    // public static void getInteger(int num) {
    //     Scanner scanner2 = new Scanner(System.in);

    //     if (num >= 1 & num <= 10) {
    //         System.out.println("Your number " + num + " is between 1 - 10!");
    //     } else {
    //         System.out.print("Enter a number between 1 - 10 : ");
    //         int userInput = scanner2.nextInt();
    //         getInteger(userInput);
    //         scanner2.close();
    //     }
    // }

    // Exercise 3
      
}
