package case_study.furama_resort.repository.customer;

import case_study.furama_resort.model.person.Customer;
import case_study.furama_resort.utils.customer.ReadAndWriteToCustomer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {
    private static final String PATH_CUSTOMER = "src/case_study/furama_resort/data/customer.csv";
    static List<Customer> customers = new ArrayList<>();

    @Override
    public List<Customer> getListCustomer() {
        customers = ReadAndWriteToCustomer.read(PATH_CUSTOMER);
        return customers;
    }

    @Override
    public void add(Customer customer) {
        customers.add(customer);
        ReadAndWriteToCustomer.write1(customers, PATH_CUSTOMER);
    }

    public int findId(String newId) {
        int size = customers.size();
        for (int i = 0; i < size; i++) {
            if (customers.get(i).getId().equals(newId)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void editCustomerList(Customer customer) {
        List<Customer> list = ReadAndWriteToCustomer.read(PATH_CUSTOMER);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(customer.getId())) {
                list.set(i, customer);
                ReadAndWriteToCustomer.write1(customers, PATH_CUSTOMER);
                break;
            }
        }
    }
}
