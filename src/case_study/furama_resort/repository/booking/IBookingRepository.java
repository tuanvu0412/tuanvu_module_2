package case_study.furama_resort.repository.booking;

import case_study.furama_resort.model.Booking;

import java.util.List;
import java.util.TreeSet;

public interface IBookingRepository {
    TreeSet<Booking> getList();

    void addNew(Booking booking);
}
