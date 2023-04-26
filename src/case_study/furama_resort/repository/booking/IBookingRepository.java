package case_study.furama_resort.repository.booking;

import case_study.furama_resort.model.Booking;

import java.util.List;

public interface IBookingRepository {
    List<Booking> getList();

    void addNew(Booking booking);
}
