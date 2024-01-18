import memento.Editor;
import memento.History;
import state.BrushTool;
import state.Canvas;
import state.SelectionTool;

public class Main {
    public static void main(String[] args) {
        //encapsulation
        Account account = new Account();
        account.deposit(1000);
        account.withdraw(100);
        System.out.println(account.getBalance());

        //Abstraction
        EmailService email = new EmailService();
        email.sendEmail();

        //Inheritance
        TextBox textBox = new TextBox();
        textBox.enable();

        //Polymorphism
        UIController uiController = new CheckBox();
        uiController.draw();
        uiController = new TextBox();
        uiController.draw();

        //Memento pattern
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("This is mmemento pattern");
        history.push(editor.createState());

        editor.setContent("Using Java");
        history.push(editor.createState());

        editor.setContent("GoF");
        editor.restore(history.pop()); //ask the editor to restore to a particular state by passing the state object

        //State pattern
        Canvas canvas = new Canvas();
        canvas.setCurrenTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}