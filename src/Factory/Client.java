package Factory;

public class Client {
    ShapeFactory shapeFactory;

    public Client() {
        shapeFactory = null;
    }

    public Shape build(String shapeType) {
        shapeFactory = new ShapeFactory();
        return shapeFactory.getShape(shapeType);
    }
}
