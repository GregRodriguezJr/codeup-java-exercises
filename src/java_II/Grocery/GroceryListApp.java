package java_II.Grocery;

import java_II.util.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListApp {
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<GroceryItem> list = new ArrayList<>();

    public static void main(String[] args) {
        promptUser();
        System.out.print("This is the Current list: " + list);
    }

    // Prompt user to create grocery list
    public static void promptUser() {
        String answer;
        System.out.print("Do you want to create a grocery list? ");
        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("y")) {
            promptSelection();
        } else if (answer.equalsIgnoreCase("n")) {
            System.out.println("Goodbye!");
            System.exit(0);
        } else {
            System.out.println("Invalid entry...try again with [y/n]");
            promptUser();
        }
    }
    public static void promptSelection() {
        System.out.println("Select a category by entering a number: \n" +
                "1. Dairy \n" + "2. Fruits \n" + "3. Meat \n" + "4. Veggies ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1) {
            addItem("Dairy");
        } else if (choice == 2) {
            System.out.println("you chose 2");
        } else if (choice == 3) {
            System.out.println("you chose 3");
        } else if (choice == 4) {
            System.out.println("you chose 4");
        } else {
            System.out.println("Invalid entry...try again");
            promptSelection();
        }
    }

    public static void addItem(String category) {
        String item;
        int count;

        System.out.println("Enter your item");
        item = scanner.nextLine();

        System.out.println("Enter quantity");
        count = scanner.nextInt();
        scanner.nextLine();

        GroceryItem newItem = new GroceryItem(category, item, count);
        list.add(newItem);
    }
}
