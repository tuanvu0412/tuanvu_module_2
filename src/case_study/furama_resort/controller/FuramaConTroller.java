package case_study.furama_resort.controller;


import java.util.Scanner;

public class FuramaConTroller {


    public void displayMenu() {
        EmployeeController employeeController = new EmployeeController();
        CustomerController customerController = new CustomerController();
        FacilityController facilityController = new FacilityController();
        BookingController bookingController = new BookingController();
        PromotionController promotionController = new PromotionController();

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("-----Quản Lý Resort Furama-----\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Managerment\n" +
                    "5. Promotion Managerment\n" +
                    "6. Exit Menu");
            System.out.println("mời bạn chọn menu");
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice <= 0 || choice > 6) {
                    throw new Exception("Chỉ được nhập từ 1 tới 6!!");
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập không đúng định dạng!!");
            } catch (Exception e) {
                System.err.println(e);
            }
            switch (choice) {
                case 1:
                    employeeController.employeeManagement();
                    break;
                case 2:
                    customerController.customerManagement();
                    break;
                case 3:
                    facilityController.facilityManagement();
                    break;
                case 4:
                    bookingController.bookingManagement();
                    break;
                case 5:
                    promotionController.promotionManagement();
                    break;
                case 6:
                    flag = false;
                    System.out.println("đã thoát khỏi menu");
                    break;
                default:
                    System.out.println("bạn nhập đã sai");
            }
        } while (flag);
    }
}
