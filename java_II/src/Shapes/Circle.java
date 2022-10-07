package Shapes;

// Exercise 2 - Circle class
public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Methods
    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
}
