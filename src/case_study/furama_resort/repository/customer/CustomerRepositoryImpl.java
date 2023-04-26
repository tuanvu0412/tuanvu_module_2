package case_study.furama_resort.repository.customer;

import case_study.furama_resort.model.person_model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {
    static List<Customer> customers = new ArrayList<>();

    @Override
    public List getListCustomer() {
        return customers;
    }

    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public boolean editCustomerList(String newId, String id, String name, String dateOfBirth, String male, String citizenIdentificationNumber, String phoneNumber, String email, String customerLevel, String address) {
        List<Customer> list = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getId().equals(newId)) {
                list.get(i).setCustomerList(id, name, dateOfBirth, male, citizenIdentificationNumber, phoneNumber, email, customerLevel, address);
                return true;
            }
        }
        return false;
    }
}
