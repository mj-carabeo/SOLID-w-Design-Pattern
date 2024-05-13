public class Student {
    private String name;
    private List<LibraryResource> borrowedResources;

    public Student(String name) {
        this.name = name;
        this.borrowedResources = new ArrayList<>();
    }

    public void borrowResource(LibraryResource resource, String title) {
        resource.borrow(this, title);
        borrowedResources.add(resource);
    }

    public List<LibraryResource> getBorrowedResources() {
        return borrowedResources;
    }
}
