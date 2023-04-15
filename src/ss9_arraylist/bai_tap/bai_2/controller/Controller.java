package ss9_arraylist.bai_tap.bai_2.controller;

import ss9_arraylist.bai_tap.bai_2.repository.TeacherRepository;
import ss9_arraylist.bai_tap.bai_2.service.StudentServiceIplm;
import ss9_arraylist.bai_tap.bai_2.service.TeacherServiceIplm;

import java.util.Scanner;

public class Controller {

    StudentServiceIplm studentService = new StudentServiceIplm();
    TeacherServiceIplm teacherService = new TeacherServiceIplm();

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        do {
            System.out.println("----Quản Lý Học Viên------");
            System.out.println("1.Thêm mới giảng viên hoặc học viên");
            System.out.println("2.Xóa giảng viên hoặc học viên");
            System.out.println("3.Hiện thị danh sách giảng viên hoặc học viên");
            System.out.println("4.Thoát");
            String select;
            System.out.println("Chọn chức năng: ");
            select = sc.nextLine();
            switch (select) {
                case "1":
                    System.out.println("bấm '1' để thêm học viên, '2' để thêm giảng viên");
                    String choose = sc.nextLine();
                    if (choose.equals("1")) {
                        studentService.addStudentList();

                    } else if (choose.equals("2")) {
                        teacherService.addTeacherList();
                    } else {
                        System.out.println("nhập sai");
                    }
                    break;
                case "2":
                    System.out.println("bấm '1' để xóa học viên, '2' để xóa giảng viên");
                    String choose1 = sc.nextLine();
                    if (choose1.equals("1")) {
                        studentService.deteleStudent();
                    } else if (choose1.equals("2")) {
                        teacherService.deteleTeacher();
                    }
                    break;
                case "3":
                    System.out.println("bấm '1' để hiện thị học viên, '2' để hiển thị giảng viên");
                    String choose2 = sc.nextLine();
                    if (choose2.equals("1")) {
                        studentService.displayStudent();
                    } else if (choose2.equals("2")) {
                        teacherService.displayTeacher();
                    }
                    break;
                case "4":
                    flag = true;
                    break;
                default:
                    System.out.println("bạn đã nhập sai");
            }
        } while (flag);
        System.out.println("đã thoát khỏi menu");
    }

}

