package resource;

public class Journal implements Resource {
    @Override
    public void borrow(String title) {
        System.out.println("\nBorrowing journal: " + title);
    }
}