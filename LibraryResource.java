public interface LibraryResource {
    void borrow(Student student, String title);

    default String getBorrowedTitle() {
        return "No title";
    }
}
