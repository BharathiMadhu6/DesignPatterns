package builder;

public class House implements HousePlan{
    String foundation;
    String structure;
    String door;
    String roof;

    public void foundation(String f) {
        this.foundation = f;
        System.out.println("Material used: "+f);;
    }

    public void structure(String structure) {
        this.structure = structure;
        System.out.println("Material used: "+structure);;
    }

    public void door(String door) {
        this.door = door;
        System.out.println("Material used: "+door);;
    }

    public void roof(String roof) {
        this.roof = roof;
        System.out.println("Material used: "+roof);;
    }
}
