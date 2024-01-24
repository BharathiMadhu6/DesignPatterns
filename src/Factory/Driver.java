package factory;

public class Driver {
    ShapeFactory shapeFactory;

    public Driver() {
        shapeFactory = null;
    }

    public Shape build(String shapeType) {
        shapeFactory = new ShapeFactory();
        return shapeFactory.getShape(shapeType);
    }
}
