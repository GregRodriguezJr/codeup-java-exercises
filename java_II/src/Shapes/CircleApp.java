package Shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.print("Enter a radius: ");
        double radiusInput = Input.getDouble();
        Circle circle = new Circle(radiusInput);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        System.out.printf("The circle has the area of %s, and circumference of %s", area, circumference);
    }
}
