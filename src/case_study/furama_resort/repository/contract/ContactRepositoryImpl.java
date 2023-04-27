package case_study.furama_resort.repository.contract;

import case_study.furama_resort.model.Contact;
import case_study.furama_resort.utils.contract.ReadAndWrite1;

import java.util.ArrayList;
import java.util.List;

public class ContactRepositoryImpl implements IContactRepository {
    private static final String PATH_CONTRACT = "src/case_study/furama_resort/common/furama.csv";
    static List<Contact> contract = new ArrayList<>();

    @Override
    public List getContactList() {
        contract = ReadAndWrite1.Read(PATH_CONTRACT);
        return contract;
    }

    @Override
    public void add(Contact contact) {
        contract.add(contact);
        ReadAndWrite1.Write1(contract,PATH_CONTRACT);
        ReadAndWrite1.Read(PATH_CONTRACT);
    }

    @Override
    public boolean editContact(String contactNumber, String contractNumber, String idBooking, String depositInAdvance, String totalPaymentAmount) {
        List<Contact> list = ReadAndWrite1.Read(PATH_CONTRACT);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getContractNumber().equals(contactNumber)) {
                list.get(i).setContact(contractNumber, idBooking, depositInAdvance, totalPaymentAmount);
                ReadAndWrite1.Write1(list,PATH_CONTRACT);
                return true;
            }
        }
        return false;
    }
}
