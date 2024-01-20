package builder;

public class WoodenHouseBuilder implements HouseBuilder{
    private House house;

    public WoodenHouseBuilder() {
        this.house = new House();
    }
    @Override
    public void buildFoundation() {
        house.setFoundation("concrete");
        System.out.println("Building foundation of wooden house");
    }

    @Override
    public void buildStructure() {
        house.setStructure("wood");
        System.out.println("Building structure of wooden house");
    }

    @Override
    public void buildRoof() {
        house.setRoof("special material");
        System.out.println("Building roof of wooden house");
    }

    @Override
    public void buildDoor() {
        house.setDoor("wood");
        System.out.println("Building door of wooden house");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
