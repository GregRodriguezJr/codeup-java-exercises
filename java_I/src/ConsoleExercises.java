import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        // Exercise 1
        // double pi = 3.14159;
        // System.out.printf("The value of pi is approximately %.2f.\n", pi);

        // Scanner Class
        // Exercise 1
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userNum = scanner.nextInt();
        System.out.println("The number you entered is: " + userNum);
        scanner.close();
    }
}
