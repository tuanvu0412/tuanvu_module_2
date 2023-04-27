package case_study.furama_resort.service.booking;

import case_study.furama_resort.model.Booking;
import case_study.furama_resort.repository.booking.BookingRepositoryImpl;
import case_study.furama_resort.service.IService;
import com.sun.scenario.effect.impl.prism.PrImage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingService implements IService {
    Scanner sc = new Scanner(System.in);
    private BookingRepositoryImpl bookingRepository = new BookingRepositoryImpl();

    @Override
    public void display() {
        List<Booking> list = bookingRepository.getList();
        for (Booking s : list) {
            System.out.println(s + " ");
        }
    }

    @Override
    public void add() {
        bookingRepository.getList();
        System.out.println("nhâp id booking");
        String idBooking = sc.nextLine();
        System.out.println("nhập ngày");
        String date = sc.nextLine();
        System.out.println("nhập ngày bắt đầu booking");
        String startDate = sc.nextLine();
        System.out.println("nhập ngày kết thúc booking");
        String endDate = sc.nextLine();
        System.out.println("nhập id của khách");
        String idCustomer = sc.nextLine();
        System.out.println("nhập id dịch vụ");
        String idService = sc.nextLine();
        bookingRepository.addNew(new Booking(idBooking,date, startDate, endDate, idCustomer, idService));
    }
}
