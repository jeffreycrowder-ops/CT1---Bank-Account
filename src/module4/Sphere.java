package module4;

public class Sphere extends Shape {

    // Radius of the sphere
    private double radius;

    // Constructor initializes the radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Calculates the surface area using formula 4πr²
    @Override
    public double surface_area() {
        return 4 * Math.PI * radius * radius;
    }

    // Calculates the volume using formula: (4/3)πr³
    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    // Returns a string showing sphere details
    @Override
    public String toString() {
        return "Sphere:\n" +
               "The Radius is: " + radius + "\n" +
               "The Surface Area is: " + surface_area() + "\n" +
               "The Volume is: " + volume() + "\n";
    }
}
