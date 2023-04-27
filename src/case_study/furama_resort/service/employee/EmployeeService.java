package case_study.furama_resort.service.employee;

import case_study.furama_resort.model.person.Employee;
import case_study.furama_resort.repository.employee.EmployeeRepositoryImpl;
import case_study.furama_resort.utils.employee.RegexEmployee;

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
        String id;
        do {
            System.out.print("nhập id nhân viên: ");
            id = sc.nextLine();
            if (RegexEmployee.checkIdEmployee(id)) {
                System.out.print("thêm mã thành công.\n");
            } else {
                System.err.print("nhập mã sai định dạng.");
            }
        } while (!RegexEmployee.checkIdEmployee(id));
        String name;
        do {
            System.out.print("nhập tên nhân viên: ");
            name = sc.nextLine();
            if (RegexEmployee.checkNameEmployee(name)) {
                System.out.print("thêm tên nhân viên thành công.\n");
            } else {
                System.err.print("nhập tên sai định dạng.");
            }
        } while (!RegexEmployee.checkNameEmployee(name));
        String dateOfBirth;
        do {
            System.out.print("nhập ngày tháng năm sinh của nhân viên: ");
            dateOfBirth = sc.nextLine();
            if (RegexEmployee.checkDateOfBirth(dateOfBirth)) {
                System.out.print("thêm ngày tháng của nhân viên thành công.\n");
            } else {
                System.err.print("nhập ngày tháng không đúng định dạng, mời bạn nhập lại.");
            }
        } while (!RegexEmployee.checkDateOfBirth(dateOfBirth));
        String gender;
        do {
            System.out.print("nhập giới tính, 1 là nam,2 là nữ, 3 là giới tính khác: ");
            gender = sc.nextLine();
            if (gender.equals("1")) {
                System.out.print("nam.\n");
            } else if (gender.equals("2")) {
                System.out.print("nữ.\n");
            } else if (gender.equals("3")) {
                System.out.print("giới tính khác.\n");
            }
        } while (!gender.equals(gender));
        String citizenIdentificationNumber;
        do {
            System.out.print("nhập số căn cước công dân hoặc CMND: ");
            citizenIdentificationNumber = sc.nextLine();
            if (RegexEmployee.checkCitizenIdentificationNumber(citizenIdentificationNumber)) {
                System.out.println("thêm sô căn cước thành công.\n");
            } else {
                System.err.println("nhập số căn cước không đúng định dạng.");
            }
        } while (!RegexEmployee.checkCitizenIdentificationNumber(citizenIdentificationNumber));
        String phoneNumber;
        do {
            System.out.print("nhập số điện thoại: ");
            phoneNumber = sc.nextLine();
            if (RegexEmployee.checkPhoneNumber(phoneNumber)) {
                System.out.println("thêm số điện thoại thành công.\n");
            } else {
                System.err.println("nhập số điện thoại chưa đúng định dạng. ");
            }
        } while (!RegexEmployee.checkPhoneNumber(phoneNumber));
        System.out.print("nhập email: ");
        String email = sc.nextLine();
        System.out.print("nhập trình độ chuyên môn: ");
        String level = null;
        boolean flag = true;
        do {
            System.out.println("---Trình độ chuyên môn---\n" +
                    "1. trung cấp\n" +
                    "2. cao đẳng\n" +
                    "3. đại học\n" +
                    "4. sau đại học\n" +
                    "5. exit\n" +
                    "chọn trình độ: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    flag = false;
                    level = "trung cấp.";
                    break;
                case 2:
                    flag = false;
                    level = "cao đẳng.";
                    break;
                case 3:
                    flag = false;
                    level = "đại học.";
                    break;
                case 4:
                    flag = false;
                    level = "sau đại học.";
                    break;
                default:
                    System.err.println("bạn nhập chưa đúng.");
            }
        } while (flag);
        System.out.print("nhập chức vụ: ");
        String position = null;
        boolean flag1 = true;
        do {
            System.out.println("---Chức Vụ Nhân Viên---\n" +
                    "1. Lễ Tân\n" +
                    "2. Phục vụ\n" +
                    "3. Chuyên viên\n" +
                    "4. Giám sát\n" +
                    "5. Quản lý\n" +
                    "6. Giám đốc\n" +
                    "7. Exit menu");
            System.out.print("mời bạn nhập chức vụ: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    position = "Lễ Tân.";
                    flag1 = false;
                    break;
                case 2:
                    position = " Phục vụ.";
                    flag1 = false;
                    break;
                case 3:
                    position = "Chuyên viên.";
                    flag1 = false;
                    break;
                case 4:
                    position = "Giám sát.";
                    flag1 = false;
                    break;
                case 5:
                    position = "Quản lý.";
                    flag1 = false;
                    break;
                case 6:
                    position = "Giám đốc.";
                    flag1 = false;
                    break;
                default:
                    System.err.println("bạn chọn chưa đúng chức vụ.");
            }
        } while (flag1);
        int salary;
        do {
            System.out.print("mời bạn nhập mức lương: ");
            salary = Integer.parseInt(sc.nextLine());
        } while (salary <= 0);
        employeeRepository.add(new Employee(id, name, dateOfBirth, gender, citizenIdentificationNumber, phoneNumber, email, level, position, String.valueOf(salary)));
    }

    @Override
    public void editEmployeeList() {
        System.out.print("nhập id mà bạn muốn sửa: ");
        String editEmployee = sc.nextLine();
        int edit = employeeRepository.checkId(editEmployee);
        if (edit >= 0) {
            String id;
            do {
                System.out.print("nhập id mới: ");
                id = sc.nextLine();
                if (RegexEmployee.checkIdEmployee(id)) {
                    System.out.println("đã sửa id thành công.\n");
                } else {
                    System.err.println(" nhập chưa đúng,mời bạn nhập lại.");
                }
            } while (!RegexEmployee.checkIdEmployee(id));
            employeeRepository.getListEmployee().get(edit).setId(id);
            employeeRepository.editEmployeeList();
            String name;
            do {
                System.out.print("nhập tên mới: ");
                name = sc.nextLine();
                if (RegexEmployee.checkNameEmployee(name)) {
                    System.out.println("đã sửa tên thành công.\n");
                } else {
                    System.err.println("nhập chưa đúng,mời bạn nhập lại.");
                }
            } while (!RegexEmployee.checkNameEmployee(name));
            employeeRepository.getListEmployee().get(edit).setName(name);
            employeeRepository.editEmployeeList();
            String dateOfBirth;
            do {
                System.out.print("nhập ngày tháng năm sinh: ");
                dateOfBirth = sc.nextLine();
                if (RegexEmployee.checkDateOfBirth(dateOfBirth)) {
                    System.out.println("đã sửa ngày tháng năm sinh thành công.\n");
                } else {
                    System.err.println("nhập chưa đúng, mời bạn nhập lại.");
                }
            } while (!RegexEmployee.checkDateOfBirth(dateOfBirth));
            employeeRepository.getListEmployee().get(edit).setDateOfBirth(dateOfBirth);
            employeeRepository.editEmployeeList();
            System.out.print("Enter gender for employee, choice 1 is man, choice 2 is girl, choice 3 is different gender");
            String gender = sc.nextLine();
            if (gender.equals("1")) {
                System.out.println("man\n");
            } else if (gender.equals("2")) {
                System.out.println("girl\n");
            } else if (gender.equals("3")) {
                System.out.println("different gender\n");
            }
            employeeRepository.getListEmployee().get(edit).setGender(gender);
            employeeRepository.editEmployeeList();
            String citizenIdentificationNumber;
            do {
                System.out.print("nhập số căn cước công dân: ");
                citizenIdentificationNumber = sc.nextLine();
                if (RegexEmployee.checkCitizenIdentificationNumber(citizenIdentificationNumber)) {
                    System.out.println("đã sửa thành công.\n");
                } else {
                    System.err.println("chưa đúng định dạng, mời bạn nhập lại.");
                }
            } while (!RegexEmployee.checkCitizenIdentificationNumber(citizenIdentificationNumber));
            employeeRepository.getListEmployee().get(edit).setCitizenIdentificationNumber(citizenIdentificationNumber);
            employeeRepository.editEmployeeList();
            String phoneNumber;
            do {
                System.out.print("nhập số điện thoại: ");
                phoneNumber = sc.nextLine();
                if (RegexEmployee.checkPhoneNumber(phoneNumber)) {
                    System.out.println("bạn đã sửa thành công.\n");
                } else {
                    System.err.println("nhập chưa đúng định dạng, mời bạn nhập lại.");
                }
            } while (!RegexEmployee.checkPhoneNumber(phoneNumber));
            employeeRepository.getListEmployee().get(edit).setPhoneNumber(phoneNumber);
            employeeRepository.editEmployeeList();
            System.out.print("nhập email: ");
            String email = sc.nextLine();
            employeeRepository.getListEmployee().get(edit).setEmail(email);
            employeeRepository.editEmployeeList();
            System.out.println("nhập trình độ chuyên môn: ");
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
                        flag = false;
                        level = "trung cấp.";
                        break;
                    case 2:
                        flag = false;
                        level = "cao đẳng.";
                        break;
                    case 3:
                        flag = false;
                        level = "đại học.";
                        break;
                    case 4:
                        flag = false;
                        level = "sau đại học.";
                        break;
                    default:
                        System.err.println("bạn nhập chưa đúng.");
                }
            } while (flag);
            employeeRepository.getListEmployee().get(edit).setLevel(level);
            employeeRepository.editEmployeeList();
            System.out.println("nhập chức vụ: ");
            String position = null;
            boolean flag1 = true;
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
                        position = "Lễ Tân.";
                        flag1 = false;
                        break;
                    case 2:
                        position = " Phục vụ.";
                        flag1 = false;
                        break;
                    case 3:
                        position = "Chuyên viên.";
                        flag1 = false;
                        break;
                    case 4:
                        position = "Giám sát.";
                        flag1 = false;
                        break;
                    case 5:
                        position = "Quản lý.";
                        flag1 = false;
                        break;
                    case 6:
                        position = "Giám đốc.";
                        flag1 = false;
                        break;
                    default:
                        System.err.println("bạn chọn chưa đúng chức vụ.");
                }
            } while (flag1);
            employeeRepository.getListEmployee().get(edit).setPosition(position);
            employeeRepository.editEmployeeList();
            int salary;
            do {
                System.out.print("nhập mức lương: ");
                salary = Integer.parseInt(sc.nextLine());
            } while (salary <= 0);
            employeeRepository.getListEmployee().get(edit).setSalary(String.valueOf(salary));
            employeeRepository.editEmployeeList();
            System.out.print("bạn đã sửa thành công.\n");
        } else {
            System.err.println("id nhân viên bạn nhập không có.");
        }
    }
}
