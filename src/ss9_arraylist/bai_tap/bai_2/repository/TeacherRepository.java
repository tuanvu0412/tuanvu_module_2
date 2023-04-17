package ss9_arraylist.bai_tap.bai_2.repository;

import ss9_arraylist.bai_tap.bai_2.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    static ArrayList<Teacher> teachers = new ArrayList<>();

    static {
        teachers.add(new Teacher("GV0001", "Eva", "01/01/1999", "nữ", "Somethings"));
        teachers.add(new Teacher("GV0002", "Thomas", "02/02/1999", "nam", "something2"));
        teachers.add(new Teacher("GV0003", "Aci", "03/03/1999", "nữ", "something3"));
    }

    @Override
    public List<Teacher> getTeacherList() {
        return teachers;
    }

    @Override
    public void addNewTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public boolean deteleTeacher(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getCode().equals(id)) {
                teachers.remove(teacher);
                return true;
            }
        }
        return false;
    }
}


