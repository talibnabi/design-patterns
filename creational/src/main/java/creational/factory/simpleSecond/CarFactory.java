package creational.factory.simpleSecond;

public final class CarFactory {
    public Car getCar(String carName) {
        if ("KIA".equalsIgnoreCase(carName)) {
            return new Kia();
        } else if ("MERCEDES".equalsIgnoreCase(carName)) {
            return new Mercedes();
        } else if ("AUDI".equalsIgnoreCase(carName)) {
            return new Audi();
        } else {
            return null;
        }
    }
}
