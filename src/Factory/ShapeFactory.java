package factory;

public class ShapeFactory {
    public Shape getShape(String shape) {
        if (shape.equals("Circle")) {
            return new Circle();
        }
        else if (shape.equals("Square")) {
            return new Square();
        }
        else if (shape.equals("Triangle")) {
            return new Triangle();
        }
        else {
            System.out.println("No valid shape type was passed");
            return null;
        }
    }
}
