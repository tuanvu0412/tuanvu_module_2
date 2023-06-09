package case_study.furama_resort.controller;

import case_study.furama_resort.service.facility.FacilityService;

import java.util.Scanner;

public class FacilityController {
    public void facilityManagement() {
        FacilityService facilityService = new FacilityService();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu");
            System.out.println("mời bạn chọn");
            int choice3 = 0;
            try {
                choice3 = Integer.parseInt(sc.nextLine());
                if (choice3 < 1 || choice3 > 4) {
                    throw new Exception("chỉ được nhập từ 1 tới 4");
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập không đúng định dạng!!");
            } catch (Exception e) {
                e.printStackTrace();
            }
            switch (choice3) {
                case 1:
                    facilityService.display();
                    flag = false;
                    break;
                case 2:
                    do {
                        System.out.println("1. nhập 1 để thêm Villa\n" +
                                "2. nhập 2 để thêm House\n" +
                                "3. nhập 3 để thêm room\n" +
                                "mời bạn chọn: ");
                        try {
                            choice3 = Integer.parseInt(sc.nextLine());
                            if (choice3 < 1 || choice3 > 3) {
                                throw new Exception("chỉ được nhập từ 1 tới 3");
                            }
                        } catch (NumberFormatException e) {
                            System.err.println("Nhập không đúng định dạng!!");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        switch (choice3) {
                            case 1:
                                facilityService.addVilla();
                                flag = false;
                                break;
                            case 2:
                                facilityService.addHouse();
                                flag = false;
                                break;
                            case 3:
                                facilityService.addRoom();
                                flag = false;
                                break;
                            default:
                                System.out.println("không tìm thấy số bạn nhập");
                        }
                    } while (flag);
                case 3:
                    facilityService.setFacilityRepository();
                    flag = false;
                    break;
                case 4:
                    flag = false;
                    System.out.println("Đã thoát");
                    break;
                default:
                    System.out.println("bạn đã chọn sai");
            }
        } while (flag);
    }
}
