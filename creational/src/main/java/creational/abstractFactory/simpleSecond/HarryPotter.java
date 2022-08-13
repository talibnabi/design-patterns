package creational.abstractFactory.simpleSecond;

public class HarryPotter implements Book {
    private final String color;
    private final Integer price;

    public HarryPotter(String color, Integer price) {
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
