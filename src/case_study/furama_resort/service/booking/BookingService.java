package case_study.furama_resort.service.booking;

import case_study.furama_resort.model.Booking;
import case_study.furama_resort.repository.booking.BookingRepositoryImpl;
import case_study.furama_resort.repository.customer.CustomerRepositoryImpl;
import case_study.furama_resort.repository.facility.FacilityRepositoryImpl;
import case_study.furama_resort.utils.booking.ValidateBooking;
import java.util.Scanner;
import java.util.TreeSet;

public class BookingService implements IBookingService {
    Scanner sc = new Scanner(System.in);
    private final BookingRepositoryImpl bookingRepository = new BookingRepositoryImpl();
    private final CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();
    private final FacilityRepositoryImpl facilityRepository = new FacilityRepositoryImpl();
    private final TreeSet<Booking> list = bookingRepository.getList();

    public void display() {
        for (Booking b:list ) {
            System.out.println(b);
        }
    }

    @Override
    public void add() {
        System.out.print("nhâp id booking: ");
        String idBooking = sc.nextLine();
        String date;
        do {
            System.out.print("nhập ngày(dd-mm-yyyy): ");
            date = sc.nextLine();
            if (ValidateBooking.checkDate(date)) {
                System.out.println("thêm thành công.");
            } else {
                System.out.println("nhập khống đúng định dạng.");
            }
        } while (!ValidateBooking.checkDate(date));
        String dateStart;
        do {
            System.out.print("nhập ngày bắt đầu booking(dd-mm-yyyy): ");
            dateStart = sc.nextLine();
            if (ValidateBooking.checkDate(dateStart)) {
                System.out.println("nhập thành công.");
            } else {
                System.out.println("nhập không đúng định dạng.");
            }
        } while (!ValidateBooking.checkDate(dateStart));
        String dateEnd;
        do {
            System.out.print("nhập ngày kết thúc booking(dd-mm-yyyy): ");
            dateEnd = sc.nextLine();
            if (ValidateBooking.checkDate(dateEnd)) {
                System.out.println("nhập thành công.");
            } else {
                System.out.println("nhập không đúng định dạng.");
            }
        } while (!ValidateBooking.checkDate(dateEnd));
        String idCustomer;
        do {
            System.out.print("nhập id của khách: ");
            idCustomer = sc.nextLine();
            if (customerRepository.findId(idCustomer) == -1) {
                System.err.println("id không tìm thấy.");
                continue;
            } else {
                System.out.println("thêm id thành công.");
            }
            break;
        } while (true);
        String idService;
        do {
            System.out.print("nhập id dịch vụ: ");
            idService = sc.nextLine();
            if (facilityRepository.finId(idService) == -1) {
                System.out.println("không tìm thấy id.");
                continue;
            } else {
                System.out.println("thêm thành công.");
            }
            break;
        } while (true);
        bookingRepository.addNew(new Booking(idBooking, date, dateStart, dateEnd, idCustomer, idService));
        System.out.println("Đã thêm thành công booking!!!");
    }
}
