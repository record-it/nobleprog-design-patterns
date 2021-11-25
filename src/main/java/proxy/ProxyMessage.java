package proxy;

public class ProxyMessage implements Message{

    private final Message originalObject;

    public ProxyMessage(Message originalObject) {
        this.originalObject = originalObject;
    }

    @Override
    public String content() {
        System.out.println("Befor calling original method!");
        String content = originalObject.content();
        System.out.println("After calling original method");
        return content;
    }
}
