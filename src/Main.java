import abstractFactory.Cpu;
import abstractFactory.DellFactory;
import abstractFactory.Factory;
import abstractFactory.Monitor;
import builder.*;
import factory.Client;
import factory.Shape;
import memento.Editor;
import memento.History;
import singleton.Database;
import state.Canvas;
import state.SelectionTool;

public class Main {
    public static void main(String[] args) {
        //encapsulation
        Account account = new Account();
        account.deposit(1000);
        account.withdraw(100);
        //System.out.println(account.getBalance());

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

        //Factory pattern
        System.out.println("------FACTORY PATTERN-----");
        Client client = new Client();
        Shape shape = client.build("Circle");
        shape.draw();

        //Abstract Factory pattern
        System.out.println("---------ABSTRACT FACTORY PATTERN--------");
        Factory factory = new DellFactory();
        Cpu cpu = factory.buildCpu();
        cpu.assemble();
        Monitor monitor = factory.buildMonitor();
        monitor.assemble();

        //Singleton pattern
        System.out.println("------------SINGLETON PATTERN------------");
        Database.getConnection();
        Database.getConnection().disconnect();

        //Builder pattern
        System.out.println("------------BUILDER PATTERN--------------");
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        Constructor constructor = new Constructor(concreteHouseBuilder);
        constructor.constructHouse();

        HouseBuilder woodHouse = new WoodenHouseBuilder();
        Constructor constructor1 = new Constructor(woodHouse);
        constructor1.constructHouse();
    }
}