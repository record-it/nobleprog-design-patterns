package chain;

import java.util.ArrayList;
import java.util.List;

public class BoilerChainDemo {
    public static void main(String[] args) {
        RequestHandler funHandler = new FunHandler(new TerminatorHandler());
        RequestHandler boilerHandler = new WaterHandler(funHandler);
        boilerHandler.handle("fun");
        boilerHandler.handle("water");
        boilerHandler.handle("power");

    }
}
