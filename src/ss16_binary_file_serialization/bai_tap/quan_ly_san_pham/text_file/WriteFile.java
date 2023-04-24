package ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.text_file;

import ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.model.Product;

import java.io.*;
import java.util.List;

public class WriteFile {
    public static final String PATH_FILE1 = "src/ss16_binary_file_serialization/bai_tap/quan_ly_san_pham/common/product.csv";

    public static void Write(List<Product> list) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(PATH_FILE1,true);
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
