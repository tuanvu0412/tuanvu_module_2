package ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.controller;

import ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.service.ProductService;
import ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.text_file.ReadFile;

import java.util.Scanner;

public class ProductController {
    ProductService productService=new ProductService();
    Scanner sc= new Scanner(System.in);
    public void disPlayMenu(){

        ReadFile.Read();
        boolean flag= true;
        do{
            System.out.println("-----Quản lý sản phẩm----\n" +
                    "1. thêm sản phẩm\n" +
                    "2. tìm kiếm sản phẩm\n" +
                    "3. hiển thị sản phẩm" +
                    "4. thoát khỏi menu");
            System.out.println("mời bạn chọn menu");
            String choice=sc.nextLine();
            switch (choice){
                case "1":
                    productService.addProduct();
                    break;
                case "2":
                    productService.findProduct();
                    break;
                case "3":
                    productService.disPlayProduct();
                    break;
                case "4":
                    flag=false;
                    System.out.println("đã thoát khỏi menu");
                    break;
                default:
                    System.out.println("bạn nhập chưa đúng");
            }
        }while (flag);
    }
}
