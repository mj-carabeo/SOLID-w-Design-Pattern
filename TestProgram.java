import java.util.ArrayList;
import java.util.List;

public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Meldrick");

        LibraryResource bookResource = new Book();
        student.borrowResource(bookResource, "The Sorcerer's Apprentice");

        LibraryResource journalResource = new Journal();
        student.borrowResource(journalResource, "Science Journal");

        List<String> borrowedTitles = new ArrayList<>();
        for (LibraryResource resource : student.getBorrowedResources()) {
            borrowedTitles.add(resource.getBorrowedTitle());
        }
        System.out.println("Borrowed resources: " + borrowedTitles);
    }
}
