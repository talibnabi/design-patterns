package creational.factory.bestPractice.factory;

import creational.factory.bestPractice.factory.Book;

public class NewBook implements Book {
    private static final String description = "My new book.";

    @Override
    public String getDescription() {
        return description;
    }
}
