package factory;

public class LaptopOrder extends Order{
    @Override
    public Product getProduct() {
        return new Laptop();
    }
}
