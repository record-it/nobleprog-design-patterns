package factory;

public abstract class Order{
    public int price(){
        return getProduct().price();
    }

    abstract public Product getProduct();
}
