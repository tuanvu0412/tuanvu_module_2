package case_study.furama_resort.repository.facility;

import case_study.furama_resort.model.faciliti_model.Facility;

import java.util.List;

public interface IFacilityRepository {
    List<Facility> getListFacility();

    void add(Facility facility);
}
