package case_study.furama_resort.service.booking.promotion;

import case_study.furama_resort.model.person_model.Customer;
import case_study.furama_resort.repository.promotion.PromotionRepository;

import java.util.ArrayList;
import java.util.List;

public class PromotionService implements IPromotionService {
    PromotionRepository promotionRepository = new PromotionRepository();

    @Override
    public void displayCustomerGetService() {
        List<Customer> list =new ArrayList<>();
        for (Customer C : list) {
            System.out.println(C + "");
        }
    }

    @Override
    public void disPlayCustomerGetVoucher() {
        List<Customer> list = new ArrayList<>();
        for (Customer c : list) {
            System.out.println(c + "");
        }
    }
}
