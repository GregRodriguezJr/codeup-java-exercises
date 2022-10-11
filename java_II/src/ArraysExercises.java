import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        // Exercise 1 - Array Basics
        // int[] numbers = {1, 2, 3, 4, 5};
        // System.out.println(numbers);
        // System.out.println(Arrays.toString(numbers));

        //Creating an array to store objects
        Person personArr[]  = new Person[3];
        //Populating the array
        personArr[0] = new Person("Greg");
        personArr[1] = new Person("John");
        personArr[2] = new Person("Bill");

        for(int i = 0; i < personArr.length; i++) {
            System.out.println("The index " + i + " value is " + personArr[i].getName());
        }
    }
}
