package creational.abstractFactory.simpleSecond;

public class App {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("NOVEL");
        assert abstractFactory != null;
        Book book = abstractFactory.getBook("BRAVE NEW WORLD");
        System.out.println(book.toString());
    }
}
