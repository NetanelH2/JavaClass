package classTasks.booksTask;

import java.util.List;
import java.util.ArrayList;

public class MyBooks {
    public static void main(String[] args) {
        // Create a list of books
        List<Book> bookList = createBookList();

        // Print information about each book
        printBookInformation(bookList);
    }

    private static List<Book> createBookList() {
        // Create and return a list of 3 books
        List<Book> books = new ArrayList<>();

        Book book1 = new Book("The Catcher in the Rye", 12.99f, 224);
        Book book2 = new Book("To Kill a Mockingbird", 15.50f, 336);
        Book book3 = new Book("1984", 9.99f, 328);

        books.add(book1);
        books.add(book2);
        books.add(book3);

        return books;
    }

    private static void printBookInformation(List<Book> books) {
        // Iterate through the list and print information about each book
        for (Book book : books) {
            System.out.println("Book Information:");
            System.out.println("Title: " + book.getName());
            System.out.println("Price: $" + book.getPrice());
            System.out.println("Page Amount: " + book.getPagesAmount());
            System.out.println(); // Add a line break between books
        }
    }
}