package ss9_arraylist.bai_tap.bai_2.repository;

import ss9_arraylist.bai_tap.bai_2.model.Teacher;

import java.util.ArrayList;

public class TeacherRepository implements ITeacherRepository {
    static ArrayList<Teacher> teachers = new ArrayList<>();

    static {
        teachers.add(new Teacher("GV0001", "Ai đó", "01/01/1999", "nữ", "Gì đó"));
        teachers.add(new Teacher("GV0002", "Ai đó2", "02/02/1999", "nữ", "Gì đó2"));
        teachers.add(new Teacher("GV0003", "Ai đó3", "03/03/1999", "nữ", "Gì đó3"));
    }

    public void displayTeacherList() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
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


