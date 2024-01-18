package state;

public class BrushTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Brush tool selected");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw paint");
    }
}
