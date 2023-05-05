package case_study.furama_resort.controller;

import case_study.furama_resort.service.booking.BookingService;
import case_study.furama_resort.service.contract.ContactService;
import case_study.furama_resort.service.facility.FacilityService;

import java.util.Scanner;

public class BookingController {
    public void bookingManagement() {
        BookingService bookingService = new BookingService();
        ContactService contactService = new ContactService();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu");
            System.out.println("mời bạn chọn");
            int choice4 = 0;
            try {
                choice4 = Integer.parseInt(sc.nextLine());
                if (choice4 < 1 || choice4 > 6){
                    throw new Exception("chỉ được nhập từ 1 tới 6");
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập không đúng định dạng!!");
            } catch (Exception e) {
                e.printStackTrace();
            }
            switch (choice4) {
                case 1:
                    bookingService.add();
                    break;
                case 2:
                    bookingService.display();
                    break;
                case 3:
                    contactService.add();
                    break;
                case 4:
                    contactService.displayContact();
                    break;
                case 5:
                    contactService.editContact();
                    break;
                case 6:
                    flag = false;
                    System.out.println("đã thoát");
                    break;
                default:
                    System.out.println("bạn đã chọn sai");
            }
        } while (flag);
    }
}
