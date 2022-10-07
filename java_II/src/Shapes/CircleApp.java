package Shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.print("Enter a radius: ");
        double radiusInput = Input.getDouble();
        Circle circle = new Circle(radiusInput);
        System.out.println("The area of " + radiusInput + " is " + circle.getArea());
        System.out.println("The circumference of " + radiusInput + " is " + circle.getCircumference());;
    }
}
