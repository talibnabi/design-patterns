package creational.factory.simpleSecond;

public class Audi extends Car {
    @Override
    public String start() {
        return "Audi start";
    }

    @Override
    public String speedUp() {
        return "Audi speed up";
    }

    @Override
    public String stop() {
        return "Audi stop";
    }
}
