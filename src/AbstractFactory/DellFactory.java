package abstractFactory;

public class DellFactory extends Factory{

    @Override
    public Monitor buildMonitor() {
        return new DellMonitor();
    }

    @Override
    public Cpu buildCpu() {
        return new DellCpu();
    }
}
