package case_study.furama_resort.repository.contract;

import case_study.furama_resort.model.Contract;
import case_study.furama_resort.utils.contract.ReadAndWriteToContract;

import java.util.ArrayList;
import java.util.List;

public class ContactRepositoryImpl implements IContactRepository {
    private static final String PATH_CONTRACT = "src/case_study/furama_resort/data/contract.csv";
    static List<Contract> list = new ArrayList<>();

    @Override
    public List<Contract> getContactList() {
        list = ReadAndWriteToContract.read(PATH_CONTRACT);
        return list;
    }

    @Override
    public void add(Contract contact) {
        list.add(contact);
        ReadAndWriteToContract.write1(list, PATH_CONTRACT);
    }

    @Override
    public void editContact(Contract contract) {
        list = ReadAndWriteToContract.read(PATH_CONTRACT);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdBooking().equals(contract.getIdBooking())) {
                list.set(i, contract);
                ReadAndWriteToContract.write1(list, PATH_CONTRACT);
                break;
            }
        }
    }

    public int checkId(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
