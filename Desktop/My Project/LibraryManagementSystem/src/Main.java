import LibrarySystem.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();


        library.addBook(new Book("1984", "George Orwell", "123"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "456"));

        User student = new Student("Alice", "S001");
        User teacher = new Teacher("Mr. Smith", "T001");


        student.BorrowBook(library.getBookByISBN("123"));
        teacher.BorrowBook(library.getBookByISBN("123")); // already borrowed
        teacher.BorrowBook(library.getBookByISBN("456"));

        System.out.println("\nAvailable books:");
        library.showAvailableBooks();


        student.ReturnBook(library.getBookByISBN("123"));

        teacher.BorrowBook(library.getBookByISBN("123"));
    }
}
