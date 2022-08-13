package creational.abstractFactory.simpleFirst;

public class App {
    public static void main(String[] args) {
        Computer computer = ComputerFactory.getComputer(new ServerFactory("8", "1tb", "i7"));
        System.out.println(computer.toString());
    }
}
