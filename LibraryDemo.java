package LibraryDemo;

import Book.Book;
import Patron.Patron;

public class LibraryDemo {
    public static void main(String[] args) {
        // Create a book
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", true);

        // Create a patron
        Patron patron1 = new Patron("Alice Johnson", "P001", 0);

        // Display initial state
        System.out.println("Initial State:");
        System.out.println("Book: " + book1.getTitle() + " by " + book1.getAuthor() + " | Available: " + book1.isAvailable());
        System.out.println("Patron: " + patron1.getName() + " | Books borrowed: " + patron1.getBooksBorrowed());

        // Patron borrows the book
        System.out.println("\n--- Borrowing process ---");
        book1.checkOut();
        patron1.borrowBook();

        // Display updated state
        System.out.println("\nUpdated State:");
        System.out.println("Book: " + book1.getTitle() + " | Available: " + book1.isAvailable());
        System.out.println("Patron: " + patron1.getName() + " | Books borrowed: " + patron1.getBooksBorrowed());

        // Patron returns the book
        System.out.println("\n--- Returning process ---");
        book1.returnBook();
        patron1.returnBook();

        // Final state
        System.out.println("\nFinal State:");
        System.out.println("Book: " + book1.getTitle() + " | Available: " + book1.isAvailable());
        System.out.println("Patron: " + patron1.getName() + " | Books borrowed: " + patron1.getBooksBorrowed());
    }
}
