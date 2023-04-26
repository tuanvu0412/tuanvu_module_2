package case_study.furama_resort.repository.facility;

import case_study.furama_resort.model.faciliti_model.Facility;
import case_study.furama_resort.repository.IRepository;

import java.util.ArrayList;
import java.util.List;

public class FacilityRepositoryImpl implements IFacilityRepository {
    static List<Facility>product=new ArrayList<>();

    @Override
    public List<Facility> getListFacility() {
        return product;
    }

    @Override
    public void add(Facility facility) {
        product.add(facility);
    }
}
