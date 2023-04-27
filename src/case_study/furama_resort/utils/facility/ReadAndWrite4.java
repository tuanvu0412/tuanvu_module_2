package case_study.furama_resort.utils.facility;

import case_study.furama_resort.model.faciliti.Facility;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite4 {
    public static List<Facility> Read(String PATH) {
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<Facility> list = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp = null;
            String[] newArr;
            Facility facility;
            while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                newArr = temp.split(",");
                facility = new Facility(newArr[0], newArr[1], newArr[2], newArr[3],newArr[4],newArr[5]);
                list.add(facility);
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

    public static void Write1(List<Facility> facilities, String filePath) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Facility c : facilities) {
                bufferedWriter.write(c.facilityList());
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
