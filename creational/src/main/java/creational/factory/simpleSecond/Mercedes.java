package creational.factory.simpleSecond;

public class Mercedes extends Car {
    @Override
    public String start() {
        return "Mercedes start";
    }

    @Override
    public String speedUp() {
        return "Mercedes speed up";
    }

    @Override
    public String stop() {
        return "Mercedes stop";
    }
}
