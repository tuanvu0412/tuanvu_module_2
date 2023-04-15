package ss9_arraylist.bai_tap.bai_2.repository;


import ss9_arraylist.bai_tap.bai_2.model.Student;

import java.util.ArrayList;

public class StudentRepositoryImpl implements IStudentRepository {
    static ArrayList<Student> students = new ArrayList<>();

    static {
        students.add(new Student("HV0001", "Vũ1", "01/01/2000", "nam", "C0223G1", 10));
        students.add(new Student("HV0002", "Vũ2", "02/02/2002", "nam", "C0223G1", 9));
        students.add(new Student("HV0003", "Vũ3", "03/03/2001", "nam", "C0223G1", 8));
    }

    public void displayStudentList() {
        for (Student student : students) {
            System.out.println(student);
        }
    }



    @Override
    public void addListStudent(Student student) {

        students.add(student);

    }

    @Override
    public boolean deleteStudent(int id) {
        for (Student student : students) {
            if (student.getCode().equals(id)) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }
}
