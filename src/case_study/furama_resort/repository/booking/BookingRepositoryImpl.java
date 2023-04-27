package case_study.furama_resort.repository.booking;

import case_study.furama_resort.model.Booking;
import case_study.furama_resort.utils.booking.ReadAndWriteToBooking;

import java.util.ArrayList;
import java.util.List;

public class BookingRepositoryImpl implements IBookingRepository {
    private static final String PATH_BOOKING="src/case_study/furama_resort/common/furama.csv";
    static List<Booking> booking1 = new ArrayList<>();

    @Override
    public List getList() {
        booking1= ReadAndWriteToBooking.read(PATH_BOOKING);
        return booking1;
    }

    @Override
    public void addNew(Booking booking) {
        booking1.add(booking);
        ReadAndWriteToBooking.write1(booking1,PATH_BOOKING);
    }


}
