package resource;

public class Book implements Resource {
    @Override
    public void borrow(String title) {
        System.out.println("\nBorrowing book: " + title);
    }
}