package module4;

public class ShapeArray {

    public static void main(String[] args) {

        // Instantiate one of each shape
        Shape sphere = new Sphere(3.0);
        Shape cylinder = new Cylinder(2.0, 5.0);
        Shape cone = new Cone(2.5, 4.0);

        // Store them in an array
        Shape[] shapeArray = { sphere, cylinder, cone };

        // Loop through the array and print shape's data
        // Adds separator bar after printing result
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
            System.out.println("-------------------------");

        }
    }
}
