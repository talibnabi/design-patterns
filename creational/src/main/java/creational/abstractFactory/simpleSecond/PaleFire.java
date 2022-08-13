package creational.abstractFactory.simpleSecond;

public class PaleFire extends Book {
    private final String color;
    private final Integer price;

    public PaleFire(String color, Integer price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String color() {
        return this.color;
    }

    @Override
    public Integer price() {
        return this.price;
    }
}
