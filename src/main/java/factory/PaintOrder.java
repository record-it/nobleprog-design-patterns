package factory;

public class PaintOrder extends Order{
    @Override
    public Product getProduct() {
        return new Paint("biała", 10, 21);
    }
}
