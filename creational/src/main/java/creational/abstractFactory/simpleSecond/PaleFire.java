package creational.abstractFactory.simpleSecond;

public class PaleFire implements Book {
    private final String color;
    private final String price;

    public PaleFire(String color, String price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String color() {
        return this.color;
    }

    @Override
    public String price() {
        return this.price;
    }
}
