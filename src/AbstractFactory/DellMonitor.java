package AbstractFactory;

public class DellMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Assembling DELL Monitor");
    }
}
