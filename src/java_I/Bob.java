package java_I;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Say something to Bob... ");
        String userInput = scanner.nextLine();
        if (userInput.endsWith("?")) {
            System.out.println("Bob says: Sure!");
        } else if (userInput.endsWith("!")) {
            System.out.println("Bob says: Whoa, chill out!");
        } else if (userInput.isEmpty()) {
            System.out.println("Bob says: Fine. Be that way!");
        } else {
            System.out.println("Bob says: Whatever");
        }
    }
}
