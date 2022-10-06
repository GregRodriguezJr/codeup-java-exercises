package util;
import java.util.Scanner;

// Exercise 1 - Create an input validation class
public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    public static boolean yesNo() {
        System.out.print("Enter a [y/n]: ");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }

    public static int getInt(int min, int max) {
        System.out.print("Enter a number between " + min + " - " + max + " : ");
        int userNum = scanner.nextInt(); 
        if(userNum < min || userNum > max) {
            userNum = getInt(min, max);
        }
        return userNum;
    }

    public static int getInt() {
        return scanner.nextInt();
    }

    public static double getDouble(double min, double max){
        System.out.print("Enter a number between " + min + " - " + max + " : ");
        double userNum = scanner.nextDouble();
        if(userNum < min || userNum > max) {
            userNum = getDouble(min, max);
        }
        return userNum;
    }

    public static double getDouble(){
        return scanner.nextDouble();
    }
}