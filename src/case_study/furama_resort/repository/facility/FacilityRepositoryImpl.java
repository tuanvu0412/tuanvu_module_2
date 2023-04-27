package case_study.furama_resort.repository.facility;

import case_study.furama_resort.model.faciliti_model.Facility;

import case_study.furama_resort.utils.facility.ReadAndWrite4;

import java.util.ArrayList;
import java.util.List;

public class FacilityRepositoryImpl implements IFacilityRepository {
    private static final String PATH_FACILITY="src/case_study/furama_resort/common/furama.csv";
    static List<Facility> product = new ArrayList<>();

    @Override
    public List<Facility> getListFacility() {
        product= ReadAndWrite4.Read(PATH_FACILITY);
        return product;
    }

    @Override
    public void add(Facility facility) {
        product.add(facility);
        ReadAndWrite4.Write1(product,PATH_FACILITY);
    }
}
