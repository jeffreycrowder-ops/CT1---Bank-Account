package module4;

public class Cone extends Shape {

    // Radius and height of the cone
    private double radius;
    private double height;

    // Constructor initializes radius and height
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Calculates surface area using formula: πr(r + √(h² + r²))
    @Override
    public double surface_area() {
        // Slant height is needed for the surface area formula
        double slantHeight = Math.sqrt(height * height + radius * radius);
        return Math.PI * radius * (radius + slantHeight);
    }

    // Calculates volume using formula: (1/3)πr²h
    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    // Returns a string showing cone details
    @Override
    public String toString() {
        return "Cone:\n" +
               "The Radius is: " + radius + "\n" +
               "The Height is: " + height + "\n" +
               "The Surface Area is: " + surface_area() + "\n" +
               "The Volume is: " + volume() + "\n";
    }
}
