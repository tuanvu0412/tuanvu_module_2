package case_study.furama_resort.service.facility;

import case_study.furama_resort.model.faciliti_model.Facility;
import case_study.furama_resort.repository.facility.FacilityRepositoryImpl;
import case_study.furama_resort.service.IService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacilityService implements IService {
    Scanner sc = new Scanner(System.in);
    FacilityRepositoryImpl facilityRepository = new FacilityRepositoryImpl();

    @Override
    public void display() {
        List<Facility> list = new ArrayList<>();
        for (Facility f : list) {
            System.out.println(f + "");
        }
    }

    @Override
    public void add() {
        System.out.println("nhập id dịch vụ");
        String id = sc.nextLine();
        System.out.println("nhập tên dịch vụ");
        String name = sc.nextLine();
        System.out.println("nhập tiện ích");
        String utilities = sc.nextLine();
        System.out.println("nhập thuế");
        String taxExpense = sc.nextLine();
        System.out.println("nhập số lượng người");
        String numberOfPerson = sc.nextLine();
        System.out.println("loại phòng cho thuê ");
        String rentalType = sc.nextLine();
        facilityRepository.add(new Facility(id, name, utilities, taxExpense, numberOfPerson, rentalType));
    }
}
