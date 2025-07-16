package LibrarySystem;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable = true;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
    public String getTitle() {
        return title;
    }
    public String getISBN() {
        return ISBN;
    }
    public String toString() {
        return title + " by " + author + " (ISBN: " + ISBN + ") " +
                (isAvailable ? "[Available]" : "[Borrowed]");
    }
}
