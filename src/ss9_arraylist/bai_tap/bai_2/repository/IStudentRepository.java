package ss9_arraylist.bai_tap.bai_2.repository;

import ss9_arraylist.bai_tap.bai_2.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getStudentList();

    void addListStudent(Student student);

    boolean deleteStudent(int id);

}
