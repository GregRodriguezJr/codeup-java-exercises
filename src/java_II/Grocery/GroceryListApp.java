package java_II.Grocery;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListApp {
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<GroceryItem> list = new ArrayList<>();

    public static void main(String[] args) {
        promptUser();
        printList();
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
                "1. Dairy \n" + "2. Fruits \n" + "3. Meat \n" + "4. Other ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            addItem("Dairy");
        } else if (choice == 2) {
            addItem("Fruits");
        } else if (choice == 3) {
            addItem("Meat");
        } else if (choice == 4) {
            addItem("Other");
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
        keepGoing();
    }

    public static void printList() {
        System.out.println("\nCurrent List: \n" +
                "Category | Item | Quantity");
        list.forEach(System.out::println);
    }

    public static void keepGoing() {
        System.out.print("Would you like add another item? [y/n] ");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("y")) {
            promptSelection();
        } else if (answer.equalsIgnoreCase("n")) {
            System.out.println("List complete, \nThank you for using Grocery App");
        } else {
            System.out.println("Invalid input...enter [y/n]");
            keepGoing();
        }
    }
}
