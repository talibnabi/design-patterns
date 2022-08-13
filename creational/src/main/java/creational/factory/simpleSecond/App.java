package creational.factory.simpleSecond;

public class App {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.getCar("Audi");
        assert car != null;
        System.out.println(car.toString());
    }
}
