package ss9_arraylist.bai_tap.bai_2.repository;

import ss9_arraylist.bai_tap.bai_2.model.Student;

public interface IStudentRepository {
    void displayStudentList();

    void addListStudent(Student student);

    boolean deleteStudent(int id);

}
