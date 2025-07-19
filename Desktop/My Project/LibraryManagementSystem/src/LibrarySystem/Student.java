package LibrarySystem;

import LibrarySystem.Book;
import LibrarySystem.User;

public class Student extends User {
    private final int BORROW_LIMIT = 3;

    public Student(String Name, String userID) {
        super(Name, userID);
    }

    public void borrowBook(Book book) {
        if (borrowedBooks.size() < BORROW_LIMIT) {
            super.BorrowBook(book);
        } else {
            System.out.println(Name + " has reached the borrowing limit.");
        }
    }


}
