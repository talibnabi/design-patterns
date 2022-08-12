package creational.factory.bestPractice.factory;

import creational.factory.bestPractice.enums.BookType;

public final class BookFactory {
    public static Book getBook(BookType bookType) {
        return bookType.getConstructor().get();
    }
}
