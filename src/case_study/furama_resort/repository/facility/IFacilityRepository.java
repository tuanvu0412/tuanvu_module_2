package case_study.furama_resort.repository.facility;

import case_study.furama_resort.model.faciliti.Facility;
import case_study.furama_resort.model.faciliti.House;
import case_study.furama_resort.model.faciliti.Room;
import case_study.furama_resort.model.faciliti.Villa;

import java.util.List;
import java.util.Set;

public interface IFacilityRepository {
    List<Facility>getListFacility();
    Set<Facility> setListFacility();
    void addVilla(Villa villa);
    void addHouse(House house);
    void addRoom(Room room);
}
