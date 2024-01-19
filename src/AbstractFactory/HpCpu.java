package AbstractFactory;

public class HpCpu implements Cpu {
    @Override
    public void assemble() {
        System.out.println("Assembling HP CPU");
    }
}
