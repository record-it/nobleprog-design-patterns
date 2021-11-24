package abstract_factory;

public class TruckFactory implements AbstractFactory<Vehicle>{
    @Override
    public Vehicle create(String data) {
        String[] tokens = data.split("\t");
        String selector = tokens[0];
        if ("truck".equals(selector)){
            return Truck.builder()
                    .weight(Integer.parseInt(tokens[1]))
                    .name(tokens[2])
                    .power(Integer.parseInt(tokens[3]))
                    .maxLoad(Integer.parseInt(tokens[4]))
                    .build();
        } else {
            throw new IllegalArgumentException("Nieznany typ pojazdu!");
        }
    }
}
