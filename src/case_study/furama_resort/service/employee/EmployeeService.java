package case_study.furama_resort.service.employee;

import case_study.furama_resort.model.person_model.Employee;
import case_study.furama_resort.repository.employee.EmployeeRepositoryImpl;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner sc = new Scanner(System.in);
    EmployeeRepositoryImpl employeeRepository = new EmployeeRepositoryImpl();


    @Override
    public void displayEmployeeList() {
        List<Employee> list = employeeRepository.getListEmployee();
        for (Employee e : list) {
            System.out.println(e.getLevel());
            System.out.println(e.getPosition());
            if (e.getLevel() != null || e.getPosition() != null) {
                System.out.println(e + " ");
            }
        }
    }
    @Override
    public void addNewEmployee() {
        System.out.println("nhập id nhân viên");
        String id = sc.nextLine();
        System.out.println("nhập tên nhân viên");
        String name = sc.nextLine();
        System.out.println("nhập ngày tháng năm sinh của nhân viên");
        String dateOfBirth = sc.nextLine();
        System.out.println("nhập giới tính, 1 là nam,2 là nữ, giới tính khác bấm bất kì");
        String male = sc.nextLine();
        if (male.equals("1")) {
            System.out.println("nam");
        } else if (male.equals("2")) {
            System.out.println("nữ");
        } else {
            System.out.println("giới tính khác");
        }
        System.out.println("nhập số căn cước công dân hoặc CMND");
        String citizenIdentificationNumber = sc.nextLine();
        System.out.println("nhập số điện thoại");
        String phoneNumber = sc.nextLine();
        System.out.println("nhập email");
        String email = sc.nextLine();
        System.out.println("nhập trình độ chuyên môn");
        String level = null;
        boolean flag = true;
        do {
            System.out.println("---Trình độ chuyên môn---\n" +
                    "1. trung cấp\n" +
                    "2. cao đẳng\n" +
                    "3. đại học\n" +
                    "4. sau đại học\n" +
                    "5. exit\n" +
                    "chọn trình độ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    level = "trung cấp";
                    break;
                case 2:
                    level = "cao đẳng";
                    break;
                case 3:
                    level = "đại học";
                    break;
                case 4:
                    level = "sau đại học";
                    break;
                case 5:
                    flag = false;
                    System.out.println("đã thoát khỏi");
                    break;
                default:
                    System.out.println("bạn nhập chưa đúng");
            }
        } while (flag);
        System.out.println("nhập chức vụ");
        String position = null;
        boolean flag1= true;
        do {
            System.out.println("---Chức Vụ Nhân Viên---\n" +
                    "1. Lễ Tân\n" +
                    "2. Phục vụ\n" +
                    "3. Chuyên viên\n" +
                    "4. Giám sát\n" +
                    "5. Quản lý\n" +
                    "6. Giám đốc\n" +
                    "7. exit menu");
            System.out.println("mời bạn nhập chức vụ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                   position="Lễ Tân";
                    break;
                case 2:
                    position=" Phục vụ";
                    break;
                case 3:
                    position="Chuyên viên";
                    break;
                case 4:
                    position="Giám sát";
                    break;
                case 5:
                    position="Quản lý";
                    break;
                case 6:
                    position="Giám đốc";
                    break;
                case 7:
                    flag1 = false;
                    System.out.println("đã thoát");
                    break;
                default:
                    System.out.println("bạn chọn chưa đúng chức vụ");
            }
        } while (flag1);
        System.out.println("mời bạn nhập mức lương");
        String salary = sc.nextLine();
        employeeRepository.add(new Employee(id, name, dateOfBirth, male, citizenIdentificationNumber, phoneNumber, email, level, position, salary));
    }

    @Override
    public void editEmployeeList() {
        System.out.println("nhập id mà bạn muốn sửa");
        String editEmployee = sc.nextLine();
        System.out.println("nhập id mới");
        String id = sc.nextLine();
        System.out.println("nhập tên mới");
        String name = sc.nextLine();
        System.out.println("nhập ngày tháng năm sinh");
        String dateOfBirth = sc.nextLine();
        System.out.println("nhập giới tính");
        String male = sc.nextLine();
        System.out.println("nhập số căn cước công dân");
        String citizenIdentificationNumber = sc.nextLine();
        System.out.println("nhập số điện thoại");
        String phoneNumber = sc.nextLine();
        System.out.println("nhập email");
        String email = sc.nextLine();
        System.out.println("nhập trình độ chuyên môn");
        String level = sc.nextLine();
        System.out.println("nhập chức vụ");
        String position = sc.nextLine();
        System.out.println("nhập mức lương");
        String salary = sc.nextLine();
        boolean edit = employeeRepository.editEmployeeList(editEmployee, id, name, dateOfBirth, male, citizenIdentificationNumber, phoneNumber, email, level, position, salary);
        if (edit) {
            System.out.println("bạn đã sửa thành công");
        } else {
            System.out.println("id nhân viên bạn nhập không có");
        }
    }
}
