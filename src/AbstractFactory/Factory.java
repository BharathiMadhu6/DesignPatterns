package AbstractFactory;

public abstract class Factory {
    public abstract Monitor buildMonitor();
    public abstract Cpu buildCpu();
}
