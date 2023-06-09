package case_study.furama_resort.utils.booking;

import case_study.furama_resort.model.Booking;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ReadAndWriteToBooking {
    public static TreeSet<Booking> read(String PATH) {
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        TreeSet<Booking> list = new TreeSet<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp = null;
            String[] newArr;
            Booking booking;
            while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                newArr = temp.split(",");
                booking = new Booking(newArr[0], newArr[1], newArr[2], newArr[3], newArr[4], newArr[5]);
                list.add(booking);
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

    public static void write1(TreeSet<Booking> bookingList, String filePath) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Booking c : bookingList) {
                bufferedWriter.write(c.writeToFile());
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
