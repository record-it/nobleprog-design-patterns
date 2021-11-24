package abstract_factory;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Vehicle {
    private int weight;
    private String name;
    private int power;
}
