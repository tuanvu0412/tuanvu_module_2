package ss11_map_tree.bai_tap.quan_ly_san_pham.service;

import ss11_map_tree.bai_tap.quan_ly_san_pham.model.Computer;
import ss11_map_tree.bai_tap.quan_ly_san_pham.model.Product;
import ss11_map_tree.bai_tap.quan_ly_san_pham.repository.ComputerRepositoryIplm;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ComputerServiceIpml implements IComputerIplm {
    Scanner sc = new Scanner(System.in);
    private ComputerRepositoryIplm computerList = new ComputerRepositoryIplm();

    public void addListComputer() {
        computerList.getComputerlist();
        System.out.println("nhập code");
        String code = sc.nextLine();
        System.out.println("nhập tên sản phẩm");
        String name = sc.nextLine();
        System.out.println("nhập ngày tháng sản xuất");
        String date = sc.nextLine();
        System.out.println("nhập tên công ty");
        String company = sc.nextLine();
        computerList.addComputerList(new Computer(code, name, date, company));

    }

    @Override
    public void editListComputer() {
        System.out.println("nhập code của sản phẩm muốn sửa");
        String editComputers = sc.nextLine();
        System.out.println("nhập code mới của sản phẩm");
        String code = sc.nextLine();
        System.out.println("nhập tên mới của sản phẩm");
        String name = sc.nextLine();
        System.out.println("nhập ngày tháng sản xuất mới của sản phẩm");
        String date = sc.nextLine();
        System.out.println("nhập tên công ty mới của sản phẩm");
        String company = sc.nextLine();
        Computer computer = new Computer(code, name, date, company);
        boolean isEdit = computerList.editComputer(editComputers, computer);
        if (isEdit) {
            System.out.println("sản phẩm của bạn đã sửa thành công");

        } else {
            System.out.println("sản phẩm của bạn chưa được sửa");
        }
    }


    @Override
    public void findComputer() {
        System.out.println("nhập tên sản phẩm bạn muốn tìm");
        String name1 = sc.nextLine();
        boolean find = computerList.findComputer(name1);
        if (find) {
            System.out.println("đây là sản phẩm của bạn đã tìm");
        } else {
            System.out.println("không có tên sản phẩm bạn muốn tìm");
        }

    }

    @Override
    public void deleteComputer() {
        System.out.println("nhập code sản phẩm mà bạn muốn xóa");
        String code1 = sc.nextLine();
        boolean detele = computerList.deleteComputer(code1);
        if (detele) {
            System.out.println("bạn đã xóa thành công");
        } else {
            System.out.println("sản phẩm chưa được xóa");
        }

    }

    @Override
    public void displayComputerList() {
        List<Computer> computer = computerList.getComputerlist();
        computer.sort(Comparator.comparing(Product::getCode));
        for (Computer C : computer) {
            System.out.println(C);
        }
    }


}
