package creational.abstractFactory.simpleFirst;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory) {
        return computerAbstractFactory.createComputer();
    }
}
