package LibrarySystem;

public class Teacher extends User {
        private final int BORROW_LIMIT = 5;

        public Teacher(String name, String userID) {
            super(name, userID);
        }

        public void borrowBook(Book book) {
            if (borrowedBooks.size() < BORROW_LIMIT) {
                super.BorrowBook(book);
            } else {
                System.out.println(Name + " has reached the borrowing limit.");
            }
        }

}
