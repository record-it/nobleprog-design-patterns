package chain;

public class FunHandler implements RequestHandler{
    private final RequestHandler next;

    public FunHandler(RequestHandler next) {
        this.next = next;
    }


    @Override
    public void handle(String request) {
        if (request.startsWith("fun")){
            System.out.println("Włączam wentylator");
        } else {
            next.handle(request);
        }
    }
}
