package abstract_factory;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactoryProvider {
    private Map<String, AbstractFactory<Vehicle>> factories = new HashMap<>();

    public void register(AbstractFactory<Vehicle> factory, String selector){
        factories.put(selector, factory);
    }

    public AbstractFactory<Vehicle> getFactory(String selector){
        return factories.get(selector);
    }
}
