package module4;

public class Cylinder extends Shape {

    // Radius and height of the cylinder
    private double radius;
    private double height;

    // Constructor initializes radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Calculates surface area using formula: 2πr² + 2πrh
    @Override
    public double surface_area() {
        double baseArea = 2 * Math.PI * radius * radius;
        double sideArea = 2 * Math.PI * radius * height;
        return baseArea + sideArea;
    }

    // Calculates volume using formula: πr²h
    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    // Returns a string showing cylinder details
    @Override
    public String toString() {
        return "Cylinder:\n" +
               "The Radius is: " + radius + "\n" +
               "The Heightis: " + height + "\n" +
               "The Surface Area is: " + surface_area() + "\n" +
               "The Volume is: " + volume() + "\n";
    }
}
