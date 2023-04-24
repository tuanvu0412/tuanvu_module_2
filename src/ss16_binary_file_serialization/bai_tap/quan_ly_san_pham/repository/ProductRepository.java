package ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.repository;

import ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.model.Product;
import ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.text_file.ReadFile;
import ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.text_file.WriteFile;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    static ArrayList<Product> products = new ArrayList<>();

    @Override
    public List<Product> getProductList() {
        WriteFile.Write(products);
        return products;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
        WriteFile.Write(products);
        ReadFile.Read();
    }

    @Override
    public boolean findProduct(String name) {
        ReadFile.Read();
        for (Product product : products) {
            if (name.equals(product.getName())) {
                System.out.println(product);
                return true;
            }
        }
        return false;
    }
}
