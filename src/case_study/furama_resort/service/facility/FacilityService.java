package case_study.furama_resort.service.facility;

import case_study.furama_resort.model.faciliti.Facility;
import case_study.furama_resort.model.faciliti.House;
import case_study.furama_resort.model.faciliti.Room;
import case_study.furama_resort.model.faciliti.Villa;
import case_study.furama_resort.repository.facility.FacilityRepositoryImpl;
import case_study.furama_resort.utils.facility.ValidateFacility;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FacilityService implements IFacilityService {
    Scanner sc = new Scanner(System.in);
    FacilityRepositoryImpl facilityRepository = new FacilityRepositoryImpl();
    List<Facility> list = facilityRepository.getListFacility();

    @Override
    public void display() {
        for (Facility f : list) {
            System.out.println(f.toString() + "");
        }
    }

    public void setFacilityRepository() {
        Set<Facility> list = facilityRepository.setListFacility();
        for (Facility f : list) {
            System.out.println(f.toString());
        }
    }


    @Override
    public void addVilla() {
        String idService;
        boolean flag;
        do {
            System.out.println("nhập id dịch vụ(SVVL-XXXX)");
            idService = sc.nextLine();
            flag = true;
            if (ValidateFacility.checkVillaId(idService)) {
                for (Facility villa : list) {
                    if (villa.getIdService().equals(idService)) {
                        flag = false;
                        continue;
                    }
                }
                if (flag) {
                    System.out.println("thêm thành công");
                    break;
                } else {
                    System.err.println("trong list đã có id này");
                    continue;
                }
            }
        } while (!flag);
        String nameService;
        do {
            System.out.println("nhập tên dịch vụ");
            nameService = sc.nextLine();
            if (ValidateFacility.checkNameService(nameService)) {
                System.out.println("thêm tên thành công");
            } else {
                System.err.println("nhập tên không giống với mẫu");
            }
        } while (!ValidateFacility.checkNameService(nameService));
        String utilities;
        do {
            System.out.println("nhập tiện ích");
            utilities = sc.nextLine();
            if (utilities.equals("")) {
                flag = false;
                System.out.println("nhập lại");
            } else {
                flag = true;
                System.out.println("bạn đã thêm thành công");
            }
        } while (!flag);
        double taxExpense;
        do {
            System.out.println("nhập thuế");
            taxExpense = Double.parseDouble(sc.nextLine());
            if (taxExpense > 0) {
                System.out.println("nhập thuế thành công");
            } else {
                System.err.println("nhập số thuế phải lớn hơn 0");
            }
        } while (taxExpense < 0);
        int numberOfPerson;
        do {
            System.out.println("nhập số lượng người");
            numberOfPerson = Integer.parseInt(sc.nextLine());
            if (numberOfPerson > 0 && numberOfPerson < 20) {
                System.out.println("thêm thành công");
            } else {
                System.out.println("nhập không đúng số lượng người");
            }
        } while (numberOfPerson < 0 || numberOfPerson > 20);
        String rentalType;
        boolean flag2 = true;
        do {
            System.out.println("loại villa cho thuê\n" +
                    "1. villa 2 phòng \n" +
                    "2. villa 4 phòng \n" +
                    "3. villa 6 phòng\n" +
                    "nhập lựa chọn của bạn: ");
            rentalType = sc.nextLine();
            switch (rentalType) {
                case "1":
                    rentalType = "Villa 2 phòng";
                    flag2 = false;
                    break;
                case "2":
                    rentalType = "Villa 4 phòng";
                    flag2 = false;
                    break;
                case "3":
                    rentalType = "Villa 6 phòng";
                    flag2 = false;
                    break;
                default:
                    System.err.println("nhập chưa đúng ");
            }
        } while (flag2);
        double swimingPoolArea;
        do {
            System.out.println("Diện tích hồ bơi");
            swimingPoolArea = Double.parseDouble(sc.nextLine());
            if (swimingPoolArea >= 30) {
                System.out.println("bạn đã thêm diện tích thành công");
                break;
            } else {
                System.out.println("bạn đã nhập sai");
            }
        } while (swimingPoolArea < 30);
        double price;
        do {
            System.out.println("nhập giá phòng");
            price = Double.parseDouble(sc.nextLine());
            if (price > 0) {
                System.out.println("nhập giá thành công");
            } else {
                System.err.println("nhập giá phải lớn hơn 0");
            }
        } while (price < 0);
        facilityRepository.addVilla(new Villa(idService, nameService, utilities, String.valueOf(taxExpense), String.valueOf(numberOfPerson), rentalType, String.valueOf(swimingPoolArea), String.valueOf(price)));
        System.out.println("Đã thêm thành công");
    }

    @Override
    public void addHouse() {
        String idService;
        boolean flag = true;
        do {
            System.out.println("nhập id dịch vụ(SVHO-XXXX)");
            idService = sc.nextLine();
            if (ValidateFacility.checkHouseId(idService)) {
                for (Facility villa : list) {
                    if (villa.getIdService().equals(idService)) {
                        flag = false;
                        continue;
                    }
                }
                if (flag) {
                    System.out.println("thêm thành công");
                    break;
                } else {
                    System.err.println("trong list đã có id này");
                    continue;
                }
            }
        } while (!flag);
        String nameService;
        do {
            System.out.println("nhập tên dịch vụ");
            nameService = sc.nextLine();
            if (ValidateFacility.checkNameService(nameService)) {
                System.out.println("thêm tên thành công");
            } else {
                System.err.println("nhập tên không giống với mẫu");
            }
        } while (!ValidateFacility.checkNameService(nameService));
        String utilities;
        do {
            System.out.println("nhập tiện ích");
            utilities = sc.nextLine();
            if (utilities.equals("")) {
                flag = false;
                System.out.println("nhập lại");
            } else {
                flag = true;
                System.out.println("bạn đã thêm thành công");
            }
        } while (!flag);
        double taxExpense;
        do {
            System.out.println("nhập thuế");
            taxExpense = Double.parseDouble(sc.nextLine());
            if (taxExpense > 0) {
                System.out.println("nhập thuế thành công");
            } else {
                System.err.println("nhập số thuế phải lớn hơn 0");
            }
        } while (taxExpense < 0);
        int numberOfPerson;
        do {
            System.out.println("nhập số lượng người");
            numberOfPerson = Integer.parseInt(sc.nextLine());
            if (numberOfPerson > 0 && numberOfPerson < 20) {
                System.out.println("thêm thành công");
            } else {
                System.out.println("nhập không đúng số lượng người");
            }
        } while (numberOfPerson < 0 || numberOfPerson > 20);
        String rentalType;
        boolean flag2 = true;
        do {
            System.out.println("Loại Nhà cho thuê\n" +
                    "1. Nhà 1 phòng \n" +
                    "2. Nhà 2 phòng \n" +
                    "3. Nhà 4 phòng\n" +
                    "nhập lựa chọn của bạn: ");
            rentalType = sc.nextLine();
            switch (rentalType) {
                case "1":
                    rentalType = "Nhà 1 phòng";
                    flag2 = false;
                    break;
                case "2":
                    rentalType = "nhà 2 phòng";
                    flag2 = false;
                    break;
                case "3":
                    rentalType = "nhà 4 phòng";
                    flag2 = false;
                    break;
                default:
                    System.err.println("nhập chưa đúng");
            }
        } while (flag2);
        System.out.println("nhập loại phòng tiêu chuẩn");
        String roomStandard = sc.nextLine();
        int numberOfFloors;
        do {
            System.out.println("số tầng");
            numberOfFloors = Integer.parseInt(sc.nextLine());
            if (numberOfFloors > 0) {
                System.out.println("đã thêm thành công");
            } else {
                System.out.println("số tầng phải lớn hơn 0");
            }
        } while (numberOfFloors < 0);
        double price;
        do {
            System.out.println("nhập giá phòng");
            price = Double.parseDouble(sc.nextLine());
            if (price > 0) {
                System.out.println("nhập giá thành công");
            } else {
                System.err.println("nhập giá phải lớn hơn 0");
            }
        } while (price < 0);
        facilityRepository.addHouse(new House(idService, nameService, utilities, String.valueOf(taxExpense), String.valueOf(numberOfPerson), rentalType, roomStandard, String.valueOf(numberOfFloors), String.valueOf(price)));
        System.out.println("Đã thêm thành công");
    }

    @Override
    public void addRoom() {
        String idService;
        boolean flag = true;
        do {
            System.out.println("nhập id dịch vụ(SVRO-XXXX)");
            idService = sc.nextLine();
            if (ValidateFacility.checkRoomId(idService)) {
                for (Facility villa : list) {
                    if (villa.getIdService().equals(idService)) {
                        flag = false;
                        continue;
                    }
                }
                if (flag) {
                    System.out.println("thêm thành công");
                    break;
                } else {
                    System.err.println("trong list đã có id này");
                    continue;
                }
            }
        } while (!flag);
        String nameService;
        do {
            System.out.println("nhập tên dịch vụ");
            nameService = sc.nextLine();
            if (ValidateFacility.checkNameService(nameService)) {
                System.out.println("thêm tên thành công");
            } else {
                System.err.println("nhập tên không giống với mẫu");
            }
        } while (!ValidateFacility.checkNameService(nameService));
        String utilities;
        do {
            System.out.println("nhập tiện ích");
            utilities = sc.nextLine();
            if (utilities.equals("")) {
                flag = false;
                System.out.println("nhập lại");
            } else {
                flag = true;
                System.out.println("bạn đã thêm thành công");
            }
        } while (!flag);
        double taxExpense;
        do {
            System.out.println("nhập thuế");
            taxExpense = Double.parseDouble(sc.nextLine());
            if (taxExpense > 0) {
                System.out.println("nhập thuế thành công");
            } else {
                System.err.println("nhập số thuế phải lớn hơn 0");
            }
        } while (taxExpense < 0);
        int numberOfPerson;
        do {
            System.out.println("nhập số lượng người");
            numberOfPerson = Integer.parseInt(sc.nextLine());
            if (numberOfPerson > 0 && numberOfPerson < 20) {
                System.out.println("thêm thành công");
            } else {
                System.out.println("nhập không đúng số lượng người");
            }
        } while (numberOfPerson < 0 || numberOfPerson > 20);
        String rentalType;
        boolean flag2 = true;
        do {
            System.out.println("loại phòng cho thuê\n" +
                    "1. Phòng King\n" +
                    "2. Phòng Queen \n" +
                    "3. Phòng double\n" +
                    "nhập lựa chọn của bạn: ");
            rentalType = sc.nextLine();
            switch (rentalType) {
                case "1":
                    rentalType = "Phòng King";
                    flag2 = false;
                    break;
                case "2":
                    rentalType = "Phòng queen";
                    flag2 = false;
                    break;
                case "3":
                    rentalType = "Phòng double";
                    flag2 = false;
                    break;
                default:
                    System.err.println("nhập chưa đúng ");
            }
        } while (flag2);
        double price;
        do {
            System.out.println("nhập giá phòng");
            price = Double.parseDouble(sc.nextLine());
            if (price > 0) {
                System.out.println("nhập giá thành công");
            } else {
                System.err.println("nhập giá phải lớn hơn 0");
            }
        } while (price < 0);
        System.out.println("dịch vụ miễn phí");
        String freeService = sc.nextLine();
        facilityRepository.addRoom(new Room(idService, nameService, utilities, String.valueOf(taxExpense), String.valueOf(numberOfPerson), rentalType, String.valueOf(price), freeService));
        System.out.println("Đã thêm thành công");
    }
}
