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
        int i = 0;
        do {
            System.out.println("Count by twos: " + i);
            i += 2;
        } while (i <= 100);
    }
}