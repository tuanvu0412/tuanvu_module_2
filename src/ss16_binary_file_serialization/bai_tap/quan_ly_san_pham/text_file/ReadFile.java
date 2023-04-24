package ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.text_file;

import ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    static final String PATH_FILE = "src/ss16_binary_file_serialization/bai_tap/quan_ly_san_pham/common/product.csv";

    public static List<Product> Read() {
        FileInputStream fileInputStream = null;
        List<Product> list = null;
        try {
            fileInputStream = new FileInputStream(PATH_FILE);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<Product>) objectInputStream.readObject();

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        } catch (
                ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
