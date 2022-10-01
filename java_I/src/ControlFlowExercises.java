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
        for(int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println(i + "FizzBuzz:");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}