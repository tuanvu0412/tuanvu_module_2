package case_study.furama_resort.repository.promotion;

import case_study.furama_resort.model.person.Customer;

import java.util.List;

public interface IPromotionRepository {
    List<Customer> getCustomerListUseService();

    List<Customer> getCustomerListGetVouCher();
}
