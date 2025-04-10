package student;

import resource.Resource;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String studentId;
    private List<Resource> resources;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.resources = new ArrayList<>();
    }

    public Student() {
        this.resources = new ArrayList<>();
    }

    public void addResource(Resource resource) {
        resources.add(resource);
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}