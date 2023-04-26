package case_study.furama_resort.repository.promotion;

import case_study.furama_resort.model.person_model.Customer;

import java.util.ArrayList;
import java.util.List;

public class PromotionRepository implements IPromotionRepository {
    List<Customer>customers= new ArrayList<>();

    @Override
    public List<Customer> getCustomerListUseService() {
        return customers;
    }

    @Override
    public List<Customer> getCustomerListGetVouCher() {
        return customers;
    }
}
