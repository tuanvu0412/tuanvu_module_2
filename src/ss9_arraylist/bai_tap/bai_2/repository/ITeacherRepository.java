package ss9_arraylist.bai_tap.bai_2.repository;

import ss9_arraylist.bai_tap.bai_2.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> getTeacherList();

    void addNewTeacher(Teacher teacher);

    boolean deteleTeacher(int id);
}
