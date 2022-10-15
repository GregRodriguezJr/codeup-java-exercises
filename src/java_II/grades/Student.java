package java_II.grades;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    // Constructor for new student
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Getter to return grades array
    public String getGrades() {
        return this.grades.stream().map(Object::toString).collect(Collectors.joining(", "));
    }

    // Getter to return the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int i;
        double total = 0;
        for (i = 0; i < this.grades.size(); i++) {
            total += this.grades.get(i);
        }
        return total / this.grades.size();
    }

    // Method to print out students information
    public static void printStudent(Student student) {
        System.out.format(
                "Student %s's" +
                        " grades are %s" +
                        " and the average is %.1f",
                student.getName(),student.getGrades() ,student.getGradeAverage());
    }
}
