package case_study.furama_resort.repository.booking;

import case_study.furama_resort.model.Booking;
import case_study.furama_resort.utils.booking.ReadAndWriteToBooking;

import java.util.*;

public class BookingRepositoryImpl implements IBookingRepository {
    private static final String PATH_BOOKING="src/case_study/furama_resort/data/booking.csv";
    static TreeSet<Booking> booking1 = ReadAndWriteToBooking.read(PATH_BOOKING);
//    static {
//        booking.add(new Booking("BK-12341","01","02","033","01231","01213"));
//        booking.add(new Booking("BK-12341","01","02","033","01231","01214"));
//        booking.add(new Booking("BK-12341","01","02","033","01231","01214"));
//    }
    @Override
    public TreeSet<Booking> getList() {
        return  booking1;
    }

    @Override
    public void addNew(Booking booking) {
       booking1.add(booking);
       ReadAndWriteToBooking.write1(booking1,PATH_BOOKING);
    }
    public String finIdBooking(String id){
        TreeSet<Booking>list=ReadAndWriteToBooking.read(PATH_BOOKING);
        for (Booking b: list) {
            if(b.getIdBooking().equals(id)){
                return id;
            }
        }
        return "";
    }

}
