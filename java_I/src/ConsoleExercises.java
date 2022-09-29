import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        // Exercise 1
        // double pi = 3.14159;
        // System.out.printf("The value of pi is approximately %.2f.\n", pi);

        // Scanner Class
        // Exercise 1
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter an integer: ");
        // int userNum = scanner.nextInt();
        // System.out.println("The number you entered is: " + userNum);

        // Exercise 2
        // System.out.print("Enter first word: ");
        // String firstWord = scanner.next();
        // System.out.print("Enter second word: ");
        // String secondWord = scanner.next();
        // System.out.print("Enter third word: ");
        // String thirdWord = scanner.next();
        // System.out.println(
        //     " 1st word: " + firstWord + "\n"
        //     + " 2nd word: " + secondWord + "\n" 
        //     + " 3rd word: " + thirdWord);

        // Exercise 3
        System.out.print("Enter a sentence: ");
        String userSentence = scanner.nextLine();
        System.out.println("You entered: " + userSentence);
    }
}
