package ss16_binary_file_serialization.bai_tap.copy_file_nhi_phan;

import ss11_map_tree.bai_tap.quan_ly_san_pham.model.Product;
import ss9_arraylist.bai_tap.bai_2.model.Person;

import javax.swing.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CopyFile implements Serializable {
    public static void main(String[] args) {
        String PATH_SOURCE_FILE = "src/ss16_binary_file_serialization/bai_tap/copy_file_nhi_phan/source_file";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(PATH_SOURCE_FILE);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject("Tuan Vu");
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileInputStream fileInputStream = null;
        String name;
        List<String>list= new ArrayList<>();
        try {
            File file = new File(PATH_SOURCE_FILE);
            if (file.length() == 0) {
                System.out.println("file rong");
            } else {
                fileInputStream = new FileInputStream(PATH_SOURCE_FILE);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                name = (String) objectInputStream.readObject();
                list.add(name);
                System.out.println(name);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        String PATH_TARGET_FILE = "src/ss16_binary_file_serialization/bai_tap/copy_file_nhi_phan/target_file";
        FileOutputStream fileOutputStream1 = null;
        try {
            fileOutputStream1 = new FileOutputStream(PATH_TARGET_FILE);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream1);
            for (String s: list) {
                objectOutputStream.writeObject(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file= new File(PATH_TARGET_FILE);
        System.out.println(file.length());
    }
}
