package case_study.furama_resort.repository.customer;

import case_study.furama_resort.model.person.Customer;

import java.util.List;

public interface ICustomerRepository<E> {
    List<Customer> getListCustomer();

    void add(Customer customer);

    void editCustomerList(Customer customer);
}
