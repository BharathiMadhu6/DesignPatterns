package builder;

public class WoodenHouseBuilder implements HouseBuilder{
    private final House house;

    public WoodenHouseBuilder() {
        this.house = new House();
    }
    @Override
    public void buildFoundation() {
        house.foundation("concrete");
        System.out.println("Building foundation of wooden house");
    }

    @Override
    public void buildStructure() {
        house.structure("wood");
        System.out.println("Building structure of wooden house");
    }

    @Override
    public void buildRoof() {
        house.roof("special material");
        System.out.println("Building roof of wooden house");
    }

    @Override
    public void buildDoor() {
        house.door("wood");
        System.out.println("Building door of wooden house");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
