package ss9_arraylist.bai_tap.bai_2.service;

import ss9_arraylist.bai_tap.bai_2.model.Student;
import ss9_arraylist.bai_tap.bai_2.repository.StudentRepositoryImpl;


import java.util.Scanner;

public class StudentServiceIplm implements IStudentService {
    Scanner sc = new Scanner(System.in);
    private StudentRepositoryImpl studentList = new StudentRepositoryImpl();

    @Override
    public void addStudentList() {
        studentList.displayStudentList();
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
        studentList.displayStudentList();
    }

    public void displayStudent() {

        studentList.displayStudentList();
    }

}


