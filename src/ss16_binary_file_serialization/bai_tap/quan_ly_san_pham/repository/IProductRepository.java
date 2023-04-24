package ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.repository;

import ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getProductList();
    void addProduct(Product product);
    boolean findProduct(String name);
}
