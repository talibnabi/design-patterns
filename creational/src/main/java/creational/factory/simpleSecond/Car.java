package creational.factory.simpleSecond;

public abstract class Car {
    public abstract String start();

    public abstract String speedUp();

    public abstract String stop();

    public String toString() {
        return this.start() + " / " + this.speedUp() + " / " + this.stop();
    }
}
