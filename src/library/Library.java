package library;

import resource.Resource;
import student.Student;

public class Library {
    public void borrowResource(Student student, Resource resourceType, String title) {
        resourceType.borrow(title);
        System.out.println(student.getName() + " borrowed a "
                + resourceType.getClass().getSimpleName() + ": " + title);
    }
}