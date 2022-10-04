import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Exercise 1 Basic Arithmetic
        System.out.print("Enter first number: ");
        Double userInput1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        Double userInput2 = scanner.nextDouble();

        System.out.println("\nYour addition result: " + addition(userInput1, userInput2));
        System.out.println("Your subtraction result: " + subtraction(userInput1, userInput2));
        System.out.println("Your multiplication result: " + multiplication(userInput1, userInput2));
        System.out.println("Your remainder result: " + modulus(userInput1, userInput2));

        // Exercise 2
        getInteger();

        // Exercise 3
        getFactorial();

        // Exercise 4
        diceRoll();

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

    // Exercise 2
    public static void getInteger() {
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = false;
        do {
            System.out.print("\nEnter a number between 1 - 10 : ");
            int userInput = scanner.nextInt();
        if (userInput >= 1 & userInput <= 10) {
            System.out.println("\nYour number " + userInput + " is between 1 - 10!");
            keepGoing = false;
        } else {
            System.out.println("Invalid number, try again.");
            keepGoing = true;
        }
        } while (keepGoing);

    }

    // Exercise 3 method
    public static void getFactorial() {
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = false;
        boolean numValid;
    
        do {
            System.out.print("Enter a number between 1 - 10 for factorial: ");
            long userInput = scanner.nextLong();

            if (userInput >= 1 & userInput <= 10) {
                numValid = true;

                long factorial = 1;
                for(int i = 1; i <= userInput; ++i) {
                    factorial *= i;
                }
                System.out.println("The factorial for " + userInput + " is " + factorial);

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

    }  

    // Exercise 4
    public static void diceRoll() {
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing;
        do {
            System.out.print("\nHow many sides on your dice? ");
            int sides = scanner.nextInt();
            int randomSide1 = (int)Math.floor(Math.random() * sides + 1);
            int randomSide2 = (int)Math.floor(Math.random() * sides + 1);
            System.out.println("First die roll: " + randomSide1);
            System.out.println("Second die roll: " + randomSide2);

            System.out.print("Would you like to play again? [y/n] ");
            scanner.nextLine();
            String answer = scanner.nextLine();

            if(answer.equalsIgnoreCase("y")) {
                keepGoing = true;
            } else {
                keepGoing = false;
            }
        } while (keepGoing);
        
    }
}
