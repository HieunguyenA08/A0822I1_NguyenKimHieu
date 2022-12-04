package demoCleanCode.service;

import ss9_mvc.model.Student;

public interface IStudentservice {
    void display();
    void add();
    void delete();
    void update();
    Student findById(int id);
}
