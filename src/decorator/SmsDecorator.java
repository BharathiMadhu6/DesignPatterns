package decorator;

public class SmsDecorator extends BaseNotifierDecorator {

    public SmsDecorator(INotifier wrapped) {
        super(wrapped);
    }

    public void send(String msg) {
        super.send(msg); //send default notification which is via email
        String phoneNumber = database.getPhoneNumber();
        System.out.println("Notification sent via SMS on "+phoneNumber);
    }
}
