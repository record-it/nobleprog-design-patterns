package abstract_factory;

import java.util.ArrayList;
import java.util.List;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory<Vehicle> factory = new VehicleFactory();
        String data = "bus\t2500\tjelcz\t500\t45\n" +
                       "truck\t4000\tził\t800\t5000";
        List<Vehicle> vehicles = new ArrayList<>();
        for(String line: data.split("\n")){
            vehicles.add(factory.create(line));
        }
        System.out.println(vehicles);
    }
}
