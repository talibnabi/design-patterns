package creational.abstractFactory.simpleSecond;

public class NovelBookFactory extends AbstractFactory {
    @Override
    public Book getBook(String bookName) {
        if ("BRAVE NEW WORLD".equalsIgnoreCase(bookName)) {
            return new BraveNewWorld();
        } else if ("PALE FIRE".equalsIgnoreCase(bookName)) {
            return new PaleFire();
        } else {
            return null;
        }
    }
}
