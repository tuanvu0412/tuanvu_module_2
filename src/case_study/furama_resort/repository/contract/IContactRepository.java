package case_study.furama_resort.repository.contract;

import case_study.furama_resort.model.Contact;

import java.util.List;

public interface IContactRepository {
    List<Contact> getContactList();

    void add(Contact contact);

    boolean editContact(String contactNumber, String contractNumber, String idBooking, String depositInAdvance, String totalPaymentAmount);
}
