package chain;

public class TerminatorHandler implements RequestHandler{
    @Override
    public void handle(String request) {
        System.out.println("Niezrozumiałe polecenie!");
    }
}
