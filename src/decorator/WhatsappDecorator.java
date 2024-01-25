package decorator;

public class WhatsappDecorator extends BaseNotifierDecorator {
    public WhatsappDecorator(INotifier wrapped) {
        super(wrapped);
    }
    public void send(String msg) {
        super.send(msg); //send default notification which is via email
        String phoneNumber = database.getPhoneNumber();
        System.out.println("Notification sent via Whatsapp on "+phoneNumber);
    }
}
