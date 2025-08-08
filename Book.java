package Book;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    // Constructor
    public Book(String title, String author, String isbn, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    // Getters and setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    // Check out book
    public void checkOut() {
        if (available) {
            available = false;
            System.out.println("Book \"" + title + "\" checked out successfully.");
        } else {
            System.out.println("Book \"" + title + "\" is not available.");
        }
    }

    // Return book
    public void returnBook() {
        available = true;
        System.out.println("Book \"" + title + "\" returned successfully.");
    }
}
