package builder;

public interface HouseBuilder {
    public abstract void buildFoundation();
    public abstract void buildStructure();
    public abstract void buildRoof();
    public abstract void buildDoor();
    public abstract House getHouse();
}
