package mediator;

import java.util.ArrayList;
import java.util.List;

public class CharRoom implements Mediator<Request>{
    private List<Client<Response>> clients = new ArrayList<>();

    @Override
    public void handle(Request request) {
    }

    public void registerClient(Client<Response> client){
        clients.add(client);
    }
}
