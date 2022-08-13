package creational.abstractFactory.simpleSecond;

public class NovelBookFactory extends AbstractFactory {
    @Override
    public Book getBook(String bookName) {
        if ("BRAVE NEW WORLD".equalsIgnoreCase(bookName)) {
            return new BraveNewWorld("green", 12);
        } else if ("PALE FIRE".equalsIgnoreCase(bookName)) {
            return new PaleFire("green", 23);
        } else {
            return null;
        }
    }
}
