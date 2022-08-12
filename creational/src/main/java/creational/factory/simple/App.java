package creational.factory.simple;

public class App {
    public static void main(String[] args) {
        Computer computer = ComputerFactory.getComputer("pc", "8", "i7", "1tb");
        assert computer != null;
        System.out.println(computer.toString());
    }
}
