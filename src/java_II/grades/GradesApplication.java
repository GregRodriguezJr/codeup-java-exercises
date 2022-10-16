package java_II.grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();

        // Creating new student object and adding grades
        Student john = new Student("John");
        john.addGrade(75);
        john.addGrade(80);
        john.addGrade(65);

        Student steve = new Student("Steve");
        steve.addGrade(95);
        steve.addGrade(90);
        steve.addGrade(88);

        Student jane = new Student("Jane");
        jane.addGrade(90);
        jane.addGrade(79);
        jane.addGrade(87);

        Student becky = new Student("Becky");
        becky.addGrade(90);
        becky.addGrade(79);
        becky.addGrade(87);

        // Putting username as key and student object as value of hashmap
        students.put("johnthedev", john);
        students.put("wizardSteve", steve);
        students.put("janelinux", jane);
        students.put("beckondeck", becky);

        // CLI
        String userInput;
        boolean keepGoing;
        String answer;

        System.out.println("------------------ Welcome! ------------------\n");
        do {
            System.out.println("Here are the GitHub usernames of our students: ");
            students.forEach((key, value) -> System.out.print(key + " | "));
            System.out.println("\nWhat student would you like to see more information on?");
            userInput = scanner.nextLine();
            // Hashmap method to return the value associated with the given key, or null
            if (students.get(userInput) == null ) {
                System.out.println("Sorry, no student found with the GitHub username of " + userInput);
            } else {
                System.out.format("Name: %s" + "\nGithub username: %s" + "\nCurrent average: %.1f",
                        students.get(userInput).getName(), userInput, students.get(userInput).getGradeAverage());
            }
            System.out.print("\nWould you like to see another student? [y/n] ");
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                keepGoing = true;
            } else {
                System.out.println("Thank you for using Grades App goodbye.");
                keepGoing = false;
            }
        } while (keepGoing);
    }
}
