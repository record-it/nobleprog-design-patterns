package strategy;

import lombok.Builder;

import java.time.LocalDate;
@Builder
public class BirthDayDiscount implements Discount{
    LocalDate birthDate;
    LocalDate currentDate;
    int totalPrice;

    @Override
    public int calcOrderPrice() {
        if (birthDate.withYear(currentDate.getYear()).equals(currentDate)){
            return totalPrice - (int) (totalPrice * 0.01 * (currentDate.getYear() - birthDate.getYear() / 10.0));
        } else {
            return totalPrice;
        }
    }
}
