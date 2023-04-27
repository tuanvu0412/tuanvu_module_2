package case_study.furama_resort.repository.contract;

import case_study.furama_resort.model.Contract;

import java.util.List;

public interface IContactRepository {
    List<Contract> getContactList();

    void add(Contract contact);

    void editContact();
}
