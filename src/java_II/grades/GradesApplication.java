package java_II.grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

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

        students.put("johnthedev", john);
        students.put("wizardSteve", steve);
        students.put("janelinux", jane);
        students.put("beckondeck", becky);
    }
}
