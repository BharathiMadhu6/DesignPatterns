public class EmailService {
    public void sendEmail() {
        connect();
        authenticate();
        disconnect();
    }

    private void connect() { //adding a new param here (ex: connect_timeout = 2) will not cause the main() to break. the only change would be to pass the param in sendEmail
        System.out.println("Connecting..");
    }

    private void disconnect() {
        System.out.println("disconnecting..");
    }

    private void authenticate() {
        System.out.println("authenticating..");
    }
}
