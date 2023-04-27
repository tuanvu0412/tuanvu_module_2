package case_study.furama_resort.service.customer;

import case_study.furama_resort.model.person_model.Customer;
import case_study.furama_resort.repository.customer.CustomerRepositoryImpl;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    Scanner sc = new Scanner(System.in);
    CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();

    @Override
    public void displayCustomerList() {
        List<Customer> list = customerRepository.getListCustomer();
        for (Customer c : list) {
            if (c.getCustomerLevel() != null) {
                System.out.println(c + " ");
            }
        }
    }
    @Override
    public void add() {
        boolean flag = true;
        System.out.println("nhập id của khách");
        String id = sc.nextLine();
        System.out.println("nhập tên của khách");
        String name = sc.nextLine();
        System.out.println("nhập ngày tháng năm sinh");
        String dateOfBirth = sc.nextLine();
        System.out.println("nhập giới tính: 1 là nam, 2 là nữ, giới tính khác nhập bất kì");
        String male = sc.nextLine();
        if (male.equals("1")) {
            System.out.println("nam");
        } else if (male.equals("2")) {
            System.out.println("nữ");
        } else {
            System.out.println("giới tính khác");
        }
        System.out.println("nhập số căn cước");
        String citizenIdentificationNumber = sc.nextLine();
        System.out.println("nhập số điện thoại");
        String phoneNumber = sc.nextLine();
        System.out.println("nhập email");
        String email = sc.nextLine();
        System.out.println("chọn level khách hàng");
        String customerLevel = null;
        do {
            System.out.println("---Customer Level----\n" +
                    "1. Diamond\n" +
                    "2. Platinum\n" +
                    "3. Gold\n" +
                    "4. Sivel\n" +
                    "5. Member\n" +
                    "6. exit\n" +
                    "mời chọn: ");
            int customerLevel1 = Integer.parseInt(sc.nextLine());
            switch (customerLevel1) {
                case 1:
                    customerLevel = "Diamond";
                    break;
                case 2:
                    customerLevel = "Platinum";
                    break;
                case 3:
                    customerLevel = "Gold";
                    break;
                case 4:
                    customerLevel = "Sivel";
                    break;
                case 5:
                    customerLevel = "member";
                    break;
                case 6:
                    flag = false;
                    System.out.println("đã thoát");
                    break;
                default:
                    System.out.println("chọn chưa đúng");

            }
        } while (flag);
        System.out.println("nhập địa chỉ khách hàng");
        String address = sc.nextLine();
        customerRepository.add(new Customer(id, name, dateOfBirth, male, citizenIdentificationNumber, phoneNumber, email, customerLevel, address));
    }

    @Override
    public void editCustomerList() {
        System.out.println("nhập id muốn sửa");
        String editCustomer = sc.nextLine();
        System.out.println("nhập id mới của khách hàng");
        String id = sc.nextLine();
        System.out.println("nhập tên mới của khách");
        String name = sc.nextLine();
        System.out.println("nhập ngày tháng năm sinh");
        String dateOfBirth = sc.nextLine();
        System.out.println("nhập lại giới tính");
        String male = sc.nextLine();
        System.out.println("nhập căn cước công dân hoặc passport");
        String citizenIdentificationNumber = sc.nextLine();
        System.out.println("nhập số điện thoại");
        String phoneNumber = sc.nextLine();
        System.out.println("nhập email");
        String email = sc.nextLine();
        System.out.println("nhập level của khách hàng");
        String customerLevel = sc.nextLine();
        System.out.println("nhập địa chỉ của khách hàng");
        String address = sc.nextLine();
        boolean edit = customerRepository.editCustomerList(editCustomer, id, name, dateOfBirth, male, citizenIdentificationNumber, phoneNumber, email, customerLevel, address);
        if (edit) {
            System.out.println("đã được thay đổi");
        } else {
            System.out.println("id bạn nhập chưa đúng");
        }
    }
}
