package creational.factory.bestPractice.main;

import creational.factory.bestPractice.enums.BookType;
import creational.factory.bestPractice.factory.Book;
import creational.factory.bestPractice.factory.BookFactory;

public class App {
    public static void main(String[] args) {
        Book book = BookFactory.getBook(BookType.SMALL);
        System.out.println(book.getDescription());
    }
}
