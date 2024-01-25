package decorator;

public class Notifier implements INotifier {
    private final String username;
    private final DatabaseConnection database;

    public Notifier(String username) {
        this.username = username;
        this.database = new DatabaseConnection();
    }
    @Override
    public void send(String message) {
        System.out.println("Sending Generic notification - EMAIL");
    }

}
