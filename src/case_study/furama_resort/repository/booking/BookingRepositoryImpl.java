package case_study.furama_resort.repository.booking;

import case_study.furama_resort.model.Booking;
import case_study.furama_resort.repository.IRepository;

import java.util.ArrayList;
import java.util.List;

public class BookingRepositoryImpl implements IBookingRepository {
    static List<Booking>booking1=new ArrayList<>();
    @Override
    public List getList() {
        return booking1;
    }

    @Override
    public void addNew(Booking booking) {
      booking1.add(booking);
    }


}
