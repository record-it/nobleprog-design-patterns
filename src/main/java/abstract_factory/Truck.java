package abstract_factory;

import lombok.*;

@Data
@ToString(callSuper = true)
public class Truck extends Vehicle{
    private int maxLoad;

    @Builder
    public Truck(int weight, String name, int power, int maxLoad) {
        super(weight, name, power);
        this.maxLoad = maxLoad;
    }
}
