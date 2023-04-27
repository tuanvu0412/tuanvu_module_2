package case_study.furama_resort.service.employee;

import case_study.furama_resort.model.person_model.Employee;
import case_study.furama_resort.repository.employee.EmployeeRepositoryImpl;
import case_study.furama_resort.utils.employee.Regex;

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
            System.out.println("nhập id nhân viên");
            id = sc.nextLine();
            if (Regex.checkIdEmployee(id)) {
                System.out.println("thêm mã thành công");
            } else {
                System.out.println("nhập mã sai định dạng");
            }
        } while (!Regex.checkIdEmployee(id));
        String name;
        do {
            System.out.println("nhập tên nhân viên");
            name = sc.nextLine();
            if (Regex.checkNameEmployee(name)) {
                System.out.println("thêm tên nhân viên thành công");
            } else {
                System.out.println("nhập tên sai định dạng");
            }
        } while (!Regex.checkNameEmployee(name));
        String dateOfBirth;
        do {
            System.out.println("nhập ngày tháng năm sinh của nhân viên");
            dateOfBirth = sc.nextLine();
            if (Regex.checkDateOfBirth(dateOfBirth)) {
                System.out.println("thêm ngày tháng của nhân viên thành công");
            } else {
                System.out.println("nhập ngày tháng không đúng định dạng");
            }
        } while (!Regex.checkDateOfBirth(dateOfBirth));
        String gender;
        do {
            System.out.println("nhập giới tính, 1 là nam,2 là nữ, 3 là giới tính khác");
            gender = sc.nextLine();
            if (gender.equals("1")) {
                System.out.println("nam");
            } else if (gender.equals("2")) {
                System.out.println("nữ");
            } else if (gender.equals("3")) {
                System.out.println("giới tính khác");
            }
        } while (!gender.equals(gender));
        String citizenIdentificationNumber;
        do {
            System.out.println("nhập số căn cước công dân hoặc CMND");
            citizenIdentificationNumber = sc.nextLine();
            if (Regex.checkCitizenIdentificationNumber(citizenIdentificationNumber)) {
                System.out.println("thêm sô căn cước thành công");
            } else {
                System.out.println("nhập số căn cước không đúng định dạng");
            }
        } while (!Regex.checkCitizenIdentificationNumber(citizenIdentificationNumber));
        String phoneNumber;
        do {
            System.out.println("nhập số điện thoại");
            phoneNumber = sc.nextLine();
            if (Regex.checkPhoneNumber(phoneNumber)) {
                System.out.println("thêm số điện thoại thành công");
            } else {
                System.out.println("nhập số điện thoại chưa đúng định dạng");
            }
        } while (!Regex.checkPhoneNumber(phoneNumber));
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
                    flag = false;
                    level = "trung cấp";
                    break;
                case 2:
                    flag = false;
                    level = "cao đẳng";
                    break;
                case 3:
                    flag = false;
                    level = "đại học";
                    break;
                case 4:
                    flag = false;
                    level = "sau đại học";
                    break;
                default:
                    System.out.println("bạn nhập chưa đúng");
            }
        } while (flag);
        System.out.println("nhập chức vụ");
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
                    position = "Lễ Tân";
                    flag1 = false;
                    break;
                case 2:
                    position = " Phục vụ";
                    flag1 = false;
                    break;
                case 3:
                    position = "Chuyên viên";
                    flag1 = false;
                    break;
                case 4:
                    position = "Giám sát";
                    flag1 = false;
                    break;
                case 5:
                    position = "Quản lý";
                    flag1 = false;
                    break;
                case 6:
                    position = "Giám đốc";
                    flag1 = false;
                    break;
                default:
                    System.out.println("bạn chọn chưa đúng chức vụ");
            }
        } while (flag1);
        String salary;
        do {
            System.out.println("mời bạn nhập mức lương");
            salary = sc.nextLine();
        } while (!salary.equals(0));
        employeeRepository.add(new Employee(id, name, dateOfBirth, gender, citizenIdentificationNumber, phoneNumber, email, level, position, salary));
    }

    @Override
    public void editEmployeeList() {
        System.out.println("nhập id mà bạn muốn sửa");
        String editEmployee = sc.nextLine();
        int edit = employeeRepository.checkId(editEmployee);
        if (edit >= 0) {
            String id;
            do {
                System.out.print("Enter new ID");
                id = sc.nextLine();
                if (Regex.checkIdEmployee(id)) {
                    System.out.println("đã sửa id thành công");
                } else {
                    System.out.println(" nhập chưa đúng,mời bạn nhập lại");
                }
            } while (!Regex.checkIdEmployee(id));
            employeeRepository.getListEmployee().get(edit).setId(id);
            employeeRepository.editEmployeeList();
            String name;
            do {
                System.out.print("Enter new name");
                name = sc.nextLine();
                if (Regex.checkNameEmployee(name)) {
                    System.out.println("đã sửa tên thành công");
                } else {
                    System.out.println("nhập chưa đúng,mời bạn nhập lại");
                }
            } while (!Regex.checkNameEmployee(name));
            employeeRepository.getListEmployee().get(edit).setName(name);
            employeeRepository.editEmployeeList();
            String dateOfBirth;
            do {
                System.out.print("Enter new dateOfBirth");
                dateOfBirth = sc.nextLine();
                if (!Regex.checkDateOfBirth(dateOfBirth)) {
                    System.out.println("đã sửa ngày tháng năm sinh thành công");
                } else {
                    System.out.println("nhập chưa đúng, mời bạn nhập lại");
                }
            } while (!Regex.checkDateOfBirth(dateOfBirth));
            employeeRepository.getListEmployee().get(edit).setDateOfBirth(dateOfBirth);
            employeeRepository.editEmployeeList();
            System.out.print("Enter gender for employee, choice 1 is man, choice 2 is girl, choice 3 is different gender");
            String gender = sc.nextLine();
            if (gender.equals("1")) {
                System.out.println("man");
            } else if (gender.equals("2")) {
                System.out.println("girl");
            } else if (gender.equals("3")) {
                System.out.println("different gender");
            }
            employeeRepository.getListEmployee().get(edit).setGender(gender);
            employeeRepository.editEmployeeList();
            String citizenIdentificationNumber;
            do {
                System.out.print("Enter citizenIdentificationNumber");
                citizenIdentificationNumber = sc.nextLine();
                if (Regex.checkCitizenIdentificationNumber(citizenIdentificationNumber)) {
                    System.out.println("đã sửa thành công");
                } else {
                    System.out.println("chưa đúng định dạng, mời bạn nhập lại");
                }
            } while (!Regex.checkCitizenIdentificationNumber(citizenIdentificationNumber));
            employeeRepository.getListEmployee().get(edit).setCitizenIdentificationNumber(citizenIdentificationNumber);
            employeeRepository.editEmployeeList();
            String phoneNumber;
            do {
                System.out.print("nhập số điện thoại");
                phoneNumber = sc.nextLine();
                if (Regex.checkPhoneNumber(phoneNumber)) {
                    System.out.println("bạn đã sửa thành công");
                } else {
                    System.out.println("nhập chưa đúng định dạng, mời bạn nhập lại");
                }
            } while (!Regex.checkPhoneNumber(phoneNumber));
            employeeRepository.getListEmployee().get(edit).setPhoneNumber(phoneNumber);
            employeeRepository.editEmployeeList();
            System.out.print("nhập email");
            String email = sc.nextLine();
            employeeRepository.getListEmployee().get(edit).setEmail(email);
            employeeRepository.editEmployeeList();
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
                        flag = false;
                        level = "trung cấp";
                        break;
                    case 2:
                        flag = false;
                        level = "cao đẳng";
                        break;
                    case 3:
                        flag = false;
                        level = "đại học";
                        break;
                    case 4:
                        flag = false;
                        level = "sau đại học";
                        break;
                    default:
                        System.out.println("bạn nhập chưa đúng");
                }
            } while (flag);
            employeeRepository.getListEmployee().get(edit).setLevel(level);
            employeeRepository.editEmployeeList();
            System.out.println("nhập chức vụ");
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
                        position = "Lễ Tân";
                        flag1 = false;
                        break;
                    case 2:
                        position = " Phục vụ";
                        flag1 = false;
                        break;
                    case 3:
                        position = "Chuyên viên";
                        flag1 = false;
                        break;
                    case 4:
                        position = "Giám sát";
                        flag1 = false;
                        break;
                    case 5:
                        position = "Quản lý";
                        flag1 = false;
                        break;
                    case 6:
                        position = "Giám đốc";
                        flag1 = false;
                        break;
                    default:
                        System.out.println("bạn chọn chưa đúng chức vụ");
                }
            } while (flag1);
            employeeRepository.getListEmployee().get(edit).setPosition(position);
            employeeRepository.editEmployeeList();
            System.out.print("nhập mức lương");
            String salary = sc.nextLine();
            employeeRepository.getListEmployee().get(edit).setSalary(salary);
            employeeRepository.editEmployeeList();
            System.out.print("bạn đã sửa thành công");
        } else {
            System.out.println("id nhân viên bạn nhập không có");
        }
    }
}
