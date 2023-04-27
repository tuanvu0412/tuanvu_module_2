package case_study.furama_resort.repository.customer;

import case_study.furama_resort.model.person_model.Customer;
import case_study.furama_resort.utils.booking.ReadAndWrite;
import case_study.furama_resort.utils.customer.ReadAndWrite2;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {
    private static final String PATH_CUSTOMER ="src/case_study/furama_resort/common/furama.csv";
    static List<Customer> customers = new ArrayList<>();

    @Override
    public List getListCustomer() {
        customers= ReadAndWrite2.Read(PATH_CUSTOMER);
        return customers;
    }

    @Override
    public void add(Customer customer) {
        customers.add(customer);
        ReadAndWrite2.Write1(customers,PATH_CUSTOMER);
        ReadAndWrite2.Read(PATH_CUSTOMER);
    }
    public boolean findId(String newId){
        List<Customer>list=ReadAndWrite2.Read(PATH_CUSTOMER);
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).getId().equals(newId)){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean editCustomerList(String newId, String id, String name, String dateOfBirth, String male, String citizenIdentificationNumber, String phoneNumber, String email, String customerLevel, String address) {
        List<Customer> list = ReadAndWrite2.Read(PATH_CUSTOMER);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getId().equals(newId)) {
                list.get(i).setCustomerList(id, name, dateOfBirth, male, citizenIdentificationNumber, phoneNumber, email, customerLevel, address);
                ReadAndWrite2.Write1(list,PATH_CUSTOMER);
                return true;
            }
        }
        return false;
    }
}
