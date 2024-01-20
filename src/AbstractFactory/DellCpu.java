package abstractFactory;

public class DellCpu implements Cpu {
    @Override
    public void assemble() {
        System.out.println("Assembling DELL CPU");
    }
}
