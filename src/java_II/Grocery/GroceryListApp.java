package java_II.Grocery;

import java_II.util.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListApp {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> dairy = new ArrayList<>();
    static ArrayList<String> fruits = new ArrayList<>();
    static ArrayList<String> meat = new ArrayList<>();
    static ArrayList<String> veggies = new ArrayList<>();
    public static void main(String[] args) {
        promptUser();
    }
    // Prompt user to create grocery list
    public static void promptUser() {
        String answer;
        System.out.print("Do you want to create a grocery list? ");
        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            System.out.print("Would you like to enter a new item? ");
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                promptSelection();
            } else {
                System.out.println("Goodbye");
            }
        } else {
            System.out.println("Goodbye");
        }
    }
    public static void promptSelection() {
        System.out.println("Select a category by entering a number: \n" +
                "1. Dairy \n" + "2. Fruits \n" + "3. Meat \n" + "4. Veggies ");
        int choice = Input.getInt(1,4);
        if (choice == 1) {
            System.out.println(choice);
        }
    }
}
