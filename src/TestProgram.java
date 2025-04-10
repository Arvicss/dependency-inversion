import library.Library;
import resource.Book;
import resource.Journal;
import resource.Resource;
import student.Student;

public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Arvyx M. Ramos", "22-11300-867");
        Library library = new Library();

        Resource book = new Book();
        Resource journal = new Journal();

        library.borrowResource(student, book, "OOP for beginners");
        library.borrowResource(student, journal, "Code Craft");
    }
}
