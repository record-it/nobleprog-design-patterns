package factory;

import java.util.ArrayList;
import java.util.List;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();

        orders.add(new LaptopOrder());
        orders.add(new PaintOrder());

        final int sum = orders.stream()
                .mapToInt(o -> o.price())
                .sum();
        System.out.println(sum);
    }
}
