package ss11_map_tree.bai_tap.quan_ly_san_pham.controller;

import ss11_map_tree.bai_tap.quan_ly_san_pham.service.ComputerServiceIpml;

import java.util.Scanner;

public class Controller1 {
    ComputerServiceIpml computerServiceIpml = new ComputerServiceIpml();

    public void disPlayMenu() {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        do {
            System.out.println("---------Quản lý sản phẩm--------\n" +
                    "1. thêm mới sản phẩm\n" +
                    "2. chỉnh sửa sản phẩm\n" +
                    "3. xóa sản phẩm\n" +
                    "4. tìm sản phẩm\n" +
                    "5. hiển thị danh sách\n" +
                    "6. thoát khỏi menu");
            System.out.println("chọn chức năng");
            int choice;
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    computerServiceIpml.addListComputer();
                    break;
                case 2:
                    computerServiceIpml.editListComputer();
                    break;
                case 3:
                    computerServiceIpml.deleteComputer();
                    break;
                case 4:
                    computerServiceIpml.findComputer();
                    break;
                case 5:
                    computerServiceIpml.displayComputerList();
                    break;
                case 6:
                    flag = true;
                    System.out.println("đã thoát khỏi menu");
                    break;
                default:
                    System.out.println("bạn đã nhập sai");
            }
        } while (flag);
    }
}



