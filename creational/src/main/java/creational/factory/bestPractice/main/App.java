package creational.factory.bestPractice.main;

import creational.factory.bestPractice.enums.BookType;
import creational.factory.bestPractice.factory.Book;
import creational.factory.bestPractice.factory.BookFactory;
import creational.factory.bestPractice.factory.NewBook;

import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        Book book = BookFactory.getBook(BookType.SMALL);
        System.out.println(book.getDescription());
    }
}
