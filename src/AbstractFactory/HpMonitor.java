package AbstractFactory;

public class HpMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Assembling HP Monitor");
    }
}
