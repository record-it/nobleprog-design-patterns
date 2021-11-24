package factory;

public class Laptop implements Product{
    @Override
    public String name() {
        return "Asus";
    }

    @Override
    public int price() {
        return 2000_00;
    }


}
