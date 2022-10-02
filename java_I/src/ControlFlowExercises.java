import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // Loop Basics 1
        // Exercise 1a - While
        // int i = 5;
        // while(i <= 15) {
        //     System.out.println("Value of i is : " + i);
        //     i++;
        // }

        // Exercise 1b - Do While
        // int i = 0;
        // do {
        //     System.out.println("Count by twos: " + i);
        //     i += 2;
        // } while (i <= 100);

        // int i = 100;
        // do {
        //     System.out.println("Count by fives: " + i);
        //     i -= 5;
        // } while (i >= -10);

        // long i = 2;
        // do {
        //     System.out.println("Number squared: " + i);
        //     i *= i;
        // } while (i <= 1000000);

        // Exercise 1c - For
        // for(int i = 100; i >= -10; i -= 5) {
        //     System.out.println("Countdown by fives: " + i);
        // }

        // for(long i = 2; i <= 1000000; i *= i) {
        //     System.out.println("Number squared: " + i);
        // }

        // Exercise 2 - Fizzbuzz
        // for(int i = 1; i <= 100; i++) {
        //     if (i % 15 == 0) {
        //         System.out.println(i + "FizzBuzz:");
        //     } else if (i % 5 == 0) {
        //         System.out.println(i + " Buzz");
        //     } else if (i % 3 == 0) {
        //         System.out.println(i + " Fizz");
        //     } else {
        //         System.out.println(i);
        //     }
        // }

        // Exercise 3 - Powers
        // boolean keepGoing;
        // Scanner scanner = new Scanner(System.in);
        // do {
        //     System.out.print("What number would you like to go up to? ");
        //     int num = scanner.nextInt();
        //     System.out.println("\nHere is your table!\n");
        //     System.out.println("number | squared | cubed\n-------------------------");
        //     for (int i = 1; i <= num; i++) {
        //         int squared = i * i;
        //         int cubed = i * i * i;
        //         System.out.println(i + "      | " + squared + "       |  " + cubed );
        //     }
        //     scanner.nextLine();
        //     System.out.println("Would you like to try another number?");
        //     String answer = scanner.nextLine();
        //     if (answer.equalsIgnoreCase("yes")) {
        //         keepGoing = true;
        //     } else {
        //         keepGoing = false;
        //     }
        // } while (keepGoing);

        // Exercise 4
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing;
        do {
            System.out.print("Enter a grade between 0 - 100: ");
            int num = scanner.nextInt();
            String grade = " ";
            if (num <= 100 && num >= 88) {
                grade = " is an A.";
            } else if (num <= 87 && num >= 80) {
                grade = " is an B.";
            } else if (num <= 79 && num >= 67) {
                grade = " is an C.";
            } else if (num <= 66 && num >= 60) {
                grade = " is an D.";
            } else {
                grade = " is an F.";
            }
            System.out.println("The number grade " + num + grade);

            scanner.nextLine();
            System.out.print("Would you like another grade?");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                keepGoing = true;
            } else {
                keepGoing = false;
            }
        } while (keepGoing);
        
    }
}