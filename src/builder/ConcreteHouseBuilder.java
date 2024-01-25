package builder;

import singleton.Connection;

public class ConcreteHouseBuilder implements HouseBuilder {
    private final House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }
    @Override
    public void buildFoundation() {
        house.foundation("concrete");
        System.out.println("Building foundation of concrete house");
    }

    @Override
    public void buildStructure() {
        house.structure("cement");
        System.out.println("Building structre of concrete house");
    }

    @Override
    public void buildRoof() {
        house.roof("concrete");
        System.out.println("Building roof of concrete house");
    }

    @Override
    public void buildDoor() {
        house.door("Steel");
        System.out.println("Building door of concrete house");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
