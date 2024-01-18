package state;

public class Canvas {
    //This class is simply delegating what should happen when mouseUp() or mouseDown() is called based on the type of Tool.
    //With this pattern we eliminate a long list of decision-making statements. Our code is more maintainable
    private Tool currenTool;

    public void mouseDown() {
        currenTool.mouseDown();
    }

    public void mouseUp() {
        currenTool.mouseUp();
    }

    public void setCurrenTool(Tool currenTool) {
        this.currenTool = currenTool;
    }

    public Tool getCurrentTool() {
        return this.currenTool;
    }
}
