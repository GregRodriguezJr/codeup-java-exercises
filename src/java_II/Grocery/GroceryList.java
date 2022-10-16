package java_II.Grocery;

import java.util.Scanner;

public class GroceryList {
    static Scanner scanner = new Scanner(System.in);

    // Prompt user to create grocery list
    public static void promptUser() {
        String answer;
        System.out.print("Do you want to create a grocery list? ");
        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            System.out.println("moving forward");
        } else {
            System.out.println("goodbye");
        }
    }
}
