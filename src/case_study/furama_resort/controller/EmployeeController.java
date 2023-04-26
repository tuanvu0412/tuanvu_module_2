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
            String choice1 = sc.nextLine();
            switch (choice1) {
                case "1":
                    employeeService.displayEmployeeList();
                    break;
                case "2":
                    employeeService.addNewEmployee();
                    break;
                case "3":
                    employeeService.editEmployeeList();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("bạn đã chọn sai");
            }
        } while (flag);
    }
}
