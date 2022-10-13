package java_II.grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Mclovin");
        student1.addGrade(50);
        student1.addGrade(75);
        student1.addGrade(60);
        System.out.format(
                "Student %s's" +
                " grades are %s" +
                " and the average is %.2f",
                student1.getName(),student1.getGrades() ,student1.getGradeAverage());
    }
}
