package creational.factory.simpleSecond;

public class Kia extends Car {
    @Override
    public String start() {
        return "Kia start";
    }

    @Override
    public String speedUp() {
        return "Kia speed up";
    }

    @Override
    public String stop() {
        return "Kia stop";
    }
}
