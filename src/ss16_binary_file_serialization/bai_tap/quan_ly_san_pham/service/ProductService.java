package ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.service;

import ss11_map_tree.bai_tap.quan_ly_san_pham.text_file.ReadAndWrite;
import ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.model.Product;
import ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.repository.ProductRepository;
import ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.text_file.ReadFile;
import ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.text_file.WriteFile;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    ProductRepository productRepository = new ProductRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void disPlayProduct() {
        List<Product> products = productRepository.getProductList();
        for (Product s : products) {
            System.out.println(s);
        }
    }

    @Override
    public void addProduct() {
        System.out.println("nhập code");
        String code = sc.nextLine();
        System.out.println("nhập tên");
        String name = sc.nextLine();
        System.out.println("nhập giá");
        String price = sc.nextLine();
        System.out.println("nhập hàng sản xuất");
        String items = sc.nextLine();
        System.out.println("nhập mô tả");
        String describe = sc.nextLine();
        productRepository.addProduct(new Product(code, name, price, items, describe));
        WriteFile.Write(productRepository.getProductList());
    }

    @Override
    public void findProduct() {
        System.out.println("mời bạn nhập tên sản phẩm bạn muốn tìm");
        String name=sc.nextLine();
        boolean find= productRepository.findProduct(name);
        if(find){
            System.out.println("đây là sản phẩm bạn muốn tìm");
        }else {
            System.out.println("sản phẩm của bạn tìm không có");
        }
    }
}
