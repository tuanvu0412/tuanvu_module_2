package ss9_arraylist.bai_tap.bai_2.repository;

import ss9_arraylist.bai_tap.bai_2.model.Teacher;

public interface ITeacherRepository {
    void displayTeacherList();

    void addNewTeacher(Teacher teacher);

    boolean deteleTeacher(int id);
}
