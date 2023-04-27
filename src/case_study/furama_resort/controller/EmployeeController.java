package case_study.furama_resort.controller;

import case_study.furama_resort.service.employee.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    public void employeeManagement() {
        EmployeeService employeeService = new EmployeeService();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu");
            System.out.println("mời bạn chọn menu");
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice <= 0 || choice > 4) {
                    throw new Exception("Chỉ được nhập từ 1 tới 4.");
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập không đúng định dạng.");
            } catch (Exception e) {
                System.err.println(e);
            }
            switch (choice) {
                case 1:
                    employeeService.displayEmployeeList();
                    break;
                case 2:
                    employeeService.addNewEmployee();
                    break;
                case 3:
                    employeeService.editEmployeeList();
                    break;
                case 4:
                    flag = false;
                    System.out.println("đã thoát");
                    break;
                default:
                    System.out.println("bạn đã chọn sai");
            }
        } while (flag);
    }
}
