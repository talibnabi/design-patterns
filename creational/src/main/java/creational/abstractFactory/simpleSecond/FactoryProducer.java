package creational.abstractFactory.simpleSecond;

public class FactoryProducer {
    public static AbstractFactory getFactory(String genre) {
        if ("NOVEL".equalsIgnoreCase(genre)) {
            return new NovelBookFactory();
        } else if ("FANTASY".equalsIgnoreCase(genre)) {
            return new FantasyBookFactory();
        } else {
            return null;
        }
    }
}
