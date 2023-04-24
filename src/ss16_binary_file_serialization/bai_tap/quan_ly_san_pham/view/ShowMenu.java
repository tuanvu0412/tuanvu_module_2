package ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.view;

import ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.controller.ProductController;

public class ShowMenu {
    public static void main(String[] args) {
        ProductController productController=new ProductController();
        productController.disPlayMenu();
    }
}
