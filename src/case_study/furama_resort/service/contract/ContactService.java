package case_study.furama_resort.service.contract;

import case_study.furama_resort.model.Contract;
import case_study.furama_resort.repository.booking.BookingRepositoryImpl;
import case_study.furama_resort.repository.contract.ContactRepositoryImpl;

import java.util.List;
import java.util.Scanner;

public class ContactService implements IContactService {
    Scanner sc = new Scanner(System.in);
    ContactRepositoryImpl contactRepository = new ContactRepositoryImpl();
    BookingRepositoryImpl bookingRepository = new BookingRepositoryImpl();

    @Override
    public void displayContact() {
        List<Contract> list = contactRepository.getContactList();
        for (Contract c : list) {
            System.out.println(c + " ");
        }
    }

    @Override
    public void add() {
        System.out.print("nhập số hợp đồng: ");
        String contractNumber = sc.nextLine();
        String idBooking;
        do {
            System.out.print("nhập id booking: ");
            idBooking = sc.nextLine();
            if (bookingRepository.finIdBooking(idBooking).equals("")) {
                System.out.println("không tìm thấy id.");
                continue;
            } else {
                System.out.println("thêm thành công.");

            }
            break;
        } while (true);
        System.out.print("nhập số tiền cọc trước: ");
        String depositInAdvance = sc.nextLine();
        System.out.print("nhập tổng số tiền phải thanh toán: ");
        String totalPaymentAmount = sc.nextLine();
        contactRepository.add(new Contract(contractNumber, idBooking, depositInAdvance, totalPaymentAmount));
        System.out.println("đã thêm thành công!!!");
    }

    @Override
    public void editContact() {
        System.out.print("nhập số hợp đồng mà bạn muốn sửa: ");
        String oldContactNumber = sc.nextLine();
        int edit = contactRepository.checkId(oldContactNumber);
        Contract contract = contactRepository.getContactList().get(edit);
        if (contract == null) {
            System.out.println("không tìm thấy id.");
        } else {
            System.out.print("nhập số hợp đồng mới.");
            String newContactNumber = sc.nextLine();
            contract.setIdBooking(newContactNumber);
            String newIdBooking;
            do {
                System.out.print("nhập id booking: ");
                newIdBooking = sc.nextLine();
                if (bookingRepository.finIdBooking(newIdBooking).equals("")) {
                    System.out.println("không tìm thấy id.");
                    continue;
                } else {
                    System.out.println("thêm thành công.");

                }
                break;
            } while (true);
            contract.setIdBooking(newIdBooking);
            System.out.print("nhập lại số tiền đã cọc trước: ");
            String newDepositInAdvance = sc.nextLine();
            contract.setIdBooking(newDepositInAdvance);
            System.out.print("nhập lại tổng số tiền phải trả: ");
            String newTotalPaymentAmount = sc.nextLine();
            contract.setIdBooking(newTotalPaymentAmount);
            System.out.println("hợp đồng đã được thay đổi.");
        }
    }
}
