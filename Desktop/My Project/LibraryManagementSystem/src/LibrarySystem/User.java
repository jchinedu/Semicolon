package LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    protected String Name;
    protected String UserId;
    protected List<Book> borrowedBooks;


    public User(String name, String userId) {
        Name = name;
        UserId = userId;
        borrowedBooks = new ArrayList<>();
    }
    public String getName() {
        return Name;
    }
    public String getUserId() {
        return UserId;
    }
    public void BorrowBook(Book book) {
        if(book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            System.out.println(Name + "borrowed +" + book.getTitle());
        }else{
            System.out.println(book.getTitle() + " not available");
        }
    }
    public void ReturnBook(Book book) {
        if(borrowedBooks.remove(book)) {
            book.setAvailable(true);
            System.out.print(Name + " returned +" + book.getTitle());
        }else{
            System.out.print(book.getTitle() + " has not borrowed +" + book.getTitle());
        }
    }
    public void ListBorrowedBooks() {
        if(borrowedBooks.isEmpty()) {
            System.out.println(Name + "has not borrowed any books");
        }else{
            borrowedBooks.forEach(book -> System.out.println(book));
        }
    }
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

}
