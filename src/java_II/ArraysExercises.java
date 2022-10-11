package java_II;
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

        Person bob = new Person("Bob");
        System.out.println("New array with added person " + Arrays.toString(addPerson(personArr, bob)));
    }

    public static String[] addPerson(Person [] people, Person person) {
        int i;

        // create a new array of a bigger size (+ one element)
        String newArray[] = new String[people.length + 1];

        // insert the elements from the old array into the new one
        for (i = 0; i < people.length; i++)
            newArray[i] = people[i].getName();

        // assign last element to new person added
        newArray[people.length] = person.getName();
        return newArray;
    }
}
