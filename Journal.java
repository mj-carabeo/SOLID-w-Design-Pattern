public class Journal implements LibraryResource {
    @Override
    public void borrow(Student student, String title) {
        System.out.println("Borrowed journal: " + title);
    }
}
