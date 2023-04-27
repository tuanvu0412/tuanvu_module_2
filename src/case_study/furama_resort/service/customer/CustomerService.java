package case_study.furama_resort.service.customer;

import case_study.furama_resort.model.person.Customer;
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
        System.out.print("nhập số căn cước");
        String citizenIdentificationNumber = sc.nextLine();
        System.out.print("nhập số điện thoại");
        String phoneNumber = sc.nextLine();
        System.out.print("nhập email");
        String email = sc.nextLine();
        System.out.print("chọn level khách hàng");
        String customerLevel = null;
        boolean flag = true;
        do {
            System.out.println("---Customer Level----\n" +
                    "1. Diamond\n" +
                    "2. Platinum\n" +
                    "3. Gold\n" +
                    "4. Sivel\n" +
                    "5. Member\n" +
                    "Enter your choice ");
            int customerLevel1 = Integer.parseInt(sc.nextLine());
            switch (customerLevel1) {
                case 1:
                    flag=false;
                    customerLevel = "Diamond";
                    break;
                case 2:
                    flag=false;
                    customerLevel = "Platinum";
                    break;
                case 3:
                    flag=false;
                    customerLevel = "Gold";
                    break;
                case 4:
                    flag=false;
                    customerLevel = "Sivel";
                    break;
                case 5:
                    flag=false;
                    customerLevel = "member";
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
        System.out.print("nhập id muốn sửa");
        String editCustomer = sc.nextLine();
        int edit = customerRepository.findId(editCustomer);
        if (edit>=0) {
            System.out.print("nhập id mới của khách hàng");
            String id = sc.nextLine();
            customerRepository.getListCustomer().get(edit).setId(id);
            System.out.print("nhập tên mới của khách");
            String name = sc.nextLine();
            customerRepository.getListCustomer().get(edit).setName(name);
            System.out.print("nhập ngày tháng năm sinh");
            String dateOfBirth = sc.nextLine();
            customerRepository.getListCustomer().get(edit).setDateOfBirth(dateOfBirth);
            System.out.print("nhập lại giới tính");
            String gender = sc.nextLine();
            customerRepository.getListCustomer().get(edit).setGender(gender);
            System.out.print("nhập căn cước công dân hoặc passport");
            String citizenIdentificationNumber = sc.nextLine();
            customerRepository.getListCustomer().get(edit).setCitizenIdentificationNumber(citizenIdentificationNumber);
            System.out.print("nhập số điện thoại");
            String phoneNumber = sc.nextLine();
            customerRepository.getListCustomer().get(edit).setPhoneNumber(phoneNumber);
            System.out.print("nhập email");
            String email = sc.nextLine();
            customerRepository.getListCustomer().get(edit).setEmail(email);
            System.out.print("nhập level của khách hàng");
            String customerLevel = sc.nextLine();
            customerRepository.getListCustomer().get(edit).setCustomerLevel(customerLevel);
            System.out.print("nhập địa chỉ của khách hàng");
            String address = sc.nextLine();
            customerRepository.getListCustomer().get(edit).setAddress(address);
            System.out.println("đã được thay đổi");
        } else {
            System.out.println("id bạn nhập chưa đúng");
        }
    }
}
