package LibrarySystem;
import java.util.*;

public class Library {
        private List<Book> books = new ArrayList<>();

        public void addBook(Book book) {
            books.add(book);
            System.out.println("Book added: " + book);
        }

        public void removeBook(String isbn) {
            books.removeIf(b -> b.getISBN().equals(isbn));
            System.out.println("Book with ISBN " + isbn + " removed.");
        }

        public void searchBook(String keyword) {
            books.stream()
                    .filter(b -> b.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                    .forEach(System.out::println);
        }

        public void showAvailableBooks() {
            books.stream()
                    .filter(Book::isAvailable)
                    .forEach(System.out::println);
        }

        public Book getBookByISBN(String isbn) {
            return books.stream()
                    .filter(b -> b.getISBN().equals(isbn))
                    .findFirst()
                    .orElse(null);
        }
}


