public class Book implements LibraryResource {
    @Override
    public void borrow(Student student, String title) {
        // Implement borrowing a book
        System.out.println("Borrowed book: " + title);
    }
}
