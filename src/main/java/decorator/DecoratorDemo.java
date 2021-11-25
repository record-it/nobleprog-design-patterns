package decorator;

import proxy.EmailMessage;
import proxy.Message;

import java.util.ArrayList;
import java.util.List;

public class DecoratorDemo {
    public static void main(String[] args) {
        List<Message> messages = new ArrayList<>();
        messages.add(new EmailMessage("ewa@op.pl"));
        messages.add(new SignedMessage(new EmailMessage("a.pl.pl"),"Java"));
        messages.forEach(m -> System.out.println(m.content()));
    }
}
