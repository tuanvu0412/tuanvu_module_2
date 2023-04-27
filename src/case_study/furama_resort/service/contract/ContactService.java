package case_study.furama_resort.service.contract;

import case_study.furama_resort.model.Contract;
import case_study.furama_resort.repository.contract.ContactRepositoryImpl;

import java.util.List;
import java.util.Scanner;

public class ContactService implements IContactService {
    Scanner sc = new Scanner(System.in);
    ContactRepositoryImpl contactRepository = new ContactRepositoryImpl();

    @Override
    public void displayContact() {
        List<Contract> list = contactRepository.getContactList();
        for (Contract c : list) {
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
        contactRepository.add(new Contract(contractNumber, idBooking, depositInAdvance, totalPaymentAmount));
    }

    @Override
    public void editContact() {
        System.out.println("nhập số contact mà bạn muốn sửa");
        String oldContactNumber = sc.nextLine();
        int edit = contactRepository.checkId(oldContactNumber);
        if (edit>=0) {
            System.out.print("nhập số contact mới");
            String newContactNumber = sc.nextLine();
            contactRepository.getContactList().get(edit).setIdBooking(newContactNumber);
            System.out.print("nhập id booking mới");
            String newIdBooking = sc.nextLine();
            contactRepository.getContactList().get(edit).setIdBooking(newIdBooking);
            System.out.print("nhập lại số tiền đã cọc trước");
            String newDepositInAdvance = sc.nextLine();
            contactRepository.getContactList().get(edit).setIdBooking(newDepositInAdvance);
            System.out.print("nhập lại tổng số tiền phải trả");
            String newTotalPaymentAmount = sc.nextLine();
            contactRepository.getContactList().get(edit).setIdBooking(newTotalPaymentAmount);
            System.out.println("đã được thay đổi");
        } else {
            System.err.println("số contact bạn tìm chưa đúng");
        }
    }
}
