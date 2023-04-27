package case_study.furama_resort.service.contract;

import case_study.furama_resort.model.Contact;
import case_study.furama_resort.repository.contract.ContactRepositoryImpl;
import case_study.furama_resort.repository.contract.IContactRepository;
import case_study.furama_resort.service.IService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactService implements IContactService {
    Scanner sc = new Scanner(System.in);
    ContactRepositoryImpl contactRepository = new ContactRepositoryImpl();

    @Override
    public void displayContact() {
        List<Contact> list = contactRepository.getContactList();
        for (Contact c : list) {
            System.out.println(c + " ");
        }
    }

    @Override
    public void add() {
        System.out.println("nhập số hợp đồng");
        String contractNumber = sc.nextLine();
        System.out.println("nhập id booking");
        String idBooking = sc.nextLine();
        System.out.println("nhập số tiền cọc trước");
        String depositInAdvance = sc.nextLine();
        System.out.println("nhập tổng số tiền phải thanh toán");
        String totalPaymentAmount = sc.nextLine();
        contactRepository.add(new Contact(contractNumber, idBooking, depositInAdvance, totalPaymentAmount));
    }

    @Override
    public void editContact() {
        System.out.println("nhập số contact mà bạn muốn sửa");
        String oldContactNumber = sc.nextLine();
        System.out.println("nhập số contact mới");
        String newContactNumber = sc.nextLine();
        System.out.println("nhập id booking mới");
        String newIdBooking = sc.nextLine();
        System.out.println("nhập lại số tiền đã cọc trước");
        String newDepositInAdvence = sc.nextLine();
        System.out.println("nhập lại tổng số tiền phải trả");
        String newTotalPaymentAmount = sc.nextLine();
        boolean edit = contactRepository.editContact(oldContactNumber, newContactNumber, newIdBooking, newDepositInAdvence, newTotalPaymentAmount);
        if (edit) {
            System.out.println("bạn đã sửa thành công");
        } else {
            System.out.println("số contact bạn tìm chưa đúng");
        }
    }
}
