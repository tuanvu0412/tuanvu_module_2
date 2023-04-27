package case_study.furama_resort.repository.contract;

import case_study.furama_resort.model.Contract;
import case_study.furama_resort.utils.contract.ReadAndWriteToContract;

import java.util.ArrayList;
import java.util.List;

public class ContactRepositoryImpl implements IContactRepository {
    private static final String PATH_CONTRACT = "src/case_study/furama_resort/common/furama.csv";
    static List<Contract> contract = new ArrayList<>();

    @Override
    public List<Contract> getContactList() {
        contract = ReadAndWriteToContract.read(PATH_CONTRACT);
        return contract;
    }

    @Override
    public void add(Contract contact) {
        contract.add(contact);
        ReadAndWriteToContract.write1(contract, PATH_CONTRACT);

    }

    @Override
    public void editContact() {
        contract = ReadAndWriteToContract.read(PATH_CONTRACT);
        ReadAndWriteToContract.write1(contract, PATH_CONTRACT);
    }
    public int checkId(String id){
        List<Contract>list = ReadAndWriteToContract.read(PATH_CONTRACT);
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).equals(id)){
                return i;
            }
        }
        return -1;
    }
}
