package chain;

public class WaterHandler implements RequestHandler{
    private final RequestHandler next;

    public WaterHandler(RequestHandler next) {
        this.next = next;
    }

    @Override
    public void handle(String request) {
        if (request.startsWith("water")){
            System.out.println("Puszczam wodę");
        } else {
            next.handle(request);
        }
    }
}
