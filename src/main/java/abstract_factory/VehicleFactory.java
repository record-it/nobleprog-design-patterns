package abstract_factory;
/*
 bus\t<masa>\t<name>\t<power>\tseats
 truck\t<masa>\t<name>\t<power>\tload
 */
public class VehicleFactory implements AbstractFactory<Vehicle>{
    @Override
    public Vehicle create(String data) {
        final String selector = data.split("\t")[0];
        switch (selector){
            case "bus":
                return Bus.builder()
                        .weight(Integer.parseInt(data.split("\t")[1]))
                        .seats(Integer.parseInt(data.split("\t")[4]))
                        .build();
            case "truck":
                return Truck.builder()
                        .weight(Integer.parseInt(data.split("\t")[1]))
                        .maxLoad(Integer.parseInt(data.split("\t")[4]))
                        .build();
        }
        throw new IllegalArgumentException("Brak takiego typu!!!");
    }
}
