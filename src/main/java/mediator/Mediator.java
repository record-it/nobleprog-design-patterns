package mediator;

public interface Mediator<T> {
    void handle(T request);
}
