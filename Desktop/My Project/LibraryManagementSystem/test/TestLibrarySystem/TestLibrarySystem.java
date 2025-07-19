package TestLibrarySystem;
import LibrarySystem.Book;
import LibrarySystem.Library;
import LibrarySystem.Student;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestLibrarySystem {
        @Test
        public void testAddBookIncreasesLibrarySize() {
            Library library = new Library();
            Book book = new Book("1984", "George Orwell", "123");

            library.addBook(book);

            assertEquals(book, library.getBookByISBN("123"));
        }
    @Test
    public void testStudentCannotBorrowMoreThanThreeBooks() {
        Student student = new Student("Alice", "S001");

        Book b1 = new Book("Book1", "A", "001");
        Book b2 = new Book("Book2", "B", "002");
        Book b3 = new Book("Book3", "C", "003");
        Book b4 = new Book("Book4", "D", "004");

        student.BorrowBook(b1);
        student.BorrowBook(b2);
        student.BorrowBook(b3);
        student.BorrowBook(b4);

        assertEquals(4 , student.getBorrowedBooks().size());
    }
}



