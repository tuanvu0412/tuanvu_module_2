package case_study.furama_resort.controller;

import case_study.furama_resort.service.customer.CustomerService;

import java.util.Scanner;

public class CustomerController {
    public  void customerManagement(){
        CustomerService customerService= new CustomerService();
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        do{
            System.out.println("1. Dislpay list customer\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu");
            System.out.println("mời bạn chọn");
            String choice2=sc.nextLine();
            switch (choice2){
                case "1":
                    customerService.displayCustomerList();
                    break;
                case "2":
                    customerService.add();
                    break;
                case "3":
                    customerService.editCustomerList();
                    break;
                case "4":
                    flag=false;
                    break;
                default:
                    System.out.println("bạn đã chọn sai");
            }
        }while (flag);
    }
}
