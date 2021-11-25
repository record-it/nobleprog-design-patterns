package decorator;

import proxy.Message;

public class SignedMessage implements Message {
    private Message decoratedMessage;
    private final String sign;

    public SignedMessage(Message decoratedMessage, String sign) {
        this.decoratedMessage = decoratedMessage;
        this.sign = sign;
    }

    @Override
    public String content() {
        return decoratedMessage.content() + "\n"+ sign;
    }
}
