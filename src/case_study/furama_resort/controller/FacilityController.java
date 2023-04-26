package case_study.furama_resort.controller;

import case_study.furama_resort.service.facility.FacilityService;

import java.util.Scanner;

public class FacilityController {
    public  void facilityManagement(){
        FacilityService facilityService=new FacilityService();
        Scanner sc=new Scanner(System.in);
        boolean flag= true;
        do{
            System.out.println("1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility\n" +
                    "4. Return main menu");
            System.out.println("mời bạn chọn");
            String choice3=sc.nextLine();
            switch (choice3){
                case "1":
                    facilityService.display();
                    break;
                case "2":
                    facilityService.add();
                    break;
                case "3":
                    facilityService.display();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("bạn đã chọn sai");
            }
        }while (flag);
    }
}
