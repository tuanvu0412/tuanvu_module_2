package ss9_arraylist.bai_tap.bai_2.service;

import ss9_arraylist.bai_tap.bai_2.model.Student;
import ss9_arraylist.bai_tap.bai_2.repository.StudentRepositoryImpl;


import java.util.Scanner;

public class StudentServiceIplm implements IStudentService {
    Scanner sc = new Scanner(System.in);
    private StudentRepositoryImpl studentList = new StudentRepositoryImpl();

    @Override
    public void addStudentList() {
        studentList.getStudentList();
        System.out.println("nhập mã");
        String code = sc.nextLine();
        System.out.println("nhập tên");
        String name = sc.nextLine();
        System.out.println("nhập năm sinh");
        String date = sc.nextLine();
        System.out.println("nhập giới tính");
        String sex = sc.nextLine();
        System.out.println("nhập lớp");
        String classes = sc.nextLine();
        System.out.println("nhập điểm");
        Integer score = Integer.parseInt(sc.nextLine());
        studentList.addListStudent(new Student(code, name, date, sex, classes, score));

    }

    @Override
    public void deteleStudent() {
        studentList.getStudentList();
        System.out.println("nhập id hoc viên mà bạn muốn xóa");
        int id1 = Integer.parseInt(sc.nextLine());
        boolean delete = studentList.deleteStudent(id1);
        if (delete) {
            System.out.println("bạn đã xóa thành công");
        } else {
            System.out.println("không tìm thấy id ");
        }
    }

    public void displayStudent() {
        studentList.getStudentList();
    }

}


