package abstract_factory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Truck extends Vehicle{
    private int maxLoad;

    @Builder
    public Truck(int weight, String name, int power, int maxLoad) {
        super(weight, name, power);
        this.maxLoad = maxLoad;
    }
}
