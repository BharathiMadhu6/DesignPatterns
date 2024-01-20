package builder;

public class House {
    String foundation;
    String structure;
    String door;
    String roof;

    void setFoundation(String foundation) {
        this.foundation = foundation;
        System.out.println("Material used: "+foundation);;
    }

    void setStructure(String structure) {
        this.structure = structure;
        System.out.println("Material used: "+structure);;
    }

    void setDoor(String door) {
        this.door = door;
        System.out.println("Material used: "+door);;
    }

    void setRoof(String roof) {
        this.roof = roof;
        System.out.println("Material used: "+roof);;
    }
}
