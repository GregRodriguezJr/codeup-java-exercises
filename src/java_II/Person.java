package java_II;
public class Person {
    // Exercise 1 - Object Basics
    private String name;

    // constructor
    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        // return the person's name
        return this.name;
    }
        
    public void setName(String name){
        // change the name field to the passed value
        this.name = name;
    }

    public void sayHello(){
        // print a message to the console using the person's name
        System.out.println("Hi " + name);
    }

    public static void main(String[] args) {
        Person greg = new Person("Greg");
        System.out.println("Get name: " + greg.getName());
        greg.setName("Gregorio");
        System.out.println("Get name after setter: " + greg.getName());
        greg.sayHello();
    }
}
