package strategy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StrategyDemo {
    public static void main(String[] args) {
        List<Discount> discounts = new ArrayList<>();
        discounts.add(BirthDayDiscount.builder()
                .totalPrice(129_99)
                .currentDate(LocalDate.now())
                .birthDate(LocalDate.of(2000,11, 25))
                .build());
        discounts.add(DefaultDiscount.builder().totalPrice(2000_00).build());

        final int sum = discounts.stream().mapToInt(d -> d.calcOrderPrice()).sum();
    }
}
