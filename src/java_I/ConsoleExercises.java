package java_I;
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
        // System.out.print("Enter a sentence: ");
        // String userSentence = scanner.nextLine();
        // System.out.println("You entered: " + userSentence);

        // Perimeter
        // Exercise 1 and Bonus
        System.out.print("Enter the length of the classroom in ft: ");
        // String strLength = scanner.nextLine();
        // int length = Integer.parseInt(strLength);
        float length = scanner.nextFloat();

        System.out.print("Enter the width of the classroom in ft: ");
        // String strWidth = scanner.nextLine();
        // int width = Integer.parseInt(strWidth);
        float width = scanner.nextFloat();

        System.out.print("Enter the height of the classroom in ft: ");
        float height = scanner.nextFloat();

        float volume = length * width * height;
        float area = length * width;
        float perimeter = (length * length) + (width * width);

        System.out.println("The area of the classroom is " + area + " sqft.");
        System.out.println("The perimeter of the classroom is " + perimeter + " feet.");
        System.out.println("The volume of the classroom is " + volume + " cubic feet.");
    }
}
