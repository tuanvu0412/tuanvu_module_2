package case_study.furama_resort.repository.facility;

import case_study.furama_resort.model.faciliti.Facility;

import case_study.furama_resort.model.faciliti.House;
import case_study.furama_resort.model.faciliti.Room;
import case_study.furama_resort.model.faciliti.Villa;
import case_study.furama_resort.utils.facility.ReadAndWriteFacility;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class FacilityRepositoryImpl implements IFacilityRepository {
    static final String PATH_FACILITY = "src/case_study/furama_resort/data/facility.csv";
    static LinkedHashMap<Facility, Integer> list = new LinkedHashMap<>();
    static ReadAndWriteFacility readAndWriteFacility = new ReadAndWriteFacility();

    static {
        for (Facility facility : readAndWriteFacility.read(PATH_FACILITY)) {
            list.put(facility, 1);
        }
    }
    public List<Facility> getListFacility(){
        List<Facility>list=ReadAndWriteFacility.read(PATH_FACILITY);
        return list;
    }
    public int finId(String id){
      List<Facility>list=ReadAndWriteFacility.read(PATH_FACILITY);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getIdService().equals(id)){
                return  i;
            }
        }
        return -1;
    }
    @Override
    public Set<Facility> setListFacility() {
        Set<Facility> facilities = list.keySet();
        for (Facility facility : facilities) {
            if (list.get(facility) != 5) {
                facilities.remove(facility);
            }
        }
        return facilities;
    }

    @Override
    public void addVilla(Villa villa) {
        List<Facility> list = ReadAndWriteFacility.read(PATH_FACILITY);
        list.add(villa);
        ReadAndWriteFacility.write(list,PATH_FACILITY);
    }

    @Override
    public void addHouse(House house) {
        List<Facility> list = ReadAndWriteFacility.read(PATH_FACILITY);
        list.add(house);
        ReadAndWriteFacility.write(list,PATH_FACILITY);
    }

    @Override
    public void addRoom(Room room) {
        List<Facility> list = ReadAndWriteFacility.read(PATH_FACILITY);
        list.add((room));
        ReadAndWriteFacility.write(list,PATH_FACILITY);
    }
}
