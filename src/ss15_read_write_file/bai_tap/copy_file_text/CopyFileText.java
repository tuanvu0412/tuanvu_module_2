package ss15_read_write_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static void main(String[] args) {
        String PATH1 = "src/ss15_read_write_file/bai_tap/copy_file_text/Source_File";
        File file1 = new File(PATH1);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> list = new ArrayList<>();
        try {
            fileWriter = new FileWriter(file1);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("WelCome ");
            bufferedWriter.write("to ");
            bufferedWriter.write("League of Legends");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileReader = new FileReader(file1);
            bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                System.out.println(temp);
                list.add(temp);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String PATH = "src/ss15_read_write_file/bai_tap/copy_file_text/Target_file";
        File file = new File(PATH);
        FileWriter fileWriter1 = null;
        BufferedWriter bufferedWriter1 = null;
        int count = 0;
        try {
            fileWriter1 = new FileWriter(file);
            bufferedWriter1 = new BufferedWriter(fileWriter1);
            for (String s : list) {
                bufferedWriter1.write(s);
                count += s.length();
            }
            bufferedWriter1.newLine();
            bufferedWriter1.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter1.close();
                bufferedWriter1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("tổng số kí tự trong chuỗi là : " + count);
    }
}
