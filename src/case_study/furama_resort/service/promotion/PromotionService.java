package case_study.furama_resort.service.promotion;

import case_study.furama_resort.model.person.Customer;
import case_study.furama_resort.repository.customer.CustomerRepositoryImpl;

import java.util.List;

public class PromotionService implements IPromotionService {
    CustomerRepositoryImpl customerRepository= new CustomerRepositoryImpl();

    @Override
    public void displayCustomerGetService() {
        List<Customer> list =customerRepository.getListCustomer();
        for (Customer C : list) {
            System.out.println(C + "");
        }
    }

    @Override
    public void disPlayCustomerGetVoucher() {
        List<Customer> list = customerRepository.getListCustomer();
        for (Customer c : list) {
            System.out.println(c + "");
        }
    }
}
