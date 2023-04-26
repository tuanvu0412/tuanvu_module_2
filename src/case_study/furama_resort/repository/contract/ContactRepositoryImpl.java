package case_study.furama_resort.repository.contract;

import case_study.furama_resort.model.Contact;
import case_study.furama_resort.repository.IRepository;

import java.util.ArrayList;
import java.util.List;

public class ContactRepositoryImpl implements IContactRepository {
    static List<Object> contract = new ArrayList<>();

    @Override
    public List getContactList() {
        return contract;
    }

    @Override
    public void add(Contact contact) {
        contract.add(contact);
    }

    @Override
    public boolean editContact(String contactNumber, String contractNumber, String idBooking, String depositInAdvance, String totalPaymentAmount) {
        List<Contact> list = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getContractNumber().equals(contactNumber)) {
                list.get(i).setContact(contractNumber, idBooking, depositInAdvance, totalPaymentAmount);
                return true;
            }
        }
        return false;
    }
}
