package creational.abstractFactory.simpleSecond;

public class FantasyBookFactory extends AbstractFactory {
    @Override
    public Book getBook(String bookName) {
        if ("HARRY POTTER".equalsIgnoreCase(bookName)) {
            return new HarryPotter();
        } else if ("NUMBER THE STARS".equalsIgnoreCase(bookName)) {
            return new NumberTheStars();
        } else {
            return null;
        }
    }
}
