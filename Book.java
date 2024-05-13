public class Book implements LibraryResource {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void borrow(Student student) {
        // Implement borrowing a book
    }
}

public class Journal implements LibraryResource {
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public void borrow(Student student) {
        // Implement borrowing a journal
    }
}
