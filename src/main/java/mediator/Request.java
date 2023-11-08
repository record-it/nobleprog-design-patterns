package mediator;

public class Request {
    public final Client from;
    public final Client to;
    public final String message;

    public Request(Client from, Client client, String message) {
        this.from = from;
        to = client;
        this.message = message;
    }
}
