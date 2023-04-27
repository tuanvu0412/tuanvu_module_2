package case_study.furama_resort.utils.contract;

import case_study.furama_resort.model.Booking;
import case_study.furama_resort.model.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite1 {
    public static List<Contact> Read(String PATH) {
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<Contact> list = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp = null;
            String[] newArr;
            Contact contact;
            while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                newArr = temp.split(",");
                contact = new Contact(newArr[0], newArr[1], newArr[2], newArr[3]);
                list.add(contact);
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

    public static void Write1(List<Contact> contactList, String filePath) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Contact c : contactList) {
                bufferedWriter.write(c.contracList());
                bufferedWriter.newLine();
            }
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
