package ss9_arraylist.bai_tap.bai_2.service;

import ss9_arraylist.bai_tap.bai_2.model.Teacher;
import ss9_arraylist.bai_tap.bai_2.repository.TeacherRepository;

import java.util.Scanner;

public class TeacherServiceIplm implements ITeacherService {
    Scanner sc = new Scanner(System.in);
    private TeacherRepository teacherRepository = new TeacherRepository();


    @Override
    public void addTeacherList() {
        System.out.println("nhập mã");
        String code = sc.nextLine();
        System.out.println("nhập tên");
        String name = sc.nextLine();
        System.out.println("nhập năm sinh");
        String date = sc.nextLine();
        System.out.println("nhập giới tính");
        String sex = sc.nextLine();
        String specialize = sc.nextLine();
        teacherRepository.addNewTeacher(new Teacher(code, name, date, sex, specialize));
    }

    @Override
    public void deteleTeacher() {
        this.displayTeacher();
        System.out.println("nhập id giáo viên mà bạn muốn xóa");
        int id1 = Integer.parseInt(sc.nextLine());
        boolean delete = teacherRepository.deteleTeacher(id1);
        if (delete) {
            System.out.println("bạn đã xóa thành công");
        } else {
            System.out.println("không tìm thấy id ");
        }
    }

    @Override
    public void displayTeacher() {
        teacherRepository.displayTeacherList();
    }


}
