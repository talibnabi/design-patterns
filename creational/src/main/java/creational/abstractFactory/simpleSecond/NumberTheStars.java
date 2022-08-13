package creational.abstractFactory.simpleSecond;

public class NumberTheStars implements Book {
    private String color;
    private String price;

    public NumberTheStars(String color, String price) {
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
