package abstract_factory;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Van extends Vehicle{
    @Builder
    public Van(int weight, String name, int power) {
        super(weight, name, power);
    }
}
