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

        // Create Book objects using setters
        Book book1 = new Book();
        book1.setName("The Catcher in the Rye");
        book1.setPrice(12.99f);
        book1.setPagesAmount(224);

        Book book2 = new Book();
        book2.setName("To Kill a Mockingbird");
        book2.setPrice(15.50f);
        book2.setPagesAmount(336);

        Book book3 = new Book();
        book3.setName("1984");
        book3.setPrice(9.99f);
        book3.setPagesAmount(328);

        // Add books to the list
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
