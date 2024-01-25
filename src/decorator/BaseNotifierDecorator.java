package decorator;

public class BaseNotifierDecorator implements INotifier {
    private final INotifier notifier;
    protected final DatabaseConnection database;

    public BaseNotifierDecorator(INotifier wrapped) {
        this.notifier = wrapped;
        database = new DatabaseConnection();
    }
    @Override
    public void send(String message) {
        notifier.send(message);
    }
}
