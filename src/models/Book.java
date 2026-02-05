package models;
public class Book {
    private int bookId;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private int totalCopies;
    private int availableCopies;
    
    public Book() {}
    
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    
    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }
    
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    
    public boolean isAvailable() {
        return availableCopies > 0;
    }
    
    @Override
    public String toString() {
        return title + " by " + author;
    }
}
