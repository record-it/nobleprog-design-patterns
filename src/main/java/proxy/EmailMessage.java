package proxy;

public class EmailMessage implements Message{
    private final String emailAddress;

    public EmailMessage(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String content() {
        return "Hello from original object";
    }
}
