package strategy;

import lombok.Builder;

@Builder
public class DefaultDiscount implements Discount{
    int totalPrice;

    @Override
    public int calcOrderPrice() {
        return (int) (totalPrice * (0.98));
    }
}
