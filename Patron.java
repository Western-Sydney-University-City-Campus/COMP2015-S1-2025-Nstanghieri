package Patron;

public class Patron {
    private String name;
    private String patronId;
    private int booksBorrowed;

    // Constructor
    public Patron(String name, String patronId, int booksBorrowed) {
        this.name = name;
        this.patronId = patronId;
        this.booksBorrowed = booksBorrowed;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPatronId() { return patronId; }
    public void setPatronId(String patronId) { this.patronId = patronId; }

    public int getBooksBorrowed() { return booksBorrowed; }
    public void setBooksBorrowed(int booksBorrowed) { this.booksBorrowed = booksBorrowed; }

    // Borrow book
    public void borrowBook() {
        booksBorrowed++;
        System.out.println(name + " borrowed a book. Total borrowed: " + booksBorrowed);
    }

    // Return book
    public void returnBook() {
        if (booksBorrowed > 0) {
            booksBorrowed--;
            System.out.println(name + " returned a book. Total borrowed: " + booksBorrowed);
        } else {
            System.out.println(name + " has no books to return.");
        }
    }
}
