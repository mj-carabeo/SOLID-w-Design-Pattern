public class Book implements LibraryResource {
    @Override
    public void borrow(Student student, String title) {
        System.out.println("Borrowed book: " + title);
    }
}
