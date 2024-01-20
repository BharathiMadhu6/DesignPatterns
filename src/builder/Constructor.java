package builder;

public class Constructor {
    HouseBuilder houseBuilder;

    public Constructor(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House getHouse() {
        return this.getHouse();
    }

    public void constructHouse() {
        this.houseBuilder.buildFoundation();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildDoor();
    }
}
