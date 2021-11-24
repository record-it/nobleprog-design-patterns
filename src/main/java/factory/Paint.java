package factory;

public class Paint implements Product {
    private String name;
    private final int capacity;
    private final int unitPrice;

    public Paint(String name, int capacity, int unitPrice) {
        this.name = name;
        this.capacity = capacity;
        this.unitPrice = unitPrice;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int price() {
        return capacity * unitPrice;
    }
}
