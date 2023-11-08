package mediator;

public interface Client<T> {
    int getId();

    void receive(T response);
}
