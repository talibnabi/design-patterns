package creational.factory.bestPractice;

public final class BookFactory {
    public static Book getBook(BookType bookType) {
        return bookType.getConstructor().get();
    }
}
