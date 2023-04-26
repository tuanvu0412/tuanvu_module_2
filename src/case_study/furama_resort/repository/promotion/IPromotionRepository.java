package case_study.furama_resort.repository.promotion;

import case_study.furama_resort.model.person_model.Customer;

import java.util.List;

public interface IPromotionRepository {
    List<Customer> getCustomerListUseService();

    List<Customer> getCustomerListGetVouCher();
}
