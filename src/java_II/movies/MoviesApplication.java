package java_II.movies;
import java_II.util.*;

public class MoviesApplication {
    public static void main(String[] args) {
        MoviesApplication.displayOptions();
        Input.getInt(0,5);
    }

    public static void displayOptions() {
        System.out.println("What would you like to do?");
        String line = 
        "0 - exit\n" +
        "1 - view all movies\n" + 
        "2 - view movies in the animated category\n" +
        "3 - view movies in the drama category\n" +
        "4 - view movies in the horror category\n" +
        "5 - view movies in the scifi category";
        System.out.println(line);
    }
}
