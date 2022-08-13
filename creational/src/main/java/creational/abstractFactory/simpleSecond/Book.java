package creational.abstractFactory.simpleSecond;

public abstract class Book {
    public abstract String color();

    public abstract Integer price();

    public String toString() {
        return "Color: " + this.color() + " / Price: " + this.price();
    }
}
