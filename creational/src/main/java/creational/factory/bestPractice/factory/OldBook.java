package creational.factory.bestPractice.factory;

import creational.factory.bestPractice.factory.Book;

public class OldBook implements Book {
    private static final String description = "My old book.";

    @Override
    public String getDescription() {
        return description;
    }
}
