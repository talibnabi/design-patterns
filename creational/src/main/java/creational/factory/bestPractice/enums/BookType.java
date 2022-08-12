package creational.factory.bestPractice.enums;

import creational.factory.bestPractice.factory.Book;
import creational.factory.bestPractice.factory.NewBook;
import creational.factory.bestPractice.factory.OldBook;

import java.util.function.Supplier;

public enum BookType {
    SMALL(NewBook::new),
    BIG(OldBook::new);
    private final Supplier<Book> constructor;

    BookType(Supplier<Book> constructor) {
        this.constructor = constructor;
    }

    public Supplier<Book> getConstructor() {
        return constructor;
    }
}
