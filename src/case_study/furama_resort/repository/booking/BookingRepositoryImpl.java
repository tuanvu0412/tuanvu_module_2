package case_study.furama_resort.repository.booking;

import case_study.furama_resort.model.Booking;
import case_study.furama_resort.repository.IRepository;
import case_study.furama_resort.utils.booking.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class BookingRepositoryImpl implements IBookingRepository {
    private static final String PATH_BOOKING="src/case_study/furama_resort/common/furama.csv";
    static List<Booking> booking1 = new ArrayList<>();

    @Override
    public List getList() {
        booking1= ReadAndWrite.Read(PATH_BOOKING);
        return booking1;
    }

    @Override
    public void addNew(Booking booking) {
        booking1.add(booking);
        ReadAndWrite.Write1(booking1,PATH_BOOKING);
        ReadAndWrite.Read(PATH_BOOKING);
    }


}
