public class Student {
    private String name;
    private List<LibraryResource> borrowedResources;

    public Student(String name) {
        this.name = name;
        this.borrowedResources = new ArrayList<>();
    }

    public void borrowResource(LibraryResource resource) {
        resource.borrow(this);
        borrowedResources.add(resource);
    }
}
