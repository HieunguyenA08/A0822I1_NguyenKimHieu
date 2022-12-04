package demoCleanCode.service.imple;

import ss9_mvc.model.Student;
import ss9_mvc.service.IStudentService;

public class StudentSevice implements IStudentService {
    private static Student[] students = new Student[100];
    static {
        students[0] = new Student(1, "chanh", "QN");
        students[1] = new Student(2, "chanh1", "QN");
        students[2] = new Student(3, "chanh2", "QN");
    }
    @Override
    public void display() {

    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void search() {

    }
}
