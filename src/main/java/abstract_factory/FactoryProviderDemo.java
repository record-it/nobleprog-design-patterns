package abstract_factory;

import java.util.ArrayList;
import java.util.List;
/*
    Wprowadź nowy typ pojazdu Van:
    1. Dodaj nową klasę Van po Vehicle
    2. Utwórz klasę fabryki dla Van
    3. Zarejestruj klasę fabryki w providerze
 */
public class FactoryProviderDemo {
    public static void main(String[] args) {
        VehicleFactoryProvider provider = new VehicleFactoryProvider();
        provider.register(new TruckFactory(), "truck");
        provider.register(new BusFactory(), "bus");
        provider.register(new VanFactory(), "van");
        String data = "bus\t2500\tjelcz\t500\t45\n" +
                "truck\t4000\tził\t800\t5000\n" +
                "van\t1200\tfiat\t125";
        List<Vehicle> vehicleList = new ArrayList<>();

        for(String line: data.split("\n")){
            vehicleList.add(provider.getFactory(line.split("\t")[0]).create(line));
        }
        System.out.println(vehicleList);
    }
}
