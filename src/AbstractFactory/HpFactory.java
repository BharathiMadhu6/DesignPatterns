package abstractFactory;

public class HpFactory extends Factory{

    @Override
    public Monitor buildMonitor() {
        return new HpMonitor();

    }

    @Override
    public Cpu buildCpu() {
        return new HpCpu();
    }
}
