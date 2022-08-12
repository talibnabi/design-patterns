package creational.factory.bestPractice;

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
