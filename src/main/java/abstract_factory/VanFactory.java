package abstract_factory;

public class VanFactory implements AbstractFactory<Vehicle>{
    @Override
    public Vehicle create(String data) {
        String[] tokens = data.split("\t");
        return Van.builder()
                .weight(Integer.parseInt(tokens[1]))
                .name(tokens[2])
                .power(Integer.parseInt(tokens[3]))
                .build();
    }
}
