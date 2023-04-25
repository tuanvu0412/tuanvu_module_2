package ss11_map_tree.bai_tap.quan_ly_san_pham.text_file;

import ss11_map_tree.bai_tap.quan_ly_san_pham.model.Computer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<Computer> Read() {
        String PATH = "src/ss11_map_tree/bai_tap/quan_ly_san_pham/common/computer.csv";
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<Computer> list = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp;
            String[] newArr;
            Computer computer;
            while ((temp = bufferedReader.readLine()) != null) {
                newArr = temp.split(",");
                computer = new Computer(newArr[0], newArr[1], newArr[2], newArr[3]);
                list.add(computer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static void Write1(String filePath, Computer computer) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(computer.writeToFile());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
