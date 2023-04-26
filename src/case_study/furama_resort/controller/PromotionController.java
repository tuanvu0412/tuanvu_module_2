package case_study.furama_resort.controller;

import case_study.furama_resort.service.booking.promotion.PromotionService;

import java.util.Scanner;

public class PromotionController {
        PromotionService promotionService= new PromotionService();
        public void promotionManagement() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu");
            System.out.println("mời bạn chọn");
            String choice5 = sc.nextLine();
            switch (choice5) {
                case "1":
                    promotionService.displayCustomerGetService();
                    break;
                case "2":
                    promotionService.disPlayCustomerGetVoucher();
                    break;
                case "3":
                    flag=false;
                    break;
                default:
                    System.out.println("bạn đã chọn sai");
                    break;
            }
        } while (flag);
    }
}
