package ss9_mvc.service;

import ss9_mvc.model.Student;

public interface IStudentService {
    void display();
    Student findById(int id);
    void add();
    void delete();
    void update();
    void search();
}
